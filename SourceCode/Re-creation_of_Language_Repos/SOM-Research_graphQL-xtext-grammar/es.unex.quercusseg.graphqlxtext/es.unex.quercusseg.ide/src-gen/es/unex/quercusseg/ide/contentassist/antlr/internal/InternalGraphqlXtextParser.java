package es.unex.quercusseg.ide.contentassist.antlr.internal;

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
import es.unex.quercusseg.services.GraphqlXtextGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGraphqlXtextParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NAME", "RULE_DIGIT", "RULE_STRING", "RULE_BOOLEANVALUE", "RULE_NULLVALUE", "RULE_COMMA", "RULE_COMMENT", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'query'", "'mutation'", "'('", "')'", "'{'", "'}'", "':'", "'...'", "'fragment'", "'on'", "'['", "']'", "'$'", "'='", "'@'", "'!'"
    };
    public static final int RULE_NAME=4;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=14;
    public static final int T__19=19;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int RULE_NULLVALUE=8;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=12;
    public static final int RULE_COMMA=9;
    public static final int RULE_WS=15;
    public static final int RULE_DIGIT=5;
    public static final int RULE_COMMENT=10;
    public static final int RULE_ANY_OTHER=16;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=11;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=13;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_BOOLEANVALUE=7;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalGraphqlXtextParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGraphqlXtextParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGraphqlXtextParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGraphqlXtext.g"; }


    	private GraphqlXtextGrammarAccess grammarAccess;

    	public void setGrammarAccess(GraphqlXtextGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleDocument"
    // InternalGraphqlXtext.g:53:1: entryRuleDocument : ruleDocument EOF ;
    public final void entryRuleDocument() throws RecognitionException {
        try {
            // InternalGraphqlXtext.g:54:1: ( ruleDocument EOF )
            // InternalGraphqlXtext.g:55:1: ruleDocument EOF
            {
             before(grammarAccess.getDocumentRule()); 
            pushFollow(FOLLOW_1);
            ruleDocument();

            state._fsp--;

             after(grammarAccess.getDocumentRule()); 
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
    // $ANTLR end "entryRuleDocument"


    // $ANTLR start "ruleDocument"
    // InternalGraphqlXtext.g:62:1: ruleDocument : ( ( rule__Document__DefsAssignment )* ) ;
    public final void ruleDocument() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:66:2: ( ( ( rule__Document__DefsAssignment )* ) )
            // InternalGraphqlXtext.g:67:2: ( ( rule__Document__DefsAssignment )* )
            {
            // InternalGraphqlXtext.g:67:2: ( ( rule__Document__DefsAssignment )* )
            // InternalGraphqlXtext.g:68:3: ( rule__Document__DefsAssignment )*
            {
             before(grammarAccess.getDocumentAccess().getDefsAssignment()); 
            // InternalGraphqlXtext.g:69:3: ( rule__Document__DefsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=17 && LA1_0<=18)||LA1_0==21||LA1_0==25) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGraphqlXtext.g:69:4: rule__Document__DefsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Document__DefsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getDocumentAccess().getDefsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDocument"


    // $ANTLR start "entryRuleDefinition"
    // InternalGraphqlXtext.g:78:1: entryRuleDefinition : ruleDefinition EOF ;
    public final void entryRuleDefinition() throws RecognitionException {
        try {
            // InternalGraphqlXtext.g:79:1: ( ruleDefinition EOF )
            // InternalGraphqlXtext.g:80:1: ruleDefinition EOF
            {
             before(grammarAccess.getDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleDefinition();

            state._fsp--;

             after(grammarAccess.getDefinitionRule()); 
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
    // $ANTLR end "entryRuleDefinition"


    // $ANTLR start "ruleDefinition"
    // InternalGraphqlXtext.g:87:1: ruleDefinition : ( ( rule__Definition__Alternatives ) ) ;
    public final void ruleDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:91:2: ( ( ( rule__Definition__Alternatives ) ) )
            // InternalGraphqlXtext.g:92:2: ( ( rule__Definition__Alternatives ) )
            {
            // InternalGraphqlXtext.g:92:2: ( ( rule__Definition__Alternatives ) )
            // InternalGraphqlXtext.g:93:3: ( rule__Definition__Alternatives )
            {
             before(grammarAccess.getDefinitionAccess().getAlternatives()); 
            // InternalGraphqlXtext.g:94:3: ( rule__Definition__Alternatives )
            // InternalGraphqlXtext.g:94:4: rule__Definition__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Definition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDefinition"


    // $ANTLR start "entryRuleOperationDefinition"
    // InternalGraphqlXtext.g:103:1: entryRuleOperationDefinition : ruleOperationDefinition EOF ;
    public final void entryRuleOperationDefinition() throws RecognitionException {
        try {
            // InternalGraphqlXtext.g:104:1: ( ruleOperationDefinition EOF )
            // InternalGraphqlXtext.g:105:1: ruleOperationDefinition EOF
            {
             before(grammarAccess.getOperationDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleOperationDefinition();

            state._fsp--;

             after(grammarAccess.getOperationDefinitionRule()); 
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
    // $ANTLR end "entryRuleOperationDefinition"


    // $ANTLR start "ruleOperationDefinition"
    // InternalGraphqlXtext.g:112:1: ruleOperationDefinition : ( ( rule__OperationDefinition__Alternatives ) ) ;
    public final void ruleOperationDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:116:2: ( ( ( rule__OperationDefinition__Alternatives ) ) )
            // InternalGraphqlXtext.g:117:2: ( ( rule__OperationDefinition__Alternatives ) )
            {
            // InternalGraphqlXtext.g:117:2: ( ( rule__OperationDefinition__Alternatives ) )
            // InternalGraphqlXtext.g:118:3: ( rule__OperationDefinition__Alternatives )
            {
             before(grammarAccess.getOperationDefinitionAccess().getAlternatives()); 
            // InternalGraphqlXtext.g:119:3: ( rule__OperationDefinition__Alternatives )
            // InternalGraphqlXtext.g:119:4: rule__OperationDefinition__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OperationDefinition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperationDefinitionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperationDefinition"


    // $ANTLR start "entryRuleOperationType"
    // InternalGraphqlXtext.g:128:1: entryRuleOperationType : ruleOperationType EOF ;
    public final void entryRuleOperationType() throws RecognitionException {
        try {
            // InternalGraphqlXtext.g:129:1: ( ruleOperationType EOF )
            // InternalGraphqlXtext.g:130:1: ruleOperationType EOF
            {
             before(grammarAccess.getOperationTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleOperationType();

            state._fsp--;

             after(grammarAccess.getOperationTypeRule()); 
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
    // $ANTLR end "entryRuleOperationType"


    // $ANTLR start "ruleOperationType"
    // InternalGraphqlXtext.g:137:1: ruleOperationType : ( ( rule__OperationType__Alternatives ) ) ;
    public final void ruleOperationType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:141:2: ( ( ( rule__OperationType__Alternatives ) ) )
            // InternalGraphqlXtext.g:142:2: ( ( rule__OperationType__Alternatives ) )
            {
            // InternalGraphqlXtext.g:142:2: ( ( rule__OperationType__Alternatives ) )
            // InternalGraphqlXtext.g:143:3: ( rule__OperationType__Alternatives )
            {
             before(grammarAccess.getOperationTypeAccess().getAlternatives()); 
            // InternalGraphqlXtext.g:144:3: ( rule__OperationType__Alternatives )
            // InternalGraphqlXtext.g:144:4: rule__OperationType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OperationType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperationTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperationType"


    // $ANTLR start "entryRuleSelectionSet"
    // InternalGraphqlXtext.g:153:1: entryRuleSelectionSet : ruleSelectionSet EOF ;
    public final void entryRuleSelectionSet() throws RecognitionException {
        try {
            // InternalGraphqlXtext.g:154:1: ( ruleSelectionSet EOF )
            // InternalGraphqlXtext.g:155:1: ruleSelectionSet EOF
            {
             before(grammarAccess.getSelectionSetRule()); 
            pushFollow(FOLLOW_1);
            ruleSelectionSet();

            state._fsp--;

             after(grammarAccess.getSelectionSetRule()); 
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
    // $ANTLR end "entryRuleSelectionSet"


    // $ANTLR start "ruleSelectionSet"
    // InternalGraphqlXtext.g:162:1: ruleSelectionSet : ( ( rule__SelectionSet__Group__0 ) ) ;
    public final void ruleSelectionSet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:166:2: ( ( ( rule__SelectionSet__Group__0 ) ) )
            // InternalGraphqlXtext.g:167:2: ( ( rule__SelectionSet__Group__0 ) )
            {
            // InternalGraphqlXtext.g:167:2: ( ( rule__SelectionSet__Group__0 ) )
            // InternalGraphqlXtext.g:168:3: ( rule__SelectionSet__Group__0 )
            {
             before(grammarAccess.getSelectionSetAccess().getGroup()); 
            // InternalGraphqlXtext.g:169:3: ( rule__SelectionSet__Group__0 )
            // InternalGraphqlXtext.g:169:4: rule__SelectionSet__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SelectionSet__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSelectionSetAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSelectionSet"


    // $ANTLR start "entryRuleSelection"
    // InternalGraphqlXtext.g:178:1: entryRuleSelection : ruleSelection EOF ;
    public final void entryRuleSelection() throws RecognitionException {
        try {
            // InternalGraphqlXtext.g:179:1: ( ruleSelection EOF )
            // InternalGraphqlXtext.g:180:1: ruleSelection EOF
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
    // InternalGraphqlXtext.g:187:1: ruleSelection : ( ( rule__Selection__Alternatives ) ) ;
    public final void ruleSelection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:191:2: ( ( ( rule__Selection__Alternatives ) ) )
            // InternalGraphqlXtext.g:192:2: ( ( rule__Selection__Alternatives ) )
            {
            // InternalGraphqlXtext.g:192:2: ( ( rule__Selection__Alternatives ) )
            // InternalGraphqlXtext.g:193:3: ( rule__Selection__Alternatives )
            {
             before(grammarAccess.getSelectionAccess().getAlternatives()); 
            // InternalGraphqlXtext.g:194:3: ( rule__Selection__Alternatives )
            // InternalGraphqlXtext.g:194:4: rule__Selection__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Selection__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSelectionAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleField"
    // InternalGraphqlXtext.g:203:1: entryRuleField : ruleField EOF ;
    public final void entryRuleField() throws RecognitionException {
        try {
            // InternalGraphqlXtext.g:204:1: ( ruleField EOF )
            // InternalGraphqlXtext.g:205:1: ruleField EOF
            {
             before(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_1);
            ruleField();

            state._fsp--;

             after(grammarAccess.getFieldRule()); 
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
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // InternalGraphqlXtext.g:212:1: ruleField : ( ( rule__Field__Group__0 ) ) ;
    public final void ruleField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:216:2: ( ( ( rule__Field__Group__0 ) ) )
            // InternalGraphqlXtext.g:217:2: ( ( rule__Field__Group__0 ) )
            {
            // InternalGraphqlXtext.g:217:2: ( ( rule__Field__Group__0 ) )
            // InternalGraphqlXtext.g:218:3: ( rule__Field__Group__0 )
            {
             before(grammarAccess.getFieldAccess().getGroup()); 
            // InternalGraphqlXtext.g:219:3: ( rule__Field__Group__0 )
            // InternalGraphqlXtext.g:219:4: rule__Field__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Field__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleAlias"
    // InternalGraphqlXtext.g:228:1: entryRuleAlias : ruleAlias EOF ;
    public final void entryRuleAlias() throws RecognitionException {
        try {
            // InternalGraphqlXtext.g:229:1: ( ruleAlias EOF )
            // InternalGraphqlXtext.g:230:1: ruleAlias EOF
            {
             before(grammarAccess.getAliasRule()); 
            pushFollow(FOLLOW_1);
            ruleAlias();

            state._fsp--;

             after(grammarAccess.getAliasRule()); 
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
    // $ANTLR end "entryRuleAlias"


    // $ANTLR start "ruleAlias"
    // InternalGraphqlXtext.g:237:1: ruleAlias : ( ( rule__Alias__Group__0 ) ) ;
    public final void ruleAlias() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:241:2: ( ( ( rule__Alias__Group__0 ) ) )
            // InternalGraphqlXtext.g:242:2: ( ( rule__Alias__Group__0 ) )
            {
            // InternalGraphqlXtext.g:242:2: ( ( rule__Alias__Group__0 ) )
            // InternalGraphqlXtext.g:243:3: ( rule__Alias__Group__0 )
            {
             before(grammarAccess.getAliasAccess().getGroup()); 
            // InternalGraphqlXtext.g:244:3: ( rule__Alias__Group__0 )
            // InternalGraphqlXtext.g:244:4: rule__Alias__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Alias__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAliasAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAlias"


    // $ANTLR start "entryRuleArguments"
    // InternalGraphqlXtext.g:253:1: entryRuleArguments : ruleArguments EOF ;
    public final void entryRuleArguments() throws RecognitionException {
        try {
            // InternalGraphqlXtext.g:254:1: ( ruleArguments EOF )
            // InternalGraphqlXtext.g:255:1: ruleArguments EOF
            {
             before(grammarAccess.getArgumentsRule()); 
            pushFollow(FOLLOW_1);
            ruleArguments();

            state._fsp--;

             after(grammarAccess.getArgumentsRule()); 
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
    // $ANTLR end "entryRuleArguments"


    // $ANTLR start "ruleArguments"
    // InternalGraphqlXtext.g:262:1: ruleArguments : ( ( rule__Arguments__Group__0 ) ) ;
    public final void ruleArguments() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:266:2: ( ( ( rule__Arguments__Group__0 ) ) )
            // InternalGraphqlXtext.g:267:2: ( ( rule__Arguments__Group__0 ) )
            {
            // InternalGraphqlXtext.g:267:2: ( ( rule__Arguments__Group__0 ) )
            // InternalGraphqlXtext.g:268:3: ( rule__Arguments__Group__0 )
            {
             before(grammarAccess.getArgumentsAccess().getGroup()); 
            // InternalGraphqlXtext.g:269:3: ( rule__Arguments__Group__0 )
            // InternalGraphqlXtext.g:269:4: rule__Arguments__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Arguments__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArgumentsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArguments"


    // $ANTLR start "entryRuleArgument"
    // InternalGraphqlXtext.g:278:1: entryRuleArgument : ruleArgument EOF ;
    public final void entryRuleArgument() throws RecognitionException {
        try {
            // InternalGraphqlXtext.g:279:1: ( ruleArgument EOF )
            // InternalGraphqlXtext.g:280:1: ruleArgument EOF
            {
             before(grammarAccess.getArgumentRule()); 
            pushFollow(FOLLOW_1);
            ruleArgument();

            state._fsp--;

             after(grammarAccess.getArgumentRule()); 
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
    // $ANTLR end "entryRuleArgument"


    // $ANTLR start "ruleArgument"
    // InternalGraphqlXtext.g:287:1: ruleArgument : ( ( rule__Argument__Group__0 ) ) ;
    public final void ruleArgument() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:291:2: ( ( ( rule__Argument__Group__0 ) ) )
            // InternalGraphqlXtext.g:292:2: ( ( rule__Argument__Group__0 ) )
            {
            // InternalGraphqlXtext.g:292:2: ( ( rule__Argument__Group__0 ) )
            // InternalGraphqlXtext.g:293:3: ( rule__Argument__Group__0 )
            {
             before(grammarAccess.getArgumentAccess().getGroup()); 
            // InternalGraphqlXtext.g:294:3: ( rule__Argument__Group__0 )
            // InternalGraphqlXtext.g:294:4: rule__Argument__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Argument__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArgumentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArgument"


    // $ANTLR start "entryRuleFragmentSpread"
    // InternalGraphqlXtext.g:303:1: entryRuleFragmentSpread : ruleFragmentSpread EOF ;
    public final void entryRuleFragmentSpread() throws RecognitionException {
        try {
            // InternalGraphqlXtext.g:304:1: ( ruleFragmentSpread EOF )
            // InternalGraphqlXtext.g:305:1: ruleFragmentSpread EOF
            {
             before(grammarAccess.getFragmentSpreadRule()); 
            pushFollow(FOLLOW_1);
            ruleFragmentSpread();

            state._fsp--;

             after(grammarAccess.getFragmentSpreadRule()); 
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
    // $ANTLR end "entryRuleFragmentSpread"


    // $ANTLR start "ruleFragmentSpread"
    // InternalGraphqlXtext.g:312:1: ruleFragmentSpread : ( ( rule__FragmentSpread__Group__0 ) ) ;
    public final void ruleFragmentSpread() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:316:2: ( ( ( rule__FragmentSpread__Group__0 ) ) )
            // InternalGraphqlXtext.g:317:2: ( ( rule__FragmentSpread__Group__0 ) )
            {
            // InternalGraphqlXtext.g:317:2: ( ( rule__FragmentSpread__Group__0 ) )
            // InternalGraphqlXtext.g:318:3: ( rule__FragmentSpread__Group__0 )
            {
             before(grammarAccess.getFragmentSpreadAccess().getGroup()); 
            // InternalGraphqlXtext.g:319:3: ( rule__FragmentSpread__Group__0 )
            // InternalGraphqlXtext.g:319:4: rule__FragmentSpread__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FragmentSpread__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFragmentSpreadAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFragmentSpread"


    // $ANTLR start "entryRuleInlineFragment"
    // InternalGraphqlXtext.g:328:1: entryRuleInlineFragment : ruleInlineFragment EOF ;
    public final void entryRuleInlineFragment() throws RecognitionException {
        try {
            // InternalGraphqlXtext.g:329:1: ( ruleInlineFragment EOF )
            // InternalGraphqlXtext.g:330:1: ruleInlineFragment EOF
            {
             before(grammarAccess.getInlineFragmentRule()); 
            pushFollow(FOLLOW_1);
            ruleInlineFragment();

            state._fsp--;

             after(grammarAccess.getInlineFragmentRule()); 
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
    // $ANTLR end "entryRuleInlineFragment"


    // $ANTLR start "ruleInlineFragment"
    // InternalGraphqlXtext.g:337:1: ruleInlineFragment : ( ( rule__InlineFragment__Group__0 ) ) ;
    public final void ruleInlineFragment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:341:2: ( ( ( rule__InlineFragment__Group__0 ) ) )
            // InternalGraphqlXtext.g:342:2: ( ( rule__InlineFragment__Group__0 ) )
            {
            // InternalGraphqlXtext.g:342:2: ( ( rule__InlineFragment__Group__0 ) )
            // InternalGraphqlXtext.g:343:3: ( rule__InlineFragment__Group__0 )
            {
             before(grammarAccess.getInlineFragmentAccess().getGroup()); 
            // InternalGraphqlXtext.g:344:3: ( rule__InlineFragment__Group__0 )
            // InternalGraphqlXtext.g:344:4: rule__InlineFragment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InlineFragment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInlineFragmentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInlineFragment"


    // $ANTLR start "entryRuleFragmentDefinition"
    // InternalGraphqlXtext.g:353:1: entryRuleFragmentDefinition : ruleFragmentDefinition EOF ;
    public final void entryRuleFragmentDefinition() throws RecognitionException {
        try {
            // InternalGraphqlXtext.g:354:1: ( ruleFragmentDefinition EOF )
            // InternalGraphqlXtext.g:355:1: ruleFragmentDefinition EOF
            {
             before(grammarAccess.getFragmentDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleFragmentDefinition();

            state._fsp--;

             after(grammarAccess.getFragmentDefinitionRule()); 
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
    // $ANTLR end "entryRuleFragmentDefinition"


    // $ANTLR start "ruleFragmentDefinition"
    // InternalGraphqlXtext.g:362:1: ruleFragmentDefinition : ( ( rule__FragmentDefinition__Group__0 ) ) ;
    public final void ruleFragmentDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:366:2: ( ( ( rule__FragmentDefinition__Group__0 ) ) )
            // InternalGraphqlXtext.g:367:2: ( ( rule__FragmentDefinition__Group__0 ) )
            {
            // InternalGraphqlXtext.g:367:2: ( ( rule__FragmentDefinition__Group__0 ) )
            // InternalGraphqlXtext.g:368:3: ( rule__FragmentDefinition__Group__0 )
            {
             before(grammarAccess.getFragmentDefinitionAccess().getGroup()); 
            // InternalGraphqlXtext.g:369:3: ( rule__FragmentDefinition__Group__0 )
            // InternalGraphqlXtext.g:369:4: rule__FragmentDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FragmentDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFragmentDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFragmentDefinition"


    // $ANTLR start "entryRuleFragmentName"
    // InternalGraphqlXtext.g:378:1: entryRuleFragmentName : ruleFragmentName EOF ;
    public final void entryRuleFragmentName() throws RecognitionException {
        try {
            // InternalGraphqlXtext.g:379:1: ( ruleFragmentName EOF )
            // InternalGraphqlXtext.g:380:1: ruleFragmentName EOF
            {
             before(grammarAccess.getFragmentNameRule()); 
            pushFollow(FOLLOW_1);
            ruleFragmentName();

            state._fsp--;

             after(grammarAccess.getFragmentNameRule()); 
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
    // $ANTLR end "entryRuleFragmentName"


    // $ANTLR start "ruleFragmentName"
    // InternalGraphqlXtext.g:387:1: ruleFragmentName : ( RULE_NAME ) ;
    public final void ruleFragmentName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:391:2: ( ( RULE_NAME ) )
            // InternalGraphqlXtext.g:392:2: ( RULE_NAME )
            {
            // InternalGraphqlXtext.g:392:2: ( RULE_NAME )
            // InternalGraphqlXtext.g:393:3: RULE_NAME
            {
             before(grammarAccess.getFragmentNameAccess().getNAMETerminalRuleCall()); 
            match(input,RULE_NAME,FOLLOW_2); 
             after(grammarAccess.getFragmentNameAccess().getNAMETerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFragmentName"


    // $ANTLR start "entryRuleTypeCondition"
    // InternalGraphqlXtext.g:403:1: entryRuleTypeCondition : ruleTypeCondition EOF ;
    public final void entryRuleTypeCondition() throws RecognitionException {
        try {
            // InternalGraphqlXtext.g:404:1: ( ruleTypeCondition EOF )
            // InternalGraphqlXtext.g:405:1: ruleTypeCondition EOF
            {
             before(grammarAccess.getTypeConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleTypeCondition();

            state._fsp--;

             after(grammarAccess.getTypeConditionRule()); 
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
    // $ANTLR end "entryRuleTypeCondition"


    // $ANTLR start "ruleTypeCondition"
    // InternalGraphqlXtext.g:412:1: ruleTypeCondition : ( ( rule__TypeCondition__Group__0 ) ) ;
    public final void ruleTypeCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:416:2: ( ( ( rule__TypeCondition__Group__0 ) ) )
            // InternalGraphqlXtext.g:417:2: ( ( rule__TypeCondition__Group__0 ) )
            {
            // InternalGraphqlXtext.g:417:2: ( ( rule__TypeCondition__Group__0 ) )
            // InternalGraphqlXtext.g:418:3: ( rule__TypeCondition__Group__0 )
            {
             before(grammarAccess.getTypeConditionAccess().getGroup()); 
            // InternalGraphqlXtext.g:419:3: ( rule__TypeCondition__Group__0 )
            // InternalGraphqlXtext.g:419:4: rule__TypeCondition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TypeCondition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeConditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeCondition"


    // $ANTLR start "entryRuleValue"
    // InternalGraphqlXtext.g:428:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalGraphqlXtext.g:429:1: ( ruleValue EOF )
            // InternalGraphqlXtext.g:430:1: ruleValue EOF
            {
             before(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getValueRule()); 
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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalGraphqlXtext.g:437:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:441:2: ( ( ( rule__Value__Alternatives ) ) )
            // InternalGraphqlXtext.g:442:2: ( ( rule__Value__Alternatives ) )
            {
            // InternalGraphqlXtext.g:442:2: ( ( rule__Value__Alternatives ) )
            // InternalGraphqlXtext.g:443:3: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // InternalGraphqlXtext.g:444:3: ( rule__Value__Alternatives )
            // InternalGraphqlXtext.g:444:4: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Value__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleSingleValue"
    // InternalGraphqlXtext.g:453:1: entryRuleSingleValue : ruleSingleValue EOF ;
    public final void entryRuleSingleValue() throws RecognitionException {
        try {
            // InternalGraphqlXtext.g:454:1: ( ruleSingleValue EOF )
            // InternalGraphqlXtext.g:455:1: ruleSingleValue EOF
            {
             before(grammarAccess.getSingleValueRule()); 
            pushFollow(FOLLOW_1);
            ruleSingleValue();

            state._fsp--;

             after(grammarAccess.getSingleValueRule()); 
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
    // $ANTLR end "entryRuleSingleValue"


    // $ANTLR start "ruleSingleValue"
    // InternalGraphqlXtext.g:462:1: ruleSingleValue : ( ( rule__SingleValue__Alternatives ) ) ;
    public final void ruleSingleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:466:2: ( ( ( rule__SingleValue__Alternatives ) ) )
            // InternalGraphqlXtext.g:467:2: ( ( rule__SingleValue__Alternatives ) )
            {
            // InternalGraphqlXtext.g:467:2: ( ( rule__SingleValue__Alternatives ) )
            // InternalGraphqlXtext.g:468:3: ( rule__SingleValue__Alternatives )
            {
             before(grammarAccess.getSingleValueAccess().getAlternatives()); 
            // InternalGraphqlXtext.g:469:3: ( rule__SingleValue__Alternatives )
            // InternalGraphqlXtext.g:469:4: rule__SingleValue__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SingleValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSingleValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSingleValue"


    // $ANTLR start "entryRuleComplexValue"
    // InternalGraphqlXtext.g:478:1: entryRuleComplexValue : ruleComplexValue EOF ;
    public final void entryRuleComplexValue() throws RecognitionException {
        try {
            // InternalGraphqlXtext.g:479:1: ( ruleComplexValue EOF )
            // InternalGraphqlXtext.g:480:1: ruleComplexValue EOF
            {
             before(grammarAccess.getComplexValueRule()); 
            pushFollow(FOLLOW_1);
            ruleComplexValue();

            state._fsp--;

             after(grammarAccess.getComplexValueRule()); 
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
    // $ANTLR end "entryRuleComplexValue"


    // $ANTLR start "ruleComplexValue"
    // InternalGraphqlXtext.g:487:1: ruleComplexValue : ( ( rule__ComplexValue__Alternatives ) ) ;
    public final void ruleComplexValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:491:2: ( ( ( rule__ComplexValue__Alternatives ) ) )
            // InternalGraphqlXtext.g:492:2: ( ( rule__ComplexValue__Alternatives ) )
            {
            // InternalGraphqlXtext.g:492:2: ( ( rule__ComplexValue__Alternatives ) )
            // InternalGraphqlXtext.g:493:3: ( rule__ComplexValue__Alternatives )
            {
             before(grammarAccess.getComplexValueAccess().getAlternatives()); 
            // InternalGraphqlXtext.g:494:3: ( rule__ComplexValue__Alternatives )
            // InternalGraphqlXtext.g:494:4: rule__ComplexValue__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ComplexValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getComplexValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComplexValue"


    // $ANTLR start "entryRuleEnumValue"
    // InternalGraphqlXtext.g:503:1: entryRuleEnumValue : ruleEnumValue EOF ;
    public final void entryRuleEnumValue() throws RecognitionException {
        try {
            // InternalGraphqlXtext.g:504:1: ( ruleEnumValue EOF )
            // InternalGraphqlXtext.g:505:1: ruleEnumValue EOF
            {
             before(grammarAccess.getEnumValueRule()); 
            pushFollow(FOLLOW_1);
            ruleEnumValue();

            state._fsp--;

             after(grammarAccess.getEnumValueRule()); 
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
    // $ANTLR end "entryRuleEnumValue"


    // $ANTLR start "ruleEnumValue"
    // InternalGraphqlXtext.g:512:1: ruleEnumValue : ( RULE_NAME ) ;
    public final void ruleEnumValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:516:2: ( ( RULE_NAME ) )
            // InternalGraphqlXtext.g:517:2: ( RULE_NAME )
            {
            // InternalGraphqlXtext.g:517:2: ( RULE_NAME )
            // InternalGraphqlXtext.g:518:3: RULE_NAME
            {
             before(grammarAccess.getEnumValueAccess().getNAMETerminalRuleCall()); 
            match(input,RULE_NAME,FOLLOW_2); 
             after(grammarAccess.getEnumValueAccess().getNAMETerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumValue"


    // $ANTLR start "entryRuleListValue"
    // InternalGraphqlXtext.g:528:1: entryRuleListValue : ruleListValue EOF ;
    public final void entryRuleListValue() throws RecognitionException {
        try {
            // InternalGraphqlXtext.g:529:1: ( ruleListValue EOF )
            // InternalGraphqlXtext.g:530:1: ruleListValue EOF
            {
             before(grammarAccess.getListValueRule()); 
            pushFollow(FOLLOW_1);
            ruleListValue();

            state._fsp--;

             after(grammarAccess.getListValueRule()); 
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
    // $ANTLR end "entryRuleListValue"


    // $ANTLR start "ruleListValue"
    // InternalGraphqlXtext.g:537:1: ruleListValue : ( ( rule__ListValue__Group__0 ) ) ;
    public final void ruleListValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:541:2: ( ( ( rule__ListValue__Group__0 ) ) )
            // InternalGraphqlXtext.g:542:2: ( ( rule__ListValue__Group__0 ) )
            {
            // InternalGraphqlXtext.g:542:2: ( ( rule__ListValue__Group__0 ) )
            // InternalGraphqlXtext.g:543:3: ( rule__ListValue__Group__0 )
            {
             before(grammarAccess.getListValueAccess().getGroup()); 
            // InternalGraphqlXtext.g:544:3: ( rule__ListValue__Group__0 )
            // InternalGraphqlXtext.g:544:4: rule__ListValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ListValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getListValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleListValue"


    // $ANTLR start "entryRuleObjectValue"
    // InternalGraphqlXtext.g:553:1: entryRuleObjectValue : ruleObjectValue EOF ;
    public final void entryRuleObjectValue() throws RecognitionException {
        try {
            // InternalGraphqlXtext.g:554:1: ( ruleObjectValue EOF )
            // InternalGraphqlXtext.g:555:1: ruleObjectValue EOF
            {
             before(grammarAccess.getObjectValueRule()); 
            pushFollow(FOLLOW_1);
            ruleObjectValue();

            state._fsp--;

             after(grammarAccess.getObjectValueRule()); 
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
    // $ANTLR end "entryRuleObjectValue"


    // $ANTLR start "ruleObjectValue"
    // InternalGraphqlXtext.g:562:1: ruleObjectValue : ( ( rule__ObjectValue__Group__0 ) ) ;
    public final void ruleObjectValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:566:2: ( ( ( rule__ObjectValue__Group__0 ) ) )
            // InternalGraphqlXtext.g:567:2: ( ( rule__ObjectValue__Group__0 ) )
            {
            // InternalGraphqlXtext.g:567:2: ( ( rule__ObjectValue__Group__0 ) )
            // InternalGraphqlXtext.g:568:3: ( rule__ObjectValue__Group__0 )
            {
             before(grammarAccess.getObjectValueAccess().getGroup()); 
            // InternalGraphqlXtext.g:569:3: ( rule__ObjectValue__Group__0 )
            // InternalGraphqlXtext.g:569:4: rule__ObjectValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ObjectValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getObjectValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleObjectValue"


    // $ANTLR start "entryRuleObjectField"
    // InternalGraphqlXtext.g:578:1: entryRuleObjectField : ruleObjectField EOF ;
    public final void entryRuleObjectField() throws RecognitionException {
        try {
            // InternalGraphqlXtext.g:579:1: ( ruleObjectField EOF )
            // InternalGraphqlXtext.g:580:1: ruleObjectField EOF
            {
             before(grammarAccess.getObjectFieldRule()); 
            pushFollow(FOLLOW_1);
            ruleObjectField();

            state._fsp--;

             after(grammarAccess.getObjectFieldRule()); 
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
    // $ANTLR end "entryRuleObjectField"


    // $ANTLR start "ruleObjectField"
    // InternalGraphqlXtext.g:587:1: ruleObjectField : ( ( rule__ObjectField__Group__0 ) ) ;
    public final void ruleObjectField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:591:2: ( ( ( rule__ObjectField__Group__0 ) ) )
            // InternalGraphqlXtext.g:592:2: ( ( rule__ObjectField__Group__0 ) )
            {
            // InternalGraphqlXtext.g:592:2: ( ( rule__ObjectField__Group__0 ) )
            // InternalGraphqlXtext.g:593:3: ( rule__ObjectField__Group__0 )
            {
             before(grammarAccess.getObjectFieldAccess().getGroup()); 
            // InternalGraphqlXtext.g:594:3: ( rule__ObjectField__Group__0 )
            // InternalGraphqlXtext.g:594:4: rule__ObjectField__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ObjectField__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getObjectFieldAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleObjectField"


    // $ANTLR start "entryRuleVariableDefinition"
    // InternalGraphqlXtext.g:603:1: entryRuleVariableDefinition : ruleVariableDefinition EOF ;
    public final void entryRuleVariableDefinition() throws RecognitionException {
        try {
            // InternalGraphqlXtext.g:604:1: ( ruleVariableDefinition EOF )
            // InternalGraphqlXtext.g:605:1: ruleVariableDefinition EOF
            {
             before(grammarAccess.getVariableDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleVariableDefinition();

            state._fsp--;

             after(grammarAccess.getVariableDefinitionRule()); 
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
    // $ANTLR end "entryRuleVariableDefinition"


    // $ANTLR start "ruleVariableDefinition"
    // InternalGraphqlXtext.g:612:1: ruleVariableDefinition : ( ( rule__VariableDefinition__Group__0 ) ) ;
    public final void ruleVariableDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:616:2: ( ( ( rule__VariableDefinition__Group__0 ) ) )
            // InternalGraphqlXtext.g:617:2: ( ( rule__VariableDefinition__Group__0 ) )
            {
            // InternalGraphqlXtext.g:617:2: ( ( rule__VariableDefinition__Group__0 ) )
            // InternalGraphqlXtext.g:618:3: ( rule__VariableDefinition__Group__0 )
            {
             before(grammarAccess.getVariableDefinitionAccess().getGroup()); 
            // InternalGraphqlXtext.g:619:3: ( rule__VariableDefinition__Group__0 )
            // InternalGraphqlXtext.g:619:4: rule__VariableDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VariableDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariableDefinition"


    // $ANTLR start "entryRuleVariable"
    // InternalGraphqlXtext.g:628:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalGraphqlXtext.g:629:1: ( ruleVariable EOF )
            // InternalGraphqlXtext.g:630:1: ruleVariable EOF
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
    // InternalGraphqlXtext.g:637:1: ruleVariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:641:2: ( ( ( rule__Variable__Group__0 ) ) )
            // InternalGraphqlXtext.g:642:2: ( ( rule__Variable__Group__0 ) )
            {
            // InternalGraphqlXtext.g:642:2: ( ( rule__Variable__Group__0 ) )
            // InternalGraphqlXtext.g:643:3: ( rule__Variable__Group__0 )
            {
             before(grammarAccess.getVariableAccess().getGroup()); 
            // InternalGraphqlXtext.g:644:3: ( rule__Variable__Group__0 )
            // InternalGraphqlXtext.g:644:4: rule__Variable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleDefaultValue"
    // InternalGraphqlXtext.g:653:1: entryRuleDefaultValue : ruleDefaultValue EOF ;
    public final void entryRuleDefaultValue() throws RecognitionException {
        try {
            // InternalGraphqlXtext.g:654:1: ( ruleDefaultValue EOF )
            // InternalGraphqlXtext.g:655:1: ruleDefaultValue EOF
            {
             before(grammarAccess.getDefaultValueRule()); 
            pushFollow(FOLLOW_1);
            ruleDefaultValue();

            state._fsp--;

             after(grammarAccess.getDefaultValueRule()); 
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
    // $ANTLR end "entryRuleDefaultValue"


    // $ANTLR start "ruleDefaultValue"
    // InternalGraphqlXtext.g:662:1: ruleDefaultValue : ( ( rule__DefaultValue__Group__0 ) ) ;
    public final void ruleDefaultValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:666:2: ( ( ( rule__DefaultValue__Group__0 ) ) )
            // InternalGraphqlXtext.g:667:2: ( ( rule__DefaultValue__Group__0 ) )
            {
            // InternalGraphqlXtext.g:667:2: ( ( rule__DefaultValue__Group__0 ) )
            // InternalGraphqlXtext.g:668:3: ( rule__DefaultValue__Group__0 )
            {
             before(grammarAccess.getDefaultValueAccess().getGroup()); 
            // InternalGraphqlXtext.g:669:3: ( rule__DefaultValue__Group__0 )
            // InternalGraphqlXtext.g:669:4: rule__DefaultValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DefaultValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDefaultValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDefaultValue"


    // $ANTLR start "entryRuleType"
    // InternalGraphqlXtext.g:678:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalGraphqlXtext.g:679:1: ( ruleType EOF )
            // InternalGraphqlXtext.g:680:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalGraphqlXtext.g:687:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:691:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalGraphqlXtext.g:692:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalGraphqlXtext.g:692:2: ( ( rule__Type__Alternatives ) )
            // InternalGraphqlXtext.g:693:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalGraphqlXtext.g:694:3: ( rule__Type__Alternatives )
            // InternalGraphqlXtext.g:694:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleNamedType"
    // InternalGraphqlXtext.g:703:1: entryRuleNamedType : ruleNamedType EOF ;
    public final void entryRuleNamedType() throws RecognitionException {
        try {
            // InternalGraphqlXtext.g:704:1: ( ruleNamedType EOF )
            // InternalGraphqlXtext.g:705:1: ruleNamedType EOF
            {
             before(grammarAccess.getNamedTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleNamedType();

            state._fsp--;

             after(grammarAccess.getNamedTypeRule()); 
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
    // $ANTLR end "entryRuleNamedType"


    // $ANTLR start "ruleNamedType"
    // InternalGraphqlXtext.g:712:1: ruleNamedType : ( RULE_NAME ) ;
    public final void ruleNamedType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:716:2: ( ( RULE_NAME ) )
            // InternalGraphqlXtext.g:717:2: ( RULE_NAME )
            {
            // InternalGraphqlXtext.g:717:2: ( RULE_NAME )
            // InternalGraphqlXtext.g:718:3: RULE_NAME
            {
             before(grammarAccess.getNamedTypeAccess().getNAMETerminalRuleCall()); 
            match(input,RULE_NAME,FOLLOW_2); 
             after(grammarAccess.getNamedTypeAccess().getNAMETerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNamedType"


    // $ANTLR start "entryRuleListType"
    // InternalGraphqlXtext.g:728:1: entryRuleListType : ruleListType EOF ;
    public final void entryRuleListType() throws RecognitionException {
        try {
            // InternalGraphqlXtext.g:729:1: ( ruleListType EOF )
            // InternalGraphqlXtext.g:730:1: ruleListType EOF
            {
             before(grammarAccess.getListTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleListType();

            state._fsp--;

             after(grammarAccess.getListTypeRule()); 
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
    // $ANTLR end "entryRuleListType"


    // $ANTLR start "ruleListType"
    // InternalGraphqlXtext.g:737:1: ruleListType : ( ( rule__ListType__Group__0 ) ) ;
    public final void ruleListType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:741:2: ( ( ( rule__ListType__Group__0 ) ) )
            // InternalGraphqlXtext.g:742:2: ( ( rule__ListType__Group__0 ) )
            {
            // InternalGraphqlXtext.g:742:2: ( ( rule__ListType__Group__0 ) )
            // InternalGraphqlXtext.g:743:3: ( rule__ListType__Group__0 )
            {
             before(grammarAccess.getListTypeAccess().getGroup()); 
            // InternalGraphqlXtext.g:744:3: ( rule__ListType__Group__0 )
            // InternalGraphqlXtext.g:744:4: rule__ListType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ListType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getListTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleListType"


    // $ANTLR start "entryRuleDirective"
    // InternalGraphqlXtext.g:753:1: entryRuleDirective : ruleDirective EOF ;
    public final void entryRuleDirective() throws RecognitionException {
        try {
            // InternalGraphqlXtext.g:754:1: ( ruleDirective EOF )
            // InternalGraphqlXtext.g:755:1: ruleDirective EOF
            {
             before(grammarAccess.getDirectiveRule()); 
            pushFollow(FOLLOW_1);
            ruleDirective();

            state._fsp--;

             after(grammarAccess.getDirectiveRule()); 
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
    // $ANTLR end "entryRuleDirective"


    // $ANTLR start "ruleDirective"
    // InternalGraphqlXtext.g:762:1: ruleDirective : ( ( rule__Directive__Group__0 ) ) ;
    public final void ruleDirective() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:766:2: ( ( ( rule__Directive__Group__0 ) ) )
            // InternalGraphqlXtext.g:767:2: ( ( rule__Directive__Group__0 ) )
            {
            // InternalGraphqlXtext.g:767:2: ( ( rule__Directive__Group__0 ) )
            // InternalGraphqlXtext.g:768:3: ( rule__Directive__Group__0 )
            {
             before(grammarAccess.getDirectiveAccess().getGroup()); 
            // InternalGraphqlXtext.g:769:3: ( rule__Directive__Group__0 )
            // InternalGraphqlXtext.g:769:4: rule__Directive__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Directive__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDirectiveAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDirective"


    // $ANTLR start "entryRuleIntValue"
    // InternalGraphqlXtext.g:778:1: entryRuleIntValue : ruleIntValue EOF ;
    public final void entryRuleIntValue() throws RecognitionException {
        try {
            // InternalGraphqlXtext.g:779:1: ( ruleIntValue EOF )
            // InternalGraphqlXtext.g:780:1: ruleIntValue EOF
            {
             before(grammarAccess.getIntValueRule()); 
            pushFollow(FOLLOW_1);
            ruleIntValue();

            state._fsp--;

             after(grammarAccess.getIntValueRule()); 
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
    // $ANTLR end "entryRuleIntValue"


    // $ANTLR start "ruleIntValue"
    // InternalGraphqlXtext.g:787:1: ruleIntValue : ( RULE_DIGIT ) ;
    public final void ruleIntValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:791:2: ( ( RULE_DIGIT ) )
            // InternalGraphqlXtext.g:792:2: ( RULE_DIGIT )
            {
            // InternalGraphqlXtext.g:792:2: ( RULE_DIGIT )
            // InternalGraphqlXtext.g:793:3: RULE_DIGIT
            {
             before(grammarAccess.getIntValueAccess().getDIGITTerminalRuleCall()); 
            match(input,RULE_DIGIT,FOLLOW_2); 
             after(grammarAccess.getIntValueAccess().getDIGITTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntValue"


    // $ANTLR start "entryRuleStringValue"
    // InternalGraphqlXtext.g:803:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // InternalGraphqlXtext.g:804:1: ( ruleStringValue EOF )
            // InternalGraphqlXtext.g:805:1: ruleStringValue EOF
            {
             before(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_1);
            ruleStringValue();

            state._fsp--;

             after(grammarAccess.getStringValueRule()); 
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
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // InternalGraphqlXtext.g:812:1: ruleStringValue : ( RULE_STRING ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:816:2: ( ( RULE_STRING ) )
            // InternalGraphqlXtext.g:817:2: ( RULE_STRING )
            {
            // InternalGraphqlXtext.g:817:2: ( RULE_STRING )
            // InternalGraphqlXtext.g:818:3: RULE_STRING
            {
             before(grammarAccess.getStringValueAccess().getSTRINGTerminalRuleCall()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStringValueAccess().getSTRINGTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "rule__Definition__Alternatives"
    // InternalGraphqlXtext.g:827:1: rule__Definition__Alternatives : ( ( ruleOperationDefinition ) | ( ruleFragmentDefinition ) );
    public final void rule__Definition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:831:1: ( ( ruleOperationDefinition ) | ( ruleFragmentDefinition ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=17 && LA2_0<=18)||LA2_0==21) ) {
                alt2=1;
            }
            else if ( (LA2_0==25) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalGraphqlXtext.g:832:2: ( ruleOperationDefinition )
                    {
                    // InternalGraphqlXtext.g:832:2: ( ruleOperationDefinition )
                    // InternalGraphqlXtext.g:833:3: ruleOperationDefinition
                    {
                     before(grammarAccess.getDefinitionAccess().getOperationDefinitionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleOperationDefinition();

                    state._fsp--;

                     after(grammarAccess.getDefinitionAccess().getOperationDefinitionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGraphqlXtext.g:838:2: ( ruleFragmentDefinition )
                    {
                    // InternalGraphqlXtext.g:838:2: ( ruleFragmentDefinition )
                    // InternalGraphqlXtext.g:839:3: ruleFragmentDefinition
                    {
                     before(grammarAccess.getDefinitionAccess().getFragmentDefinitionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleFragmentDefinition();

                    state._fsp--;

                     after(grammarAccess.getDefinitionAccess().getFragmentDefinitionParserRuleCall_1()); 

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
    // $ANTLR end "rule__Definition__Alternatives"


    // $ANTLR start "rule__OperationDefinition__Alternatives"
    // InternalGraphqlXtext.g:848:1: rule__OperationDefinition__Alternatives : ( ( ( rule__OperationDefinition__SelectionAssignment_0 ) ) | ( ( rule__OperationDefinition__Group_1__0 ) ) );
    public final void rule__OperationDefinition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:852:1: ( ( ( rule__OperationDefinition__SelectionAssignment_0 ) ) | ( ( rule__OperationDefinition__Group_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==21) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=17 && LA3_0<=18)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalGraphqlXtext.g:853:2: ( ( rule__OperationDefinition__SelectionAssignment_0 ) )
                    {
                    // InternalGraphqlXtext.g:853:2: ( ( rule__OperationDefinition__SelectionAssignment_0 ) )
                    // InternalGraphqlXtext.g:854:3: ( rule__OperationDefinition__SelectionAssignment_0 )
                    {
                     before(grammarAccess.getOperationDefinitionAccess().getSelectionAssignment_0()); 
                    // InternalGraphqlXtext.g:855:3: ( rule__OperationDefinition__SelectionAssignment_0 )
                    // InternalGraphqlXtext.g:855:4: rule__OperationDefinition__SelectionAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OperationDefinition__SelectionAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOperationDefinitionAccess().getSelectionAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGraphqlXtext.g:859:2: ( ( rule__OperationDefinition__Group_1__0 ) )
                    {
                    // InternalGraphqlXtext.g:859:2: ( ( rule__OperationDefinition__Group_1__0 ) )
                    // InternalGraphqlXtext.g:860:3: ( rule__OperationDefinition__Group_1__0 )
                    {
                     before(grammarAccess.getOperationDefinitionAccess().getGroup_1()); 
                    // InternalGraphqlXtext.g:861:3: ( rule__OperationDefinition__Group_1__0 )
                    // InternalGraphqlXtext.g:861:4: rule__OperationDefinition__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OperationDefinition__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOperationDefinitionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__OperationDefinition__Alternatives"


    // $ANTLR start "rule__OperationType__Alternatives"
    // InternalGraphqlXtext.g:869:1: rule__OperationType__Alternatives : ( ( 'query' ) | ( 'mutation' ) );
    public final void rule__OperationType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:873:1: ( ( 'query' ) | ( 'mutation' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            else if ( (LA4_0==18) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalGraphqlXtext.g:874:2: ( 'query' )
                    {
                    // InternalGraphqlXtext.g:874:2: ( 'query' )
                    // InternalGraphqlXtext.g:875:3: 'query'
                    {
                     before(grammarAccess.getOperationTypeAccess().getQueryKeyword_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getOperationTypeAccess().getQueryKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGraphqlXtext.g:880:2: ( 'mutation' )
                    {
                    // InternalGraphqlXtext.g:880:2: ( 'mutation' )
                    // InternalGraphqlXtext.g:881:3: 'mutation'
                    {
                     before(grammarAccess.getOperationTypeAccess().getMutationKeyword_1()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getOperationTypeAccess().getMutationKeyword_1()); 

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
    // $ANTLR end "rule__OperationType__Alternatives"


    // $ANTLR start "rule__Selection__Alternatives"
    // InternalGraphqlXtext.g:890:1: rule__Selection__Alternatives : ( ( ruleField ) | ( ruleFragmentSpread ) | ( ruleInlineFragment ) );
    public final void rule__Selection__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:894:1: ( ( ruleField ) | ( ruleFragmentSpread ) | ( ruleInlineFragment ) )
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_NAME) ) {
                alt5=1;
            }
            else if ( (LA5_0==24) ) {
                int LA5_2 = input.LA(2);

                if ( (LA5_2==RULE_NAME) ) {
                    alt5=2;
                }
                else if ( (LA5_2==21||LA5_2==26||LA5_2==31) ) {
                    alt5=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalGraphqlXtext.g:895:2: ( ruleField )
                    {
                    // InternalGraphqlXtext.g:895:2: ( ruleField )
                    // InternalGraphqlXtext.g:896:3: ruleField
                    {
                     before(grammarAccess.getSelectionAccess().getFieldParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleField();

                    state._fsp--;

                     after(grammarAccess.getSelectionAccess().getFieldParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGraphqlXtext.g:901:2: ( ruleFragmentSpread )
                    {
                    // InternalGraphqlXtext.g:901:2: ( ruleFragmentSpread )
                    // InternalGraphqlXtext.g:902:3: ruleFragmentSpread
                    {
                     before(grammarAccess.getSelectionAccess().getFragmentSpreadParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleFragmentSpread();

                    state._fsp--;

                     after(grammarAccess.getSelectionAccess().getFragmentSpreadParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGraphqlXtext.g:907:2: ( ruleInlineFragment )
                    {
                    // InternalGraphqlXtext.g:907:2: ( ruleInlineFragment )
                    // InternalGraphqlXtext.g:908:3: ruleInlineFragment
                    {
                     before(grammarAccess.getSelectionAccess().getInlineFragmentParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleInlineFragment();

                    state._fsp--;

                     after(grammarAccess.getSelectionAccess().getInlineFragmentParserRuleCall_2()); 

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
    // $ANTLR end "rule__Selection__Alternatives"


    // $ANTLR start "rule__Value__Alternatives"
    // InternalGraphqlXtext.g:917:1: rule__Value__Alternatives : ( ( ruleSingleValue ) | ( ruleComplexValue ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:921:1: ( ( ruleSingleValue ) | ( ruleComplexValue ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=RULE_NAME && LA6_0<=RULE_NULLVALUE)||LA6_0==29) ) {
                alt6=1;
            }
            else if ( (LA6_0==21||LA6_0==27) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalGraphqlXtext.g:922:2: ( ruleSingleValue )
                    {
                    // InternalGraphqlXtext.g:922:2: ( ruleSingleValue )
                    // InternalGraphqlXtext.g:923:3: ruleSingleValue
                    {
                     before(grammarAccess.getValueAccess().getSingleValueParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSingleValue();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getSingleValueParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGraphqlXtext.g:928:2: ( ruleComplexValue )
                    {
                    // InternalGraphqlXtext.g:928:2: ( ruleComplexValue )
                    // InternalGraphqlXtext.g:929:3: ruleComplexValue
                    {
                     before(grammarAccess.getValueAccess().getComplexValueParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleComplexValue();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getComplexValueParserRuleCall_1()); 

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
    // $ANTLR end "rule__Value__Alternatives"


    // $ANTLR start "rule__SingleValue__Alternatives"
    // InternalGraphqlXtext.g:938:1: rule__SingleValue__Alternatives : ( ( ( rule__SingleValue__ValueAssignment_0 ) ) | ( ( rule__SingleValue__ValueAssignment_1 ) ) | ( ( rule__SingleValue__ValueAssignment_2 ) ) | ( ( rule__SingleValue__ValueAssignment_3 ) ) | ( ( rule__SingleValue__ValueAssignment_4 ) ) | ( ( rule__SingleValue__ValueAssignment_5 ) ) );
    public final void rule__SingleValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:942:1: ( ( ( rule__SingleValue__ValueAssignment_0 ) ) | ( ( rule__SingleValue__ValueAssignment_1 ) ) | ( ( rule__SingleValue__ValueAssignment_2 ) ) | ( ( rule__SingleValue__ValueAssignment_3 ) ) | ( ( rule__SingleValue__ValueAssignment_4 ) ) | ( ( rule__SingleValue__ValueAssignment_5 ) ) )
            int alt7=6;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt7=1;
                }
                break;
            case RULE_DIGIT:
                {
                alt7=2;
                }
                break;
            case RULE_STRING:
                {
                alt7=3;
                }
                break;
            case RULE_BOOLEANVALUE:
                {
                alt7=4;
                }
                break;
            case RULE_NULLVALUE:
                {
                alt7=5;
                }
                break;
            case RULE_NAME:
                {
                alt7=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalGraphqlXtext.g:943:2: ( ( rule__SingleValue__ValueAssignment_0 ) )
                    {
                    // InternalGraphqlXtext.g:943:2: ( ( rule__SingleValue__ValueAssignment_0 ) )
                    // InternalGraphqlXtext.g:944:3: ( rule__SingleValue__ValueAssignment_0 )
                    {
                     before(grammarAccess.getSingleValueAccess().getValueAssignment_0()); 
                    // InternalGraphqlXtext.g:945:3: ( rule__SingleValue__ValueAssignment_0 )
                    // InternalGraphqlXtext.g:945:4: rule__SingleValue__ValueAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SingleValue__ValueAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSingleValueAccess().getValueAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGraphqlXtext.g:949:2: ( ( rule__SingleValue__ValueAssignment_1 ) )
                    {
                    // InternalGraphqlXtext.g:949:2: ( ( rule__SingleValue__ValueAssignment_1 ) )
                    // InternalGraphqlXtext.g:950:3: ( rule__SingleValue__ValueAssignment_1 )
                    {
                     before(grammarAccess.getSingleValueAccess().getValueAssignment_1()); 
                    // InternalGraphqlXtext.g:951:3: ( rule__SingleValue__ValueAssignment_1 )
                    // InternalGraphqlXtext.g:951:4: rule__SingleValue__ValueAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__SingleValue__ValueAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSingleValueAccess().getValueAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGraphqlXtext.g:955:2: ( ( rule__SingleValue__ValueAssignment_2 ) )
                    {
                    // InternalGraphqlXtext.g:955:2: ( ( rule__SingleValue__ValueAssignment_2 ) )
                    // InternalGraphqlXtext.g:956:3: ( rule__SingleValue__ValueAssignment_2 )
                    {
                     before(grammarAccess.getSingleValueAccess().getValueAssignment_2()); 
                    // InternalGraphqlXtext.g:957:3: ( rule__SingleValue__ValueAssignment_2 )
                    // InternalGraphqlXtext.g:957:4: rule__SingleValue__ValueAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__SingleValue__ValueAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getSingleValueAccess().getValueAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGraphqlXtext.g:961:2: ( ( rule__SingleValue__ValueAssignment_3 ) )
                    {
                    // InternalGraphqlXtext.g:961:2: ( ( rule__SingleValue__ValueAssignment_3 ) )
                    // InternalGraphqlXtext.g:962:3: ( rule__SingleValue__ValueAssignment_3 )
                    {
                     before(grammarAccess.getSingleValueAccess().getValueAssignment_3()); 
                    // InternalGraphqlXtext.g:963:3: ( rule__SingleValue__ValueAssignment_3 )
                    // InternalGraphqlXtext.g:963:4: rule__SingleValue__ValueAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__SingleValue__ValueAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getSingleValueAccess().getValueAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalGraphqlXtext.g:967:2: ( ( rule__SingleValue__ValueAssignment_4 ) )
                    {
                    // InternalGraphqlXtext.g:967:2: ( ( rule__SingleValue__ValueAssignment_4 ) )
                    // InternalGraphqlXtext.g:968:3: ( rule__SingleValue__ValueAssignment_4 )
                    {
                     before(grammarAccess.getSingleValueAccess().getValueAssignment_4()); 
                    // InternalGraphqlXtext.g:969:3: ( rule__SingleValue__ValueAssignment_4 )
                    // InternalGraphqlXtext.g:969:4: rule__SingleValue__ValueAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__SingleValue__ValueAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getSingleValueAccess().getValueAssignment_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalGraphqlXtext.g:973:2: ( ( rule__SingleValue__ValueAssignment_5 ) )
                    {
                    // InternalGraphqlXtext.g:973:2: ( ( rule__SingleValue__ValueAssignment_5 ) )
                    // InternalGraphqlXtext.g:974:3: ( rule__SingleValue__ValueAssignment_5 )
                    {
                     before(grammarAccess.getSingleValueAccess().getValueAssignment_5()); 
                    // InternalGraphqlXtext.g:975:3: ( rule__SingleValue__ValueAssignment_5 )
                    // InternalGraphqlXtext.g:975:4: rule__SingleValue__ValueAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__SingleValue__ValueAssignment_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getSingleValueAccess().getValueAssignment_5()); 

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
    // $ANTLR end "rule__SingleValue__Alternatives"


    // $ANTLR start "rule__ComplexValue__Alternatives"
    // InternalGraphqlXtext.g:983:1: rule__ComplexValue__Alternatives : ( ( ( rule__ComplexValue__ValueAssignment_0 ) ) | ( ( rule__ComplexValue__ValueAssignment_1 ) ) );
    public final void rule__ComplexValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:987:1: ( ( ( rule__ComplexValue__ValueAssignment_0 ) ) | ( ( rule__ComplexValue__ValueAssignment_1 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==27) ) {
                alt8=1;
            }
            else if ( (LA8_0==21) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalGraphqlXtext.g:988:2: ( ( rule__ComplexValue__ValueAssignment_0 ) )
                    {
                    // InternalGraphqlXtext.g:988:2: ( ( rule__ComplexValue__ValueAssignment_0 ) )
                    // InternalGraphqlXtext.g:989:3: ( rule__ComplexValue__ValueAssignment_0 )
                    {
                     before(grammarAccess.getComplexValueAccess().getValueAssignment_0()); 
                    // InternalGraphqlXtext.g:990:3: ( rule__ComplexValue__ValueAssignment_0 )
                    // InternalGraphqlXtext.g:990:4: rule__ComplexValue__ValueAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComplexValue__ValueAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComplexValueAccess().getValueAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGraphqlXtext.g:994:2: ( ( rule__ComplexValue__ValueAssignment_1 ) )
                    {
                    // InternalGraphqlXtext.g:994:2: ( ( rule__ComplexValue__ValueAssignment_1 ) )
                    // InternalGraphqlXtext.g:995:3: ( rule__ComplexValue__ValueAssignment_1 )
                    {
                     before(grammarAccess.getComplexValueAccess().getValueAssignment_1()); 
                    // InternalGraphqlXtext.g:996:3: ( rule__ComplexValue__ValueAssignment_1 )
                    // InternalGraphqlXtext.g:996:4: rule__ComplexValue__ValueAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComplexValue__ValueAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getComplexValueAccess().getValueAssignment_1()); 

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
    // $ANTLR end "rule__ComplexValue__Alternatives"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalGraphqlXtext.g:1004:1: rule__Type__Alternatives : ( ( ( rule__Type__Group_0__0 ) ) | ( ( rule__Type__Group_1__0 ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:1008:1: ( ( ( rule__Type__Group_0__0 ) ) | ( ( rule__Type__Group_1__0 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_NAME) ) {
                alt9=1;
            }
            else if ( (LA9_0==27) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalGraphqlXtext.g:1009:2: ( ( rule__Type__Group_0__0 ) )
                    {
                    // InternalGraphqlXtext.g:1009:2: ( ( rule__Type__Group_0__0 ) )
                    // InternalGraphqlXtext.g:1010:3: ( rule__Type__Group_0__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_0()); 
                    // InternalGraphqlXtext.g:1011:3: ( rule__Type__Group_0__0 )
                    // InternalGraphqlXtext.g:1011:4: rule__Type__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGraphqlXtext.g:1015:2: ( ( rule__Type__Group_1__0 ) )
                    {
                    // InternalGraphqlXtext.g:1015:2: ( ( rule__Type__Group_1__0 ) )
                    // InternalGraphqlXtext.g:1016:3: ( rule__Type__Group_1__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_1()); 
                    // InternalGraphqlXtext.g:1017:3: ( rule__Type__Group_1__0 )
                    // InternalGraphqlXtext.g:1017:4: rule__Type__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__OperationDefinition__Group_1__0"
    // InternalGraphqlXtext.g:1025:1: rule__OperationDefinition__Group_1__0 : rule__OperationDefinition__Group_1__0__Impl rule__OperationDefinition__Group_1__1 ;
    public final void rule__OperationDefinition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:1029:1: ( rule__OperationDefinition__Group_1__0__Impl rule__OperationDefinition__Group_1__1 )
            // InternalGraphqlXtext.g:1030:2: rule__OperationDefinition__Group_1__0__Impl rule__OperationDefinition__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__OperationDefinition__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OperationDefinition__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDefinition__Group_1__0"


    // $ANTLR start "rule__OperationDefinition__Group_1__0__Impl"
    // InternalGraphqlXtext.g:1037:1: rule__OperationDefinition__Group_1__0__Impl : ( ( rule__OperationDefinition__OpTypeAssignment_1_0 ) ) ;
    public final void rule__OperationDefinition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:1041:1: ( ( ( rule__OperationDefinition__OpTypeAssignment_1_0 ) ) )
            // InternalGraphqlXtext.g:1042:1: ( ( rule__OperationDefinition__OpTypeAssignment_1_0 ) )
            {
            // InternalGraphqlXtext.g:1042:1: ( ( rule__OperationDefinition__OpTypeAssignment_1_0 ) )
            // InternalGraphqlXtext.g:1043:2: ( rule__OperationDefinition__OpTypeAssignment_1_0 )
            {
             before(grammarAccess.getOperationDefinitionAccess().getOpTypeAssignment_1_0()); 
            // InternalGraphqlXtext.g:1044:2: ( rule__OperationDefinition__OpTypeAssignment_1_0 )
            // InternalGraphqlXtext.g:1044:3: rule__OperationDefinition__OpTypeAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__OperationDefinition__OpTypeAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getOperationDefinitionAccess().getOpTypeAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDefinition__Group_1__0__Impl"


    // $ANTLR start "rule__OperationDefinition__Group_1__1"
    // InternalGraphqlXtext.g:1052:1: rule__OperationDefinition__Group_1__1 : rule__OperationDefinition__Group_1__1__Impl rule__OperationDefinition__Group_1__2 ;
    public final void rule__OperationDefinition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:1056:1: ( rule__OperationDefinition__Group_1__1__Impl rule__OperationDefinition__Group_1__2 )
            // InternalGraphqlXtext.g:1057:2: rule__OperationDefinition__Group_1__1__Impl rule__OperationDefinition__Group_1__2
            {
            pushFollow(FOLLOW_4);
            rule__OperationDefinition__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OperationDefinition__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDefinition__Group_1__1"


    // $ANTLR start "rule__OperationDefinition__Group_1__1__Impl"
    // InternalGraphqlXtext.g:1064:1: rule__OperationDefinition__Group_1__1__Impl : ( ( rule__OperationDefinition__NameAssignment_1_1 )? ) ;
    public final void rule__OperationDefinition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:1068:1: ( ( ( rule__OperationDefinition__NameAssignment_1_1 )? ) )
            // InternalGraphqlXtext.g:1069:1: ( ( rule__OperationDefinition__NameAssignment_1_1 )? )
            {
            // InternalGraphqlXtext.g:1069:1: ( ( rule__OperationDefinition__NameAssignment_1_1 )? )
            // InternalGraphqlXtext.g:1070:2: ( rule__OperationDefinition__NameAssignment_1_1 )?
            {
             before(grammarAccess.getOperationDefinitionAccess().getNameAssignment_1_1()); 
            // InternalGraphqlXtext.g:1071:2: ( rule__OperationDefinition__NameAssignment_1_1 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_NAME) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalGraphqlXtext.g:1071:3: rule__OperationDefinition__NameAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__OperationDefinition__NameAssignment_1_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOperationDefinitionAccess().getNameAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDefinition__Group_1__1__Impl"


    // $ANTLR start "rule__OperationDefinition__Group_1__2"
    // InternalGraphqlXtext.g:1079:1: rule__OperationDefinition__Group_1__2 : rule__OperationDefinition__Group_1__2__Impl rule__OperationDefinition__Group_1__3 ;
    public final void rule__OperationDefinition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:1083:1: ( rule__OperationDefinition__Group_1__2__Impl rule__OperationDefinition__Group_1__3 )
            // InternalGraphqlXtext.g:1084:2: rule__OperationDefinition__Group_1__2__Impl rule__OperationDefinition__Group_1__3
            {
            pushFollow(FOLLOW_4);
            rule__OperationDefinition__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OperationDefinition__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDefinition__Group_1__2"


    // $ANTLR start "rule__OperationDefinition__Group_1__2__Impl"
    // InternalGraphqlXtext.g:1091:1: rule__OperationDefinition__Group_1__2__Impl : ( ( rule__OperationDefinition__Group_1_2__0 )? ) ;
    public final void rule__OperationDefinition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:1095:1: ( ( ( rule__OperationDefinition__Group_1_2__0 )? ) )
            // InternalGraphqlXtext.g:1096:1: ( ( rule__OperationDefinition__Group_1_2__0 )? )
            {
            // InternalGraphqlXtext.g:1096:1: ( ( rule__OperationDefinition__Group_1_2__0 )? )
            // InternalGraphqlXtext.g:1097:2: ( rule__OperationDefinition__Group_1_2__0 )?
            {
             before(grammarAccess.getOperationDefinitionAccess().getGroup_1_2()); 
            // InternalGraphqlXtext.g:1098:2: ( rule__OperationDefinition__Group_1_2__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==19) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalGraphqlXtext.g:1098:3: rule__OperationDefinition__Group_1_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OperationDefinition__Group_1_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOperationDefinitionAccess().getGroup_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDefinition__Group_1__2__Impl"


    // $ANTLR start "rule__OperationDefinition__Group_1__3"
    // InternalGraphqlXtext.g:1106:1: rule__OperationDefinition__Group_1__3 : rule__OperationDefinition__Group_1__3__Impl rule__OperationDefinition__Group_1__4 ;
    public final void rule__OperationDefinition__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:1110:1: ( rule__OperationDefinition__Group_1__3__Impl rule__OperationDefinition__Group_1__4 )
            // InternalGraphqlXtext.g:1111:2: rule__OperationDefinition__Group_1__3__Impl rule__OperationDefinition__Group_1__4
            {
            pushFollow(FOLLOW_4);
            rule__OperationDefinition__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OperationDefinition__Group_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDefinition__Group_1__3"


    // $ANTLR start "rule__OperationDefinition__Group_1__3__Impl"
    // InternalGraphqlXtext.g:1118:1: rule__OperationDefinition__Group_1__3__Impl : ( ( rule__OperationDefinition__DirectivesAssignment_1_3 )* ) ;
    public final void rule__OperationDefinition__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:1122:1: ( ( ( rule__OperationDefinition__DirectivesAssignment_1_3 )* ) )
            // InternalGraphqlXtext.g:1123:1: ( ( rule__OperationDefinition__DirectivesAssignment_1_3 )* )
            {
            // InternalGraphqlXtext.g:1123:1: ( ( rule__OperationDefinition__DirectivesAssignment_1_3 )* )
            // InternalGraphqlXtext.g:1124:2: ( rule__OperationDefinition__DirectivesAssignment_1_3 )*
            {
             before(grammarAccess.getOperationDefinitionAccess().getDirectivesAssignment_1_3()); 
            // InternalGraphqlXtext.g:1125:2: ( rule__OperationDefinition__DirectivesAssignment_1_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==31) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalGraphqlXtext.g:1125:3: rule__OperationDefinition__DirectivesAssignment_1_3
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__OperationDefinition__DirectivesAssignment_1_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getOperationDefinitionAccess().getDirectivesAssignment_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDefinition__Group_1__3__Impl"


    // $ANTLR start "rule__OperationDefinition__Group_1__4"
    // InternalGraphqlXtext.g:1133:1: rule__OperationDefinition__Group_1__4 : rule__OperationDefinition__Group_1__4__Impl ;
    public final void rule__OperationDefinition__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:1137:1: ( rule__OperationDefinition__Group_1__4__Impl )
            // InternalGraphqlXtext.g:1138:2: rule__OperationDefinition__Group_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OperationDefinition__Group_1__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDefinition__Group_1__4"


    // $ANTLR start "rule__OperationDefinition__Group_1__4__Impl"
    // InternalGraphqlXtext.g:1144:1: rule__OperationDefinition__Group_1__4__Impl : ( ( rule__OperationDefinition__SelectionSetAssignment_1_4 ) ) ;
    public final void rule__OperationDefinition__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:1148:1: ( ( ( rule__OperationDefinition__SelectionSetAssignment_1_4 ) ) )
            // InternalGraphqlXtext.g:1149:1: ( ( rule__OperationDefinition__SelectionSetAssignment_1_4 ) )
            {
            // InternalGraphqlXtext.g:1149:1: ( ( rule__OperationDefinition__SelectionSetAssignment_1_4 ) )
            // InternalGraphqlXtext.g:1150:2: ( rule__OperationDefinition__SelectionSetAssignment_1_4 )
            {
             before(grammarAccess.getOperationDefinitionAccess().getSelectionSetAssignment_1_4()); 
            // InternalGraphqlXtext.g:1151:2: ( rule__OperationDefinition__SelectionSetAssignment_1_4 )
            // InternalGraphqlXtext.g:1151:3: rule__OperationDefinition__SelectionSetAssignment_1_4
            {
            pushFollow(FOLLOW_2);
            rule__OperationDefinition__SelectionSetAssignment_1_4();

            state._fsp--;


            }

             after(grammarAccess.getOperationDefinitionAccess().getSelectionSetAssignment_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDefinition__Group_1__4__Impl"


    // $ANTLR start "rule__OperationDefinition__Group_1_2__0"
    // InternalGraphqlXtext.g:1160:1: rule__OperationDefinition__Group_1_2__0 : rule__OperationDefinition__Group_1_2__0__Impl rule__OperationDefinition__Group_1_2__1 ;
    public final void rule__OperationDefinition__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:1164:1: ( rule__OperationDefinition__Group_1_2__0__Impl rule__OperationDefinition__Group_1_2__1 )
            // InternalGraphqlXtext.g:1165:2: rule__OperationDefinition__Group_1_2__0__Impl rule__OperationDefinition__Group_1_2__1
            {
            pushFollow(FOLLOW_6);
            rule__OperationDefinition__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OperationDefinition__Group_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDefinition__Group_1_2__0"


    // $ANTLR start "rule__OperationDefinition__Group_1_2__0__Impl"
    // InternalGraphqlXtext.g:1172:1: rule__OperationDefinition__Group_1_2__0__Impl : ( '(' ) ;
    public final void rule__OperationDefinition__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:1176:1: ( ( '(' ) )
            // InternalGraphqlXtext.g:1177:1: ( '(' )
            {
            // InternalGraphqlXtext.g:1177:1: ( '(' )
            // InternalGraphqlXtext.g:1178:2: '('
            {
             before(grammarAccess.getOperationDefinitionAccess().getLeftParenthesisKeyword_1_2_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getOperationDefinitionAccess().getLeftParenthesisKeyword_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDefinition__Group_1_2__0__Impl"


    // $ANTLR start "rule__OperationDefinition__Group_1_2__1"
    // InternalGraphqlXtext.g:1187:1: rule__OperationDefinition__Group_1_2__1 : rule__OperationDefinition__Group_1_2__1__Impl rule__OperationDefinition__Group_1_2__2 ;
    public final void rule__OperationDefinition__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:1191:1: ( rule__OperationDefinition__Group_1_2__1__Impl rule__OperationDefinition__Group_1_2__2 )
            // InternalGraphqlXtext.g:1192:2: rule__OperationDefinition__Group_1_2__1__Impl rule__OperationDefinition__Group_1_2__2
            {
            pushFollow(FOLLOW_7);
            rule__OperationDefinition__Group_1_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OperationDefinition__Group_1_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDefinition__Group_1_2__1"


    // $ANTLR start "rule__OperationDefinition__Group_1_2__1__Impl"
    // InternalGraphqlXtext.g:1199:1: rule__OperationDefinition__Group_1_2__1__Impl : ( ( ( rule__OperationDefinition__VarDefinitionsAssignment_1_2_1 ) ) ( ( rule__OperationDefinition__VarDefinitionsAssignment_1_2_1 )* ) ) ;
    public final void rule__OperationDefinition__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:1203:1: ( ( ( ( rule__OperationDefinition__VarDefinitionsAssignment_1_2_1 ) ) ( ( rule__OperationDefinition__VarDefinitionsAssignment_1_2_1 )* ) ) )
            // InternalGraphqlXtext.g:1204:1: ( ( ( rule__OperationDefinition__VarDefinitionsAssignment_1_2_1 ) ) ( ( rule__OperationDefinition__VarDefinitionsAssignment_1_2_1 )* ) )
            {
            // InternalGraphqlXtext.g:1204:1: ( ( ( rule__OperationDefinition__VarDefinitionsAssignment_1_2_1 ) ) ( ( rule__OperationDefinition__VarDefinitionsAssignment_1_2_1 )* ) )
            // InternalGraphqlXtext.g:1205:2: ( ( rule__OperationDefinition__VarDefinitionsAssignment_1_2_1 ) ) ( ( rule__OperationDefinition__VarDefinitionsAssignment_1_2_1 )* )
            {
            // InternalGraphqlXtext.g:1205:2: ( ( rule__OperationDefinition__VarDefinitionsAssignment_1_2_1 ) )
            // InternalGraphqlXtext.g:1206:3: ( rule__OperationDefinition__VarDefinitionsAssignment_1_2_1 )
            {
             before(grammarAccess.getOperationDefinitionAccess().getVarDefinitionsAssignment_1_2_1()); 
            // InternalGraphqlXtext.g:1207:3: ( rule__OperationDefinition__VarDefinitionsAssignment_1_2_1 )
            // InternalGraphqlXtext.g:1207:4: rule__OperationDefinition__VarDefinitionsAssignment_1_2_1
            {
            pushFollow(FOLLOW_8);
            rule__OperationDefinition__VarDefinitionsAssignment_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getOperationDefinitionAccess().getVarDefinitionsAssignment_1_2_1()); 

            }

            // InternalGraphqlXtext.g:1210:2: ( ( rule__OperationDefinition__VarDefinitionsAssignment_1_2_1 )* )
            // InternalGraphqlXtext.g:1211:3: ( rule__OperationDefinition__VarDefinitionsAssignment_1_2_1 )*
            {
             before(grammarAccess.getOperationDefinitionAccess().getVarDefinitionsAssignment_1_2_1()); 
            // InternalGraphqlXtext.g:1212:3: ( rule__OperationDefinition__VarDefinitionsAssignment_1_2_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==29) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalGraphqlXtext.g:1212:4: rule__OperationDefinition__VarDefinitionsAssignment_1_2_1
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__OperationDefinition__VarDefinitionsAssignment_1_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getOperationDefinitionAccess().getVarDefinitionsAssignment_1_2_1()); 

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
    // $ANTLR end "rule__OperationDefinition__Group_1_2__1__Impl"


    // $ANTLR start "rule__OperationDefinition__Group_1_2__2"
    // InternalGraphqlXtext.g:1221:1: rule__OperationDefinition__Group_1_2__2 : rule__OperationDefinition__Group_1_2__2__Impl ;
    public final void rule__OperationDefinition__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:1225:1: ( rule__OperationDefinition__Group_1_2__2__Impl )
            // InternalGraphqlXtext.g:1226:2: rule__OperationDefinition__Group_1_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OperationDefinition__Group_1_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDefinition__Group_1_2__2"


    // $ANTLR start "rule__OperationDefinition__Group_1_2__2__Impl"
    // InternalGraphqlXtext.g:1232:1: rule__OperationDefinition__Group_1_2__2__Impl : ( ')' ) ;
    public final void rule__OperationDefinition__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:1236:1: ( ( ')' ) )
            // InternalGraphqlXtext.g:1237:1: ( ')' )
            {
            // InternalGraphqlXtext.g:1237:1: ( ')' )
            // InternalGraphqlXtext.g:1238:2: ')'
            {
             before(grammarAccess.getOperationDefinitionAccess().getRightParenthesisKeyword_1_2_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getOperationDefinitionAccess().getRightParenthesisKeyword_1_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDefinition__Group_1_2__2__Impl"


    // $ANTLR start "rule__SelectionSet__Group__0"
    // InternalGraphqlXtext.g:1248:1: rule__SelectionSet__Group__0 : rule__SelectionSet__Group__0__Impl rule__SelectionSet__Group__1 ;
    public final void rule__SelectionSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:1252:1: ( rule__SelectionSet__Group__0__Impl rule__SelectionSet__Group__1 )
            // InternalGraphqlXtext.g:1253:2: rule__SelectionSet__Group__0__Impl rule__SelectionSet__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__SelectionSet__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectionSet__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionSet__Group__0"


    // $ANTLR start "rule__SelectionSet__Group__0__Impl"
    // InternalGraphqlXtext.g:1260:1: rule__SelectionSet__Group__0__Impl : ( () ) ;
    public final void rule__SelectionSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:1264:1: ( ( () ) )
            // InternalGraphqlXtext.g:1265:1: ( () )
            {
            // InternalGraphqlXtext.g:1265:1: ( () )
            // InternalGraphqlXtext.g:1266:2: ()
            {
             before(grammarAccess.getSelectionSetAccess().getSelectionSetAction_0()); 
            // InternalGraphqlXtext.g:1267:2: ()
            // InternalGraphqlXtext.g:1267:3: 
            {
            }

             after(grammarAccess.getSelectionSetAccess().getSelectionSetAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionSet__Group__0__Impl"


    // $ANTLR start "rule__SelectionSet__Group__1"
    // InternalGraphqlXtext.g:1275:1: rule__SelectionSet__Group__1 : rule__SelectionSet__Group__1__Impl rule__SelectionSet__Group__2 ;
    public final void rule__SelectionSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:1279:1: ( rule__SelectionSet__Group__1__Impl rule__SelectionSet__Group__2 )
            // InternalGraphqlXtext.g:1280:2: rule__SelectionSet__Group__1__Impl rule__SelectionSet__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__SelectionSet__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectionSet__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionSet__Group__1"


    // $ANTLR start "rule__SelectionSet__Group__1__Impl"
    // InternalGraphqlXtext.g:1287:1: rule__SelectionSet__Group__1__Impl : ( '{' ) ;
    public final void rule__SelectionSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:1291:1: ( ( '{' ) )
            // InternalGraphqlXtext.g:1292:1: ( '{' )
            {
            // InternalGraphqlXtext.g:1292:1: ( '{' )
            // InternalGraphqlXtext.g:1293:2: '{'
            {
             before(grammarAccess.getSelectionSetAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSelectionSetAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionSet__Group__1__Impl"


    // $ANTLR start "rule__SelectionSet__Group__2"
    // InternalGraphqlXtext.g:1302:1: rule__SelectionSet__Group__2 : rule__SelectionSet__Group__2__Impl rule__SelectionSet__Group__3 ;
    public final void rule__SelectionSet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:1306:1: ( rule__SelectionSet__Group__2__Impl rule__SelectionSet__Group__3 )
            // InternalGraphqlXtext.g:1307:2: rule__SelectionSet__Group__2__Impl rule__SelectionSet__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__SelectionSet__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectionSet__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionSet__Group__2"


    // $ANTLR start "rule__SelectionSet__Group__2__Impl"
    // InternalGraphqlXtext.g:1314:1: rule__SelectionSet__Group__2__Impl : ( ( ( rule__SelectionSet__SelectionsAssignment_2 ) ) ( ( rule__SelectionSet__SelectionsAssignment_2 )* ) ) ;
    public final void rule__SelectionSet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:1318:1: ( ( ( ( rule__SelectionSet__SelectionsAssignment_2 ) ) ( ( rule__SelectionSet__SelectionsAssignment_2 )* ) ) )
            // InternalGraphqlXtext.g:1319:1: ( ( ( rule__SelectionSet__SelectionsAssignment_2 ) ) ( ( rule__SelectionSet__SelectionsAssignment_2 )* ) )
            {
            // InternalGraphqlXtext.g:1319:1: ( ( ( rule__SelectionSet__SelectionsAssignment_2 ) ) ( ( rule__SelectionSet__SelectionsAssignment_2 )* ) )
            // InternalGraphqlXtext.g:1320:2: ( ( rule__SelectionSet__SelectionsAssignment_2 ) ) ( ( rule__SelectionSet__SelectionsAssignment_2 )* )
            {
            // InternalGraphqlXtext.g:1320:2: ( ( rule__SelectionSet__SelectionsAssignment_2 ) )
            // InternalGraphqlXtext.g:1321:3: ( rule__SelectionSet__SelectionsAssignment_2 )
            {
             before(grammarAccess.getSelectionSetAccess().getSelectionsAssignment_2()); 
            // InternalGraphqlXtext.g:1322:3: ( rule__SelectionSet__SelectionsAssignment_2 )
            // InternalGraphqlXtext.g:1322:4: rule__SelectionSet__SelectionsAssignment_2
            {
            pushFollow(FOLLOW_12);
            rule__SelectionSet__SelectionsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSelectionSetAccess().getSelectionsAssignment_2()); 

            }

            // InternalGraphqlXtext.g:1325:2: ( ( rule__SelectionSet__SelectionsAssignment_2 )* )
            // InternalGraphqlXtext.g:1326:3: ( rule__SelectionSet__SelectionsAssignment_2 )*
            {
             before(grammarAccess.getSelectionSetAccess().getSelectionsAssignment_2()); 
            // InternalGraphqlXtext.g:1327:3: ( rule__SelectionSet__SelectionsAssignment_2 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_NAME||LA14_0==24) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalGraphqlXtext.g:1327:4: rule__SelectionSet__SelectionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__SelectionSet__SelectionsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getSelectionSetAccess().getSelectionsAssignment_2()); 

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
    // $ANTLR end "rule__SelectionSet__Group__2__Impl"


    // $ANTLR start "rule__SelectionSet__Group__3"
    // InternalGraphqlXtext.g:1336:1: rule__SelectionSet__Group__3 : rule__SelectionSet__Group__3__Impl ;
    public final void rule__SelectionSet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:1340:1: ( rule__SelectionSet__Group__3__Impl )
            // InternalGraphqlXtext.g:1341:2: rule__SelectionSet__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectionSet__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionSet__Group__3"


    // $ANTLR start "rule__SelectionSet__Group__3__Impl"
    // InternalGraphqlXtext.g:1347:1: rule__SelectionSet__Group__3__Impl : ( '}' ) ;
    public final void rule__SelectionSet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:1351:1: ( ( '}' ) )
            // InternalGraphqlXtext.g:1352:1: ( '}' )
            {
            // InternalGraphqlXtext.g:1352:1: ( '}' )
            // InternalGraphqlXtext.g:1353:2: '}'
            {
             before(grammarAccess.getSelectionSetAccess().getRightCurlyBracketKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSelectionSetAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionSet__Group__3__Impl"


    // $ANTLR start "rule__Field__Group__0"
    // InternalGraphqlXtext.g:1363:1: rule__Field__Group__0 : rule__Field__Group__0__Impl rule__Field__Group__1 ;
    public final void rule__Field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:1367:1: ( rule__Field__Group__0__Impl rule__Field__Group__1 )
            // InternalGraphqlXtext.g:1368:2: rule__Field__Group__0__Impl rule__Field__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Field__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__0"


    // $ANTLR start "rule__Field__Group__0__Impl"
    // InternalGraphqlXtext.g:1375:1: rule__Field__Group__0__Impl : ( ( rule__Field__AliasAssignment_0 )? ) ;
    public final void rule__Field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:1379:1: ( ( ( rule__Field__AliasAssignment_0 )? ) )
            // InternalGraphqlXtext.g:1380:1: ( ( rule__Field__AliasAssignment_0 )? )
            {
            // InternalGraphqlXtext.g:1380:1: ( ( rule__Field__AliasAssignment_0 )? )
            // InternalGraphqlXtext.g:1381:2: ( rule__Field__AliasAssignment_0 )?
            {
             before(grammarAccess.getFieldAccess().getAliasAssignment_0()); 
            // InternalGraphqlXtext.g:1382:2: ( rule__Field__AliasAssignment_0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_NAME) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==23) ) {
                    alt15=1;
                }
            }
            switch (alt15) {
                case 1 :
                    // InternalGraphqlXtext.g:1382:3: rule__Field__AliasAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Field__AliasAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFieldAccess().getAliasAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__0__Impl"


    // $ANTLR start "rule__Field__Group__1"
    // InternalGraphqlXtext.g:1390:1: rule__Field__Group__1 : rule__Field__Group__1__Impl rule__Field__Group__2 ;
    public final void rule__Field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:1394:1: ( rule__Field__Group__1__Impl rule__Field__Group__2 )
            // InternalGraphqlXtext.g:1395:2: rule__Field__Group__1__Impl rule__Field__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Field__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__1"


    // $ANTLR start "rule__Field__Group__1__Impl"
    // InternalGraphqlXtext.g:1402:1: rule__Field__Group__1__Impl : ( ( rule__Field__NameAssignment_1 ) ) ;
    public final void rule__Field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:1406:1: ( ( ( rule__Field__NameAssignment_1 ) ) )
            // InternalGraphqlXtext.g:1407:1: ( ( rule__Field__NameAssignment_1 ) )
            {
            // InternalGraphqlXtext.g:1407:1: ( ( rule__Field__NameAssignment_1 ) )
            // InternalGraphqlXtext.g:1408:2: ( rule__Field__NameAssignment_1 )
            {
             before(grammarAccess.getFieldAccess().getNameAssignment_1()); 
            // InternalGraphqlXtext.g:1409:2: ( rule__Field__NameAssignment_1 )
            // InternalGraphqlXtext.g:1409:3: rule__Field__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Field__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__1__Impl"


    // $ANTLR start "rule__Field__Group__2"
    // InternalGraphqlXtext.g:1417:1: rule__Field__Group__2 : rule__Field__Group__2__Impl rule__Field__Group__3 ;
    public final void rule__Field__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:1421:1: ( rule__Field__Group__2__Impl rule__Field__Group__3 )
            // InternalGraphqlXtext.g:1422:2: rule__Field__Group__2__Impl rule__Field__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Field__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__2"


    // $ANTLR start "rule__Field__Group__2__Impl"
    // InternalGraphqlXtext.g:1429:1: rule__Field__Group__2__Impl : ( ( rule__Field__ArgsAssignment_2 )? ) ;
    public final void rule__Field__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:1433:1: ( ( ( rule__Field__ArgsAssignment_2 )? ) )
            // InternalGraphqlXtext.g:1434:1: ( ( rule__Field__ArgsAssignment_2 )? )
            {
            // InternalGraphqlXtext.g:1434:1: ( ( rule__Field__ArgsAssignment_2 )? )
            // InternalGraphqlXtext.g:1435:2: ( rule__Field__ArgsAssignment_2 )?
            {
             before(grammarAccess.getFieldAccess().getArgsAssignment_2()); 
            // InternalGraphqlXtext.g:1436:2: ( rule__Field__ArgsAssignment_2 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==19) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalGraphqlXtext.g:1436:3: rule__Field__ArgsAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Field__ArgsAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFieldAccess().getArgsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__2__Impl"


    // $ANTLR start "rule__Field__Group__3"
    // InternalGraphqlXtext.g:1444:1: rule__Field__Group__3 : rule__Field__Group__3__Impl rule__Field__Group__4 ;
    public final void rule__Field__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:1448:1: ( rule__Field__Group__3__Impl rule__Field__Group__4 )
            // InternalGraphqlXtext.g:1449:2: rule__Field__Group__3__Impl rule__Field__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__Field__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__3"


    // $ANTLR start "rule__Field__Group__3__Impl"
    // InternalGraphqlXtext.g:1456:1: rule__Field__Group__3__Impl : ( ( rule__Field__DirectivesAssignment_3 )* ) ;
    public final void rule__Field__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:1460:1: ( ( ( rule__Field__DirectivesAssignment_3 )* ) )
            // InternalGraphqlXtext.g:1461:1: ( ( rule__Field__DirectivesAssignment_3 )* )
            {
            // InternalGraphqlXtext.g:1461:1: ( ( rule__Field__DirectivesAssignment_3 )* )
            // InternalGraphqlXtext.g:1462:2: ( rule__Field__DirectivesAssignment_3 )*
            {
             before(grammarAccess.getFieldAccess().getDirectivesAssignment_3()); 
            // InternalGraphqlXtext.g:1463:2: ( rule__Field__DirectivesAssignment_3 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==31) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalGraphqlXtext.g:1463:3: rule__Field__DirectivesAssignment_3
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Field__DirectivesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getFieldAccess().getDirectivesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__3__Impl"


    // $ANTLR start "rule__Field__Group__4"
    // InternalGraphqlXtext.g:1471:1: rule__Field__Group__4 : rule__Field__Group__4__Impl ;
    public final void rule__Field__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:1475:1: ( rule__Field__Group__4__Impl )
            // InternalGraphqlXtext.g:1476:2: rule__Field__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Field__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__4"


    // $ANTLR start "rule__Field__Group__4__Impl"
    // InternalGraphqlXtext.g:1482:1: rule__Field__Group__4__Impl : ( ( rule__Field__SelectionSetAssignment_4 )? ) ;
    public final void rule__Field__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:1486:1: ( ( ( rule__Field__SelectionSetAssignment_4 )? ) )
            // InternalGraphqlXtext.g:1487:1: ( ( rule__Field__SelectionSetAssignment_4 )? )
            {
            // InternalGraphqlXtext.g:1487:1: ( ( rule__Field__SelectionSetAssignment_4 )? )
            // InternalGraphqlXtext.g:1488:2: ( rule__Field__SelectionSetAssignment_4 )?
            {
             before(grammarAccess.getFieldAccess().getSelectionSetAssignment_4()); 
            // InternalGraphqlXtext.g:1489:2: ( rule__Field__SelectionSetAssignment_4 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==21) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalGraphqlXtext.g:1489:3: rule__Field__SelectionSetAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Field__SelectionSetAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFieldAccess().getSelectionSetAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__4__Impl"


    // $ANTLR start "rule__Alias__Group__0"
    // InternalGraphqlXtext.g:1498:1: rule__Alias__Group__0 : rule__Alias__Group__0__Impl rule__Alias__Group__1 ;
    public final void rule__Alias__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:1502:1: ( rule__Alias__Group__0__Impl rule__Alias__Group__1 )
            // InternalGraphqlXtext.g:1503:2: rule__Alias__Group__0__Impl rule__Alias__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Alias__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Alias__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alias__Group__0"


    // $ANTLR start "rule__Alias__Group__0__Impl"
    // InternalGraphqlXtext.g:1510:1: rule__Alias__Group__0__Impl : ( ( rule__Alias__NameAssignment_0 ) ) ;
    public final void rule__Alias__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:1514:1: ( ( ( rule__Alias__NameAssignment_0 ) ) )
            // InternalGraphqlXtext.g:1515:1: ( ( rule__Alias__NameAssignment_0 ) )
            {
            // InternalGraphqlXtext.g:1515:1: ( ( rule__Alias__NameAssignment_0 ) )
            // InternalGraphqlXtext.g:1516:2: ( rule__Alias__NameAssignment_0 )
            {
             before(grammarAccess.getAliasAccess().getNameAssignment_0()); 
            // InternalGraphqlXtext.g:1517:2: ( rule__Alias__NameAssignment_0 )
            // InternalGraphqlXtext.g:1517:3: rule__Alias__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Alias__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAliasAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alias__Group__0__Impl"


    // $ANTLR start "rule__Alias__Group__1"
    // InternalGraphqlXtext.g:1525:1: rule__Alias__Group__1 : rule__Alias__Group__1__Impl ;
    public final void rule__Alias__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:1529:1: ( rule__Alias__Group__1__Impl )
            // InternalGraphqlXtext.g:1530:2: rule__Alias__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Alias__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alias__Group__1"


    // $ANTLR start "rule__Alias__Group__1__Impl"
    // InternalGraphqlXtext.g:1536:1: rule__Alias__Group__1__Impl : ( ':' ) ;
    public final void rule__Alias__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:1540:1: ( ( ':' ) )
            // InternalGraphqlXtext.g:1541:1: ( ':' )
            {
            // InternalGraphqlXtext.g:1541:1: ( ':' )
            // InternalGraphqlXtext.g:1542:2: ':'
            {
             before(grammarAccess.getAliasAccess().getColonKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getAliasAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alias__Group__1__Impl"


    // $ANTLR start "rule__Arguments__Group__0"
    // InternalGraphqlXtext.g:1552:1: rule__Arguments__Group__0 : rule__Arguments__Group__0__Impl rule__Arguments__Group__1 ;
    public final void rule__Arguments__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:1556:1: ( rule__Arguments__Group__0__Impl rule__Arguments__Group__1 )
            // InternalGraphqlXtext.g:1557:2: rule__Arguments__Group__0__Impl rule__Arguments__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Arguments__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Arguments__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arguments__Group__0"


    // $ANTLR start "rule__Arguments__Group__0__Impl"
    // InternalGraphqlXtext.g:1564:1: rule__Arguments__Group__0__Impl : ( () ) ;
    public final void rule__Arguments__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:1568:1: ( ( () ) )
            // InternalGraphqlXtext.g:1569:1: ( () )
            {
            // InternalGraphqlXtext.g:1569:1: ( () )
            // InternalGraphqlXtext.g:1570:2: ()
            {
             before(grammarAccess.getArgumentsAccess().getArgumentsAction_0()); 
            // InternalGraphqlXtext.g:1571:2: ()
            // InternalGraphqlXtext.g:1571:3: 
            {
            }

             after(grammarAccess.getArgumentsAccess().getArgumentsAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arguments__Group__0__Impl"


    // $ANTLR start "rule__Arguments__Group__1"
    // InternalGraphqlXtext.g:1579:1: rule__Arguments__Group__1 : rule__Arguments__Group__1__Impl rule__Arguments__Group__2 ;
    public final void rule__Arguments__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:1583:1: ( rule__Arguments__Group__1__Impl rule__Arguments__Group__2 )
            // InternalGraphqlXtext.g:1584:2: rule__Arguments__Group__1__Impl rule__Arguments__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Arguments__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Arguments__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arguments__Group__1"


    // $ANTLR start "rule__Arguments__Group__1__Impl"
    // InternalGraphqlXtext.g:1591:1: rule__Arguments__Group__1__Impl : ( '(' ) ;
    public final void rule__Arguments__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:1595:1: ( ( '(' ) )
            // InternalGraphqlXtext.g:1596:1: ( '(' )
            {
            // InternalGraphqlXtext.g:1596:1: ( '(' )
            // InternalGraphqlXtext.g:1597:2: '('
            {
             before(grammarAccess.getArgumentsAccess().getLeftParenthesisKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getArgumentsAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arguments__Group__1__Impl"


    // $ANTLR start "rule__Arguments__Group__2"
    // InternalGraphqlXtext.g:1606:1: rule__Arguments__Group__2 : rule__Arguments__Group__2__Impl rule__Arguments__Group__3 ;
    public final void rule__Arguments__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:1610:1: ( rule__Arguments__Group__2__Impl rule__Arguments__Group__3 )
            // InternalGraphqlXtext.g:1611:2: rule__Arguments__Group__2__Impl rule__Arguments__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__Arguments__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Arguments__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arguments__Group__2"


    // $ANTLR start "rule__Arguments__Group__2__Impl"
    // InternalGraphqlXtext.g:1618:1: rule__Arguments__Group__2__Impl : ( ( rule__Arguments__ArgsAssignment_2 )* ) ;
    public final void rule__Arguments__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:1622:1: ( ( ( rule__Arguments__ArgsAssignment_2 )* ) )
            // InternalGraphqlXtext.g:1623:1: ( ( rule__Arguments__ArgsAssignment_2 )* )
            {
            // InternalGraphqlXtext.g:1623:1: ( ( rule__Arguments__ArgsAssignment_2 )* )
            // InternalGraphqlXtext.g:1624:2: ( rule__Arguments__ArgsAssignment_2 )*
            {
             before(grammarAccess.getArgumentsAccess().getArgsAssignment_2()); 
            // InternalGraphqlXtext.g:1625:2: ( rule__Arguments__ArgsAssignment_2 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_NAME) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalGraphqlXtext.g:1625:3: rule__Arguments__ArgsAssignment_2
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Arguments__ArgsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getArgumentsAccess().getArgsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arguments__Group__2__Impl"


    // $ANTLR start "rule__Arguments__Group__3"
    // InternalGraphqlXtext.g:1633:1: rule__Arguments__Group__3 : rule__Arguments__Group__3__Impl ;
    public final void rule__Arguments__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:1637:1: ( rule__Arguments__Group__3__Impl )
            // InternalGraphqlXtext.g:1638:2: rule__Arguments__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Arguments__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arguments__Group__3"


    // $ANTLR start "rule__Arguments__Group__3__Impl"
    // InternalGraphqlXtext.g:1644:1: rule__Arguments__Group__3__Impl : ( ')' ) ;
    public final void rule__Arguments__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:1648:1: ( ( ')' ) )
            // InternalGraphqlXtext.g:1649:1: ( ')' )
            {
            // InternalGraphqlXtext.g:1649:1: ( ')' )
            // InternalGraphqlXtext.g:1650:2: ')'
            {
             before(grammarAccess.getArgumentsAccess().getRightParenthesisKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getArgumentsAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arguments__Group__3__Impl"


    // $ANTLR start "rule__Argument__Group__0"
    // InternalGraphqlXtext.g:1660:1: rule__Argument__Group__0 : rule__Argument__Group__0__Impl rule__Argument__Group__1 ;
    public final void rule__Argument__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:1664:1: ( rule__Argument__Group__0__Impl rule__Argument__Group__1 )
            // InternalGraphqlXtext.g:1665:2: rule__Argument__Group__0__Impl rule__Argument__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Argument__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Argument__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__Group__0"


    // $ANTLR start "rule__Argument__Group__0__Impl"
    // InternalGraphqlXtext.g:1672:1: rule__Argument__Group__0__Impl : ( ( rule__Argument__NameAssignment_0 ) ) ;
    public final void rule__Argument__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:1676:1: ( ( ( rule__Argument__NameAssignment_0 ) ) )
            // InternalGraphqlXtext.g:1677:1: ( ( rule__Argument__NameAssignment_0 ) )
            {
            // InternalGraphqlXtext.g:1677:1: ( ( rule__Argument__NameAssignment_0 ) )
            // InternalGraphqlXtext.g:1678:2: ( rule__Argument__NameAssignment_0 )
            {
             before(grammarAccess.getArgumentAccess().getNameAssignment_0()); 
            // InternalGraphqlXtext.g:1679:2: ( rule__Argument__NameAssignment_0 )
            // InternalGraphqlXtext.g:1679:3: rule__Argument__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Argument__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getArgumentAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__Group__0__Impl"


    // $ANTLR start "rule__Argument__Group__1"
    // InternalGraphqlXtext.g:1687:1: rule__Argument__Group__1 : rule__Argument__Group__1__Impl rule__Argument__Group__2 ;
    public final void rule__Argument__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:1691:1: ( rule__Argument__Group__1__Impl rule__Argument__Group__2 )
            // InternalGraphqlXtext.g:1692:2: rule__Argument__Group__1__Impl rule__Argument__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__Argument__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Argument__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__Group__1"


    // $ANTLR start "rule__Argument__Group__1__Impl"
    // InternalGraphqlXtext.g:1699:1: rule__Argument__Group__1__Impl : ( ':' ) ;
    public final void rule__Argument__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:1703:1: ( ( ':' ) )
            // InternalGraphqlXtext.g:1704:1: ( ':' )
            {
            // InternalGraphqlXtext.g:1704:1: ( ':' )
            // InternalGraphqlXtext.g:1705:2: ':'
            {
             before(grammarAccess.getArgumentAccess().getColonKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getArgumentAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__Group__1__Impl"


    // $ANTLR start "rule__Argument__Group__2"
    // InternalGraphqlXtext.g:1714:1: rule__Argument__Group__2 : rule__Argument__Group__2__Impl ;
    public final void rule__Argument__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:1718:1: ( rule__Argument__Group__2__Impl )
            // InternalGraphqlXtext.g:1719:2: rule__Argument__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Argument__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__Group__2"


    // $ANTLR start "rule__Argument__Group__2__Impl"
    // InternalGraphqlXtext.g:1725:1: rule__Argument__Group__2__Impl : ( ( rule__Argument__ValueAssignment_2 ) ) ;
    public final void rule__Argument__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:1729:1: ( ( ( rule__Argument__ValueAssignment_2 ) ) )
            // InternalGraphqlXtext.g:1730:1: ( ( rule__Argument__ValueAssignment_2 ) )
            {
            // InternalGraphqlXtext.g:1730:1: ( ( rule__Argument__ValueAssignment_2 ) )
            // InternalGraphqlXtext.g:1731:2: ( rule__Argument__ValueAssignment_2 )
            {
             before(grammarAccess.getArgumentAccess().getValueAssignment_2()); 
            // InternalGraphqlXtext.g:1732:2: ( rule__Argument__ValueAssignment_2 )
            // InternalGraphqlXtext.g:1732:3: rule__Argument__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Argument__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getArgumentAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__Group__2__Impl"


    // $ANTLR start "rule__FragmentSpread__Group__0"
    // InternalGraphqlXtext.g:1741:1: rule__FragmentSpread__Group__0 : rule__FragmentSpread__Group__0__Impl rule__FragmentSpread__Group__1 ;
    public final void rule__FragmentSpread__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:1745:1: ( rule__FragmentSpread__Group__0__Impl rule__FragmentSpread__Group__1 )
            // InternalGraphqlXtext.g:1746:2: rule__FragmentSpread__Group__0__Impl rule__FragmentSpread__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__FragmentSpread__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FragmentSpread__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FragmentSpread__Group__0"


    // $ANTLR start "rule__FragmentSpread__Group__0__Impl"
    // InternalGraphqlXtext.g:1753:1: rule__FragmentSpread__Group__0__Impl : ( '...' ) ;
    public final void rule__FragmentSpread__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:1757:1: ( ( '...' ) )
            // InternalGraphqlXtext.g:1758:1: ( '...' )
            {
            // InternalGraphqlXtext.g:1758:1: ( '...' )
            // InternalGraphqlXtext.g:1759:2: '...'
            {
             before(grammarAccess.getFragmentSpreadAccess().getFullStopFullStopFullStopKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getFragmentSpreadAccess().getFullStopFullStopFullStopKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FragmentSpread__Group__0__Impl"


    // $ANTLR start "rule__FragmentSpread__Group__1"
    // InternalGraphqlXtext.g:1768:1: rule__FragmentSpread__Group__1 : rule__FragmentSpread__Group__1__Impl rule__FragmentSpread__Group__2 ;
    public final void rule__FragmentSpread__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:1772:1: ( rule__FragmentSpread__Group__1__Impl rule__FragmentSpread__Group__2 )
            // InternalGraphqlXtext.g:1773:2: rule__FragmentSpread__Group__1__Impl rule__FragmentSpread__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__FragmentSpread__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FragmentSpread__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FragmentSpread__Group__1"


    // $ANTLR start "rule__FragmentSpread__Group__1__Impl"
    // InternalGraphqlXtext.g:1780:1: rule__FragmentSpread__Group__1__Impl : ( ( rule__FragmentSpread__FragNameAssignment_1 ) ) ;
    public final void rule__FragmentSpread__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:1784:1: ( ( ( rule__FragmentSpread__FragNameAssignment_1 ) ) )
            // InternalGraphqlXtext.g:1785:1: ( ( rule__FragmentSpread__FragNameAssignment_1 ) )
            {
            // InternalGraphqlXtext.g:1785:1: ( ( rule__FragmentSpread__FragNameAssignment_1 ) )
            // InternalGraphqlXtext.g:1786:2: ( rule__FragmentSpread__FragNameAssignment_1 )
            {
             before(grammarAccess.getFragmentSpreadAccess().getFragNameAssignment_1()); 
            // InternalGraphqlXtext.g:1787:2: ( rule__FragmentSpread__FragNameAssignment_1 )
            // InternalGraphqlXtext.g:1787:3: rule__FragmentSpread__FragNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FragmentSpread__FragNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFragmentSpreadAccess().getFragNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FragmentSpread__Group__1__Impl"


    // $ANTLR start "rule__FragmentSpread__Group__2"
    // InternalGraphqlXtext.g:1795:1: rule__FragmentSpread__Group__2 : rule__FragmentSpread__Group__2__Impl ;
    public final void rule__FragmentSpread__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:1799:1: ( rule__FragmentSpread__Group__2__Impl )
            // InternalGraphqlXtext.g:1800:2: rule__FragmentSpread__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FragmentSpread__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FragmentSpread__Group__2"


    // $ANTLR start "rule__FragmentSpread__Group__2__Impl"
    // InternalGraphqlXtext.g:1806:1: rule__FragmentSpread__Group__2__Impl : ( ( rule__FragmentSpread__DirectivesAssignment_2 )* ) ;
    public final void rule__FragmentSpread__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:1810:1: ( ( ( rule__FragmentSpread__DirectivesAssignment_2 )* ) )
            // InternalGraphqlXtext.g:1811:1: ( ( rule__FragmentSpread__DirectivesAssignment_2 )* )
            {
            // InternalGraphqlXtext.g:1811:1: ( ( rule__FragmentSpread__DirectivesAssignment_2 )* )
            // InternalGraphqlXtext.g:1812:2: ( rule__FragmentSpread__DirectivesAssignment_2 )*
            {
             before(grammarAccess.getFragmentSpreadAccess().getDirectivesAssignment_2()); 
            // InternalGraphqlXtext.g:1813:2: ( rule__FragmentSpread__DirectivesAssignment_2 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==31) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalGraphqlXtext.g:1813:3: rule__FragmentSpread__DirectivesAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__FragmentSpread__DirectivesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getFragmentSpreadAccess().getDirectivesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FragmentSpread__Group__2__Impl"


    // $ANTLR start "rule__InlineFragment__Group__0"
    // InternalGraphqlXtext.g:1822:1: rule__InlineFragment__Group__0 : rule__InlineFragment__Group__0__Impl rule__InlineFragment__Group__1 ;
    public final void rule__InlineFragment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:1826:1: ( rule__InlineFragment__Group__0__Impl rule__InlineFragment__Group__1 )
            // InternalGraphqlXtext.g:1827:2: rule__InlineFragment__Group__0__Impl rule__InlineFragment__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__InlineFragment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InlineFragment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InlineFragment__Group__0"


    // $ANTLR start "rule__InlineFragment__Group__0__Impl"
    // InternalGraphqlXtext.g:1834:1: rule__InlineFragment__Group__0__Impl : ( () ) ;
    public final void rule__InlineFragment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:1838:1: ( ( () ) )
            // InternalGraphqlXtext.g:1839:1: ( () )
            {
            // InternalGraphqlXtext.g:1839:1: ( () )
            // InternalGraphqlXtext.g:1840:2: ()
            {
             before(grammarAccess.getInlineFragmentAccess().getInlineFragmentAction_0()); 
            // InternalGraphqlXtext.g:1841:2: ()
            // InternalGraphqlXtext.g:1841:3: 
            {
            }

             after(grammarAccess.getInlineFragmentAccess().getInlineFragmentAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InlineFragment__Group__0__Impl"


    // $ANTLR start "rule__InlineFragment__Group__1"
    // InternalGraphqlXtext.g:1849:1: rule__InlineFragment__Group__1 : rule__InlineFragment__Group__1__Impl rule__InlineFragment__Group__2 ;
    public final void rule__InlineFragment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:1853:1: ( rule__InlineFragment__Group__1__Impl rule__InlineFragment__Group__2 )
            // InternalGraphqlXtext.g:1854:2: rule__InlineFragment__Group__1__Impl rule__InlineFragment__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__InlineFragment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InlineFragment__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InlineFragment__Group__1"


    // $ANTLR start "rule__InlineFragment__Group__1__Impl"
    // InternalGraphqlXtext.g:1861:1: rule__InlineFragment__Group__1__Impl : ( '...' ) ;
    public final void rule__InlineFragment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:1865:1: ( ( '...' ) )
            // InternalGraphqlXtext.g:1866:1: ( '...' )
            {
            // InternalGraphqlXtext.g:1866:1: ( '...' )
            // InternalGraphqlXtext.g:1867:2: '...'
            {
             before(grammarAccess.getInlineFragmentAccess().getFullStopFullStopFullStopKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getInlineFragmentAccess().getFullStopFullStopFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InlineFragment__Group__1__Impl"


    // $ANTLR start "rule__InlineFragment__Group__2"
    // InternalGraphqlXtext.g:1876:1: rule__InlineFragment__Group__2 : rule__InlineFragment__Group__2__Impl rule__InlineFragment__Group__3 ;
    public final void rule__InlineFragment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:1880:1: ( rule__InlineFragment__Group__2__Impl rule__InlineFragment__Group__3 )
            // InternalGraphqlXtext.g:1881:2: rule__InlineFragment__Group__2__Impl rule__InlineFragment__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__InlineFragment__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InlineFragment__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InlineFragment__Group__2"


    // $ANTLR start "rule__InlineFragment__Group__2__Impl"
    // InternalGraphqlXtext.g:1888:1: rule__InlineFragment__Group__2__Impl : ( ( rule__InlineFragment__TypeConditionAssignment_2 )? ) ;
    public final void rule__InlineFragment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:1892:1: ( ( ( rule__InlineFragment__TypeConditionAssignment_2 )? ) )
            // InternalGraphqlXtext.g:1893:1: ( ( rule__InlineFragment__TypeConditionAssignment_2 )? )
            {
            // InternalGraphqlXtext.g:1893:1: ( ( rule__InlineFragment__TypeConditionAssignment_2 )? )
            // InternalGraphqlXtext.g:1894:2: ( rule__InlineFragment__TypeConditionAssignment_2 )?
            {
             before(grammarAccess.getInlineFragmentAccess().getTypeConditionAssignment_2()); 
            // InternalGraphqlXtext.g:1895:2: ( rule__InlineFragment__TypeConditionAssignment_2 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==26) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalGraphqlXtext.g:1895:3: rule__InlineFragment__TypeConditionAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__InlineFragment__TypeConditionAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInlineFragmentAccess().getTypeConditionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InlineFragment__Group__2__Impl"


    // $ANTLR start "rule__InlineFragment__Group__3"
    // InternalGraphqlXtext.g:1903:1: rule__InlineFragment__Group__3 : rule__InlineFragment__Group__3__Impl rule__InlineFragment__Group__4 ;
    public final void rule__InlineFragment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:1907:1: ( rule__InlineFragment__Group__3__Impl rule__InlineFragment__Group__4 )
            // InternalGraphqlXtext.g:1908:2: rule__InlineFragment__Group__3__Impl rule__InlineFragment__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__InlineFragment__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InlineFragment__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InlineFragment__Group__3"


    // $ANTLR start "rule__InlineFragment__Group__3__Impl"
    // InternalGraphqlXtext.g:1915:1: rule__InlineFragment__Group__3__Impl : ( ( rule__InlineFragment__DirectivesAssignment_3 )* ) ;
    public final void rule__InlineFragment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:1919:1: ( ( ( rule__InlineFragment__DirectivesAssignment_3 )* ) )
            // InternalGraphqlXtext.g:1920:1: ( ( rule__InlineFragment__DirectivesAssignment_3 )* )
            {
            // InternalGraphqlXtext.g:1920:1: ( ( rule__InlineFragment__DirectivesAssignment_3 )* )
            // InternalGraphqlXtext.g:1921:2: ( rule__InlineFragment__DirectivesAssignment_3 )*
            {
             before(grammarAccess.getInlineFragmentAccess().getDirectivesAssignment_3()); 
            // InternalGraphqlXtext.g:1922:2: ( rule__InlineFragment__DirectivesAssignment_3 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==31) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalGraphqlXtext.g:1922:3: rule__InlineFragment__DirectivesAssignment_3
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__InlineFragment__DirectivesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getInlineFragmentAccess().getDirectivesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InlineFragment__Group__3__Impl"


    // $ANTLR start "rule__InlineFragment__Group__4"
    // InternalGraphqlXtext.g:1930:1: rule__InlineFragment__Group__4 : rule__InlineFragment__Group__4__Impl ;
    public final void rule__InlineFragment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:1934:1: ( rule__InlineFragment__Group__4__Impl )
            // InternalGraphqlXtext.g:1935:2: rule__InlineFragment__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InlineFragment__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InlineFragment__Group__4"


    // $ANTLR start "rule__InlineFragment__Group__4__Impl"
    // InternalGraphqlXtext.g:1941:1: rule__InlineFragment__Group__4__Impl : ( ( rule__InlineFragment__SelectionSetAssignment_4 ) ) ;
    public final void rule__InlineFragment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:1945:1: ( ( ( rule__InlineFragment__SelectionSetAssignment_4 ) ) )
            // InternalGraphqlXtext.g:1946:1: ( ( rule__InlineFragment__SelectionSetAssignment_4 ) )
            {
            // InternalGraphqlXtext.g:1946:1: ( ( rule__InlineFragment__SelectionSetAssignment_4 ) )
            // InternalGraphqlXtext.g:1947:2: ( rule__InlineFragment__SelectionSetAssignment_4 )
            {
             before(grammarAccess.getInlineFragmentAccess().getSelectionSetAssignment_4()); 
            // InternalGraphqlXtext.g:1948:2: ( rule__InlineFragment__SelectionSetAssignment_4 )
            // InternalGraphqlXtext.g:1948:3: rule__InlineFragment__SelectionSetAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__InlineFragment__SelectionSetAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getInlineFragmentAccess().getSelectionSetAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InlineFragment__Group__4__Impl"


    // $ANTLR start "rule__FragmentDefinition__Group__0"
    // InternalGraphqlXtext.g:1957:1: rule__FragmentDefinition__Group__0 : rule__FragmentDefinition__Group__0__Impl rule__FragmentDefinition__Group__1 ;
    public final void rule__FragmentDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:1961:1: ( rule__FragmentDefinition__Group__0__Impl rule__FragmentDefinition__Group__1 )
            // InternalGraphqlXtext.g:1962:2: rule__FragmentDefinition__Group__0__Impl rule__FragmentDefinition__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__FragmentDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FragmentDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FragmentDefinition__Group__0"


    // $ANTLR start "rule__FragmentDefinition__Group__0__Impl"
    // InternalGraphqlXtext.g:1969:1: rule__FragmentDefinition__Group__0__Impl : ( 'fragment' ) ;
    public final void rule__FragmentDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:1973:1: ( ( 'fragment' ) )
            // InternalGraphqlXtext.g:1974:1: ( 'fragment' )
            {
            // InternalGraphqlXtext.g:1974:1: ( 'fragment' )
            // InternalGraphqlXtext.g:1975:2: 'fragment'
            {
             before(grammarAccess.getFragmentDefinitionAccess().getFragmentKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getFragmentDefinitionAccess().getFragmentKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FragmentDefinition__Group__0__Impl"


    // $ANTLR start "rule__FragmentDefinition__Group__1"
    // InternalGraphqlXtext.g:1984:1: rule__FragmentDefinition__Group__1 : rule__FragmentDefinition__Group__1__Impl rule__FragmentDefinition__Group__2 ;
    public final void rule__FragmentDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:1988:1: ( rule__FragmentDefinition__Group__1__Impl rule__FragmentDefinition__Group__2 )
            // InternalGraphqlXtext.g:1989:2: rule__FragmentDefinition__Group__1__Impl rule__FragmentDefinition__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__FragmentDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FragmentDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FragmentDefinition__Group__1"


    // $ANTLR start "rule__FragmentDefinition__Group__1__Impl"
    // InternalGraphqlXtext.g:1996:1: rule__FragmentDefinition__Group__1__Impl : ( ( rule__FragmentDefinition__FragNameAssignment_1 ) ) ;
    public final void rule__FragmentDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:2000:1: ( ( ( rule__FragmentDefinition__FragNameAssignment_1 ) ) )
            // InternalGraphqlXtext.g:2001:1: ( ( rule__FragmentDefinition__FragNameAssignment_1 ) )
            {
            // InternalGraphqlXtext.g:2001:1: ( ( rule__FragmentDefinition__FragNameAssignment_1 ) )
            // InternalGraphqlXtext.g:2002:2: ( rule__FragmentDefinition__FragNameAssignment_1 )
            {
             before(grammarAccess.getFragmentDefinitionAccess().getFragNameAssignment_1()); 
            // InternalGraphqlXtext.g:2003:2: ( rule__FragmentDefinition__FragNameAssignment_1 )
            // InternalGraphqlXtext.g:2003:3: rule__FragmentDefinition__FragNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FragmentDefinition__FragNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFragmentDefinitionAccess().getFragNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FragmentDefinition__Group__1__Impl"


    // $ANTLR start "rule__FragmentDefinition__Group__2"
    // InternalGraphqlXtext.g:2011:1: rule__FragmentDefinition__Group__2 : rule__FragmentDefinition__Group__2__Impl rule__FragmentDefinition__Group__3 ;
    public final void rule__FragmentDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:2015:1: ( rule__FragmentDefinition__Group__2__Impl rule__FragmentDefinition__Group__3 )
            // InternalGraphqlXtext.g:2016:2: rule__FragmentDefinition__Group__2__Impl rule__FragmentDefinition__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__FragmentDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FragmentDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FragmentDefinition__Group__2"


    // $ANTLR start "rule__FragmentDefinition__Group__2__Impl"
    // InternalGraphqlXtext.g:2023:1: rule__FragmentDefinition__Group__2__Impl : ( ( rule__FragmentDefinition__TypeConditionAssignment_2 )? ) ;
    public final void rule__FragmentDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:2027:1: ( ( ( rule__FragmentDefinition__TypeConditionAssignment_2 )? ) )
            // InternalGraphqlXtext.g:2028:1: ( ( rule__FragmentDefinition__TypeConditionAssignment_2 )? )
            {
            // InternalGraphqlXtext.g:2028:1: ( ( rule__FragmentDefinition__TypeConditionAssignment_2 )? )
            // InternalGraphqlXtext.g:2029:2: ( rule__FragmentDefinition__TypeConditionAssignment_2 )?
            {
             before(grammarAccess.getFragmentDefinitionAccess().getTypeConditionAssignment_2()); 
            // InternalGraphqlXtext.g:2030:2: ( rule__FragmentDefinition__TypeConditionAssignment_2 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==26) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalGraphqlXtext.g:2030:3: rule__FragmentDefinition__TypeConditionAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__FragmentDefinition__TypeConditionAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFragmentDefinitionAccess().getTypeConditionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FragmentDefinition__Group__2__Impl"


    // $ANTLR start "rule__FragmentDefinition__Group__3"
    // InternalGraphqlXtext.g:2038:1: rule__FragmentDefinition__Group__3 : rule__FragmentDefinition__Group__3__Impl rule__FragmentDefinition__Group__4 ;
    public final void rule__FragmentDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:2042:1: ( rule__FragmentDefinition__Group__3__Impl rule__FragmentDefinition__Group__4 )
            // InternalGraphqlXtext.g:2043:2: rule__FragmentDefinition__Group__3__Impl rule__FragmentDefinition__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__FragmentDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FragmentDefinition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FragmentDefinition__Group__3"


    // $ANTLR start "rule__FragmentDefinition__Group__3__Impl"
    // InternalGraphqlXtext.g:2050:1: rule__FragmentDefinition__Group__3__Impl : ( ( rule__FragmentDefinition__DirectivesAssignment_3 )* ) ;
    public final void rule__FragmentDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:2054:1: ( ( ( rule__FragmentDefinition__DirectivesAssignment_3 )* ) )
            // InternalGraphqlXtext.g:2055:1: ( ( rule__FragmentDefinition__DirectivesAssignment_3 )* )
            {
            // InternalGraphqlXtext.g:2055:1: ( ( rule__FragmentDefinition__DirectivesAssignment_3 )* )
            // InternalGraphqlXtext.g:2056:2: ( rule__FragmentDefinition__DirectivesAssignment_3 )*
            {
             before(grammarAccess.getFragmentDefinitionAccess().getDirectivesAssignment_3()); 
            // InternalGraphqlXtext.g:2057:2: ( rule__FragmentDefinition__DirectivesAssignment_3 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==31) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalGraphqlXtext.g:2057:3: rule__FragmentDefinition__DirectivesAssignment_3
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__FragmentDefinition__DirectivesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getFragmentDefinitionAccess().getDirectivesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FragmentDefinition__Group__3__Impl"


    // $ANTLR start "rule__FragmentDefinition__Group__4"
    // InternalGraphqlXtext.g:2065:1: rule__FragmentDefinition__Group__4 : rule__FragmentDefinition__Group__4__Impl ;
    public final void rule__FragmentDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:2069:1: ( rule__FragmentDefinition__Group__4__Impl )
            // InternalGraphqlXtext.g:2070:2: rule__FragmentDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FragmentDefinition__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FragmentDefinition__Group__4"


    // $ANTLR start "rule__FragmentDefinition__Group__4__Impl"
    // InternalGraphqlXtext.g:2076:1: rule__FragmentDefinition__Group__4__Impl : ( ( rule__FragmentDefinition__SelectionSetAssignment_4 ) ) ;
    public final void rule__FragmentDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:2080:1: ( ( ( rule__FragmentDefinition__SelectionSetAssignment_4 ) ) )
            // InternalGraphqlXtext.g:2081:1: ( ( rule__FragmentDefinition__SelectionSetAssignment_4 ) )
            {
            // InternalGraphqlXtext.g:2081:1: ( ( rule__FragmentDefinition__SelectionSetAssignment_4 ) )
            // InternalGraphqlXtext.g:2082:2: ( rule__FragmentDefinition__SelectionSetAssignment_4 )
            {
             before(grammarAccess.getFragmentDefinitionAccess().getSelectionSetAssignment_4()); 
            // InternalGraphqlXtext.g:2083:2: ( rule__FragmentDefinition__SelectionSetAssignment_4 )
            // InternalGraphqlXtext.g:2083:3: rule__FragmentDefinition__SelectionSetAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__FragmentDefinition__SelectionSetAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getFragmentDefinitionAccess().getSelectionSetAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FragmentDefinition__Group__4__Impl"


    // $ANTLR start "rule__TypeCondition__Group__0"
    // InternalGraphqlXtext.g:2092:1: rule__TypeCondition__Group__0 : rule__TypeCondition__Group__0__Impl rule__TypeCondition__Group__1 ;
    public final void rule__TypeCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:2096:1: ( rule__TypeCondition__Group__0__Impl rule__TypeCondition__Group__1 )
            // InternalGraphqlXtext.g:2097:2: rule__TypeCondition__Group__0__Impl rule__TypeCondition__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__TypeCondition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeCondition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeCondition__Group__0"


    // $ANTLR start "rule__TypeCondition__Group__0__Impl"
    // InternalGraphqlXtext.g:2104:1: rule__TypeCondition__Group__0__Impl : ( 'on' ) ;
    public final void rule__TypeCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:2108:1: ( ( 'on' ) )
            // InternalGraphqlXtext.g:2109:1: ( 'on' )
            {
            // InternalGraphqlXtext.g:2109:1: ( 'on' )
            // InternalGraphqlXtext.g:2110:2: 'on'
            {
             before(grammarAccess.getTypeConditionAccess().getOnKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getTypeConditionAccess().getOnKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeCondition__Group__0__Impl"


    // $ANTLR start "rule__TypeCondition__Group__1"
    // InternalGraphqlXtext.g:2119:1: rule__TypeCondition__Group__1 : rule__TypeCondition__Group__1__Impl ;
    public final void rule__TypeCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:2123:1: ( rule__TypeCondition__Group__1__Impl )
            // InternalGraphqlXtext.g:2124:2: rule__TypeCondition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypeCondition__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeCondition__Group__1"


    // $ANTLR start "rule__TypeCondition__Group__1__Impl"
    // InternalGraphqlXtext.g:2130:1: rule__TypeCondition__Group__1__Impl : ( ruleNamedType ) ;
    public final void rule__TypeCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:2134:1: ( ( ruleNamedType ) )
            // InternalGraphqlXtext.g:2135:1: ( ruleNamedType )
            {
            // InternalGraphqlXtext.g:2135:1: ( ruleNamedType )
            // InternalGraphqlXtext.g:2136:2: ruleNamedType
            {
             before(grammarAccess.getTypeConditionAccess().getNamedTypeParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleNamedType();

            state._fsp--;

             after(grammarAccess.getTypeConditionAccess().getNamedTypeParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeCondition__Group__1__Impl"


    // $ANTLR start "rule__ListValue__Group__0"
    // InternalGraphqlXtext.g:2146:1: rule__ListValue__Group__0 : rule__ListValue__Group__0__Impl rule__ListValue__Group__1 ;
    public final void rule__ListValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:2150:1: ( rule__ListValue__Group__0__Impl rule__ListValue__Group__1 )
            // InternalGraphqlXtext.g:2151:2: rule__ListValue__Group__0__Impl rule__ListValue__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__ListValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListValue__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListValue__Group__0"


    // $ANTLR start "rule__ListValue__Group__0__Impl"
    // InternalGraphqlXtext.g:2158:1: rule__ListValue__Group__0__Impl : ( () ) ;
    public final void rule__ListValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:2162:1: ( ( () ) )
            // InternalGraphqlXtext.g:2163:1: ( () )
            {
            // InternalGraphqlXtext.g:2163:1: ( () )
            // InternalGraphqlXtext.g:2164:2: ()
            {
             before(grammarAccess.getListValueAccess().getListValueAction_0()); 
            // InternalGraphqlXtext.g:2165:2: ()
            // InternalGraphqlXtext.g:2165:3: 
            {
            }

             after(grammarAccess.getListValueAccess().getListValueAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListValue__Group__0__Impl"


    // $ANTLR start "rule__ListValue__Group__1"
    // InternalGraphqlXtext.g:2173:1: rule__ListValue__Group__1 : rule__ListValue__Group__1__Impl rule__ListValue__Group__2 ;
    public final void rule__ListValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:2177:1: ( rule__ListValue__Group__1__Impl rule__ListValue__Group__2 )
            // InternalGraphqlXtext.g:2178:2: rule__ListValue__Group__1__Impl rule__ListValue__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__ListValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListValue__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListValue__Group__1"


    // $ANTLR start "rule__ListValue__Group__1__Impl"
    // InternalGraphqlXtext.g:2185:1: rule__ListValue__Group__1__Impl : ( '[' ) ;
    public final void rule__ListValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:2189:1: ( ( '[' ) )
            // InternalGraphqlXtext.g:2190:1: ( '[' )
            {
            // InternalGraphqlXtext.g:2190:1: ( '[' )
            // InternalGraphqlXtext.g:2191:2: '['
            {
             before(grammarAccess.getListValueAccess().getLeftSquareBracketKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getListValueAccess().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListValue__Group__1__Impl"


    // $ANTLR start "rule__ListValue__Group__2"
    // InternalGraphqlXtext.g:2200:1: rule__ListValue__Group__2 : rule__ListValue__Group__2__Impl rule__ListValue__Group__3 ;
    public final void rule__ListValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:2204:1: ( rule__ListValue__Group__2__Impl rule__ListValue__Group__3 )
            // InternalGraphqlXtext.g:2205:2: rule__ListValue__Group__2__Impl rule__ListValue__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__ListValue__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListValue__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListValue__Group__2"


    // $ANTLR start "rule__ListValue__Group__2__Impl"
    // InternalGraphqlXtext.g:2212:1: rule__ListValue__Group__2__Impl : ( ( rule__ListValue__ValuesAssignment_2 )* ) ;
    public final void rule__ListValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:2216:1: ( ( ( rule__ListValue__ValuesAssignment_2 )* ) )
            // InternalGraphqlXtext.g:2217:1: ( ( rule__ListValue__ValuesAssignment_2 )* )
            {
            // InternalGraphqlXtext.g:2217:1: ( ( rule__ListValue__ValuesAssignment_2 )* )
            // InternalGraphqlXtext.g:2218:2: ( rule__ListValue__ValuesAssignment_2 )*
            {
             before(grammarAccess.getListValueAccess().getValuesAssignment_2()); 
            // InternalGraphqlXtext.g:2219:2: ( rule__ListValue__ValuesAssignment_2 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=RULE_NAME && LA25_0<=RULE_NULLVALUE)||LA25_0==21||LA25_0==27||LA25_0==29) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalGraphqlXtext.g:2219:3: rule__ListValue__ValuesAssignment_2
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__ListValue__ValuesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getListValueAccess().getValuesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListValue__Group__2__Impl"


    // $ANTLR start "rule__ListValue__Group__3"
    // InternalGraphqlXtext.g:2227:1: rule__ListValue__Group__3 : rule__ListValue__Group__3__Impl ;
    public final void rule__ListValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:2231:1: ( rule__ListValue__Group__3__Impl )
            // InternalGraphqlXtext.g:2232:2: rule__ListValue__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListValue__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListValue__Group__3"


    // $ANTLR start "rule__ListValue__Group__3__Impl"
    // InternalGraphqlXtext.g:2238:1: rule__ListValue__Group__3__Impl : ( ']' ) ;
    public final void rule__ListValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:2242:1: ( ( ']' ) )
            // InternalGraphqlXtext.g:2243:1: ( ']' )
            {
            // InternalGraphqlXtext.g:2243:1: ( ']' )
            // InternalGraphqlXtext.g:2244:2: ']'
            {
             before(grammarAccess.getListValueAccess().getRightSquareBracketKeyword_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getListValueAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListValue__Group__3__Impl"


    // $ANTLR start "rule__ObjectValue__Group__0"
    // InternalGraphqlXtext.g:2254:1: rule__ObjectValue__Group__0 : rule__ObjectValue__Group__0__Impl rule__ObjectValue__Group__1 ;
    public final void rule__ObjectValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:2258:1: ( rule__ObjectValue__Group__0__Impl rule__ObjectValue__Group__1 )
            // InternalGraphqlXtext.g:2259:2: rule__ObjectValue__Group__0__Impl rule__ObjectValue__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__ObjectValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectValue__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectValue__Group__0"


    // $ANTLR start "rule__ObjectValue__Group__0__Impl"
    // InternalGraphqlXtext.g:2266:1: rule__ObjectValue__Group__0__Impl : ( () ) ;
    public final void rule__ObjectValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:2270:1: ( ( () ) )
            // InternalGraphqlXtext.g:2271:1: ( () )
            {
            // InternalGraphqlXtext.g:2271:1: ( () )
            // InternalGraphqlXtext.g:2272:2: ()
            {
             before(grammarAccess.getObjectValueAccess().getObjectValueAction_0()); 
            // InternalGraphqlXtext.g:2273:2: ()
            // InternalGraphqlXtext.g:2273:3: 
            {
            }

             after(grammarAccess.getObjectValueAccess().getObjectValueAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectValue__Group__0__Impl"


    // $ANTLR start "rule__ObjectValue__Group__1"
    // InternalGraphqlXtext.g:2281:1: rule__ObjectValue__Group__1 : rule__ObjectValue__Group__1__Impl rule__ObjectValue__Group__2 ;
    public final void rule__ObjectValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:2285:1: ( rule__ObjectValue__Group__1__Impl rule__ObjectValue__Group__2 )
            // InternalGraphqlXtext.g:2286:2: rule__ObjectValue__Group__1__Impl rule__ObjectValue__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__ObjectValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectValue__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectValue__Group__1"


    // $ANTLR start "rule__ObjectValue__Group__1__Impl"
    // InternalGraphqlXtext.g:2293:1: rule__ObjectValue__Group__1__Impl : ( '{' ) ;
    public final void rule__ObjectValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:2297:1: ( ( '{' ) )
            // InternalGraphqlXtext.g:2298:1: ( '{' )
            {
            // InternalGraphqlXtext.g:2298:1: ( '{' )
            // InternalGraphqlXtext.g:2299:2: '{'
            {
             before(grammarAccess.getObjectValueAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getObjectValueAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectValue__Group__1__Impl"


    // $ANTLR start "rule__ObjectValue__Group__2"
    // InternalGraphqlXtext.g:2308:1: rule__ObjectValue__Group__2 : rule__ObjectValue__Group__2__Impl rule__ObjectValue__Group__3 ;
    public final void rule__ObjectValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:2312:1: ( rule__ObjectValue__Group__2__Impl rule__ObjectValue__Group__3 )
            // InternalGraphqlXtext.g:2313:2: rule__ObjectValue__Group__2__Impl rule__ObjectValue__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__ObjectValue__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectValue__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectValue__Group__2"


    // $ANTLR start "rule__ObjectValue__Group__2__Impl"
    // InternalGraphqlXtext.g:2320:1: rule__ObjectValue__Group__2__Impl : ( ( rule__ObjectValue__FieldsAssignment_2 )* ) ;
    public final void rule__ObjectValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:2324:1: ( ( ( rule__ObjectValue__FieldsAssignment_2 )* ) )
            // InternalGraphqlXtext.g:2325:1: ( ( rule__ObjectValue__FieldsAssignment_2 )* )
            {
            // InternalGraphqlXtext.g:2325:1: ( ( rule__ObjectValue__FieldsAssignment_2 )* )
            // InternalGraphqlXtext.g:2326:2: ( rule__ObjectValue__FieldsAssignment_2 )*
            {
             before(grammarAccess.getObjectValueAccess().getFieldsAssignment_2()); 
            // InternalGraphqlXtext.g:2327:2: ( rule__ObjectValue__FieldsAssignment_2 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_NAME) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalGraphqlXtext.g:2327:3: rule__ObjectValue__FieldsAssignment_2
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__ObjectValue__FieldsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getObjectValueAccess().getFieldsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectValue__Group__2__Impl"


    // $ANTLR start "rule__ObjectValue__Group__3"
    // InternalGraphqlXtext.g:2335:1: rule__ObjectValue__Group__3 : rule__ObjectValue__Group__3__Impl ;
    public final void rule__ObjectValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:2339:1: ( rule__ObjectValue__Group__3__Impl )
            // InternalGraphqlXtext.g:2340:2: rule__ObjectValue__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ObjectValue__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectValue__Group__3"


    // $ANTLR start "rule__ObjectValue__Group__3__Impl"
    // InternalGraphqlXtext.g:2346:1: rule__ObjectValue__Group__3__Impl : ( '}' ) ;
    public final void rule__ObjectValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:2350:1: ( ( '}' ) )
            // InternalGraphqlXtext.g:2351:1: ( '}' )
            {
            // InternalGraphqlXtext.g:2351:1: ( '}' )
            // InternalGraphqlXtext.g:2352:2: '}'
            {
             before(grammarAccess.getObjectValueAccess().getRightCurlyBracketKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getObjectValueAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectValue__Group__3__Impl"


    // $ANTLR start "rule__ObjectField__Group__0"
    // InternalGraphqlXtext.g:2362:1: rule__ObjectField__Group__0 : rule__ObjectField__Group__0__Impl rule__ObjectField__Group__1 ;
    public final void rule__ObjectField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:2366:1: ( rule__ObjectField__Group__0__Impl rule__ObjectField__Group__1 )
            // InternalGraphqlXtext.g:2367:2: rule__ObjectField__Group__0__Impl rule__ObjectField__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__ObjectField__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectField__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectField__Group__0"


    // $ANTLR start "rule__ObjectField__Group__0__Impl"
    // InternalGraphqlXtext.g:2374:1: rule__ObjectField__Group__0__Impl : ( ( rule__ObjectField__NameAssignment_0 ) ) ;
    public final void rule__ObjectField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:2378:1: ( ( ( rule__ObjectField__NameAssignment_0 ) ) )
            // InternalGraphqlXtext.g:2379:1: ( ( rule__ObjectField__NameAssignment_0 ) )
            {
            // InternalGraphqlXtext.g:2379:1: ( ( rule__ObjectField__NameAssignment_0 ) )
            // InternalGraphqlXtext.g:2380:2: ( rule__ObjectField__NameAssignment_0 )
            {
             before(grammarAccess.getObjectFieldAccess().getNameAssignment_0()); 
            // InternalGraphqlXtext.g:2381:2: ( rule__ObjectField__NameAssignment_0 )
            // InternalGraphqlXtext.g:2381:3: rule__ObjectField__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ObjectField__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getObjectFieldAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectField__Group__0__Impl"


    // $ANTLR start "rule__ObjectField__Group__1"
    // InternalGraphqlXtext.g:2389:1: rule__ObjectField__Group__1 : rule__ObjectField__Group__1__Impl rule__ObjectField__Group__2 ;
    public final void rule__ObjectField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:2393:1: ( rule__ObjectField__Group__1__Impl rule__ObjectField__Group__2 )
            // InternalGraphqlXtext.g:2394:2: rule__ObjectField__Group__1__Impl rule__ObjectField__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__ObjectField__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectField__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectField__Group__1"


    // $ANTLR start "rule__ObjectField__Group__1__Impl"
    // InternalGraphqlXtext.g:2401:1: rule__ObjectField__Group__1__Impl : ( ':' ) ;
    public final void rule__ObjectField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:2405:1: ( ( ':' ) )
            // InternalGraphqlXtext.g:2406:1: ( ':' )
            {
            // InternalGraphqlXtext.g:2406:1: ( ':' )
            // InternalGraphqlXtext.g:2407:2: ':'
            {
             before(grammarAccess.getObjectFieldAccess().getColonKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getObjectFieldAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectField__Group__1__Impl"


    // $ANTLR start "rule__ObjectField__Group__2"
    // InternalGraphqlXtext.g:2416:1: rule__ObjectField__Group__2 : rule__ObjectField__Group__2__Impl ;
    public final void rule__ObjectField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:2420:1: ( rule__ObjectField__Group__2__Impl )
            // InternalGraphqlXtext.g:2421:2: rule__ObjectField__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ObjectField__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectField__Group__2"


    // $ANTLR start "rule__ObjectField__Group__2__Impl"
    // InternalGraphqlXtext.g:2427:1: rule__ObjectField__Group__2__Impl : ( ( rule__ObjectField__ValueAssignment_2 ) ) ;
    public final void rule__ObjectField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:2431:1: ( ( ( rule__ObjectField__ValueAssignment_2 ) ) )
            // InternalGraphqlXtext.g:2432:1: ( ( rule__ObjectField__ValueAssignment_2 ) )
            {
            // InternalGraphqlXtext.g:2432:1: ( ( rule__ObjectField__ValueAssignment_2 ) )
            // InternalGraphqlXtext.g:2433:2: ( rule__ObjectField__ValueAssignment_2 )
            {
             before(grammarAccess.getObjectFieldAccess().getValueAssignment_2()); 
            // InternalGraphqlXtext.g:2434:2: ( rule__ObjectField__ValueAssignment_2 )
            // InternalGraphqlXtext.g:2434:3: rule__ObjectField__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ObjectField__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getObjectFieldAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectField__Group__2__Impl"


    // $ANTLR start "rule__VariableDefinition__Group__0"
    // InternalGraphqlXtext.g:2443:1: rule__VariableDefinition__Group__0 : rule__VariableDefinition__Group__0__Impl rule__VariableDefinition__Group__1 ;
    public final void rule__VariableDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:2447:1: ( rule__VariableDefinition__Group__0__Impl rule__VariableDefinition__Group__1 )
            // InternalGraphqlXtext.g:2448:2: rule__VariableDefinition__Group__0__Impl rule__VariableDefinition__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__VariableDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDefinition__Group__0"


    // $ANTLR start "rule__VariableDefinition__Group__0__Impl"
    // InternalGraphqlXtext.g:2455:1: rule__VariableDefinition__Group__0__Impl : ( '$' ) ;
    public final void rule__VariableDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:2459:1: ( ( '$' ) )
            // InternalGraphqlXtext.g:2460:1: ( '$' )
            {
            // InternalGraphqlXtext.g:2460:1: ( '$' )
            // InternalGraphqlXtext.g:2461:2: '$'
            {
             before(grammarAccess.getVariableDefinitionAccess().getDollarSignKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getVariableDefinitionAccess().getDollarSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDefinition__Group__0__Impl"


    // $ANTLR start "rule__VariableDefinition__Group__1"
    // InternalGraphqlXtext.g:2470:1: rule__VariableDefinition__Group__1 : rule__VariableDefinition__Group__1__Impl rule__VariableDefinition__Group__2 ;
    public final void rule__VariableDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:2474:1: ( rule__VariableDefinition__Group__1__Impl rule__VariableDefinition__Group__2 )
            // InternalGraphqlXtext.g:2475:2: rule__VariableDefinition__Group__1__Impl rule__VariableDefinition__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__VariableDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDefinition__Group__1"


    // $ANTLR start "rule__VariableDefinition__Group__1__Impl"
    // InternalGraphqlXtext.g:2482:1: rule__VariableDefinition__Group__1__Impl : ( ( rule__VariableDefinition__NameAssignment_1 ) ) ;
    public final void rule__VariableDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:2486:1: ( ( ( rule__VariableDefinition__NameAssignment_1 ) ) )
            // InternalGraphqlXtext.g:2487:1: ( ( rule__VariableDefinition__NameAssignment_1 ) )
            {
            // InternalGraphqlXtext.g:2487:1: ( ( rule__VariableDefinition__NameAssignment_1 ) )
            // InternalGraphqlXtext.g:2488:2: ( rule__VariableDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getVariableDefinitionAccess().getNameAssignment_1()); 
            // InternalGraphqlXtext.g:2489:2: ( rule__VariableDefinition__NameAssignment_1 )
            // InternalGraphqlXtext.g:2489:3: rule__VariableDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__VariableDefinition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableDefinitionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDefinition__Group__1__Impl"


    // $ANTLR start "rule__VariableDefinition__Group__2"
    // InternalGraphqlXtext.g:2497:1: rule__VariableDefinition__Group__2 : rule__VariableDefinition__Group__2__Impl rule__VariableDefinition__Group__3 ;
    public final void rule__VariableDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:2501:1: ( rule__VariableDefinition__Group__2__Impl rule__VariableDefinition__Group__3 )
            // InternalGraphqlXtext.g:2502:2: rule__VariableDefinition__Group__2__Impl rule__VariableDefinition__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__VariableDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDefinition__Group__2"


    // $ANTLR start "rule__VariableDefinition__Group__2__Impl"
    // InternalGraphqlXtext.g:2509:1: rule__VariableDefinition__Group__2__Impl : ( ':' ) ;
    public final void rule__VariableDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:2513:1: ( ( ':' ) )
            // InternalGraphqlXtext.g:2514:1: ( ':' )
            {
            // InternalGraphqlXtext.g:2514:1: ( ':' )
            // InternalGraphqlXtext.g:2515:2: ':'
            {
             before(grammarAccess.getVariableDefinitionAccess().getColonKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getVariableDefinitionAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDefinition__Group__2__Impl"


    // $ANTLR start "rule__VariableDefinition__Group__3"
    // InternalGraphqlXtext.g:2524:1: rule__VariableDefinition__Group__3 : rule__VariableDefinition__Group__3__Impl rule__VariableDefinition__Group__4 ;
    public final void rule__VariableDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:2528:1: ( rule__VariableDefinition__Group__3__Impl rule__VariableDefinition__Group__4 )
            // InternalGraphqlXtext.g:2529:2: rule__VariableDefinition__Group__3__Impl rule__VariableDefinition__Group__4
            {
            pushFollow(FOLLOW_27);
            rule__VariableDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableDefinition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDefinition__Group__3"


    // $ANTLR start "rule__VariableDefinition__Group__3__Impl"
    // InternalGraphqlXtext.g:2536:1: rule__VariableDefinition__Group__3__Impl : ( ( rule__VariableDefinition__TypeAssignment_3 ) ) ;
    public final void rule__VariableDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:2540:1: ( ( ( rule__VariableDefinition__TypeAssignment_3 ) ) )
            // InternalGraphqlXtext.g:2541:1: ( ( rule__VariableDefinition__TypeAssignment_3 ) )
            {
            // InternalGraphqlXtext.g:2541:1: ( ( rule__VariableDefinition__TypeAssignment_3 ) )
            // InternalGraphqlXtext.g:2542:2: ( rule__VariableDefinition__TypeAssignment_3 )
            {
             before(grammarAccess.getVariableDefinitionAccess().getTypeAssignment_3()); 
            // InternalGraphqlXtext.g:2543:2: ( rule__VariableDefinition__TypeAssignment_3 )
            // InternalGraphqlXtext.g:2543:3: rule__VariableDefinition__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__VariableDefinition__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getVariableDefinitionAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDefinition__Group__3__Impl"


    // $ANTLR start "rule__VariableDefinition__Group__4"
    // InternalGraphqlXtext.g:2551:1: rule__VariableDefinition__Group__4 : rule__VariableDefinition__Group__4__Impl ;
    public final void rule__VariableDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:2555:1: ( rule__VariableDefinition__Group__4__Impl )
            // InternalGraphqlXtext.g:2556:2: rule__VariableDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VariableDefinition__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDefinition__Group__4"


    // $ANTLR start "rule__VariableDefinition__Group__4__Impl"
    // InternalGraphqlXtext.g:2562:1: rule__VariableDefinition__Group__4__Impl : ( ( rule__VariableDefinition__DefValueAssignment_4 )? ) ;
    public final void rule__VariableDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:2566:1: ( ( ( rule__VariableDefinition__DefValueAssignment_4 )? ) )
            // InternalGraphqlXtext.g:2567:1: ( ( rule__VariableDefinition__DefValueAssignment_4 )? )
            {
            // InternalGraphqlXtext.g:2567:1: ( ( rule__VariableDefinition__DefValueAssignment_4 )? )
            // InternalGraphqlXtext.g:2568:2: ( rule__VariableDefinition__DefValueAssignment_4 )?
            {
             before(grammarAccess.getVariableDefinitionAccess().getDefValueAssignment_4()); 
            // InternalGraphqlXtext.g:2569:2: ( rule__VariableDefinition__DefValueAssignment_4 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==30) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalGraphqlXtext.g:2569:3: rule__VariableDefinition__DefValueAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__VariableDefinition__DefValueAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVariableDefinitionAccess().getDefValueAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDefinition__Group__4__Impl"


    // $ANTLR start "rule__Variable__Group__0"
    // InternalGraphqlXtext.g:2578:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:2582:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // InternalGraphqlXtext.g:2583:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Variable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__0"


    // $ANTLR start "rule__Variable__Group__0__Impl"
    // InternalGraphqlXtext.g:2590:1: rule__Variable__Group__0__Impl : ( '$' ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:2594:1: ( ( '$' ) )
            // InternalGraphqlXtext.g:2595:1: ( '$' )
            {
            // InternalGraphqlXtext.g:2595:1: ( '$' )
            // InternalGraphqlXtext.g:2596:2: '$'
            {
             before(grammarAccess.getVariableAccess().getDollarSignKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getDollarSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__0__Impl"


    // $ANTLR start "rule__Variable__Group__1"
    // InternalGraphqlXtext.g:2605:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:2609:1: ( rule__Variable__Group__1__Impl )
            // InternalGraphqlXtext.g:2610:2: rule__Variable__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__1"


    // $ANTLR start "rule__Variable__Group__1__Impl"
    // InternalGraphqlXtext.g:2616:1: rule__Variable__Group__1__Impl : ( RULE_NAME ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:2620:1: ( ( RULE_NAME ) )
            // InternalGraphqlXtext.g:2621:1: ( RULE_NAME )
            {
            // InternalGraphqlXtext.g:2621:1: ( RULE_NAME )
            // InternalGraphqlXtext.g:2622:2: RULE_NAME
            {
             before(grammarAccess.getVariableAccess().getNAMETerminalRuleCall_1()); 
            match(input,RULE_NAME,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getNAMETerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__1__Impl"


    // $ANTLR start "rule__DefaultValue__Group__0"
    // InternalGraphqlXtext.g:2632:1: rule__DefaultValue__Group__0 : rule__DefaultValue__Group__0__Impl rule__DefaultValue__Group__1 ;
    public final void rule__DefaultValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:2636:1: ( rule__DefaultValue__Group__0__Impl rule__DefaultValue__Group__1 )
            // InternalGraphqlXtext.g:2637:2: rule__DefaultValue__Group__0__Impl rule__DefaultValue__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__DefaultValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefaultValue__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultValue__Group__0"


    // $ANTLR start "rule__DefaultValue__Group__0__Impl"
    // InternalGraphqlXtext.g:2644:1: rule__DefaultValue__Group__0__Impl : ( '=' ) ;
    public final void rule__DefaultValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:2648:1: ( ( '=' ) )
            // InternalGraphqlXtext.g:2649:1: ( '=' )
            {
            // InternalGraphqlXtext.g:2649:1: ( '=' )
            // InternalGraphqlXtext.g:2650:2: '='
            {
             before(grammarAccess.getDefaultValueAccess().getEqualsSignKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getDefaultValueAccess().getEqualsSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultValue__Group__0__Impl"


    // $ANTLR start "rule__DefaultValue__Group__1"
    // InternalGraphqlXtext.g:2659:1: rule__DefaultValue__Group__1 : rule__DefaultValue__Group__1__Impl ;
    public final void rule__DefaultValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:2663:1: ( rule__DefaultValue__Group__1__Impl )
            // InternalGraphqlXtext.g:2664:2: rule__DefaultValue__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DefaultValue__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultValue__Group__1"


    // $ANTLR start "rule__DefaultValue__Group__1__Impl"
    // InternalGraphqlXtext.g:2670:1: rule__DefaultValue__Group__1__Impl : ( ruleValue ) ;
    public final void rule__DefaultValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:2674:1: ( ( ruleValue ) )
            // InternalGraphqlXtext.g:2675:1: ( ruleValue )
            {
            // InternalGraphqlXtext.g:2675:1: ( ruleValue )
            // InternalGraphqlXtext.g:2676:2: ruleValue
            {
             before(grammarAccess.getDefaultValueAccess().getValueParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getDefaultValueAccess().getValueParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultValue__Group__1__Impl"


    // $ANTLR start "rule__Type__Group_0__0"
    // InternalGraphqlXtext.g:2686:1: rule__Type__Group_0__0 : rule__Type__Group_0__0__Impl rule__Type__Group_0__1 ;
    public final void rule__Type__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:2690:1: ( rule__Type__Group_0__0__Impl rule__Type__Group_0__1 )
            // InternalGraphqlXtext.g:2691:2: rule__Type__Group_0__0__Impl rule__Type__Group_0__1
            {
            pushFollow(FOLLOW_28);
            rule__Type__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_0__0"


    // $ANTLR start "rule__Type__Group_0__0__Impl"
    // InternalGraphqlXtext.g:2698:1: rule__Type__Group_0__0__Impl : ( ( rule__Type__NameAssignment_0_0 ) ) ;
    public final void rule__Type__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:2702:1: ( ( ( rule__Type__NameAssignment_0_0 ) ) )
            // InternalGraphqlXtext.g:2703:1: ( ( rule__Type__NameAssignment_0_0 ) )
            {
            // InternalGraphqlXtext.g:2703:1: ( ( rule__Type__NameAssignment_0_0 ) )
            // InternalGraphqlXtext.g:2704:2: ( rule__Type__NameAssignment_0_0 )
            {
             before(grammarAccess.getTypeAccess().getNameAssignment_0_0()); 
            // InternalGraphqlXtext.g:2705:2: ( rule__Type__NameAssignment_0_0 )
            // InternalGraphqlXtext.g:2705:3: rule__Type__NameAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Type__NameAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getNameAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_0__0__Impl"


    // $ANTLR start "rule__Type__Group_0__1"
    // InternalGraphqlXtext.g:2713:1: rule__Type__Group_0__1 : rule__Type__Group_0__1__Impl ;
    public final void rule__Type__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:2717:1: ( rule__Type__Group_0__1__Impl )
            // InternalGraphqlXtext.g:2718:2: rule__Type__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_0__1"


    // $ANTLR start "rule__Type__Group_0__1__Impl"
    // InternalGraphqlXtext.g:2724:1: rule__Type__Group_0__1__Impl : ( ( rule__Type__NotNullAssignment_0_1 )? ) ;
    public final void rule__Type__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:2728:1: ( ( ( rule__Type__NotNullAssignment_0_1 )? ) )
            // InternalGraphqlXtext.g:2729:1: ( ( rule__Type__NotNullAssignment_0_1 )? )
            {
            // InternalGraphqlXtext.g:2729:1: ( ( rule__Type__NotNullAssignment_0_1 )? )
            // InternalGraphqlXtext.g:2730:2: ( rule__Type__NotNullAssignment_0_1 )?
            {
             before(grammarAccess.getTypeAccess().getNotNullAssignment_0_1()); 
            // InternalGraphqlXtext.g:2731:2: ( rule__Type__NotNullAssignment_0_1 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==32) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalGraphqlXtext.g:2731:3: rule__Type__NotNullAssignment_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__NotNullAssignment_0_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTypeAccess().getNotNullAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_0__1__Impl"


    // $ANTLR start "rule__Type__Group_1__0"
    // InternalGraphqlXtext.g:2740:1: rule__Type__Group_1__0 : rule__Type__Group_1__0__Impl rule__Type__Group_1__1 ;
    public final void rule__Type__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:2744:1: ( rule__Type__Group_1__0__Impl rule__Type__Group_1__1 )
            // InternalGraphqlXtext.g:2745:2: rule__Type__Group_1__0__Impl rule__Type__Group_1__1
            {
            pushFollow(FOLLOW_28);
            rule__Type__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_1__0"


    // $ANTLR start "rule__Type__Group_1__0__Impl"
    // InternalGraphqlXtext.g:2752:1: rule__Type__Group_1__0__Impl : ( ( rule__Type__ListAssignment_1_0 ) ) ;
    public final void rule__Type__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:2756:1: ( ( ( rule__Type__ListAssignment_1_0 ) ) )
            // InternalGraphqlXtext.g:2757:1: ( ( rule__Type__ListAssignment_1_0 ) )
            {
            // InternalGraphqlXtext.g:2757:1: ( ( rule__Type__ListAssignment_1_0 ) )
            // InternalGraphqlXtext.g:2758:2: ( rule__Type__ListAssignment_1_0 )
            {
             before(grammarAccess.getTypeAccess().getListAssignment_1_0()); 
            // InternalGraphqlXtext.g:2759:2: ( rule__Type__ListAssignment_1_0 )
            // InternalGraphqlXtext.g:2759:3: rule__Type__ListAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Type__ListAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getListAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_1__0__Impl"


    // $ANTLR start "rule__Type__Group_1__1"
    // InternalGraphqlXtext.g:2767:1: rule__Type__Group_1__1 : rule__Type__Group_1__1__Impl ;
    public final void rule__Type__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:2771:1: ( rule__Type__Group_1__1__Impl )
            // InternalGraphqlXtext.g:2772:2: rule__Type__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_1__1"


    // $ANTLR start "rule__Type__Group_1__1__Impl"
    // InternalGraphqlXtext.g:2778:1: rule__Type__Group_1__1__Impl : ( ( rule__Type__NotNullAssignment_1_1 )? ) ;
    public final void rule__Type__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:2782:1: ( ( ( rule__Type__NotNullAssignment_1_1 )? ) )
            // InternalGraphqlXtext.g:2783:1: ( ( rule__Type__NotNullAssignment_1_1 )? )
            {
            // InternalGraphqlXtext.g:2783:1: ( ( rule__Type__NotNullAssignment_1_1 )? )
            // InternalGraphqlXtext.g:2784:2: ( rule__Type__NotNullAssignment_1_1 )?
            {
             before(grammarAccess.getTypeAccess().getNotNullAssignment_1_1()); 
            // InternalGraphqlXtext.g:2785:2: ( rule__Type__NotNullAssignment_1_1 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==32) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalGraphqlXtext.g:2785:3: rule__Type__NotNullAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__NotNullAssignment_1_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTypeAccess().getNotNullAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_1__1__Impl"


    // $ANTLR start "rule__ListType__Group__0"
    // InternalGraphqlXtext.g:2794:1: rule__ListType__Group__0 : rule__ListType__Group__0__Impl rule__ListType__Group__1 ;
    public final void rule__ListType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:2798:1: ( rule__ListType__Group__0__Impl rule__ListType__Group__1 )
            // InternalGraphqlXtext.g:2799:2: rule__ListType__Group__0__Impl rule__ListType__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__ListType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListType__Group__0"


    // $ANTLR start "rule__ListType__Group__0__Impl"
    // InternalGraphqlXtext.g:2806:1: rule__ListType__Group__0__Impl : ( '[' ) ;
    public final void rule__ListType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:2810:1: ( ( '[' ) )
            // InternalGraphqlXtext.g:2811:1: ( '[' )
            {
            // InternalGraphqlXtext.g:2811:1: ( '[' )
            // InternalGraphqlXtext.g:2812:2: '['
            {
             before(grammarAccess.getListTypeAccess().getLeftSquareBracketKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getListTypeAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListType__Group__0__Impl"


    // $ANTLR start "rule__ListType__Group__1"
    // InternalGraphqlXtext.g:2821:1: rule__ListType__Group__1 : rule__ListType__Group__1__Impl rule__ListType__Group__2 ;
    public final void rule__ListType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:2825:1: ( rule__ListType__Group__1__Impl rule__ListType__Group__2 )
            // InternalGraphqlXtext.g:2826:2: rule__ListType__Group__1__Impl rule__ListType__Group__2
            {
            pushFollow(FOLLOW_29);
            rule__ListType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListType__Group__1"


    // $ANTLR start "rule__ListType__Group__1__Impl"
    // InternalGraphqlXtext.g:2833:1: rule__ListType__Group__1__Impl : ( ( rule__ListType__TypeAssignment_1 ) ) ;
    public final void rule__ListType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:2837:1: ( ( ( rule__ListType__TypeAssignment_1 ) ) )
            // InternalGraphqlXtext.g:2838:1: ( ( rule__ListType__TypeAssignment_1 ) )
            {
            // InternalGraphqlXtext.g:2838:1: ( ( rule__ListType__TypeAssignment_1 ) )
            // InternalGraphqlXtext.g:2839:2: ( rule__ListType__TypeAssignment_1 )
            {
             before(grammarAccess.getListTypeAccess().getTypeAssignment_1()); 
            // InternalGraphqlXtext.g:2840:2: ( rule__ListType__TypeAssignment_1 )
            // InternalGraphqlXtext.g:2840:3: rule__ListType__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ListType__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getListTypeAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListType__Group__1__Impl"


    // $ANTLR start "rule__ListType__Group__2"
    // InternalGraphqlXtext.g:2848:1: rule__ListType__Group__2 : rule__ListType__Group__2__Impl ;
    public final void rule__ListType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:2852:1: ( rule__ListType__Group__2__Impl )
            // InternalGraphqlXtext.g:2853:2: rule__ListType__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListType__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListType__Group__2"


    // $ANTLR start "rule__ListType__Group__2__Impl"
    // InternalGraphqlXtext.g:2859:1: rule__ListType__Group__2__Impl : ( ']' ) ;
    public final void rule__ListType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:2863:1: ( ( ']' ) )
            // InternalGraphqlXtext.g:2864:1: ( ']' )
            {
            // InternalGraphqlXtext.g:2864:1: ( ']' )
            // InternalGraphqlXtext.g:2865:2: ']'
            {
             before(grammarAccess.getListTypeAccess().getRightSquareBracketKeyword_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getListTypeAccess().getRightSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListType__Group__2__Impl"


    // $ANTLR start "rule__Directive__Group__0"
    // InternalGraphqlXtext.g:2875:1: rule__Directive__Group__0 : rule__Directive__Group__0__Impl rule__Directive__Group__1 ;
    public final void rule__Directive__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:2879:1: ( rule__Directive__Group__0__Impl rule__Directive__Group__1 )
            // InternalGraphqlXtext.g:2880:2: rule__Directive__Group__0__Impl rule__Directive__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Directive__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Directive__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Directive__Group__0"


    // $ANTLR start "rule__Directive__Group__0__Impl"
    // InternalGraphqlXtext.g:2887:1: rule__Directive__Group__0__Impl : ( '@' ) ;
    public final void rule__Directive__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:2891:1: ( ( '@' ) )
            // InternalGraphqlXtext.g:2892:1: ( '@' )
            {
            // InternalGraphqlXtext.g:2892:1: ( '@' )
            // InternalGraphqlXtext.g:2893:2: '@'
            {
             before(grammarAccess.getDirectiveAccess().getCommercialAtKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getDirectiveAccess().getCommercialAtKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Directive__Group__0__Impl"


    // $ANTLR start "rule__Directive__Group__1"
    // InternalGraphqlXtext.g:2902:1: rule__Directive__Group__1 : rule__Directive__Group__1__Impl rule__Directive__Group__2 ;
    public final void rule__Directive__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:2906:1: ( rule__Directive__Group__1__Impl rule__Directive__Group__2 )
            // InternalGraphqlXtext.g:2907:2: rule__Directive__Group__1__Impl rule__Directive__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Directive__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Directive__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Directive__Group__1"


    // $ANTLR start "rule__Directive__Group__1__Impl"
    // InternalGraphqlXtext.g:2914:1: rule__Directive__Group__1__Impl : ( ( rule__Directive__NameAssignment_1 ) ) ;
    public final void rule__Directive__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:2918:1: ( ( ( rule__Directive__NameAssignment_1 ) ) )
            // InternalGraphqlXtext.g:2919:1: ( ( rule__Directive__NameAssignment_1 ) )
            {
            // InternalGraphqlXtext.g:2919:1: ( ( rule__Directive__NameAssignment_1 ) )
            // InternalGraphqlXtext.g:2920:2: ( rule__Directive__NameAssignment_1 )
            {
             before(grammarAccess.getDirectiveAccess().getNameAssignment_1()); 
            // InternalGraphqlXtext.g:2921:2: ( rule__Directive__NameAssignment_1 )
            // InternalGraphqlXtext.g:2921:3: rule__Directive__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Directive__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDirectiveAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Directive__Group__1__Impl"


    // $ANTLR start "rule__Directive__Group__2"
    // InternalGraphqlXtext.g:2929:1: rule__Directive__Group__2 : rule__Directive__Group__2__Impl ;
    public final void rule__Directive__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:2933:1: ( rule__Directive__Group__2__Impl )
            // InternalGraphqlXtext.g:2934:2: rule__Directive__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Directive__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Directive__Group__2"


    // $ANTLR start "rule__Directive__Group__2__Impl"
    // InternalGraphqlXtext.g:2940:1: rule__Directive__Group__2__Impl : ( ( rule__Directive__ArgsAssignment_2 )* ) ;
    public final void rule__Directive__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:2944:1: ( ( ( rule__Directive__ArgsAssignment_2 )* ) )
            // InternalGraphqlXtext.g:2945:1: ( ( rule__Directive__ArgsAssignment_2 )* )
            {
            // InternalGraphqlXtext.g:2945:1: ( ( rule__Directive__ArgsAssignment_2 )* )
            // InternalGraphqlXtext.g:2946:2: ( rule__Directive__ArgsAssignment_2 )*
            {
             before(grammarAccess.getDirectiveAccess().getArgsAssignment_2()); 
            // InternalGraphqlXtext.g:2947:2: ( rule__Directive__ArgsAssignment_2 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==19) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalGraphqlXtext.g:2947:3: rule__Directive__ArgsAssignment_2
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__Directive__ArgsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getDirectiveAccess().getArgsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Directive__Group__2__Impl"


    // $ANTLR start "rule__Document__DefsAssignment"
    // InternalGraphqlXtext.g:2956:1: rule__Document__DefsAssignment : ( ruleDefinition ) ;
    public final void rule__Document__DefsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:2960:1: ( ( ruleDefinition ) )
            // InternalGraphqlXtext.g:2961:2: ( ruleDefinition )
            {
            // InternalGraphqlXtext.g:2961:2: ( ruleDefinition )
            // InternalGraphqlXtext.g:2962:3: ruleDefinition
            {
             before(grammarAccess.getDocumentAccess().getDefsDefinitionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleDefinition();

            state._fsp--;

             after(grammarAccess.getDocumentAccess().getDefsDefinitionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Document__DefsAssignment"


    // $ANTLR start "rule__OperationDefinition__SelectionAssignment_0"
    // InternalGraphqlXtext.g:2971:1: rule__OperationDefinition__SelectionAssignment_0 : ( ruleSelectionSet ) ;
    public final void rule__OperationDefinition__SelectionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:2975:1: ( ( ruleSelectionSet ) )
            // InternalGraphqlXtext.g:2976:2: ( ruleSelectionSet )
            {
            // InternalGraphqlXtext.g:2976:2: ( ruleSelectionSet )
            // InternalGraphqlXtext.g:2977:3: ruleSelectionSet
            {
             before(grammarAccess.getOperationDefinitionAccess().getSelectionSelectionSetParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSelectionSet();

            state._fsp--;

             after(grammarAccess.getOperationDefinitionAccess().getSelectionSelectionSetParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDefinition__SelectionAssignment_0"


    // $ANTLR start "rule__OperationDefinition__OpTypeAssignment_1_0"
    // InternalGraphqlXtext.g:2986:1: rule__OperationDefinition__OpTypeAssignment_1_0 : ( ruleOperationType ) ;
    public final void rule__OperationDefinition__OpTypeAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:2990:1: ( ( ruleOperationType ) )
            // InternalGraphqlXtext.g:2991:2: ( ruleOperationType )
            {
            // InternalGraphqlXtext.g:2991:2: ( ruleOperationType )
            // InternalGraphqlXtext.g:2992:3: ruleOperationType
            {
             before(grammarAccess.getOperationDefinitionAccess().getOpTypeOperationTypeParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleOperationType();

            state._fsp--;

             after(grammarAccess.getOperationDefinitionAccess().getOpTypeOperationTypeParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDefinition__OpTypeAssignment_1_0"


    // $ANTLR start "rule__OperationDefinition__NameAssignment_1_1"
    // InternalGraphqlXtext.g:3001:1: rule__OperationDefinition__NameAssignment_1_1 : ( RULE_NAME ) ;
    public final void rule__OperationDefinition__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:3005:1: ( ( RULE_NAME ) )
            // InternalGraphqlXtext.g:3006:2: ( RULE_NAME )
            {
            // InternalGraphqlXtext.g:3006:2: ( RULE_NAME )
            // InternalGraphqlXtext.g:3007:3: RULE_NAME
            {
             before(grammarAccess.getOperationDefinitionAccess().getNameNAMETerminalRuleCall_1_1_0()); 
            match(input,RULE_NAME,FOLLOW_2); 
             after(grammarAccess.getOperationDefinitionAccess().getNameNAMETerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDefinition__NameAssignment_1_1"


    // $ANTLR start "rule__OperationDefinition__VarDefinitionsAssignment_1_2_1"
    // InternalGraphqlXtext.g:3016:1: rule__OperationDefinition__VarDefinitionsAssignment_1_2_1 : ( ruleVariableDefinition ) ;
    public final void rule__OperationDefinition__VarDefinitionsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:3020:1: ( ( ruleVariableDefinition ) )
            // InternalGraphqlXtext.g:3021:2: ( ruleVariableDefinition )
            {
            // InternalGraphqlXtext.g:3021:2: ( ruleVariableDefinition )
            // InternalGraphqlXtext.g:3022:3: ruleVariableDefinition
            {
             before(grammarAccess.getOperationDefinitionAccess().getVarDefinitionsVariableDefinitionParserRuleCall_1_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVariableDefinition();

            state._fsp--;

             after(grammarAccess.getOperationDefinitionAccess().getVarDefinitionsVariableDefinitionParserRuleCall_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDefinition__VarDefinitionsAssignment_1_2_1"


    // $ANTLR start "rule__OperationDefinition__DirectivesAssignment_1_3"
    // InternalGraphqlXtext.g:3031:1: rule__OperationDefinition__DirectivesAssignment_1_3 : ( ruleDirective ) ;
    public final void rule__OperationDefinition__DirectivesAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:3035:1: ( ( ruleDirective ) )
            // InternalGraphqlXtext.g:3036:2: ( ruleDirective )
            {
            // InternalGraphqlXtext.g:3036:2: ( ruleDirective )
            // InternalGraphqlXtext.g:3037:3: ruleDirective
            {
             before(grammarAccess.getOperationDefinitionAccess().getDirectivesDirectiveParserRuleCall_1_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDirective();

            state._fsp--;

             after(grammarAccess.getOperationDefinitionAccess().getDirectivesDirectiveParserRuleCall_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDefinition__DirectivesAssignment_1_3"


    // $ANTLR start "rule__OperationDefinition__SelectionSetAssignment_1_4"
    // InternalGraphqlXtext.g:3046:1: rule__OperationDefinition__SelectionSetAssignment_1_4 : ( ruleSelectionSet ) ;
    public final void rule__OperationDefinition__SelectionSetAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:3050:1: ( ( ruleSelectionSet ) )
            // InternalGraphqlXtext.g:3051:2: ( ruleSelectionSet )
            {
            // InternalGraphqlXtext.g:3051:2: ( ruleSelectionSet )
            // InternalGraphqlXtext.g:3052:3: ruleSelectionSet
            {
             before(grammarAccess.getOperationDefinitionAccess().getSelectionSetSelectionSetParserRuleCall_1_4_0()); 
            pushFollow(FOLLOW_2);
            ruleSelectionSet();

            state._fsp--;

             after(grammarAccess.getOperationDefinitionAccess().getSelectionSetSelectionSetParserRuleCall_1_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDefinition__SelectionSetAssignment_1_4"


    // $ANTLR start "rule__SelectionSet__SelectionsAssignment_2"
    // InternalGraphqlXtext.g:3061:1: rule__SelectionSet__SelectionsAssignment_2 : ( ruleSelection ) ;
    public final void rule__SelectionSet__SelectionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:3065:1: ( ( ruleSelection ) )
            // InternalGraphqlXtext.g:3066:2: ( ruleSelection )
            {
            // InternalGraphqlXtext.g:3066:2: ( ruleSelection )
            // InternalGraphqlXtext.g:3067:3: ruleSelection
            {
             before(grammarAccess.getSelectionSetAccess().getSelectionsSelectionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSelection();

            state._fsp--;

             after(grammarAccess.getSelectionSetAccess().getSelectionsSelectionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionSet__SelectionsAssignment_2"


    // $ANTLR start "rule__Field__AliasAssignment_0"
    // InternalGraphqlXtext.g:3076:1: rule__Field__AliasAssignment_0 : ( ruleAlias ) ;
    public final void rule__Field__AliasAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:3080:1: ( ( ruleAlias ) )
            // InternalGraphqlXtext.g:3081:2: ( ruleAlias )
            {
            // InternalGraphqlXtext.g:3081:2: ( ruleAlias )
            // InternalGraphqlXtext.g:3082:3: ruleAlias
            {
             before(grammarAccess.getFieldAccess().getAliasAliasParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAlias();

            state._fsp--;

             after(grammarAccess.getFieldAccess().getAliasAliasParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__AliasAssignment_0"


    // $ANTLR start "rule__Field__NameAssignment_1"
    // InternalGraphqlXtext.g:3091:1: rule__Field__NameAssignment_1 : ( RULE_NAME ) ;
    public final void rule__Field__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:3095:1: ( ( RULE_NAME ) )
            // InternalGraphqlXtext.g:3096:2: ( RULE_NAME )
            {
            // InternalGraphqlXtext.g:3096:2: ( RULE_NAME )
            // InternalGraphqlXtext.g:3097:3: RULE_NAME
            {
             before(grammarAccess.getFieldAccess().getNameNAMETerminalRuleCall_1_0()); 
            match(input,RULE_NAME,FOLLOW_2); 
             after(grammarAccess.getFieldAccess().getNameNAMETerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__NameAssignment_1"


    // $ANTLR start "rule__Field__ArgsAssignment_2"
    // InternalGraphqlXtext.g:3106:1: rule__Field__ArgsAssignment_2 : ( ruleArguments ) ;
    public final void rule__Field__ArgsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:3110:1: ( ( ruleArguments ) )
            // InternalGraphqlXtext.g:3111:2: ( ruleArguments )
            {
            // InternalGraphqlXtext.g:3111:2: ( ruleArguments )
            // InternalGraphqlXtext.g:3112:3: ruleArguments
            {
             before(grammarAccess.getFieldAccess().getArgsArgumentsParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleArguments();

            state._fsp--;

             after(grammarAccess.getFieldAccess().getArgsArgumentsParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__ArgsAssignment_2"


    // $ANTLR start "rule__Field__DirectivesAssignment_3"
    // InternalGraphqlXtext.g:3121:1: rule__Field__DirectivesAssignment_3 : ( ruleDirective ) ;
    public final void rule__Field__DirectivesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:3125:1: ( ( ruleDirective ) )
            // InternalGraphqlXtext.g:3126:2: ( ruleDirective )
            {
            // InternalGraphqlXtext.g:3126:2: ( ruleDirective )
            // InternalGraphqlXtext.g:3127:3: ruleDirective
            {
             before(grammarAccess.getFieldAccess().getDirectivesDirectiveParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDirective();

            state._fsp--;

             after(grammarAccess.getFieldAccess().getDirectivesDirectiveParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__DirectivesAssignment_3"


    // $ANTLR start "rule__Field__SelectionSetAssignment_4"
    // InternalGraphqlXtext.g:3136:1: rule__Field__SelectionSetAssignment_4 : ( ruleSelectionSet ) ;
    public final void rule__Field__SelectionSetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:3140:1: ( ( ruleSelectionSet ) )
            // InternalGraphqlXtext.g:3141:2: ( ruleSelectionSet )
            {
            // InternalGraphqlXtext.g:3141:2: ( ruleSelectionSet )
            // InternalGraphqlXtext.g:3142:3: ruleSelectionSet
            {
             before(grammarAccess.getFieldAccess().getSelectionSetSelectionSetParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleSelectionSet();

            state._fsp--;

             after(grammarAccess.getFieldAccess().getSelectionSetSelectionSetParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__SelectionSetAssignment_4"


    // $ANTLR start "rule__Alias__NameAssignment_0"
    // InternalGraphqlXtext.g:3151:1: rule__Alias__NameAssignment_0 : ( RULE_NAME ) ;
    public final void rule__Alias__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:3155:1: ( ( RULE_NAME ) )
            // InternalGraphqlXtext.g:3156:2: ( RULE_NAME )
            {
            // InternalGraphqlXtext.g:3156:2: ( RULE_NAME )
            // InternalGraphqlXtext.g:3157:3: RULE_NAME
            {
             before(grammarAccess.getAliasAccess().getNameNAMETerminalRuleCall_0_0()); 
            match(input,RULE_NAME,FOLLOW_2); 
             after(grammarAccess.getAliasAccess().getNameNAMETerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alias__NameAssignment_0"


    // $ANTLR start "rule__Arguments__ArgsAssignment_2"
    // InternalGraphqlXtext.g:3166:1: rule__Arguments__ArgsAssignment_2 : ( ruleArgument ) ;
    public final void rule__Arguments__ArgsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:3170:1: ( ( ruleArgument ) )
            // InternalGraphqlXtext.g:3171:2: ( ruleArgument )
            {
            // InternalGraphqlXtext.g:3171:2: ( ruleArgument )
            // InternalGraphqlXtext.g:3172:3: ruleArgument
            {
             before(grammarAccess.getArgumentsAccess().getArgsArgumentParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleArgument();

            state._fsp--;

             after(grammarAccess.getArgumentsAccess().getArgsArgumentParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arguments__ArgsAssignment_2"


    // $ANTLR start "rule__Argument__NameAssignment_0"
    // InternalGraphqlXtext.g:3181:1: rule__Argument__NameAssignment_0 : ( RULE_NAME ) ;
    public final void rule__Argument__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:3185:1: ( ( RULE_NAME ) )
            // InternalGraphqlXtext.g:3186:2: ( RULE_NAME )
            {
            // InternalGraphqlXtext.g:3186:2: ( RULE_NAME )
            // InternalGraphqlXtext.g:3187:3: RULE_NAME
            {
             before(grammarAccess.getArgumentAccess().getNameNAMETerminalRuleCall_0_0()); 
            match(input,RULE_NAME,FOLLOW_2); 
             after(grammarAccess.getArgumentAccess().getNameNAMETerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__NameAssignment_0"


    // $ANTLR start "rule__Argument__ValueAssignment_2"
    // InternalGraphqlXtext.g:3196:1: rule__Argument__ValueAssignment_2 : ( ruleValue ) ;
    public final void rule__Argument__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:3200:1: ( ( ruleValue ) )
            // InternalGraphqlXtext.g:3201:2: ( ruleValue )
            {
            // InternalGraphqlXtext.g:3201:2: ( ruleValue )
            // InternalGraphqlXtext.g:3202:3: ruleValue
            {
             before(grammarAccess.getArgumentAccess().getValueValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getArgumentAccess().getValueValueParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__ValueAssignment_2"


    // $ANTLR start "rule__FragmentSpread__FragNameAssignment_1"
    // InternalGraphqlXtext.g:3211:1: rule__FragmentSpread__FragNameAssignment_1 : ( ruleFragmentName ) ;
    public final void rule__FragmentSpread__FragNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:3215:1: ( ( ruleFragmentName ) )
            // InternalGraphqlXtext.g:3216:2: ( ruleFragmentName )
            {
            // InternalGraphqlXtext.g:3216:2: ( ruleFragmentName )
            // InternalGraphqlXtext.g:3217:3: ruleFragmentName
            {
             before(grammarAccess.getFragmentSpreadAccess().getFragNameFragmentNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFragmentName();

            state._fsp--;

             after(grammarAccess.getFragmentSpreadAccess().getFragNameFragmentNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FragmentSpread__FragNameAssignment_1"


    // $ANTLR start "rule__FragmentSpread__DirectivesAssignment_2"
    // InternalGraphqlXtext.g:3226:1: rule__FragmentSpread__DirectivesAssignment_2 : ( ruleDirective ) ;
    public final void rule__FragmentSpread__DirectivesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:3230:1: ( ( ruleDirective ) )
            // InternalGraphqlXtext.g:3231:2: ( ruleDirective )
            {
            // InternalGraphqlXtext.g:3231:2: ( ruleDirective )
            // InternalGraphqlXtext.g:3232:3: ruleDirective
            {
             before(grammarAccess.getFragmentSpreadAccess().getDirectivesDirectiveParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDirective();

            state._fsp--;

             after(grammarAccess.getFragmentSpreadAccess().getDirectivesDirectiveParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FragmentSpread__DirectivesAssignment_2"


    // $ANTLR start "rule__InlineFragment__TypeConditionAssignment_2"
    // InternalGraphqlXtext.g:3241:1: rule__InlineFragment__TypeConditionAssignment_2 : ( ruleTypeCondition ) ;
    public final void rule__InlineFragment__TypeConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:3245:1: ( ( ruleTypeCondition ) )
            // InternalGraphqlXtext.g:3246:2: ( ruleTypeCondition )
            {
            // InternalGraphqlXtext.g:3246:2: ( ruleTypeCondition )
            // InternalGraphqlXtext.g:3247:3: ruleTypeCondition
            {
             before(grammarAccess.getInlineFragmentAccess().getTypeConditionTypeConditionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeCondition();

            state._fsp--;

             after(grammarAccess.getInlineFragmentAccess().getTypeConditionTypeConditionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InlineFragment__TypeConditionAssignment_2"


    // $ANTLR start "rule__InlineFragment__DirectivesAssignment_3"
    // InternalGraphqlXtext.g:3256:1: rule__InlineFragment__DirectivesAssignment_3 : ( ruleDirective ) ;
    public final void rule__InlineFragment__DirectivesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:3260:1: ( ( ruleDirective ) )
            // InternalGraphqlXtext.g:3261:2: ( ruleDirective )
            {
            // InternalGraphqlXtext.g:3261:2: ( ruleDirective )
            // InternalGraphqlXtext.g:3262:3: ruleDirective
            {
             before(grammarAccess.getInlineFragmentAccess().getDirectivesDirectiveParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDirective();

            state._fsp--;

             after(grammarAccess.getInlineFragmentAccess().getDirectivesDirectiveParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InlineFragment__DirectivesAssignment_3"


    // $ANTLR start "rule__InlineFragment__SelectionSetAssignment_4"
    // InternalGraphqlXtext.g:3271:1: rule__InlineFragment__SelectionSetAssignment_4 : ( ruleSelectionSet ) ;
    public final void rule__InlineFragment__SelectionSetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:3275:1: ( ( ruleSelectionSet ) )
            // InternalGraphqlXtext.g:3276:2: ( ruleSelectionSet )
            {
            // InternalGraphqlXtext.g:3276:2: ( ruleSelectionSet )
            // InternalGraphqlXtext.g:3277:3: ruleSelectionSet
            {
             before(grammarAccess.getInlineFragmentAccess().getSelectionSetSelectionSetParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleSelectionSet();

            state._fsp--;

             after(grammarAccess.getInlineFragmentAccess().getSelectionSetSelectionSetParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InlineFragment__SelectionSetAssignment_4"


    // $ANTLR start "rule__FragmentDefinition__FragNameAssignment_1"
    // InternalGraphqlXtext.g:3286:1: rule__FragmentDefinition__FragNameAssignment_1 : ( ruleFragmentName ) ;
    public final void rule__FragmentDefinition__FragNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:3290:1: ( ( ruleFragmentName ) )
            // InternalGraphqlXtext.g:3291:2: ( ruleFragmentName )
            {
            // InternalGraphqlXtext.g:3291:2: ( ruleFragmentName )
            // InternalGraphqlXtext.g:3292:3: ruleFragmentName
            {
             before(grammarAccess.getFragmentDefinitionAccess().getFragNameFragmentNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFragmentName();

            state._fsp--;

             after(grammarAccess.getFragmentDefinitionAccess().getFragNameFragmentNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FragmentDefinition__FragNameAssignment_1"


    // $ANTLR start "rule__FragmentDefinition__TypeConditionAssignment_2"
    // InternalGraphqlXtext.g:3301:1: rule__FragmentDefinition__TypeConditionAssignment_2 : ( ruleTypeCondition ) ;
    public final void rule__FragmentDefinition__TypeConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:3305:1: ( ( ruleTypeCondition ) )
            // InternalGraphqlXtext.g:3306:2: ( ruleTypeCondition )
            {
            // InternalGraphqlXtext.g:3306:2: ( ruleTypeCondition )
            // InternalGraphqlXtext.g:3307:3: ruleTypeCondition
            {
             before(grammarAccess.getFragmentDefinitionAccess().getTypeConditionTypeConditionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeCondition();

            state._fsp--;

             after(grammarAccess.getFragmentDefinitionAccess().getTypeConditionTypeConditionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FragmentDefinition__TypeConditionAssignment_2"


    // $ANTLR start "rule__FragmentDefinition__DirectivesAssignment_3"
    // InternalGraphqlXtext.g:3316:1: rule__FragmentDefinition__DirectivesAssignment_3 : ( ruleDirective ) ;
    public final void rule__FragmentDefinition__DirectivesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:3320:1: ( ( ruleDirective ) )
            // InternalGraphqlXtext.g:3321:2: ( ruleDirective )
            {
            // InternalGraphqlXtext.g:3321:2: ( ruleDirective )
            // InternalGraphqlXtext.g:3322:3: ruleDirective
            {
             before(grammarAccess.getFragmentDefinitionAccess().getDirectivesDirectiveParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDirective();

            state._fsp--;

             after(grammarAccess.getFragmentDefinitionAccess().getDirectivesDirectiveParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FragmentDefinition__DirectivesAssignment_3"


    // $ANTLR start "rule__FragmentDefinition__SelectionSetAssignment_4"
    // InternalGraphqlXtext.g:3331:1: rule__FragmentDefinition__SelectionSetAssignment_4 : ( ruleSelectionSet ) ;
    public final void rule__FragmentDefinition__SelectionSetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:3335:1: ( ( ruleSelectionSet ) )
            // InternalGraphqlXtext.g:3336:2: ( ruleSelectionSet )
            {
            // InternalGraphqlXtext.g:3336:2: ( ruleSelectionSet )
            // InternalGraphqlXtext.g:3337:3: ruleSelectionSet
            {
             before(grammarAccess.getFragmentDefinitionAccess().getSelectionSetSelectionSetParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleSelectionSet();

            state._fsp--;

             after(grammarAccess.getFragmentDefinitionAccess().getSelectionSetSelectionSetParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FragmentDefinition__SelectionSetAssignment_4"


    // $ANTLR start "rule__SingleValue__ValueAssignment_0"
    // InternalGraphqlXtext.g:3346:1: rule__SingleValue__ValueAssignment_0 : ( ruleVariable ) ;
    public final void rule__SingleValue__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:3350:1: ( ( ruleVariable ) )
            // InternalGraphqlXtext.g:3351:2: ( ruleVariable )
            {
            // InternalGraphqlXtext.g:3351:2: ( ruleVariable )
            // InternalGraphqlXtext.g:3352:3: ruleVariable
            {
             before(grammarAccess.getSingleValueAccess().getValueVariableParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getSingleValueAccess().getValueVariableParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleValue__ValueAssignment_0"


    // $ANTLR start "rule__SingleValue__ValueAssignment_1"
    // InternalGraphqlXtext.g:3361:1: rule__SingleValue__ValueAssignment_1 : ( ruleIntValue ) ;
    public final void rule__SingleValue__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:3365:1: ( ( ruleIntValue ) )
            // InternalGraphqlXtext.g:3366:2: ( ruleIntValue )
            {
            // InternalGraphqlXtext.g:3366:2: ( ruleIntValue )
            // InternalGraphqlXtext.g:3367:3: ruleIntValue
            {
             before(grammarAccess.getSingleValueAccess().getValueIntValueParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleIntValue();

            state._fsp--;

             after(grammarAccess.getSingleValueAccess().getValueIntValueParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleValue__ValueAssignment_1"


    // $ANTLR start "rule__SingleValue__ValueAssignment_2"
    // InternalGraphqlXtext.g:3376:1: rule__SingleValue__ValueAssignment_2 : ( ruleStringValue ) ;
    public final void rule__SingleValue__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:3380:1: ( ( ruleStringValue ) )
            // InternalGraphqlXtext.g:3381:2: ( ruleStringValue )
            {
            // InternalGraphqlXtext.g:3381:2: ( ruleStringValue )
            // InternalGraphqlXtext.g:3382:3: ruleStringValue
            {
             before(grammarAccess.getSingleValueAccess().getValueStringValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleStringValue();

            state._fsp--;

             after(grammarAccess.getSingleValueAccess().getValueStringValueParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleValue__ValueAssignment_2"


    // $ANTLR start "rule__SingleValue__ValueAssignment_3"
    // InternalGraphqlXtext.g:3391:1: rule__SingleValue__ValueAssignment_3 : ( RULE_BOOLEANVALUE ) ;
    public final void rule__SingleValue__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:3395:1: ( ( RULE_BOOLEANVALUE ) )
            // InternalGraphqlXtext.g:3396:2: ( RULE_BOOLEANVALUE )
            {
            // InternalGraphqlXtext.g:3396:2: ( RULE_BOOLEANVALUE )
            // InternalGraphqlXtext.g:3397:3: RULE_BOOLEANVALUE
            {
             before(grammarAccess.getSingleValueAccess().getValueBOOLEANVALUETerminalRuleCall_3_0()); 
            match(input,RULE_BOOLEANVALUE,FOLLOW_2); 
             after(grammarAccess.getSingleValueAccess().getValueBOOLEANVALUETerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleValue__ValueAssignment_3"


    // $ANTLR start "rule__SingleValue__ValueAssignment_4"
    // InternalGraphqlXtext.g:3406:1: rule__SingleValue__ValueAssignment_4 : ( RULE_NULLVALUE ) ;
    public final void rule__SingleValue__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:3410:1: ( ( RULE_NULLVALUE ) )
            // InternalGraphqlXtext.g:3411:2: ( RULE_NULLVALUE )
            {
            // InternalGraphqlXtext.g:3411:2: ( RULE_NULLVALUE )
            // InternalGraphqlXtext.g:3412:3: RULE_NULLVALUE
            {
             before(grammarAccess.getSingleValueAccess().getValueNULLVALUETerminalRuleCall_4_0()); 
            match(input,RULE_NULLVALUE,FOLLOW_2); 
             after(grammarAccess.getSingleValueAccess().getValueNULLVALUETerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleValue__ValueAssignment_4"


    // $ANTLR start "rule__SingleValue__ValueAssignment_5"
    // InternalGraphqlXtext.g:3421:1: rule__SingleValue__ValueAssignment_5 : ( ruleEnumValue ) ;
    public final void rule__SingleValue__ValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:3425:1: ( ( ruleEnumValue ) )
            // InternalGraphqlXtext.g:3426:2: ( ruleEnumValue )
            {
            // InternalGraphqlXtext.g:3426:2: ( ruleEnumValue )
            // InternalGraphqlXtext.g:3427:3: ruleEnumValue
            {
             before(grammarAccess.getSingleValueAccess().getValueEnumValueParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEnumValue();

            state._fsp--;

             after(grammarAccess.getSingleValueAccess().getValueEnumValueParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleValue__ValueAssignment_5"


    // $ANTLR start "rule__ComplexValue__ValueAssignment_0"
    // InternalGraphqlXtext.g:3436:1: rule__ComplexValue__ValueAssignment_0 : ( ruleListValue ) ;
    public final void rule__ComplexValue__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:3440:1: ( ( ruleListValue ) )
            // InternalGraphqlXtext.g:3441:2: ( ruleListValue )
            {
            // InternalGraphqlXtext.g:3441:2: ( ruleListValue )
            // InternalGraphqlXtext.g:3442:3: ruleListValue
            {
             before(grammarAccess.getComplexValueAccess().getValueListValueParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleListValue();

            state._fsp--;

             after(grammarAccess.getComplexValueAccess().getValueListValueParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexValue__ValueAssignment_0"


    // $ANTLR start "rule__ComplexValue__ValueAssignment_1"
    // InternalGraphqlXtext.g:3451:1: rule__ComplexValue__ValueAssignment_1 : ( ruleObjectValue ) ;
    public final void rule__ComplexValue__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:3455:1: ( ( ruleObjectValue ) )
            // InternalGraphqlXtext.g:3456:2: ( ruleObjectValue )
            {
            // InternalGraphqlXtext.g:3456:2: ( ruleObjectValue )
            // InternalGraphqlXtext.g:3457:3: ruleObjectValue
            {
             before(grammarAccess.getComplexValueAccess().getValueObjectValueParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleObjectValue();

            state._fsp--;

             after(grammarAccess.getComplexValueAccess().getValueObjectValueParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexValue__ValueAssignment_1"


    // $ANTLR start "rule__ListValue__ValuesAssignment_2"
    // InternalGraphqlXtext.g:3466:1: rule__ListValue__ValuesAssignment_2 : ( ruleValue ) ;
    public final void rule__ListValue__ValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:3470:1: ( ( ruleValue ) )
            // InternalGraphqlXtext.g:3471:2: ( ruleValue )
            {
            // InternalGraphqlXtext.g:3471:2: ( ruleValue )
            // InternalGraphqlXtext.g:3472:3: ruleValue
            {
             before(grammarAccess.getListValueAccess().getValuesValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getListValueAccess().getValuesValueParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListValue__ValuesAssignment_2"


    // $ANTLR start "rule__ObjectValue__FieldsAssignment_2"
    // InternalGraphqlXtext.g:3481:1: rule__ObjectValue__FieldsAssignment_2 : ( ruleObjectField ) ;
    public final void rule__ObjectValue__FieldsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:3485:1: ( ( ruleObjectField ) )
            // InternalGraphqlXtext.g:3486:2: ( ruleObjectField )
            {
            // InternalGraphqlXtext.g:3486:2: ( ruleObjectField )
            // InternalGraphqlXtext.g:3487:3: ruleObjectField
            {
             before(grammarAccess.getObjectValueAccess().getFieldsObjectFieldParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleObjectField();

            state._fsp--;

             after(grammarAccess.getObjectValueAccess().getFieldsObjectFieldParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectValue__FieldsAssignment_2"


    // $ANTLR start "rule__ObjectField__NameAssignment_0"
    // InternalGraphqlXtext.g:3496:1: rule__ObjectField__NameAssignment_0 : ( RULE_NAME ) ;
    public final void rule__ObjectField__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:3500:1: ( ( RULE_NAME ) )
            // InternalGraphqlXtext.g:3501:2: ( RULE_NAME )
            {
            // InternalGraphqlXtext.g:3501:2: ( RULE_NAME )
            // InternalGraphqlXtext.g:3502:3: RULE_NAME
            {
             before(grammarAccess.getObjectFieldAccess().getNameNAMETerminalRuleCall_0_0()); 
            match(input,RULE_NAME,FOLLOW_2); 
             after(grammarAccess.getObjectFieldAccess().getNameNAMETerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectField__NameAssignment_0"


    // $ANTLR start "rule__ObjectField__ValueAssignment_2"
    // InternalGraphqlXtext.g:3511:1: rule__ObjectField__ValueAssignment_2 : ( ruleValue ) ;
    public final void rule__ObjectField__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:3515:1: ( ( ruleValue ) )
            // InternalGraphqlXtext.g:3516:2: ( ruleValue )
            {
            // InternalGraphqlXtext.g:3516:2: ( ruleValue )
            // InternalGraphqlXtext.g:3517:3: ruleValue
            {
             before(grammarAccess.getObjectFieldAccess().getValueValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getObjectFieldAccess().getValueValueParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectField__ValueAssignment_2"


    // $ANTLR start "rule__VariableDefinition__NameAssignment_1"
    // InternalGraphqlXtext.g:3526:1: rule__VariableDefinition__NameAssignment_1 : ( RULE_NAME ) ;
    public final void rule__VariableDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:3530:1: ( ( RULE_NAME ) )
            // InternalGraphqlXtext.g:3531:2: ( RULE_NAME )
            {
            // InternalGraphqlXtext.g:3531:2: ( RULE_NAME )
            // InternalGraphqlXtext.g:3532:3: RULE_NAME
            {
             before(grammarAccess.getVariableDefinitionAccess().getNameNAMETerminalRuleCall_1_0()); 
            match(input,RULE_NAME,FOLLOW_2); 
             after(grammarAccess.getVariableDefinitionAccess().getNameNAMETerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDefinition__NameAssignment_1"


    // $ANTLR start "rule__VariableDefinition__TypeAssignment_3"
    // InternalGraphqlXtext.g:3541:1: rule__VariableDefinition__TypeAssignment_3 : ( ruleType ) ;
    public final void rule__VariableDefinition__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:3545:1: ( ( ruleType ) )
            // InternalGraphqlXtext.g:3546:2: ( ruleType )
            {
            // InternalGraphqlXtext.g:3546:2: ( ruleType )
            // InternalGraphqlXtext.g:3547:3: ruleType
            {
             before(grammarAccess.getVariableDefinitionAccess().getTypeTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getVariableDefinitionAccess().getTypeTypeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDefinition__TypeAssignment_3"


    // $ANTLR start "rule__VariableDefinition__DefValueAssignment_4"
    // InternalGraphqlXtext.g:3556:1: rule__VariableDefinition__DefValueAssignment_4 : ( ruleDefaultValue ) ;
    public final void rule__VariableDefinition__DefValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:3560:1: ( ( ruleDefaultValue ) )
            // InternalGraphqlXtext.g:3561:2: ( ruleDefaultValue )
            {
            // InternalGraphqlXtext.g:3561:2: ( ruleDefaultValue )
            // InternalGraphqlXtext.g:3562:3: ruleDefaultValue
            {
             before(grammarAccess.getVariableDefinitionAccess().getDefValueDefaultValueParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleDefaultValue();

            state._fsp--;

             after(grammarAccess.getVariableDefinitionAccess().getDefValueDefaultValueParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDefinition__DefValueAssignment_4"


    // $ANTLR start "rule__Type__NameAssignment_0_0"
    // InternalGraphqlXtext.g:3571:1: rule__Type__NameAssignment_0_0 : ( ruleNamedType ) ;
    public final void rule__Type__NameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:3575:1: ( ( ruleNamedType ) )
            // InternalGraphqlXtext.g:3576:2: ( ruleNamedType )
            {
            // InternalGraphqlXtext.g:3576:2: ( ruleNamedType )
            // InternalGraphqlXtext.g:3577:3: ruleNamedType
            {
             before(grammarAccess.getTypeAccess().getNameNamedTypeParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNamedType();

            state._fsp--;

             after(grammarAccess.getTypeAccess().getNameNamedTypeParserRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__NameAssignment_0_0"


    // $ANTLR start "rule__Type__NotNullAssignment_0_1"
    // InternalGraphqlXtext.g:3586:1: rule__Type__NotNullAssignment_0_1 : ( ( '!' ) ) ;
    public final void rule__Type__NotNullAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:3590:1: ( ( ( '!' ) ) )
            // InternalGraphqlXtext.g:3591:2: ( ( '!' ) )
            {
            // InternalGraphqlXtext.g:3591:2: ( ( '!' ) )
            // InternalGraphqlXtext.g:3592:3: ( '!' )
            {
             before(grammarAccess.getTypeAccess().getNotNullExclamationMarkKeyword_0_1_0()); 
            // InternalGraphqlXtext.g:3593:3: ( '!' )
            // InternalGraphqlXtext.g:3594:4: '!'
            {
             before(grammarAccess.getTypeAccess().getNotNullExclamationMarkKeyword_0_1_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getNotNullExclamationMarkKeyword_0_1_0()); 

            }

             after(grammarAccess.getTypeAccess().getNotNullExclamationMarkKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__NotNullAssignment_0_1"


    // $ANTLR start "rule__Type__ListAssignment_1_0"
    // InternalGraphqlXtext.g:3605:1: rule__Type__ListAssignment_1_0 : ( ruleListType ) ;
    public final void rule__Type__ListAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:3609:1: ( ( ruleListType ) )
            // InternalGraphqlXtext.g:3610:2: ( ruleListType )
            {
            // InternalGraphqlXtext.g:3610:2: ( ruleListType )
            // InternalGraphqlXtext.g:3611:3: ruleListType
            {
             before(grammarAccess.getTypeAccess().getListListTypeParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleListType();

            state._fsp--;

             after(grammarAccess.getTypeAccess().getListListTypeParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__ListAssignment_1_0"


    // $ANTLR start "rule__Type__NotNullAssignment_1_1"
    // InternalGraphqlXtext.g:3620:1: rule__Type__NotNullAssignment_1_1 : ( ( '!' ) ) ;
    public final void rule__Type__NotNullAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:3624:1: ( ( ( '!' ) ) )
            // InternalGraphqlXtext.g:3625:2: ( ( '!' ) )
            {
            // InternalGraphqlXtext.g:3625:2: ( ( '!' ) )
            // InternalGraphqlXtext.g:3626:3: ( '!' )
            {
             before(grammarAccess.getTypeAccess().getNotNullExclamationMarkKeyword_1_1_0()); 
            // InternalGraphqlXtext.g:3627:3: ( '!' )
            // InternalGraphqlXtext.g:3628:4: '!'
            {
             before(grammarAccess.getTypeAccess().getNotNullExclamationMarkKeyword_1_1_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getNotNullExclamationMarkKeyword_1_1_0()); 

            }

             after(grammarAccess.getTypeAccess().getNotNullExclamationMarkKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__NotNullAssignment_1_1"


    // $ANTLR start "rule__ListType__TypeAssignment_1"
    // InternalGraphqlXtext.g:3639:1: rule__ListType__TypeAssignment_1 : ( ruleType ) ;
    public final void rule__ListType__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:3643:1: ( ( ruleType ) )
            // InternalGraphqlXtext.g:3644:2: ( ruleType )
            {
            // InternalGraphqlXtext.g:3644:2: ( ruleType )
            // InternalGraphqlXtext.g:3645:3: ruleType
            {
             before(grammarAccess.getListTypeAccess().getTypeTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getListTypeAccess().getTypeTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListType__TypeAssignment_1"


    // $ANTLR start "rule__Directive__NameAssignment_1"
    // InternalGraphqlXtext.g:3654:1: rule__Directive__NameAssignment_1 : ( RULE_NAME ) ;
    public final void rule__Directive__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:3658:1: ( ( RULE_NAME ) )
            // InternalGraphqlXtext.g:3659:2: ( RULE_NAME )
            {
            // InternalGraphqlXtext.g:3659:2: ( RULE_NAME )
            // InternalGraphqlXtext.g:3660:3: RULE_NAME
            {
             before(grammarAccess.getDirectiveAccess().getNameNAMETerminalRuleCall_1_0()); 
            match(input,RULE_NAME,FOLLOW_2); 
             after(grammarAccess.getDirectiveAccess().getNameNAMETerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Directive__NameAssignment_1"


    // $ANTLR start "rule__Directive__ArgsAssignment_2"
    // InternalGraphqlXtext.g:3669:1: rule__Directive__ArgsAssignment_2 : ( ruleArguments ) ;
    public final void rule__Directive__ArgsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlXtext.g:3673:1: ( ( ruleArguments ) )
            // InternalGraphqlXtext.g:3674:2: ( ruleArguments )
            {
            // InternalGraphqlXtext.g:3674:2: ( ruleArguments )
            // InternalGraphqlXtext.g:3675:3: ruleArguments
            {
             before(grammarAccess.getDirectiveAccess().getArgsArgumentsParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleArguments();

            state._fsp--;

             after(grammarAccess.getDirectiveAccess().getArgsArgumentsParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Directive__ArgsAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000002260002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000080280010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000012L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000080280000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000000282001F0L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000084200000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000000382001F0L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000000282001F2L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000080002L});

}