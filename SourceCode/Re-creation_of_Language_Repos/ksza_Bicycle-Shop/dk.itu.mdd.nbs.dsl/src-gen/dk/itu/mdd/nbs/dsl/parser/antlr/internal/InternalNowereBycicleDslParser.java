package dk.itu.mdd.nbs.dsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import dk.itu.mdd.nbs.dsl.services.NowereBycicleDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalNowereBycicleDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Bicycle'", "'deliveryDate'", "'CustomerData'", "'address'", "'Parameter'", "'-'", "'.'", "'E'", "'e'", "'Frame'", "'price'", "'manufacturer'", "'frameType'", "'color'", "'Wheel'", "'InnerGear'", "'OuterGear'", "'Pedals'", "'pedalType'", "'Saddle'", "'saddleType'", "'HandBrakes'", "'HandleBars'", "'SuperParts'", "'HomeParts'", "'HandMadeParts'", "'RacerFrame'", "'CityFrame'", "'UnicycleFrame'", "'Red'", "'Blue'", "'Black'", "'Green'", "'ChildPedals'", "'SportsPedals'", "'ComfortPedals'", "'ExtremePedals'", "'RacingSaddle'", "'ChildSaddle'", "'SpecialUnicycleSaddle'", "'ComfortSaddle'"
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
    public static final int RULE_ID=4;
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
    public static final int RULE_STRING=6;
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

        public InternalNowereBycicleDslParser(TokenStream input, NowereBycicleDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Bicycle";
       	}

       	@Override
       	protected NowereBycicleDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleBicycle"
    // InternalNowereBycicleDsl.g:65:1: entryRuleBicycle returns [EObject current=null] : iv_ruleBicycle= ruleBicycle EOF ;
    public final EObject entryRuleBicycle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBicycle = null;


        try {
            // InternalNowereBycicleDsl.g:65:48: (iv_ruleBicycle= ruleBicycle EOF )
            // InternalNowereBycicleDsl.g:66:2: iv_ruleBicycle= ruleBicycle EOF
            {
             newCompositeNode(grammarAccess.getBicycleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBicycle=ruleBicycle();

            state._fsp--;

             current =iv_ruleBicycle; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBicycle"


    // $ANTLR start "ruleBicycle"
    // InternalNowereBycicleDsl.g:72:1: ruleBicycle returns [EObject current=null] : ( () otherlv_1= 'Bicycle' (this_ID_2= RULE_ID )? (otherlv_3= 'deliveryDate' ( (lv_deliveryDate_4_0= ruleEString ) ) )? ( (lv_parts_5_0= rulePart ) )+ ( (lv_customerData_6_0= ruleCustomerData ) )? ( (lv_parameters_7_0= ruleParameter ) )* ) ;
    public final EObject ruleBicycle() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_ID_2=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_deliveryDate_4_0 = null;

        EObject lv_parts_5_0 = null;

        EObject lv_customerData_6_0 = null;

        EObject lv_parameters_7_0 = null;



        	enterRule();

        try {
            // InternalNowereBycicleDsl.g:78:2: ( ( () otherlv_1= 'Bicycle' (this_ID_2= RULE_ID )? (otherlv_3= 'deliveryDate' ( (lv_deliveryDate_4_0= ruleEString ) ) )? ( (lv_parts_5_0= rulePart ) )+ ( (lv_customerData_6_0= ruleCustomerData ) )? ( (lv_parameters_7_0= ruleParameter ) )* ) )
            // InternalNowereBycicleDsl.g:79:2: ( () otherlv_1= 'Bicycle' (this_ID_2= RULE_ID )? (otherlv_3= 'deliveryDate' ( (lv_deliveryDate_4_0= ruleEString ) ) )? ( (lv_parts_5_0= rulePart ) )+ ( (lv_customerData_6_0= ruleCustomerData ) )? ( (lv_parameters_7_0= ruleParameter ) )* )
            {
            // InternalNowereBycicleDsl.g:79:2: ( () otherlv_1= 'Bicycle' (this_ID_2= RULE_ID )? (otherlv_3= 'deliveryDate' ( (lv_deliveryDate_4_0= ruleEString ) ) )? ( (lv_parts_5_0= rulePart ) )+ ( (lv_customerData_6_0= ruleCustomerData ) )? ( (lv_parameters_7_0= ruleParameter ) )* )
            // InternalNowereBycicleDsl.g:80:3: () otherlv_1= 'Bicycle' (this_ID_2= RULE_ID )? (otherlv_3= 'deliveryDate' ( (lv_deliveryDate_4_0= ruleEString ) ) )? ( (lv_parts_5_0= rulePart ) )+ ( (lv_customerData_6_0= ruleCustomerData ) )? ( (lv_parameters_7_0= ruleParameter ) )*
            {
            // InternalNowereBycicleDsl.g:80:3: ()
            // InternalNowereBycicleDsl.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBicycleAccess().getBicycleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getBicycleAccess().getBicycleKeyword_1());
            		
            // InternalNowereBycicleDsl.g:91:3: (this_ID_2= RULE_ID )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalNowereBycicleDsl.g:92:4: this_ID_2= RULE_ID
                    {
                    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_3); 

                    				newLeafNode(this_ID_2, grammarAccess.getBicycleAccess().getIDTerminalRuleCall_2());
                    			

                    }
                    break;

            }

            // InternalNowereBycicleDsl.g:97:3: (otherlv_3= 'deliveryDate' ( (lv_deliveryDate_4_0= ruleEString ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalNowereBycicleDsl.g:98:4: otherlv_3= 'deliveryDate' ( (lv_deliveryDate_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,12,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getBicycleAccess().getDeliveryDateKeyword_3_0());
                    			
                    // InternalNowereBycicleDsl.g:102:4: ( (lv_deliveryDate_4_0= ruleEString ) )
                    // InternalNowereBycicleDsl.g:103:5: (lv_deliveryDate_4_0= ruleEString )
                    {
                    // InternalNowereBycicleDsl.g:103:5: (lv_deliveryDate_4_0= ruleEString )
                    // InternalNowereBycicleDsl.g:104:6: lv_deliveryDate_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getBicycleAccess().getDeliveryDateEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_3);
                    lv_deliveryDate_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBicycleRule());
                    						}
                    						set(
                    							current,
                    							"deliveryDate",
                    							lv_deliveryDate_4_0,
                    							"dk.itu.mdd.nbs.dsl.NowereBycicleDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalNowereBycicleDsl.g:122:3: ( (lv_parts_5_0= rulePart ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==20||(LA3_0>=25 && LA3_0<=28)||LA3_0==30||(LA3_0>=32 && LA3_0<=33)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalNowereBycicleDsl.g:123:4: (lv_parts_5_0= rulePart )
            	    {
            	    // InternalNowereBycicleDsl.g:123:4: (lv_parts_5_0= rulePart )
            	    // InternalNowereBycicleDsl.g:124:5: lv_parts_5_0= rulePart
            	    {

            	    					newCompositeNode(grammarAccess.getBicycleAccess().getPartsPartParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_parts_5_0=rulePart();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBicycleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"parts",
            	    						lv_parts_5_0,
            	    						"dk.itu.mdd.nbs.dsl.NowereBycicleDsl.Part");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            // InternalNowereBycicleDsl.g:141:3: ( (lv_customerData_6_0= ruleCustomerData ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalNowereBycicleDsl.g:142:4: (lv_customerData_6_0= ruleCustomerData )
                    {
                    // InternalNowereBycicleDsl.g:142:4: (lv_customerData_6_0= ruleCustomerData )
                    // InternalNowereBycicleDsl.g:143:5: lv_customerData_6_0= ruleCustomerData
                    {

                    					newCompositeNode(grammarAccess.getBicycleAccess().getCustomerDataCustomerDataParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_6);
                    lv_customerData_6_0=ruleCustomerData();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getBicycleRule());
                    					}
                    					add(
                    						current,
                    						"customerData",
                    						lv_customerData_6_0,
                    						"dk.itu.mdd.nbs.dsl.NowereBycicleDsl.CustomerData");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalNowereBycicleDsl.g:160:3: ( (lv_parameters_7_0= ruleParameter ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalNowereBycicleDsl.g:161:4: (lv_parameters_7_0= ruleParameter )
            	    {
            	    // InternalNowereBycicleDsl.g:161:4: (lv_parameters_7_0= ruleParameter )
            	    // InternalNowereBycicleDsl.g:162:5: lv_parameters_7_0= ruleParameter
            	    {

            	    					newCompositeNode(grammarAccess.getBicycleAccess().getParametersParameterParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_parameters_7_0=ruleParameter();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBicycleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"parameters",
            	    						lv_parameters_7_0,
            	    						"dk.itu.mdd.nbs.dsl.NowereBycicleDsl.Parameter");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBicycle"


    // $ANTLR start "entryRulePart"
    // InternalNowereBycicleDsl.g:183:1: entryRulePart returns [EObject current=null] : iv_rulePart= rulePart EOF ;
    public final EObject entryRulePart() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePart = null;


        try {
            // InternalNowereBycicleDsl.g:183:45: (iv_rulePart= rulePart EOF )
            // InternalNowereBycicleDsl.g:184:2: iv_rulePart= rulePart EOF
            {
             newCompositeNode(grammarAccess.getPartRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePart=rulePart();

            state._fsp--;

             current =iv_rulePart; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePart"


    // $ANTLR start "rulePart"
    // InternalNowereBycicleDsl.g:190:1: rulePart returns [EObject current=null] : (this_Frame_0= ruleFrame | this_Wheel_1= ruleWheel | this_InnerGear_2= ruleInnerGear | this_OuterGear_3= ruleOuterGear | this_Pedals_4= rulePedals | this_Saddle_5= ruleSaddle | this_HandBrakes_6= ruleHandBrakes | this_HandleBars_7= ruleHandleBars ) ;
    public final EObject rulePart() throws RecognitionException {
        EObject current = null;

        EObject this_Frame_0 = null;

        EObject this_Wheel_1 = null;

        EObject this_InnerGear_2 = null;

        EObject this_OuterGear_3 = null;

        EObject this_Pedals_4 = null;

        EObject this_Saddle_5 = null;

        EObject this_HandBrakes_6 = null;

        EObject this_HandleBars_7 = null;



        	enterRule();

        try {
            // InternalNowereBycicleDsl.g:196:2: ( (this_Frame_0= ruleFrame | this_Wheel_1= ruleWheel | this_InnerGear_2= ruleInnerGear | this_OuterGear_3= ruleOuterGear | this_Pedals_4= rulePedals | this_Saddle_5= ruleSaddle | this_HandBrakes_6= ruleHandBrakes | this_HandleBars_7= ruleHandleBars ) )
            // InternalNowereBycicleDsl.g:197:2: (this_Frame_0= ruleFrame | this_Wheel_1= ruleWheel | this_InnerGear_2= ruleInnerGear | this_OuterGear_3= ruleOuterGear | this_Pedals_4= rulePedals | this_Saddle_5= ruleSaddle | this_HandBrakes_6= ruleHandBrakes | this_HandleBars_7= ruleHandleBars )
            {
            // InternalNowereBycicleDsl.g:197:2: (this_Frame_0= ruleFrame | this_Wheel_1= ruleWheel | this_InnerGear_2= ruleInnerGear | this_OuterGear_3= ruleOuterGear | this_Pedals_4= rulePedals | this_Saddle_5= ruleSaddle | this_HandBrakes_6= ruleHandBrakes | this_HandleBars_7= ruleHandleBars )
            int alt6=8;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt6=1;
                }
                break;
            case 25:
                {
                alt6=2;
                }
                break;
            case 26:
                {
                alt6=3;
                }
                break;
            case 27:
                {
                alt6=4;
                }
                break;
            case 28:
                {
                alt6=5;
                }
                break;
            case 30:
                {
                alt6=6;
                }
                break;
            case 32:
                {
                alt6=7;
                }
                break;
            case 33:
                {
                alt6=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalNowereBycicleDsl.g:198:3: this_Frame_0= ruleFrame
                    {

                    			newCompositeNode(grammarAccess.getPartAccess().getFrameParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Frame_0=ruleFrame();

                    state._fsp--;


                    			current = this_Frame_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalNowereBycicleDsl.g:207:3: this_Wheel_1= ruleWheel
                    {

                    			newCompositeNode(grammarAccess.getPartAccess().getWheelParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Wheel_1=ruleWheel();

                    state._fsp--;


                    			current = this_Wheel_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalNowereBycicleDsl.g:216:3: this_InnerGear_2= ruleInnerGear
                    {

                    			newCompositeNode(grammarAccess.getPartAccess().getInnerGearParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_InnerGear_2=ruleInnerGear();

                    state._fsp--;


                    			current = this_InnerGear_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalNowereBycicleDsl.g:225:3: this_OuterGear_3= ruleOuterGear
                    {

                    			newCompositeNode(grammarAccess.getPartAccess().getOuterGearParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_OuterGear_3=ruleOuterGear();

                    state._fsp--;


                    			current = this_OuterGear_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalNowereBycicleDsl.g:234:3: this_Pedals_4= rulePedals
                    {

                    			newCompositeNode(grammarAccess.getPartAccess().getPedalsParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Pedals_4=rulePedals();

                    state._fsp--;


                    			current = this_Pedals_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalNowereBycicleDsl.g:243:3: this_Saddle_5= ruleSaddle
                    {

                    			newCompositeNode(grammarAccess.getPartAccess().getSaddleParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Saddle_5=ruleSaddle();

                    state._fsp--;


                    			current = this_Saddle_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalNowereBycicleDsl.g:252:3: this_HandBrakes_6= ruleHandBrakes
                    {

                    			newCompositeNode(grammarAccess.getPartAccess().getHandBrakesParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_HandBrakes_6=ruleHandBrakes();

                    state._fsp--;


                    			current = this_HandBrakes_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalNowereBycicleDsl.g:261:3: this_HandleBars_7= ruleHandleBars
                    {

                    			newCompositeNode(grammarAccess.getPartAccess().getHandleBarsParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_HandleBars_7=ruleHandleBars();

                    state._fsp--;


                    			current = this_HandleBars_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePart"


    // $ANTLR start "entryRuleCustomerData"
    // InternalNowereBycicleDsl.g:273:1: entryRuleCustomerData returns [EObject current=null] : iv_ruleCustomerData= ruleCustomerData EOF ;
    public final EObject entryRuleCustomerData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomerData = null;


        try {
            // InternalNowereBycicleDsl.g:273:53: (iv_ruleCustomerData= ruleCustomerData EOF )
            // InternalNowereBycicleDsl.g:274:2: iv_ruleCustomerData= ruleCustomerData EOF
            {
             newCompositeNode(grammarAccess.getCustomerDataRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCustomerData=ruleCustomerData();

            state._fsp--;

             current =iv_ruleCustomerData; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCustomerData"


    // $ANTLR start "ruleCustomerData"
    // InternalNowereBycicleDsl.g:280:1: ruleCustomerData returns [EObject current=null] : ( () otherlv_1= 'CustomerData' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'address' ( (lv_address_4_0= ruleEString ) ) )? ( (lv_parameters_5_0= ruleParameter ) )* ) ;
    public final EObject ruleCustomerData() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_address_4_0 = null;

        EObject lv_parameters_5_0 = null;



        	enterRule();

        try {
            // InternalNowereBycicleDsl.g:286:2: ( ( () otherlv_1= 'CustomerData' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'address' ( (lv_address_4_0= ruleEString ) ) )? ( (lv_parameters_5_0= ruleParameter ) )* ) )
            // InternalNowereBycicleDsl.g:287:2: ( () otherlv_1= 'CustomerData' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'address' ( (lv_address_4_0= ruleEString ) ) )? ( (lv_parameters_5_0= ruleParameter ) )* )
            {
            // InternalNowereBycicleDsl.g:287:2: ( () otherlv_1= 'CustomerData' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'address' ( (lv_address_4_0= ruleEString ) ) )? ( (lv_parameters_5_0= ruleParameter ) )* )
            // InternalNowereBycicleDsl.g:288:3: () otherlv_1= 'CustomerData' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'address' ( (lv_address_4_0= ruleEString ) ) )? ( (lv_parameters_5_0= ruleParameter ) )*
            {
            // InternalNowereBycicleDsl.g:288:3: ()
            // InternalNowereBycicleDsl.g:289:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCustomerDataAccess().getCustomerDataAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getCustomerDataAccess().getCustomerDataKeyword_1());
            		
            // InternalNowereBycicleDsl.g:299:3: ( (lv_name_2_0= ruleEString ) )
            // InternalNowereBycicleDsl.g:300:4: (lv_name_2_0= ruleEString )
            {
            // InternalNowereBycicleDsl.g:300:4: (lv_name_2_0= ruleEString )
            // InternalNowereBycicleDsl.g:301:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCustomerDataAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCustomerDataRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"dk.itu.mdd.nbs.dsl.NowereBycicleDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalNowereBycicleDsl.g:318:3: (otherlv_3= 'address' ( (lv_address_4_0= ruleEString ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==14) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalNowereBycicleDsl.g:319:4: otherlv_3= 'address' ( (lv_address_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getCustomerDataAccess().getAddressKeyword_3_0());
                    			
                    // InternalNowereBycicleDsl.g:323:4: ( (lv_address_4_0= ruleEString ) )
                    // InternalNowereBycicleDsl.g:324:5: (lv_address_4_0= ruleEString )
                    {
                    // InternalNowereBycicleDsl.g:324:5: (lv_address_4_0= ruleEString )
                    // InternalNowereBycicleDsl.g:325:6: lv_address_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCustomerDataAccess().getAddressEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_address_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCustomerDataRule());
                    						}
                    						set(
                    							current,
                    							"address",
                    							lv_address_4_0,
                    							"dk.itu.mdd.nbs.dsl.NowereBycicleDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalNowereBycicleDsl.g:343:3: ( (lv_parameters_5_0= ruleParameter ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==15) ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1==RULE_STRING) ) {
                        alt8=1;
                    }
                    else if ( (LA8_1==RULE_ID) ) {
                        alt8=1;
                    }


                }


                switch (alt8) {
            	case 1 :
            	    // InternalNowereBycicleDsl.g:344:4: (lv_parameters_5_0= ruleParameter )
            	    {
            	    // InternalNowereBycicleDsl.g:344:4: (lv_parameters_5_0= ruleParameter )
            	    // InternalNowereBycicleDsl.g:345:5: lv_parameters_5_0= ruleParameter
            	    {

            	    					newCompositeNode(grammarAccess.getCustomerDataAccess().getParametersParameterParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_parameters_5_0=ruleParameter();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCustomerDataRule());
            	    					}
            	    					add(
            	    						current,
            	    						"parameters",
            	    						lv_parameters_5_0,
            	    						"dk.itu.mdd.nbs.dsl.NowereBycicleDsl.Parameter");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCustomerData"


    // $ANTLR start "entryRuleParameter"
    // InternalNowereBycicleDsl.g:366:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalNowereBycicleDsl.g:366:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalNowereBycicleDsl.g:367:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalNowereBycicleDsl.g:373:1: ruleParameter returns [EObject current=null] : ( () otherlv_1= 'Parameter' ( (lv_name_2_0= ruleEString ) ) ( (lv_value_3_0= ruleEString ) )? ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalNowereBycicleDsl.g:379:2: ( ( () otherlv_1= 'Parameter' ( (lv_name_2_0= ruleEString ) ) ( (lv_value_3_0= ruleEString ) )? ) )
            // InternalNowereBycicleDsl.g:380:2: ( () otherlv_1= 'Parameter' ( (lv_name_2_0= ruleEString ) ) ( (lv_value_3_0= ruleEString ) )? )
            {
            // InternalNowereBycicleDsl.g:380:2: ( () otherlv_1= 'Parameter' ( (lv_name_2_0= ruleEString ) ) ( (lv_value_3_0= ruleEString ) )? )
            // InternalNowereBycicleDsl.g:381:3: () otherlv_1= 'Parameter' ( (lv_name_2_0= ruleEString ) ) ( (lv_value_3_0= ruleEString ) )?
            {
            // InternalNowereBycicleDsl.g:381:3: ()
            // InternalNowereBycicleDsl.g:382:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterAccess().getParameterAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getParameterKeyword_1());
            		
            // InternalNowereBycicleDsl.g:392:3: ( (lv_name_2_0= ruleEString ) )
            // InternalNowereBycicleDsl.g:393:4: (lv_name_2_0= ruleEString )
            {
            // InternalNowereBycicleDsl.g:393:4: (lv_name_2_0= ruleEString )
            // InternalNowereBycicleDsl.g:394:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"dk.itu.mdd.nbs.dsl.NowereBycicleDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalNowereBycicleDsl.g:411:3: ( (lv_value_3_0= ruleEString ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID||LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalNowereBycicleDsl.g:412:4: (lv_value_3_0= ruleEString )
                    {
                    // InternalNowereBycicleDsl.g:412:4: (lv_value_3_0= ruleEString )
                    // InternalNowereBycicleDsl.g:413:5: lv_value_3_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getParameterAccess().getValueEStringParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_3_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getParameterRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_3_0,
                    						"dk.itu.mdd.nbs.dsl.NowereBycicleDsl.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleEDouble"
    // InternalNowereBycicleDsl.g:434:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalNowereBycicleDsl.g:434:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalNowereBycicleDsl.g:435:2: iv_ruleEDouble= ruleEDouble EOF
            {
             newCompositeNode(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDouble=ruleEDouble();

            state._fsp--;

             current =iv_ruleEDouble.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalNowereBycicleDsl.g:441:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalNowereBycicleDsl.g:447:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalNowereBycicleDsl.g:448:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalNowereBycicleDsl.g:448:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalNowereBycicleDsl.g:449:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalNowereBycicleDsl.g:449:3: (kw= '-' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==16) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalNowereBycicleDsl.g:450:4: kw= '-'
                    {
                    kw=(Token)match(input,16,FOLLOW_9); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalNowereBycicleDsl.g:456:3: (this_INT_1= RULE_INT )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_INT) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalNowereBycicleDsl.g:457:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_10); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,17,FOLLOW_11); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_12); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3());
            		
            // InternalNowereBycicleDsl.g:477:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=18 && LA14_0<=19)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalNowereBycicleDsl.g:478:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalNowereBycicleDsl.g:478:4: (kw= 'E' | kw= 'e' )
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==18) ) {
                        alt12=1;
                    }
                    else if ( (LA12_0==19) ) {
                        alt12=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 0, input);

                        throw nvae;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalNowereBycicleDsl.g:479:5: kw= 'E'
                            {
                            kw=(Token)match(input,18,FOLLOW_13); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalNowereBycicleDsl.g:485:5: kw= 'e'
                            {
                            kw=(Token)match(input,19,FOLLOW_13); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalNowereBycicleDsl.g:491:4: (kw= '-' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==16) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalNowereBycicleDsl.g:492:5: kw= '-'
                            {
                            kw=(Token)match(input,16,FOLLOW_11); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1());
                            				

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_7);
                    			

                    				newLeafNode(this_INT_7, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRuleEString"
    // InternalNowereBycicleDsl.g:510:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalNowereBycicleDsl.g:510:47: (iv_ruleEString= ruleEString EOF )
            // InternalNowereBycicleDsl.g:511:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalNowereBycicleDsl.g:517:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalNowereBycicleDsl.g:523:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalNowereBycicleDsl.g:524:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalNowereBycicleDsl.g:524:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_ID) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalNowereBycicleDsl.g:525:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalNowereBycicleDsl.g:533:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleFrame"
    // InternalNowereBycicleDsl.g:544:1: entryRuleFrame returns [EObject current=null] : iv_ruleFrame= ruleFrame EOF ;
    public final EObject entryRuleFrame() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFrame = null;


        try {
            // InternalNowereBycicleDsl.g:544:46: (iv_ruleFrame= ruleFrame EOF )
            // InternalNowereBycicleDsl.g:545:2: iv_ruleFrame= ruleFrame EOF
            {
             newCompositeNode(grammarAccess.getFrameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFrame=ruleFrame();

            state._fsp--;

             current =iv_ruleFrame; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFrame"


    // $ANTLR start "ruleFrame"
    // InternalNowereBycicleDsl.g:551:1: ruleFrame returns [EObject current=null] : ( () otherlv_1= 'Frame' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'price' ( (lv_price_4_0= ruleEDouble ) ) )? (otherlv_5= 'manufacturer' ( (lv_manufacturer_6_0= ruleManufacturers ) ) )? (otherlv_7= 'frameType' ( (lv_frameType_8_0= ruleFrameType ) ) )? (otherlv_9= 'color' ( (lv_color_10_0= ruleColor ) ) )? ) ;
    public final EObject ruleFrame() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_price_4_0 = null;

        Enumerator lv_manufacturer_6_0 = null;

        Enumerator lv_frameType_8_0 = null;

        Enumerator lv_color_10_0 = null;



        	enterRule();

        try {
            // InternalNowereBycicleDsl.g:557:2: ( ( () otherlv_1= 'Frame' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'price' ( (lv_price_4_0= ruleEDouble ) ) )? (otherlv_5= 'manufacturer' ( (lv_manufacturer_6_0= ruleManufacturers ) ) )? (otherlv_7= 'frameType' ( (lv_frameType_8_0= ruleFrameType ) ) )? (otherlv_9= 'color' ( (lv_color_10_0= ruleColor ) ) )? ) )
            // InternalNowereBycicleDsl.g:558:2: ( () otherlv_1= 'Frame' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'price' ( (lv_price_4_0= ruleEDouble ) ) )? (otherlv_5= 'manufacturer' ( (lv_manufacturer_6_0= ruleManufacturers ) ) )? (otherlv_7= 'frameType' ( (lv_frameType_8_0= ruleFrameType ) ) )? (otherlv_9= 'color' ( (lv_color_10_0= ruleColor ) ) )? )
            {
            // InternalNowereBycicleDsl.g:558:2: ( () otherlv_1= 'Frame' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'price' ( (lv_price_4_0= ruleEDouble ) ) )? (otherlv_5= 'manufacturer' ( (lv_manufacturer_6_0= ruleManufacturers ) ) )? (otherlv_7= 'frameType' ( (lv_frameType_8_0= ruleFrameType ) ) )? (otherlv_9= 'color' ( (lv_color_10_0= ruleColor ) ) )? )
            // InternalNowereBycicleDsl.g:559:3: () otherlv_1= 'Frame' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'price' ( (lv_price_4_0= ruleEDouble ) ) )? (otherlv_5= 'manufacturer' ( (lv_manufacturer_6_0= ruleManufacturers ) ) )? (otherlv_7= 'frameType' ( (lv_frameType_8_0= ruleFrameType ) ) )? (otherlv_9= 'color' ( (lv_color_10_0= ruleColor ) ) )?
            {
            // InternalNowereBycicleDsl.g:559:3: ()
            // InternalNowereBycicleDsl.g:560:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFrameAccess().getFrameAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getFrameAccess().getFrameKeyword_1());
            		
            // InternalNowereBycicleDsl.g:570:3: ( (lv_name_2_0= ruleEString ) )
            // InternalNowereBycicleDsl.g:571:4: (lv_name_2_0= ruleEString )
            {
            // InternalNowereBycicleDsl.g:571:4: (lv_name_2_0= ruleEString )
            // InternalNowereBycicleDsl.g:572:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFrameAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_14);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFrameRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"dk.itu.mdd.nbs.dsl.NowereBycicleDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalNowereBycicleDsl.g:589:3: (otherlv_3= 'price' ( (lv_price_4_0= ruleEDouble ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==21) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalNowereBycicleDsl.g:590:4: otherlv_3= 'price' ( (lv_price_4_0= ruleEDouble ) )
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_15); 

                    				newLeafNode(otherlv_3, grammarAccess.getFrameAccess().getPriceKeyword_3_0());
                    			
                    // InternalNowereBycicleDsl.g:594:4: ( (lv_price_4_0= ruleEDouble ) )
                    // InternalNowereBycicleDsl.g:595:5: (lv_price_4_0= ruleEDouble )
                    {
                    // InternalNowereBycicleDsl.g:595:5: (lv_price_4_0= ruleEDouble )
                    // InternalNowereBycicleDsl.g:596:6: lv_price_4_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getFrameAccess().getPriceEDoubleParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_price_4_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFrameRule());
                    						}
                    						set(
                    							current,
                    							"price",
                    							lv_price_4_0,
                    							"dk.itu.mdd.nbs.dsl.NowereBycicleDsl.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalNowereBycicleDsl.g:614:3: (otherlv_5= 'manufacturer' ( (lv_manufacturer_6_0= ruleManufacturers ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==22) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalNowereBycicleDsl.g:615:4: otherlv_5= 'manufacturer' ( (lv_manufacturer_6_0= ruleManufacturers ) )
                    {
                    otherlv_5=(Token)match(input,22,FOLLOW_17); 

                    				newLeafNode(otherlv_5, grammarAccess.getFrameAccess().getManufacturerKeyword_4_0());
                    			
                    // InternalNowereBycicleDsl.g:619:4: ( (lv_manufacturer_6_0= ruleManufacturers ) )
                    // InternalNowereBycicleDsl.g:620:5: (lv_manufacturer_6_0= ruleManufacturers )
                    {
                    // InternalNowereBycicleDsl.g:620:5: (lv_manufacturer_6_0= ruleManufacturers )
                    // InternalNowereBycicleDsl.g:621:6: lv_manufacturer_6_0= ruleManufacturers
                    {

                    						newCompositeNode(grammarAccess.getFrameAccess().getManufacturerManufacturersEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_manufacturer_6_0=ruleManufacturers();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFrameRule());
                    						}
                    						set(
                    							current,
                    							"manufacturer",
                    							lv_manufacturer_6_0,
                    							"dk.itu.mdd.nbs.dsl.NowereBycicleDsl.Manufacturers");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalNowereBycicleDsl.g:639:3: (otherlv_7= 'frameType' ( (lv_frameType_8_0= ruleFrameType ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==23) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalNowereBycicleDsl.g:640:4: otherlv_7= 'frameType' ( (lv_frameType_8_0= ruleFrameType ) )
                    {
                    otherlv_7=(Token)match(input,23,FOLLOW_19); 

                    				newLeafNode(otherlv_7, grammarAccess.getFrameAccess().getFrameTypeKeyword_5_0());
                    			
                    // InternalNowereBycicleDsl.g:644:4: ( (lv_frameType_8_0= ruleFrameType ) )
                    // InternalNowereBycicleDsl.g:645:5: (lv_frameType_8_0= ruleFrameType )
                    {
                    // InternalNowereBycicleDsl.g:645:5: (lv_frameType_8_0= ruleFrameType )
                    // InternalNowereBycicleDsl.g:646:6: lv_frameType_8_0= ruleFrameType
                    {

                    						newCompositeNode(grammarAccess.getFrameAccess().getFrameTypeFrameTypeEnumRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_frameType_8_0=ruleFrameType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFrameRule());
                    						}
                    						set(
                    							current,
                    							"frameType",
                    							lv_frameType_8_0,
                    							"dk.itu.mdd.nbs.dsl.NowereBycicleDsl.FrameType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalNowereBycicleDsl.g:664:3: (otherlv_9= 'color' ( (lv_color_10_0= ruleColor ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==24) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalNowereBycicleDsl.g:665:4: otherlv_9= 'color' ( (lv_color_10_0= ruleColor ) )
                    {
                    otherlv_9=(Token)match(input,24,FOLLOW_21); 

                    				newLeafNode(otherlv_9, grammarAccess.getFrameAccess().getColorKeyword_6_0());
                    			
                    // InternalNowereBycicleDsl.g:669:4: ( (lv_color_10_0= ruleColor ) )
                    // InternalNowereBycicleDsl.g:670:5: (lv_color_10_0= ruleColor )
                    {
                    // InternalNowereBycicleDsl.g:670:5: (lv_color_10_0= ruleColor )
                    // InternalNowereBycicleDsl.g:671:6: lv_color_10_0= ruleColor
                    {

                    						newCompositeNode(grammarAccess.getFrameAccess().getColorColorEnumRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_color_10_0=ruleColor();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFrameRule());
                    						}
                    						set(
                    							current,
                    							"color",
                    							lv_color_10_0,
                    							"dk.itu.mdd.nbs.dsl.NowereBycicleDsl.Color");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFrame"


    // $ANTLR start "entryRuleWheel"
    // InternalNowereBycicleDsl.g:693:1: entryRuleWheel returns [EObject current=null] : iv_ruleWheel= ruleWheel EOF ;
    public final EObject entryRuleWheel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWheel = null;


        try {
            // InternalNowereBycicleDsl.g:693:46: (iv_ruleWheel= ruleWheel EOF )
            // InternalNowereBycicleDsl.g:694:2: iv_ruleWheel= ruleWheel EOF
            {
             newCompositeNode(grammarAccess.getWheelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWheel=ruleWheel();

            state._fsp--;

             current =iv_ruleWheel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWheel"


    // $ANTLR start "ruleWheel"
    // InternalNowereBycicleDsl.g:700:1: ruleWheel returns [EObject current=null] : ( () otherlv_1= 'Wheel' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'price' ( (lv_price_4_0= ruleEDouble ) ) )? (otherlv_5= 'manufacturer' ( (lv_manufacturer_6_0= ruleManufacturers ) ) )? ) ;
    public final EObject ruleWheel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_price_4_0 = null;

        Enumerator lv_manufacturer_6_0 = null;



        	enterRule();

        try {
            // InternalNowereBycicleDsl.g:706:2: ( ( () otherlv_1= 'Wheel' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'price' ( (lv_price_4_0= ruleEDouble ) ) )? (otherlv_5= 'manufacturer' ( (lv_manufacturer_6_0= ruleManufacturers ) ) )? ) )
            // InternalNowereBycicleDsl.g:707:2: ( () otherlv_1= 'Wheel' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'price' ( (lv_price_4_0= ruleEDouble ) ) )? (otherlv_5= 'manufacturer' ( (lv_manufacturer_6_0= ruleManufacturers ) ) )? )
            {
            // InternalNowereBycicleDsl.g:707:2: ( () otherlv_1= 'Wheel' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'price' ( (lv_price_4_0= ruleEDouble ) ) )? (otherlv_5= 'manufacturer' ( (lv_manufacturer_6_0= ruleManufacturers ) ) )? )
            // InternalNowereBycicleDsl.g:708:3: () otherlv_1= 'Wheel' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'price' ( (lv_price_4_0= ruleEDouble ) ) )? (otherlv_5= 'manufacturer' ( (lv_manufacturer_6_0= ruleManufacturers ) ) )?
            {
            // InternalNowereBycicleDsl.g:708:3: ()
            // InternalNowereBycicleDsl.g:709:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getWheelAccess().getWheelAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getWheelAccess().getWheelKeyword_1());
            		
            // InternalNowereBycicleDsl.g:719:3: ( (lv_name_2_0= ruleEString ) )
            // InternalNowereBycicleDsl.g:720:4: (lv_name_2_0= ruleEString )
            {
            // InternalNowereBycicleDsl.g:720:4: (lv_name_2_0= ruleEString )
            // InternalNowereBycicleDsl.g:721:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getWheelAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_22);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWheelRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"dk.itu.mdd.nbs.dsl.NowereBycicleDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalNowereBycicleDsl.g:738:3: (otherlv_3= 'price' ( (lv_price_4_0= ruleEDouble ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==21) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalNowereBycicleDsl.g:739:4: otherlv_3= 'price' ( (lv_price_4_0= ruleEDouble ) )
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_15); 

                    				newLeafNode(otherlv_3, grammarAccess.getWheelAccess().getPriceKeyword_3_0());
                    			
                    // InternalNowereBycicleDsl.g:743:4: ( (lv_price_4_0= ruleEDouble ) )
                    // InternalNowereBycicleDsl.g:744:5: (lv_price_4_0= ruleEDouble )
                    {
                    // InternalNowereBycicleDsl.g:744:5: (lv_price_4_0= ruleEDouble )
                    // InternalNowereBycicleDsl.g:745:6: lv_price_4_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getWheelAccess().getPriceEDoubleParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_price_4_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWheelRule());
                    						}
                    						set(
                    							current,
                    							"price",
                    							lv_price_4_0,
                    							"dk.itu.mdd.nbs.dsl.NowereBycicleDsl.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalNowereBycicleDsl.g:763:3: (otherlv_5= 'manufacturer' ( (lv_manufacturer_6_0= ruleManufacturers ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==22) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalNowereBycicleDsl.g:764:4: otherlv_5= 'manufacturer' ( (lv_manufacturer_6_0= ruleManufacturers ) )
                    {
                    otherlv_5=(Token)match(input,22,FOLLOW_17); 

                    				newLeafNode(otherlv_5, grammarAccess.getWheelAccess().getManufacturerKeyword_4_0());
                    			
                    // InternalNowereBycicleDsl.g:768:4: ( (lv_manufacturer_6_0= ruleManufacturers ) )
                    // InternalNowereBycicleDsl.g:769:5: (lv_manufacturer_6_0= ruleManufacturers )
                    {
                    // InternalNowereBycicleDsl.g:769:5: (lv_manufacturer_6_0= ruleManufacturers )
                    // InternalNowereBycicleDsl.g:770:6: lv_manufacturer_6_0= ruleManufacturers
                    {

                    						newCompositeNode(grammarAccess.getWheelAccess().getManufacturerManufacturersEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_manufacturer_6_0=ruleManufacturers();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWheelRule());
                    						}
                    						set(
                    							current,
                    							"manufacturer",
                    							lv_manufacturer_6_0,
                    							"dk.itu.mdd.nbs.dsl.NowereBycicleDsl.Manufacturers");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWheel"


    // $ANTLR start "entryRuleInnerGear"
    // InternalNowereBycicleDsl.g:792:1: entryRuleInnerGear returns [EObject current=null] : iv_ruleInnerGear= ruleInnerGear EOF ;
    public final EObject entryRuleInnerGear() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInnerGear = null;


        try {
            // InternalNowereBycicleDsl.g:792:50: (iv_ruleInnerGear= ruleInnerGear EOF )
            // InternalNowereBycicleDsl.g:793:2: iv_ruleInnerGear= ruleInnerGear EOF
            {
             newCompositeNode(grammarAccess.getInnerGearRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInnerGear=ruleInnerGear();

            state._fsp--;

             current =iv_ruleInnerGear; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInnerGear"


    // $ANTLR start "ruleInnerGear"
    // InternalNowereBycicleDsl.g:799:1: ruleInnerGear returns [EObject current=null] : ( () otherlv_1= 'InnerGear' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'price' ( (lv_price_4_0= ruleEDouble ) ) )? (otherlv_5= 'manufacturer' ( (lv_manufacturer_6_0= ruleManufacturers ) ) )? ) ;
    public final EObject ruleInnerGear() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_price_4_0 = null;

        Enumerator lv_manufacturer_6_0 = null;



        	enterRule();

        try {
            // InternalNowereBycicleDsl.g:805:2: ( ( () otherlv_1= 'InnerGear' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'price' ( (lv_price_4_0= ruleEDouble ) ) )? (otherlv_5= 'manufacturer' ( (lv_manufacturer_6_0= ruleManufacturers ) ) )? ) )
            // InternalNowereBycicleDsl.g:806:2: ( () otherlv_1= 'InnerGear' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'price' ( (lv_price_4_0= ruleEDouble ) ) )? (otherlv_5= 'manufacturer' ( (lv_manufacturer_6_0= ruleManufacturers ) ) )? )
            {
            // InternalNowereBycicleDsl.g:806:2: ( () otherlv_1= 'InnerGear' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'price' ( (lv_price_4_0= ruleEDouble ) ) )? (otherlv_5= 'manufacturer' ( (lv_manufacturer_6_0= ruleManufacturers ) ) )? )
            // InternalNowereBycicleDsl.g:807:3: () otherlv_1= 'InnerGear' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'price' ( (lv_price_4_0= ruleEDouble ) ) )? (otherlv_5= 'manufacturer' ( (lv_manufacturer_6_0= ruleManufacturers ) ) )?
            {
            // InternalNowereBycicleDsl.g:807:3: ()
            // InternalNowereBycicleDsl.g:808:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInnerGearAccess().getInnerGearAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getInnerGearAccess().getInnerGearKeyword_1());
            		
            // InternalNowereBycicleDsl.g:818:3: ( (lv_name_2_0= ruleEString ) )
            // InternalNowereBycicleDsl.g:819:4: (lv_name_2_0= ruleEString )
            {
            // InternalNowereBycicleDsl.g:819:4: (lv_name_2_0= ruleEString )
            // InternalNowereBycicleDsl.g:820:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getInnerGearAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_22);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInnerGearRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"dk.itu.mdd.nbs.dsl.NowereBycicleDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalNowereBycicleDsl.g:837:3: (otherlv_3= 'price' ( (lv_price_4_0= ruleEDouble ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==21) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalNowereBycicleDsl.g:838:4: otherlv_3= 'price' ( (lv_price_4_0= ruleEDouble ) )
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_15); 

                    				newLeafNode(otherlv_3, grammarAccess.getInnerGearAccess().getPriceKeyword_3_0());
                    			
                    // InternalNowereBycicleDsl.g:842:4: ( (lv_price_4_0= ruleEDouble ) )
                    // InternalNowereBycicleDsl.g:843:5: (lv_price_4_0= ruleEDouble )
                    {
                    // InternalNowereBycicleDsl.g:843:5: (lv_price_4_0= ruleEDouble )
                    // InternalNowereBycicleDsl.g:844:6: lv_price_4_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getInnerGearAccess().getPriceEDoubleParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_price_4_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInnerGearRule());
                    						}
                    						set(
                    							current,
                    							"price",
                    							lv_price_4_0,
                    							"dk.itu.mdd.nbs.dsl.NowereBycicleDsl.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalNowereBycicleDsl.g:862:3: (otherlv_5= 'manufacturer' ( (lv_manufacturer_6_0= ruleManufacturers ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==22) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalNowereBycicleDsl.g:863:4: otherlv_5= 'manufacturer' ( (lv_manufacturer_6_0= ruleManufacturers ) )
                    {
                    otherlv_5=(Token)match(input,22,FOLLOW_17); 

                    				newLeafNode(otherlv_5, grammarAccess.getInnerGearAccess().getManufacturerKeyword_4_0());
                    			
                    // InternalNowereBycicleDsl.g:867:4: ( (lv_manufacturer_6_0= ruleManufacturers ) )
                    // InternalNowereBycicleDsl.g:868:5: (lv_manufacturer_6_0= ruleManufacturers )
                    {
                    // InternalNowereBycicleDsl.g:868:5: (lv_manufacturer_6_0= ruleManufacturers )
                    // InternalNowereBycicleDsl.g:869:6: lv_manufacturer_6_0= ruleManufacturers
                    {

                    						newCompositeNode(grammarAccess.getInnerGearAccess().getManufacturerManufacturersEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_manufacturer_6_0=ruleManufacturers();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInnerGearRule());
                    						}
                    						set(
                    							current,
                    							"manufacturer",
                    							lv_manufacturer_6_0,
                    							"dk.itu.mdd.nbs.dsl.NowereBycicleDsl.Manufacturers");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInnerGear"


    // $ANTLR start "entryRuleOuterGear"
    // InternalNowereBycicleDsl.g:891:1: entryRuleOuterGear returns [EObject current=null] : iv_ruleOuterGear= ruleOuterGear EOF ;
    public final EObject entryRuleOuterGear() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOuterGear = null;


        try {
            // InternalNowereBycicleDsl.g:891:50: (iv_ruleOuterGear= ruleOuterGear EOF )
            // InternalNowereBycicleDsl.g:892:2: iv_ruleOuterGear= ruleOuterGear EOF
            {
             newCompositeNode(grammarAccess.getOuterGearRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOuterGear=ruleOuterGear();

            state._fsp--;

             current =iv_ruleOuterGear; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOuterGear"


    // $ANTLR start "ruleOuterGear"
    // InternalNowereBycicleDsl.g:898:1: ruleOuterGear returns [EObject current=null] : ( () otherlv_1= 'OuterGear' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'price' ( (lv_price_4_0= ruleEDouble ) ) )? (otherlv_5= 'manufacturer' ( (lv_manufacturer_6_0= ruleManufacturers ) ) )? ) ;
    public final EObject ruleOuterGear() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_price_4_0 = null;

        Enumerator lv_manufacturer_6_0 = null;



        	enterRule();

        try {
            // InternalNowereBycicleDsl.g:904:2: ( ( () otherlv_1= 'OuterGear' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'price' ( (lv_price_4_0= ruleEDouble ) ) )? (otherlv_5= 'manufacturer' ( (lv_manufacturer_6_0= ruleManufacturers ) ) )? ) )
            // InternalNowereBycicleDsl.g:905:2: ( () otherlv_1= 'OuterGear' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'price' ( (lv_price_4_0= ruleEDouble ) ) )? (otherlv_5= 'manufacturer' ( (lv_manufacturer_6_0= ruleManufacturers ) ) )? )
            {
            // InternalNowereBycicleDsl.g:905:2: ( () otherlv_1= 'OuterGear' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'price' ( (lv_price_4_0= ruleEDouble ) ) )? (otherlv_5= 'manufacturer' ( (lv_manufacturer_6_0= ruleManufacturers ) ) )? )
            // InternalNowereBycicleDsl.g:906:3: () otherlv_1= 'OuterGear' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'price' ( (lv_price_4_0= ruleEDouble ) ) )? (otherlv_5= 'manufacturer' ( (lv_manufacturer_6_0= ruleManufacturers ) ) )?
            {
            // InternalNowereBycicleDsl.g:906:3: ()
            // InternalNowereBycicleDsl.g:907:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOuterGearAccess().getOuterGearAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getOuterGearAccess().getOuterGearKeyword_1());
            		
            // InternalNowereBycicleDsl.g:917:3: ( (lv_name_2_0= ruleEString ) )
            // InternalNowereBycicleDsl.g:918:4: (lv_name_2_0= ruleEString )
            {
            // InternalNowereBycicleDsl.g:918:4: (lv_name_2_0= ruleEString )
            // InternalNowereBycicleDsl.g:919:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getOuterGearAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_22);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOuterGearRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"dk.itu.mdd.nbs.dsl.NowereBycicleDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalNowereBycicleDsl.g:936:3: (otherlv_3= 'price' ( (lv_price_4_0= ruleEDouble ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==21) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalNowereBycicleDsl.g:937:4: otherlv_3= 'price' ( (lv_price_4_0= ruleEDouble ) )
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_15); 

                    				newLeafNode(otherlv_3, grammarAccess.getOuterGearAccess().getPriceKeyword_3_0());
                    			
                    // InternalNowereBycicleDsl.g:941:4: ( (lv_price_4_0= ruleEDouble ) )
                    // InternalNowereBycicleDsl.g:942:5: (lv_price_4_0= ruleEDouble )
                    {
                    // InternalNowereBycicleDsl.g:942:5: (lv_price_4_0= ruleEDouble )
                    // InternalNowereBycicleDsl.g:943:6: lv_price_4_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getOuterGearAccess().getPriceEDoubleParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_price_4_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOuterGearRule());
                    						}
                    						set(
                    							current,
                    							"price",
                    							lv_price_4_0,
                    							"dk.itu.mdd.nbs.dsl.NowereBycicleDsl.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalNowereBycicleDsl.g:961:3: (otherlv_5= 'manufacturer' ( (lv_manufacturer_6_0= ruleManufacturers ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==22) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalNowereBycicleDsl.g:962:4: otherlv_5= 'manufacturer' ( (lv_manufacturer_6_0= ruleManufacturers ) )
                    {
                    otherlv_5=(Token)match(input,22,FOLLOW_17); 

                    				newLeafNode(otherlv_5, grammarAccess.getOuterGearAccess().getManufacturerKeyword_4_0());
                    			
                    // InternalNowereBycicleDsl.g:966:4: ( (lv_manufacturer_6_0= ruleManufacturers ) )
                    // InternalNowereBycicleDsl.g:967:5: (lv_manufacturer_6_0= ruleManufacturers )
                    {
                    // InternalNowereBycicleDsl.g:967:5: (lv_manufacturer_6_0= ruleManufacturers )
                    // InternalNowereBycicleDsl.g:968:6: lv_manufacturer_6_0= ruleManufacturers
                    {

                    						newCompositeNode(grammarAccess.getOuterGearAccess().getManufacturerManufacturersEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_manufacturer_6_0=ruleManufacturers();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOuterGearRule());
                    						}
                    						set(
                    							current,
                    							"manufacturer",
                    							lv_manufacturer_6_0,
                    							"dk.itu.mdd.nbs.dsl.NowereBycicleDsl.Manufacturers");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOuterGear"


    // $ANTLR start "entryRulePedals"
    // InternalNowereBycicleDsl.g:990:1: entryRulePedals returns [EObject current=null] : iv_rulePedals= rulePedals EOF ;
    public final EObject entryRulePedals() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePedals = null;


        try {
            // InternalNowereBycicleDsl.g:990:47: (iv_rulePedals= rulePedals EOF )
            // InternalNowereBycicleDsl.g:991:2: iv_rulePedals= rulePedals EOF
            {
             newCompositeNode(grammarAccess.getPedalsRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePedals=rulePedals();

            state._fsp--;

             current =iv_rulePedals; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePedals"


    // $ANTLR start "rulePedals"
    // InternalNowereBycicleDsl.g:997:1: rulePedals returns [EObject current=null] : ( () otherlv_1= 'Pedals' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'price' ( (lv_price_4_0= ruleEDouble ) ) )? (otherlv_5= 'manufacturer' ( (lv_manufacturer_6_0= ruleManufacturers ) ) )? (otherlv_7= 'pedalType' ( (lv_pedalType_8_0= rulePedalTypes ) ) )? ) ;
    public final EObject rulePedals() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_price_4_0 = null;

        Enumerator lv_manufacturer_6_0 = null;

        Enumerator lv_pedalType_8_0 = null;



        	enterRule();

        try {
            // InternalNowereBycicleDsl.g:1003:2: ( ( () otherlv_1= 'Pedals' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'price' ( (lv_price_4_0= ruleEDouble ) ) )? (otherlv_5= 'manufacturer' ( (lv_manufacturer_6_0= ruleManufacturers ) ) )? (otherlv_7= 'pedalType' ( (lv_pedalType_8_0= rulePedalTypes ) ) )? ) )
            // InternalNowereBycicleDsl.g:1004:2: ( () otherlv_1= 'Pedals' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'price' ( (lv_price_4_0= ruleEDouble ) ) )? (otherlv_5= 'manufacturer' ( (lv_manufacturer_6_0= ruleManufacturers ) ) )? (otherlv_7= 'pedalType' ( (lv_pedalType_8_0= rulePedalTypes ) ) )? )
            {
            // InternalNowereBycicleDsl.g:1004:2: ( () otherlv_1= 'Pedals' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'price' ( (lv_price_4_0= ruleEDouble ) ) )? (otherlv_5= 'manufacturer' ( (lv_manufacturer_6_0= ruleManufacturers ) ) )? (otherlv_7= 'pedalType' ( (lv_pedalType_8_0= rulePedalTypes ) ) )? )
            // InternalNowereBycicleDsl.g:1005:3: () otherlv_1= 'Pedals' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'price' ( (lv_price_4_0= ruleEDouble ) ) )? (otherlv_5= 'manufacturer' ( (lv_manufacturer_6_0= ruleManufacturers ) ) )? (otherlv_7= 'pedalType' ( (lv_pedalType_8_0= rulePedalTypes ) ) )?
            {
            // InternalNowereBycicleDsl.g:1005:3: ()
            // InternalNowereBycicleDsl.g:1006:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPedalsAccess().getPedalsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getPedalsAccess().getPedalsKeyword_1());
            		
            // InternalNowereBycicleDsl.g:1016:3: ( (lv_name_2_0= ruleEString ) )
            // InternalNowereBycicleDsl.g:1017:4: (lv_name_2_0= ruleEString )
            {
            // InternalNowereBycicleDsl.g:1017:4: (lv_name_2_0= ruleEString )
            // InternalNowereBycicleDsl.g:1018:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPedalsAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_24);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPedalsRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"dk.itu.mdd.nbs.dsl.NowereBycicleDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalNowereBycicleDsl.g:1035:3: (otherlv_3= 'price' ( (lv_price_4_0= ruleEDouble ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==21) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalNowereBycicleDsl.g:1036:4: otherlv_3= 'price' ( (lv_price_4_0= ruleEDouble ) )
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_15); 

                    				newLeafNode(otherlv_3, grammarAccess.getPedalsAccess().getPriceKeyword_3_0());
                    			
                    // InternalNowereBycicleDsl.g:1040:4: ( (lv_price_4_0= ruleEDouble ) )
                    // InternalNowereBycicleDsl.g:1041:5: (lv_price_4_0= ruleEDouble )
                    {
                    // InternalNowereBycicleDsl.g:1041:5: (lv_price_4_0= ruleEDouble )
                    // InternalNowereBycicleDsl.g:1042:6: lv_price_4_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getPedalsAccess().getPriceEDoubleParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_price_4_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPedalsRule());
                    						}
                    						set(
                    							current,
                    							"price",
                    							lv_price_4_0,
                    							"dk.itu.mdd.nbs.dsl.NowereBycicleDsl.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalNowereBycicleDsl.g:1060:3: (otherlv_5= 'manufacturer' ( (lv_manufacturer_6_0= ruleManufacturers ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==22) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalNowereBycicleDsl.g:1061:4: otherlv_5= 'manufacturer' ( (lv_manufacturer_6_0= ruleManufacturers ) )
                    {
                    otherlv_5=(Token)match(input,22,FOLLOW_17); 

                    				newLeafNode(otherlv_5, grammarAccess.getPedalsAccess().getManufacturerKeyword_4_0());
                    			
                    // InternalNowereBycicleDsl.g:1065:4: ( (lv_manufacturer_6_0= ruleManufacturers ) )
                    // InternalNowereBycicleDsl.g:1066:5: (lv_manufacturer_6_0= ruleManufacturers )
                    {
                    // InternalNowereBycicleDsl.g:1066:5: (lv_manufacturer_6_0= ruleManufacturers )
                    // InternalNowereBycicleDsl.g:1067:6: lv_manufacturer_6_0= ruleManufacturers
                    {

                    						newCompositeNode(grammarAccess.getPedalsAccess().getManufacturerManufacturersEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_manufacturer_6_0=ruleManufacturers();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPedalsRule());
                    						}
                    						set(
                    							current,
                    							"manufacturer",
                    							lv_manufacturer_6_0,
                    							"dk.itu.mdd.nbs.dsl.NowereBycicleDsl.Manufacturers");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalNowereBycicleDsl.g:1085:3: (otherlv_7= 'pedalType' ( (lv_pedalType_8_0= rulePedalTypes ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==29) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalNowereBycicleDsl.g:1086:4: otherlv_7= 'pedalType' ( (lv_pedalType_8_0= rulePedalTypes ) )
                    {
                    otherlv_7=(Token)match(input,29,FOLLOW_27); 

                    				newLeafNode(otherlv_7, grammarAccess.getPedalsAccess().getPedalTypeKeyword_5_0());
                    			
                    // InternalNowereBycicleDsl.g:1090:4: ( (lv_pedalType_8_0= rulePedalTypes ) )
                    // InternalNowereBycicleDsl.g:1091:5: (lv_pedalType_8_0= rulePedalTypes )
                    {
                    // InternalNowereBycicleDsl.g:1091:5: (lv_pedalType_8_0= rulePedalTypes )
                    // InternalNowereBycicleDsl.g:1092:6: lv_pedalType_8_0= rulePedalTypes
                    {

                    						newCompositeNode(grammarAccess.getPedalsAccess().getPedalTypePedalTypesEnumRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_pedalType_8_0=rulePedalTypes();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPedalsRule());
                    						}
                    						set(
                    							current,
                    							"pedalType",
                    							lv_pedalType_8_0,
                    							"dk.itu.mdd.nbs.dsl.NowereBycicleDsl.PedalTypes");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePedals"


    // $ANTLR start "entryRuleSaddle"
    // InternalNowereBycicleDsl.g:1114:1: entryRuleSaddle returns [EObject current=null] : iv_ruleSaddle= ruleSaddle EOF ;
    public final EObject entryRuleSaddle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSaddle = null;


        try {
            // InternalNowereBycicleDsl.g:1114:47: (iv_ruleSaddle= ruleSaddle EOF )
            // InternalNowereBycicleDsl.g:1115:2: iv_ruleSaddle= ruleSaddle EOF
            {
             newCompositeNode(grammarAccess.getSaddleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSaddle=ruleSaddle();

            state._fsp--;

             current =iv_ruleSaddle; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSaddle"


    // $ANTLR start "ruleSaddle"
    // InternalNowereBycicleDsl.g:1121:1: ruleSaddle returns [EObject current=null] : ( () otherlv_1= 'Saddle' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'price' ( (lv_price_4_0= ruleEDouble ) ) )? (otherlv_5= 'manufacturer' ( (lv_manufacturer_6_0= ruleManufacturers ) ) )? (otherlv_7= 'saddleType' ( (lv_saddleType_8_0= ruleSaddleType ) ) )? ) ;
    public final EObject ruleSaddle() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_price_4_0 = null;

        Enumerator lv_manufacturer_6_0 = null;

        Enumerator lv_saddleType_8_0 = null;



        	enterRule();

        try {
            // InternalNowereBycicleDsl.g:1127:2: ( ( () otherlv_1= 'Saddle' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'price' ( (lv_price_4_0= ruleEDouble ) ) )? (otherlv_5= 'manufacturer' ( (lv_manufacturer_6_0= ruleManufacturers ) ) )? (otherlv_7= 'saddleType' ( (lv_saddleType_8_0= ruleSaddleType ) ) )? ) )
            // InternalNowereBycicleDsl.g:1128:2: ( () otherlv_1= 'Saddle' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'price' ( (lv_price_4_0= ruleEDouble ) ) )? (otherlv_5= 'manufacturer' ( (lv_manufacturer_6_0= ruleManufacturers ) ) )? (otherlv_7= 'saddleType' ( (lv_saddleType_8_0= ruleSaddleType ) ) )? )
            {
            // InternalNowereBycicleDsl.g:1128:2: ( () otherlv_1= 'Saddle' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'price' ( (lv_price_4_0= ruleEDouble ) ) )? (otherlv_5= 'manufacturer' ( (lv_manufacturer_6_0= ruleManufacturers ) ) )? (otherlv_7= 'saddleType' ( (lv_saddleType_8_0= ruleSaddleType ) ) )? )
            // InternalNowereBycicleDsl.g:1129:3: () otherlv_1= 'Saddle' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'price' ( (lv_price_4_0= ruleEDouble ) ) )? (otherlv_5= 'manufacturer' ( (lv_manufacturer_6_0= ruleManufacturers ) ) )? (otherlv_7= 'saddleType' ( (lv_saddleType_8_0= ruleSaddleType ) ) )?
            {
            // InternalNowereBycicleDsl.g:1129:3: ()
            // InternalNowereBycicleDsl.g:1130:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSaddleAccess().getSaddleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getSaddleAccess().getSaddleKeyword_1());
            		
            // InternalNowereBycicleDsl.g:1140:3: ( (lv_name_2_0= ruleEString ) )
            // InternalNowereBycicleDsl.g:1141:4: (lv_name_2_0= ruleEString )
            {
            // InternalNowereBycicleDsl.g:1141:4: (lv_name_2_0= ruleEString )
            // InternalNowereBycicleDsl.g:1142:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSaddleAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_28);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSaddleRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"dk.itu.mdd.nbs.dsl.NowereBycicleDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalNowereBycicleDsl.g:1159:3: (otherlv_3= 'price' ( (lv_price_4_0= ruleEDouble ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==21) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalNowereBycicleDsl.g:1160:4: otherlv_3= 'price' ( (lv_price_4_0= ruleEDouble ) )
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_15); 

                    				newLeafNode(otherlv_3, grammarAccess.getSaddleAccess().getPriceKeyword_3_0());
                    			
                    // InternalNowereBycicleDsl.g:1164:4: ( (lv_price_4_0= ruleEDouble ) )
                    // InternalNowereBycicleDsl.g:1165:5: (lv_price_4_0= ruleEDouble )
                    {
                    // InternalNowereBycicleDsl.g:1165:5: (lv_price_4_0= ruleEDouble )
                    // InternalNowereBycicleDsl.g:1166:6: lv_price_4_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getSaddleAccess().getPriceEDoubleParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_price_4_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSaddleRule());
                    						}
                    						set(
                    							current,
                    							"price",
                    							lv_price_4_0,
                    							"dk.itu.mdd.nbs.dsl.NowereBycicleDsl.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalNowereBycicleDsl.g:1184:3: (otherlv_5= 'manufacturer' ( (lv_manufacturer_6_0= ruleManufacturers ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==22) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalNowereBycicleDsl.g:1185:4: otherlv_5= 'manufacturer' ( (lv_manufacturer_6_0= ruleManufacturers ) )
                    {
                    otherlv_5=(Token)match(input,22,FOLLOW_17); 

                    				newLeafNode(otherlv_5, grammarAccess.getSaddleAccess().getManufacturerKeyword_4_0());
                    			
                    // InternalNowereBycicleDsl.g:1189:4: ( (lv_manufacturer_6_0= ruleManufacturers ) )
                    // InternalNowereBycicleDsl.g:1190:5: (lv_manufacturer_6_0= ruleManufacturers )
                    {
                    // InternalNowereBycicleDsl.g:1190:5: (lv_manufacturer_6_0= ruleManufacturers )
                    // InternalNowereBycicleDsl.g:1191:6: lv_manufacturer_6_0= ruleManufacturers
                    {

                    						newCompositeNode(grammarAccess.getSaddleAccess().getManufacturerManufacturersEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_manufacturer_6_0=ruleManufacturers();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSaddleRule());
                    						}
                    						set(
                    							current,
                    							"manufacturer",
                    							lv_manufacturer_6_0,
                    							"dk.itu.mdd.nbs.dsl.NowereBycicleDsl.Manufacturers");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalNowereBycicleDsl.g:1209:3: (otherlv_7= 'saddleType' ( (lv_saddleType_8_0= ruleSaddleType ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==31) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalNowereBycicleDsl.g:1210:4: otherlv_7= 'saddleType' ( (lv_saddleType_8_0= ruleSaddleType ) )
                    {
                    otherlv_7=(Token)match(input,31,FOLLOW_31); 

                    				newLeafNode(otherlv_7, grammarAccess.getSaddleAccess().getSaddleTypeKeyword_5_0());
                    			
                    // InternalNowereBycicleDsl.g:1214:4: ( (lv_saddleType_8_0= ruleSaddleType ) )
                    // InternalNowereBycicleDsl.g:1215:5: (lv_saddleType_8_0= ruleSaddleType )
                    {
                    // InternalNowereBycicleDsl.g:1215:5: (lv_saddleType_8_0= ruleSaddleType )
                    // InternalNowereBycicleDsl.g:1216:6: lv_saddleType_8_0= ruleSaddleType
                    {

                    						newCompositeNode(grammarAccess.getSaddleAccess().getSaddleTypeSaddleTypeEnumRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_saddleType_8_0=ruleSaddleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSaddleRule());
                    						}
                    						set(
                    							current,
                    							"saddleType",
                    							lv_saddleType_8_0,
                    							"dk.itu.mdd.nbs.dsl.NowereBycicleDsl.SaddleType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSaddle"


    // $ANTLR start "entryRuleHandBrakes"
    // InternalNowereBycicleDsl.g:1238:1: entryRuleHandBrakes returns [EObject current=null] : iv_ruleHandBrakes= ruleHandBrakes EOF ;
    public final EObject entryRuleHandBrakes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHandBrakes = null;


        try {
            // InternalNowereBycicleDsl.g:1238:51: (iv_ruleHandBrakes= ruleHandBrakes EOF )
            // InternalNowereBycicleDsl.g:1239:2: iv_ruleHandBrakes= ruleHandBrakes EOF
            {
             newCompositeNode(grammarAccess.getHandBrakesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHandBrakes=ruleHandBrakes();

            state._fsp--;

             current =iv_ruleHandBrakes; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHandBrakes"


    // $ANTLR start "ruleHandBrakes"
    // InternalNowereBycicleDsl.g:1245:1: ruleHandBrakes returns [EObject current=null] : ( () otherlv_1= 'HandBrakes' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'price' ( (lv_price_4_0= ruleEDouble ) ) )? (otherlv_5= 'manufacturer' ( (lv_manufacturer_6_0= ruleManufacturers ) ) )? ) ;
    public final EObject ruleHandBrakes() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_price_4_0 = null;

        Enumerator lv_manufacturer_6_0 = null;



        	enterRule();

        try {
            // InternalNowereBycicleDsl.g:1251:2: ( ( () otherlv_1= 'HandBrakes' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'price' ( (lv_price_4_0= ruleEDouble ) ) )? (otherlv_5= 'manufacturer' ( (lv_manufacturer_6_0= ruleManufacturers ) ) )? ) )
            // InternalNowereBycicleDsl.g:1252:2: ( () otherlv_1= 'HandBrakes' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'price' ( (lv_price_4_0= ruleEDouble ) ) )? (otherlv_5= 'manufacturer' ( (lv_manufacturer_6_0= ruleManufacturers ) ) )? )
            {
            // InternalNowereBycicleDsl.g:1252:2: ( () otherlv_1= 'HandBrakes' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'price' ( (lv_price_4_0= ruleEDouble ) ) )? (otherlv_5= 'manufacturer' ( (lv_manufacturer_6_0= ruleManufacturers ) ) )? )
            // InternalNowereBycicleDsl.g:1253:3: () otherlv_1= 'HandBrakes' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'price' ( (lv_price_4_0= ruleEDouble ) ) )? (otherlv_5= 'manufacturer' ( (lv_manufacturer_6_0= ruleManufacturers ) ) )?
            {
            // InternalNowereBycicleDsl.g:1253:3: ()
            // InternalNowereBycicleDsl.g:1254:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getHandBrakesAccess().getHandBrakesAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getHandBrakesAccess().getHandBrakesKeyword_1());
            		
            // InternalNowereBycicleDsl.g:1264:3: ( (lv_name_2_0= ruleEString ) )
            // InternalNowereBycicleDsl.g:1265:4: (lv_name_2_0= ruleEString )
            {
            // InternalNowereBycicleDsl.g:1265:4: (lv_name_2_0= ruleEString )
            // InternalNowereBycicleDsl.g:1266:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getHandBrakesAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_22);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHandBrakesRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"dk.itu.mdd.nbs.dsl.NowereBycicleDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalNowereBycicleDsl.g:1283:3: (otherlv_3= 'price' ( (lv_price_4_0= ruleEDouble ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==21) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalNowereBycicleDsl.g:1284:4: otherlv_3= 'price' ( (lv_price_4_0= ruleEDouble ) )
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_15); 

                    				newLeafNode(otherlv_3, grammarAccess.getHandBrakesAccess().getPriceKeyword_3_0());
                    			
                    // InternalNowereBycicleDsl.g:1288:4: ( (lv_price_4_0= ruleEDouble ) )
                    // InternalNowereBycicleDsl.g:1289:5: (lv_price_4_0= ruleEDouble )
                    {
                    // InternalNowereBycicleDsl.g:1289:5: (lv_price_4_0= ruleEDouble )
                    // InternalNowereBycicleDsl.g:1290:6: lv_price_4_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getHandBrakesAccess().getPriceEDoubleParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_price_4_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getHandBrakesRule());
                    						}
                    						set(
                    							current,
                    							"price",
                    							lv_price_4_0,
                    							"dk.itu.mdd.nbs.dsl.NowereBycicleDsl.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalNowereBycicleDsl.g:1308:3: (otherlv_5= 'manufacturer' ( (lv_manufacturer_6_0= ruleManufacturers ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==22) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalNowereBycicleDsl.g:1309:4: otherlv_5= 'manufacturer' ( (lv_manufacturer_6_0= ruleManufacturers ) )
                    {
                    otherlv_5=(Token)match(input,22,FOLLOW_17); 

                    				newLeafNode(otherlv_5, grammarAccess.getHandBrakesAccess().getManufacturerKeyword_4_0());
                    			
                    // InternalNowereBycicleDsl.g:1313:4: ( (lv_manufacturer_6_0= ruleManufacturers ) )
                    // InternalNowereBycicleDsl.g:1314:5: (lv_manufacturer_6_0= ruleManufacturers )
                    {
                    // InternalNowereBycicleDsl.g:1314:5: (lv_manufacturer_6_0= ruleManufacturers )
                    // InternalNowereBycicleDsl.g:1315:6: lv_manufacturer_6_0= ruleManufacturers
                    {

                    						newCompositeNode(grammarAccess.getHandBrakesAccess().getManufacturerManufacturersEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_manufacturer_6_0=ruleManufacturers();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getHandBrakesRule());
                    						}
                    						set(
                    							current,
                    							"manufacturer",
                    							lv_manufacturer_6_0,
                    							"dk.itu.mdd.nbs.dsl.NowereBycicleDsl.Manufacturers");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHandBrakes"


    // $ANTLR start "entryRuleHandleBars"
    // InternalNowereBycicleDsl.g:1337:1: entryRuleHandleBars returns [EObject current=null] : iv_ruleHandleBars= ruleHandleBars EOF ;
    public final EObject entryRuleHandleBars() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHandleBars = null;


        try {
            // InternalNowereBycicleDsl.g:1337:51: (iv_ruleHandleBars= ruleHandleBars EOF )
            // InternalNowereBycicleDsl.g:1338:2: iv_ruleHandleBars= ruleHandleBars EOF
            {
             newCompositeNode(grammarAccess.getHandleBarsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHandleBars=ruleHandleBars();

            state._fsp--;

             current =iv_ruleHandleBars; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHandleBars"


    // $ANTLR start "ruleHandleBars"
    // InternalNowereBycicleDsl.g:1344:1: ruleHandleBars returns [EObject current=null] : ( () otherlv_1= 'HandleBars' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'price' ( (lv_price_4_0= ruleEDouble ) ) )? (otherlv_5= 'manufacturer' ( (lv_manufacturer_6_0= ruleManufacturers ) ) )? ) ;
    public final EObject ruleHandleBars() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_price_4_0 = null;

        Enumerator lv_manufacturer_6_0 = null;



        	enterRule();

        try {
            // InternalNowereBycicleDsl.g:1350:2: ( ( () otherlv_1= 'HandleBars' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'price' ( (lv_price_4_0= ruleEDouble ) ) )? (otherlv_5= 'manufacturer' ( (lv_manufacturer_6_0= ruleManufacturers ) ) )? ) )
            // InternalNowereBycicleDsl.g:1351:2: ( () otherlv_1= 'HandleBars' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'price' ( (lv_price_4_0= ruleEDouble ) ) )? (otherlv_5= 'manufacturer' ( (lv_manufacturer_6_0= ruleManufacturers ) ) )? )
            {
            // InternalNowereBycicleDsl.g:1351:2: ( () otherlv_1= 'HandleBars' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'price' ( (lv_price_4_0= ruleEDouble ) ) )? (otherlv_5= 'manufacturer' ( (lv_manufacturer_6_0= ruleManufacturers ) ) )? )
            // InternalNowereBycicleDsl.g:1352:3: () otherlv_1= 'HandleBars' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'price' ( (lv_price_4_0= ruleEDouble ) ) )? (otherlv_5= 'manufacturer' ( (lv_manufacturer_6_0= ruleManufacturers ) ) )?
            {
            // InternalNowereBycicleDsl.g:1352:3: ()
            // InternalNowereBycicleDsl.g:1353:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getHandleBarsAccess().getHandleBarsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,33,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getHandleBarsAccess().getHandleBarsKeyword_1());
            		
            // InternalNowereBycicleDsl.g:1363:3: ( (lv_name_2_0= ruleEString ) )
            // InternalNowereBycicleDsl.g:1364:4: (lv_name_2_0= ruleEString )
            {
            // InternalNowereBycicleDsl.g:1364:4: (lv_name_2_0= ruleEString )
            // InternalNowereBycicleDsl.g:1365:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getHandleBarsAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_22);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHandleBarsRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"dk.itu.mdd.nbs.dsl.NowereBycicleDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalNowereBycicleDsl.g:1382:3: (otherlv_3= 'price' ( (lv_price_4_0= ruleEDouble ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==21) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalNowereBycicleDsl.g:1383:4: otherlv_3= 'price' ( (lv_price_4_0= ruleEDouble ) )
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_15); 

                    				newLeafNode(otherlv_3, grammarAccess.getHandleBarsAccess().getPriceKeyword_3_0());
                    			
                    // InternalNowereBycicleDsl.g:1387:4: ( (lv_price_4_0= ruleEDouble ) )
                    // InternalNowereBycicleDsl.g:1388:5: (lv_price_4_0= ruleEDouble )
                    {
                    // InternalNowereBycicleDsl.g:1388:5: (lv_price_4_0= ruleEDouble )
                    // InternalNowereBycicleDsl.g:1389:6: lv_price_4_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getHandleBarsAccess().getPriceEDoubleParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_price_4_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getHandleBarsRule());
                    						}
                    						set(
                    							current,
                    							"price",
                    							lv_price_4_0,
                    							"dk.itu.mdd.nbs.dsl.NowereBycicleDsl.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalNowereBycicleDsl.g:1407:3: (otherlv_5= 'manufacturer' ( (lv_manufacturer_6_0= ruleManufacturers ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==22) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalNowereBycicleDsl.g:1408:4: otherlv_5= 'manufacturer' ( (lv_manufacturer_6_0= ruleManufacturers ) )
                    {
                    otherlv_5=(Token)match(input,22,FOLLOW_17); 

                    				newLeafNode(otherlv_5, grammarAccess.getHandleBarsAccess().getManufacturerKeyword_4_0());
                    			
                    // InternalNowereBycicleDsl.g:1412:4: ( (lv_manufacturer_6_0= ruleManufacturers ) )
                    // InternalNowereBycicleDsl.g:1413:5: (lv_manufacturer_6_0= ruleManufacturers )
                    {
                    // InternalNowereBycicleDsl.g:1413:5: (lv_manufacturer_6_0= ruleManufacturers )
                    // InternalNowereBycicleDsl.g:1414:6: lv_manufacturer_6_0= ruleManufacturers
                    {

                    						newCompositeNode(grammarAccess.getHandleBarsAccess().getManufacturerManufacturersEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_manufacturer_6_0=ruleManufacturers();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getHandleBarsRule());
                    						}
                    						set(
                    							current,
                    							"manufacturer",
                    							lv_manufacturer_6_0,
                    							"dk.itu.mdd.nbs.dsl.NowereBycicleDsl.Manufacturers");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHandleBars"


    // $ANTLR start "ruleManufacturers"
    // InternalNowereBycicleDsl.g:1436:1: ruleManufacturers returns [Enumerator current=null] : ( (enumLiteral_0= 'SuperParts' ) | (enumLiteral_1= 'HomeParts' ) | (enumLiteral_2= 'HandMadeParts' ) ) ;
    public final Enumerator ruleManufacturers() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalNowereBycicleDsl.g:1442:2: ( ( (enumLiteral_0= 'SuperParts' ) | (enumLiteral_1= 'HomeParts' ) | (enumLiteral_2= 'HandMadeParts' ) ) )
            // InternalNowereBycicleDsl.g:1443:2: ( (enumLiteral_0= 'SuperParts' ) | (enumLiteral_1= 'HomeParts' ) | (enumLiteral_2= 'HandMadeParts' ) )
            {
            // InternalNowereBycicleDsl.g:1443:2: ( (enumLiteral_0= 'SuperParts' ) | (enumLiteral_1= 'HomeParts' ) | (enumLiteral_2= 'HandMadeParts' ) )
            int alt36=3;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt36=1;
                }
                break;
            case 35:
                {
                alt36=2;
                }
                break;
            case 36:
                {
                alt36=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // InternalNowereBycicleDsl.g:1444:3: (enumLiteral_0= 'SuperParts' )
                    {
                    // InternalNowereBycicleDsl.g:1444:3: (enumLiteral_0= 'SuperParts' )
                    // InternalNowereBycicleDsl.g:1445:4: enumLiteral_0= 'SuperParts'
                    {
                    enumLiteral_0=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getManufacturersAccess().getSuperPartsEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getManufacturersAccess().getSuperPartsEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalNowereBycicleDsl.g:1452:3: (enumLiteral_1= 'HomeParts' )
                    {
                    // InternalNowereBycicleDsl.g:1452:3: (enumLiteral_1= 'HomeParts' )
                    // InternalNowereBycicleDsl.g:1453:4: enumLiteral_1= 'HomeParts'
                    {
                    enumLiteral_1=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getManufacturersAccess().getHomePartsEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getManufacturersAccess().getHomePartsEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalNowereBycicleDsl.g:1460:3: (enumLiteral_2= 'HandMadeParts' )
                    {
                    // InternalNowereBycicleDsl.g:1460:3: (enumLiteral_2= 'HandMadeParts' )
                    // InternalNowereBycicleDsl.g:1461:4: enumLiteral_2= 'HandMadeParts'
                    {
                    enumLiteral_2=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getManufacturersAccess().getHandMadePartsEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getManufacturersAccess().getHandMadePartsEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleManufacturers"


    // $ANTLR start "ruleFrameType"
    // InternalNowereBycicleDsl.g:1471:1: ruleFrameType returns [Enumerator current=null] : ( (enumLiteral_0= 'RacerFrame' ) | (enumLiteral_1= 'CityFrame' ) | (enumLiteral_2= 'UnicycleFrame' ) ) ;
    public final Enumerator ruleFrameType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalNowereBycicleDsl.g:1477:2: ( ( (enumLiteral_0= 'RacerFrame' ) | (enumLiteral_1= 'CityFrame' ) | (enumLiteral_2= 'UnicycleFrame' ) ) )
            // InternalNowereBycicleDsl.g:1478:2: ( (enumLiteral_0= 'RacerFrame' ) | (enumLiteral_1= 'CityFrame' ) | (enumLiteral_2= 'UnicycleFrame' ) )
            {
            // InternalNowereBycicleDsl.g:1478:2: ( (enumLiteral_0= 'RacerFrame' ) | (enumLiteral_1= 'CityFrame' ) | (enumLiteral_2= 'UnicycleFrame' ) )
            int alt37=3;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt37=1;
                }
                break;
            case 38:
                {
                alt37=2;
                }
                break;
            case 39:
                {
                alt37=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // InternalNowereBycicleDsl.g:1479:3: (enumLiteral_0= 'RacerFrame' )
                    {
                    // InternalNowereBycicleDsl.g:1479:3: (enumLiteral_0= 'RacerFrame' )
                    // InternalNowereBycicleDsl.g:1480:4: enumLiteral_0= 'RacerFrame'
                    {
                    enumLiteral_0=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getFrameTypeAccess().getRacerFrameEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getFrameTypeAccess().getRacerFrameEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalNowereBycicleDsl.g:1487:3: (enumLiteral_1= 'CityFrame' )
                    {
                    // InternalNowereBycicleDsl.g:1487:3: (enumLiteral_1= 'CityFrame' )
                    // InternalNowereBycicleDsl.g:1488:4: enumLiteral_1= 'CityFrame'
                    {
                    enumLiteral_1=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getFrameTypeAccess().getCityFrameEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getFrameTypeAccess().getCityFrameEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalNowereBycicleDsl.g:1495:3: (enumLiteral_2= 'UnicycleFrame' )
                    {
                    // InternalNowereBycicleDsl.g:1495:3: (enumLiteral_2= 'UnicycleFrame' )
                    // InternalNowereBycicleDsl.g:1496:4: enumLiteral_2= 'UnicycleFrame'
                    {
                    enumLiteral_2=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getFrameTypeAccess().getUnicycleFrameEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getFrameTypeAccess().getUnicycleFrameEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFrameType"


    // $ANTLR start "ruleColor"
    // InternalNowereBycicleDsl.g:1506:1: ruleColor returns [Enumerator current=null] : ( (enumLiteral_0= 'Red' ) | (enumLiteral_1= 'Blue' ) | (enumLiteral_2= 'Black' ) | (enumLiteral_3= 'Green' ) ) ;
    public final Enumerator ruleColor() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalNowereBycicleDsl.g:1512:2: ( ( (enumLiteral_0= 'Red' ) | (enumLiteral_1= 'Blue' ) | (enumLiteral_2= 'Black' ) | (enumLiteral_3= 'Green' ) ) )
            // InternalNowereBycicleDsl.g:1513:2: ( (enumLiteral_0= 'Red' ) | (enumLiteral_1= 'Blue' ) | (enumLiteral_2= 'Black' ) | (enumLiteral_3= 'Green' ) )
            {
            // InternalNowereBycicleDsl.g:1513:2: ( (enumLiteral_0= 'Red' ) | (enumLiteral_1= 'Blue' ) | (enumLiteral_2= 'Black' ) | (enumLiteral_3= 'Green' ) )
            int alt38=4;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt38=1;
                }
                break;
            case 41:
                {
                alt38=2;
                }
                break;
            case 42:
                {
                alt38=3;
                }
                break;
            case 43:
                {
                alt38=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // InternalNowereBycicleDsl.g:1514:3: (enumLiteral_0= 'Red' )
                    {
                    // InternalNowereBycicleDsl.g:1514:3: (enumLiteral_0= 'Red' )
                    // InternalNowereBycicleDsl.g:1515:4: enumLiteral_0= 'Red'
                    {
                    enumLiteral_0=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getColorAccess().getRedEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getColorAccess().getRedEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalNowereBycicleDsl.g:1522:3: (enumLiteral_1= 'Blue' )
                    {
                    // InternalNowereBycicleDsl.g:1522:3: (enumLiteral_1= 'Blue' )
                    // InternalNowereBycicleDsl.g:1523:4: enumLiteral_1= 'Blue'
                    {
                    enumLiteral_1=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getColorAccess().getBlueEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getColorAccess().getBlueEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalNowereBycicleDsl.g:1530:3: (enumLiteral_2= 'Black' )
                    {
                    // InternalNowereBycicleDsl.g:1530:3: (enumLiteral_2= 'Black' )
                    // InternalNowereBycicleDsl.g:1531:4: enumLiteral_2= 'Black'
                    {
                    enumLiteral_2=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getColorAccess().getBlackEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getColorAccess().getBlackEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalNowereBycicleDsl.g:1538:3: (enumLiteral_3= 'Green' )
                    {
                    // InternalNowereBycicleDsl.g:1538:3: (enumLiteral_3= 'Green' )
                    // InternalNowereBycicleDsl.g:1539:4: enumLiteral_3= 'Green'
                    {
                    enumLiteral_3=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getColorAccess().getGreenEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getColorAccess().getGreenEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColor"


    // $ANTLR start "rulePedalTypes"
    // InternalNowereBycicleDsl.g:1549:1: rulePedalTypes returns [Enumerator current=null] : ( (enumLiteral_0= 'ChildPedals' ) | (enumLiteral_1= 'SportsPedals' ) | (enumLiteral_2= 'ComfortPedals' ) | (enumLiteral_3= 'ExtremePedals' ) ) ;
    public final Enumerator rulePedalTypes() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalNowereBycicleDsl.g:1555:2: ( ( (enumLiteral_0= 'ChildPedals' ) | (enumLiteral_1= 'SportsPedals' ) | (enumLiteral_2= 'ComfortPedals' ) | (enumLiteral_3= 'ExtremePedals' ) ) )
            // InternalNowereBycicleDsl.g:1556:2: ( (enumLiteral_0= 'ChildPedals' ) | (enumLiteral_1= 'SportsPedals' ) | (enumLiteral_2= 'ComfortPedals' ) | (enumLiteral_3= 'ExtremePedals' ) )
            {
            // InternalNowereBycicleDsl.g:1556:2: ( (enumLiteral_0= 'ChildPedals' ) | (enumLiteral_1= 'SportsPedals' ) | (enumLiteral_2= 'ComfortPedals' ) | (enumLiteral_3= 'ExtremePedals' ) )
            int alt39=4;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt39=1;
                }
                break;
            case 45:
                {
                alt39=2;
                }
                break;
            case 46:
                {
                alt39=3;
                }
                break;
            case 47:
                {
                alt39=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // InternalNowereBycicleDsl.g:1557:3: (enumLiteral_0= 'ChildPedals' )
                    {
                    // InternalNowereBycicleDsl.g:1557:3: (enumLiteral_0= 'ChildPedals' )
                    // InternalNowereBycicleDsl.g:1558:4: enumLiteral_0= 'ChildPedals'
                    {
                    enumLiteral_0=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getPedalTypesAccess().getChildPedalsEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPedalTypesAccess().getChildPedalsEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalNowereBycicleDsl.g:1565:3: (enumLiteral_1= 'SportsPedals' )
                    {
                    // InternalNowereBycicleDsl.g:1565:3: (enumLiteral_1= 'SportsPedals' )
                    // InternalNowereBycicleDsl.g:1566:4: enumLiteral_1= 'SportsPedals'
                    {
                    enumLiteral_1=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getPedalTypesAccess().getSportsPedalsEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPedalTypesAccess().getSportsPedalsEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalNowereBycicleDsl.g:1573:3: (enumLiteral_2= 'ComfortPedals' )
                    {
                    // InternalNowereBycicleDsl.g:1573:3: (enumLiteral_2= 'ComfortPedals' )
                    // InternalNowereBycicleDsl.g:1574:4: enumLiteral_2= 'ComfortPedals'
                    {
                    enumLiteral_2=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getPedalTypesAccess().getComfortPedalsEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getPedalTypesAccess().getComfortPedalsEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalNowereBycicleDsl.g:1581:3: (enumLiteral_3= 'ExtremePedals' )
                    {
                    // InternalNowereBycicleDsl.g:1581:3: (enumLiteral_3= 'ExtremePedals' )
                    // InternalNowereBycicleDsl.g:1582:4: enumLiteral_3= 'ExtremePedals'
                    {
                    enumLiteral_3=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getPedalTypesAccess().getExtremePedalsEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getPedalTypesAccess().getExtremePedalsEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePedalTypes"


    // $ANTLR start "ruleSaddleType"
    // InternalNowereBycicleDsl.g:1592:1: ruleSaddleType returns [Enumerator current=null] : ( (enumLiteral_0= 'RacingSaddle' ) | (enumLiteral_1= 'ChildSaddle' ) | (enumLiteral_2= 'SpecialUnicycleSaddle' ) | (enumLiteral_3= 'ComfortSaddle' ) ) ;
    public final Enumerator ruleSaddleType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalNowereBycicleDsl.g:1598:2: ( ( (enumLiteral_0= 'RacingSaddle' ) | (enumLiteral_1= 'ChildSaddle' ) | (enumLiteral_2= 'SpecialUnicycleSaddle' ) | (enumLiteral_3= 'ComfortSaddle' ) ) )
            // InternalNowereBycicleDsl.g:1599:2: ( (enumLiteral_0= 'RacingSaddle' ) | (enumLiteral_1= 'ChildSaddle' ) | (enumLiteral_2= 'SpecialUnicycleSaddle' ) | (enumLiteral_3= 'ComfortSaddle' ) )
            {
            // InternalNowereBycicleDsl.g:1599:2: ( (enumLiteral_0= 'RacingSaddle' ) | (enumLiteral_1= 'ChildSaddle' ) | (enumLiteral_2= 'SpecialUnicycleSaddle' ) | (enumLiteral_3= 'ComfortSaddle' ) )
            int alt40=4;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt40=1;
                }
                break;
            case 49:
                {
                alt40=2;
                }
                break;
            case 50:
                {
                alt40=3;
                }
                break;
            case 51:
                {
                alt40=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // InternalNowereBycicleDsl.g:1600:3: (enumLiteral_0= 'RacingSaddle' )
                    {
                    // InternalNowereBycicleDsl.g:1600:3: (enumLiteral_0= 'RacingSaddle' )
                    // InternalNowereBycicleDsl.g:1601:4: enumLiteral_0= 'RacingSaddle'
                    {
                    enumLiteral_0=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getSaddleTypeAccess().getRacingSaddleEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSaddleTypeAccess().getRacingSaddleEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalNowereBycicleDsl.g:1608:3: (enumLiteral_1= 'ChildSaddle' )
                    {
                    // InternalNowereBycicleDsl.g:1608:3: (enumLiteral_1= 'ChildSaddle' )
                    // InternalNowereBycicleDsl.g:1609:4: enumLiteral_1= 'ChildSaddle'
                    {
                    enumLiteral_1=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getSaddleTypeAccess().getChildSaddleEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSaddleTypeAccess().getChildSaddleEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalNowereBycicleDsl.g:1616:3: (enumLiteral_2= 'SpecialUnicycleSaddle' )
                    {
                    // InternalNowereBycicleDsl.g:1616:3: (enumLiteral_2= 'SpecialUnicycleSaddle' )
                    // InternalNowereBycicleDsl.g:1617:4: enumLiteral_2= 'SpecialUnicycleSaddle'
                    {
                    enumLiteral_2=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getSaddleTypeAccess().getSpecialUnicycleSaddleEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getSaddleTypeAccess().getSpecialUnicycleSaddleEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalNowereBycicleDsl.g:1624:3: (enumLiteral_3= 'ComfortSaddle' )
                    {
                    // InternalNowereBycicleDsl.g:1624:3: (enumLiteral_3= 'ComfortSaddle' )
                    // InternalNowereBycicleDsl.g:1625:4: enumLiteral_3= 'ComfortSaddle'
                    {
                    enumLiteral_3=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getSaddleTypeAccess().getComfortSaddleEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getSaddleTypeAccess().getComfortSaddleEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSaddleType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000035E101010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000035E10B012L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000052L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001E00002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000030020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001C00002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000001C00000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000E000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000F0000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020600002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020400002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000F00000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000080600002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000080400002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x000F000000000000L});

}