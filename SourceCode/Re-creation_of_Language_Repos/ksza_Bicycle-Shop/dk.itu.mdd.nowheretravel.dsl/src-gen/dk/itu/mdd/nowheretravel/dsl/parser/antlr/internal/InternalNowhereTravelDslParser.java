package dk.itu.mdd.nowheretravel.dsl.parser.antlr.internal;

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
import dk.itu.mdd.nowheretravel.dsl.services.NowhereTravelDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalNowhereTravelDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Travel'", "'CustomerData'", "'Parameter'", "'Connection'", "'Flight'", "'destinationTown'", "'destinationCountry'", "'Hotel'", "'hotelName'", "'TrekkingTour'", "'ParachuteTour'", "'CarRental'", "'Insurance'", "'type'", "'CarInsurance'", "'TravelInsurance'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
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
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalNowhereTravelDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalNowhereTravelDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalNowhereTravelDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalNowhereTravelDsl.g"; }



     	private NowhereTravelDslGrammarAccess grammarAccess;

        public InternalNowhereTravelDslParser(TokenStream input, NowhereTravelDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Travel";
       	}

       	@Override
       	protected NowhereTravelDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleTravel"
    // InternalNowhereTravelDsl.g:65:1: entryRuleTravel returns [EObject current=null] : iv_ruleTravel= ruleTravel EOF ;
    public final EObject entryRuleTravel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTravel = null;


        try {
            // InternalNowhereTravelDsl.g:65:47: (iv_ruleTravel= ruleTravel EOF )
            // InternalNowhereTravelDsl.g:66:2: iv_ruleTravel= ruleTravel EOF
            {
             newCompositeNode(grammarAccess.getTravelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTravel=ruleTravel();

            state._fsp--;

             current =iv_ruleTravel; 
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
    // $ANTLR end "entryRuleTravel"


    // $ANTLR start "ruleTravel"
    // InternalNowhereTravelDsl.g:72:1: ruleTravel returns [EObject current=null] : (otherlv_0= 'Travel' this_ID_1= RULE_ID ( (lv_start_2_0= ruleStart ) ) ( (lv_items_3_0= ruleItem ) )+ ( (lv_data_4_0= ruleData ) ) ( (lv_connections_5_0= ruleConnection ) )* ( (lv_end_6_0= ruleEnd ) ) ) ;
    public final EObject ruleTravel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_ID_1=null;
        EObject lv_start_2_0 = null;

        EObject lv_items_3_0 = null;

        EObject lv_data_4_0 = null;

        EObject lv_connections_5_0 = null;

        EObject lv_end_6_0 = null;



        	enterRule();

        try {
            // InternalNowhereTravelDsl.g:78:2: ( (otherlv_0= 'Travel' this_ID_1= RULE_ID ( (lv_start_2_0= ruleStart ) ) ( (lv_items_3_0= ruleItem ) )+ ( (lv_data_4_0= ruleData ) ) ( (lv_connections_5_0= ruleConnection ) )* ( (lv_end_6_0= ruleEnd ) ) ) )
            // InternalNowhereTravelDsl.g:79:2: (otherlv_0= 'Travel' this_ID_1= RULE_ID ( (lv_start_2_0= ruleStart ) ) ( (lv_items_3_0= ruleItem ) )+ ( (lv_data_4_0= ruleData ) ) ( (lv_connections_5_0= ruleConnection ) )* ( (lv_end_6_0= ruleEnd ) ) )
            {
            // InternalNowhereTravelDsl.g:79:2: (otherlv_0= 'Travel' this_ID_1= RULE_ID ( (lv_start_2_0= ruleStart ) ) ( (lv_items_3_0= ruleItem ) )+ ( (lv_data_4_0= ruleData ) ) ( (lv_connections_5_0= ruleConnection ) )* ( (lv_end_6_0= ruleEnd ) ) )
            // InternalNowhereTravelDsl.g:80:3: otherlv_0= 'Travel' this_ID_1= RULE_ID ( (lv_start_2_0= ruleStart ) ) ( (lv_items_3_0= ruleItem ) )+ ( (lv_data_4_0= ruleData ) ) ( (lv_connections_5_0= ruleConnection ) )* ( (lv_end_6_0= ruleEnd ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTravelAccess().getTravelKeyword_0());
            		
            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_4); 

            			newLeafNode(this_ID_1, grammarAccess.getTravelAccess().getIDTerminalRuleCall_1());
            		
            // InternalNowhereTravelDsl.g:88:3: ( (lv_start_2_0= ruleStart ) )
            // InternalNowhereTravelDsl.g:89:4: (lv_start_2_0= ruleStart )
            {
            // InternalNowhereTravelDsl.g:89:4: (lv_start_2_0= ruleStart )
            // InternalNowhereTravelDsl.g:90:5: lv_start_2_0= ruleStart
            {

            					newCompositeNode(grammarAccess.getTravelAccess().getStartStartParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_start_2_0=ruleStart();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTravelRule());
            					}
            					set(
            						current,
            						"start",
            						lv_start_2_0,
            						"dk.itu.mdd.nowheretravel.dsl.NowhereTravelDsl.Start");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalNowhereTravelDsl.g:107:3: ( (lv_items_3_0= ruleItem ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15||LA1_0==18||(LA1_0>=20 && LA1_0<=23)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalNowhereTravelDsl.g:108:4: (lv_items_3_0= ruleItem )
            	    {
            	    // InternalNowhereTravelDsl.g:108:4: (lv_items_3_0= ruleItem )
            	    // InternalNowhereTravelDsl.g:109:5: lv_items_3_0= ruleItem
            	    {

            	    					newCompositeNode(grammarAccess.getTravelAccess().getItemsItemParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_items_3_0=ruleItem();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTravelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"items",
            	    						lv_items_3_0,
            	    						"dk.itu.mdd.nowheretravel.dsl.NowhereTravelDsl.Item");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            // InternalNowhereTravelDsl.g:126:3: ( (lv_data_4_0= ruleData ) )
            // InternalNowhereTravelDsl.g:127:4: (lv_data_4_0= ruleData )
            {
            // InternalNowhereTravelDsl.g:127:4: (lv_data_4_0= ruleData )
            // InternalNowhereTravelDsl.g:128:5: lv_data_4_0= ruleData
            {

            					newCompositeNode(grammarAccess.getTravelAccess().getDataDataParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_data_4_0=ruleData();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTravelRule());
            					}
            					add(
            						current,
            						"data",
            						lv_data_4_0,
            						"dk.itu.mdd.nowheretravel.dsl.NowhereTravelDsl.Data");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalNowhereTravelDsl.g:145:3: ( (lv_connections_5_0= ruleConnection ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalNowhereTravelDsl.g:146:4: (lv_connections_5_0= ruleConnection )
            	    {
            	    // InternalNowhereTravelDsl.g:146:4: (lv_connections_5_0= ruleConnection )
            	    // InternalNowhereTravelDsl.g:147:5: lv_connections_5_0= ruleConnection
            	    {

            	    					newCompositeNode(grammarAccess.getTravelAccess().getConnectionsConnectionParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_connections_5_0=ruleConnection();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTravelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"connections",
            	    						lv_connections_5_0,
            	    						"dk.itu.mdd.nowheretravel.dsl.NowhereTravelDsl.Connection");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalNowhereTravelDsl.g:164:3: ( (lv_end_6_0= ruleEnd ) )
            // InternalNowhereTravelDsl.g:165:4: (lv_end_6_0= ruleEnd )
            {
            // InternalNowhereTravelDsl.g:165:4: (lv_end_6_0= ruleEnd )
            // InternalNowhereTravelDsl.g:166:5: lv_end_6_0= ruleEnd
            {

            					newCompositeNode(grammarAccess.getTravelAccess().getEndEndParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_end_6_0=ruleEnd();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTravelRule());
            					}
            					set(
            						current,
            						"end",
            						lv_end_6_0,
            						"dk.itu.mdd.nowheretravel.dsl.NowhereTravelDsl.End");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleTravel"


    // $ANTLR start "entryRuleItem"
    // InternalNowhereTravelDsl.g:187:1: entryRuleItem returns [EObject current=null] : iv_ruleItem= ruleItem EOF ;
    public final EObject entryRuleItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItem = null;


        try {
            // InternalNowhereTravelDsl.g:187:45: (iv_ruleItem= ruleItem EOF )
            // InternalNowhereTravelDsl.g:188:2: iv_ruleItem= ruleItem EOF
            {
             newCompositeNode(grammarAccess.getItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleItem=ruleItem();

            state._fsp--;

             current =iv_ruleItem; 
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
    // $ANTLR end "entryRuleItem"


    // $ANTLR start "ruleItem"
    // InternalNowhereTravelDsl.g:194:1: ruleItem returns [EObject current=null] : (this_Flight_0= ruleFlight | this_Hotel_1= ruleHotel | this_TrekkingTour_2= ruleTrekkingTour | this_ParachuteTour_3= ruleParachuteTour | this_CarRental_4= ruleCarRental | this_Insurance_5= ruleInsurance ) ;
    public final EObject ruleItem() throws RecognitionException {
        EObject current = null;

        EObject this_Flight_0 = null;

        EObject this_Hotel_1 = null;

        EObject this_TrekkingTour_2 = null;

        EObject this_ParachuteTour_3 = null;

        EObject this_CarRental_4 = null;

        EObject this_Insurance_5 = null;



        	enterRule();

        try {
            // InternalNowhereTravelDsl.g:200:2: ( (this_Flight_0= ruleFlight | this_Hotel_1= ruleHotel | this_TrekkingTour_2= ruleTrekkingTour | this_ParachuteTour_3= ruleParachuteTour | this_CarRental_4= ruleCarRental | this_Insurance_5= ruleInsurance ) )
            // InternalNowhereTravelDsl.g:201:2: (this_Flight_0= ruleFlight | this_Hotel_1= ruleHotel | this_TrekkingTour_2= ruleTrekkingTour | this_ParachuteTour_3= ruleParachuteTour | this_CarRental_4= ruleCarRental | this_Insurance_5= ruleInsurance )
            {
            // InternalNowhereTravelDsl.g:201:2: (this_Flight_0= ruleFlight | this_Hotel_1= ruleHotel | this_TrekkingTour_2= ruleTrekkingTour | this_ParachuteTour_3= ruleParachuteTour | this_CarRental_4= ruleCarRental | this_Insurance_5= ruleInsurance )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt3=1;
                }
                break;
            case 18:
                {
                alt3=2;
                }
                break;
            case 20:
                {
                alt3=3;
                }
                break;
            case 21:
                {
                alt3=4;
                }
                break;
            case 22:
                {
                alt3=5;
                }
                break;
            case 23:
                {
                alt3=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalNowhereTravelDsl.g:202:3: this_Flight_0= ruleFlight
                    {

                    			newCompositeNode(grammarAccess.getItemAccess().getFlightParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Flight_0=ruleFlight();

                    state._fsp--;


                    			current = this_Flight_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalNowhereTravelDsl.g:211:3: this_Hotel_1= ruleHotel
                    {

                    			newCompositeNode(grammarAccess.getItemAccess().getHotelParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Hotel_1=ruleHotel();

                    state._fsp--;


                    			current = this_Hotel_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalNowhereTravelDsl.g:220:3: this_TrekkingTour_2= ruleTrekkingTour
                    {

                    			newCompositeNode(grammarAccess.getItemAccess().getTrekkingTourParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_TrekkingTour_2=ruleTrekkingTour();

                    state._fsp--;


                    			current = this_TrekkingTour_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalNowhereTravelDsl.g:229:3: this_ParachuteTour_3= ruleParachuteTour
                    {

                    			newCompositeNode(grammarAccess.getItemAccess().getParachuteTourParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParachuteTour_3=ruleParachuteTour();

                    state._fsp--;


                    			current = this_ParachuteTour_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalNowhereTravelDsl.g:238:3: this_CarRental_4= ruleCarRental
                    {

                    			newCompositeNode(grammarAccess.getItemAccess().getCarRentalParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_CarRental_4=ruleCarRental();

                    state._fsp--;


                    			current = this_CarRental_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalNowhereTravelDsl.g:247:3: this_Insurance_5= ruleInsurance
                    {

                    			newCompositeNode(grammarAccess.getItemAccess().getInsuranceParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Insurance_5=ruleInsurance();

                    state._fsp--;


                    			current = this_Insurance_5;
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
    // $ANTLR end "ruleItem"


    // $ANTLR start "entryRuleStart"
    // InternalNowhereTravelDsl.g:259:1: entryRuleStart returns [EObject current=null] : iv_ruleStart= ruleStart EOF ;
    public final EObject entryRuleStart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStart = null;


        try {
            // InternalNowhereTravelDsl.g:259:46: (iv_ruleStart= ruleStart EOF )
            // InternalNowhereTravelDsl.g:260:2: iv_ruleStart= ruleStart EOF
            {
             newCompositeNode(grammarAccess.getStartRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStart=ruleStart();

            state._fsp--;

             current =iv_ruleStart; 
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
    // $ANTLR end "entryRuleStart"


    // $ANTLR start "ruleStart"
    // InternalNowhereTravelDsl.g:266:1: ruleStart returns [EObject current=null] : () ;
    public final EObject ruleStart() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalNowhereTravelDsl.g:272:2: ( () )
            // InternalNowhereTravelDsl.g:273:2: ()
            {
            // InternalNowhereTravelDsl.g:273:2: ()
            // InternalNowhereTravelDsl.g:274:3: 
            {

            			current = forceCreateModelElement(
            				grammarAccess.getStartAccess().getStartAction(),
            				current);
            		

            }


            }


            	leaveRule();

        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStart"


    // $ANTLR start "entryRuleEnd"
    // InternalNowhereTravelDsl.g:283:1: entryRuleEnd returns [EObject current=null] : iv_ruleEnd= ruleEnd EOF ;
    public final EObject entryRuleEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnd = null;


        try {
            // InternalNowhereTravelDsl.g:283:44: (iv_ruleEnd= ruleEnd EOF )
            // InternalNowhereTravelDsl.g:284:2: iv_ruleEnd= ruleEnd EOF
            {
             newCompositeNode(grammarAccess.getEndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnd=ruleEnd();

            state._fsp--;

             current =iv_ruleEnd; 
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
    // $ANTLR end "entryRuleEnd"


    // $ANTLR start "ruleEnd"
    // InternalNowhereTravelDsl.g:290:1: ruleEnd returns [EObject current=null] : () ;
    public final EObject ruleEnd() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalNowhereTravelDsl.g:296:2: ( () )
            // InternalNowhereTravelDsl.g:297:2: ()
            {
            // InternalNowhereTravelDsl.g:297:2: ()
            // InternalNowhereTravelDsl.g:298:3: 
            {

            			current = forceCreateModelElement(
            				grammarAccess.getEndAccess().getEndAction(),
            				current);
            		

            }


            }


            	leaveRule();

        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnd"


    // $ANTLR start "entryRuleData"
    // InternalNowhereTravelDsl.g:307:1: entryRuleData returns [EObject current=null] : iv_ruleData= ruleData EOF ;
    public final EObject entryRuleData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleData = null;


        try {
            // InternalNowhereTravelDsl.g:307:45: (iv_ruleData= ruleData EOF )
            // InternalNowhereTravelDsl.g:308:2: iv_ruleData= ruleData EOF
            {
             newCompositeNode(grammarAccess.getDataRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleData=ruleData();

            state._fsp--;

             current =iv_ruleData; 
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
    // $ANTLR end "entryRuleData"


    // $ANTLR start "ruleData"
    // InternalNowhereTravelDsl.g:314:1: ruleData returns [EObject current=null] : (otherlv_0= 'CustomerData' ( (lv_name_1_0= ruleEString ) ) ( (lv_parameters_2_0= ruleParameter ) )? ) ;
    public final EObject ruleData() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_parameters_2_0 = null;



        	enterRule();

        try {
            // InternalNowhereTravelDsl.g:320:2: ( (otherlv_0= 'CustomerData' ( (lv_name_1_0= ruleEString ) ) ( (lv_parameters_2_0= ruleParameter ) )? ) )
            // InternalNowhereTravelDsl.g:321:2: (otherlv_0= 'CustomerData' ( (lv_name_1_0= ruleEString ) ) ( (lv_parameters_2_0= ruleParameter ) )? )
            {
            // InternalNowhereTravelDsl.g:321:2: (otherlv_0= 'CustomerData' ( (lv_name_1_0= ruleEString ) ) ( (lv_parameters_2_0= ruleParameter ) )? )
            // InternalNowhereTravelDsl.g:322:3: otherlv_0= 'CustomerData' ( (lv_name_1_0= ruleEString ) ) ( (lv_parameters_2_0= ruleParameter ) )?
            {
            otherlv_0=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getDataAccess().getCustomerDataKeyword_0());
            		
            // InternalNowhereTravelDsl.g:326:3: ( (lv_name_1_0= ruleEString ) )
            // InternalNowhereTravelDsl.g:327:4: (lv_name_1_0= ruleEString )
            {
            // InternalNowhereTravelDsl.g:327:4: (lv_name_1_0= ruleEString )
            // InternalNowhereTravelDsl.g:328:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDataAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"dk.itu.mdd.nowheretravel.dsl.NowhereTravelDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalNowhereTravelDsl.g:345:3: ( (lv_parameters_2_0= ruleParameter ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalNowhereTravelDsl.g:346:4: (lv_parameters_2_0= ruleParameter )
                    {
                    // InternalNowhereTravelDsl.g:346:4: (lv_parameters_2_0= ruleParameter )
                    // InternalNowhereTravelDsl.g:347:5: lv_parameters_2_0= ruleParameter
                    {

                    					newCompositeNode(grammarAccess.getDataAccess().getParametersParameterParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_parameters_2_0=ruleParameter();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDataRule());
                    					}
                    					add(
                    						current,
                    						"parameters",
                    						lv_parameters_2_0,
                    						"dk.itu.mdd.nowheretravel.dsl.NowhereTravelDsl.Parameter");
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
    // $ANTLR end "ruleData"


    // $ANTLR start "entryRuleEString"
    // InternalNowhereTravelDsl.g:368:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalNowhereTravelDsl.g:368:47: (iv_ruleEString= ruleEString EOF )
            // InternalNowhereTravelDsl.g:369:2: iv_ruleEString= ruleEString EOF
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
    // InternalNowhereTravelDsl.g:375:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalNowhereTravelDsl.g:381:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalNowhereTravelDsl.g:382:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalNowhereTravelDsl.g:382:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalNowhereTravelDsl.g:383:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalNowhereTravelDsl.g:391:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleParameter"
    // InternalNowhereTravelDsl.g:402:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalNowhereTravelDsl.g:402:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalNowhereTravelDsl.g:403:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalNowhereTravelDsl.g:409:1: ruleParameter returns [EObject current=null] : (otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) ( (lv_value_2_0= ruleEString ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalNowhereTravelDsl.g:415:2: ( (otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) ( (lv_value_2_0= ruleEString ) ) ) )
            // InternalNowhereTravelDsl.g:416:2: (otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) ( (lv_value_2_0= ruleEString ) ) )
            {
            // InternalNowhereTravelDsl.g:416:2: (otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) ( (lv_value_2_0= ruleEString ) ) )
            // InternalNowhereTravelDsl.g:417:3: otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) ( (lv_value_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getParameterKeyword_0());
            		
            // InternalNowhereTravelDsl.g:421:3: ( (lv_name_1_0= ruleEString ) )
            // InternalNowhereTravelDsl.g:422:4: (lv_name_1_0= ruleEString )
            {
            // InternalNowhereTravelDsl.g:422:4: (lv_name_1_0= ruleEString )
            // InternalNowhereTravelDsl.g:423:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"dk.itu.mdd.nowheretravel.dsl.NowhereTravelDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalNowhereTravelDsl.g:440:3: ( (lv_value_2_0= ruleEString ) )
            // InternalNowhereTravelDsl.g:441:4: (lv_value_2_0= ruleEString )
            {
            // InternalNowhereTravelDsl.g:441:4: (lv_value_2_0= ruleEString )
            // InternalNowhereTravelDsl.g:442:5: lv_value_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getValueEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"dk.itu.mdd.nowheretravel.dsl.NowhereTravelDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


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


    // $ANTLR start "entryRuleConnection"
    // InternalNowhereTravelDsl.g:463:1: entryRuleConnection returns [EObject current=null] : iv_ruleConnection= ruleConnection EOF ;
    public final EObject entryRuleConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnection = null;


        try {
            // InternalNowhereTravelDsl.g:463:51: (iv_ruleConnection= ruleConnection EOF )
            // InternalNowhereTravelDsl.g:464:2: iv_ruleConnection= ruleConnection EOF
            {
             newCompositeNode(grammarAccess.getConnectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConnection=ruleConnection();

            state._fsp--;

             current =iv_ruleConnection; 
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
    // $ANTLR end "entryRuleConnection"


    // $ANTLR start "ruleConnection"
    // InternalNowhereTravelDsl.g:470:1: ruleConnection returns [EObject current=null] : (otherlv_0= 'Connection' ( (lv_name_1_0= ruleEString ) ) ( ( ruleEString ) ) ( ( ruleEString ) ) ) ;
    public final EObject ruleConnection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalNowhereTravelDsl.g:476:2: ( (otherlv_0= 'Connection' ( (lv_name_1_0= ruleEString ) ) ( ( ruleEString ) ) ( ( ruleEString ) ) ) )
            // InternalNowhereTravelDsl.g:477:2: (otherlv_0= 'Connection' ( (lv_name_1_0= ruleEString ) ) ( ( ruleEString ) ) ( ( ruleEString ) ) )
            {
            // InternalNowhereTravelDsl.g:477:2: (otherlv_0= 'Connection' ( (lv_name_1_0= ruleEString ) ) ( ( ruleEString ) ) ( ( ruleEString ) ) )
            // InternalNowhereTravelDsl.g:478:3: otherlv_0= 'Connection' ( (lv_name_1_0= ruleEString ) ) ( ( ruleEString ) ) ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getConnectionAccess().getConnectionKeyword_0());
            		
            // InternalNowhereTravelDsl.g:482:3: ( (lv_name_1_0= ruleEString ) )
            // InternalNowhereTravelDsl.g:483:4: (lv_name_1_0= ruleEString )
            {
            // InternalNowhereTravelDsl.g:483:4: (lv_name_1_0= ruleEString )
            // InternalNowhereTravelDsl.g:484:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getConnectionAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConnectionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"dk.itu.mdd.nowheretravel.dsl.NowhereTravelDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalNowhereTravelDsl.g:501:3: ( ( ruleEString ) )
            // InternalNowhereTravelDsl.g:502:4: ( ruleEString )
            {
            // InternalNowhereTravelDsl.g:502:4: ( ruleEString )
            // InternalNowhereTravelDsl.g:503:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConnectionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getConnectionAccess().getSourceNodeNodeCrossReference_2_0());
            				
            pushFollow(FOLLOW_7);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalNowhereTravelDsl.g:517:3: ( ( ruleEString ) )
            // InternalNowhereTravelDsl.g:518:4: ( ruleEString )
            {
            // InternalNowhereTravelDsl.g:518:4: ( ruleEString )
            // InternalNowhereTravelDsl.g:519:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConnectionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getConnectionAccess().getTargetNodeNodeCrossReference_3_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleConnection"


    // $ANTLR start "entryRuleFlight"
    // InternalNowhereTravelDsl.g:537:1: entryRuleFlight returns [EObject current=null] : iv_ruleFlight= ruleFlight EOF ;
    public final EObject entryRuleFlight() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFlight = null;


        try {
            // InternalNowhereTravelDsl.g:537:47: (iv_ruleFlight= ruleFlight EOF )
            // InternalNowhereTravelDsl.g:538:2: iv_ruleFlight= ruleFlight EOF
            {
             newCompositeNode(grammarAccess.getFlightRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFlight=ruleFlight();

            state._fsp--;

             current =iv_ruleFlight; 
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
    // $ANTLR end "entryRuleFlight"


    // $ANTLR start "ruleFlight"
    // InternalNowhereTravelDsl.g:544:1: ruleFlight returns [EObject current=null] : ( () otherlv_1= 'Flight' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'destinationTown' ( (lv_destinationTown_4_0= ruleEString ) ) )? (otherlv_5= 'destinationCountry' ( (lv_destinationCountry_6_0= ruleEString ) ) )? ) ;
    public final EObject ruleFlight() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_destinationTown_4_0 = null;

        AntlrDatatypeRuleToken lv_destinationCountry_6_0 = null;



        	enterRule();

        try {
            // InternalNowhereTravelDsl.g:550:2: ( ( () otherlv_1= 'Flight' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'destinationTown' ( (lv_destinationTown_4_0= ruleEString ) ) )? (otherlv_5= 'destinationCountry' ( (lv_destinationCountry_6_0= ruleEString ) ) )? ) )
            // InternalNowhereTravelDsl.g:551:2: ( () otherlv_1= 'Flight' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'destinationTown' ( (lv_destinationTown_4_0= ruleEString ) ) )? (otherlv_5= 'destinationCountry' ( (lv_destinationCountry_6_0= ruleEString ) ) )? )
            {
            // InternalNowhereTravelDsl.g:551:2: ( () otherlv_1= 'Flight' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'destinationTown' ( (lv_destinationTown_4_0= ruleEString ) ) )? (otherlv_5= 'destinationCountry' ( (lv_destinationCountry_6_0= ruleEString ) ) )? )
            // InternalNowhereTravelDsl.g:552:3: () otherlv_1= 'Flight' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'destinationTown' ( (lv_destinationTown_4_0= ruleEString ) ) )? (otherlv_5= 'destinationCountry' ( (lv_destinationCountry_6_0= ruleEString ) ) )?
            {
            // InternalNowhereTravelDsl.g:552:3: ()
            // InternalNowhereTravelDsl.g:553:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFlightAccess().getFlightAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getFlightAccess().getFlightKeyword_1());
            		
            // InternalNowhereTravelDsl.g:563:3: ( (lv_name_2_0= ruleEString ) )
            // InternalNowhereTravelDsl.g:564:4: (lv_name_2_0= ruleEString )
            {
            // InternalNowhereTravelDsl.g:564:4: (lv_name_2_0= ruleEString )
            // InternalNowhereTravelDsl.g:565:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFlightAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFlightRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"dk.itu.mdd.nowheretravel.dsl.NowhereTravelDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalNowhereTravelDsl.g:582:3: (otherlv_3= 'destinationTown' ( (lv_destinationTown_4_0= ruleEString ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalNowhereTravelDsl.g:583:4: otherlv_3= 'destinationTown' ( (lv_destinationTown_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getFlightAccess().getDestinationTownKeyword_3_0());
                    			
                    // InternalNowhereTravelDsl.g:587:4: ( (lv_destinationTown_4_0= ruleEString ) )
                    // InternalNowhereTravelDsl.g:588:5: (lv_destinationTown_4_0= ruleEString )
                    {
                    // InternalNowhereTravelDsl.g:588:5: (lv_destinationTown_4_0= ruleEString )
                    // InternalNowhereTravelDsl.g:589:6: lv_destinationTown_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getFlightAccess().getDestinationTownEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_destinationTown_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFlightRule());
                    						}
                    						set(
                    							current,
                    							"destinationTown",
                    							lv_destinationTown_4_0,
                    							"dk.itu.mdd.nowheretravel.dsl.NowhereTravelDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalNowhereTravelDsl.g:607:3: (otherlv_5= 'destinationCountry' ( (lv_destinationCountry_6_0= ruleEString ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalNowhereTravelDsl.g:608:4: otherlv_5= 'destinationCountry' ( (lv_destinationCountry_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,17,FOLLOW_7); 

                    				newLeafNode(otherlv_5, grammarAccess.getFlightAccess().getDestinationCountryKeyword_4_0());
                    			
                    // InternalNowhereTravelDsl.g:612:4: ( (lv_destinationCountry_6_0= ruleEString ) )
                    // InternalNowhereTravelDsl.g:613:5: (lv_destinationCountry_6_0= ruleEString )
                    {
                    // InternalNowhereTravelDsl.g:613:5: (lv_destinationCountry_6_0= ruleEString )
                    // InternalNowhereTravelDsl.g:614:6: lv_destinationCountry_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getFlightAccess().getDestinationCountryEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_destinationCountry_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFlightRule());
                    						}
                    						set(
                    							current,
                    							"destinationCountry",
                    							lv_destinationCountry_6_0,
                    							"dk.itu.mdd.nowheretravel.dsl.NowhereTravelDsl.EString");
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
    // $ANTLR end "ruleFlight"


    // $ANTLR start "entryRuleHotel"
    // InternalNowhereTravelDsl.g:636:1: entryRuleHotel returns [EObject current=null] : iv_ruleHotel= ruleHotel EOF ;
    public final EObject entryRuleHotel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHotel = null;


        try {
            // InternalNowhereTravelDsl.g:636:46: (iv_ruleHotel= ruleHotel EOF )
            // InternalNowhereTravelDsl.g:637:2: iv_ruleHotel= ruleHotel EOF
            {
             newCompositeNode(grammarAccess.getHotelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHotel=ruleHotel();

            state._fsp--;

             current =iv_ruleHotel; 
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
    // $ANTLR end "entryRuleHotel"


    // $ANTLR start "ruleHotel"
    // InternalNowhereTravelDsl.g:643:1: ruleHotel returns [EObject current=null] : ( () otherlv_1= 'Hotel' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'hotelName' ( (lv_hotelName_4_0= ruleEString ) ) )? ) ;
    public final EObject ruleHotel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_hotelName_4_0 = null;



        	enterRule();

        try {
            // InternalNowhereTravelDsl.g:649:2: ( ( () otherlv_1= 'Hotel' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'hotelName' ( (lv_hotelName_4_0= ruleEString ) ) )? ) )
            // InternalNowhereTravelDsl.g:650:2: ( () otherlv_1= 'Hotel' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'hotelName' ( (lv_hotelName_4_0= ruleEString ) ) )? )
            {
            // InternalNowhereTravelDsl.g:650:2: ( () otherlv_1= 'Hotel' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'hotelName' ( (lv_hotelName_4_0= ruleEString ) ) )? )
            // InternalNowhereTravelDsl.g:651:3: () otherlv_1= 'Hotel' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'hotelName' ( (lv_hotelName_4_0= ruleEString ) ) )?
            {
            // InternalNowhereTravelDsl.g:651:3: ()
            // InternalNowhereTravelDsl.g:652:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getHotelAccess().getHotelAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getHotelAccess().getHotelKeyword_1());
            		
            // InternalNowhereTravelDsl.g:662:3: ( (lv_name_2_0= ruleEString ) )
            // InternalNowhereTravelDsl.g:663:4: (lv_name_2_0= ruleEString )
            {
            // InternalNowhereTravelDsl.g:663:4: (lv_name_2_0= ruleEString )
            // InternalNowhereTravelDsl.g:664:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getHotelAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_11);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHotelRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"dk.itu.mdd.nowheretravel.dsl.NowhereTravelDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalNowhereTravelDsl.g:681:3: (otherlv_3= 'hotelName' ( (lv_hotelName_4_0= ruleEString ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalNowhereTravelDsl.g:682:4: otherlv_3= 'hotelName' ( (lv_hotelName_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getHotelAccess().getHotelNameKeyword_3_0());
                    			
                    // InternalNowhereTravelDsl.g:686:4: ( (lv_hotelName_4_0= ruleEString ) )
                    // InternalNowhereTravelDsl.g:687:5: (lv_hotelName_4_0= ruleEString )
                    {
                    // InternalNowhereTravelDsl.g:687:5: (lv_hotelName_4_0= ruleEString )
                    // InternalNowhereTravelDsl.g:688:6: lv_hotelName_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getHotelAccess().getHotelNameEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_hotelName_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getHotelRule());
                    						}
                    						set(
                    							current,
                    							"hotelName",
                    							lv_hotelName_4_0,
                    							"dk.itu.mdd.nowheretravel.dsl.NowhereTravelDsl.EString");
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
    // $ANTLR end "ruleHotel"


    // $ANTLR start "entryRuleTrekkingTour"
    // InternalNowhereTravelDsl.g:710:1: entryRuleTrekkingTour returns [EObject current=null] : iv_ruleTrekkingTour= ruleTrekkingTour EOF ;
    public final EObject entryRuleTrekkingTour() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrekkingTour = null;


        try {
            // InternalNowhereTravelDsl.g:710:53: (iv_ruleTrekkingTour= ruleTrekkingTour EOF )
            // InternalNowhereTravelDsl.g:711:2: iv_ruleTrekkingTour= ruleTrekkingTour EOF
            {
             newCompositeNode(grammarAccess.getTrekkingTourRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTrekkingTour=ruleTrekkingTour();

            state._fsp--;

             current =iv_ruleTrekkingTour; 
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
    // $ANTLR end "entryRuleTrekkingTour"


    // $ANTLR start "ruleTrekkingTour"
    // InternalNowhereTravelDsl.g:717:1: ruleTrekkingTour returns [EObject current=null] : ( () otherlv_1= 'TrekkingTour' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleTrekkingTour() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalNowhereTravelDsl.g:723:2: ( ( () otherlv_1= 'TrekkingTour' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalNowhereTravelDsl.g:724:2: ( () otherlv_1= 'TrekkingTour' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalNowhereTravelDsl.g:724:2: ( () otherlv_1= 'TrekkingTour' ( (lv_name_2_0= ruleEString ) ) )
            // InternalNowhereTravelDsl.g:725:3: () otherlv_1= 'TrekkingTour' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalNowhereTravelDsl.g:725:3: ()
            // InternalNowhereTravelDsl.g:726:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTrekkingTourAccess().getTrekkingTourAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getTrekkingTourAccess().getTrekkingTourKeyword_1());
            		
            // InternalNowhereTravelDsl.g:736:3: ( (lv_name_2_0= ruleEString ) )
            // InternalNowhereTravelDsl.g:737:4: (lv_name_2_0= ruleEString )
            {
            // InternalNowhereTravelDsl.g:737:4: (lv_name_2_0= ruleEString )
            // InternalNowhereTravelDsl.g:738:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTrekkingTourAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTrekkingTourRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"dk.itu.mdd.nowheretravel.dsl.NowhereTravelDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleTrekkingTour"


    // $ANTLR start "entryRuleParachuteTour"
    // InternalNowhereTravelDsl.g:759:1: entryRuleParachuteTour returns [EObject current=null] : iv_ruleParachuteTour= ruleParachuteTour EOF ;
    public final EObject entryRuleParachuteTour() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParachuteTour = null;


        try {
            // InternalNowhereTravelDsl.g:759:54: (iv_ruleParachuteTour= ruleParachuteTour EOF )
            // InternalNowhereTravelDsl.g:760:2: iv_ruleParachuteTour= ruleParachuteTour EOF
            {
             newCompositeNode(grammarAccess.getParachuteTourRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParachuteTour=ruleParachuteTour();

            state._fsp--;

             current =iv_ruleParachuteTour; 
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
    // $ANTLR end "entryRuleParachuteTour"


    // $ANTLR start "ruleParachuteTour"
    // InternalNowhereTravelDsl.g:766:1: ruleParachuteTour returns [EObject current=null] : ( () otherlv_1= 'ParachuteTour' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleParachuteTour() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalNowhereTravelDsl.g:772:2: ( ( () otherlv_1= 'ParachuteTour' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalNowhereTravelDsl.g:773:2: ( () otherlv_1= 'ParachuteTour' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalNowhereTravelDsl.g:773:2: ( () otherlv_1= 'ParachuteTour' ( (lv_name_2_0= ruleEString ) ) )
            // InternalNowhereTravelDsl.g:774:3: () otherlv_1= 'ParachuteTour' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalNowhereTravelDsl.g:774:3: ()
            // InternalNowhereTravelDsl.g:775:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParachuteTourAccess().getParachuteTourAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getParachuteTourAccess().getParachuteTourKeyword_1());
            		
            // InternalNowhereTravelDsl.g:785:3: ( (lv_name_2_0= ruleEString ) )
            // InternalNowhereTravelDsl.g:786:4: (lv_name_2_0= ruleEString )
            {
            // InternalNowhereTravelDsl.g:786:4: (lv_name_2_0= ruleEString )
            // InternalNowhereTravelDsl.g:787:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParachuteTourAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParachuteTourRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"dk.itu.mdd.nowheretravel.dsl.NowhereTravelDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleParachuteTour"


    // $ANTLR start "entryRuleCarRental"
    // InternalNowhereTravelDsl.g:808:1: entryRuleCarRental returns [EObject current=null] : iv_ruleCarRental= ruleCarRental EOF ;
    public final EObject entryRuleCarRental() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCarRental = null;


        try {
            // InternalNowhereTravelDsl.g:808:50: (iv_ruleCarRental= ruleCarRental EOF )
            // InternalNowhereTravelDsl.g:809:2: iv_ruleCarRental= ruleCarRental EOF
            {
             newCompositeNode(grammarAccess.getCarRentalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCarRental=ruleCarRental();

            state._fsp--;

             current =iv_ruleCarRental; 
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
    // $ANTLR end "entryRuleCarRental"


    // $ANTLR start "ruleCarRental"
    // InternalNowhereTravelDsl.g:815:1: ruleCarRental returns [EObject current=null] : ( () otherlv_1= 'CarRental' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleCarRental() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalNowhereTravelDsl.g:821:2: ( ( () otherlv_1= 'CarRental' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalNowhereTravelDsl.g:822:2: ( () otherlv_1= 'CarRental' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalNowhereTravelDsl.g:822:2: ( () otherlv_1= 'CarRental' ( (lv_name_2_0= ruleEString ) ) )
            // InternalNowhereTravelDsl.g:823:3: () otherlv_1= 'CarRental' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalNowhereTravelDsl.g:823:3: ()
            // InternalNowhereTravelDsl.g:824:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCarRentalAccess().getCarRentalAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getCarRentalAccess().getCarRentalKeyword_1());
            		
            // InternalNowhereTravelDsl.g:834:3: ( (lv_name_2_0= ruleEString ) )
            // InternalNowhereTravelDsl.g:835:4: (lv_name_2_0= ruleEString )
            {
            // InternalNowhereTravelDsl.g:835:4: (lv_name_2_0= ruleEString )
            // InternalNowhereTravelDsl.g:836:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCarRentalAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCarRentalRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"dk.itu.mdd.nowheretravel.dsl.NowhereTravelDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleCarRental"


    // $ANTLR start "entryRuleInsurance"
    // InternalNowhereTravelDsl.g:857:1: entryRuleInsurance returns [EObject current=null] : iv_ruleInsurance= ruleInsurance EOF ;
    public final EObject entryRuleInsurance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsurance = null;


        try {
            // InternalNowhereTravelDsl.g:857:50: (iv_ruleInsurance= ruleInsurance EOF )
            // InternalNowhereTravelDsl.g:858:2: iv_ruleInsurance= ruleInsurance EOF
            {
             newCompositeNode(grammarAccess.getInsuranceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInsurance=ruleInsurance();

            state._fsp--;

             current =iv_ruleInsurance; 
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
    // $ANTLR end "entryRuleInsurance"


    // $ANTLR start "ruleInsurance"
    // InternalNowhereTravelDsl.g:864:1: ruleInsurance returns [EObject current=null] : ( () otherlv_1= 'Insurance' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'type' ( (lv_type_4_0= ruleInsuranceType ) ) )? ) ;
    public final EObject ruleInsurance() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_type_4_0 = null;



        	enterRule();

        try {
            // InternalNowhereTravelDsl.g:870:2: ( ( () otherlv_1= 'Insurance' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'type' ( (lv_type_4_0= ruleInsuranceType ) ) )? ) )
            // InternalNowhereTravelDsl.g:871:2: ( () otherlv_1= 'Insurance' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'type' ( (lv_type_4_0= ruleInsuranceType ) ) )? )
            {
            // InternalNowhereTravelDsl.g:871:2: ( () otherlv_1= 'Insurance' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'type' ( (lv_type_4_0= ruleInsuranceType ) ) )? )
            // InternalNowhereTravelDsl.g:872:3: () otherlv_1= 'Insurance' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'type' ( (lv_type_4_0= ruleInsuranceType ) ) )?
            {
            // InternalNowhereTravelDsl.g:872:3: ()
            // InternalNowhereTravelDsl.g:873:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInsuranceAccess().getInsuranceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getInsuranceAccess().getInsuranceKeyword_1());
            		
            // InternalNowhereTravelDsl.g:883:3: ( (lv_name_2_0= ruleEString ) )
            // InternalNowhereTravelDsl.g:884:4: (lv_name_2_0= ruleEString )
            {
            // InternalNowhereTravelDsl.g:884:4: (lv_name_2_0= ruleEString )
            // InternalNowhereTravelDsl.g:885:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getInsuranceAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_12);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInsuranceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"dk.itu.mdd.nowheretravel.dsl.NowhereTravelDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalNowhereTravelDsl.g:902:3: (otherlv_3= 'type' ( (lv_type_4_0= ruleInsuranceType ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalNowhereTravelDsl.g:903:4: otherlv_3= 'type' ( (lv_type_4_0= ruleInsuranceType ) )
                    {
                    otherlv_3=(Token)match(input,24,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getInsuranceAccess().getTypeKeyword_3_0());
                    			
                    // InternalNowhereTravelDsl.g:907:4: ( (lv_type_4_0= ruleInsuranceType ) )
                    // InternalNowhereTravelDsl.g:908:5: (lv_type_4_0= ruleInsuranceType )
                    {
                    // InternalNowhereTravelDsl.g:908:5: (lv_type_4_0= ruleInsuranceType )
                    // InternalNowhereTravelDsl.g:909:6: lv_type_4_0= ruleInsuranceType
                    {

                    						newCompositeNode(grammarAccess.getInsuranceAccess().getTypeInsuranceTypeEnumRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_type_4_0=ruleInsuranceType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInsuranceRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_4_0,
                    							"dk.itu.mdd.nowheretravel.dsl.NowhereTravelDsl.InsuranceType");
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
    // $ANTLR end "ruleInsurance"


    // $ANTLR start "ruleInsuranceType"
    // InternalNowhereTravelDsl.g:931:1: ruleInsuranceType returns [Enumerator current=null] : ( (enumLiteral_0= 'CarInsurance' ) | (enumLiteral_1= 'TravelInsurance' ) ) ;
    public final Enumerator ruleInsuranceType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalNowhereTravelDsl.g:937:2: ( ( (enumLiteral_0= 'CarInsurance' ) | (enumLiteral_1= 'TravelInsurance' ) ) )
            // InternalNowhereTravelDsl.g:938:2: ( (enumLiteral_0= 'CarInsurance' ) | (enumLiteral_1= 'TravelInsurance' ) )
            {
            // InternalNowhereTravelDsl.g:938:2: ( (enumLiteral_0= 'CarInsurance' ) | (enumLiteral_1= 'TravelInsurance' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            else if ( (LA10_0==26) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalNowhereTravelDsl.g:939:3: (enumLiteral_0= 'CarInsurance' )
                    {
                    // InternalNowhereTravelDsl.g:939:3: (enumLiteral_0= 'CarInsurance' )
                    // InternalNowhereTravelDsl.g:940:4: enumLiteral_0= 'CarInsurance'
                    {
                    enumLiteral_0=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getInsuranceTypeAccess().getCarInsuranceEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getInsuranceTypeAccess().getCarInsuranceEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalNowhereTravelDsl.g:947:3: (enumLiteral_1= 'TravelInsurance' )
                    {
                    // InternalNowhereTravelDsl.g:947:3: (enumLiteral_1= 'TravelInsurance' )
                    // InternalNowhereTravelDsl.g:948:4: enumLiteral_1= 'TravelInsurance'
                    {
                    enumLiteral_1=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getInsuranceTypeAccess().getTravelInsuranceEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getInsuranceTypeAccess().getTravelInsuranceEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleInsuranceType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000F48000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000F49000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000006000000L});

}