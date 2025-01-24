package ch.vobos.ide.contentassist.antlr.internal;

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
import ch.vobos.services.TypescriptGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTypescriptParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_DOC_COMMENT_END", "RULE_DOC_ANNOTATION_PREFIX", "RULE_DOC_COMMENT_LINE", "RULE_ML_COMMENT", "RULE_INT", "RULE_STRING", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'any'", "'number'", "'boolean'", "'string'", "'void'", "'import'", "'='", "'module'", "'{'", "'}'", "'.'", "';'", "'interface'", "'class'", "'extends'", "','", "':'", "'['", "']'", "'/**'", "'export'", "'?'"
    };
    public static final int RULE_DOC_COMMENT_END=5;
    public static final int RULE_STRING=10;
    public static final int RULE_DOC_COMMENT_LINE=7;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int RULE_DOC_ANNOTATION_PREFIX=6;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=9;
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


        public InternalTypescriptParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTypescriptParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTypescriptParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTypescript.g"; }


    	private TypescriptGrammarAccess grammarAccess;

    	public void setGrammarAccess(TypescriptGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleTypescript"
    // InternalTypescript.g:53:1: entryRuleTypescript : ruleTypescript EOF ;
    public final void entryRuleTypescript() throws RecognitionException {
        try {
            // InternalTypescript.g:54:1: ( ruleTypescript EOF )
            // InternalTypescript.g:55:1: ruleTypescript EOF
            {
             before(grammarAccess.getTypescriptRule()); 
            pushFollow(FOLLOW_1);
            ruleTypescript();

            state._fsp--;

             after(grammarAccess.getTypescriptRule()); 
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
    // $ANTLR end "entryRuleTypescript"


    // $ANTLR start "ruleTypescript"
    // InternalTypescript.g:62:1: ruleTypescript : ( ( rule__Typescript__Group__0 ) ) ;
    public final void ruleTypescript() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:66:2: ( ( ( rule__Typescript__Group__0 ) ) )
            // InternalTypescript.g:67:2: ( ( rule__Typescript__Group__0 ) )
            {
            // InternalTypescript.g:67:2: ( ( rule__Typescript__Group__0 ) )
            // InternalTypescript.g:68:3: ( rule__Typescript__Group__0 )
            {
             before(grammarAccess.getTypescriptAccess().getGroup()); 
            // InternalTypescript.g:69:3: ( rule__Typescript__Group__0 )
            // InternalTypescript.g:69:4: rule__Typescript__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Typescript__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypescriptAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypescript"


    // $ANTLR start "entryRuleInterfacesAndClasses"
    // InternalTypescript.g:78:1: entryRuleInterfacesAndClasses : ruleInterfacesAndClasses EOF ;
    public final void entryRuleInterfacesAndClasses() throws RecognitionException {
        try {
            // InternalTypescript.g:79:1: ( ruleInterfacesAndClasses EOF )
            // InternalTypescript.g:80:1: ruleInterfacesAndClasses EOF
            {
             before(grammarAccess.getInterfacesAndClassesRule()); 
            pushFollow(FOLLOW_1);
            ruleInterfacesAndClasses();

            state._fsp--;

             after(grammarAccess.getInterfacesAndClassesRule()); 
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
    // $ANTLR end "entryRuleInterfacesAndClasses"


    // $ANTLR start "ruleInterfacesAndClasses"
    // InternalTypescript.g:87:1: ruleInterfacesAndClasses : ( ( rule__InterfacesAndClasses__Group__0 ) ) ;
    public final void ruleInterfacesAndClasses() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:91:2: ( ( ( rule__InterfacesAndClasses__Group__0 ) ) )
            // InternalTypescript.g:92:2: ( ( rule__InterfacesAndClasses__Group__0 ) )
            {
            // InternalTypescript.g:92:2: ( ( rule__InterfacesAndClasses__Group__0 ) )
            // InternalTypescript.g:93:3: ( rule__InterfacesAndClasses__Group__0 )
            {
             before(grammarAccess.getInterfacesAndClassesAccess().getGroup()); 
            // InternalTypescript.g:94:3: ( rule__InterfacesAndClasses__Group__0 )
            // InternalTypescript.g:94:4: rule__InterfacesAndClasses__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InterfacesAndClasses__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInterfacesAndClassesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInterfacesAndClasses"


    // $ANTLR start "entryRuleImportDeclaration"
    // InternalTypescript.g:103:1: entryRuleImportDeclaration : ruleImportDeclaration EOF ;
    public final void entryRuleImportDeclaration() throws RecognitionException {
        try {
            // InternalTypescript.g:104:1: ( ruleImportDeclaration EOF )
            // InternalTypescript.g:105:1: ruleImportDeclaration EOF
            {
             before(grammarAccess.getImportDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleImportDeclaration();

            state._fsp--;

             after(grammarAccess.getImportDeclarationRule()); 
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
    // $ANTLR end "entryRuleImportDeclaration"


    // $ANTLR start "ruleImportDeclaration"
    // InternalTypescript.g:112:1: ruleImportDeclaration : ( ( rule__ImportDeclaration__Group__0 ) ) ;
    public final void ruleImportDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:116:2: ( ( ( rule__ImportDeclaration__Group__0 ) ) )
            // InternalTypescript.g:117:2: ( ( rule__ImportDeclaration__Group__0 ) )
            {
            // InternalTypescript.g:117:2: ( ( rule__ImportDeclaration__Group__0 ) )
            // InternalTypescript.g:118:3: ( rule__ImportDeclaration__Group__0 )
            {
             before(grammarAccess.getImportDeclarationAccess().getGroup()); 
            // InternalTypescript.g:119:3: ( rule__ImportDeclaration__Group__0 )
            // InternalTypescript.g:119:4: rule__ImportDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ImportDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImportDeclaration"


    // $ANTLR start "entryRuleModuleDeclaration"
    // InternalTypescript.g:128:1: entryRuleModuleDeclaration : ruleModuleDeclaration EOF ;
    public final void entryRuleModuleDeclaration() throws RecognitionException {
        try {
            // InternalTypescript.g:129:1: ( ruleModuleDeclaration EOF )
            // InternalTypescript.g:130:1: ruleModuleDeclaration EOF
            {
             before(grammarAccess.getModuleDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleModuleDeclaration();

            state._fsp--;

             after(grammarAccess.getModuleDeclarationRule()); 
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
    // $ANTLR end "entryRuleModuleDeclaration"


    // $ANTLR start "ruleModuleDeclaration"
    // InternalTypescript.g:137:1: ruleModuleDeclaration : ( ( rule__ModuleDeclaration__Group__0 ) ) ;
    public final void ruleModuleDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:141:2: ( ( ( rule__ModuleDeclaration__Group__0 ) ) )
            // InternalTypescript.g:142:2: ( ( rule__ModuleDeclaration__Group__0 ) )
            {
            // InternalTypescript.g:142:2: ( ( rule__ModuleDeclaration__Group__0 ) )
            // InternalTypescript.g:143:3: ( rule__ModuleDeclaration__Group__0 )
            {
             before(grammarAccess.getModuleDeclarationAccess().getGroup()); 
            // InternalTypescript.g:144:3: ( rule__ModuleDeclaration__Group__0 )
            // InternalTypescript.g:144:4: rule__ModuleDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ModuleDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModuleDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModuleDeclaration"


    // $ANTLR start "entryRuleModuleBody"
    // InternalTypescript.g:153:1: entryRuleModuleBody : ruleModuleBody EOF ;
    public final void entryRuleModuleBody() throws RecognitionException {
        try {
            // InternalTypescript.g:154:1: ( ruleModuleBody EOF )
            // InternalTypescript.g:155:1: ruleModuleBody EOF
            {
             before(grammarAccess.getModuleBodyRule()); 
            pushFollow(FOLLOW_1);
            ruleModuleBody();

            state._fsp--;

             after(grammarAccess.getModuleBodyRule()); 
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
    // $ANTLR end "entryRuleModuleBody"


    // $ANTLR start "ruleModuleBody"
    // InternalTypescript.g:162:1: ruleModuleBody : ( ( rule__ModuleBody__Group__0 ) ) ;
    public final void ruleModuleBody() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:166:2: ( ( ( rule__ModuleBody__Group__0 ) ) )
            // InternalTypescript.g:167:2: ( ( rule__ModuleBody__Group__0 ) )
            {
            // InternalTypescript.g:167:2: ( ( rule__ModuleBody__Group__0 ) )
            // InternalTypescript.g:168:3: ( rule__ModuleBody__Group__0 )
            {
             before(grammarAccess.getModuleBodyAccess().getGroup()); 
            // InternalTypescript.g:169:3: ( rule__ModuleBody__Group__0 )
            // InternalTypescript.g:169:4: rule__ModuleBody__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ModuleBody__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModuleBodyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModuleBody"


    // $ANTLR start "entryRuleModuleElement"
    // InternalTypescript.g:178:1: entryRuleModuleElement : ruleModuleElement EOF ;
    public final void entryRuleModuleElement() throws RecognitionException {
        try {
            // InternalTypescript.g:179:1: ( ruleModuleElement EOF )
            // InternalTypescript.g:180:1: ruleModuleElement EOF
            {
             before(grammarAccess.getModuleElementRule()); 
            pushFollow(FOLLOW_1);
            ruleModuleElement();

            state._fsp--;

             after(grammarAccess.getModuleElementRule()); 
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
    // $ANTLR end "entryRuleModuleElement"


    // $ANTLR start "ruleModuleElement"
    // InternalTypescript.g:187:1: ruleModuleElement : ( ( rule__ModuleElement__Group__0 ) ) ;
    public final void ruleModuleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:191:2: ( ( ( rule__ModuleElement__Group__0 ) ) )
            // InternalTypescript.g:192:2: ( ( rule__ModuleElement__Group__0 ) )
            {
            // InternalTypescript.g:192:2: ( ( rule__ModuleElement__Group__0 ) )
            // InternalTypescript.g:193:3: ( rule__ModuleElement__Group__0 )
            {
             before(grammarAccess.getModuleElementAccess().getGroup()); 
            // InternalTypescript.g:194:3: ( rule__ModuleElement__Group__0 )
            // InternalTypescript.g:194:4: rule__ModuleElement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ModuleElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModuleElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModuleElement"


    // $ANTLR start "entryRuleDeclaration"
    // InternalTypescript.g:203:1: entryRuleDeclaration : ruleDeclaration EOF ;
    public final void entryRuleDeclaration() throws RecognitionException {
        try {
            // InternalTypescript.g:204:1: ( ruleDeclaration EOF )
            // InternalTypescript.g:205:1: ruleDeclaration EOF
            {
             before(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleDeclaration();

            state._fsp--;

             after(grammarAccess.getDeclarationRule()); 
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
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // InternalTypescript.g:212:1: ruleDeclaration : ( ( rule__Declaration__Group__0 ) ) ;
    public final void ruleDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:216:2: ( ( ( rule__Declaration__Group__0 ) ) )
            // InternalTypescript.g:217:2: ( ( rule__Declaration__Group__0 ) )
            {
            // InternalTypescript.g:217:2: ( ( rule__Declaration__Group__0 ) )
            // InternalTypescript.g:218:3: ( rule__Declaration__Group__0 )
            {
             before(grammarAccess.getDeclarationAccess().getGroup()); 
            // InternalTypescript.g:219:3: ( rule__Declaration__Group__0 )
            // InternalTypescript.g:219:4: rule__Declaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Declaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleInterfaceOrClassDeclaration"
    // InternalTypescript.g:228:1: entryRuleInterfaceOrClassDeclaration : ruleInterfaceOrClassDeclaration EOF ;
    public final void entryRuleInterfaceOrClassDeclaration() throws RecognitionException {
        try {
            // InternalTypescript.g:229:1: ( ruleInterfaceOrClassDeclaration EOF )
            // InternalTypescript.g:230:1: ruleInterfaceOrClassDeclaration EOF
            {
             before(grammarAccess.getInterfaceOrClassDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleInterfaceOrClassDeclaration();

            state._fsp--;

             after(grammarAccess.getInterfaceOrClassDeclarationRule()); 
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
    // $ANTLR end "entryRuleInterfaceOrClassDeclaration"


    // $ANTLR start "ruleInterfaceOrClassDeclaration"
    // InternalTypescript.g:237:1: ruleInterfaceOrClassDeclaration : ( ( rule__InterfaceOrClassDeclaration__Group__0 ) ) ;
    public final void ruleInterfaceOrClassDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:241:2: ( ( ( rule__InterfaceOrClassDeclaration__Group__0 ) ) )
            // InternalTypescript.g:242:2: ( ( rule__InterfaceOrClassDeclaration__Group__0 ) )
            {
            // InternalTypescript.g:242:2: ( ( rule__InterfaceOrClassDeclaration__Group__0 ) )
            // InternalTypescript.g:243:3: ( rule__InterfaceOrClassDeclaration__Group__0 )
            {
             before(grammarAccess.getInterfaceOrClassDeclarationAccess().getGroup()); 
            // InternalTypescript.g:244:3: ( rule__InterfaceOrClassDeclaration__Group__0 )
            // InternalTypescript.g:244:4: rule__InterfaceOrClassDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InterfaceOrClassDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceOrClassDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInterfaceOrClassDeclaration"


    // $ANTLR start "entryRuleInterfaceDeclaration"
    // InternalTypescript.g:253:1: entryRuleInterfaceDeclaration : ruleInterfaceDeclaration EOF ;
    public final void entryRuleInterfaceDeclaration() throws RecognitionException {
        try {
            // InternalTypescript.g:254:1: ( ruleInterfaceDeclaration EOF )
            // InternalTypescript.g:255:1: ruleInterfaceDeclaration EOF
            {
             before(grammarAccess.getInterfaceDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleInterfaceDeclaration();

            state._fsp--;

             after(grammarAccess.getInterfaceDeclarationRule()); 
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
    // $ANTLR end "entryRuleInterfaceDeclaration"


    // $ANTLR start "ruleInterfaceDeclaration"
    // InternalTypescript.g:262:1: ruleInterfaceDeclaration : ( ( rule__InterfaceDeclaration__Group__0 ) ) ;
    public final void ruleInterfaceDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:266:2: ( ( ( rule__InterfaceDeclaration__Group__0 ) ) )
            // InternalTypescript.g:267:2: ( ( rule__InterfaceDeclaration__Group__0 ) )
            {
            // InternalTypescript.g:267:2: ( ( rule__InterfaceDeclaration__Group__0 ) )
            // InternalTypescript.g:268:3: ( rule__InterfaceDeclaration__Group__0 )
            {
             before(grammarAccess.getInterfaceDeclarationAccess().getGroup()); 
            // InternalTypescript.g:269:3: ( rule__InterfaceDeclaration__Group__0 )
            // InternalTypescript.g:269:4: rule__InterfaceDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InterfaceDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInterfaceDeclaration"


    // $ANTLR start "entryRuleClassDeclaration"
    // InternalTypescript.g:278:1: entryRuleClassDeclaration : ruleClassDeclaration EOF ;
    public final void entryRuleClassDeclaration() throws RecognitionException {
        try {
            // InternalTypescript.g:279:1: ( ruleClassDeclaration EOF )
            // InternalTypescript.g:280:1: ruleClassDeclaration EOF
            {
             before(grammarAccess.getClassDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleClassDeclaration();

            state._fsp--;

             after(grammarAccess.getClassDeclarationRule()); 
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
    // $ANTLR end "entryRuleClassDeclaration"


    // $ANTLR start "ruleClassDeclaration"
    // InternalTypescript.g:287:1: ruleClassDeclaration : ( ( rule__ClassDeclaration__Group__0 ) ) ;
    public final void ruleClassDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:291:2: ( ( ( rule__ClassDeclaration__Group__0 ) ) )
            // InternalTypescript.g:292:2: ( ( rule__ClassDeclaration__Group__0 ) )
            {
            // InternalTypescript.g:292:2: ( ( rule__ClassDeclaration__Group__0 ) )
            // InternalTypescript.g:293:3: ( rule__ClassDeclaration__Group__0 )
            {
             before(grammarAccess.getClassDeclarationAccess().getGroup()); 
            // InternalTypescript.g:294:3: ( rule__ClassDeclaration__Group__0 )
            // InternalTypescript.g:294:4: rule__ClassDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClassDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClassDeclaration"


    // $ANTLR start "entryRuleIdentifier"
    // InternalTypescript.g:303:1: entryRuleIdentifier : ruleIdentifier EOF ;
    public final void entryRuleIdentifier() throws RecognitionException {
        try {
            // InternalTypescript.g:304:1: ( ruleIdentifier EOF )
            // InternalTypescript.g:305:1: ruleIdentifier EOF
            {
             before(grammarAccess.getIdentifierRule()); 
            pushFollow(FOLLOW_1);
            ruleIdentifier();

            state._fsp--;

             after(grammarAccess.getIdentifierRule()); 
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
    // $ANTLR end "entryRuleIdentifier"


    // $ANTLR start "ruleIdentifier"
    // InternalTypescript.g:312:1: ruleIdentifier : ( RULE_ID ) ;
    public final void ruleIdentifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:316:2: ( ( RULE_ID ) )
            // InternalTypescript.g:317:2: ( RULE_ID )
            {
            // InternalTypescript.g:317:2: ( RULE_ID )
            // InternalTypescript.g:318:3: RULE_ID
            {
             before(grammarAccess.getIdentifierAccess().getIDTerminalRuleCall()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIdentifierAccess().getIDTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIdentifier"


    // $ANTLR start "entryRuleInterfaceExtendsClause"
    // InternalTypescript.g:328:1: entryRuleInterfaceExtendsClause : ruleInterfaceExtendsClause EOF ;
    public final void entryRuleInterfaceExtendsClause() throws RecognitionException {
        try {
            // InternalTypescript.g:329:1: ( ruleInterfaceExtendsClause EOF )
            // InternalTypescript.g:330:1: ruleInterfaceExtendsClause EOF
            {
             before(grammarAccess.getInterfaceExtendsClauseRule()); 
            pushFollow(FOLLOW_1);
            ruleInterfaceExtendsClause();

            state._fsp--;

             after(grammarAccess.getInterfaceExtendsClauseRule()); 
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
    // $ANTLR end "entryRuleInterfaceExtendsClause"


    // $ANTLR start "ruleInterfaceExtendsClause"
    // InternalTypescript.g:337:1: ruleInterfaceExtendsClause : ( ( rule__InterfaceExtendsClause__Group__0 ) ) ;
    public final void ruleInterfaceExtendsClause() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:341:2: ( ( ( rule__InterfaceExtendsClause__Group__0 ) ) )
            // InternalTypescript.g:342:2: ( ( rule__InterfaceExtendsClause__Group__0 ) )
            {
            // InternalTypescript.g:342:2: ( ( rule__InterfaceExtendsClause__Group__0 ) )
            // InternalTypescript.g:343:3: ( rule__InterfaceExtendsClause__Group__0 )
            {
             before(grammarAccess.getInterfaceExtendsClauseAccess().getGroup()); 
            // InternalTypescript.g:344:3: ( rule__InterfaceExtendsClause__Group__0 )
            // InternalTypescript.g:344:4: rule__InterfaceExtendsClause__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InterfaceExtendsClause__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceExtendsClauseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInterfaceExtendsClause"


    // $ANTLR start "entryRuleClassOrInterfaceTypeList"
    // InternalTypescript.g:353:1: entryRuleClassOrInterfaceTypeList : ruleClassOrInterfaceTypeList EOF ;
    public final void entryRuleClassOrInterfaceTypeList() throws RecognitionException {
        try {
            // InternalTypescript.g:354:1: ( ruleClassOrInterfaceTypeList EOF )
            // InternalTypescript.g:355:1: ruleClassOrInterfaceTypeList EOF
            {
             before(grammarAccess.getClassOrInterfaceTypeListRule()); 
            pushFollow(FOLLOW_1);
            ruleClassOrInterfaceTypeList();

            state._fsp--;

             after(grammarAccess.getClassOrInterfaceTypeListRule()); 
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
    // $ANTLR end "entryRuleClassOrInterfaceTypeList"


    // $ANTLR start "ruleClassOrInterfaceTypeList"
    // InternalTypescript.g:362:1: ruleClassOrInterfaceTypeList : ( ( rule__ClassOrInterfaceTypeList__Group__0 ) ) ;
    public final void ruleClassOrInterfaceTypeList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:366:2: ( ( ( rule__ClassOrInterfaceTypeList__Group__0 ) ) )
            // InternalTypescript.g:367:2: ( ( rule__ClassOrInterfaceTypeList__Group__0 ) )
            {
            // InternalTypescript.g:367:2: ( ( rule__ClassOrInterfaceTypeList__Group__0 ) )
            // InternalTypescript.g:368:3: ( rule__ClassOrInterfaceTypeList__Group__0 )
            {
             before(grammarAccess.getClassOrInterfaceTypeListAccess().getGroup()); 
            // InternalTypescript.g:369:3: ( rule__ClassOrInterfaceTypeList__Group__0 )
            // InternalTypescript.g:369:4: rule__ClassOrInterfaceTypeList__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ClassOrInterfaceTypeList__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClassOrInterfaceTypeListAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClassOrInterfaceTypeList"


    // $ANTLR start "entryRuleObjectType"
    // InternalTypescript.g:378:1: entryRuleObjectType : ruleObjectType EOF ;
    public final void entryRuleObjectType() throws RecognitionException {
        try {
            // InternalTypescript.g:379:1: ( ruleObjectType EOF )
            // InternalTypescript.g:380:1: ruleObjectType EOF
            {
             before(grammarAccess.getObjectTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleObjectType();

            state._fsp--;

             after(grammarAccess.getObjectTypeRule()); 
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
    // $ANTLR end "entryRuleObjectType"


    // $ANTLR start "ruleObjectType"
    // InternalTypescript.g:387:1: ruleObjectType : ( ( rule__ObjectType__Group__0 ) ) ;
    public final void ruleObjectType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:391:2: ( ( ( rule__ObjectType__Group__0 ) ) )
            // InternalTypescript.g:392:2: ( ( rule__ObjectType__Group__0 ) )
            {
            // InternalTypescript.g:392:2: ( ( rule__ObjectType__Group__0 ) )
            // InternalTypescript.g:393:3: ( rule__ObjectType__Group__0 )
            {
             before(grammarAccess.getObjectTypeAccess().getGroup()); 
            // InternalTypescript.g:394:3: ( rule__ObjectType__Group__0 )
            // InternalTypescript.g:394:4: rule__ObjectType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ObjectType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getObjectTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleObjectType"


    // $ANTLR start "entryRuleTypeMember"
    // InternalTypescript.g:403:1: entryRuleTypeMember : ruleTypeMember EOF ;
    public final void entryRuleTypeMember() throws RecognitionException {
        try {
            // InternalTypescript.g:404:1: ( ruleTypeMember EOF )
            // InternalTypescript.g:405:1: ruleTypeMember EOF
            {
             before(grammarAccess.getTypeMemberRule()); 
            pushFollow(FOLLOW_1);
            ruleTypeMember();

            state._fsp--;

             after(grammarAccess.getTypeMemberRule()); 
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
    // $ANTLR end "entryRuleTypeMember"


    // $ANTLR start "ruleTypeMember"
    // InternalTypescript.g:412:1: ruleTypeMember : ( ( rule__TypeMember__Group__0 ) ) ;
    public final void ruleTypeMember() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:416:2: ( ( ( rule__TypeMember__Group__0 ) ) )
            // InternalTypescript.g:417:2: ( ( rule__TypeMember__Group__0 ) )
            {
            // InternalTypescript.g:417:2: ( ( rule__TypeMember__Group__0 ) )
            // InternalTypescript.g:418:3: ( rule__TypeMember__Group__0 )
            {
             before(grammarAccess.getTypeMemberAccess().getGroup()); 
            // InternalTypescript.g:419:3: ( rule__TypeMember__Group__0 )
            // InternalTypescript.g:419:4: rule__TypeMember__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TypeMember__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeMemberAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeMember"


    // $ANTLR start "entryRulePropertySignature"
    // InternalTypescript.g:428:1: entryRulePropertySignature : rulePropertySignature EOF ;
    public final void entryRulePropertySignature() throws RecognitionException {
        try {
            // InternalTypescript.g:429:1: ( rulePropertySignature EOF )
            // InternalTypescript.g:430:1: rulePropertySignature EOF
            {
             before(grammarAccess.getPropertySignatureRule()); 
            pushFollow(FOLLOW_1);
            rulePropertySignature();

            state._fsp--;

             after(grammarAccess.getPropertySignatureRule()); 
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
    // $ANTLR end "entryRulePropertySignature"


    // $ANTLR start "rulePropertySignature"
    // InternalTypescript.g:437:1: rulePropertySignature : ( ( rule__PropertySignature__Group__0 ) ) ;
    public final void rulePropertySignature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:441:2: ( ( ( rule__PropertySignature__Group__0 ) ) )
            // InternalTypescript.g:442:2: ( ( rule__PropertySignature__Group__0 ) )
            {
            // InternalTypescript.g:442:2: ( ( rule__PropertySignature__Group__0 ) )
            // InternalTypescript.g:443:3: ( rule__PropertySignature__Group__0 )
            {
             before(grammarAccess.getPropertySignatureAccess().getGroup()); 
            // InternalTypescript.g:444:3: ( rule__PropertySignature__Group__0 )
            // InternalTypescript.g:444:4: rule__PropertySignature__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PropertySignature__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertySignatureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePropertySignature"


    // $ANTLR start "entryRuleIdentifierName"
    // InternalTypescript.g:453:1: entryRuleIdentifierName : ruleIdentifierName EOF ;
    public final void entryRuleIdentifierName() throws RecognitionException {
        try {
            // InternalTypescript.g:454:1: ( ruleIdentifierName EOF )
            // InternalTypescript.g:455:1: ruleIdentifierName EOF
            {
             before(grammarAccess.getIdentifierNameRule()); 
            pushFollow(FOLLOW_1);
            ruleIdentifierName();

            state._fsp--;

             after(grammarAccess.getIdentifierNameRule()); 
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
    // $ANTLR end "entryRuleIdentifierName"


    // $ANTLR start "ruleIdentifierName"
    // InternalTypescript.g:462:1: ruleIdentifierName : ( RULE_ID ) ;
    public final void ruleIdentifierName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:466:2: ( ( RULE_ID ) )
            // InternalTypescript.g:467:2: ( RULE_ID )
            {
            // InternalTypescript.g:467:2: ( RULE_ID )
            // InternalTypescript.g:468:3: RULE_ID
            {
             before(grammarAccess.getIdentifierNameAccess().getIDTerminalRuleCall()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIdentifierNameAccess().getIDTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIdentifierName"


    // $ANTLR start "entryRuleType"
    // InternalTypescript.g:478:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalTypescript.g:479:1: ( ruleType EOF )
            // InternalTypescript.g:480:1: ruleType EOF
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
    // InternalTypescript.g:487:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:491:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalTypescript.g:492:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalTypescript.g:492:2: ( ( rule__Type__Alternatives ) )
            // InternalTypescript.g:493:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalTypescript.g:494:3: ( rule__Type__Alternatives )
            // InternalTypescript.g:494:4: rule__Type__Alternatives
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


    // $ANTLR start "entryRulePredefinedType"
    // InternalTypescript.g:503:1: entryRulePredefinedType : rulePredefinedType EOF ;
    public final void entryRulePredefinedType() throws RecognitionException {
        try {
            // InternalTypescript.g:504:1: ( rulePredefinedType EOF )
            // InternalTypescript.g:505:1: rulePredefinedType EOF
            {
             before(grammarAccess.getPredefinedTypeRule()); 
            pushFollow(FOLLOW_1);
            rulePredefinedType();

            state._fsp--;

             after(grammarAccess.getPredefinedTypeRule()); 
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
    // $ANTLR end "entryRulePredefinedType"


    // $ANTLR start "rulePredefinedType"
    // InternalTypescript.g:512:1: rulePredefinedType : ( ( rule__PredefinedType__PredefinedTypeAssignment ) ) ;
    public final void rulePredefinedType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:516:2: ( ( ( rule__PredefinedType__PredefinedTypeAssignment ) ) )
            // InternalTypescript.g:517:2: ( ( rule__PredefinedType__PredefinedTypeAssignment ) )
            {
            // InternalTypescript.g:517:2: ( ( rule__PredefinedType__PredefinedTypeAssignment ) )
            // InternalTypescript.g:518:3: ( rule__PredefinedType__PredefinedTypeAssignment )
            {
             before(grammarAccess.getPredefinedTypeAccess().getPredefinedTypeAssignment()); 
            // InternalTypescript.g:519:3: ( rule__PredefinedType__PredefinedTypeAssignment )
            // InternalTypescript.g:519:4: rule__PredefinedType__PredefinedTypeAssignment
            {
            pushFollow(FOLLOW_2);
            rule__PredefinedType__PredefinedTypeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getPredefinedTypeAccess().getPredefinedTypeAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePredefinedType"


    // $ANTLR start "entryRuleTypeLiteral"
    // InternalTypescript.g:528:1: entryRuleTypeLiteral : ruleTypeLiteral EOF ;
    public final void entryRuleTypeLiteral() throws RecognitionException {
        try {
            // InternalTypescript.g:529:1: ( ruleTypeLiteral EOF )
            // InternalTypescript.g:530:1: ruleTypeLiteral EOF
            {
             before(grammarAccess.getTypeLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleTypeLiteral();

            state._fsp--;

             after(grammarAccess.getTypeLiteralRule()); 
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
    // $ANTLR end "entryRuleTypeLiteral"


    // $ANTLR start "ruleTypeLiteral"
    // InternalTypescript.g:537:1: ruleTypeLiteral : ( ( rule__TypeLiteral__Alternatives ) ) ;
    public final void ruleTypeLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:541:2: ( ( ( rule__TypeLiteral__Alternatives ) ) )
            // InternalTypescript.g:542:2: ( ( rule__TypeLiteral__Alternatives ) )
            {
            // InternalTypescript.g:542:2: ( ( rule__TypeLiteral__Alternatives ) )
            // InternalTypescript.g:543:3: ( rule__TypeLiteral__Alternatives )
            {
             before(grammarAccess.getTypeLiteralAccess().getAlternatives()); 
            // InternalTypescript.g:544:3: ( rule__TypeLiteral__Alternatives )
            // InternalTypescript.g:544:4: rule__TypeLiteral__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TypeLiteral__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeLiteralAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeLiteral"


    // $ANTLR start "entryRuleArrayType"
    // InternalTypescript.g:553:1: entryRuleArrayType : ruleArrayType EOF ;
    public final void entryRuleArrayType() throws RecognitionException {
        try {
            // InternalTypescript.g:554:1: ( ruleArrayType EOF )
            // InternalTypescript.g:555:1: ruleArrayType EOF
            {
             before(grammarAccess.getArrayTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleArrayType();

            state._fsp--;

             after(grammarAccess.getArrayTypeRule()); 
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
    // $ANTLR end "entryRuleArrayType"


    // $ANTLR start "ruleArrayType"
    // InternalTypescript.g:562:1: ruleArrayType : ( ( rule__ArrayType__Alternatives ) ) ;
    public final void ruleArrayType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:566:2: ( ( ( rule__ArrayType__Alternatives ) ) )
            // InternalTypescript.g:567:2: ( ( rule__ArrayType__Alternatives ) )
            {
            // InternalTypescript.g:567:2: ( ( rule__ArrayType__Alternatives ) )
            // InternalTypescript.g:568:3: ( rule__ArrayType__Alternatives )
            {
             before(grammarAccess.getArrayTypeAccess().getAlternatives()); 
            // InternalTypescript.g:569:3: ( rule__ArrayType__Alternatives )
            // InternalTypescript.g:569:4: rule__ArrayType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ArrayType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getArrayTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArrayType"


    // $ANTLR start "entryRuleTypeReference"
    // InternalTypescript.g:578:1: entryRuleTypeReference : ruleTypeReference EOF ;
    public final void entryRuleTypeReference() throws RecognitionException {
        try {
            // InternalTypescript.g:579:1: ( ruleTypeReference EOF )
            // InternalTypescript.g:580:1: ruleTypeReference EOF
            {
             before(grammarAccess.getTypeReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleTypeReference();

            state._fsp--;

             after(grammarAccess.getTypeReferenceRule()); 
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
    // $ANTLR end "entryRuleTypeReference"


    // $ANTLR start "ruleTypeReference"
    // InternalTypescript.g:587:1: ruleTypeReference : ( ( rule__TypeReference__ReferenceAssignment ) ) ;
    public final void ruleTypeReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:591:2: ( ( ( rule__TypeReference__ReferenceAssignment ) ) )
            // InternalTypescript.g:592:2: ( ( rule__TypeReference__ReferenceAssignment ) )
            {
            // InternalTypescript.g:592:2: ( ( rule__TypeReference__ReferenceAssignment ) )
            // InternalTypescript.g:593:3: ( rule__TypeReference__ReferenceAssignment )
            {
             before(grammarAccess.getTypeReferenceAccess().getReferenceAssignment()); 
            // InternalTypescript.g:594:3: ( rule__TypeReference__ReferenceAssignment )
            // InternalTypescript.g:594:4: rule__TypeReference__ReferenceAssignment
            {
            pushFollow(FOLLOW_2);
            rule__TypeReference__ReferenceAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTypeReferenceAccess().getReferenceAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeReference"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalTypescript.g:603:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalTypescript.g:604:1: ( ruleQualifiedName EOF )
            // InternalTypescript.g:605:1: ruleQualifiedName EOF
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
    // InternalTypescript.g:612:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:616:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalTypescript.g:617:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalTypescript.g:617:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalTypescript.g:618:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalTypescript.g:619:3: ( rule__QualifiedName__Group__0 )
            // InternalTypescript.g:619:4: rule__QualifiedName__Group__0
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


    // $ANTLR start "entryRuleDocComment"
    // InternalTypescript.g:628:1: entryRuleDocComment : ruleDocComment EOF ;
    public final void entryRuleDocComment() throws RecognitionException {
        try {
            // InternalTypescript.g:629:1: ( ruleDocComment EOF )
            // InternalTypescript.g:630:1: ruleDocComment EOF
            {
             before(grammarAccess.getDocCommentRule()); 
            pushFollow(FOLLOW_1);
            ruleDocComment();

            state._fsp--;

             after(grammarAccess.getDocCommentRule()); 
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
    // $ANTLR end "entryRuleDocComment"


    // $ANTLR start "ruleDocComment"
    // InternalTypescript.g:637:1: ruleDocComment : ( ( rule__DocComment__Group__0 ) ) ;
    public final void ruleDocComment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:641:2: ( ( ( rule__DocComment__Group__0 ) ) )
            // InternalTypescript.g:642:2: ( ( rule__DocComment__Group__0 ) )
            {
            // InternalTypescript.g:642:2: ( ( rule__DocComment__Group__0 ) )
            // InternalTypescript.g:643:3: ( rule__DocComment__Group__0 )
            {
             before(grammarAccess.getDocCommentAccess().getGroup()); 
            // InternalTypescript.g:644:3: ( rule__DocComment__Group__0 )
            // InternalTypescript.g:644:4: rule__DocComment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DocComment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDocCommentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDocComment"


    // $ANTLR start "entryRuleAnnotationLine"
    // InternalTypescript.g:653:1: entryRuleAnnotationLine : ruleAnnotationLine EOF ;
    public final void entryRuleAnnotationLine() throws RecognitionException {
        try {
            // InternalTypescript.g:654:1: ( ruleAnnotationLine EOF )
            // InternalTypescript.g:655:1: ruleAnnotationLine EOF
            {
             before(grammarAccess.getAnnotationLineRule()); 
            pushFollow(FOLLOW_1);
            ruleAnnotationLine();

            state._fsp--;

             after(grammarAccess.getAnnotationLineRule()); 
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
    // $ANTLR end "entryRuleAnnotationLine"


    // $ANTLR start "ruleAnnotationLine"
    // InternalTypescript.g:662:1: ruleAnnotationLine : ( ( rule__AnnotationLine__Group__0 ) ) ;
    public final void ruleAnnotationLine() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:666:2: ( ( ( rule__AnnotationLine__Group__0 ) ) )
            // InternalTypescript.g:667:2: ( ( rule__AnnotationLine__Group__0 ) )
            {
            // InternalTypescript.g:667:2: ( ( rule__AnnotationLine__Group__0 ) )
            // InternalTypescript.g:668:3: ( rule__AnnotationLine__Group__0 )
            {
             before(grammarAccess.getAnnotationLineAccess().getGroup()); 
            // InternalTypescript.g:669:3: ( rule__AnnotationLine__Group__0 )
            // InternalTypescript.g:669:4: rule__AnnotationLine__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AnnotationLine__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationLineAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnnotationLine"


    // $ANTLR start "entryRuleIndexSignature"
    // InternalTypescript.g:678:1: entryRuleIndexSignature : ruleIndexSignature EOF ;
    public final void entryRuleIndexSignature() throws RecognitionException {
        try {
            // InternalTypescript.g:679:1: ( ruleIndexSignature EOF )
            // InternalTypescript.g:680:1: ruleIndexSignature EOF
            {
             before(grammarAccess.getIndexSignatureRule()); 
            pushFollow(FOLLOW_1);
            ruleIndexSignature();

            state._fsp--;

             after(grammarAccess.getIndexSignatureRule()); 
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
    // $ANTLR end "entryRuleIndexSignature"


    // $ANTLR start "ruleIndexSignature"
    // InternalTypescript.g:687:1: ruleIndexSignature : ( ( rule__IndexSignature__Group__0 ) ) ;
    public final void ruleIndexSignature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:691:2: ( ( ( rule__IndexSignature__Group__0 ) ) )
            // InternalTypescript.g:692:2: ( ( rule__IndexSignature__Group__0 ) )
            {
            // InternalTypescript.g:692:2: ( ( rule__IndexSignature__Group__0 ) )
            // InternalTypescript.g:693:3: ( rule__IndexSignature__Group__0 )
            {
             before(grammarAccess.getIndexSignatureAccess().getGroup()); 
            // InternalTypescript.g:694:3: ( rule__IndexSignature__Group__0 )
            // InternalTypescript.g:694:4: rule__IndexSignature__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IndexSignature__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIndexSignatureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIndexSignature"


    // $ANTLR start "rulePredefinedTypeEnum"
    // InternalTypescript.g:703:1: rulePredefinedTypeEnum : ( ( rule__PredefinedTypeEnum__Alternatives ) ) ;
    public final void rulePredefinedTypeEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:707:1: ( ( ( rule__PredefinedTypeEnum__Alternatives ) ) )
            // InternalTypescript.g:708:2: ( ( rule__PredefinedTypeEnum__Alternatives ) )
            {
            // InternalTypescript.g:708:2: ( ( rule__PredefinedTypeEnum__Alternatives ) )
            // InternalTypescript.g:709:3: ( rule__PredefinedTypeEnum__Alternatives )
            {
             before(grammarAccess.getPredefinedTypeEnumAccess().getAlternatives()); 
            // InternalTypescript.g:710:3: ( rule__PredefinedTypeEnum__Alternatives )
            // InternalTypescript.g:710:4: rule__PredefinedTypeEnum__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PredefinedTypeEnum__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPredefinedTypeEnumAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePredefinedTypeEnum"


    // $ANTLR start "ruleIndexType"
    // InternalTypescript.g:719:1: ruleIndexType : ( ( rule__IndexType__Alternatives ) ) ;
    public final void ruleIndexType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:723:1: ( ( ( rule__IndexType__Alternatives ) ) )
            // InternalTypescript.g:724:2: ( ( rule__IndexType__Alternatives ) )
            {
            // InternalTypescript.g:724:2: ( ( rule__IndexType__Alternatives ) )
            // InternalTypescript.g:725:3: ( rule__IndexType__Alternatives )
            {
             before(grammarAccess.getIndexTypeAccess().getAlternatives()); 
            // InternalTypescript.g:726:3: ( rule__IndexType__Alternatives )
            // InternalTypescript.g:726:4: rule__IndexType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__IndexType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getIndexTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIndexType"


    // $ANTLR start "rule__InterfacesAndClasses__Alternatives_1"
    // InternalTypescript.g:734:1: rule__InterfacesAndClasses__Alternatives_1 : ( ( ( rule__InterfacesAndClasses__ModulesAssignment_1_0 ) ) | ( ( rule__InterfacesAndClasses__TypesAssignment_1_1 ) ) );
    public final void rule__InterfacesAndClasses__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:738:1: ( ( ( rule__InterfacesAndClasses__ModulesAssignment_1_0 ) ) | ( ( rule__InterfacesAndClasses__TypesAssignment_1_1 ) ) )
            int alt1=2;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalTypescript.g:739:2: ( ( rule__InterfacesAndClasses__ModulesAssignment_1_0 ) )
                    {
                    // InternalTypescript.g:739:2: ( ( rule__InterfacesAndClasses__ModulesAssignment_1_0 ) )
                    // InternalTypescript.g:740:3: ( rule__InterfacesAndClasses__ModulesAssignment_1_0 )
                    {
                     before(grammarAccess.getInterfacesAndClassesAccess().getModulesAssignment_1_0()); 
                    // InternalTypescript.g:741:3: ( rule__InterfacesAndClasses__ModulesAssignment_1_0 )
                    // InternalTypescript.g:741:4: rule__InterfacesAndClasses__ModulesAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InterfacesAndClasses__ModulesAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInterfacesAndClassesAccess().getModulesAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTypescript.g:745:2: ( ( rule__InterfacesAndClasses__TypesAssignment_1_1 ) )
                    {
                    // InternalTypescript.g:745:2: ( ( rule__InterfacesAndClasses__TypesAssignment_1_1 ) )
                    // InternalTypescript.g:746:3: ( rule__InterfacesAndClasses__TypesAssignment_1_1 )
                    {
                     before(grammarAccess.getInterfacesAndClassesAccess().getTypesAssignment_1_1()); 
                    // InternalTypescript.g:747:3: ( rule__InterfacesAndClasses__TypesAssignment_1_1 )
                    // InternalTypescript.g:747:4: rule__InterfacesAndClasses__TypesAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__InterfacesAndClasses__TypesAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getInterfacesAndClassesAccess().getTypesAssignment_1_1()); 

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
    // $ANTLR end "rule__InterfacesAndClasses__Alternatives_1"


    // $ANTLR start "rule__ModuleElement__ModuleContentAlternatives_1_0"
    // InternalTypescript.g:755:1: rule__ModuleElement__ModuleContentAlternatives_1_0 : ( ( ruleDeclaration ) | ( ruleModuleDeclaration ) | ( ruleImportDeclaration ) );
    public final void rule__ModuleElement__ModuleContentAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:759:1: ( ( ruleDeclaration ) | ( ruleModuleDeclaration ) | ( ruleImportDeclaration ) )
            int alt2=3;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalTypescript.g:760:2: ( ruleDeclaration )
                    {
                    // InternalTypescript.g:760:2: ( ruleDeclaration )
                    // InternalTypescript.g:761:3: ruleDeclaration
                    {
                     before(grammarAccess.getModuleElementAccess().getModuleContentDeclarationParserRuleCall_1_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDeclaration();

                    state._fsp--;

                     after(grammarAccess.getModuleElementAccess().getModuleContentDeclarationParserRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTypescript.g:766:2: ( ruleModuleDeclaration )
                    {
                    // InternalTypescript.g:766:2: ( ruleModuleDeclaration )
                    // InternalTypescript.g:767:3: ruleModuleDeclaration
                    {
                     before(grammarAccess.getModuleElementAccess().getModuleContentModuleDeclarationParserRuleCall_1_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleModuleDeclaration();

                    state._fsp--;

                     after(grammarAccess.getModuleElementAccess().getModuleContentModuleDeclarationParserRuleCall_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTypescript.g:772:2: ( ruleImportDeclaration )
                    {
                    // InternalTypescript.g:772:2: ( ruleImportDeclaration )
                    // InternalTypescript.g:773:3: ruleImportDeclaration
                    {
                     before(grammarAccess.getModuleElementAccess().getModuleContentImportDeclarationParserRuleCall_1_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleImportDeclaration();

                    state._fsp--;

                     after(grammarAccess.getModuleElementAccess().getModuleContentImportDeclarationParserRuleCall_1_0_2()); 

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
    // $ANTLR end "rule__ModuleElement__ModuleContentAlternatives_1_0"


    // $ANTLR start "rule__InterfaceOrClassDeclaration__Alternatives_0"
    // InternalTypescript.g:782:1: rule__InterfaceOrClassDeclaration__Alternatives_0 : ( ( ruleInterfaceDeclaration ) | ( ruleClassDeclaration ) );
    public final void rule__InterfaceOrClassDeclaration__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:786:1: ( ( ruleInterfaceDeclaration ) | ( ruleClassDeclaration ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==26) ) {
                alt3=1;
            }
            else if ( (LA3_0==27) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalTypescript.g:787:2: ( ruleInterfaceDeclaration )
                    {
                    // InternalTypescript.g:787:2: ( ruleInterfaceDeclaration )
                    // InternalTypescript.g:788:3: ruleInterfaceDeclaration
                    {
                     before(grammarAccess.getInterfaceOrClassDeclarationAccess().getInterfaceDeclarationParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleInterfaceDeclaration();

                    state._fsp--;

                     after(grammarAccess.getInterfaceOrClassDeclarationAccess().getInterfaceDeclarationParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTypescript.g:793:2: ( ruleClassDeclaration )
                    {
                    // InternalTypescript.g:793:2: ( ruleClassDeclaration )
                    // InternalTypescript.g:794:3: ruleClassDeclaration
                    {
                     before(grammarAccess.getInterfaceOrClassDeclarationAccess().getClassDeclarationParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleClassDeclaration();

                    state._fsp--;

                     after(grammarAccess.getInterfaceOrClassDeclarationAccess().getClassDeclarationParserRuleCall_0_1()); 

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
    // $ANTLR end "rule__InterfaceOrClassDeclaration__Alternatives_0"


    // $ANTLR start "rule__TypeMember__SignatureAlternatives_1_0"
    // InternalTypescript.g:803:1: rule__TypeMember__SignatureAlternatives_1_0 : ( ( rulePropertySignature ) | ( ruleIndexSignature ) );
    public final void rule__TypeMember__SignatureAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:807:1: ( ( rulePropertySignature ) | ( ruleIndexSignature ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else if ( (LA4_0==31) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalTypescript.g:808:2: ( rulePropertySignature )
                    {
                    // InternalTypescript.g:808:2: ( rulePropertySignature )
                    // InternalTypescript.g:809:3: rulePropertySignature
                    {
                     before(grammarAccess.getTypeMemberAccess().getSignaturePropertySignatureParserRuleCall_1_0_0()); 
                    pushFollow(FOLLOW_2);
                    rulePropertySignature();

                    state._fsp--;

                     after(grammarAccess.getTypeMemberAccess().getSignaturePropertySignatureParserRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTypescript.g:814:2: ( ruleIndexSignature )
                    {
                    // InternalTypescript.g:814:2: ( ruleIndexSignature )
                    // InternalTypescript.g:815:3: ruleIndexSignature
                    {
                     before(grammarAccess.getTypeMemberAccess().getSignatureIndexSignatureParserRuleCall_1_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleIndexSignature();

                    state._fsp--;

                     after(grammarAccess.getTypeMemberAccess().getSignatureIndexSignatureParserRuleCall_1_0_1()); 

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
    // $ANTLR end "rule__TypeMember__SignatureAlternatives_1_0"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalTypescript.g:824:1: rule__Type__Alternatives : ( ( rulePredefinedType ) | ( ruleTypeReference ) | ( ruleTypeLiteral ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:828:1: ( ( rulePredefinedType ) | ( ruleTypeReference ) | ( ruleTypeLiteral ) )
            int alt5=3;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalTypescript.g:829:2: ( rulePredefinedType )
                    {
                    // InternalTypescript.g:829:2: ( rulePredefinedType )
                    // InternalTypescript.g:830:3: rulePredefinedType
                    {
                     before(grammarAccess.getTypeAccess().getPredefinedTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePredefinedType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getPredefinedTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTypescript.g:835:2: ( ruleTypeReference )
                    {
                    // InternalTypescript.g:835:2: ( ruleTypeReference )
                    // InternalTypescript.g:836:3: ruleTypeReference
                    {
                     before(grammarAccess.getTypeAccess().getTypeReferenceParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTypeReference();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getTypeReferenceParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTypescript.g:841:2: ( ruleTypeLiteral )
                    {
                    // InternalTypescript.g:841:2: ( ruleTypeLiteral )
                    // InternalTypescript.g:842:3: ruleTypeLiteral
                    {
                     before(grammarAccess.getTypeAccess().getTypeLiteralParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleTypeLiteral();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getTypeLiteralParserRuleCall_2()); 

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


    // $ANTLR start "rule__TypeLiteral__Alternatives"
    // InternalTypescript.g:851:1: rule__TypeLiteral__Alternatives : ( ( ruleObjectType ) | ( ruleArrayType ) );
    public final void rule__TypeLiteral__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:855:1: ( ( ruleObjectType ) | ( ruleArrayType ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID||(LA6_0>=14 && LA6_0<=18)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalTypescript.g:856:2: ( ruleObjectType )
                    {
                    // InternalTypescript.g:856:2: ( ruleObjectType )
                    // InternalTypescript.g:857:3: ruleObjectType
                    {
                     before(grammarAccess.getTypeLiteralAccess().getObjectTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleObjectType();

                    state._fsp--;

                     after(grammarAccess.getTypeLiteralAccess().getObjectTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTypescript.g:862:2: ( ruleArrayType )
                    {
                    // InternalTypescript.g:862:2: ( ruleArrayType )
                    // InternalTypescript.g:863:3: ruleArrayType
                    {
                     before(grammarAccess.getTypeLiteralAccess().getArrayTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleArrayType();

                    state._fsp--;

                     after(grammarAccess.getTypeLiteralAccess().getArrayTypeParserRuleCall_1()); 

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
    // $ANTLR end "rule__TypeLiteral__Alternatives"


    // $ANTLR start "rule__ArrayType__Alternatives"
    // InternalTypescript.g:872:1: rule__ArrayType__Alternatives : ( ( ( rule__ArrayType__Group_0__0 ) ) | ( ( rule__ArrayType__Group_1__0 ) ) );
    public final void rule__ArrayType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:876:1: ( ( ( rule__ArrayType__Group_0__0 ) ) | ( ( rule__ArrayType__Group_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=14 && LA7_0<=18)) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalTypescript.g:877:2: ( ( rule__ArrayType__Group_0__0 ) )
                    {
                    // InternalTypescript.g:877:2: ( ( rule__ArrayType__Group_0__0 ) )
                    // InternalTypescript.g:878:3: ( rule__ArrayType__Group_0__0 )
                    {
                     before(grammarAccess.getArrayTypeAccess().getGroup_0()); 
                    // InternalTypescript.g:879:3: ( rule__ArrayType__Group_0__0 )
                    // InternalTypescript.g:879:4: rule__ArrayType__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ArrayType__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getArrayTypeAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTypescript.g:883:2: ( ( rule__ArrayType__Group_1__0 ) )
                    {
                    // InternalTypescript.g:883:2: ( ( rule__ArrayType__Group_1__0 ) )
                    // InternalTypescript.g:884:3: ( rule__ArrayType__Group_1__0 )
                    {
                     before(grammarAccess.getArrayTypeAccess().getGroup_1()); 
                    // InternalTypescript.g:885:3: ( rule__ArrayType__Group_1__0 )
                    // InternalTypescript.g:885:4: rule__ArrayType__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ArrayType__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getArrayTypeAccess().getGroup_1()); 

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
    // $ANTLR end "rule__ArrayType__Alternatives"


    // $ANTLR start "rule__PredefinedTypeEnum__Alternatives"
    // InternalTypescript.g:893:1: rule__PredefinedTypeEnum__Alternatives : ( ( ( 'any' ) ) | ( ( 'number' ) ) | ( ( 'boolean' ) ) | ( ( 'string' ) ) | ( ( 'void' ) ) );
    public final void rule__PredefinedTypeEnum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:897:1: ( ( ( 'any' ) ) | ( ( 'number' ) ) | ( ( 'boolean' ) ) | ( ( 'string' ) ) | ( ( 'void' ) ) )
            int alt8=5;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt8=1;
                }
                break;
            case 15:
                {
                alt8=2;
                }
                break;
            case 16:
                {
                alt8=3;
                }
                break;
            case 17:
                {
                alt8=4;
                }
                break;
            case 18:
                {
                alt8=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalTypescript.g:898:2: ( ( 'any' ) )
                    {
                    // InternalTypescript.g:898:2: ( ( 'any' ) )
                    // InternalTypescript.g:899:3: ( 'any' )
                    {
                     before(grammarAccess.getPredefinedTypeEnumAccess().getAnyEnumLiteralDeclaration_0()); 
                    // InternalTypescript.g:900:3: ( 'any' )
                    // InternalTypescript.g:900:4: 'any'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getPredefinedTypeEnumAccess().getAnyEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTypescript.g:904:2: ( ( 'number' ) )
                    {
                    // InternalTypescript.g:904:2: ( ( 'number' ) )
                    // InternalTypescript.g:905:3: ( 'number' )
                    {
                     before(grammarAccess.getPredefinedTypeEnumAccess().getNumberEnumLiteralDeclaration_1()); 
                    // InternalTypescript.g:906:3: ( 'number' )
                    // InternalTypescript.g:906:4: 'number'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getPredefinedTypeEnumAccess().getNumberEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTypescript.g:910:2: ( ( 'boolean' ) )
                    {
                    // InternalTypescript.g:910:2: ( ( 'boolean' ) )
                    // InternalTypescript.g:911:3: ( 'boolean' )
                    {
                     before(grammarAccess.getPredefinedTypeEnumAccess().getBooleanEnumLiteralDeclaration_2()); 
                    // InternalTypescript.g:912:3: ( 'boolean' )
                    // InternalTypescript.g:912:4: 'boolean'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getPredefinedTypeEnumAccess().getBooleanEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTypescript.g:916:2: ( ( 'string' ) )
                    {
                    // InternalTypescript.g:916:2: ( ( 'string' ) )
                    // InternalTypescript.g:917:3: ( 'string' )
                    {
                     before(grammarAccess.getPredefinedTypeEnumAccess().getStringEnumLiteralDeclaration_3()); 
                    // InternalTypescript.g:918:3: ( 'string' )
                    // InternalTypescript.g:918:4: 'string'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getPredefinedTypeEnumAccess().getStringEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalTypescript.g:922:2: ( ( 'void' ) )
                    {
                    // InternalTypescript.g:922:2: ( ( 'void' ) )
                    // InternalTypescript.g:923:3: ( 'void' )
                    {
                     before(grammarAccess.getPredefinedTypeEnumAccess().getVoidEnumLiteralDeclaration_4()); 
                    // InternalTypescript.g:924:3: ( 'void' )
                    // InternalTypescript.g:924:4: 'void'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getPredefinedTypeEnumAccess().getVoidEnumLiteralDeclaration_4()); 

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
    // $ANTLR end "rule__PredefinedTypeEnum__Alternatives"


    // $ANTLR start "rule__IndexType__Alternatives"
    // InternalTypescript.g:932:1: rule__IndexType__Alternatives : ( ( ( 'number' ) ) | ( ( 'string' ) ) );
    public final void rule__IndexType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:936:1: ( ( ( 'number' ) ) | ( ( 'string' ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==15) ) {
                alt9=1;
            }
            else if ( (LA9_0==17) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalTypescript.g:937:2: ( ( 'number' ) )
                    {
                    // InternalTypescript.g:937:2: ( ( 'number' ) )
                    // InternalTypescript.g:938:3: ( 'number' )
                    {
                     before(grammarAccess.getIndexTypeAccess().getNumberEnumLiteralDeclaration_0()); 
                    // InternalTypescript.g:939:3: ( 'number' )
                    // InternalTypescript.g:939:4: 'number'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getIndexTypeAccess().getNumberEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTypescript.g:943:2: ( ( 'string' ) )
                    {
                    // InternalTypescript.g:943:2: ( ( 'string' ) )
                    // InternalTypescript.g:944:3: ( 'string' )
                    {
                     before(grammarAccess.getIndexTypeAccess().getStringEnumLiteralDeclaration_1()); 
                    // InternalTypescript.g:945:3: ( 'string' )
                    // InternalTypescript.g:945:4: 'string'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getIndexTypeAccess().getStringEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__IndexType__Alternatives"


    // $ANTLR start "rule__Typescript__Group__0"
    // InternalTypescript.g:953:1: rule__Typescript__Group__0 : rule__Typescript__Group__0__Impl rule__Typescript__Group__1 ;
    public final void rule__Typescript__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:957:1: ( rule__Typescript__Group__0__Impl rule__Typescript__Group__1 )
            // InternalTypescript.g:958:2: rule__Typescript__Group__0__Impl rule__Typescript__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Typescript__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Typescript__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Typescript__Group__0"


    // $ANTLR start "rule__Typescript__Group__0__Impl"
    // InternalTypescript.g:965:1: rule__Typescript__Group__0__Impl : ( ( rule__Typescript__ImportsAssignment_0 )* ) ;
    public final void rule__Typescript__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:969:1: ( ( ( rule__Typescript__ImportsAssignment_0 )* ) )
            // InternalTypescript.g:970:1: ( ( rule__Typescript__ImportsAssignment_0 )* )
            {
            // InternalTypescript.g:970:1: ( ( rule__Typescript__ImportsAssignment_0 )* )
            // InternalTypescript.g:971:2: ( rule__Typescript__ImportsAssignment_0 )*
            {
             before(grammarAccess.getTypescriptAccess().getImportsAssignment_0()); 
            // InternalTypescript.g:972:2: ( rule__Typescript__ImportsAssignment_0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==19) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalTypescript.g:972:3: rule__Typescript__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Typescript__ImportsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getTypescriptAccess().getImportsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Typescript__Group__0__Impl"


    // $ANTLR start "rule__Typescript__Group__1"
    // InternalTypescript.g:980:1: rule__Typescript__Group__1 : rule__Typescript__Group__1__Impl ;
    public final void rule__Typescript__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:984:1: ( rule__Typescript__Group__1__Impl )
            // InternalTypescript.g:985:2: rule__Typescript__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Typescript__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Typescript__Group__1"


    // $ANTLR start "rule__Typescript__Group__1__Impl"
    // InternalTypescript.g:991:1: rule__Typescript__Group__1__Impl : ( ( rule__Typescript__InterfacesAndClassesAssignment_1 ) ) ;
    public final void rule__Typescript__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:995:1: ( ( ( rule__Typescript__InterfacesAndClassesAssignment_1 ) ) )
            // InternalTypescript.g:996:1: ( ( rule__Typescript__InterfacesAndClassesAssignment_1 ) )
            {
            // InternalTypescript.g:996:1: ( ( rule__Typescript__InterfacesAndClassesAssignment_1 ) )
            // InternalTypescript.g:997:2: ( rule__Typescript__InterfacesAndClassesAssignment_1 )
            {
             before(grammarAccess.getTypescriptAccess().getInterfacesAndClassesAssignment_1()); 
            // InternalTypescript.g:998:2: ( rule__Typescript__InterfacesAndClassesAssignment_1 )
            // InternalTypescript.g:998:3: rule__Typescript__InterfacesAndClassesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Typescript__InterfacesAndClassesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTypescriptAccess().getInterfacesAndClassesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Typescript__Group__1__Impl"


    // $ANTLR start "rule__InterfacesAndClasses__Group__0"
    // InternalTypescript.g:1007:1: rule__InterfacesAndClasses__Group__0 : rule__InterfacesAndClasses__Group__0__Impl rule__InterfacesAndClasses__Group__1 ;
    public final void rule__InterfacesAndClasses__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:1011:1: ( rule__InterfacesAndClasses__Group__0__Impl rule__InterfacesAndClasses__Group__1 )
            // InternalTypescript.g:1012:2: rule__InterfacesAndClasses__Group__0__Impl rule__InterfacesAndClasses__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__InterfacesAndClasses__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InterfacesAndClasses__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfacesAndClasses__Group__0"


    // $ANTLR start "rule__InterfacesAndClasses__Group__0__Impl"
    // InternalTypescript.g:1019:1: rule__InterfacesAndClasses__Group__0__Impl : ( () ) ;
    public final void rule__InterfacesAndClasses__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:1023:1: ( ( () ) )
            // InternalTypescript.g:1024:1: ( () )
            {
            // InternalTypescript.g:1024:1: ( () )
            // InternalTypescript.g:1025:2: ()
            {
             before(grammarAccess.getInterfacesAndClassesAccess().getInterfacesAndClassesAction_0()); 
            // InternalTypescript.g:1026:2: ()
            // InternalTypescript.g:1026:3: 
            {
            }

             after(grammarAccess.getInterfacesAndClassesAccess().getInterfacesAndClassesAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfacesAndClasses__Group__0__Impl"


    // $ANTLR start "rule__InterfacesAndClasses__Group__1"
    // InternalTypescript.g:1034:1: rule__InterfacesAndClasses__Group__1 : rule__InterfacesAndClasses__Group__1__Impl ;
    public final void rule__InterfacesAndClasses__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:1038:1: ( rule__InterfacesAndClasses__Group__1__Impl )
            // InternalTypescript.g:1039:2: rule__InterfacesAndClasses__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InterfacesAndClasses__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfacesAndClasses__Group__1"


    // $ANTLR start "rule__InterfacesAndClasses__Group__1__Impl"
    // InternalTypescript.g:1045:1: rule__InterfacesAndClasses__Group__1__Impl : ( ( rule__InterfacesAndClasses__Alternatives_1 )* ) ;
    public final void rule__InterfacesAndClasses__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:1049:1: ( ( ( rule__InterfacesAndClasses__Alternatives_1 )* ) )
            // InternalTypescript.g:1050:1: ( ( rule__InterfacesAndClasses__Alternatives_1 )* )
            {
            // InternalTypescript.g:1050:1: ( ( rule__InterfacesAndClasses__Alternatives_1 )* )
            // InternalTypescript.g:1051:2: ( rule__InterfacesAndClasses__Alternatives_1 )*
            {
             before(grammarAccess.getInterfacesAndClassesAccess().getAlternatives_1()); 
            // InternalTypescript.g:1052:2: ( rule__InterfacesAndClasses__Alternatives_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==21||(LA11_0>=26 && LA11_0<=27)||LA11_0==33) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalTypescript.g:1052:3: rule__InterfacesAndClasses__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__InterfacesAndClasses__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getInterfacesAndClassesAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfacesAndClasses__Group__1__Impl"


    // $ANTLR start "rule__ImportDeclaration__Group__0"
    // InternalTypescript.g:1061:1: rule__ImportDeclaration__Group__0 : rule__ImportDeclaration__Group__0__Impl rule__ImportDeclaration__Group__1 ;
    public final void rule__ImportDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:1065:1: ( rule__ImportDeclaration__Group__0__Impl rule__ImportDeclaration__Group__1 )
            // InternalTypescript.g:1066:2: rule__ImportDeclaration__Group__0__Impl rule__ImportDeclaration__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__ImportDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImportDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportDeclaration__Group__0"


    // $ANTLR start "rule__ImportDeclaration__Group__0__Impl"
    // InternalTypescript.g:1073:1: rule__ImportDeclaration__Group__0__Impl : ( 'import' ) ;
    public final void rule__ImportDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:1077:1: ( ( 'import' ) )
            // InternalTypescript.g:1078:1: ( 'import' )
            {
            // InternalTypescript.g:1078:1: ( 'import' )
            // InternalTypescript.g:1079:2: 'import'
            {
             before(grammarAccess.getImportDeclarationAccess().getImportKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getImportDeclarationAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportDeclaration__Group__0__Impl"


    // $ANTLR start "rule__ImportDeclaration__Group__1"
    // InternalTypescript.g:1088:1: rule__ImportDeclaration__Group__1 : rule__ImportDeclaration__Group__1__Impl rule__ImportDeclaration__Group__2 ;
    public final void rule__ImportDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:1092:1: ( rule__ImportDeclaration__Group__1__Impl rule__ImportDeclaration__Group__2 )
            // InternalTypescript.g:1093:2: rule__ImportDeclaration__Group__1__Impl rule__ImportDeclaration__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__ImportDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImportDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportDeclaration__Group__1"


    // $ANTLR start "rule__ImportDeclaration__Group__1__Impl"
    // InternalTypescript.g:1100:1: rule__ImportDeclaration__Group__1__Impl : ( ( rule__ImportDeclaration__AliasAssignment_1 ) ) ;
    public final void rule__ImportDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:1104:1: ( ( ( rule__ImportDeclaration__AliasAssignment_1 ) ) )
            // InternalTypescript.g:1105:1: ( ( rule__ImportDeclaration__AliasAssignment_1 ) )
            {
            // InternalTypescript.g:1105:1: ( ( rule__ImportDeclaration__AliasAssignment_1 ) )
            // InternalTypescript.g:1106:2: ( rule__ImportDeclaration__AliasAssignment_1 )
            {
             before(grammarAccess.getImportDeclarationAccess().getAliasAssignment_1()); 
            // InternalTypescript.g:1107:2: ( rule__ImportDeclaration__AliasAssignment_1 )
            // InternalTypescript.g:1107:3: rule__ImportDeclaration__AliasAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ImportDeclaration__AliasAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportDeclarationAccess().getAliasAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportDeclaration__Group__1__Impl"


    // $ANTLR start "rule__ImportDeclaration__Group__2"
    // InternalTypescript.g:1115:1: rule__ImportDeclaration__Group__2 : rule__ImportDeclaration__Group__2__Impl rule__ImportDeclaration__Group__3 ;
    public final void rule__ImportDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:1119:1: ( rule__ImportDeclaration__Group__2__Impl rule__ImportDeclaration__Group__3 )
            // InternalTypescript.g:1120:2: rule__ImportDeclaration__Group__2__Impl rule__ImportDeclaration__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__ImportDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImportDeclaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportDeclaration__Group__2"


    // $ANTLR start "rule__ImportDeclaration__Group__2__Impl"
    // InternalTypescript.g:1127:1: rule__ImportDeclaration__Group__2__Impl : ( '=' ) ;
    public final void rule__ImportDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:1131:1: ( ( '=' ) )
            // InternalTypescript.g:1132:1: ( '=' )
            {
            // InternalTypescript.g:1132:1: ( '=' )
            // InternalTypescript.g:1133:2: '='
            {
             before(grammarAccess.getImportDeclarationAccess().getEqualsSignKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getImportDeclarationAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportDeclaration__Group__2__Impl"


    // $ANTLR start "rule__ImportDeclaration__Group__3"
    // InternalTypescript.g:1142:1: rule__ImportDeclaration__Group__3 : rule__ImportDeclaration__Group__3__Impl ;
    public final void rule__ImportDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:1146:1: ( rule__ImportDeclaration__Group__3__Impl )
            // InternalTypescript.g:1147:2: rule__ImportDeclaration__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImportDeclaration__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportDeclaration__Group__3"


    // $ANTLR start "rule__ImportDeclaration__Group__3__Impl"
    // InternalTypescript.g:1153:1: rule__ImportDeclaration__Group__3__Impl : ( ( rule__ImportDeclaration__NameAssignment_3 ) ) ;
    public final void rule__ImportDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:1157:1: ( ( ( rule__ImportDeclaration__NameAssignment_3 ) ) )
            // InternalTypescript.g:1158:1: ( ( rule__ImportDeclaration__NameAssignment_3 ) )
            {
            // InternalTypescript.g:1158:1: ( ( rule__ImportDeclaration__NameAssignment_3 ) )
            // InternalTypescript.g:1159:2: ( rule__ImportDeclaration__NameAssignment_3 )
            {
             before(grammarAccess.getImportDeclarationAccess().getNameAssignment_3()); 
            // InternalTypescript.g:1160:2: ( rule__ImportDeclaration__NameAssignment_3 )
            // InternalTypescript.g:1160:3: rule__ImportDeclaration__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ImportDeclaration__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getImportDeclarationAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportDeclaration__Group__3__Impl"


    // $ANTLR start "rule__ModuleDeclaration__Group__0"
    // InternalTypescript.g:1169:1: rule__ModuleDeclaration__Group__0 : rule__ModuleDeclaration__Group__0__Impl rule__ModuleDeclaration__Group__1 ;
    public final void rule__ModuleDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:1173:1: ( rule__ModuleDeclaration__Group__0__Impl rule__ModuleDeclaration__Group__1 )
            // InternalTypescript.g:1174:2: rule__ModuleDeclaration__Group__0__Impl rule__ModuleDeclaration__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__ModuleDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModuleDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleDeclaration__Group__0"


    // $ANTLR start "rule__ModuleDeclaration__Group__0__Impl"
    // InternalTypescript.g:1181:1: rule__ModuleDeclaration__Group__0__Impl : ( ( rule__ModuleDeclaration__DocCommentAssignment_0 )? ) ;
    public final void rule__ModuleDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:1185:1: ( ( ( rule__ModuleDeclaration__DocCommentAssignment_0 )? ) )
            // InternalTypescript.g:1186:1: ( ( rule__ModuleDeclaration__DocCommentAssignment_0 )? )
            {
            // InternalTypescript.g:1186:1: ( ( rule__ModuleDeclaration__DocCommentAssignment_0 )? )
            // InternalTypescript.g:1187:2: ( rule__ModuleDeclaration__DocCommentAssignment_0 )?
            {
             before(grammarAccess.getModuleDeclarationAccess().getDocCommentAssignment_0()); 
            // InternalTypescript.g:1188:2: ( rule__ModuleDeclaration__DocCommentAssignment_0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==33) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalTypescript.g:1188:3: rule__ModuleDeclaration__DocCommentAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ModuleDeclaration__DocCommentAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModuleDeclarationAccess().getDocCommentAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleDeclaration__Group__0__Impl"


    // $ANTLR start "rule__ModuleDeclaration__Group__1"
    // InternalTypescript.g:1196:1: rule__ModuleDeclaration__Group__1 : rule__ModuleDeclaration__Group__1__Impl rule__ModuleDeclaration__Group__2 ;
    public final void rule__ModuleDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:1200:1: ( rule__ModuleDeclaration__Group__1__Impl rule__ModuleDeclaration__Group__2 )
            // InternalTypescript.g:1201:2: rule__ModuleDeclaration__Group__1__Impl rule__ModuleDeclaration__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__ModuleDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModuleDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleDeclaration__Group__1"


    // $ANTLR start "rule__ModuleDeclaration__Group__1__Impl"
    // InternalTypescript.g:1208:1: rule__ModuleDeclaration__Group__1__Impl : ( 'module' ) ;
    public final void rule__ModuleDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:1212:1: ( ( 'module' ) )
            // InternalTypescript.g:1213:1: ( 'module' )
            {
            // InternalTypescript.g:1213:1: ( 'module' )
            // InternalTypescript.g:1214:2: 'module'
            {
             before(grammarAccess.getModuleDeclarationAccess().getModuleKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getModuleDeclarationAccess().getModuleKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleDeclaration__Group__1__Impl"


    // $ANTLR start "rule__ModuleDeclaration__Group__2"
    // InternalTypescript.g:1223:1: rule__ModuleDeclaration__Group__2 : rule__ModuleDeclaration__Group__2__Impl rule__ModuleDeclaration__Group__3 ;
    public final void rule__ModuleDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:1227:1: ( rule__ModuleDeclaration__Group__2__Impl rule__ModuleDeclaration__Group__3 )
            // InternalTypescript.g:1228:2: rule__ModuleDeclaration__Group__2__Impl rule__ModuleDeclaration__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__ModuleDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModuleDeclaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleDeclaration__Group__2"


    // $ANTLR start "rule__ModuleDeclaration__Group__2__Impl"
    // InternalTypescript.g:1235:1: rule__ModuleDeclaration__Group__2__Impl : ( ( rule__ModuleDeclaration__NameAssignment_2 ) ) ;
    public final void rule__ModuleDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:1239:1: ( ( ( rule__ModuleDeclaration__NameAssignment_2 ) ) )
            // InternalTypescript.g:1240:1: ( ( rule__ModuleDeclaration__NameAssignment_2 ) )
            {
            // InternalTypescript.g:1240:1: ( ( rule__ModuleDeclaration__NameAssignment_2 ) )
            // InternalTypescript.g:1241:2: ( rule__ModuleDeclaration__NameAssignment_2 )
            {
             before(grammarAccess.getModuleDeclarationAccess().getNameAssignment_2()); 
            // InternalTypescript.g:1242:2: ( rule__ModuleDeclaration__NameAssignment_2 )
            // InternalTypescript.g:1242:3: rule__ModuleDeclaration__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ModuleDeclaration__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getModuleDeclarationAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleDeclaration__Group__2__Impl"


    // $ANTLR start "rule__ModuleDeclaration__Group__3"
    // InternalTypescript.g:1250:1: rule__ModuleDeclaration__Group__3 : rule__ModuleDeclaration__Group__3__Impl rule__ModuleDeclaration__Group__4 ;
    public final void rule__ModuleDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:1254:1: ( rule__ModuleDeclaration__Group__3__Impl rule__ModuleDeclaration__Group__4 )
            // InternalTypescript.g:1255:2: rule__ModuleDeclaration__Group__3__Impl rule__ModuleDeclaration__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__ModuleDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModuleDeclaration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleDeclaration__Group__3"


    // $ANTLR start "rule__ModuleDeclaration__Group__3__Impl"
    // InternalTypescript.g:1262:1: rule__ModuleDeclaration__Group__3__Impl : ( ( rule__ModuleDeclaration__Group_3__0 )* ) ;
    public final void rule__ModuleDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:1266:1: ( ( ( rule__ModuleDeclaration__Group_3__0 )* ) )
            // InternalTypescript.g:1267:1: ( ( rule__ModuleDeclaration__Group_3__0 )* )
            {
            // InternalTypescript.g:1267:1: ( ( rule__ModuleDeclaration__Group_3__0 )* )
            // InternalTypescript.g:1268:2: ( rule__ModuleDeclaration__Group_3__0 )*
            {
             before(grammarAccess.getModuleDeclarationAccess().getGroup_3()); 
            // InternalTypescript.g:1269:2: ( rule__ModuleDeclaration__Group_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==24) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalTypescript.g:1269:3: rule__ModuleDeclaration__Group_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ModuleDeclaration__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getModuleDeclarationAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleDeclaration__Group__3__Impl"


    // $ANTLR start "rule__ModuleDeclaration__Group__4"
    // InternalTypescript.g:1277:1: rule__ModuleDeclaration__Group__4 : rule__ModuleDeclaration__Group__4__Impl rule__ModuleDeclaration__Group__5 ;
    public final void rule__ModuleDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:1281:1: ( rule__ModuleDeclaration__Group__4__Impl rule__ModuleDeclaration__Group__5 )
            // InternalTypescript.g:1282:2: rule__ModuleDeclaration__Group__4__Impl rule__ModuleDeclaration__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__ModuleDeclaration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModuleDeclaration__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleDeclaration__Group__4"


    // $ANTLR start "rule__ModuleDeclaration__Group__4__Impl"
    // InternalTypescript.g:1289:1: rule__ModuleDeclaration__Group__4__Impl : ( '{' ) ;
    public final void rule__ModuleDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:1293:1: ( ( '{' ) )
            // InternalTypescript.g:1294:1: ( '{' )
            {
            // InternalTypescript.g:1294:1: ( '{' )
            // InternalTypescript.g:1295:2: '{'
            {
             before(grammarAccess.getModuleDeclarationAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getModuleDeclarationAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleDeclaration__Group__4__Impl"


    // $ANTLR start "rule__ModuleDeclaration__Group__5"
    // InternalTypescript.g:1304:1: rule__ModuleDeclaration__Group__5 : rule__ModuleDeclaration__Group__5__Impl rule__ModuleDeclaration__Group__6 ;
    public final void rule__ModuleDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:1308:1: ( rule__ModuleDeclaration__Group__5__Impl rule__ModuleDeclaration__Group__6 )
            // InternalTypescript.g:1309:2: rule__ModuleDeclaration__Group__5__Impl rule__ModuleDeclaration__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__ModuleDeclaration__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModuleDeclaration__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleDeclaration__Group__5"


    // $ANTLR start "rule__ModuleDeclaration__Group__5__Impl"
    // InternalTypescript.g:1316:1: rule__ModuleDeclaration__Group__5__Impl : ( ( rule__ModuleDeclaration__BodyAssignment_5 ) ) ;
    public final void rule__ModuleDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:1320:1: ( ( ( rule__ModuleDeclaration__BodyAssignment_5 ) ) )
            // InternalTypescript.g:1321:1: ( ( rule__ModuleDeclaration__BodyAssignment_5 ) )
            {
            // InternalTypescript.g:1321:1: ( ( rule__ModuleDeclaration__BodyAssignment_5 ) )
            // InternalTypescript.g:1322:2: ( rule__ModuleDeclaration__BodyAssignment_5 )
            {
             before(grammarAccess.getModuleDeclarationAccess().getBodyAssignment_5()); 
            // InternalTypescript.g:1323:2: ( rule__ModuleDeclaration__BodyAssignment_5 )
            // InternalTypescript.g:1323:3: rule__ModuleDeclaration__BodyAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ModuleDeclaration__BodyAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getModuleDeclarationAccess().getBodyAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleDeclaration__Group__5__Impl"


    // $ANTLR start "rule__ModuleDeclaration__Group__6"
    // InternalTypescript.g:1331:1: rule__ModuleDeclaration__Group__6 : rule__ModuleDeclaration__Group__6__Impl ;
    public final void rule__ModuleDeclaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:1335:1: ( rule__ModuleDeclaration__Group__6__Impl )
            // InternalTypescript.g:1336:2: rule__ModuleDeclaration__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ModuleDeclaration__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleDeclaration__Group__6"


    // $ANTLR start "rule__ModuleDeclaration__Group__6__Impl"
    // InternalTypescript.g:1342:1: rule__ModuleDeclaration__Group__6__Impl : ( '}' ) ;
    public final void rule__ModuleDeclaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:1346:1: ( ( '}' ) )
            // InternalTypescript.g:1347:1: ( '}' )
            {
            // InternalTypescript.g:1347:1: ( '}' )
            // InternalTypescript.g:1348:2: '}'
            {
             before(grammarAccess.getModuleDeclarationAccess().getRightCurlyBracketKeyword_6()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getModuleDeclarationAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleDeclaration__Group__6__Impl"


    // $ANTLR start "rule__ModuleDeclaration__Group_3__0"
    // InternalTypescript.g:1358:1: rule__ModuleDeclaration__Group_3__0 : rule__ModuleDeclaration__Group_3__0__Impl rule__ModuleDeclaration__Group_3__1 ;
    public final void rule__ModuleDeclaration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:1362:1: ( rule__ModuleDeclaration__Group_3__0__Impl rule__ModuleDeclaration__Group_3__1 )
            // InternalTypescript.g:1363:2: rule__ModuleDeclaration__Group_3__0__Impl rule__ModuleDeclaration__Group_3__1
            {
            pushFollow(FOLLOW_6);
            rule__ModuleDeclaration__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModuleDeclaration__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleDeclaration__Group_3__0"


    // $ANTLR start "rule__ModuleDeclaration__Group_3__0__Impl"
    // InternalTypescript.g:1370:1: rule__ModuleDeclaration__Group_3__0__Impl : ( '.' ) ;
    public final void rule__ModuleDeclaration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:1374:1: ( ( '.' ) )
            // InternalTypescript.g:1375:1: ( '.' )
            {
            // InternalTypescript.g:1375:1: ( '.' )
            // InternalTypescript.g:1376:2: '.'
            {
             before(grammarAccess.getModuleDeclarationAccess().getFullStopKeyword_3_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getModuleDeclarationAccess().getFullStopKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleDeclaration__Group_3__0__Impl"


    // $ANTLR start "rule__ModuleDeclaration__Group_3__1"
    // InternalTypescript.g:1385:1: rule__ModuleDeclaration__Group_3__1 : rule__ModuleDeclaration__Group_3__1__Impl ;
    public final void rule__ModuleDeclaration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:1389:1: ( rule__ModuleDeclaration__Group_3__1__Impl )
            // InternalTypescript.g:1390:2: rule__ModuleDeclaration__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ModuleDeclaration__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleDeclaration__Group_3__1"


    // $ANTLR start "rule__ModuleDeclaration__Group_3__1__Impl"
    // InternalTypescript.g:1396:1: rule__ModuleDeclaration__Group_3__1__Impl : ( ruleIdentifier ) ;
    public final void rule__ModuleDeclaration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:1400:1: ( ( ruleIdentifier ) )
            // InternalTypescript.g:1401:1: ( ruleIdentifier )
            {
            // InternalTypescript.g:1401:1: ( ruleIdentifier )
            // InternalTypescript.g:1402:2: ruleIdentifier
            {
             before(grammarAccess.getModuleDeclarationAccess().getIdentifierParserRuleCall_3_1()); 
            pushFollow(FOLLOW_2);
            ruleIdentifier();

            state._fsp--;

             after(grammarAccess.getModuleDeclarationAccess().getIdentifierParserRuleCall_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleDeclaration__Group_3__1__Impl"


    // $ANTLR start "rule__ModuleBody__Group__0"
    // InternalTypescript.g:1412:1: rule__ModuleBody__Group__0 : rule__ModuleBody__Group__0__Impl rule__ModuleBody__Group__1 ;
    public final void rule__ModuleBody__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:1416:1: ( rule__ModuleBody__Group__0__Impl rule__ModuleBody__Group__1 )
            // InternalTypescript.g:1417:2: rule__ModuleBody__Group__0__Impl rule__ModuleBody__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__ModuleBody__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModuleBody__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleBody__Group__0"


    // $ANTLR start "rule__ModuleBody__Group__0__Impl"
    // InternalTypescript.g:1424:1: rule__ModuleBody__Group__0__Impl : ( () ) ;
    public final void rule__ModuleBody__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:1428:1: ( ( () ) )
            // InternalTypescript.g:1429:1: ( () )
            {
            // InternalTypescript.g:1429:1: ( () )
            // InternalTypescript.g:1430:2: ()
            {
             before(grammarAccess.getModuleBodyAccess().getModuleBodyAction_0()); 
            // InternalTypescript.g:1431:2: ()
            // InternalTypescript.g:1431:3: 
            {
            }

             after(grammarAccess.getModuleBodyAccess().getModuleBodyAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleBody__Group__0__Impl"


    // $ANTLR start "rule__ModuleBody__Group__1"
    // InternalTypescript.g:1439:1: rule__ModuleBody__Group__1 : rule__ModuleBody__Group__1__Impl ;
    public final void rule__ModuleBody__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:1443:1: ( rule__ModuleBody__Group__1__Impl )
            // InternalTypescript.g:1444:2: rule__ModuleBody__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ModuleBody__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleBody__Group__1"


    // $ANTLR start "rule__ModuleBody__Group__1__Impl"
    // InternalTypescript.g:1450:1: rule__ModuleBody__Group__1__Impl : ( ( rule__ModuleBody__ElementsAssignment_1 )* ) ;
    public final void rule__ModuleBody__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:1454:1: ( ( ( rule__ModuleBody__ElementsAssignment_1 )* ) )
            // InternalTypescript.g:1455:1: ( ( rule__ModuleBody__ElementsAssignment_1 )* )
            {
            // InternalTypescript.g:1455:1: ( ( rule__ModuleBody__ElementsAssignment_1 )* )
            // InternalTypescript.g:1456:2: ( rule__ModuleBody__ElementsAssignment_1 )*
            {
             before(grammarAccess.getModuleBodyAccess().getElementsAssignment_1()); 
            // InternalTypescript.g:1457:2: ( rule__ModuleBody__ElementsAssignment_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==19||LA14_0==21||(LA14_0>=26 && LA14_0<=27)||(LA14_0>=33 && LA14_0<=34)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalTypescript.g:1457:3: rule__ModuleBody__ElementsAssignment_1
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__ModuleBody__ElementsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getModuleBodyAccess().getElementsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleBody__Group__1__Impl"


    // $ANTLR start "rule__ModuleElement__Group__0"
    // InternalTypescript.g:1466:1: rule__ModuleElement__Group__0 : rule__ModuleElement__Group__0__Impl rule__ModuleElement__Group__1 ;
    public final void rule__ModuleElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:1470:1: ( rule__ModuleElement__Group__0__Impl rule__ModuleElement__Group__1 )
            // InternalTypescript.g:1471:2: rule__ModuleElement__Group__0__Impl rule__ModuleElement__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__ModuleElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModuleElement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleElement__Group__0"


    // $ANTLR start "rule__ModuleElement__Group__0__Impl"
    // InternalTypescript.g:1478:1: rule__ModuleElement__Group__0__Impl : ( ( rule__ModuleElement__ExportedAssignment_0 )? ) ;
    public final void rule__ModuleElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:1482:1: ( ( ( rule__ModuleElement__ExportedAssignment_0 )? ) )
            // InternalTypescript.g:1483:1: ( ( rule__ModuleElement__ExportedAssignment_0 )? )
            {
            // InternalTypescript.g:1483:1: ( ( rule__ModuleElement__ExportedAssignment_0 )? )
            // InternalTypescript.g:1484:2: ( rule__ModuleElement__ExportedAssignment_0 )?
            {
             before(grammarAccess.getModuleElementAccess().getExportedAssignment_0()); 
            // InternalTypescript.g:1485:2: ( rule__ModuleElement__ExportedAssignment_0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==34) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalTypescript.g:1485:3: rule__ModuleElement__ExportedAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ModuleElement__ExportedAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModuleElementAccess().getExportedAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleElement__Group__0__Impl"


    // $ANTLR start "rule__ModuleElement__Group__1"
    // InternalTypescript.g:1493:1: rule__ModuleElement__Group__1 : rule__ModuleElement__Group__1__Impl rule__ModuleElement__Group__2 ;
    public final void rule__ModuleElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:1497:1: ( rule__ModuleElement__Group__1__Impl rule__ModuleElement__Group__2 )
            // InternalTypescript.g:1498:2: rule__ModuleElement__Group__1__Impl rule__ModuleElement__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__ModuleElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModuleElement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleElement__Group__1"


    // $ANTLR start "rule__ModuleElement__Group__1__Impl"
    // InternalTypescript.g:1505:1: rule__ModuleElement__Group__1__Impl : ( ( rule__ModuleElement__ModuleContentAssignment_1 ) ) ;
    public final void rule__ModuleElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:1509:1: ( ( ( rule__ModuleElement__ModuleContentAssignment_1 ) ) )
            // InternalTypescript.g:1510:1: ( ( rule__ModuleElement__ModuleContentAssignment_1 ) )
            {
            // InternalTypescript.g:1510:1: ( ( rule__ModuleElement__ModuleContentAssignment_1 ) )
            // InternalTypescript.g:1511:2: ( rule__ModuleElement__ModuleContentAssignment_1 )
            {
             before(grammarAccess.getModuleElementAccess().getModuleContentAssignment_1()); 
            // InternalTypescript.g:1512:2: ( rule__ModuleElement__ModuleContentAssignment_1 )
            // InternalTypescript.g:1512:3: rule__ModuleElement__ModuleContentAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ModuleElement__ModuleContentAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModuleElementAccess().getModuleContentAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleElement__Group__1__Impl"


    // $ANTLR start "rule__ModuleElement__Group__2"
    // InternalTypescript.g:1520:1: rule__ModuleElement__Group__2 : rule__ModuleElement__Group__2__Impl ;
    public final void rule__ModuleElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:1524:1: ( rule__ModuleElement__Group__2__Impl )
            // InternalTypescript.g:1525:2: rule__ModuleElement__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ModuleElement__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleElement__Group__2"


    // $ANTLR start "rule__ModuleElement__Group__2__Impl"
    // InternalTypescript.g:1531:1: rule__ModuleElement__Group__2__Impl : ( ( ';' )? ) ;
    public final void rule__ModuleElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:1535:1: ( ( ( ';' )? ) )
            // InternalTypescript.g:1536:1: ( ( ';' )? )
            {
            // InternalTypescript.g:1536:1: ( ( ';' )? )
            // InternalTypescript.g:1537:2: ( ';' )?
            {
             before(grammarAccess.getModuleElementAccess().getSemicolonKeyword_2()); 
            // InternalTypescript.g:1538:2: ( ';' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==25) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalTypescript.g:1538:3: ';'
                    {
                    match(input,25,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getModuleElementAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleElement__Group__2__Impl"


    // $ANTLR start "rule__Declaration__Group__0"
    // InternalTypescript.g:1547:1: rule__Declaration__Group__0 : rule__Declaration__Group__0__Impl rule__Declaration__Group__1 ;
    public final void rule__Declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:1551:1: ( rule__Declaration__Group__0__Impl rule__Declaration__Group__1 )
            // InternalTypescript.g:1552:2: rule__Declaration__Group__0__Impl rule__Declaration__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Declaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Declaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__0"


    // $ANTLR start "rule__Declaration__Group__0__Impl"
    // InternalTypescript.g:1559:1: rule__Declaration__Group__0__Impl : ( ( rule__Declaration__DocCommentAssignment_0 )? ) ;
    public final void rule__Declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:1563:1: ( ( ( rule__Declaration__DocCommentAssignment_0 )? ) )
            // InternalTypescript.g:1564:1: ( ( rule__Declaration__DocCommentAssignment_0 )? )
            {
            // InternalTypescript.g:1564:1: ( ( rule__Declaration__DocCommentAssignment_0 )? )
            // InternalTypescript.g:1565:2: ( rule__Declaration__DocCommentAssignment_0 )?
            {
             before(grammarAccess.getDeclarationAccess().getDocCommentAssignment_0()); 
            // InternalTypescript.g:1566:2: ( rule__Declaration__DocCommentAssignment_0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==33) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalTypescript.g:1566:3: rule__Declaration__DocCommentAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Declaration__DocCommentAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDeclarationAccess().getDocCommentAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__0__Impl"


    // $ANTLR start "rule__Declaration__Group__1"
    // InternalTypescript.g:1574:1: rule__Declaration__Group__1 : rule__Declaration__Group__1__Impl ;
    public final void rule__Declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:1578:1: ( rule__Declaration__Group__1__Impl )
            // InternalTypescript.g:1579:2: rule__Declaration__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Declaration__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__1"


    // $ANTLR start "rule__Declaration__Group__1__Impl"
    // InternalTypescript.g:1585:1: rule__Declaration__Group__1__Impl : ( ( rule__Declaration__DeclarationAssignment_1 ) ) ;
    public final void rule__Declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:1589:1: ( ( ( rule__Declaration__DeclarationAssignment_1 ) ) )
            // InternalTypescript.g:1590:1: ( ( rule__Declaration__DeclarationAssignment_1 ) )
            {
            // InternalTypescript.g:1590:1: ( ( rule__Declaration__DeclarationAssignment_1 ) )
            // InternalTypescript.g:1591:2: ( rule__Declaration__DeclarationAssignment_1 )
            {
             before(grammarAccess.getDeclarationAccess().getDeclarationAssignment_1()); 
            // InternalTypescript.g:1592:2: ( rule__Declaration__DeclarationAssignment_1 )
            // InternalTypescript.g:1592:3: rule__Declaration__DeclarationAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Declaration__DeclarationAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getDeclarationAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__1__Impl"


    // $ANTLR start "rule__InterfaceOrClassDeclaration__Group__0"
    // InternalTypescript.g:1601:1: rule__InterfaceOrClassDeclaration__Group__0 : rule__InterfaceOrClassDeclaration__Group__0__Impl rule__InterfaceOrClassDeclaration__Group__1 ;
    public final void rule__InterfaceOrClassDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:1605:1: ( rule__InterfaceOrClassDeclaration__Group__0__Impl rule__InterfaceOrClassDeclaration__Group__1 )
            // InternalTypescript.g:1606:2: rule__InterfaceOrClassDeclaration__Group__0__Impl rule__InterfaceOrClassDeclaration__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__InterfaceOrClassDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InterfaceOrClassDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceOrClassDeclaration__Group__0"


    // $ANTLR start "rule__InterfaceOrClassDeclaration__Group__0__Impl"
    // InternalTypescript.g:1613:1: rule__InterfaceOrClassDeclaration__Group__0__Impl : ( ( rule__InterfaceOrClassDeclaration__Alternatives_0 ) ) ;
    public final void rule__InterfaceOrClassDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:1617:1: ( ( ( rule__InterfaceOrClassDeclaration__Alternatives_0 ) ) )
            // InternalTypescript.g:1618:1: ( ( rule__InterfaceOrClassDeclaration__Alternatives_0 ) )
            {
            // InternalTypescript.g:1618:1: ( ( rule__InterfaceOrClassDeclaration__Alternatives_0 ) )
            // InternalTypescript.g:1619:2: ( rule__InterfaceOrClassDeclaration__Alternatives_0 )
            {
             before(grammarAccess.getInterfaceOrClassDeclarationAccess().getAlternatives_0()); 
            // InternalTypescript.g:1620:2: ( rule__InterfaceOrClassDeclaration__Alternatives_0 )
            // InternalTypescript.g:1620:3: rule__InterfaceOrClassDeclaration__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__InterfaceOrClassDeclaration__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceOrClassDeclarationAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceOrClassDeclaration__Group__0__Impl"


    // $ANTLR start "rule__InterfaceOrClassDeclaration__Group__1"
    // InternalTypescript.g:1628:1: rule__InterfaceOrClassDeclaration__Group__1 : rule__InterfaceOrClassDeclaration__Group__1__Impl ;
    public final void rule__InterfaceOrClassDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:1632:1: ( rule__InterfaceOrClassDeclaration__Group__1__Impl )
            // InternalTypescript.g:1633:2: rule__InterfaceOrClassDeclaration__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InterfaceOrClassDeclaration__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceOrClassDeclaration__Group__1"


    // $ANTLR start "rule__InterfaceOrClassDeclaration__Group__1__Impl"
    // InternalTypescript.g:1639:1: rule__InterfaceOrClassDeclaration__Group__1__Impl : ( ( rule__InterfaceOrClassDeclaration__ObjectTypeAssignment_1 ) ) ;
    public final void rule__InterfaceOrClassDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:1643:1: ( ( ( rule__InterfaceOrClassDeclaration__ObjectTypeAssignment_1 ) ) )
            // InternalTypescript.g:1644:1: ( ( rule__InterfaceOrClassDeclaration__ObjectTypeAssignment_1 ) )
            {
            // InternalTypescript.g:1644:1: ( ( rule__InterfaceOrClassDeclaration__ObjectTypeAssignment_1 ) )
            // InternalTypescript.g:1645:2: ( rule__InterfaceOrClassDeclaration__ObjectTypeAssignment_1 )
            {
             before(grammarAccess.getInterfaceOrClassDeclarationAccess().getObjectTypeAssignment_1()); 
            // InternalTypescript.g:1646:2: ( rule__InterfaceOrClassDeclaration__ObjectTypeAssignment_1 )
            // InternalTypescript.g:1646:3: rule__InterfaceOrClassDeclaration__ObjectTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__InterfaceOrClassDeclaration__ObjectTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceOrClassDeclarationAccess().getObjectTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceOrClassDeclaration__Group__1__Impl"


    // $ANTLR start "rule__InterfaceDeclaration__Group__0"
    // InternalTypescript.g:1655:1: rule__InterfaceDeclaration__Group__0 : rule__InterfaceDeclaration__Group__0__Impl rule__InterfaceDeclaration__Group__1 ;
    public final void rule__InterfaceDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:1659:1: ( rule__InterfaceDeclaration__Group__0__Impl rule__InterfaceDeclaration__Group__1 )
            // InternalTypescript.g:1660:2: rule__InterfaceDeclaration__Group__0__Impl rule__InterfaceDeclaration__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__InterfaceDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InterfaceDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDeclaration__Group__0"


    // $ANTLR start "rule__InterfaceDeclaration__Group__0__Impl"
    // InternalTypescript.g:1667:1: rule__InterfaceDeclaration__Group__0__Impl : ( 'interface' ) ;
    public final void rule__InterfaceDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:1671:1: ( ( 'interface' ) )
            // InternalTypescript.g:1672:1: ( 'interface' )
            {
            // InternalTypescript.g:1672:1: ( 'interface' )
            // InternalTypescript.g:1673:2: 'interface'
            {
             before(grammarAccess.getInterfaceDeclarationAccess().getInterfaceKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getInterfaceDeclarationAccess().getInterfaceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDeclaration__Group__0__Impl"


    // $ANTLR start "rule__InterfaceDeclaration__Group__1"
    // InternalTypescript.g:1682:1: rule__InterfaceDeclaration__Group__1 : rule__InterfaceDeclaration__Group__1__Impl rule__InterfaceDeclaration__Group__2 ;
    public final void rule__InterfaceDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:1686:1: ( rule__InterfaceDeclaration__Group__1__Impl rule__InterfaceDeclaration__Group__2 )
            // InternalTypescript.g:1687:2: rule__InterfaceDeclaration__Group__1__Impl rule__InterfaceDeclaration__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__InterfaceDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InterfaceDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDeclaration__Group__1"


    // $ANTLR start "rule__InterfaceDeclaration__Group__1__Impl"
    // InternalTypescript.g:1694:1: rule__InterfaceDeclaration__Group__1__Impl : ( ( rule__InterfaceDeclaration__NameAssignment_1 ) ) ;
    public final void rule__InterfaceDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:1698:1: ( ( ( rule__InterfaceDeclaration__NameAssignment_1 ) ) )
            // InternalTypescript.g:1699:1: ( ( rule__InterfaceDeclaration__NameAssignment_1 ) )
            {
            // InternalTypescript.g:1699:1: ( ( rule__InterfaceDeclaration__NameAssignment_1 ) )
            // InternalTypescript.g:1700:2: ( rule__InterfaceDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getInterfaceDeclarationAccess().getNameAssignment_1()); 
            // InternalTypescript.g:1701:2: ( rule__InterfaceDeclaration__NameAssignment_1 )
            // InternalTypescript.g:1701:3: rule__InterfaceDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__InterfaceDeclaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceDeclarationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDeclaration__Group__1__Impl"


    // $ANTLR start "rule__InterfaceDeclaration__Group__2"
    // InternalTypescript.g:1709:1: rule__InterfaceDeclaration__Group__2 : rule__InterfaceDeclaration__Group__2__Impl ;
    public final void rule__InterfaceDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:1713:1: ( rule__InterfaceDeclaration__Group__2__Impl )
            // InternalTypescript.g:1714:2: rule__InterfaceDeclaration__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InterfaceDeclaration__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDeclaration__Group__2"


    // $ANTLR start "rule__InterfaceDeclaration__Group__2__Impl"
    // InternalTypescript.g:1720:1: rule__InterfaceDeclaration__Group__2__Impl : ( ( rule__InterfaceDeclaration__ExtendClauseAssignment_2 )? ) ;
    public final void rule__InterfaceDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:1724:1: ( ( ( rule__InterfaceDeclaration__ExtendClauseAssignment_2 )? ) )
            // InternalTypescript.g:1725:1: ( ( rule__InterfaceDeclaration__ExtendClauseAssignment_2 )? )
            {
            // InternalTypescript.g:1725:1: ( ( rule__InterfaceDeclaration__ExtendClauseAssignment_2 )? )
            // InternalTypescript.g:1726:2: ( rule__InterfaceDeclaration__ExtendClauseAssignment_2 )?
            {
             before(grammarAccess.getInterfaceDeclarationAccess().getExtendClauseAssignment_2()); 
            // InternalTypescript.g:1727:2: ( rule__InterfaceDeclaration__ExtendClauseAssignment_2 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==28) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalTypescript.g:1727:3: rule__InterfaceDeclaration__ExtendClauseAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__InterfaceDeclaration__ExtendClauseAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInterfaceDeclarationAccess().getExtendClauseAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDeclaration__Group__2__Impl"


    // $ANTLR start "rule__ClassDeclaration__Group__0"
    // InternalTypescript.g:1736:1: rule__ClassDeclaration__Group__0 : rule__ClassDeclaration__Group__0__Impl rule__ClassDeclaration__Group__1 ;
    public final void rule__ClassDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:1740:1: ( rule__ClassDeclaration__Group__0__Impl rule__ClassDeclaration__Group__1 )
            // InternalTypescript.g:1741:2: rule__ClassDeclaration__Group__0__Impl rule__ClassDeclaration__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__ClassDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group__0"


    // $ANTLR start "rule__ClassDeclaration__Group__0__Impl"
    // InternalTypescript.g:1748:1: rule__ClassDeclaration__Group__0__Impl : ( 'class' ) ;
    public final void rule__ClassDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:1752:1: ( ( 'class' ) )
            // InternalTypescript.g:1753:1: ( 'class' )
            {
            // InternalTypescript.g:1753:1: ( 'class' )
            // InternalTypescript.g:1754:2: 'class'
            {
             before(grammarAccess.getClassDeclarationAccess().getClassKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getClassDeclarationAccess().getClassKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group__0__Impl"


    // $ANTLR start "rule__ClassDeclaration__Group__1"
    // InternalTypescript.g:1763:1: rule__ClassDeclaration__Group__1 : rule__ClassDeclaration__Group__1__Impl ;
    public final void rule__ClassDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:1767:1: ( rule__ClassDeclaration__Group__1__Impl )
            // InternalTypescript.g:1768:2: rule__ClassDeclaration__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group__1"


    // $ANTLR start "rule__ClassDeclaration__Group__1__Impl"
    // InternalTypescript.g:1774:1: rule__ClassDeclaration__Group__1__Impl : ( ( rule__ClassDeclaration__NameAssignment_1 ) ) ;
    public final void rule__ClassDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:1778:1: ( ( ( rule__ClassDeclaration__NameAssignment_1 ) ) )
            // InternalTypescript.g:1779:1: ( ( rule__ClassDeclaration__NameAssignment_1 ) )
            {
            // InternalTypescript.g:1779:1: ( ( rule__ClassDeclaration__NameAssignment_1 ) )
            // InternalTypescript.g:1780:2: ( rule__ClassDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getClassDeclarationAccess().getNameAssignment_1()); 
            // InternalTypescript.g:1781:2: ( rule__ClassDeclaration__NameAssignment_1 )
            // InternalTypescript.g:1781:3: rule__ClassDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getClassDeclarationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group__1__Impl"


    // $ANTLR start "rule__InterfaceExtendsClause__Group__0"
    // InternalTypescript.g:1790:1: rule__InterfaceExtendsClause__Group__0 : rule__InterfaceExtendsClause__Group__0__Impl rule__InterfaceExtendsClause__Group__1 ;
    public final void rule__InterfaceExtendsClause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:1794:1: ( rule__InterfaceExtendsClause__Group__0__Impl rule__InterfaceExtendsClause__Group__1 )
            // InternalTypescript.g:1795:2: rule__InterfaceExtendsClause__Group__0__Impl rule__InterfaceExtendsClause__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__InterfaceExtendsClause__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InterfaceExtendsClause__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceExtendsClause__Group__0"


    // $ANTLR start "rule__InterfaceExtendsClause__Group__0__Impl"
    // InternalTypescript.g:1802:1: rule__InterfaceExtendsClause__Group__0__Impl : ( 'extends' ) ;
    public final void rule__InterfaceExtendsClause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:1806:1: ( ( 'extends' ) )
            // InternalTypescript.g:1807:1: ( 'extends' )
            {
            // InternalTypescript.g:1807:1: ( 'extends' )
            // InternalTypescript.g:1808:2: 'extends'
            {
             before(grammarAccess.getInterfaceExtendsClauseAccess().getExtendsKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getInterfaceExtendsClauseAccess().getExtendsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceExtendsClause__Group__0__Impl"


    // $ANTLR start "rule__InterfaceExtendsClause__Group__1"
    // InternalTypescript.g:1817:1: rule__InterfaceExtendsClause__Group__1 : rule__InterfaceExtendsClause__Group__1__Impl ;
    public final void rule__InterfaceExtendsClause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:1821:1: ( rule__InterfaceExtendsClause__Group__1__Impl )
            // InternalTypescript.g:1822:2: rule__InterfaceExtendsClause__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InterfaceExtendsClause__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceExtendsClause__Group__1"


    // $ANTLR start "rule__InterfaceExtendsClause__Group__1__Impl"
    // InternalTypescript.g:1828:1: rule__InterfaceExtendsClause__Group__1__Impl : ( ruleClassOrInterfaceTypeList ) ;
    public final void rule__InterfaceExtendsClause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:1832:1: ( ( ruleClassOrInterfaceTypeList ) )
            // InternalTypescript.g:1833:1: ( ruleClassOrInterfaceTypeList )
            {
            // InternalTypescript.g:1833:1: ( ruleClassOrInterfaceTypeList )
            // InternalTypescript.g:1834:2: ruleClassOrInterfaceTypeList
            {
             before(grammarAccess.getInterfaceExtendsClauseAccess().getClassOrInterfaceTypeListParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleClassOrInterfaceTypeList();

            state._fsp--;

             after(grammarAccess.getInterfaceExtendsClauseAccess().getClassOrInterfaceTypeListParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceExtendsClause__Group__1__Impl"


    // $ANTLR start "rule__ClassOrInterfaceTypeList__Group__0"
    // InternalTypescript.g:1844:1: rule__ClassOrInterfaceTypeList__Group__0 : rule__ClassOrInterfaceTypeList__Group__0__Impl rule__ClassOrInterfaceTypeList__Group__1 ;
    public final void rule__ClassOrInterfaceTypeList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:1848:1: ( rule__ClassOrInterfaceTypeList__Group__0__Impl rule__ClassOrInterfaceTypeList__Group__1 )
            // InternalTypescript.g:1849:2: rule__ClassOrInterfaceTypeList__Group__0__Impl rule__ClassOrInterfaceTypeList__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__ClassOrInterfaceTypeList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassOrInterfaceTypeList__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassOrInterfaceTypeList__Group__0"


    // $ANTLR start "rule__ClassOrInterfaceTypeList__Group__0__Impl"
    // InternalTypescript.g:1856:1: rule__ClassOrInterfaceTypeList__Group__0__Impl : ( () ) ;
    public final void rule__ClassOrInterfaceTypeList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:1860:1: ( ( () ) )
            // InternalTypescript.g:1861:1: ( () )
            {
            // InternalTypescript.g:1861:1: ( () )
            // InternalTypescript.g:1862:2: ()
            {
             before(grammarAccess.getClassOrInterfaceTypeListAccess().getClassOrInterfaceTypeListAction_0()); 
            // InternalTypescript.g:1863:2: ()
            // InternalTypescript.g:1863:3: 
            {
            }

             after(grammarAccess.getClassOrInterfaceTypeListAccess().getClassOrInterfaceTypeListAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassOrInterfaceTypeList__Group__0__Impl"


    // $ANTLR start "rule__ClassOrInterfaceTypeList__Group__1"
    // InternalTypescript.g:1871:1: rule__ClassOrInterfaceTypeList__Group__1 : rule__ClassOrInterfaceTypeList__Group__1__Impl rule__ClassOrInterfaceTypeList__Group__2 ;
    public final void rule__ClassOrInterfaceTypeList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:1875:1: ( rule__ClassOrInterfaceTypeList__Group__1__Impl rule__ClassOrInterfaceTypeList__Group__2 )
            // InternalTypescript.g:1876:2: rule__ClassOrInterfaceTypeList__Group__1__Impl rule__ClassOrInterfaceTypeList__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__ClassOrInterfaceTypeList__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassOrInterfaceTypeList__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassOrInterfaceTypeList__Group__1"


    // $ANTLR start "rule__ClassOrInterfaceTypeList__Group__1__Impl"
    // InternalTypescript.g:1883:1: rule__ClassOrInterfaceTypeList__Group__1__Impl : ( ( rule__ClassOrInterfaceTypeList__ParentsAssignment_1 ) ) ;
    public final void rule__ClassOrInterfaceTypeList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:1887:1: ( ( ( rule__ClassOrInterfaceTypeList__ParentsAssignment_1 ) ) )
            // InternalTypescript.g:1888:1: ( ( rule__ClassOrInterfaceTypeList__ParentsAssignment_1 ) )
            {
            // InternalTypescript.g:1888:1: ( ( rule__ClassOrInterfaceTypeList__ParentsAssignment_1 ) )
            // InternalTypescript.g:1889:2: ( rule__ClassOrInterfaceTypeList__ParentsAssignment_1 )
            {
             before(grammarAccess.getClassOrInterfaceTypeListAccess().getParentsAssignment_1()); 
            // InternalTypescript.g:1890:2: ( rule__ClassOrInterfaceTypeList__ParentsAssignment_1 )
            // InternalTypescript.g:1890:3: rule__ClassOrInterfaceTypeList__ParentsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ClassOrInterfaceTypeList__ParentsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getClassOrInterfaceTypeListAccess().getParentsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassOrInterfaceTypeList__Group__1__Impl"


    // $ANTLR start "rule__ClassOrInterfaceTypeList__Group__2"
    // InternalTypescript.g:1898:1: rule__ClassOrInterfaceTypeList__Group__2 : rule__ClassOrInterfaceTypeList__Group__2__Impl ;
    public final void rule__ClassOrInterfaceTypeList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:1902:1: ( rule__ClassOrInterfaceTypeList__Group__2__Impl )
            // InternalTypescript.g:1903:2: rule__ClassOrInterfaceTypeList__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassOrInterfaceTypeList__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassOrInterfaceTypeList__Group__2"


    // $ANTLR start "rule__ClassOrInterfaceTypeList__Group__2__Impl"
    // InternalTypescript.g:1909:1: rule__ClassOrInterfaceTypeList__Group__2__Impl : ( ( rule__ClassOrInterfaceTypeList__Group_2__0 )* ) ;
    public final void rule__ClassOrInterfaceTypeList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:1913:1: ( ( ( rule__ClassOrInterfaceTypeList__Group_2__0 )* ) )
            // InternalTypescript.g:1914:1: ( ( rule__ClassOrInterfaceTypeList__Group_2__0 )* )
            {
            // InternalTypescript.g:1914:1: ( ( rule__ClassOrInterfaceTypeList__Group_2__0 )* )
            // InternalTypescript.g:1915:2: ( rule__ClassOrInterfaceTypeList__Group_2__0 )*
            {
             before(grammarAccess.getClassOrInterfaceTypeListAccess().getGroup_2()); 
            // InternalTypescript.g:1916:2: ( rule__ClassOrInterfaceTypeList__Group_2__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==29) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalTypescript.g:1916:3: rule__ClassOrInterfaceTypeList__Group_2__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__ClassOrInterfaceTypeList__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getClassOrInterfaceTypeListAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassOrInterfaceTypeList__Group__2__Impl"


    // $ANTLR start "rule__ClassOrInterfaceTypeList__Group_2__0"
    // InternalTypescript.g:1925:1: rule__ClassOrInterfaceTypeList__Group_2__0 : rule__ClassOrInterfaceTypeList__Group_2__0__Impl rule__ClassOrInterfaceTypeList__Group_2__1 ;
    public final void rule__ClassOrInterfaceTypeList__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:1929:1: ( rule__ClassOrInterfaceTypeList__Group_2__0__Impl rule__ClassOrInterfaceTypeList__Group_2__1 )
            // InternalTypescript.g:1930:2: rule__ClassOrInterfaceTypeList__Group_2__0__Impl rule__ClassOrInterfaceTypeList__Group_2__1
            {
            pushFollow(FOLLOW_6);
            rule__ClassOrInterfaceTypeList__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassOrInterfaceTypeList__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassOrInterfaceTypeList__Group_2__0"


    // $ANTLR start "rule__ClassOrInterfaceTypeList__Group_2__0__Impl"
    // InternalTypescript.g:1937:1: rule__ClassOrInterfaceTypeList__Group_2__0__Impl : ( ',' ) ;
    public final void rule__ClassOrInterfaceTypeList__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:1941:1: ( ( ',' ) )
            // InternalTypescript.g:1942:1: ( ',' )
            {
            // InternalTypescript.g:1942:1: ( ',' )
            // InternalTypescript.g:1943:2: ','
            {
             before(grammarAccess.getClassOrInterfaceTypeListAccess().getCommaKeyword_2_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getClassOrInterfaceTypeListAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassOrInterfaceTypeList__Group_2__0__Impl"


    // $ANTLR start "rule__ClassOrInterfaceTypeList__Group_2__1"
    // InternalTypescript.g:1952:1: rule__ClassOrInterfaceTypeList__Group_2__1 : rule__ClassOrInterfaceTypeList__Group_2__1__Impl ;
    public final void rule__ClassOrInterfaceTypeList__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:1956:1: ( rule__ClassOrInterfaceTypeList__Group_2__1__Impl )
            // InternalTypescript.g:1957:2: rule__ClassOrInterfaceTypeList__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassOrInterfaceTypeList__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassOrInterfaceTypeList__Group_2__1"


    // $ANTLR start "rule__ClassOrInterfaceTypeList__Group_2__1__Impl"
    // InternalTypescript.g:1963:1: rule__ClassOrInterfaceTypeList__Group_2__1__Impl : ( ( rule__ClassOrInterfaceTypeList__ParentsAssignment_2_1 ) ) ;
    public final void rule__ClassOrInterfaceTypeList__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:1967:1: ( ( ( rule__ClassOrInterfaceTypeList__ParentsAssignment_2_1 ) ) )
            // InternalTypescript.g:1968:1: ( ( rule__ClassOrInterfaceTypeList__ParentsAssignment_2_1 ) )
            {
            // InternalTypescript.g:1968:1: ( ( rule__ClassOrInterfaceTypeList__ParentsAssignment_2_1 ) )
            // InternalTypescript.g:1969:2: ( rule__ClassOrInterfaceTypeList__ParentsAssignment_2_1 )
            {
             before(grammarAccess.getClassOrInterfaceTypeListAccess().getParentsAssignment_2_1()); 
            // InternalTypescript.g:1970:2: ( rule__ClassOrInterfaceTypeList__ParentsAssignment_2_1 )
            // InternalTypescript.g:1970:3: rule__ClassOrInterfaceTypeList__ParentsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ClassOrInterfaceTypeList__ParentsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getClassOrInterfaceTypeListAccess().getParentsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassOrInterfaceTypeList__Group_2__1__Impl"


    // $ANTLR start "rule__ObjectType__Group__0"
    // InternalTypescript.g:1979:1: rule__ObjectType__Group__0 : rule__ObjectType__Group__0__Impl rule__ObjectType__Group__1 ;
    public final void rule__ObjectType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:1983:1: ( rule__ObjectType__Group__0__Impl rule__ObjectType__Group__1 )
            // InternalTypescript.g:1984:2: rule__ObjectType__Group__0__Impl rule__ObjectType__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__ObjectType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectType__Group__0"


    // $ANTLR start "rule__ObjectType__Group__0__Impl"
    // InternalTypescript.g:1991:1: rule__ObjectType__Group__0__Impl : ( () ) ;
    public final void rule__ObjectType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:1995:1: ( ( () ) )
            // InternalTypescript.g:1996:1: ( () )
            {
            // InternalTypescript.g:1996:1: ( () )
            // InternalTypescript.g:1997:2: ()
            {
             before(grammarAccess.getObjectTypeAccess().getObjectTypeAction_0()); 
            // InternalTypescript.g:1998:2: ()
            // InternalTypescript.g:1998:3: 
            {
            }

             after(grammarAccess.getObjectTypeAccess().getObjectTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectType__Group__0__Impl"


    // $ANTLR start "rule__ObjectType__Group__1"
    // InternalTypescript.g:2006:1: rule__ObjectType__Group__1 : rule__ObjectType__Group__1__Impl rule__ObjectType__Group__2 ;
    public final void rule__ObjectType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:2010:1: ( rule__ObjectType__Group__1__Impl rule__ObjectType__Group__2 )
            // InternalTypescript.g:2011:2: rule__ObjectType__Group__1__Impl rule__ObjectType__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__ObjectType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectType__Group__1"


    // $ANTLR start "rule__ObjectType__Group__1__Impl"
    // InternalTypescript.g:2018:1: rule__ObjectType__Group__1__Impl : ( '{' ) ;
    public final void rule__ObjectType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:2022:1: ( ( '{' ) )
            // InternalTypescript.g:2023:1: ( '{' )
            {
            // InternalTypescript.g:2023:1: ( '{' )
            // InternalTypescript.g:2024:2: '{'
            {
             before(grammarAccess.getObjectTypeAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getObjectTypeAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectType__Group__1__Impl"


    // $ANTLR start "rule__ObjectType__Group__2"
    // InternalTypescript.g:2033:1: rule__ObjectType__Group__2 : rule__ObjectType__Group__2__Impl rule__ObjectType__Group__3 ;
    public final void rule__ObjectType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:2037:1: ( rule__ObjectType__Group__2__Impl rule__ObjectType__Group__3 )
            // InternalTypescript.g:2038:2: rule__ObjectType__Group__2__Impl rule__ObjectType__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__ObjectType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectType__Group__2"


    // $ANTLR start "rule__ObjectType__Group__2__Impl"
    // InternalTypescript.g:2045:1: rule__ObjectType__Group__2__Impl : ( ( rule__ObjectType__Group_2__0 )* ) ;
    public final void rule__ObjectType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:2049:1: ( ( ( rule__ObjectType__Group_2__0 )* ) )
            // InternalTypescript.g:2050:1: ( ( rule__ObjectType__Group_2__0 )* )
            {
            // InternalTypescript.g:2050:1: ( ( rule__ObjectType__Group_2__0 )* )
            // InternalTypescript.g:2051:2: ( rule__ObjectType__Group_2__0 )*
            {
             before(grammarAccess.getObjectTypeAccess().getGroup_2()); 
            // InternalTypescript.g:2052:2: ( rule__ObjectType__Group_2__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID||LA20_0==31||LA20_0==33) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalTypescript.g:2052:3: rule__ObjectType__Group_2__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__ObjectType__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getObjectTypeAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectType__Group__2__Impl"


    // $ANTLR start "rule__ObjectType__Group__3"
    // InternalTypescript.g:2060:1: rule__ObjectType__Group__3 : rule__ObjectType__Group__3__Impl ;
    public final void rule__ObjectType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:2064:1: ( rule__ObjectType__Group__3__Impl )
            // InternalTypescript.g:2065:2: rule__ObjectType__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ObjectType__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectType__Group__3"


    // $ANTLR start "rule__ObjectType__Group__3__Impl"
    // InternalTypescript.g:2071:1: rule__ObjectType__Group__3__Impl : ( '}' ) ;
    public final void rule__ObjectType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:2075:1: ( ( '}' ) )
            // InternalTypescript.g:2076:1: ( '}' )
            {
            // InternalTypescript.g:2076:1: ( '}' )
            // InternalTypescript.g:2077:2: '}'
            {
             before(grammarAccess.getObjectTypeAccess().getRightCurlyBracketKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getObjectTypeAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectType__Group__3__Impl"


    // $ANTLR start "rule__ObjectType__Group_2__0"
    // InternalTypescript.g:2087:1: rule__ObjectType__Group_2__0 : rule__ObjectType__Group_2__0__Impl rule__ObjectType__Group_2__1 ;
    public final void rule__ObjectType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:2091:1: ( rule__ObjectType__Group_2__0__Impl rule__ObjectType__Group_2__1 )
            // InternalTypescript.g:2092:2: rule__ObjectType__Group_2__0__Impl rule__ObjectType__Group_2__1
            {
            pushFollow(FOLLOW_14);
            rule__ObjectType__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectType__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectType__Group_2__0"


    // $ANTLR start "rule__ObjectType__Group_2__0__Impl"
    // InternalTypescript.g:2099:1: rule__ObjectType__Group_2__0__Impl : ( ( rule__ObjectType__MembersAssignment_2_0 ) ) ;
    public final void rule__ObjectType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:2103:1: ( ( ( rule__ObjectType__MembersAssignment_2_0 ) ) )
            // InternalTypescript.g:2104:1: ( ( rule__ObjectType__MembersAssignment_2_0 ) )
            {
            // InternalTypescript.g:2104:1: ( ( rule__ObjectType__MembersAssignment_2_0 ) )
            // InternalTypescript.g:2105:2: ( rule__ObjectType__MembersAssignment_2_0 )
            {
             before(grammarAccess.getObjectTypeAccess().getMembersAssignment_2_0()); 
            // InternalTypescript.g:2106:2: ( rule__ObjectType__MembersAssignment_2_0 )
            // InternalTypescript.g:2106:3: rule__ObjectType__MembersAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__ObjectType__MembersAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getObjectTypeAccess().getMembersAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectType__Group_2__0__Impl"


    // $ANTLR start "rule__ObjectType__Group_2__1"
    // InternalTypescript.g:2114:1: rule__ObjectType__Group_2__1 : rule__ObjectType__Group_2__1__Impl ;
    public final void rule__ObjectType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:2118:1: ( rule__ObjectType__Group_2__1__Impl )
            // InternalTypescript.g:2119:2: rule__ObjectType__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ObjectType__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectType__Group_2__1"


    // $ANTLR start "rule__ObjectType__Group_2__1__Impl"
    // InternalTypescript.g:2125:1: rule__ObjectType__Group_2__1__Impl : ( ( ';' )? ) ;
    public final void rule__ObjectType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:2129:1: ( ( ( ';' )? ) )
            // InternalTypescript.g:2130:1: ( ( ';' )? )
            {
            // InternalTypescript.g:2130:1: ( ( ';' )? )
            // InternalTypescript.g:2131:2: ( ';' )?
            {
             before(grammarAccess.getObjectTypeAccess().getSemicolonKeyword_2_1()); 
            // InternalTypescript.g:2132:2: ( ';' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==25) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalTypescript.g:2132:3: ';'
                    {
                    match(input,25,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getObjectTypeAccess().getSemicolonKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectType__Group_2__1__Impl"


    // $ANTLR start "rule__TypeMember__Group__0"
    // InternalTypescript.g:2141:1: rule__TypeMember__Group__0 : rule__TypeMember__Group__0__Impl rule__TypeMember__Group__1 ;
    public final void rule__TypeMember__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:2145:1: ( rule__TypeMember__Group__0__Impl rule__TypeMember__Group__1 )
            // InternalTypescript.g:2146:2: rule__TypeMember__Group__0__Impl rule__TypeMember__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__TypeMember__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeMember__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeMember__Group__0"


    // $ANTLR start "rule__TypeMember__Group__0__Impl"
    // InternalTypescript.g:2153:1: rule__TypeMember__Group__0__Impl : ( ( rule__TypeMember__DocCommentAssignment_0 )? ) ;
    public final void rule__TypeMember__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:2157:1: ( ( ( rule__TypeMember__DocCommentAssignment_0 )? ) )
            // InternalTypescript.g:2158:1: ( ( rule__TypeMember__DocCommentAssignment_0 )? )
            {
            // InternalTypescript.g:2158:1: ( ( rule__TypeMember__DocCommentAssignment_0 )? )
            // InternalTypescript.g:2159:2: ( rule__TypeMember__DocCommentAssignment_0 )?
            {
             before(grammarAccess.getTypeMemberAccess().getDocCommentAssignment_0()); 
            // InternalTypescript.g:2160:2: ( rule__TypeMember__DocCommentAssignment_0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==33) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalTypescript.g:2160:3: rule__TypeMember__DocCommentAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TypeMember__DocCommentAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTypeMemberAccess().getDocCommentAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeMember__Group__0__Impl"


    // $ANTLR start "rule__TypeMember__Group__1"
    // InternalTypescript.g:2168:1: rule__TypeMember__Group__1 : rule__TypeMember__Group__1__Impl ;
    public final void rule__TypeMember__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:2172:1: ( rule__TypeMember__Group__1__Impl )
            // InternalTypescript.g:2173:2: rule__TypeMember__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypeMember__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeMember__Group__1"


    // $ANTLR start "rule__TypeMember__Group__1__Impl"
    // InternalTypescript.g:2179:1: rule__TypeMember__Group__1__Impl : ( ( rule__TypeMember__SignatureAssignment_1 ) ) ;
    public final void rule__TypeMember__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:2183:1: ( ( ( rule__TypeMember__SignatureAssignment_1 ) ) )
            // InternalTypescript.g:2184:1: ( ( rule__TypeMember__SignatureAssignment_1 ) )
            {
            // InternalTypescript.g:2184:1: ( ( rule__TypeMember__SignatureAssignment_1 ) )
            // InternalTypescript.g:2185:2: ( rule__TypeMember__SignatureAssignment_1 )
            {
             before(grammarAccess.getTypeMemberAccess().getSignatureAssignment_1()); 
            // InternalTypescript.g:2186:2: ( rule__TypeMember__SignatureAssignment_1 )
            // InternalTypescript.g:2186:3: rule__TypeMember__SignatureAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TypeMember__SignatureAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeMemberAccess().getSignatureAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeMember__Group__1__Impl"


    // $ANTLR start "rule__PropertySignature__Group__0"
    // InternalTypescript.g:2195:1: rule__PropertySignature__Group__0 : rule__PropertySignature__Group__0__Impl rule__PropertySignature__Group__1 ;
    public final void rule__PropertySignature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:2199:1: ( rule__PropertySignature__Group__0__Impl rule__PropertySignature__Group__1 )
            // InternalTypescript.g:2200:2: rule__PropertySignature__Group__0__Impl rule__PropertySignature__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__PropertySignature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertySignature__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertySignature__Group__0"


    // $ANTLR start "rule__PropertySignature__Group__0__Impl"
    // InternalTypescript.g:2207:1: rule__PropertySignature__Group__0__Impl : ( ( rule__PropertySignature__NameAssignment_0 ) ) ;
    public final void rule__PropertySignature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:2211:1: ( ( ( rule__PropertySignature__NameAssignment_0 ) ) )
            // InternalTypescript.g:2212:1: ( ( rule__PropertySignature__NameAssignment_0 ) )
            {
            // InternalTypescript.g:2212:1: ( ( rule__PropertySignature__NameAssignment_0 ) )
            // InternalTypescript.g:2213:2: ( rule__PropertySignature__NameAssignment_0 )
            {
             before(grammarAccess.getPropertySignatureAccess().getNameAssignment_0()); 
            // InternalTypescript.g:2214:2: ( rule__PropertySignature__NameAssignment_0 )
            // InternalTypescript.g:2214:3: rule__PropertySignature__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__PropertySignature__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPropertySignatureAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertySignature__Group__0__Impl"


    // $ANTLR start "rule__PropertySignature__Group__1"
    // InternalTypescript.g:2222:1: rule__PropertySignature__Group__1 : rule__PropertySignature__Group__1__Impl rule__PropertySignature__Group__2 ;
    public final void rule__PropertySignature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:2226:1: ( rule__PropertySignature__Group__1__Impl rule__PropertySignature__Group__2 )
            // InternalTypescript.g:2227:2: rule__PropertySignature__Group__1__Impl rule__PropertySignature__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__PropertySignature__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertySignature__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertySignature__Group__1"


    // $ANTLR start "rule__PropertySignature__Group__1__Impl"
    // InternalTypescript.g:2234:1: rule__PropertySignature__Group__1__Impl : ( ( rule__PropertySignature__OptionalAssignment_1 )? ) ;
    public final void rule__PropertySignature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:2238:1: ( ( ( rule__PropertySignature__OptionalAssignment_1 )? ) )
            // InternalTypescript.g:2239:1: ( ( rule__PropertySignature__OptionalAssignment_1 )? )
            {
            // InternalTypescript.g:2239:1: ( ( rule__PropertySignature__OptionalAssignment_1 )? )
            // InternalTypescript.g:2240:2: ( rule__PropertySignature__OptionalAssignment_1 )?
            {
             before(grammarAccess.getPropertySignatureAccess().getOptionalAssignment_1()); 
            // InternalTypescript.g:2241:2: ( rule__PropertySignature__OptionalAssignment_1 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==35) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalTypescript.g:2241:3: rule__PropertySignature__OptionalAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__PropertySignature__OptionalAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPropertySignatureAccess().getOptionalAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertySignature__Group__1__Impl"


    // $ANTLR start "rule__PropertySignature__Group__2"
    // InternalTypescript.g:2249:1: rule__PropertySignature__Group__2 : rule__PropertySignature__Group__2__Impl rule__PropertySignature__Group__3 ;
    public final void rule__PropertySignature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:2253:1: ( rule__PropertySignature__Group__2__Impl rule__PropertySignature__Group__3 )
            // InternalTypescript.g:2254:2: rule__PropertySignature__Group__2__Impl rule__PropertySignature__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__PropertySignature__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertySignature__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertySignature__Group__2"


    // $ANTLR start "rule__PropertySignature__Group__2__Impl"
    // InternalTypescript.g:2261:1: rule__PropertySignature__Group__2__Impl : ( ':' ) ;
    public final void rule__PropertySignature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:2265:1: ( ( ':' ) )
            // InternalTypescript.g:2266:1: ( ':' )
            {
            // InternalTypescript.g:2266:1: ( ':' )
            // InternalTypescript.g:2267:2: ':'
            {
             before(grammarAccess.getPropertySignatureAccess().getColonKeyword_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getPropertySignatureAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertySignature__Group__2__Impl"


    // $ANTLR start "rule__PropertySignature__Group__3"
    // InternalTypescript.g:2276:1: rule__PropertySignature__Group__3 : rule__PropertySignature__Group__3__Impl ;
    public final void rule__PropertySignature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:2280:1: ( rule__PropertySignature__Group__3__Impl )
            // InternalTypescript.g:2281:2: rule__PropertySignature__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PropertySignature__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertySignature__Group__3"


    // $ANTLR start "rule__PropertySignature__Group__3__Impl"
    // InternalTypescript.g:2287:1: rule__PropertySignature__Group__3__Impl : ( ( rule__PropertySignature__TypeAssignment_3 ) ) ;
    public final void rule__PropertySignature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:2291:1: ( ( ( rule__PropertySignature__TypeAssignment_3 ) ) )
            // InternalTypescript.g:2292:1: ( ( rule__PropertySignature__TypeAssignment_3 ) )
            {
            // InternalTypescript.g:2292:1: ( ( rule__PropertySignature__TypeAssignment_3 ) )
            // InternalTypescript.g:2293:2: ( rule__PropertySignature__TypeAssignment_3 )
            {
             before(grammarAccess.getPropertySignatureAccess().getTypeAssignment_3()); 
            // InternalTypescript.g:2294:2: ( rule__PropertySignature__TypeAssignment_3 )
            // InternalTypescript.g:2294:3: rule__PropertySignature__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__PropertySignature__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPropertySignatureAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertySignature__Group__3__Impl"


    // $ANTLR start "rule__ArrayType__Group_0__0"
    // InternalTypescript.g:2303:1: rule__ArrayType__Group_0__0 : rule__ArrayType__Group_0__0__Impl rule__ArrayType__Group_0__1 ;
    public final void rule__ArrayType__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:2307:1: ( rule__ArrayType__Group_0__0__Impl rule__ArrayType__Group_0__1 )
            // InternalTypescript.g:2308:2: rule__ArrayType__Group_0__0__Impl rule__ArrayType__Group_0__1
            {
            pushFollow(FOLLOW_24);
            rule__ArrayType__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArrayType__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group_0__0"


    // $ANTLR start "rule__ArrayType__Group_0__0__Impl"
    // InternalTypescript.g:2315:1: rule__ArrayType__Group_0__0__Impl : ( () ) ;
    public final void rule__ArrayType__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:2319:1: ( ( () ) )
            // InternalTypescript.g:2320:1: ( () )
            {
            // InternalTypescript.g:2320:1: ( () )
            // InternalTypescript.g:2321:2: ()
            {
             before(grammarAccess.getArrayTypeAccess().getArrayTypeAction_0_0()); 
            // InternalTypescript.g:2322:2: ()
            // InternalTypescript.g:2322:3: 
            {
            }

             after(grammarAccess.getArrayTypeAccess().getArrayTypeAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group_0__0__Impl"


    // $ANTLR start "rule__ArrayType__Group_0__1"
    // InternalTypescript.g:2330:1: rule__ArrayType__Group_0__1 : rule__ArrayType__Group_0__1__Impl rule__ArrayType__Group_0__2 ;
    public final void rule__ArrayType__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:2334:1: ( rule__ArrayType__Group_0__1__Impl rule__ArrayType__Group_0__2 )
            // InternalTypescript.g:2335:2: rule__ArrayType__Group_0__1__Impl rule__ArrayType__Group_0__2
            {
            pushFollow(FOLLOW_25);
            rule__ArrayType__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArrayType__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group_0__1"


    // $ANTLR start "rule__ArrayType__Group_0__1__Impl"
    // InternalTypescript.g:2342:1: rule__ArrayType__Group_0__1__Impl : ( ( rule__ArrayType__ArrayAssignment_0_1 ) ) ;
    public final void rule__ArrayType__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:2346:1: ( ( ( rule__ArrayType__ArrayAssignment_0_1 ) ) )
            // InternalTypescript.g:2347:1: ( ( rule__ArrayType__ArrayAssignment_0_1 ) )
            {
            // InternalTypescript.g:2347:1: ( ( rule__ArrayType__ArrayAssignment_0_1 ) )
            // InternalTypescript.g:2348:2: ( rule__ArrayType__ArrayAssignment_0_1 )
            {
             before(grammarAccess.getArrayTypeAccess().getArrayAssignment_0_1()); 
            // InternalTypescript.g:2349:2: ( rule__ArrayType__ArrayAssignment_0_1 )
            // InternalTypescript.g:2349:3: rule__ArrayType__ArrayAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__ArrayType__ArrayAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getArrayTypeAccess().getArrayAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group_0__1__Impl"


    // $ANTLR start "rule__ArrayType__Group_0__2"
    // InternalTypescript.g:2357:1: rule__ArrayType__Group_0__2 : rule__ArrayType__Group_0__2__Impl rule__ArrayType__Group_0__3 ;
    public final void rule__ArrayType__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:2361:1: ( rule__ArrayType__Group_0__2__Impl rule__ArrayType__Group_0__3 )
            // InternalTypescript.g:2362:2: rule__ArrayType__Group_0__2__Impl rule__ArrayType__Group_0__3
            {
            pushFollow(FOLLOW_26);
            rule__ArrayType__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArrayType__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group_0__2"


    // $ANTLR start "rule__ArrayType__Group_0__2__Impl"
    // InternalTypescript.g:2369:1: rule__ArrayType__Group_0__2__Impl : ( '[' ) ;
    public final void rule__ArrayType__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:2373:1: ( ( '[' ) )
            // InternalTypescript.g:2374:1: ( '[' )
            {
            // InternalTypescript.g:2374:1: ( '[' )
            // InternalTypescript.g:2375:2: '['
            {
             before(grammarAccess.getArrayTypeAccess().getLeftSquareBracketKeyword_0_2()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getArrayTypeAccess().getLeftSquareBracketKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group_0__2__Impl"


    // $ANTLR start "rule__ArrayType__Group_0__3"
    // InternalTypescript.g:2384:1: rule__ArrayType__Group_0__3 : rule__ArrayType__Group_0__3__Impl ;
    public final void rule__ArrayType__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:2388:1: ( rule__ArrayType__Group_0__3__Impl )
            // InternalTypescript.g:2389:2: rule__ArrayType__Group_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArrayType__Group_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group_0__3"


    // $ANTLR start "rule__ArrayType__Group_0__3__Impl"
    // InternalTypescript.g:2395:1: rule__ArrayType__Group_0__3__Impl : ( ']' ) ;
    public final void rule__ArrayType__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:2399:1: ( ( ']' ) )
            // InternalTypescript.g:2400:1: ( ']' )
            {
            // InternalTypescript.g:2400:1: ( ']' )
            // InternalTypescript.g:2401:2: ']'
            {
             before(grammarAccess.getArrayTypeAccess().getRightSquareBracketKeyword_0_3()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getArrayTypeAccess().getRightSquareBracketKeyword_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group_0__3__Impl"


    // $ANTLR start "rule__ArrayType__Group_1__0"
    // InternalTypescript.g:2411:1: rule__ArrayType__Group_1__0 : rule__ArrayType__Group_1__0__Impl rule__ArrayType__Group_1__1 ;
    public final void rule__ArrayType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:2415:1: ( rule__ArrayType__Group_1__0__Impl rule__ArrayType__Group_1__1 )
            // InternalTypescript.g:2416:2: rule__ArrayType__Group_1__0__Impl rule__ArrayType__Group_1__1
            {
            pushFollow(FOLLOW_25);
            rule__ArrayType__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArrayType__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group_1__0"


    // $ANTLR start "rule__ArrayType__Group_1__0__Impl"
    // InternalTypescript.g:2423:1: rule__ArrayType__Group_1__0__Impl : ( ruleTypeReference ) ;
    public final void rule__ArrayType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:2427:1: ( ( ruleTypeReference ) )
            // InternalTypescript.g:2428:1: ( ruleTypeReference )
            {
            // InternalTypescript.g:2428:1: ( ruleTypeReference )
            // InternalTypescript.g:2429:2: ruleTypeReference
            {
             before(grammarAccess.getArrayTypeAccess().getTypeReferenceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeReference();

            state._fsp--;

             after(grammarAccess.getArrayTypeAccess().getTypeReferenceParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group_1__0__Impl"


    // $ANTLR start "rule__ArrayType__Group_1__1"
    // InternalTypescript.g:2438:1: rule__ArrayType__Group_1__1 : rule__ArrayType__Group_1__1__Impl rule__ArrayType__Group_1__2 ;
    public final void rule__ArrayType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:2442:1: ( rule__ArrayType__Group_1__1__Impl rule__ArrayType__Group_1__2 )
            // InternalTypescript.g:2443:2: rule__ArrayType__Group_1__1__Impl rule__ArrayType__Group_1__2
            {
            pushFollow(FOLLOW_26);
            rule__ArrayType__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArrayType__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group_1__1"


    // $ANTLR start "rule__ArrayType__Group_1__1__Impl"
    // InternalTypescript.g:2450:1: rule__ArrayType__Group_1__1__Impl : ( '[' ) ;
    public final void rule__ArrayType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:2454:1: ( ( '[' ) )
            // InternalTypescript.g:2455:1: ( '[' )
            {
            // InternalTypescript.g:2455:1: ( '[' )
            // InternalTypescript.g:2456:2: '['
            {
             before(grammarAccess.getArrayTypeAccess().getLeftSquareBracketKeyword_1_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getArrayTypeAccess().getLeftSquareBracketKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group_1__1__Impl"


    // $ANTLR start "rule__ArrayType__Group_1__2"
    // InternalTypescript.g:2465:1: rule__ArrayType__Group_1__2 : rule__ArrayType__Group_1__2__Impl ;
    public final void rule__ArrayType__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:2469:1: ( rule__ArrayType__Group_1__2__Impl )
            // InternalTypescript.g:2470:2: rule__ArrayType__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArrayType__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group_1__2"


    // $ANTLR start "rule__ArrayType__Group_1__2__Impl"
    // InternalTypescript.g:2476:1: rule__ArrayType__Group_1__2__Impl : ( ']' ) ;
    public final void rule__ArrayType__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:2480:1: ( ( ']' ) )
            // InternalTypescript.g:2481:1: ( ']' )
            {
            // InternalTypescript.g:2481:1: ( ']' )
            // InternalTypescript.g:2482:2: ']'
            {
             before(grammarAccess.getArrayTypeAccess().getRightSquareBracketKeyword_1_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getArrayTypeAccess().getRightSquareBracketKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group_1__2__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalTypescript.g:2492:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:2496:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalTypescript.g:2497:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalTypescript.g:2504:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:2508:1: ( ( RULE_ID ) )
            // InternalTypescript.g:2509:1: ( RULE_ID )
            {
            // InternalTypescript.g:2509:1: ( RULE_ID )
            // InternalTypescript.g:2510:2: RULE_ID
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
    // InternalTypescript.g:2519:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:2523:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalTypescript.g:2524:2: rule__QualifiedName__Group__1__Impl
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
    // InternalTypescript.g:2530:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:2534:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalTypescript.g:2535:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalTypescript.g:2535:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalTypescript.g:2536:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalTypescript.g:2537:2: ( rule__QualifiedName__Group_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==24) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalTypescript.g:2537:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalTypescript.g:2546:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:2550:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalTypescript.g:2551:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalTypescript.g:2558:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:2562:1: ( ( '.' ) )
            // InternalTypescript.g:2563:1: ( '.' )
            {
            // InternalTypescript.g:2563:1: ( '.' )
            // InternalTypescript.g:2564:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalTypescript.g:2573:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:2577:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalTypescript.g:2578:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalTypescript.g:2584:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:2588:1: ( ( RULE_ID ) )
            // InternalTypescript.g:2589:1: ( RULE_ID )
            {
            // InternalTypescript.g:2589:1: ( RULE_ID )
            // InternalTypescript.g:2590:2: RULE_ID
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


    // $ANTLR start "rule__DocComment__Group__0"
    // InternalTypescript.g:2600:1: rule__DocComment__Group__0 : rule__DocComment__Group__0__Impl rule__DocComment__Group__1 ;
    public final void rule__DocComment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:2604:1: ( rule__DocComment__Group__0__Impl rule__DocComment__Group__1 )
            // InternalTypescript.g:2605:2: rule__DocComment__Group__0__Impl rule__DocComment__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__DocComment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DocComment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocComment__Group__0"


    // $ANTLR start "rule__DocComment__Group__0__Impl"
    // InternalTypescript.g:2612:1: rule__DocComment__Group__0__Impl : ( () ) ;
    public final void rule__DocComment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:2616:1: ( ( () ) )
            // InternalTypescript.g:2617:1: ( () )
            {
            // InternalTypescript.g:2617:1: ( () )
            // InternalTypescript.g:2618:2: ()
            {
             before(grammarAccess.getDocCommentAccess().getDocCommentAction_0()); 
            // InternalTypescript.g:2619:2: ()
            // InternalTypescript.g:2619:3: 
            {
            }

             after(grammarAccess.getDocCommentAccess().getDocCommentAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocComment__Group__0__Impl"


    // $ANTLR start "rule__DocComment__Group__1"
    // InternalTypescript.g:2627:1: rule__DocComment__Group__1 : rule__DocComment__Group__1__Impl rule__DocComment__Group__2 ;
    public final void rule__DocComment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:2631:1: ( rule__DocComment__Group__1__Impl rule__DocComment__Group__2 )
            // InternalTypescript.g:2632:2: rule__DocComment__Group__1__Impl rule__DocComment__Group__2
            {
            pushFollow(FOLLOW_29);
            rule__DocComment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DocComment__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocComment__Group__1"


    // $ANTLR start "rule__DocComment__Group__1__Impl"
    // InternalTypescript.g:2639:1: rule__DocComment__Group__1__Impl : ( '/**' ) ;
    public final void rule__DocComment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:2643:1: ( ( '/**' ) )
            // InternalTypescript.g:2644:1: ( '/**' )
            {
            // InternalTypescript.g:2644:1: ( '/**' )
            // InternalTypescript.g:2645:2: '/**'
            {
             before(grammarAccess.getDocCommentAccess().getSolidusAsteriskAsteriskKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getDocCommentAccess().getSolidusAsteriskAsteriskKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocComment__Group__1__Impl"


    // $ANTLR start "rule__DocComment__Group__2"
    // InternalTypescript.g:2654:1: rule__DocComment__Group__2 : rule__DocComment__Group__2__Impl rule__DocComment__Group__3 ;
    public final void rule__DocComment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:2658:1: ( rule__DocComment__Group__2__Impl rule__DocComment__Group__3 )
            // InternalTypescript.g:2659:2: rule__DocComment__Group__2__Impl rule__DocComment__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__DocComment__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DocComment__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocComment__Group__2"


    // $ANTLR start "rule__DocComment__Group__2__Impl"
    // InternalTypescript.g:2666:1: rule__DocComment__Group__2__Impl : ( ( rule__DocComment__LinesAssignment_2 )* ) ;
    public final void rule__DocComment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:2670:1: ( ( ( rule__DocComment__LinesAssignment_2 )* ) )
            // InternalTypescript.g:2671:1: ( ( rule__DocComment__LinesAssignment_2 )* )
            {
            // InternalTypescript.g:2671:1: ( ( rule__DocComment__LinesAssignment_2 )* )
            // InternalTypescript.g:2672:2: ( rule__DocComment__LinesAssignment_2 )*
            {
             before(grammarAccess.getDocCommentAccess().getLinesAssignment_2()); 
            // InternalTypescript.g:2673:2: ( rule__DocComment__LinesAssignment_2 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_DOC_COMMENT_LINE) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalTypescript.g:2673:3: rule__DocComment__LinesAssignment_2
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__DocComment__LinesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getDocCommentAccess().getLinesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocComment__Group__2__Impl"


    // $ANTLR start "rule__DocComment__Group__3"
    // InternalTypescript.g:2681:1: rule__DocComment__Group__3 : rule__DocComment__Group__3__Impl rule__DocComment__Group__4 ;
    public final void rule__DocComment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:2685:1: ( rule__DocComment__Group__3__Impl rule__DocComment__Group__4 )
            // InternalTypescript.g:2686:2: rule__DocComment__Group__3__Impl rule__DocComment__Group__4
            {
            pushFollow(FOLLOW_29);
            rule__DocComment__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DocComment__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocComment__Group__3"


    // $ANTLR start "rule__DocComment__Group__3__Impl"
    // InternalTypescript.g:2693:1: rule__DocComment__Group__3__Impl : ( ( rule__DocComment__AnnotationsAssignment_3 )* ) ;
    public final void rule__DocComment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:2697:1: ( ( ( rule__DocComment__AnnotationsAssignment_3 )* ) )
            // InternalTypescript.g:2698:1: ( ( rule__DocComment__AnnotationsAssignment_3 )* )
            {
            // InternalTypescript.g:2698:1: ( ( rule__DocComment__AnnotationsAssignment_3 )* )
            // InternalTypescript.g:2699:2: ( rule__DocComment__AnnotationsAssignment_3 )*
            {
             before(grammarAccess.getDocCommentAccess().getAnnotationsAssignment_3()); 
            // InternalTypescript.g:2700:2: ( rule__DocComment__AnnotationsAssignment_3 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_DOC_ANNOTATION_PREFIX) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalTypescript.g:2700:3: rule__DocComment__AnnotationsAssignment_3
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__DocComment__AnnotationsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getDocCommentAccess().getAnnotationsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocComment__Group__3__Impl"


    // $ANTLR start "rule__DocComment__Group__4"
    // InternalTypescript.g:2708:1: rule__DocComment__Group__4 : rule__DocComment__Group__4__Impl ;
    public final void rule__DocComment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:2712:1: ( rule__DocComment__Group__4__Impl )
            // InternalTypescript.g:2713:2: rule__DocComment__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DocComment__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocComment__Group__4"


    // $ANTLR start "rule__DocComment__Group__4__Impl"
    // InternalTypescript.g:2719:1: rule__DocComment__Group__4__Impl : ( RULE_DOC_COMMENT_END ) ;
    public final void rule__DocComment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:2723:1: ( ( RULE_DOC_COMMENT_END ) )
            // InternalTypescript.g:2724:1: ( RULE_DOC_COMMENT_END )
            {
            // InternalTypescript.g:2724:1: ( RULE_DOC_COMMENT_END )
            // InternalTypescript.g:2725:2: RULE_DOC_COMMENT_END
            {
             before(grammarAccess.getDocCommentAccess().getDOC_COMMENT_ENDTerminalRuleCall_4()); 
            match(input,RULE_DOC_COMMENT_END,FOLLOW_2); 
             after(grammarAccess.getDocCommentAccess().getDOC_COMMENT_ENDTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocComment__Group__4__Impl"


    // $ANTLR start "rule__AnnotationLine__Group__0"
    // InternalTypescript.g:2735:1: rule__AnnotationLine__Group__0 : rule__AnnotationLine__Group__0__Impl rule__AnnotationLine__Group__1 ;
    public final void rule__AnnotationLine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:2739:1: ( rule__AnnotationLine__Group__0__Impl rule__AnnotationLine__Group__1 )
            // InternalTypescript.g:2740:2: rule__AnnotationLine__Group__0__Impl rule__AnnotationLine__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__AnnotationLine__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AnnotationLine__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationLine__Group__0"


    // $ANTLR start "rule__AnnotationLine__Group__0__Impl"
    // InternalTypescript.g:2747:1: rule__AnnotationLine__Group__0__Impl : ( RULE_DOC_ANNOTATION_PREFIX ) ;
    public final void rule__AnnotationLine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:2751:1: ( ( RULE_DOC_ANNOTATION_PREFIX ) )
            // InternalTypescript.g:2752:1: ( RULE_DOC_ANNOTATION_PREFIX )
            {
            // InternalTypescript.g:2752:1: ( RULE_DOC_ANNOTATION_PREFIX )
            // InternalTypescript.g:2753:2: RULE_DOC_ANNOTATION_PREFIX
            {
             before(grammarAccess.getAnnotationLineAccess().getDOC_ANNOTATION_PREFIXTerminalRuleCall_0()); 
            match(input,RULE_DOC_ANNOTATION_PREFIX,FOLLOW_2); 
             after(grammarAccess.getAnnotationLineAccess().getDOC_ANNOTATION_PREFIXTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationLine__Group__0__Impl"


    // $ANTLR start "rule__AnnotationLine__Group__1"
    // InternalTypescript.g:2762:1: rule__AnnotationLine__Group__1 : rule__AnnotationLine__Group__1__Impl ;
    public final void rule__AnnotationLine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:2766:1: ( rule__AnnotationLine__Group__1__Impl )
            // InternalTypescript.g:2767:2: rule__AnnotationLine__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AnnotationLine__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationLine__Group__1"


    // $ANTLR start "rule__AnnotationLine__Group__1__Impl"
    // InternalTypescript.g:2773:1: rule__AnnotationLine__Group__1__Impl : ( ( rule__AnnotationLine__AnnotationNameAssignment_1 ) ) ;
    public final void rule__AnnotationLine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:2777:1: ( ( ( rule__AnnotationLine__AnnotationNameAssignment_1 ) ) )
            // InternalTypescript.g:2778:1: ( ( rule__AnnotationLine__AnnotationNameAssignment_1 ) )
            {
            // InternalTypescript.g:2778:1: ( ( rule__AnnotationLine__AnnotationNameAssignment_1 ) )
            // InternalTypescript.g:2779:2: ( rule__AnnotationLine__AnnotationNameAssignment_1 )
            {
             before(grammarAccess.getAnnotationLineAccess().getAnnotationNameAssignment_1()); 
            // InternalTypescript.g:2780:2: ( rule__AnnotationLine__AnnotationNameAssignment_1 )
            // InternalTypescript.g:2780:3: rule__AnnotationLine__AnnotationNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AnnotationLine__AnnotationNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationLineAccess().getAnnotationNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationLine__Group__1__Impl"


    // $ANTLR start "rule__IndexSignature__Group__0"
    // InternalTypescript.g:2789:1: rule__IndexSignature__Group__0 : rule__IndexSignature__Group__0__Impl rule__IndexSignature__Group__1 ;
    public final void rule__IndexSignature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:2793:1: ( rule__IndexSignature__Group__0__Impl rule__IndexSignature__Group__1 )
            // InternalTypescript.g:2794:2: rule__IndexSignature__Group__0__Impl rule__IndexSignature__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__IndexSignature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IndexSignature__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexSignature__Group__0"


    // $ANTLR start "rule__IndexSignature__Group__0__Impl"
    // InternalTypescript.g:2801:1: rule__IndexSignature__Group__0__Impl : ( '[' ) ;
    public final void rule__IndexSignature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:2805:1: ( ( '[' ) )
            // InternalTypescript.g:2806:1: ( '[' )
            {
            // InternalTypescript.g:2806:1: ( '[' )
            // InternalTypescript.g:2807:2: '['
            {
             before(grammarAccess.getIndexSignatureAccess().getLeftSquareBracketKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getIndexSignatureAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexSignature__Group__0__Impl"


    // $ANTLR start "rule__IndexSignature__Group__1"
    // InternalTypescript.g:2816:1: rule__IndexSignature__Group__1 : rule__IndexSignature__Group__1__Impl rule__IndexSignature__Group__2 ;
    public final void rule__IndexSignature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:2820:1: ( rule__IndexSignature__Group__1__Impl rule__IndexSignature__Group__2 )
            // InternalTypescript.g:2821:2: rule__IndexSignature__Group__1__Impl rule__IndexSignature__Group__2
            {
            pushFollow(FOLLOW_32);
            rule__IndexSignature__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IndexSignature__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexSignature__Group__1"


    // $ANTLR start "rule__IndexSignature__Group__1__Impl"
    // InternalTypescript.g:2828:1: rule__IndexSignature__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__IndexSignature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:2832:1: ( ( RULE_ID ) )
            // InternalTypescript.g:2833:1: ( RULE_ID )
            {
            // InternalTypescript.g:2833:1: ( RULE_ID )
            // InternalTypescript.g:2834:2: RULE_ID
            {
             before(grammarAccess.getIndexSignatureAccess().getIDTerminalRuleCall_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIndexSignatureAccess().getIDTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexSignature__Group__1__Impl"


    // $ANTLR start "rule__IndexSignature__Group__2"
    // InternalTypescript.g:2843:1: rule__IndexSignature__Group__2 : rule__IndexSignature__Group__2__Impl rule__IndexSignature__Group__3 ;
    public final void rule__IndexSignature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:2847:1: ( rule__IndexSignature__Group__2__Impl rule__IndexSignature__Group__3 )
            // InternalTypescript.g:2848:2: rule__IndexSignature__Group__2__Impl rule__IndexSignature__Group__3
            {
            pushFollow(FOLLOW_33);
            rule__IndexSignature__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IndexSignature__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexSignature__Group__2"


    // $ANTLR start "rule__IndexSignature__Group__2__Impl"
    // InternalTypescript.g:2855:1: rule__IndexSignature__Group__2__Impl : ( ':' ) ;
    public final void rule__IndexSignature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:2859:1: ( ( ':' ) )
            // InternalTypescript.g:2860:1: ( ':' )
            {
            // InternalTypescript.g:2860:1: ( ':' )
            // InternalTypescript.g:2861:2: ':'
            {
             before(grammarAccess.getIndexSignatureAccess().getColonKeyword_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getIndexSignatureAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexSignature__Group__2__Impl"


    // $ANTLR start "rule__IndexSignature__Group__3"
    // InternalTypescript.g:2870:1: rule__IndexSignature__Group__3 : rule__IndexSignature__Group__3__Impl rule__IndexSignature__Group__4 ;
    public final void rule__IndexSignature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:2874:1: ( rule__IndexSignature__Group__3__Impl rule__IndexSignature__Group__4 )
            // InternalTypescript.g:2875:2: rule__IndexSignature__Group__3__Impl rule__IndexSignature__Group__4
            {
            pushFollow(FOLLOW_26);
            rule__IndexSignature__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IndexSignature__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexSignature__Group__3"


    // $ANTLR start "rule__IndexSignature__Group__3__Impl"
    // InternalTypescript.g:2882:1: rule__IndexSignature__Group__3__Impl : ( ( rule__IndexSignature__IndexTypeAssignment_3 ) ) ;
    public final void rule__IndexSignature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:2886:1: ( ( ( rule__IndexSignature__IndexTypeAssignment_3 ) ) )
            // InternalTypescript.g:2887:1: ( ( rule__IndexSignature__IndexTypeAssignment_3 ) )
            {
            // InternalTypescript.g:2887:1: ( ( rule__IndexSignature__IndexTypeAssignment_3 ) )
            // InternalTypescript.g:2888:2: ( rule__IndexSignature__IndexTypeAssignment_3 )
            {
             before(grammarAccess.getIndexSignatureAccess().getIndexTypeAssignment_3()); 
            // InternalTypescript.g:2889:2: ( rule__IndexSignature__IndexTypeAssignment_3 )
            // InternalTypescript.g:2889:3: rule__IndexSignature__IndexTypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__IndexSignature__IndexTypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getIndexSignatureAccess().getIndexTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexSignature__Group__3__Impl"


    // $ANTLR start "rule__IndexSignature__Group__4"
    // InternalTypescript.g:2897:1: rule__IndexSignature__Group__4 : rule__IndexSignature__Group__4__Impl rule__IndexSignature__Group__5 ;
    public final void rule__IndexSignature__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:2901:1: ( rule__IndexSignature__Group__4__Impl rule__IndexSignature__Group__5 )
            // InternalTypescript.g:2902:2: rule__IndexSignature__Group__4__Impl rule__IndexSignature__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__IndexSignature__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IndexSignature__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexSignature__Group__4"


    // $ANTLR start "rule__IndexSignature__Group__4__Impl"
    // InternalTypescript.g:2909:1: rule__IndexSignature__Group__4__Impl : ( ']' ) ;
    public final void rule__IndexSignature__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:2913:1: ( ( ']' ) )
            // InternalTypescript.g:2914:1: ( ']' )
            {
            // InternalTypescript.g:2914:1: ( ']' )
            // InternalTypescript.g:2915:2: ']'
            {
             before(grammarAccess.getIndexSignatureAccess().getRightSquareBracketKeyword_4()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getIndexSignatureAccess().getRightSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexSignature__Group__4__Impl"


    // $ANTLR start "rule__IndexSignature__Group__5"
    // InternalTypescript.g:2924:1: rule__IndexSignature__Group__5 : rule__IndexSignature__Group__5__Impl ;
    public final void rule__IndexSignature__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:2928:1: ( rule__IndexSignature__Group__5__Impl )
            // InternalTypescript.g:2929:2: rule__IndexSignature__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IndexSignature__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexSignature__Group__5"


    // $ANTLR start "rule__IndexSignature__Group__5__Impl"
    // InternalTypescript.g:2935:1: rule__IndexSignature__Group__5__Impl : ( ( rule__IndexSignature__ValueTypeAssignment_5 ) ) ;
    public final void rule__IndexSignature__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:2939:1: ( ( ( rule__IndexSignature__ValueTypeAssignment_5 ) ) )
            // InternalTypescript.g:2940:1: ( ( rule__IndexSignature__ValueTypeAssignment_5 ) )
            {
            // InternalTypescript.g:2940:1: ( ( rule__IndexSignature__ValueTypeAssignment_5 ) )
            // InternalTypescript.g:2941:2: ( rule__IndexSignature__ValueTypeAssignment_5 )
            {
             before(grammarAccess.getIndexSignatureAccess().getValueTypeAssignment_5()); 
            // InternalTypescript.g:2942:2: ( rule__IndexSignature__ValueTypeAssignment_5 )
            // InternalTypescript.g:2942:3: rule__IndexSignature__ValueTypeAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__IndexSignature__ValueTypeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getIndexSignatureAccess().getValueTypeAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexSignature__Group__5__Impl"


    // $ANTLR start "rule__Typescript__ImportsAssignment_0"
    // InternalTypescript.g:2951:1: rule__Typescript__ImportsAssignment_0 : ( ruleImportDeclaration ) ;
    public final void rule__Typescript__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:2955:1: ( ( ruleImportDeclaration ) )
            // InternalTypescript.g:2956:2: ( ruleImportDeclaration )
            {
            // InternalTypescript.g:2956:2: ( ruleImportDeclaration )
            // InternalTypescript.g:2957:3: ruleImportDeclaration
            {
             before(grammarAccess.getTypescriptAccess().getImportsImportDeclarationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleImportDeclaration();

            state._fsp--;

             after(grammarAccess.getTypescriptAccess().getImportsImportDeclarationParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Typescript__ImportsAssignment_0"


    // $ANTLR start "rule__Typescript__InterfacesAndClassesAssignment_1"
    // InternalTypescript.g:2966:1: rule__Typescript__InterfacesAndClassesAssignment_1 : ( ruleInterfacesAndClasses ) ;
    public final void rule__Typescript__InterfacesAndClassesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:2970:1: ( ( ruleInterfacesAndClasses ) )
            // InternalTypescript.g:2971:2: ( ruleInterfacesAndClasses )
            {
            // InternalTypescript.g:2971:2: ( ruleInterfacesAndClasses )
            // InternalTypescript.g:2972:3: ruleInterfacesAndClasses
            {
             before(grammarAccess.getTypescriptAccess().getInterfacesAndClassesInterfacesAndClassesParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInterfacesAndClasses();

            state._fsp--;

             after(grammarAccess.getTypescriptAccess().getInterfacesAndClassesInterfacesAndClassesParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Typescript__InterfacesAndClassesAssignment_1"


    // $ANTLR start "rule__InterfacesAndClasses__ModulesAssignment_1_0"
    // InternalTypescript.g:2981:1: rule__InterfacesAndClasses__ModulesAssignment_1_0 : ( ruleModuleDeclaration ) ;
    public final void rule__InterfacesAndClasses__ModulesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:2985:1: ( ( ruleModuleDeclaration ) )
            // InternalTypescript.g:2986:2: ( ruleModuleDeclaration )
            {
            // InternalTypescript.g:2986:2: ( ruleModuleDeclaration )
            // InternalTypescript.g:2987:3: ruleModuleDeclaration
            {
             before(grammarAccess.getInterfacesAndClassesAccess().getModulesModuleDeclarationParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleModuleDeclaration();

            state._fsp--;

             after(grammarAccess.getInterfacesAndClassesAccess().getModulesModuleDeclarationParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfacesAndClasses__ModulesAssignment_1_0"


    // $ANTLR start "rule__InterfacesAndClasses__TypesAssignment_1_1"
    // InternalTypescript.g:2996:1: rule__InterfacesAndClasses__TypesAssignment_1_1 : ( ruleDeclaration ) ;
    public final void rule__InterfacesAndClasses__TypesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:3000:1: ( ( ruleDeclaration ) )
            // InternalTypescript.g:3001:2: ( ruleDeclaration )
            {
            // InternalTypescript.g:3001:2: ( ruleDeclaration )
            // InternalTypescript.g:3002:3: ruleDeclaration
            {
             before(grammarAccess.getInterfacesAndClassesAccess().getTypesDeclarationParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDeclaration();

            state._fsp--;

             after(grammarAccess.getInterfacesAndClassesAccess().getTypesDeclarationParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfacesAndClasses__TypesAssignment_1_1"


    // $ANTLR start "rule__ImportDeclaration__AliasAssignment_1"
    // InternalTypescript.g:3011:1: rule__ImportDeclaration__AliasAssignment_1 : ( ruleIdentifier ) ;
    public final void rule__ImportDeclaration__AliasAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:3015:1: ( ( ruleIdentifier ) )
            // InternalTypescript.g:3016:2: ( ruleIdentifier )
            {
            // InternalTypescript.g:3016:2: ( ruleIdentifier )
            // InternalTypescript.g:3017:3: ruleIdentifier
            {
             before(grammarAccess.getImportDeclarationAccess().getAliasIdentifierParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleIdentifier();

            state._fsp--;

             after(grammarAccess.getImportDeclarationAccess().getAliasIdentifierParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportDeclaration__AliasAssignment_1"


    // $ANTLR start "rule__ImportDeclaration__NameAssignment_3"
    // InternalTypescript.g:3026:1: rule__ImportDeclaration__NameAssignment_3 : ( ruleQualifiedName ) ;
    public final void rule__ImportDeclaration__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:3030:1: ( ( ruleQualifiedName ) )
            // InternalTypescript.g:3031:2: ( ruleQualifiedName )
            {
            // InternalTypescript.g:3031:2: ( ruleQualifiedName )
            // InternalTypescript.g:3032:3: ruleQualifiedName
            {
             before(grammarAccess.getImportDeclarationAccess().getNameQualifiedNameParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getImportDeclarationAccess().getNameQualifiedNameParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportDeclaration__NameAssignment_3"


    // $ANTLR start "rule__ModuleDeclaration__DocCommentAssignment_0"
    // InternalTypescript.g:3041:1: rule__ModuleDeclaration__DocCommentAssignment_0 : ( ruleDocComment ) ;
    public final void rule__ModuleDeclaration__DocCommentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:3045:1: ( ( ruleDocComment ) )
            // InternalTypescript.g:3046:2: ( ruleDocComment )
            {
            // InternalTypescript.g:3046:2: ( ruleDocComment )
            // InternalTypescript.g:3047:3: ruleDocComment
            {
             before(grammarAccess.getModuleDeclarationAccess().getDocCommentDocCommentParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDocComment();

            state._fsp--;

             after(grammarAccess.getModuleDeclarationAccess().getDocCommentDocCommentParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleDeclaration__DocCommentAssignment_0"


    // $ANTLR start "rule__ModuleDeclaration__NameAssignment_2"
    // InternalTypescript.g:3056:1: rule__ModuleDeclaration__NameAssignment_2 : ( ruleIdentifier ) ;
    public final void rule__ModuleDeclaration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:3060:1: ( ( ruleIdentifier ) )
            // InternalTypescript.g:3061:2: ( ruleIdentifier )
            {
            // InternalTypescript.g:3061:2: ( ruleIdentifier )
            // InternalTypescript.g:3062:3: ruleIdentifier
            {
             before(grammarAccess.getModuleDeclarationAccess().getNameIdentifierParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleIdentifier();

            state._fsp--;

             after(grammarAccess.getModuleDeclarationAccess().getNameIdentifierParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleDeclaration__NameAssignment_2"


    // $ANTLR start "rule__ModuleDeclaration__BodyAssignment_5"
    // InternalTypescript.g:3071:1: rule__ModuleDeclaration__BodyAssignment_5 : ( ruleModuleBody ) ;
    public final void rule__ModuleDeclaration__BodyAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:3075:1: ( ( ruleModuleBody ) )
            // InternalTypescript.g:3076:2: ( ruleModuleBody )
            {
            // InternalTypescript.g:3076:2: ( ruleModuleBody )
            // InternalTypescript.g:3077:3: ruleModuleBody
            {
             before(grammarAccess.getModuleDeclarationAccess().getBodyModuleBodyParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleModuleBody();

            state._fsp--;

             after(grammarAccess.getModuleDeclarationAccess().getBodyModuleBodyParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleDeclaration__BodyAssignment_5"


    // $ANTLR start "rule__ModuleBody__ElementsAssignment_1"
    // InternalTypescript.g:3086:1: rule__ModuleBody__ElementsAssignment_1 : ( ruleModuleElement ) ;
    public final void rule__ModuleBody__ElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:3090:1: ( ( ruleModuleElement ) )
            // InternalTypescript.g:3091:2: ( ruleModuleElement )
            {
            // InternalTypescript.g:3091:2: ( ruleModuleElement )
            // InternalTypescript.g:3092:3: ruleModuleElement
            {
             before(grammarAccess.getModuleBodyAccess().getElementsModuleElementParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleModuleElement();

            state._fsp--;

             after(grammarAccess.getModuleBodyAccess().getElementsModuleElementParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleBody__ElementsAssignment_1"


    // $ANTLR start "rule__ModuleElement__ExportedAssignment_0"
    // InternalTypescript.g:3101:1: rule__ModuleElement__ExportedAssignment_0 : ( ( 'export' ) ) ;
    public final void rule__ModuleElement__ExportedAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:3105:1: ( ( ( 'export' ) ) )
            // InternalTypescript.g:3106:2: ( ( 'export' ) )
            {
            // InternalTypescript.g:3106:2: ( ( 'export' ) )
            // InternalTypescript.g:3107:3: ( 'export' )
            {
             before(grammarAccess.getModuleElementAccess().getExportedExportKeyword_0_0()); 
            // InternalTypescript.g:3108:3: ( 'export' )
            // InternalTypescript.g:3109:4: 'export'
            {
             before(grammarAccess.getModuleElementAccess().getExportedExportKeyword_0_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getModuleElementAccess().getExportedExportKeyword_0_0()); 

            }

             after(grammarAccess.getModuleElementAccess().getExportedExportKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleElement__ExportedAssignment_0"


    // $ANTLR start "rule__ModuleElement__ModuleContentAssignment_1"
    // InternalTypescript.g:3120:1: rule__ModuleElement__ModuleContentAssignment_1 : ( ( rule__ModuleElement__ModuleContentAlternatives_1_0 ) ) ;
    public final void rule__ModuleElement__ModuleContentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:3124:1: ( ( ( rule__ModuleElement__ModuleContentAlternatives_1_0 ) ) )
            // InternalTypescript.g:3125:2: ( ( rule__ModuleElement__ModuleContentAlternatives_1_0 ) )
            {
            // InternalTypescript.g:3125:2: ( ( rule__ModuleElement__ModuleContentAlternatives_1_0 ) )
            // InternalTypescript.g:3126:3: ( rule__ModuleElement__ModuleContentAlternatives_1_0 )
            {
             before(grammarAccess.getModuleElementAccess().getModuleContentAlternatives_1_0()); 
            // InternalTypescript.g:3127:3: ( rule__ModuleElement__ModuleContentAlternatives_1_0 )
            // InternalTypescript.g:3127:4: rule__ModuleElement__ModuleContentAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ModuleElement__ModuleContentAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getModuleElementAccess().getModuleContentAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleElement__ModuleContentAssignment_1"


    // $ANTLR start "rule__Declaration__DocCommentAssignment_0"
    // InternalTypescript.g:3135:1: rule__Declaration__DocCommentAssignment_0 : ( ruleDocComment ) ;
    public final void rule__Declaration__DocCommentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:3139:1: ( ( ruleDocComment ) )
            // InternalTypescript.g:3140:2: ( ruleDocComment )
            {
            // InternalTypescript.g:3140:2: ( ruleDocComment )
            // InternalTypescript.g:3141:3: ruleDocComment
            {
             before(grammarAccess.getDeclarationAccess().getDocCommentDocCommentParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDocComment();

            state._fsp--;

             after(grammarAccess.getDeclarationAccess().getDocCommentDocCommentParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__DocCommentAssignment_0"


    // $ANTLR start "rule__Declaration__DeclarationAssignment_1"
    // InternalTypescript.g:3150:1: rule__Declaration__DeclarationAssignment_1 : ( ruleInterfaceOrClassDeclaration ) ;
    public final void rule__Declaration__DeclarationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:3154:1: ( ( ruleInterfaceOrClassDeclaration ) )
            // InternalTypescript.g:3155:2: ( ruleInterfaceOrClassDeclaration )
            {
            // InternalTypescript.g:3155:2: ( ruleInterfaceOrClassDeclaration )
            // InternalTypescript.g:3156:3: ruleInterfaceOrClassDeclaration
            {
             before(grammarAccess.getDeclarationAccess().getDeclarationInterfaceOrClassDeclarationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInterfaceOrClassDeclaration();

            state._fsp--;

             after(grammarAccess.getDeclarationAccess().getDeclarationInterfaceOrClassDeclarationParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__DeclarationAssignment_1"


    // $ANTLR start "rule__InterfaceOrClassDeclaration__ObjectTypeAssignment_1"
    // InternalTypescript.g:3165:1: rule__InterfaceOrClassDeclaration__ObjectTypeAssignment_1 : ( ruleObjectType ) ;
    public final void rule__InterfaceOrClassDeclaration__ObjectTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:3169:1: ( ( ruleObjectType ) )
            // InternalTypescript.g:3170:2: ( ruleObjectType )
            {
            // InternalTypescript.g:3170:2: ( ruleObjectType )
            // InternalTypescript.g:3171:3: ruleObjectType
            {
             before(grammarAccess.getInterfaceOrClassDeclarationAccess().getObjectTypeObjectTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleObjectType();

            state._fsp--;

             after(grammarAccess.getInterfaceOrClassDeclarationAccess().getObjectTypeObjectTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceOrClassDeclaration__ObjectTypeAssignment_1"


    // $ANTLR start "rule__InterfaceDeclaration__NameAssignment_1"
    // InternalTypescript.g:3180:1: rule__InterfaceDeclaration__NameAssignment_1 : ( ruleIdentifier ) ;
    public final void rule__InterfaceDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:3184:1: ( ( ruleIdentifier ) )
            // InternalTypescript.g:3185:2: ( ruleIdentifier )
            {
            // InternalTypescript.g:3185:2: ( ruleIdentifier )
            // InternalTypescript.g:3186:3: ruleIdentifier
            {
             before(grammarAccess.getInterfaceDeclarationAccess().getNameIdentifierParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleIdentifier();

            state._fsp--;

             after(grammarAccess.getInterfaceDeclarationAccess().getNameIdentifierParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDeclaration__NameAssignment_1"


    // $ANTLR start "rule__InterfaceDeclaration__ExtendClauseAssignment_2"
    // InternalTypescript.g:3195:1: rule__InterfaceDeclaration__ExtendClauseAssignment_2 : ( ruleInterfaceExtendsClause ) ;
    public final void rule__InterfaceDeclaration__ExtendClauseAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:3199:1: ( ( ruleInterfaceExtendsClause ) )
            // InternalTypescript.g:3200:2: ( ruleInterfaceExtendsClause )
            {
            // InternalTypescript.g:3200:2: ( ruleInterfaceExtendsClause )
            // InternalTypescript.g:3201:3: ruleInterfaceExtendsClause
            {
             before(grammarAccess.getInterfaceDeclarationAccess().getExtendClauseInterfaceExtendsClauseParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleInterfaceExtendsClause();

            state._fsp--;

             after(grammarAccess.getInterfaceDeclarationAccess().getExtendClauseInterfaceExtendsClauseParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDeclaration__ExtendClauseAssignment_2"


    // $ANTLR start "rule__ClassDeclaration__NameAssignment_1"
    // InternalTypescript.g:3210:1: rule__ClassDeclaration__NameAssignment_1 : ( ruleIdentifier ) ;
    public final void rule__ClassDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:3214:1: ( ( ruleIdentifier ) )
            // InternalTypescript.g:3215:2: ( ruleIdentifier )
            {
            // InternalTypescript.g:3215:2: ( ruleIdentifier )
            // InternalTypescript.g:3216:3: ruleIdentifier
            {
             before(grammarAccess.getClassDeclarationAccess().getNameIdentifierParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleIdentifier();

            state._fsp--;

             after(grammarAccess.getClassDeclarationAccess().getNameIdentifierParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__NameAssignment_1"


    // $ANTLR start "rule__ClassOrInterfaceTypeList__ParentsAssignment_1"
    // InternalTypescript.g:3225:1: rule__ClassOrInterfaceTypeList__ParentsAssignment_1 : ( ruleTypeReference ) ;
    public final void rule__ClassOrInterfaceTypeList__ParentsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:3229:1: ( ( ruleTypeReference ) )
            // InternalTypescript.g:3230:2: ( ruleTypeReference )
            {
            // InternalTypescript.g:3230:2: ( ruleTypeReference )
            // InternalTypescript.g:3231:3: ruleTypeReference
            {
             before(grammarAccess.getClassOrInterfaceTypeListAccess().getParentsTypeReferenceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeReference();

            state._fsp--;

             after(grammarAccess.getClassOrInterfaceTypeListAccess().getParentsTypeReferenceParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassOrInterfaceTypeList__ParentsAssignment_1"


    // $ANTLR start "rule__ClassOrInterfaceTypeList__ParentsAssignment_2_1"
    // InternalTypescript.g:3240:1: rule__ClassOrInterfaceTypeList__ParentsAssignment_2_1 : ( ruleTypeReference ) ;
    public final void rule__ClassOrInterfaceTypeList__ParentsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:3244:1: ( ( ruleTypeReference ) )
            // InternalTypescript.g:3245:2: ( ruleTypeReference )
            {
            // InternalTypescript.g:3245:2: ( ruleTypeReference )
            // InternalTypescript.g:3246:3: ruleTypeReference
            {
             before(grammarAccess.getClassOrInterfaceTypeListAccess().getParentsTypeReferenceParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeReference();

            state._fsp--;

             after(grammarAccess.getClassOrInterfaceTypeListAccess().getParentsTypeReferenceParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassOrInterfaceTypeList__ParentsAssignment_2_1"


    // $ANTLR start "rule__ObjectType__MembersAssignment_2_0"
    // InternalTypescript.g:3255:1: rule__ObjectType__MembersAssignment_2_0 : ( ruleTypeMember ) ;
    public final void rule__ObjectType__MembersAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:3259:1: ( ( ruleTypeMember ) )
            // InternalTypescript.g:3260:2: ( ruleTypeMember )
            {
            // InternalTypescript.g:3260:2: ( ruleTypeMember )
            // InternalTypescript.g:3261:3: ruleTypeMember
            {
             before(grammarAccess.getObjectTypeAccess().getMembersTypeMemberParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeMember();

            state._fsp--;

             after(grammarAccess.getObjectTypeAccess().getMembersTypeMemberParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectType__MembersAssignment_2_0"


    // $ANTLR start "rule__TypeMember__DocCommentAssignment_0"
    // InternalTypescript.g:3270:1: rule__TypeMember__DocCommentAssignment_0 : ( ruleDocComment ) ;
    public final void rule__TypeMember__DocCommentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:3274:1: ( ( ruleDocComment ) )
            // InternalTypescript.g:3275:2: ( ruleDocComment )
            {
            // InternalTypescript.g:3275:2: ( ruleDocComment )
            // InternalTypescript.g:3276:3: ruleDocComment
            {
             before(grammarAccess.getTypeMemberAccess().getDocCommentDocCommentParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDocComment();

            state._fsp--;

             after(grammarAccess.getTypeMemberAccess().getDocCommentDocCommentParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeMember__DocCommentAssignment_0"


    // $ANTLR start "rule__TypeMember__SignatureAssignment_1"
    // InternalTypescript.g:3285:1: rule__TypeMember__SignatureAssignment_1 : ( ( rule__TypeMember__SignatureAlternatives_1_0 ) ) ;
    public final void rule__TypeMember__SignatureAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:3289:1: ( ( ( rule__TypeMember__SignatureAlternatives_1_0 ) ) )
            // InternalTypescript.g:3290:2: ( ( rule__TypeMember__SignatureAlternatives_1_0 ) )
            {
            // InternalTypescript.g:3290:2: ( ( rule__TypeMember__SignatureAlternatives_1_0 ) )
            // InternalTypescript.g:3291:3: ( rule__TypeMember__SignatureAlternatives_1_0 )
            {
             before(grammarAccess.getTypeMemberAccess().getSignatureAlternatives_1_0()); 
            // InternalTypescript.g:3292:3: ( rule__TypeMember__SignatureAlternatives_1_0 )
            // InternalTypescript.g:3292:4: rule__TypeMember__SignatureAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__TypeMember__SignatureAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getTypeMemberAccess().getSignatureAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeMember__SignatureAssignment_1"


    // $ANTLR start "rule__PropertySignature__NameAssignment_0"
    // InternalTypescript.g:3300:1: rule__PropertySignature__NameAssignment_0 : ( ruleIdentifierName ) ;
    public final void rule__PropertySignature__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:3304:1: ( ( ruleIdentifierName ) )
            // InternalTypescript.g:3305:2: ( ruleIdentifierName )
            {
            // InternalTypescript.g:3305:2: ( ruleIdentifierName )
            // InternalTypescript.g:3306:3: ruleIdentifierName
            {
             before(grammarAccess.getPropertySignatureAccess().getNameIdentifierNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleIdentifierName();

            state._fsp--;

             after(grammarAccess.getPropertySignatureAccess().getNameIdentifierNameParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertySignature__NameAssignment_0"


    // $ANTLR start "rule__PropertySignature__OptionalAssignment_1"
    // InternalTypescript.g:3315:1: rule__PropertySignature__OptionalAssignment_1 : ( ( '?' ) ) ;
    public final void rule__PropertySignature__OptionalAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:3319:1: ( ( ( '?' ) ) )
            // InternalTypescript.g:3320:2: ( ( '?' ) )
            {
            // InternalTypescript.g:3320:2: ( ( '?' ) )
            // InternalTypescript.g:3321:3: ( '?' )
            {
             before(grammarAccess.getPropertySignatureAccess().getOptionalQuestionMarkKeyword_1_0()); 
            // InternalTypescript.g:3322:3: ( '?' )
            // InternalTypescript.g:3323:4: '?'
            {
             before(grammarAccess.getPropertySignatureAccess().getOptionalQuestionMarkKeyword_1_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getPropertySignatureAccess().getOptionalQuestionMarkKeyword_1_0()); 

            }

             after(grammarAccess.getPropertySignatureAccess().getOptionalQuestionMarkKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertySignature__OptionalAssignment_1"


    // $ANTLR start "rule__PropertySignature__TypeAssignment_3"
    // InternalTypescript.g:3334:1: rule__PropertySignature__TypeAssignment_3 : ( ruleType ) ;
    public final void rule__PropertySignature__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:3338:1: ( ( ruleType ) )
            // InternalTypescript.g:3339:2: ( ruleType )
            {
            // InternalTypescript.g:3339:2: ( ruleType )
            // InternalTypescript.g:3340:3: ruleType
            {
             before(grammarAccess.getPropertySignatureAccess().getTypeTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getPropertySignatureAccess().getTypeTypeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertySignature__TypeAssignment_3"


    // $ANTLR start "rule__PredefinedType__PredefinedTypeAssignment"
    // InternalTypescript.g:3349:1: rule__PredefinedType__PredefinedTypeAssignment : ( rulePredefinedTypeEnum ) ;
    public final void rule__PredefinedType__PredefinedTypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:3353:1: ( ( rulePredefinedTypeEnum ) )
            // InternalTypescript.g:3354:2: ( rulePredefinedTypeEnum )
            {
            // InternalTypescript.g:3354:2: ( rulePredefinedTypeEnum )
            // InternalTypescript.g:3355:3: rulePredefinedTypeEnum
            {
             before(grammarAccess.getPredefinedTypeAccess().getPredefinedTypePredefinedTypeEnumEnumRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePredefinedTypeEnum();

            state._fsp--;

             after(grammarAccess.getPredefinedTypeAccess().getPredefinedTypePredefinedTypeEnumEnumRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredefinedType__PredefinedTypeAssignment"


    // $ANTLR start "rule__ArrayType__ArrayAssignment_0_1"
    // InternalTypescript.g:3364:1: rule__ArrayType__ArrayAssignment_0_1 : ( rulePredefinedType ) ;
    public final void rule__ArrayType__ArrayAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:3368:1: ( ( rulePredefinedType ) )
            // InternalTypescript.g:3369:2: ( rulePredefinedType )
            {
            // InternalTypescript.g:3369:2: ( rulePredefinedType )
            // InternalTypescript.g:3370:3: rulePredefinedType
            {
             before(grammarAccess.getArrayTypeAccess().getArrayPredefinedTypeParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            rulePredefinedType();

            state._fsp--;

             after(grammarAccess.getArrayTypeAccess().getArrayPredefinedTypeParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__ArrayAssignment_0_1"


    // $ANTLR start "rule__TypeReference__ReferenceAssignment"
    // InternalTypescript.g:3379:1: rule__TypeReference__ReferenceAssignment : ( ( ruleQualifiedName ) ) ;
    public final void rule__TypeReference__ReferenceAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:3383:1: ( ( ( ruleQualifiedName ) ) )
            // InternalTypescript.g:3384:2: ( ( ruleQualifiedName ) )
            {
            // InternalTypescript.g:3384:2: ( ( ruleQualifiedName ) )
            // InternalTypescript.g:3385:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getTypeReferenceAccess().getReferenceInterfaceOrClassDeclarationCrossReference_0()); 
            // InternalTypescript.g:3386:3: ( ruleQualifiedName )
            // InternalTypescript.g:3387:4: ruleQualifiedName
            {
             before(grammarAccess.getTypeReferenceAccess().getReferenceInterfaceOrClassDeclarationQualifiedNameParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getTypeReferenceAccess().getReferenceInterfaceOrClassDeclarationQualifiedNameParserRuleCall_0_1()); 

            }

             after(grammarAccess.getTypeReferenceAccess().getReferenceInterfaceOrClassDeclarationCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeReference__ReferenceAssignment"


    // $ANTLR start "rule__DocComment__LinesAssignment_2"
    // InternalTypescript.g:3398:1: rule__DocComment__LinesAssignment_2 : ( RULE_DOC_COMMENT_LINE ) ;
    public final void rule__DocComment__LinesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:3402:1: ( ( RULE_DOC_COMMENT_LINE ) )
            // InternalTypescript.g:3403:2: ( RULE_DOC_COMMENT_LINE )
            {
            // InternalTypescript.g:3403:2: ( RULE_DOC_COMMENT_LINE )
            // InternalTypescript.g:3404:3: RULE_DOC_COMMENT_LINE
            {
             before(grammarAccess.getDocCommentAccess().getLinesDOC_COMMENT_LINETerminalRuleCall_2_0()); 
            match(input,RULE_DOC_COMMENT_LINE,FOLLOW_2); 
             after(grammarAccess.getDocCommentAccess().getLinesDOC_COMMENT_LINETerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocComment__LinesAssignment_2"


    // $ANTLR start "rule__DocComment__AnnotationsAssignment_3"
    // InternalTypescript.g:3413:1: rule__DocComment__AnnotationsAssignment_3 : ( ruleAnnotationLine ) ;
    public final void rule__DocComment__AnnotationsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:3417:1: ( ( ruleAnnotationLine ) )
            // InternalTypescript.g:3418:2: ( ruleAnnotationLine )
            {
            // InternalTypescript.g:3418:2: ( ruleAnnotationLine )
            // InternalTypescript.g:3419:3: ruleAnnotationLine
            {
             before(grammarAccess.getDocCommentAccess().getAnnotationsAnnotationLineParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAnnotationLine();

            state._fsp--;

             after(grammarAccess.getDocCommentAccess().getAnnotationsAnnotationLineParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocComment__AnnotationsAssignment_3"


    // $ANTLR start "rule__AnnotationLine__AnnotationNameAssignment_1"
    // InternalTypescript.g:3428:1: rule__AnnotationLine__AnnotationNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__AnnotationLine__AnnotationNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:3432:1: ( ( RULE_ID ) )
            // InternalTypescript.g:3433:2: ( RULE_ID )
            {
            // InternalTypescript.g:3433:2: ( RULE_ID )
            // InternalTypescript.g:3434:3: RULE_ID
            {
             before(grammarAccess.getAnnotationLineAccess().getAnnotationNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAnnotationLineAccess().getAnnotationNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationLine__AnnotationNameAssignment_1"


    // $ANTLR start "rule__IndexSignature__IndexTypeAssignment_3"
    // InternalTypescript.g:3443:1: rule__IndexSignature__IndexTypeAssignment_3 : ( ruleIndexType ) ;
    public final void rule__IndexSignature__IndexTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:3447:1: ( ( ruleIndexType ) )
            // InternalTypescript.g:3448:2: ( ruleIndexType )
            {
            // InternalTypescript.g:3448:2: ( ruleIndexType )
            // InternalTypescript.g:3449:3: ruleIndexType
            {
             before(grammarAccess.getIndexSignatureAccess().getIndexTypeIndexTypeEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleIndexType();

            state._fsp--;

             after(grammarAccess.getIndexSignatureAccess().getIndexTypeIndexTypeEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexSignature__IndexTypeAssignment_3"


    // $ANTLR start "rule__IndexSignature__ValueTypeAssignment_5"
    // InternalTypescript.g:3458:1: rule__IndexSignature__ValueTypeAssignment_5 : ( ruleType ) ;
    public final void rule__IndexSignature__ValueTypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypescript.g:3462:1: ( ( ruleType ) )
            // InternalTypescript.g:3463:2: ( ruleType )
            {
            // InternalTypescript.g:3463:2: ( ruleType )
            // InternalTypescript.g:3464:3: ruleType
            {
             before(grammarAccess.getIndexSignatureAccess().getValueTypeTypeParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getIndexSignatureAccess().getValueTypeTypeParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexSignature__ValueTypeAssignment_5"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA2 dfa2 = new DFA2(this);
    protected DFA5 dfa5 = new DFA5(this);
    static final String dfa_1s = "\10\uffff";
    static final String dfa_2s = "\1\25\1\5\2\uffff\1\5\1\4\1\25\1\5";
    static final String dfa_3s = "\1\41\1\7\2\uffff\1\7\1\4\1\33\1\6";
    static final String dfa_4s = "\2\uffff\1\1\1\2\4\uffff";
    static final String dfa_5s = "\10\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\4\uffff\2\3\5\uffff\1\1",
            "\1\6\1\5\1\4",
            "",
            "",
            "\1\6\1\5\1\4",
            "\1\7",
            "\1\2\4\uffff\2\3",
            "\1\6\1\5"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "734:1: rule__InterfacesAndClasses__Alternatives_1 : ( ( ( rule__InterfacesAndClasses__ModulesAssignment_1_0 ) ) | ( ( rule__InterfacesAndClasses__TypesAssignment_1_1 ) ) );";
        }
    }
    static final String dfa_7s = "\11\uffff";
    static final String dfa_8s = "\1\23\1\5\3\uffff\1\5\1\4\1\25\1\5";
    static final String dfa_9s = "\1\41\1\7\3\uffff\1\7\1\4\1\33\1\6";
    static final String dfa_10s = "\2\uffff\1\1\1\2\1\3\4\uffff";
    static final String dfa_11s = "\11\uffff}>";
    static final String[] dfa_12s = {
            "\1\4\1\uffff\1\3\4\uffff\2\2\5\uffff\1\1",
            "\1\7\1\6\1\5",
            "",
            "",
            "",
            "\1\7\1\6\1\5",
            "\1\10",
            "\1\3\4\uffff\2\2",
            "\1\7\1\6"
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "755:1: rule__ModuleElement__ModuleContentAlternatives_1_0 : ( ( ruleDeclaration ) | ( ruleModuleDeclaration ) | ( ruleImportDeclaration ) );";
        }
    }
    static final String dfa_13s = "\16\uffff";
    static final String dfa_14s = "\1\uffff\5\10\1\13\6\uffff\1\13";
    static final String dfa_15s = "\7\4\2\uffff\2\4\1\uffff\2\4";
    static final String dfa_16s = "\1\26\6\41\2\uffff\1\40\1\4\1\uffff\1\40\1\41";
    static final String dfa_17s = "\7\uffff\1\3\1\1\2\uffff\1\2\2\uffff";
    static final String dfa_18s = "\16\uffff}>";
    static final String[] dfa_19s = {
            "\1\6\11\uffff\1\1\1\2\1\3\1\4\1\5\3\uffff\1\7",
            "\1\10\22\uffff\1\10\1\uffff\1\10\5\uffff\1\11\1\uffff\1\10",
            "\1\10\22\uffff\1\10\1\uffff\1\10\5\uffff\1\11\1\uffff\1\10",
            "\1\10\22\uffff\1\10\1\uffff\1\10\5\uffff\1\11\1\uffff\1\10",
            "\1\10\22\uffff\1\10\1\uffff\1\10\5\uffff\1\11\1\uffff\1\10",
            "\1\10\22\uffff\1\10\1\uffff\1\10\5\uffff\1\11\1\uffff\1\10",
            "\1\13\22\uffff\1\13\1\12\1\13\5\uffff\1\14\1\uffff\1\13",
            "",
            "",
            "\1\10\33\uffff\1\7",
            "\1\15",
            "",
            "\1\13\33\uffff\1\7",
            "\1\13\22\uffff\1\13\1\12\1\13\5\uffff\1\14\1\uffff\1\13"
    };

    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[][] dfa_19 = unpackEncodedStringArray(dfa_19s);

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_13;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_18;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "824:1: rule__Type__Alternatives : ( ( rulePredefinedType ) | ( ruleTypeReference ) | ( ruleTypeLiteral ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000020C200000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000020C200002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000200200000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001400000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000060C280000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000060C280002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000280800010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000280000012L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000280000010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000840000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000000000047C010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000000000007C000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000028000L});

}