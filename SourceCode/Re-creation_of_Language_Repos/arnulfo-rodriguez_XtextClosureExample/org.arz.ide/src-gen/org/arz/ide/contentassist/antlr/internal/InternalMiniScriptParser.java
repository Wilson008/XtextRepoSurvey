package org.arz.ide.contentassist.antlr.internal;

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
import org.arz.services.MiniScriptGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMiniScriptParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'not'", "'if'", "'+'", "'-'", "'*'", "'/'", "'>'", "'>='", "'<'", "'<='", "'=='", "'!='", "'and'", "'or'", "'true'", "'false'", "';'", "'{'", "'}'", "'let'", "','", "'('", "')'", "'func'", "'='"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
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
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMiniScriptParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMiniScriptParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMiniScriptParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMiniScript.g"; }


    	private MiniScriptGrammarAccess grammarAccess;

    	public void setGrammarAccess(MiniScriptGrammarAccess grammarAccess) {
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
    // InternalMiniScript.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalMiniScript.g:54:1: ( ruleModel EOF )
            // InternalMiniScript.g:55:1: ruleModel EOF
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
    // InternalMiniScript.g:62:1: ruleModel : ( ruleProgram ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:66:2: ( ( ruleProgram ) )
            // InternalMiniScript.g:67:2: ( ruleProgram )
            {
            // InternalMiniScript.g:67:2: ( ruleProgram )
            // InternalMiniScript.g:68:3: ruleProgram
            {
             before(grammarAccess.getModelAccess().getProgramParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleProgram();

            state._fsp--;

             after(grammarAccess.getModelAccess().getProgramParserRuleCall()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleProgram"
    // InternalMiniScript.g:78:1: entryRuleProgram : ruleProgram EOF ;
    public final void entryRuleProgram() throws RecognitionException {
        try {
            // InternalMiniScript.g:79:1: ( ruleProgram EOF )
            // InternalMiniScript.g:80:1: ruleProgram EOF
            {
             before(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            ruleProgram();

            state._fsp--;

             after(grammarAccess.getProgramRule()); 
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
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalMiniScript.g:87:1: ruleProgram : ( ( rule__Program__Group__0 ) ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:91:2: ( ( ( rule__Program__Group__0 ) ) )
            // InternalMiniScript.g:92:2: ( ( rule__Program__Group__0 ) )
            {
            // InternalMiniScript.g:92:2: ( ( rule__Program__Group__0 ) )
            // InternalMiniScript.g:93:3: ( rule__Program__Group__0 )
            {
             before(grammarAccess.getProgramAccess().getGroup()); 
            // InternalMiniScript.g:94:3: ( rule__Program__Group__0 )
            // InternalMiniScript.g:94:4: rule__Program__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleExpression"
    // InternalMiniScript.g:103:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalMiniScript.g:104:1: ( ruleExpression EOF )
            // InternalMiniScript.g:105:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalMiniScript.g:112:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:116:2: ( ( ( rule__Expression__Alternatives ) ) )
            // InternalMiniScript.g:117:2: ( ( rule__Expression__Alternatives ) )
            {
            // InternalMiniScript.g:117:2: ( ( rule__Expression__Alternatives ) )
            // InternalMiniScript.g:118:3: ( rule__Expression__Alternatives )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives()); 
            // InternalMiniScript.g:119:3: ( rule__Expression__Alternatives )
            // InternalMiniScript.g:119:4: rule__Expression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleBlockExpression"
    // InternalMiniScript.g:128:1: entryRuleBlockExpression : ruleBlockExpression EOF ;
    public final void entryRuleBlockExpression() throws RecognitionException {
        try {
            // InternalMiniScript.g:129:1: ( ruleBlockExpression EOF )
            // InternalMiniScript.g:130:1: ruleBlockExpression EOF
            {
             before(grammarAccess.getBlockExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleBlockExpression();

            state._fsp--;

             after(grammarAccess.getBlockExpressionRule()); 
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
    // $ANTLR end "entryRuleBlockExpression"


    // $ANTLR start "ruleBlockExpression"
    // InternalMiniScript.g:137:1: ruleBlockExpression : ( ( rule__BlockExpression__Group__0 ) ) ;
    public final void ruleBlockExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:141:2: ( ( ( rule__BlockExpression__Group__0 ) ) )
            // InternalMiniScript.g:142:2: ( ( rule__BlockExpression__Group__0 ) )
            {
            // InternalMiniScript.g:142:2: ( ( rule__BlockExpression__Group__0 ) )
            // InternalMiniScript.g:143:3: ( rule__BlockExpression__Group__0 )
            {
             before(grammarAccess.getBlockExpressionAccess().getGroup()); 
            // InternalMiniScript.g:144:3: ( rule__BlockExpression__Group__0 )
            // InternalMiniScript.g:144:4: rule__BlockExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BlockExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBlockExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBlockExpression"


    // $ANTLR start "entryRuleLetExpression"
    // InternalMiniScript.g:153:1: entryRuleLetExpression : ruleLetExpression EOF ;
    public final void entryRuleLetExpression() throws RecognitionException {
        try {
            // InternalMiniScript.g:154:1: ( ruleLetExpression EOF )
            // InternalMiniScript.g:155:1: ruleLetExpression EOF
            {
             before(grammarAccess.getLetExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleLetExpression();

            state._fsp--;

             after(grammarAccess.getLetExpressionRule()); 
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
    // $ANTLR end "entryRuleLetExpression"


    // $ANTLR start "ruleLetExpression"
    // InternalMiniScript.g:162:1: ruleLetExpression : ( ( rule__LetExpression__Group__0 ) ) ;
    public final void ruleLetExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:166:2: ( ( ( rule__LetExpression__Group__0 ) ) )
            // InternalMiniScript.g:167:2: ( ( rule__LetExpression__Group__0 ) )
            {
            // InternalMiniScript.g:167:2: ( ( rule__LetExpression__Group__0 ) )
            // InternalMiniScript.g:168:3: ( rule__LetExpression__Group__0 )
            {
             before(grammarAccess.getLetExpressionAccess().getGroup()); 
            // InternalMiniScript.g:169:3: ( rule__LetExpression__Group__0 )
            // InternalMiniScript.g:169:4: rule__LetExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LetExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLetExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLetExpression"


    // $ANTLR start "entryRuleTernaryExpression"
    // InternalMiniScript.g:178:1: entryRuleTernaryExpression : ruleTernaryExpression EOF ;
    public final void entryRuleTernaryExpression() throws RecognitionException {
        try {
            // InternalMiniScript.g:179:1: ( ruleTernaryExpression EOF )
            // InternalMiniScript.g:180:1: ruleTernaryExpression EOF
            {
             before(grammarAccess.getTernaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleTernaryExpression();

            state._fsp--;

             after(grammarAccess.getTernaryExpressionRule()); 
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
    // $ANTLR end "entryRuleTernaryExpression"


    // $ANTLR start "ruleTernaryExpression"
    // InternalMiniScript.g:187:1: ruleTernaryExpression : ( ( rule__TernaryExpression__Group__0 ) ) ;
    public final void ruleTernaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:191:2: ( ( ( rule__TernaryExpression__Group__0 ) ) )
            // InternalMiniScript.g:192:2: ( ( rule__TernaryExpression__Group__0 ) )
            {
            // InternalMiniScript.g:192:2: ( ( rule__TernaryExpression__Group__0 ) )
            // InternalMiniScript.g:193:3: ( rule__TernaryExpression__Group__0 )
            {
             before(grammarAccess.getTernaryExpressionAccess().getGroup()); 
            // InternalMiniScript.g:194:3: ( rule__TernaryExpression__Group__0 )
            // InternalMiniScript.g:194:4: rule__TernaryExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TernaryExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTernaryExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTernaryExpression"


    // $ANTLR start "entryRuleLogicalBinaryExpression"
    // InternalMiniScript.g:203:1: entryRuleLogicalBinaryExpression : ruleLogicalBinaryExpression EOF ;
    public final void entryRuleLogicalBinaryExpression() throws RecognitionException {
        try {
            // InternalMiniScript.g:204:1: ( ruleLogicalBinaryExpression EOF )
            // InternalMiniScript.g:205:1: ruleLogicalBinaryExpression EOF
            {
             before(grammarAccess.getLogicalBinaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleLogicalBinaryExpression();

            state._fsp--;

             after(grammarAccess.getLogicalBinaryExpressionRule()); 
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
    // $ANTLR end "entryRuleLogicalBinaryExpression"


    // $ANTLR start "ruleLogicalBinaryExpression"
    // InternalMiniScript.g:212:1: ruleLogicalBinaryExpression : ( ( rule__LogicalBinaryExpression__Group__0 ) ) ;
    public final void ruleLogicalBinaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:216:2: ( ( ( rule__LogicalBinaryExpression__Group__0 ) ) )
            // InternalMiniScript.g:217:2: ( ( rule__LogicalBinaryExpression__Group__0 ) )
            {
            // InternalMiniScript.g:217:2: ( ( rule__LogicalBinaryExpression__Group__0 ) )
            // InternalMiniScript.g:218:3: ( rule__LogicalBinaryExpression__Group__0 )
            {
             before(grammarAccess.getLogicalBinaryExpressionAccess().getGroup()); 
            // InternalMiniScript.g:219:3: ( rule__LogicalBinaryExpression__Group__0 )
            // InternalMiniScript.g:219:4: rule__LogicalBinaryExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LogicalBinaryExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLogicalBinaryExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLogicalBinaryExpression"


    // $ANTLR start "entryRuleLogicalUnaryExpression"
    // InternalMiniScript.g:228:1: entryRuleLogicalUnaryExpression : ruleLogicalUnaryExpression EOF ;
    public final void entryRuleLogicalUnaryExpression() throws RecognitionException {
        try {
            // InternalMiniScript.g:229:1: ( ruleLogicalUnaryExpression EOF )
            // InternalMiniScript.g:230:1: ruleLogicalUnaryExpression EOF
            {
             before(grammarAccess.getLogicalUnaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleLogicalUnaryExpression();

            state._fsp--;

             after(grammarAccess.getLogicalUnaryExpressionRule()); 
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
    // $ANTLR end "entryRuleLogicalUnaryExpression"


    // $ANTLR start "ruleLogicalUnaryExpression"
    // InternalMiniScript.g:237:1: ruleLogicalUnaryExpression : ( ( rule__LogicalUnaryExpression__Group__0 ) ) ;
    public final void ruleLogicalUnaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:241:2: ( ( ( rule__LogicalUnaryExpression__Group__0 ) ) )
            // InternalMiniScript.g:242:2: ( ( rule__LogicalUnaryExpression__Group__0 ) )
            {
            // InternalMiniScript.g:242:2: ( ( rule__LogicalUnaryExpression__Group__0 ) )
            // InternalMiniScript.g:243:3: ( rule__LogicalUnaryExpression__Group__0 )
            {
             before(grammarAccess.getLogicalUnaryExpressionAccess().getGroup()); 
            // InternalMiniScript.g:244:3: ( rule__LogicalUnaryExpression__Group__0 )
            // InternalMiniScript.g:244:4: rule__LogicalUnaryExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LogicalUnaryExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLogicalUnaryExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLogicalUnaryExpression"


    // $ANTLR start "entryRuleComparisonExpression"
    // InternalMiniScript.g:253:1: entryRuleComparisonExpression : ruleComparisonExpression EOF ;
    public final void entryRuleComparisonExpression() throws RecognitionException {
        try {
            // InternalMiniScript.g:254:1: ( ruleComparisonExpression EOF )
            // InternalMiniScript.g:255:1: ruleComparisonExpression EOF
            {
             before(grammarAccess.getComparisonExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleComparisonExpression();

            state._fsp--;

             after(grammarAccess.getComparisonExpressionRule()); 
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
    // $ANTLR end "entryRuleComparisonExpression"


    // $ANTLR start "ruleComparisonExpression"
    // InternalMiniScript.g:262:1: ruleComparisonExpression : ( ( rule__ComparisonExpression__Group__0 ) ) ;
    public final void ruleComparisonExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:266:2: ( ( ( rule__ComparisonExpression__Group__0 ) ) )
            // InternalMiniScript.g:267:2: ( ( rule__ComparisonExpression__Group__0 ) )
            {
            // InternalMiniScript.g:267:2: ( ( rule__ComparisonExpression__Group__0 ) )
            // InternalMiniScript.g:268:3: ( rule__ComparisonExpression__Group__0 )
            {
             before(grammarAccess.getComparisonExpressionAccess().getGroup()); 
            // InternalMiniScript.g:269:3: ( rule__ComparisonExpression__Group__0 )
            // InternalMiniScript.g:269:4: rule__ComparisonExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComparisonExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComparisonExpression"


    // $ANTLR start "entryRuleFunctionDeclaration"
    // InternalMiniScript.g:278:1: entryRuleFunctionDeclaration : ruleFunctionDeclaration EOF ;
    public final void entryRuleFunctionDeclaration() throws RecognitionException {
        try {
            // InternalMiniScript.g:279:1: ( ruleFunctionDeclaration EOF )
            // InternalMiniScript.g:280:1: ruleFunctionDeclaration EOF
            {
             before(grammarAccess.getFunctionDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleFunctionDeclaration();

            state._fsp--;

             after(grammarAccess.getFunctionDeclarationRule()); 
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
    // $ANTLR end "entryRuleFunctionDeclaration"


    // $ANTLR start "ruleFunctionDeclaration"
    // InternalMiniScript.g:287:1: ruleFunctionDeclaration : ( ( rule__FunctionDeclaration__Group__0 ) ) ;
    public final void ruleFunctionDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:291:2: ( ( ( rule__FunctionDeclaration__Group__0 ) ) )
            // InternalMiniScript.g:292:2: ( ( rule__FunctionDeclaration__Group__0 ) )
            {
            // InternalMiniScript.g:292:2: ( ( rule__FunctionDeclaration__Group__0 ) )
            // InternalMiniScript.g:293:3: ( rule__FunctionDeclaration__Group__0 )
            {
             before(grammarAccess.getFunctionDeclarationAccess().getGroup()); 
            // InternalMiniScript.g:294:3: ( rule__FunctionDeclaration__Group__0 )
            // InternalMiniScript.g:294:4: rule__FunctionDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FunctionDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFunctionDeclaration"


    // $ANTLR start "entryRuleSymbolReference"
    // InternalMiniScript.g:303:1: entryRuleSymbolReference : ruleSymbolReference EOF ;
    public final void entryRuleSymbolReference() throws RecognitionException {
        try {
            // InternalMiniScript.g:304:1: ( ruleSymbolReference EOF )
            // InternalMiniScript.g:305:1: ruleSymbolReference EOF
            {
             before(grammarAccess.getSymbolReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleSymbolReference();

            state._fsp--;

             after(grammarAccess.getSymbolReferenceRule()); 
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
    // $ANTLR end "entryRuleSymbolReference"


    // $ANTLR start "ruleSymbolReference"
    // InternalMiniScript.g:312:1: ruleSymbolReference : ( ( rule__SymbolReference__IdAssignment ) ) ;
    public final void ruleSymbolReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:316:2: ( ( ( rule__SymbolReference__IdAssignment ) ) )
            // InternalMiniScript.g:317:2: ( ( rule__SymbolReference__IdAssignment ) )
            {
            // InternalMiniScript.g:317:2: ( ( rule__SymbolReference__IdAssignment ) )
            // InternalMiniScript.g:318:3: ( rule__SymbolReference__IdAssignment )
            {
             before(grammarAccess.getSymbolReferenceAccess().getIdAssignment()); 
            // InternalMiniScript.g:319:3: ( rule__SymbolReference__IdAssignment )
            // InternalMiniScript.g:319:4: rule__SymbolReference__IdAssignment
            {
            pushFollow(FOLLOW_2);
            rule__SymbolReference__IdAssignment();

            state._fsp--;


            }

             after(grammarAccess.getSymbolReferenceAccess().getIdAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSymbolReference"


    // $ANTLR start "entryRuleNumericExpression"
    // InternalMiniScript.g:328:1: entryRuleNumericExpression : ruleNumericExpression EOF ;
    public final void entryRuleNumericExpression() throws RecognitionException {
        try {
            // InternalMiniScript.g:329:1: ( ruleNumericExpression EOF )
            // InternalMiniScript.g:330:1: ruleNumericExpression EOF
            {
             before(grammarAccess.getNumericExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleNumericExpression();

            state._fsp--;

             after(grammarAccess.getNumericExpressionRule()); 
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
    // $ANTLR end "entryRuleNumericExpression"


    // $ANTLR start "ruleNumericExpression"
    // InternalMiniScript.g:337:1: ruleNumericExpression : ( ( rule__NumericExpression__Group__0 ) ) ;
    public final void ruleNumericExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:341:2: ( ( ( rule__NumericExpression__Group__0 ) ) )
            // InternalMiniScript.g:342:2: ( ( rule__NumericExpression__Group__0 ) )
            {
            // InternalMiniScript.g:342:2: ( ( rule__NumericExpression__Group__0 ) )
            // InternalMiniScript.g:343:3: ( rule__NumericExpression__Group__0 )
            {
             before(grammarAccess.getNumericExpressionAccess().getGroup()); 
            // InternalMiniScript.g:344:3: ( rule__NumericExpression__Group__0 )
            // InternalMiniScript.g:344:4: rule__NumericExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NumericExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNumericExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumericExpression"


    // $ANTLR start "entryRuleFactor"
    // InternalMiniScript.g:353:1: entryRuleFactor : ruleFactor EOF ;
    public final void entryRuleFactor() throws RecognitionException {
        try {
            // InternalMiniScript.g:354:1: ( ruleFactor EOF )
            // InternalMiniScript.g:355:1: ruleFactor EOF
            {
             before(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_1);
            ruleFactor();

            state._fsp--;

             after(grammarAccess.getFactorRule()); 
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
    // $ANTLR end "entryRuleFactor"


    // $ANTLR start "ruleFactor"
    // InternalMiniScript.g:362:1: ruleFactor : ( ( rule__Factor__Group__0 ) ) ;
    public final void ruleFactor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:366:2: ( ( ( rule__Factor__Group__0 ) ) )
            // InternalMiniScript.g:367:2: ( ( rule__Factor__Group__0 ) )
            {
            // InternalMiniScript.g:367:2: ( ( rule__Factor__Group__0 ) )
            // InternalMiniScript.g:368:3: ( rule__Factor__Group__0 )
            {
             before(grammarAccess.getFactorAccess().getGroup()); 
            // InternalMiniScript.g:369:3: ( rule__Factor__Group__0 )
            // InternalMiniScript.g:369:4: rule__Factor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Factor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFactorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFactor"


    // $ANTLR start "entryRuleTerm"
    // InternalMiniScript.g:378:1: entryRuleTerm : ruleTerm EOF ;
    public final void entryRuleTerm() throws RecognitionException {
        try {
            // InternalMiniScript.g:379:1: ( ruleTerm EOF )
            // InternalMiniScript.g:380:1: ruleTerm EOF
            {
             before(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_1);
            ruleTerm();

            state._fsp--;

             after(grammarAccess.getTermRule()); 
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
    // $ANTLR end "entryRuleTerm"


    // $ANTLR start "ruleTerm"
    // InternalMiniScript.g:387:1: ruleTerm : ( ( rule__Term__Alternatives ) ) ;
    public final void ruleTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:391:2: ( ( ( rule__Term__Alternatives ) ) )
            // InternalMiniScript.g:392:2: ( ( rule__Term__Alternatives ) )
            {
            // InternalMiniScript.g:392:2: ( ( rule__Term__Alternatives ) )
            // InternalMiniScript.g:393:3: ( rule__Term__Alternatives )
            {
             before(grammarAccess.getTermAccess().getAlternatives()); 
            // InternalMiniScript.g:394:3: ( rule__Term__Alternatives )
            // InternalMiniScript.g:394:4: rule__Term__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Term__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTermAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTerm"


    // $ANTLR start "entryRuleApply"
    // InternalMiniScript.g:403:1: entryRuleApply : ruleApply EOF ;
    public final void entryRuleApply() throws RecognitionException {
        try {
            // InternalMiniScript.g:404:1: ( ruleApply EOF )
            // InternalMiniScript.g:405:1: ruleApply EOF
            {
             before(grammarAccess.getApplyRule()); 
            pushFollow(FOLLOW_1);
            ruleApply();

            state._fsp--;

             after(grammarAccess.getApplyRule()); 
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
    // $ANTLR end "entryRuleApply"


    // $ANTLR start "ruleApply"
    // InternalMiniScript.g:412:1: ruleApply : ( ( rule__Apply__Group__0 ) ) ;
    public final void ruleApply() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:416:2: ( ( ( rule__Apply__Group__0 ) ) )
            // InternalMiniScript.g:417:2: ( ( rule__Apply__Group__0 ) )
            {
            // InternalMiniScript.g:417:2: ( ( rule__Apply__Group__0 ) )
            // InternalMiniScript.g:418:3: ( rule__Apply__Group__0 )
            {
             before(grammarAccess.getApplyAccess().getGroup()); 
            // InternalMiniScript.g:419:3: ( rule__Apply__Group__0 )
            // InternalMiniScript.g:419:4: rule__Apply__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Apply__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getApplyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleApply"


    // $ANTLR start "entryRuleFunctor"
    // InternalMiniScript.g:428:1: entryRuleFunctor : ruleFunctor EOF ;
    public final void entryRuleFunctor() throws RecognitionException {
        try {
            // InternalMiniScript.g:429:1: ( ruleFunctor EOF )
            // InternalMiniScript.g:430:1: ruleFunctor EOF
            {
             before(grammarAccess.getFunctorRule()); 
            pushFollow(FOLLOW_1);
            ruleFunctor();

            state._fsp--;

             after(grammarAccess.getFunctorRule()); 
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
    // $ANTLR end "entryRuleFunctor"


    // $ANTLR start "ruleFunctor"
    // InternalMiniScript.g:437:1: ruleFunctor : ( ( rule__Functor__Alternatives ) ) ;
    public final void ruleFunctor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:441:2: ( ( ( rule__Functor__Alternatives ) ) )
            // InternalMiniScript.g:442:2: ( ( rule__Functor__Alternatives ) )
            {
            // InternalMiniScript.g:442:2: ( ( rule__Functor__Alternatives ) )
            // InternalMiniScript.g:443:3: ( rule__Functor__Alternatives )
            {
             before(grammarAccess.getFunctorAccess().getAlternatives()); 
            // InternalMiniScript.g:444:3: ( rule__Functor__Alternatives )
            // InternalMiniScript.g:444:4: rule__Functor__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Functor__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFunctorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFunctor"


    // $ANTLR start "entryRuleLiteralExpression"
    // InternalMiniScript.g:453:1: entryRuleLiteralExpression : ruleLiteralExpression EOF ;
    public final void entryRuleLiteralExpression() throws RecognitionException {
        try {
            // InternalMiniScript.g:454:1: ( ruleLiteralExpression EOF )
            // InternalMiniScript.g:455:1: ruleLiteralExpression EOF
            {
             before(grammarAccess.getLiteralExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleLiteralExpression();

            state._fsp--;

             after(grammarAccess.getLiteralExpressionRule()); 
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
    // $ANTLR end "entryRuleLiteralExpression"


    // $ANTLR start "ruleLiteralExpression"
    // InternalMiniScript.g:462:1: ruleLiteralExpression : ( ( rule__LiteralExpression__Alternatives ) ) ;
    public final void ruleLiteralExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:466:2: ( ( ( rule__LiteralExpression__Alternatives ) ) )
            // InternalMiniScript.g:467:2: ( ( rule__LiteralExpression__Alternatives ) )
            {
            // InternalMiniScript.g:467:2: ( ( rule__LiteralExpression__Alternatives ) )
            // InternalMiniScript.g:468:3: ( rule__LiteralExpression__Alternatives )
            {
             before(grammarAccess.getLiteralExpressionAccess().getAlternatives()); 
            // InternalMiniScript.g:469:3: ( rule__LiteralExpression__Alternatives )
            // InternalMiniScript.g:469:4: rule__LiteralExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__LiteralExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLiteralExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLiteralExpression"


    // $ANTLR start "entryRuleLiteralBoolean"
    // InternalMiniScript.g:478:1: entryRuleLiteralBoolean : ruleLiteralBoolean EOF ;
    public final void entryRuleLiteralBoolean() throws RecognitionException {
        try {
            // InternalMiniScript.g:479:1: ( ruleLiteralBoolean EOF )
            // InternalMiniScript.g:480:1: ruleLiteralBoolean EOF
            {
             before(grammarAccess.getLiteralBooleanRule()); 
            pushFollow(FOLLOW_1);
            ruleLiteralBoolean();

            state._fsp--;

             after(grammarAccess.getLiteralBooleanRule()); 
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
    // $ANTLR end "entryRuleLiteralBoolean"


    // $ANTLR start "ruleLiteralBoolean"
    // InternalMiniScript.g:487:1: ruleLiteralBoolean : ( ( rule__LiteralBoolean__ValueAssignment ) ) ;
    public final void ruleLiteralBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:491:2: ( ( ( rule__LiteralBoolean__ValueAssignment ) ) )
            // InternalMiniScript.g:492:2: ( ( rule__LiteralBoolean__ValueAssignment ) )
            {
            // InternalMiniScript.g:492:2: ( ( rule__LiteralBoolean__ValueAssignment ) )
            // InternalMiniScript.g:493:3: ( rule__LiteralBoolean__ValueAssignment )
            {
             before(grammarAccess.getLiteralBooleanAccess().getValueAssignment()); 
            // InternalMiniScript.g:494:3: ( rule__LiteralBoolean__ValueAssignment )
            // InternalMiniScript.g:494:4: rule__LiteralBoolean__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__LiteralBoolean__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getLiteralBooleanAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLiteralBoolean"


    // $ANTLR start "entryRuleLiteralNumber"
    // InternalMiniScript.g:503:1: entryRuleLiteralNumber : ruleLiteralNumber EOF ;
    public final void entryRuleLiteralNumber() throws RecognitionException {
        try {
            // InternalMiniScript.g:504:1: ( ruleLiteralNumber EOF )
            // InternalMiniScript.g:505:1: ruleLiteralNumber EOF
            {
             before(grammarAccess.getLiteralNumberRule()); 
            pushFollow(FOLLOW_1);
            ruleLiteralNumber();

            state._fsp--;

             after(grammarAccess.getLiteralNumberRule()); 
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
    // $ANTLR end "entryRuleLiteralNumber"


    // $ANTLR start "ruleLiteralNumber"
    // InternalMiniScript.g:512:1: ruleLiteralNumber : ( ( rule__LiteralNumber__ValueAssignment ) ) ;
    public final void ruleLiteralNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:516:2: ( ( ( rule__LiteralNumber__ValueAssignment ) ) )
            // InternalMiniScript.g:517:2: ( ( rule__LiteralNumber__ValueAssignment ) )
            {
            // InternalMiniScript.g:517:2: ( ( rule__LiteralNumber__ValueAssignment ) )
            // InternalMiniScript.g:518:3: ( rule__LiteralNumber__ValueAssignment )
            {
             before(grammarAccess.getLiteralNumberAccess().getValueAssignment()); 
            // InternalMiniScript.g:519:3: ( rule__LiteralNumber__ValueAssignment )
            // InternalMiniScript.g:519:4: rule__LiteralNumber__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__LiteralNumber__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getLiteralNumberAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLiteralNumber"


    // $ANTLR start "entryRuleVariableAssignment"
    // InternalMiniScript.g:528:1: entryRuleVariableAssignment : ruleVariableAssignment EOF ;
    public final void entryRuleVariableAssignment() throws RecognitionException {
        try {
            // InternalMiniScript.g:529:1: ( ruleVariableAssignment EOF )
            // InternalMiniScript.g:530:1: ruleVariableAssignment EOF
            {
             before(grammarAccess.getVariableAssignmentRule()); 
            pushFollow(FOLLOW_1);
            ruleVariableAssignment();

            state._fsp--;

             after(grammarAccess.getVariableAssignmentRule()); 
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
    // $ANTLR end "entryRuleVariableAssignment"


    // $ANTLR start "ruleVariableAssignment"
    // InternalMiniScript.g:537:1: ruleVariableAssignment : ( ( rule__VariableAssignment__Group__0 ) ) ;
    public final void ruleVariableAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:541:2: ( ( ( rule__VariableAssignment__Group__0 ) ) )
            // InternalMiniScript.g:542:2: ( ( rule__VariableAssignment__Group__0 ) )
            {
            // InternalMiniScript.g:542:2: ( ( rule__VariableAssignment__Group__0 ) )
            // InternalMiniScript.g:543:3: ( rule__VariableAssignment__Group__0 )
            {
             before(grammarAccess.getVariableAssignmentAccess().getGroup()); 
            // InternalMiniScript.g:544:3: ( rule__VariableAssignment__Group__0 )
            // InternalMiniScript.g:544:4: rule__VariableAssignment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VariableAssignment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAssignmentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariableAssignment"


    // $ANTLR start "entryRuleParenthesisExpression"
    // InternalMiniScript.g:553:1: entryRuleParenthesisExpression : ruleParenthesisExpression EOF ;
    public final void entryRuleParenthesisExpression() throws RecognitionException {
        try {
            // InternalMiniScript.g:554:1: ( ruleParenthesisExpression EOF )
            // InternalMiniScript.g:555:1: ruleParenthesisExpression EOF
            {
             before(grammarAccess.getParenthesisExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleParenthesisExpression();

            state._fsp--;

             after(grammarAccess.getParenthesisExpressionRule()); 
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
    // $ANTLR end "entryRuleParenthesisExpression"


    // $ANTLR start "ruleParenthesisExpression"
    // InternalMiniScript.g:562:1: ruleParenthesisExpression : ( ( rule__ParenthesisExpression__Group__0 ) ) ;
    public final void ruleParenthesisExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:566:2: ( ( ( rule__ParenthesisExpression__Group__0 ) ) )
            // InternalMiniScript.g:567:2: ( ( rule__ParenthesisExpression__Group__0 ) )
            {
            // InternalMiniScript.g:567:2: ( ( rule__ParenthesisExpression__Group__0 ) )
            // InternalMiniScript.g:568:3: ( rule__ParenthesisExpression__Group__0 )
            {
             before(grammarAccess.getParenthesisExpressionAccess().getGroup()); 
            // InternalMiniScript.g:569:3: ( rule__ParenthesisExpression__Group__0 )
            // InternalMiniScript.g:569:4: rule__ParenthesisExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParenthesisExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParenthesisExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParenthesisExpression"


    // $ANTLR start "ruleAdditionOperator"
    // InternalMiniScript.g:578:1: ruleAdditionOperator : ( ( rule__AdditionOperator__Alternatives ) ) ;
    public final void ruleAdditionOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:582:1: ( ( ( rule__AdditionOperator__Alternatives ) ) )
            // InternalMiniScript.g:583:2: ( ( rule__AdditionOperator__Alternatives ) )
            {
            // InternalMiniScript.g:583:2: ( ( rule__AdditionOperator__Alternatives ) )
            // InternalMiniScript.g:584:3: ( rule__AdditionOperator__Alternatives )
            {
             before(grammarAccess.getAdditionOperatorAccess().getAlternatives()); 
            // InternalMiniScript.g:585:3: ( rule__AdditionOperator__Alternatives )
            // InternalMiniScript.g:585:4: rule__AdditionOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AdditionOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAdditionOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAdditionOperator"


    // $ANTLR start "ruleFactorOperator"
    // InternalMiniScript.g:594:1: ruleFactorOperator : ( ( rule__FactorOperator__Alternatives ) ) ;
    public final void ruleFactorOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:598:1: ( ( ( rule__FactorOperator__Alternatives ) ) )
            // InternalMiniScript.g:599:2: ( ( rule__FactorOperator__Alternatives ) )
            {
            // InternalMiniScript.g:599:2: ( ( rule__FactorOperator__Alternatives ) )
            // InternalMiniScript.g:600:3: ( rule__FactorOperator__Alternatives )
            {
             before(grammarAccess.getFactorOperatorAccess().getAlternatives()); 
            // InternalMiniScript.g:601:3: ( rule__FactorOperator__Alternatives )
            // InternalMiniScript.g:601:4: rule__FactorOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FactorOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFactorOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFactorOperator"


    // $ANTLR start "ruleComparisonOperator"
    // InternalMiniScript.g:610:1: ruleComparisonOperator : ( ( rule__ComparisonOperator__Alternatives ) ) ;
    public final void ruleComparisonOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:614:1: ( ( ( rule__ComparisonOperator__Alternatives ) ) )
            // InternalMiniScript.g:615:2: ( ( rule__ComparisonOperator__Alternatives ) )
            {
            // InternalMiniScript.g:615:2: ( ( rule__ComparisonOperator__Alternatives ) )
            // InternalMiniScript.g:616:3: ( rule__ComparisonOperator__Alternatives )
            {
             before(grammarAccess.getComparisonOperatorAccess().getAlternatives()); 
            // InternalMiniScript.g:617:3: ( rule__ComparisonOperator__Alternatives )
            // InternalMiniScript.g:617:4: rule__ComparisonOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ComparisonOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getComparisonOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComparisonOperator"


    // $ANTLR start "ruleUnaryLogicalOperator"
    // InternalMiniScript.g:626:1: ruleUnaryLogicalOperator : ( ( 'not' ) ) ;
    public final void ruleUnaryLogicalOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:630:1: ( ( ( 'not' ) ) )
            // InternalMiniScript.g:631:2: ( ( 'not' ) )
            {
            // InternalMiniScript.g:631:2: ( ( 'not' ) )
            // InternalMiniScript.g:632:3: ( 'not' )
            {
             before(grammarAccess.getUnaryLogicalOperatorAccess().getNotEnumLiteralDeclaration()); 
            // InternalMiniScript.g:633:3: ( 'not' )
            // InternalMiniScript.g:633:4: 'not'
            {
            match(input,11,FOLLOW_2); 

            }

             after(grammarAccess.getUnaryLogicalOperatorAccess().getNotEnumLiteralDeclaration()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnaryLogicalOperator"


    // $ANTLR start "ruleBinaryLogicalOperator"
    // InternalMiniScript.g:642:1: ruleBinaryLogicalOperator : ( ( rule__BinaryLogicalOperator__Alternatives ) ) ;
    public final void ruleBinaryLogicalOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:646:1: ( ( ( rule__BinaryLogicalOperator__Alternatives ) ) )
            // InternalMiniScript.g:647:2: ( ( rule__BinaryLogicalOperator__Alternatives ) )
            {
            // InternalMiniScript.g:647:2: ( ( rule__BinaryLogicalOperator__Alternatives ) )
            // InternalMiniScript.g:648:3: ( rule__BinaryLogicalOperator__Alternatives )
            {
             before(grammarAccess.getBinaryLogicalOperatorAccess().getAlternatives()); 
            // InternalMiniScript.g:649:3: ( rule__BinaryLogicalOperator__Alternatives )
            // InternalMiniScript.g:649:4: rule__BinaryLogicalOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BinaryLogicalOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBinaryLogicalOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBinaryLogicalOperator"


    // $ANTLR start "ruleTernaryOperator"
    // InternalMiniScript.g:658:1: ruleTernaryOperator : ( ( 'if' ) ) ;
    public final void ruleTernaryOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:662:1: ( ( ( 'if' ) ) )
            // InternalMiniScript.g:663:2: ( ( 'if' ) )
            {
            // InternalMiniScript.g:663:2: ( ( 'if' ) )
            // InternalMiniScript.g:664:3: ( 'if' )
            {
             before(grammarAccess.getTernaryOperatorAccess().getIfExpressionEnumLiteralDeclaration()); 
            // InternalMiniScript.g:665:3: ( 'if' )
            // InternalMiniScript.g:665:4: 'if'
            {
            match(input,12,FOLLOW_2); 

            }

             after(grammarAccess.getTernaryOperatorAccess().getIfExpressionEnumLiteralDeclaration()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTernaryOperator"


    // $ANTLR start "ruleBooleanValue"
    // InternalMiniScript.g:674:1: ruleBooleanValue : ( ( rule__BooleanValue__Alternatives ) ) ;
    public final void ruleBooleanValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:678:1: ( ( ( rule__BooleanValue__Alternatives ) ) )
            // InternalMiniScript.g:679:2: ( ( rule__BooleanValue__Alternatives ) )
            {
            // InternalMiniScript.g:679:2: ( ( rule__BooleanValue__Alternatives ) )
            // InternalMiniScript.g:680:3: ( rule__BooleanValue__Alternatives )
            {
             before(grammarAccess.getBooleanValueAccess().getAlternatives()); 
            // InternalMiniScript.g:681:3: ( rule__BooleanValue__Alternatives )
            // InternalMiniScript.g:681:4: rule__BooleanValue__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BooleanValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBooleanValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanValue"


    // $ANTLR start "rule__Expression__Alternatives"
    // InternalMiniScript.g:689:1: rule__Expression__Alternatives : ( ( ruleFunctionDeclaration ) | ( ruleVariableAssignment ) | ( ruleLogicalBinaryExpression ) | ( ruleLogicalUnaryExpression ) | ( ruleTernaryExpression ) | ( ruleComparisonExpression ) | ( ruleLetExpression ) | ( ruleBlockExpression ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:693:1: ( ( ruleFunctionDeclaration ) | ( ruleVariableAssignment ) | ( ruleLogicalBinaryExpression ) | ( ruleLogicalUnaryExpression ) | ( ruleTernaryExpression ) | ( ruleComparisonExpression ) | ( ruleLetExpression ) | ( ruleBlockExpression ) )
            int alt1=8;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalMiniScript.g:694:2: ( ruleFunctionDeclaration )
                    {
                    // InternalMiniScript.g:694:2: ( ruleFunctionDeclaration )
                    // InternalMiniScript.g:695:3: ruleFunctionDeclaration
                    {
                     before(grammarAccess.getExpressionAccess().getFunctionDeclarationParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleFunctionDeclaration();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getFunctionDeclarationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniScript.g:700:2: ( ruleVariableAssignment )
                    {
                    // InternalMiniScript.g:700:2: ( ruleVariableAssignment )
                    // InternalMiniScript.g:701:3: ruleVariableAssignment
                    {
                     before(grammarAccess.getExpressionAccess().getVariableAssignmentParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleVariableAssignment();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getVariableAssignmentParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMiniScript.g:706:2: ( ruleLogicalBinaryExpression )
                    {
                    // InternalMiniScript.g:706:2: ( ruleLogicalBinaryExpression )
                    // InternalMiniScript.g:707:3: ruleLogicalBinaryExpression
                    {
                     before(grammarAccess.getExpressionAccess().getLogicalBinaryExpressionParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleLogicalBinaryExpression();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getLogicalBinaryExpressionParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMiniScript.g:712:2: ( ruleLogicalUnaryExpression )
                    {
                    // InternalMiniScript.g:712:2: ( ruleLogicalUnaryExpression )
                    // InternalMiniScript.g:713:3: ruleLogicalUnaryExpression
                    {
                     before(grammarAccess.getExpressionAccess().getLogicalUnaryExpressionParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleLogicalUnaryExpression();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getLogicalUnaryExpressionParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMiniScript.g:718:2: ( ruleTernaryExpression )
                    {
                    // InternalMiniScript.g:718:2: ( ruleTernaryExpression )
                    // InternalMiniScript.g:719:3: ruleTernaryExpression
                    {
                     before(grammarAccess.getExpressionAccess().getTernaryExpressionParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleTernaryExpression();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getTernaryExpressionParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMiniScript.g:724:2: ( ruleComparisonExpression )
                    {
                    // InternalMiniScript.g:724:2: ( ruleComparisonExpression )
                    // InternalMiniScript.g:725:3: ruleComparisonExpression
                    {
                     before(grammarAccess.getExpressionAccess().getComparisonExpressionParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleComparisonExpression();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getComparisonExpressionParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMiniScript.g:730:2: ( ruleLetExpression )
                    {
                    // InternalMiniScript.g:730:2: ( ruleLetExpression )
                    // InternalMiniScript.g:731:3: ruleLetExpression
                    {
                     before(grammarAccess.getExpressionAccess().getLetExpressionParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleLetExpression();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getLetExpressionParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMiniScript.g:736:2: ( ruleBlockExpression )
                    {
                    // InternalMiniScript.g:736:2: ( ruleBlockExpression )
                    // InternalMiniScript.g:737:3: ruleBlockExpression
                    {
                     before(grammarAccess.getExpressionAccess().getBlockExpressionParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleBlockExpression();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getBlockExpressionParserRuleCall_7()); 

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
    // $ANTLR end "rule__Expression__Alternatives"


    // $ANTLR start "rule__Term__Alternatives"
    // InternalMiniScript.g:746:1: rule__Term__Alternatives : ( ( ruleLiteralExpression ) | ( ruleApply ) );
    public final void rule__Term__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:750:1: ( ( ruleLiteralExpression ) | ( ruleApply ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_INT||(LA2_0>=25 && LA2_0<=26)) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID||LA2_0==32) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMiniScript.g:751:2: ( ruleLiteralExpression )
                    {
                    // InternalMiniScript.g:751:2: ( ruleLiteralExpression )
                    // InternalMiniScript.g:752:3: ruleLiteralExpression
                    {
                     before(grammarAccess.getTermAccess().getLiteralExpressionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLiteralExpression();

                    state._fsp--;

                     after(grammarAccess.getTermAccess().getLiteralExpressionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniScript.g:757:2: ( ruleApply )
                    {
                    // InternalMiniScript.g:757:2: ( ruleApply )
                    // InternalMiniScript.g:758:3: ruleApply
                    {
                     before(grammarAccess.getTermAccess().getApplyParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleApply();

                    state._fsp--;

                     after(grammarAccess.getTermAccess().getApplyParserRuleCall_1()); 

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
    // $ANTLR end "rule__Term__Alternatives"


    // $ANTLR start "rule__Functor__Alternatives"
    // InternalMiniScript.g:767:1: rule__Functor__Alternatives : ( ( ruleSymbolReference ) | ( ruleParenthesisExpression ) );
    public final void rule__Functor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:771:1: ( ( ruleSymbolReference ) | ( ruleParenthesisExpression ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            else if ( (LA3_0==32) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMiniScript.g:772:2: ( ruleSymbolReference )
                    {
                    // InternalMiniScript.g:772:2: ( ruleSymbolReference )
                    // InternalMiniScript.g:773:3: ruleSymbolReference
                    {
                     before(grammarAccess.getFunctorAccess().getSymbolReferenceParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSymbolReference();

                    state._fsp--;

                     after(grammarAccess.getFunctorAccess().getSymbolReferenceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniScript.g:778:2: ( ruleParenthesisExpression )
                    {
                    // InternalMiniScript.g:778:2: ( ruleParenthesisExpression )
                    // InternalMiniScript.g:779:3: ruleParenthesisExpression
                    {
                     before(grammarAccess.getFunctorAccess().getParenthesisExpressionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleParenthesisExpression();

                    state._fsp--;

                     after(grammarAccess.getFunctorAccess().getParenthesisExpressionParserRuleCall_1()); 

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
    // $ANTLR end "rule__Functor__Alternatives"


    // $ANTLR start "rule__LiteralExpression__Alternatives"
    // InternalMiniScript.g:788:1: rule__LiteralExpression__Alternatives : ( ( ruleLiteralNumber ) | ( ruleLiteralBoolean ) );
    public final void rule__LiteralExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:792:1: ( ( ruleLiteralNumber ) | ( ruleLiteralBoolean ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=25 && LA4_0<=26)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMiniScript.g:793:2: ( ruleLiteralNumber )
                    {
                    // InternalMiniScript.g:793:2: ( ruleLiteralNumber )
                    // InternalMiniScript.g:794:3: ruleLiteralNumber
                    {
                     before(grammarAccess.getLiteralExpressionAccess().getLiteralNumberParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLiteralNumber();

                    state._fsp--;

                     after(grammarAccess.getLiteralExpressionAccess().getLiteralNumberParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniScript.g:799:2: ( ruleLiteralBoolean )
                    {
                    // InternalMiniScript.g:799:2: ( ruleLiteralBoolean )
                    // InternalMiniScript.g:800:3: ruleLiteralBoolean
                    {
                     before(grammarAccess.getLiteralExpressionAccess().getLiteralBooleanParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleLiteralBoolean();

                    state._fsp--;

                     after(grammarAccess.getLiteralExpressionAccess().getLiteralBooleanParserRuleCall_1()); 

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
    // $ANTLR end "rule__LiteralExpression__Alternatives"


    // $ANTLR start "rule__AdditionOperator__Alternatives"
    // InternalMiniScript.g:809:1: rule__AdditionOperator__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) );
    public final void rule__AdditionOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:813:1: ( ( ( '+' ) ) | ( ( '-' ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            else if ( (LA5_0==14) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMiniScript.g:814:2: ( ( '+' ) )
                    {
                    // InternalMiniScript.g:814:2: ( ( '+' ) )
                    // InternalMiniScript.g:815:3: ( '+' )
                    {
                     before(grammarAccess.getAdditionOperatorAccess().getAddEnumLiteralDeclaration_0()); 
                    // InternalMiniScript.g:816:3: ( '+' )
                    // InternalMiniScript.g:816:4: '+'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getAdditionOperatorAccess().getAddEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniScript.g:820:2: ( ( '-' ) )
                    {
                    // InternalMiniScript.g:820:2: ( ( '-' ) )
                    // InternalMiniScript.g:821:3: ( '-' )
                    {
                     before(grammarAccess.getAdditionOperatorAccess().getSubtractEnumLiteralDeclaration_1()); 
                    // InternalMiniScript.g:822:3: ( '-' )
                    // InternalMiniScript.g:822:4: '-'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getAdditionOperatorAccess().getSubtractEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__AdditionOperator__Alternatives"


    // $ANTLR start "rule__FactorOperator__Alternatives"
    // InternalMiniScript.g:830:1: rule__FactorOperator__Alternatives : ( ( ( '*' ) ) | ( ( '/' ) ) );
    public final void rule__FactorOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:834:1: ( ( ( '*' ) ) | ( ( '/' ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            else if ( (LA6_0==16) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMiniScript.g:835:2: ( ( '*' ) )
                    {
                    // InternalMiniScript.g:835:2: ( ( '*' ) )
                    // InternalMiniScript.g:836:3: ( '*' )
                    {
                     before(grammarAccess.getFactorOperatorAccess().getMultEnumLiteralDeclaration_0()); 
                    // InternalMiniScript.g:837:3: ( '*' )
                    // InternalMiniScript.g:837:4: '*'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getFactorOperatorAccess().getMultEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniScript.g:841:2: ( ( '/' ) )
                    {
                    // InternalMiniScript.g:841:2: ( ( '/' ) )
                    // InternalMiniScript.g:842:3: ( '/' )
                    {
                     before(grammarAccess.getFactorOperatorAccess().getDivisionEnumLiteralDeclaration_1()); 
                    // InternalMiniScript.g:843:3: ( '/' )
                    // InternalMiniScript.g:843:4: '/'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getFactorOperatorAccess().getDivisionEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__FactorOperator__Alternatives"


    // $ANTLR start "rule__ComparisonOperator__Alternatives"
    // InternalMiniScript.g:851:1: rule__ComparisonOperator__Alternatives : ( ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '==' ) ) | ( ( '!=' ) ) );
    public final void rule__ComparisonOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:855:1: ( ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '==' ) ) | ( ( '!=' ) ) )
            int alt7=6;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt7=1;
                }
                break;
            case 18:
                {
                alt7=2;
                }
                break;
            case 19:
                {
                alt7=3;
                }
                break;
            case 20:
                {
                alt7=4;
                }
                break;
            case 21:
                {
                alt7=5;
                }
                break;
            case 22:
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
                    // InternalMiniScript.g:856:2: ( ( '>' ) )
                    {
                    // InternalMiniScript.g:856:2: ( ( '>' ) )
                    // InternalMiniScript.g:857:3: ( '>' )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getGtEnumLiteralDeclaration_0()); 
                    // InternalMiniScript.g:858:3: ( '>' )
                    // InternalMiniScript.g:858:4: '>'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisonOperatorAccess().getGtEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniScript.g:862:2: ( ( '>=' ) )
                    {
                    // InternalMiniScript.g:862:2: ( ( '>=' ) )
                    // InternalMiniScript.g:863:3: ( '>=' )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getGteEnumLiteralDeclaration_1()); 
                    // InternalMiniScript.g:864:3: ( '>=' )
                    // InternalMiniScript.g:864:4: '>='
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisonOperatorAccess().getGteEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMiniScript.g:868:2: ( ( '<' ) )
                    {
                    // InternalMiniScript.g:868:2: ( ( '<' ) )
                    // InternalMiniScript.g:869:3: ( '<' )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getLtEnumLiteralDeclaration_2()); 
                    // InternalMiniScript.g:870:3: ( '<' )
                    // InternalMiniScript.g:870:4: '<'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisonOperatorAccess().getLtEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMiniScript.g:874:2: ( ( '<=' ) )
                    {
                    // InternalMiniScript.g:874:2: ( ( '<=' ) )
                    // InternalMiniScript.g:875:3: ( '<=' )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getLteEnumLiteralDeclaration_3()); 
                    // InternalMiniScript.g:876:3: ( '<=' )
                    // InternalMiniScript.g:876:4: '<='
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisonOperatorAccess().getLteEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMiniScript.g:880:2: ( ( '==' ) )
                    {
                    // InternalMiniScript.g:880:2: ( ( '==' ) )
                    // InternalMiniScript.g:881:3: ( '==' )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getEqEnumLiteralDeclaration_4()); 
                    // InternalMiniScript.g:882:3: ( '==' )
                    // InternalMiniScript.g:882:4: '=='
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisonOperatorAccess().getEqEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMiniScript.g:886:2: ( ( '!=' ) )
                    {
                    // InternalMiniScript.g:886:2: ( ( '!=' ) )
                    // InternalMiniScript.g:887:3: ( '!=' )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getNoteqEnumLiteralDeclaration_5()); 
                    // InternalMiniScript.g:888:3: ( '!=' )
                    // InternalMiniScript.g:888:4: '!='
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisonOperatorAccess().getNoteqEnumLiteralDeclaration_5()); 

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
    // $ANTLR end "rule__ComparisonOperator__Alternatives"


    // $ANTLR start "rule__BinaryLogicalOperator__Alternatives"
    // InternalMiniScript.g:896:1: rule__BinaryLogicalOperator__Alternatives : ( ( ( 'and' ) ) | ( ( 'or' ) ) );
    public final void rule__BinaryLogicalOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:900:1: ( ( ( 'and' ) ) | ( ( 'or' ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            else if ( (LA8_0==24) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMiniScript.g:901:2: ( ( 'and' ) )
                    {
                    // InternalMiniScript.g:901:2: ( ( 'and' ) )
                    // InternalMiniScript.g:902:3: ( 'and' )
                    {
                     before(grammarAccess.getBinaryLogicalOperatorAccess().getAndEnumLiteralDeclaration_0()); 
                    // InternalMiniScript.g:903:3: ( 'and' )
                    // InternalMiniScript.g:903:4: 'and'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryLogicalOperatorAccess().getAndEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniScript.g:907:2: ( ( 'or' ) )
                    {
                    // InternalMiniScript.g:907:2: ( ( 'or' ) )
                    // InternalMiniScript.g:908:3: ( 'or' )
                    {
                     before(grammarAccess.getBinaryLogicalOperatorAccess().getOrEnumLiteralDeclaration_1()); 
                    // InternalMiniScript.g:909:3: ( 'or' )
                    // InternalMiniScript.g:909:4: 'or'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryLogicalOperatorAccess().getOrEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__BinaryLogicalOperator__Alternatives"


    // $ANTLR start "rule__BooleanValue__Alternatives"
    // InternalMiniScript.g:917:1: rule__BooleanValue__Alternatives : ( ( ( 'true' ) ) | ( ( 'false' ) ) );
    public final void rule__BooleanValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:921:1: ( ( ( 'true' ) ) | ( ( 'false' ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            else if ( (LA9_0==26) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMiniScript.g:922:2: ( ( 'true' ) )
                    {
                    // InternalMiniScript.g:922:2: ( ( 'true' ) )
                    // InternalMiniScript.g:923:3: ( 'true' )
                    {
                     before(grammarAccess.getBooleanValueAccess().getTrueEnumLiteralDeclaration_0()); 
                    // InternalMiniScript.g:924:3: ( 'true' )
                    // InternalMiniScript.g:924:4: 'true'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getBooleanValueAccess().getTrueEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniScript.g:928:2: ( ( 'false' ) )
                    {
                    // InternalMiniScript.g:928:2: ( ( 'false' ) )
                    // InternalMiniScript.g:929:3: ( 'false' )
                    {
                     before(grammarAccess.getBooleanValueAccess().getFalseEnumLiteralDeclaration_1()); 
                    // InternalMiniScript.g:930:3: ( 'false' )
                    // InternalMiniScript.g:930:4: 'false'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getBooleanValueAccess().getFalseEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__BooleanValue__Alternatives"


    // $ANTLR start "rule__Program__Group__0"
    // InternalMiniScript.g:938:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:942:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // InternalMiniScript.g:943:2: rule__Program__Group__0__Impl rule__Program__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Program__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__0"


    // $ANTLR start "rule__Program__Group__0__Impl"
    // InternalMiniScript.g:950:1: rule__Program__Group__0__Impl : ( ( rule__Program__ExpressionsAssignment_0 ) ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:954:1: ( ( ( rule__Program__ExpressionsAssignment_0 ) ) )
            // InternalMiniScript.g:955:1: ( ( rule__Program__ExpressionsAssignment_0 ) )
            {
            // InternalMiniScript.g:955:1: ( ( rule__Program__ExpressionsAssignment_0 ) )
            // InternalMiniScript.g:956:2: ( rule__Program__ExpressionsAssignment_0 )
            {
             before(grammarAccess.getProgramAccess().getExpressionsAssignment_0()); 
            // InternalMiniScript.g:957:2: ( rule__Program__ExpressionsAssignment_0 )
            // InternalMiniScript.g:957:3: rule__Program__ExpressionsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Program__ExpressionsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getExpressionsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__0__Impl"


    // $ANTLR start "rule__Program__Group__1"
    // InternalMiniScript.g:965:1: rule__Program__Group__1 : rule__Program__Group__1__Impl rule__Program__Group__2 ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:969:1: ( rule__Program__Group__1__Impl rule__Program__Group__2 )
            // InternalMiniScript.g:970:2: rule__Program__Group__1__Impl rule__Program__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Program__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__1"


    // $ANTLR start "rule__Program__Group__1__Impl"
    // InternalMiniScript.g:977:1: rule__Program__Group__1__Impl : ( ';' ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:981:1: ( ( ';' ) )
            // InternalMiniScript.g:982:1: ( ';' )
            {
            // InternalMiniScript.g:982:1: ( ';' )
            // InternalMiniScript.g:983:2: ';'
            {
             before(grammarAccess.getProgramAccess().getSemicolonKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getSemicolonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__1__Impl"


    // $ANTLR start "rule__Program__Group__2"
    // InternalMiniScript.g:992:1: rule__Program__Group__2 : rule__Program__Group__2__Impl ;
    public final void rule__Program__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:996:1: ( rule__Program__Group__2__Impl )
            // InternalMiniScript.g:997:2: rule__Program__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__2"


    // $ANTLR start "rule__Program__Group__2__Impl"
    // InternalMiniScript.g:1003:1: rule__Program__Group__2__Impl : ( ( rule__Program__Group_2__0 )* ) ;
    public final void rule__Program__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:1007:1: ( ( ( rule__Program__Group_2__0 )* ) )
            // InternalMiniScript.g:1008:1: ( ( rule__Program__Group_2__0 )* )
            {
            // InternalMiniScript.g:1008:1: ( ( rule__Program__Group_2__0 )* )
            // InternalMiniScript.g:1009:2: ( rule__Program__Group_2__0 )*
            {
             before(grammarAccess.getProgramAccess().getGroup_2()); 
            // InternalMiniScript.g:1010:2: ( rule__Program__Group_2__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=RULE_ID && LA10_0<=RULE_INT)||(LA10_0>=11 && LA10_0<=12)||(LA10_0>=23 && LA10_0<=26)||LA10_0==28||LA10_0==30||LA10_0==32||LA10_0==34) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMiniScript.g:1010:3: rule__Program__Group_2__0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Program__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__2__Impl"


    // $ANTLR start "rule__Program__Group_2__0"
    // InternalMiniScript.g:1019:1: rule__Program__Group_2__0 : rule__Program__Group_2__0__Impl rule__Program__Group_2__1 ;
    public final void rule__Program__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:1023:1: ( rule__Program__Group_2__0__Impl rule__Program__Group_2__1 )
            // InternalMiniScript.g:1024:2: rule__Program__Group_2__0__Impl rule__Program__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Program__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_2__0"


    // $ANTLR start "rule__Program__Group_2__0__Impl"
    // InternalMiniScript.g:1031:1: rule__Program__Group_2__0__Impl : ( ( rule__Program__ExpressionsAssignment_2_0 ) ) ;
    public final void rule__Program__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:1035:1: ( ( ( rule__Program__ExpressionsAssignment_2_0 ) ) )
            // InternalMiniScript.g:1036:1: ( ( rule__Program__ExpressionsAssignment_2_0 ) )
            {
            // InternalMiniScript.g:1036:1: ( ( rule__Program__ExpressionsAssignment_2_0 ) )
            // InternalMiniScript.g:1037:2: ( rule__Program__ExpressionsAssignment_2_0 )
            {
             before(grammarAccess.getProgramAccess().getExpressionsAssignment_2_0()); 
            // InternalMiniScript.g:1038:2: ( rule__Program__ExpressionsAssignment_2_0 )
            // InternalMiniScript.g:1038:3: rule__Program__ExpressionsAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Program__ExpressionsAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getExpressionsAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_2__0__Impl"


    // $ANTLR start "rule__Program__Group_2__1"
    // InternalMiniScript.g:1046:1: rule__Program__Group_2__1 : rule__Program__Group_2__1__Impl ;
    public final void rule__Program__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:1050:1: ( rule__Program__Group_2__1__Impl )
            // InternalMiniScript.g:1051:2: rule__Program__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_2__1"


    // $ANTLR start "rule__Program__Group_2__1__Impl"
    // InternalMiniScript.g:1057:1: rule__Program__Group_2__1__Impl : ( ';' ) ;
    public final void rule__Program__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:1061:1: ( ( ';' ) )
            // InternalMiniScript.g:1062:1: ( ';' )
            {
            // InternalMiniScript.g:1062:1: ( ';' )
            // InternalMiniScript.g:1063:2: ';'
            {
             before(grammarAccess.getProgramAccess().getSemicolonKeyword_2_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getSemicolonKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_2__1__Impl"


    // $ANTLR start "rule__BlockExpression__Group__0"
    // InternalMiniScript.g:1073:1: rule__BlockExpression__Group__0 : rule__BlockExpression__Group__0__Impl rule__BlockExpression__Group__1 ;
    public final void rule__BlockExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:1077:1: ( rule__BlockExpression__Group__0__Impl rule__BlockExpression__Group__1 )
            // InternalMiniScript.g:1078:2: rule__BlockExpression__Group__0__Impl rule__BlockExpression__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__BlockExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BlockExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockExpression__Group__0"


    // $ANTLR start "rule__BlockExpression__Group__0__Impl"
    // InternalMiniScript.g:1085:1: rule__BlockExpression__Group__0__Impl : ( '{' ) ;
    public final void rule__BlockExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:1089:1: ( ( '{' ) )
            // InternalMiniScript.g:1090:1: ( '{' )
            {
            // InternalMiniScript.g:1090:1: ( '{' )
            // InternalMiniScript.g:1091:2: '{'
            {
             before(grammarAccess.getBlockExpressionAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getBlockExpressionAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockExpression__Group__0__Impl"


    // $ANTLR start "rule__BlockExpression__Group__1"
    // InternalMiniScript.g:1100:1: rule__BlockExpression__Group__1 : rule__BlockExpression__Group__1__Impl rule__BlockExpression__Group__2 ;
    public final void rule__BlockExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:1104:1: ( rule__BlockExpression__Group__1__Impl rule__BlockExpression__Group__2 )
            // InternalMiniScript.g:1105:2: rule__BlockExpression__Group__1__Impl rule__BlockExpression__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__BlockExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BlockExpression__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockExpression__Group__1"


    // $ANTLR start "rule__BlockExpression__Group__1__Impl"
    // InternalMiniScript.g:1112:1: rule__BlockExpression__Group__1__Impl : ( ( ( rule__BlockExpression__Group_1__0 ) ) ( ( rule__BlockExpression__Group_1__0 )* ) ) ;
    public final void rule__BlockExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:1116:1: ( ( ( ( rule__BlockExpression__Group_1__0 ) ) ( ( rule__BlockExpression__Group_1__0 )* ) ) )
            // InternalMiniScript.g:1117:1: ( ( ( rule__BlockExpression__Group_1__0 ) ) ( ( rule__BlockExpression__Group_1__0 )* ) )
            {
            // InternalMiniScript.g:1117:1: ( ( ( rule__BlockExpression__Group_1__0 ) ) ( ( rule__BlockExpression__Group_1__0 )* ) )
            // InternalMiniScript.g:1118:2: ( ( rule__BlockExpression__Group_1__0 ) ) ( ( rule__BlockExpression__Group_1__0 )* )
            {
            // InternalMiniScript.g:1118:2: ( ( rule__BlockExpression__Group_1__0 ) )
            // InternalMiniScript.g:1119:3: ( rule__BlockExpression__Group_1__0 )
            {
             before(grammarAccess.getBlockExpressionAccess().getGroup_1()); 
            // InternalMiniScript.g:1120:3: ( rule__BlockExpression__Group_1__0 )
            // InternalMiniScript.g:1120:4: rule__BlockExpression__Group_1__0
            {
            pushFollow(FOLLOW_5);
            rule__BlockExpression__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getBlockExpressionAccess().getGroup_1()); 

            }

            // InternalMiniScript.g:1123:2: ( ( rule__BlockExpression__Group_1__0 )* )
            // InternalMiniScript.g:1124:3: ( rule__BlockExpression__Group_1__0 )*
            {
             before(grammarAccess.getBlockExpressionAccess().getGroup_1()); 
            // InternalMiniScript.g:1125:3: ( rule__BlockExpression__Group_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=RULE_ID && LA11_0<=RULE_INT)||(LA11_0>=11 && LA11_0<=12)||(LA11_0>=23 && LA11_0<=26)||LA11_0==28||LA11_0==30||LA11_0==32||LA11_0==34) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMiniScript.g:1125:4: rule__BlockExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__BlockExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getBlockExpressionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__BlockExpression__Group__1__Impl"


    // $ANTLR start "rule__BlockExpression__Group__2"
    // InternalMiniScript.g:1134:1: rule__BlockExpression__Group__2 : rule__BlockExpression__Group__2__Impl ;
    public final void rule__BlockExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:1138:1: ( rule__BlockExpression__Group__2__Impl )
            // InternalMiniScript.g:1139:2: rule__BlockExpression__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BlockExpression__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockExpression__Group__2"


    // $ANTLR start "rule__BlockExpression__Group__2__Impl"
    // InternalMiniScript.g:1145:1: rule__BlockExpression__Group__2__Impl : ( '}' ) ;
    public final void rule__BlockExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:1149:1: ( ( '}' ) )
            // InternalMiniScript.g:1150:1: ( '}' )
            {
            // InternalMiniScript.g:1150:1: ( '}' )
            // InternalMiniScript.g:1151:2: '}'
            {
             before(grammarAccess.getBlockExpressionAccess().getRightCurlyBracketKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getBlockExpressionAccess().getRightCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockExpression__Group__2__Impl"


    // $ANTLR start "rule__BlockExpression__Group_1__0"
    // InternalMiniScript.g:1161:1: rule__BlockExpression__Group_1__0 : rule__BlockExpression__Group_1__0__Impl rule__BlockExpression__Group_1__1 ;
    public final void rule__BlockExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:1165:1: ( rule__BlockExpression__Group_1__0__Impl rule__BlockExpression__Group_1__1 )
            // InternalMiniScript.g:1166:2: rule__BlockExpression__Group_1__0__Impl rule__BlockExpression__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__BlockExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BlockExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockExpression__Group_1__0"


    // $ANTLR start "rule__BlockExpression__Group_1__0__Impl"
    // InternalMiniScript.g:1173:1: rule__BlockExpression__Group_1__0__Impl : ( ( rule__BlockExpression__ExpressionsAssignment_1_0 ) ) ;
    public final void rule__BlockExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:1177:1: ( ( ( rule__BlockExpression__ExpressionsAssignment_1_0 ) ) )
            // InternalMiniScript.g:1178:1: ( ( rule__BlockExpression__ExpressionsAssignment_1_0 ) )
            {
            // InternalMiniScript.g:1178:1: ( ( rule__BlockExpression__ExpressionsAssignment_1_0 ) )
            // InternalMiniScript.g:1179:2: ( rule__BlockExpression__ExpressionsAssignment_1_0 )
            {
             before(grammarAccess.getBlockExpressionAccess().getExpressionsAssignment_1_0()); 
            // InternalMiniScript.g:1180:2: ( rule__BlockExpression__ExpressionsAssignment_1_0 )
            // InternalMiniScript.g:1180:3: rule__BlockExpression__ExpressionsAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__BlockExpression__ExpressionsAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getBlockExpressionAccess().getExpressionsAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockExpression__Group_1__0__Impl"


    // $ANTLR start "rule__BlockExpression__Group_1__1"
    // InternalMiniScript.g:1188:1: rule__BlockExpression__Group_1__1 : rule__BlockExpression__Group_1__1__Impl ;
    public final void rule__BlockExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:1192:1: ( rule__BlockExpression__Group_1__1__Impl )
            // InternalMiniScript.g:1193:2: rule__BlockExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BlockExpression__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockExpression__Group_1__1"


    // $ANTLR start "rule__BlockExpression__Group_1__1__Impl"
    // InternalMiniScript.g:1199:1: rule__BlockExpression__Group_1__1__Impl : ( ';' ) ;
    public final void rule__BlockExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:1203:1: ( ( ';' ) )
            // InternalMiniScript.g:1204:1: ( ';' )
            {
            // InternalMiniScript.g:1204:1: ( ';' )
            // InternalMiniScript.g:1205:2: ';'
            {
             before(grammarAccess.getBlockExpressionAccess().getSemicolonKeyword_1_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getBlockExpressionAccess().getSemicolonKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockExpression__Group_1__1__Impl"


    // $ANTLR start "rule__LetExpression__Group__0"
    // InternalMiniScript.g:1215:1: rule__LetExpression__Group__0 : rule__LetExpression__Group__0__Impl rule__LetExpression__Group__1 ;
    public final void rule__LetExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:1219:1: ( rule__LetExpression__Group__0__Impl rule__LetExpression__Group__1 )
            // InternalMiniScript.g:1220:2: rule__LetExpression__Group__0__Impl rule__LetExpression__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__LetExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LetExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetExpression__Group__0"


    // $ANTLR start "rule__LetExpression__Group__0__Impl"
    // InternalMiniScript.g:1227:1: rule__LetExpression__Group__0__Impl : ( 'let' ) ;
    public final void rule__LetExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:1231:1: ( ( 'let' ) )
            // InternalMiniScript.g:1232:1: ( 'let' )
            {
            // InternalMiniScript.g:1232:1: ( 'let' )
            // InternalMiniScript.g:1233:2: 'let'
            {
             before(grammarAccess.getLetExpressionAccess().getLetKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getLetExpressionAccess().getLetKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetExpression__Group__0__Impl"


    // $ANTLR start "rule__LetExpression__Group__1"
    // InternalMiniScript.g:1242:1: rule__LetExpression__Group__1 : rule__LetExpression__Group__1__Impl rule__LetExpression__Group__2 ;
    public final void rule__LetExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:1246:1: ( rule__LetExpression__Group__1__Impl rule__LetExpression__Group__2 )
            // InternalMiniScript.g:1247:2: rule__LetExpression__Group__1__Impl rule__LetExpression__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__LetExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LetExpression__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetExpression__Group__1"


    // $ANTLR start "rule__LetExpression__Group__1__Impl"
    // InternalMiniScript.g:1254:1: rule__LetExpression__Group__1__Impl : ( ( rule__LetExpression__Group_1__0 ) ) ;
    public final void rule__LetExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:1258:1: ( ( ( rule__LetExpression__Group_1__0 ) ) )
            // InternalMiniScript.g:1259:1: ( ( rule__LetExpression__Group_1__0 ) )
            {
            // InternalMiniScript.g:1259:1: ( ( rule__LetExpression__Group_1__0 ) )
            // InternalMiniScript.g:1260:2: ( rule__LetExpression__Group_1__0 )
            {
             before(grammarAccess.getLetExpressionAccess().getGroup_1()); 
            // InternalMiniScript.g:1261:2: ( rule__LetExpression__Group_1__0 )
            // InternalMiniScript.g:1261:3: rule__LetExpression__Group_1__0
            {
            pushFollow(FOLLOW_2);
            rule__LetExpression__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getLetExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetExpression__Group__1__Impl"


    // $ANTLR start "rule__LetExpression__Group__2"
    // InternalMiniScript.g:1269:1: rule__LetExpression__Group__2 : rule__LetExpression__Group__2__Impl ;
    public final void rule__LetExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:1273:1: ( rule__LetExpression__Group__2__Impl )
            // InternalMiniScript.g:1274:2: rule__LetExpression__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LetExpression__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetExpression__Group__2"


    // $ANTLR start "rule__LetExpression__Group__2__Impl"
    // InternalMiniScript.g:1280:1: rule__LetExpression__Group__2__Impl : ( ( rule__LetExpression__ExpressionAssignment_2 ) ) ;
    public final void rule__LetExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:1284:1: ( ( ( rule__LetExpression__ExpressionAssignment_2 ) ) )
            // InternalMiniScript.g:1285:1: ( ( rule__LetExpression__ExpressionAssignment_2 ) )
            {
            // InternalMiniScript.g:1285:1: ( ( rule__LetExpression__ExpressionAssignment_2 ) )
            // InternalMiniScript.g:1286:2: ( rule__LetExpression__ExpressionAssignment_2 )
            {
             before(grammarAccess.getLetExpressionAccess().getExpressionAssignment_2()); 
            // InternalMiniScript.g:1287:2: ( rule__LetExpression__ExpressionAssignment_2 )
            // InternalMiniScript.g:1287:3: rule__LetExpression__ExpressionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__LetExpression__ExpressionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLetExpressionAccess().getExpressionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetExpression__Group__2__Impl"


    // $ANTLR start "rule__LetExpression__Group_1__0"
    // InternalMiniScript.g:1296:1: rule__LetExpression__Group_1__0 : rule__LetExpression__Group_1__0__Impl rule__LetExpression__Group_1__1 ;
    public final void rule__LetExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:1300:1: ( rule__LetExpression__Group_1__0__Impl rule__LetExpression__Group_1__1 )
            // InternalMiniScript.g:1301:2: rule__LetExpression__Group_1__0__Impl rule__LetExpression__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__LetExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LetExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetExpression__Group_1__0"


    // $ANTLR start "rule__LetExpression__Group_1__0__Impl"
    // InternalMiniScript.g:1308:1: rule__LetExpression__Group_1__0__Impl : ( ( rule__LetExpression__AssigmentAssignment_1_0 ) ) ;
    public final void rule__LetExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:1312:1: ( ( ( rule__LetExpression__AssigmentAssignment_1_0 ) ) )
            // InternalMiniScript.g:1313:1: ( ( rule__LetExpression__AssigmentAssignment_1_0 ) )
            {
            // InternalMiniScript.g:1313:1: ( ( rule__LetExpression__AssigmentAssignment_1_0 ) )
            // InternalMiniScript.g:1314:2: ( rule__LetExpression__AssigmentAssignment_1_0 )
            {
             before(grammarAccess.getLetExpressionAccess().getAssigmentAssignment_1_0()); 
            // InternalMiniScript.g:1315:2: ( rule__LetExpression__AssigmentAssignment_1_0 )
            // InternalMiniScript.g:1315:3: rule__LetExpression__AssigmentAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__LetExpression__AssigmentAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getLetExpressionAccess().getAssigmentAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetExpression__Group_1__0__Impl"


    // $ANTLR start "rule__LetExpression__Group_1__1"
    // InternalMiniScript.g:1323:1: rule__LetExpression__Group_1__1 : rule__LetExpression__Group_1__1__Impl ;
    public final void rule__LetExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:1327:1: ( rule__LetExpression__Group_1__1__Impl )
            // InternalMiniScript.g:1328:2: rule__LetExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LetExpression__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetExpression__Group_1__1"


    // $ANTLR start "rule__LetExpression__Group_1__1__Impl"
    // InternalMiniScript.g:1334:1: rule__LetExpression__Group_1__1__Impl : ( ',' ) ;
    public final void rule__LetExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:1338:1: ( ( ',' ) )
            // InternalMiniScript.g:1339:1: ( ',' )
            {
            // InternalMiniScript.g:1339:1: ( ',' )
            // InternalMiniScript.g:1340:2: ','
            {
             before(grammarAccess.getLetExpressionAccess().getCommaKeyword_1_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getLetExpressionAccess().getCommaKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetExpression__Group_1__1__Impl"


    // $ANTLR start "rule__TernaryExpression__Group__0"
    // InternalMiniScript.g:1350:1: rule__TernaryExpression__Group__0 : rule__TernaryExpression__Group__0__Impl rule__TernaryExpression__Group__1 ;
    public final void rule__TernaryExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:1354:1: ( rule__TernaryExpression__Group__0__Impl rule__TernaryExpression__Group__1 )
            // InternalMiniScript.g:1355:2: rule__TernaryExpression__Group__0__Impl rule__TernaryExpression__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__TernaryExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TernaryExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TernaryExpression__Group__0"


    // $ANTLR start "rule__TernaryExpression__Group__0__Impl"
    // InternalMiniScript.g:1362:1: rule__TernaryExpression__Group__0__Impl : ( ( rule__TernaryExpression__OperatorAssignment_0 ) ) ;
    public final void rule__TernaryExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:1366:1: ( ( ( rule__TernaryExpression__OperatorAssignment_0 ) ) )
            // InternalMiniScript.g:1367:1: ( ( rule__TernaryExpression__OperatorAssignment_0 ) )
            {
            // InternalMiniScript.g:1367:1: ( ( rule__TernaryExpression__OperatorAssignment_0 ) )
            // InternalMiniScript.g:1368:2: ( rule__TernaryExpression__OperatorAssignment_0 )
            {
             before(grammarAccess.getTernaryExpressionAccess().getOperatorAssignment_0()); 
            // InternalMiniScript.g:1369:2: ( rule__TernaryExpression__OperatorAssignment_0 )
            // InternalMiniScript.g:1369:3: rule__TernaryExpression__OperatorAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__TernaryExpression__OperatorAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTernaryExpressionAccess().getOperatorAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TernaryExpression__Group__0__Impl"


    // $ANTLR start "rule__TernaryExpression__Group__1"
    // InternalMiniScript.g:1377:1: rule__TernaryExpression__Group__1 : rule__TernaryExpression__Group__1__Impl rule__TernaryExpression__Group__2 ;
    public final void rule__TernaryExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:1381:1: ( rule__TernaryExpression__Group__1__Impl rule__TernaryExpression__Group__2 )
            // InternalMiniScript.g:1382:2: rule__TernaryExpression__Group__1__Impl rule__TernaryExpression__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__TernaryExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TernaryExpression__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TernaryExpression__Group__1"


    // $ANTLR start "rule__TernaryExpression__Group__1__Impl"
    // InternalMiniScript.g:1389:1: rule__TernaryExpression__Group__1__Impl : ( '(' ) ;
    public final void rule__TernaryExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:1393:1: ( ( '(' ) )
            // InternalMiniScript.g:1394:1: ( '(' )
            {
            // InternalMiniScript.g:1394:1: ( '(' )
            // InternalMiniScript.g:1395:2: '('
            {
             before(grammarAccess.getTernaryExpressionAccess().getLeftParenthesisKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getTernaryExpressionAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TernaryExpression__Group__1__Impl"


    // $ANTLR start "rule__TernaryExpression__Group__2"
    // InternalMiniScript.g:1404:1: rule__TernaryExpression__Group__2 : rule__TernaryExpression__Group__2__Impl rule__TernaryExpression__Group__3 ;
    public final void rule__TernaryExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:1408:1: ( rule__TernaryExpression__Group__2__Impl rule__TernaryExpression__Group__3 )
            // InternalMiniScript.g:1409:2: rule__TernaryExpression__Group__2__Impl rule__TernaryExpression__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__TernaryExpression__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TernaryExpression__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TernaryExpression__Group__2"


    // $ANTLR start "rule__TernaryExpression__Group__2__Impl"
    // InternalMiniScript.g:1416:1: rule__TernaryExpression__Group__2__Impl : ( ( rule__TernaryExpression__FirstExpressionAssignment_2 ) ) ;
    public final void rule__TernaryExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:1420:1: ( ( ( rule__TernaryExpression__FirstExpressionAssignment_2 ) ) )
            // InternalMiniScript.g:1421:1: ( ( rule__TernaryExpression__FirstExpressionAssignment_2 ) )
            {
            // InternalMiniScript.g:1421:1: ( ( rule__TernaryExpression__FirstExpressionAssignment_2 ) )
            // InternalMiniScript.g:1422:2: ( rule__TernaryExpression__FirstExpressionAssignment_2 )
            {
             before(grammarAccess.getTernaryExpressionAccess().getFirstExpressionAssignment_2()); 
            // InternalMiniScript.g:1423:2: ( rule__TernaryExpression__FirstExpressionAssignment_2 )
            // InternalMiniScript.g:1423:3: rule__TernaryExpression__FirstExpressionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TernaryExpression__FirstExpressionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTernaryExpressionAccess().getFirstExpressionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TernaryExpression__Group__2__Impl"


    // $ANTLR start "rule__TernaryExpression__Group__3"
    // InternalMiniScript.g:1431:1: rule__TernaryExpression__Group__3 : rule__TernaryExpression__Group__3__Impl rule__TernaryExpression__Group__4 ;
    public final void rule__TernaryExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:1435:1: ( rule__TernaryExpression__Group__3__Impl rule__TernaryExpression__Group__4 )
            // InternalMiniScript.g:1436:2: rule__TernaryExpression__Group__3__Impl rule__TernaryExpression__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__TernaryExpression__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TernaryExpression__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TernaryExpression__Group__3"


    // $ANTLR start "rule__TernaryExpression__Group__3__Impl"
    // InternalMiniScript.g:1443:1: rule__TernaryExpression__Group__3__Impl : ( ',' ) ;
    public final void rule__TernaryExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:1447:1: ( ( ',' ) )
            // InternalMiniScript.g:1448:1: ( ',' )
            {
            // InternalMiniScript.g:1448:1: ( ',' )
            // InternalMiniScript.g:1449:2: ','
            {
             before(grammarAccess.getTernaryExpressionAccess().getCommaKeyword_3()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getTernaryExpressionAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TernaryExpression__Group__3__Impl"


    // $ANTLR start "rule__TernaryExpression__Group__4"
    // InternalMiniScript.g:1458:1: rule__TernaryExpression__Group__4 : rule__TernaryExpression__Group__4__Impl rule__TernaryExpression__Group__5 ;
    public final void rule__TernaryExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:1462:1: ( rule__TernaryExpression__Group__4__Impl rule__TernaryExpression__Group__5 )
            // InternalMiniScript.g:1463:2: rule__TernaryExpression__Group__4__Impl rule__TernaryExpression__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__TernaryExpression__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TernaryExpression__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TernaryExpression__Group__4"


    // $ANTLR start "rule__TernaryExpression__Group__4__Impl"
    // InternalMiniScript.g:1470:1: rule__TernaryExpression__Group__4__Impl : ( ( rule__TernaryExpression__SecondExpressionAssignment_4 ) ) ;
    public final void rule__TernaryExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:1474:1: ( ( ( rule__TernaryExpression__SecondExpressionAssignment_4 ) ) )
            // InternalMiniScript.g:1475:1: ( ( rule__TernaryExpression__SecondExpressionAssignment_4 ) )
            {
            // InternalMiniScript.g:1475:1: ( ( rule__TernaryExpression__SecondExpressionAssignment_4 ) )
            // InternalMiniScript.g:1476:2: ( rule__TernaryExpression__SecondExpressionAssignment_4 )
            {
             before(grammarAccess.getTernaryExpressionAccess().getSecondExpressionAssignment_4()); 
            // InternalMiniScript.g:1477:2: ( rule__TernaryExpression__SecondExpressionAssignment_4 )
            // InternalMiniScript.g:1477:3: rule__TernaryExpression__SecondExpressionAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__TernaryExpression__SecondExpressionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTernaryExpressionAccess().getSecondExpressionAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TernaryExpression__Group__4__Impl"


    // $ANTLR start "rule__TernaryExpression__Group__5"
    // InternalMiniScript.g:1485:1: rule__TernaryExpression__Group__5 : rule__TernaryExpression__Group__5__Impl rule__TernaryExpression__Group__6 ;
    public final void rule__TernaryExpression__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:1489:1: ( rule__TernaryExpression__Group__5__Impl rule__TernaryExpression__Group__6 )
            // InternalMiniScript.g:1490:2: rule__TernaryExpression__Group__5__Impl rule__TernaryExpression__Group__6
            {
            pushFollow(FOLLOW_4);
            rule__TernaryExpression__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TernaryExpression__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TernaryExpression__Group__5"


    // $ANTLR start "rule__TernaryExpression__Group__5__Impl"
    // InternalMiniScript.g:1497:1: rule__TernaryExpression__Group__5__Impl : ( ',' ) ;
    public final void rule__TernaryExpression__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:1501:1: ( ( ',' ) )
            // InternalMiniScript.g:1502:1: ( ',' )
            {
            // InternalMiniScript.g:1502:1: ( ',' )
            // InternalMiniScript.g:1503:2: ','
            {
             before(grammarAccess.getTernaryExpressionAccess().getCommaKeyword_5()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getTernaryExpressionAccess().getCommaKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TernaryExpression__Group__5__Impl"


    // $ANTLR start "rule__TernaryExpression__Group__6"
    // InternalMiniScript.g:1512:1: rule__TernaryExpression__Group__6 : rule__TernaryExpression__Group__6__Impl rule__TernaryExpression__Group__7 ;
    public final void rule__TernaryExpression__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:1516:1: ( rule__TernaryExpression__Group__6__Impl rule__TernaryExpression__Group__7 )
            // InternalMiniScript.g:1517:2: rule__TernaryExpression__Group__6__Impl rule__TernaryExpression__Group__7
            {
            pushFollow(FOLLOW_10);
            rule__TernaryExpression__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TernaryExpression__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TernaryExpression__Group__6"


    // $ANTLR start "rule__TernaryExpression__Group__6__Impl"
    // InternalMiniScript.g:1524:1: rule__TernaryExpression__Group__6__Impl : ( ( rule__TernaryExpression__ThirdExpressionAssignment_6 ) ) ;
    public final void rule__TernaryExpression__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:1528:1: ( ( ( rule__TernaryExpression__ThirdExpressionAssignment_6 ) ) )
            // InternalMiniScript.g:1529:1: ( ( rule__TernaryExpression__ThirdExpressionAssignment_6 ) )
            {
            // InternalMiniScript.g:1529:1: ( ( rule__TernaryExpression__ThirdExpressionAssignment_6 ) )
            // InternalMiniScript.g:1530:2: ( rule__TernaryExpression__ThirdExpressionAssignment_6 )
            {
             before(grammarAccess.getTernaryExpressionAccess().getThirdExpressionAssignment_6()); 
            // InternalMiniScript.g:1531:2: ( rule__TernaryExpression__ThirdExpressionAssignment_6 )
            // InternalMiniScript.g:1531:3: rule__TernaryExpression__ThirdExpressionAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__TernaryExpression__ThirdExpressionAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getTernaryExpressionAccess().getThirdExpressionAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TernaryExpression__Group__6__Impl"


    // $ANTLR start "rule__TernaryExpression__Group__7"
    // InternalMiniScript.g:1539:1: rule__TernaryExpression__Group__7 : rule__TernaryExpression__Group__7__Impl ;
    public final void rule__TernaryExpression__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:1543:1: ( rule__TernaryExpression__Group__7__Impl )
            // InternalMiniScript.g:1544:2: rule__TernaryExpression__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TernaryExpression__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TernaryExpression__Group__7"


    // $ANTLR start "rule__TernaryExpression__Group__7__Impl"
    // InternalMiniScript.g:1550:1: rule__TernaryExpression__Group__7__Impl : ( ')' ) ;
    public final void rule__TernaryExpression__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:1554:1: ( ( ')' ) )
            // InternalMiniScript.g:1555:1: ( ')' )
            {
            // InternalMiniScript.g:1555:1: ( ')' )
            // InternalMiniScript.g:1556:2: ')'
            {
             before(grammarAccess.getTernaryExpressionAccess().getRightParenthesisKeyword_7()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getTernaryExpressionAccess().getRightParenthesisKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TernaryExpression__Group__7__Impl"


    // $ANTLR start "rule__LogicalBinaryExpression__Group__0"
    // InternalMiniScript.g:1566:1: rule__LogicalBinaryExpression__Group__0 : rule__LogicalBinaryExpression__Group__0__Impl rule__LogicalBinaryExpression__Group__1 ;
    public final void rule__LogicalBinaryExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:1570:1: ( rule__LogicalBinaryExpression__Group__0__Impl rule__LogicalBinaryExpression__Group__1 )
            // InternalMiniScript.g:1571:2: rule__LogicalBinaryExpression__Group__0__Impl rule__LogicalBinaryExpression__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__LogicalBinaryExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LogicalBinaryExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalBinaryExpression__Group__0"


    // $ANTLR start "rule__LogicalBinaryExpression__Group__0__Impl"
    // InternalMiniScript.g:1578:1: rule__LogicalBinaryExpression__Group__0__Impl : ( ( rule__LogicalBinaryExpression__OperatorAssignment_0 ) ) ;
    public final void rule__LogicalBinaryExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:1582:1: ( ( ( rule__LogicalBinaryExpression__OperatorAssignment_0 ) ) )
            // InternalMiniScript.g:1583:1: ( ( rule__LogicalBinaryExpression__OperatorAssignment_0 ) )
            {
            // InternalMiniScript.g:1583:1: ( ( rule__LogicalBinaryExpression__OperatorAssignment_0 ) )
            // InternalMiniScript.g:1584:2: ( rule__LogicalBinaryExpression__OperatorAssignment_0 )
            {
             before(grammarAccess.getLogicalBinaryExpressionAccess().getOperatorAssignment_0()); 
            // InternalMiniScript.g:1585:2: ( rule__LogicalBinaryExpression__OperatorAssignment_0 )
            // InternalMiniScript.g:1585:3: rule__LogicalBinaryExpression__OperatorAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__LogicalBinaryExpression__OperatorAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getLogicalBinaryExpressionAccess().getOperatorAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalBinaryExpression__Group__0__Impl"


    // $ANTLR start "rule__LogicalBinaryExpression__Group__1"
    // InternalMiniScript.g:1593:1: rule__LogicalBinaryExpression__Group__1 : rule__LogicalBinaryExpression__Group__1__Impl rule__LogicalBinaryExpression__Group__2 ;
    public final void rule__LogicalBinaryExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:1597:1: ( rule__LogicalBinaryExpression__Group__1__Impl rule__LogicalBinaryExpression__Group__2 )
            // InternalMiniScript.g:1598:2: rule__LogicalBinaryExpression__Group__1__Impl rule__LogicalBinaryExpression__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__LogicalBinaryExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LogicalBinaryExpression__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalBinaryExpression__Group__1"


    // $ANTLR start "rule__LogicalBinaryExpression__Group__1__Impl"
    // InternalMiniScript.g:1605:1: rule__LogicalBinaryExpression__Group__1__Impl : ( '(' ) ;
    public final void rule__LogicalBinaryExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:1609:1: ( ( '(' ) )
            // InternalMiniScript.g:1610:1: ( '(' )
            {
            // InternalMiniScript.g:1610:1: ( '(' )
            // InternalMiniScript.g:1611:2: '('
            {
             before(grammarAccess.getLogicalBinaryExpressionAccess().getLeftParenthesisKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getLogicalBinaryExpressionAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalBinaryExpression__Group__1__Impl"


    // $ANTLR start "rule__LogicalBinaryExpression__Group__2"
    // InternalMiniScript.g:1620:1: rule__LogicalBinaryExpression__Group__2 : rule__LogicalBinaryExpression__Group__2__Impl rule__LogicalBinaryExpression__Group__3 ;
    public final void rule__LogicalBinaryExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:1624:1: ( rule__LogicalBinaryExpression__Group__2__Impl rule__LogicalBinaryExpression__Group__3 )
            // InternalMiniScript.g:1625:2: rule__LogicalBinaryExpression__Group__2__Impl rule__LogicalBinaryExpression__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__LogicalBinaryExpression__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LogicalBinaryExpression__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalBinaryExpression__Group__2"


    // $ANTLR start "rule__LogicalBinaryExpression__Group__2__Impl"
    // InternalMiniScript.g:1632:1: rule__LogicalBinaryExpression__Group__2__Impl : ( ( rule__LogicalBinaryExpression__LeftExprAssignment_2 ) ) ;
    public final void rule__LogicalBinaryExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:1636:1: ( ( ( rule__LogicalBinaryExpression__LeftExprAssignment_2 ) ) )
            // InternalMiniScript.g:1637:1: ( ( rule__LogicalBinaryExpression__LeftExprAssignment_2 ) )
            {
            // InternalMiniScript.g:1637:1: ( ( rule__LogicalBinaryExpression__LeftExprAssignment_2 ) )
            // InternalMiniScript.g:1638:2: ( rule__LogicalBinaryExpression__LeftExprAssignment_2 )
            {
             before(grammarAccess.getLogicalBinaryExpressionAccess().getLeftExprAssignment_2()); 
            // InternalMiniScript.g:1639:2: ( rule__LogicalBinaryExpression__LeftExprAssignment_2 )
            // InternalMiniScript.g:1639:3: rule__LogicalBinaryExpression__LeftExprAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__LogicalBinaryExpression__LeftExprAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLogicalBinaryExpressionAccess().getLeftExprAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalBinaryExpression__Group__2__Impl"


    // $ANTLR start "rule__LogicalBinaryExpression__Group__3"
    // InternalMiniScript.g:1647:1: rule__LogicalBinaryExpression__Group__3 : rule__LogicalBinaryExpression__Group__3__Impl rule__LogicalBinaryExpression__Group__4 ;
    public final void rule__LogicalBinaryExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:1651:1: ( rule__LogicalBinaryExpression__Group__3__Impl rule__LogicalBinaryExpression__Group__4 )
            // InternalMiniScript.g:1652:2: rule__LogicalBinaryExpression__Group__3__Impl rule__LogicalBinaryExpression__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__LogicalBinaryExpression__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LogicalBinaryExpression__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalBinaryExpression__Group__3"


    // $ANTLR start "rule__LogicalBinaryExpression__Group__3__Impl"
    // InternalMiniScript.g:1659:1: rule__LogicalBinaryExpression__Group__3__Impl : ( ',' ) ;
    public final void rule__LogicalBinaryExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:1663:1: ( ( ',' ) )
            // InternalMiniScript.g:1664:1: ( ',' )
            {
            // InternalMiniScript.g:1664:1: ( ',' )
            // InternalMiniScript.g:1665:2: ','
            {
             before(grammarAccess.getLogicalBinaryExpressionAccess().getCommaKeyword_3()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getLogicalBinaryExpressionAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalBinaryExpression__Group__3__Impl"


    // $ANTLR start "rule__LogicalBinaryExpression__Group__4"
    // InternalMiniScript.g:1674:1: rule__LogicalBinaryExpression__Group__4 : rule__LogicalBinaryExpression__Group__4__Impl rule__LogicalBinaryExpression__Group__5 ;
    public final void rule__LogicalBinaryExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:1678:1: ( rule__LogicalBinaryExpression__Group__4__Impl rule__LogicalBinaryExpression__Group__5 )
            // InternalMiniScript.g:1679:2: rule__LogicalBinaryExpression__Group__4__Impl rule__LogicalBinaryExpression__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__LogicalBinaryExpression__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LogicalBinaryExpression__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalBinaryExpression__Group__4"


    // $ANTLR start "rule__LogicalBinaryExpression__Group__4__Impl"
    // InternalMiniScript.g:1686:1: rule__LogicalBinaryExpression__Group__4__Impl : ( ( rule__LogicalBinaryExpression__RightExprAssignment_4 ) ) ;
    public final void rule__LogicalBinaryExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:1690:1: ( ( ( rule__LogicalBinaryExpression__RightExprAssignment_4 ) ) )
            // InternalMiniScript.g:1691:1: ( ( rule__LogicalBinaryExpression__RightExprAssignment_4 ) )
            {
            // InternalMiniScript.g:1691:1: ( ( rule__LogicalBinaryExpression__RightExprAssignment_4 ) )
            // InternalMiniScript.g:1692:2: ( rule__LogicalBinaryExpression__RightExprAssignment_4 )
            {
             before(grammarAccess.getLogicalBinaryExpressionAccess().getRightExprAssignment_4()); 
            // InternalMiniScript.g:1693:2: ( rule__LogicalBinaryExpression__RightExprAssignment_4 )
            // InternalMiniScript.g:1693:3: rule__LogicalBinaryExpression__RightExprAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__LogicalBinaryExpression__RightExprAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getLogicalBinaryExpressionAccess().getRightExprAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalBinaryExpression__Group__4__Impl"


    // $ANTLR start "rule__LogicalBinaryExpression__Group__5"
    // InternalMiniScript.g:1701:1: rule__LogicalBinaryExpression__Group__5 : rule__LogicalBinaryExpression__Group__5__Impl ;
    public final void rule__LogicalBinaryExpression__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:1705:1: ( rule__LogicalBinaryExpression__Group__5__Impl )
            // InternalMiniScript.g:1706:2: rule__LogicalBinaryExpression__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LogicalBinaryExpression__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalBinaryExpression__Group__5"


    // $ANTLR start "rule__LogicalBinaryExpression__Group__5__Impl"
    // InternalMiniScript.g:1712:1: rule__LogicalBinaryExpression__Group__5__Impl : ( ')' ) ;
    public final void rule__LogicalBinaryExpression__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:1716:1: ( ( ')' ) )
            // InternalMiniScript.g:1717:1: ( ')' )
            {
            // InternalMiniScript.g:1717:1: ( ')' )
            // InternalMiniScript.g:1718:2: ')'
            {
             before(grammarAccess.getLogicalBinaryExpressionAccess().getRightParenthesisKeyword_5()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getLogicalBinaryExpressionAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalBinaryExpression__Group__5__Impl"


    // $ANTLR start "rule__LogicalUnaryExpression__Group__0"
    // InternalMiniScript.g:1728:1: rule__LogicalUnaryExpression__Group__0 : rule__LogicalUnaryExpression__Group__0__Impl rule__LogicalUnaryExpression__Group__1 ;
    public final void rule__LogicalUnaryExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:1732:1: ( rule__LogicalUnaryExpression__Group__0__Impl rule__LogicalUnaryExpression__Group__1 )
            // InternalMiniScript.g:1733:2: rule__LogicalUnaryExpression__Group__0__Impl rule__LogicalUnaryExpression__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__LogicalUnaryExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LogicalUnaryExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalUnaryExpression__Group__0"


    // $ANTLR start "rule__LogicalUnaryExpression__Group__0__Impl"
    // InternalMiniScript.g:1740:1: rule__LogicalUnaryExpression__Group__0__Impl : ( ( rule__LogicalUnaryExpression__OperatorAssignment_0 ) ) ;
    public final void rule__LogicalUnaryExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:1744:1: ( ( ( rule__LogicalUnaryExpression__OperatorAssignment_0 ) ) )
            // InternalMiniScript.g:1745:1: ( ( rule__LogicalUnaryExpression__OperatorAssignment_0 ) )
            {
            // InternalMiniScript.g:1745:1: ( ( rule__LogicalUnaryExpression__OperatorAssignment_0 ) )
            // InternalMiniScript.g:1746:2: ( rule__LogicalUnaryExpression__OperatorAssignment_0 )
            {
             before(grammarAccess.getLogicalUnaryExpressionAccess().getOperatorAssignment_0()); 
            // InternalMiniScript.g:1747:2: ( rule__LogicalUnaryExpression__OperatorAssignment_0 )
            // InternalMiniScript.g:1747:3: rule__LogicalUnaryExpression__OperatorAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__LogicalUnaryExpression__OperatorAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getLogicalUnaryExpressionAccess().getOperatorAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalUnaryExpression__Group__0__Impl"


    // $ANTLR start "rule__LogicalUnaryExpression__Group__1"
    // InternalMiniScript.g:1755:1: rule__LogicalUnaryExpression__Group__1 : rule__LogicalUnaryExpression__Group__1__Impl rule__LogicalUnaryExpression__Group__2 ;
    public final void rule__LogicalUnaryExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:1759:1: ( rule__LogicalUnaryExpression__Group__1__Impl rule__LogicalUnaryExpression__Group__2 )
            // InternalMiniScript.g:1760:2: rule__LogicalUnaryExpression__Group__1__Impl rule__LogicalUnaryExpression__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__LogicalUnaryExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LogicalUnaryExpression__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalUnaryExpression__Group__1"


    // $ANTLR start "rule__LogicalUnaryExpression__Group__1__Impl"
    // InternalMiniScript.g:1767:1: rule__LogicalUnaryExpression__Group__1__Impl : ( '(' ) ;
    public final void rule__LogicalUnaryExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:1771:1: ( ( '(' ) )
            // InternalMiniScript.g:1772:1: ( '(' )
            {
            // InternalMiniScript.g:1772:1: ( '(' )
            // InternalMiniScript.g:1773:2: '('
            {
             before(grammarAccess.getLogicalUnaryExpressionAccess().getLeftParenthesisKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getLogicalUnaryExpressionAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalUnaryExpression__Group__1__Impl"


    // $ANTLR start "rule__LogicalUnaryExpression__Group__2"
    // InternalMiniScript.g:1782:1: rule__LogicalUnaryExpression__Group__2 : rule__LogicalUnaryExpression__Group__2__Impl rule__LogicalUnaryExpression__Group__3 ;
    public final void rule__LogicalUnaryExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:1786:1: ( rule__LogicalUnaryExpression__Group__2__Impl rule__LogicalUnaryExpression__Group__3 )
            // InternalMiniScript.g:1787:2: rule__LogicalUnaryExpression__Group__2__Impl rule__LogicalUnaryExpression__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__LogicalUnaryExpression__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LogicalUnaryExpression__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalUnaryExpression__Group__2"


    // $ANTLR start "rule__LogicalUnaryExpression__Group__2__Impl"
    // InternalMiniScript.g:1794:1: rule__LogicalUnaryExpression__Group__2__Impl : ( ( rule__LogicalUnaryExpression__ExpressionAssignment_2 ) ) ;
    public final void rule__LogicalUnaryExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:1798:1: ( ( ( rule__LogicalUnaryExpression__ExpressionAssignment_2 ) ) )
            // InternalMiniScript.g:1799:1: ( ( rule__LogicalUnaryExpression__ExpressionAssignment_2 ) )
            {
            // InternalMiniScript.g:1799:1: ( ( rule__LogicalUnaryExpression__ExpressionAssignment_2 ) )
            // InternalMiniScript.g:1800:2: ( rule__LogicalUnaryExpression__ExpressionAssignment_2 )
            {
             before(grammarAccess.getLogicalUnaryExpressionAccess().getExpressionAssignment_2()); 
            // InternalMiniScript.g:1801:2: ( rule__LogicalUnaryExpression__ExpressionAssignment_2 )
            // InternalMiniScript.g:1801:3: rule__LogicalUnaryExpression__ExpressionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__LogicalUnaryExpression__ExpressionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLogicalUnaryExpressionAccess().getExpressionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalUnaryExpression__Group__2__Impl"


    // $ANTLR start "rule__LogicalUnaryExpression__Group__3"
    // InternalMiniScript.g:1809:1: rule__LogicalUnaryExpression__Group__3 : rule__LogicalUnaryExpression__Group__3__Impl ;
    public final void rule__LogicalUnaryExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:1813:1: ( rule__LogicalUnaryExpression__Group__3__Impl )
            // InternalMiniScript.g:1814:2: rule__LogicalUnaryExpression__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LogicalUnaryExpression__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalUnaryExpression__Group__3"


    // $ANTLR start "rule__LogicalUnaryExpression__Group__3__Impl"
    // InternalMiniScript.g:1820:1: rule__LogicalUnaryExpression__Group__3__Impl : ( ')' ) ;
    public final void rule__LogicalUnaryExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:1824:1: ( ( ')' ) )
            // InternalMiniScript.g:1825:1: ( ')' )
            {
            // InternalMiniScript.g:1825:1: ( ')' )
            // InternalMiniScript.g:1826:2: ')'
            {
             before(grammarAccess.getLogicalUnaryExpressionAccess().getRightParenthesisKeyword_3()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getLogicalUnaryExpressionAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalUnaryExpression__Group__3__Impl"


    // $ANTLR start "rule__ComparisonExpression__Group__0"
    // InternalMiniScript.g:1836:1: rule__ComparisonExpression__Group__0 : rule__ComparisonExpression__Group__0__Impl rule__ComparisonExpression__Group__1 ;
    public final void rule__ComparisonExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:1840:1: ( rule__ComparisonExpression__Group__0__Impl rule__ComparisonExpression__Group__1 )
            // InternalMiniScript.g:1841:2: rule__ComparisonExpression__Group__0__Impl rule__ComparisonExpression__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__ComparisonExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group__0"


    // $ANTLR start "rule__ComparisonExpression__Group__0__Impl"
    // InternalMiniScript.g:1848:1: rule__ComparisonExpression__Group__0__Impl : ( ruleNumericExpression ) ;
    public final void rule__ComparisonExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:1852:1: ( ( ruleNumericExpression ) )
            // InternalMiniScript.g:1853:1: ( ruleNumericExpression )
            {
            // InternalMiniScript.g:1853:1: ( ruleNumericExpression )
            // InternalMiniScript.g:1854:2: ruleNumericExpression
            {
             before(grammarAccess.getComparisonExpressionAccess().getNumericExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleNumericExpression();

            state._fsp--;

             after(grammarAccess.getComparisonExpressionAccess().getNumericExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group__0__Impl"


    // $ANTLR start "rule__ComparisonExpression__Group__1"
    // InternalMiniScript.g:1863:1: rule__ComparisonExpression__Group__1 : rule__ComparisonExpression__Group__1__Impl ;
    public final void rule__ComparisonExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:1867:1: ( rule__ComparisonExpression__Group__1__Impl )
            // InternalMiniScript.g:1868:2: rule__ComparisonExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group__1"


    // $ANTLR start "rule__ComparisonExpression__Group__1__Impl"
    // InternalMiniScript.g:1874:1: rule__ComparisonExpression__Group__1__Impl : ( ( rule__ComparisonExpression__Group_1__0 )? ) ;
    public final void rule__ComparisonExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:1878:1: ( ( ( rule__ComparisonExpression__Group_1__0 )? ) )
            // InternalMiniScript.g:1879:1: ( ( rule__ComparisonExpression__Group_1__0 )? )
            {
            // InternalMiniScript.g:1879:1: ( ( rule__ComparisonExpression__Group_1__0 )? )
            // InternalMiniScript.g:1880:2: ( rule__ComparisonExpression__Group_1__0 )?
            {
             before(grammarAccess.getComparisonExpressionAccess().getGroup_1()); 
            // InternalMiniScript.g:1881:2: ( rule__ComparisonExpression__Group_1__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=17 && LA12_0<=22)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMiniScript.g:1881:3: rule__ComparisonExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComparisonExpression__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComparisonExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group__1__Impl"


    // $ANTLR start "rule__ComparisonExpression__Group_1__0"
    // InternalMiniScript.g:1890:1: rule__ComparisonExpression__Group_1__0 : rule__ComparisonExpression__Group_1__0__Impl rule__ComparisonExpression__Group_1__1 ;
    public final void rule__ComparisonExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:1894:1: ( rule__ComparisonExpression__Group_1__0__Impl rule__ComparisonExpression__Group_1__1 )
            // InternalMiniScript.g:1895:2: rule__ComparisonExpression__Group_1__0__Impl rule__ComparisonExpression__Group_1__1
            {
            pushFollow(FOLLOW_11);
            rule__ComparisonExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group_1__0"


    // $ANTLR start "rule__ComparisonExpression__Group_1__0__Impl"
    // InternalMiniScript.g:1902:1: rule__ComparisonExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__ComparisonExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:1906:1: ( ( () ) )
            // InternalMiniScript.g:1907:1: ( () )
            {
            // InternalMiniScript.g:1907:1: ( () )
            // InternalMiniScript.g:1908:2: ()
            {
             before(grammarAccess.getComparisonExpressionAccess().getComparisonExpressionLeftExprAction_1_0()); 
            // InternalMiniScript.g:1909:2: ()
            // InternalMiniScript.g:1909:3: 
            {
            }

             after(grammarAccess.getComparisonExpressionAccess().getComparisonExpressionLeftExprAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group_1__0__Impl"


    // $ANTLR start "rule__ComparisonExpression__Group_1__1"
    // InternalMiniScript.g:1917:1: rule__ComparisonExpression__Group_1__1 : rule__ComparisonExpression__Group_1__1__Impl rule__ComparisonExpression__Group_1__2 ;
    public final void rule__ComparisonExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:1921:1: ( rule__ComparisonExpression__Group_1__1__Impl rule__ComparisonExpression__Group_1__2 )
            // InternalMiniScript.g:1922:2: rule__ComparisonExpression__Group_1__1__Impl rule__ComparisonExpression__Group_1__2
            {
            pushFollow(FOLLOW_12);
            rule__ComparisonExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group_1__1"


    // $ANTLR start "rule__ComparisonExpression__Group_1__1__Impl"
    // InternalMiniScript.g:1929:1: rule__ComparisonExpression__Group_1__1__Impl : ( ( rule__ComparisonExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__ComparisonExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:1933:1: ( ( ( rule__ComparisonExpression__OperatorAssignment_1_1 ) ) )
            // InternalMiniScript.g:1934:1: ( ( rule__ComparisonExpression__OperatorAssignment_1_1 ) )
            {
            // InternalMiniScript.g:1934:1: ( ( rule__ComparisonExpression__OperatorAssignment_1_1 ) )
            // InternalMiniScript.g:1935:2: ( rule__ComparisonExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getComparisonExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalMiniScript.g:1936:2: ( rule__ComparisonExpression__OperatorAssignment_1_1 )
            // InternalMiniScript.g:1936:3: rule__ComparisonExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getComparisonExpressionAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group_1__1__Impl"


    // $ANTLR start "rule__ComparisonExpression__Group_1__2"
    // InternalMiniScript.g:1944:1: rule__ComparisonExpression__Group_1__2 : rule__ComparisonExpression__Group_1__2__Impl ;
    public final void rule__ComparisonExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:1948:1: ( rule__ComparisonExpression__Group_1__2__Impl )
            // InternalMiniScript.g:1949:2: rule__ComparisonExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group_1__2"


    // $ANTLR start "rule__ComparisonExpression__Group_1__2__Impl"
    // InternalMiniScript.g:1955:1: rule__ComparisonExpression__Group_1__2__Impl : ( ( rule__ComparisonExpression__RightExprAssignment_1_2 ) ) ;
    public final void rule__ComparisonExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:1959:1: ( ( ( rule__ComparisonExpression__RightExprAssignment_1_2 ) ) )
            // InternalMiniScript.g:1960:1: ( ( rule__ComparisonExpression__RightExprAssignment_1_2 ) )
            {
            // InternalMiniScript.g:1960:1: ( ( rule__ComparisonExpression__RightExprAssignment_1_2 ) )
            // InternalMiniScript.g:1961:2: ( rule__ComparisonExpression__RightExprAssignment_1_2 )
            {
             before(grammarAccess.getComparisonExpressionAccess().getRightExprAssignment_1_2()); 
            // InternalMiniScript.g:1962:2: ( rule__ComparisonExpression__RightExprAssignment_1_2 )
            // InternalMiniScript.g:1962:3: rule__ComparisonExpression__RightExprAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__RightExprAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getComparisonExpressionAccess().getRightExprAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group_1__2__Impl"


    // $ANTLR start "rule__FunctionDeclaration__Group__0"
    // InternalMiniScript.g:1971:1: rule__FunctionDeclaration__Group__0 : rule__FunctionDeclaration__Group__0__Impl rule__FunctionDeclaration__Group__1 ;
    public final void rule__FunctionDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:1975:1: ( rule__FunctionDeclaration__Group__0__Impl rule__FunctionDeclaration__Group__1 )
            // InternalMiniScript.g:1976:2: rule__FunctionDeclaration__Group__0__Impl rule__FunctionDeclaration__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__FunctionDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__Group__0"


    // $ANTLR start "rule__FunctionDeclaration__Group__0__Impl"
    // InternalMiniScript.g:1983:1: rule__FunctionDeclaration__Group__0__Impl : ( 'func' ) ;
    public final void rule__FunctionDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:1987:1: ( ( 'func' ) )
            // InternalMiniScript.g:1988:1: ( 'func' )
            {
            // InternalMiniScript.g:1988:1: ( 'func' )
            // InternalMiniScript.g:1989:2: 'func'
            {
             before(grammarAccess.getFunctionDeclarationAccess().getFuncKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getFunctionDeclarationAccess().getFuncKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__Group__0__Impl"


    // $ANTLR start "rule__FunctionDeclaration__Group__1"
    // InternalMiniScript.g:1998:1: rule__FunctionDeclaration__Group__1 : rule__FunctionDeclaration__Group__1__Impl rule__FunctionDeclaration__Group__2 ;
    public final void rule__FunctionDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:2002:1: ( rule__FunctionDeclaration__Group__1__Impl rule__FunctionDeclaration__Group__2 )
            // InternalMiniScript.g:2003:2: rule__FunctionDeclaration__Group__1__Impl rule__FunctionDeclaration__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__FunctionDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__Group__1"


    // $ANTLR start "rule__FunctionDeclaration__Group__1__Impl"
    // InternalMiniScript.g:2010:1: rule__FunctionDeclaration__Group__1__Impl : ( '(' ) ;
    public final void rule__FunctionDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:2014:1: ( ( '(' ) )
            // InternalMiniScript.g:2015:1: ( '(' )
            {
            // InternalMiniScript.g:2015:1: ( '(' )
            // InternalMiniScript.g:2016:2: '('
            {
             before(grammarAccess.getFunctionDeclarationAccess().getLeftParenthesisKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getFunctionDeclarationAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__Group__1__Impl"


    // $ANTLR start "rule__FunctionDeclaration__Group__2"
    // InternalMiniScript.g:2025:1: rule__FunctionDeclaration__Group__2 : rule__FunctionDeclaration__Group__2__Impl rule__FunctionDeclaration__Group__3 ;
    public final void rule__FunctionDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:2029:1: ( rule__FunctionDeclaration__Group__2__Impl rule__FunctionDeclaration__Group__3 )
            // InternalMiniScript.g:2030:2: rule__FunctionDeclaration__Group__2__Impl rule__FunctionDeclaration__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__FunctionDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionDeclaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__Group__2"


    // $ANTLR start "rule__FunctionDeclaration__Group__2__Impl"
    // InternalMiniScript.g:2037:1: rule__FunctionDeclaration__Group__2__Impl : ( ( rule__FunctionDeclaration__Group_2__0 )? ) ;
    public final void rule__FunctionDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:2041:1: ( ( ( rule__FunctionDeclaration__Group_2__0 )? ) )
            // InternalMiniScript.g:2042:1: ( ( rule__FunctionDeclaration__Group_2__0 )? )
            {
            // InternalMiniScript.g:2042:1: ( ( rule__FunctionDeclaration__Group_2__0 )? )
            // InternalMiniScript.g:2043:2: ( rule__FunctionDeclaration__Group_2__0 )?
            {
             before(grammarAccess.getFunctionDeclarationAccess().getGroup_2()); 
            // InternalMiniScript.g:2044:2: ( rule__FunctionDeclaration__Group_2__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMiniScript.g:2044:3: rule__FunctionDeclaration__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FunctionDeclaration__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunctionDeclarationAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__Group__2__Impl"


    // $ANTLR start "rule__FunctionDeclaration__Group__3"
    // InternalMiniScript.g:2052:1: rule__FunctionDeclaration__Group__3 : rule__FunctionDeclaration__Group__3__Impl rule__FunctionDeclaration__Group__4 ;
    public final void rule__FunctionDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:2056:1: ( rule__FunctionDeclaration__Group__3__Impl rule__FunctionDeclaration__Group__4 )
            // InternalMiniScript.g:2057:2: rule__FunctionDeclaration__Group__3__Impl rule__FunctionDeclaration__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__FunctionDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionDeclaration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__Group__3"


    // $ANTLR start "rule__FunctionDeclaration__Group__3__Impl"
    // InternalMiniScript.g:2064:1: rule__FunctionDeclaration__Group__3__Impl : ( ')' ) ;
    public final void rule__FunctionDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:2068:1: ( ( ')' ) )
            // InternalMiniScript.g:2069:1: ( ')' )
            {
            // InternalMiniScript.g:2069:1: ( ')' )
            // InternalMiniScript.g:2070:2: ')'
            {
             before(grammarAccess.getFunctionDeclarationAccess().getRightParenthesisKeyword_3()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getFunctionDeclarationAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__Group__3__Impl"


    // $ANTLR start "rule__FunctionDeclaration__Group__4"
    // InternalMiniScript.g:2079:1: rule__FunctionDeclaration__Group__4 : rule__FunctionDeclaration__Group__4__Impl ;
    public final void rule__FunctionDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:2083:1: ( rule__FunctionDeclaration__Group__4__Impl )
            // InternalMiniScript.g:2084:2: rule__FunctionDeclaration__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FunctionDeclaration__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__Group__4"


    // $ANTLR start "rule__FunctionDeclaration__Group__4__Impl"
    // InternalMiniScript.g:2090:1: rule__FunctionDeclaration__Group__4__Impl : ( ( rule__FunctionDeclaration__BodyAssignment_4 ) ) ;
    public final void rule__FunctionDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:2094:1: ( ( ( rule__FunctionDeclaration__BodyAssignment_4 ) ) )
            // InternalMiniScript.g:2095:1: ( ( rule__FunctionDeclaration__BodyAssignment_4 ) )
            {
            // InternalMiniScript.g:2095:1: ( ( rule__FunctionDeclaration__BodyAssignment_4 ) )
            // InternalMiniScript.g:2096:2: ( rule__FunctionDeclaration__BodyAssignment_4 )
            {
             before(grammarAccess.getFunctionDeclarationAccess().getBodyAssignment_4()); 
            // InternalMiniScript.g:2097:2: ( rule__FunctionDeclaration__BodyAssignment_4 )
            // InternalMiniScript.g:2097:3: rule__FunctionDeclaration__BodyAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__FunctionDeclaration__BodyAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getFunctionDeclarationAccess().getBodyAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__Group__4__Impl"


    // $ANTLR start "rule__FunctionDeclaration__Group_2__0"
    // InternalMiniScript.g:2106:1: rule__FunctionDeclaration__Group_2__0 : rule__FunctionDeclaration__Group_2__0__Impl rule__FunctionDeclaration__Group_2__1 ;
    public final void rule__FunctionDeclaration__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:2110:1: ( rule__FunctionDeclaration__Group_2__0__Impl rule__FunctionDeclaration__Group_2__1 )
            // InternalMiniScript.g:2111:2: rule__FunctionDeclaration__Group_2__0__Impl rule__FunctionDeclaration__Group_2__1
            {
            pushFollow(FOLLOW_8);
            rule__FunctionDeclaration__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionDeclaration__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__Group_2__0"


    // $ANTLR start "rule__FunctionDeclaration__Group_2__0__Impl"
    // InternalMiniScript.g:2118:1: rule__FunctionDeclaration__Group_2__0__Impl : ( ( rule__FunctionDeclaration__ParametersAssignment_2_0 ) ) ;
    public final void rule__FunctionDeclaration__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:2122:1: ( ( ( rule__FunctionDeclaration__ParametersAssignment_2_0 ) ) )
            // InternalMiniScript.g:2123:1: ( ( rule__FunctionDeclaration__ParametersAssignment_2_0 ) )
            {
            // InternalMiniScript.g:2123:1: ( ( rule__FunctionDeclaration__ParametersAssignment_2_0 ) )
            // InternalMiniScript.g:2124:2: ( rule__FunctionDeclaration__ParametersAssignment_2_0 )
            {
             before(grammarAccess.getFunctionDeclarationAccess().getParametersAssignment_2_0()); 
            // InternalMiniScript.g:2125:2: ( rule__FunctionDeclaration__ParametersAssignment_2_0 )
            // InternalMiniScript.g:2125:3: rule__FunctionDeclaration__ParametersAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__FunctionDeclaration__ParametersAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionDeclarationAccess().getParametersAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__Group_2__0__Impl"


    // $ANTLR start "rule__FunctionDeclaration__Group_2__1"
    // InternalMiniScript.g:2133:1: rule__FunctionDeclaration__Group_2__1 : rule__FunctionDeclaration__Group_2__1__Impl ;
    public final void rule__FunctionDeclaration__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:2137:1: ( rule__FunctionDeclaration__Group_2__1__Impl )
            // InternalMiniScript.g:2138:2: rule__FunctionDeclaration__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FunctionDeclaration__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__Group_2__1"


    // $ANTLR start "rule__FunctionDeclaration__Group_2__1__Impl"
    // InternalMiniScript.g:2144:1: rule__FunctionDeclaration__Group_2__1__Impl : ( ( rule__FunctionDeclaration__Group_2_1__0 )* ) ;
    public final void rule__FunctionDeclaration__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:2148:1: ( ( ( rule__FunctionDeclaration__Group_2_1__0 )* ) )
            // InternalMiniScript.g:2149:1: ( ( rule__FunctionDeclaration__Group_2_1__0 )* )
            {
            // InternalMiniScript.g:2149:1: ( ( rule__FunctionDeclaration__Group_2_1__0 )* )
            // InternalMiniScript.g:2150:2: ( rule__FunctionDeclaration__Group_2_1__0 )*
            {
             before(grammarAccess.getFunctionDeclarationAccess().getGroup_2_1()); 
            // InternalMiniScript.g:2151:2: ( rule__FunctionDeclaration__Group_2_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==31) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMiniScript.g:2151:3: rule__FunctionDeclaration__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__FunctionDeclaration__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getFunctionDeclarationAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__Group_2__1__Impl"


    // $ANTLR start "rule__FunctionDeclaration__Group_2_1__0"
    // InternalMiniScript.g:2160:1: rule__FunctionDeclaration__Group_2_1__0 : rule__FunctionDeclaration__Group_2_1__0__Impl rule__FunctionDeclaration__Group_2_1__1 ;
    public final void rule__FunctionDeclaration__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:2164:1: ( rule__FunctionDeclaration__Group_2_1__0__Impl rule__FunctionDeclaration__Group_2_1__1 )
            // InternalMiniScript.g:2165:2: rule__FunctionDeclaration__Group_2_1__0__Impl rule__FunctionDeclaration__Group_2_1__1
            {
            pushFollow(FOLLOW_7);
            rule__FunctionDeclaration__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionDeclaration__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__Group_2_1__0"


    // $ANTLR start "rule__FunctionDeclaration__Group_2_1__0__Impl"
    // InternalMiniScript.g:2172:1: rule__FunctionDeclaration__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__FunctionDeclaration__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:2176:1: ( ( ',' ) )
            // InternalMiniScript.g:2177:1: ( ',' )
            {
            // InternalMiniScript.g:2177:1: ( ',' )
            // InternalMiniScript.g:2178:2: ','
            {
             before(grammarAccess.getFunctionDeclarationAccess().getCommaKeyword_2_1_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getFunctionDeclarationAccess().getCommaKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__Group_2_1__0__Impl"


    // $ANTLR start "rule__FunctionDeclaration__Group_2_1__1"
    // InternalMiniScript.g:2187:1: rule__FunctionDeclaration__Group_2_1__1 : rule__FunctionDeclaration__Group_2_1__1__Impl ;
    public final void rule__FunctionDeclaration__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:2191:1: ( rule__FunctionDeclaration__Group_2_1__1__Impl )
            // InternalMiniScript.g:2192:2: rule__FunctionDeclaration__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FunctionDeclaration__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__Group_2_1__1"


    // $ANTLR start "rule__FunctionDeclaration__Group_2_1__1__Impl"
    // InternalMiniScript.g:2198:1: rule__FunctionDeclaration__Group_2_1__1__Impl : ( ( rule__FunctionDeclaration__ParametersAssignment_2_1_1 ) ) ;
    public final void rule__FunctionDeclaration__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:2202:1: ( ( ( rule__FunctionDeclaration__ParametersAssignment_2_1_1 ) ) )
            // InternalMiniScript.g:2203:1: ( ( rule__FunctionDeclaration__ParametersAssignment_2_1_1 ) )
            {
            // InternalMiniScript.g:2203:1: ( ( rule__FunctionDeclaration__ParametersAssignment_2_1_1 ) )
            // InternalMiniScript.g:2204:2: ( rule__FunctionDeclaration__ParametersAssignment_2_1_1 )
            {
             before(grammarAccess.getFunctionDeclarationAccess().getParametersAssignment_2_1_1()); 
            // InternalMiniScript.g:2205:2: ( rule__FunctionDeclaration__ParametersAssignment_2_1_1 )
            // InternalMiniScript.g:2205:3: rule__FunctionDeclaration__ParametersAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__FunctionDeclaration__ParametersAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionDeclarationAccess().getParametersAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__Group_2_1__1__Impl"


    // $ANTLR start "rule__NumericExpression__Group__0"
    // InternalMiniScript.g:2214:1: rule__NumericExpression__Group__0 : rule__NumericExpression__Group__0__Impl rule__NumericExpression__Group__1 ;
    public final void rule__NumericExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:2218:1: ( rule__NumericExpression__Group__0__Impl rule__NumericExpression__Group__1 )
            // InternalMiniScript.g:2219:2: rule__NumericExpression__Group__0__Impl rule__NumericExpression__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__NumericExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumericExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericExpression__Group__0"


    // $ANTLR start "rule__NumericExpression__Group__0__Impl"
    // InternalMiniScript.g:2226:1: rule__NumericExpression__Group__0__Impl : ( ruleFactor ) ;
    public final void rule__NumericExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:2230:1: ( ( ruleFactor ) )
            // InternalMiniScript.g:2231:1: ( ruleFactor )
            {
            // InternalMiniScript.g:2231:1: ( ruleFactor )
            // InternalMiniScript.g:2232:2: ruleFactor
            {
             before(grammarAccess.getNumericExpressionAccess().getFactorParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleFactor();

            state._fsp--;

             after(grammarAccess.getNumericExpressionAccess().getFactorParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericExpression__Group__0__Impl"


    // $ANTLR start "rule__NumericExpression__Group__1"
    // InternalMiniScript.g:2241:1: rule__NumericExpression__Group__1 : rule__NumericExpression__Group__1__Impl ;
    public final void rule__NumericExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:2245:1: ( rule__NumericExpression__Group__1__Impl )
            // InternalMiniScript.g:2246:2: rule__NumericExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NumericExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericExpression__Group__1"


    // $ANTLR start "rule__NumericExpression__Group__1__Impl"
    // InternalMiniScript.g:2252:1: rule__NumericExpression__Group__1__Impl : ( ( rule__NumericExpression__Group_1__0 )* ) ;
    public final void rule__NumericExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:2256:1: ( ( ( rule__NumericExpression__Group_1__0 )* ) )
            // InternalMiniScript.g:2257:1: ( ( rule__NumericExpression__Group_1__0 )* )
            {
            // InternalMiniScript.g:2257:1: ( ( rule__NumericExpression__Group_1__0 )* )
            // InternalMiniScript.g:2258:2: ( rule__NumericExpression__Group_1__0 )*
            {
             before(grammarAccess.getNumericExpressionAccess().getGroup_1()); 
            // InternalMiniScript.g:2259:2: ( rule__NumericExpression__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=13 && LA15_0<=14)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMiniScript.g:2259:3: rule__NumericExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__NumericExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getNumericExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericExpression__Group__1__Impl"


    // $ANTLR start "rule__NumericExpression__Group_1__0"
    // InternalMiniScript.g:2268:1: rule__NumericExpression__Group_1__0 : rule__NumericExpression__Group_1__0__Impl rule__NumericExpression__Group_1__1 ;
    public final void rule__NumericExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:2272:1: ( rule__NumericExpression__Group_1__0__Impl rule__NumericExpression__Group_1__1 )
            // InternalMiniScript.g:2273:2: rule__NumericExpression__Group_1__0__Impl rule__NumericExpression__Group_1__1
            {
            pushFollow(FOLLOW_15);
            rule__NumericExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumericExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericExpression__Group_1__0"


    // $ANTLR start "rule__NumericExpression__Group_1__0__Impl"
    // InternalMiniScript.g:2280:1: rule__NumericExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__NumericExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:2284:1: ( ( () ) )
            // InternalMiniScript.g:2285:1: ( () )
            {
            // InternalMiniScript.g:2285:1: ( () )
            // InternalMiniScript.g:2286:2: ()
            {
             before(grammarAccess.getNumericExpressionAccess().getNumericExpressionLeftFactorAction_1_0()); 
            // InternalMiniScript.g:2287:2: ()
            // InternalMiniScript.g:2287:3: 
            {
            }

             after(grammarAccess.getNumericExpressionAccess().getNumericExpressionLeftFactorAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericExpression__Group_1__0__Impl"


    // $ANTLR start "rule__NumericExpression__Group_1__1"
    // InternalMiniScript.g:2295:1: rule__NumericExpression__Group_1__1 : rule__NumericExpression__Group_1__1__Impl rule__NumericExpression__Group_1__2 ;
    public final void rule__NumericExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:2299:1: ( rule__NumericExpression__Group_1__1__Impl rule__NumericExpression__Group_1__2 )
            // InternalMiniScript.g:2300:2: rule__NumericExpression__Group_1__1__Impl rule__NumericExpression__Group_1__2
            {
            pushFollow(FOLLOW_12);
            rule__NumericExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumericExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericExpression__Group_1__1"


    // $ANTLR start "rule__NumericExpression__Group_1__1__Impl"
    // InternalMiniScript.g:2307:1: rule__NumericExpression__Group_1__1__Impl : ( ( rule__NumericExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__NumericExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:2311:1: ( ( ( rule__NumericExpression__OperatorAssignment_1_1 ) ) )
            // InternalMiniScript.g:2312:1: ( ( rule__NumericExpression__OperatorAssignment_1_1 ) )
            {
            // InternalMiniScript.g:2312:1: ( ( rule__NumericExpression__OperatorAssignment_1_1 ) )
            // InternalMiniScript.g:2313:2: ( rule__NumericExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getNumericExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalMiniScript.g:2314:2: ( rule__NumericExpression__OperatorAssignment_1_1 )
            // InternalMiniScript.g:2314:3: rule__NumericExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__NumericExpression__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getNumericExpressionAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericExpression__Group_1__1__Impl"


    // $ANTLR start "rule__NumericExpression__Group_1__2"
    // InternalMiniScript.g:2322:1: rule__NumericExpression__Group_1__2 : rule__NumericExpression__Group_1__2__Impl ;
    public final void rule__NumericExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:2326:1: ( rule__NumericExpression__Group_1__2__Impl )
            // InternalMiniScript.g:2327:2: rule__NumericExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NumericExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericExpression__Group_1__2"


    // $ANTLR start "rule__NumericExpression__Group_1__2__Impl"
    // InternalMiniScript.g:2333:1: rule__NumericExpression__Group_1__2__Impl : ( ( rule__NumericExpression__RightFactorAssignment_1_2 ) ) ;
    public final void rule__NumericExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:2337:1: ( ( ( rule__NumericExpression__RightFactorAssignment_1_2 ) ) )
            // InternalMiniScript.g:2338:1: ( ( rule__NumericExpression__RightFactorAssignment_1_2 ) )
            {
            // InternalMiniScript.g:2338:1: ( ( rule__NumericExpression__RightFactorAssignment_1_2 ) )
            // InternalMiniScript.g:2339:2: ( rule__NumericExpression__RightFactorAssignment_1_2 )
            {
             before(grammarAccess.getNumericExpressionAccess().getRightFactorAssignment_1_2()); 
            // InternalMiniScript.g:2340:2: ( rule__NumericExpression__RightFactorAssignment_1_2 )
            // InternalMiniScript.g:2340:3: rule__NumericExpression__RightFactorAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__NumericExpression__RightFactorAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getNumericExpressionAccess().getRightFactorAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericExpression__Group_1__2__Impl"


    // $ANTLR start "rule__Factor__Group__0"
    // InternalMiniScript.g:2349:1: rule__Factor__Group__0 : rule__Factor__Group__0__Impl rule__Factor__Group__1 ;
    public final void rule__Factor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:2353:1: ( rule__Factor__Group__0__Impl rule__Factor__Group__1 )
            // InternalMiniScript.g:2354:2: rule__Factor__Group__0__Impl rule__Factor__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Factor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Factor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group__0"


    // $ANTLR start "rule__Factor__Group__0__Impl"
    // InternalMiniScript.g:2361:1: rule__Factor__Group__0__Impl : ( ruleTerm ) ;
    public final void rule__Factor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:2365:1: ( ( ruleTerm ) )
            // InternalMiniScript.g:2366:1: ( ruleTerm )
            {
            // InternalMiniScript.g:2366:1: ( ruleTerm )
            // InternalMiniScript.g:2367:2: ruleTerm
            {
             before(grammarAccess.getFactorAccess().getTermParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleTerm();

            state._fsp--;

             after(grammarAccess.getFactorAccess().getTermParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group__0__Impl"


    // $ANTLR start "rule__Factor__Group__1"
    // InternalMiniScript.g:2376:1: rule__Factor__Group__1 : rule__Factor__Group__1__Impl ;
    public final void rule__Factor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:2380:1: ( rule__Factor__Group__1__Impl )
            // InternalMiniScript.g:2381:2: rule__Factor__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Factor__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group__1"


    // $ANTLR start "rule__Factor__Group__1__Impl"
    // InternalMiniScript.g:2387:1: rule__Factor__Group__1__Impl : ( ( rule__Factor__Group_1__0 )* ) ;
    public final void rule__Factor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:2391:1: ( ( ( rule__Factor__Group_1__0 )* ) )
            // InternalMiniScript.g:2392:1: ( ( rule__Factor__Group_1__0 )* )
            {
            // InternalMiniScript.g:2392:1: ( ( rule__Factor__Group_1__0 )* )
            // InternalMiniScript.g:2393:2: ( rule__Factor__Group_1__0 )*
            {
             before(grammarAccess.getFactorAccess().getGroup_1()); 
            // InternalMiniScript.g:2394:2: ( rule__Factor__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=15 && LA16_0<=16)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMiniScript.g:2394:3: rule__Factor__Group_1__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Factor__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getFactorAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group__1__Impl"


    // $ANTLR start "rule__Factor__Group_1__0"
    // InternalMiniScript.g:2403:1: rule__Factor__Group_1__0 : rule__Factor__Group_1__0__Impl rule__Factor__Group_1__1 ;
    public final void rule__Factor__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:2407:1: ( rule__Factor__Group_1__0__Impl rule__Factor__Group_1__1 )
            // InternalMiniScript.g:2408:2: rule__Factor__Group_1__0__Impl rule__Factor__Group_1__1
            {
            pushFollow(FOLLOW_17);
            rule__Factor__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Factor__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_1__0"


    // $ANTLR start "rule__Factor__Group_1__0__Impl"
    // InternalMiniScript.g:2415:1: rule__Factor__Group_1__0__Impl : ( () ) ;
    public final void rule__Factor__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:2419:1: ( ( () ) )
            // InternalMiniScript.g:2420:1: ( () )
            {
            // InternalMiniScript.g:2420:1: ( () )
            // InternalMiniScript.g:2421:2: ()
            {
             before(grammarAccess.getFactorAccess().getFactorLeftTermAction_1_0()); 
            // InternalMiniScript.g:2422:2: ()
            // InternalMiniScript.g:2422:3: 
            {
            }

             after(grammarAccess.getFactorAccess().getFactorLeftTermAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_1__0__Impl"


    // $ANTLR start "rule__Factor__Group_1__1"
    // InternalMiniScript.g:2430:1: rule__Factor__Group_1__1 : rule__Factor__Group_1__1__Impl rule__Factor__Group_1__2 ;
    public final void rule__Factor__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:2434:1: ( rule__Factor__Group_1__1__Impl rule__Factor__Group_1__2 )
            // InternalMiniScript.g:2435:2: rule__Factor__Group_1__1__Impl rule__Factor__Group_1__2
            {
            pushFollow(FOLLOW_12);
            rule__Factor__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Factor__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_1__1"


    // $ANTLR start "rule__Factor__Group_1__1__Impl"
    // InternalMiniScript.g:2442:1: rule__Factor__Group_1__1__Impl : ( ( rule__Factor__OperatorAssignment_1_1 ) ) ;
    public final void rule__Factor__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:2446:1: ( ( ( rule__Factor__OperatorAssignment_1_1 ) ) )
            // InternalMiniScript.g:2447:1: ( ( rule__Factor__OperatorAssignment_1_1 ) )
            {
            // InternalMiniScript.g:2447:1: ( ( rule__Factor__OperatorAssignment_1_1 ) )
            // InternalMiniScript.g:2448:2: ( rule__Factor__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getFactorAccess().getOperatorAssignment_1_1()); 
            // InternalMiniScript.g:2449:2: ( rule__Factor__OperatorAssignment_1_1 )
            // InternalMiniScript.g:2449:3: rule__Factor__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Factor__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFactorAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_1__1__Impl"


    // $ANTLR start "rule__Factor__Group_1__2"
    // InternalMiniScript.g:2457:1: rule__Factor__Group_1__2 : rule__Factor__Group_1__2__Impl ;
    public final void rule__Factor__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:2461:1: ( rule__Factor__Group_1__2__Impl )
            // InternalMiniScript.g:2462:2: rule__Factor__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Factor__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_1__2"


    // $ANTLR start "rule__Factor__Group_1__2__Impl"
    // InternalMiniScript.g:2468:1: rule__Factor__Group_1__2__Impl : ( ( rule__Factor__RightTermAssignment_1_2 ) ) ;
    public final void rule__Factor__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:2472:1: ( ( ( rule__Factor__RightTermAssignment_1_2 ) ) )
            // InternalMiniScript.g:2473:1: ( ( rule__Factor__RightTermAssignment_1_2 ) )
            {
            // InternalMiniScript.g:2473:1: ( ( rule__Factor__RightTermAssignment_1_2 ) )
            // InternalMiniScript.g:2474:2: ( rule__Factor__RightTermAssignment_1_2 )
            {
             before(grammarAccess.getFactorAccess().getRightTermAssignment_1_2()); 
            // InternalMiniScript.g:2475:2: ( rule__Factor__RightTermAssignment_1_2 )
            // InternalMiniScript.g:2475:3: rule__Factor__RightTermAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Factor__RightTermAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getFactorAccess().getRightTermAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_1__2__Impl"


    // $ANTLR start "rule__Apply__Group__0"
    // InternalMiniScript.g:2484:1: rule__Apply__Group__0 : rule__Apply__Group__0__Impl rule__Apply__Group__1 ;
    public final void rule__Apply__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:2488:1: ( rule__Apply__Group__0__Impl rule__Apply__Group__1 )
            // InternalMiniScript.g:2489:2: rule__Apply__Group__0__Impl rule__Apply__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Apply__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Apply__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Apply__Group__0"


    // $ANTLR start "rule__Apply__Group__0__Impl"
    // InternalMiniScript.g:2496:1: rule__Apply__Group__0__Impl : ( ruleFunctor ) ;
    public final void rule__Apply__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:2500:1: ( ( ruleFunctor ) )
            // InternalMiniScript.g:2501:1: ( ruleFunctor )
            {
            // InternalMiniScript.g:2501:1: ( ruleFunctor )
            // InternalMiniScript.g:2502:2: ruleFunctor
            {
             before(grammarAccess.getApplyAccess().getFunctorParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleFunctor();

            state._fsp--;

             after(grammarAccess.getApplyAccess().getFunctorParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Apply__Group__0__Impl"


    // $ANTLR start "rule__Apply__Group__1"
    // InternalMiniScript.g:2511:1: rule__Apply__Group__1 : rule__Apply__Group__1__Impl ;
    public final void rule__Apply__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:2515:1: ( rule__Apply__Group__1__Impl )
            // InternalMiniScript.g:2516:2: rule__Apply__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Apply__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Apply__Group__1"


    // $ANTLR start "rule__Apply__Group__1__Impl"
    // InternalMiniScript.g:2522:1: rule__Apply__Group__1__Impl : ( ( rule__Apply__Group_1__0 )* ) ;
    public final void rule__Apply__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:2526:1: ( ( ( rule__Apply__Group_1__0 )* ) )
            // InternalMiniScript.g:2527:1: ( ( rule__Apply__Group_1__0 )* )
            {
            // InternalMiniScript.g:2527:1: ( ( rule__Apply__Group_1__0 )* )
            // InternalMiniScript.g:2528:2: ( rule__Apply__Group_1__0 )*
            {
             before(grammarAccess.getApplyAccess().getGroup_1()); 
            // InternalMiniScript.g:2529:2: ( rule__Apply__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==32) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMiniScript.g:2529:3: rule__Apply__Group_1__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Apply__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getApplyAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Apply__Group__1__Impl"


    // $ANTLR start "rule__Apply__Group_1__0"
    // InternalMiniScript.g:2538:1: rule__Apply__Group_1__0 : rule__Apply__Group_1__0__Impl rule__Apply__Group_1__1 ;
    public final void rule__Apply__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:2542:1: ( rule__Apply__Group_1__0__Impl rule__Apply__Group_1__1 )
            // InternalMiniScript.g:2543:2: rule__Apply__Group_1__0__Impl rule__Apply__Group_1__1
            {
            pushFollow(FOLLOW_9);
            rule__Apply__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Apply__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Apply__Group_1__0"


    // $ANTLR start "rule__Apply__Group_1__0__Impl"
    // InternalMiniScript.g:2550:1: rule__Apply__Group_1__0__Impl : ( () ) ;
    public final void rule__Apply__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:2554:1: ( ( () ) )
            // InternalMiniScript.g:2555:1: ( () )
            {
            // InternalMiniScript.g:2555:1: ( () )
            // InternalMiniScript.g:2556:2: ()
            {
             before(grammarAccess.getApplyAccess().getApplyFunctorAction_1_0()); 
            // InternalMiniScript.g:2557:2: ()
            // InternalMiniScript.g:2557:3: 
            {
            }

             after(grammarAccess.getApplyAccess().getApplyFunctorAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Apply__Group_1__0__Impl"


    // $ANTLR start "rule__Apply__Group_1__1"
    // InternalMiniScript.g:2565:1: rule__Apply__Group_1__1 : rule__Apply__Group_1__1__Impl rule__Apply__Group_1__2 ;
    public final void rule__Apply__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:2569:1: ( rule__Apply__Group_1__1__Impl rule__Apply__Group_1__2 )
            // InternalMiniScript.g:2570:2: rule__Apply__Group_1__1__Impl rule__Apply__Group_1__2
            {
            pushFollow(FOLLOW_20);
            rule__Apply__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Apply__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Apply__Group_1__1"


    // $ANTLR start "rule__Apply__Group_1__1__Impl"
    // InternalMiniScript.g:2577:1: rule__Apply__Group_1__1__Impl : ( '(' ) ;
    public final void rule__Apply__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:2581:1: ( ( '(' ) )
            // InternalMiniScript.g:2582:1: ( '(' )
            {
            // InternalMiniScript.g:2582:1: ( '(' )
            // InternalMiniScript.g:2583:2: '('
            {
             before(grammarAccess.getApplyAccess().getLeftParenthesisKeyword_1_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getApplyAccess().getLeftParenthesisKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Apply__Group_1__1__Impl"


    // $ANTLR start "rule__Apply__Group_1__2"
    // InternalMiniScript.g:2592:1: rule__Apply__Group_1__2 : rule__Apply__Group_1__2__Impl rule__Apply__Group_1__3 ;
    public final void rule__Apply__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:2596:1: ( rule__Apply__Group_1__2__Impl rule__Apply__Group_1__3 )
            // InternalMiniScript.g:2597:2: rule__Apply__Group_1__2__Impl rule__Apply__Group_1__3
            {
            pushFollow(FOLLOW_20);
            rule__Apply__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Apply__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Apply__Group_1__2"


    // $ANTLR start "rule__Apply__Group_1__2__Impl"
    // InternalMiniScript.g:2604:1: rule__Apply__Group_1__2__Impl : ( ( rule__Apply__Group_1_2__0 )? ) ;
    public final void rule__Apply__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:2608:1: ( ( ( rule__Apply__Group_1_2__0 )? ) )
            // InternalMiniScript.g:2609:1: ( ( rule__Apply__Group_1_2__0 )? )
            {
            // InternalMiniScript.g:2609:1: ( ( rule__Apply__Group_1_2__0 )? )
            // InternalMiniScript.g:2610:2: ( rule__Apply__Group_1_2__0 )?
            {
             before(grammarAccess.getApplyAccess().getGroup_1_2()); 
            // InternalMiniScript.g:2611:2: ( rule__Apply__Group_1_2__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=RULE_ID && LA18_0<=RULE_INT)||(LA18_0>=11 && LA18_0<=12)||(LA18_0>=23 && LA18_0<=26)||LA18_0==28||LA18_0==30||LA18_0==32||LA18_0==34) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMiniScript.g:2611:3: rule__Apply__Group_1_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Apply__Group_1_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getApplyAccess().getGroup_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Apply__Group_1__2__Impl"


    // $ANTLR start "rule__Apply__Group_1__3"
    // InternalMiniScript.g:2619:1: rule__Apply__Group_1__3 : rule__Apply__Group_1__3__Impl ;
    public final void rule__Apply__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:2623:1: ( rule__Apply__Group_1__3__Impl )
            // InternalMiniScript.g:2624:2: rule__Apply__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Apply__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Apply__Group_1__3"


    // $ANTLR start "rule__Apply__Group_1__3__Impl"
    // InternalMiniScript.g:2630:1: rule__Apply__Group_1__3__Impl : ( ')' ) ;
    public final void rule__Apply__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:2634:1: ( ( ')' ) )
            // InternalMiniScript.g:2635:1: ( ')' )
            {
            // InternalMiniScript.g:2635:1: ( ')' )
            // InternalMiniScript.g:2636:2: ')'
            {
             before(grammarAccess.getApplyAccess().getRightParenthesisKeyword_1_3()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getApplyAccess().getRightParenthesisKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Apply__Group_1__3__Impl"


    // $ANTLR start "rule__Apply__Group_1_2__0"
    // InternalMiniScript.g:2646:1: rule__Apply__Group_1_2__0 : rule__Apply__Group_1_2__0__Impl rule__Apply__Group_1_2__1 ;
    public final void rule__Apply__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:2650:1: ( rule__Apply__Group_1_2__0__Impl rule__Apply__Group_1_2__1 )
            // InternalMiniScript.g:2651:2: rule__Apply__Group_1_2__0__Impl rule__Apply__Group_1_2__1
            {
            pushFollow(FOLLOW_8);
            rule__Apply__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Apply__Group_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Apply__Group_1_2__0"


    // $ANTLR start "rule__Apply__Group_1_2__0__Impl"
    // InternalMiniScript.g:2658:1: rule__Apply__Group_1_2__0__Impl : ( ( rule__Apply__ArgumentsAssignment_1_2_0 ) ) ;
    public final void rule__Apply__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:2662:1: ( ( ( rule__Apply__ArgumentsAssignment_1_2_0 ) ) )
            // InternalMiniScript.g:2663:1: ( ( rule__Apply__ArgumentsAssignment_1_2_0 ) )
            {
            // InternalMiniScript.g:2663:1: ( ( rule__Apply__ArgumentsAssignment_1_2_0 ) )
            // InternalMiniScript.g:2664:2: ( rule__Apply__ArgumentsAssignment_1_2_0 )
            {
             before(grammarAccess.getApplyAccess().getArgumentsAssignment_1_2_0()); 
            // InternalMiniScript.g:2665:2: ( rule__Apply__ArgumentsAssignment_1_2_0 )
            // InternalMiniScript.g:2665:3: rule__Apply__ArgumentsAssignment_1_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Apply__ArgumentsAssignment_1_2_0();

            state._fsp--;


            }

             after(grammarAccess.getApplyAccess().getArgumentsAssignment_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Apply__Group_1_2__0__Impl"


    // $ANTLR start "rule__Apply__Group_1_2__1"
    // InternalMiniScript.g:2673:1: rule__Apply__Group_1_2__1 : rule__Apply__Group_1_2__1__Impl ;
    public final void rule__Apply__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:2677:1: ( rule__Apply__Group_1_2__1__Impl )
            // InternalMiniScript.g:2678:2: rule__Apply__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Apply__Group_1_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Apply__Group_1_2__1"


    // $ANTLR start "rule__Apply__Group_1_2__1__Impl"
    // InternalMiniScript.g:2684:1: rule__Apply__Group_1_2__1__Impl : ( ( rule__Apply__Group_1_2_1__0 )* ) ;
    public final void rule__Apply__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:2688:1: ( ( ( rule__Apply__Group_1_2_1__0 )* ) )
            // InternalMiniScript.g:2689:1: ( ( rule__Apply__Group_1_2_1__0 )* )
            {
            // InternalMiniScript.g:2689:1: ( ( rule__Apply__Group_1_2_1__0 )* )
            // InternalMiniScript.g:2690:2: ( rule__Apply__Group_1_2_1__0 )*
            {
             before(grammarAccess.getApplyAccess().getGroup_1_2_1()); 
            // InternalMiniScript.g:2691:2: ( rule__Apply__Group_1_2_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==31) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMiniScript.g:2691:3: rule__Apply__Group_1_2_1__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Apply__Group_1_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getApplyAccess().getGroup_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Apply__Group_1_2__1__Impl"


    // $ANTLR start "rule__Apply__Group_1_2_1__0"
    // InternalMiniScript.g:2700:1: rule__Apply__Group_1_2_1__0 : rule__Apply__Group_1_2_1__0__Impl rule__Apply__Group_1_2_1__1 ;
    public final void rule__Apply__Group_1_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:2704:1: ( rule__Apply__Group_1_2_1__0__Impl rule__Apply__Group_1_2_1__1 )
            // InternalMiniScript.g:2705:2: rule__Apply__Group_1_2_1__0__Impl rule__Apply__Group_1_2_1__1
            {
            pushFollow(FOLLOW_4);
            rule__Apply__Group_1_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Apply__Group_1_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Apply__Group_1_2_1__0"


    // $ANTLR start "rule__Apply__Group_1_2_1__0__Impl"
    // InternalMiniScript.g:2712:1: rule__Apply__Group_1_2_1__0__Impl : ( ',' ) ;
    public final void rule__Apply__Group_1_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:2716:1: ( ( ',' ) )
            // InternalMiniScript.g:2717:1: ( ',' )
            {
            // InternalMiniScript.g:2717:1: ( ',' )
            // InternalMiniScript.g:2718:2: ','
            {
             before(grammarAccess.getApplyAccess().getCommaKeyword_1_2_1_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getApplyAccess().getCommaKeyword_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Apply__Group_1_2_1__0__Impl"


    // $ANTLR start "rule__Apply__Group_1_2_1__1"
    // InternalMiniScript.g:2727:1: rule__Apply__Group_1_2_1__1 : rule__Apply__Group_1_2_1__1__Impl ;
    public final void rule__Apply__Group_1_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:2731:1: ( rule__Apply__Group_1_2_1__1__Impl )
            // InternalMiniScript.g:2732:2: rule__Apply__Group_1_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Apply__Group_1_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Apply__Group_1_2_1__1"


    // $ANTLR start "rule__Apply__Group_1_2_1__1__Impl"
    // InternalMiniScript.g:2738:1: rule__Apply__Group_1_2_1__1__Impl : ( ( rule__Apply__ArgumentsAssignment_1_2_1_1 ) ) ;
    public final void rule__Apply__Group_1_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:2742:1: ( ( ( rule__Apply__ArgumentsAssignment_1_2_1_1 ) ) )
            // InternalMiniScript.g:2743:1: ( ( rule__Apply__ArgumentsAssignment_1_2_1_1 ) )
            {
            // InternalMiniScript.g:2743:1: ( ( rule__Apply__ArgumentsAssignment_1_2_1_1 ) )
            // InternalMiniScript.g:2744:2: ( rule__Apply__ArgumentsAssignment_1_2_1_1 )
            {
             before(grammarAccess.getApplyAccess().getArgumentsAssignment_1_2_1_1()); 
            // InternalMiniScript.g:2745:2: ( rule__Apply__ArgumentsAssignment_1_2_1_1 )
            // InternalMiniScript.g:2745:3: rule__Apply__ArgumentsAssignment_1_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Apply__ArgumentsAssignment_1_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getApplyAccess().getArgumentsAssignment_1_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Apply__Group_1_2_1__1__Impl"


    // $ANTLR start "rule__VariableAssignment__Group__0"
    // InternalMiniScript.g:2754:1: rule__VariableAssignment__Group__0 : rule__VariableAssignment__Group__0__Impl rule__VariableAssignment__Group__1 ;
    public final void rule__VariableAssignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:2758:1: ( rule__VariableAssignment__Group__0__Impl rule__VariableAssignment__Group__1 )
            // InternalMiniScript.g:2759:2: rule__VariableAssignment__Group__0__Impl rule__VariableAssignment__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__VariableAssignment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableAssignment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableAssignment__Group__0"


    // $ANTLR start "rule__VariableAssignment__Group__0__Impl"
    // InternalMiniScript.g:2766:1: rule__VariableAssignment__Group__0__Impl : ( ( rule__VariableAssignment__IdAssignment_0 ) ) ;
    public final void rule__VariableAssignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:2770:1: ( ( ( rule__VariableAssignment__IdAssignment_0 ) ) )
            // InternalMiniScript.g:2771:1: ( ( rule__VariableAssignment__IdAssignment_0 ) )
            {
            // InternalMiniScript.g:2771:1: ( ( rule__VariableAssignment__IdAssignment_0 ) )
            // InternalMiniScript.g:2772:2: ( rule__VariableAssignment__IdAssignment_0 )
            {
             before(grammarAccess.getVariableAssignmentAccess().getIdAssignment_0()); 
            // InternalMiniScript.g:2773:2: ( rule__VariableAssignment__IdAssignment_0 )
            // InternalMiniScript.g:2773:3: rule__VariableAssignment__IdAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__VariableAssignment__IdAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAssignmentAccess().getIdAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableAssignment__Group__0__Impl"


    // $ANTLR start "rule__VariableAssignment__Group__1"
    // InternalMiniScript.g:2781:1: rule__VariableAssignment__Group__1 : rule__VariableAssignment__Group__1__Impl rule__VariableAssignment__Group__2 ;
    public final void rule__VariableAssignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:2785:1: ( rule__VariableAssignment__Group__1__Impl rule__VariableAssignment__Group__2 )
            // InternalMiniScript.g:2786:2: rule__VariableAssignment__Group__1__Impl rule__VariableAssignment__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__VariableAssignment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableAssignment__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableAssignment__Group__1"


    // $ANTLR start "rule__VariableAssignment__Group__1__Impl"
    // InternalMiniScript.g:2793:1: rule__VariableAssignment__Group__1__Impl : ( '=' ) ;
    public final void rule__VariableAssignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:2797:1: ( ( '=' ) )
            // InternalMiniScript.g:2798:1: ( '=' )
            {
            // InternalMiniScript.g:2798:1: ( '=' )
            // InternalMiniScript.g:2799:2: '='
            {
             before(grammarAccess.getVariableAssignmentAccess().getEqualsSignKeyword_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getVariableAssignmentAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableAssignment__Group__1__Impl"


    // $ANTLR start "rule__VariableAssignment__Group__2"
    // InternalMiniScript.g:2808:1: rule__VariableAssignment__Group__2 : rule__VariableAssignment__Group__2__Impl ;
    public final void rule__VariableAssignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:2812:1: ( rule__VariableAssignment__Group__2__Impl )
            // InternalMiniScript.g:2813:2: rule__VariableAssignment__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VariableAssignment__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableAssignment__Group__2"


    // $ANTLR start "rule__VariableAssignment__Group__2__Impl"
    // InternalMiniScript.g:2819:1: rule__VariableAssignment__Group__2__Impl : ( ( rule__VariableAssignment__ExpressionAssignment_2 ) ) ;
    public final void rule__VariableAssignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:2823:1: ( ( ( rule__VariableAssignment__ExpressionAssignment_2 ) ) )
            // InternalMiniScript.g:2824:1: ( ( rule__VariableAssignment__ExpressionAssignment_2 ) )
            {
            // InternalMiniScript.g:2824:1: ( ( rule__VariableAssignment__ExpressionAssignment_2 ) )
            // InternalMiniScript.g:2825:2: ( rule__VariableAssignment__ExpressionAssignment_2 )
            {
             before(grammarAccess.getVariableAssignmentAccess().getExpressionAssignment_2()); 
            // InternalMiniScript.g:2826:2: ( rule__VariableAssignment__ExpressionAssignment_2 )
            // InternalMiniScript.g:2826:3: rule__VariableAssignment__ExpressionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__VariableAssignment__ExpressionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVariableAssignmentAccess().getExpressionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableAssignment__Group__2__Impl"


    // $ANTLR start "rule__ParenthesisExpression__Group__0"
    // InternalMiniScript.g:2835:1: rule__ParenthesisExpression__Group__0 : rule__ParenthesisExpression__Group__0__Impl rule__ParenthesisExpression__Group__1 ;
    public final void rule__ParenthesisExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:2839:1: ( rule__ParenthesisExpression__Group__0__Impl rule__ParenthesisExpression__Group__1 )
            // InternalMiniScript.g:2840:2: rule__ParenthesisExpression__Group__0__Impl rule__ParenthesisExpression__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ParenthesisExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParenthesisExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParenthesisExpression__Group__0"


    // $ANTLR start "rule__ParenthesisExpression__Group__0__Impl"
    // InternalMiniScript.g:2847:1: rule__ParenthesisExpression__Group__0__Impl : ( '(' ) ;
    public final void rule__ParenthesisExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:2851:1: ( ( '(' ) )
            // InternalMiniScript.g:2852:1: ( '(' )
            {
            // InternalMiniScript.g:2852:1: ( '(' )
            // InternalMiniScript.g:2853:2: '('
            {
             before(grammarAccess.getParenthesisExpressionAccess().getLeftParenthesisKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getParenthesisExpressionAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParenthesisExpression__Group__0__Impl"


    // $ANTLR start "rule__ParenthesisExpression__Group__1"
    // InternalMiniScript.g:2862:1: rule__ParenthesisExpression__Group__1 : rule__ParenthesisExpression__Group__1__Impl rule__ParenthesisExpression__Group__2 ;
    public final void rule__ParenthesisExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:2866:1: ( rule__ParenthesisExpression__Group__1__Impl rule__ParenthesisExpression__Group__2 )
            // InternalMiniScript.g:2867:2: rule__ParenthesisExpression__Group__1__Impl rule__ParenthesisExpression__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__ParenthesisExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParenthesisExpression__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParenthesisExpression__Group__1"


    // $ANTLR start "rule__ParenthesisExpression__Group__1__Impl"
    // InternalMiniScript.g:2874:1: rule__ParenthesisExpression__Group__1__Impl : ( ruleExpression ) ;
    public final void rule__ParenthesisExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:2878:1: ( ( ruleExpression ) )
            // InternalMiniScript.g:2879:1: ( ruleExpression )
            {
            // InternalMiniScript.g:2879:1: ( ruleExpression )
            // InternalMiniScript.g:2880:2: ruleExpression
            {
             before(grammarAccess.getParenthesisExpressionAccess().getExpressionParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getParenthesisExpressionAccess().getExpressionParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParenthesisExpression__Group__1__Impl"


    // $ANTLR start "rule__ParenthesisExpression__Group__2"
    // InternalMiniScript.g:2889:1: rule__ParenthesisExpression__Group__2 : rule__ParenthesisExpression__Group__2__Impl ;
    public final void rule__ParenthesisExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:2893:1: ( rule__ParenthesisExpression__Group__2__Impl )
            // InternalMiniScript.g:2894:2: rule__ParenthesisExpression__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParenthesisExpression__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParenthesisExpression__Group__2"


    // $ANTLR start "rule__ParenthesisExpression__Group__2__Impl"
    // InternalMiniScript.g:2900:1: rule__ParenthesisExpression__Group__2__Impl : ( ')' ) ;
    public final void rule__ParenthesisExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:2904:1: ( ( ')' ) )
            // InternalMiniScript.g:2905:1: ( ')' )
            {
            // InternalMiniScript.g:2905:1: ( ')' )
            // InternalMiniScript.g:2906:2: ')'
            {
             before(grammarAccess.getParenthesisExpressionAccess().getRightParenthesisKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getParenthesisExpressionAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParenthesisExpression__Group__2__Impl"


    // $ANTLR start "rule__Program__ExpressionsAssignment_0"
    // InternalMiniScript.g:2916:1: rule__Program__ExpressionsAssignment_0 : ( ruleExpression ) ;
    public final void rule__Program__ExpressionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:2920:1: ( ( ruleExpression ) )
            // InternalMiniScript.g:2921:2: ( ruleExpression )
            {
            // InternalMiniScript.g:2921:2: ( ruleExpression )
            // InternalMiniScript.g:2922:3: ruleExpression
            {
             before(grammarAccess.getProgramAccess().getExpressionsExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getExpressionsExpressionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__ExpressionsAssignment_0"


    // $ANTLR start "rule__Program__ExpressionsAssignment_2_0"
    // InternalMiniScript.g:2931:1: rule__Program__ExpressionsAssignment_2_0 : ( ruleExpression ) ;
    public final void rule__Program__ExpressionsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:2935:1: ( ( ruleExpression ) )
            // InternalMiniScript.g:2936:2: ( ruleExpression )
            {
            // InternalMiniScript.g:2936:2: ( ruleExpression )
            // InternalMiniScript.g:2937:3: ruleExpression
            {
             before(grammarAccess.getProgramAccess().getExpressionsExpressionParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getExpressionsExpressionParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__ExpressionsAssignment_2_0"


    // $ANTLR start "rule__BlockExpression__ExpressionsAssignment_1_0"
    // InternalMiniScript.g:2946:1: rule__BlockExpression__ExpressionsAssignment_1_0 : ( ruleExpression ) ;
    public final void rule__BlockExpression__ExpressionsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:2950:1: ( ( ruleExpression ) )
            // InternalMiniScript.g:2951:2: ( ruleExpression )
            {
            // InternalMiniScript.g:2951:2: ( ruleExpression )
            // InternalMiniScript.g:2952:3: ruleExpression
            {
             before(grammarAccess.getBlockExpressionAccess().getExpressionsExpressionParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getBlockExpressionAccess().getExpressionsExpressionParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockExpression__ExpressionsAssignment_1_0"


    // $ANTLR start "rule__LetExpression__AssigmentAssignment_1_0"
    // InternalMiniScript.g:2961:1: rule__LetExpression__AssigmentAssignment_1_0 : ( ruleVariableAssignment ) ;
    public final void rule__LetExpression__AssigmentAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:2965:1: ( ( ruleVariableAssignment ) )
            // InternalMiniScript.g:2966:2: ( ruleVariableAssignment )
            {
            // InternalMiniScript.g:2966:2: ( ruleVariableAssignment )
            // InternalMiniScript.g:2967:3: ruleVariableAssignment
            {
             before(grammarAccess.getLetExpressionAccess().getAssigmentVariableAssignmentParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVariableAssignment();

            state._fsp--;

             after(grammarAccess.getLetExpressionAccess().getAssigmentVariableAssignmentParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetExpression__AssigmentAssignment_1_0"


    // $ANTLR start "rule__LetExpression__ExpressionAssignment_2"
    // InternalMiniScript.g:2976:1: rule__LetExpression__ExpressionAssignment_2 : ( ruleExpression ) ;
    public final void rule__LetExpression__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:2980:1: ( ( ruleExpression ) )
            // InternalMiniScript.g:2981:2: ( ruleExpression )
            {
            // InternalMiniScript.g:2981:2: ( ruleExpression )
            // InternalMiniScript.g:2982:3: ruleExpression
            {
             before(grammarAccess.getLetExpressionAccess().getExpressionExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getLetExpressionAccess().getExpressionExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetExpression__ExpressionAssignment_2"


    // $ANTLR start "rule__TernaryExpression__OperatorAssignment_0"
    // InternalMiniScript.g:2991:1: rule__TernaryExpression__OperatorAssignment_0 : ( ruleTernaryOperator ) ;
    public final void rule__TernaryExpression__OperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:2995:1: ( ( ruleTernaryOperator ) )
            // InternalMiniScript.g:2996:2: ( ruleTernaryOperator )
            {
            // InternalMiniScript.g:2996:2: ( ruleTernaryOperator )
            // InternalMiniScript.g:2997:3: ruleTernaryOperator
            {
             before(grammarAccess.getTernaryExpressionAccess().getOperatorTernaryOperatorEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTernaryOperator();

            state._fsp--;

             after(grammarAccess.getTernaryExpressionAccess().getOperatorTernaryOperatorEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TernaryExpression__OperatorAssignment_0"


    // $ANTLR start "rule__TernaryExpression__FirstExpressionAssignment_2"
    // InternalMiniScript.g:3006:1: rule__TernaryExpression__FirstExpressionAssignment_2 : ( ruleExpression ) ;
    public final void rule__TernaryExpression__FirstExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:3010:1: ( ( ruleExpression ) )
            // InternalMiniScript.g:3011:2: ( ruleExpression )
            {
            // InternalMiniScript.g:3011:2: ( ruleExpression )
            // InternalMiniScript.g:3012:3: ruleExpression
            {
             before(grammarAccess.getTernaryExpressionAccess().getFirstExpressionExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getTernaryExpressionAccess().getFirstExpressionExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TernaryExpression__FirstExpressionAssignment_2"


    // $ANTLR start "rule__TernaryExpression__SecondExpressionAssignment_4"
    // InternalMiniScript.g:3021:1: rule__TernaryExpression__SecondExpressionAssignment_4 : ( ruleExpression ) ;
    public final void rule__TernaryExpression__SecondExpressionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:3025:1: ( ( ruleExpression ) )
            // InternalMiniScript.g:3026:2: ( ruleExpression )
            {
            // InternalMiniScript.g:3026:2: ( ruleExpression )
            // InternalMiniScript.g:3027:3: ruleExpression
            {
             before(grammarAccess.getTernaryExpressionAccess().getSecondExpressionExpressionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getTernaryExpressionAccess().getSecondExpressionExpressionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TernaryExpression__SecondExpressionAssignment_4"


    // $ANTLR start "rule__TernaryExpression__ThirdExpressionAssignment_6"
    // InternalMiniScript.g:3036:1: rule__TernaryExpression__ThirdExpressionAssignment_6 : ( ruleExpression ) ;
    public final void rule__TernaryExpression__ThirdExpressionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:3040:1: ( ( ruleExpression ) )
            // InternalMiniScript.g:3041:2: ( ruleExpression )
            {
            // InternalMiniScript.g:3041:2: ( ruleExpression )
            // InternalMiniScript.g:3042:3: ruleExpression
            {
             before(grammarAccess.getTernaryExpressionAccess().getThirdExpressionExpressionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getTernaryExpressionAccess().getThirdExpressionExpressionParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TernaryExpression__ThirdExpressionAssignment_6"


    // $ANTLR start "rule__LogicalBinaryExpression__OperatorAssignment_0"
    // InternalMiniScript.g:3051:1: rule__LogicalBinaryExpression__OperatorAssignment_0 : ( ruleBinaryLogicalOperator ) ;
    public final void rule__LogicalBinaryExpression__OperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:3055:1: ( ( ruleBinaryLogicalOperator ) )
            // InternalMiniScript.g:3056:2: ( ruleBinaryLogicalOperator )
            {
            // InternalMiniScript.g:3056:2: ( ruleBinaryLogicalOperator )
            // InternalMiniScript.g:3057:3: ruleBinaryLogicalOperator
            {
             before(grammarAccess.getLogicalBinaryExpressionAccess().getOperatorBinaryLogicalOperatorEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleBinaryLogicalOperator();

            state._fsp--;

             after(grammarAccess.getLogicalBinaryExpressionAccess().getOperatorBinaryLogicalOperatorEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalBinaryExpression__OperatorAssignment_0"


    // $ANTLR start "rule__LogicalBinaryExpression__LeftExprAssignment_2"
    // InternalMiniScript.g:3066:1: rule__LogicalBinaryExpression__LeftExprAssignment_2 : ( ruleExpression ) ;
    public final void rule__LogicalBinaryExpression__LeftExprAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:3070:1: ( ( ruleExpression ) )
            // InternalMiniScript.g:3071:2: ( ruleExpression )
            {
            // InternalMiniScript.g:3071:2: ( ruleExpression )
            // InternalMiniScript.g:3072:3: ruleExpression
            {
             before(grammarAccess.getLogicalBinaryExpressionAccess().getLeftExprExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getLogicalBinaryExpressionAccess().getLeftExprExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalBinaryExpression__LeftExprAssignment_2"


    // $ANTLR start "rule__LogicalBinaryExpression__RightExprAssignment_4"
    // InternalMiniScript.g:3081:1: rule__LogicalBinaryExpression__RightExprAssignment_4 : ( ruleExpression ) ;
    public final void rule__LogicalBinaryExpression__RightExprAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:3085:1: ( ( ruleExpression ) )
            // InternalMiniScript.g:3086:2: ( ruleExpression )
            {
            // InternalMiniScript.g:3086:2: ( ruleExpression )
            // InternalMiniScript.g:3087:3: ruleExpression
            {
             before(grammarAccess.getLogicalBinaryExpressionAccess().getRightExprExpressionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getLogicalBinaryExpressionAccess().getRightExprExpressionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalBinaryExpression__RightExprAssignment_4"


    // $ANTLR start "rule__LogicalUnaryExpression__OperatorAssignment_0"
    // InternalMiniScript.g:3096:1: rule__LogicalUnaryExpression__OperatorAssignment_0 : ( ruleUnaryLogicalOperator ) ;
    public final void rule__LogicalUnaryExpression__OperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:3100:1: ( ( ruleUnaryLogicalOperator ) )
            // InternalMiniScript.g:3101:2: ( ruleUnaryLogicalOperator )
            {
            // InternalMiniScript.g:3101:2: ( ruleUnaryLogicalOperator )
            // InternalMiniScript.g:3102:3: ruleUnaryLogicalOperator
            {
             before(grammarAccess.getLogicalUnaryExpressionAccess().getOperatorUnaryLogicalOperatorEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleUnaryLogicalOperator();

            state._fsp--;

             after(grammarAccess.getLogicalUnaryExpressionAccess().getOperatorUnaryLogicalOperatorEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalUnaryExpression__OperatorAssignment_0"


    // $ANTLR start "rule__LogicalUnaryExpression__ExpressionAssignment_2"
    // InternalMiniScript.g:3111:1: rule__LogicalUnaryExpression__ExpressionAssignment_2 : ( ruleExpression ) ;
    public final void rule__LogicalUnaryExpression__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:3115:1: ( ( ruleExpression ) )
            // InternalMiniScript.g:3116:2: ( ruleExpression )
            {
            // InternalMiniScript.g:3116:2: ( ruleExpression )
            // InternalMiniScript.g:3117:3: ruleExpression
            {
             before(grammarAccess.getLogicalUnaryExpressionAccess().getExpressionExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getLogicalUnaryExpressionAccess().getExpressionExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalUnaryExpression__ExpressionAssignment_2"


    // $ANTLR start "rule__ComparisonExpression__OperatorAssignment_1_1"
    // InternalMiniScript.g:3126:1: rule__ComparisonExpression__OperatorAssignment_1_1 : ( ruleComparisonOperator ) ;
    public final void rule__ComparisonExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:3130:1: ( ( ruleComparisonOperator ) )
            // InternalMiniScript.g:3131:2: ( ruleComparisonOperator )
            {
            // InternalMiniScript.g:3131:2: ( ruleComparisonOperator )
            // InternalMiniScript.g:3132:3: ruleComparisonOperator
            {
             before(grammarAccess.getComparisonExpressionAccess().getOperatorComparisonOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleComparisonOperator();

            state._fsp--;

             after(grammarAccess.getComparisonExpressionAccess().getOperatorComparisonOperatorEnumRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__ComparisonExpression__RightExprAssignment_1_2"
    // InternalMiniScript.g:3141:1: rule__ComparisonExpression__RightExprAssignment_1_2 : ( ruleNumericExpression ) ;
    public final void rule__ComparisonExpression__RightExprAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:3145:1: ( ( ruleNumericExpression ) )
            // InternalMiniScript.g:3146:2: ( ruleNumericExpression )
            {
            // InternalMiniScript.g:3146:2: ( ruleNumericExpression )
            // InternalMiniScript.g:3147:3: ruleNumericExpression
            {
             before(grammarAccess.getComparisonExpressionAccess().getRightExprNumericExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNumericExpression();

            state._fsp--;

             after(grammarAccess.getComparisonExpressionAccess().getRightExprNumericExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__RightExprAssignment_1_2"


    // $ANTLR start "rule__FunctionDeclaration__ParametersAssignment_2_0"
    // InternalMiniScript.g:3156:1: rule__FunctionDeclaration__ParametersAssignment_2_0 : ( RULE_ID ) ;
    public final void rule__FunctionDeclaration__ParametersAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:3160:1: ( ( RULE_ID ) )
            // InternalMiniScript.g:3161:2: ( RULE_ID )
            {
            // InternalMiniScript.g:3161:2: ( RULE_ID )
            // InternalMiniScript.g:3162:3: RULE_ID
            {
             before(grammarAccess.getFunctionDeclarationAccess().getParametersIDTerminalRuleCall_2_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFunctionDeclarationAccess().getParametersIDTerminalRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__ParametersAssignment_2_0"


    // $ANTLR start "rule__FunctionDeclaration__ParametersAssignment_2_1_1"
    // InternalMiniScript.g:3171:1: rule__FunctionDeclaration__ParametersAssignment_2_1_1 : ( RULE_ID ) ;
    public final void rule__FunctionDeclaration__ParametersAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:3175:1: ( ( RULE_ID ) )
            // InternalMiniScript.g:3176:2: ( RULE_ID )
            {
            // InternalMiniScript.g:3176:2: ( RULE_ID )
            // InternalMiniScript.g:3177:3: RULE_ID
            {
             before(grammarAccess.getFunctionDeclarationAccess().getParametersIDTerminalRuleCall_2_1_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFunctionDeclarationAccess().getParametersIDTerminalRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__ParametersAssignment_2_1_1"


    // $ANTLR start "rule__FunctionDeclaration__BodyAssignment_4"
    // InternalMiniScript.g:3186:1: rule__FunctionDeclaration__BodyAssignment_4 : ( ruleExpression ) ;
    public final void rule__FunctionDeclaration__BodyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:3190:1: ( ( ruleExpression ) )
            // InternalMiniScript.g:3191:2: ( ruleExpression )
            {
            // InternalMiniScript.g:3191:2: ( ruleExpression )
            // InternalMiniScript.g:3192:3: ruleExpression
            {
             before(grammarAccess.getFunctionDeclarationAccess().getBodyExpressionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getFunctionDeclarationAccess().getBodyExpressionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__BodyAssignment_4"


    // $ANTLR start "rule__SymbolReference__IdAssignment"
    // InternalMiniScript.g:3201:1: rule__SymbolReference__IdAssignment : ( RULE_ID ) ;
    public final void rule__SymbolReference__IdAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:3205:1: ( ( RULE_ID ) )
            // InternalMiniScript.g:3206:2: ( RULE_ID )
            {
            // InternalMiniScript.g:3206:2: ( RULE_ID )
            // InternalMiniScript.g:3207:3: RULE_ID
            {
             before(grammarAccess.getSymbolReferenceAccess().getIdIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSymbolReferenceAccess().getIdIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SymbolReference__IdAssignment"


    // $ANTLR start "rule__NumericExpression__OperatorAssignment_1_1"
    // InternalMiniScript.g:3216:1: rule__NumericExpression__OperatorAssignment_1_1 : ( ruleAdditionOperator ) ;
    public final void rule__NumericExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:3220:1: ( ( ruleAdditionOperator ) )
            // InternalMiniScript.g:3221:2: ( ruleAdditionOperator )
            {
            // InternalMiniScript.g:3221:2: ( ruleAdditionOperator )
            // InternalMiniScript.g:3222:3: ruleAdditionOperator
            {
             before(grammarAccess.getNumericExpressionAccess().getOperatorAdditionOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAdditionOperator();

            state._fsp--;

             after(grammarAccess.getNumericExpressionAccess().getOperatorAdditionOperatorEnumRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__NumericExpression__RightFactorAssignment_1_2"
    // InternalMiniScript.g:3231:1: rule__NumericExpression__RightFactorAssignment_1_2 : ( ruleFactor ) ;
    public final void rule__NumericExpression__RightFactorAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:3235:1: ( ( ruleFactor ) )
            // InternalMiniScript.g:3236:2: ( ruleFactor )
            {
            // InternalMiniScript.g:3236:2: ( ruleFactor )
            // InternalMiniScript.g:3237:3: ruleFactor
            {
             before(grammarAccess.getNumericExpressionAccess().getRightFactorFactorParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFactor();

            state._fsp--;

             after(grammarAccess.getNumericExpressionAccess().getRightFactorFactorParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericExpression__RightFactorAssignment_1_2"


    // $ANTLR start "rule__Factor__OperatorAssignment_1_1"
    // InternalMiniScript.g:3246:1: rule__Factor__OperatorAssignment_1_1 : ( ruleFactorOperator ) ;
    public final void rule__Factor__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:3250:1: ( ( ruleFactorOperator ) )
            // InternalMiniScript.g:3251:2: ( ruleFactorOperator )
            {
            // InternalMiniScript.g:3251:2: ( ruleFactorOperator )
            // InternalMiniScript.g:3252:3: ruleFactorOperator
            {
             before(grammarAccess.getFactorAccess().getOperatorFactorOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFactorOperator();

            state._fsp--;

             after(grammarAccess.getFactorAccess().getOperatorFactorOperatorEnumRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__OperatorAssignment_1_1"


    // $ANTLR start "rule__Factor__RightTermAssignment_1_2"
    // InternalMiniScript.g:3261:1: rule__Factor__RightTermAssignment_1_2 : ( ruleTerm ) ;
    public final void rule__Factor__RightTermAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:3265:1: ( ( ruleTerm ) )
            // InternalMiniScript.g:3266:2: ( ruleTerm )
            {
            // InternalMiniScript.g:3266:2: ( ruleTerm )
            // InternalMiniScript.g:3267:3: ruleTerm
            {
             before(grammarAccess.getFactorAccess().getRightTermTermParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTerm();

            state._fsp--;

             after(grammarAccess.getFactorAccess().getRightTermTermParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__RightTermAssignment_1_2"


    // $ANTLR start "rule__Apply__ArgumentsAssignment_1_2_0"
    // InternalMiniScript.g:3276:1: rule__Apply__ArgumentsAssignment_1_2_0 : ( ruleExpression ) ;
    public final void rule__Apply__ArgumentsAssignment_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:3280:1: ( ( ruleExpression ) )
            // InternalMiniScript.g:3281:2: ( ruleExpression )
            {
            // InternalMiniScript.g:3281:2: ( ruleExpression )
            // InternalMiniScript.g:3282:3: ruleExpression
            {
             before(grammarAccess.getApplyAccess().getArgumentsExpressionParserRuleCall_1_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getApplyAccess().getArgumentsExpressionParserRuleCall_1_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Apply__ArgumentsAssignment_1_2_0"


    // $ANTLR start "rule__Apply__ArgumentsAssignment_1_2_1_1"
    // InternalMiniScript.g:3291:1: rule__Apply__ArgumentsAssignment_1_2_1_1 : ( ruleExpression ) ;
    public final void rule__Apply__ArgumentsAssignment_1_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:3295:1: ( ( ruleExpression ) )
            // InternalMiniScript.g:3296:2: ( ruleExpression )
            {
            // InternalMiniScript.g:3296:2: ( ruleExpression )
            // InternalMiniScript.g:3297:3: ruleExpression
            {
             before(grammarAccess.getApplyAccess().getArgumentsExpressionParserRuleCall_1_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getApplyAccess().getArgumentsExpressionParserRuleCall_1_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Apply__ArgumentsAssignment_1_2_1_1"


    // $ANTLR start "rule__LiteralBoolean__ValueAssignment"
    // InternalMiniScript.g:3306:1: rule__LiteralBoolean__ValueAssignment : ( ruleBooleanValue ) ;
    public final void rule__LiteralBoolean__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:3310:1: ( ( ruleBooleanValue ) )
            // InternalMiniScript.g:3311:2: ( ruleBooleanValue )
            {
            // InternalMiniScript.g:3311:2: ( ruleBooleanValue )
            // InternalMiniScript.g:3312:3: ruleBooleanValue
            {
             before(grammarAccess.getLiteralBooleanAccess().getValueBooleanValueEnumRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleBooleanValue();

            state._fsp--;

             after(grammarAccess.getLiteralBooleanAccess().getValueBooleanValueEnumRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralBoolean__ValueAssignment"


    // $ANTLR start "rule__LiteralNumber__ValueAssignment"
    // InternalMiniScript.g:3321:1: rule__LiteralNumber__ValueAssignment : ( RULE_INT ) ;
    public final void rule__LiteralNumber__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:3325:1: ( ( RULE_INT ) )
            // InternalMiniScript.g:3326:2: ( RULE_INT )
            {
            // InternalMiniScript.g:3326:2: ( RULE_INT )
            // InternalMiniScript.g:3327:3: RULE_INT
            {
             before(grammarAccess.getLiteralNumberAccess().getValueINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getLiteralNumberAccess().getValueINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralNumber__ValueAssignment"


    // $ANTLR start "rule__VariableAssignment__IdAssignment_0"
    // InternalMiniScript.g:3336:1: rule__VariableAssignment__IdAssignment_0 : ( RULE_ID ) ;
    public final void rule__VariableAssignment__IdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:3340:1: ( ( RULE_ID ) )
            // InternalMiniScript.g:3341:2: ( RULE_ID )
            {
            // InternalMiniScript.g:3341:2: ( RULE_ID )
            // InternalMiniScript.g:3342:3: RULE_ID
            {
             before(grammarAccess.getVariableAssignmentAccess().getIdIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableAssignmentAccess().getIdIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableAssignment__IdAssignment_0"


    // $ANTLR start "rule__VariableAssignment__ExpressionAssignment_2"
    // InternalMiniScript.g:3351:1: rule__VariableAssignment__ExpressionAssignment_2 : ( ruleExpression ) ;
    public final void rule__VariableAssignment__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniScript.g:3355:1: ( ( ruleExpression ) )
            // InternalMiniScript.g:3356:2: ( ruleExpression )
            {
            // InternalMiniScript.g:3356:2: ( ruleExpression )
            // InternalMiniScript.g:3357:3: ruleExpression
            {
             before(grammarAccess.getVariableAssignmentAccess().getExpressionExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getVariableAssignmentAccess().getExpressionExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableAssignment__ExpressionAssignment_2"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\2\uffff\1\6\7\uffff";
    static final String dfa_3s = "\1\4\1\uffff\1\15\7\uffff";
    static final String dfa_4s = "\1\42\1\uffff\1\43\7\uffff";
    static final String dfa_5s = "\1\uffff\1\1\1\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\2";
    static final String dfa_6s = "\12\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\1\6\5\uffff\1\4\1\5\12\uffff\2\3\2\6\1\uffff\1\10\1\uffff\1\7\1\uffff\1\6\1\uffff\1\1",
            "",
            "\12\6\4\uffff\1\6\3\uffff\3\6\1\uffff\1\11",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
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
            return "689:1: rule__Expression__Alternatives : ( ( ruleFunctionDeclaration ) | ( ruleVariableAssignment ) | ( ruleLogicalBinaryExpression ) | ( ruleLogicalUnaryExpression ) | ( ruleTernaryExpression ) | ( ruleComparisonExpression ) | ( ruleLetExpression ) | ( ruleBlockExpression ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000557801830L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000557801832L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000007E0000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000106000030L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000757801830L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000800000000L});

}