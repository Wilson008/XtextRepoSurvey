package dk.itu.mdd.nbs.dsl.ide.contentassist.antlr.internal;

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
import dk.itu.mdd.nbs.dsl.services.NowereBycicleDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalNowereBycicleDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'E'", "'e'", "'SuperParts'", "'HomeParts'", "'HandMadeParts'", "'RacerFrame'", "'CityFrame'", "'UnicycleFrame'", "'Red'", "'Blue'", "'Black'", "'Green'", "'ChildPedals'", "'SportsPedals'", "'ComfortPedals'", "'ExtremePedals'", "'RacingSaddle'", "'ChildSaddle'", "'SpecialUnicycleSaddle'", "'ComfortSaddle'", "'Bicycle'", "'deliveryDate'", "'CustomerData'", "'address'", "'Parameter'", "'-'", "'.'", "'Frame'", "'price'", "'manufacturer'", "'frameType'", "'color'", "'Wheel'", "'InnerGear'", "'OuterGear'", "'Pedals'", "'pedalType'", "'Saddle'", "'saddleType'", "'HandBrakes'", "'HandleBars'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int RULE_ID=5;
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
    public static final int RULE_STRING=4;
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


        public InternalNowereBycicleDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalNowereBycicleDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalNowereBycicleDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalNowereBycicleDsl.g"; }


    	private NowereBycicleDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(NowereBycicleDslGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleBicycle"
    // InternalNowereBycicleDsl.g:53:1: entryRuleBicycle : ruleBicycle EOF ;
    public final void entryRuleBicycle() throws RecognitionException {
        try {
            // InternalNowereBycicleDsl.g:54:1: ( ruleBicycle EOF )
            // InternalNowereBycicleDsl.g:55:1: ruleBicycle EOF
            {
             before(grammarAccess.getBicycleRule()); 
            pushFollow(FOLLOW_1);
            ruleBicycle();

            state._fsp--;

             after(grammarAccess.getBicycleRule()); 
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
    // $ANTLR end "entryRuleBicycle"


    // $ANTLR start "ruleBicycle"
    // InternalNowereBycicleDsl.g:62:1: ruleBicycle : ( ( rule__Bicycle__Group__0 ) ) ;
    public final void ruleBicycle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:66:2: ( ( ( rule__Bicycle__Group__0 ) ) )
            // InternalNowereBycicleDsl.g:67:2: ( ( rule__Bicycle__Group__0 ) )
            {
            // InternalNowereBycicleDsl.g:67:2: ( ( rule__Bicycle__Group__0 ) )
            // InternalNowereBycicleDsl.g:68:3: ( rule__Bicycle__Group__0 )
            {
             before(grammarAccess.getBicycleAccess().getGroup()); 
            // InternalNowereBycicleDsl.g:69:3: ( rule__Bicycle__Group__0 )
            // InternalNowereBycicleDsl.g:69:4: rule__Bicycle__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Bicycle__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBicycleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBicycle"


    // $ANTLR start "entryRulePart"
    // InternalNowereBycicleDsl.g:78:1: entryRulePart : rulePart EOF ;
    public final void entryRulePart() throws RecognitionException {
        try {
            // InternalNowereBycicleDsl.g:79:1: ( rulePart EOF )
            // InternalNowereBycicleDsl.g:80:1: rulePart EOF
            {
             before(grammarAccess.getPartRule()); 
            pushFollow(FOLLOW_1);
            rulePart();

            state._fsp--;

             after(grammarAccess.getPartRule()); 
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
    // $ANTLR end "entryRulePart"


    // $ANTLR start "rulePart"
    // InternalNowereBycicleDsl.g:87:1: rulePart : ( ( rule__Part__Alternatives ) ) ;
    public final void rulePart() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:91:2: ( ( ( rule__Part__Alternatives ) ) )
            // InternalNowereBycicleDsl.g:92:2: ( ( rule__Part__Alternatives ) )
            {
            // InternalNowereBycicleDsl.g:92:2: ( ( rule__Part__Alternatives ) )
            // InternalNowereBycicleDsl.g:93:3: ( rule__Part__Alternatives )
            {
             before(grammarAccess.getPartAccess().getAlternatives()); 
            // InternalNowereBycicleDsl.g:94:3: ( rule__Part__Alternatives )
            // InternalNowereBycicleDsl.g:94:4: rule__Part__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Part__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPartAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePart"


    // $ANTLR start "entryRuleCustomerData"
    // InternalNowereBycicleDsl.g:103:1: entryRuleCustomerData : ruleCustomerData EOF ;
    public final void entryRuleCustomerData() throws RecognitionException {
        try {
            // InternalNowereBycicleDsl.g:104:1: ( ruleCustomerData EOF )
            // InternalNowereBycicleDsl.g:105:1: ruleCustomerData EOF
            {
             before(grammarAccess.getCustomerDataRule()); 
            pushFollow(FOLLOW_1);
            ruleCustomerData();

            state._fsp--;

             after(grammarAccess.getCustomerDataRule()); 
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
    // $ANTLR end "entryRuleCustomerData"


    // $ANTLR start "ruleCustomerData"
    // InternalNowereBycicleDsl.g:112:1: ruleCustomerData : ( ( rule__CustomerData__Group__0 ) ) ;
    public final void ruleCustomerData() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:116:2: ( ( ( rule__CustomerData__Group__0 ) ) )
            // InternalNowereBycicleDsl.g:117:2: ( ( rule__CustomerData__Group__0 ) )
            {
            // InternalNowereBycicleDsl.g:117:2: ( ( rule__CustomerData__Group__0 ) )
            // InternalNowereBycicleDsl.g:118:3: ( rule__CustomerData__Group__0 )
            {
             before(grammarAccess.getCustomerDataAccess().getGroup()); 
            // InternalNowereBycicleDsl.g:119:3: ( rule__CustomerData__Group__0 )
            // InternalNowereBycicleDsl.g:119:4: rule__CustomerData__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CustomerData__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCustomerDataAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCustomerData"


    // $ANTLR start "entryRuleParameter"
    // InternalNowereBycicleDsl.g:128:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalNowereBycicleDsl.g:129:1: ( ruleParameter EOF )
            // InternalNowereBycicleDsl.g:130:1: ruleParameter EOF
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
    // InternalNowereBycicleDsl.g:137:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:141:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalNowereBycicleDsl.g:142:2: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalNowereBycicleDsl.g:142:2: ( ( rule__Parameter__Group__0 ) )
            // InternalNowereBycicleDsl.g:143:3: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // InternalNowereBycicleDsl.g:144:3: ( rule__Parameter__Group__0 )
            // InternalNowereBycicleDsl.g:144:4: rule__Parameter__Group__0
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


    // $ANTLR start "entryRuleEDouble"
    // InternalNowereBycicleDsl.g:153:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // InternalNowereBycicleDsl.g:154:1: ( ruleEDouble EOF )
            // InternalNowereBycicleDsl.g:155:1: ruleEDouble EOF
            {
             before(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getEDoubleRule()); 
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
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalNowereBycicleDsl.g:162:1: ruleEDouble : ( ( rule__EDouble__Group__0 ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:166:2: ( ( ( rule__EDouble__Group__0 ) ) )
            // InternalNowereBycicleDsl.g:167:2: ( ( rule__EDouble__Group__0 ) )
            {
            // InternalNowereBycicleDsl.g:167:2: ( ( rule__EDouble__Group__0 ) )
            // InternalNowereBycicleDsl.g:168:3: ( rule__EDouble__Group__0 )
            {
             before(grammarAccess.getEDoubleAccess().getGroup()); 
            // InternalNowereBycicleDsl.g:169:3: ( rule__EDouble__Group__0 )
            // InternalNowereBycicleDsl.g:169:4: rule__EDouble__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRuleEString"
    // InternalNowereBycicleDsl.g:178:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalNowereBycicleDsl.g:179:1: ( ruleEString EOF )
            // InternalNowereBycicleDsl.g:180:1: ruleEString EOF
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
    // InternalNowereBycicleDsl.g:187:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:191:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalNowereBycicleDsl.g:192:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalNowereBycicleDsl.g:192:2: ( ( rule__EString__Alternatives ) )
            // InternalNowereBycicleDsl.g:193:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalNowereBycicleDsl.g:194:3: ( rule__EString__Alternatives )
            // InternalNowereBycicleDsl.g:194:4: rule__EString__Alternatives
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


    // $ANTLR start "entryRuleFrame"
    // InternalNowereBycicleDsl.g:203:1: entryRuleFrame : ruleFrame EOF ;
    public final void entryRuleFrame() throws RecognitionException {
        try {
            // InternalNowereBycicleDsl.g:204:1: ( ruleFrame EOF )
            // InternalNowereBycicleDsl.g:205:1: ruleFrame EOF
            {
             before(grammarAccess.getFrameRule()); 
            pushFollow(FOLLOW_1);
            ruleFrame();

            state._fsp--;

             after(grammarAccess.getFrameRule()); 
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
    // $ANTLR end "entryRuleFrame"


    // $ANTLR start "ruleFrame"
    // InternalNowereBycicleDsl.g:212:1: ruleFrame : ( ( rule__Frame__Group__0 ) ) ;
    public final void ruleFrame() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:216:2: ( ( ( rule__Frame__Group__0 ) ) )
            // InternalNowereBycicleDsl.g:217:2: ( ( rule__Frame__Group__0 ) )
            {
            // InternalNowereBycicleDsl.g:217:2: ( ( rule__Frame__Group__0 ) )
            // InternalNowereBycicleDsl.g:218:3: ( rule__Frame__Group__0 )
            {
             before(grammarAccess.getFrameAccess().getGroup()); 
            // InternalNowereBycicleDsl.g:219:3: ( rule__Frame__Group__0 )
            // InternalNowereBycicleDsl.g:219:4: rule__Frame__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Frame__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFrameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFrame"


    // $ANTLR start "entryRuleWheel"
    // InternalNowereBycicleDsl.g:228:1: entryRuleWheel : ruleWheel EOF ;
    public final void entryRuleWheel() throws RecognitionException {
        try {
            // InternalNowereBycicleDsl.g:229:1: ( ruleWheel EOF )
            // InternalNowereBycicleDsl.g:230:1: ruleWheel EOF
            {
             before(grammarAccess.getWheelRule()); 
            pushFollow(FOLLOW_1);
            ruleWheel();

            state._fsp--;

             after(grammarAccess.getWheelRule()); 
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
    // $ANTLR end "entryRuleWheel"


    // $ANTLR start "ruleWheel"
    // InternalNowereBycicleDsl.g:237:1: ruleWheel : ( ( rule__Wheel__Group__0 ) ) ;
    public final void ruleWheel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:241:2: ( ( ( rule__Wheel__Group__0 ) ) )
            // InternalNowereBycicleDsl.g:242:2: ( ( rule__Wheel__Group__0 ) )
            {
            // InternalNowereBycicleDsl.g:242:2: ( ( rule__Wheel__Group__0 ) )
            // InternalNowereBycicleDsl.g:243:3: ( rule__Wheel__Group__0 )
            {
             before(grammarAccess.getWheelAccess().getGroup()); 
            // InternalNowereBycicleDsl.g:244:3: ( rule__Wheel__Group__0 )
            // InternalNowereBycicleDsl.g:244:4: rule__Wheel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Wheel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWheelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWheel"


    // $ANTLR start "entryRuleInnerGear"
    // InternalNowereBycicleDsl.g:253:1: entryRuleInnerGear : ruleInnerGear EOF ;
    public final void entryRuleInnerGear() throws RecognitionException {
        try {
            // InternalNowereBycicleDsl.g:254:1: ( ruleInnerGear EOF )
            // InternalNowereBycicleDsl.g:255:1: ruleInnerGear EOF
            {
             before(grammarAccess.getInnerGearRule()); 
            pushFollow(FOLLOW_1);
            ruleInnerGear();

            state._fsp--;

             after(grammarAccess.getInnerGearRule()); 
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
    // $ANTLR end "entryRuleInnerGear"


    // $ANTLR start "ruleInnerGear"
    // InternalNowereBycicleDsl.g:262:1: ruleInnerGear : ( ( rule__InnerGear__Group__0 ) ) ;
    public final void ruleInnerGear() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:266:2: ( ( ( rule__InnerGear__Group__0 ) ) )
            // InternalNowereBycicleDsl.g:267:2: ( ( rule__InnerGear__Group__0 ) )
            {
            // InternalNowereBycicleDsl.g:267:2: ( ( rule__InnerGear__Group__0 ) )
            // InternalNowereBycicleDsl.g:268:3: ( rule__InnerGear__Group__0 )
            {
             before(grammarAccess.getInnerGearAccess().getGroup()); 
            // InternalNowereBycicleDsl.g:269:3: ( rule__InnerGear__Group__0 )
            // InternalNowereBycicleDsl.g:269:4: rule__InnerGear__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InnerGear__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInnerGearAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInnerGear"


    // $ANTLR start "entryRuleOuterGear"
    // InternalNowereBycicleDsl.g:278:1: entryRuleOuterGear : ruleOuterGear EOF ;
    public final void entryRuleOuterGear() throws RecognitionException {
        try {
            // InternalNowereBycicleDsl.g:279:1: ( ruleOuterGear EOF )
            // InternalNowereBycicleDsl.g:280:1: ruleOuterGear EOF
            {
             before(grammarAccess.getOuterGearRule()); 
            pushFollow(FOLLOW_1);
            ruleOuterGear();

            state._fsp--;

             after(grammarAccess.getOuterGearRule()); 
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
    // $ANTLR end "entryRuleOuterGear"


    // $ANTLR start "ruleOuterGear"
    // InternalNowereBycicleDsl.g:287:1: ruleOuterGear : ( ( rule__OuterGear__Group__0 ) ) ;
    public final void ruleOuterGear() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:291:2: ( ( ( rule__OuterGear__Group__0 ) ) )
            // InternalNowereBycicleDsl.g:292:2: ( ( rule__OuterGear__Group__0 ) )
            {
            // InternalNowereBycicleDsl.g:292:2: ( ( rule__OuterGear__Group__0 ) )
            // InternalNowereBycicleDsl.g:293:3: ( rule__OuterGear__Group__0 )
            {
             before(grammarAccess.getOuterGearAccess().getGroup()); 
            // InternalNowereBycicleDsl.g:294:3: ( rule__OuterGear__Group__0 )
            // InternalNowereBycicleDsl.g:294:4: rule__OuterGear__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OuterGear__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOuterGearAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOuterGear"


    // $ANTLR start "entryRulePedals"
    // InternalNowereBycicleDsl.g:303:1: entryRulePedals : rulePedals EOF ;
    public final void entryRulePedals() throws RecognitionException {
        try {
            // InternalNowereBycicleDsl.g:304:1: ( rulePedals EOF )
            // InternalNowereBycicleDsl.g:305:1: rulePedals EOF
            {
             before(grammarAccess.getPedalsRule()); 
            pushFollow(FOLLOW_1);
            rulePedals();

            state._fsp--;

             after(grammarAccess.getPedalsRule()); 
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
    // $ANTLR end "entryRulePedals"


    // $ANTLR start "rulePedals"
    // InternalNowereBycicleDsl.g:312:1: rulePedals : ( ( rule__Pedals__Group__0 ) ) ;
    public final void rulePedals() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:316:2: ( ( ( rule__Pedals__Group__0 ) ) )
            // InternalNowereBycicleDsl.g:317:2: ( ( rule__Pedals__Group__0 ) )
            {
            // InternalNowereBycicleDsl.g:317:2: ( ( rule__Pedals__Group__0 ) )
            // InternalNowereBycicleDsl.g:318:3: ( rule__Pedals__Group__0 )
            {
             before(grammarAccess.getPedalsAccess().getGroup()); 
            // InternalNowereBycicleDsl.g:319:3: ( rule__Pedals__Group__0 )
            // InternalNowereBycicleDsl.g:319:4: rule__Pedals__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Pedals__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPedalsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePedals"


    // $ANTLR start "entryRuleSaddle"
    // InternalNowereBycicleDsl.g:328:1: entryRuleSaddle : ruleSaddle EOF ;
    public final void entryRuleSaddle() throws RecognitionException {
        try {
            // InternalNowereBycicleDsl.g:329:1: ( ruleSaddle EOF )
            // InternalNowereBycicleDsl.g:330:1: ruleSaddle EOF
            {
             before(grammarAccess.getSaddleRule()); 
            pushFollow(FOLLOW_1);
            ruleSaddle();

            state._fsp--;

             after(grammarAccess.getSaddleRule()); 
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
    // $ANTLR end "entryRuleSaddle"


    // $ANTLR start "ruleSaddle"
    // InternalNowereBycicleDsl.g:337:1: ruleSaddle : ( ( rule__Saddle__Group__0 ) ) ;
    public final void ruleSaddle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:341:2: ( ( ( rule__Saddle__Group__0 ) ) )
            // InternalNowereBycicleDsl.g:342:2: ( ( rule__Saddle__Group__0 ) )
            {
            // InternalNowereBycicleDsl.g:342:2: ( ( rule__Saddle__Group__0 ) )
            // InternalNowereBycicleDsl.g:343:3: ( rule__Saddle__Group__0 )
            {
             before(grammarAccess.getSaddleAccess().getGroup()); 
            // InternalNowereBycicleDsl.g:344:3: ( rule__Saddle__Group__0 )
            // InternalNowereBycicleDsl.g:344:4: rule__Saddle__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Saddle__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSaddleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSaddle"


    // $ANTLR start "entryRuleHandBrakes"
    // InternalNowereBycicleDsl.g:353:1: entryRuleHandBrakes : ruleHandBrakes EOF ;
    public final void entryRuleHandBrakes() throws RecognitionException {
        try {
            // InternalNowereBycicleDsl.g:354:1: ( ruleHandBrakes EOF )
            // InternalNowereBycicleDsl.g:355:1: ruleHandBrakes EOF
            {
             before(grammarAccess.getHandBrakesRule()); 
            pushFollow(FOLLOW_1);
            ruleHandBrakes();

            state._fsp--;

             after(grammarAccess.getHandBrakesRule()); 
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
    // $ANTLR end "entryRuleHandBrakes"


    // $ANTLR start "ruleHandBrakes"
    // InternalNowereBycicleDsl.g:362:1: ruleHandBrakes : ( ( rule__HandBrakes__Group__0 ) ) ;
    public final void ruleHandBrakes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:366:2: ( ( ( rule__HandBrakes__Group__0 ) ) )
            // InternalNowereBycicleDsl.g:367:2: ( ( rule__HandBrakes__Group__0 ) )
            {
            // InternalNowereBycicleDsl.g:367:2: ( ( rule__HandBrakes__Group__0 ) )
            // InternalNowereBycicleDsl.g:368:3: ( rule__HandBrakes__Group__0 )
            {
             before(grammarAccess.getHandBrakesAccess().getGroup()); 
            // InternalNowereBycicleDsl.g:369:3: ( rule__HandBrakes__Group__0 )
            // InternalNowereBycicleDsl.g:369:4: rule__HandBrakes__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__HandBrakes__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHandBrakesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHandBrakes"


    // $ANTLR start "entryRuleHandleBars"
    // InternalNowereBycicleDsl.g:378:1: entryRuleHandleBars : ruleHandleBars EOF ;
    public final void entryRuleHandleBars() throws RecognitionException {
        try {
            // InternalNowereBycicleDsl.g:379:1: ( ruleHandleBars EOF )
            // InternalNowereBycicleDsl.g:380:1: ruleHandleBars EOF
            {
             before(grammarAccess.getHandleBarsRule()); 
            pushFollow(FOLLOW_1);
            ruleHandleBars();

            state._fsp--;

             after(grammarAccess.getHandleBarsRule()); 
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
    // $ANTLR end "entryRuleHandleBars"


    // $ANTLR start "ruleHandleBars"
    // InternalNowereBycicleDsl.g:387:1: ruleHandleBars : ( ( rule__HandleBars__Group__0 ) ) ;
    public final void ruleHandleBars() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:391:2: ( ( ( rule__HandleBars__Group__0 ) ) )
            // InternalNowereBycicleDsl.g:392:2: ( ( rule__HandleBars__Group__0 ) )
            {
            // InternalNowereBycicleDsl.g:392:2: ( ( rule__HandleBars__Group__0 ) )
            // InternalNowereBycicleDsl.g:393:3: ( rule__HandleBars__Group__0 )
            {
             before(grammarAccess.getHandleBarsAccess().getGroup()); 
            // InternalNowereBycicleDsl.g:394:3: ( rule__HandleBars__Group__0 )
            // InternalNowereBycicleDsl.g:394:4: rule__HandleBars__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__HandleBars__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHandleBarsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHandleBars"


    // $ANTLR start "ruleManufacturers"
    // InternalNowereBycicleDsl.g:403:1: ruleManufacturers : ( ( rule__Manufacturers__Alternatives ) ) ;
    public final void ruleManufacturers() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:407:1: ( ( ( rule__Manufacturers__Alternatives ) ) )
            // InternalNowereBycicleDsl.g:408:2: ( ( rule__Manufacturers__Alternatives ) )
            {
            // InternalNowereBycicleDsl.g:408:2: ( ( rule__Manufacturers__Alternatives ) )
            // InternalNowereBycicleDsl.g:409:3: ( rule__Manufacturers__Alternatives )
            {
             before(grammarAccess.getManufacturersAccess().getAlternatives()); 
            // InternalNowereBycicleDsl.g:410:3: ( rule__Manufacturers__Alternatives )
            // InternalNowereBycicleDsl.g:410:4: rule__Manufacturers__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Manufacturers__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getManufacturersAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleManufacturers"


    // $ANTLR start "ruleFrameType"
    // InternalNowereBycicleDsl.g:419:1: ruleFrameType : ( ( rule__FrameType__Alternatives ) ) ;
    public final void ruleFrameType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:423:1: ( ( ( rule__FrameType__Alternatives ) ) )
            // InternalNowereBycicleDsl.g:424:2: ( ( rule__FrameType__Alternatives ) )
            {
            // InternalNowereBycicleDsl.g:424:2: ( ( rule__FrameType__Alternatives ) )
            // InternalNowereBycicleDsl.g:425:3: ( rule__FrameType__Alternatives )
            {
             before(grammarAccess.getFrameTypeAccess().getAlternatives()); 
            // InternalNowereBycicleDsl.g:426:3: ( rule__FrameType__Alternatives )
            // InternalNowereBycicleDsl.g:426:4: rule__FrameType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FrameType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFrameTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFrameType"


    // $ANTLR start "ruleColor"
    // InternalNowereBycicleDsl.g:435:1: ruleColor : ( ( rule__Color__Alternatives ) ) ;
    public final void ruleColor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:439:1: ( ( ( rule__Color__Alternatives ) ) )
            // InternalNowereBycicleDsl.g:440:2: ( ( rule__Color__Alternatives ) )
            {
            // InternalNowereBycicleDsl.g:440:2: ( ( rule__Color__Alternatives ) )
            // InternalNowereBycicleDsl.g:441:3: ( rule__Color__Alternatives )
            {
             before(grammarAccess.getColorAccess().getAlternatives()); 
            // InternalNowereBycicleDsl.g:442:3: ( rule__Color__Alternatives )
            // InternalNowereBycicleDsl.g:442:4: rule__Color__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Color__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getColorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColor"


    // $ANTLR start "rulePedalTypes"
    // InternalNowereBycicleDsl.g:451:1: rulePedalTypes : ( ( rule__PedalTypes__Alternatives ) ) ;
    public final void rulePedalTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:455:1: ( ( ( rule__PedalTypes__Alternatives ) ) )
            // InternalNowereBycicleDsl.g:456:2: ( ( rule__PedalTypes__Alternatives ) )
            {
            // InternalNowereBycicleDsl.g:456:2: ( ( rule__PedalTypes__Alternatives ) )
            // InternalNowereBycicleDsl.g:457:3: ( rule__PedalTypes__Alternatives )
            {
             before(grammarAccess.getPedalTypesAccess().getAlternatives()); 
            // InternalNowereBycicleDsl.g:458:3: ( rule__PedalTypes__Alternatives )
            // InternalNowereBycicleDsl.g:458:4: rule__PedalTypes__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PedalTypes__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPedalTypesAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePedalTypes"


    // $ANTLR start "ruleSaddleType"
    // InternalNowereBycicleDsl.g:467:1: ruleSaddleType : ( ( rule__SaddleType__Alternatives ) ) ;
    public final void ruleSaddleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:471:1: ( ( ( rule__SaddleType__Alternatives ) ) )
            // InternalNowereBycicleDsl.g:472:2: ( ( rule__SaddleType__Alternatives ) )
            {
            // InternalNowereBycicleDsl.g:472:2: ( ( rule__SaddleType__Alternatives ) )
            // InternalNowereBycicleDsl.g:473:3: ( rule__SaddleType__Alternatives )
            {
             before(grammarAccess.getSaddleTypeAccess().getAlternatives()); 
            // InternalNowereBycicleDsl.g:474:3: ( rule__SaddleType__Alternatives )
            // InternalNowereBycicleDsl.g:474:4: rule__SaddleType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SaddleType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSaddleTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSaddleType"


    // $ANTLR start "rule__Part__Alternatives"
    // InternalNowereBycicleDsl.g:482:1: rule__Part__Alternatives : ( ( ruleFrame ) | ( ruleWheel ) | ( ruleInnerGear ) | ( ruleOuterGear ) | ( rulePedals ) | ( ruleSaddle ) | ( ruleHandBrakes ) | ( ruleHandleBars ) );
    public final void rule__Part__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:486:1: ( ( ruleFrame ) | ( ruleWheel ) | ( ruleInnerGear ) | ( ruleOuterGear ) | ( rulePedals ) | ( ruleSaddle ) | ( ruleHandBrakes ) | ( ruleHandleBars ) )
            int alt1=8;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt1=1;
                }
                break;
            case 43:
                {
                alt1=2;
                }
                break;
            case 44:
                {
                alt1=3;
                }
                break;
            case 45:
                {
                alt1=4;
                }
                break;
            case 46:
                {
                alt1=5;
                }
                break;
            case 48:
                {
                alt1=6;
                }
                break;
            case 50:
                {
                alt1=7;
                }
                break;
            case 51:
                {
                alt1=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalNowereBycicleDsl.g:487:2: ( ruleFrame )
                    {
                    // InternalNowereBycicleDsl.g:487:2: ( ruleFrame )
                    // InternalNowereBycicleDsl.g:488:3: ruleFrame
                    {
                     before(grammarAccess.getPartAccess().getFrameParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleFrame();

                    state._fsp--;

                     after(grammarAccess.getPartAccess().getFrameParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalNowereBycicleDsl.g:493:2: ( ruleWheel )
                    {
                    // InternalNowereBycicleDsl.g:493:2: ( ruleWheel )
                    // InternalNowereBycicleDsl.g:494:3: ruleWheel
                    {
                     before(grammarAccess.getPartAccess().getWheelParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleWheel();

                    state._fsp--;

                     after(grammarAccess.getPartAccess().getWheelParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalNowereBycicleDsl.g:499:2: ( ruleInnerGear )
                    {
                    // InternalNowereBycicleDsl.g:499:2: ( ruleInnerGear )
                    // InternalNowereBycicleDsl.g:500:3: ruleInnerGear
                    {
                     before(grammarAccess.getPartAccess().getInnerGearParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleInnerGear();

                    state._fsp--;

                     after(grammarAccess.getPartAccess().getInnerGearParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalNowereBycicleDsl.g:505:2: ( ruleOuterGear )
                    {
                    // InternalNowereBycicleDsl.g:505:2: ( ruleOuterGear )
                    // InternalNowereBycicleDsl.g:506:3: ruleOuterGear
                    {
                     before(grammarAccess.getPartAccess().getOuterGearParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleOuterGear();

                    state._fsp--;

                     after(grammarAccess.getPartAccess().getOuterGearParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalNowereBycicleDsl.g:511:2: ( rulePedals )
                    {
                    // InternalNowereBycicleDsl.g:511:2: ( rulePedals )
                    // InternalNowereBycicleDsl.g:512:3: rulePedals
                    {
                     before(grammarAccess.getPartAccess().getPedalsParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    rulePedals();

                    state._fsp--;

                     after(grammarAccess.getPartAccess().getPedalsParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalNowereBycicleDsl.g:517:2: ( ruleSaddle )
                    {
                    // InternalNowereBycicleDsl.g:517:2: ( ruleSaddle )
                    // InternalNowereBycicleDsl.g:518:3: ruleSaddle
                    {
                     before(grammarAccess.getPartAccess().getSaddleParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleSaddle();

                    state._fsp--;

                     after(grammarAccess.getPartAccess().getSaddleParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalNowereBycicleDsl.g:523:2: ( ruleHandBrakes )
                    {
                    // InternalNowereBycicleDsl.g:523:2: ( ruleHandBrakes )
                    // InternalNowereBycicleDsl.g:524:3: ruleHandBrakes
                    {
                     before(grammarAccess.getPartAccess().getHandBrakesParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleHandBrakes();

                    state._fsp--;

                     after(grammarAccess.getPartAccess().getHandBrakesParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalNowereBycicleDsl.g:529:2: ( ruleHandleBars )
                    {
                    // InternalNowereBycicleDsl.g:529:2: ( ruleHandleBars )
                    // InternalNowereBycicleDsl.g:530:3: ruleHandleBars
                    {
                     before(grammarAccess.getPartAccess().getHandleBarsParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleHandleBars();

                    state._fsp--;

                     after(grammarAccess.getPartAccess().getHandleBarsParserRuleCall_7()); 

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
    // $ANTLR end "rule__Part__Alternatives"


    // $ANTLR start "rule__EDouble__Alternatives_4_0"
    // InternalNowereBycicleDsl.g:539:1: rule__EDouble__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EDouble__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:543:1: ( ( 'E' ) | ( 'e' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalNowereBycicleDsl.g:544:2: ( 'E' )
                    {
                    // InternalNowereBycicleDsl.g:544:2: ( 'E' )
                    // InternalNowereBycicleDsl.g:545:3: 'E'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalNowereBycicleDsl.g:550:2: ( 'e' )
                    {
                    // InternalNowereBycicleDsl.g:550:2: ( 'e' )
                    // InternalNowereBycicleDsl.g:551:3: 'e'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 

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
    // $ANTLR end "rule__EDouble__Alternatives_4_0"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalNowereBycicleDsl.g:560:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:564:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalNowereBycicleDsl.g:565:2: ( RULE_STRING )
                    {
                    // InternalNowereBycicleDsl.g:565:2: ( RULE_STRING )
                    // InternalNowereBycicleDsl.g:566:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalNowereBycicleDsl.g:571:2: ( RULE_ID )
                    {
                    // InternalNowereBycicleDsl.g:571:2: ( RULE_ID )
                    // InternalNowereBycicleDsl.g:572:3: RULE_ID
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


    // $ANTLR start "rule__Manufacturers__Alternatives"
    // InternalNowereBycicleDsl.g:581:1: rule__Manufacturers__Alternatives : ( ( ( 'SuperParts' ) ) | ( ( 'HomeParts' ) ) | ( ( 'HandMadeParts' ) ) );
    public final void rule__Manufacturers__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:585:1: ( ( ( 'SuperParts' ) ) | ( ( 'HomeParts' ) ) | ( ( 'HandMadeParts' ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt4=1;
                }
                break;
            case 14:
                {
                alt4=2;
                }
                break;
            case 15:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalNowereBycicleDsl.g:586:2: ( ( 'SuperParts' ) )
                    {
                    // InternalNowereBycicleDsl.g:586:2: ( ( 'SuperParts' ) )
                    // InternalNowereBycicleDsl.g:587:3: ( 'SuperParts' )
                    {
                     before(grammarAccess.getManufacturersAccess().getSuperPartsEnumLiteralDeclaration_0()); 
                    // InternalNowereBycicleDsl.g:588:3: ( 'SuperParts' )
                    // InternalNowereBycicleDsl.g:588:4: 'SuperParts'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getManufacturersAccess().getSuperPartsEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalNowereBycicleDsl.g:592:2: ( ( 'HomeParts' ) )
                    {
                    // InternalNowereBycicleDsl.g:592:2: ( ( 'HomeParts' ) )
                    // InternalNowereBycicleDsl.g:593:3: ( 'HomeParts' )
                    {
                     before(grammarAccess.getManufacturersAccess().getHomePartsEnumLiteralDeclaration_1()); 
                    // InternalNowereBycicleDsl.g:594:3: ( 'HomeParts' )
                    // InternalNowereBycicleDsl.g:594:4: 'HomeParts'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getManufacturersAccess().getHomePartsEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalNowereBycicleDsl.g:598:2: ( ( 'HandMadeParts' ) )
                    {
                    // InternalNowereBycicleDsl.g:598:2: ( ( 'HandMadeParts' ) )
                    // InternalNowereBycicleDsl.g:599:3: ( 'HandMadeParts' )
                    {
                     before(grammarAccess.getManufacturersAccess().getHandMadePartsEnumLiteralDeclaration_2()); 
                    // InternalNowereBycicleDsl.g:600:3: ( 'HandMadeParts' )
                    // InternalNowereBycicleDsl.g:600:4: 'HandMadeParts'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getManufacturersAccess().getHandMadePartsEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__Manufacturers__Alternatives"


    // $ANTLR start "rule__FrameType__Alternatives"
    // InternalNowereBycicleDsl.g:608:1: rule__FrameType__Alternatives : ( ( ( 'RacerFrame' ) ) | ( ( 'CityFrame' ) ) | ( ( 'UnicycleFrame' ) ) );
    public final void rule__FrameType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:612:1: ( ( ( 'RacerFrame' ) ) | ( ( 'CityFrame' ) ) | ( ( 'UnicycleFrame' ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt5=1;
                }
                break;
            case 17:
                {
                alt5=2;
                }
                break;
            case 18:
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
                    // InternalNowereBycicleDsl.g:613:2: ( ( 'RacerFrame' ) )
                    {
                    // InternalNowereBycicleDsl.g:613:2: ( ( 'RacerFrame' ) )
                    // InternalNowereBycicleDsl.g:614:3: ( 'RacerFrame' )
                    {
                     before(grammarAccess.getFrameTypeAccess().getRacerFrameEnumLiteralDeclaration_0()); 
                    // InternalNowereBycicleDsl.g:615:3: ( 'RacerFrame' )
                    // InternalNowereBycicleDsl.g:615:4: 'RacerFrame'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getFrameTypeAccess().getRacerFrameEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalNowereBycicleDsl.g:619:2: ( ( 'CityFrame' ) )
                    {
                    // InternalNowereBycicleDsl.g:619:2: ( ( 'CityFrame' ) )
                    // InternalNowereBycicleDsl.g:620:3: ( 'CityFrame' )
                    {
                     before(grammarAccess.getFrameTypeAccess().getCityFrameEnumLiteralDeclaration_1()); 
                    // InternalNowereBycicleDsl.g:621:3: ( 'CityFrame' )
                    // InternalNowereBycicleDsl.g:621:4: 'CityFrame'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getFrameTypeAccess().getCityFrameEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalNowereBycicleDsl.g:625:2: ( ( 'UnicycleFrame' ) )
                    {
                    // InternalNowereBycicleDsl.g:625:2: ( ( 'UnicycleFrame' ) )
                    // InternalNowereBycicleDsl.g:626:3: ( 'UnicycleFrame' )
                    {
                     before(grammarAccess.getFrameTypeAccess().getUnicycleFrameEnumLiteralDeclaration_2()); 
                    // InternalNowereBycicleDsl.g:627:3: ( 'UnicycleFrame' )
                    // InternalNowereBycicleDsl.g:627:4: 'UnicycleFrame'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getFrameTypeAccess().getUnicycleFrameEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__FrameType__Alternatives"


    // $ANTLR start "rule__Color__Alternatives"
    // InternalNowereBycicleDsl.g:635:1: rule__Color__Alternatives : ( ( ( 'Red' ) ) | ( ( 'Blue' ) ) | ( ( 'Black' ) ) | ( ( 'Green' ) ) );
    public final void rule__Color__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:639:1: ( ( ( 'Red' ) ) | ( ( 'Blue' ) ) | ( ( 'Black' ) ) | ( ( 'Green' ) ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt6=1;
                }
                break;
            case 20:
                {
                alt6=2;
                }
                break;
            case 21:
                {
                alt6=3;
                }
                break;
            case 22:
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
                    // InternalNowereBycicleDsl.g:640:2: ( ( 'Red' ) )
                    {
                    // InternalNowereBycicleDsl.g:640:2: ( ( 'Red' ) )
                    // InternalNowereBycicleDsl.g:641:3: ( 'Red' )
                    {
                     before(grammarAccess.getColorAccess().getRedEnumLiteralDeclaration_0()); 
                    // InternalNowereBycicleDsl.g:642:3: ( 'Red' )
                    // InternalNowereBycicleDsl.g:642:4: 'Red'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorAccess().getRedEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalNowereBycicleDsl.g:646:2: ( ( 'Blue' ) )
                    {
                    // InternalNowereBycicleDsl.g:646:2: ( ( 'Blue' ) )
                    // InternalNowereBycicleDsl.g:647:3: ( 'Blue' )
                    {
                     before(grammarAccess.getColorAccess().getBlueEnumLiteralDeclaration_1()); 
                    // InternalNowereBycicleDsl.g:648:3: ( 'Blue' )
                    // InternalNowereBycicleDsl.g:648:4: 'Blue'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorAccess().getBlueEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalNowereBycicleDsl.g:652:2: ( ( 'Black' ) )
                    {
                    // InternalNowereBycicleDsl.g:652:2: ( ( 'Black' ) )
                    // InternalNowereBycicleDsl.g:653:3: ( 'Black' )
                    {
                     before(grammarAccess.getColorAccess().getBlackEnumLiteralDeclaration_2()); 
                    // InternalNowereBycicleDsl.g:654:3: ( 'Black' )
                    // InternalNowereBycicleDsl.g:654:4: 'Black'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorAccess().getBlackEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalNowereBycicleDsl.g:658:2: ( ( 'Green' ) )
                    {
                    // InternalNowereBycicleDsl.g:658:2: ( ( 'Green' ) )
                    // InternalNowereBycicleDsl.g:659:3: ( 'Green' )
                    {
                     before(grammarAccess.getColorAccess().getGreenEnumLiteralDeclaration_3()); 
                    // InternalNowereBycicleDsl.g:660:3: ( 'Green' )
                    // InternalNowereBycicleDsl.g:660:4: 'Green'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorAccess().getGreenEnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__Color__Alternatives"


    // $ANTLR start "rule__PedalTypes__Alternatives"
    // InternalNowereBycicleDsl.g:668:1: rule__PedalTypes__Alternatives : ( ( ( 'ChildPedals' ) ) | ( ( 'SportsPedals' ) ) | ( ( 'ComfortPedals' ) ) | ( ( 'ExtremePedals' ) ) );
    public final void rule__PedalTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:672:1: ( ( ( 'ChildPedals' ) ) | ( ( 'SportsPedals' ) ) | ( ( 'ComfortPedals' ) ) | ( ( 'ExtremePedals' ) ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt7=1;
                }
                break;
            case 24:
                {
                alt7=2;
                }
                break;
            case 25:
                {
                alt7=3;
                }
                break;
            case 26:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalNowereBycicleDsl.g:673:2: ( ( 'ChildPedals' ) )
                    {
                    // InternalNowereBycicleDsl.g:673:2: ( ( 'ChildPedals' ) )
                    // InternalNowereBycicleDsl.g:674:3: ( 'ChildPedals' )
                    {
                     before(grammarAccess.getPedalTypesAccess().getChildPedalsEnumLiteralDeclaration_0()); 
                    // InternalNowereBycicleDsl.g:675:3: ( 'ChildPedals' )
                    // InternalNowereBycicleDsl.g:675:4: 'ChildPedals'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getPedalTypesAccess().getChildPedalsEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalNowereBycicleDsl.g:679:2: ( ( 'SportsPedals' ) )
                    {
                    // InternalNowereBycicleDsl.g:679:2: ( ( 'SportsPedals' ) )
                    // InternalNowereBycicleDsl.g:680:3: ( 'SportsPedals' )
                    {
                     before(grammarAccess.getPedalTypesAccess().getSportsPedalsEnumLiteralDeclaration_1()); 
                    // InternalNowereBycicleDsl.g:681:3: ( 'SportsPedals' )
                    // InternalNowereBycicleDsl.g:681:4: 'SportsPedals'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getPedalTypesAccess().getSportsPedalsEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalNowereBycicleDsl.g:685:2: ( ( 'ComfortPedals' ) )
                    {
                    // InternalNowereBycicleDsl.g:685:2: ( ( 'ComfortPedals' ) )
                    // InternalNowereBycicleDsl.g:686:3: ( 'ComfortPedals' )
                    {
                     before(grammarAccess.getPedalTypesAccess().getComfortPedalsEnumLiteralDeclaration_2()); 
                    // InternalNowereBycicleDsl.g:687:3: ( 'ComfortPedals' )
                    // InternalNowereBycicleDsl.g:687:4: 'ComfortPedals'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getPedalTypesAccess().getComfortPedalsEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalNowereBycicleDsl.g:691:2: ( ( 'ExtremePedals' ) )
                    {
                    // InternalNowereBycicleDsl.g:691:2: ( ( 'ExtremePedals' ) )
                    // InternalNowereBycicleDsl.g:692:3: ( 'ExtremePedals' )
                    {
                     before(grammarAccess.getPedalTypesAccess().getExtremePedalsEnumLiteralDeclaration_3()); 
                    // InternalNowereBycicleDsl.g:693:3: ( 'ExtremePedals' )
                    // InternalNowereBycicleDsl.g:693:4: 'ExtremePedals'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getPedalTypesAccess().getExtremePedalsEnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__PedalTypes__Alternatives"


    // $ANTLR start "rule__SaddleType__Alternatives"
    // InternalNowereBycicleDsl.g:701:1: rule__SaddleType__Alternatives : ( ( ( 'RacingSaddle' ) ) | ( ( 'ChildSaddle' ) ) | ( ( 'SpecialUnicycleSaddle' ) ) | ( ( 'ComfortSaddle' ) ) );
    public final void rule__SaddleType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:705:1: ( ( ( 'RacingSaddle' ) ) | ( ( 'ChildSaddle' ) ) | ( ( 'SpecialUnicycleSaddle' ) ) | ( ( 'ComfortSaddle' ) ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 27:
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
                    // InternalNowereBycicleDsl.g:706:2: ( ( 'RacingSaddle' ) )
                    {
                    // InternalNowereBycicleDsl.g:706:2: ( ( 'RacingSaddle' ) )
                    // InternalNowereBycicleDsl.g:707:3: ( 'RacingSaddle' )
                    {
                     before(grammarAccess.getSaddleTypeAccess().getRacingSaddleEnumLiteralDeclaration_0()); 
                    // InternalNowereBycicleDsl.g:708:3: ( 'RacingSaddle' )
                    // InternalNowereBycicleDsl.g:708:4: 'RacingSaddle'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getSaddleTypeAccess().getRacingSaddleEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalNowereBycicleDsl.g:712:2: ( ( 'ChildSaddle' ) )
                    {
                    // InternalNowereBycicleDsl.g:712:2: ( ( 'ChildSaddle' ) )
                    // InternalNowereBycicleDsl.g:713:3: ( 'ChildSaddle' )
                    {
                     before(grammarAccess.getSaddleTypeAccess().getChildSaddleEnumLiteralDeclaration_1()); 
                    // InternalNowereBycicleDsl.g:714:3: ( 'ChildSaddle' )
                    // InternalNowereBycicleDsl.g:714:4: 'ChildSaddle'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getSaddleTypeAccess().getChildSaddleEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalNowereBycicleDsl.g:718:2: ( ( 'SpecialUnicycleSaddle' ) )
                    {
                    // InternalNowereBycicleDsl.g:718:2: ( ( 'SpecialUnicycleSaddle' ) )
                    // InternalNowereBycicleDsl.g:719:3: ( 'SpecialUnicycleSaddle' )
                    {
                     before(grammarAccess.getSaddleTypeAccess().getSpecialUnicycleSaddleEnumLiteralDeclaration_2()); 
                    // InternalNowereBycicleDsl.g:720:3: ( 'SpecialUnicycleSaddle' )
                    // InternalNowereBycicleDsl.g:720:4: 'SpecialUnicycleSaddle'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getSaddleTypeAccess().getSpecialUnicycleSaddleEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalNowereBycicleDsl.g:724:2: ( ( 'ComfortSaddle' ) )
                    {
                    // InternalNowereBycicleDsl.g:724:2: ( ( 'ComfortSaddle' ) )
                    // InternalNowereBycicleDsl.g:725:3: ( 'ComfortSaddle' )
                    {
                     before(grammarAccess.getSaddleTypeAccess().getComfortSaddleEnumLiteralDeclaration_3()); 
                    // InternalNowereBycicleDsl.g:726:3: ( 'ComfortSaddle' )
                    // InternalNowereBycicleDsl.g:726:4: 'ComfortSaddle'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getSaddleTypeAccess().getComfortSaddleEnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__SaddleType__Alternatives"


    // $ANTLR start "rule__Bicycle__Group__0"
    // InternalNowereBycicleDsl.g:734:1: rule__Bicycle__Group__0 : rule__Bicycle__Group__0__Impl rule__Bicycle__Group__1 ;
    public final void rule__Bicycle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:738:1: ( rule__Bicycle__Group__0__Impl rule__Bicycle__Group__1 )
            // InternalNowereBycicleDsl.g:739:2: rule__Bicycle__Group__0__Impl rule__Bicycle__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Bicycle__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bicycle__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bicycle__Group__0"


    // $ANTLR start "rule__Bicycle__Group__0__Impl"
    // InternalNowereBycicleDsl.g:746:1: rule__Bicycle__Group__0__Impl : ( () ) ;
    public final void rule__Bicycle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:750:1: ( ( () ) )
            // InternalNowereBycicleDsl.g:751:1: ( () )
            {
            // InternalNowereBycicleDsl.g:751:1: ( () )
            // InternalNowereBycicleDsl.g:752:2: ()
            {
             before(grammarAccess.getBicycleAccess().getBicycleAction_0()); 
            // InternalNowereBycicleDsl.g:753:2: ()
            // InternalNowereBycicleDsl.g:753:3: 
            {
            }

             after(grammarAccess.getBicycleAccess().getBicycleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bicycle__Group__0__Impl"


    // $ANTLR start "rule__Bicycle__Group__1"
    // InternalNowereBycicleDsl.g:761:1: rule__Bicycle__Group__1 : rule__Bicycle__Group__1__Impl rule__Bicycle__Group__2 ;
    public final void rule__Bicycle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:765:1: ( rule__Bicycle__Group__1__Impl rule__Bicycle__Group__2 )
            // InternalNowereBycicleDsl.g:766:2: rule__Bicycle__Group__1__Impl rule__Bicycle__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Bicycle__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bicycle__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bicycle__Group__1"


    // $ANTLR start "rule__Bicycle__Group__1__Impl"
    // InternalNowereBycicleDsl.g:773:1: rule__Bicycle__Group__1__Impl : ( 'Bicycle' ) ;
    public final void rule__Bicycle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:777:1: ( ( 'Bicycle' ) )
            // InternalNowereBycicleDsl.g:778:1: ( 'Bicycle' )
            {
            // InternalNowereBycicleDsl.g:778:1: ( 'Bicycle' )
            // InternalNowereBycicleDsl.g:779:2: 'Bicycle'
            {
             before(grammarAccess.getBicycleAccess().getBicycleKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getBicycleAccess().getBicycleKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bicycle__Group__1__Impl"


    // $ANTLR start "rule__Bicycle__Group__2"
    // InternalNowereBycicleDsl.g:788:1: rule__Bicycle__Group__2 : rule__Bicycle__Group__2__Impl rule__Bicycle__Group__3 ;
    public final void rule__Bicycle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:792:1: ( rule__Bicycle__Group__2__Impl rule__Bicycle__Group__3 )
            // InternalNowereBycicleDsl.g:793:2: rule__Bicycle__Group__2__Impl rule__Bicycle__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Bicycle__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bicycle__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bicycle__Group__2"


    // $ANTLR start "rule__Bicycle__Group__2__Impl"
    // InternalNowereBycicleDsl.g:800:1: rule__Bicycle__Group__2__Impl : ( ( RULE_ID )? ) ;
    public final void rule__Bicycle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:804:1: ( ( ( RULE_ID )? ) )
            // InternalNowereBycicleDsl.g:805:1: ( ( RULE_ID )? )
            {
            // InternalNowereBycicleDsl.g:805:1: ( ( RULE_ID )? )
            // InternalNowereBycicleDsl.g:806:2: ( RULE_ID )?
            {
             before(grammarAccess.getBicycleAccess().getIDTerminalRuleCall_2()); 
            // InternalNowereBycicleDsl.g:807:2: ( RULE_ID )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalNowereBycicleDsl.g:807:3: RULE_ID
                    {
                    match(input,RULE_ID,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getBicycleAccess().getIDTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bicycle__Group__2__Impl"


    // $ANTLR start "rule__Bicycle__Group__3"
    // InternalNowereBycicleDsl.g:815:1: rule__Bicycle__Group__3 : rule__Bicycle__Group__3__Impl rule__Bicycle__Group__4 ;
    public final void rule__Bicycle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:819:1: ( rule__Bicycle__Group__3__Impl rule__Bicycle__Group__4 )
            // InternalNowereBycicleDsl.g:820:2: rule__Bicycle__Group__3__Impl rule__Bicycle__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Bicycle__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bicycle__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bicycle__Group__3"


    // $ANTLR start "rule__Bicycle__Group__3__Impl"
    // InternalNowereBycicleDsl.g:827:1: rule__Bicycle__Group__3__Impl : ( ( rule__Bicycle__Group_3__0 )? ) ;
    public final void rule__Bicycle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:831:1: ( ( ( rule__Bicycle__Group_3__0 )? ) )
            // InternalNowereBycicleDsl.g:832:1: ( ( rule__Bicycle__Group_3__0 )? )
            {
            // InternalNowereBycicleDsl.g:832:1: ( ( rule__Bicycle__Group_3__0 )? )
            // InternalNowereBycicleDsl.g:833:2: ( rule__Bicycle__Group_3__0 )?
            {
             before(grammarAccess.getBicycleAccess().getGroup_3()); 
            // InternalNowereBycicleDsl.g:834:2: ( rule__Bicycle__Group_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==32) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalNowereBycicleDsl.g:834:3: rule__Bicycle__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Bicycle__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBicycleAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bicycle__Group__3__Impl"


    // $ANTLR start "rule__Bicycle__Group__4"
    // InternalNowereBycicleDsl.g:842:1: rule__Bicycle__Group__4 : rule__Bicycle__Group__4__Impl rule__Bicycle__Group__5 ;
    public final void rule__Bicycle__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:846:1: ( rule__Bicycle__Group__4__Impl rule__Bicycle__Group__5 )
            // InternalNowereBycicleDsl.g:847:2: rule__Bicycle__Group__4__Impl rule__Bicycle__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__Bicycle__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bicycle__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bicycle__Group__4"


    // $ANTLR start "rule__Bicycle__Group__4__Impl"
    // InternalNowereBycicleDsl.g:854:1: rule__Bicycle__Group__4__Impl : ( ( ( rule__Bicycle__PartsAssignment_4 ) ) ( ( rule__Bicycle__PartsAssignment_4 )* ) ) ;
    public final void rule__Bicycle__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:858:1: ( ( ( ( rule__Bicycle__PartsAssignment_4 ) ) ( ( rule__Bicycle__PartsAssignment_4 )* ) ) )
            // InternalNowereBycicleDsl.g:859:1: ( ( ( rule__Bicycle__PartsAssignment_4 ) ) ( ( rule__Bicycle__PartsAssignment_4 )* ) )
            {
            // InternalNowereBycicleDsl.g:859:1: ( ( ( rule__Bicycle__PartsAssignment_4 ) ) ( ( rule__Bicycle__PartsAssignment_4 )* ) )
            // InternalNowereBycicleDsl.g:860:2: ( ( rule__Bicycle__PartsAssignment_4 ) ) ( ( rule__Bicycle__PartsAssignment_4 )* )
            {
            // InternalNowereBycicleDsl.g:860:2: ( ( rule__Bicycle__PartsAssignment_4 ) )
            // InternalNowereBycicleDsl.g:861:3: ( rule__Bicycle__PartsAssignment_4 )
            {
             before(grammarAccess.getBicycleAccess().getPartsAssignment_4()); 
            // InternalNowereBycicleDsl.g:862:3: ( rule__Bicycle__PartsAssignment_4 )
            // InternalNowereBycicleDsl.g:862:4: rule__Bicycle__PartsAssignment_4
            {
            pushFollow(FOLLOW_6);
            rule__Bicycle__PartsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getBicycleAccess().getPartsAssignment_4()); 

            }

            // InternalNowereBycicleDsl.g:865:2: ( ( rule__Bicycle__PartsAssignment_4 )* )
            // InternalNowereBycicleDsl.g:866:3: ( rule__Bicycle__PartsAssignment_4 )*
            {
             before(grammarAccess.getBicycleAccess().getPartsAssignment_4()); 
            // InternalNowereBycicleDsl.g:867:3: ( rule__Bicycle__PartsAssignment_4 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==38||(LA11_0>=43 && LA11_0<=46)||LA11_0==48||(LA11_0>=50 && LA11_0<=51)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalNowereBycicleDsl.g:867:4: rule__Bicycle__PartsAssignment_4
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Bicycle__PartsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getBicycleAccess().getPartsAssignment_4()); 

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
    // $ANTLR end "rule__Bicycle__Group__4__Impl"


    // $ANTLR start "rule__Bicycle__Group__5"
    // InternalNowereBycicleDsl.g:876:1: rule__Bicycle__Group__5 : rule__Bicycle__Group__5__Impl rule__Bicycle__Group__6 ;
    public final void rule__Bicycle__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:880:1: ( rule__Bicycle__Group__5__Impl rule__Bicycle__Group__6 )
            // InternalNowereBycicleDsl.g:881:2: rule__Bicycle__Group__5__Impl rule__Bicycle__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__Bicycle__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bicycle__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bicycle__Group__5"


    // $ANTLR start "rule__Bicycle__Group__5__Impl"
    // InternalNowereBycicleDsl.g:888:1: rule__Bicycle__Group__5__Impl : ( ( rule__Bicycle__CustomerDataAssignment_5 )? ) ;
    public final void rule__Bicycle__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:892:1: ( ( ( rule__Bicycle__CustomerDataAssignment_5 )? ) )
            // InternalNowereBycicleDsl.g:893:1: ( ( rule__Bicycle__CustomerDataAssignment_5 )? )
            {
            // InternalNowereBycicleDsl.g:893:1: ( ( rule__Bicycle__CustomerDataAssignment_5 )? )
            // InternalNowereBycicleDsl.g:894:2: ( rule__Bicycle__CustomerDataAssignment_5 )?
            {
             before(grammarAccess.getBicycleAccess().getCustomerDataAssignment_5()); 
            // InternalNowereBycicleDsl.g:895:2: ( rule__Bicycle__CustomerDataAssignment_5 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==33) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalNowereBycicleDsl.g:895:3: rule__Bicycle__CustomerDataAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Bicycle__CustomerDataAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBicycleAccess().getCustomerDataAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bicycle__Group__5__Impl"


    // $ANTLR start "rule__Bicycle__Group__6"
    // InternalNowereBycicleDsl.g:903:1: rule__Bicycle__Group__6 : rule__Bicycle__Group__6__Impl ;
    public final void rule__Bicycle__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:907:1: ( rule__Bicycle__Group__6__Impl )
            // InternalNowereBycicleDsl.g:908:2: rule__Bicycle__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Bicycle__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bicycle__Group__6"


    // $ANTLR start "rule__Bicycle__Group__6__Impl"
    // InternalNowereBycicleDsl.g:914:1: rule__Bicycle__Group__6__Impl : ( ( rule__Bicycle__ParametersAssignment_6 )* ) ;
    public final void rule__Bicycle__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:918:1: ( ( ( rule__Bicycle__ParametersAssignment_6 )* ) )
            // InternalNowereBycicleDsl.g:919:1: ( ( rule__Bicycle__ParametersAssignment_6 )* )
            {
            // InternalNowereBycicleDsl.g:919:1: ( ( rule__Bicycle__ParametersAssignment_6 )* )
            // InternalNowereBycicleDsl.g:920:2: ( rule__Bicycle__ParametersAssignment_6 )*
            {
             before(grammarAccess.getBicycleAccess().getParametersAssignment_6()); 
            // InternalNowereBycicleDsl.g:921:2: ( rule__Bicycle__ParametersAssignment_6 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==35) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalNowereBycicleDsl.g:921:3: rule__Bicycle__ParametersAssignment_6
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Bicycle__ParametersAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getBicycleAccess().getParametersAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bicycle__Group__6__Impl"


    // $ANTLR start "rule__Bicycle__Group_3__0"
    // InternalNowereBycicleDsl.g:930:1: rule__Bicycle__Group_3__0 : rule__Bicycle__Group_3__0__Impl rule__Bicycle__Group_3__1 ;
    public final void rule__Bicycle__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:934:1: ( rule__Bicycle__Group_3__0__Impl rule__Bicycle__Group_3__1 )
            // InternalNowereBycicleDsl.g:935:2: rule__Bicycle__Group_3__0__Impl rule__Bicycle__Group_3__1
            {
            pushFollow(FOLLOW_8);
            rule__Bicycle__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bicycle__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bicycle__Group_3__0"


    // $ANTLR start "rule__Bicycle__Group_3__0__Impl"
    // InternalNowereBycicleDsl.g:942:1: rule__Bicycle__Group_3__0__Impl : ( 'deliveryDate' ) ;
    public final void rule__Bicycle__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:946:1: ( ( 'deliveryDate' ) )
            // InternalNowereBycicleDsl.g:947:1: ( 'deliveryDate' )
            {
            // InternalNowereBycicleDsl.g:947:1: ( 'deliveryDate' )
            // InternalNowereBycicleDsl.g:948:2: 'deliveryDate'
            {
             before(grammarAccess.getBicycleAccess().getDeliveryDateKeyword_3_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getBicycleAccess().getDeliveryDateKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bicycle__Group_3__0__Impl"


    // $ANTLR start "rule__Bicycle__Group_3__1"
    // InternalNowereBycicleDsl.g:957:1: rule__Bicycle__Group_3__1 : rule__Bicycle__Group_3__1__Impl ;
    public final void rule__Bicycle__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:961:1: ( rule__Bicycle__Group_3__1__Impl )
            // InternalNowereBycicleDsl.g:962:2: rule__Bicycle__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Bicycle__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bicycle__Group_3__1"


    // $ANTLR start "rule__Bicycle__Group_3__1__Impl"
    // InternalNowereBycicleDsl.g:968:1: rule__Bicycle__Group_3__1__Impl : ( ( rule__Bicycle__DeliveryDateAssignment_3_1 ) ) ;
    public final void rule__Bicycle__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:972:1: ( ( ( rule__Bicycle__DeliveryDateAssignment_3_1 ) ) )
            // InternalNowereBycicleDsl.g:973:1: ( ( rule__Bicycle__DeliveryDateAssignment_3_1 ) )
            {
            // InternalNowereBycicleDsl.g:973:1: ( ( rule__Bicycle__DeliveryDateAssignment_3_1 ) )
            // InternalNowereBycicleDsl.g:974:2: ( rule__Bicycle__DeliveryDateAssignment_3_1 )
            {
             before(grammarAccess.getBicycleAccess().getDeliveryDateAssignment_3_1()); 
            // InternalNowereBycicleDsl.g:975:2: ( rule__Bicycle__DeliveryDateAssignment_3_1 )
            // InternalNowereBycicleDsl.g:975:3: rule__Bicycle__DeliveryDateAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Bicycle__DeliveryDateAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getBicycleAccess().getDeliveryDateAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bicycle__Group_3__1__Impl"


    // $ANTLR start "rule__CustomerData__Group__0"
    // InternalNowereBycicleDsl.g:984:1: rule__CustomerData__Group__0 : rule__CustomerData__Group__0__Impl rule__CustomerData__Group__1 ;
    public final void rule__CustomerData__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:988:1: ( rule__CustomerData__Group__0__Impl rule__CustomerData__Group__1 )
            // InternalNowereBycicleDsl.g:989:2: rule__CustomerData__Group__0__Impl rule__CustomerData__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__CustomerData__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CustomerData__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomerData__Group__0"


    // $ANTLR start "rule__CustomerData__Group__0__Impl"
    // InternalNowereBycicleDsl.g:996:1: rule__CustomerData__Group__0__Impl : ( () ) ;
    public final void rule__CustomerData__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:1000:1: ( ( () ) )
            // InternalNowereBycicleDsl.g:1001:1: ( () )
            {
            // InternalNowereBycicleDsl.g:1001:1: ( () )
            // InternalNowereBycicleDsl.g:1002:2: ()
            {
             before(grammarAccess.getCustomerDataAccess().getCustomerDataAction_0()); 
            // InternalNowereBycicleDsl.g:1003:2: ()
            // InternalNowereBycicleDsl.g:1003:3: 
            {
            }

             after(grammarAccess.getCustomerDataAccess().getCustomerDataAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomerData__Group__0__Impl"


    // $ANTLR start "rule__CustomerData__Group__1"
    // InternalNowereBycicleDsl.g:1011:1: rule__CustomerData__Group__1 : rule__CustomerData__Group__1__Impl rule__CustomerData__Group__2 ;
    public final void rule__CustomerData__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:1015:1: ( rule__CustomerData__Group__1__Impl rule__CustomerData__Group__2 )
            // InternalNowereBycicleDsl.g:1016:2: rule__CustomerData__Group__1__Impl rule__CustomerData__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__CustomerData__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CustomerData__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomerData__Group__1"


    // $ANTLR start "rule__CustomerData__Group__1__Impl"
    // InternalNowereBycicleDsl.g:1023:1: rule__CustomerData__Group__1__Impl : ( 'CustomerData' ) ;
    public final void rule__CustomerData__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:1027:1: ( ( 'CustomerData' ) )
            // InternalNowereBycicleDsl.g:1028:1: ( 'CustomerData' )
            {
            // InternalNowereBycicleDsl.g:1028:1: ( 'CustomerData' )
            // InternalNowereBycicleDsl.g:1029:2: 'CustomerData'
            {
             before(grammarAccess.getCustomerDataAccess().getCustomerDataKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getCustomerDataAccess().getCustomerDataKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomerData__Group__1__Impl"


    // $ANTLR start "rule__CustomerData__Group__2"
    // InternalNowereBycicleDsl.g:1038:1: rule__CustomerData__Group__2 : rule__CustomerData__Group__2__Impl rule__CustomerData__Group__3 ;
    public final void rule__CustomerData__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:1042:1: ( rule__CustomerData__Group__2__Impl rule__CustomerData__Group__3 )
            // InternalNowereBycicleDsl.g:1043:2: rule__CustomerData__Group__2__Impl rule__CustomerData__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__CustomerData__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CustomerData__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomerData__Group__2"


    // $ANTLR start "rule__CustomerData__Group__2__Impl"
    // InternalNowereBycicleDsl.g:1050:1: rule__CustomerData__Group__2__Impl : ( ( rule__CustomerData__NameAssignment_2 ) ) ;
    public final void rule__CustomerData__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:1054:1: ( ( ( rule__CustomerData__NameAssignment_2 ) ) )
            // InternalNowereBycicleDsl.g:1055:1: ( ( rule__CustomerData__NameAssignment_2 ) )
            {
            // InternalNowereBycicleDsl.g:1055:1: ( ( rule__CustomerData__NameAssignment_2 ) )
            // InternalNowereBycicleDsl.g:1056:2: ( rule__CustomerData__NameAssignment_2 )
            {
             before(grammarAccess.getCustomerDataAccess().getNameAssignment_2()); 
            // InternalNowereBycicleDsl.g:1057:2: ( rule__CustomerData__NameAssignment_2 )
            // InternalNowereBycicleDsl.g:1057:3: rule__CustomerData__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__CustomerData__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCustomerDataAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomerData__Group__2__Impl"


    // $ANTLR start "rule__CustomerData__Group__3"
    // InternalNowereBycicleDsl.g:1065:1: rule__CustomerData__Group__3 : rule__CustomerData__Group__3__Impl rule__CustomerData__Group__4 ;
    public final void rule__CustomerData__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:1069:1: ( rule__CustomerData__Group__3__Impl rule__CustomerData__Group__4 )
            // InternalNowereBycicleDsl.g:1070:2: rule__CustomerData__Group__3__Impl rule__CustomerData__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__CustomerData__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CustomerData__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomerData__Group__3"


    // $ANTLR start "rule__CustomerData__Group__3__Impl"
    // InternalNowereBycicleDsl.g:1077:1: rule__CustomerData__Group__3__Impl : ( ( rule__CustomerData__Group_3__0 )? ) ;
    public final void rule__CustomerData__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:1081:1: ( ( ( rule__CustomerData__Group_3__0 )? ) )
            // InternalNowereBycicleDsl.g:1082:1: ( ( rule__CustomerData__Group_3__0 )? )
            {
            // InternalNowereBycicleDsl.g:1082:1: ( ( rule__CustomerData__Group_3__0 )? )
            // InternalNowereBycicleDsl.g:1083:2: ( rule__CustomerData__Group_3__0 )?
            {
             before(grammarAccess.getCustomerDataAccess().getGroup_3()); 
            // InternalNowereBycicleDsl.g:1084:2: ( rule__CustomerData__Group_3__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==34) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalNowereBycicleDsl.g:1084:3: rule__CustomerData__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CustomerData__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCustomerDataAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomerData__Group__3__Impl"


    // $ANTLR start "rule__CustomerData__Group__4"
    // InternalNowereBycicleDsl.g:1092:1: rule__CustomerData__Group__4 : rule__CustomerData__Group__4__Impl ;
    public final void rule__CustomerData__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:1096:1: ( rule__CustomerData__Group__4__Impl )
            // InternalNowereBycicleDsl.g:1097:2: rule__CustomerData__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CustomerData__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomerData__Group__4"


    // $ANTLR start "rule__CustomerData__Group__4__Impl"
    // InternalNowereBycicleDsl.g:1103:1: rule__CustomerData__Group__4__Impl : ( ( rule__CustomerData__ParametersAssignment_4 )* ) ;
    public final void rule__CustomerData__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:1107:1: ( ( ( rule__CustomerData__ParametersAssignment_4 )* ) )
            // InternalNowereBycicleDsl.g:1108:1: ( ( rule__CustomerData__ParametersAssignment_4 )* )
            {
            // InternalNowereBycicleDsl.g:1108:1: ( ( rule__CustomerData__ParametersAssignment_4 )* )
            // InternalNowereBycicleDsl.g:1109:2: ( rule__CustomerData__ParametersAssignment_4 )*
            {
             before(grammarAccess.getCustomerDataAccess().getParametersAssignment_4()); 
            // InternalNowereBycicleDsl.g:1110:2: ( rule__CustomerData__ParametersAssignment_4 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==35) ) {
                    int LA15_2 = input.LA(2);

                    if ( (LA15_2==RULE_STRING) ) {
                        alt15=1;
                    }
                    else if ( (LA15_2==RULE_ID) ) {
                        alt15=1;
                    }


                }


                switch (alt15) {
            	case 1 :
            	    // InternalNowereBycicleDsl.g:1110:3: rule__CustomerData__ParametersAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__CustomerData__ParametersAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getCustomerDataAccess().getParametersAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomerData__Group__4__Impl"


    // $ANTLR start "rule__CustomerData__Group_3__0"
    // InternalNowereBycicleDsl.g:1119:1: rule__CustomerData__Group_3__0 : rule__CustomerData__Group_3__0__Impl rule__CustomerData__Group_3__1 ;
    public final void rule__CustomerData__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:1123:1: ( rule__CustomerData__Group_3__0__Impl rule__CustomerData__Group_3__1 )
            // InternalNowereBycicleDsl.g:1124:2: rule__CustomerData__Group_3__0__Impl rule__CustomerData__Group_3__1
            {
            pushFollow(FOLLOW_8);
            rule__CustomerData__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CustomerData__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomerData__Group_3__0"


    // $ANTLR start "rule__CustomerData__Group_3__0__Impl"
    // InternalNowereBycicleDsl.g:1131:1: rule__CustomerData__Group_3__0__Impl : ( 'address' ) ;
    public final void rule__CustomerData__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:1135:1: ( ( 'address' ) )
            // InternalNowereBycicleDsl.g:1136:1: ( 'address' )
            {
            // InternalNowereBycicleDsl.g:1136:1: ( 'address' )
            // InternalNowereBycicleDsl.g:1137:2: 'address'
            {
             before(grammarAccess.getCustomerDataAccess().getAddressKeyword_3_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getCustomerDataAccess().getAddressKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomerData__Group_3__0__Impl"


    // $ANTLR start "rule__CustomerData__Group_3__1"
    // InternalNowereBycicleDsl.g:1146:1: rule__CustomerData__Group_3__1 : rule__CustomerData__Group_3__1__Impl ;
    public final void rule__CustomerData__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:1150:1: ( rule__CustomerData__Group_3__1__Impl )
            // InternalNowereBycicleDsl.g:1151:2: rule__CustomerData__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CustomerData__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomerData__Group_3__1"


    // $ANTLR start "rule__CustomerData__Group_3__1__Impl"
    // InternalNowereBycicleDsl.g:1157:1: rule__CustomerData__Group_3__1__Impl : ( ( rule__CustomerData__AddressAssignment_3_1 ) ) ;
    public final void rule__CustomerData__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:1161:1: ( ( ( rule__CustomerData__AddressAssignment_3_1 ) ) )
            // InternalNowereBycicleDsl.g:1162:1: ( ( rule__CustomerData__AddressAssignment_3_1 ) )
            {
            // InternalNowereBycicleDsl.g:1162:1: ( ( rule__CustomerData__AddressAssignment_3_1 ) )
            // InternalNowereBycicleDsl.g:1163:2: ( rule__CustomerData__AddressAssignment_3_1 )
            {
             before(grammarAccess.getCustomerDataAccess().getAddressAssignment_3_1()); 
            // InternalNowereBycicleDsl.g:1164:2: ( rule__CustomerData__AddressAssignment_3_1 )
            // InternalNowereBycicleDsl.g:1164:3: rule__CustomerData__AddressAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__CustomerData__AddressAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getCustomerDataAccess().getAddressAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomerData__Group_3__1__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // InternalNowereBycicleDsl.g:1173:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:1177:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalNowereBycicleDsl.g:1178:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalNowereBycicleDsl.g:1185:1: rule__Parameter__Group__0__Impl : ( () ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:1189:1: ( ( () ) )
            // InternalNowereBycicleDsl.g:1190:1: ( () )
            {
            // InternalNowereBycicleDsl.g:1190:1: ( () )
            // InternalNowereBycicleDsl.g:1191:2: ()
            {
             before(grammarAccess.getParameterAccess().getParameterAction_0()); 
            // InternalNowereBycicleDsl.g:1192:2: ()
            // InternalNowereBycicleDsl.g:1192:3: 
            {
            }

             after(grammarAccess.getParameterAccess().getParameterAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0__Impl"


    // $ANTLR start "rule__Parameter__Group__1"
    // InternalNowereBycicleDsl.g:1200:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:1204:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalNowereBycicleDsl.g:1205:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Parameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__2();

            state._fsp--;


            }

        }
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
    // InternalNowereBycicleDsl.g:1212:1: rule__Parameter__Group__1__Impl : ( 'Parameter' ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:1216:1: ( ( 'Parameter' ) )
            // InternalNowereBycicleDsl.g:1217:1: ( 'Parameter' )
            {
            // InternalNowereBycicleDsl.g:1217:1: ( 'Parameter' )
            // InternalNowereBycicleDsl.g:1218:2: 'Parameter'
            {
             before(grammarAccess.getParameterAccess().getParameterKeyword_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getParameterKeyword_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Parameter__Group__2"
    // InternalNowereBycicleDsl.g:1227:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl rule__Parameter__Group__3 ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:1231:1: ( rule__Parameter__Group__2__Impl rule__Parameter__Group__3 )
            // InternalNowereBycicleDsl.g:1232:2: rule__Parameter__Group__2__Impl rule__Parameter__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Parameter__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__2"


    // $ANTLR start "rule__Parameter__Group__2__Impl"
    // InternalNowereBycicleDsl.g:1239:1: rule__Parameter__Group__2__Impl : ( ( rule__Parameter__NameAssignment_2 ) ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:1243:1: ( ( ( rule__Parameter__NameAssignment_2 ) ) )
            // InternalNowereBycicleDsl.g:1244:1: ( ( rule__Parameter__NameAssignment_2 ) )
            {
            // InternalNowereBycicleDsl.g:1244:1: ( ( rule__Parameter__NameAssignment_2 ) )
            // InternalNowereBycicleDsl.g:1245:2: ( rule__Parameter__NameAssignment_2 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_2()); 
            // InternalNowereBycicleDsl.g:1246:2: ( rule__Parameter__NameAssignment_2 )
            // InternalNowereBycicleDsl.g:1246:3: rule__Parameter__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__2__Impl"


    // $ANTLR start "rule__Parameter__Group__3"
    // InternalNowereBycicleDsl.g:1254:1: rule__Parameter__Group__3 : rule__Parameter__Group__3__Impl ;
    public final void rule__Parameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:1258:1: ( rule__Parameter__Group__3__Impl )
            // InternalNowereBycicleDsl.g:1259:2: rule__Parameter__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__3"


    // $ANTLR start "rule__Parameter__Group__3__Impl"
    // InternalNowereBycicleDsl.g:1265:1: rule__Parameter__Group__3__Impl : ( ( rule__Parameter__ValueAssignment_3 )? ) ;
    public final void rule__Parameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:1269:1: ( ( ( rule__Parameter__ValueAssignment_3 )? ) )
            // InternalNowereBycicleDsl.g:1270:1: ( ( rule__Parameter__ValueAssignment_3 )? )
            {
            // InternalNowereBycicleDsl.g:1270:1: ( ( rule__Parameter__ValueAssignment_3 )? )
            // InternalNowereBycicleDsl.g:1271:2: ( rule__Parameter__ValueAssignment_3 )?
            {
             before(grammarAccess.getParameterAccess().getValueAssignment_3()); 
            // InternalNowereBycicleDsl.g:1272:2: ( rule__Parameter__ValueAssignment_3 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_STRING && LA16_0<=RULE_ID)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalNowereBycicleDsl.g:1272:3: rule__Parameter__ValueAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Parameter__ValueAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParameterAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__3__Impl"


    // $ANTLR start "rule__EDouble__Group__0"
    // InternalNowereBycicleDsl.g:1281:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:1285:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // InternalNowereBycicleDsl.g:1286:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__EDouble__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__0"


    // $ANTLR start "rule__EDouble__Group__0__Impl"
    // InternalNowereBycicleDsl.g:1293:1: rule__EDouble__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:1297:1: ( ( ( '-' )? ) )
            // InternalNowereBycicleDsl.g:1298:1: ( ( '-' )? )
            {
            // InternalNowereBycicleDsl.g:1298:1: ( ( '-' )? )
            // InternalNowereBycicleDsl.g:1299:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
            // InternalNowereBycicleDsl.g:1300:2: ( '-' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==36) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalNowereBycicleDsl.g:1300:3: '-'
                    {
                    match(input,36,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__0__Impl"


    // $ANTLR start "rule__EDouble__Group__1"
    // InternalNowereBycicleDsl.g:1308:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:1312:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // InternalNowereBycicleDsl.g:1313:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__EDouble__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__1"


    // $ANTLR start "rule__EDouble__Group__1__Impl"
    // InternalNowereBycicleDsl.g:1320:1: rule__EDouble__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:1324:1: ( ( ( RULE_INT )? ) )
            // InternalNowereBycicleDsl.g:1325:1: ( ( RULE_INT )? )
            {
            // InternalNowereBycicleDsl.g:1325:1: ( ( RULE_INT )? )
            // InternalNowereBycicleDsl.g:1326:2: ( RULE_INT )?
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
            // InternalNowereBycicleDsl.g:1327:2: ( RULE_INT )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_INT) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalNowereBycicleDsl.g:1327:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__1__Impl"


    // $ANTLR start "rule__EDouble__Group__2"
    // InternalNowereBycicleDsl.g:1335:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl rule__EDouble__Group__3 ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:1339:1: ( rule__EDouble__Group__2__Impl rule__EDouble__Group__3 )
            // InternalNowereBycicleDsl.g:1340:2: rule__EDouble__Group__2__Impl rule__EDouble__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__EDouble__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__2"


    // $ANTLR start "rule__EDouble__Group__2__Impl"
    // InternalNowereBycicleDsl.g:1347:1: rule__EDouble__Group__2__Impl : ( '.' ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:1351:1: ( ( '.' ) )
            // InternalNowereBycicleDsl.g:1352:1: ( '.' )
            {
            // InternalNowereBycicleDsl.g:1352:1: ( '.' )
            // InternalNowereBycicleDsl.g:1353:2: '.'
            {
             before(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__2__Impl"


    // $ANTLR start "rule__EDouble__Group__3"
    // InternalNowereBycicleDsl.g:1362:1: rule__EDouble__Group__3 : rule__EDouble__Group__3__Impl rule__EDouble__Group__4 ;
    public final void rule__EDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:1366:1: ( rule__EDouble__Group__3__Impl rule__EDouble__Group__4 )
            // InternalNowereBycicleDsl.g:1367:2: rule__EDouble__Group__3__Impl rule__EDouble__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__EDouble__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__3"


    // $ANTLR start "rule__EDouble__Group__3__Impl"
    // InternalNowereBycicleDsl.g:1374:1: rule__EDouble__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:1378:1: ( ( RULE_INT ) )
            // InternalNowereBycicleDsl.g:1379:1: ( RULE_INT )
            {
            // InternalNowereBycicleDsl.g:1379:1: ( RULE_INT )
            // InternalNowereBycicleDsl.g:1380:2: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__3__Impl"


    // $ANTLR start "rule__EDouble__Group__4"
    // InternalNowereBycicleDsl.g:1389:1: rule__EDouble__Group__4 : rule__EDouble__Group__4__Impl ;
    public final void rule__EDouble__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:1393:1: ( rule__EDouble__Group__4__Impl )
            // InternalNowereBycicleDsl.g:1394:2: rule__EDouble__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__4"


    // $ANTLR start "rule__EDouble__Group__4__Impl"
    // InternalNowereBycicleDsl.g:1400:1: rule__EDouble__Group__4__Impl : ( ( rule__EDouble__Group_4__0 )? ) ;
    public final void rule__EDouble__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:1404:1: ( ( ( rule__EDouble__Group_4__0 )? ) )
            // InternalNowereBycicleDsl.g:1405:1: ( ( rule__EDouble__Group_4__0 )? )
            {
            // InternalNowereBycicleDsl.g:1405:1: ( ( rule__EDouble__Group_4__0 )? )
            // InternalNowereBycicleDsl.g:1406:2: ( rule__EDouble__Group_4__0 )?
            {
             before(grammarAccess.getEDoubleAccess().getGroup_4()); 
            // InternalNowereBycicleDsl.g:1407:2: ( rule__EDouble__Group_4__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=11 && LA19_0<=12)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalNowereBycicleDsl.g:1407:3: rule__EDouble__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EDouble__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__4__Impl"


    // $ANTLR start "rule__EDouble__Group_4__0"
    // InternalNowereBycicleDsl.g:1416:1: rule__EDouble__Group_4__0 : rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 ;
    public final void rule__EDouble__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:1420:1: ( rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 )
            // InternalNowereBycicleDsl.g:1421:2: rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1
            {
            pushFollow(FOLLOW_15);
            rule__EDouble__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__0"


    // $ANTLR start "rule__EDouble__Group_4__0__Impl"
    // InternalNowereBycicleDsl.g:1428:1: rule__EDouble__Group_4__0__Impl : ( ( rule__EDouble__Alternatives_4_0 ) ) ;
    public final void rule__EDouble__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:1432:1: ( ( ( rule__EDouble__Alternatives_4_0 ) ) )
            // InternalNowereBycicleDsl.g:1433:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            {
            // InternalNowereBycicleDsl.g:1433:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            // InternalNowereBycicleDsl.g:1434:2: ( rule__EDouble__Alternatives_4_0 )
            {
             before(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 
            // InternalNowereBycicleDsl.g:1435:2: ( rule__EDouble__Alternatives_4_0 )
            // InternalNowereBycicleDsl.g:1435:3: rule__EDouble__Alternatives_4_0
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Alternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__0__Impl"


    // $ANTLR start "rule__EDouble__Group_4__1"
    // InternalNowereBycicleDsl.g:1443:1: rule__EDouble__Group_4__1 : rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 ;
    public final void rule__EDouble__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:1447:1: ( rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 )
            // InternalNowereBycicleDsl.g:1448:2: rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2
            {
            pushFollow(FOLLOW_15);
            rule__EDouble__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__1"


    // $ANTLR start "rule__EDouble__Group_4__1__Impl"
    // InternalNowereBycicleDsl.g:1455:1: rule__EDouble__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:1459:1: ( ( ( '-' )? ) )
            // InternalNowereBycicleDsl.g:1460:1: ( ( '-' )? )
            {
            // InternalNowereBycicleDsl.g:1460:1: ( ( '-' )? )
            // InternalNowereBycicleDsl.g:1461:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 
            // InternalNowereBycicleDsl.g:1462:2: ( '-' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==36) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalNowereBycicleDsl.g:1462:3: '-'
                    {
                    match(input,36,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__1__Impl"


    // $ANTLR start "rule__EDouble__Group_4__2"
    // InternalNowereBycicleDsl.g:1470:1: rule__EDouble__Group_4__2 : rule__EDouble__Group_4__2__Impl ;
    public final void rule__EDouble__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:1474:1: ( rule__EDouble__Group_4__2__Impl )
            // InternalNowereBycicleDsl.g:1475:2: rule__EDouble__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__2"


    // $ANTLR start "rule__EDouble__Group_4__2__Impl"
    // InternalNowereBycicleDsl.g:1481:1: rule__EDouble__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:1485:1: ( ( RULE_INT ) )
            // InternalNowereBycicleDsl.g:1486:1: ( RULE_INT )
            {
            // InternalNowereBycicleDsl.g:1486:1: ( RULE_INT )
            // InternalNowereBycicleDsl.g:1487:2: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__2__Impl"


    // $ANTLR start "rule__Frame__Group__0"
    // InternalNowereBycicleDsl.g:1497:1: rule__Frame__Group__0 : rule__Frame__Group__0__Impl rule__Frame__Group__1 ;
    public final void rule__Frame__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:1501:1: ( rule__Frame__Group__0__Impl rule__Frame__Group__1 )
            // InternalNowereBycicleDsl.g:1502:2: rule__Frame__Group__0__Impl rule__Frame__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Frame__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Frame__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frame__Group__0"


    // $ANTLR start "rule__Frame__Group__0__Impl"
    // InternalNowereBycicleDsl.g:1509:1: rule__Frame__Group__0__Impl : ( () ) ;
    public final void rule__Frame__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:1513:1: ( ( () ) )
            // InternalNowereBycicleDsl.g:1514:1: ( () )
            {
            // InternalNowereBycicleDsl.g:1514:1: ( () )
            // InternalNowereBycicleDsl.g:1515:2: ()
            {
             before(grammarAccess.getFrameAccess().getFrameAction_0()); 
            // InternalNowereBycicleDsl.g:1516:2: ()
            // InternalNowereBycicleDsl.g:1516:3: 
            {
            }

             after(grammarAccess.getFrameAccess().getFrameAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frame__Group__0__Impl"


    // $ANTLR start "rule__Frame__Group__1"
    // InternalNowereBycicleDsl.g:1524:1: rule__Frame__Group__1 : rule__Frame__Group__1__Impl rule__Frame__Group__2 ;
    public final void rule__Frame__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:1528:1: ( rule__Frame__Group__1__Impl rule__Frame__Group__2 )
            // InternalNowereBycicleDsl.g:1529:2: rule__Frame__Group__1__Impl rule__Frame__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Frame__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Frame__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frame__Group__1"


    // $ANTLR start "rule__Frame__Group__1__Impl"
    // InternalNowereBycicleDsl.g:1536:1: rule__Frame__Group__1__Impl : ( 'Frame' ) ;
    public final void rule__Frame__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:1540:1: ( ( 'Frame' ) )
            // InternalNowereBycicleDsl.g:1541:1: ( 'Frame' )
            {
            // InternalNowereBycicleDsl.g:1541:1: ( 'Frame' )
            // InternalNowereBycicleDsl.g:1542:2: 'Frame'
            {
             before(grammarAccess.getFrameAccess().getFrameKeyword_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getFrameAccess().getFrameKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frame__Group__1__Impl"


    // $ANTLR start "rule__Frame__Group__2"
    // InternalNowereBycicleDsl.g:1551:1: rule__Frame__Group__2 : rule__Frame__Group__2__Impl rule__Frame__Group__3 ;
    public final void rule__Frame__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:1555:1: ( rule__Frame__Group__2__Impl rule__Frame__Group__3 )
            // InternalNowereBycicleDsl.g:1556:2: rule__Frame__Group__2__Impl rule__Frame__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__Frame__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Frame__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frame__Group__2"


    // $ANTLR start "rule__Frame__Group__2__Impl"
    // InternalNowereBycicleDsl.g:1563:1: rule__Frame__Group__2__Impl : ( ( rule__Frame__NameAssignment_2 ) ) ;
    public final void rule__Frame__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:1567:1: ( ( ( rule__Frame__NameAssignment_2 ) ) )
            // InternalNowereBycicleDsl.g:1568:1: ( ( rule__Frame__NameAssignment_2 ) )
            {
            // InternalNowereBycicleDsl.g:1568:1: ( ( rule__Frame__NameAssignment_2 ) )
            // InternalNowereBycicleDsl.g:1569:2: ( rule__Frame__NameAssignment_2 )
            {
             before(grammarAccess.getFrameAccess().getNameAssignment_2()); 
            // InternalNowereBycicleDsl.g:1570:2: ( rule__Frame__NameAssignment_2 )
            // InternalNowereBycicleDsl.g:1570:3: rule__Frame__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Frame__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFrameAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frame__Group__2__Impl"


    // $ANTLR start "rule__Frame__Group__3"
    // InternalNowereBycicleDsl.g:1578:1: rule__Frame__Group__3 : rule__Frame__Group__3__Impl rule__Frame__Group__4 ;
    public final void rule__Frame__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:1582:1: ( rule__Frame__Group__3__Impl rule__Frame__Group__4 )
            // InternalNowereBycicleDsl.g:1583:2: rule__Frame__Group__3__Impl rule__Frame__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__Frame__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Frame__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frame__Group__3"


    // $ANTLR start "rule__Frame__Group__3__Impl"
    // InternalNowereBycicleDsl.g:1590:1: rule__Frame__Group__3__Impl : ( ( rule__Frame__Group_3__0 )? ) ;
    public final void rule__Frame__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:1594:1: ( ( ( rule__Frame__Group_3__0 )? ) )
            // InternalNowereBycicleDsl.g:1595:1: ( ( rule__Frame__Group_3__0 )? )
            {
            // InternalNowereBycicleDsl.g:1595:1: ( ( rule__Frame__Group_3__0 )? )
            // InternalNowereBycicleDsl.g:1596:2: ( rule__Frame__Group_3__0 )?
            {
             before(grammarAccess.getFrameAccess().getGroup_3()); 
            // InternalNowereBycicleDsl.g:1597:2: ( rule__Frame__Group_3__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==39) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalNowereBycicleDsl.g:1597:3: rule__Frame__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Frame__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFrameAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frame__Group__3__Impl"


    // $ANTLR start "rule__Frame__Group__4"
    // InternalNowereBycicleDsl.g:1605:1: rule__Frame__Group__4 : rule__Frame__Group__4__Impl rule__Frame__Group__5 ;
    public final void rule__Frame__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:1609:1: ( rule__Frame__Group__4__Impl rule__Frame__Group__5 )
            // InternalNowereBycicleDsl.g:1610:2: rule__Frame__Group__4__Impl rule__Frame__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__Frame__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Frame__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frame__Group__4"


    // $ANTLR start "rule__Frame__Group__4__Impl"
    // InternalNowereBycicleDsl.g:1617:1: rule__Frame__Group__4__Impl : ( ( rule__Frame__Group_4__0 )? ) ;
    public final void rule__Frame__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:1621:1: ( ( ( rule__Frame__Group_4__0 )? ) )
            // InternalNowereBycicleDsl.g:1622:1: ( ( rule__Frame__Group_4__0 )? )
            {
            // InternalNowereBycicleDsl.g:1622:1: ( ( rule__Frame__Group_4__0 )? )
            // InternalNowereBycicleDsl.g:1623:2: ( rule__Frame__Group_4__0 )?
            {
             before(grammarAccess.getFrameAccess().getGroup_4()); 
            // InternalNowereBycicleDsl.g:1624:2: ( rule__Frame__Group_4__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==40) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalNowereBycicleDsl.g:1624:3: rule__Frame__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Frame__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFrameAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frame__Group__4__Impl"


    // $ANTLR start "rule__Frame__Group__5"
    // InternalNowereBycicleDsl.g:1632:1: rule__Frame__Group__5 : rule__Frame__Group__5__Impl rule__Frame__Group__6 ;
    public final void rule__Frame__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:1636:1: ( rule__Frame__Group__5__Impl rule__Frame__Group__6 )
            // InternalNowereBycicleDsl.g:1637:2: rule__Frame__Group__5__Impl rule__Frame__Group__6
            {
            pushFollow(FOLLOW_17);
            rule__Frame__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Frame__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frame__Group__5"


    // $ANTLR start "rule__Frame__Group__5__Impl"
    // InternalNowereBycicleDsl.g:1644:1: rule__Frame__Group__5__Impl : ( ( rule__Frame__Group_5__0 )? ) ;
    public final void rule__Frame__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:1648:1: ( ( ( rule__Frame__Group_5__0 )? ) )
            // InternalNowereBycicleDsl.g:1649:1: ( ( rule__Frame__Group_5__0 )? )
            {
            // InternalNowereBycicleDsl.g:1649:1: ( ( rule__Frame__Group_5__0 )? )
            // InternalNowereBycicleDsl.g:1650:2: ( rule__Frame__Group_5__0 )?
            {
             before(grammarAccess.getFrameAccess().getGroup_5()); 
            // InternalNowereBycicleDsl.g:1651:2: ( rule__Frame__Group_5__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==41) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalNowereBycicleDsl.g:1651:3: rule__Frame__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Frame__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFrameAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frame__Group__5__Impl"


    // $ANTLR start "rule__Frame__Group__6"
    // InternalNowereBycicleDsl.g:1659:1: rule__Frame__Group__6 : rule__Frame__Group__6__Impl ;
    public final void rule__Frame__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:1663:1: ( rule__Frame__Group__6__Impl )
            // InternalNowereBycicleDsl.g:1664:2: rule__Frame__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Frame__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frame__Group__6"


    // $ANTLR start "rule__Frame__Group__6__Impl"
    // InternalNowereBycicleDsl.g:1670:1: rule__Frame__Group__6__Impl : ( ( rule__Frame__Group_6__0 )? ) ;
    public final void rule__Frame__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:1674:1: ( ( ( rule__Frame__Group_6__0 )? ) )
            // InternalNowereBycicleDsl.g:1675:1: ( ( rule__Frame__Group_6__0 )? )
            {
            // InternalNowereBycicleDsl.g:1675:1: ( ( rule__Frame__Group_6__0 )? )
            // InternalNowereBycicleDsl.g:1676:2: ( rule__Frame__Group_6__0 )?
            {
             before(grammarAccess.getFrameAccess().getGroup_6()); 
            // InternalNowereBycicleDsl.g:1677:2: ( rule__Frame__Group_6__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==42) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalNowereBycicleDsl.g:1677:3: rule__Frame__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Frame__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFrameAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frame__Group__6__Impl"


    // $ANTLR start "rule__Frame__Group_3__0"
    // InternalNowereBycicleDsl.g:1686:1: rule__Frame__Group_3__0 : rule__Frame__Group_3__0__Impl rule__Frame__Group_3__1 ;
    public final void rule__Frame__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:1690:1: ( rule__Frame__Group_3__0__Impl rule__Frame__Group_3__1 )
            // InternalNowereBycicleDsl.g:1691:2: rule__Frame__Group_3__0__Impl rule__Frame__Group_3__1
            {
            pushFollow(FOLLOW_18);
            rule__Frame__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Frame__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frame__Group_3__0"


    // $ANTLR start "rule__Frame__Group_3__0__Impl"
    // InternalNowereBycicleDsl.g:1698:1: rule__Frame__Group_3__0__Impl : ( 'price' ) ;
    public final void rule__Frame__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:1702:1: ( ( 'price' ) )
            // InternalNowereBycicleDsl.g:1703:1: ( 'price' )
            {
            // InternalNowereBycicleDsl.g:1703:1: ( 'price' )
            // InternalNowereBycicleDsl.g:1704:2: 'price'
            {
             before(grammarAccess.getFrameAccess().getPriceKeyword_3_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getFrameAccess().getPriceKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frame__Group_3__0__Impl"


    // $ANTLR start "rule__Frame__Group_3__1"
    // InternalNowereBycicleDsl.g:1713:1: rule__Frame__Group_3__1 : rule__Frame__Group_3__1__Impl ;
    public final void rule__Frame__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:1717:1: ( rule__Frame__Group_3__1__Impl )
            // InternalNowereBycicleDsl.g:1718:2: rule__Frame__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Frame__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frame__Group_3__1"


    // $ANTLR start "rule__Frame__Group_3__1__Impl"
    // InternalNowereBycicleDsl.g:1724:1: rule__Frame__Group_3__1__Impl : ( ( rule__Frame__PriceAssignment_3_1 ) ) ;
    public final void rule__Frame__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:1728:1: ( ( ( rule__Frame__PriceAssignment_3_1 ) ) )
            // InternalNowereBycicleDsl.g:1729:1: ( ( rule__Frame__PriceAssignment_3_1 ) )
            {
            // InternalNowereBycicleDsl.g:1729:1: ( ( rule__Frame__PriceAssignment_3_1 ) )
            // InternalNowereBycicleDsl.g:1730:2: ( rule__Frame__PriceAssignment_3_1 )
            {
             before(grammarAccess.getFrameAccess().getPriceAssignment_3_1()); 
            // InternalNowereBycicleDsl.g:1731:2: ( rule__Frame__PriceAssignment_3_1 )
            // InternalNowereBycicleDsl.g:1731:3: rule__Frame__PriceAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Frame__PriceAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getFrameAccess().getPriceAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frame__Group_3__1__Impl"


    // $ANTLR start "rule__Frame__Group_4__0"
    // InternalNowereBycicleDsl.g:1740:1: rule__Frame__Group_4__0 : rule__Frame__Group_4__0__Impl rule__Frame__Group_4__1 ;
    public final void rule__Frame__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:1744:1: ( rule__Frame__Group_4__0__Impl rule__Frame__Group_4__1 )
            // InternalNowereBycicleDsl.g:1745:2: rule__Frame__Group_4__0__Impl rule__Frame__Group_4__1
            {
            pushFollow(FOLLOW_19);
            rule__Frame__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Frame__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frame__Group_4__0"


    // $ANTLR start "rule__Frame__Group_4__0__Impl"
    // InternalNowereBycicleDsl.g:1752:1: rule__Frame__Group_4__0__Impl : ( 'manufacturer' ) ;
    public final void rule__Frame__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:1756:1: ( ( 'manufacturer' ) )
            // InternalNowereBycicleDsl.g:1757:1: ( 'manufacturer' )
            {
            // InternalNowereBycicleDsl.g:1757:1: ( 'manufacturer' )
            // InternalNowereBycicleDsl.g:1758:2: 'manufacturer'
            {
             before(grammarAccess.getFrameAccess().getManufacturerKeyword_4_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getFrameAccess().getManufacturerKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frame__Group_4__0__Impl"


    // $ANTLR start "rule__Frame__Group_4__1"
    // InternalNowereBycicleDsl.g:1767:1: rule__Frame__Group_4__1 : rule__Frame__Group_4__1__Impl ;
    public final void rule__Frame__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:1771:1: ( rule__Frame__Group_4__1__Impl )
            // InternalNowereBycicleDsl.g:1772:2: rule__Frame__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Frame__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frame__Group_4__1"


    // $ANTLR start "rule__Frame__Group_4__1__Impl"
    // InternalNowereBycicleDsl.g:1778:1: rule__Frame__Group_4__1__Impl : ( ( rule__Frame__ManufacturerAssignment_4_1 ) ) ;
    public final void rule__Frame__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:1782:1: ( ( ( rule__Frame__ManufacturerAssignment_4_1 ) ) )
            // InternalNowereBycicleDsl.g:1783:1: ( ( rule__Frame__ManufacturerAssignment_4_1 ) )
            {
            // InternalNowereBycicleDsl.g:1783:1: ( ( rule__Frame__ManufacturerAssignment_4_1 ) )
            // InternalNowereBycicleDsl.g:1784:2: ( rule__Frame__ManufacturerAssignment_4_1 )
            {
             before(grammarAccess.getFrameAccess().getManufacturerAssignment_4_1()); 
            // InternalNowereBycicleDsl.g:1785:2: ( rule__Frame__ManufacturerAssignment_4_1 )
            // InternalNowereBycicleDsl.g:1785:3: rule__Frame__ManufacturerAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Frame__ManufacturerAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getFrameAccess().getManufacturerAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frame__Group_4__1__Impl"


    // $ANTLR start "rule__Frame__Group_5__0"
    // InternalNowereBycicleDsl.g:1794:1: rule__Frame__Group_5__0 : rule__Frame__Group_5__0__Impl rule__Frame__Group_5__1 ;
    public final void rule__Frame__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:1798:1: ( rule__Frame__Group_5__0__Impl rule__Frame__Group_5__1 )
            // InternalNowereBycicleDsl.g:1799:2: rule__Frame__Group_5__0__Impl rule__Frame__Group_5__1
            {
            pushFollow(FOLLOW_20);
            rule__Frame__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Frame__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frame__Group_5__0"


    // $ANTLR start "rule__Frame__Group_5__0__Impl"
    // InternalNowereBycicleDsl.g:1806:1: rule__Frame__Group_5__0__Impl : ( 'frameType' ) ;
    public final void rule__Frame__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:1810:1: ( ( 'frameType' ) )
            // InternalNowereBycicleDsl.g:1811:1: ( 'frameType' )
            {
            // InternalNowereBycicleDsl.g:1811:1: ( 'frameType' )
            // InternalNowereBycicleDsl.g:1812:2: 'frameType'
            {
             before(grammarAccess.getFrameAccess().getFrameTypeKeyword_5_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getFrameAccess().getFrameTypeKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frame__Group_5__0__Impl"


    // $ANTLR start "rule__Frame__Group_5__1"
    // InternalNowereBycicleDsl.g:1821:1: rule__Frame__Group_5__1 : rule__Frame__Group_5__1__Impl ;
    public final void rule__Frame__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:1825:1: ( rule__Frame__Group_5__1__Impl )
            // InternalNowereBycicleDsl.g:1826:2: rule__Frame__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Frame__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frame__Group_5__1"


    // $ANTLR start "rule__Frame__Group_5__1__Impl"
    // InternalNowereBycicleDsl.g:1832:1: rule__Frame__Group_5__1__Impl : ( ( rule__Frame__FrameTypeAssignment_5_1 ) ) ;
    public final void rule__Frame__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:1836:1: ( ( ( rule__Frame__FrameTypeAssignment_5_1 ) ) )
            // InternalNowereBycicleDsl.g:1837:1: ( ( rule__Frame__FrameTypeAssignment_5_1 ) )
            {
            // InternalNowereBycicleDsl.g:1837:1: ( ( rule__Frame__FrameTypeAssignment_5_1 ) )
            // InternalNowereBycicleDsl.g:1838:2: ( rule__Frame__FrameTypeAssignment_5_1 )
            {
             before(grammarAccess.getFrameAccess().getFrameTypeAssignment_5_1()); 
            // InternalNowereBycicleDsl.g:1839:2: ( rule__Frame__FrameTypeAssignment_5_1 )
            // InternalNowereBycicleDsl.g:1839:3: rule__Frame__FrameTypeAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Frame__FrameTypeAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getFrameAccess().getFrameTypeAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frame__Group_5__1__Impl"


    // $ANTLR start "rule__Frame__Group_6__0"
    // InternalNowereBycicleDsl.g:1848:1: rule__Frame__Group_6__0 : rule__Frame__Group_6__0__Impl rule__Frame__Group_6__1 ;
    public final void rule__Frame__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:1852:1: ( rule__Frame__Group_6__0__Impl rule__Frame__Group_6__1 )
            // InternalNowereBycicleDsl.g:1853:2: rule__Frame__Group_6__0__Impl rule__Frame__Group_6__1
            {
            pushFollow(FOLLOW_21);
            rule__Frame__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Frame__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frame__Group_6__0"


    // $ANTLR start "rule__Frame__Group_6__0__Impl"
    // InternalNowereBycicleDsl.g:1860:1: rule__Frame__Group_6__0__Impl : ( 'color' ) ;
    public final void rule__Frame__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:1864:1: ( ( 'color' ) )
            // InternalNowereBycicleDsl.g:1865:1: ( 'color' )
            {
            // InternalNowereBycicleDsl.g:1865:1: ( 'color' )
            // InternalNowereBycicleDsl.g:1866:2: 'color'
            {
             before(grammarAccess.getFrameAccess().getColorKeyword_6_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getFrameAccess().getColorKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frame__Group_6__0__Impl"


    // $ANTLR start "rule__Frame__Group_6__1"
    // InternalNowereBycicleDsl.g:1875:1: rule__Frame__Group_6__1 : rule__Frame__Group_6__1__Impl ;
    public final void rule__Frame__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:1879:1: ( rule__Frame__Group_6__1__Impl )
            // InternalNowereBycicleDsl.g:1880:2: rule__Frame__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Frame__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frame__Group_6__1"


    // $ANTLR start "rule__Frame__Group_6__1__Impl"
    // InternalNowereBycicleDsl.g:1886:1: rule__Frame__Group_6__1__Impl : ( ( rule__Frame__ColorAssignment_6_1 ) ) ;
    public final void rule__Frame__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:1890:1: ( ( ( rule__Frame__ColorAssignment_6_1 ) ) )
            // InternalNowereBycicleDsl.g:1891:1: ( ( rule__Frame__ColorAssignment_6_1 ) )
            {
            // InternalNowereBycicleDsl.g:1891:1: ( ( rule__Frame__ColorAssignment_6_1 ) )
            // InternalNowereBycicleDsl.g:1892:2: ( rule__Frame__ColorAssignment_6_1 )
            {
             before(grammarAccess.getFrameAccess().getColorAssignment_6_1()); 
            // InternalNowereBycicleDsl.g:1893:2: ( rule__Frame__ColorAssignment_6_1 )
            // InternalNowereBycicleDsl.g:1893:3: rule__Frame__ColorAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Frame__ColorAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getFrameAccess().getColorAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frame__Group_6__1__Impl"


    // $ANTLR start "rule__Wheel__Group__0"
    // InternalNowereBycicleDsl.g:1902:1: rule__Wheel__Group__0 : rule__Wheel__Group__0__Impl rule__Wheel__Group__1 ;
    public final void rule__Wheel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:1906:1: ( rule__Wheel__Group__0__Impl rule__Wheel__Group__1 )
            // InternalNowereBycicleDsl.g:1907:2: rule__Wheel__Group__0__Impl rule__Wheel__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__Wheel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Wheel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wheel__Group__0"


    // $ANTLR start "rule__Wheel__Group__0__Impl"
    // InternalNowereBycicleDsl.g:1914:1: rule__Wheel__Group__0__Impl : ( () ) ;
    public final void rule__Wheel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:1918:1: ( ( () ) )
            // InternalNowereBycicleDsl.g:1919:1: ( () )
            {
            // InternalNowereBycicleDsl.g:1919:1: ( () )
            // InternalNowereBycicleDsl.g:1920:2: ()
            {
             before(grammarAccess.getWheelAccess().getWheelAction_0()); 
            // InternalNowereBycicleDsl.g:1921:2: ()
            // InternalNowereBycicleDsl.g:1921:3: 
            {
            }

             after(grammarAccess.getWheelAccess().getWheelAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wheel__Group__0__Impl"


    // $ANTLR start "rule__Wheel__Group__1"
    // InternalNowereBycicleDsl.g:1929:1: rule__Wheel__Group__1 : rule__Wheel__Group__1__Impl rule__Wheel__Group__2 ;
    public final void rule__Wheel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:1933:1: ( rule__Wheel__Group__1__Impl rule__Wheel__Group__2 )
            // InternalNowereBycicleDsl.g:1934:2: rule__Wheel__Group__1__Impl rule__Wheel__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Wheel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Wheel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wheel__Group__1"


    // $ANTLR start "rule__Wheel__Group__1__Impl"
    // InternalNowereBycicleDsl.g:1941:1: rule__Wheel__Group__1__Impl : ( 'Wheel' ) ;
    public final void rule__Wheel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:1945:1: ( ( 'Wheel' ) )
            // InternalNowereBycicleDsl.g:1946:1: ( 'Wheel' )
            {
            // InternalNowereBycicleDsl.g:1946:1: ( 'Wheel' )
            // InternalNowereBycicleDsl.g:1947:2: 'Wheel'
            {
             before(grammarAccess.getWheelAccess().getWheelKeyword_1()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getWheelAccess().getWheelKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wheel__Group__1__Impl"


    // $ANTLR start "rule__Wheel__Group__2"
    // InternalNowereBycicleDsl.g:1956:1: rule__Wheel__Group__2 : rule__Wheel__Group__2__Impl rule__Wheel__Group__3 ;
    public final void rule__Wheel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:1960:1: ( rule__Wheel__Group__2__Impl rule__Wheel__Group__3 )
            // InternalNowereBycicleDsl.g:1961:2: rule__Wheel__Group__2__Impl rule__Wheel__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__Wheel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Wheel__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wheel__Group__2"


    // $ANTLR start "rule__Wheel__Group__2__Impl"
    // InternalNowereBycicleDsl.g:1968:1: rule__Wheel__Group__2__Impl : ( ( rule__Wheel__NameAssignment_2 ) ) ;
    public final void rule__Wheel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:1972:1: ( ( ( rule__Wheel__NameAssignment_2 ) ) )
            // InternalNowereBycicleDsl.g:1973:1: ( ( rule__Wheel__NameAssignment_2 ) )
            {
            // InternalNowereBycicleDsl.g:1973:1: ( ( rule__Wheel__NameAssignment_2 ) )
            // InternalNowereBycicleDsl.g:1974:2: ( rule__Wheel__NameAssignment_2 )
            {
             before(grammarAccess.getWheelAccess().getNameAssignment_2()); 
            // InternalNowereBycicleDsl.g:1975:2: ( rule__Wheel__NameAssignment_2 )
            // InternalNowereBycicleDsl.g:1975:3: rule__Wheel__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Wheel__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getWheelAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wheel__Group__2__Impl"


    // $ANTLR start "rule__Wheel__Group__3"
    // InternalNowereBycicleDsl.g:1983:1: rule__Wheel__Group__3 : rule__Wheel__Group__3__Impl rule__Wheel__Group__4 ;
    public final void rule__Wheel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:1987:1: ( rule__Wheel__Group__3__Impl rule__Wheel__Group__4 )
            // InternalNowereBycicleDsl.g:1988:2: rule__Wheel__Group__3__Impl rule__Wheel__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__Wheel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Wheel__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wheel__Group__3"


    // $ANTLR start "rule__Wheel__Group__3__Impl"
    // InternalNowereBycicleDsl.g:1995:1: rule__Wheel__Group__3__Impl : ( ( rule__Wheel__Group_3__0 )? ) ;
    public final void rule__Wheel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:1999:1: ( ( ( rule__Wheel__Group_3__0 )? ) )
            // InternalNowereBycicleDsl.g:2000:1: ( ( rule__Wheel__Group_3__0 )? )
            {
            // InternalNowereBycicleDsl.g:2000:1: ( ( rule__Wheel__Group_3__0 )? )
            // InternalNowereBycicleDsl.g:2001:2: ( rule__Wheel__Group_3__0 )?
            {
             before(grammarAccess.getWheelAccess().getGroup_3()); 
            // InternalNowereBycicleDsl.g:2002:2: ( rule__Wheel__Group_3__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==39) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalNowereBycicleDsl.g:2002:3: rule__Wheel__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Wheel__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWheelAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wheel__Group__3__Impl"


    // $ANTLR start "rule__Wheel__Group__4"
    // InternalNowereBycicleDsl.g:2010:1: rule__Wheel__Group__4 : rule__Wheel__Group__4__Impl ;
    public final void rule__Wheel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:2014:1: ( rule__Wheel__Group__4__Impl )
            // InternalNowereBycicleDsl.g:2015:2: rule__Wheel__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Wheel__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wheel__Group__4"


    // $ANTLR start "rule__Wheel__Group__4__Impl"
    // InternalNowereBycicleDsl.g:2021:1: rule__Wheel__Group__4__Impl : ( ( rule__Wheel__Group_4__0 )? ) ;
    public final void rule__Wheel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:2025:1: ( ( ( rule__Wheel__Group_4__0 )? ) )
            // InternalNowereBycicleDsl.g:2026:1: ( ( rule__Wheel__Group_4__0 )? )
            {
            // InternalNowereBycicleDsl.g:2026:1: ( ( rule__Wheel__Group_4__0 )? )
            // InternalNowereBycicleDsl.g:2027:2: ( rule__Wheel__Group_4__0 )?
            {
             before(grammarAccess.getWheelAccess().getGroup_4()); 
            // InternalNowereBycicleDsl.g:2028:2: ( rule__Wheel__Group_4__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==40) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalNowereBycicleDsl.g:2028:3: rule__Wheel__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Wheel__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWheelAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wheel__Group__4__Impl"


    // $ANTLR start "rule__Wheel__Group_3__0"
    // InternalNowereBycicleDsl.g:2037:1: rule__Wheel__Group_3__0 : rule__Wheel__Group_3__0__Impl rule__Wheel__Group_3__1 ;
    public final void rule__Wheel__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:2041:1: ( rule__Wheel__Group_3__0__Impl rule__Wheel__Group_3__1 )
            // InternalNowereBycicleDsl.g:2042:2: rule__Wheel__Group_3__0__Impl rule__Wheel__Group_3__1
            {
            pushFollow(FOLLOW_18);
            rule__Wheel__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Wheel__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wheel__Group_3__0"


    // $ANTLR start "rule__Wheel__Group_3__0__Impl"
    // InternalNowereBycicleDsl.g:2049:1: rule__Wheel__Group_3__0__Impl : ( 'price' ) ;
    public final void rule__Wheel__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:2053:1: ( ( 'price' ) )
            // InternalNowereBycicleDsl.g:2054:1: ( 'price' )
            {
            // InternalNowereBycicleDsl.g:2054:1: ( 'price' )
            // InternalNowereBycicleDsl.g:2055:2: 'price'
            {
             before(grammarAccess.getWheelAccess().getPriceKeyword_3_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getWheelAccess().getPriceKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wheel__Group_3__0__Impl"


    // $ANTLR start "rule__Wheel__Group_3__1"
    // InternalNowereBycicleDsl.g:2064:1: rule__Wheel__Group_3__1 : rule__Wheel__Group_3__1__Impl ;
    public final void rule__Wheel__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:2068:1: ( rule__Wheel__Group_3__1__Impl )
            // InternalNowereBycicleDsl.g:2069:2: rule__Wheel__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Wheel__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wheel__Group_3__1"


    // $ANTLR start "rule__Wheel__Group_3__1__Impl"
    // InternalNowereBycicleDsl.g:2075:1: rule__Wheel__Group_3__1__Impl : ( ( rule__Wheel__PriceAssignment_3_1 ) ) ;
    public final void rule__Wheel__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:2079:1: ( ( ( rule__Wheel__PriceAssignment_3_1 ) ) )
            // InternalNowereBycicleDsl.g:2080:1: ( ( rule__Wheel__PriceAssignment_3_1 ) )
            {
            // InternalNowereBycicleDsl.g:2080:1: ( ( rule__Wheel__PriceAssignment_3_1 ) )
            // InternalNowereBycicleDsl.g:2081:2: ( rule__Wheel__PriceAssignment_3_1 )
            {
             before(grammarAccess.getWheelAccess().getPriceAssignment_3_1()); 
            // InternalNowereBycicleDsl.g:2082:2: ( rule__Wheel__PriceAssignment_3_1 )
            // InternalNowereBycicleDsl.g:2082:3: rule__Wheel__PriceAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Wheel__PriceAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getWheelAccess().getPriceAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wheel__Group_3__1__Impl"


    // $ANTLR start "rule__Wheel__Group_4__0"
    // InternalNowereBycicleDsl.g:2091:1: rule__Wheel__Group_4__0 : rule__Wheel__Group_4__0__Impl rule__Wheel__Group_4__1 ;
    public final void rule__Wheel__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:2095:1: ( rule__Wheel__Group_4__0__Impl rule__Wheel__Group_4__1 )
            // InternalNowereBycicleDsl.g:2096:2: rule__Wheel__Group_4__0__Impl rule__Wheel__Group_4__1
            {
            pushFollow(FOLLOW_19);
            rule__Wheel__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Wheel__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wheel__Group_4__0"


    // $ANTLR start "rule__Wheel__Group_4__0__Impl"
    // InternalNowereBycicleDsl.g:2103:1: rule__Wheel__Group_4__0__Impl : ( 'manufacturer' ) ;
    public final void rule__Wheel__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:2107:1: ( ( 'manufacturer' ) )
            // InternalNowereBycicleDsl.g:2108:1: ( 'manufacturer' )
            {
            // InternalNowereBycicleDsl.g:2108:1: ( 'manufacturer' )
            // InternalNowereBycicleDsl.g:2109:2: 'manufacturer'
            {
             before(grammarAccess.getWheelAccess().getManufacturerKeyword_4_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getWheelAccess().getManufacturerKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wheel__Group_4__0__Impl"


    // $ANTLR start "rule__Wheel__Group_4__1"
    // InternalNowereBycicleDsl.g:2118:1: rule__Wheel__Group_4__1 : rule__Wheel__Group_4__1__Impl ;
    public final void rule__Wheel__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:2122:1: ( rule__Wheel__Group_4__1__Impl )
            // InternalNowereBycicleDsl.g:2123:2: rule__Wheel__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Wheel__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wheel__Group_4__1"


    // $ANTLR start "rule__Wheel__Group_4__1__Impl"
    // InternalNowereBycicleDsl.g:2129:1: rule__Wheel__Group_4__1__Impl : ( ( rule__Wheel__ManufacturerAssignment_4_1 ) ) ;
    public final void rule__Wheel__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:2133:1: ( ( ( rule__Wheel__ManufacturerAssignment_4_1 ) ) )
            // InternalNowereBycicleDsl.g:2134:1: ( ( rule__Wheel__ManufacturerAssignment_4_1 ) )
            {
            // InternalNowereBycicleDsl.g:2134:1: ( ( rule__Wheel__ManufacturerAssignment_4_1 ) )
            // InternalNowereBycicleDsl.g:2135:2: ( rule__Wheel__ManufacturerAssignment_4_1 )
            {
             before(grammarAccess.getWheelAccess().getManufacturerAssignment_4_1()); 
            // InternalNowereBycicleDsl.g:2136:2: ( rule__Wheel__ManufacturerAssignment_4_1 )
            // InternalNowereBycicleDsl.g:2136:3: rule__Wheel__ManufacturerAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Wheel__ManufacturerAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getWheelAccess().getManufacturerAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wheel__Group_4__1__Impl"


    // $ANTLR start "rule__InnerGear__Group__0"
    // InternalNowereBycicleDsl.g:2145:1: rule__InnerGear__Group__0 : rule__InnerGear__Group__0__Impl rule__InnerGear__Group__1 ;
    public final void rule__InnerGear__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:2149:1: ( rule__InnerGear__Group__0__Impl rule__InnerGear__Group__1 )
            // InternalNowereBycicleDsl.g:2150:2: rule__InnerGear__Group__0__Impl rule__InnerGear__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__InnerGear__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InnerGear__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerGear__Group__0"


    // $ANTLR start "rule__InnerGear__Group__0__Impl"
    // InternalNowereBycicleDsl.g:2157:1: rule__InnerGear__Group__0__Impl : ( () ) ;
    public final void rule__InnerGear__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:2161:1: ( ( () ) )
            // InternalNowereBycicleDsl.g:2162:1: ( () )
            {
            // InternalNowereBycicleDsl.g:2162:1: ( () )
            // InternalNowereBycicleDsl.g:2163:2: ()
            {
             before(grammarAccess.getInnerGearAccess().getInnerGearAction_0()); 
            // InternalNowereBycicleDsl.g:2164:2: ()
            // InternalNowereBycicleDsl.g:2164:3: 
            {
            }

             after(grammarAccess.getInnerGearAccess().getInnerGearAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerGear__Group__0__Impl"


    // $ANTLR start "rule__InnerGear__Group__1"
    // InternalNowereBycicleDsl.g:2172:1: rule__InnerGear__Group__1 : rule__InnerGear__Group__1__Impl rule__InnerGear__Group__2 ;
    public final void rule__InnerGear__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:2176:1: ( rule__InnerGear__Group__1__Impl rule__InnerGear__Group__2 )
            // InternalNowereBycicleDsl.g:2177:2: rule__InnerGear__Group__1__Impl rule__InnerGear__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__InnerGear__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InnerGear__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerGear__Group__1"


    // $ANTLR start "rule__InnerGear__Group__1__Impl"
    // InternalNowereBycicleDsl.g:2184:1: rule__InnerGear__Group__1__Impl : ( 'InnerGear' ) ;
    public final void rule__InnerGear__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:2188:1: ( ( 'InnerGear' ) )
            // InternalNowereBycicleDsl.g:2189:1: ( 'InnerGear' )
            {
            // InternalNowereBycicleDsl.g:2189:1: ( 'InnerGear' )
            // InternalNowereBycicleDsl.g:2190:2: 'InnerGear'
            {
             before(grammarAccess.getInnerGearAccess().getInnerGearKeyword_1()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getInnerGearAccess().getInnerGearKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerGear__Group__1__Impl"


    // $ANTLR start "rule__InnerGear__Group__2"
    // InternalNowereBycicleDsl.g:2199:1: rule__InnerGear__Group__2 : rule__InnerGear__Group__2__Impl rule__InnerGear__Group__3 ;
    public final void rule__InnerGear__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:2203:1: ( rule__InnerGear__Group__2__Impl rule__InnerGear__Group__3 )
            // InternalNowereBycicleDsl.g:2204:2: rule__InnerGear__Group__2__Impl rule__InnerGear__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__InnerGear__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InnerGear__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerGear__Group__2"


    // $ANTLR start "rule__InnerGear__Group__2__Impl"
    // InternalNowereBycicleDsl.g:2211:1: rule__InnerGear__Group__2__Impl : ( ( rule__InnerGear__NameAssignment_2 ) ) ;
    public final void rule__InnerGear__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:2215:1: ( ( ( rule__InnerGear__NameAssignment_2 ) ) )
            // InternalNowereBycicleDsl.g:2216:1: ( ( rule__InnerGear__NameAssignment_2 ) )
            {
            // InternalNowereBycicleDsl.g:2216:1: ( ( rule__InnerGear__NameAssignment_2 ) )
            // InternalNowereBycicleDsl.g:2217:2: ( rule__InnerGear__NameAssignment_2 )
            {
             before(grammarAccess.getInnerGearAccess().getNameAssignment_2()); 
            // InternalNowereBycicleDsl.g:2218:2: ( rule__InnerGear__NameAssignment_2 )
            // InternalNowereBycicleDsl.g:2218:3: rule__InnerGear__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__InnerGear__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInnerGearAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerGear__Group__2__Impl"


    // $ANTLR start "rule__InnerGear__Group__3"
    // InternalNowereBycicleDsl.g:2226:1: rule__InnerGear__Group__3 : rule__InnerGear__Group__3__Impl rule__InnerGear__Group__4 ;
    public final void rule__InnerGear__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:2230:1: ( rule__InnerGear__Group__3__Impl rule__InnerGear__Group__4 )
            // InternalNowereBycicleDsl.g:2231:2: rule__InnerGear__Group__3__Impl rule__InnerGear__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__InnerGear__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InnerGear__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerGear__Group__3"


    // $ANTLR start "rule__InnerGear__Group__3__Impl"
    // InternalNowereBycicleDsl.g:2238:1: rule__InnerGear__Group__3__Impl : ( ( rule__InnerGear__Group_3__0 )? ) ;
    public final void rule__InnerGear__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:2242:1: ( ( ( rule__InnerGear__Group_3__0 )? ) )
            // InternalNowereBycicleDsl.g:2243:1: ( ( rule__InnerGear__Group_3__0 )? )
            {
            // InternalNowereBycicleDsl.g:2243:1: ( ( rule__InnerGear__Group_3__0 )? )
            // InternalNowereBycicleDsl.g:2244:2: ( rule__InnerGear__Group_3__0 )?
            {
             before(grammarAccess.getInnerGearAccess().getGroup_3()); 
            // InternalNowereBycicleDsl.g:2245:2: ( rule__InnerGear__Group_3__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==39) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalNowereBycicleDsl.g:2245:3: rule__InnerGear__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InnerGear__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInnerGearAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerGear__Group__3__Impl"


    // $ANTLR start "rule__InnerGear__Group__4"
    // InternalNowereBycicleDsl.g:2253:1: rule__InnerGear__Group__4 : rule__InnerGear__Group__4__Impl ;
    public final void rule__InnerGear__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:2257:1: ( rule__InnerGear__Group__4__Impl )
            // InternalNowereBycicleDsl.g:2258:2: rule__InnerGear__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InnerGear__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerGear__Group__4"


    // $ANTLR start "rule__InnerGear__Group__4__Impl"
    // InternalNowereBycicleDsl.g:2264:1: rule__InnerGear__Group__4__Impl : ( ( rule__InnerGear__Group_4__0 )? ) ;
    public final void rule__InnerGear__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:2268:1: ( ( ( rule__InnerGear__Group_4__0 )? ) )
            // InternalNowereBycicleDsl.g:2269:1: ( ( rule__InnerGear__Group_4__0 )? )
            {
            // InternalNowereBycicleDsl.g:2269:1: ( ( rule__InnerGear__Group_4__0 )? )
            // InternalNowereBycicleDsl.g:2270:2: ( rule__InnerGear__Group_4__0 )?
            {
             before(grammarAccess.getInnerGearAccess().getGroup_4()); 
            // InternalNowereBycicleDsl.g:2271:2: ( rule__InnerGear__Group_4__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==40) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalNowereBycicleDsl.g:2271:3: rule__InnerGear__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InnerGear__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInnerGearAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerGear__Group__4__Impl"


    // $ANTLR start "rule__InnerGear__Group_3__0"
    // InternalNowereBycicleDsl.g:2280:1: rule__InnerGear__Group_3__0 : rule__InnerGear__Group_3__0__Impl rule__InnerGear__Group_3__1 ;
    public final void rule__InnerGear__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:2284:1: ( rule__InnerGear__Group_3__0__Impl rule__InnerGear__Group_3__1 )
            // InternalNowereBycicleDsl.g:2285:2: rule__InnerGear__Group_3__0__Impl rule__InnerGear__Group_3__1
            {
            pushFollow(FOLLOW_18);
            rule__InnerGear__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InnerGear__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerGear__Group_3__0"


    // $ANTLR start "rule__InnerGear__Group_3__0__Impl"
    // InternalNowereBycicleDsl.g:2292:1: rule__InnerGear__Group_3__0__Impl : ( 'price' ) ;
    public final void rule__InnerGear__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:2296:1: ( ( 'price' ) )
            // InternalNowereBycicleDsl.g:2297:1: ( 'price' )
            {
            // InternalNowereBycicleDsl.g:2297:1: ( 'price' )
            // InternalNowereBycicleDsl.g:2298:2: 'price'
            {
             before(grammarAccess.getInnerGearAccess().getPriceKeyword_3_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getInnerGearAccess().getPriceKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerGear__Group_3__0__Impl"


    // $ANTLR start "rule__InnerGear__Group_3__1"
    // InternalNowereBycicleDsl.g:2307:1: rule__InnerGear__Group_3__1 : rule__InnerGear__Group_3__1__Impl ;
    public final void rule__InnerGear__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:2311:1: ( rule__InnerGear__Group_3__1__Impl )
            // InternalNowereBycicleDsl.g:2312:2: rule__InnerGear__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InnerGear__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerGear__Group_3__1"


    // $ANTLR start "rule__InnerGear__Group_3__1__Impl"
    // InternalNowereBycicleDsl.g:2318:1: rule__InnerGear__Group_3__1__Impl : ( ( rule__InnerGear__PriceAssignment_3_1 ) ) ;
    public final void rule__InnerGear__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:2322:1: ( ( ( rule__InnerGear__PriceAssignment_3_1 ) ) )
            // InternalNowereBycicleDsl.g:2323:1: ( ( rule__InnerGear__PriceAssignment_3_1 ) )
            {
            // InternalNowereBycicleDsl.g:2323:1: ( ( rule__InnerGear__PriceAssignment_3_1 ) )
            // InternalNowereBycicleDsl.g:2324:2: ( rule__InnerGear__PriceAssignment_3_1 )
            {
             before(grammarAccess.getInnerGearAccess().getPriceAssignment_3_1()); 
            // InternalNowereBycicleDsl.g:2325:2: ( rule__InnerGear__PriceAssignment_3_1 )
            // InternalNowereBycicleDsl.g:2325:3: rule__InnerGear__PriceAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__InnerGear__PriceAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getInnerGearAccess().getPriceAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerGear__Group_3__1__Impl"


    // $ANTLR start "rule__InnerGear__Group_4__0"
    // InternalNowereBycicleDsl.g:2334:1: rule__InnerGear__Group_4__0 : rule__InnerGear__Group_4__0__Impl rule__InnerGear__Group_4__1 ;
    public final void rule__InnerGear__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:2338:1: ( rule__InnerGear__Group_4__0__Impl rule__InnerGear__Group_4__1 )
            // InternalNowereBycicleDsl.g:2339:2: rule__InnerGear__Group_4__0__Impl rule__InnerGear__Group_4__1
            {
            pushFollow(FOLLOW_19);
            rule__InnerGear__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InnerGear__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerGear__Group_4__0"


    // $ANTLR start "rule__InnerGear__Group_4__0__Impl"
    // InternalNowereBycicleDsl.g:2346:1: rule__InnerGear__Group_4__0__Impl : ( 'manufacturer' ) ;
    public final void rule__InnerGear__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:2350:1: ( ( 'manufacturer' ) )
            // InternalNowereBycicleDsl.g:2351:1: ( 'manufacturer' )
            {
            // InternalNowereBycicleDsl.g:2351:1: ( 'manufacturer' )
            // InternalNowereBycicleDsl.g:2352:2: 'manufacturer'
            {
             before(grammarAccess.getInnerGearAccess().getManufacturerKeyword_4_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getInnerGearAccess().getManufacturerKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerGear__Group_4__0__Impl"


    // $ANTLR start "rule__InnerGear__Group_4__1"
    // InternalNowereBycicleDsl.g:2361:1: rule__InnerGear__Group_4__1 : rule__InnerGear__Group_4__1__Impl ;
    public final void rule__InnerGear__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:2365:1: ( rule__InnerGear__Group_4__1__Impl )
            // InternalNowereBycicleDsl.g:2366:2: rule__InnerGear__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InnerGear__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerGear__Group_4__1"


    // $ANTLR start "rule__InnerGear__Group_4__1__Impl"
    // InternalNowereBycicleDsl.g:2372:1: rule__InnerGear__Group_4__1__Impl : ( ( rule__InnerGear__ManufacturerAssignment_4_1 ) ) ;
    public final void rule__InnerGear__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:2376:1: ( ( ( rule__InnerGear__ManufacturerAssignment_4_1 ) ) )
            // InternalNowereBycicleDsl.g:2377:1: ( ( rule__InnerGear__ManufacturerAssignment_4_1 ) )
            {
            // InternalNowereBycicleDsl.g:2377:1: ( ( rule__InnerGear__ManufacturerAssignment_4_1 ) )
            // InternalNowereBycicleDsl.g:2378:2: ( rule__InnerGear__ManufacturerAssignment_4_1 )
            {
             before(grammarAccess.getInnerGearAccess().getManufacturerAssignment_4_1()); 
            // InternalNowereBycicleDsl.g:2379:2: ( rule__InnerGear__ManufacturerAssignment_4_1 )
            // InternalNowereBycicleDsl.g:2379:3: rule__InnerGear__ManufacturerAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__InnerGear__ManufacturerAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getInnerGearAccess().getManufacturerAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerGear__Group_4__1__Impl"


    // $ANTLR start "rule__OuterGear__Group__0"
    // InternalNowereBycicleDsl.g:2388:1: rule__OuterGear__Group__0 : rule__OuterGear__Group__0__Impl rule__OuterGear__Group__1 ;
    public final void rule__OuterGear__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:2392:1: ( rule__OuterGear__Group__0__Impl rule__OuterGear__Group__1 )
            // InternalNowereBycicleDsl.g:2393:2: rule__OuterGear__Group__0__Impl rule__OuterGear__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__OuterGear__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OuterGear__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OuterGear__Group__0"


    // $ANTLR start "rule__OuterGear__Group__0__Impl"
    // InternalNowereBycicleDsl.g:2400:1: rule__OuterGear__Group__0__Impl : ( () ) ;
    public final void rule__OuterGear__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:2404:1: ( ( () ) )
            // InternalNowereBycicleDsl.g:2405:1: ( () )
            {
            // InternalNowereBycicleDsl.g:2405:1: ( () )
            // InternalNowereBycicleDsl.g:2406:2: ()
            {
             before(grammarAccess.getOuterGearAccess().getOuterGearAction_0()); 
            // InternalNowereBycicleDsl.g:2407:2: ()
            // InternalNowereBycicleDsl.g:2407:3: 
            {
            }

             after(grammarAccess.getOuterGearAccess().getOuterGearAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OuterGear__Group__0__Impl"


    // $ANTLR start "rule__OuterGear__Group__1"
    // InternalNowereBycicleDsl.g:2415:1: rule__OuterGear__Group__1 : rule__OuterGear__Group__1__Impl rule__OuterGear__Group__2 ;
    public final void rule__OuterGear__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:2419:1: ( rule__OuterGear__Group__1__Impl rule__OuterGear__Group__2 )
            // InternalNowereBycicleDsl.g:2420:2: rule__OuterGear__Group__1__Impl rule__OuterGear__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__OuterGear__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OuterGear__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OuterGear__Group__1"


    // $ANTLR start "rule__OuterGear__Group__1__Impl"
    // InternalNowereBycicleDsl.g:2427:1: rule__OuterGear__Group__1__Impl : ( 'OuterGear' ) ;
    public final void rule__OuterGear__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:2431:1: ( ( 'OuterGear' ) )
            // InternalNowereBycicleDsl.g:2432:1: ( 'OuterGear' )
            {
            // InternalNowereBycicleDsl.g:2432:1: ( 'OuterGear' )
            // InternalNowereBycicleDsl.g:2433:2: 'OuterGear'
            {
             before(grammarAccess.getOuterGearAccess().getOuterGearKeyword_1()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getOuterGearAccess().getOuterGearKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OuterGear__Group__1__Impl"


    // $ANTLR start "rule__OuterGear__Group__2"
    // InternalNowereBycicleDsl.g:2442:1: rule__OuterGear__Group__2 : rule__OuterGear__Group__2__Impl rule__OuterGear__Group__3 ;
    public final void rule__OuterGear__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:2446:1: ( rule__OuterGear__Group__2__Impl rule__OuterGear__Group__3 )
            // InternalNowereBycicleDsl.g:2447:2: rule__OuterGear__Group__2__Impl rule__OuterGear__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__OuterGear__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OuterGear__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OuterGear__Group__2"


    // $ANTLR start "rule__OuterGear__Group__2__Impl"
    // InternalNowereBycicleDsl.g:2454:1: rule__OuterGear__Group__2__Impl : ( ( rule__OuterGear__NameAssignment_2 ) ) ;
    public final void rule__OuterGear__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:2458:1: ( ( ( rule__OuterGear__NameAssignment_2 ) ) )
            // InternalNowereBycicleDsl.g:2459:1: ( ( rule__OuterGear__NameAssignment_2 ) )
            {
            // InternalNowereBycicleDsl.g:2459:1: ( ( rule__OuterGear__NameAssignment_2 ) )
            // InternalNowereBycicleDsl.g:2460:2: ( rule__OuterGear__NameAssignment_2 )
            {
             before(grammarAccess.getOuterGearAccess().getNameAssignment_2()); 
            // InternalNowereBycicleDsl.g:2461:2: ( rule__OuterGear__NameAssignment_2 )
            // InternalNowereBycicleDsl.g:2461:3: rule__OuterGear__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__OuterGear__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOuterGearAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OuterGear__Group__2__Impl"


    // $ANTLR start "rule__OuterGear__Group__3"
    // InternalNowereBycicleDsl.g:2469:1: rule__OuterGear__Group__3 : rule__OuterGear__Group__3__Impl rule__OuterGear__Group__4 ;
    public final void rule__OuterGear__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:2473:1: ( rule__OuterGear__Group__3__Impl rule__OuterGear__Group__4 )
            // InternalNowereBycicleDsl.g:2474:2: rule__OuterGear__Group__3__Impl rule__OuterGear__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__OuterGear__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OuterGear__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OuterGear__Group__3"


    // $ANTLR start "rule__OuterGear__Group__3__Impl"
    // InternalNowereBycicleDsl.g:2481:1: rule__OuterGear__Group__3__Impl : ( ( rule__OuterGear__Group_3__0 )? ) ;
    public final void rule__OuterGear__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:2485:1: ( ( ( rule__OuterGear__Group_3__0 )? ) )
            // InternalNowereBycicleDsl.g:2486:1: ( ( rule__OuterGear__Group_3__0 )? )
            {
            // InternalNowereBycicleDsl.g:2486:1: ( ( rule__OuterGear__Group_3__0 )? )
            // InternalNowereBycicleDsl.g:2487:2: ( rule__OuterGear__Group_3__0 )?
            {
             before(grammarAccess.getOuterGearAccess().getGroup_3()); 
            // InternalNowereBycicleDsl.g:2488:2: ( rule__OuterGear__Group_3__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==39) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalNowereBycicleDsl.g:2488:3: rule__OuterGear__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OuterGear__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOuterGearAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OuterGear__Group__3__Impl"


    // $ANTLR start "rule__OuterGear__Group__4"
    // InternalNowereBycicleDsl.g:2496:1: rule__OuterGear__Group__4 : rule__OuterGear__Group__4__Impl ;
    public final void rule__OuterGear__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:2500:1: ( rule__OuterGear__Group__4__Impl )
            // InternalNowereBycicleDsl.g:2501:2: rule__OuterGear__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OuterGear__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OuterGear__Group__4"


    // $ANTLR start "rule__OuterGear__Group__4__Impl"
    // InternalNowereBycicleDsl.g:2507:1: rule__OuterGear__Group__4__Impl : ( ( rule__OuterGear__Group_4__0 )? ) ;
    public final void rule__OuterGear__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:2511:1: ( ( ( rule__OuterGear__Group_4__0 )? ) )
            // InternalNowereBycicleDsl.g:2512:1: ( ( rule__OuterGear__Group_4__0 )? )
            {
            // InternalNowereBycicleDsl.g:2512:1: ( ( rule__OuterGear__Group_4__0 )? )
            // InternalNowereBycicleDsl.g:2513:2: ( rule__OuterGear__Group_4__0 )?
            {
             before(grammarAccess.getOuterGearAccess().getGroup_4()); 
            // InternalNowereBycicleDsl.g:2514:2: ( rule__OuterGear__Group_4__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==40) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalNowereBycicleDsl.g:2514:3: rule__OuterGear__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OuterGear__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOuterGearAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OuterGear__Group__4__Impl"


    // $ANTLR start "rule__OuterGear__Group_3__0"
    // InternalNowereBycicleDsl.g:2523:1: rule__OuterGear__Group_3__0 : rule__OuterGear__Group_3__0__Impl rule__OuterGear__Group_3__1 ;
    public final void rule__OuterGear__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:2527:1: ( rule__OuterGear__Group_3__0__Impl rule__OuterGear__Group_3__1 )
            // InternalNowereBycicleDsl.g:2528:2: rule__OuterGear__Group_3__0__Impl rule__OuterGear__Group_3__1
            {
            pushFollow(FOLLOW_18);
            rule__OuterGear__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OuterGear__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OuterGear__Group_3__0"


    // $ANTLR start "rule__OuterGear__Group_3__0__Impl"
    // InternalNowereBycicleDsl.g:2535:1: rule__OuterGear__Group_3__0__Impl : ( 'price' ) ;
    public final void rule__OuterGear__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:2539:1: ( ( 'price' ) )
            // InternalNowereBycicleDsl.g:2540:1: ( 'price' )
            {
            // InternalNowereBycicleDsl.g:2540:1: ( 'price' )
            // InternalNowereBycicleDsl.g:2541:2: 'price'
            {
             before(grammarAccess.getOuterGearAccess().getPriceKeyword_3_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getOuterGearAccess().getPriceKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OuterGear__Group_3__0__Impl"


    // $ANTLR start "rule__OuterGear__Group_3__1"
    // InternalNowereBycicleDsl.g:2550:1: rule__OuterGear__Group_3__1 : rule__OuterGear__Group_3__1__Impl ;
    public final void rule__OuterGear__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:2554:1: ( rule__OuterGear__Group_3__1__Impl )
            // InternalNowereBycicleDsl.g:2555:2: rule__OuterGear__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OuterGear__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OuterGear__Group_3__1"


    // $ANTLR start "rule__OuterGear__Group_3__1__Impl"
    // InternalNowereBycicleDsl.g:2561:1: rule__OuterGear__Group_3__1__Impl : ( ( rule__OuterGear__PriceAssignment_3_1 ) ) ;
    public final void rule__OuterGear__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:2565:1: ( ( ( rule__OuterGear__PriceAssignment_3_1 ) ) )
            // InternalNowereBycicleDsl.g:2566:1: ( ( rule__OuterGear__PriceAssignment_3_1 ) )
            {
            // InternalNowereBycicleDsl.g:2566:1: ( ( rule__OuterGear__PriceAssignment_3_1 ) )
            // InternalNowereBycicleDsl.g:2567:2: ( rule__OuterGear__PriceAssignment_3_1 )
            {
             before(grammarAccess.getOuterGearAccess().getPriceAssignment_3_1()); 
            // InternalNowereBycicleDsl.g:2568:2: ( rule__OuterGear__PriceAssignment_3_1 )
            // InternalNowereBycicleDsl.g:2568:3: rule__OuterGear__PriceAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__OuterGear__PriceAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getOuterGearAccess().getPriceAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OuterGear__Group_3__1__Impl"


    // $ANTLR start "rule__OuterGear__Group_4__0"
    // InternalNowereBycicleDsl.g:2577:1: rule__OuterGear__Group_4__0 : rule__OuterGear__Group_4__0__Impl rule__OuterGear__Group_4__1 ;
    public final void rule__OuterGear__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:2581:1: ( rule__OuterGear__Group_4__0__Impl rule__OuterGear__Group_4__1 )
            // InternalNowereBycicleDsl.g:2582:2: rule__OuterGear__Group_4__0__Impl rule__OuterGear__Group_4__1
            {
            pushFollow(FOLLOW_19);
            rule__OuterGear__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OuterGear__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OuterGear__Group_4__0"


    // $ANTLR start "rule__OuterGear__Group_4__0__Impl"
    // InternalNowereBycicleDsl.g:2589:1: rule__OuterGear__Group_4__0__Impl : ( 'manufacturer' ) ;
    public final void rule__OuterGear__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:2593:1: ( ( 'manufacturer' ) )
            // InternalNowereBycicleDsl.g:2594:1: ( 'manufacturer' )
            {
            // InternalNowereBycicleDsl.g:2594:1: ( 'manufacturer' )
            // InternalNowereBycicleDsl.g:2595:2: 'manufacturer'
            {
             before(grammarAccess.getOuterGearAccess().getManufacturerKeyword_4_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getOuterGearAccess().getManufacturerKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OuterGear__Group_4__0__Impl"


    // $ANTLR start "rule__OuterGear__Group_4__1"
    // InternalNowereBycicleDsl.g:2604:1: rule__OuterGear__Group_4__1 : rule__OuterGear__Group_4__1__Impl ;
    public final void rule__OuterGear__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:2608:1: ( rule__OuterGear__Group_4__1__Impl )
            // InternalNowereBycicleDsl.g:2609:2: rule__OuterGear__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OuterGear__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OuterGear__Group_4__1"


    // $ANTLR start "rule__OuterGear__Group_4__1__Impl"
    // InternalNowereBycicleDsl.g:2615:1: rule__OuterGear__Group_4__1__Impl : ( ( rule__OuterGear__ManufacturerAssignment_4_1 ) ) ;
    public final void rule__OuterGear__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:2619:1: ( ( ( rule__OuterGear__ManufacturerAssignment_4_1 ) ) )
            // InternalNowereBycicleDsl.g:2620:1: ( ( rule__OuterGear__ManufacturerAssignment_4_1 ) )
            {
            // InternalNowereBycicleDsl.g:2620:1: ( ( rule__OuterGear__ManufacturerAssignment_4_1 ) )
            // InternalNowereBycicleDsl.g:2621:2: ( rule__OuterGear__ManufacturerAssignment_4_1 )
            {
             before(grammarAccess.getOuterGearAccess().getManufacturerAssignment_4_1()); 
            // InternalNowereBycicleDsl.g:2622:2: ( rule__OuterGear__ManufacturerAssignment_4_1 )
            // InternalNowereBycicleDsl.g:2622:3: rule__OuterGear__ManufacturerAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__OuterGear__ManufacturerAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getOuterGearAccess().getManufacturerAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OuterGear__Group_4__1__Impl"


    // $ANTLR start "rule__Pedals__Group__0"
    // InternalNowereBycicleDsl.g:2631:1: rule__Pedals__Group__0 : rule__Pedals__Group__0__Impl rule__Pedals__Group__1 ;
    public final void rule__Pedals__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:2635:1: ( rule__Pedals__Group__0__Impl rule__Pedals__Group__1 )
            // InternalNowereBycicleDsl.g:2636:2: rule__Pedals__Group__0__Impl rule__Pedals__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__Pedals__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pedals__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pedals__Group__0"


    // $ANTLR start "rule__Pedals__Group__0__Impl"
    // InternalNowereBycicleDsl.g:2643:1: rule__Pedals__Group__0__Impl : ( () ) ;
    public final void rule__Pedals__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:2647:1: ( ( () ) )
            // InternalNowereBycicleDsl.g:2648:1: ( () )
            {
            // InternalNowereBycicleDsl.g:2648:1: ( () )
            // InternalNowereBycicleDsl.g:2649:2: ()
            {
             before(grammarAccess.getPedalsAccess().getPedalsAction_0()); 
            // InternalNowereBycicleDsl.g:2650:2: ()
            // InternalNowereBycicleDsl.g:2650:3: 
            {
            }

             after(grammarAccess.getPedalsAccess().getPedalsAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pedals__Group__0__Impl"


    // $ANTLR start "rule__Pedals__Group__1"
    // InternalNowereBycicleDsl.g:2658:1: rule__Pedals__Group__1 : rule__Pedals__Group__1__Impl rule__Pedals__Group__2 ;
    public final void rule__Pedals__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:2662:1: ( rule__Pedals__Group__1__Impl rule__Pedals__Group__2 )
            // InternalNowereBycicleDsl.g:2663:2: rule__Pedals__Group__1__Impl rule__Pedals__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Pedals__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pedals__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pedals__Group__1"


    // $ANTLR start "rule__Pedals__Group__1__Impl"
    // InternalNowereBycicleDsl.g:2670:1: rule__Pedals__Group__1__Impl : ( 'Pedals' ) ;
    public final void rule__Pedals__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:2674:1: ( ( 'Pedals' ) )
            // InternalNowereBycicleDsl.g:2675:1: ( 'Pedals' )
            {
            // InternalNowereBycicleDsl.g:2675:1: ( 'Pedals' )
            // InternalNowereBycicleDsl.g:2676:2: 'Pedals'
            {
             before(grammarAccess.getPedalsAccess().getPedalsKeyword_1()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getPedalsAccess().getPedalsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pedals__Group__1__Impl"


    // $ANTLR start "rule__Pedals__Group__2"
    // InternalNowereBycicleDsl.g:2685:1: rule__Pedals__Group__2 : rule__Pedals__Group__2__Impl rule__Pedals__Group__3 ;
    public final void rule__Pedals__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:2689:1: ( rule__Pedals__Group__2__Impl rule__Pedals__Group__3 )
            // InternalNowereBycicleDsl.g:2690:2: rule__Pedals__Group__2__Impl rule__Pedals__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__Pedals__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pedals__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pedals__Group__2"


    // $ANTLR start "rule__Pedals__Group__2__Impl"
    // InternalNowereBycicleDsl.g:2697:1: rule__Pedals__Group__2__Impl : ( ( rule__Pedals__NameAssignment_2 ) ) ;
    public final void rule__Pedals__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:2701:1: ( ( ( rule__Pedals__NameAssignment_2 ) ) )
            // InternalNowereBycicleDsl.g:2702:1: ( ( rule__Pedals__NameAssignment_2 ) )
            {
            // InternalNowereBycicleDsl.g:2702:1: ( ( rule__Pedals__NameAssignment_2 ) )
            // InternalNowereBycicleDsl.g:2703:2: ( rule__Pedals__NameAssignment_2 )
            {
             before(grammarAccess.getPedalsAccess().getNameAssignment_2()); 
            // InternalNowereBycicleDsl.g:2704:2: ( rule__Pedals__NameAssignment_2 )
            // InternalNowereBycicleDsl.g:2704:3: rule__Pedals__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Pedals__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPedalsAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pedals__Group__2__Impl"


    // $ANTLR start "rule__Pedals__Group__3"
    // InternalNowereBycicleDsl.g:2712:1: rule__Pedals__Group__3 : rule__Pedals__Group__3__Impl rule__Pedals__Group__4 ;
    public final void rule__Pedals__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:2716:1: ( rule__Pedals__Group__3__Impl rule__Pedals__Group__4 )
            // InternalNowereBycicleDsl.g:2717:2: rule__Pedals__Group__3__Impl rule__Pedals__Group__4
            {
            pushFollow(FOLLOW_27);
            rule__Pedals__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pedals__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pedals__Group__3"


    // $ANTLR start "rule__Pedals__Group__3__Impl"
    // InternalNowereBycicleDsl.g:2724:1: rule__Pedals__Group__3__Impl : ( ( rule__Pedals__Group_3__0 )? ) ;
    public final void rule__Pedals__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:2728:1: ( ( ( rule__Pedals__Group_3__0 )? ) )
            // InternalNowereBycicleDsl.g:2729:1: ( ( rule__Pedals__Group_3__0 )? )
            {
            // InternalNowereBycicleDsl.g:2729:1: ( ( rule__Pedals__Group_3__0 )? )
            // InternalNowereBycicleDsl.g:2730:2: ( rule__Pedals__Group_3__0 )?
            {
             before(grammarAccess.getPedalsAccess().getGroup_3()); 
            // InternalNowereBycicleDsl.g:2731:2: ( rule__Pedals__Group_3__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==39) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalNowereBycicleDsl.g:2731:3: rule__Pedals__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pedals__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPedalsAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pedals__Group__3__Impl"


    // $ANTLR start "rule__Pedals__Group__4"
    // InternalNowereBycicleDsl.g:2739:1: rule__Pedals__Group__4 : rule__Pedals__Group__4__Impl rule__Pedals__Group__5 ;
    public final void rule__Pedals__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:2743:1: ( rule__Pedals__Group__4__Impl rule__Pedals__Group__5 )
            // InternalNowereBycicleDsl.g:2744:2: rule__Pedals__Group__4__Impl rule__Pedals__Group__5
            {
            pushFollow(FOLLOW_27);
            rule__Pedals__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pedals__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pedals__Group__4"


    // $ANTLR start "rule__Pedals__Group__4__Impl"
    // InternalNowereBycicleDsl.g:2751:1: rule__Pedals__Group__4__Impl : ( ( rule__Pedals__Group_4__0 )? ) ;
    public final void rule__Pedals__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:2755:1: ( ( ( rule__Pedals__Group_4__0 )? ) )
            // InternalNowereBycicleDsl.g:2756:1: ( ( rule__Pedals__Group_4__0 )? )
            {
            // InternalNowereBycicleDsl.g:2756:1: ( ( rule__Pedals__Group_4__0 )? )
            // InternalNowereBycicleDsl.g:2757:2: ( rule__Pedals__Group_4__0 )?
            {
             before(grammarAccess.getPedalsAccess().getGroup_4()); 
            // InternalNowereBycicleDsl.g:2758:2: ( rule__Pedals__Group_4__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==40) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalNowereBycicleDsl.g:2758:3: rule__Pedals__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pedals__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPedalsAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pedals__Group__4__Impl"


    // $ANTLR start "rule__Pedals__Group__5"
    // InternalNowereBycicleDsl.g:2766:1: rule__Pedals__Group__5 : rule__Pedals__Group__5__Impl ;
    public final void rule__Pedals__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:2770:1: ( rule__Pedals__Group__5__Impl )
            // InternalNowereBycicleDsl.g:2771:2: rule__Pedals__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pedals__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pedals__Group__5"


    // $ANTLR start "rule__Pedals__Group__5__Impl"
    // InternalNowereBycicleDsl.g:2777:1: rule__Pedals__Group__5__Impl : ( ( rule__Pedals__Group_5__0 )? ) ;
    public final void rule__Pedals__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:2781:1: ( ( ( rule__Pedals__Group_5__0 )? ) )
            // InternalNowereBycicleDsl.g:2782:1: ( ( rule__Pedals__Group_5__0 )? )
            {
            // InternalNowereBycicleDsl.g:2782:1: ( ( rule__Pedals__Group_5__0 )? )
            // InternalNowereBycicleDsl.g:2783:2: ( rule__Pedals__Group_5__0 )?
            {
             before(grammarAccess.getPedalsAccess().getGroup_5()); 
            // InternalNowereBycicleDsl.g:2784:2: ( rule__Pedals__Group_5__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==47) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalNowereBycicleDsl.g:2784:3: rule__Pedals__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pedals__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPedalsAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pedals__Group__5__Impl"


    // $ANTLR start "rule__Pedals__Group_3__0"
    // InternalNowereBycicleDsl.g:2793:1: rule__Pedals__Group_3__0 : rule__Pedals__Group_3__0__Impl rule__Pedals__Group_3__1 ;
    public final void rule__Pedals__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:2797:1: ( rule__Pedals__Group_3__0__Impl rule__Pedals__Group_3__1 )
            // InternalNowereBycicleDsl.g:2798:2: rule__Pedals__Group_3__0__Impl rule__Pedals__Group_3__1
            {
            pushFollow(FOLLOW_18);
            rule__Pedals__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pedals__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pedals__Group_3__0"


    // $ANTLR start "rule__Pedals__Group_3__0__Impl"
    // InternalNowereBycicleDsl.g:2805:1: rule__Pedals__Group_3__0__Impl : ( 'price' ) ;
    public final void rule__Pedals__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:2809:1: ( ( 'price' ) )
            // InternalNowereBycicleDsl.g:2810:1: ( 'price' )
            {
            // InternalNowereBycicleDsl.g:2810:1: ( 'price' )
            // InternalNowereBycicleDsl.g:2811:2: 'price'
            {
             before(grammarAccess.getPedalsAccess().getPriceKeyword_3_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getPedalsAccess().getPriceKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pedals__Group_3__0__Impl"


    // $ANTLR start "rule__Pedals__Group_3__1"
    // InternalNowereBycicleDsl.g:2820:1: rule__Pedals__Group_3__1 : rule__Pedals__Group_3__1__Impl ;
    public final void rule__Pedals__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:2824:1: ( rule__Pedals__Group_3__1__Impl )
            // InternalNowereBycicleDsl.g:2825:2: rule__Pedals__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pedals__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pedals__Group_3__1"


    // $ANTLR start "rule__Pedals__Group_3__1__Impl"
    // InternalNowereBycicleDsl.g:2831:1: rule__Pedals__Group_3__1__Impl : ( ( rule__Pedals__PriceAssignment_3_1 ) ) ;
    public final void rule__Pedals__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:2835:1: ( ( ( rule__Pedals__PriceAssignment_3_1 ) ) )
            // InternalNowereBycicleDsl.g:2836:1: ( ( rule__Pedals__PriceAssignment_3_1 ) )
            {
            // InternalNowereBycicleDsl.g:2836:1: ( ( rule__Pedals__PriceAssignment_3_1 ) )
            // InternalNowereBycicleDsl.g:2837:2: ( rule__Pedals__PriceAssignment_3_1 )
            {
             before(grammarAccess.getPedalsAccess().getPriceAssignment_3_1()); 
            // InternalNowereBycicleDsl.g:2838:2: ( rule__Pedals__PriceAssignment_3_1 )
            // InternalNowereBycicleDsl.g:2838:3: rule__Pedals__PriceAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Pedals__PriceAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPedalsAccess().getPriceAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pedals__Group_3__1__Impl"


    // $ANTLR start "rule__Pedals__Group_4__0"
    // InternalNowereBycicleDsl.g:2847:1: rule__Pedals__Group_4__0 : rule__Pedals__Group_4__0__Impl rule__Pedals__Group_4__1 ;
    public final void rule__Pedals__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:2851:1: ( rule__Pedals__Group_4__0__Impl rule__Pedals__Group_4__1 )
            // InternalNowereBycicleDsl.g:2852:2: rule__Pedals__Group_4__0__Impl rule__Pedals__Group_4__1
            {
            pushFollow(FOLLOW_19);
            rule__Pedals__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pedals__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pedals__Group_4__0"


    // $ANTLR start "rule__Pedals__Group_4__0__Impl"
    // InternalNowereBycicleDsl.g:2859:1: rule__Pedals__Group_4__0__Impl : ( 'manufacturer' ) ;
    public final void rule__Pedals__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:2863:1: ( ( 'manufacturer' ) )
            // InternalNowereBycicleDsl.g:2864:1: ( 'manufacturer' )
            {
            // InternalNowereBycicleDsl.g:2864:1: ( 'manufacturer' )
            // InternalNowereBycicleDsl.g:2865:2: 'manufacturer'
            {
             before(grammarAccess.getPedalsAccess().getManufacturerKeyword_4_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getPedalsAccess().getManufacturerKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pedals__Group_4__0__Impl"


    // $ANTLR start "rule__Pedals__Group_4__1"
    // InternalNowereBycicleDsl.g:2874:1: rule__Pedals__Group_4__1 : rule__Pedals__Group_4__1__Impl ;
    public final void rule__Pedals__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:2878:1: ( rule__Pedals__Group_4__1__Impl )
            // InternalNowereBycicleDsl.g:2879:2: rule__Pedals__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pedals__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pedals__Group_4__1"


    // $ANTLR start "rule__Pedals__Group_4__1__Impl"
    // InternalNowereBycicleDsl.g:2885:1: rule__Pedals__Group_4__1__Impl : ( ( rule__Pedals__ManufacturerAssignment_4_1 ) ) ;
    public final void rule__Pedals__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:2889:1: ( ( ( rule__Pedals__ManufacturerAssignment_4_1 ) ) )
            // InternalNowereBycicleDsl.g:2890:1: ( ( rule__Pedals__ManufacturerAssignment_4_1 ) )
            {
            // InternalNowereBycicleDsl.g:2890:1: ( ( rule__Pedals__ManufacturerAssignment_4_1 ) )
            // InternalNowereBycicleDsl.g:2891:2: ( rule__Pedals__ManufacturerAssignment_4_1 )
            {
             before(grammarAccess.getPedalsAccess().getManufacturerAssignment_4_1()); 
            // InternalNowereBycicleDsl.g:2892:2: ( rule__Pedals__ManufacturerAssignment_4_1 )
            // InternalNowereBycicleDsl.g:2892:3: rule__Pedals__ManufacturerAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Pedals__ManufacturerAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getPedalsAccess().getManufacturerAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pedals__Group_4__1__Impl"


    // $ANTLR start "rule__Pedals__Group_5__0"
    // InternalNowereBycicleDsl.g:2901:1: rule__Pedals__Group_5__0 : rule__Pedals__Group_5__0__Impl rule__Pedals__Group_5__1 ;
    public final void rule__Pedals__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:2905:1: ( rule__Pedals__Group_5__0__Impl rule__Pedals__Group_5__1 )
            // InternalNowereBycicleDsl.g:2906:2: rule__Pedals__Group_5__0__Impl rule__Pedals__Group_5__1
            {
            pushFollow(FOLLOW_28);
            rule__Pedals__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pedals__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pedals__Group_5__0"


    // $ANTLR start "rule__Pedals__Group_5__0__Impl"
    // InternalNowereBycicleDsl.g:2913:1: rule__Pedals__Group_5__0__Impl : ( 'pedalType' ) ;
    public final void rule__Pedals__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:2917:1: ( ( 'pedalType' ) )
            // InternalNowereBycicleDsl.g:2918:1: ( 'pedalType' )
            {
            // InternalNowereBycicleDsl.g:2918:1: ( 'pedalType' )
            // InternalNowereBycicleDsl.g:2919:2: 'pedalType'
            {
             before(grammarAccess.getPedalsAccess().getPedalTypeKeyword_5_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getPedalsAccess().getPedalTypeKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pedals__Group_5__0__Impl"


    // $ANTLR start "rule__Pedals__Group_5__1"
    // InternalNowereBycicleDsl.g:2928:1: rule__Pedals__Group_5__1 : rule__Pedals__Group_5__1__Impl ;
    public final void rule__Pedals__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:2932:1: ( rule__Pedals__Group_5__1__Impl )
            // InternalNowereBycicleDsl.g:2933:2: rule__Pedals__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pedals__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pedals__Group_5__1"


    // $ANTLR start "rule__Pedals__Group_5__1__Impl"
    // InternalNowereBycicleDsl.g:2939:1: rule__Pedals__Group_5__1__Impl : ( ( rule__Pedals__PedalTypeAssignment_5_1 ) ) ;
    public final void rule__Pedals__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:2943:1: ( ( ( rule__Pedals__PedalTypeAssignment_5_1 ) ) )
            // InternalNowereBycicleDsl.g:2944:1: ( ( rule__Pedals__PedalTypeAssignment_5_1 ) )
            {
            // InternalNowereBycicleDsl.g:2944:1: ( ( rule__Pedals__PedalTypeAssignment_5_1 ) )
            // InternalNowereBycicleDsl.g:2945:2: ( rule__Pedals__PedalTypeAssignment_5_1 )
            {
             before(grammarAccess.getPedalsAccess().getPedalTypeAssignment_5_1()); 
            // InternalNowereBycicleDsl.g:2946:2: ( rule__Pedals__PedalTypeAssignment_5_1 )
            // InternalNowereBycicleDsl.g:2946:3: rule__Pedals__PedalTypeAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Pedals__PedalTypeAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getPedalsAccess().getPedalTypeAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pedals__Group_5__1__Impl"


    // $ANTLR start "rule__Saddle__Group__0"
    // InternalNowereBycicleDsl.g:2955:1: rule__Saddle__Group__0 : rule__Saddle__Group__0__Impl rule__Saddle__Group__1 ;
    public final void rule__Saddle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:2959:1: ( rule__Saddle__Group__0__Impl rule__Saddle__Group__1 )
            // InternalNowereBycicleDsl.g:2960:2: rule__Saddle__Group__0__Impl rule__Saddle__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__Saddle__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Saddle__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Saddle__Group__0"


    // $ANTLR start "rule__Saddle__Group__0__Impl"
    // InternalNowereBycicleDsl.g:2967:1: rule__Saddle__Group__0__Impl : ( () ) ;
    public final void rule__Saddle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:2971:1: ( ( () ) )
            // InternalNowereBycicleDsl.g:2972:1: ( () )
            {
            // InternalNowereBycicleDsl.g:2972:1: ( () )
            // InternalNowereBycicleDsl.g:2973:2: ()
            {
             before(grammarAccess.getSaddleAccess().getSaddleAction_0()); 
            // InternalNowereBycicleDsl.g:2974:2: ()
            // InternalNowereBycicleDsl.g:2974:3: 
            {
            }

             after(grammarAccess.getSaddleAccess().getSaddleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Saddle__Group__0__Impl"


    // $ANTLR start "rule__Saddle__Group__1"
    // InternalNowereBycicleDsl.g:2982:1: rule__Saddle__Group__1 : rule__Saddle__Group__1__Impl rule__Saddle__Group__2 ;
    public final void rule__Saddle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:2986:1: ( rule__Saddle__Group__1__Impl rule__Saddle__Group__2 )
            // InternalNowereBycicleDsl.g:2987:2: rule__Saddle__Group__1__Impl rule__Saddle__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Saddle__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Saddle__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Saddle__Group__1"


    // $ANTLR start "rule__Saddle__Group__1__Impl"
    // InternalNowereBycicleDsl.g:2994:1: rule__Saddle__Group__1__Impl : ( 'Saddle' ) ;
    public final void rule__Saddle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:2998:1: ( ( 'Saddle' ) )
            // InternalNowereBycicleDsl.g:2999:1: ( 'Saddle' )
            {
            // InternalNowereBycicleDsl.g:2999:1: ( 'Saddle' )
            // InternalNowereBycicleDsl.g:3000:2: 'Saddle'
            {
             before(grammarAccess.getSaddleAccess().getSaddleKeyword_1()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getSaddleAccess().getSaddleKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Saddle__Group__1__Impl"


    // $ANTLR start "rule__Saddle__Group__2"
    // InternalNowereBycicleDsl.g:3009:1: rule__Saddle__Group__2 : rule__Saddle__Group__2__Impl rule__Saddle__Group__3 ;
    public final void rule__Saddle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:3013:1: ( rule__Saddle__Group__2__Impl rule__Saddle__Group__3 )
            // InternalNowereBycicleDsl.g:3014:2: rule__Saddle__Group__2__Impl rule__Saddle__Group__3
            {
            pushFollow(FOLLOW_30);
            rule__Saddle__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Saddle__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Saddle__Group__2"


    // $ANTLR start "rule__Saddle__Group__2__Impl"
    // InternalNowereBycicleDsl.g:3021:1: rule__Saddle__Group__2__Impl : ( ( rule__Saddle__NameAssignment_2 ) ) ;
    public final void rule__Saddle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:3025:1: ( ( ( rule__Saddle__NameAssignment_2 ) ) )
            // InternalNowereBycicleDsl.g:3026:1: ( ( rule__Saddle__NameAssignment_2 ) )
            {
            // InternalNowereBycicleDsl.g:3026:1: ( ( rule__Saddle__NameAssignment_2 ) )
            // InternalNowereBycicleDsl.g:3027:2: ( rule__Saddle__NameAssignment_2 )
            {
             before(grammarAccess.getSaddleAccess().getNameAssignment_2()); 
            // InternalNowereBycicleDsl.g:3028:2: ( rule__Saddle__NameAssignment_2 )
            // InternalNowereBycicleDsl.g:3028:3: rule__Saddle__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Saddle__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSaddleAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Saddle__Group__2__Impl"


    // $ANTLR start "rule__Saddle__Group__3"
    // InternalNowereBycicleDsl.g:3036:1: rule__Saddle__Group__3 : rule__Saddle__Group__3__Impl rule__Saddle__Group__4 ;
    public final void rule__Saddle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:3040:1: ( rule__Saddle__Group__3__Impl rule__Saddle__Group__4 )
            // InternalNowereBycicleDsl.g:3041:2: rule__Saddle__Group__3__Impl rule__Saddle__Group__4
            {
            pushFollow(FOLLOW_30);
            rule__Saddle__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Saddle__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Saddle__Group__3"


    // $ANTLR start "rule__Saddle__Group__3__Impl"
    // InternalNowereBycicleDsl.g:3048:1: rule__Saddle__Group__3__Impl : ( ( rule__Saddle__Group_3__0 )? ) ;
    public final void rule__Saddle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:3052:1: ( ( ( rule__Saddle__Group_3__0 )? ) )
            // InternalNowereBycicleDsl.g:3053:1: ( ( rule__Saddle__Group_3__0 )? )
            {
            // InternalNowereBycicleDsl.g:3053:1: ( ( rule__Saddle__Group_3__0 )? )
            // InternalNowereBycicleDsl.g:3054:2: ( rule__Saddle__Group_3__0 )?
            {
             before(grammarAccess.getSaddleAccess().getGroup_3()); 
            // InternalNowereBycicleDsl.g:3055:2: ( rule__Saddle__Group_3__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==39) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalNowereBycicleDsl.g:3055:3: rule__Saddle__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Saddle__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSaddleAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Saddle__Group__3__Impl"


    // $ANTLR start "rule__Saddle__Group__4"
    // InternalNowereBycicleDsl.g:3063:1: rule__Saddle__Group__4 : rule__Saddle__Group__4__Impl rule__Saddle__Group__5 ;
    public final void rule__Saddle__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:3067:1: ( rule__Saddle__Group__4__Impl rule__Saddle__Group__5 )
            // InternalNowereBycicleDsl.g:3068:2: rule__Saddle__Group__4__Impl rule__Saddle__Group__5
            {
            pushFollow(FOLLOW_30);
            rule__Saddle__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Saddle__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Saddle__Group__4"


    // $ANTLR start "rule__Saddle__Group__4__Impl"
    // InternalNowereBycicleDsl.g:3075:1: rule__Saddle__Group__4__Impl : ( ( rule__Saddle__Group_4__0 )? ) ;
    public final void rule__Saddle__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:3079:1: ( ( ( rule__Saddle__Group_4__0 )? ) )
            // InternalNowereBycicleDsl.g:3080:1: ( ( rule__Saddle__Group_4__0 )? )
            {
            // InternalNowereBycicleDsl.g:3080:1: ( ( rule__Saddle__Group_4__0 )? )
            // InternalNowereBycicleDsl.g:3081:2: ( rule__Saddle__Group_4__0 )?
            {
             before(grammarAccess.getSaddleAccess().getGroup_4()); 
            // InternalNowereBycicleDsl.g:3082:2: ( rule__Saddle__Group_4__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==40) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalNowereBycicleDsl.g:3082:3: rule__Saddle__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Saddle__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSaddleAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Saddle__Group__4__Impl"


    // $ANTLR start "rule__Saddle__Group__5"
    // InternalNowereBycicleDsl.g:3090:1: rule__Saddle__Group__5 : rule__Saddle__Group__5__Impl ;
    public final void rule__Saddle__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:3094:1: ( rule__Saddle__Group__5__Impl )
            // InternalNowereBycicleDsl.g:3095:2: rule__Saddle__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Saddle__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Saddle__Group__5"


    // $ANTLR start "rule__Saddle__Group__5__Impl"
    // InternalNowereBycicleDsl.g:3101:1: rule__Saddle__Group__5__Impl : ( ( rule__Saddle__Group_5__0 )? ) ;
    public final void rule__Saddle__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:3105:1: ( ( ( rule__Saddle__Group_5__0 )? ) )
            // InternalNowereBycicleDsl.g:3106:1: ( ( rule__Saddle__Group_5__0 )? )
            {
            // InternalNowereBycicleDsl.g:3106:1: ( ( rule__Saddle__Group_5__0 )? )
            // InternalNowereBycicleDsl.g:3107:2: ( rule__Saddle__Group_5__0 )?
            {
             before(grammarAccess.getSaddleAccess().getGroup_5()); 
            // InternalNowereBycicleDsl.g:3108:2: ( rule__Saddle__Group_5__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==49) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalNowereBycicleDsl.g:3108:3: rule__Saddle__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Saddle__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSaddleAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Saddle__Group__5__Impl"


    // $ANTLR start "rule__Saddle__Group_3__0"
    // InternalNowereBycicleDsl.g:3117:1: rule__Saddle__Group_3__0 : rule__Saddle__Group_3__0__Impl rule__Saddle__Group_3__1 ;
    public final void rule__Saddle__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:3121:1: ( rule__Saddle__Group_3__0__Impl rule__Saddle__Group_3__1 )
            // InternalNowereBycicleDsl.g:3122:2: rule__Saddle__Group_3__0__Impl rule__Saddle__Group_3__1
            {
            pushFollow(FOLLOW_18);
            rule__Saddle__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Saddle__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Saddle__Group_3__0"


    // $ANTLR start "rule__Saddle__Group_3__0__Impl"
    // InternalNowereBycicleDsl.g:3129:1: rule__Saddle__Group_3__0__Impl : ( 'price' ) ;
    public final void rule__Saddle__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:3133:1: ( ( 'price' ) )
            // InternalNowereBycicleDsl.g:3134:1: ( 'price' )
            {
            // InternalNowereBycicleDsl.g:3134:1: ( 'price' )
            // InternalNowereBycicleDsl.g:3135:2: 'price'
            {
             before(grammarAccess.getSaddleAccess().getPriceKeyword_3_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getSaddleAccess().getPriceKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Saddle__Group_3__0__Impl"


    // $ANTLR start "rule__Saddle__Group_3__1"
    // InternalNowereBycicleDsl.g:3144:1: rule__Saddle__Group_3__1 : rule__Saddle__Group_3__1__Impl ;
    public final void rule__Saddle__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:3148:1: ( rule__Saddle__Group_3__1__Impl )
            // InternalNowereBycicleDsl.g:3149:2: rule__Saddle__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Saddle__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Saddle__Group_3__1"


    // $ANTLR start "rule__Saddle__Group_3__1__Impl"
    // InternalNowereBycicleDsl.g:3155:1: rule__Saddle__Group_3__1__Impl : ( ( rule__Saddle__PriceAssignment_3_1 ) ) ;
    public final void rule__Saddle__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:3159:1: ( ( ( rule__Saddle__PriceAssignment_3_1 ) ) )
            // InternalNowereBycicleDsl.g:3160:1: ( ( rule__Saddle__PriceAssignment_3_1 ) )
            {
            // InternalNowereBycicleDsl.g:3160:1: ( ( rule__Saddle__PriceAssignment_3_1 ) )
            // InternalNowereBycicleDsl.g:3161:2: ( rule__Saddle__PriceAssignment_3_1 )
            {
             before(grammarAccess.getSaddleAccess().getPriceAssignment_3_1()); 
            // InternalNowereBycicleDsl.g:3162:2: ( rule__Saddle__PriceAssignment_3_1 )
            // InternalNowereBycicleDsl.g:3162:3: rule__Saddle__PriceAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Saddle__PriceAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSaddleAccess().getPriceAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Saddle__Group_3__1__Impl"


    // $ANTLR start "rule__Saddle__Group_4__0"
    // InternalNowereBycicleDsl.g:3171:1: rule__Saddle__Group_4__0 : rule__Saddle__Group_4__0__Impl rule__Saddle__Group_4__1 ;
    public final void rule__Saddle__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:3175:1: ( rule__Saddle__Group_4__0__Impl rule__Saddle__Group_4__1 )
            // InternalNowereBycicleDsl.g:3176:2: rule__Saddle__Group_4__0__Impl rule__Saddle__Group_4__1
            {
            pushFollow(FOLLOW_19);
            rule__Saddle__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Saddle__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Saddle__Group_4__0"


    // $ANTLR start "rule__Saddle__Group_4__0__Impl"
    // InternalNowereBycicleDsl.g:3183:1: rule__Saddle__Group_4__0__Impl : ( 'manufacturer' ) ;
    public final void rule__Saddle__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:3187:1: ( ( 'manufacturer' ) )
            // InternalNowereBycicleDsl.g:3188:1: ( 'manufacturer' )
            {
            // InternalNowereBycicleDsl.g:3188:1: ( 'manufacturer' )
            // InternalNowereBycicleDsl.g:3189:2: 'manufacturer'
            {
             before(grammarAccess.getSaddleAccess().getManufacturerKeyword_4_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getSaddleAccess().getManufacturerKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Saddle__Group_4__0__Impl"


    // $ANTLR start "rule__Saddle__Group_4__1"
    // InternalNowereBycicleDsl.g:3198:1: rule__Saddle__Group_4__1 : rule__Saddle__Group_4__1__Impl ;
    public final void rule__Saddle__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:3202:1: ( rule__Saddle__Group_4__1__Impl )
            // InternalNowereBycicleDsl.g:3203:2: rule__Saddle__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Saddle__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Saddle__Group_4__1"


    // $ANTLR start "rule__Saddle__Group_4__1__Impl"
    // InternalNowereBycicleDsl.g:3209:1: rule__Saddle__Group_4__1__Impl : ( ( rule__Saddle__ManufacturerAssignment_4_1 ) ) ;
    public final void rule__Saddle__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:3213:1: ( ( ( rule__Saddle__ManufacturerAssignment_4_1 ) ) )
            // InternalNowereBycicleDsl.g:3214:1: ( ( rule__Saddle__ManufacturerAssignment_4_1 ) )
            {
            // InternalNowereBycicleDsl.g:3214:1: ( ( rule__Saddle__ManufacturerAssignment_4_1 ) )
            // InternalNowereBycicleDsl.g:3215:2: ( rule__Saddle__ManufacturerAssignment_4_1 )
            {
             before(grammarAccess.getSaddleAccess().getManufacturerAssignment_4_1()); 
            // InternalNowereBycicleDsl.g:3216:2: ( rule__Saddle__ManufacturerAssignment_4_1 )
            // InternalNowereBycicleDsl.g:3216:3: rule__Saddle__ManufacturerAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Saddle__ManufacturerAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSaddleAccess().getManufacturerAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Saddle__Group_4__1__Impl"


    // $ANTLR start "rule__Saddle__Group_5__0"
    // InternalNowereBycicleDsl.g:3225:1: rule__Saddle__Group_5__0 : rule__Saddle__Group_5__0__Impl rule__Saddle__Group_5__1 ;
    public final void rule__Saddle__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:3229:1: ( rule__Saddle__Group_5__0__Impl rule__Saddle__Group_5__1 )
            // InternalNowereBycicleDsl.g:3230:2: rule__Saddle__Group_5__0__Impl rule__Saddle__Group_5__1
            {
            pushFollow(FOLLOW_31);
            rule__Saddle__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Saddle__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Saddle__Group_5__0"


    // $ANTLR start "rule__Saddle__Group_5__0__Impl"
    // InternalNowereBycicleDsl.g:3237:1: rule__Saddle__Group_5__0__Impl : ( 'saddleType' ) ;
    public final void rule__Saddle__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:3241:1: ( ( 'saddleType' ) )
            // InternalNowereBycicleDsl.g:3242:1: ( 'saddleType' )
            {
            // InternalNowereBycicleDsl.g:3242:1: ( 'saddleType' )
            // InternalNowereBycicleDsl.g:3243:2: 'saddleType'
            {
             before(grammarAccess.getSaddleAccess().getSaddleTypeKeyword_5_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getSaddleAccess().getSaddleTypeKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Saddle__Group_5__0__Impl"


    // $ANTLR start "rule__Saddle__Group_5__1"
    // InternalNowereBycicleDsl.g:3252:1: rule__Saddle__Group_5__1 : rule__Saddle__Group_5__1__Impl ;
    public final void rule__Saddle__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:3256:1: ( rule__Saddle__Group_5__1__Impl )
            // InternalNowereBycicleDsl.g:3257:2: rule__Saddle__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Saddle__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Saddle__Group_5__1"


    // $ANTLR start "rule__Saddle__Group_5__1__Impl"
    // InternalNowereBycicleDsl.g:3263:1: rule__Saddle__Group_5__1__Impl : ( ( rule__Saddle__SaddleTypeAssignment_5_1 ) ) ;
    public final void rule__Saddle__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:3267:1: ( ( ( rule__Saddle__SaddleTypeAssignment_5_1 ) ) )
            // InternalNowereBycicleDsl.g:3268:1: ( ( rule__Saddle__SaddleTypeAssignment_5_1 ) )
            {
            // InternalNowereBycicleDsl.g:3268:1: ( ( rule__Saddle__SaddleTypeAssignment_5_1 ) )
            // InternalNowereBycicleDsl.g:3269:2: ( rule__Saddle__SaddleTypeAssignment_5_1 )
            {
             before(grammarAccess.getSaddleAccess().getSaddleTypeAssignment_5_1()); 
            // InternalNowereBycicleDsl.g:3270:2: ( rule__Saddle__SaddleTypeAssignment_5_1 )
            // InternalNowereBycicleDsl.g:3270:3: rule__Saddle__SaddleTypeAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Saddle__SaddleTypeAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getSaddleAccess().getSaddleTypeAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Saddle__Group_5__1__Impl"


    // $ANTLR start "rule__HandBrakes__Group__0"
    // InternalNowereBycicleDsl.g:3279:1: rule__HandBrakes__Group__0 : rule__HandBrakes__Group__0__Impl rule__HandBrakes__Group__1 ;
    public final void rule__HandBrakes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:3283:1: ( rule__HandBrakes__Group__0__Impl rule__HandBrakes__Group__1 )
            // InternalNowereBycicleDsl.g:3284:2: rule__HandBrakes__Group__0__Impl rule__HandBrakes__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__HandBrakes__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HandBrakes__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HandBrakes__Group__0"


    // $ANTLR start "rule__HandBrakes__Group__0__Impl"
    // InternalNowereBycicleDsl.g:3291:1: rule__HandBrakes__Group__0__Impl : ( () ) ;
    public final void rule__HandBrakes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:3295:1: ( ( () ) )
            // InternalNowereBycicleDsl.g:3296:1: ( () )
            {
            // InternalNowereBycicleDsl.g:3296:1: ( () )
            // InternalNowereBycicleDsl.g:3297:2: ()
            {
             before(grammarAccess.getHandBrakesAccess().getHandBrakesAction_0()); 
            // InternalNowereBycicleDsl.g:3298:2: ()
            // InternalNowereBycicleDsl.g:3298:3: 
            {
            }

             after(grammarAccess.getHandBrakesAccess().getHandBrakesAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HandBrakes__Group__0__Impl"


    // $ANTLR start "rule__HandBrakes__Group__1"
    // InternalNowereBycicleDsl.g:3306:1: rule__HandBrakes__Group__1 : rule__HandBrakes__Group__1__Impl rule__HandBrakes__Group__2 ;
    public final void rule__HandBrakes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:3310:1: ( rule__HandBrakes__Group__1__Impl rule__HandBrakes__Group__2 )
            // InternalNowereBycicleDsl.g:3311:2: rule__HandBrakes__Group__1__Impl rule__HandBrakes__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__HandBrakes__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HandBrakes__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HandBrakes__Group__1"


    // $ANTLR start "rule__HandBrakes__Group__1__Impl"
    // InternalNowereBycicleDsl.g:3318:1: rule__HandBrakes__Group__1__Impl : ( 'HandBrakes' ) ;
    public final void rule__HandBrakes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:3322:1: ( ( 'HandBrakes' ) )
            // InternalNowereBycicleDsl.g:3323:1: ( 'HandBrakes' )
            {
            // InternalNowereBycicleDsl.g:3323:1: ( 'HandBrakes' )
            // InternalNowereBycicleDsl.g:3324:2: 'HandBrakes'
            {
             before(grammarAccess.getHandBrakesAccess().getHandBrakesKeyword_1()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getHandBrakesAccess().getHandBrakesKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HandBrakes__Group__1__Impl"


    // $ANTLR start "rule__HandBrakes__Group__2"
    // InternalNowereBycicleDsl.g:3333:1: rule__HandBrakes__Group__2 : rule__HandBrakes__Group__2__Impl rule__HandBrakes__Group__3 ;
    public final void rule__HandBrakes__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:3337:1: ( rule__HandBrakes__Group__2__Impl rule__HandBrakes__Group__3 )
            // InternalNowereBycicleDsl.g:3338:2: rule__HandBrakes__Group__2__Impl rule__HandBrakes__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__HandBrakes__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HandBrakes__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HandBrakes__Group__2"


    // $ANTLR start "rule__HandBrakes__Group__2__Impl"
    // InternalNowereBycicleDsl.g:3345:1: rule__HandBrakes__Group__2__Impl : ( ( rule__HandBrakes__NameAssignment_2 ) ) ;
    public final void rule__HandBrakes__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:3349:1: ( ( ( rule__HandBrakes__NameAssignment_2 ) ) )
            // InternalNowereBycicleDsl.g:3350:1: ( ( rule__HandBrakes__NameAssignment_2 ) )
            {
            // InternalNowereBycicleDsl.g:3350:1: ( ( rule__HandBrakes__NameAssignment_2 ) )
            // InternalNowereBycicleDsl.g:3351:2: ( rule__HandBrakes__NameAssignment_2 )
            {
             before(grammarAccess.getHandBrakesAccess().getNameAssignment_2()); 
            // InternalNowereBycicleDsl.g:3352:2: ( rule__HandBrakes__NameAssignment_2 )
            // InternalNowereBycicleDsl.g:3352:3: rule__HandBrakes__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__HandBrakes__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getHandBrakesAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HandBrakes__Group__2__Impl"


    // $ANTLR start "rule__HandBrakes__Group__3"
    // InternalNowereBycicleDsl.g:3360:1: rule__HandBrakes__Group__3 : rule__HandBrakes__Group__3__Impl rule__HandBrakes__Group__4 ;
    public final void rule__HandBrakes__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:3364:1: ( rule__HandBrakes__Group__3__Impl rule__HandBrakes__Group__4 )
            // InternalNowereBycicleDsl.g:3365:2: rule__HandBrakes__Group__3__Impl rule__HandBrakes__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__HandBrakes__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HandBrakes__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HandBrakes__Group__3"


    // $ANTLR start "rule__HandBrakes__Group__3__Impl"
    // InternalNowereBycicleDsl.g:3372:1: rule__HandBrakes__Group__3__Impl : ( ( rule__HandBrakes__Group_3__0 )? ) ;
    public final void rule__HandBrakes__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:3376:1: ( ( ( rule__HandBrakes__Group_3__0 )? ) )
            // InternalNowereBycicleDsl.g:3377:1: ( ( rule__HandBrakes__Group_3__0 )? )
            {
            // InternalNowereBycicleDsl.g:3377:1: ( ( rule__HandBrakes__Group_3__0 )? )
            // InternalNowereBycicleDsl.g:3378:2: ( rule__HandBrakes__Group_3__0 )?
            {
             before(grammarAccess.getHandBrakesAccess().getGroup_3()); 
            // InternalNowereBycicleDsl.g:3379:2: ( rule__HandBrakes__Group_3__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==39) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalNowereBycicleDsl.g:3379:3: rule__HandBrakes__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__HandBrakes__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHandBrakesAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HandBrakes__Group__3__Impl"


    // $ANTLR start "rule__HandBrakes__Group__4"
    // InternalNowereBycicleDsl.g:3387:1: rule__HandBrakes__Group__4 : rule__HandBrakes__Group__4__Impl ;
    public final void rule__HandBrakes__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:3391:1: ( rule__HandBrakes__Group__4__Impl )
            // InternalNowereBycicleDsl.g:3392:2: rule__HandBrakes__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HandBrakes__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HandBrakes__Group__4"


    // $ANTLR start "rule__HandBrakes__Group__4__Impl"
    // InternalNowereBycicleDsl.g:3398:1: rule__HandBrakes__Group__4__Impl : ( ( rule__HandBrakes__Group_4__0 )? ) ;
    public final void rule__HandBrakes__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:3402:1: ( ( ( rule__HandBrakes__Group_4__0 )? ) )
            // InternalNowereBycicleDsl.g:3403:1: ( ( rule__HandBrakes__Group_4__0 )? )
            {
            // InternalNowereBycicleDsl.g:3403:1: ( ( rule__HandBrakes__Group_4__0 )? )
            // InternalNowereBycicleDsl.g:3404:2: ( rule__HandBrakes__Group_4__0 )?
            {
             before(grammarAccess.getHandBrakesAccess().getGroup_4()); 
            // InternalNowereBycicleDsl.g:3405:2: ( rule__HandBrakes__Group_4__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==40) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalNowereBycicleDsl.g:3405:3: rule__HandBrakes__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__HandBrakes__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHandBrakesAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HandBrakes__Group__4__Impl"


    // $ANTLR start "rule__HandBrakes__Group_3__0"
    // InternalNowereBycicleDsl.g:3414:1: rule__HandBrakes__Group_3__0 : rule__HandBrakes__Group_3__0__Impl rule__HandBrakes__Group_3__1 ;
    public final void rule__HandBrakes__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:3418:1: ( rule__HandBrakes__Group_3__0__Impl rule__HandBrakes__Group_3__1 )
            // InternalNowereBycicleDsl.g:3419:2: rule__HandBrakes__Group_3__0__Impl rule__HandBrakes__Group_3__1
            {
            pushFollow(FOLLOW_18);
            rule__HandBrakes__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HandBrakes__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HandBrakes__Group_3__0"


    // $ANTLR start "rule__HandBrakes__Group_3__0__Impl"
    // InternalNowereBycicleDsl.g:3426:1: rule__HandBrakes__Group_3__0__Impl : ( 'price' ) ;
    public final void rule__HandBrakes__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:3430:1: ( ( 'price' ) )
            // InternalNowereBycicleDsl.g:3431:1: ( 'price' )
            {
            // InternalNowereBycicleDsl.g:3431:1: ( 'price' )
            // InternalNowereBycicleDsl.g:3432:2: 'price'
            {
             before(grammarAccess.getHandBrakesAccess().getPriceKeyword_3_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getHandBrakesAccess().getPriceKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HandBrakes__Group_3__0__Impl"


    // $ANTLR start "rule__HandBrakes__Group_3__1"
    // InternalNowereBycicleDsl.g:3441:1: rule__HandBrakes__Group_3__1 : rule__HandBrakes__Group_3__1__Impl ;
    public final void rule__HandBrakes__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:3445:1: ( rule__HandBrakes__Group_3__1__Impl )
            // InternalNowereBycicleDsl.g:3446:2: rule__HandBrakes__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HandBrakes__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HandBrakes__Group_3__1"


    // $ANTLR start "rule__HandBrakes__Group_3__1__Impl"
    // InternalNowereBycicleDsl.g:3452:1: rule__HandBrakes__Group_3__1__Impl : ( ( rule__HandBrakes__PriceAssignment_3_1 ) ) ;
    public final void rule__HandBrakes__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:3456:1: ( ( ( rule__HandBrakes__PriceAssignment_3_1 ) ) )
            // InternalNowereBycicleDsl.g:3457:1: ( ( rule__HandBrakes__PriceAssignment_3_1 ) )
            {
            // InternalNowereBycicleDsl.g:3457:1: ( ( rule__HandBrakes__PriceAssignment_3_1 ) )
            // InternalNowereBycicleDsl.g:3458:2: ( rule__HandBrakes__PriceAssignment_3_1 )
            {
             before(grammarAccess.getHandBrakesAccess().getPriceAssignment_3_1()); 
            // InternalNowereBycicleDsl.g:3459:2: ( rule__HandBrakes__PriceAssignment_3_1 )
            // InternalNowereBycicleDsl.g:3459:3: rule__HandBrakes__PriceAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__HandBrakes__PriceAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getHandBrakesAccess().getPriceAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HandBrakes__Group_3__1__Impl"


    // $ANTLR start "rule__HandBrakes__Group_4__0"
    // InternalNowereBycicleDsl.g:3468:1: rule__HandBrakes__Group_4__0 : rule__HandBrakes__Group_4__0__Impl rule__HandBrakes__Group_4__1 ;
    public final void rule__HandBrakes__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:3472:1: ( rule__HandBrakes__Group_4__0__Impl rule__HandBrakes__Group_4__1 )
            // InternalNowereBycicleDsl.g:3473:2: rule__HandBrakes__Group_4__0__Impl rule__HandBrakes__Group_4__1
            {
            pushFollow(FOLLOW_19);
            rule__HandBrakes__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HandBrakes__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HandBrakes__Group_4__0"


    // $ANTLR start "rule__HandBrakes__Group_4__0__Impl"
    // InternalNowereBycicleDsl.g:3480:1: rule__HandBrakes__Group_4__0__Impl : ( 'manufacturer' ) ;
    public final void rule__HandBrakes__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:3484:1: ( ( 'manufacturer' ) )
            // InternalNowereBycicleDsl.g:3485:1: ( 'manufacturer' )
            {
            // InternalNowereBycicleDsl.g:3485:1: ( 'manufacturer' )
            // InternalNowereBycicleDsl.g:3486:2: 'manufacturer'
            {
             before(grammarAccess.getHandBrakesAccess().getManufacturerKeyword_4_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getHandBrakesAccess().getManufacturerKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HandBrakes__Group_4__0__Impl"


    // $ANTLR start "rule__HandBrakes__Group_4__1"
    // InternalNowereBycicleDsl.g:3495:1: rule__HandBrakes__Group_4__1 : rule__HandBrakes__Group_4__1__Impl ;
    public final void rule__HandBrakes__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:3499:1: ( rule__HandBrakes__Group_4__1__Impl )
            // InternalNowereBycicleDsl.g:3500:2: rule__HandBrakes__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HandBrakes__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HandBrakes__Group_4__1"


    // $ANTLR start "rule__HandBrakes__Group_4__1__Impl"
    // InternalNowereBycicleDsl.g:3506:1: rule__HandBrakes__Group_4__1__Impl : ( ( rule__HandBrakes__ManufacturerAssignment_4_1 ) ) ;
    public final void rule__HandBrakes__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:3510:1: ( ( ( rule__HandBrakes__ManufacturerAssignment_4_1 ) ) )
            // InternalNowereBycicleDsl.g:3511:1: ( ( rule__HandBrakes__ManufacturerAssignment_4_1 ) )
            {
            // InternalNowereBycicleDsl.g:3511:1: ( ( rule__HandBrakes__ManufacturerAssignment_4_1 ) )
            // InternalNowereBycicleDsl.g:3512:2: ( rule__HandBrakes__ManufacturerAssignment_4_1 )
            {
             before(grammarAccess.getHandBrakesAccess().getManufacturerAssignment_4_1()); 
            // InternalNowereBycicleDsl.g:3513:2: ( rule__HandBrakes__ManufacturerAssignment_4_1 )
            // InternalNowereBycicleDsl.g:3513:3: rule__HandBrakes__ManufacturerAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__HandBrakes__ManufacturerAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getHandBrakesAccess().getManufacturerAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HandBrakes__Group_4__1__Impl"


    // $ANTLR start "rule__HandleBars__Group__0"
    // InternalNowereBycicleDsl.g:3522:1: rule__HandleBars__Group__0 : rule__HandleBars__Group__0__Impl rule__HandleBars__Group__1 ;
    public final void rule__HandleBars__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:3526:1: ( rule__HandleBars__Group__0__Impl rule__HandleBars__Group__1 )
            // InternalNowereBycicleDsl.g:3527:2: rule__HandleBars__Group__0__Impl rule__HandleBars__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__HandleBars__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HandleBars__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HandleBars__Group__0"


    // $ANTLR start "rule__HandleBars__Group__0__Impl"
    // InternalNowereBycicleDsl.g:3534:1: rule__HandleBars__Group__0__Impl : ( () ) ;
    public final void rule__HandleBars__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:3538:1: ( ( () ) )
            // InternalNowereBycicleDsl.g:3539:1: ( () )
            {
            // InternalNowereBycicleDsl.g:3539:1: ( () )
            // InternalNowereBycicleDsl.g:3540:2: ()
            {
             before(grammarAccess.getHandleBarsAccess().getHandleBarsAction_0()); 
            // InternalNowereBycicleDsl.g:3541:2: ()
            // InternalNowereBycicleDsl.g:3541:3: 
            {
            }

             after(grammarAccess.getHandleBarsAccess().getHandleBarsAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HandleBars__Group__0__Impl"


    // $ANTLR start "rule__HandleBars__Group__1"
    // InternalNowereBycicleDsl.g:3549:1: rule__HandleBars__Group__1 : rule__HandleBars__Group__1__Impl rule__HandleBars__Group__2 ;
    public final void rule__HandleBars__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:3553:1: ( rule__HandleBars__Group__1__Impl rule__HandleBars__Group__2 )
            // InternalNowereBycicleDsl.g:3554:2: rule__HandleBars__Group__1__Impl rule__HandleBars__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__HandleBars__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HandleBars__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HandleBars__Group__1"


    // $ANTLR start "rule__HandleBars__Group__1__Impl"
    // InternalNowereBycicleDsl.g:3561:1: rule__HandleBars__Group__1__Impl : ( 'HandleBars' ) ;
    public final void rule__HandleBars__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:3565:1: ( ( 'HandleBars' ) )
            // InternalNowereBycicleDsl.g:3566:1: ( 'HandleBars' )
            {
            // InternalNowereBycicleDsl.g:3566:1: ( 'HandleBars' )
            // InternalNowereBycicleDsl.g:3567:2: 'HandleBars'
            {
             before(grammarAccess.getHandleBarsAccess().getHandleBarsKeyword_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getHandleBarsAccess().getHandleBarsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HandleBars__Group__1__Impl"


    // $ANTLR start "rule__HandleBars__Group__2"
    // InternalNowereBycicleDsl.g:3576:1: rule__HandleBars__Group__2 : rule__HandleBars__Group__2__Impl rule__HandleBars__Group__3 ;
    public final void rule__HandleBars__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:3580:1: ( rule__HandleBars__Group__2__Impl rule__HandleBars__Group__3 )
            // InternalNowereBycicleDsl.g:3581:2: rule__HandleBars__Group__2__Impl rule__HandleBars__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__HandleBars__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HandleBars__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HandleBars__Group__2"


    // $ANTLR start "rule__HandleBars__Group__2__Impl"
    // InternalNowereBycicleDsl.g:3588:1: rule__HandleBars__Group__2__Impl : ( ( rule__HandleBars__NameAssignment_2 ) ) ;
    public final void rule__HandleBars__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:3592:1: ( ( ( rule__HandleBars__NameAssignment_2 ) ) )
            // InternalNowereBycicleDsl.g:3593:1: ( ( rule__HandleBars__NameAssignment_2 ) )
            {
            // InternalNowereBycicleDsl.g:3593:1: ( ( rule__HandleBars__NameAssignment_2 ) )
            // InternalNowereBycicleDsl.g:3594:2: ( rule__HandleBars__NameAssignment_2 )
            {
             before(grammarAccess.getHandleBarsAccess().getNameAssignment_2()); 
            // InternalNowereBycicleDsl.g:3595:2: ( rule__HandleBars__NameAssignment_2 )
            // InternalNowereBycicleDsl.g:3595:3: rule__HandleBars__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__HandleBars__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getHandleBarsAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HandleBars__Group__2__Impl"


    // $ANTLR start "rule__HandleBars__Group__3"
    // InternalNowereBycicleDsl.g:3603:1: rule__HandleBars__Group__3 : rule__HandleBars__Group__3__Impl rule__HandleBars__Group__4 ;
    public final void rule__HandleBars__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:3607:1: ( rule__HandleBars__Group__3__Impl rule__HandleBars__Group__4 )
            // InternalNowereBycicleDsl.g:3608:2: rule__HandleBars__Group__3__Impl rule__HandleBars__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__HandleBars__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HandleBars__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HandleBars__Group__3"


    // $ANTLR start "rule__HandleBars__Group__3__Impl"
    // InternalNowereBycicleDsl.g:3615:1: rule__HandleBars__Group__3__Impl : ( ( rule__HandleBars__Group_3__0 )? ) ;
    public final void rule__HandleBars__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:3619:1: ( ( ( rule__HandleBars__Group_3__0 )? ) )
            // InternalNowereBycicleDsl.g:3620:1: ( ( rule__HandleBars__Group_3__0 )? )
            {
            // InternalNowereBycicleDsl.g:3620:1: ( ( rule__HandleBars__Group_3__0 )? )
            // InternalNowereBycicleDsl.g:3621:2: ( rule__HandleBars__Group_3__0 )?
            {
             before(grammarAccess.getHandleBarsAccess().getGroup_3()); 
            // InternalNowereBycicleDsl.g:3622:2: ( rule__HandleBars__Group_3__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==39) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalNowereBycicleDsl.g:3622:3: rule__HandleBars__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__HandleBars__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHandleBarsAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HandleBars__Group__3__Impl"


    // $ANTLR start "rule__HandleBars__Group__4"
    // InternalNowereBycicleDsl.g:3630:1: rule__HandleBars__Group__4 : rule__HandleBars__Group__4__Impl ;
    public final void rule__HandleBars__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:3634:1: ( rule__HandleBars__Group__4__Impl )
            // InternalNowereBycicleDsl.g:3635:2: rule__HandleBars__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HandleBars__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HandleBars__Group__4"


    // $ANTLR start "rule__HandleBars__Group__4__Impl"
    // InternalNowereBycicleDsl.g:3641:1: rule__HandleBars__Group__4__Impl : ( ( rule__HandleBars__Group_4__0 )? ) ;
    public final void rule__HandleBars__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:3645:1: ( ( ( rule__HandleBars__Group_4__0 )? ) )
            // InternalNowereBycicleDsl.g:3646:1: ( ( rule__HandleBars__Group_4__0 )? )
            {
            // InternalNowereBycicleDsl.g:3646:1: ( ( rule__HandleBars__Group_4__0 )? )
            // InternalNowereBycicleDsl.g:3647:2: ( rule__HandleBars__Group_4__0 )?
            {
             before(grammarAccess.getHandleBarsAccess().getGroup_4()); 
            // InternalNowereBycicleDsl.g:3648:2: ( rule__HandleBars__Group_4__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==40) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalNowereBycicleDsl.g:3648:3: rule__HandleBars__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__HandleBars__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHandleBarsAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HandleBars__Group__4__Impl"


    // $ANTLR start "rule__HandleBars__Group_3__0"
    // InternalNowereBycicleDsl.g:3657:1: rule__HandleBars__Group_3__0 : rule__HandleBars__Group_3__0__Impl rule__HandleBars__Group_3__1 ;
    public final void rule__HandleBars__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:3661:1: ( rule__HandleBars__Group_3__0__Impl rule__HandleBars__Group_3__1 )
            // InternalNowereBycicleDsl.g:3662:2: rule__HandleBars__Group_3__0__Impl rule__HandleBars__Group_3__1
            {
            pushFollow(FOLLOW_18);
            rule__HandleBars__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HandleBars__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HandleBars__Group_3__0"


    // $ANTLR start "rule__HandleBars__Group_3__0__Impl"
    // InternalNowereBycicleDsl.g:3669:1: rule__HandleBars__Group_3__0__Impl : ( 'price' ) ;
    public final void rule__HandleBars__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:3673:1: ( ( 'price' ) )
            // InternalNowereBycicleDsl.g:3674:1: ( 'price' )
            {
            // InternalNowereBycicleDsl.g:3674:1: ( 'price' )
            // InternalNowereBycicleDsl.g:3675:2: 'price'
            {
             before(grammarAccess.getHandleBarsAccess().getPriceKeyword_3_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getHandleBarsAccess().getPriceKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HandleBars__Group_3__0__Impl"


    // $ANTLR start "rule__HandleBars__Group_3__1"
    // InternalNowereBycicleDsl.g:3684:1: rule__HandleBars__Group_3__1 : rule__HandleBars__Group_3__1__Impl ;
    public final void rule__HandleBars__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:3688:1: ( rule__HandleBars__Group_3__1__Impl )
            // InternalNowereBycicleDsl.g:3689:2: rule__HandleBars__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HandleBars__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HandleBars__Group_3__1"


    // $ANTLR start "rule__HandleBars__Group_3__1__Impl"
    // InternalNowereBycicleDsl.g:3695:1: rule__HandleBars__Group_3__1__Impl : ( ( rule__HandleBars__PriceAssignment_3_1 ) ) ;
    public final void rule__HandleBars__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:3699:1: ( ( ( rule__HandleBars__PriceAssignment_3_1 ) ) )
            // InternalNowereBycicleDsl.g:3700:1: ( ( rule__HandleBars__PriceAssignment_3_1 ) )
            {
            // InternalNowereBycicleDsl.g:3700:1: ( ( rule__HandleBars__PriceAssignment_3_1 ) )
            // InternalNowereBycicleDsl.g:3701:2: ( rule__HandleBars__PriceAssignment_3_1 )
            {
             before(grammarAccess.getHandleBarsAccess().getPriceAssignment_3_1()); 
            // InternalNowereBycicleDsl.g:3702:2: ( rule__HandleBars__PriceAssignment_3_1 )
            // InternalNowereBycicleDsl.g:3702:3: rule__HandleBars__PriceAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__HandleBars__PriceAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getHandleBarsAccess().getPriceAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HandleBars__Group_3__1__Impl"


    // $ANTLR start "rule__HandleBars__Group_4__0"
    // InternalNowereBycicleDsl.g:3711:1: rule__HandleBars__Group_4__0 : rule__HandleBars__Group_4__0__Impl rule__HandleBars__Group_4__1 ;
    public final void rule__HandleBars__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:3715:1: ( rule__HandleBars__Group_4__0__Impl rule__HandleBars__Group_4__1 )
            // InternalNowereBycicleDsl.g:3716:2: rule__HandleBars__Group_4__0__Impl rule__HandleBars__Group_4__1
            {
            pushFollow(FOLLOW_19);
            rule__HandleBars__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HandleBars__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HandleBars__Group_4__0"


    // $ANTLR start "rule__HandleBars__Group_4__0__Impl"
    // InternalNowereBycicleDsl.g:3723:1: rule__HandleBars__Group_4__0__Impl : ( 'manufacturer' ) ;
    public final void rule__HandleBars__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:3727:1: ( ( 'manufacturer' ) )
            // InternalNowereBycicleDsl.g:3728:1: ( 'manufacturer' )
            {
            // InternalNowereBycicleDsl.g:3728:1: ( 'manufacturer' )
            // InternalNowereBycicleDsl.g:3729:2: 'manufacturer'
            {
             before(grammarAccess.getHandleBarsAccess().getManufacturerKeyword_4_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getHandleBarsAccess().getManufacturerKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HandleBars__Group_4__0__Impl"


    // $ANTLR start "rule__HandleBars__Group_4__1"
    // InternalNowereBycicleDsl.g:3738:1: rule__HandleBars__Group_4__1 : rule__HandleBars__Group_4__1__Impl ;
    public final void rule__HandleBars__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:3742:1: ( rule__HandleBars__Group_4__1__Impl )
            // InternalNowereBycicleDsl.g:3743:2: rule__HandleBars__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HandleBars__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HandleBars__Group_4__1"


    // $ANTLR start "rule__HandleBars__Group_4__1__Impl"
    // InternalNowereBycicleDsl.g:3749:1: rule__HandleBars__Group_4__1__Impl : ( ( rule__HandleBars__ManufacturerAssignment_4_1 ) ) ;
    public final void rule__HandleBars__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:3753:1: ( ( ( rule__HandleBars__ManufacturerAssignment_4_1 ) ) )
            // InternalNowereBycicleDsl.g:3754:1: ( ( rule__HandleBars__ManufacturerAssignment_4_1 ) )
            {
            // InternalNowereBycicleDsl.g:3754:1: ( ( rule__HandleBars__ManufacturerAssignment_4_1 ) )
            // InternalNowereBycicleDsl.g:3755:2: ( rule__HandleBars__ManufacturerAssignment_4_1 )
            {
             before(grammarAccess.getHandleBarsAccess().getManufacturerAssignment_4_1()); 
            // InternalNowereBycicleDsl.g:3756:2: ( rule__HandleBars__ManufacturerAssignment_4_1 )
            // InternalNowereBycicleDsl.g:3756:3: rule__HandleBars__ManufacturerAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__HandleBars__ManufacturerAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getHandleBarsAccess().getManufacturerAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HandleBars__Group_4__1__Impl"


    // $ANTLR start "rule__Bicycle__DeliveryDateAssignment_3_1"
    // InternalNowereBycicleDsl.g:3765:1: rule__Bicycle__DeliveryDateAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Bicycle__DeliveryDateAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:3769:1: ( ( ruleEString ) )
            // InternalNowereBycicleDsl.g:3770:2: ( ruleEString )
            {
            // InternalNowereBycicleDsl.g:3770:2: ( ruleEString )
            // InternalNowereBycicleDsl.g:3771:3: ruleEString
            {
             before(grammarAccess.getBicycleAccess().getDeliveryDateEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBicycleAccess().getDeliveryDateEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bicycle__DeliveryDateAssignment_3_1"


    // $ANTLR start "rule__Bicycle__PartsAssignment_4"
    // InternalNowereBycicleDsl.g:3780:1: rule__Bicycle__PartsAssignment_4 : ( rulePart ) ;
    public final void rule__Bicycle__PartsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:3784:1: ( ( rulePart ) )
            // InternalNowereBycicleDsl.g:3785:2: ( rulePart )
            {
            // InternalNowereBycicleDsl.g:3785:2: ( rulePart )
            // InternalNowereBycicleDsl.g:3786:3: rulePart
            {
             before(grammarAccess.getBicycleAccess().getPartsPartParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            rulePart();

            state._fsp--;

             after(grammarAccess.getBicycleAccess().getPartsPartParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bicycle__PartsAssignment_4"


    // $ANTLR start "rule__Bicycle__CustomerDataAssignment_5"
    // InternalNowereBycicleDsl.g:3795:1: rule__Bicycle__CustomerDataAssignment_5 : ( ruleCustomerData ) ;
    public final void rule__Bicycle__CustomerDataAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:3799:1: ( ( ruleCustomerData ) )
            // InternalNowereBycicleDsl.g:3800:2: ( ruleCustomerData )
            {
            // InternalNowereBycicleDsl.g:3800:2: ( ruleCustomerData )
            // InternalNowereBycicleDsl.g:3801:3: ruleCustomerData
            {
             before(grammarAccess.getBicycleAccess().getCustomerDataCustomerDataParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleCustomerData();

            state._fsp--;

             after(grammarAccess.getBicycleAccess().getCustomerDataCustomerDataParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bicycle__CustomerDataAssignment_5"


    // $ANTLR start "rule__Bicycle__ParametersAssignment_6"
    // InternalNowereBycicleDsl.g:3810:1: rule__Bicycle__ParametersAssignment_6 : ( ruleParameter ) ;
    public final void rule__Bicycle__ParametersAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:3814:1: ( ( ruleParameter ) )
            // InternalNowereBycicleDsl.g:3815:2: ( ruleParameter )
            {
            // InternalNowereBycicleDsl.g:3815:2: ( ruleParameter )
            // InternalNowereBycicleDsl.g:3816:3: ruleParameter
            {
             before(grammarAccess.getBicycleAccess().getParametersParameterParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getBicycleAccess().getParametersParameterParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bicycle__ParametersAssignment_6"


    // $ANTLR start "rule__CustomerData__NameAssignment_2"
    // InternalNowereBycicleDsl.g:3825:1: rule__CustomerData__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__CustomerData__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:3829:1: ( ( ruleEString ) )
            // InternalNowereBycicleDsl.g:3830:2: ( ruleEString )
            {
            // InternalNowereBycicleDsl.g:3830:2: ( ruleEString )
            // InternalNowereBycicleDsl.g:3831:3: ruleEString
            {
             before(grammarAccess.getCustomerDataAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCustomerDataAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomerData__NameAssignment_2"


    // $ANTLR start "rule__CustomerData__AddressAssignment_3_1"
    // InternalNowereBycicleDsl.g:3840:1: rule__CustomerData__AddressAssignment_3_1 : ( ruleEString ) ;
    public final void rule__CustomerData__AddressAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:3844:1: ( ( ruleEString ) )
            // InternalNowereBycicleDsl.g:3845:2: ( ruleEString )
            {
            // InternalNowereBycicleDsl.g:3845:2: ( ruleEString )
            // InternalNowereBycicleDsl.g:3846:3: ruleEString
            {
             before(grammarAccess.getCustomerDataAccess().getAddressEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCustomerDataAccess().getAddressEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomerData__AddressAssignment_3_1"


    // $ANTLR start "rule__CustomerData__ParametersAssignment_4"
    // InternalNowereBycicleDsl.g:3855:1: rule__CustomerData__ParametersAssignment_4 : ( ruleParameter ) ;
    public final void rule__CustomerData__ParametersAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:3859:1: ( ( ruleParameter ) )
            // InternalNowereBycicleDsl.g:3860:2: ( ruleParameter )
            {
            // InternalNowereBycicleDsl.g:3860:2: ( ruleParameter )
            // InternalNowereBycicleDsl.g:3861:3: ruleParameter
            {
             before(grammarAccess.getCustomerDataAccess().getParametersParameterParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getCustomerDataAccess().getParametersParameterParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomerData__ParametersAssignment_4"


    // $ANTLR start "rule__Parameter__NameAssignment_2"
    // InternalNowereBycicleDsl.g:3870:1: rule__Parameter__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Parameter__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:3874:1: ( ( ruleEString ) )
            // InternalNowereBycicleDsl.g:3875:2: ( ruleEString )
            {
            // InternalNowereBycicleDsl.g:3875:2: ( ruleEString )
            // InternalNowereBycicleDsl.g:3876:3: ruleEString
            {
             before(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__NameAssignment_2"


    // $ANTLR start "rule__Parameter__ValueAssignment_3"
    // InternalNowereBycicleDsl.g:3885:1: rule__Parameter__ValueAssignment_3 : ( ruleEString ) ;
    public final void rule__Parameter__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:3889:1: ( ( ruleEString ) )
            // InternalNowereBycicleDsl.g:3890:2: ( ruleEString )
            {
            // InternalNowereBycicleDsl.g:3890:2: ( ruleEString )
            // InternalNowereBycicleDsl.g:3891:3: ruleEString
            {
             before(grammarAccess.getParameterAccess().getValueEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getValueEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__ValueAssignment_3"


    // $ANTLR start "rule__Frame__NameAssignment_2"
    // InternalNowereBycicleDsl.g:3900:1: rule__Frame__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Frame__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:3904:1: ( ( ruleEString ) )
            // InternalNowereBycicleDsl.g:3905:2: ( ruleEString )
            {
            // InternalNowereBycicleDsl.g:3905:2: ( ruleEString )
            // InternalNowereBycicleDsl.g:3906:3: ruleEString
            {
             before(grammarAccess.getFrameAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFrameAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frame__NameAssignment_2"


    // $ANTLR start "rule__Frame__PriceAssignment_3_1"
    // InternalNowereBycicleDsl.g:3915:1: rule__Frame__PriceAssignment_3_1 : ( ruleEDouble ) ;
    public final void rule__Frame__PriceAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:3919:1: ( ( ruleEDouble ) )
            // InternalNowereBycicleDsl.g:3920:2: ( ruleEDouble )
            {
            // InternalNowereBycicleDsl.g:3920:2: ( ruleEDouble )
            // InternalNowereBycicleDsl.g:3921:3: ruleEDouble
            {
             before(grammarAccess.getFrameAccess().getPriceEDoubleParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getFrameAccess().getPriceEDoubleParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frame__PriceAssignment_3_1"


    // $ANTLR start "rule__Frame__ManufacturerAssignment_4_1"
    // InternalNowereBycicleDsl.g:3930:1: rule__Frame__ManufacturerAssignment_4_1 : ( ruleManufacturers ) ;
    public final void rule__Frame__ManufacturerAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:3934:1: ( ( ruleManufacturers ) )
            // InternalNowereBycicleDsl.g:3935:2: ( ruleManufacturers )
            {
            // InternalNowereBycicleDsl.g:3935:2: ( ruleManufacturers )
            // InternalNowereBycicleDsl.g:3936:3: ruleManufacturers
            {
             before(grammarAccess.getFrameAccess().getManufacturerManufacturersEnumRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleManufacturers();

            state._fsp--;

             after(grammarAccess.getFrameAccess().getManufacturerManufacturersEnumRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frame__ManufacturerAssignment_4_1"


    // $ANTLR start "rule__Frame__FrameTypeAssignment_5_1"
    // InternalNowereBycicleDsl.g:3945:1: rule__Frame__FrameTypeAssignment_5_1 : ( ruleFrameType ) ;
    public final void rule__Frame__FrameTypeAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:3949:1: ( ( ruleFrameType ) )
            // InternalNowereBycicleDsl.g:3950:2: ( ruleFrameType )
            {
            // InternalNowereBycicleDsl.g:3950:2: ( ruleFrameType )
            // InternalNowereBycicleDsl.g:3951:3: ruleFrameType
            {
             before(grammarAccess.getFrameAccess().getFrameTypeFrameTypeEnumRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFrameType();

            state._fsp--;

             after(grammarAccess.getFrameAccess().getFrameTypeFrameTypeEnumRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frame__FrameTypeAssignment_5_1"


    // $ANTLR start "rule__Frame__ColorAssignment_6_1"
    // InternalNowereBycicleDsl.g:3960:1: rule__Frame__ColorAssignment_6_1 : ( ruleColor ) ;
    public final void rule__Frame__ColorAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:3964:1: ( ( ruleColor ) )
            // InternalNowereBycicleDsl.g:3965:2: ( ruleColor )
            {
            // InternalNowereBycicleDsl.g:3965:2: ( ruleColor )
            // InternalNowereBycicleDsl.g:3966:3: ruleColor
            {
             before(grammarAccess.getFrameAccess().getColorColorEnumRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleColor();

            state._fsp--;

             after(grammarAccess.getFrameAccess().getColorColorEnumRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frame__ColorAssignment_6_1"


    // $ANTLR start "rule__Wheel__NameAssignment_2"
    // InternalNowereBycicleDsl.g:3975:1: rule__Wheel__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Wheel__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:3979:1: ( ( ruleEString ) )
            // InternalNowereBycicleDsl.g:3980:2: ( ruleEString )
            {
            // InternalNowereBycicleDsl.g:3980:2: ( ruleEString )
            // InternalNowereBycicleDsl.g:3981:3: ruleEString
            {
             before(grammarAccess.getWheelAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWheelAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wheel__NameAssignment_2"


    // $ANTLR start "rule__Wheel__PriceAssignment_3_1"
    // InternalNowereBycicleDsl.g:3990:1: rule__Wheel__PriceAssignment_3_1 : ( ruleEDouble ) ;
    public final void rule__Wheel__PriceAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:3994:1: ( ( ruleEDouble ) )
            // InternalNowereBycicleDsl.g:3995:2: ( ruleEDouble )
            {
            // InternalNowereBycicleDsl.g:3995:2: ( ruleEDouble )
            // InternalNowereBycicleDsl.g:3996:3: ruleEDouble
            {
             before(grammarAccess.getWheelAccess().getPriceEDoubleParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getWheelAccess().getPriceEDoubleParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wheel__PriceAssignment_3_1"


    // $ANTLR start "rule__Wheel__ManufacturerAssignment_4_1"
    // InternalNowereBycicleDsl.g:4005:1: rule__Wheel__ManufacturerAssignment_4_1 : ( ruleManufacturers ) ;
    public final void rule__Wheel__ManufacturerAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:4009:1: ( ( ruleManufacturers ) )
            // InternalNowereBycicleDsl.g:4010:2: ( ruleManufacturers )
            {
            // InternalNowereBycicleDsl.g:4010:2: ( ruleManufacturers )
            // InternalNowereBycicleDsl.g:4011:3: ruleManufacturers
            {
             before(grammarAccess.getWheelAccess().getManufacturerManufacturersEnumRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleManufacturers();

            state._fsp--;

             after(grammarAccess.getWheelAccess().getManufacturerManufacturersEnumRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wheel__ManufacturerAssignment_4_1"


    // $ANTLR start "rule__InnerGear__NameAssignment_2"
    // InternalNowereBycicleDsl.g:4020:1: rule__InnerGear__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__InnerGear__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:4024:1: ( ( ruleEString ) )
            // InternalNowereBycicleDsl.g:4025:2: ( ruleEString )
            {
            // InternalNowereBycicleDsl.g:4025:2: ( ruleEString )
            // InternalNowereBycicleDsl.g:4026:3: ruleEString
            {
             before(grammarAccess.getInnerGearAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInnerGearAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerGear__NameAssignment_2"


    // $ANTLR start "rule__InnerGear__PriceAssignment_3_1"
    // InternalNowereBycicleDsl.g:4035:1: rule__InnerGear__PriceAssignment_3_1 : ( ruleEDouble ) ;
    public final void rule__InnerGear__PriceAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:4039:1: ( ( ruleEDouble ) )
            // InternalNowereBycicleDsl.g:4040:2: ( ruleEDouble )
            {
            // InternalNowereBycicleDsl.g:4040:2: ( ruleEDouble )
            // InternalNowereBycicleDsl.g:4041:3: ruleEDouble
            {
             before(grammarAccess.getInnerGearAccess().getPriceEDoubleParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getInnerGearAccess().getPriceEDoubleParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerGear__PriceAssignment_3_1"


    // $ANTLR start "rule__InnerGear__ManufacturerAssignment_4_1"
    // InternalNowereBycicleDsl.g:4050:1: rule__InnerGear__ManufacturerAssignment_4_1 : ( ruleManufacturers ) ;
    public final void rule__InnerGear__ManufacturerAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:4054:1: ( ( ruleManufacturers ) )
            // InternalNowereBycicleDsl.g:4055:2: ( ruleManufacturers )
            {
            // InternalNowereBycicleDsl.g:4055:2: ( ruleManufacturers )
            // InternalNowereBycicleDsl.g:4056:3: ruleManufacturers
            {
             before(grammarAccess.getInnerGearAccess().getManufacturerManufacturersEnumRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleManufacturers();

            state._fsp--;

             after(grammarAccess.getInnerGearAccess().getManufacturerManufacturersEnumRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerGear__ManufacturerAssignment_4_1"


    // $ANTLR start "rule__OuterGear__NameAssignment_2"
    // InternalNowereBycicleDsl.g:4065:1: rule__OuterGear__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__OuterGear__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:4069:1: ( ( ruleEString ) )
            // InternalNowereBycicleDsl.g:4070:2: ( ruleEString )
            {
            // InternalNowereBycicleDsl.g:4070:2: ( ruleEString )
            // InternalNowereBycicleDsl.g:4071:3: ruleEString
            {
             before(grammarAccess.getOuterGearAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOuterGearAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OuterGear__NameAssignment_2"


    // $ANTLR start "rule__OuterGear__PriceAssignment_3_1"
    // InternalNowereBycicleDsl.g:4080:1: rule__OuterGear__PriceAssignment_3_1 : ( ruleEDouble ) ;
    public final void rule__OuterGear__PriceAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:4084:1: ( ( ruleEDouble ) )
            // InternalNowereBycicleDsl.g:4085:2: ( ruleEDouble )
            {
            // InternalNowereBycicleDsl.g:4085:2: ( ruleEDouble )
            // InternalNowereBycicleDsl.g:4086:3: ruleEDouble
            {
             before(grammarAccess.getOuterGearAccess().getPriceEDoubleParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getOuterGearAccess().getPriceEDoubleParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OuterGear__PriceAssignment_3_1"


    // $ANTLR start "rule__OuterGear__ManufacturerAssignment_4_1"
    // InternalNowereBycicleDsl.g:4095:1: rule__OuterGear__ManufacturerAssignment_4_1 : ( ruleManufacturers ) ;
    public final void rule__OuterGear__ManufacturerAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:4099:1: ( ( ruleManufacturers ) )
            // InternalNowereBycicleDsl.g:4100:2: ( ruleManufacturers )
            {
            // InternalNowereBycicleDsl.g:4100:2: ( ruleManufacturers )
            // InternalNowereBycicleDsl.g:4101:3: ruleManufacturers
            {
             before(grammarAccess.getOuterGearAccess().getManufacturerManufacturersEnumRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleManufacturers();

            state._fsp--;

             after(grammarAccess.getOuterGearAccess().getManufacturerManufacturersEnumRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OuterGear__ManufacturerAssignment_4_1"


    // $ANTLR start "rule__Pedals__NameAssignment_2"
    // InternalNowereBycicleDsl.g:4110:1: rule__Pedals__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Pedals__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:4114:1: ( ( ruleEString ) )
            // InternalNowereBycicleDsl.g:4115:2: ( ruleEString )
            {
            // InternalNowereBycicleDsl.g:4115:2: ( ruleEString )
            // InternalNowereBycicleDsl.g:4116:3: ruleEString
            {
             before(grammarAccess.getPedalsAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPedalsAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pedals__NameAssignment_2"


    // $ANTLR start "rule__Pedals__PriceAssignment_3_1"
    // InternalNowereBycicleDsl.g:4125:1: rule__Pedals__PriceAssignment_3_1 : ( ruleEDouble ) ;
    public final void rule__Pedals__PriceAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:4129:1: ( ( ruleEDouble ) )
            // InternalNowereBycicleDsl.g:4130:2: ( ruleEDouble )
            {
            // InternalNowereBycicleDsl.g:4130:2: ( ruleEDouble )
            // InternalNowereBycicleDsl.g:4131:3: ruleEDouble
            {
             before(grammarAccess.getPedalsAccess().getPriceEDoubleParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getPedalsAccess().getPriceEDoubleParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pedals__PriceAssignment_3_1"


    // $ANTLR start "rule__Pedals__ManufacturerAssignment_4_1"
    // InternalNowereBycicleDsl.g:4140:1: rule__Pedals__ManufacturerAssignment_4_1 : ( ruleManufacturers ) ;
    public final void rule__Pedals__ManufacturerAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:4144:1: ( ( ruleManufacturers ) )
            // InternalNowereBycicleDsl.g:4145:2: ( ruleManufacturers )
            {
            // InternalNowereBycicleDsl.g:4145:2: ( ruleManufacturers )
            // InternalNowereBycicleDsl.g:4146:3: ruleManufacturers
            {
             before(grammarAccess.getPedalsAccess().getManufacturerManufacturersEnumRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleManufacturers();

            state._fsp--;

             after(grammarAccess.getPedalsAccess().getManufacturerManufacturersEnumRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pedals__ManufacturerAssignment_4_1"


    // $ANTLR start "rule__Pedals__PedalTypeAssignment_5_1"
    // InternalNowereBycicleDsl.g:4155:1: rule__Pedals__PedalTypeAssignment_5_1 : ( rulePedalTypes ) ;
    public final void rule__Pedals__PedalTypeAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:4159:1: ( ( rulePedalTypes ) )
            // InternalNowereBycicleDsl.g:4160:2: ( rulePedalTypes )
            {
            // InternalNowereBycicleDsl.g:4160:2: ( rulePedalTypes )
            // InternalNowereBycicleDsl.g:4161:3: rulePedalTypes
            {
             before(grammarAccess.getPedalsAccess().getPedalTypePedalTypesEnumRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            rulePedalTypes();

            state._fsp--;

             after(grammarAccess.getPedalsAccess().getPedalTypePedalTypesEnumRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pedals__PedalTypeAssignment_5_1"


    // $ANTLR start "rule__Saddle__NameAssignment_2"
    // InternalNowereBycicleDsl.g:4170:1: rule__Saddle__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Saddle__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:4174:1: ( ( ruleEString ) )
            // InternalNowereBycicleDsl.g:4175:2: ( ruleEString )
            {
            // InternalNowereBycicleDsl.g:4175:2: ( ruleEString )
            // InternalNowereBycicleDsl.g:4176:3: ruleEString
            {
             before(grammarAccess.getSaddleAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSaddleAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Saddle__NameAssignment_2"


    // $ANTLR start "rule__Saddle__PriceAssignment_3_1"
    // InternalNowereBycicleDsl.g:4185:1: rule__Saddle__PriceAssignment_3_1 : ( ruleEDouble ) ;
    public final void rule__Saddle__PriceAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:4189:1: ( ( ruleEDouble ) )
            // InternalNowereBycicleDsl.g:4190:2: ( ruleEDouble )
            {
            // InternalNowereBycicleDsl.g:4190:2: ( ruleEDouble )
            // InternalNowereBycicleDsl.g:4191:3: ruleEDouble
            {
             before(grammarAccess.getSaddleAccess().getPriceEDoubleParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getSaddleAccess().getPriceEDoubleParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Saddle__PriceAssignment_3_1"


    // $ANTLR start "rule__Saddle__ManufacturerAssignment_4_1"
    // InternalNowereBycicleDsl.g:4200:1: rule__Saddle__ManufacturerAssignment_4_1 : ( ruleManufacturers ) ;
    public final void rule__Saddle__ManufacturerAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:4204:1: ( ( ruleManufacturers ) )
            // InternalNowereBycicleDsl.g:4205:2: ( ruleManufacturers )
            {
            // InternalNowereBycicleDsl.g:4205:2: ( ruleManufacturers )
            // InternalNowereBycicleDsl.g:4206:3: ruleManufacturers
            {
             before(grammarAccess.getSaddleAccess().getManufacturerManufacturersEnumRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleManufacturers();

            state._fsp--;

             after(grammarAccess.getSaddleAccess().getManufacturerManufacturersEnumRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Saddle__ManufacturerAssignment_4_1"


    // $ANTLR start "rule__Saddle__SaddleTypeAssignment_5_1"
    // InternalNowereBycicleDsl.g:4215:1: rule__Saddle__SaddleTypeAssignment_5_1 : ( ruleSaddleType ) ;
    public final void rule__Saddle__SaddleTypeAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:4219:1: ( ( ruleSaddleType ) )
            // InternalNowereBycicleDsl.g:4220:2: ( ruleSaddleType )
            {
            // InternalNowereBycicleDsl.g:4220:2: ( ruleSaddleType )
            // InternalNowereBycicleDsl.g:4221:3: ruleSaddleType
            {
             before(grammarAccess.getSaddleAccess().getSaddleTypeSaddleTypeEnumRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSaddleType();

            state._fsp--;

             after(grammarAccess.getSaddleAccess().getSaddleTypeSaddleTypeEnumRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Saddle__SaddleTypeAssignment_5_1"


    // $ANTLR start "rule__HandBrakes__NameAssignment_2"
    // InternalNowereBycicleDsl.g:4230:1: rule__HandBrakes__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__HandBrakes__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:4234:1: ( ( ruleEString ) )
            // InternalNowereBycicleDsl.g:4235:2: ( ruleEString )
            {
            // InternalNowereBycicleDsl.g:4235:2: ( ruleEString )
            // InternalNowereBycicleDsl.g:4236:3: ruleEString
            {
             before(grammarAccess.getHandBrakesAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getHandBrakesAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HandBrakes__NameAssignment_2"


    // $ANTLR start "rule__HandBrakes__PriceAssignment_3_1"
    // InternalNowereBycicleDsl.g:4245:1: rule__HandBrakes__PriceAssignment_3_1 : ( ruleEDouble ) ;
    public final void rule__HandBrakes__PriceAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:4249:1: ( ( ruleEDouble ) )
            // InternalNowereBycicleDsl.g:4250:2: ( ruleEDouble )
            {
            // InternalNowereBycicleDsl.g:4250:2: ( ruleEDouble )
            // InternalNowereBycicleDsl.g:4251:3: ruleEDouble
            {
             before(grammarAccess.getHandBrakesAccess().getPriceEDoubleParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getHandBrakesAccess().getPriceEDoubleParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HandBrakes__PriceAssignment_3_1"


    // $ANTLR start "rule__HandBrakes__ManufacturerAssignment_4_1"
    // InternalNowereBycicleDsl.g:4260:1: rule__HandBrakes__ManufacturerAssignment_4_1 : ( ruleManufacturers ) ;
    public final void rule__HandBrakes__ManufacturerAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:4264:1: ( ( ruleManufacturers ) )
            // InternalNowereBycicleDsl.g:4265:2: ( ruleManufacturers )
            {
            // InternalNowereBycicleDsl.g:4265:2: ( ruleManufacturers )
            // InternalNowereBycicleDsl.g:4266:3: ruleManufacturers
            {
             before(grammarAccess.getHandBrakesAccess().getManufacturerManufacturersEnumRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleManufacturers();

            state._fsp--;

             after(grammarAccess.getHandBrakesAccess().getManufacturerManufacturersEnumRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HandBrakes__ManufacturerAssignment_4_1"


    // $ANTLR start "rule__HandleBars__NameAssignment_2"
    // InternalNowereBycicleDsl.g:4275:1: rule__HandleBars__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__HandleBars__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:4279:1: ( ( ruleEString ) )
            // InternalNowereBycicleDsl.g:4280:2: ( ruleEString )
            {
            // InternalNowereBycicleDsl.g:4280:2: ( ruleEString )
            // InternalNowereBycicleDsl.g:4281:3: ruleEString
            {
             before(grammarAccess.getHandleBarsAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getHandleBarsAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HandleBars__NameAssignment_2"


    // $ANTLR start "rule__HandleBars__PriceAssignment_3_1"
    // InternalNowereBycicleDsl.g:4290:1: rule__HandleBars__PriceAssignment_3_1 : ( ruleEDouble ) ;
    public final void rule__HandleBars__PriceAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:4294:1: ( ( ruleEDouble ) )
            // InternalNowereBycicleDsl.g:4295:2: ( ruleEDouble )
            {
            // InternalNowereBycicleDsl.g:4295:2: ( ruleEDouble )
            // InternalNowereBycicleDsl.g:4296:3: ruleEDouble
            {
             before(grammarAccess.getHandleBarsAccess().getPriceEDoubleParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getHandleBarsAccess().getPriceEDoubleParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HandleBars__PriceAssignment_3_1"


    // $ANTLR start "rule__HandleBars__ManufacturerAssignment_4_1"
    // InternalNowereBycicleDsl.g:4305:1: rule__HandleBars__ManufacturerAssignment_4_1 : ( ruleManufacturers ) ;
    public final void rule__HandleBars__ManufacturerAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNowereBycicleDsl.g:4309:1: ( ( ruleManufacturers ) )
            // InternalNowereBycicleDsl.g:4310:2: ( ruleManufacturers )
            {
            // InternalNowereBycicleDsl.g:4310:2: ( ruleManufacturers )
            // InternalNowereBycicleDsl.g:4311:3: ruleManufacturers
            {
             before(grammarAccess.getHandleBarsAccess().getManufacturerManufacturersEnumRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleManufacturers();

            state._fsp--;

             after(grammarAccess.getHandleBarsAccess().getManufacturerManufacturersEnumRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HandleBars__ManufacturerAssignment_4_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000D784100000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000A00000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000D784100000022L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000002000000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000001000000040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000078000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000003000000040L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000780000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000818000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000007800000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0002018000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000078000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0004000000000000L});

}