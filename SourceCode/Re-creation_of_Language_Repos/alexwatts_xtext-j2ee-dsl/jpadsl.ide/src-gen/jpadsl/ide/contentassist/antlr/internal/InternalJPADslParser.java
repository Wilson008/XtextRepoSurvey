package jpadsl.ide.contentassist.antlr.internal;

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
import jpadsl.services.JPADslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJPADslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'public'", "'private'", "'protected'", "'import'", "'package'", "'{'", "'}'", "'datatype'", "'databaseMode'", "'entity'", "'extends'", "'read only'", "'cacheable'", "'unique id'", "'embedded id'", "'staticAttribute'", "':'", "'attribute'", "'transient'", "'id attribute'", "'one to one join column'", "'one to one mapped by'", "'one to many using join table'", "'one to many using join column'", "'one to many mapped by'", "'many to one using join column'", "'many to one using join table'", "'many to one mapped by'", "'many to many join table'", "'many to many mapped by'", "'ref'", "'opposite'", "'op'", "'('", "')'", "','", "'.*'", "'.'", "'*'"
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


        public InternalJPADslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalJPADslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalJPADslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalJPADsl.g"; }


    	private JPADslGrammarAccess grammarAccess;

    	public void setGrammarAccess(JPADslGrammarAccess grammarAccess) {
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
    // InternalJPADsl.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalJPADsl.g:54:1: ( ruleModel EOF )
            // InternalJPADsl.g:55:1: ruleModel EOF
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
    // InternalJPADsl.g:62:1: ruleModel : ( ( rule__Model__ElementsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:66:2: ( ( ( rule__Model__ElementsAssignment )* ) )
            // InternalJPADsl.g:67:2: ( ( rule__Model__ElementsAssignment )* )
            {
            // InternalJPADsl.g:67:2: ( ( rule__Model__ElementsAssignment )* )
            // InternalJPADsl.g:68:3: ( rule__Model__ElementsAssignment )*
            {
             before(grammarAccess.getModelAccess().getElementsAssignment()); 
            // InternalJPADsl.g:69:3: ( rule__Model__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=14 && LA1_0<=15)||LA1_0==18||LA1_0==20||(LA1_0>=31 && LA1_0<=40)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalJPADsl.g:69:4: rule__Model__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__ElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getElementsAssignment()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleAbstractElement"
    // InternalJPADsl.g:78:1: entryRuleAbstractElement : ruleAbstractElement EOF ;
    public final void entryRuleAbstractElement() throws RecognitionException {
        try {
            // InternalJPADsl.g:79:1: ( ruleAbstractElement EOF )
            // InternalJPADsl.g:80:1: ruleAbstractElement EOF
            {
             before(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getAbstractElementRule()); 
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
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // InternalJPADsl.g:87:1: ruleAbstractElement : ( ( rule__AbstractElement__Alternatives ) ) ;
    public final void ruleAbstractElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:91:2: ( ( ( rule__AbstractElement__Alternatives ) ) )
            // InternalJPADsl.g:92:2: ( ( rule__AbstractElement__Alternatives ) )
            {
            // InternalJPADsl.g:92:2: ( ( rule__AbstractElement__Alternatives ) )
            // InternalJPADsl.g:93:3: ( rule__AbstractElement__Alternatives )
            {
             before(grammarAccess.getAbstractElementAccess().getAlternatives()); 
            // InternalJPADsl.g:94:3: ( rule__AbstractElement__Alternatives )
            // InternalJPADsl.g:94:4: rule__AbstractElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AbstractElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRuleImport"
    // InternalJPADsl.g:103:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalJPADsl.g:104:1: ( ruleImport EOF )
            // InternalJPADsl.g:105:1: ruleImport EOF
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
    // InternalJPADsl.g:112:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:116:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalJPADsl.g:117:2: ( ( rule__Import__Group__0 ) )
            {
            // InternalJPADsl.g:117:2: ( ( rule__Import__Group__0 ) )
            // InternalJPADsl.g:118:3: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // InternalJPADsl.g:119:3: ( rule__Import__Group__0 )
            // InternalJPADsl.g:119:4: rule__Import__Group__0
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


    // $ANTLR start "entryRulePackageDeclaration"
    // InternalJPADsl.g:128:1: entryRulePackageDeclaration : rulePackageDeclaration EOF ;
    public final void entryRulePackageDeclaration() throws RecognitionException {
        try {
            // InternalJPADsl.g:129:1: ( rulePackageDeclaration EOF )
            // InternalJPADsl.g:130:1: rulePackageDeclaration EOF
            {
             before(grammarAccess.getPackageDeclarationRule()); 
            pushFollow(FOLLOW_1);
            rulePackageDeclaration();

            state._fsp--;

             after(grammarAccess.getPackageDeclarationRule()); 
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
    // $ANTLR end "entryRulePackageDeclaration"


    // $ANTLR start "rulePackageDeclaration"
    // InternalJPADsl.g:137:1: rulePackageDeclaration : ( ( rule__PackageDeclaration__Group__0 ) ) ;
    public final void rulePackageDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:141:2: ( ( ( rule__PackageDeclaration__Group__0 ) ) )
            // InternalJPADsl.g:142:2: ( ( rule__PackageDeclaration__Group__0 ) )
            {
            // InternalJPADsl.g:142:2: ( ( rule__PackageDeclaration__Group__0 ) )
            // InternalJPADsl.g:143:3: ( rule__PackageDeclaration__Group__0 )
            {
             before(grammarAccess.getPackageDeclarationAccess().getGroup()); 
            // InternalJPADsl.g:144:3: ( rule__PackageDeclaration__Group__0 )
            // InternalJPADsl.g:144:4: rule__PackageDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PackageDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPackageDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePackageDeclaration"


    // $ANTLR start "entryRuleType"
    // InternalJPADsl.g:153:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalJPADsl.g:154:1: ( ruleType EOF )
            // InternalJPADsl.g:155:1: ruleType EOF
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
    // InternalJPADsl.g:162:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:166:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalJPADsl.g:167:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalJPADsl.g:167:2: ( ( rule__Type__Alternatives ) )
            // InternalJPADsl.g:168:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalJPADsl.g:169:3: ( rule__Type__Alternatives )
            // InternalJPADsl.g:169:4: rule__Type__Alternatives
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


    // $ANTLR start "entryRuleDataType"
    // InternalJPADsl.g:178:1: entryRuleDataType : ruleDataType EOF ;
    public final void entryRuleDataType() throws RecognitionException {
        try {
            // InternalJPADsl.g:179:1: ( ruleDataType EOF )
            // InternalJPADsl.g:180:1: ruleDataType EOF
            {
             before(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getDataTypeRule()); 
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
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // InternalJPADsl.g:187:1: ruleDataType : ( ( rule__DataType__Group__0 ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:191:2: ( ( ( rule__DataType__Group__0 ) ) )
            // InternalJPADsl.g:192:2: ( ( rule__DataType__Group__0 ) )
            {
            // InternalJPADsl.g:192:2: ( ( rule__DataType__Group__0 ) )
            // InternalJPADsl.g:193:3: ( rule__DataType__Group__0 )
            {
             before(grammarAccess.getDataTypeAccess().getGroup()); 
            // InternalJPADsl.g:194:3: ( rule__DataType__Group__0 )
            // InternalJPADsl.g:194:4: rule__DataType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleDatabaseMode"
    // InternalJPADsl.g:203:1: entryRuleDatabaseMode : ruleDatabaseMode EOF ;
    public final void entryRuleDatabaseMode() throws RecognitionException {
        try {
            // InternalJPADsl.g:204:1: ( ruleDatabaseMode EOF )
            // InternalJPADsl.g:205:1: ruleDatabaseMode EOF
            {
             before(grammarAccess.getDatabaseModeRule()); 
            pushFollow(FOLLOW_1);
            ruleDatabaseMode();

            state._fsp--;

             after(grammarAccess.getDatabaseModeRule()); 
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
    // $ANTLR end "entryRuleDatabaseMode"


    // $ANTLR start "ruleDatabaseMode"
    // InternalJPADsl.g:212:1: ruleDatabaseMode : ( ( rule__DatabaseMode__Group__0 ) ) ;
    public final void ruleDatabaseMode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:216:2: ( ( ( rule__DatabaseMode__Group__0 ) ) )
            // InternalJPADsl.g:217:2: ( ( rule__DatabaseMode__Group__0 ) )
            {
            // InternalJPADsl.g:217:2: ( ( rule__DatabaseMode__Group__0 ) )
            // InternalJPADsl.g:218:3: ( rule__DatabaseMode__Group__0 )
            {
             before(grammarAccess.getDatabaseModeAccess().getGroup()); 
            // InternalJPADsl.g:219:3: ( rule__DatabaseMode__Group__0 )
            // InternalJPADsl.g:219:4: rule__DatabaseMode__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DatabaseMode__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDatabaseModeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDatabaseMode"


    // $ANTLR start "entryRuleEntity"
    // InternalJPADsl.g:228:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalJPADsl.g:229:1: ( ruleEntity EOF )
            // InternalJPADsl.g:230:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalJPADsl.g:237:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:241:2: ( ( ( rule__Entity__Group__0 ) ) )
            // InternalJPADsl.g:242:2: ( ( rule__Entity__Group__0 ) )
            {
            // InternalJPADsl.g:242:2: ( ( rule__Entity__Group__0 ) )
            // InternalJPADsl.g:243:3: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // InternalJPADsl.g:244:3: ( rule__Entity__Group__0 )
            // InternalJPADsl.g:244:4: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleReadOnly"
    // InternalJPADsl.g:253:1: entryRuleReadOnly : ruleReadOnly EOF ;
    public final void entryRuleReadOnly() throws RecognitionException {
        try {
            // InternalJPADsl.g:254:1: ( ruleReadOnly EOF )
            // InternalJPADsl.g:255:1: ruleReadOnly EOF
            {
             before(grammarAccess.getReadOnlyRule()); 
            pushFollow(FOLLOW_1);
            ruleReadOnly();

            state._fsp--;

             after(grammarAccess.getReadOnlyRule()); 
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
    // $ANTLR end "entryRuleReadOnly"


    // $ANTLR start "ruleReadOnly"
    // InternalJPADsl.g:262:1: ruleReadOnly : ( ( rule__ReadOnly__Group__0 ) ) ;
    public final void ruleReadOnly() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:266:2: ( ( ( rule__ReadOnly__Group__0 ) ) )
            // InternalJPADsl.g:267:2: ( ( rule__ReadOnly__Group__0 ) )
            {
            // InternalJPADsl.g:267:2: ( ( rule__ReadOnly__Group__0 ) )
            // InternalJPADsl.g:268:3: ( rule__ReadOnly__Group__0 )
            {
             before(grammarAccess.getReadOnlyAccess().getGroup()); 
            // InternalJPADsl.g:269:3: ( rule__ReadOnly__Group__0 )
            // InternalJPADsl.g:269:4: rule__ReadOnly__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ReadOnly__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReadOnlyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReadOnly"


    // $ANTLR start "entryRuleCacheable"
    // InternalJPADsl.g:278:1: entryRuleCacheable : ruleCacheable EOF ;
    public final void entryRuleCacheable() throws RecognitionException {
        try {
            // InternalJPADsl.g:279:1: ( ruleCacheable EOF )
            // InternalJPADsl.g:280:1: ruleCacheable EOF
            {
             before(grammarAccess.getCacheableRule()); 
            pushFollow(FOLLOW_1);
            ruleCacheable();

            state._fsp--;

             after(grammarAccess.getCacheableRule()); 
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
    // $ANTLR end "entryRuleCacheable"


    // $ANTLR start "ruleCacheable"
    // InternalJPADsl.g:287:1: ruleCacheable : ( ( rule__Cacheable__Group__0 ) ) ;
    public final void ruleCacheable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:291:2: ( ( ( rule__Cacheable__Group__0 ) ) )
            // InternalJPADsl.g:292:2: ( ( rule__Cacheable__Group__0 ) )
            {
            // InternalJPADsl.g:292:2: ( ( rule__Cacheable__Group__0 ) )
            // InternalJPADsl.g:293:3: ( rule__Cacheable__Group__0 )
            {
             before(grammarAccess.getCacheableAccess().getGroup()); 
            // InternalJPADsl.g:294:3: ( rule__Cacheable__Group__0 )
            // InternalJPADsl.g:294:4: rule__Cacheable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Cacheable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCacheableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCacheable"


    // $ANTLR start "entryRuleIdentifier"
    // InternalJPADsl.g:303:1: entryRuleIdentifier : ruleIdentifier EOF ;
    public final void entryRuleIdentifier() throws RecognitionException {
        try {
            // InternalJPADsl.g:304:1: ( ruleIdentifier EOF )
            // InternalJPADsl.g:305:1: ruleIdentifier EOF
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
    // InternalJPADsl.g:312:1: ruleIdentifier : ( ( rule__Identifier__Alternatives ) ) ;
    public final void ruleIdentifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:316:2: ( ( ( rule__Identifier__Alternatives ) ) )
            // InternalJPADsl.g:317:2: ( ( rule__Identifier__Alternatives ) )
            {
            // InternalJPADsl.g:317:2: ( ( rule__Identifier__Alternatives ) )
            // InternalJPADsl.g:318:3: ( rule__Identifier__Alternatives )
            {
             before(grammarAccess.getIdentifierAccess().getAlternatives()); 
            // InternalJPADsl.g:319:3: ( rule__Identifier__Alternatives )
            // InternalJPADsl.g:319:4: rule__Identifier__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Identifier__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getIdentifierAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleUniqueIdentiferColumn"
    // InternalJPADsl.g:328:1: entryRuleUniqueIdentiferColumn : ruleUniqueIdentiferColumn EOF ;
    public final void entryRuleUniqueIdentiferColumn() throws RecognitionException {
        try {
            // InternalJPADsl.g:329:1: ( ruleUniqueIdentiferColumn EOF )
            // InternalJPADsl.g:330:1: ruleUniqueIdentiferColumn EOF
            {
             before(grammarAccess.getUniqueIdentiferColumnRule()); 
            pushFollow(FOLLOW_1);
            ruleUniqueIdentiferColumn();

            state._fsp--;

             after(grammarAccess.getUniqueIdentiferColumnRule()); 
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
    // $ANTLR end "entryRuleUniqueIdentiferColumn"


    // $ANTLR start "ruleUniqueIdentiferColumn"
    // InternalJPADsl.g:337:1: ruleUniqueIdentiferColumn : ( ( rule__UniqueIdentiferColumn__Group__0 ) ) ;
    public final void ruleUniqueIdentiferColumn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:341:2: ( ( ( rule__UniqueIdentiferColumn__Group__0 ) ) )
            // InternalJPADsl.g:342:2: ( ( rule__UniqueIdentiferColumn__Group__0 ) )
            {
            // InternalJPADsl.g:342:2: ( ( rule__UniqueIdentiferColumn__Group__0 ) )
            // InternalJPADsl.g:343:3: ( rule__UniqueIdentiferColumn__Group__0 )
            {
             before(grammarAccess.getUniqueIdentiferColumnAccess().getGroup()); 
            // InternalJPADsl.g:344:3: ( rule__UniqueIdentiferColumn__Group__0 )
            // InternalJPADsl.g:344:4: rule__UniqueIdentiferColumn__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UniqueIdentiferColumn__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUniqueIdentiferColumnAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUniqueIdentiferColumn"


    // $ANTLR start "entryRuleEmbeddedUniqueIdentifer"
    // InternalJPADsl.g:353:1: entryRuleEmbeddedUniqueIdentifer : ruleEmbeddedUniqueIdentifer EOF ;
    public final void entryRuleEmbeddedUniqueIdentifer() throws RecognitionException {
        try {
            // InternalJPADsl.g:354:1: ( ruleEmbeddedUniqueIdentifer EOF )
            // InternalJPADsl.g:355:1: ruleEmbeddedUniqueIdentifer EOF
            {
             before(grammarAccess.getEmbeddedUniqueIdentiferRule()); 
            pushFollow(FOLLOW_1);
            ruleEmbeddedUniqueIdentifer();

            state._fsp--;

             after(grammarAccess.getEmbeddedUniqueIdentiferRule()); 
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
    // $ANTLR end "entryRuleEmbeddedUniqueIdentifer"


    // $ANTLR start "ruleEmbeddedUniqueIdentifer"
    // InternalJPADsl.g:362:1: ruleEmbeddedUniqueIdentifer : ( ( rule__EmbeddedUniqueIdentifer__Group__0 ) ) ;
    public final void ruleEmbeddedUniqueIdentifer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:366:2: ( ( ( rule__EmbeddedUniqueIdentifer__Group__0 ) ) )
            // InternalJPADsl.g:367:2: ( ( rule__EmbeddedUniqueIdentifer__Group__0 ) )
            {
            // InternalJPADsl.g:367:2: ( ( rule__EmbeddedUniqueIdentifer__Group__0 ) )
            // InternalJPADsl.g:368:3: ( rule__EmbeddedUniqueIdentifer__Group__0 )
            {
             before(grammarAccess.getEmbeddedUniqueIdentiferAccess().getGroup()); 
            // InternalJPADsl.g:369:3: ( rule__EmbeddedUniqueIdentifer__Group__0 )
            // InternalJPADsl.g:369:4: rule__EmbeddedUniqueIdentifer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EmbeddedUniqueIdentifer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEmbeddedUniqueIdentiferAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEmbeddedUniqueIdentifer"


    // $ANTLR start "entryRuleFeature"
    // InternalJPADsl.g:378:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // InternalJPADsl.g:379:1: ( ruleFeature EOF )
            // InternalJPADsl.g:380:1: ruleFeature EOF
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
    // InternalJPADsl.g:387:1: ruleFeature : ( ( rule__Feature__Alternatives ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:391:2: ( ( ( rule__Feature__Alternatives ) ) )
            // InternalJPADsl.g:392:2: ( ( rule__Feature__Alternatives ) )
            {
            // InternalJPADsl.g:392:2: ( ( rule__Feature__Alternatives ) )
            // InternalJPADsl.g:393:3: ( rule__Feature__Alternatives )
            {
             before(grammarAccess.getFeatureAccess().getAlternatives()); 
            // InternalJPADsl.g:394:3: ( rule__Feature__Alternatives )
            // InternalJPADsl.g:394:4: rule__Feature__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Feature__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleStructuralFeature"
    // InternalJPADsl.g:403:1: entryRuleStructuralFeature : ruleStructuralFeature EOF ;
    public final void entryRuleStructuralFeature() throws RecognitionException {
        try {
            // InternalJPADsl.g:404:1: ( ruleStructuralFeature EOF )
            // InternalJPADsl.g:405:1: ruleStructuralFeature EOF
            {
             before(grammarAccess.getStructuralFeatureRule()); 
            pushFollow(FOLLOW_1);
            ruleStructuralFeature();

            state._fsp--;

             after(grammarAccess.getStructuralFeatureRule()); 
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
    // $ANTLR end "entryRuleStructuralFeature"


    // $ANTLR start "ruleStructuralFeature"
    // InternalJPADsl.g:412:1: ruleStructuralFeature : ( ( rule__StructuralFeature__Alternatives ) ) ;
    public final void ruleStructuralFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:416:2: ( ( ( rule__StructuralFeature__Alternatives ) ) )
            // InternalJPADsl.g:417:2: ( ( rule__StructuralFeature__Alternatives ) )
            {
            // InternalJPADsl.g:417:2: ( ( rule__StructuralFeature__Alternatives ) )
            // InternalJPADsl.g:418:3: ( rule__StructuralFeature__Alternatives )
            {
             before(grammarAccess.getStructuralFeatureAccess().getAlternatives()); 
            // InternalJPADsl.g:419:3: ( rule__StructuralFeature__Alternatives )
            // InternalJPADsl.g:419:4: rule__StructuralFeature__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__StructuralFeature__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStructuralFeatureAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStructuralFeature"


    // $ANTLR start "entryRuleAttribute"
    // InternalJPADsl.g:428:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalJPADsl.g:429:1: ( ruleAttribute EOF )
            // InternalJPADsl.g:430:1: ruleAttribute EOF
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
    // InternalJPADsl.g:437:1: ruleAttribute : ( ( rule__Attribute__Alternatives ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:441:2: ( ( ( rule__Attribute__Alternatives ) ) )
            // InternalJPADsl.g:442:2: ( ( rule__Attribute__Alternatives ) )
            {
            // InternalJPADsl.g:442:2: ( ( rule__Attribute__Alternatives ) )
            // InternalJPADsl.g:443:3: ( rule__Attribute__Alternatives )
            {
             before(grammarAccess.getAttributeAccess().getAlternatives()); 
            // InternalJPADsl.g:444:3: ( rule__Attribute__Alternatives )
            // InternalJPADsl.g:444:4: rule__Attribute__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleStaticAttribute"
    // InternalJPADsl.g:453:1: entryRuleStaticAttribute : ruleStaticAttribute EOF ;
    public final void entryRuleStaticAttribute() throws RecognitionException {
        try {
            // InternalJPADsl.g:454:1: ( ruleStaticAttribute EOF )
            // InternalJPADsl.g:455:1: ruleStaticAttribute EOF
            {
             before(grammarAccess.getStaticAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleStaticAttribute();

            state._fsp--;

             after(grammarAccess.getStaticAttributeRule()); 
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
    // $ANTLR end "entryRuleStaticAttribute"


    // $ANTLR start "ruleStaticAttribute"
    // InternalJPADsl.g:462:1: ruleStaticAttribute : ( ( rule__StaticAttribute__Group__0 ) ) ;
    public final void ruleStaticAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:466:2: ( ( ( rule__StaticAttribute__Group__0 ) ) )
            // InternalJPADsl.g:467:2: ( ( rule__StaticAttribute__Group__0 ) )
            {
            // InternalJPADsl.g:467:2: ( ( rule__StaticAttribute__Group__0 ) )
            // InternalJPADsl.g:468:3: ( rule__StaticAttribute__Group__0 )
            {
             before(grammarAccess.getStaticAttributeAccess().getGroup()); 
            // InternalJPADsl.g:469:3: ( rule__StaticAttribute__Group__0 )
            // InternalJPADsl.g:469:4: rule__StaticAttribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StaticAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStaticAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStaticAttribute"


    // $ANTLR start "entryRuleInternalAttribute"
    // InternalJPADsl.g:478:1: entryRuleInternalAttribute : ruleInternalAttribute EOF ;
    public final void entryRuleInternalAttribute() throws RecognitionException {
        try {
            // InternalJPADsl.g:479:1: ( ruleInternalAttribute EOF )
            // InternalJPADsl.g:480:1: ruleInternalAttribute EOF
            {
             before(grammarAccess.getInternalAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleInternalAttribute();

            state._fsp--;

             after(grammarAccess.getInternalAttributeRule()); 
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
    // $ANTLR end "entryRuleInternalAttribute"


    // $ANTLR start "ruleInternalAttribute"
    // InternalJPADsl.g:487:1: ruleInternalAttribute : ( ( rule__InternalAttribute__Alternatives ) ) ;
    public final void ruleInternalAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:491:2: ( ( ( rule__InternalAttribute__Alternatives ) ) )
            // InternalJPADsl.g:492:2: ( ( rule__InternalAttribute__Alternatives ) )
            {
            // InternalJPADsl.g:492:2: ( ( rule__InternalAttribute__Alternatives ) )
            // InternalJPADsl.g:493:3: ( rule__InternalAttribute__Alternatives )
            {
             before(grammarAccess.getInternalAttributeAccess().getAlternatives()); 
            // InternalJPADsl.g:494:3: ( rule__InternalAttribute__Alternatives )
            // InternalJPADsl.g:494:4: rule__InternalAttribute__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__InternalAttribute__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getInternalAttributeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInternalAttribute"


    // $ANTLR start "entryRuleRelationshipAttribute"
    // InternalJPADsl.g:503:1: entryRuleRelationshipAttribute : ruleRelationshipAttribute EOF ;
    public final void entryRuleRelationshipAttribute() throws RecognitionException {
        try {
            // InternalJPADsl.g:504:1: ( ruleRelationshipAttribute EOF )
            // InternalJPADsl.g:505:1: ruleRelationshipAttribute EOF
            {
             before(grammarAccess.getRelationshipAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleRelationshipAttribute();

            state._fsp--;

             after(grammarAccess.getRelationshipAttributeRule()); 
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
    // $ANTLR end "entryRuleRelationshipAttribute"


    // $ANTLR start "ruleRelationshipAttribute"
    // InternalJPADsl.g:512:1: ruleRelationshipAttribute : ( ( rule__RelationshipAttribute__Alternatives ) ) ;
    public final void ruleRelationshipAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:516:2: ( ( ( rule__RelationshipAttribute__Alternatives ) ) )
            // InternalJPADsl.g:517:2: ( ( rule__RelationshipAttribute__Alternatives ) )
            {
            // InternalJPADsl.g:517:2: ( ( rule__RelationshipAttribute__Alternatives ) )
            // InternalJPADsl.g:518:3: ( rule__RelationshipAttribute__Alternatives )
            {
             before(grammarAccess.getRelationshipAttributeAccess().getAlternatives()); 
            // InternalJPADsl.g:519:3: ( rule__RelationshipAttribute__Alternatives )
            // InternalJPADsl.g:519:4: rule__RelationshipAttribute__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RelationshipAttribute__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRelationshipAttributeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRelationshipAttribute"


    // $ANTLR start "entryRuleSingularRelationshipAttribute"
    // InternalJPADsl.g:528:1: entryRuleSingularRelationshipAttribute : ruleSingularRelationshipAttribute EOF ;
    public final void entryRuleSingularRelationshipAttribute() throws RecognitionException {
        try {
            // InternalJPADsl.g:529:1: ( ruleSingularRelationshipAttribute EOF )
            // InternalJPADsl.g:530:1: ruleSingularRelationshipAttribute EOF
            {
             before(grammarAccess.getSingularRelationshipAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleSingularRelationshipAttribute();

            state._fsp--;

             after(grammarAccess.getSingularRelationshipAttributeRule()); 
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
    // $ANTLR end "entryRuleSingularRelationshipAttribute"


    // $ANTLR start "ruleSingularRelationshipAttribute"
    // InternalJPADsl.g:537:1: ruleSingularRelationshipAttribute : ( ( rule__SingularRelationshipAttribute__Alternatives ) ) ;
    public final void ruleSingularRelationshipAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:541:2: ( ( ( rule__SingularRelationshipAttribute__Alternatives ) ) )
            // InternalJPADsl.g:542:2: ( ( rule__SingularRelationshipAttribute__Alternatives ) )
            {
            // InternalJPADsl.g:542:2: ( ( rule__SingularRelationshipAttribute__Alternatives ) )
            // InternalJPADsl.g:543:3: ( rule__SingularRelationshipAttribute__Alternatives )
            {
             before(grammarAccess.getSingularRelationshipAttributeAccess().getAlternatives()); 
            // InternalJPADsl.g:544:3: ( rule__SingularRelationshipAttribute__Alternatives )
            // InternalJPADsl.g:544:4: rule__SingularRelationshipAttribute__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SingularRelationshipAttribute__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSingularRelationshipAttributeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSingularRelationshipAttribute"


    // $ANTLR start "entryRuleMultipleRelationshipAttribute"
    // InternalJPADsl.g:553:1: entryRuleMultipleRelationshipAttribute : ruleMultipleRelationshipAttribute EOF ;
    public final void entryRuleMultipleRelationshipAttribute() throws RecognitionException {
        try {
            // InternalJPADsl.g:554:1: ( ruleMultipleRelationshipAttribute EOF )
            // InternalJPADsl.g:555:1: ruleMultipleRelationshipAttribute EOF
            {
             before(grammarAccess.getMultipleRelationshipAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleMultipleRelationshipAttribute();

            state._fsp--;

             after(grammarAccess.getMultipleRelationshipAttributeRule()); 
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
    // $ANTLR end "entryRuleMultipleRelationshipAttribute"


    // $ANTLR start "ruleMultipleRelationshipAttribute"
    // InternalJPADsl.g:562:1: ruleMultipleRelationshipAttribute : ( ( rule__MultipleRelationshipAttribute__Alternatives ) ) ;
    public final void ruleMultipleRelationshipAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:566:2: ( ( ( rule__MultipleRelationshipAttribute__Alternatives ) ) )
            // InternalJPADsl.g:567:2: ( ( rule__MultipleRelationshipAttribute__Alternatives ) )
            {
            // InternalJPADsl.g:567:2: ( ( rule__MultipleRelationshipAttribute__Alternatives ) )
            // InternalJPADsl.g:568:3: ( rule__MultipleRelationshipAttribute__Alternatives )
            {
             before(grammarAccess.getMultipleRelationshipAttributeAccess().getAlternatives()); 
            // InternalJPADsl.g:569:3: ( rule__MultipleRelationshipAttribute__Alternatives )
            // InternalJPADsl.g:569:4: rule__MultipleRelationshipAttribute__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MultipleRelationshipAttribute__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMultipleRelationshipAttributeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultipleRelationshipAttribute"


    // $ANTLR start "entryRuleReadOnlyInternalAttribute"
    // InternalJPADsl.g:578:1: entryRuleReadOnlyInternalAttribute : ruleReadOnlyInternalAttribute EOF ;
    public final void entryRuleReadOnlyInternalAttribute() throws RecognitionException {
        try {
            // InternalJPADsl.g:579:1: ( ruleReadOnlyInternalAttribute EOF )
            // InternalJPADsl.g:580:1: ruleReadOnlyInternalAttribute EOF
            {
             before(grammarAccess.getReadOnlyInternalAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleReadOnlyInternalAttribute();

            state._fsp--;

             after(grammarAccess.getReadOnlyInternalAttributeRule()); 
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
    // $ANTLR end "entryRuleReadOnlyInternalAttribute"


    // $ANTLR start "ruleReadOnlyInternalAttribute"
    // InternalJPADsl.g:587:1: ruleReadOnlyInternalAttribute : ( ( rule__ReadOnlyInternalAttribute__Group__0 ) ) ;
    public final void ruleReadOnlyInternalAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:591:2: ( ( ( rule__ReadOnlyInternalAttribute__Group__0 ) ) )
            // InternalJPADsl.g:592:2: ( ( rule__ReadOnlyInternalAttribute__Group__0 ) )
            {
            // InternalJPADsl.g:592:2: ( ( rule__ReadOnlyInternalAttribute__Group__0 ) )
            // InternalJPADsl.g:593:3: ( rule__ReadOnlyInternalAttribute__Group__0 )
            {
             before(grammarAccess.getReadOnlyInternalAttributeAccess().getGroup()); 
            // InternalJPADsl.g:594:3: ( rule__ReadOnlyInternalAttribute__Group__0 )
            // InternalJPADsl.g:594:4: rule__ReadOnlyInternalAttribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ReadOnlyInternalAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReadOnlyInternalAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReadOnlyInternalAttribute"


    // $ANTLR start "entryRuleUpdatableInternalAttribute"
    // InternalJPADsl.g:603:1: entryRuleUpdatableInternalAttribute : ruleUpdatableInternalAttribute EOF ;
    public final void entryRuleUpdatableInternalAttribute() throws RecognitionException {
        try {
            // InternalJPADsl.g:604:1: ( ruleUpdatableInternalAttribute EOF )
            // InternalJPADsl.g:605:1: ruleUpdatableInternalAttribute EOF
            {
             before(grammarAccess.getUpdatableInternalAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleUpdatableInternalAttribute();

            state._fsp--;

             after(grammarAccess.getUpdatableInternalAttributeRule()); 
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
    // $ANTLR end "entryRuleUpdatableInternalAttribute"


    // $ANTLR start "ruleUpdatableInternalAttribute"
    // InternalJPADsl.g:612:1: ruleUpdatableInternalAttribute : ( ( rule__UpdatableInternalAttribute__Group__0 ) ) ;
    public final void ruleUpdatableInternalAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:616:2: ( ( ( rule__UpdatableInternalAttribute__Group__0 ) ) )
            // InternalJPADsl.g:617:2: ( ( rule__UpdatableInternalAttribute__Group__0 ) )
            {
            // InternalJPADsl.g:617:2: ( ( rule__UpdatableInternalAttribute__Group__0 ) )
            // InternalJPADsl.g:618:3: ( rule__UpdatableInternalAttribute__Group__0 )
            {
             before(grammarAccess.getUpdatableInternalAttributeAccess().getGroup()); 
            // InternalJPADsl.g:619:3: ( rule__UpdatableInternalAttribute__Group__0 )
            // InternalJPADsl.g:619:4: rule__UpdatableInternalAttribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UpdatableInternalAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUpdatableInternalAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUpdatableInternalAttribute"


    // $ANTLR start "entryRuleTransientAttribute"
    // InternalJPADsl.g:628:1: entryRuleTransientAttribute : ruleTransientAttribute EOF ;
    public final void entryRuleTransientAttribute() throws RecognitionException {
        try {
            // InternalJPADsl.g:629:1: ( ruleTransientAttribute EOF )
            // InternalJPADsl.g:630:1: ruleTransientAttribute EOF
            {
             before(grammarAccess.getTransientAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleTransientAttribute();

            state._fsp--;

             after(grammarAccess.getTransientAttributeRule()); 
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
    // $ANTLR end "entryRuleTransientAttribute"


    // $ANTLR start "ruleTransientAttribute"
    // InternalJPADsl.g:637:1: ruleTransientAttribute : ( ( rule__TransientAttribute__Group__0 ) ) ;
    public final void ruleTransientAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:641:2: ( ( ( rule__TransientAttribute__Group__0 ) ) )
            // InternalJPADsl.g:642:2: ( ( rule__TransientAttribute__Group__0 ) )
            {
            // InternalJPADsl.g:642:2: ( ( rule__TransientAttribute__Group__0 ) )
            // InternalJPADsl.g:643:3: ( rule__TransientAttribute__Group__0 )
            {
             before(grammarAccess.getTransientAttributeAccess().getGroup()); 
            // InternalJPADsl.g:644:3: ( rule__TransientAttribute__Group__0 )
            // InternalJPADsl.g:644:4: rule__TransientAttribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TransientAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTransientAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTransientAttribute"


    // $ANTLR start "entryRuleIdAttribute"
    // InternalJPADsl.g:653:1: entryRuleIdAttribute : ruleIdAttribute EOF ;
    public final void entryRuleIdAttribute() throws RecognitionException {
        try {
            // InternalJPADsl.g:654:1: ( ruleIdAttribute EOF )
            // InternalJPADsl.g:655:1: ruleIdAttribute EOF
            {
             before(grammarAccess.getIdAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleIdAttribute();

            state._fsp--;

             after(grammarAccess.getIdAttributeRule()); 
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
    // $ANTLR end "entryRuleIdAttribute"


    // $ANTLR start "ruleIdAttribute"
    // InternalJPADsl.g:662:1: ruleIdAttribute : ( ( rule__IdAttribute__Group__0 ) ) ;
    public final void ruleIdAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:666:2: ( ( ( rule__IdAttribute__Group__0 ) ) )
            // InternalJPADsl.g:667:2: ( ( rule__IdAttribute__Group__0 ) )
            {
            // InternalJPADsl.g:667:2: ( ( rule__IdAttribute__Group__0 ) )
            // InternalJPADsl.g:668:3: ( rule__IdAttribute__Group__0 )
            {
             before(grammarAccess.getIdAttributeAccess().getGroup()); 
            // InternalJPADsl.g:669:3: ( rule__IdAttribute__Group__0 )
            // InternalJPADsl.g:669:4: rule__IdAttribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IdAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIdAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIdAttribute"


    // $ANTLR start "entryRuleOneToOneRelationshipAttribute"
    // InternalJPADsl.g:678:1: entryRuleOneToOneRelationshipAttribute : ruleOneToOneRelationshipAttribute EOF ;
    public final void entryRuleOneToOneRelationshipAttribute() throws RecognitionException {
        try {
            // InternalJPADsl.g:679:1: ( ruleOneToOneRelationshipAttribute EOF )
            // InternalJPADsl.g:680:1: ruleOneToOneRelationshipAttribute EOF
            {
             before(grammarAccess.getOneToOneRelationshipAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleOneToOneRelationshipAttribute();

            state._fsp--;

             after(grammarAccess.getOneToOneRelationshipAttributeRule()); 
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
    // $ANTLR end "entryRuleOneToOneRelationshipAttribute"


    // $ANTLR start "ruleOneToOneRelationshipAttribute"
    // InternalJPADsl.g:687:1: ruleOneToOneRelationshipAttribute : ( ( rule__OneToOneRelationshipAttribute__Group__0 ) ) ;
    public final void ruleOneToOneRelationshipAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:691:2: ( ( ( rule__OneToOneRelationshipAttribute__Group__0 ) ) )
            // InternalJPADsl.g:692:2: ( ( rule__OneToOneRelationshipAttribute__Group__0 ) )
            {
            // InternalJPADsl.g:692:2: ( ( rule__OneToOneRelationshipAttribute__Group__0 ) )
            // InternalJPADsl.g:693:3: ( rule__OneToOneRelationshipAttribute__Group__0 )
            {
             before(grammarAccess.getOneToOneRelationshipAttributeAccess().getGroup()); 
            // InternalJPADsl.g:694:3: ( rule__OneToOneRelationshipAttribute__Group__0 )
            // InternalJPADsl.g:694:4: rule__OneToOneRelationshipAttribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OneToOneRelationshipAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOneToOneRelationshipAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOneToOneRelationshipAttribute"


    // $ANTLR start "entryRuleOneToOneMappedByRelationshipAttribute"
    // InternalJPADsl.g:703:1: entryRuleOneToOneMappedByRelationshipAttribute : ruleOneToOneMappedByRelationshipAttribute EOF ;
    public final void entryRuleOneToOneMappedByRelationshipAttribute() throws RecognitionException {
        try {
            // InternalJPADsl.g:704:1: ( ruleOneToOneMappedByRelationshipAttribute EOF )
            // InternalJPADsl.g:705:1: ruleOneToOneMappedByRelationshipAttribute EOF
            {
             before(grammarAccess.getOneToOneMappedByRelationshipAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleOneToOneMappedByRelationshipAttribute();

            state._fsp--;

             after(grammarAccess.getOneToOneMappedByRelationshipAttributeRule()); 
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
    // $ANTLR end "entryRuleOneToOneMappedByRelationshipAttribute"


    // $ANTLR start "ruleOneToOneMappedByRelationshipAttribute"
    // InternalJPADsl.g:712:1: ruleOneToOneMappedByRelationshipAttribute : ( ( rule__OneToOneMappedByRelationshipAttribute__Group__0 ) ) ;
    public final void ruleOneToOneMappedByRelationshipAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:716:2: ( ( ( rule__OneToOneMappedByRelationshipAttribute__Group__0 ) ) )
            // InternalJPADsl.g:717:2: ( ( rule__OneToOneMappedByRelationshipAttribute__Group__0 ) )
            {
            // InternalJPADsl.g:717:2: ( ( rule__OneToOneMappedByRelationshipAttribute__Group__0 ) )
            // InternalJPADsl.g:718:3: ( rule__OneToOneMappedByRelationshipAttribute__Group__0 )
            {
             before(grammarAccess.getOneToOneMappedByRelationshipAttributeAccess().getGroup()); 
            // InternalJPADsl.g:719:3: ( rule__OneToOneMappedByRelationshipAttribute__Group__0 )
            // InternalJPADsl.g:719:4: rule__OneToOneMappedByRelationshipAttribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OneToOneMappedByRelationshipAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOneToOneMappedByRelationshipAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOneToOneMappedByRelationshipAttribute"


    // $ANTLR start "entryRuleOneToManyJoinTableRelationshipAttribute"
    // InternalJPADsl.g:728:1: entryRuleOneToManyJoinTableRelationshipAttribute : ruleOneToManyJoinTableRelationshipAttribute EOF ;
    public final void entryRuleOneToManyJoinTableRelationshipAttribute() throws RecognitionException {
        try {
            // InternalJPADsl.g:729:1: ( ruleOneToManyJoinTableRelationshipAttribute EOF )
            // InternalJPADsl.g:730:1: ruleOneToManyJoinTableRelationshipAttribute EOF
            {
             before(grammarAccess.getOneToManyJoinTableRelationshipAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleOneToManyJoinTableRelationshipAttribute();

            state._fsp--;

             after(grammarAccess.getOneToManyJoinTableRelationshipAttributeRule()); 
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
    // $ANTLR end "entryRuleOneToManyJoinTableRelationshipAttribute"


    // $ANTLR start "ruleOneToManyJoinTableRelationshipAttribute"
    // InternalJPADsl.g:737:1: ruleOneToManyJoinTableRelationshipAttribute : ( ( rule__OneToManyJoinTableRelationshipAttribute__Group__0 ) ) ;
    public final void ruleOneToManyJoinTableRelationshipAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:741:2: ( ( ( rule__OneToManyJoinTableRelationshipAttribute__Group__0 ) ) )
            // InternalJPADsl.g:742:2: ( ( rule__OneToManyJoinTableRelationshipAttribute__Group__0 ) )
            {
            // InternalJPADsl.g:742:2: ( ( rule__OneToManyJoinTableRelationshipAttribute__Group__0 ) )
            // InternalJPADsl.g:743:3: ( rule__OneToManyJoinTableRelationshipAttribute__Group__0 )
            {
             before(grammarAccess.getOneToManyJoinTableRelationshipAttributeAccess().getGroup()); 
            // InternalJPADsl.g:744:3: ( rule__OneToManyJoinTableRelationshipAttribute__Group__0 )
            // InternalJPADsl.g:744:4: rule__OneToManyJoinTableRelationshipAttribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OneToManyJoinTableRelationshipAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOneToManyJoinTableRelationshipAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOneToManyJoinTableRelationshipAttribute"


    // $ANTLR start "entryRuleOneToManyJoinColumnRelationshipAttribute"
    // InternalJPADsl.g:753:1: entryRuleOneToManyJoinColumnRelationshipAttribute : ruleOneToManyJoinColumnRelationshipAttribute EOF ;
    public final void entryRuleOneToManyJoinColumnRelationshipAttribute() throws RecognitionException {
        try {
            // InternalJPADsl.g:754:1: ( ruleOneToManyJoinColumnRelationshipAttribute EOF )
            // InternalJPADsl.g:755:1: ruleOneToManyJoinColumnRelationshipAttribute EOF
            {
             before(grammarAccess.getOneToManyJoinColumnRelationshipAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleOneToManyJoinColumnRelationshipAttribute();

            state._fsp--;

             after(grammarAccess.getOneToManyJoinColumnRelationshipAttributeRule()); 
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
    // $ANTLR end "entryRuleOneToManyJoinColumnRelationshipAttribute"


    // $ANTLR start "ruleOneToManyJoinColumnRelationshipAttribute"
    // InternalJPADsl.g:762:1: ruleOneToManyJoinColumnRelationshipAttribute : ( ( rule__OneToManyJoinColumnRelationshipAttribute__Group__0 ) ) ;
    public final void ruleOneToManyJoinColumnRelationshipAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:766:2: ( ( ( rule__OneToManyJoinColumnRelationshipAttribute__Group__0 ) ) )
            // InternalJPADsl.g:767:2: ( ( rule__OneToManyJoinColumnRelationshipAttribute__Group__0 ) )
            {
            // InternalJPADsl.g:767:2: ( ( rule__OneToManyJoinColumnRelationshipAttribute__Group__0 ) )
            // InternalJPADsl.g:768:3: ( rule__OneToManyJoinColumnRelationshipAttribute__Group__0 )
            {
             before(grammarAccess.getOneToManyJoinColumnRelationshipAttributeAccess().getGroup()); 
            // InternalJPADsl.g:769:3: ( rule__OneToManyJoinColumnRelationshipAttribute__Group__0 )
            // InternalJPADsl.g:769:4: rule__OneToManyJoinColumnRelationshipAttribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OneToManyJoinColumnRelationshipAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOneToManyJoinColumnRelationshipAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOneToManyJoinColumnRelationshipAttribute"


    // $ANTLR start "entryRuleOneToManyMappedByRelationshipAttribute"
    // InternalJPADsl.g:778:1: entryRuleOneToManyMappedByRelationshipAttribute : ruleOneToManyMappedByRelationshipAttribute EOF ;
    public final void entryRuleOneToManyMappedByRelationshipAttribute() throws RecognitionException {
        try {
            // InternalJPADsl.g:779:1: ( ruleOneToManyMappedByRelationshipAttribute EOF )
            // InternalJPADsl.g:780:1: ruleOneToManyMappedByRelationshipAttribute EOF
            {
             before(grammarAccess.getOneToManyMappedByRelationshipAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleOneToManyMappedByRelationshipAttribute();

            state._fsp--;

             after(grammarAccess.getOneToManyMappedByRelationshipAttributeRule()); 
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
    // $ANTLR end "entryRuleOneToManyMappedByRelationshipAttribute"


    // $ANTLR start "ruleOneToManyMappedByRelationshipAttribute"
    // InternalJPADsl.g:787:1: ruleOneToManyMappedByRelationshipAttribute : ( ( rule__OneToManyMappedByRelationshipAttribute__Group__0 ) ) ;
    public final void ruleOneToManyMappedByRelationshipAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:791:2: ( ( ( rule__OneToManyMappedByRelationshipAttribute__Group__0 ) ) )
            // InternalJPADsl.g:792:2: ( ( rule__OneToManyMappedByRelationshipAttribute__Group__0 ) )
            {
            // InternalJPADsl.g:792:2: ( ( rule__OneToManyMappedByRelationshipAttribute__Group__0 ) )
            // InternalJPADsl.g:793:3: ( rule__OneToManyMappedByRelationshipAttribute__Group__0 )
            {
             before(grammarAccess.getOneToManyMappedByRelationshipAttributeAccess().getGroup()); 
            // InternalJPADsl.g:794:3: ( rule__OneToManyMappedByRelationshipAttribute__Group__0 )
            // InternalJPADsl.g:794:4: rule__OneToManyMappedByRelationshipAttribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OneToManyMappedByRelationshipAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOneToManyMappedByRelationshipAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOneToManyMappedByRelationshipAttribute"


    // $ANTLR start "entryRuleManyToOneJoinColumnRelationShipAttribute"
    // InternalJPADsl.g:803:1: entryRuleManyToOneJoinColumnRelationShipAttribute : ruleManyToOneJoinColumnRelationShipAttribute EOF ;
    public final void entryRuleManyToOneJoinColumnRelationShipAttribute() throws RecognitionException {
        try {
            // InternalJPADsl.g:804:1: ( ruleManyToOneJoinColumnRelationShipAttribute EOF )
            // InternalJPADsl.g:805:1: ruleManyToOneJoinColumnRelationShipAttribute EOF
            {
             before(grammarAccess.getManyToOneJoinColumnRelationShipAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleManyToOneJoinColumnRelationShipAttribute();

            state._fsp--;

             after(grammarAccess.getManyToOneJoinColumnRelationShipAttributeRule()); 
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
    // $ANTLR end "entryRuleManyToOneJoinColumnRelationShipAttribute"


    // $ANTLR start "ruleManyToOneJoinColumnRelationShipAttribute"
    // InternalJPADsl.g:812:1: ruleManyToOneJoinColumnRelationShipAttribute : ( ( rule__ManyToOneJoinColumnRelationShipAttribute__Group__0 ) ) ;
    public final void ruleManyToOneJoinColumnRelationShipAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:816:2: ( ( ( rule__ManyToOneJoinColumnRelationShipAttribute__Group__0 ) ) )
            // InternalJPADsl.g:817:2: ( ( rule__ManyToOneJoinColumnRelationShipAttribute__Group__0 ) )
            {
            // InternalJPADsl.g:817:2: ( ( rule__ManyToOneJoinColumnRelationShipAttribute__Group__0 ) )
            // InternalJPADsl.g:818:3: ( rule__ManyToOneJoinColumnRelationShipAttribute__Group__0 )
            {
             before(grammarAccess.getManyToOneJoinColumnRelationShipAttributeAccess().getGroup()); 
            // InternalJPADsl.g:819:3: ( rule__ManyToOneJoinColumnRelationShipAttribute__Group__0 )
            // InternalJPADsl.g:819:4: rule__ManyToOneJoinColumnRelationShipAttribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ManyToOneJoinColumnRelationShipAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getManyToOneJoinColumnRelationShipAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleManyToOneJoinColumnRelationShipAttribute"


    // $ANTLR start "entryRuleManyToOneJoinTableRelationShipAttribute"
    // InternalJPADsl.g:828:1: entryRuleManyToOneJoinTableRelationShipAttribute : ruleManyToOneJoinTableRelationShipAttribute EOF ;
    public final void entryRuleManyToOneJoinTableRelationShipAttribute() throws RecognitionException {
        try {
            // InternalJPADsl.g:829:1: ( ruleManyToOneJoinTableRelationShipAttribute EOF )
            // InternalJPADsl.g:830:1: ruleManyToOneJoinTableRelationShipAttribute EOF
            {
             before(grammarAccess.getManyToOneJoinTableRelationShipAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleManyToOneJoinTableRelationShipAttribute();

            state._fsp--;

             after(grammarAccess.getManyToOneJoinTableRelationShipAttributeRule()); 
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
    // $ANTLR end "entryRuleManyToOneJoinTableRelationShipAttribute"


    // $ANTLR start "ruleManyToOneJoinTableRelationShipAttribute"
    // InternalJPADsl.g:837:1: ruleManyToOneJoinTableRelationShipAttribute : ( ( rule__ManyToOneJoinTableRelationShipAttribute__Group__0 ) ) ;
    public final void ruleManyToOneJoinTableRelationShipAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:841:2: ( ( ( rule__ManyToOneJoinTableRelationShipAttribute__Group__0 ) ) )
            // InternalJPADsl.g:842:2: ( ( rule__ManyToOneJoinTableRelationShipAttribute__Group__0 ) )
            {
            // InternalJPADsl.g:842:2: ( ( rule__ManyToOneJoinTableRelationShipAttribute__Group__0 ) )
            // InternalJPADsl.g:843:3: ( rule__ManyToOneJoinTableRelationShipAttribute__Group__0 )
            {
             before(grammarAccess.getManyToOneJoinTableRelationShipAttributeAccess().getGroup()); 
            // InternalJPADsl.g:844:3: ( rule__ManyToOneJoinTableRelationShipAttribute__Group__0 )
            // InternalJPADsl.g:844:4: rule__ManyToOneJoinTableRelationShipAttribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ManyToOneJoinTableRelationShipAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getManyToOneJoinTableRelationShipAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleManyToOneJoinTableRelationShipAttribute"


    // $ANTLR start "entryRuleManyToOneMappedByRelationShipAttribute"
    // InternalJPADsl.g:853:1: entryRuleManyToOneMappedByRelationShipAttribute : ruleManyToOneMappedByRelationShipAttribute EOF ;
    public final void entryRuleManyToOneMappedByRelationShipAttribute() throws RecognitionException {
        try {
            // InternalJPADsl.g:854:1: ( ruleManyToOneMappedByRelationShipAttribute EOF )
            // InternalJPADsl.g:855:1: ruleManyToOneMappedByRelationShipAttribute EOF
            {
             before(grammarAccess.getManyToOneMappedByRelationShipAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleManyToOneMappedByRelationShipAttribute();

            state._fsp--;

             after(grammarAccess.getManyToOneMappedByRelationShipAttributeRule()); 
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
    // $ANTLR end "entryRuleManyToOneMappedByRelationShipAttribute"


    // $ANTLR start "ruleManyToOneMappedByRelationShipAttribute"
    // InternalJPADsl.g:862:1: ruleManyToOneMappedByRelationShipAttribute : ( ( rule__ManyToOneMappedByRelationShipAttribute__Group__0 ) ) ;
    public final void ruleManyToOneMappedByRelationShipAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:866:2: ( ( ( rule__ManyToOneMappedByRelationShipAttribute__Group__0 ) ) )
            // InternalJPADsl.g:867:2: ( ( rule__ManyToOneMappedByRelationShipAttribute__Group__0 ) )
            {
            // InternalJPADsl.g:867:2: ( ( rule__ManyToOneMappedByRelationShipAttribute__Group__0 ) )
            // InternalJPADsl.g:868:3: ( rule__ManyToOneMappedByRelationShipAttribute__Group__0 )
            {
             before(grammarAccess.getManyToOneMappedByRelationShipAttributeAccess().getGroup()); 
            // InternalJPADsl.g:869:3: ( rule__ManyToOneMappedByRelationShipAttribute__Group__0 )
            // InternalJPADsl.g:869:4: rule__ManyToOneMappedByRelationShipAttribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ManyToOneMappedByRelationShipAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getManyToOneMappedByRelationShipAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleManyToOneMappedByRelationShipAttribute"


    // $ANTLR start "entryRuleManyToManyRelationshipAttribute"
    // InternalJPADsl.g:878:1: entryRuleManyToManyRelationshipAttribute : ruleManyToManyRelationshipAttribute EOF ;
    public final void entryRuleManyToManyRelationshipAttribute() throws RecognitionException {
        try {
            // InternalJPADsl.g:879:1: ( ruleManyToManyRelationshipAttribute EOF )
            // InternalJPADsl.g:880:1: ruleManyToManyRelationshipAttribute EOF
            {
             before(grammarAccess.getManyToManyRelationshipAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleManyToManyRelationshipAttribute();

            state._fsp--;

             after(grammarAccess.getManyToManyRelationshipAttributeRule()); 
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
    // $ANTLR end "entryRuleManyToManyRelationshipAttribute"


    // $ANTLR start "ruleManyToManyRelationshipAttribute"
    // InternalJPADsl.g:887:1: ruleManyToManyRelationshipAttribute : ( ( rule__ManyToManyRelationshipAttribute__Group__0 ) ) ;
    public final void ruleManyToManyRelationshipAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:891:2: ( ( ( rule__ManyToManyRelationshipAttribute__Group__0 ) ) )
            // InternalJPADsl.g:892:2: ( ( rule__ManyToManyRelationshipAttribute__Group__0 ) )
            {
            // InternalJPADsl.g:892:2: ( ( rule__ManyToManyRelationshipAttribute__Group__0 ) )
            // InternalJPADsl.g:893:3: ( rule__ManyToManyRelationshipAttribute__Group__0 )
            {
             before(grammarAccess.getManyToManyRelationshipAttributeAccess().getGroup()); 
            // InternalJPADsl.g:894:3: ( rule__ManyToManyRelationshipAttribute__Group__0 )
            // InternalJPADsl.g:894:4: rule__ManyToManyRelationshipAttribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ManyToManyRelationshipAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getManyToManyRelationshipAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleManyToManyRelationshipAttribute"


    // $ANTLR start "entryRuleManyToManyMappedByRelationshipAttribute"
    // InternalJPADsl.g:903:1: entryRuleManyToManyMappedByRelationshipAttribute : ruleManyToManyMappedByRelationshipAttribute EOF ;
    public final void entryRuleManyToManyMappedByRelationshipAttribute() throws RecognitionException {
        try {
            // InternalJPADsl.g:904:1: ( ruleManyToManyMappedByRelationshipAttribute EOF )
            // InternalJPADsl.g:905:1: ruleManyToManyMappedByRelationshipAttribute EOF
            {
             before(grammarAccess.getManyToManyMappedByRelationshipAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleManyToManyMappedByRelationshipAttribute();

            state._fsp--;

             after(grammarAccess.getManyToManyMappedByRelationshipAttributeRule()); 
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
    // $ANTLR end "entryRuleManyToManyMappedByRelationshipAttribute"


    // $ANTLR start "ruleManyToManyMappedByRelationshipAttribute"
    // InternalJPADsl.g:912:1: ruleManyToManyMappedByRelationshipAttribute : ( ( rule__ManyToManyMappedByRelationshipAttribute__Group__0 ) ) ;
    public final void ruleManyToManyMappedByRelationshipAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:916:2: ( ( ( rule__ManyToManyMappedByRelationshipAttribute__Group__0 ) ) )
            // InternalJPADsl.g:917:2: ( ( rule__ManyToManyMappedByRelationshipAttribute__Group__0 ) )
            {
            // InternalJPADsl.g:917:2: ( ( rule__ManyToManyMappedByRelationshipAttribute__Group__0 ) )
            // InternalJPADsl.g:918:3: ( rule__ManyToManyMappedByRelationshipAttribute__Group__0 )
            {
             before(grammarAccess.getManyToManyMappedByRelationshipAttributeAccess().getGroup()); 
            // InternalJPADsl.g:919:3: ( rule__ManyToManyMappedByRelationshipAttribute__Group__0 )
            // InternalJPADsl.g:919:4: rule__ManyToManyMappedByRelationshipAttribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ManyToManyMappedByRelationshipAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getManyToManyMappedByRelationshipAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleManyToManyMappedByRelationshipAttribute"


    // $ANTLR start "entryRuleReference"
    // InternalJPADsl.g:928:1: entryRuleReference : ruleReference EOF ;
    public final void entryRuleReference() throws RecognitionException {
        try {
            // InternalJPADsl.g:929:1: ( ruleReference EOF )
            // InternalJPADsl.g:930:1: ruleReference EOF
            {
             before(grammarAccess.getReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleReference();

            state._fsp--;

             after(grammarAccess.getReferenceRule()); 
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
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // InternalJPADsl.g:937:1: ruleReference : ( ( rule__Reference__Group__0 ) ) ;
    public final void ruleReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:941:2: ( ( ( rule__Reference__Group__0 ) ) )
            // InternalJPADsl.g:942:2: ( ( rule__Reference__Group__0 ) )
            {
            // InternalJPADsl.g:942:2: ( ( rule__Reference__Group__0 ) )
            // InternalJPADsl.g:943:3: ( rule__Reference__Group__0 )
            {
             before(grammarAccess.getReferenceAccess().getGroup()); 
            // InternalJPADsl.g:944:3: ( rule__Reference__Group__0 )
            // InternalJPADsl.g:944:4: rule__Reference__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Reference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReference"


    // $ANTLR start "entryRuleOperation"
    // InternalJPADsl.g:953:1: entryRuleOperation : ruleOperation EOF ;
    public final void entryRuleOperation() throws RecognitionException {
        try {
            // InternalJPADsl.g:954:1: ( ruleOperation EOF )
            // InternalJPADsl.g:955:1: ruleOperation EOF
            {
             before(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getOperationRule()); 
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
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalJPADsl.g:962:1: ruleOperation : ( ( rule__Operation__Group__0 ) ) ;
    public final void ruleOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:966:2: ( ( ( rule__Operation__Group__0 ) ) )
            // InternalJPADsl.g:967:2: ( ( rule__Operation__Group__0 ) )
            {
            // InternalJPADsl.g:967:2: ( ( rule__Operation__Group__0 ) )
            // InternalJPADsl.g:968:3: ( rule__Operation__Group__0 )
            {
             before(grammarAccess.getOperationAccess().getGroup()); 
            // InternalJPADsl.g:969:3: ( rule__Operation__Group__0 )
            // InternalJPADsl.g:969:4: rule__Operation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleParameter"
    // InternalJPADsl.g:978:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalJPADsl.g:979:1: ( ruleParameter EOF )
            // InternalJPADsl.g:980:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalJPADsl.g:987:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:991:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalJPADsl.g:992:2: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalJPADsl.g:992:2: ( ( rule__Parameter__Group__0 ) )
            // InternalJPADsl.g:993:3: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // InternalJPADsl.g:994:3: ( rule__Parameter__Group__0 )
            // InternalJPADsl.g:994:4: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleTypeRef"
    // InternalJPADsl.g:1003:1: entryRuleTypeRef : ruleTypeRef EOF ;
    public final void entryRuleTypeRef() throws RecognitionException {
        try {
            // InternalJPADsl.g:1004:1: ( ruleTypeRef EOF )
            // InternalJPADsl.g:1005:1: ruleTypeRef EOF
            {
             before(grammarAccess.getTypeRefRule()); 
            pushFollow(FOLLOW_1);
            ruleTypeRef();

            state._fsp--;

             after(grammarAccess.getTypeRefRule()); 
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
    // $ANTLR end "entryRuleTypeRef"


    // $ANTLR start "ruleTypeRef"
    // InternalJPADsl.g:1012:1: ruleTypeRef : ( ( rule__TypeRef__Group__0 ) ) ;
    public final void ruleTypeRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:1016:2: ( ( ( rule__TypeRef__Group__0 ) ) )
            // InternalJPADsl.g:1017:2: ( ( rule__TypeRef__Group__0 ) )
            {
            // InternalJPADsl.g:1017:2: ( ( rule__TypeRef__Group__0 ) )
            // InternalJPADsl.g:1018:3: ( rule__TypeRef__Group__0 )
            {
             before(grammarAccess.getTypeRefAccess().getGroup()); 
            // InternalJPADsl.g:1019:3: ( rule__TypeRef__Group__0 )
            // InternalJPADsl.g:1019:4: rule__TypeRef__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TypeRef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeRefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeRef"


    // $ANTLR start "entryRuleQualifiedNameWithWildCard"
    // InternalJPADsl.g:1028:1: entryRuleQualifiedNameWithWildCard : ruleQualifiedNameWithWildCard EOF ;
    public final void entryRuleQualifiedNameWithWildCard() throws RecognitionException {
        try {
            // InternalJPADsl.g:1029:1: ( ruleQualifiedNameWithWildCard EOF )
            // InternalJPADsl.g:1030:1: ruleQualifiedNameWithWildCard EOF
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
    // InternalJPADsl.g:1037:1: ruleQualifiedNameWithWildCard : ( ( rule__QualifiedNameWithWildCard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildCard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:1041:2: ( ( ( rule__QualifiedNameWithWildCard__Group__0 ) ) )
            // InternalJPADsl.g:1042:2: ( ( rule__QualifiedNameWithWildCard__Group__0 ) )
            {
            // InternalJPADsl.g:1042:2: ( ( rule__QualifiedNameWithWildCard__Group__0 ) )
            // InternalJPADsl.g:1043:3: ( rule__QualifiedNameWithWildCard__Group__0 )
            {
             before(grammarAccess.getQualifiedNameWithWildCardAccess().getGroup()); 
            // InternalJPADsl.g:1044:3: ( rule__QualifiedNameWithWildCard__Group__0 )
            // InternalJPADsl.g:1044:4: rule__QualifiedNameWithWildCard__Group__0
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
    // InternalJPADsl.g:1053:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalJPADsl.g:1054:1: ( ruleQualifiedName EOF )
            // InternalJPADsl.g:1055:1: ruleQualifiedName EOF
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
    // InternalJPADsl.g:1062:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:1066:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalJPADsl.g:1067:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalJPADsl.g:1067:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalJPADsl.g:1068:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalJPADsl.g:1069:3: ( rule__QualifiedName__Group__0 )
            // InternalJPADsl.g:1069:4: rule__QualifiedName__Group__0
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


    // $ANTLR start "ruleVisibility"
    // InternalJPADsl.g:1078:1: ruleVisibility : ( ( rule__Visibility__Alternatives ) ) ;
    public final void ruleVisibility() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:1082:1: ( ( ( rule__Visibility__Alternatives ) ) )
            // InternalJPADsl.g:1083:2: ( ( rule__Visibility__Alternatives ) )
            {
            // InternalJPADsl.g:1083:2: ( ( rule__Visibility__Alternatives ) )
            // InternalJPADsl.g:1084:3: ( rule__Visibility__Alternatives )
            {
             before(grammarAccess.getVisibilityAccess().getAlternatives()); 
            // InternalJPADsl.g:1085:3: ( rule__Visibility__Alternatives )
            // InternalJPADsl.g:1085:4: rule__Visibility__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Visibility__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVisibilityAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVisibility"


    // $ANTLR start "rule__AbstractElement__Alternatives"
    // InternalJPADsl.g:1093:1: rule__AbstractElement__Alternatives : ( ( rulePackageDeclaration ) | ( ruleType ) | ( ruleImport ) | ( ruleRelationshipAttribute ) );
    public final void rule__AbstractElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:1097:1: ( ( rulePackageDeclaration ) | ( ruleType ) | ( ruleImport ) | ( ruleRelationshipAttribute ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt2=1;
                }
                break;
            case 18:
            case 20:
                {
                alt2=2;
                }
                break;
            case 14:
                {
                alt2=3;
                }
                break;
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
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalJPADsl.g:1098:2: ( rulePackageDeclaration )
                    {
                    // InternalJPADsl.g:1098:2: ( rulePackageDeclaration )
                    // InternalJPADsl.g:1099:3: rulePackageDeclaration
                    {
                     before(grammarAccess.getAbstractElementAccess().getPackageDeclarationParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePackageDeclaration();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getPackageDeclarationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJPADsl.g:1104:2: ( ruleType )
                    {
                    // InternalJPADsl.g:1104:2: ( ruleType )
                    // InternalJPADsl.g:1105:3: ruleType
                    {
                     before(grammarAccess.getAbstractElementAccess().getTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleType();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalJPADsl.g:1110:2: ( ruleImport )
                    {
                    // InternalJPADsl.g:1110:2: ( ruleImport )
                    // InternalJPADsl.g:1111:3: ruleImport
                    {
                     before(grammarAccess.getAbstractElementAccess().getImportParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleImport();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getImportParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalJPADsl.g:1116:2: ( ruleRelationshipAttribute )
                    {
                    // InternalJPADsl.g:1116:2: ( ruleRelationshipAttribute )
                    // InternalJPADsl.g:1117:3: ruleRelationshipAttribute
                    {
                     before(grammarAccess.getAbstractElementAccess().getRelationshipAttributeParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleRelationshipAttribute();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getRelationshipAttributeParserRuleCall_3()); 

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
    // $ANTLR end "rule__AbstractElement__Alternatives"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalJPADsl.g:1126:1: rule__Type__Alternatives : ( ( ruleEntity ) | ( ruleDataType ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:1130:1: ( ( ruleEntity ) | ( ruleDataType ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==20) ) {
                alt3=1;
            }
            else if ( (LA3_0==18) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalJPADsl.g:1131:2: ( ruleEntity )
                    {
                    // InternalJPADsl.g:1131:2: ( ruleEntity )
                    // InternalJPADsl.g:1132:3: ruleEntity
                    {
                     before(grammarAccess.getTypeAccess().getEntityParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleEntity();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getEntityParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJPADsl.g:1137:2: ( ruleDataType )
                    {
                    // InternalJPADsl.g:1137:2: ( ruleDataType )
                    // InternalJPADsl.g:1138:3: ruleDataType
                    {
                     before(grammarAccess.getTypeAccess().getDataTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDataType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getDataTypeParserRuleCall_1()); 

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


    // $ANTLR start "rule__Identifier__Alternatives"
    // InternalJPADsl.g:1147:1: rule__Identifier__Alternatives : ( ( ruleUniqueIdentiferColumn ) | ( ruleEmbeddedUniqueIdentifer ) );
    public final void rule__Identifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:1151:1: ( ( ruleUniqueIdentiferColumn ) | ( ruleEmbeddedUniqueIdentifer ) )
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
                    // InternalJPADsl.g:1152:2: ( ruleUniqueIdentiferColumn )
                    {
                    // InternalJPADsl.g:1152:2: ( ruleUniqueIdentiferColumn )
                    // InternalJPADsl.g:1153:3: ruleUniqueIdentiferColumn
                    {
                     before(grammarAccess.getIdentifierAccess().getUniqueIdentiferColumnParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleUniqueIdentiferColumn();

                    state._fsp--;

                     after(grammarAccess.getIdentifierAccess().getUniqueIdentiferColumnParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJPADsl.g:1158:2: ( ruleEmbeddedUniqueIdentifer )
                    {
                    // InternalJPADsl.g:1158:2: ( ruleEmbeddedUniqueIdentifer )
                    // InternalJPADsl.g:1159:3: ruleEmbeddedUniqueIdentifer
                    {
                     before(grammarAccess.getIdentifierAccess().getEmbeddedUniqueIdentiferParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEmbeddedUniqueIdentifer();

                    state._fsp--;

                     after(grammarAccess.getIdentifierAccess().getEmbeddedUniqueIdentiferParserRuleCall_1()); 

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
    // $ANTLR end "rule__Identifier__Alternatives"


    // $ANTLR start "rule__Feature__Alternatives"
    // InternalJPADsl.g:1168:1: rule__Feature__Alternatives : ( ( ruleStructuralFeature ) | ( ruleOperation ) );
    public final void rule__Feature__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:1172:1: ( ( ruleStructuralFeature ) | ( ruleOperation ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID||LA5_0==26||(LA5_0>=28 && LA5_0<=41)) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=11 && LA5_0<=13)||LA5_0==43) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalJPADsl.g:1173:2: ( ruleStructuralFeature )
                    {
                    // InternalJPADsl.g:1173:2: ( ruleStructuralFeature )
                    // InternalJPADsl.g:1174:3: ruleStructuralFeature
                    {
                     before(grammarAccess.getFeatureAccess().getStructuralFeatureParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleStructuralFeature();

                    state._fsp--;

                     after(grammarAccess.getFeatureAccess().getStructuralFeatureParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJPADsl.g:1179:2: ( ruleOperation )
                    {
                    // InternalJPADsl.g:1179:2: ( ruleOperation )
                    // InternalJPADsl.g:1180:3: ruleOperation
                    {
                     before(grammarAccess.getFeatureAccess().getOperationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleOperation();

                    state._fsp--;

                     after(grammarAccess.getFeatureAccess().getOperationParserRuleCall_1()); 

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
    // $ANTLR end "rule__Feature__Alternatives"


    // $ANTLR start "rule__StructuralFeature__Alternatives"
    // InternalJPADsl.g:1189:1: rule__StructuralFeature__Alternatives : ( ( ruleAttribute ) | ( ruleReference ) );
    public final void rule__StructuralFeature__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:1193:1: ( ( ruleAttribute ) | ( ruleReference ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID||LA6_0==26||(LA6_0>=28 && LA6_0<=40)) ) {
                alt6=1;
            }
            else if ( (LA6_0==41) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalJPADsl.g:1194:2: ( ruleAttribute )
                    {
                    // InternalJPADsl.g:1194:2: ( ruleAttribute )
                    // InternalJPADsl.g:1195:3: ruleAttribute
                    {
                     before(grammarAccess.getStructuralFeatureAccess().getAttributeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAttribute();

                    state._fsp--;

                     after(grammarAccess.getStructuralFeatureAccess().getAttributeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJPADsl.g:1200:2: ( ruleReference )
                    {
                    // InternalJPADsl.g:1200:2: ( ruleReference )
                    // InternalJPADsl.g:1201:3: ruleReference
                    {
                     before(grammarAccess.getStructuralFeatureAccess().getReferenceParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleReference();

                    state._fsp--;

                     after(grammarAccess.getStructuralFeatureAccess().getReferenceParserRuleCall_1()); 

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
    // $ANTLR end "rule__StructuralFeature__Alternatives"


    // $ANTLR start "rule__Attribute__Alternatives"
    // InternalJPADsl.g:1210:1: rule__Attribute__Alternatives : ( ( ruleInternalAttribute ) | ( ruleRelationshipAttribute ) | ( ruleStaticAttribute ) );
    public final void rule__Attribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:1214:1: ( ( ruleInternalAttribute ) | ( ruleRelationshipAttribute ) | ( ruleStaticAttribute ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 28:
            case 29:
            case 30:
                {
                alt7=1;
                }
                break;
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
                {
                alt7=2;
                }
                break;
            case 26:
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
                    // InternalJPADsl.g:1215:2: ( ruleInternalAttribute )
                    {
                    // InternalJPADsl.g:1215:2: ( ruleInternalAttribute )
                    // InternalJPADsl.g:1216:3: ruleInternalAttribute
                    {
                     before(grammarAccess.getAttributeAccess().getInternalAttributeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleInternalAttribute();

                    state._fsp--;

                     after(grammarAccess.getAttributeAccess().getInternalAttributeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJPADsl.g:1221:2: ( ruleRelationshipAttribute )
                    {
                    // InternalJPADsl.g:1221:2: ( ruleRelationshipAttribute )
                    // InternalJPADsl.g:1222:3: ruleRelationshipAttribute
                    {
                     before(grammarAccess.getAttributeAccess().getRelationshipAttributeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRelationshipAttribute();

                    state._fsp--;

                     after(grammarAccess.getAttributeAccess().getRelationshipAttributeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalJPADsl.g:1227:2: ( ruleStaticAttribute )
                    {
                    // InternalJPADsl.g:1227:2: ( ruleStaticAttribute )
                    // InternalJPADsl.g:1228:3: ruleStaticAttribute
                    {
                     before(grammarAccess.getAttributeAccess().getStaticAttributeParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleStaticAttribute();

                    state._fsp--;

                     after(grammarAccess.getAttributeAccess().getStaticAttributeParserRuleCall_2()); 

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
    // $ANTLR end "rule__Attribute__Alternatives"


    // $ANTLR start "rule__InternalAttribute__Alternatives"
    // InternalJPADsl.g:1237:1: rule__InternalAttribute__Alternatives : ( ( ruleReadOnlyInternalAttribute ) | ( ruleUpdatableInternalAttribute ) | ( ruleTransientAttribute ) | ( ruleIdAttribute ) );
    public final void rule__InternalAttribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:1241:1: ( ( ruleReadOnlyInternalAttribute ) | ( ruleUpdatableInternalAttribute ) | ( ruleTransientAttribute ) | ( ruleIdAttribute ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt8=1;
                }
                break;
            case 28:
                {
                alt8=2;
                }
                break;
            case 29:
                {
                alt8=3;
                }
                break;
            case 30:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalJPADsl.g:1242:2: ( ruleReadOnlyInternalAttribute )
                    {
                    // InternalJPADsl.g:1242:2: ( ruleReadOnlyInternalAttribute )
                    // InternalJPADsl.g:1243:3: ruleReadOnlyInternalAttribute
                    {
                     before(grammarAccess.getInternalAttributeAccess().getReadOnlyInternalAttributeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleReadOnlyInternalAttribute();

                    state._fsp--;

                     after(grammarAccess.getInternalAttributeAccess().getReadOnlyInternalAttributeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJPADsl.g:1248:2: ( ruleUpdatableInternalAttribute )
                    {
                    // InternalJPADsl.g:1248:2: ( ruleUpdatableInternalAttribute )
                    // InternalJPADsl.g:1249:3: ruleUpdatableInternalAttribute
                    {
                     before(grammarAccess.getInternalAttributeAccess().getUpdatableInternalAttributeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleUpdatableInternalAttribute();

                    state._fsp--;

                     after(grammarAccess.getInternalAttributeAccess().getUpdatableInternalAttributeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalJPADsl.g:1254:2: ( ruleTransientAttribute )
                    {
                    // InternalJPADsl.g:1254:2: ( ruleTransientAttribute )
                    // InternalJPADsl.g:1255:3: ruleTransientAttribute
                    {
                     before(grammarAccess.getInternalAttributeAccess().getTransientAttributeParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleTransientAttribute();

                    state._fsp--;

                     after(grammarAccess.getInternalAttributeAccess().getTransientAttributeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalJPADsl.g:1260:2: ( ruleIdAttribute )
                    {
                    // InternalJPADsl.g:1260:2: ( ruleIdAttribute )
                    // InternalJPADsl.g:1261:3: ruleIdAttribute
                    {
                     before(grammarAccess.getInternalAttributeAccess().getIdAttributeParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleIdAttribute();

                    state._fsp--;

                     after(grammarAccess.getInternalAttributeAccess().getIdAttributeParserRuleCall_3()); 

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
    // $ANTLR end "rule__InternalAttribute__Alternatives"


    // $ANTLR start "rule__RelationshipAttribute__Alternatives"
    // InternalJPADsl.g:1270:1: rule__RelationshipAttribute__Alternatives : ( ( ruleSingularRelationshipAttribute ) | ( ruleMultipleRelationshipAttribute ) );
    public final void rule__RelationshipAttribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:1274:1: ( ( ruleSingularRelationshipAttribute ) | ( ruleMultipleRelationshipAttribute ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=31 && LA9_0<=32)||(LA9_0>=36 && LA9_0<=38)) ) {
                alt9=1;
            }
            else if ( ((LA9_0>=33 && LA9_0<=35)||(LA9_0>=39 && LA9_0<=40)) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalJPADsl.g:1275:2: ( ruleSingularRelationshipAttribute )
                    {
                    // InternalJPADsl.g:1275:2: ( ruleSingularRelationshipAttribute )
                    // InternalJPADsl.g:1276:3: ruleSingularRelationshipAttribute
                    {
                     before(grammarAccess.getRelationshipAttributeAccess().getSingularRelationshipAttributeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSingularRelationshipAttribute();

                    state._fsp--;

                     after(grammarAccess.getRelationshipAttributeAccess().getSingularRelationshipAttributeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJPADsl.g:1281:2: ( ruleMultipleRelationshipAttribute )
                    {
                    // InternalJPADsl.g:1281:2: ( ruleMultipleRelationshipAttribute )
                    // InternalJPADsl.g:1282:3: ruleMultipleRelationshipAttribute
                    {
                     before(grammarAccess.getRelationshipAttributeAccess().getMultipleRelationshipAttributeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleMultipleRelationshipAttribute();

                    state._fsp--;

                     after(grammarAccess.getRelationshipAttributeAccess().getMultipleRelationshipAttributeParserRuleCall_1()); 

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
    // $ANTLR end "rule__RelationshipAttribute__Alternatives"


    // $ANTLR start "rule__SingularRelationshipAttribute__Alternatives"
    // InternalJPADsl.g:1291:1: rule__SingularRelationshipAttribute__Alternatives : ( ( ruleOneToOneRelationshipAttribute ) | ( ruleOneToOneMappedByRelationshipAttribute ) | ( ruleManyToOneJoinColumnRelationShipAttribute ) | ( ruleManyToOneJoinTableRelationShipAttribute ) | ( ruleManyToOneMappedByRelationShipAttribute ) );
    public final void rule__SingularRelationshipAttribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:1295:1: ( ( ruleOneToOneRelationshipAttribute ) | ( ruleOneToOneMappedByRelationshipAttribute ) | ( ruleManyToOneJoinColumnRelationShipAttribute ) | ( ruleManyToOneJoinTableRelationShipAttribute ) | ( ruleManyToOneMappedByRelationShipAttribute ) )
            int alt10=5;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt10=1;
                }
                break;
            case 32:
                {
                alt10=2;
                }
                break;
            case 36:
                {
                alt10=3;
                }
                break;
            case 37:
                {
                alt10=4;
                }
                break;
            case 38:
                {
                alt10=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalJPADsl.g:1296:2: ( ruleOneToOneRelationshipAttribute )
                    {
                    // InternalJPADsl.g:1296:2: ( ruleOneToOneRelationshipAttribute )
                    // InternalJPADsl.g:1297:3: ruleOneToOneRelationshipAttribute
                    {
                     before(grammarAccess.getSingularRelationshipAttributeAccess().getOneToOneRelationshipAttributeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleOneToOneRelationshipAttribute();

                    state._fsp--;

                     after(grammarAccess.getSingularRelationshipAttributeAccess().getOneToOneRelationshipAttributeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJPADsl.g:1302:2: ( ruleOneToOneMappedByRelationshipAttribute )
                    {
                    // InternalJPADsl.g:1302:2: ( ruleOneToOneMappedByRelationshipAttribute )
                    // InternalJPADsl.g:1303:3: ruleOneToOneMappedByRelationshipAttribute
                    {
                     before(grammarAccess.getSingularRelationshipAttributeAccess().getOneToOneMappedByRelationshipAttributeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleOneToOneMappedByRelationshipAttribute();

                    state._fsp--;

                     after(grammarAccess.getSingularRelationshipAttributeAccess().getOneToOneMappedByRelationshipAttributeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalJPADsl.g:1308:2: ( ruleManyToOneJoinColumnRelationShipAttribute )
                    {
                    // InternalJPADsl.g:1308:2: ( ruleManyToOneJoinColumnRelationShipAttribute )
                    // InternalJPADsl.g:1309:3: ruleManyToOneJoinColumnRelationShipAttribute
                    {
                     before(grammarAccess.getSingularRelationshipAttributeAccess().getManyToOneJoinColumnRelationShipAttributeParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleManyToOneJoinColumnRelationShipAttribute();

                    state._fsp--;

                     after(grammarAccess.getSingularRelationshipAttributeAccess().getManyToOneJoinColumnRelationShipAttributeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalJPADsl.g:1314:2: ( ruleManyToOneJoinTableRelationShipAttribute )
                    {
                    // InternalJPADsl.g:1314:2: ( ruleManyToOneJoinTableRelationShipAttribute )
                    // InternalJPADsl.g:1315:3: ruleManyToOneJoinTableRelationShipAttribute
                    {
                     before(grammarAccess.getSingularRelationshipAttributeAccess().getManyToOneJoinTableRelationShipAttributeParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleManyToOneJoinTableRelationShipAttribute();

                    state._fsp--;

                     after(grammarAccess.getSingularRelationshipAttributeAccess().getManyToOneJoinTableRelationShipAttributeParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalJPADsl.g:1320:2: ( ruleManyToOneMappedByRelationShipAttribute )
                    {
                    // InternalJPADsl.g:1320:2: ( ruleManyToOneMappedByRelationShipAttribute )
                    // InternalJPADsl.g:1321:3: ruleManyToOneMappedByRelationShipAttribute
                    {
                     before(grammarAccess.getSingularRelationshipAttributeAccess().getManyToOneMappedByRelationShipAttributeParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleManyToOneMappedByRelationShipAttribute();

                    state._fsp--;

                     after(grammarAccess.getSingularRelationshipAttributeAccess().getManyToOneMappedByRelationShipAttributeParserRuleCall_4()); 

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
    // $ANTLR end "rule__SingularRelationshipAttribute__Alternatives"


    // $ANTLR start "rule__MultipleRelationshipAttribute__Alternatives"
    // InternalJPADsl.g:1330:1: rule__MultipleRelationshipAttribute__Alternatives : ( ( ruleOneToManyJoinTableRelationshipAttribute ) | ( ruleOneToManyMappedByRelationshipAttribute ) | ( ruleManyToManyRelationshipAttribute ) | ( ruleManyToManyMappedByRelationshipAttribute ) | ( ruleOneToManyJoinColumnRelationshipAttribute ) );
    public final void rule__MultipleRelationshipAttribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:1334:1: ( ( ruleOneToManyJoinTableRelationshipAttribute ) | ( ruleOneToManyMappedByRelationshipAttribute ) | ( ruleManyToManyRelationshipAttribute ) | ( ruleManyToManyMappedByRelationshipAttribute ) | ( ruleOneToManyJoinColumnRelationshipAttribute ) )
            int alt11=5;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt11=1;
                }
                break;
            case 35:
                {
                alt11=2;
                }
                break;
            case 39:
                {
                alt11=3;
                }
                break;
            case 40:
                {
                alt11=4;
                }
                break;
            case 34:
                {
                alt11=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalJPADsl.g:1335:2: ( ruleOneToManyJoinTableRelationshipAttribute )
                    {
                    // InternalJPADsl.g:1335:2: ( ruleOneToManyJoinTableRelationshipAttribute )
                    // InternalJPADsl.g:1336:3: ruleOneToManyJoinTableRelationshipAttribute
                    {
                     before(grammarAccess.getMultipleRelationshipAttributeAccess().getOneToManyJoinTableRelationshipAttributeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleOneToManyJoinTableRelationshipAttribute();

                    state._fsp--;

                     after(grammarAccess.getMultipleRelationshipAttributeAccess().getOneToManyJoinTableRelationshipAttributeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJPADsl.g:1341:2: ( ruleOneToManyMappedByRelationshipAttribute )
                    {
                    // InternalJPADsl.g:1341:2: ( ruleOneToManyMappedByRelationshipAttribute )
                    // InternalJPADsl.g:1342:3: ruleOneToManyMappedByRelationshipAttribute
                    {
                     before(grammarAccess.getMultipleRelationshipAttributeAccess().getOneToManyMappedByRelationshipAttributeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleOneToManyMappedByRelationshipAttribute();

                    state._fsp--;

                     after(grammarAccess.getMultipleRelationshipAttributeAccess().getOneToManyMappedByRelationshipAttributeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalJPADsl.g:1347:2: ( ruleManyToManyRelationshipAttribute )
                    {
                    // InternalJPADsl.g:1347:2: ( ruleManyToManyRelationshipAttribute )
                    // InternalJPADsl.g:1348:3: ruleManyToManyRelationshipAttribute
                    {
                     before(grammarAccess.getMultipleRelationshipAttributeAccess().getManyToManyRelationshipAttributeParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleManyToManyRelationshipAttribute();

                    state._fsp--;

                     after(grammarAccess.getMultipleRelationshipAttributeAccess().getManyToManyRelationshipAttributeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalJPADsl.g:1353:2: ( ruleManyToManyMappedByRelationshipAttribute )
                    {
                    // InternalJPADsl.g:1353:2: ( ruleManyToManyMappedByRelationshipAttribute )
                    // InternalJPADsl.g:1354:3: ruleManyToManyMappedByRelationshipAttribute
                    {
                     before(grammarAccess.getMultipleRelationshipAttributeAccess().getManyToManyMappedByRelationshipAttributeParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleManyToManyMappedByRelationshipAttribute();

                    state._fsp--;

                     after(grammarAccess.getMultipleRelationshipAttributeAccess().getManyToManyMappedByRelationshipAttributeParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalJPADsl.g:1359:2: ( ruleOneToManyJoinColumnRelationshipAttribute )
                    {
                    // InternalJPADsl.g:1359:2: ( ruleOneToManyJoinColumnRelationshipAttribute )
                    // InternalJPADsl.g:1360:3: ruleOneToManyJoinColumnRelationshipAttribute
                    {
                     before(grammarAccess.getMultipleRelationshipAttributeAccess().getOneToManyJoinColumnRelationshipAttributeParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleOneToManyJoinColumnRelationshipAttribute();

                    state._fsp--;

                     after(grammarAccess.getMultipleRelationshipAttributeAccess().getOneToManyJoinColumnRelationshipAttributeParserRuleCall_4()); 

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
    // $ANTLR end "rule__MultipleRelationshipAttribute__Alternatives"


    // $ANTLR start "rule__Visibility__Alternatives"
    // InternalJPADsl.g:1369:1: rule__Visibility__Alternatives : ( ( ( 'public' ) ) | ( ( 'private' ) ) | ( ( 'protected' ) ) );
    public final void rule__Visibility__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:1373:1: ( ( ( 'public' ) ) | ( ( 'private' ) ) | ( ( 'protected' ) ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt12=1;
                }
                break;
            case 12:
                {
                alt12=2;
                }
                break;
            case 13:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalJPADsl.g:1374:2: ( ( 'public' ) )
                    {
                    // InternalJPADsl.g:1374:2: ( ( 'public' ) )
                    // InternalJPADsl.g:1375:3: ( 'public' )
                    {
                     before(grammarAccess.getVisibilityAccess().getPublicEnumLiteralDeclaration_0()); 
                    // InternalJPADsl.g:1376:3: ( 'public' )
                    // InternalJPADsl.g:1376:4: 'public'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityAccess().getPublicEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJPADsl.g:1380:2: ( ( 'private' ) )
                    {
                    // InternalJPADsl.g:1380:2: ( ( 'private' ) )
                    // InternalJPADsl.g:1381:3: ( 'private' )
                    {
                     before(grammarAccess.getVisibilityAccess().getPrivateEnumLiteralDeclaration_1()); 
                    // InternalJPADsl.g:1382:3: ( 'private' )
                    // InternalJPADsl.g:1382:4: 'private'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityAccess().getPrivateEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalJPADsl.g:1386:2: ( ( 'protected' ) )
                    {
                    // InternalJPADsl.g:1386:2: ( ( 'protected' ) )
                    // InternalJPADsl.g:1387:3: ( 'protected' )
                    {
                     before(grammarAccess.getVisibilityAccess().getProtectedEnumLiteralDeclaration_2()); 
                    // InternalJPADsl.g:1388:3: ( 'protected' )
                    // InternalJPADsl.g:1388:4: 'protected'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityAccess().getProtectedEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__Visibility__Alternatives"


    // $ANTLR start "rule__Import__Group__0"
    // InternalJPADsl.g:1396:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:1400:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalJPADsl.g:1401:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalJPADsl.g:1408:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:1412:1: ( ( 'import' ) )
            // InternalJPADsl.g:1413:1: ( 'import' )
            {
            // InternalJPADsl.g:1413:1: ( 'import' )
            // InternalJPADsl.g:1414:2: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,14,FOLLOW_2); 
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
    // InternalJPADsl.g:1423:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:1427:1: ( rule__Import__Group__1__Impl )
            // InternalJPADsl.g:1428:2: rule__Import__Group__1__Impl
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
    // InternalJPADsl.g:1434:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:1438:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // InternalJPADsl.g:1439:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // InternalJPADsl.g:1439:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // InternalJPADsl.g:1440:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // InternalJPADsl.g:1441:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            // InternalJPADsl.g:1441:3: rule__Import__ImportedNamespaceAssignment_1
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


    // $ANTLR start "rule__PackageDeclaration__Group__0"
    // InternalJPADsl.g:1450:1: rule__PackageDeclaration__Group__0 : rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1 ;
    public final void rule__PackageDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:1454:1: ( rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1 )
            // InternalJPADsl.g:1455:2: rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__PackageDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PackageDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__0"


    // $ANTLR start "rule__PackageDeclaration__Group__0__Impl"
    // InternalJPADsl.g:1462:1: rule__PackageDeclaration__Group__0__Impl : ( 'package' ) ;
    public final void rule__PackageDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:1466:1: ( ( 'package' ) )
            // InternalJPADsl.g:1467:1: ( 'package' )
            {
            // InternalJPADsl.g:1467:1: ( 'package' )
            // InternalJPADsl.g:1468:2: 'package'
            {
             before(grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__0__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group__1"
    // InternalJPADsl.g:1477:1: rule__PackageDeclaration__Group__1 : rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2 ;
    public final void rule__PackageDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:1481:1: ( rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2 )
            // InternalJPADsl.g:1482:2: rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__PackageDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PackageDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__1"


    // $ANTLR start "rule__PackageDeclaration__Group__1__Impl"
    // InternalJPADsl.g:1489:1: rule__PackageDeclaration__Group__1__Impl : ( ( rule__PackageDeclaration__NameAssignment_1 ) ) ;
    public final void rule__PackageDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:1493:1: ( ( ( rule__PackageDeclaration__NameAssignment_1 ) ) )
            // InternalJPADsl.g:1494:1: ( ( rule__PackageDeclaration__NameAssignment_1 ) )
            {
            // InternalJPADsl.g:1494:1: ( ( rule__PackageDeclaration__NameAssignment_1 ) )
            // InternalJPADsl.g:1495:2: ( rule__PackageDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getPackageDeclarationAccess().getNameAssignment_1()); 
            // InternalJPADsl.g:1496:2: ( rule__PackageDeclaration__NameAssignment_1 )
            // InternalJPADsl.g:1496:3: rule__PackageDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PackageDeclaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPackageDeclarationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__1__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group__2"
    // InternalJPADsl.g:1504:1: rule__PackageDeclaration__Group__2 : rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3 ;
    public final void rule__PackageDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:1508:1: ( rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3 )
            // InternalJPADsl.g:1509:2: rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__PackageDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PackageDeclaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__2"


    // $ANTLR start "rule__PackageDeclaration__Group__2__Impl"
    // InternalJPADsl.g:1516:1: rule__PackageDeclaration__Group__2__Impl : ( '{' ) ;
    public final void rule__PackageDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:1520:1: ( ( '{' ) )
            // InternalJPADsl.g:1521:1: ( '{' )
            {
            // InternalJPADsl.g:1521:1: ( '{' )
            // InternalJPADsl.g:1522:2: '{'
            {
             before(grammarAccess.getPackageDeclarationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPackageDeclarationAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__2__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group__3"
    // InternalJPADsl.g:1531:1: rule__PackageDeclaration__Group__3 : rule__PackageDeclaration__Group__3__Impl rule__PackageDeclaration__Group__4 ;
    public final void rule__PackageDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:1535:1: ( rule__PackageDeclaration__Group__3__Impl rule__PackageDeclaration__Group__4 )
            // InternalJPADsl.g:1536:2: rule__PackageDeclaration__Group__3__Impl rule__PackageDeclaration__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__PackageDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PackageDeclaration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__3"


    // $ANTLR start "rule__PackageDeclaration__Group__3__Impl"
    // InternalJPADsl.g:1543:1: rule__PackageDeclaration__Group__3__Impl : ( ( rule__PackageDeclaration__DatabaseModesAssignment_3 )* ) ;
    public final void rule__PackageDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:1547:1: ( ( ( rule__PackageDeclaration__DatabaseModesAssignment_3 )* ) )
            // InternalJPADsl.g:1548:1: ( ( rule__PackageDeclaration__DatabaseModesAssignment_3 )* )
            {
            // InternalJPADsl.g:1548:1: ( ( rule__PackageDeclaration__DatabaseModesAssignment_3 )* )
            // InternalJPADsl.g:1549:2: ( rule__PackageDeclaration__DatabaseModesAssignment_3 )*
            {
             before(grammarAccess.getPackageDeclarationAccess().getDatabaseModesAssignment_3()); 
            // InternalJPADsl.g:1550:2: ( rule__PackageDeclaration__DatabaseModesAssignment_3 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==19) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalJPADsl.g:1550:3: rule__PackageDeclaration__DatabaseModesAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__PackageDeclaration__DatabaseModesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getPackageDeclarationAccess().getDatabaseModesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__3__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group__4"
    // InternalJPADsl.g:1558:1: rule__PackageDeclaration__Group__4 : rule__PackageDeclaration__Group__4__Impl rule__PackageDeclaration__Group__5 ;
    public final void rule__PackageDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:1562:1: ( rule__PackageDeclaration__Group__4__Impl rule__PackageDeclaration__Group__5 )
            // InternalJPADsl.g:1563:2: rule__PackageDeclaration__Group__4__Impl rule__PackageDeclaration__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__PackageDeclaration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PackageDeclaration__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__4"


    // $ANTLR start "rule__PackageDeclaration__Group__4__Impl"
    // InternalJPADsl.g:1570:1: rule__PackageDeclaration__Group__4__Impl : ( ( rule__PackageDeclaration__ElementsAssignment_4 )* ) ;
    public final void rule__PackageDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:1574:1: ( ( ( rule__PackageDeclaration__ElementsAssignment_4 )* ) )
            // InternalJPADsl.g:1575:1: ( ( rule__PackageDeclaration__ElementsAssignment_4 )* )
            {
            // InternalJPADsl.g:1575:1: ( ( rule__PackageDeclaration__ElementsAssignment_4 )* )
            // InternalJPADsl.g:1576:2: ( rule__PackageDeclaration__ElementsAssignment_4 )*
            {
             before(grammarAccess.getPackageDeclarationAccess().getElementsAssignment_4()); 
            // InternalJPADsl.g:1577:2: ( rule__PackageDeclaration__ElementsAssignment_4 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=14 && LA14_0<=15)||LA14_0==18||LA14_0==20||(LA14_0>=31 && LA14_0<=40)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalJPADsl.g:1577:3: rule__PackageDeclaration__ElementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__PackageDeclaration__ElementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getPackageDeclarationAccess().getElementsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__4__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group__5"
    // InternalJPADsl.g:1585:1: rule__PackageDeclaration__Group__5 : rule__PackageDeclaration__Group__5__Impl ;
    public final void rule__PackageDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:1589:1: ( rule__PackageDeclaration__Group__5__Impl )
            // InternalJPADsl.g:1590:2: rule__PackageDeclaration__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PackageDeclaration__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__5"


    // $ANTLR start "rule__PackageDeclaration__Group__5__Impl"
    // InternalJPADsl.g:1596:1: rule__PackageDeclaration__Group__5__Impl : ( '}' ) ;
    public final void rule__PackageDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:1600:1: ( ( '}' ) )
            // InternalJPADsl.g:1601:1: ( '}' )
            {
            // InternalJPADsl.g:1601:1: ( '}' )
            // InternalJPADsl.g:1602:2: '}'
            {
             before(grammarAccess.getPackageDeclarationAccess().getRightCurlyBracketKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPackageDeclarationAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__5__Impl"


    // $ANTLR start "rule__DataType__Group__0"
    // InternalJPADsl.g:1612:1: rule__DataType__Group__0 : rule__DataType__Group__0__Impl rule__DataType__Group__1 ;
    public final void rule__DataType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:1616:1: ( rule__DataType__Group__0__Impl rule__DataType__Group__1 )
            // InternalJPADsl.g:1617:2: rule__DataType__Group__0__Impl rule__DataType__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__DataType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__0"


    // $ANTLR start "rule__DataType__Group__0__Impl"
    // InternalJPADsl.g:1624:1: rule__DataType__Group__0__Impl : ( 'datatype' ) ;
    public final void rule__DataType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:1628:1: ( ( 'datatype' ) )
            // InternalJPADsl.g:1629:1: ( 'datatype' )
            {
            // InternalJPADsl.g:1629:1: ( 'datatype' )
            // InternalJPADsl.g:1630:2: 'datatype'
            {
             before(grammarAccess.getDataTypeAccess().getDatatypeKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getDataTypeAccess().getDatatypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__0__Impl"


    // $ANTLR start "rule__DataType__Group__1"
    // InternalJPADsl.g:1639:1: rule__DataType__Group__1 : rule__DataType__Group__1__Impl ;
    public final void rule__DataType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:1643:1: ( rule__DataType__Group__1__Impl )
            // InternalJPADsl.g:1644:2: rule__DataType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__1"


    // $ANTLR start "rule__DataType__Group__1__Impl"
    // InternalJPADsl.g:1650:1: rule__DataType__Group__1__Impl : ( ( rule__DataType__NameAssignment_1 ) ) ;
    public final void rule__DataType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:1654:1: ( ( ( rule__DataType__NameAssignment_1 ) ) )
            // InternalJPADsl.g:1655:1: ( ( rule__DataType__NameAssignment_1 ) )
            {
            // InternalJPADsl.g:1655:1: ( ( rule__DataType__NameAssignment_1 ) )
            // InternalJPADsl.g:1656:2: ( rule__DataType__NameAssignment_1 )
            {
             before(grammarAccess.getDataTypeAccess().getNameAssignment_1()); 
            // InternalJPADsl.g:1657:2: ( rule__DataType__NameAssignment_1 )
            // InternalJPADsl.g:1657:3: rule__DataType__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DataType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__1__Impl"


    // $ANTLR start "rule__DatabaseMode__Group__0"
    // InternalJPADsl.g:1666:1: rule__DatabaseMode__Group__0 : rule__DatabaseMode__Group__0__Impl rule__DatabaseMode__Group__1 ;
    public final void rule__DatabaseMode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:1670:1: ( rule__DatabaseMode__Group__0__Impl rule__DatabaseMode__Group__1 )
            // InternalJPADsl.g:1671:2: rule__DatabaseMode__Group__0__Impl rule__DatabaseMode__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__DatabaseMode__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DatabaseMode__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatabaseMode__Group__0"


    // $ANTLR start "rule__DatabaseMode__Group__0__Impl"
    // InternalJPADsl.g:1678:1: rule__DatabaseMode__Group__0__Impl : ( 'databaseMode' ) ;
    public final void rule__DatabaseMode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:1682:1: ( ( 'databaseMode' ) )
            // InternalJPADsl.g:1683:1: ( 'databaseMode' )
            {
            // InternalJPADsl.g:1683:1: ( 'databaseMode' )
            // InternalJPADsl.g:1684:2: 'databaseMode'
            {
             before(grammarAccess.getDatabaseModeAccess().getDatabaseModeKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getDatabaseModeAccess().getDatabaseModeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatabaseMode__Group__0__Impl"


    // $ANTLR start "rule__DatabaseMode__Group__1"
    // InternalJPADsl.g:1693:1: rule__DatabaseMode__Group__1 : rule__DatabaseMode__Group__1__Impl ;
    public final void rule__DatabaseMode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:1697:1: ( rule__DatabaseMode__Group__1__Impl )
            // InternalJPADsl.g:1698:2: rule__DatabaseMode__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DatabaseMode__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatabaseMode__Group__1"


    // $ANTLR start "rule__DatabaseMode__Group__1__Impl"
    // InternalJPADsl.g:1704:1: rule__DatabaseMode__Group__1__Impl : ( ( rule__DatabaseMode__NameAssignment_1 ) ) ;
    public final void rule__DatabaseMode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:1708:1: ( ( ( rule__DatabaseMode__NameAssignment_1 ) ) )
            // InternalJPADsl.g:1709:1: ( ( rule__DatabaseMode__NameAssignment_1 ) )
            {
            // InternalJPADsl.g:1709:1: ( ( rule__DatabaseMode__NameAssignment_1 ) )
            // InternalJPADsl.g:1710:2: ( rule__DatabaseMode__NameAssignment_1 )
            {
             before(grammarAccess.getDatabaseModeAccess().getNameAssignment_1()); 
            // InternalJPADsl.g:1711:2: ( rule__DatabaseMode__NameAssignment_1 )
            // InternalJPADsl.g:1711:3: rule__DatabaseMode__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DatabaseMode__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDatabaseModeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatabaseMode__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // InternalJPADsl.g:1720:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:1724:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalJPADsl.g:1725:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // InternalJPADsl.g:1732:1: rule__Entity__Group__0__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:1736:1: ( ( 'entity' ) )
            // InternalJPADsl.g:1737:1: ( 'entity' )
            {
            // InternalJPADsl.g:1737:1: ( 'entity' )
            // InternalJPADsl.g:1738:2: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // InternalJPADsl.g:1747:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:1751:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalJPADsl.g:1752:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // InternalJPADsl.g:1759:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:1763:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // InternalJPADsl.g:1764:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // InternalJPADsl.g:1764:1: ( ( rule__Entity__NameAssignment_1 ) )
            // InternalJPADsl.g:1765:2: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // InternalJPADsl.g:1766:2: ( rule__Entity__NameAssignment_1 )
            // InternalJPADsl.g:1766:3: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // InternalJPADsl.g:1774:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:1778:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // InternalJPADsl.g:1779:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // InternalJPADsl.g:1786:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__DatabaseVendorAssignment_2 )? ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:1790:1: ( ( ( rule__Entity__DatabaseVendorAssignment_2 )? ) )
            // InternalJPADsl.g:1791:1: ( ( rule__Entity__DatabaseVendorAssignment_2 )? )
            {
            // InternalJPADsl.g:1791:1: ( ( rule__Entity__DatabaseVendorAssignment_2 )? )
            // InternalJPADsl.g:1792:2: ( rule__Entity__DatabaseVendorAssignment_2 )?
            {
             before(grammarAccess.getEntityAccess().getDatabaseVendorAssignment_2()); 
            // InternalJPADsl.g:1793:2: ( rule__Entity__DatabaseVendorAssignment_2 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalJPADsl.g:1793:3: rule__Entity__DatabaseVendorAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entity__DatabaseVendorAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getDatabaseVendorAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__3"
    // InternalJPADsl.g:1801:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:1805:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // InternalJPADsl.g:1806:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3"


    // $ANTLR start "rule__Entity__Group__3__Impl"
    // InternalJPADsl.g:1813:1: rule__Entity__Group__3__Impl : ( ( rule__Entity__Group_3__0 )? ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:1817:1: ( ( ( rule__Entity__Group_3__0 )? ) )
            // InternalJPADsl.g:1818:1: ( ( rule__Entity__Group_3__0 )? )
            {
            // InternalJPADsl.g:1818:1: ( ( rule__Entity__Group_3__0 )? )
            // InternalJPADsl.g:1819:2: ( rule__Entity__Group_3__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_3()); 
            // InternalJPADsl.g:1820:2: ( rule__Entity__Group_3__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==21) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalJPADsl.g:1820:3: rule__Entity__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entity__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3__Impl"


    // $ANTLR start "rule__Entity__Group__4"
    // InternalJPADsl.g:1828:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:1832:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // InternalJPADsl.g:1833:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Entity__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__4"


    // $ANTLR start "rule__Entity__Group__4__Impl"
    // InternalJPADsl.g:1840:1: rule__Entity__Group__4__Impl : ( ( rule__Entity__ReadOnlyAssignment_4 )? ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:1844:1: ( ( ( rule__Entity__ReadOnlyAssignment_4 )? ) )
            // InternalJPADsl.g:1845:1: ( ( rule__Entity__ReadOnlyAssignment_4 )? )
            {
            // InternalJPADsl.g:1845:1: ( ( rule__Entity__ReadOnlyAssignment_4 )? )
            // InternalJPADsl.g:1846:2: ( rule__Entity__ReadOnlyAssignment_4 )?
            {
             before(grammarAccess.getEntityAccess().getReadOnlyAssignment_4()); 
            // InternalJPADsl.g:1847:2: ( rule__Entity__ReadOnlyAssignment_4 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==22) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalJPADsl.g:1847:3: rule__Entity__ReadOnlyAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entity__ReadOnlyAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getReadOnlyAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__4__Impl"


    // $ANTLR start "rule__Entity__Group__5"
    // InternalJPADsl.g:1855:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl rule__Entity__Group__6 ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:1859:1: ( rule__Entity__Group__5__Impl rule__Entity__Group__6 )
            // InternalJPADsl.g:1860:2: rule__Entity__Group__5__Impl rule__Entity__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__Entity__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__5"


    // $ANTLR start "rule__Entity__Group__5__Impl"
    // InternalJPADsl.g:1867:1: rule__Entity__Group__5__Impl : ( ( rule__Entity__CacheableAssignment_5 )? ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:1871:1: ( ( ( rule__Entity__CacheableAssignment_5 )? ) )
            // InternalJPADsl.g:1872:1: ( ( rule__Entity__CacheableAssignment_5 )? )
            {
            // InternalJPADsl.g:1872:1: ( ( rule__Entity__CacheableAssignment_5 )? )
            // InternalJPADsl.g:1873:2: ( rule__Entity__CacheableAssignment_5 )?
            {
             before(grammarAccess.getEntityAccess().getCacheableAssignment_5()); 
            // InternalJPADsl.g:1874:2: ( rule__Entity__CacheableAssignment_5 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==23) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalJPADsl.g:1874:3: rule__Entity__CacheableAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entity__CacheableAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getCacheableAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__5__Impl"


    // $ANTLR start "rule__Entity__Group__6"
    // InternalJPADsl.g:1882:1: rule__Entity__Group__6 : rule__Entity__Group__6__Impl rule__Entity__Group__7 ;
    public final void rule__Entity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:1886:1: ( rule__Entity__Group__6__Impl rule__Entity__Group__7 )
            // InternalJPADsl.g:1887:2: rule__Entity__Group__6__Impl rule__Entity__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__Entity__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__6"


    // $ANTLR start "rule__Entity__Group__6__Impl"
    // InternalJPADsl.g:1894:1: rule__Entity__Group__6__Impl : ( '{' ) ;
    public final void rule__Entity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:1898:1: ( ( '{' ) )
            // InternalJPADsl.g:1899:1: ( '{' )
            {
            // InternalJPADsl.g:1899:1: ( '{' )
            // InternalJPADsl.g:1900:2: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__6__Impl"


    // $ANTLR start "rule__Entity__Group__7"
    // InternalJPADsl.g:1909:1: rule__Entity__Group__7 : rule__Entity__Group__7__Impl rule__Entity__Group__8 ;
    public final void rule__Entity__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:1913:1: ( rule__Entity__Group__7__Impl rule__Entity__Group__8 )
            // InternalJPADsl.g:1914:2: rule__Entity__Group__7__Impl rule__Entity__Group__8
            {
            pushFollow(FOLLOW_10);
            rule__Entity__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__7"


    // $ANTLR start "rule__Entity__Group__7__Impl"
    // InternalJPADsl.g:1921:1: rule__Entity__Group__7__Impl : ( ( rule__Entity__IdentifierAssignment_7 ) ) ;
    public final void rule__Entity__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:1925:1: ( ( ( rule__Entity__IdentifierAssignment_7 ) ) )
            // InternalJPADsl.g:1926:1: ( ( rule__Entity__IdentifierAssignment_7 ) )
            {
            // InternalJPADsl.g:1926:1: ( ( rule__Entity__IdentifierAssignment_7 ) )
            // InternalJPADsl.g:1927:2: ( rule__Entity__IdentifierAssignment_7 )
            {
             before(grammarAccess.getEntityAccess().getIdentifierAssignment_7()); 
            // InternalJPADsl.g:1928:2: ( rule__Entity__IdentifierAssignment_7 )
            // InternalJPADsl.g:1928:3: rule__Entity__IdentifierAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Entity__IdentifierAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getIdentifierAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__7__Impl"


    // $ANTLR start "rule__Entity__Group__8"
    // InternalJPADsl.g:1936:1: rule__Entity__Group__8 : rule__Entity__Group__8__Impl rule__Entity__Group__9 ;
    public final void rule__Entity__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:1940:1: ( rule__Entity__Group__8__Impl rule__Entity__Group__9 )
            // InternalJPADsl.g:1941:2: rule__Entity__Group__8__Impl rule__Entity__Group__9
            {
            pushFollow(FOLLOW_10);
            rule__Entity__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__8"


    // $ANTLR start "rule__Entity__Group__8__Impl"
    // InternalJPADsl.g:1948:1: rule__Entity__Group__8__Impl : ( ( rule__Entity__ImportsAssignment_8 )* ) ;
    public final void rule__Entity__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:1952:1: ( ( ( rule__Entity__ImportsAssignment_8 )* ) )
            // InternalJPADsl.g:1953:1: ( ( rule__Entity__ImportsAssignment_8 )* )
            {
            // InternalJPADsl.g:1953:1: ( ( rule__Entity__ImportsAssignment_8 )* )
            // InternalJPADsl.g:1954:2: ( rule__Entity__ImportsAssignment_8 )*
            {
             before(grammarAccess.getEntityAccess().getImportsAssignment_8()); 
            // InternalJPADsl.g:1955:2: ( rule__Entity__ImportsAssignment_8 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==14) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalJPADsl.g:1955:3: rule__Entity__ImportsAssignment_8
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Entity__ImportsAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getImportsAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__8__Impl"


    // $ANTLR start "rule__Entity__Group__9"
    // InternalJPADsl.g:1963:1: rule__Entity__Group__9 : rule__Entity__Group__9__Impl rule__Entity__Group__10 ;
    public final void rule__Entity__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:1967:1: ( rule__Entity__Group__9__Impl rule__Entity__Group__10 )
            // InternalJPADsl.g:1968:2: rule__Entity__Group__9__Impl rule__Entity__Group__10
            {
            pushFollow(FOLLOW_10);
            rule__Entity__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__9"


    // $ANTLR start "rule__Entity__Group__9__Impl"
    // InternalJPADsl.g:1975:1: rule__Entity__Group__9__Impl : ( ( rule__Entity__FeaturesAssignment_9 )* ) ;
    public final void rule__Entity__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:1979:1: ( ( ( rule__Entity__FeaturesAssignment_9 )* ) )
            // InternalJPADsl.g:1980:1: ( ( rule__Entity__FeaturesAssignment_9 )* )
            {
            // InternalJPADsl.g:1980:1: ( ( rule__Entity__FeaturesAssignment_9 )* )
            // InternalJPADsl.g:1981:2: ( rule__Entity__FeaturesAssignment_9 )*
            {
             before(grammarAccess.getEntityAccess().getFeaturesAssignment_9()); 
            // InternalJPADsl.g:1982:2: ( rule__Entity__FeaturesAssignment_9 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID||(LA20_0>=11 && LA20_0<=13)||LA20_0==26||(LA20_0>=28 && LA20_0<=41)||LA20_0==43) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalJPADsl.g:1982:3: rule__Entity__FeaturesAssignment_9
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Entity__FeaturesAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getFeaturesAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__9__Impl"


    // $ANTLR start "rule__Entity__Group__10"
    // InternalJPADsl.g:1990:1: rule__Entity__Group__10 : rule__Entity__Group__10__Impl ;
    public final void rule__Entity__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:1994:1: ( rule__Entity__Group__10__Impl )
            // InternalJPADsl.g:1995:2: rule__Entity__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__10"


    // $ANTLR start "rule__Entity__Group__10__Impl"
    // InternalJPADsl.g:2001:1: rule__Entity__Group__10__Impl : ( '}' ) ;
    public final void rule__Entity__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:2005:1: ( ( '}' ) )
            // InternalJPADsl.g:2006:1: ( '}' )
            {
            // InternalJPADsl.g:2006:1: ( '}' )
            // InternalJPADsl.g:2007:2: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_10()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__10__Impl"


    // $ANTLR start "rule__Entity__Group_3__0"
    // InternalJPADsl.g:2017:1: rule__Entity__Group_3__0 : rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1 ;
    public final void rule__Entity__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:2021:1: ( rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1 )
            // InternalJPADsl.g:2022:2: rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Entity__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_3__0"


    // $ANTLR start "rule__Entity__Group_3__0__Impl"
    // InternalJPADsl.g:2029:1: rule__Entity__Group_3__0__Impl : ( 'extends' ) ;
    public final void rule__Entity__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:2033:1: ( ( 'extends' ) )
            // InternalJPADsl.g:2034:1: ( 'extends' )
            {
            // InternalJPADsl.g:2034:1: ( 'extends' )
            // InternalJPADsl.g:2035:2: 'extends'
            {
             before(grammarAccess.getEntityAccess().getExtendsKeyword_3_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getExtendsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_3__0__Impl"


    // $ANTLR start "rule__Entity__Group_3__1"
    // InternalJPADsl.g:2044:1: rule__Entity__Group_3__1 : rule__Entity__Group_3__1__Impl ;
    public final void rule__Entity__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:2048:1: ( rule__Entity__Group_3__1__Impl )
            // InternalJPADsl.g:2049:2: rule__Entity__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_3__1"


    // $ANTLR start "rule__Entity__Group_3__1__Impl"
    // InternalJPADsl.g:2055:1: rule__Entity__Group_3__1__Impl : ( ( rule__Entity__SuperTypeAssignment_3_1 ) ) ;
    public final void rule__Entity__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:2059:1: ( ( ( rule__Entity__SuperTypeAssignment_3_1 ) ) )
            // InternalJPADsl.g:2060:1: ( ( rule__Entity__SuperTypeAssignment_3_1 ) )
            {
            // InternalJPADsl.g:2060:1: ( ( rule__Entity__SuperTypeAssignment_3_1 ) )
            // InternalJPADsl.g:2061:2: ( rule__Entity__SuperTypeAssignment_3_1 )
            {
             before(grammarAccess.getEntityAccess().getSuperTypeAssignment_3_1()); 
            // InternalJPADsl.g:2062:2: ( rule__Entity__SuperTypeAssignment_3_1 )
            // InternalJPADsl.g:2062:3: rule__Entity__SuperTypeAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__SuperTypeAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getSuperTypeAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_3__1__Impl"


    // $ANTLR start "rule__ReadOnly__Group__0"
    // InternalJPADsl.g:2071:1: rule__ReadOnly__Group__0 : rule__ReadOnly__Group__0__Impl rule__ReadOnly__Group__1 ;
    public final void rule__ReadOnly__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:2075:1: ( rule__ReadOnly__Group__0__Impl rule__ReadOnly__Group__1 )
            // InternalJPADsl.g:2076:2: rule__ReadOnly__Group__0__Impl rule__ReadOnly__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__ReadOnly__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReadOnly__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReadOnly__Group__0"


    // $ANTLR start "rule__ReadOnly__Group__0__Impl"
    // InternalJPADsl.g:2083:1: rule__ReadOnly__Group__0__Impl : ( 'read only' ) ;
    public final void rule__ReadOnly__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:2087:1: ( ( 'read only' ) )
            // InternalJPADsl.g:2088:1: ( 'read only' )
            {
            // InternalJPADsl.g:2088:1: ( 'read only' )
            // InternalJPADsl.g:2089:2: 'read only'
            {
             before(grammarAccess.getReadOnlyAccess().getReadOnlyKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getReadOnlyAccess().getReadOnlyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReadOnly__Group__0__Impl"


    // $ANTLR start "rule__ReadOnly__Group__1"
    // InternalJPADsl.g:2098:1: rule__ReadOnly__Group__1 : rule__ReadOnly__Group__1__Impl rule__ReadOnly__Group__2 ;
    public final void rule__ReadOnly__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:2102:1: ( rule__ReadOnly__Group__1__Impl rule__ReadOnly__Group__2 )
            // InternalJPADsl.g:2103:2: rule__ReadOnly__Group__1__Impl rule__ReadOnly__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__ReadOnly__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReadOnly__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReadOnly__Group__1"


    // $ANTLR start "rule__ReadOnly__Group__1__Impl"
    // InternalJPADsl.g:2110:1: rule__ReadOnly__Group__1__Impl : ( ( rule__ReadOnly__TableNameAssignment_1 ) ) ;
    public final void rule__ReadOnly__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:2114:1: ( ( ( rule__ReadOnly__TableNameAssignment_1 ) ) )
            // InternalJPADsl.g:2115:1: ( ( rule__ReadOnly__TableNameAssignment_1 ) )
            {
            // InternalJPADsl.g:2115:1: ( ( rule__ReadOnly__TableNameAssignment_1 ) )
            // InternalJPADsl.g:2116:2: ( rule__ReadOnly__TableNameAssignment_1 )
            {
             before(grammarAccess.getReadOnlyAccess().getTableNameAssignment_1()); 
            // InternalJPADsl.g:2117:2: ( rule__ReadOnly__TableNameAssignment_1 )
            // InternalJPADsl.g:2117:3: rule__ReadOnly__TableNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ReadOnly__TableNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getReadOnlyAccess().getTableNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReadOnly__Group__1__Impl"


    // $ANTLR start "rule__ReadOnly__Group__2"
    // InternalJPADsl.g:2125:1: rule__ReadOnly__Group__2 : rule__ReadOnly__Group__2__Impl ;
    public final void rule__ReadOnly__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:2129:1: ( rule__ReadOnly__Group__2__Impl )
            // InternalJPADsl.g:2130:2: rule__ReadOnly__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReadOnly__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReadOnly__Group__2"


    // $ANTLR start "rule__ReadOnly__Group__2__Impl"
    // InternalJPADsl.g:2136:1: rule__ReadOnly__Group__2__Impl : ( ( rule__ReadOnly__IdColumnAssignment_2 ) ) ;
    public final void rule__ReadOnly__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:2140:1: ( ( ( rule__ReadOnly__IdColumnAssignment_2 ) ) )
            // InternalJPADsl.g:2141:1: ( ( rule__ReadOnly__IdColumnAssignment_2 ) )
            {
            // InternalJPADsl.g:2141:1: ( ( rule__ReadOnly__IdColumnAssignment_2 ) )
            // InternalJPADsl.g:2142:2: ( rule__ReadOnly__IdColumnAssignment_2 )
            {
             before(grammarAccess.getReadOnlyAccess().getIdColumnAssignment_2()); 
            // InternalJPADsl.g:2143:2: ( rule__ReadOnly__IdColumnAssignment_2 )
            // InternalJPADsl.g:2143:3: rule__ReadOnly__IdColumnAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ReadOnly__IdColumnAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getReadOnlyAccess().getIdColumnAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReadOnly__Group__2__Impl"


    // $ANTLR start "rule__Cacheable__Group__0"
    // InternalJPADsl.g:2152:1: rule__Cacheable__Group__0 : rule__Cacheable__Group__0__Impl rule__Cacheable__Group__1 ;
    public final void rule__Cacheable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:2156:1: ( rule__Cacheable__Group__0__Impl rule__Cacheable__Group__1 )
            // InternalJPADsl.g:2157:2: rule__Cacheable__Group__0__Impl rule__Cacheable__Group__1
            {
            pushFollow(FOLLOW_1);
            rule__Cacheable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cacheable__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cacheable__Group__0"


    // $ANTLR start "rule__Cacheable__Group__0__Impl"
    // InternalJPADsl.g:2164:1: rule__Cacheable__Group__0__Impl : ( 'cacheable' ) ;
    public final void rule__Cacheable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:2168:1: ( ( 'cacheable' ) )
            // InternalJPADsl.g:2169:1: ( 'cacheable' )
            {
            // InternalJPADsl.g:2169:1: ( 'cacheable' )
            // InternalJPADsl.g:2170:2: 'cacheable'
            {
             before(grammarAccess.getCacheableAccess().getCacheableKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getCacheableAccess().getCacheableKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cacheable__Group__0__Impl"


    // $ANTLR start "rule__Cacheable__Group__1"
    // InternalJPADsl.g:2179:1: rule__Cacheable__Group__1 : rule__Cacheable__Group__1__Impl ;
    public final void rule__Cacheable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:2183:1: ( rule__Cacheable__Group__1__Impl )
            // InternalJPADsl.g:2184:2: rule__Cacheable__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Cacheable__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cacheable__Group__1"


    // $ANTLR start "rule__Cacheable__Group__1__Impl"
    // InternalJPADsl.g:2190:1: rule__Cacheable__Group__1__Impl : ( () ) ;
    public final void rule__Cacheable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:2194:1: ( ( () ) )
            // InternalJPADsl.g:2195:1: ( () )
            {
            // InternalJPADsl.g:2195:1: ( () )
            // InternalJPADsl.g:2196:2: ()
            {
             before(grammarAccess.getCacheableAccess().getCacheableAction_1()); 
            // InternalJPADsl.g:2197:2: ()
            // InternalJPADsl.g:2197:3: 
            {
            }

             after(grammarAccess.getCacheableAccess().getCacheableAction_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cacheable__Group__1__Impl"


    // $ANTLR start "rule__UniqueIdentiferColumn__Group__0"
    // InternalJPADsl.g:2206:1: rule__UniqueIdentiferColumn__Group__0 : rule__UniqueIdentiferColumn__Group__0__Impl rule__UniqueIdentiferColumn__Group__1 ;
    public final void rule__UniqueIdentiferColumn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:2210:1: ( rule__UniqueIdentiferColumn__Group__0__Impl rule__UniqueIdentiferColumn__Group__1 )
            // InternalJPADsl.g:2211:2: rule__UniqueIdentiferColumn__Group__0__Impl rule__UniqueIdentiferColumn__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__UniqueIdentiferColumn__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UniqueIdentiferColumn__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UniqueIdentiferColumn__Group__0"


    // $ANTLR start "rule__UniqueIdentiferColumn__Group__0__Impl"
    // InternalJPADsl.g:2218:1: rule__UniqueIdentiferColumn__Group__0__Impl : ( 'unique id' ) ;
    public final void rule__UniqueIdentiferColumn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:2222:1: ( ( 'unique id' ) )
            // InternalJPADsl.g:2223:1: ( 'unique id' )
            {
            // InternalJPADsl.g:2223:1: ( 'unique id' )
            // InternalJPADsl.g:2224:2: 'unique id'
            {
             before(grammarAccess.getUniqueIdentiferColumnAccess().getUniqueIdKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getUniqueIdentiferColumnAccess().getUniqueIdKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UniqueIdentiferColumn__Group__0__Impl"


    // $ANTLR start "rule__UniqueIdentiferColumn__Group__1"
    // InternalJPADsl.g:2233:1: rule__UniqueIdentiferColumn__Group__1 : rule__UniqueIdentiferColumn__Group__1__Impl ;
    public final void rule__UniqueIdentiferColumn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:2237:1: ( rule__UniqueIdentiferColumn__Group__1__Impl )
            // InternalJPADsl.g:2238:2: rule__UniqueIdentiferColumn__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UniqueIdentiferColumn__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UniqueIdentiferColumn__Group__1"


    // $ANTLR start "rule__UniqueIdentiferColumn__Group__1__Impl"
    // InternalJPADsl.g:2244:1: rule__UniqueIdentiferColumn__Group__1__Impl : ( ( rule__UniqueIdentiferColumn__NameAssignment_1 ) ) ;
    public final void rule__UniqueIdentiferColumn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:2248:1: ( ( ( rule__UniqueIdentiferColumn__NameAssignment_1 ) ) )
            // InternalJPADsl.g:2249:1: ( ( rule__UniqueIdentiferColumn__NameAssignment_1 ) )
            {
            // InternalJPADsl.g:2249:1: ( ( rule__UniqueIdentiferColumn__NameAssignment_1 ) )
            // InternalJPADsl.g:2250:2: ( rule__UniqueIdentiferColumn__NameAssignment_1 )
            {
             before(grammarAccess.getUniqueIdentiferColumnAccess().getNameAssignment_1()); 
            // InternalJPADsl.g:2251:2: ( rule__UniqueIdentiferColumn__NameAssignment_1 )
            // InternalJPADsl.g:2251:3: rule__UniqueIdentiferColumn__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__UniqueIdentiferColumn__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUniqueIdentiferColumnAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UniqueIdentiferColumn__Group__1__Impl"


    // $ANTLR start "rule__EmbeddedUniqueIdentifer__Group__0"
    // InternalJPADsl.g:2260:1: rule__EmbeddedUniqueIdentifer__Group__0 : rule__EmbeddedUniqueIdentifer__Group__0__Impl rule__EmbeddedUniqueIdentifer__Group__1 ;
    public final void rule__EmbeddedUniqueIdentifer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:2264:1: ( rule__EmbeddedUniqueIdentifer__Group__0__Impl rule__EmbeddedUniqueIdentifer__Group__1 )
            // InternalJPADsl.g:2265:2: rule__EmbeddedUniqueIdentifer__Group__0__Impl rule__EmbeddedUniqueIdentifer__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__EmbeddedUniqueIdentifer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EmbeddedUniqueIdentifer__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmbeddedUniqueIdentifer__Group__0"


    // $ANTLR start "rule__EmbeddedUniqueIdentifer__Group__0__Impl"
    // InternalJPADsl.g:2272:1: rule__EmbeddedUniqueIdentifer__Group__0__Impl : ( 'embedded id' ) ;
    public final void rule__EmbeddedUniqueIdentifer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:2276:1: ( ( 'embedded id' ) )
            // InternalJPADsl.g:2277:1: ( 'embedded id' )
            {
            // InternalJPADsl.g:2277:1: ( 'embedded id' )
            // InternalJPADsl.g:2278:2: 'embedded id'
            {
             before(grammarAccess.getEmbeddedUniqueIdentiferAccess().getEmbeddedIdKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getEmbeddedUniqueIdentiferAccess().getEmbeddedIdKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmbeddedUniqueIdentifer__Group__0__Impl"


    // $ANTLR start "rule__EmbeddedUniqueIdentifer__Group__1"
    // InternalJPADsl.g:2287:1: rule__EmbeddedUniqueIdentifer__Group__1 : rule__EmbeddedUniqueIdentifer__Group__1__Impl ;
    public final void rule__EmbeddedUniqueIdentifer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:2291:1: ( rule__EmbeddedUniqueIdentifer__Group__1__Impl )
            // InternalJPADsl.g:2292:2: rule__EmbeddedUniqueIdentifer__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EmbeddedUniqueIdentifer__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmbeddedUniqueIdentifer__Group__1"


    // $ANTLR start "rule__EmbeddedUniqueIdentifer__Group__1__Impl"
    // InternalJPADsl.g:2298:1: rule__EmbeddedUniqueIdentifer__Group__1__Impl : ( ( rule__EmbeddedUniqueIdentifer__NameAssignment_1 ) ) ;
    public final void rule__EmbeddedUniqueIdentifer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:2302:1: ( ( ( rule__EmbeddedUniqueIdentifer__NameAssignment_1 ) ) )
            // InternalJPADsl.g:2303:1: ( ( rule__EmbeddedUniqueIdentifer__NameAssignment_1 ) )
            {
            // InternalJPADsl.g:2303:1: ( ( rule__EmbeddedUniqueIdentifer__NameAssignment_1 ) )
            // InternalJPADsl.g:2304:2: ( rule__EmbeddedUniqueIdentifer__NameAssignment_1 )
            {
             before(grammarAccess.getEmbeddedUniqueIdentiferAccess().getNameAssignment_1()); 
            // InternalJPADsl.g:2305:2: ( rule__EmbeddedUniqueIdentifer__NameAssignment_1 )
            // InternalJPADsl.g:2305:3: rule__EmbeddedUniqueIdentifer__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EmbeddedUniqueIdentifer__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEmbeddedUniqueIdentiferAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmbeddedUniqueIdentifer__Group__1__Impl"


    // $ANTLR start "rule__StaticAttribute__Group__0"
    // InternalJPADsl.g:2314:1: rule__StaticAttribute__Group__0 : rule__StaticAttribute__Group__0__Impl rule__StaticAttribute__Group__1 ;
    public final void rule__StaticAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:2318:1: ( rule__StaticAttribute__Group__0__Impl rule__StaticAttribute__Group__1 )
            // InternalJPADsl.g:2319:2: rule__StaticAttribute__Group__0__Impl rule__StaticAttribute__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__StaticAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StaticAttribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StaticAttribute__Group__0"


    // $ANTLR start "rule__StaticAttribute__Group__0__Impl"
    // InternalJPADsl.g:2326:1: rule__StaticAttribute__Group__0__Impl : ( 'staticAttribute' ) ;
    public final void rule__StaticAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:2330:1: ( ( 'staticAttribute' ) )
            // InternalJPADsl.g:2331:1: ( 'staticAttribute' )
            {
            // InternalJPADsl.g:2331:1: ( 'staticAttribute' )
            // InternalJPADsl.g:2332:2: 'staticAttribute'
            {
             before(grammarAccess.getStaticAttributeAccess().getStaticAttributeKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getStaticAttributeAccess().getStaticAttributeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StaticAttribute__Group__0__Impl"


    // $ANTLR start "rule__StaticAttribute__Group__1"
    // InternalJPADsl.g:2341:1: rule__StaticAttribute__Group__1 : rule__StaticAttribute__Group__1__Impl rule__StaticAttribute__Group__2 ;
    public final void rule__StaticAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:2345:1: ( rule__StaticAttribute__Group__1__Impl rule__StaticAttribute__Group__2 )
            // InternalJPADsl.g:2346:2: rule__StaticAttribute__Group__1__Impl rule__StaticAttribute__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__StaticAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StaticAttribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StaticAttribute__Group__1"


    // $ANTLR start "rule__StaticAttribute__Group__1__Impl"
    // InternalJPADsl.g:2353:1: rule__StaticAttribute__Group__1__Impl : ( ( rule__StaticAttribute__NameAssignment_1 ) ) ;
    public final void rule__StaticAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:2357:1: ( ( ( rule__StaticAttribute__NameAssignment_1 ) ) )
            // InternalJPADsl.g:2358:1: ( ( rule__StaticAttribute__NameAssignment_1 ) )
            {
            // InternalJPADsl.g:2358:1: ( ( rule__StaticAttribute__NameAssignment_1 ) )
            // InternalJPADsl.g:2359:2: ( rule__StaticAttribute__NameAssignment_1 )
            {
             before(grammarAccess.getStaticAttributeAccess().getNameAssignment_1()); 
            // InternalJPADsl.g:2360:2: ( rule__StaticAttribute__NameAssignment_1 )
            // InternalJPADsl.g:2360:3: rule__StaticAttribute__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__StaticAttribute__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStaticAttributeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StaticAttribute__Group__1__Impl"


    // $ANTLR start "rule__StaticAttribute__Group__2"
    // InternalJPADsl.g:2368:1: rule__StaticAttribute__Group__2 : rule__StaticAttribute__Group__2__Impl rule__StaticAttribute__Group__3 ;
    public final void rule__StaticAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:2372:1: ( rule__StaticAttribute__Group__2__Impl rule__StaticAttribute__Group__3 )
            // InternalJPADsl.g:2373:2: rule__StaticAttribute__Group__2__Impl rule__StaticAttribute__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__StaticAttribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StaticAttribute__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StaticAttribute__Group__2"


    // $ANTLR start "rule__StaticAttribute__Group__2__Impl"
    // InternalJPADsl.g:2380:1: rule__StaticAttribute__Group__2__Impl : ( ':' ) ;
    public final void rule__StaticAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:2384:1: ( ( ':' ) )
            // InternalJPADsl.g:2385:1: ( ':' )
            {
            // InternalJPADsl.g:2385:1: ( ':' )
            // InternalJPADsl.g:2386:2: ':'
            {
             before(grammarAccess.getStaticAttributeAccess().getColonKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getStaticAttributeAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StaticAttribute__Group__2__Impl"


    // $ANTLR start "rule__StaticAttribute__Group__3"
    // InternalJPADsl.g:2395:1: rule__StaticAttribute__Group__3 : rule__StaticAttribute__Group__3__Impl ;
    public final void rule__StaticAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:2399:1: ( rule__StaticAttribute__Group__3__Impl )
            // InternalJPADsl.g:2400:2: rule__StaticAttribute__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StaticAttribute__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StaticAttribute__Group__3"


    // $ANTLR start "rule__StaticAttribute__Group__3__Impl"
    // InternalJPADsl.g:2406:1: rule__StaticAttribute__Group__3__Impl : ( ( rule__StaticAttribute__TypeAssignment_3 ) ) ;
    public final void rule__StaticAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:2410:1: ( ( ( rule__StaticAttribute__TypeAssignment_3 ) ) )
            // InternalJPADsl.g:2411:1: ( ( rule__StaticAttribute__TypeAssignment_3 ) )
            {
            // InternalJPADsl.g:2411:1: ( ( rule__StaticAttribute__TypeAssignment_3 ) )
            // InternalJPADsl.g:2412:2: ( rule__StaticAttribute__TypeAssignment_3 )
            {
             before(grammarAccess.getStaticAttributeAccess().getTypeAssignment_3()); 
            // InternalJPADsl.g:2413:2: ( rule__StaticAttribute__TypeAssignment_3 )
            // InternalJPADsl.g:2413:3: rule__StaticAttribute__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__StaticAttribute__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getStaticAttributeAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StaticAttribute__Group__3__Impl"


    // $ANTLR start "rule__ReadOnlyInternalAttribute__Group__0"
    // InternalJPADsl.g:2422:1: rule__ReadOnlyInternalAttribute__Group__0 : rule__ReadOnlyInternalAttribute__Group__0__Impl rule__ReadOnlyInternalAttribute__Group__1 ;
    public final void rule__ReadOnlyInternalAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:2426:1: ( rule__ReadOnlyInternalAttribute__Group__0__Impl rule__ReadOnlyInternalAttribute__Group__1 )
            // InternalJPADsl.g:2427:2: rule__ReadOnlyInternalAttribute__Group__0__Impl rule__ReadOnlyInternalAttribute__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__ReadOnlyInternalAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReadOnlyInternalAttribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReadOnlyInternalAttribute__Group__0"


    // $ANTLR start "rule__ReadOnlyInternalAttribute__Group__0__Impl"
    // InternalJPADsl.g:2434:1: rule__ReadOnlyInternalAttribute__Group__0__Impl : ( ( rule__ReadOnlyInternalAttribute__NameAssignment_0 ) ) ;
    public final void rule__ReadOnlyInternalAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:2438:1: ( ( ( rule__ReadOnlyInternalAttribute__NameAssignment_0 ) ) )
            // InternalJPADsl.g:2439:1: ( ( rule__ReadOnlyInternalAttribute__NameAssignment_0 ) )
            {
            // InternalJPADsl.g:2439:1: ( ( rule__ReadOnlyInternalAttribute__NameAssignment_0 ) )
            // InternalJPADsl.g:2440:2: ( rule__ReadOnlyInternalAttribute__NameAssignment_0 )
            {
             before(grammarAccess.getReadOnlyInternalAttributeAccess().getNameAssignment_0()); 
            // InternalJPADsl.g:2441:2: ( rule__ReadOnlyInternalAttribute__NameAssignment_0 )
            // InternalJPADsl.g:2441:3: rule__ReadOnlyInternalAttribute__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ReadOnlyInternalAttribute__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getReadOnlyInternalAttributeAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReadOnlyInternalAttribute__Group__0__Impl"


    // $ANTLR start "rule__ReadOnlyInternalAttribute__Group__1"
    // InternalJPADsl.g:2449:1: rule__ReadOnlyInternalAttribute__Group__1 : rule__ReadOnlyInternalAttribute__Group__1__Impl rule__ReadOnlyInternalAttribute__Group__2 ;
    public final void rule__ReadOnlyInternalAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:2453:1: ( rule__ReadOnlyInternalAttribute__Group__1__Impl rule__ReadOnlyInternalAttribute__Group__2 )
            // InternalJPADsl.g:2454:2: rule__ReadOnlyInternalAttribute__Group__1__Impl rule__ReadOnlyInternalAttribute__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ReadOnlyInternalAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReadOnlyInternalAttribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReadOnlyInternalAttribute__Group__1"


    // $ANTLR start "rule__ReadOnlyInternalAttribute__Group__1__Impl"
    // InternalJPADsl.g:2461:1: rule__ReadOnlyInternalAttribute__Group__1__Impl : ( ':' ) ;
    public final void rule__ReadOnlyInternalAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:2465:1: ( ( ':' ) )
            // InternalJPADsl.g:2466:1: ( ':' )
            {
            // InternalJPADsl.g:2466:1: ( ':' )
            // InternalJPADsl.g:2467:2: ':'
            {
             before(grammarAccess.getReadOnlyInternalAttributeAccess().getColonKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getReadOnlyInternalAttributeAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReadOnlyInternalAttribute__Group__1__Impl"


    // $ANTLR start "rule__ReadOnlyInternalAttribute__Group__2"
    // InternalJPADsl.g:2476:1: rule__ReadOnlyInternalAttribute__Group__2 : rule__ReadOnlyInternalAttribute__Group__2__Impl ;
    public final void rule__ReadOnlyInternalAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:2480:1: ( rule__ReadOnlyInternalAttribute__Group__2__Impl )
            // InternalJPADsl.g:2481:2: rule__ReadOnlyInternalAttribute__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReadOnlyInternalAttribute__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReadOnlyInternalAttribute__Group__2"


    // $ANTLR start "rule__ReadOnlyInternalAttribute__Group__2__Impl"
    // InternalJPADsl.g:2487:1: rule__ReadOnlyInternalAttribute__Group__2__Impl : ( ( rule__ReadOnlyInternalAttribute__TypeAssignment_2 ) ) ;
    public final void rule__ReadOnlyInternalAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:2491:1: ( ( ( rule__ReadOnlyInternalAttribute__TypeAssignment_2 ) ) )
            // InternalJPADsl.g:2492:1: ( ( rule__ReadOnlyInternalAttribute__TypeAssignment_2 ) )
            {
            // InternalJPADsl.g:2492:1: ( ( rule__ReadOnlyInternalAttribute__TypeAssignment_2 ) )
            // InternalJPADsl.g:2493:2: ( rule__ReadOnlyInternalAttribute__TypeAssignment_2 )
            {
             before(grammarAccess.getReadOnlyInternalAttributeAccess().getTypeAssignment_2()); 
            // InternalJPADsl.g:2494:2: ( rule__ReadOnlyInternalAttribute__TypeAssignment_2 )
            // InternalJPADsl.g:2494:3: rule__ReadOnlyInternalAttribute__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ReadOnlyInternalAttribute__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getReadOnlyInternalAttributeAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReadOnlyInternalAttribute__Group__2__Impl"


    // $ANTLR start "rule__UpdatableInternalAttribute__Group__0"
    // InternalJPADsl.g:2503:1: rule__UpdatableInternalAttribute__Group__0 : rule__UpdatableInternalAttribute__Group__0__Impl rule__UpdatableInternalAttribute__Group__1 ;
    public final void rule__UpdatableInternalAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:2507:1: ( rule__UpdatableInternalAttribute__Group__0__Impl rule__UpdatableInternalAttribute__Group__1 )
            // InternalJPADsl.g:2508:2: rule__UpdatableInternalAttribute__Group__0__Impl rule__UpdatableInternalAttribute__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__UpdatableInternalAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UpdatableInternalAttribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdatableInternalAttribute__Group__0"


    // $ANTLR start "rule__UpdatableInternalAttribute__Group__0__Impl"
    // InternalJPADsl.g:2515:1: rule__UpdatableInternalAttribute__Group__0__Impl : ( 'attribute' ) ;
    public final void rule__UpdatableInternalAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:2519:1: ( ( 'attribute' ) )
            // InternalJPADsl.g:2520:1: ( 'attribute' )
            {
            // InternalJPADsl.g:2520:1: ( 'attribute' )
            // InternalJPADsl.g:2521:2: 'attribute'
            {
             before(grammarAccess.getUpdatableInternalAttributeAccess().getAttributeKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getUpdatableInternalAttributeAccess().getAttributeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdatableInternalAttribute__Group__0__Impl"


    // $ANTLR start "rule__UpdatableInternalAttribute__Group__1"
    // InternalJPADsl.g:2530:1: rule__UpdatableInternalAttribute__Group__1 : rule__UpdatableInternalAttribute__Group__1__Impl rule__UpdatableInternalAttribute__Group__2 ;
    public final void rule__UpdatableInternalAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:2534:1: ( rule__UpdatableInternalAttribute__Group__1__Impl rule__UpdatableInternalAttribute__Group__2 )
            // InternalJPADsl.g:2535:2: rule__UpdatableInternalAttribute__Group__1__Impl rule__UpdatableInternalAttribute__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__UpdatableInternalAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UpdatableInternalAttribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdatableInternalAttribute__Group__1"


    // $ANTLR start "rule__UpdatableInternalAttribute__Group__1__Impl"
    // InternalJPADsl.g:2542:1: rule__UpdatableInternalAttribute__Group__1__Impl : ( ( rule__UpdatableInternalAttribute__NameAssignment_1 ) ) ;
    public final void rule__UpdatableInternalAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:2546:1: ( ( ( rule__UpdatableInternalAttribute__NameAssignment_1 ) ) )
            // InternalJPADsl.g:2547:1: ( ( rule__UpdatableInternalAttribute__NameAssignment_1 ) )
            {
            // InternalJPADsl.g:2547:1: ( ( rule__UpdatableInternalAttribute__NameAssignment_1 ) )
            // InternalJPADsl.g:2548:2: ( rule__UpdatableInternalAttribute__NameAssignment_1 )
            {
             before(grammarAccess.getUpdatableInternalAttributeAccess().getNameAssignment_1()); 
            // InternalJPADsl.g:2549:2: ( rule__UpdatableInternalAttribute__NameAssignment_1 )
            // InternalJPADsl.g:2549:3: rule__UpdatableInternalAttribute__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__UpdatableInternalAttribute__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUpdatableInternalAttributeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdatableInternalAttribute__Group__1__Impl"


    // $ANTLR start "rule__UpdatableInternalAttribute__Group__2"
    // InternalJPADsl.g:2557:1: rule__UpdatableInternalAttribute__Group__2 : rule__UpdatableInternalAttribute__Group__2__Impl rule__UpdatableInternalAttribute__Group__3 ;
    public final void rule__UpdatableInternalAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:2561:1: ( rule__UpdatableInternalAttribute__Group__2__Impl rule__UpdatableInternalAttribute__Group__3 )
            // InternalJPADsl.g:2562:2: rule__UpdatableInternalAttribute__Group__2__Impl rule__UpdatableInternalAttribute__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__UpdatableInternalAttribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UpdatableInternalAttribute__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdatableInternalAttribute__Group__2"


    // $ANTLR start "rule__UpdatableInternalAttribute__Group__2__Impl"
    // InternalJPADsl.g:2569:1: rule__UpdatableInternalAttribute__Group__2__Impl : ( ':' ) ;
    public final void rule__UpdatableInternalAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:2573:1: ( ( ':' ) )
            // InternalJPADsl.g:2574:1: ( ':' )
            {
            // InternalJPADsl.g:2574:1: ( ':' )
            // InternalJPADsl.g:2575:2: ':'
            {
             before(grammarAccess.getUpdatableInternalAttributeAccess().getColonKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getUpdatableInternalAttributeAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdatableInternalAttribute__Group__2__Impl"


    // $ANTLR start "rule__UpdatableInternalAttribute__Group__3"
    // InternalJPADsl.g:2584:1: rule__UpdatableInternalAttribute__Group__3 : rule__UpdatableInternalAttribute__Group__3__Impl ;
    public final void rule__UpdatableInternalAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:2588:1: ( rule__UpdatableInternalAttribute__Group__3__Impl )
            // InternalJPADsl.g:2589:2: rule__UpdatableInternalAttribute__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UpdatableInternalAttribute__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdatableInternalAttribute__Group__3"


    // $ANTLR start "rule__UpdatableInternalAttribute__Group__3__Impl"
    // InternalJPADsl.g:2595:1: rule__UpdatableInternalAttribute__Group__3__Impl : ( ( rule__UpdatableInternalAttribute__TypeAssignment_3 ) ) ;
    public final void rule__UpdatableInternalAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:2599:1: ( ( ( rule__UpdatableInternalAttribute__TypeAssignment_3 ) ) )
            // InternalJPADsl.g:2600:1: ( ( rule__UpdatableInternalAttribute__TypeAssignment_3 ) )
            {
            // InternalJPADsl.g:2600:1: ( ( rule__UpdatableInternalAttribute__TypeAssignment_3 ) )
            // InternalJPADsl.g:2601:2: ( rule__UpdatableInternalAttribute__TypeAssignment_3 )
            {
             before(grammarAccess.getUpdatableInternalAttributeAccess().getTypeAssignment_3()); 
            // InternalJPADsl.g:2602:2: ( rule__UpdatableInternalAttribute__TypeAssignment_3 )
            // InternalJPADsl.g:2602:3: rule__UpdatableInternalAttribute__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__UpdatableInternalAttribute__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getUpdatableInternalAttributeAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdatableInternalAttribute__Group__3__Impl"


    // $ANTLR start "rule__TransientAttribute__Group__0"
    // InternalJPADsl.g:2611:1: rule__TransientAttribute__Group__0 : rule__TransientAttribute__Group__0__Impl rule__TransientAttribute__Group__1 ;
    public final void rule__TransientAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:2615:1: ( rule__TransientAttribute__Group__0__Impl rule__TransientAttribute__Group__1 )
            // InternalJPADsl.g:2616:2: rule__TransientAttribute__Group__0__Impl rule__TransientAttribute__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__TransientAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransientAttribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransientAttribute__Group__0"


    // $ANTLR start "rule__TransientAttribute__Group__0__Impl"
    // InternalJPADsl.g:2623:1: rule__TransientAttribute__Group__0__Impl : ( 'transient' ) ;
    public final void rule__TransientAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:2627:1: ( ( 'transient' ) )
            // InternalJPADsl.g:2628:1: ( 'transient' )
            {
            // InternalJPADsl.g:2628:1: ( 'transient' )
            // InternalJPADsl.g:2629:2: 'transient'
            {
             before(grammarAccess.getTransientAttributeAccess().getTransientKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getTransientAttributeAccess().getTransientKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransientAttribute__Group__0__Impl"


    // $ANTLR start "rule__TransientAttribute__Group__1"
    // InternalJPADsl.g:2638:1: rule__TransientAttribute__Group__1 : rule__TransientAttribute__Group__1__Impl rule__TransientAttribute__Group__2 ;
    public final void rule__TransientAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:2642:1: ( rule__TransientAttribute__Group__1__Impl rule__TransientAttribute__Group__2 )
            // InternalJPADsl.g:2643:2: rule__TransientAttribute__Group__1__Impl rule__TransientAttribute__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__TransientAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransientAttribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransientAttribute__Group__1"


    // $ANTLR start "rule__TransientAttribute__Group__1__Impl"
    // InternalJPADsl.g:2650:1: rule__TransientAttribute__Group__1__Impl : ( ( rule__TransientAttribute__NameAssignment_1 ) ) ;
    public final void rule__TransientAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:2654:1: ( ( ( rule__TransientAttribute__NameAssignment_1 ) ) )
            // InternalJPADsl.g:2655:1: ( ( rule__TransientAttribute__NameAssignment_1 ) )
            {
            // InternalJPADsl.g:2655:1: ( ( rule__TransientAttribute__NameAssignment_1 ) )
            // InternalJPADsl.g:2656:2: ( rule__TransientAttribute__NameAssignment_1 )
            {
             before(grammarAccess.getTransientAttributeAccess().getNameAssignment_1()); 
            // InternalJPADsl.g:2657:2: ( rule__TransientAttribute__NameAssignment_1 )
            // InternalJPADsl.g:2657:3: rule__TransientAttribute__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TransientAttribute__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTransientAttributeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransientAttribute__Group__1__Impl"


    // $ANTLR start "rule__TransientAttribute__Group__2"
    // InternalJPADsl.g:2665:1: rule__TransientAttribute__Group__2 : rule__TransientAttribute__Group__2__Impl rule__TransientAttribute__Group__3 ;
    public final void rule__TransientAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:2669:1: ( rule__TransientAttribute__Group__2__Impl rule__TransientAttribute__Group__3 )
            // InternalJPADsl.g:2670:2: rule__TransientAttribute__Group__2__Impl rule__TransientAttribute__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__TransientAttribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransientAttribute__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransientAttribute__Group__2"


    // $ANTLR start "rule__TransientAttribute__Group__2__Impl"
    // InternalJPADsl.g:2677:1: rule__TransientAttribute__Group__2__Impl : ( ':' ) ;
    public final void rule__TransientAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:2681:1: ( ( ':' ) )
            // InternalJPADsl.g:2682:1: ( ':' )
            {
            // InternalJPADsl.g:2682:1: ( ':' )
            // InternalJPADsl.g:2683:2: ':'
            {
             before(grammarAccess.getTransientAttributeAccess().getColonKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getTransientAttributeAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransientAttribute__Group__2__Impl"


    // $ANTLR start "rule__TransientAttribute__Group__3"
    // InternalJPADsl.g:2692:1: rule__TransientAttribute__Group__3 : rule__TransientAttribute__Group__3__Impl ;
    public final void rule__TransientAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:2696:1: ( rule__TransientAttribute__Group__3__Impl )
            // InternalJPADsl.g:2697:2: rule__TransientAttribute__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TransientAttribute__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransientAttribute__Group__3"


    // $ANTLR start "rule__TransientAttribute__Group__3__Impl"
    // InternalJPADsl.g:2703:1: rule__TransientAttribute__Group__3__Impl : ( ( rule__TransientAttribute__TypeAssignment_3 ) ) ;
    public final void rule__TransientAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:2707:1: ( ( ( rule__TransientAttribute__TypeAssignment_3 ) ) )
            // InternalJPADsl.g:2708:1: ( ( rule__TransientAttribute__TypeAssignment_3 ) )
            {
            // InternalJPADsl.g:2708:1: ( ( rule__TransientAttribute__TypeAssignment_3 ) )
            // InternalJPADsl.g:2709:2: ( rule__TransientAttribute__TypeAssignment_3 )
            {
             before(grammarAccess.getTransientAttributeAccess().getTypeAssignment_3()); 
            // InternalJPADsl.g:2710:2: ( rule__TransientAttribute__TypeAssignment_3 )
            // InternalJPADsl.g:2710:3: rule__TransientAttribute__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__TransientAttribute__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTransientAttributeAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransientAttribute__Group__3__Impl"


    // $ANTLR start "rule__IdAttribute__Group__0"
    // InternalJPADsl.g:2719:1: rule__IdAttribute__Group__0 : rule__IdAttribute__Group__0__Impl rule__IdAttribute__Group__1 ;
    public final void rule__IdAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:2723:1: ( rule__IdAttribute__Group__0__Impl rule__IdAttribute__Group__1 )
            // InternalJPADsl.g:2724:2: rule__IdAttribute__Group__0__Impl rule__IdAttribute__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__IdAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IdAttribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdAttribute__Group__0"


    // $ANTLR start "rule__IdAttribute__Group__0__Impl"
    // InternalJPADsl.g:2731:1: rule__IdAttribute__Group__0__Impl : ( 'id attribute' ) ;
    public final void rule__IdAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:2735:1: ( ( 'id attribute' ) )
            // InternalJPADsl.g:2736:1: ( 'id attribute' )
            {
            // InternalJPADsl.g:2736:1: ( 'id attribute' )
            // InternalJPADsl.g:2737:2: 'id attribute'
            {
             before(grammarAccess.getIdAttributeAccess().getIdAttributeKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getIdAttributeAccess().getIdAttributeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdAttribute__Group__0__Impl"


    // $ANTLR start "rule__IdAttribute__Group__1"
    // InternalJPADsl.g:2746:1: rule__IdAttribute__Group__1 : rule__IdAttribute__Group__1__Impl rule__IdAttribute__Group__2 ;
    public final void rule__IdAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:2750:1: ( rule__IdAttribute__Group__1__Impl rule__IdAttribute__Group__2 )
            // InternalJPADsl.g:2751:2: rule__IdAttribute__Group__1__Impl rule__IdAttribute__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__IdAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IdAttribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdAttribute__Group__1"


    // $ANTLR start "rule__IdAttribute__Group__1__Impl"
    // InternalJPADsl.g:2758:1: rule__IdAttribute__Group__1__Impl : ( ( rule__IdAttribute__NameAssignment_1 ) ) ;
    public final void rule__IdAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:2762:1: ( ( ( rule__IdAttribute__NameAssignment_1 ) ) )
            // InternalJPADsl.g:2763:1: ( ( rule__IdAttribute__NameAssignment_1 ) )
            {
            // InternalJPADsl.g:2763:1: ( ( rule__IdAttribute__NameAssignment_1 ) )
            // InternalJPADsl.g:2764:2: ( rule__IdAttribute__NameAssignment_1 )
            {
             before(grammarAccess.getIdAttributeAccess().getNameAssignment_1()); 
            // InternalJPADsl.g:2765:2: ( rule__IdAttribute__NameAssignment_1 )
            // InternalJPADsl.g:2765:3: rule__IdAttribute__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__IdAttribute__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIdAttributeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdAttribute__Group__1__Impl"


    // $ANTLR start "rule__IdAttribute__Group__2"
    // InternalJPADsl.g:2773:1: rule__IdAttribute__Group__2 : rule__IdAttribute__Group__2__Impl rule__IdAttribute__Group__3 ;
    public final void rule__IdAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:2777:1: ( rule__IdAttribute__Group__2__Impl rule__IdAttribute__Group__3 )
            // InternalJPADsl.g:2778:2: rule__IdAttribute__Group__2__Impl rule__IdAttribute__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__IdAttribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IdAttribute__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdAttribute__Group__2"


    // $ANTLR start "rule__IdAttribute__Group__2__Impl"
    // InternalJPADsl.g:2785:1: rule__IdAttribute__Group__2__Impl : ( ':' ) ;
    public final void rule__IdAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:2789:1: ( ( ':' ) )
            // InternalJPADsl.g:2790:1: ( ':' )
            {
            // InternalJPADsl.g:2790:1: ( ':' )
            // InternalJPADsl.g:2791:2: ':'
            {
             before(grammarAccess.getIdAttributeAccess().getColonKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getIdAttributeAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdAttribute__Group__2__Impl"


    // $ANTLR start "rule__IdAttribute__Group__3"
    // InternalJPADsl.g:2800:1: rule__IdAttribute__Group__3 : rule__IdAttribute__Group__3__Impl ;
    public final void rule__IdAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:2804:1: ( rule__IdAttribute__Group__3__Impl )
            // InternalJPADsl.g:2805:2: rule__IdAttribute__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IdAttribute__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdAttribute__Group__3"


    // $ANTLR start "rule__IdAttribute__Group__3__Impl"
    // InternalJPADsl.g:2811:1: rule__IdAttribute__Group__3__Impl : ( ( rule__IdAttribute__TypeAssignment_3 ) ) ;
    public final void rule__IdAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:2815:1: ( ( ( rule__IdAttribute__TypeAssignment_3 ) ) )
            // InternalJPADsl.g:2816:1: ( ( rule__IdAttribute__TypeAssignment_3 ) )
            {
            // InternalJPADsl.g:2816:1: ( ( rule__IdAttribute__TypeAssignment_3 ) )
            // InternalJPADsl.g:2817:2: ( rule__IdAttribute__TypeAssignment_3 )
            {
             before(grammarAccess.getIdAttributeAccess().getTypeAssignment_3()); 
            // InternalJPADsl.g:2818:2: ( rule__IdAttribute__TypeAssignment_3 )
            // InternalJPADsl.g:2818:3: rule__IdAttribute__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__IdAttribute__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getIdAttributeAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdAttribute__Group__3__Impl"


    // $ANTLR start "rule__OneToOneRelationshipAttribute__Group__0"
    // InternalJPADsl.g:2827:1: rule__OneToOneRelationshipAttribute__Group__0 : rule__OneToOneRelationshipAttribute__Group__0__Impl rule__OneToOneRelationshipAttribute__Group__1 ;
    public final void rule__OneToOneRelationshipAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:2831:1: ( rule__OneToOneRelationshipAttribute__Group__0__Impl rule__OneToOneRelationshipAttribute__Group__1 )
            // InternalJPADsl.g:2832:2: rule__OneToOneRelationshipAttribute__Group__0__Impl rule__OneToOneRelationshipAttribute__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__OneToOneRelationshipAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OneToOneRelationshipAttribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToOneRelationshipAttribute__Group__0"


    // $ANTLR start "rule__OneToOneRelationshipAttribute__Group__0__Impl"
    // InternalJPADsl.g:2839:1: rule__OneToOneRelationshipAttribute__Group__0__Impl : ( 'one to one join column' ) ;
    public final void rule__OneToOneRelationshipAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:2843:1: ( ( 'one to one join column' ) )
            // InternalJPADsl.g:2844:1: ( 'one to one join column' )
            {
            // InternalJPADsl.g:2844:1: ( 'one to one join column' )
            // InternalJPADsl.g:2845:2: 'one to one join column'
            {
             before(grammarAccess.getOneToOneRelationshipAttributeAccess().getOneToOneJoinColumnKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getOneToOneRelationshipAttributeAccess().getOneToOneJoinColumnKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToOneRelationshipAttribute__Group__0__Impl"


    // $ANTLR start "rule__OneToOneRelationshipAttribute__Group__1"
    // InternalJPADsl.g:2854:1: rule__OneToOneRelationshipAttribute__Group__1 : rule__OneToOneRelationshipAttribute__Group__1__Impl rule__OneToOneRelationshipAttribute__Group__2 ;
    public final void rule__OneToOneRelationshipAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:2858:1: ( rule__OneToOneRelationshipAttribute__Group__1__Impl rule__OneToOneRelationshipAttribute__Group__2 )
            // InternalJPADsl.g:2859:2: rule__OneToOneRelationshipAttribute__Group__1__Impl rule__OneToOneRelationshipAttribute__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__OneToOneRelationshipAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OneToOneRelationshipAttribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToOneRelationshipAttribute__Group__1"


    // $ANTLR start "rule__OneToOneRelationshipAttribute__Group__1__Impl"
    // InternalJPADsl.g:2866:1: rule__OneToOneRelationshipAttribute__Group__1__Impl : ( ( rule__OneToOneRelationshipAttribute__NameAssignment_1 ) ) ;
    public final void rule__OneToOneRelationshipAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:2870:1: ( ( ( rule__OneToOneRelationshipAttribute__NameAssignment_1 ) ) )
            // InternalJPADsl.g:2871:1: ( ( rule__OneToOneRelationshipAttribute__NameAssignment_1 ) )
            {
            // InternalJPADsl.g:2871:1: ( ( rule__OneToOneRelationshipAttribute__NameAssignment_1 ) )
            // InternalJPADsl.g:2872:2: ( rule__OneToOneRelationshipAttribute__NameAssignment_1 )
            {
             before(grammarAccess.getOneToOneRelationshipAttributeAccess().getNameAssignment_1()); 
            // InternalJPADsl.g:2873:2: ( rule__OneToOneRelationshipAttribute__NameAssignment_1 )
            // InternalJPADsl.g:2873:3: rule__OneToOneRelationshipAttribute__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__OneToOneRelationshipAttribute__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOneToOneRelationshipAttributeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToOneRelationshipAttribute__Group__1__Impl"


    // $ANTLR start "rule__OneToOneRelationshipAttribute__Group__2"
    // InternalJPADsl.g:2881:1: rule__OneToOneRelationshipAttribute__Group__2 : rule__OneToOneRelationshipAttribute__Group__2__Impl rule__OneToOneRelationshipAttribute__Group__3 ;
    public final void rule__OneToOneRelationshipAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:2885:1: ( rule__OneToOneRelationshipAttribute__Group__2__Impl rule__OneToOneRelationshipAttribute__Group__3 )
            // InternalJPADsl.g:2886:2: rule__OneToOneRelationshipAttribute__Group__2__Impl rule__OneToOneRelationshipAttribute__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__OneToOneRelationshipAttribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OneToOneRelationshipAttribute__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToOneRelationshipAttribute__Group__2"


    // $ANTLR start "rule__OneToOneRelationshipAttribute__Group__2__Impl"
    // InternalJPADsl.g:2893:1: rule__OneToOneRelationshipAttribute__Group__2__Impl : ( ':' ) ;
    public final void rule__OneToOneRelationshipAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:2897:1: ( ( ':' ) )
            // InternalJPADsl.g:2898:1: ( ':' )
            {
            // InternalJPADsl.g:2898:1: ( ':' )
            // InternalJPADsl.g:2899:2: ':'
            {
             before(grammarAccess.getOneToOneRelationshipAttributeAccess().getColonKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getOneToOneRelationshipAttributeAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToOneRelationshipAttribute__Group__2__Impl"


    // $ANTLR start "rule__OneToOneRelationshipAttribute__Group__3"
    // InternalJPADsl.g:2908:1: rule__OneToOneRelationshipAttribute__Group__3 : rule__OneToOneRelationshipAttribute__Group__3__Impl rule__OneToOneRelationshipAttribute__Group__4 ;
    public final void rule__OneToOneRelationshipAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:2912:1: ( rule__OneToOneRelationshipAttribute__Group__3__Impl rule__OneToOneRelationshipAttribute__Group__4 )
            // InternalJPADsl.g:2913:2: rule__OneToOneRelationshipAttribute__Group__3__Impl rule__OneToOneRelationshipAttribute__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__OneToOneRelationshipAttribute__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OneToOneRelationshipAttribute__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToOneRelationshipAttribute__Group__3"


    // $ANTLR start "rule__OneToOneRelationshipAttribute__Group__3__Impl"
    // InternalJPADsl.g:2920:1: rule__OneToOneRelationshipAttribute__Group__3__Impl : ( ( rule__OneToOneRelationshipAttribute__TypeAssignment_3 ) ) ;
    public final void rule__OneToOneRelationshipAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:2924:1: ( ( ( rule__OneToOneRelationshipAttribute__TypeAssignment_3 ) ) )
            // InternalJPADsl.g:2925:1: ( ( rule__OneToOneRelationshipAttribute__TypeAssignment_3 ) )
            {
            // InternalJPADsl.g:2925:1: ( ( rule__OneToOneRelationshipAttribute__TypeAssignment_3 ) )
            // InternalJPADsl.g:2926:2: ( rule__OneToOneRelationshipAttribute__TypeAssignment_3 )
            {
             before(grammarAccess.getOneToOneRelationshipAttributeAccess().getTypeAssignment_3()); 
            // InternalJPADsl.g:2927:2: ( rule__OneToOneRelationshipAttribute__TypeAssignment_3 )
            // InternalJPADsl.g:2927:3: rule__OneToOneRelationshipAttribute__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__OneToOneRelationshipAttribute__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getOneToOneRelationshipAttributeAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToOneRelationshipAttribute__Group__3__Impl"


    // $ANTLR start "rule__OneToOneRelationshipAttribute__Group__4"
    // InternalJPADsl.g:2935:1: rule__OneToOneRelationshipAttribute__Group__4 : rule__OneToOneRelationshipAttribute__Group__4__Impl ;
    public final void rule__OneToOneRelationshipAttribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:2939:1: ( rule__OneToOneRelationshipAttribute__Group__4__Impl )
            // InternalJPADsl.g:2940:2: rule__OneToOneRelationshipAttribute__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OneToOneRelationshipAttribute__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToOneRelationshipAttribute__Group__4"


    // $ANTLR start "rule__OneToOneRelationshipAttribute__Group__4__Impl"
    // InternalJPADsl.g:2946:1: rule__OneToOneRelationshipAttribute__Group__4__Impl : ( ( rule__OneToOneRelationshipAttribute__JoinColumnOverrideAssignment_4 )? ) ;
    public final void rule__OneToOneRelationshipAttribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:2950:1: ( ( ( rule__OneToOneRelationshipAttribute__JoinColumnOverrideAssignment_4 )? ) )
            // InternalJPADsl.g:2951:1: ( ( rule__OneToOneRelationshipAttribute__JoinColumnOverrideAssignment_4 )? )
            {
            // InternalJPADsl.g:2951:1: ( ( rule__OneToOneRelationshipAttribute__JoinColumnOverrideAssignment_4 )? )
            // InternalJPADsl.g:2952:2: ( rule__OneToOneRelationshipAttribute__JoinColumnOverrideAssignment_4 )?
            {
             before(grammarAccess.getOneToOneRelationshipAttributeAccess().getJoinColumnOverrideAssignment_4()); 
            // InternalJPADsl.g:2953:2: ( rule__OneToOneRelationshipAttribute__JoinColumnOverrideAssignment_4 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_STRING) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalJPADsl.g:2953:3: rule__OneToOneRelationshipAttribute__JoinColumnOverrideAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__OneToOneRelationshipAttribute__JoinColumnOverrideAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOneToOneRelationshipAttributeAccess().getJoinColumnOverrideAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToOneRelationshipAttribute__Group__4__Impl"


    // $ANTLR start "rule__OneToOneMappedByRelationshipAttribute__Group__0"
    // InternalJPADsl.g:2962:1: rule__OneToOneMappedByRelationshipAttribute__Group__0 : rule__OneToOneMappedByRelationshipAttribute__Group__0__Impl rule__OneToOneMappedByRelationshipAttribute__Group__1 ;
    public final void rule__OneToOneMappedByRelationshipAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:2966:1: ( rule__OneToOneMappedByRelationshipAttribute__Group__0__Impl rule__OneToOneMappedByRelationshipAttribute__Group__1 )
            // InternalJPADsl.g:2967:2: rule__OneToOneMappedByRelationshipAttribute__Group__0__Impl rule__OneToOneMappedByRelationshipAttribute__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__OneToOneMappedByRelationshipAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OneToOneMappedByRelationshipAttribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToOneMappedByRelationshipAttribute__Group__0"


    // $ANTLR start "rule__OneToOneMappedByRelationshipAttribute__Group__0__Impl"
    // InternalJPADsl.g:2974:1: rule__OneToOneMappedByRelationshipAttribute__Group__0__Impl : ( 'one to one mapped by' ) ;
    public final void rule__OneToOneMappedByRelationshipAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:2978:1: ( ( 'one to one mapped by' ) )
            // InternalJPADsl.g:2979:1: ( 'one to one mapped by' )
            {
            // InternalJPADsl.g:2979:1: ( 'one to one mapped by' )
            // InternalJPADsl.g:2980:2: 'one to one mapped by'
            {
             before(grammarAccess.getOneToOneMappedByRelationshipAttributeAccess().getOneToOneMappedByKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getOneToOneMappedByRelationshipAttributeAccess().getOneToOneMappedByKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToOneMappedByRelationshipAttribute__Group__0__Impl"


    // $ANTLR start "rule__OneToOneMappedByRelationshipAttribute__Group__1"
    // InternalJPADsl.g:2989:1: rule__OneToOneMappedByRelationshipAttribute__Group__1 : rule__OneToOneMappedByRelationshipAttribute__Group__1__Impl rule__OneToOneMappedByRelationshipAttribute__Group__2 ;
    public final void rule__OneToOneMappedByRelationshipAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:2993:1: ( rule__OneToOneMappedByRelationshipAttribute__Group__1__Impl rule__OneToOneMappedByRelationshipAttribute__Group__2 )
            // InternalJPADsl.g:2994:2: rule__OneToOneMappedByRelationshipAttribute__Group__1__Impl rule__OneToOneMappedByRelationshipAttribute__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__OneToOneMappedByRelationshipAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OneToOneMappedByRelationshipAttribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToOneMappedByRelationshipAttribute__Group__1"


    // $ANTLR start "rule__OneToOneMappedByRelationshipAttribute__Group__1__Impl"
    // InternalJPADsl.g:3001:1: rule__OneToOneMappedByRelationshipAttribute__Group__1__Impl : ( ( rule__OneToOneMappedByRelationshipAttribute__NameAssignment_1 ) ) ;
    public final void rule__OneToOneMappedByRelationshipAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:3005:1: ( ( ( rule__OneToOneMappedByRelationshipAttribute__NameAssignment_1 ) ) )
            // InternalJPADsl.g:3006:1: ( ( rule__OneToOneMappedByRelationshipAttribute__NameAssignment_1 ) )
            {
            // InternalJPADsl.g:3006:1: ( ( rule__OneToOneMappedByRelationshipAttribute__NameAssignment_1 ) )
            // InternalJPADsl.g:3007:2: ( rule__OneToOneMappedByRelationshipAttribute__NameAssignment_1 )
            {
             before(grammarAccess.getOneToOneMappedByRelationshipAttributeAccess().getNameAssignment_1()); 
            // InternalJPADsl.g:3008:2: ( rule__OneToOneMappedByRelationshipAttribute__NameAssignment_1 )
            // InternalJPADsl.g:3008:3: rule__OneToOneMappedByRelationshipAttribute__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__OneToOneMappedByRelationshipAttribute__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOneToOneMappedByRelationshipAttributeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToOneMappedByRelationshipAttribute__Group__1__Impl"


    // $ANTLR start "rule__OneToOneMappedByRelationshipAttribute__Group__2"
    // InternalJPADsl.g:3016:1: rule__OneToOneMappedByRelationshipAttribute__Group__2 : rule__OneToOneMappedByRelationshipAttribute__Group__2__Impl rule__OneToOneMappedByRelationshipAttribute__Group__3 ;
    public final void rule__OneToOneMappedByRelationshipAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:3020:1: ( rule__OneToOneMappedByRelationshipAttribute__Group__2__Impl rule__OneToOneMappedByRelationshipAttribute__Group__3 )
            // InternalJPADsl.g:3021:2: rule__OneToOneMappedByRelationshipAttribute__Group__2__Impl rule__OneToOneMappedByRelationshipAttribute__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__OneToOneMappedByRelationshipAttribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OneToOneMappedByRelationshipAttribute__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToOneMappedByRelationshipAttribute__Group__2"


    // $ANTLR start "rule__OneToOneMappedByRelationshipAttribute__Group__2__Impl"
    // InternalJPADsl.g:3028:1: rule__OneToOneMappedByRelationshipAttribute__Group__2__Impl : ( ':' ) ;
    public final void rule__OneToOneMappedByRelationshipAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:3032:1: ( ( ':' ) )
            // InternalJPADsl.g:3033:1: ( ':' )
            {
            // InternalJPADsl.g:3033:1: ( ':' )
            // InternalJPADsl.g:3034:2: ':'
            {
             before(grammarAccess.getOneToOneMappedByRelationshipAttributeAccess().getColonKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getOneToOneMappedByRelationshipAttributeAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToOneMappedByRelationshipAttribute__Group__2__Impl"


    // $ANTLR start "rule__OneToOneMappedByRelationshipAttribute__Group__3"
    // InternalJPADsl.g:3043:1: rule__OneToOneMappedByRelationshipAttribute__Group__3 : rule__OneToOneMappedByRelationshipAttribute__Group__3__Impl ;
    public final void rule__OneToOneMappedByRelationshipAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:3047:1: ( rule__OneToOneMappedByRelationshipAttribute__Group__3__Impl )
            // InternalJPADsl.g:3048:2: rule__OneToOneMappedByRelationshipAttribute__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OneToOneMappedByRelationshipAttribute__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToOneMappedByRelationshipAttribute__Group__3"


    // $ANTLR start "rule__OneToOneMappedByRelationshipAttribute__Group__3__Impl"
    // InternalJPADsl.g:3054:1: rule__OneToOneMappedByRelationshipAttribute__Group__3__Impl : ( ( rule__OneToOneMappedByRelationshipAttribute__TypeAssignment_3 ) ) ;
    public final void rule__OneToOneMappedByRelationshipAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:3058:1: ( ( ( rule__OneToOneMappedByRelationshipAttribute__TypeAssignment_3 ) ) )
            // InternalJPADsl.g:3059:1: ( ( rule__OneToOneMappedByRelationshipAttribute__TypeAssignment_3 ) )
            {
            // InternalJPADsl.g:3059:1: ( ( rule__OneToOneMappedByRelationshipAttribute__TypeAssignment_3 ) )
            // InternalJPADsl.g:3060:2: ( rule__OneToOneMappedByRelationshipAttribute__TypeAssignment_3 )
            {
             before(grammarAccess.getOneToOneMappedByRelationshipAttributeAccess().getTypeAssignment_3()); 
            // InternalJPADsl.g:3061:2: ( rule__OneToOneMappedByRelationshipAttribute__TypeAssignment_3 )
            // InternalJPADsl.g:3061:3: rule__OneToOneMappedByRelationshipAttribute__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__OneToOneMappedByRelationshipAttribute__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getOneToOneMappedByRelationshipAttributeAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToOneMappedByRelationshipAttribute__Group__3__Impl"


    // $ANTLR start "rule__OneToManyJoinTableRelationshipAttribute__Group__0"
    // InternalJPADsl.g:3070:1: rule__OneToManyJoinTableRelationshipAttribute__Group__0 : rule__OneToManyJoinTableRelationshipAttribute__Group__0__Impl rule__OneToManyJoinTableRelationshipAttribute__Group__1 ;
    public final void rule__OneToManyJoinTableRelationshipAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:3074:1: ( rule__OneToManyJoinTableRelationshipAttribute__Group__0__Impl rule__OneToManyJoinTableRelationshipAttribute__Group__1 )
            // InternalJPADsl.g:3075:2: rule__OneToManyJoinTableRelationshipAttribute__Group__0__Impl rule__OneToManyJoinTableRelationshipAttribute__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__OneToManyJoinTableRelationshipAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OneToManyJoinTableRelationshipAttribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToManyJoinTableRelationshipAttribute__Group__0"


    // $ANTLR start "rule__OneToManyJoinTableRelationshipAttribute__Group__0__Impl"
    // InternalJPADsl.g:3082:1: rule__OneToManyJoinTableRelationshipAttribute__Group__0__Impl : ( 'one to many using join table' ) ;
    public final void rule__OneToManyJoinTableRelationshipAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:3086:1: ( ( 'one to many using join table' ) )
            // InternalJPADsl.g:3087:1: ( 'one to many using join table' )
            {
            // InternalJPADsl.g:3087:1: ( 'one to many using join table' )
            // InternalJPADsl.g:3088:2: 'one to many using join table'
            {
             before(grammarAccess.getOneToManyJoinTableRelationshipAttributeAccess().getOneToManyUsingJoinTableKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getOneToManyJoinTableRelationshipAttributeAccess().getOneToManyUsingJoinTableKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToManyJoinTableRelationshipAttribute__Group__0__Impl"


    // $ANTLR start "rule__OneToManyJoinTableRelationshipAttribute__Group__1"
    // InternalJPADsl.g:3097:1: rule__OneToManyJoinTableRelationshipAttribute__Group__1 : rule__OneToManyJoinTableRelationshipAttribute__Group__1__Impl rule__OneToManyJoinTableRelationshipAttribute__Group__2 ;
    public final void rule__OneToManyJoinTableRelationshipAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:3101:1: ( rule__OneToManyJoinTableRelationshipAttribute__Group__1__Impl rule__OneToManyJoinTableRelationshipAttribute__Group__2 )
            // InternalJPADsl.g:3102:2: rule__OneToManyJoinTableRelationshipAttribute__Group__1__Impl rule__OneToManyJoinTableRelationshipAttribute__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__OneToManyJoinTableRelationshipAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OneToManyJoinTableRelationshipAttribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToManyJoinTableRelationshipAttribute__Group__1"


    // $ANTLR start "rule__OneToManyJoinTableRelationshipAttribute__Group__1__Impl"
    // InternalJPADsl.g:3109:1: rule__OneToManyJoinTableRelationshipAttribute__Group__1__Impl : ( ( rule__OneToManyJoinTableRelationshipAttribute__NameAssignment_1 ) ) ;
    public final void rule__OneToManyJoinTableRelationshipAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:3113:1: ( ( ( rule__OneToManyJoinTableRelationshipAttribute__NameAssignment_1 ) ) )
            // InternalJPADsl.g:3114:1: ( ( rule__OneToManyJoinTableRelationshipAttribute__NameAssignment_1 ) )
            {
            // InternalJPADsl.g:3114:1: ( ( rule__OneToManyJoinTableRelationshipAttribute__NameAssignment_1 ) )
            // InternalJPADsl.g:3115:2: ( rule__OneToManyJoinTableRelationshipAttribute__NameAssignment_1 )
            {
             before(grammarAccess.getOneToManyJoinTableRelationshipAttributeAccess().getNameAssignment_1()); 
            // InternalJPADsl.g:3116:2: ( rule__OneToManyJoinTableRelationshipAttribute__NameAssignment_1 )
            // InternalJPADsl.g:3116:3: rule__OneToManyJoinTableRelationshipAttribute__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__OneToManyJoinTableRelationshipAttribute__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOneToManyJoinTableRelationshipAttributeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToManyJoinTableRelationshipAttribute__Group__1__Impl"


    // $ANTLR start "rule__OneToManyJoinTableRelationshipAttribute__Group__2"
    // InternalJPADsl.g:3124:1: rule__OneToManyJoinTableRelationshipAttribute__Group__2 : rule__OneToManyJoinTableRelationshipAttribute__Group__2__Impl rule__OneToManyJoinTableRelationshipAttribute__Group__3 ;
    public final void rule__OneToManyJoinTableRelationshipAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:3128:1: ( rule__OneToManyJoinTableRelationshipAttribute__Group__2__Impl rule__OneToManyJoinTableRelationshipAttribute__Group__3 )
            // InternalJPADsl.g:3129:2: rule__OneToManyJoinTableRelationshipAttribute__Group__2__Impl rule__OneToManyJoinTableRelationshipAttribute__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__OneToManyJoinTableRelationshipAttribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OneToManyJoinTableRelationshipAttribute__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToManyJoinTableRelationshipAttribute__Group__2"


    // $ANTLR start "rule__OneToManyJoinTableRelationshipAttribute__Group__2__Impl"
    // InternalJPADsl.g:3136:1: rule__OneToManyJoinTableRelationshipAttribute__Group__2__Impl : ( ':' ) ;
    public final void rule__OneToManyJoinTableRelationshipAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:3140:1: ( ( ':' ) )
            // InternalJPADsl.g:3141:1: ( ':' )
            {
            // InternalJPADsl.g:3141:1: ( ':' )
            // InternalJPADsl.g:3142:2: ':'
            {
             before(grammarAccess.getOneToManyJoinTableRelationshipAttributeAccess().getColonKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getOneToManyJoinTableRelationshipAttributeAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToManyJoinTableRelationshipAttribute__Group__2__Impl"


    // $ANTLR start "rule__OneToManyJoinTableRelationshipAttribute__Group__3"
    // InternalJPADsl.g:3151:1: rule__OneToManyJoinTableRelationshipAttribute__Group__3 : rule__OneToManyJoinTableRelationshipAttribute__Group__3__Impl ;
    public final void rule__OneToManyJoinTableRelationshipAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:3155:1: ( rule__OneToManyJoinTableRelationshipAttribute__Group__3__Impl )
            // InternalJPADsl.g:3156:2: rule__OneToManyJoinTableRelationshipAttribute__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OneToManyJoinTableRelationshipAttribute__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToManyJoinTableRelationshipAttribute__Group__3"


    // $ANTLR start "rule__OneToManyJoinTableRelationshipAttribute__Group__3__Impl"
    // InternalJPADsl.g:3162:1: rule__OneToManyJoinTableRelationshipAttribute__Group__3__Impl : ( ( rule__OneToManyJoinTableRelationshipAttribute__TypeAssignment_3 ) ) ;
    public final void rule__OneToManyJoinTableRelationshipAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:3166:1: ( ( ( rule__OneToManyJoinTableRelationshipAttribute__TypeAssignment_3 ) ) )
            // InternalJPADsl.g:3167:1: ( ( rule__OneToManyJoinTableRelationshipAttribute__TypeAssignment_3 ) )
            {
            // InternalJPADsl.g:3167:1: ( ( rule__OneToManyJoinTableRelationshipAttribute__TypeAssignment_3 ) )
            // InternalJPADsl.g:3168:2: ( rule__OneToManyJoinTableRelationshipAttribute__TypeAssignment_3 )
            {
             before(grammarAccess.getOneToManyJoinTableRelationshipAttributeAccess().getTypeAssignment_3()); 
            // InternalJPADsl.g:3169:2: ( rule__OneToManyJoinTableRelationshipAttribute__TypeAssignment_3 )
            // InternalJPADsl.g:3169:3: rule__OneToManyJoinTableRelationshipAttribute__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__OneToManyJoinTableRelationshipAttribute__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getOneToManyJoinTableRelationshipAttributeAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToManyJoinTableRelationshipAttribute__Group__3__Impl"


    // $ANTLR start "rule__OneToManyJoinColumnRelationshipAttribute__Group__0"
    // InternalJPADsl.g:3178:1: rule__OneToManyJoinColumnRelationshipAttribute__Group__0 : rule__OneToManyJoinColumnRelationshipAttribute__Group__0__Impl rule__OneToManyJoinColumnRelationshipAttribute__Group__1 ;
    public final void rule__OneToManyJoinColumnRelationshipAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:3182:1: ( rule__OneToManyJoinColumnRelationshipAttribute__Group__0__Impl rule__OneToManyJoinColumnRelationshipAttribute__Group__1 )
            // InternalJPADsl.g:3183:2: rule__OneToManyJoinColumnRelationshipAttribute__Group__0__Impl rule__OneToManyJoinColumnRelationshipAttribute__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__OneToManyJoinColumnRelationshipAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OneToManyJoinColumnRelationshipAttribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToManyJoinColumnRelationshipAttribute__Group__0"


    // $ANTLR start "rule__OneToManyJoinColumnRelationshipAttribute__Group__0__Impl"
    // InternalJPADsl.g:3190:1: rule__OneToManyJoinColumnRelationshipAttribute__Group__0__Impl : ( 'one to many using join column' ) ;
    public final void rule__OneToManyJoinColumnRelationshipAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:3194:1: ( ( 'one to many using join column' ) )
            // InternalJPADsl.g:3195:1: ( 'one to many using join column' )
            {
            // InternalJPADsl.g:3195:1: ( 'one to many using join column' )
            // InternalJPADsl.g:3196:2: 'one to many using join column'
            {
             before(grammarAccess.getOneToManyJoinColumnRelationshipAttributeAccess().getOneToManyUsingJoinColumnKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getOneToManyJoinColumnRelationshipAttributeAccess().getOneToManyUsingJoinColumnKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToManyJoinColumnRelationshipAttribute__Group__0__Impl"


    // $ANTLR start "rule__OneToManyJoinColumnRelationshipAttribute__Group__1"
    // InternalJPADsl.g:3205:1: rule__OneToManyJoinColumnRelationshipAttribute__Group__1 : rule__OneToManyJoinColumnRelationshipAttribute__Group__1__Impl rule__OneToManyJoinColumnRelationshipAttribute__Group__2 ;
    public final void rule__OneToManyJoinColumnRelationshipAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:3209:1: ( rule__OneToManyJoinColumnRelationshipAttribute__Group__1__Impl rule__OneToManyJoinColumnRelationshipAttribute__Group__2 )
            // InternalJPADsl.g:3210:2: rule__OneToManyJoinColumnRelationshipAttribute__Group__1__Impl rule__OneToManyJoinColumnRelationshipAttribute__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__OneToManyJoinColumnRelationshipAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OneToManyJoinColumnRelationshipAttribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToManyJoinColumnRelationshipAttribute__Group__1"


    // $ANTLR start "rule__OneToManyJoinColumnRelationshipAttribute__Group__1__Impl"
    // InternalJPADsl.g:3217:1: rule__OneToManyJoinColumnRelationshipAttribute__Group__1__Impl : ( ( rule__OneToManyJoinColumnRelationshipAttribute__NameAssignment_1 ) ) ;
    public final void rule__OneToManyJoinColumnRelationshipAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:3221:1: ( ( ( rule__OneToManyJoinColumnRelationshipAttribute__NameAssignment_1 ) ) )
            // InternalJPADsl.g:3222:1: ( ( rule__OneToManyJoinColumnRelationshipAttribute__NameAssignment_1 ) )
            {
            // InternalJPADsl.g:3222:1: ( ( rule__OneToManyJoinColumnRelationshipAttribute__NameAssignment_1 ) )
            // InternalJPADsl.g:3223:2: ( rule__OneToManyJoinColumnRelationshipAttribute__NameAssignment_1 )
            {
             before(grammarAccess.getOneToManyJoinColumnRelationshipAttributeAccess().getNameAssignment_1()); 
            // InternalJPADsl.g:3224:2: ( rule__OneToManyJoinColumnRelationshipAttribute__NameAssignment_1 )
            // InternalJPADsl.g:3224:3: rule__OneToManyJoinColumnRelationshipAttribute__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__OneToManyJoinColumnRelationshipAttribute__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOneToManyJoinColumnRelationshipAttributeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToManyJoinColumnRelationshipAttribute__Group__1__Impl"


    // $ANTLR start "rule__OneToManyJoinColumnRelationshipAttribute__Group__2"
    // InternalJPADsl.g:3232:1: rule__OneToManyJoinColumnRelationshipAttribute__Group__2 : rule__OneToManyJoinColumnRelationshipAttribute__Group__2__Impl rule__OneToManyJoinColumnRelationshipAttribute__Group__3 ;
    public final void rule__OneToManyJoinColumnRelationshipAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:3236:1: ( rule__OneToManyJoinColumnRelationshipAttribute__Group__2__Impl rule__OneToManyJoinColumnRelationshipAttribute__Group__3 )
            // InternalJPADsl.g:3237:2: rule__OneToManyJoinColumnRelationshipAttribute__Group__2__Impl rule__OneToManyJoinColumnRelationshipAttribute__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__OneToManyJoinColumnRelationshipAttribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OneToManyJoinColumnRelationshipAttribute__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToManyJoinColumnRelationshipAttribute__Group__2"


    // $ANTLR start "rule__OneToManyJoinColumnRelationshipAttribute__Group__2__Impl"
    // InternalJPADsl.g:3244:1: rule__OneToManyJoinColumnRelationshipAttribute__Group__2__Impl : ( ':' ) ;
    public final void rule__OneToManyJoinColumnRelationshipAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:3248:1: ( ( ':' ) )
            // InternalJPADsl.g:3249:1: ( ':' )
            {
            // InternalJPADsl.g:3249:1: ( ':' )
            // InternalJPADsl.g:3250:2: ':'
            {
             before(grammarAccess.getOneToManyJoinColumnRelationshipAttributeAccess().getColonKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getOneToManyJoinColumnRelationshipAttributeAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToManyJoinColumnRelationshipAttribute__Group__2__Impl"


    // $ANTLR start "rule__OneToManyJoinColumnRelationshipAttribute__Group__3"
    // InternalJPADsl.g:3259:1: rule__OneToManyJoinColumnRelationshipAttribute__Group__3 : rule__OneToManyJoinColumnRelationshipAttribute__Group__3__Impl ;
    public final void rule__OneToManyJoinColumnRelationshipAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:3263:1: ( rule__OneToManyJoinColumnRelationshipAttribute__Group__3__Impl )
            // InternalJPADsl.g:3264:2: rule__OneToManyJoinColumnRelationshipAttribute__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OneToManyJoinColumnRelationshipAttribute__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToManyJoinColumnRelationshipAttribute__Group__3"


    // $ANTLR start "rule__OneToManyJoinColumnRelationshipAttribute__Group__3__Impl"
    // InternalJPADsl.g:3270:1: rule__OneToManyJoinColumnRelationshipAttribute__Group__3__Impl : ( ( rule__OneToManyJoinColumnRelationshipAttribute__TypeAssignment_3 ) ) ;
    public final void rule__OneToManyJoinColumnRelationshipAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:3274:1: ( ( ( rule__OneToManyJoinColumnRelationshipAttribute__TypeAssignment_3 ) ) )
            // InternalJPADsl.g:3275:1: ( ( rule__OneToManyJoinColumnRelationshipAttribute__TypeAssignment_3 ) )
            {
            // InternalJPADsl.g:3275:1: ( ( rule__OneToManyJoinColumnRelationshipAttribute__TypeAssignment_3 ) )
            // InternalJPADsl.g:3276:2: ( rule__OneToManyJoinColumnRelationshipAttribute__TypeAssignment_3 )
            {
             before(grammarAccess.getOneToManyJoinColumnRelationshipAttributeAccess().getTypeAssignment_3()); 
            // InternalJPADsl.g:3277:2: ( rule__OneToManyJoinColumnRelationshipAttribute__TypeAssignment_3 )
            // InternalJPADsl.g:3277:3: rule__OneToManyJoinColumnRelationshipAttribute__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__OneToManyJoinColumnRelationshipAttribute__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getOneToManyJoinColumnRelationshipAttributeAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToManyJoinColumnRelationshipAttribute__Group__3__Impl"


    // $ANTLR start "rule__OneToManyMappedByRelationshipAttribute__Group__0"
    // InternalJPADsl.g:3286:1: rule__OneToManyMappedByRelationshipAttribute__Group__0 : rule__OneToManyMappedByRelationshipAttribute__Group__0__Impl rule__OneToManyMappedByRelationshipAttribute__Group__1 ;
    public final void rule__OneToManyMappedByRelationshipAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:3290:1: ( rule__OneToManyMappedByRelationshipAttribute__Group__0__Impl rule__OneToManyMappedByRelationshipAttribute__Group__1 )
            // InternalJPADsl.g:3291:2: rule__OneToManyMappedByRelationshipAttribute__Group__0__Impl rule__OneToManyMappedByRelationshipAttribute__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__OneToManyMappedByRelationshipAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OneToManyMappedByRelationshipAttribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToManyMappedByRelationshipAttribute__Group__0"


    // $ANTLR start "rule__OneToManyMappedByRelationshipAttribute__Group__0__Impl"
    // InternalJPADsl.g:3298:1: rule__OneToManyMappedByRelationshipAttribute__Group__0__Impl : ( 'one to many mapped by' ) ;
    public final void rule__OneToManyMappedByRelationshipAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:3302:1: ( ( 'one to many mapped by' ) )
            // InternalJPADsl.g:3303:1: ( 'one to many mapped by' )
            {
            // InternalJPADsl.g:3303:1: ( 'one to many mapped by' )
            // InternalJPADsl.g:3304:2: 'one to many mapped by'
            {
             before(grammarAccess.getOneToManyMappedByRelationshipAttributeAccess().getOneToManyMappedByKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getOneToManyMappedByRelationshipAttributeAccess().getOneToManyMappedByKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToManyMappedByRelationshipAttribute__Group__0__Impl"


    // $ANTLR start "rule__OneToManyMappedByRelationshipAttribute__Group__1"
    // InternalJPADsl.g:3313:1: rule__OneToManyMappedByRelationshipAttribute__Group__1 : rule__OneToManyMappedByRelationshipAttribute__Group__1__Impl rule__OneToManyMappedByRelationshipAttribute__Group__2 ;
    public final void rule__OneToManyMappedByRelationshipAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:3317:1: ( rule__OneToManyMappedByRelationshipAttribute__Group__1__Impl rule__OneToManyMappedByRelationshipAttribute__Group__2 )
            // InternalJPADsl.g:3318:2: rule__OneToManyMappedByRelationshipAttribute__Group__1__Impl rule__OneToManyMappedByRelationshipAttribute__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__OneToManyMappedByRelationshipAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OneToManyMappedByRelationshipAttribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToManyMappedByRelationshipAttribute__Group__1"


    // $ANTLR start "rule__OneToManyMappedByRelationshipAttribute__Group__1__Impl"
    // InternalJPADsl.g:3325:1: rule__OneToManyMappedByRelationshipAttribute__Group__1__Impl : ( ( rule__OneToManyMappedByRelationshipAttribute__NameAssignment_1 ) ) ;
    public final void rule__OneToManyMappedByRelationshipAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:3329:1: ( ( ( rule__OneToManyMappedByRelationshipAttribute__NameAssignment_1 ) ) )
            // InternalJPADsl.g:3330:1: ( ( rule__OneToManyMappedByRelationshipAttribute__NameAssignment_1 ) )
            {
            // InternalJPADsl.g:3330:1: ( ( rule__OneToManyMappedByRelationshipAttribute__NameAssignment_1 ) )
            // InternalJPADsl.g:3331:2: ( rule__OneToManyMappedByRelationshipAttribute__NameAssignment_1 )
            {
             before(grammarAccess.getOneToManyMappedByRelationshipAttributeAccess().getNameAssignment_1()); 
            // InternalJPADsl.g:3332:2: ( rule__OneToManyMappedByRelationshipAttribute__NameAssignment_1 )
            // InternalJPADsl.g:3332:3: rule__OneToManyMappedByRelationshipAttribute__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__OneToManyMappedByRelationshipAttribute__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOneToManyMappedByRelationshipAttributeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToManyMappedByRelationshipAttribute__Group__1__Impl"


    // $ANTLR start "rule__OneToManyMappedByRelationshipAttribute__Group__2"
    // InternalJPADsl.g:3340:1: rule__OneToManyMappedByRelationshipAttribute__Group__2 : rule__OneToManyMappedByRelationshipAttribute__Group__2__Impl rule__OneToManyMappedByRelationshipAttribute__Group__3 ;
    public final void rule__OneToManyMappedByRelationshipAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:3344:1: ( rule__OneToManyMappedByRelationshipAttribute__Group__2__Impl rule__OneToManyMappedByRelationshipAttribute__Group__3 )
            // InternalJPADsl.g:3345:2: rule__OneToManyMappedByRelationshipAttribute__Group__2__Impl rule__OneToManyMappedByRelationshipAttribute__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__OneToManyMappedByRelationshipAttribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OneToManyMappedByRelationshipAttribute__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToManyMappedByRelationshipAttribute__Group__2"


    // $ANTLR start "rule__OneToManyMappedByRelationshipAttribute__Group__2__Impl"
    // InternalJPADsl.g:3352:1: rule__OneToManyMappedByRelationshipAttribute__Group__2__Impl : ( ':' ) ;
    public final void rule__OneToManyMappedByRelationshipAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:3356:1: ( ( ':' ) )
            // InternalJPADsl.g:3357:1: ( ':' )
            {
            // InternalJPADsl.g:3357:1: ( ':' )
            // InternalJPADsl.g:3358:2: ':'
            {
             before(grammarAccess.getOneToManyMappedByRelationshipAttributeAccess().getColonKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getOneToManyMappedByRelationshipAttributeAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToManyMappedByRelationshipAttribute__Group__2__Impl"


    // $ANTLR start "rule__OneToManyMappedByRelationshipAttribute__Group__3"
    // InternalJPADsl.g:3367:1: rule__OneToManyMappedByRelationshipAttribute__Group__3 : rule__OneToManyMappedByRelationshipAttribute__Group__3__Impl ;
    public final void rule__OneToManyMappedByRelationshipAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:3371:1: ( rule__OneToManyMappedByRelationshipAttribute__Group__3__Impl )
            // InternalJPADsl.g:3372:2: rule__OneToManyMappedByRelationshipAttribute__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OneToManyMappedByRelationshipAttribute__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToManyMappedByRelationshipAttribute__Group__3"


    // $ANTLR start "rule__OneToManyMappedByRelationshipAttribute__Group__3__Impl"
    // InternalJPADsl.g:3378:1: rule__OneToManyMappedByRelationshipAttribute__Group__3__Impl : ( ( rule__OneToManyMappedByRelationshipAttribute__TypeAssignment_3 ) ) ;
    public final void rule__OneToManyMappedByRelationshipAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:3382:1: ( ( ( rule__OneToManyMappedByRelationshipAttribute__TypeAssignment_3 ) ) )
            // InternalJPADsl.g:3383:1: ( ( rule__OneToManyMappedByRelationshipAttribute__TypeAssignment_3 ) )
            {
            // InternalJPADsl.g:3383:1: ( ( rule__OneToManyMappedByRelationshipAttribute__TypeAssignment_3 ) )
            // InternalJPADsl.g:3384:2: ( rule__OneToManyMappedByRelationshipAttribute__TypeAssignment_3 )
            {
             before(grammarAccess.getOneToManyMappedByRelationshipAttributeAccess().getTypeAssignment_3()); 
            // InternalJPADsl.g:3385:2: ( rule__OneToManyMappedByRelationshipAttribute__TypeAssignment_3 )
            // InternalJPADsl.g:3385:3: rule__OneToManyMappedByRelationshipAttribute__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__OneToManyMappedByRelationshipAttribute__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getOneToManyMappedByRelationshipAttributeAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToManyMappedByRelationshipAttribute__Group__3__Impl"


    // $ANTLR start "rule__ManyToOneJoinColumnRelationShipAttribute__Group__0"
    // InternalJPADsl.g:3394:1: rule__ManyToOneJoinColumnRelationShipAttribute__Group__0 : rule__ManyToOneJoinColumnRelationShipAttribute__Group__0__Impl rule__ManyToOneJoinColumnRelationShipAttribute__Group__1 ;
    public final void rule__ManyToOneJoinColumnRelationShipAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:3398:1: ( rule__ManyToOneJoinColumnRelationShipAttribute__Group__0__Impl rule__ManyToOneJoinColumnRelationShipAttribute__Group__1 )
            // InternalJPADsl.g:3399:2: rule__ManyToOneJoinColumnRelationShipAttribute__Group__0__Impl rule__ManyToOneJoinColumnRelationShipAttribute__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ManyToOneJoinColumnRelationShipAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManyToOneJoinColumnRelationShipAttribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToOneJoinColumnRelationShipAttribute__Group__0"


    // $ANTLR start "rule__ManyToOneJoinColumnRelationShipAttribute__Group__0__Impl"
    // InternalJPADsl.g:3406:1: rule__ManyToOneJoinColumnRelationShipAttribute__Group__0__Impl : ( 'many to one using join column' ) ;
    public final void rule__ManyToOneJoinColumnRelationShipAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:3410:1: ( ( 'many to one using join column' ) )
            // InternalJPADsl.g:3411:1: ( 'many to one using join column' )
            {
            // InternalJPADsl.g:3411:1: ( 'many to one using join column' )
            // InternalJPADsl.g:3412:2: 'many to one using join column'
            {
             before(grammarAccess.getManyToOneJoinColumnRelationShipAttributeAccess().getManyToOneUsingJoinColumnKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getManyToOneJoinColumnRelationShipAttributeAccess().getManyToOneUsingJoinColumnKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToOneJoinColumnRelationShipAttribute__Group__0__Impl"


    // $ANTLR start "rule__ManyToOneJoinColumnRelationShipAttribute__Group__1"
    // InternalJPADsl.g:3421:1: rule__ManyToOneJoinColumnRelationShipAttribute__Group__1 : rule__ManyToOneJoinColumnRelationShipAttribute__Group__1__Impl rule__ManyToOneJoinColumnRelationShipAttribute__Group__2 ;
    public final void rule__ManyToOneJoinColumnRelationShipAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:3425:1: ( rule__ManyToOneJoinColumnRelationShipAttribute__Group__1__Impl rule__ManyToOneJoinColumnRelationShipAttribute__Group__2 )
            // InternalJPADsl.g:3426:2: rule__ManyToOneJoinColumnRelationShipAttribute__Group__1__Impl rule__ManyToOneJoinColumnRelationShipAttribute__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__ManyToOneJoinColumnRelationShipAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManyToOneJoinColumnRelationShipAttribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToOneJoinColumnRelationShipAttribute__Group__1"


    // $ANTLR start "rule__ManyToOneJoinColumnRelationShipAttribute__Group__1__Impl"
    // InternalJPADsl.g:3433:1: rule__ManyToOneJoinColumnRelationShipAttribute__Group__1__Impl : ( ( rule__ManyToOneJoinColumnRelationShipAttribute__NameAssignment_1 ) ) ;
    public final void rule__ManyToOneJoinColumnRelationShipAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:3437:1: ( ( ( rule__ManyToOneJoinColumnRelationShipAttribute__NameAssignment_1 ) ) )
            // InternalJPADsl.g:3438:1: ( ( rule__ManyToOneJoinColumnRelationShipAttribute__NameAssignment_1 ) )
            {
            // InternalJPADsl.g:3438:1: ( ( rule__ManyToOneJoinColumnRelationShipAttribute__NameAssignment_1 ) )
            // InternalJPADsl.g:3439:2: ( rule__ManyToOneJoinColumnRelationShipAttribute__NameAssignment_1 )
            {
             before(grammarAccess.getManyToOneJoinColumnRelationShipAttributeAccess().getNameAssignment_1()); 
            // InternalJPADsl.g:3440:2: ( rule__ManyToOneJoinColumnRelationShipAttribute__NameAssignment_1 )
            // InternalJPADsl.g:3440:3: rule__ManyToOneJoinColumnRelationShipAttribute__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ManyToOneJoinColumnRelationShipAttribute__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getManyToOneJoinColumnRelationShipAttributeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToOneJoinColumnRelationShipAttribute__Group__1__Impl"


    // $ANTLR start "rule__ManyToOneJoinColumnRelationShipAttribute__Group__2"
    // InternalJPADsl.g:3448:1: rule__ManyToOneJoinColumnRelationShipAttribute__Group__2 : rule__ManyToOneJoinColumnRelationShipAttribute__Group__2__Impl rule__ManyToOneJoinColumnRelationShipAttribute__Group__3 ;
    public final void rule__ManyToOneJoinColumnRelationShipAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:3452:1: ( rule__ManyToOneJoinColumnRelationShipAttribute__Group__2__Impl rule__ManyToOneJoinColumnRelationShipAttribute__Group__3 )
            // InternalJPADsl.g:3453:2: rule__ManyToOneJoinColumnRelationShipAttribute__Group__2__Impl rule__ManyToOneJoinColumnRelationShipAttribute__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__ManyToOneJoinColumnRelationShipAttribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManyToOneJoinColumnRelationShipAttribute__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToOneJoinColumnRelationShipAttribute__Group__2"


    // $ANTLR start "rule__ManyToOneJoinColumnRelationShipAttribute__Group__2__Impl"
    // InternalJPADsl.g:3460:1: rule__ManyToOneJoinColumnRelationShipAttribute__Group__2__Impl : ( ':' ) ;
    public final void rule__ManyToOneJoinColumnRelationShipAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:3464:1: ( ( ':' ) )
            // InternalJPADsl.g:3465:1: ( ':' )
            {
            // InternalJPADsl.g:3465:1: ( ':' )
            // InternalJPADsl.g:3466:2: ':'
            {
             before(grammarAccess.getManyToOneJoinColumnRelationShipAttributeAccess().getColonKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getManyToOneJoinColumnRelationShipAttributeAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToOneJoinColumnRelationShipAttribute__Group__2__Impl"


    // $ANTLR start "rule__ManyToOneJoinColumnRelationShipAttribute__Group__3"
    // InternalJPADsl.g:3475:1: rule__ManyToOneJoinColumnRelationShipAttribute__Group__3 : rule__ManyToOneJoinColumnRelationShipAttribute__Group__3__Impl rule__ManyToOneJoinColumnRelationShipAttribute__Group__4 ;
    public final void rule__ManyToOneJoinColumnRelationShipAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:3479:1: ( rule__ManyToOneJoinColumnRelationShipAttribute__Group__3__Impl rule__ManyToOneJoinColumnRelationShipAttribute__Group__4 )
            // InternalJPADsl.g:3480:2: rule__ManyToOneJoinColumnRelationShipAttribute__Group__3__Impl rule__ManyToOneJoinColumnRelationShipAttribute__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__ManyToOneJoinColumnRelationShipAttribute__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManyToOneJoinColumnRelationShipAttribute__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToOneJoinColumnRelationShipAttribute__Group__3"


    // $ANTLR start "rule__ManyToOneJoinColumnRelationShipAttribute__Group__3__Impl"
    // InternalJPADsl.g:3487:1: rule__ManyToOneJoinColumnRelationShipAttribute__Group__3__Impl : ( ( rule__ManyToOneJoinColumnRelationShipAttribute__TypeAssignment_3 ) ) ;
    public final void rule__ManyToOneJoinColumnRelationShipAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:3491:1: ( ( ( rule__ManyToOneJoinColumnRelationShipAttribute__TypeAssignment_3 ) ) )
            // InternalJPADsl.g:3492:1: ( ( rule__ManyToOneJoinColumnRelationShipAttribute__TypeAssignment_3 ) )
            {
            // InternalJPADsl.g:3492:1: ( ( rule__ManyToOneJoinColumnRelationShipAttribute__TypeAssignment_3 ) )
            // InternalJPADsl.g:3493:2: ( rule__ManyToOneJoinColumnRelationShipAttribute__TypeAssignment_3 )
            {
             before(grammarAccess.getManyToOneJoinColumnRelationShipAttributeAccess().getTypeAssignment_3()); 
            // InternalJPADsl.g:3494:2: ( rule__ManyToOneJoinColumnRelationShipAttribute__TypeAssignment_3 )
            // InternalJPADsl.g:3494:3: rule__ManyToOneJoinColumnRelationShipAttribute__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ManyToOneJoinColumnRelationShipAttribute__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getManyToOneJoinColumnRelationShipAttributeAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToOneJoinColumnRelationShipAttribute__Group__3__Impl"


    // $ANTLR start "rule__ManyToOneJoinColumnRelationShipAttribute__Group__4"
    // InternalJPADsl.g:3502:1: rule__ManyToOneJoinColumnRelationShipAttribute__Group__4 : rule__ManyToOneJoinColumnRelationShipAttribute__Group__4__Impl ;
    public final void rule__ManyToOneJoinColumnRelationShipAttribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:3506:1: ( rule__ManyToOneJoinColumnRelationShipAttribute__Group__4__Impl )
            // InternalJPADsl.g:3507:2: rule__ManyToOneJoinColumnRelationShipAttribute__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ManyToOneJoinColumnRelationShipAttribute__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToOneJoinColumnRelationShipAttribute__Group__4"


    // $ANTLR start "rule__ManyToOneJoinColumnRelationShipAttribute__Group__4__Impl"
    // InternalJPADsl.g:3513:1: rule__ManyToOneJoinColumnRelationShipAttribute__Group__4__Impl : ( ( rule__ManyToOneJoinColumnRelationShipAttribute__JoinColumnOverrideAssignment_4 )? ) ;
    public final void rule__ManyToOneJoinColumnRelationShipAttribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:3517:1: ( ( ( rule__ManyToOneJoinColumnRelationShipAttribute__JoinColumnOverrideAssignment_4 )? ) )
            // InternalJPADsl.g:3518:1: ( ( rule__ManyToOneJoinColumnRelationShipAttribute__JoinColumnOverrideAssignment_4 )? )
            {
            // InternalJPADsl.g:3518:1: ( ( rule__ManyToOneJoinColumnRelationShipAttribute__JoinColumnOverrideAssignment_4 )? )
            // InternalJPADsl.g:3519:2: ( rule__ManyToOneJoinColumnRelationShipAttribute__JoinColumnOverrideAssignment_4 )?
            {
             before(grammarAccess.getManyToOneJoinColumnRelationShipAttributeAccess().getJoinColumnOverrideAssignment_4()); 
            // InternalJPADsl.g:3520:2: ( rule__ManyToOneJoinColumnRelationShipAttribute__JoinColumnOverrideAssignment_4 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_STRING) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalJPADsl.g:3520:3: rule__ManyToOneJoinColumnRelationShipAttribute__JoinColumnOverrideAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__ManyToOneJoinColumnRelationShipAttribute__JoinColumnOverrideAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getManyToOneJoinColumnRelationShipAttributeAccess().getJoinColumnOverrideAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToOneJoinColumnRelationShipAttribute__Group__4__Impl"


    // $ANTLR start "rule__ManyToOneJoinTableRelationShipAttribute__Group__0"
    // InternalJPADsl.g:3529:1: rule__ManyToOneJoinTableRelationShipAttribute__Group__0 : rule__ManyToOneJoinTableRelationShipAttribute__Group__0__Impl rule__ManyToOneJoinTableRelationShipAttribute__Group__1 ;
    public final void rule__ManyToOneJoinTableRelationShipAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:3533:1: ( rule__ManyToOneJoinTableRelationShipAttribute__Group__0__Impl rule__ManyToOneJoinTableRelationShipAttribute__Group__1 )
            // InternalJPADsl.g:3534:2: rule__ManyToOneJoinTableRelationShipAttribute__Group__0__Impl rule__ManyToOneJoinTableRelationShipAttribute__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ManyToOneJoinTableRelationShipAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManyToOneJoinTableRelationShipAttribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToOneJoinTableRelationShipAttribute__Group__0"


    // $ANTLR start "rule__ManyToOneJoinTableRelationShipAttribute__Group__0__Impl"
    // InternalJPADsl.g:3541:1: rule__ManyToOneJoinTableRelationShipAttribute__Group__0__Impl : ( 'many to one using join table' ) ;
    public final void rule__ManyToOneJoinTableRelationShipAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:3545:1: ( ( 'many to one using join table' ) )
            // InternalJPADsl.g:3546:1: ( 'many to one using join table' )
            {
            // InternalJPADsl.g:3546:1: ( 'many to one using join table' )
            // InternalJPADsl.g:3547:2: 'many to one using join table'
            {
             before(grammarAccess.getManyToOneJoinTableRelationShipAttributeAccess().getManyToOneUsingJoinTableKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getManyToOneJoinTableRelationShipAttributeAccess().getManyToOneUsingJoinTableKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToOneJoinTableRelationShipAttribute__Group__0__Impl"


    // $ANTLR start "rule__ManyToOneJoinTableRelationShipAttribute__Group__1"
    // InternalJPADsl.g:3556:1: rule__ManyToOneJoinTableRelationShipAttribute__Group__1 : rule__ManyToOneJoinTableRelationShipAttribute__Group__1__Impl rule__ManyToOneJoinTableRelationShipAttribute__Group__2 ;
    public final void rule__ManyToOneJoinTableRelationShipAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:3560:1: ( rule__ManyToOneJoinTableRelationShipAttribute__Group__1__Impl rule__ManyToOneJoinTableRelationShipAttribute__Group__2 )
            // InternalJPADsl.g:3561:2: rule__ManyToOneJoinTableRelationShipAttribute__Group__1__Impl rule__ManyToOneJoinTableRelationShipAttribute__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__ManyToOneJoinTableRelationShipAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManyToOneJoinTableRelationShipAttribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToOneJoinTableRelationShipAttribute__Group__1"


    // $ANTLR start "rule__ManyToOneJoinTableRelationShipAttribute__Group__1__Impl"
    // InternalJPADsl.g:3568:1: rule__ManyToOneJoinTableRelationShipAttribute__Group__1__Impl : ( ( rule__ManyToOneJoinTableRelationShipAttribute__NameAssignment_1 ) ) ;
    public final void rule__ManyToOneJoinTableRelationShipAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:3572:1: ( ( ( rule__ManyToOneJoinTableRelationShipAttribute__NameAssignment_1 ) ) )
            // InternalJPADsl.g:3573:1: ( ( rule__ManyToOneJoinTableRelationShipAttribute__NameAssignment_1 ) )
            {
            // InternalJPADsl.g:3573:1: ( ( rule__ManyToOneJoinTableRelationShipAttribute__NameAssignment_1 ) )
            // InternalJPADsl.g:3574:2: ( rule__ManyToOneJoinTableRelationShipAttribute__NameAssignment_1 )
            {
             before(grammarAccess.getManyToOneJoinTableRelationShipAttributeAccess().getNameAssignment_1()); 
            // InternalJPADsl.g:3575:2: ( rule__ManyToOneJoinTableRelationShipAttribute__NameAssignment_1 )
            // InternalJPADsl.g:3575:3: rule__ManyToOneJoinTableRelationShipAttribute__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ManyToOneJoinTableRelationShipAttribute__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getManyToOneJoinTableRelationShipAttributeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToOneJoinTableRelationShipAttribute__Group__1__Impl"


    // $ANTLR start "rule__ManyToOneJoinTableRelationShipAttribute__Group__2"
    // InternalJPADsl.g:3583:1: rule__ManyToOneJoinTableRelationShipAttribute__Group__2 : rule__ManyToOneJoinTableRelationShipAttribute__Group__2__Impl rule__ManyToOneJoinTableRelationShipAttribute__Group__3 ;
    public final void rule__ManyToOneJoinTableRelationShipAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:3587:1: ( rule__ManyToOneJoinTableRelationShipAttribute__Group__2__Impl rule__ManyToOneJoinTableRelationShipAttribute__Group__3 )
            // InternalJPADsl.g:3588:2: rule__ManyToOneJoinTableRelationShipAttribute__Group__2__Impl rule__ManyToOneJoinTableRelationShipAttribute__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__ManyToOneJoinTableRelationShipAttribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManyToOneJoinTableRelationShipAttribute__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToOneJoinTableRelationShipAttribute__Group__2"


    // $ANTLR start "rule__ManyToOneJoinTableRelationShipAttribute__Group__2__Impl"
    // InternalJPADsl.g:3595:1: rule__ManyToOneJoinTableRelationShipAttribute__Group__2__Impl : ( ':' ) ;
    public final void rule__ManyToOneJoinTableRelationShipAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:3599:1: ( ( ':' ) )
            // InternalJPADsl.g:3600:1: ( ':' )
            {
            // InternalJPADsl.g:3600:1: ( ':' )
            // InternalJPADsl.g:3601:2: ':'
            {
             before(grammarAccess.getManyToOneJoinTableRelationShipAttributeAccess().getColonKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getManyToOneJoinTableRelationShipAttributeAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToOneJoinTableRelationShipAttribute__Group__2__Impl"


    // $ANTLR start "rule__ManyToOneJoinTableRelationShipAttribute__Group__3"
    // InternalJPADsl.g:3610:1: rule__ManyToOneJoinTableRelationShipAttribute__Group__3 : rule__ManyToOneJoinTableRelationShipAttribute__Group__3__Impl ;
    public final void rule__ManyToOneJoinTableRelationShipAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:3614:1: ( rule__ManyToOneJoinTableRelationShipAttribute__Group__3__Impl )
            // InternalJPADsl.g:3615:2: rule__ManyToOneJoinTableRelationShipAttribute__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ManyToOneJoinTableRelationShipAttribute__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToOneJoinTableRelationShipAttribute__Group__3"


    // $ANTLR start "rule__ManyToOneJoinTableRelationShipAttribute__Group__3__Impl"
    // InternalJPADsl.g:3621:1: rule__ManyToOneJoinTableRelationShipAttribute__Group__3__Impl : ( ( rule__ManyToOneJoinTableRelationShipAttribute__TypeAssignment_3 ) ) ;
    public final void rule__ManyToOneJoinTableRelationShipAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:3625:1: ( ( ( rule__ManyToOneJoinTableRelationShipAttribute__TypeAssignment_3 ) ) )
            // InternalJPADsl.g:3626:1: ( ( rule__ManyToOneJoinTableRelationShipAttribute__TypeAssignment_3 ) )
            {
            // InternalJPADsl.g:3626:1: ( ( rule__ManyToOneJoinTableRelationShipAttribute__TypeAssignment_3 ) )
            // InternalJPADsl.g:3627:2: ( rule__ManyToOneJoinTableRelationShipAttribute__TypeAssignment_3 )
            {
             before(grammarAccess.getManyToOneJoinTableRelationShipAttributeAccess().getTypeAssignment_3()); 
            // InternalJPADsl.g:3628:2: ( rule__ManyToOneJoinTableRelationShipAttribute__TypeAssignment_3 )
            // InternalJPADsl.g:3628:3: rule__ManyToOneJoinTableRelationShipAttribute__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ManyToOneJoinTableRelationShipAttribute__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getManyToOneJoinTableRelationShipAttributeAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToOneJoinTableRelationShipAttribute__Group__3__Impl"


    // $ANTLR start "rule__ManyToOneMappedByRelationShipAttribute__Group__0"
    // InternalJPADsl.g:3637:1: rule__ManyToOneMappedByRelationShipAttribute__Group__0 : rule__ManyToOneMappedByRelationShipAttribute__Group__0__Impl rule__ManyToOneMappedByRelationShipAttribute__Group__1 ;
    public final void rule__ManyToOneMappedByRelationShipAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:3641:1: ( rule__ManyToOneMappedByRelationShipAttribute__Group__0__Impl rule__ManyToOneMappedByRelationShipAttribute__Group__1 )
            // InternalJPADsl.g:3642:2: rule__ManyToOneMappedByRelationShipAttribute__Group__0__Impl rule__ManyToOneMappedByRelationShipAttribute__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ManyToOneMappedByRelationShipAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManyToOneMappedByRelationShipAttribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToOneMappedByRelationShipAttribute__Group__0"


    // $ANTLR start "rule__ManyToOneMappedByRelationShipAttribute__Group__0__Impl"
    // InternalJPADsl.g:3649:1: rule__ManyToOneMappedByRelationShipAttribute__Group__0__Impl : ( 'many to one mapped by' ) ;
    public final void rule__ManyToOneMappedByRelationShipAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:3653:1: ( ( 'many to one mapped by' ) )
            // InternalJPADsl.g:3654:1: ( 'many to one mapped by' )
            {
            // InternalJPADsl.g:3654:1: ( 'many to one mapped by' )
            // InternalJPADsl.g:3655:2: 'many to one mapped by'
            {
             before(grammarAccess.getManyToOneMappedByRelationShipAttributeAccess().getManyToOneMappedByKeyword_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getManyToOneMappedByRelationShipAttributeAccess().getManyToOneMappedByKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToOneMappedByRelationShipAttribute__Group__0__Impl"


    // $ANTLR start "rule__ManyToOneMappedByRelationShipAttribute__Group__1"
    // InternalJPADsl.g:3664:1: rule__ManyToOneMappedByRelationShipAttribute__Group__1 : rule__ManyToOneMappedByRelationShipAttribute__Group__1__Impl rule__ManyToOneMappedByRelationShipAttribute__Group__2 ;
    public final void rule__ManyToOneMappedByRelationShipAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:3668:1: ( rule__ManyToOneMappedByRelationShipAttribute__Group__1__Impl rule__ManyToOneMappedByRelationShipAttribute__Group__2 )
            // InternalJPADsl.g:3669:2: rule__ManyToOneMappedByRelationShipAttribute__Group__1__Impl rule__ManyToOneMappedByRelationShipAttribute__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__ManyToOneMappedByRelationShipAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManyToOneMappedByRelationShipAttribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToOneMappedByRelationShipAttribute__Group__1"


    // $ANTLR start "rule__ManyToOneMappedByRelationShipAttribute__Group__1__Impl"
    // InternalJPADsl.g:3676:1: rule__ManyToOneMappedByRelationShipAttribute__Group__1__Impl : ( ( rule__ManyToOneMappedByRelationShipAttribute__NameAssignment_1 ) ) ;
    public final void rule__ManyToOneMappedByRelationShipAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:3680:1: ( ( ( rule__ManyToOneMappedByRelationShipAttribute__NameAssignment_1 ) ) )
            // InternalJPADsl.g:3681:1: ( ( rule__ManyToOneMappedByRelationShipAttribute__NameAssignment_1 ) )
            {
            // InternalJPADsl.g:3681:1: ( ( rule__ManyToOneMappedByRelationShipAttribute__NameAssignment_1 ) )
            // InternalJPADsl.g:3682:2: ( rule__ManyToOneMappedByRelationShipAttribute__NameAssignment_1 )
            {
             before(grammarAccess.getManyToOneMappedByRelationShipAttributeAccess().getNameAssignment_1()); 
            // InternalJPADsl.g:3683:2: ( rule__ManyToOneMappedByRelationShipAttribute__NameAssignment_1 )
            // InternalJPADsl.g:3683:3: rule__ManyToOneMappedByRelationShipAttribute__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ManyToOneMappedByRelationShipAttribute__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getManyToOneMappedByRelationShipAttributeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToOneMappedByRelationShipAttribute__Group__1__Impl"


    // $ANTLR start "rule__ManyToOneMappedByRelationShipAttribute__Group__2"
    // InternalJPADsl.g:3691:1: rule__ManyToOneMappedByRelationShipAttribute__Group__2 : rule__ManyToOneMappedByRelationShipAttribute__Group__2__Impl rule__ManyToOneMappedByRelationShipAttribute__Group__3 ;
    public final void rule__ManyToOneMappedByRelationShipAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:3695:1: ( rule__ManyToOneMappedByRelationShipAttribute__Group__2__Impl rule__ManyToOneMappedByRelationShipAttribute__Group__3 )
            // InternalJPADsl.g:3696:2: rule__ManyToOneMappedByRelationShipAttribute__Group__2__Impl rule__ManyToOneMappedByRelationShipAttribute__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__ManyToOneMappedByRelationShipAttribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManyToOneMappedByRelationShipAttribute__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToOneMappedByRelationShipAttribute__Group__2"


    // $ANTLR start "rule__ManyToOneMappedByRelationShipAttribute__Group__2__Impl"
    // InternalJPADsl.g:3703:1: rule__ManyToOneMappedByRelationShipAttribute__Group__2__Impl : ( ':' ) ;
    public final void rule__ManyToOneMappedByRelationShipAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:3707:1: ( ( ':' ) )
            // InternalJPADsl.g:3708:1: ( ':' )
            {
            // InternalJPADsl.g:3708:1: ( ':' )
            // InternalJPADsl.g:3709:2: ':'
            {
             before(grammarAccess.getManyToOneMappedByRelationShipAttributeAccess().getColonKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getManyToOneMappedByRelationShipAttributeAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToOneMappedByRelationShipAttribute__Group__2__Impl"


    // $ANTLR start "rule__ManyToOneMappedByRelationShipAttribute__Group__3"
    // InternalJPADsl.g:3718:1: rule__ManyToOneMappedByRelationShipAttribute__Group__3 : rule__ManyToOneMappedByRelationShipAttribute__Group__3__Impl ;
    public final void rule__ManyToOneMappedByRelationShipAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:3722:1: ( rule__ManyToOneMappedByRelationShipAttribute__Group__3__Impl )
            // InternalJPADsl.g:3723:2: rule__ManyToOneMappedByRelationShipAttribute__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ManyToOneMappedByRelationShipAttribute__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToOneMappedByRelationShipAttribute__Group__3"


    // $ANTLR start "rule__ManyToOneMappedByRelationShipAttribute__Group__3__Impl"
    // InternalJPADsl.g:3729:1: rule__ManyToOneMappedByRelationShipAttribute__Group__3__Impl : ( ( rule__ManyToOneMappedByRelationShipAttribute__TypeAssignment_3 ) ) ;
    public final void rule__ManyToOneMappedByRelationShipAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:3733:1: ( ( ( rule__ManyToOneMappedByRelationShipAttribute__TypeAssignment_3 ) ) )
            // InternalJPADsl.g:3734:1: ( ( rule__ManyToOneMappedByRelationShipAttribute__TypeAssignment_3 ) )
            {
            // InternalJPADsl.g:3734:1: ( ( rule__ManyToOneMappedByRelationShipAttribute__TypeAssignment_3 ) )
            // InternalJPADsl.g:3735:2: ( rule__ManyToOneMappedByRelationShipAttribute__TypeAssignment_3 )
            {
             before(grammarAccess.getManyToOneMappedByRelationShipAttributeAccess().getTypeAssignment_3()); 
            // InternalJPADsl.g:3736:2: ( rule__ManyToOneMappedByRelationShipAttribute__TypeAssignment_3 )
            // InternalJPADsl.g:3736:3: rule__ManyToOneMappedByRelationShipAttribute__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ManyToOneMappedByRelationShipAttribute__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getManyToOneMappedByRelationShipAttributeAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToOneMappedByRelationShipAttribute__Group__3__Impl"


    // $ANTLR start "rule__ManyToManyRelationshipAttribute__Group__0"
    // InternalJPADsl.g:3745:1: rule__ManyToManyRelationshipAttribute__Group__0 : rule__ManyToManyRelationshipAttribute__Group__0__Impl rule__ManyToManyRelationshipAttribute__Group__1 ;
    public final void rule__ManyToManyRelationshipAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:3749:1: ( rule__ManyToManyRelationshipAttribute__Group__0__Impl rule__ManyToManyRelationshipAttribute__Group__1 )
            // InternalJPADsl.g:3750:2: rule__ManyToManyRelationshipAttribute__Group__0__Impl rule__ManyToManyRelationshipAttribute__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ManyToManyRelationshipAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManyToManyRelationshipAttribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToManyRelationshipAttribute__Group__0"


    // $ANTLR start "rule__ManyToManyRelationshipAttribute__Group__0__Impl"
    // InternalJPADsl.g:3757:1: rule__ManyToManyRelationshipAttribute__Group__0__Impl : ( 'many to many join table' ) ;
    public final void rule__ManyToManyRelationshipAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:3761:1: ( ( 'many to many join table' ) )
            // InternalJPADsl.g:3762:1: ( 'many to many join table' )
            {
            // InternalJPADsl.g:3762:1: ( 'many to many join table' )
            // InternalJPADsl.g:3763:2: 'many to many join table'
            {
             before(grammarAccess.getManyToManyRelationshipAttributeAccess().getManyToManyJoinTableKeyword_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getManyToManyRelationshipAttributeAccess().getManyToManyJoinTableKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToManyRelationshipAttribute__Group__0__Impl"


    // $ANTLR start "rule__ManyToManyRelationshipAttribute__Group__1"
    // InternalJPADsl.g:3772:1: rule__ManyToManyRelationshipAttribute__Group__1 : rule__ManyToManyRelationshipAttribute__Group__1__Impl rule__ManyToManyRelationshipAttribute__Group__2 ;
    public final void rule__ManyToManyRelationshipAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:3776:1: ( rule__ManyToManyRelationshipAttribute__Group__1__Impl rule__ManyToManyRelationshipAttribute__Group__2 )
            // InternalJPADsl.g:3777:2: rule__ManyToManyRelationshipAttribute__Group__1__Impl rule__ManyToManyRelationshipAttribute__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__ManyToManyRelationshipAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManyToManyRelationshipAttribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToManyRelationshipAttribute__Group__1"


    // $ANTLR start "rule__ManyToManyRelationshipAttribute__Group__1__Impl"
    // InternalJPADsl.g:3784:1: rule__ManyToManyRelationshipAttribute__Group__1__Impl : ( ( rule__ManyToManyRelationshipAttribute__NameAssignment_1 ) ) ;
    public final void rule__ManyToManyRelationshipAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:3788:1: ( ( ( rule__ManyToManyRelationshipAttribute__NameAssignment_1 ) ) )
            // InternalJPADsl.g:3789:1: ( ( rule__ManyToManyRelationshipAttribute__NameAssignment_1 ) )
            {
            // InternalJPADsl.g:3789:1: ( ( rule__ManyToManyRelationshipAttribute__NameAssignment_1 ) )
            // InternalJPADsl.g:3790:2: ( rule__ManyToManyRelationshipAttribute__NameAssignment_1 )
            {
             before(grammarAccess.getManyToManyRelationshipAttributeAccess().getNameAssignment_1()); 
            // InternalJPADsl.g:3791:2: ( rule__ManyToManyRelationshipAttribute__NameAssignment_1 )
            // InternalJPADsl.g:3791:3: rule__ManyToManyRelationshipAttribute__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ManyToManyRelationshipAttribute__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getManyToManyRelationshipAttributeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToManyRelationshipAttribute__Group__1__Impl"


    // $ANTLR start "rule__ManyToManyRelationshipAttribute__Group__2"
    // InternalJPADsl.g:3799:1: rule__ManyToManyRelationshipAttribute__Group__2 : rule__ManyToManyRelationshipAttribute__Group__2__Impl rule__ManyToManyRelationshipAttribute__Group__3 ;
    public final void rule__ManyToManyRelationshipAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:3803:1: ( rule__ManyToManyRelationshipAttribute__Group__2__Impl rule__ManyToManyRelationshipAttribute__Group__3 )
            // InternalJPADsl.g:3804:2: rule__ManyToManyRelationshipAttribute__Group__2__Impl rule__ManyToManyRelationshipAttribute__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__ManyToManyRelationshipAttribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManyToManyRelationshipAttribute__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToManyRelationshipAttribute__Group__2"


    // $ANTLR start "rule__ManyToManyRelationshipAttribute__Group__2__Impl"
    // InternalJPADsl.g:3811:1: rule__ManyToManyRelationshipAttribute__Group__2__Impl : ( ':' ) ;
    public final void rule__ManyToManyRelationshipAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:3815:1: ( ( ':' ) )
            // InternalJPADsl.g:3816:1: ( ':' )
            {
            // InternalJPADsl.g:3816:1: ( ':' )
            // InternalJPADsl.g:3817:2: ':'
            {
             before(grammarAccess.getManyToManyRelationshipAttributeAccess().getColonKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getManyToManyRelationshipAttributeAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToManyRelationshipAttribute__Group__2__Impl"


    // $ANTLR start "rule__ManyToManyRelationshipAttribute__Group__3"
    // InternalJPADsl.g:3826:1: rule__ManyToManyRelationshipAttribute__Group__3 : rule__ManyToManyRelationshipAttribute__Group__3__Impl ;
    public final void rule__ManyToManyRelationshipAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:3830:1: ( rule__ManyToManyRelationshipAttribute__Group__3__Impl )
            // InternalJPADsl.g:3831:2: rule__ManyToManyRelationshipAttribute__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ManyToManyRelationshipAttribute__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToManyRelationshipAttribute__Group__3"


    // $ANTLR start "rule__ManyToManyRelationshipAttribute__Group__3__Impl"
    // InternalJPADsl.g:3837:1: rule__ManyToManyRelationshipAttribute__Group__3__Impl : ( ( rule__ManyToManyRelationshipAttribute__TypeAssignment_3 ) ) ;
    public final void rule__ManyToManyRelationshipAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:3841:1: ( ( ( rule__ManyToManyRelationshipAttribute__TypeAssignment_3 ) ) )
            // InternalJPADsl.g:3842:1: ( ( rule__ManyToManyRelationshipAttribute__TypeAssignment_3 ) )
            {
            // InternalJPADsl.g:3842:1: ( ( rule__ManyToManyRelationshipAttribute__TypeAssignment_3 ) )
            // InternalJPADsl.g:3843:2: ( rule__ManyToManyRelationshipAttribute__TypeAssignment_3 )
            {
             before(grammarAccess.getManyToManyRelationshipAttributeAccess().getTypeAssignment_3()); 
            // InternalJPADsl.g:3844:2: ( rule__ManyToManyRelationshipAttribute__TypeAssignment_3 )
            // InternalJPADsl.g:3844:3: rule__ManyToManyRelationshipAttribute__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ManyToManyRelationshipAttribute__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getManyToManyRelationshipAttributeAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToManyRelationshipAttribute__Group__3__Impl"


    // $ANTLR start "rule__ManyToManyMappedByRelationshipAttribute__Group__0"
    // InternalJPADsl.g:3853:1: rule__ManyToManyMappedByRelationshipAttribute__Group__0 : rule__ManyToManyMappedByRelationshipAttribute__Group__0__Impl rule__ManyToManyMappedByRelationshipAttribute__Group__1 ;
    public final void rule__ManyToManyMappedByRelationshipAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:3857:1: ( rule__ManyToManyMappedByRelationshipAttribute__Group__0__Impl rule__ManyToManyMappedByRelationshipAttribute__Group__1 )
            // InternalJPADsl.g:3858:2: rule__ManyToManyMappedByRelationshipAttribute__Group__0__Impl rule__ManyToManyMappedByRelationshipAttribute__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ManyToManyMappedByRelationshipAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManyToManyMappedByRelationshipAttribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToManyMappedByRelationshipAttribute__Group__0"


    // $ANTLR start "rule__ManyToManyMappedByRelationshipAttribute__Group__0__Impl"
    // InternalJPADsl.g:3865:1: rule__ManyToManyMappedByRelationshipAttribute__Group__0__Impl : ( 'many to many mapped by' ) ;
    public final void rule__ManyToManyMappedByRelationshipAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:3869:1: ( ( 'many to many mapped by' ) )
            // InternalJPADsl.g:3870:1: ( 'many to many mapped by' )
            {
            // InternalJPADsl.g:3870:1: ( 'many to many mapped by' )
            // InternalJPADsl.g:3871:2: 'many to many mapped by'
            {
             before(grammarAccess.getManyToManyMappedByRelationshipAttributeAccess().getManyToManyMappedByKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getManyToManyMappedByRelationshipAttributeAccess().getManyToManyMappedByKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToManyMappedByRelationshipAttribute__Group__0__Impl"


    // $ANTLR start "rule__ManyToManyMappedByRelationshipAttribute__Group__1"
    // InternalJPADsl.g:3880:1: rule__ManyToManyMappedByRelationshipAttribute__Group__1 : rule__ManyToManyMappedByRelationshipAttribute__Group__1__Impl rule__ManyToManyMappedByRelationshipAttribute__Group__2 ;
    public final void rule__ManyToManyMappedByRelationshipAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:3884:1: ( rule__ManyToManyMappedByRelationshipAttribute__Group__1__Impl rule__ManyToManyMappedByRelationshipAttribute__Group__2 )
            // InternalJPADsl.g:3885:2: rule__ManyToManyMappedByRelationshipAttribute__Group__1__Impl rule__ManyToManyMappedByRelationshipAttribute__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__ManyToManyMappedByRelationshipAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManyToManyMappedByRelationshipAttribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToManyMappedByRelationshipAttribute__Group__1"


    // $ANTLR start "rule__ManyToManyMappedByRelationshipAttribute__Group__1__Impl"
    // InternalJPADsl.g:3892:1: rule__ManyToManyMappedByRelationshipAttribute__Group__1__Impl : ( ( rule__ManyToManyMappedByRelationshipAttribute__NameAssignment_1 ) ) ;
    public final void rule__ManyToManyMappedByRelationshipAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:3896:1: ( ( ( rule__ManyToManyMappedByRelationshipAttribute__NameAssignment_1 ) ) )
            // InternalJPADsl.g:3897:1: ( ( rule__ManyToManyMappedByRelationshipAttribute__NameAssignment_1 ) )
            {
            // InternalJPADsl.g:3897:1: ( ( rule__ManyToManyMappedByRelationshipAttribute__NameAssignment_1 ) )
            // InternalJPADsl.g:3898:2: ( rule__ManyToManyMappedByRelationshipAttribute__NameAssignment_1 )
            {
             before(grammarAccess.getManyToManyMappedByRelationshipAttributeAccess().getNameAssignment_1()); 
            // InternalJPADsl.g:3899:2: ( rule__ManyToManyMappedByRelationshipAttribute__NameAssignment_1 )
            // InternalJPADsl.g:3899:3: rule__ManyToManyMappedByRelationshipAttribute__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ManyToManyMappedByRelationshipAttribute__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getManyToManyMappedByRelationshipAttributeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToManyMappedByRelationshipAttribute__Group__1__Impl"


    // $ANTLR start "rule__ManyToManyMappedByRelationshipAttribute__Group__2"
    // InternalJPADsl.g:3907:1: rule__ManyToManyMappedByRelationshipAttribute__Group__2 : rule__ManyToManyMappedByRelationshipAttribute__Group__2__Impl rule__ManyToManyMappedByRelationshipAttribute__Group__3 ;
    public final void rule__ManyToManyMappedByRelationshipAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:3911:1: ( rule__ManyToManyMappedByRelationshipAttribute__Group__2__Impl rule__ManyToManyMappedByRelationshipAttribute__Group__3 )
            // InternalJPADsl.g:3912:2: rule__ManyToManyMappedByRelationshipAttribute__Group__2__Impl rule__ManyToManyMappedByRelationshipAttribute__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__ManyToManyMappedByRelationshipAttribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManyToManyMappedByRelationshipAttribute__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToManyMappedByRelationshipAttribute__Group__2"


    // $ANTLR start "rule__ManyToManyMappedByRelationshipAttribute__Group__2__Impl"
    // InternalJPADsl.g:3919:1: rule__ManyToManyMappedByRelationshipAttribute__Group__2__Impl : ( ':' ) ;
    public final void rule__ManyToManyMappedByRelationshipAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:3923:1: ( ( ':' ) )
            // InternalJPADsl.g:3924:1: ( ':' )
            {
            // InternalJPADsl.g:3924:1: ( ':' )
            // InternalJPADsl.g:3925:2: ':'
            {
             before(grammarAccess.getManyToManyMappedByRelationshipAttributeAccess().getColonKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getManyToManyMappedByRelationshipAttributeAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToManyMappedByRelationshipAttribute__Group__2__Impl"


    // $ANTLR start "rule__ManyToManyMappedByRelationshipAttribute__Group__3"
    // InternalJPADsl.g:3934:1: rule__ManyToManyMappedByRelationshipAttribute__Group__3 : rule__ManyToManyMappedByRelationshipAttribute__Group__3__Impl ;
    public final void rule__ManyToManyMappedByRelationshipAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:3938:1: ( rule__ManyToManyMappedByRelationshipAttribute__Group__3__Impl )
            // InternalJPADsl.g:3939:2: rule__ManyToManyMappedByRelationshipAttribute__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ManyToManyMappedByRelationshipAttribute__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToManyMappedByRelationshipAttribute__Group__3"


    // $ANTLR start "rule__ManyToManyMappedByRelationshipAttribute__Group__3__Impl"
    // InternalJPADsl.g:3945:1: rule__ManyToManyMappedByRelationshipAttribute__Group__3__Impl : ( ( rule__ManyToManyMappedByRelationshipAttribute__TypeAssignment_3 ) ) ;
    public final void rule__ManyToManyMappedByRelationshipAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:3949:1: ( ( ( rule__ManyToManyMappedByRelationshipAttribute__TypeAssignment_3 ) ) )
            // InternalJPADsl.g:3950:1: ( ( rule__ManyToManyMappedByRelationshipAttribute__TypeAssignment_3 ) )
            {
            // InternalJPADsl.g:3950:1: ( ( rule__ManyToManyMappedByRelationshipAttribute__TypeAssignment_3 ) )
            // InternalJPADsl.g:3951:2: ( rule__ManyToManyMappedByRelationshipAttribute__TypeAssignment_3 )
            {
             before(grammarAccess.getManyToManyMappedByRelationshipAttributeAccess().getTypeAssignment_3()); 
            // InternalJPADsl.g:3952:2: ( rule__ManyToManyMappedByRelationshipAttribute__TypeAssignment_3 )
            // InternalJPADsl.g:3952:3: rule__ManyToManyMappedByRelationshipAttribute__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ManyToManyMappedByRelationshipAttribute__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getManyToManyMappedByRelationshipAttributeAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToManyMappedByRelationshipAttribute__Group__3__Impl"


    // $ANTLR start "rule__Reference__Group__0"
    // InternalJPADsl.g:3961:1: rule__Reference__Group__0 : rule__Reference__Group__0__Impl rule__Reference__Group__1 ;
    public final void rule__Reference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:3965:1: ( rule__Reference__Group__0__Impl rule__Reference__Group__1 )
            // InternalJPADsl.g:3966:2: rule__Reference__Group__0__Impl rule__Reference__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Reference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__0"


    // $ANTLR start "rule__Reference__Group__0__Impl"
    // InternalJPADsl.g:3973:1: rule__Reference__Group__0__Impl : ( 'ref' ) ;
    public final void rule__Reference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:3977:1: ( ( 'ref' ) )
            // InternalJPADsl.g:3978:1: ( 'ref' )
            {
            // InternalJPADsl.g:3978:1: ( 'ref' )
            // InternalJPADsl.g:3979:2: 'ref'
            {
             before(grammarAccess.getReferenceAccess().getRefKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getRefKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__0__Impl"


    // $ANTLR start "rule__Reference__Group__1"
    // InternalJPADsl.g:3988:1: rule__Reference__Group__1 : rule__Reference__Group__1__Impl rule__Reference__Group__2 ;
    public final void rule__Reference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:3992:1: ( rule__Reference__Group__1__Impl rule__Reference__Group__2 )
            // InternalJPADsl.g:3993:2: rule__Reference__Group__1__Impl rule__Reference__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Reference__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__1"


    // $ANTLR start "rule__Reference__Group__1__Impl"
    // InternalJPADsl.g:4000:1: rule__Reference__Group__1__Impl : ( ( rule__Reference__NameAssignment_1 ) ) ;
    public final void rule__Reference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:4004:1: ( ( ( rule__Reference__NameAssignment_1 ) ) )
            // InternalJPADsl.g:4005:1: ( ( rule__Reference__NameAssignment_1 ) )
            {
            // InternalJPADsl.g:4005:1: ( ( rule__Reference__NameAssignment_1 ) )
            // InternalJPADsl.g:4006:2: ( rule__Reference__NameAssignment_1 )
            {
             before(grammarAccess.getReferenceAccess().getNameAssignment_1()); 
            // InternalJPADsl.g:4007:2: ( rule__Reference__NameAssignment_1 )
            // InternalJPADsl.g:4007:3: rule__Reference__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Reference__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__1__Impl"


    // $ANTLR start "rule__Reference__Group__2"
    // InternalJPADsl.g:4015:1: rule__Reference__Group__2 : rule__Reference__Group__2__Impl rule__Reference__Group__3 ;
    public final void rule__Reference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:4019:1: ( rule__Reference__Group__2__Impl rule__Reference__Group__3 )
            // InternalJPADsl.g:4020:2: rule__Reference__Group__2__Impl rule__Reference__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Reference__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__2"


    // $ANTLR start "rule__Reference__Group__2__Impl"
    // InternalJPADsl.g:4027:1: rule__Reference__Group__2__Impl : ( ':' ) ;
    public final void rule__Reference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:4031:1: ( ( ':' ) )
            // InternalJPADsl.g:4032:1: ( ':' )
            {
            // InternalJPADsl.g:4032:1: ( ':' )
            // InternalJPADsl.g:4033:2: ':'
            {
             before(grammarAccess.getReferenceAccess().getColonKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__2__Impl"


    // $ANTLR start "rule__Reference__Group__3"
    // InternalJPADsl.g:4042:1: rule__Reference__Group__3 : rule__Reference__Group__3__Impl rule__Reference__Group__4 ;
    public final void rule__Reference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:4046:1: ( rule__Reference__Group__3__Impl rule__Reference__Group__4 )
            // InternalJPADsl.g:4047:2: rule__Reference__Group__3__Impl rule__Reference__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Reference__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__3"


    // $ANTLR start "rule__Reference__Group__3__Impl"
    // InternalJPADsl.g:4054:1: rule__Reference__Group__3__Impl : ( ( rule__Reference__TypeAssignment_3 ) ) ;
    public final void rule__Reference__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:4058:1: ( ( ( rule__Reference__TypeAssignment_3 ) ) )
            // InternalJPADsl.g:4059:1: ( ( rule__Reference__TypeAssignment_3 ) )
            {
            // InternalJPADsl.g:4059:1: ( ( rule__Reference__TypeAssignment_3 ) )
            // InternalJPADsl.g:4060:2: ( rule__Reference__TypeAssignment_3 )
            {
             before(grammarAccess.getReferenceAccess().getTypeAssignment_3()); 
            // InternalJPADsl.g:4061:2: ( rule__Reference__TypeAssignment_3 )
            // InternalJPADsl.g:4061:3: rule__Reference__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Reference__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__3__Impl"


    // $ANTLR start "rule__Reference__Group__4"
    // InternalJPADsl.g:4069:1: rule__Reference__Group__4 : rule__Reference__Group__4__Impl ;
    public final void rule__Reference__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:4073:1: ( rule__Reference__Group__4__Impl )
            // InternalJPADsl.g:4074:2: rule__Reference__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Reference__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__4"


    // $ANTLR start "rule__Reference__Group__4__Impl"
    // InternalJPADsl.g:4080:1: rule__Reference__Group__4__Impl : ( ( rule__Reference__Group_4__0 )? ) ;
    public final void rule__Reference__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:4084:1: ( ( ( rule__Reference__Group_4__0 )? ) )
            // InternalJPADsl.g:4085:1: ( ( rule__Reference__Group_4__0 )? )
            {
            // InternalJPADsl.g:4085:1: ( ( rule__Reference__Group_4__0 )? )
            // InternalJPADsl.g:4086:2: ( rule__Reference__Group_4__0 )?
            {
             before(grammarAccess.getReferenceAccess().getGroup_4()); 
            // InternalJPADsl.g:4087:2: ( rule__Reference__Group_4__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==42) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalJPADsl.g:4087:3: rule__Reference__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Reference__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getReferenceAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__4__Impl"


    // $ANTLR start "rule__Reference__Group_4__0"
    // InternalJPADsl.g:4096:1: rule__Reference__Group_4__0 : rule__Reference__Group_4__0__Impl rule__Reference__Group_4__1 ;
    public final void rule__Reference__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:4100:1: ( rule__Reference__Group_4__0__Impl rule__Reference__Group_4__1 )
            // InternalJPADsl.g:4101:2: rule__Reference__Group_4__0__Impl rule__Reference__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Reference__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_4__0"


    // $ANTLR start "rule__Reference__Group_4__0__Impl"
    // InternalJPADsl.g:4108:1: rule__Reference__Group_4__0__Impl : ( 'opposite' ) ;
    public final void rule__Reference__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:4112:1: ( ( 'opposite' ) )
            // InternalJPADsl.g:4113:1: ( 'opposite' )
            {
            // InternalJPADsl.g:4113:1: ( 'opposite' )
            // InternalJPADsl.g:4114:2: 'opposite'
            {
             before(grammarAccess.getReferenceAccess().getOppositeKeyword_4_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getOppositeKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_4__0__Impl"


    // $ANTLR start "rule__Reference__Group_4__1"
    // InternalJPADsl.g:4123:1: rule__Reference__Group_4__1 : rule__Reference__Group_4__1__Impl ;
    public final void rule__Reference__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:4127:1: ( rule__Reference__Group_4__1__Impl )
            // InternalJPADsl.g:4128:2: rule__Reference__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Reference__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_4__1"


    // $ANTLR start "rule__Reference__Group_4__1__Impl"
    // InternalJPADsl.g:4134:1: rule__Reference__Group_4__1__Impl : ( ( rule__Reference__OppositeAssignment_4_1 ) ) ;
    public final void rule__Reference__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:4138:1: ( ( ( rule__Reference__OppositeAssignment_4_1 ) ) )
            // InternalJPADsl.g:4139:1: ( ( rule__Reference__OppositeAssignment_4_1 ) )
            {
            // InternalJPADsl.g:4139:1: ( ( rule__Reference__OppositeAssignment_4_1 ) )
            // InternalJPADsl.g:4140:2: ( rule__Reference__OppositeAssignment_4_1 )
            {
             before(grammarAccess.getReferenceAccess().getOppositeAssignment_4_1()); 
            // InternalJPADsl.g:4141:2: ( rule__Reference__OppositeAssignment_4_1 )
            // InternalJPADsl.g:4141:3: rule__Reference__OppositeAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Reference__OppositeAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getOppositeAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_4__1__Impl"


    // $ANTLR start "rule__Operation__Group__0"
    // InternalJPADsl.g:4150:1: rule__Operation__Group__0 : rule__Operation__Group__0__Impl rule__Operation__Group__1 ;
    public final void rule__Operation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:4154:1: ( rule__Operation__Group__0__Impl rule__Operation__Group__1 )
            // InternalJPADsl.g:4155:2: rule__Operation__Group__0__Impl rule__Operation__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Operation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__0"


    // $ANTLR start "rule__Operation__Group__0__Impl"
    // InternalJPADsl.g:4162:1: rule__Operation__Group__0__Impl : ( ( rule__Operation__VisibilityAssignment_0 )? ) ;
    public final void rule__Operation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:4166:1: ( ( ( rule__Operation__VisibilityAssignment_0 )? ) )
            // InternalJPADsl.g:4167:1: ( ( rule__Operation__VisibilityAssignment_0 )? )
            {
            // InternalJPADsl.g:4167:1: ( ( rule__Operation__VisibilityAssignment_0 )? )
            // InternalJPADsl.g:4168:2: ( rule__Operation__VisibilityAssignment_0 )?
            {
             before(grammarAccess.getOperationAccess().getVisibilityAssignment_0()); 
            // InternalJPADsl.g:4169:2: ( rule__Operation__VisibilityAssignment_0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=11 && LA24_0<=13)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalJPADsl.g:4169:3: rule__Operation__VisibilityAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operation__VisibilityAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOperationAccess().getVisibilityAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__0__Impl"


    // $ANTLR start "rule__Operation__Group__1"
    // InternalJPADsl.g:4177:1: rule__Operation__Group__1 : rule__Operation__Group__1__Impl rule__Operation__Group__2 ;
    public final void rule__Operation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:4181:1: ( rule__Operation__Group__1__Impl rule__Operation__Group__2 )
            // InternalJPADsl.g:4182:2: rule__Operation__Group__1__Impl rule__Operation__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Operation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__1"


    // $ANTLR start "rule__Operation__Group__1__Impl"
    // InternalJPADsl.g:4189:1: rule__Operation__Group__1__Impl : ( 'op' ) ;
    public final void rule__Operation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:4193:1: ( ( 'op' ) )
            // InternalJPADsl.g:4194:1: ( 'op' )
            {
            // InternalJPADsl.g:4194:1: ( 'op' )
            // InternalJPADsl.g:4195:2: 'op'
            {
             before(grammarAccess.getOperationAccess().getOpKeyword_1()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getOperationAccess().getOpKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__1__Impl"


    // $ANTLR start "rule__Operation__Group__2"
    // InternalJPADsl.g:4204:1: rule__Operation__Group__2 : rule__Operation__Group__2__Impl rule__Operation__Group__3 ;
    public final void rule__Operation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:4208:1: ( rule__Operation__Group__2__Impl rule__Operation__Group__3 )
            // InternalJPADsl.g:4209:2: rule__Operation__Group__2__Impl rule__Operation__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__Operation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__2"


    // $ANTLR start "rule__Operation__Group__2__Impl"
    // InternalJPADsl.g:4216:1: rule__Operation__Group__2__Impl : ( ( rule__Operation__NameAssignment_2 ) ) ;
    public final void rule__Operation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:4220:1: ( ( ( rule__Operation__NameAssignment_2 ) ) )
            // InternalJPADsl.g:4221:1: ( ( rule__Operation__NameAssignment_2 ) )
            {
            // InternalJPADsl.g:4221:1: ( ( rule__Operation__NameAssignment_2 ) )
            // InternalJPADsl.g:4222:2: ( rule__Operation__NameAssignment_2 )
            {
             before(grammarAccess.getOperationAccess().getNameAssignment_2()); 
            // InternalJPADsl.g:4223:2: ( rule__Operation__NameAssignment_2 )
            // InternalJPADsl.g:4223:3: rule__Operation__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Operation__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__2__Impl"


    // $ANTLR start "rule__Operation__Group__3"
    // InternalJPADsl.g:4231:1: rule__Operation__Group__3 : rule__Operation__Group__3__Impl rule__Operation__Group__4 ;
    public final void rule__Operation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:4235:1: ( rule__Operation__Group__3__Impl rule__Operation__Group__4 )
            // InternalJPADsl.g:4236:2: rule__Operation__Group__3__Impl rule__Operation__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__Operation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__3"


    // $ANTLR start "rule__Operation__Group__3__Impl"
    // InternalJPADsl.g:4243:1: rule__Operation__Group__3__Impl : ( '(' ) ;
    public final void rule__Operation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:4247:1: ( ( '(' ) )
            // InternalJPADsl.g:4248:1: ( '(' )
            {
            // InternalJPADsl.g:4248:1: ( '(' )
            // InternalJPADsl.g:4249:2: '('
            {
             before(grammarAccess.getOperationAccess().getLeftParenthesisKeyword_3()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getOperationAccess().getLeftParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__3__Impl"


    // $ANTLR start "rule__Operation__Group__4"
    // InternalJPADsl.g:4258:1: rule__Operation__Group__4 : rule__Operation__Group__4__Impl rule__Operation__Group__5 ;
    public final void rule__Operation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:4262:1: ( rule__Operation__Group__4__Impl rule__Operation__Group__5 )
            // InternalJPADsl.g:4263:2: rule__Operation__Group__4__Impl rule__Operation__Group__5
            {
            pushFollow(FOLLOW_18);
            rule__Operation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__4"


    // $ANTLR start "rule__Operation__Group__4__Impl"
    // InternalJPADsl.g:4270:1: rule__Operation__Group__4__Impl : ( ( rule__Operation__Group_4__0 )? ) ;
    public final void rule__Operation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:4274:1: ( ( ( rule__Operation__Group_4__0 )? ) )
            // InternalJPADsl.g:4275:1: ( ( rule__Operation__Group_4__0 )? )
            {
            // InternalJPADsl.g:4275:1: ( ( rule__Operation__Group_4__0 )? )
            // InternalJPADsl.g:4276:2: ( rule__Operation__Group_4__0 )?
            {
             before(grammarAccess.getOperationAccess().getGroup_4()); 
            // InternalJPADsl.g:4277:2: ( rule__Operation__Group_4__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ID) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalJPADsl.g:4277:3: rule__Operation__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operation__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOperationAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__4__Impl"


    // $ANTLR start "rule__Operation__Group__5"
    // InternalJPADsl.g:4285:1: rule__Operation__Group__5 : rule__Operation__Group__5__Impl rule__Operation__Group__6 ;
    public final void rule__Operation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:4289:1: ( rule__Operation__Group__5__Impl rule__Operation__Group__6 )
            // InternalJPADsl.g:4290:2: rule__Operation__Group__5__Impl rule__Operation__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__Operation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__5"


    // $ANTLR start "rule__Operation__Group__5__Impl"
    // InternalJPADsl.g:4297:1: rule__Operation__Group__5__Impl : ( ')' ) ;
    public final void rule__Operation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:4301:1: ( ( ')' ) )
            // InternalJPADsl.g:4302:1: ( ')' )
            {
            // InternalJPADsl.g:4302:1: ( ')' )
            // InternalJPADsl.g:4303:2: ')'
            {
             before(grammarAccess.getOperationAccess().getRightParenthesisKeyword_5()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getOperationAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__5__Impl"


    // $ANTLR start "rule__Operation__Group__6"
    // InternalJPADsl.g:4312:1: rule__Operation__Group__6 : rule__Operation__Group__6__Impl rule__Operation__Group__7 ;
    public final void rule__Operation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:4316:1: ( rule__Operation__Group__6__Impl rule__Operation__Group__7 )
            // InternalJPADsl.g:4317:2: rule__Operation__Group__6__Impl rule__Operation__Group__7
            {
            pushFollow(FOLLOW_4);
            rule__Operation__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__6"


    // $ANTLR start "rule__Operation__Group__6__Impl"
    // InternalJPADsl.g:4324:1: rule__Operation__Group__6__Impl : ( ':' ) ;
    public final void rule__Operation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:4328:1: ( ( ':' ) )
            // InternalJPADsl.g:4329:1: ( ':' )
            {
            // InternalJPADsl.g:4329:1: ( ':' )
            // InternalJPADsl.g:4330:2: ':'
            {
             before(grammarAccess.getOperationAccess().getColonKeyword_6()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getOperationAccess().getColonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__6__Impl"


    // $ANTLR start "rule__Operation__Group__7"
    // InternalJPADsl.g:4339:1: rule__Operation__Group__7 : rule__Operation__Group__7__Impl ;
    public final void rule__Operation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:4343:1: ( rule__Operation__Group__7__Impl )
            // InternalJPADsl.g:4344:2: rule__Operation__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__7"


    // $ANTLR start "rule__Operation__Group__7__Impl"
    // InternalJPADsl.g:4350:1: rule__Operation__Group__7__Impl : ( ( rule__Operation__TypeAssignment_7 ) ) ;
    public final void rule__Operation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:4354:1: ( ( ( rule__Operation__TypeAssignment_7 ) ) )
            // InternalJPADsl.g:4355:1: ( ( rule__Operation__TypeAssignment_7 ) )
            {
            // InternalJPADsl.g:4355:1: ( ( rule__Operation__TypeAssignment_7 ) )
            // InternalJPADsl.g:4356:2: ( rule__Operation__TypeAssignment_7 )
            {
             before(grammarAccess.getOperationAccess().getTypeAssignment_7()); 
            // InternalJPADsl.g:4357:2: ( rule__Operation__TypeAssignment_7 )
            // InternalJPADsl.g:4357:3: rule__Operation__TypeAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Operation__TypeAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getTypeAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__7__Impl"


    // $ANTLR start "rule__Operation__Group_4__0"
    // InternalJPADsl.g:4366:1: rule__Operation__Group_4__0 : rule__Operation__Group_4__0__Impl rule__Operation__Group_4__1 ;
    public final void rule__Operation__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:4370:1: ( rule__Operation__Group_4__0__Impl rule__Operation__Group_4__1 )
            // InternalJPADsl.g:4371:2: rule__Operation__Group_4__0__Impl rule__Operation__Group_4__1
            {
            pushFollow(FOLLOW_19);
            rule__Operation__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_4__0"


    // $ANTLR start "rule__Operation__Group_4__0__Impl"
    // InternalJPADsl.g:4378:1: rule__Operation__Group_4__0__Impl : ( ( rule__Operation__ParamsAssignment_4_0 ) ) ;
    public final void rule__Operation__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:4382:1: ( ( ( rule__Operation__ParamsAssignment_4_0 ) ) )
            // InternalJPADsl.g:4383:1: ( ( rule__Operation__ParamsAssignment_4_0 ) )
            {
            // InternalJPADsl.g:4383:1: ( ( rule__Operation__ParamsAssignment_4_0 ) )
            // InternalJPADsl.g:4384:2: ( rule__Operation__ParamsAssignment_4_0 )
            {
             before(grammarAccess.getOperationAccess().getParamsAssignment_4_0()); 
            // InternalJPADsl.g:4385:2: ( rule__Operation__ParamsAssignment_4_0 )
            // InternalJPADsl.g:4385:3: rule__Operation__ParamsAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__Operation__ParamsAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getParamsAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_4__0__Impl"


    // $ANTLR start "rule__Operation__Group_4__1"
    // InternalJPADsl.g:4393:1: rule__Operation__Group_4__1 : rule__Operation__Group_4__1__Impl ;
    public final void rule__Operation__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:4397:1: ( rule__Operation__Group_4__1__Impl )
            // InternalJPADsl.g:4398:2: rule__Operation__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_4__1"


    // $ANTLR start "rule__Operation__Group_4__1__Impl"
    // InternalJPADsl.g:4404:1: rule__Operation__Group_4__1__Impl : ( ( rule__Operation__Group_4_1__0 )* ) ;
    public final void rule__Operation__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:4408:1: ( ( ( rule__Operation__Group_4_1__0 )* ) )
            // InternalJPADsl.g:4409:1: ( ( rule__Operation__Group_4_1__0 )* )
            {
            // InternalJPADsl.g:4409:1: ( ( rule__Operation__Group_4_1__0 )* )
            // InternalJPADsl.g:4410:2: ( rule__Operation__Group_4_1__0 )*
            {
             before(grammarAccess.getOperationAccess().getGroup_4_1()); 
            // InternalJPADsl.g:4411:2: ( rule__Operation__Group_4_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==46) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalJPADsl.g:4411:3: rule__Operation__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Operation__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getOperationAccess().getGroup_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_4__1__Impl"


    // $ANTLR start "rule__Operation__Group_4_1__0"
    // InternalJPADsl.g:4420:1: rule__Operation__Group_4_1__0 : rule__Operation__Group_4_1__0__Impl rule__Operation__Group_4_1__1 ;
    public final void rule__Operation__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:4424:1: ( rule__Operation__Group_4_1__0__Impl rule__Operation__Group_4_1__1 )
            // InternalJPADsl.g:4425:2: rule__Operation__Group_4_1__0__Impl rule__Operation__Group_4_1__1
            {
            pushFollow(FOLLOW_4);
            rule__Operation__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group_4_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_4_1__0"


    // $ANTLR start "rule__Operation__Group_4_1__0__Impl"
    // InternalJPADsl.g:4432:1: rule__Operation__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__Operation__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:4436:1: ( ( ',' ) )
            // InternalJPADsl.g:4437:1: ( ',' )
            {
            // InternalJPADsl.g:4437:1: ( ',' )
            // InternalJPADsl.g:4438:2: ','
            {
             before(grammarAccess.getOperationAccess().getCommaKeyword_4_1_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getOperationAccess().getCommaKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_4_1__0__Impl"


    // $ANTLR start "rule__Operation__Group_4_1__1"
    // InternalJPADsl.g:4447:1: rule__Operation__Group_4_1__1 : rule__Operation__Group_4_1__1__Impl ;
    public final void rule__Operation__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:4451:1: ( rule__Operation__Group_4_1__1__Impl )
            // InternalJPADsl.g:4452:2: rule__Operation__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Group_4_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_4_1__1"


    // $ANTLR start "rule__Operation__Group_4_1__1__Impl"
    // InternalJPADsl.g:4458:1: rule__Operation__Group_4_1__1__Impl : ( ( rule__Operation__ParamsAssignment_4_1_1 ) ) ;
    public final void rule__Operation__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:4462:1: ( ( ( rule__Operation__ParamsAssignment_4_1_1 ) ) )
            // InternalJPADsl.g:4463:1: ( ( rule__Operation__ParamsAssignment_4_1_1 ) )
            {
            // InternalJPADsl.g:4463:1: ( ( rule__Operation__ParamsAssignment_4_1_1 ) )
            // InternalJPADsl.g:4464:2: ( rule__Operation__ParamsAssignment_4_1_1 )
            {
             before(grammarAccess.getOperationAccess().getParamsAssignment_4_1_1()); 
            // InternalJPADsl.g:4465:2: ( rule__Operation__ParamsAssignment_4_1_1 )
            // InternalJPADsl.g:4465:3: rule__Operation__ParamsAssignment_4_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Operation__ParamsAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getParamsAssignment_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_4_1__1__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // InternalJPADsl.g:4474:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:4478:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalJPADsl.g:4479:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0"


    // $ANTLR start "rule__Parameter__Group__0__Impl"
    // InternalJPADsl.g:4486:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__NameAssignment_0 ) ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:4490:1: ( ( ( rule__Parameter__NameAssignment_0 ) ) )
            // InternalJPADsl.g:4491:1: ( ( rule__Parameter__NameAssignment_0 ) )
            {
            // InternalJPADsl.g:4491:1: ( ( rule__Parameter__NameAssignment_0 ) )
            // InternalJPADsl.g:4492:2: ( rule__Parameter__NameAssignment_0 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_0()); 
            // InternalJPADsl.g:4493:2: ( rule__Parameter__NameAssignment_0 )
            // InternalJPADsl.g:4493:3: rule__Parameter__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0__Impl"


    // $ANTLR start "rule__Parameter__Group__1"
    // InternalJPADsl.g:4501:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:4505:1: ( rule__Parameter__Group__1__Impl )
            // InternalJPADsl.g:4506:2: rule__Parameter__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1"


    // $ANTLR start "rule__Parameter__Group__1__Impl"
    // InternalJPADsl.g:4512:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__TypeAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:4516:1: ( ( ( rule__Parameter__TypeAssignment_1 ) ) )
            // InternalJPADsl.g:4517:1: ( ( rule__Parameter__TypeAssignment_1 ) )
            {
            // InternalJPADsl.g:4517:1: ( ( rule__Parameter__TypeAssignment_1 ) )
            // InternalJPADsl.g:4518:2: ( rule__Parameter__TypeAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getTypeAssignment_1()); 
            // InternalJPADsl.g:4519:2: ( rule__Parameter__TypeAssignment_1 )
            // InternalJPADsl.g:4519:3: rule__Parameter__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1__Impl"


    // $ANTLR start "rule__TypeRef__Group__0"
    // InternalJPADsl.g:4528:1: rule__TypeRef__Group__0 : rule__TypeRef__Group__0__Impl rule__TypeRef__Group__1 ;
    public final void rule__TypeRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:4532:1: ( rule__TypeRef__Group__0__Impl rule__TypeRef__Group__1 )
            // InternalJPADsl.g:4533:2: rule__TypeRef__Group__0__Impl rule__TypeRef__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__TypeRef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeRef__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeRef__Group__0"


    // $ANTLR start "rule__TypeRef__Group__0__Impl"
    // InternalJPADsl.g:4540:1: rule__TypeRef__Group__0__Impl : ( ( rule__TypeRef__ReferencedAssignment_0 ) ) ;
    public final void rule__TypeRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:4544:1: ( ( ( rule__TypeRef__ReferencedAssignment_0 ) ) )
            // InternalJPADsl.g:4545:1: ( ( rule__TypeRef__ReferencedAssignment_0 ) )
            {
            // InternalJPADsl.g:4545:1: ( ( rule__TypeRef__ReferencedAssignment_0 ) )
            // InternalJPADsl.g:4546:2: ( rule__TypeRef__ReferencedAssignment_0 )
            {
             before(grammarAccess.getTypeRefAccess().getReferencedAssignment_0()); 
            // InternalJPADsl.g:4547:2: ( rule__TypeRef__ReferencedAssignment_0 )
            // InternalJPADsl.g:4547:3: rule__TypeRef__ReferencedAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__TypeRef__ReferencedAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTypeRefAccess().getReferencedAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeRef__Group__0__Impl"


    // $ANTLR start "rule__TypeRef__Group__1"
    // InternalJPADsl.g:4555:1: rule__TypeRef__Group__1 : rule__TypeRef__Group__1__Impl ;
    public final void rule__TypeRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:4559:1: ( rule__TypeRef__Group__1__Impl )
            // InternalJPADsl.g:4560:2: rule__TypeRef__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypeRef__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeRef__Group__1"


    // $ANTLR start "rule__TypeRef__Group__1__Impl"
    // InternalJPADsl.g:4566:1: rule__TypeRef__Group__1__Impl : ( ( rule__TypeRef__MultiAssignment_1 )? ) ;
    public final void rule__TypeRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:4570:1: ( ( ( rule__TypeRef__MultiAssignment_1 )? ) )
            // InternalJPADsl.g:4571:1: ( ( rule__TypeRef__MultiAssignment_1 )? )
            {
            // InternalJPADsl.g:4571:1: ( ( rule__TypeRef__MultiAssignment_1 )? )
            // InternalJPADsl.g:4572:2: ( rule__TypeRef__MultiAssignment_1 )?
            {
             before(grammarAccess.getTypeRefAccess().getMultiAssignment_1()); 
            // InternalJPADsl.g:4573:2: ( rule__TypeRef__MultiAssignment_1 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==49) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalJPADsl.g:4573:3: rule__TypeRef__MultiAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__TypeRef__MultiAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTypeRefAccess().getMultiAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeRef__Group__1__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildCard__Group__0"
    // InternalJPADsl.g:4582:1: rule__QualifiedNameWithWildCard__Group__0 : rule__QualifiedNameWithWildCard__Group__0__Impl rule__QualifiedNameWithWildCard__Group__1 ;
    public final void rule__QualifiedNameWithWildCard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:4586:1: ( rule__QualifiedNameWithWildCard__Group__0__Impl rule__QualifiedNameWithWildCard__Group__1 )
            // InternalJPADsl.g:4587:2: rule__QualifiedNameWithWildCard__Group__0__Impl rule__QualifiedNameWithWildCard__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalJPADsl.g:4594:1: rule__QualifiedNameWithWildCard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildCard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:4598:1: ( ( ruleQualifiedName ) )
            // InternalJPADsl.g:4599:1: ( ruleQualifiedName )
            {
            // InternalJPADsl.g:4599:1: ( ruleQualifiedName )
            // InternalJPADsl.g:4600:2: ruleQualifiedName
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
    // InternalJPADsl.g:4609:1: rule__QualifiedNameWithWildCard__Group__1 : rule__QualifiedNameWithWildCard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildCard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:4613:1: ( rule__QualifiedNameWithWildCard__Group__1__Impl )
            // InternalJPADsl.g:4614:2: rule__QualifiedNameWithWildCard__Group__1__Impl
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
    // InternalJPADsl.g:4620:1: rule__QualifiedNameWithWildCard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildCard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:4624:1: ( ( ( '.*' )? ) )
            // InternalJPADsl.g:4625:1: ( ( '.*' )? )
            {
            // InternalJPADsl.g:4625:1: ( ( '.*' )? )
            // InternalJPADsl.g:4626:2: ( '.*' )?
            {
             before(grammarAccess.getQualifiedNameWithWildCardAccess().getFullStopAsteriskKeyword_1()); 
            // InternalJPADsl.g:4627:2: ( '.*' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==47) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalJPADsl.g:4627:3: '.*'
                    {
                    match(input,47,FOLLOW_2); 

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
    // InternalJPADsl.g:4636:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:4640:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalJPADsl.g:4641:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalJPADsl.g:4648:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:4652:1: ( ( RULE_ID ) )
            // InternalJPADsl.g:4653:1: ( RULE_ID )
            {
            // InternalJPADsl.g:4653:1: ( RULE_ID )
            // InternalJPADsl.g:4654:2: RULE_ID
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
    // InternalJPADsl.g:4663:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:4667:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalJPADsl.g:4668:2: rule__QualifiedName__Group__1__Impl
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
    // InternalJPADsl.g:4674:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:4678:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalJPADsl.g:4679:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalJPADsl.g:4679:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalJPADsl.g:4680:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalJPADsl.g:4681:2: ( rule__QualifiedName__Group_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==48) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalJPADsl.g:4681:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalJPADsl.g:4690:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:4694:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalJPADsl.g:4695:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalJPADsl.g:4702:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:4706:1: ( ( '.' ) )
            // InternalJPADsl.g:4707:1: ( '.' )
            {
            // InternalJPADsl.g:4707:1: ( '.' )
            // InternalJPADsl.g:4708:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalJPADsl.g:4717:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:4721:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalJPADsl.g:4722:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalJPADsl.g:4728:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:4732:1: ( ( RULE_ID ) )
            // InternalJPADsl.g:4733:1: ( RULE_ID )
            {
            // InternalJPADsl.g:4733:1: ( RULE_ID )
            // InternalJPADsl.g:4734:2: RULE_ID
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


    // $ANTLR start "rule__Model__ElementsAssignment"
    // InternalJPADsl.g:4744:1: rule__Model__ElementsAssignment : ( ruleAbstractElement ) ;
    public final void rule__Model__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:4748:1: ( ( ruleAbstractElement ) )
            // InternalJPADsl.g:4749:2: ( ruleAbstractElement )
            {
            // InternalJPADsl.g:4749:2: ( ruleAbstractElement )
            // InternalJPADsl.g:4750:3: ruleAbstractElement
            {
             before(grammarAccess.getModelAccess().getElementsAbstractElementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getModelAccess().getElementsAbstractElementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ElementsAssignment"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // InternalJPADsl.g:4759:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildCard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:4763:1: ( ( ruleQualifiedNameWithWildCard ) )
            // InternalJPADsl.g:4764:2: ( ruleQualifiedNameWithWildCard )
            {
            // InternalJPADsl.g:4764:2: ( ruleQualifiedNameWithWildCard )
            // InternalJPADsl.g:4765:3: ruleQualifiedNameWithWildCard
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


    // $ANTLR start "rule__PackageDeclaration__NameAssignment_1"
    // InternalJPADsl.g:4774:1: rule__PackageDeclaration__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__PackageDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:4778:1: ( ( ruleQualifiedName ) )
            // InternalJPADsl.g:4779:2: ( ruleQualifiedName )
            {
            // InternalJPADsl.g:4779:2: ( ruleQualifiedName )
            // InternalJPADsl.g:4780:3: ruleQualifiedName
            {
             before(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__NameAssignment_1"


    // $ANTLR start "rule__PackageDeclaration__DatabaseModesAssignment_3"
    // InternalJPADsl.g:4789:1: rule__PackageDeclaration__DatabaseModesAssignment_3 : ( ruleDatabaseMode ) ;
    public final void rule__PackageDeclaration__DatabaseModesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:4793:1: ( ( ruleDatabaseMode ) )
            // InternalJPADsl.g:4794:2: ( ruleDatabaseMode )
            {
            // InternalJPADsl.g:4794:2: ( ruleDatabaseMode )
            // InternalJPADsl.g:4795:3: ruleDatabaseMode
            {
             before(grammarAccess.getPackageDeclarationAccess().getDatabaseModesDatabaseModeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDatabaseMode();

            state._fsp--;

             after(grammarAccess.getPackageDeclarationAccess().getDatabaseModesDatabaseModeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__DatabaseModesAssignment_3"


    // $ANTLR start "rule__PackageDeclaration__ElementsAssignment_4"
    // InternalJPADsl.g:4804:1: rule__PackageDeclaration__ElementsAssignment_4 : ( ruleAbstractElement ) ;
    public final void rule__PackageDeclaration__ElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:4808:1: ( ( ruleAbstractElement ) )
            // InternalJPADsl.g:4809:2: ( ruleAbstractElement )
            {
            // InternalJPADsl.g:4809:2: ( ruleAbstractElement )
            // InternalJPADsl.g:4810:3: ruleAbstractElement
            {
             before(grammarAccess.getPackageDeclarationAccess().getElementsAbstractElementParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getPackageDeclarationAccess().getElementsAbstractElementParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__ElementsAssignment_4"


    // $ANTLR start "rule__DataType__NameAssignment_1"
    // InternalJPADsl.g:4819:1: rule__DataType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DataType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:4823:1: ( ( RULE_ID ) )
            // InternalJPADsl.g:4824:2: ( RULE_ID )
            {
            // InternalJPADsl.g:4824:2: ( RULE_ID )
            // InternalJPADsl.g:4825:3: RULE_ID
            {
             before(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__NameAssignment_1"


    // $ANTLR start "rule__DatabaseMode__NameAssignment_1"
    // InternalJPADsl.g:4834:1: rule__DatabaseMode__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DatabaseMode__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:4838:1: ( ( RULE_ID ) )
            // InternalJPADsl.g:4839:2: ( RULE_ID )
            {
            // InternalJPADsl.g:4839:2: ( RULE_ID )
            // InternalJPADsl.g:4840:3: RULE_ID
            {
             before(grammarAccess.getDatabaseModeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDatabaseModeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatabaseMode__NameAssignment_1"


    // $ANTLR start "rule__Entity__NameAssignment_1"
    // InternalJPADsl.g:4849:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:4853:1: ( ( RULE_ID ) )
            // InternalJPADsl.g:4854:2: ( RULE_ID )
            {
            // InternalJPADsl.g:4854:2: ( RULE_ID )
            // InternalJPADsl.g:4855:3: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__NameAssignment_1"


    // $ANTLR start "rule__Entity__DatabaseVendorAssignment_2"
    // InternalJPADsl.g:4864:1: rule__Entity__DatabaseVendorAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Entity__DatabaseVendorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:4868:1: ( ( ( RULE_ID ) ) )
            // InternalJPADsl.g:4869:2: ( ( RULE_ID ) )
            {
            // InternalJPADsl.g:4869:2: ( ( RULE_ID ) )
            // InternalJPADsl.g:4870:3: ( RULE_ID )
            {
             before(grammarAccess.getEntityAccess().getDatabaseVendorDatabaseModeCrossReference_2_0()); 
            // InternalJPADsl.g:4871:3: ( RULE_ID )
            // InternalJPADsl.g:4872:4: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getDatabaseVendorDatabaseModeIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getDatabaseVendorDatabaseModeIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getEntityAccess().getDatabaseVendorDatabaseModeCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__DatabaseVendorAssignment_2"


    // $ANTLR start "rule__Entity__SuperTypeAssignment_3_1"
    // InternalJPADsl.g:4883:1: rule__Entity__SuperTypeAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Entity__SuperTypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:4887:1: ( ( ( RULE_ID ) ) )
            // InternalJPADsl.g:4888:2: ( ( RULE_ID ) )
            {
            // InternalJPADsl.g:4888:2: ( ( RULE_ID ) )
            // InternalJPADsl.g:4889:3: ( RULE_ID )
            {
             before(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_3_1_0()); 
            // InternalJPADsl.g:4890:3: ( RULE_ID )
            // InternalJPADsl.g:4891:4: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getSuperTypeEntityIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getSuperTypeEntityIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__SuperTypeAssignment_3_1"


    // $ANTLR start "rule__Entity__ReadOnlyAssignment_4"
    // InternalJPADsl.g:4902:1: rule__Entity__ReadOnlyAssignment_4 : ( ruleReadOnly ) ;
    public final void rule__Entity__ReadOnlyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:4906:1: ( ( ruleReadOnly ) )
            // InternalJPADsl.g:4907:2: ( ruleReadOnly )
            {
            // InternalJPADsl.g:4907:2: ( ruleReadOnly )
            // InternalJPADsl.g:4908:3: ruleReadOnly
            {
             before(grammarAccess.getEntityAccess().getReadOnlyReadOnlyParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleReadOnly();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getReadOnlyReadOnlyParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__ReadOnlyAssignment_4"


    // $ANTLR start "rule__Entity__CacheableAssignment_5"
    // InternalJPADsl.g:4917:1: rule__Entity__CacheableAssignment_5 : ( ruleCacheable ) ;
    public final void rule__Entity__CacheableAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:4921:1: ( ( ruleCacheable ) )
            // InternalJPADsl.g:4922:2: ( ruleCacheable )
            {
            // InternalJPADsl.g:4922:2: ( ruleCacheable )
            // InternalJPADsl.g:4923:3: ruleCacheable
            {
             before(grammarAccess.getEntityAccess().getCacheableCacheableParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleCacheable();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getCacheableCacheableParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__CacheableAssignment_5"


    // $ANTLR start "rule__Entity__IdentifierAssignment_7"
    // InternalJPADsl.g:4932:1: rule__Entity__IdentifierAssignment_7 : ( ruleIdentifier ) ;
    public final void rule__Entity__IdentifierAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:4936:1: ( ( ruleIdentifier ) )
            // InternalJPADsl.g:4937:2: ( ruleIdentifier )
            {
            // InternalJPADsl.g:4937:2: ( ruleIdentifier )
            // InternalJPADsl.g:4938:3: ruleIdentifier
            {
             before(grammarAccess.getEntityAccess().getIdentifierIdentifierParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleIdentifier();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getIdentifierIdentifierParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__IdentifierAssignment_7"


    // $ANTLR start "rule__Entity__ImportsAssignment_8"
    // InternalJPADsl.g:4947:1: rule__Entity__ImportsAssignment_8 : ( ruleImport ) ;
    public final void rule__Entity__ImportsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:4951:1: ( ( ruleImport ) )
            // InternalJPADsl.g:4952:2: ( ruleImport )
            {
            // InternalJPADsl.g:4952:2: ( ruleImport )
            // InternalJPADsl.g:4953:3: ruleImport
            {
             before(grammarAccess.getEntityAccess().getImportsImportParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getImportsImportParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__ImportsAssignment_8"


    // $ANTLR start "rule__Entity__FeaturesAssignment_9"
    // InternalJPADsl.g:4962:1: rule__Entity__FeaturesAssignment_9 : ( ruleFeature ) ;
    public final void rule__Entity__FeaturesAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:4966:1: ( ( ruleFeature ) )
            // InternalJPADsl.g:4967:2: ( ruleFeature )
            {
            // InternalJPADsl.g:4967:2: ( ruleFeature )
            // InternalJPADsl.g:4968:3: ruleFeature
            {
             before(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__FeaturesAssignment_9"


    // $ANTLR start "rule__ReadOnly__TableNameAssignment_1"
    // InternalJPADsl.g:4977:1: rule__ReadOnly__TableNameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ReadOnly__TableNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:4981:1: ( ( RULE_STRING ) )
            // InternalJPADsl.g:4982:2: ( RULE_STRING )
            {
            // InternalJPADsl.g:4982:2: ( RULE_STRING )
            // InternalJPADsl.g:4983:3: RULE_STRING
            {
             before(grammarAccess.getReadOnlyAccess().getTableNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getReadOnlyAccess().getTableNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReadOnly__TableNameAssignment_1"


    // $ANTLR start "rule__ReadOnly__IdColumnAssignment_2"
    // InternalJPADsl.g:4992:1: rule__ReadOnly__IdColumnAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ReadOnly__IdColumnAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:4996:1: ( ( RULE_STRING ) )
            // InternalJPADsl.g:4997:2: ( RULE_STRING )
            {
            // InternalJPADsl.g:4997:2: ( RULE_STRING )
            // InternalJPADsl.g:4998:3: RULE_STRING
            {
             before(grammarAccess.getReadOnlyAccess().getIdColumnSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getReadOnlyAccess().getIdColumnSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReadOnly__IdColumnAssignment_2"


    // $ANTLR start "rule__UniqueIdentiferColumn__NameAssignment_1"
    // InternalJPADsl.g:5007:1: rule__UniqueIdentiferColumn__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__UniqueIdentiferColumn__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:5011:1: ( ( RULE_ID ) )
            // InternalJPADsl.g:5012:2: ( RULE_ID )
            {
            // InternalJPADsl.g:5012:2: ( RULE_ID )
            // InternalJPADsl.g:5013:3: RULE_ID
            {
             before(grammarAccess.getUniqueIdentiferColumnAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUniqueIdentiferColumnAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UniqueIdentiferColumn__NameAssignment_1"


    // $ANTLR start "rule__EmbeddedUniqueIdentifer__NameAssignment_1"
    // InternalJPADsl.g:5022:1: rule__EmbeddedUniqueIdentifer__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EmbeddedUniqueIdentifer__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:5026:1: ( ( RULE_ID ) )
            // InternalJPADsl.g:5027:2: ( RULE_ID )
            {
            // InternalJPADsl.g:5027:2: ( RULE_ID )
            // InternalJPADsl.g:5028:3: RULE_ID
            {
             before(grammarAccess.getEmbeddedUniqueIdentiferAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEmbeddedUniqueIdentiferAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmbeddedUniqueIdentifer__NameAssignment_1"


    // $ANTLR start "rule__StaticAttribute__NameAssignment_1"
    // InternalJPADsl.g:5037:1: rule__StaticAttribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__StaticAttribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:5041:1: ( ( RULE_ID ) )
            // InternalJPADsl.g:5042:2: ( RULE_ID )
            {
            // InternalJPADsl.g:5042:2: ( RULE_ID )
            // InternalJPADsl.g:5043:3: RULE_ID
            {
             before(grammarAccess.getStaticAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStaticAttributeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StaticAttribute__NameAssignment_1"


    // $ANTLR start "rule__StaticAttribute__TypeAssignment_3"
    // InternalJPADsl.g:5052:1: rule__StaticAttribute__TypeAssignment_3 : ( ruleTypeRef ) ;
    public final void rule__StaticAttribute__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:5056:1: ( ( ruleTypeRef ) )
            // InternalJPADsl.g:5057:2: ( ruleTypeRef )
            {
            // InternalJPADsl.g:5057:2: ( ruleTypeRef )
            // InternalJPADsl.g:5058:3: ruleTypeRef
            {
             before(grammarAccess.getStaticAttributeAccess().getTypeTypeRefParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeRef();

            state._fsp--;

             after(grammarAccess.getStaticAttributeAccess().getTypeTypeRefParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StaticAttribute__TypeAssignment_3"


    // $ANTLR start "rule__ReadOnlyInternalAttribute__NameAssignment_0"
    // InternalJPADsl.g:5067:1: rule__ReadOnlyInternalAttribute__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__ReadOnlyInternalAttribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:5071:1: ( ( RULE_ID ) )
            // InternalJPADsl.g:5072:2: ( RULE_ID )
            {
            // InternalJPADsl.g:5072:2: ( RULE_ID )
            // InternalJPADsl.g:5073:3: RULE_ID
            {
             before(grammarAccess.getReadOnlyInternalAttributeAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getReadOnlyInternalAttributeAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReadOnlyInternalAttribute__NameAssignment_0"


    // $ANTLR start "rule__ReadOnlyInternalAttribute__TypeAssignment_2"
    // InternalJPADsl.g:5082:1: rule__ReadOnlyInternalAttribute__TypeAssignment_2 : ( ruleTypeRef ) ;
    public final void rule__ReadOnlyInternalAttribute__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:5086:1: ( ( ruleTypeRef ) )
            // InternalJPADsl.g:5087:2: ( ruleTypeRef )
            {
            // InternalJPADsl.g:5087:2: ( ruleTypeRef )
            // InternalJPADsl.g:5088:3: ruleTypeRef
            {
             before(grammarAccess.getReadOnlyInternalAttributeAccess().getTypeTypeRefParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeRef();

            state._fsp--;

             after(grammarAccess.getReadOnlyInternalAttributeAccess().getTypeTypeRefParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReadOnlyInternalAttribute__TypeAssignment_2"


    // $ANTLR start "rule__UpdatableInternalAttribute__NameAssignment_1"
    // InternalJPADsl.g:5097:1: rule__UpdatableInternalAttribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__UpdatableInternalAttribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:5101:1: ( ( RULE_ID ) )
            // InternalJPADsl.g:5102:2: ( RULE_ID )
            {
            // InternalJPADsl.g:5102:2: ( RULE_ID )
            // InternalJPADsl.g:5103:3: RULE_ID
            {
             before(grammarAccess.getUpdatableInternalAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUpdatableInternalAttributeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdatableInternalAttribute__NameAssignment_1"


    // $ANTLR start "rule__UpdatableInternalAttribute__TypeAssignment_3"
    // InternalJPADsl.g:5112:1: rule__UpdatableInternalAttribute__TypeAssignment_3 : ( ruleTypeRef ) ;
    public final void rule__UpdatableInternalAttribute__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:5116:1: ( ( ruleTypeRef ) )
            // InternalJPADsl.g:5117:2: ( ruleTypeRef )
            {
            // InternalJPADsl.g:5117:2: ( ruleTypeRef )
            // InternalJPADsl.g:5118:3: ruleTypeRef
            {
             before(grammarAccess.getUpdatableInternalAttributeAccess().getTypeTypeRefParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeRef();

            state._fsp--;

             after(grammarAccess.getUpdatableInternalAttributeAccess().getTypeTypeRefParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdatableInternalAttribute__TypeAssignment_3"


    // $ANTLR start "rule__TransientAttribute__NameAssignment_1"
    // InternalJPADsl.g:5127:1: rule__TransientAttribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TransientAttribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:5131:1: ( ( RULE_ID ) )
            // InternalJPADsl.g:5132:2: ( RULE_ID )
            {
            // InternalJPADsl.g:5132:2: ( RULE_ID )
            // InternalJPADsl.g:5133:3: RULE_ID
            {
             before(grammarAccess.getTransientAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTransientAttributeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransientAttribute__NameAssignment_1"


    // $ANTLR start "rule__TransientAttribute__TypeAssignment_3"
    // InternalJPADsl.g:5142:1: rule__TransientAttribute__TypeAssignment_3 : ( ruleTypeRef ) ;
    public final void rule__TransientAttribute__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:5146:1: ( ( ruleTypeRef ) )
            // InternalJPADsl.g:5147:2: ( ruleTypeRef )
            {
            // InternalJPADsl.g:5147:2: ( ruleTypeRef )
            // InternalJPADsl.g:5148:3: ruleTypeRef
            {
             before(grammarAccess.getTransientAttributeAccess().getTypeTypeRefParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeRef();

            state._fsp--;

             after(grammarAccess.getTransientAttributeAccess().getTypeTypeRefParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransientAttribute__TypeAssignment_3"


    // $ANTLR start "rule__IdAttribute__NameAssignment_1"
    // InternalJPADsl.g:5157:1: rule__IdAttribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__IdAttribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:5161:1: ( ( RULE_ID ) )
            // InternalJPADsl.g:5162:2: ( RULE_ID )
            {
            // InternalJPADsl.g:5162:2: ( RULE_ID )
            // InternalJPADsl.g:5163:3: RULE_ID
            {
             before(grammarAccess.getIdAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIdAttributeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdAttribute__NameAssignment_1"


    // $ANTLR start "rule__IdAttribute__TypeAssignment_3"
    // InternalJPADsl.g:5172:1: rule__IdAttribute__TypeAssignment_3 : ( ruleTypeRef ) ;
    public final void rule__IdAttribute__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:5176:1: ( ( ruleTypeRef ) )
            // InternalJPADsl.g:5177:2: ( ruleTypeRef )
            {
            // InternalJPADsl.g:5177:2: ( ruleTypeRef )
            // InternalJPADsl.g:5178:3: ruleTypeRef
            {
             before(grammarAccess.getIdAttributeAccess().getTypeTypeRefParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeRef();

            state._fsp--;

             after(grammarAccess.getIdAttributeAccess().getTypeTypeRefParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdAttribute__TypeAssignment_3"


    // $ANTLR start "rule__OneToOneRelationshipAttribute__NameAssignment_1"
    // InternalJPADsl.g:5187:1: rule__OneToOneRelationshipAttribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__OneToOneRelationshipAttribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:5191:1: ( ( RULE_ID ) )
            // InternalJPADsl.g:5192:2: ( RULE_ID )
            {
            // InternalJPADsl.g:5192:2: ( RULE_ID )
            // InternalJPADsl.g:5193:3: RULE_ID
            {
             before(grammarAccess.getOneToOneRelationshipAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getOneToOneRelationshipAttributeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToOneRelationshipAttribute__NameAssignment_1"


    // $ANTLR start "rule__OneToOneRelationshipAttribute__TypeAssignment_3"
    // InternalJPADsl.g:5202:1: rule__OneToOneRelationshipAttribute__TypeAssignment_3 : ( ruleTypeRef ) ;
    public final void rule__OneToOneRelationshipAttribute__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:5206:1: ( ( ruleTypeRef ) )
            // InternalJPADsl.g:5207:2: ( ruleTypeRef )
            {
            // InternalJPADsl.g:5207:2: ( ruleTypeRef )
            // InternalJPADsl.g:5208:3: ruleTypeRef
            {
             before(grammarAccess.getOneToOneRelationshipAttributeAccess().getTypeTypeRefParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeRef();

            state._fsp--;

             after(grammarAccess.getOneToOneRelationshipAttributeAccess().getTypeTypeRefParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToOneRelationshipAttribute__TypeAssignment_3"


    // $ANTLR start "rule__OneToOneRelationshipAttribute__JoinColumnOverrideAssignment_4"
    // InternalJPADsl.g:5217:1: rule__OneToOneRelationshipAttribute__JoinColumnOverrideAssignment_4 : ( RULE_STRING ) ;
    public final void rule__OneToOneRelationshipAttribute__JoinColumnOverrideAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:5221:1: ( ( RULE_STRING ) )
            // InternalJPADsl.g:5222:2: ( RULE_STRING )
            {
            // InternalJPADsl.g:5222:2: ( RULE_STRING )
            // InternalJPADsl.g:5223:3: RULE_STRING
            {
             before(grammarAccess.getOneToOneRelationshipAttributeAccess().getJoinColumnOverrideSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getOneToOneRelationshipAttributeAccess().getJoinColumnOverrideSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToOneRelationshipAttribute__JoinColumnOverrideAssignment_4"


    // $ANTLR start "rule__OneToOneMappedByRelationshipAttribute__NameAssignment_1"
    // InternalJPADsl.g:5232:1: rule__OneToOneMappedByRelationshipAttribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__OneToOneMappedByRelationshipAttribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:5236:1: ( ( RULE_ID ) )
            // InternalJPADsl.g:5237:2: ( RULE_ID )
            {
            // InternalJPADsl.g:5237:2: ( RULE_ID )
            // InternalJPADsl.g:5238:3: RULE_ID
            {
             before(grammarAccess.getOneToOneMappedByRelationshipAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getOneToOneMappedByRelationshipAttributeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToOneMappedByRelationshipAttribute__NameAssignment_1"


    // $ANTLR start "rule__OneToOneMappedByRelationshipAttribute__TypeAssignment_3"
    // InternalJPADsl.g:5247:1: rule__OneToOneMappedByRelationshipAttribute__TypeAssignment_3 : ( ruleTypeRef ) ;
    public final void rule__OneToOneMappedByRelationshipAttribute__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:5251:1: ( ( ruleTypeRef ) )
            // InternalJPADsl.g:5252:2: ( ruleTypeRef )
            {
            // InternalJPADsl.g:5252:2: ( ruleTypeRef )
            // InternalJPADsl.g:5253:3: ruleTypeRef
            {
             before(grammarAccess.getOneToOneMappedByRelationshipAttributeAccess().getTypeTypeRefParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeRef();

            state._fsp--;

             after(grammarAccess.getOneToOneMappedByRelationshipAttributeAccess().getTypeTypeRefParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToOneMappedByRelationshipAttribute__TypeAssignment_3"


    // $ANTLR start "rule__OneToManyJoinTableRelationshipAttribute__NameAssignment_1"
    // InternalJPADsl.g:5262:1: rule__OneToManyJoinTableRelationshipAttribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__OneToManyJoinTableRelationshipAttribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:5266:1: ( ( RULE_ID ) )
            // InternalJPADsl.g:5267:2: ( RULE_ID )
            {
            // InternalJPADsl.g:5267:2: ( RULE_ID )
            // InternalJPADsl.g:5268:3: RULE_ID
            {
             before(grammarAccess.getOneToManyJoinTableRelationshipAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getOneToManyJoinTableRelationshipAttributeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToManyJoinTableRelationshipAttribute__NameAssignment_1"


    // $ANTLR start "rule__OneToManyJoinTableRelationshipAttribute__TypeAssignment_3"
    // InternalJPADsl.g:5277:1: rule__OneToManyJoinTableRelationshipAttribute__TypeAssignment_3 : ( ruleTypeRef ) ;
    public final void rule__OneToManyJoinTableRelationshipAttribute__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:5281:1: ( ( ruleTypeRef ) )
            // InternalJPADsl.g:5282:2: ( ruleTypeRef )
            {
            // InternalJPADsl.g:5282:2: ( ruleTypeRef )
            // InternalJPADsl.g:5283:3: ruleTypeRef
            {
             before(grammarAccess.getOneToManyJoinTableRelationshipAttributeAccess().getTypeTypeRefParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeRef();

            state._fsp--;

             after(grammarAccess.getOneToManyJoinTableRelationshipAttributeAccess().getTypeTypeRefParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToManyJoinTableRelationshipAttribute__TypeAssignment_3"


    // $ANTLR start "rule__OneToManyJoinColumnRelationshipAttribute__NameAssignment_1"
    // InternalJPADsl.g:5292:1: rule__OneToManyJoinColumnRelationshipAttribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__OneToManyJoinColumnRelationshipAttribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:5296:1: ( ( RULE_ID ) )
            // InternalJPADsl.g:5297:2: ( RULE_ID )
            {
            // InternalJPADsl.g:5297:2: ( RULE_ID )
            // InternalJPADsl.g:5298:3: RULE_ID
            {
             before(grammarAccess.getOneToManyJoinColumnRelationshipAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getOneToManyJoinColumnRelationshipAttributeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToManyJoinColumnRelationshipAttribute__NameAssignment_1"


    // $ANTLR start "rule__OneToManyJoinColumnRelationshipAttribute__TypeAssignment_3"
    // InternalJPADsl.g:5307:1: rule__OneToManyJoinColumnRelationshipAttribute__TypeAssignment_3 : ( ruleTypeRef ) ;
    public final void rule__OneToManyJoinColumnRelationshipAttribute__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:5311:1: ( ( ruleTypeRef ) )
            // InternalJPADsl.g:5312:2: ( ruleTypeRef )
            {
            // InternalJPADsl.g:5312:2: ( ruleTypeRef )
            // InternalJPADsl.g:5313:3: ruleTypeRef
            {
             before(grammarAccess.getOneToManyJoinColumnRelationshipAttributeAccess().getTypeTypeRefParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeRef();

            state._fsp--;

             after(grammarAccess.getOneToManyJoinColumnRelationshipAttributeAccess().getTypeTypeRefParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToManyJoinColumnRelationshipAttribute__TypeAssignment_3"


    // $ANTLR start "rule__OneToManyMappedByRelationshipAttribute__NameAssignment_1"
    // InternalJPADsl.g:5322:1: rule__OneToManyMappedByRelationshipAttribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__OneToManyMappedByRelationshipAttribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:5326:1: ( ( RULE_ID ) )
            // InternalJPADsl.g:5327:2: ( RULE_ID )
            {
            // InternalJPADsl.g:5327:2: ( RULE_ID )
            // InternalJPADsl.g:5328:3: RULE_ID
            {
             before(grammarAccess.getOneToManyMappedByRelationshipAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getOneToManyMappedByRelationshipAttributeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToManyMappedByRelationshipAttribute__NameAssignment_1"


    // $ANTLR start "rule__OneToManyMappedByRelationshipAttribute__TypeAssignment_3"
    // InternalJPADsl.g:5337:1: rule__OneToManyMappedByRelationshipAttribute__TypeAssignment_3 : ( ruleTypeRef ) ;
    public final void rule__OneToManyMappedByRelationshipAttribute__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:5341:1: ( ( ruleTypeRef ) )
            // InternalJPADsl.g:5342:2: ( ruleTypeRef )
            {
            // InternalJPADsl.g:5342:2: ( ruleTypeRef )
            // InternalJPADsl.g:5343:3: ruleTypeRef
            {
             before(grammarAccess.getOneToManyMappedByRelationshipAttributeAccess().getTypeTypeRefParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeRef();

            state._fsp--;

             after(grammarAccess.getOneToManyMappedByRelationshipAttributeAccess().getTypeTypeRefParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToManyMappedByRelationshipAttribute__TypeAssignment_3"


    // $ANTLR start "rule__ManyToOneJoinColumnRelationShipAttribute__NameAssignment_1"
    // InternalJPADsl.g:5352:1: rule__ManyToOneJoinColumnRelationShipAttribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ManyToOneJoinColumnRelationShipAttribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:5356:1: ( ( RULE_ID ) )
            // InternalJPADsl.g:5357:2: ( RULE_ID )
            {
            // InternalJPADsl.g:5357:2: ( RULE_ID )
            // InternalJPADsl.g:5358:3: RULE_ID
            {
             before(grammarAccess.getManyToOneJoinColumnRelationShipAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getManyToOneJoinColumnRelationShipAttributeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToOneJoinColumnRelationShipAttribute__NameAssignment_1"


    // $ANTLR start "rule__ManyToOneJoinColumnRelationShipAttribute__TypeAssignment_3"
    // InternalJPADsl.g:5367:1: rule__ManyToOneJoinColumnRelationShipAttribute__TypeAssignment_3 : ( ruleTypeRef ) ;
    public final void rule__ManyToOneJoinColumnRelationShipAttribute__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:5371:1: ( ( ruleTypeRef ) )
            // InternalJPADsl.g:5372:2: ( ruleTypeRef )
            {
            // InternalJPADsl.g:5372:2: ( ruleTypeRef )
            // InternalJPADsl.g:5373:3: ruleTypeRef
            {
             before(grammarAccess.getManyToOneJoinColumnRelationShipAttributeAccess().getTypeTypeRefParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeRef();

            state._fsp--;

             after(grammarAccess.getManyToOneJoinColumnRelationShipAttributeAccess().getTypeTypeRefParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToOneJoinColumnRelationShipAttribute__TypeAssignment_3"


    // $ANTLR start "rule__ManyToOneJoinColumnRelationShipAttribute__JoinColumnOverrideAssignment_4"
    // InternalJPADsl.g:5382:1: rule__ManyToOneJoinColumnRelationShipAttribute__JoinColumnOverrideAssignment_4 : ( RULE_STRING ) ;
    public final void rule__ManyToOneJoinColumnRelationShipAttribute__JoinColumnOverrideAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:5386:1: ( ( RULE_STRING ) )
            // InternalJPADsl.g:5387:2: ( RULE_STRING )
            {
            // InternalJPADsl.g:5387:2: ( RULE_STRING )
            // InternalJPADsl.g:5388:3: RULE_STRING
            {
             before(grammarAccess.getManyToOneJoinColumnRelationShipAttributeAccess().getJoinColumnOverrideSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getManyToOneJoinColumnRelationShipAttributeAccess().getJoinColumnOverrideSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToOneJoinColumnRelationShipAttribute__JoinColumnOverrideAssignment_4"


    // $ANTLR start "rule__ManyToOneJoinTableRelationShipAttribute__NameAssignment_1"
    // InternalJPADsl.g:5397:1: rule__ManyToOneJoinTableRelationShipAttribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ManyToOneJoinTableRelationShipAttribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:5401:1: ( ( RULE_ID ) )
            // InternalJPADsl.g:5402:2: ( RULE_ID )
            {
            // InternalJPADsl.g:5402:2: ( RULE_ID )
            // InternalJPADsl.g:5403:3: RULE_ID
            {
             before(grammarAccess.getManyToOneJoinTableRelationShipAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getManyToOneJoinTableRelationShipAttributeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToOneJoinTableRelationShipAttribute__NameAssignment_1"


    // $ANTLR start "rule__ManyToOneJoinTableRelationShipAttribute__TypeAssignment_3"
    // InternalJPADsl.g:5412:1: rule__ManyToOneJoinTableRelationShipAttribute__TypeAssignment_3 : ( ruleTypeRef ) ;
    public final void rule__ManyToOneJoinTableRelationShipAttribute__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:5416:1: ( ( ruleTypeRef ) )
            // InternalJPADsl.g:5417:2: ( ruleTypeRef )
            {
            // InternalJPADsl.g:5417:2: ( ruleTypeRef )
            // InternalJPADsl.g:5418:3: ruleTypeRef
            {
             before(grammarAccess.getManyToOneJoinTableRelationShipAttributeAccess().getTypeTypeRefParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeRef();

            state._fsp--;

             after(grammarAccess.getManyToOneJoinTableRelationShipAttributeAccess().getTypeTypeRefParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToOneJoinTableRelationShipAttribute__TypeAssignment_3"


    // $ANTLR start "rule__ManyToOneMappedByRelationShipAttribute__NameAssignment_1"
    // InternalJPADsl.g:5427:1: rule__ManyToOneMappedByRelationShipAttribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ManyToOneMappedByRelationShipAttribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:5431:1: ( ( RULE_ID ) )
            // InternalJPADsl.g:5432:2: ( RULE_ID )
            {
            // InternalJPADsl.g:5432:2: ( RULE_ID )
            // InternalJPADsl.g:5433:3: RULE_ID
            {
             before(grammarAccess.getManyToOneMappedByRelationShipAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getManyToOneMappedByRelationShipAttributeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToOneMappedByRelationShipAttribute__NameAssignment_1"


    // $ANTLR start "rule__ManyToOneMappedByRelationShipAttribute__TypeAssignment_3"
    // InternalJPADsl.g:5442:1: rule__ManyToOneMappedByRelationShipAttribute__TypeAssignment_3 : ( ruleTypeRef ) ;
    public final void rule__ManyToOneMappedByRelationShipAttribute__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:5446:1: ( ( ruleTypeRef ) )
            // InternalJPADsl.g:5447:2: ( ruleTypeRef )
            {
            // InternalJPADsl.g:5447:2: ( ruleTypeRef )
            // InternalJPADsl.g:5448:3: ruleTypeRef
            {
             before(grammarAccess.getManyToOneMappedByRelationShipAttributeAccess().getTypeTypeRefParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeRef();

            state._fsp--;

             after(grammarAccess.getManyToOneMappedByRelationShipAttributeAccess().getTypeTypeRefParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToOneMappedByRelationShipAttribute__TypeAssignment_3"


    // $ANTLR start "rule__ManyToManyRelationshipAttribute__NameAssignment_1"
    // InternalJPADsl.g:5457:1: rule__ManyToManyRelationshipAttribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ManyToManyRelationshipAttribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:5461:1: ( ( RULE_ID ) )
            // InternalJPADsl.g:5462:2: ( RULE_ID )
            {
            // InternalJPADsl.g:5462:2: ( RULE_ID )
            // InternalJPADsl.g:5463:3: RULE_ID
            {
             before(grammarAccess.getManyToManyRelationshipAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getManyToManyRelationshipAttributeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToManyRelationshipAttribute__NameAssignment_1"


    // $ANTLR start "rule__ManyToManyRelationshipAttribute__TypeAssignment_3"
    // InternalJPADsl.g:5472:1: rule__ManyToManyRelationshipAttribute__TypeAssignment_3 : ( ruleTypeRef ) ;
    public final void rule__ManyToManyRelationshipAttribute__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:5476:1: ( ( ruleTypeRef ) )
            // InternalJPADsl.g:5477:2: ( ruleTypeRef )
            {
            // InternalJPADsl.g:5477:2: ( ruleTypeRef )
            // InternalJPADsl.g:5478:3: ruleTypeRef
            {
             before(grammarAccess.getManyToManyRelationshipAttributeAccess().getTypeTypeRefParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeRef();

            state._fsp--;

             after(grammarAccess.getManyToManyRelationshipAttributeAccess().getTypeTypeRefParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToManyRelationshipAttribute__TypeAssignment_3"


    // $ANTLR start "rule__ManyToManyMappedByRelationshipAttribute__NameAssignment_1"
    // InternalJPADsl.g:5487:1: rule__ManyToManyMappedByRelationshipAttribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ManyToManyMappedByRelationshipAttribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:5491:1: ( ( RULE_ID ) )
            // InternalJPADsl.g:5492:2: ( RULE_ID )
            {
            // InternalJPADsl.g:5492:2: ( RULE_ID )
            // InternalJPADsl.g:5493:3: RULE_ID
            {
             before(grammarAccess.getManyToManyMappedByRelationshipAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getManyToManyMappedByRelationshipAttributeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToManyMappedByRelationshipAttribute__NameAssignment_1"


    // $ANTLR start "rule__ManyToManyMappedByRelationshipAttribute__TypeAssignment_3"
    // InternalJPADsl.g:5502:1: rule__ManyToManyMappedByRelationshipAttribute__TypeAssignment_3 : ( ruleTypeRef ) ;
    public final void rule__ManyToManyMappedByRelationshipAttribute__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:5506:1: ( ( ruleTypeRef ) )
            // InternalJPADsl.g:5507:2: ( ruleTypeRef )
            {
            // InternalJPADsl.g:5507:2: ( ruleTypeRef )
            // InternalJPADsl.g:5508:3: ruleTypeRef
            {
             before(grammarAccess.getManyToManyMappedByRelationshipAttributeAccess().getTypeTypeRefParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeRef();

            state._fsp--;

             after(grammarAccess.getManyToManyMappedByRelationshipAttributeAccess().getTypeTypeRefParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToManyMappedByRelationshipAttribute__TypeAssignment_3"


    // $ANTLR start "rule__Reference__NameAssignment_1"
    // InternalJPADsl.g:5517:1: rule__Reference__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Reference__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:5521:1: ( ( RULE_ID ) )
            // InternalJPADsl.g:5522:2: ( RULE_ID )
            {
            // InternalJPADsl.g:5522:2: ( RULE_ID )
            // InternalJPADsl.g:5523:3: RULE_ID
            {
             before(grammarAccess.getReferenceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__NameAssignment_1"


    // $ANTLR start "rule__Reference__TypeAssignment_3"
    // InternalJPADsl.g:5532:1: rule__Reference__TypeAssignment_3 : ( ruleTypeRef ) ;
    public final void rule__Reference__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:5536:1: ( ( ruleTypeRef ) )
            // InternalJPADsl.g:5537:2: ( ruleTypeRef )
            {
            // InternalJPADsl.g:5537:2: ( ruleTypeRef )
            // InternalJPADsl.g:5538:3: ruleTypeRef
            {
             before(grammarAccess.getReferenceAccess().getTypeTypeRefParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeRef();

            state._fsp--;

             after(grammarAccess.getReferenceAccess().getTypeTypeRefParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__TypeAssignment_3"


    // $ANTLR start "rule__Reference__OppositeAssignment_4_1"
    // InternalJPADsl.g:5547:1: rule__Reference__OppositeAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__Reference__OppositeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:5551:1: ( ( ( RULE_ID ) ) )
            // InternalJPADsl.g:5552:2: ( ( RULE_ID ) )
            {
            // InternalJPADsl.g:5552:2: ( ( RULE_ID ) )
            // InternalJPADsl.g:5553:3: ( RULE_ID )
            {
             before(grammarAccess.getReferenceAccess().getOppositeReferenceCrossReference_4_1_0()); 
            // InternalJPADsl.g:5554:3: ( RULE_ID )
            // InternalJPADsl.g:5555:4: RULE_ID
            {
             before(grammarAccess.getReferenceAccess().getOppositeReferenceIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getOppositeReferenceIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getReferenceAccess().getOppositeReferenceCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__OppositeAssignment_4_1"


    // $ANTLR start "rule__Operation__VisibilityAssignment_0"
    // InternalJPADsl.g:5566:1: rule__Operation__VisibilityAssignment_0 : ( ruleVisibility ) ;
    public final void rule__Operation__VisibilityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:5570:1: ( ( ruleVisibility ) )
            // InternalJPADsl.g:5571:2: ( ruleVisibility )
            {
            // InternalJPADsl.g:5571:2: ( ruleVisibility )
            // InternalJPADsl.g:5572:3: ruleVisibility
            {
             before(grammarAccess.getOperationAccess().getVisibilityVisibilityEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVisibility();

            state._fsp--;

             after(grammarAccess.getOperationAccess().getVisibilityVisibilityEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__VisibilityAssignment_0"


    // $ANTLR start "rule__Operation__NameAssignment_2"
    // InternalJPADsl.g:5581:1: rule__Operation__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Operation__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:5585:1: ( ( RULE_ID ) )
            // InternalJPADsl.g:5586:2: ( RULE_ID )
            {
            // InternalJPADsl.g:5586:2: ( RULE_ID )
            // InternalJPADsl.g:5587:3: RULE_ID
            {
             before(grammarAccess.getOperationAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getOperationAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__NameAssignment_2"


    // $ANTLR start "rule__Operation__ParamsAssignment_4_0"
    // InternalJPADsl.g:5596:1: rule__Operation__ParamsAssignment_4_0 : ( ruleParameter ) ;
    public final void rule__Operation__ParamsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:5600:1: ( ( ruleParameter ) )
            // InternalJPADsl.g:5601:2: ( ruleParameter )
            {
            // InternalJPADsl.g:5601:2: ( ruleParameter )
            // InternalJPADsl.g:5602:3: ruleParameter
            {
             before(grammarAccess.getOperationAccess().getParamsParameterParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getOperationAccess().getParamsParameterParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__ParamsAssignment_4_0"


    // $ANTLR start "rule__Operation__ParamsAssignment_4_1_1"
    // InternalJPADsl.g:5611:1: rule__Operation__ParamsAssignment_4_1_1 : ( ruleParameter ) ;
    public final void rule__Operation__ParamsAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:5615:1: ( ( ruleParameter ) )
            // InternalJPADsl.g:5616:2: ( ruleParameter )
            {
            // InternalJPADsl.g:5616:2: ( ruleParameter )
            // InternalJPADsl.g:5617:3: ruleParameter
            {
             before(grammarAccess.getOperationAccess().getParamsParameterParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getOperationAccess().getParamsParameterParserRuleCall_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__ParamsAssignment_4_1_1"


    // $ANTLR start "rule__Operation__TypeAssignment_7"
    // InternalJPADsl.g:5626:1: rule__Operation__TypeAssignment_7 : ( ruleTypeRef ) ;
    public final void rule__Operation__TypeAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:5630:1: ( ( ruleTypeRef ) )
            // InternalJPADsl.g:5631:2: ( ruleTypeRef )
            {
            // InternalJPADsl.g:5631:2: ( ruleTypeRef )
            // InternalJPADsl.g:5632:3: ruleTypeRef
            {
             before(grammarAccess.getOperationAccess().getTypeTypeRefParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeRef();

            state._fsp--;

             after(grammarAccess.getOperationAccess().getTypeTypeRefParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__TypeAssignment_7"


    // $ANTLR start "rule__Parameter__NameAssignment_0"
    // InternalJPADsl.g:5641:1: rule__Parameter__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:5645:1: ( ( RULE_ID ) )
            // InternalJPADsl.g:5646:2: ( RULE_ID )
            {
            // InternalJPADsl.g:5646:2: ( RULE_ID )
            // InternalJPADsl.g:5647:3: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__NameAssignment_0"


    // $ANTLR start "rule__Parameter__TypeAssignment_1"
    // InternalJPADsl.g:5656:1: rule__Parameter__TypeAssignment_1 : ( ruleTypeRef ) ;
    public final void rule__Parameter__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:5660:1: ( ( ruleTypeRef ) )
            // InternalJPADsl.g:5661:2: ( ruleTypeRef )
            {
            // InternalJPADsl.g:5661:2: ( ruleTypeRef )
            // InternalJPADsl.g:5662:3: ruleTypeRef
            {
             before(grammarAccess.getParameterAccess().getTypeTypeRefParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeRef();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getTypeTypeRefParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__TypeAssignment_1"


    // $ANTLR start "rule__TypeRef__ReferencedAssignment_0"
    // InternalJPADsl.g:5671:1: rule__TypeRef__ReferencedAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__TypeRef__ReferencedAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:5675:1: ( ( ( RULE_ID ) ) )
            // InternalJPADsl.g:5676:2: ( ( RULE_ID ) )
            {
            // InternalJPADsl.g:5676:2: ( ( RULE_ID ) )
            // InternalJPADsl.g:5677:3: ( RULE_ID )
            {
             before(grammarAccess.getTypeRefAccess().getReferencedTypeCrossReference_0_0()); 
            // InternalJPADsl.g:5678:3: ( RULE_ID )
            // InternalJPADsl.g:5679:4: RULE_ID
            {
             before(grammarAccess.getTypeRefAccess().getReferencedTypeIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTypeRefAccess().getReferencedTypeIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getTypeRefAccess().getReferencedTypeCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeRef__ReferencedAssignment_0"


    // $ANTLR start "rule__TypeRef__MultiAssignment_1"
    // InternalJPADsl.g:5690:1: rule__TypeRef__MultiAssignment_1 : ( ( '*' ) ) ;
    public final void rule__TypeRef__MultiAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPADsl.g:5694:1: ( ( ( '*' ) ) )
            // InternalJPADsl.g:5695:2: ( ( '*' ) )
            {
            // InternalJPADsl.g:5695:2: ( ( '*' ) )
            // InternalJPADsl.g:5696:3: ( '*' )
            {
             before(grammarAccess.getTypeRefAccess().getMultiAsteriskKeyword_1_0()); 
            // InternalJPADsl.g:5697:3: ( '*' )
            // InternalJPADsl.g:5698:4: '*'
            {
             before(grammarAccess.getTypeRefAccess().getMultiAsteriskKeyword_1_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getTypeRefAccess().getMultiAsteriskKeyword_1_0()); 

            }

             after(grammarAccess.getTypeRefAccess().getMultiAsteriskKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeRef__MultiAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000001FF8014C002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000001FF801EC000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000E10010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000BFFF416F810L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000BFFF414F812L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000BFFF414F810L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000200000000010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0001000000000002L});

}