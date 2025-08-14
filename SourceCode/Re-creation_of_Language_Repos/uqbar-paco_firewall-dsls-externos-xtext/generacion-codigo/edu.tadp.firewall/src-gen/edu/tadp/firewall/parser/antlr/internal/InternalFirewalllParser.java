package edu.tadp.firewall.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import edu.tadp.firewall.services.FirewalllGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFirewalllParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "':'", "'Si'", "'hay'", "'que'", "'!'", "'forwardear a '", "'aceptar'", "'bloquear'", "'el puerto es'", "'la ip es'", "'.'"
    };
    public static final int RULE_STRING=6;
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
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalFirewalllParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalFirewalllParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalFirewalllParser.tokenNames; }
    public String getGrammarFileName() { return "InternalFirewalll.g"; }



     	private FirewalllGrammarAccess grammarAccess;

        public InternalFirewalllParser(TokenStream input, FirewalllGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Firewall";
       	}

       	@Override
       	protected FirewalllGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleFirewall"
    // InternalFirewalll.g:64:1: entryRuleFirewall returns [EObject current=null] : iv_ruleFirewall= ruleFirewall EOF ;
    public final EObject entryRuleFirewall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFirewall = null;


        try {
            // InternalFirewalll.g:64:49: (iv_ruleFirewall= ruleFirewall EOF )
            // InternalFirewalll.g:65:2: iv_ruleFirewall= ruleFirewall EOF
            {
             newCompositeNode(grammarAccess.getFirewallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFirewall=ruleFirewall();

            state._fsp--;

             current =iv_ruleFirewall; 
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
    // $ANTLR end "entryRuleFirewall"


    // $ANTLR start "ruleFirewall"
    // InternalFirewalll.g:71:1: ruleFirewall returns [EObject current=null] : ( (lv_reglas_0_0= ruleReglaEtiquetada ) )* ;
    public final EObject ruleFirewall() throws RecognitionException {
        EObject current = null;

        EObject lv_reglas_0_0 = null;



        	enterRule();

        try {
            // InternalFirewalll.g:77:2: ( ( (lv_reglas_0_0= ruleReglaEtiquetada ) )* )
            // InternalFirewalll.g:78:2: ( (lv_reglas_0_0= ruleReglaEtiquetada ) )*
            {
            // InternalFirewalll.g:78:2: ( (lv_reglas_0_0= ruleReglaEtiquetada ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalFirewalll.g:79:3: (lv_reglas_0_0= ruleReglaEtiquetada )
            	    {
            	    // InternalFirewalll.g:79:3: (lv_reglas_0_0= ruleReglaEtiquetada )
            	    // InternalFirewalll.g:80:4: lv_reglas_0_0= ruleReglaEtiquetada
            	    {

            	    				newCompositeNode(grammarAccess.getFirewallAccess().getReglasReglaEtiquetadaParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_reglas_0_0=ruleReglaEtiquetada();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getFirewallRule());
            	    				}
            	    				add(
            	    					current,
            	    					"reglas",
            	    					lv_reglas_0_0,
            	    					"edu.tadp.firewall.Firewalll.ReglaEtiquetada");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleFirewall"


    // $ANTLR start "entryRuleReglaEtiquetada"
    // InternalFirewalll.g:100:1: entryRuleReglaEtiquetada returns [EObject current=null] : iv_ruleReglaEtiquetada= ruleReglaEtiquetada EOF ;
    public final EObject entryRuleReglaEtiquetada() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReglaEtiquetada = null;


        try {
            // InternalFirewalll.g:100:56: (iv_ruleReglaEtiquetada= ruleReglaEtiquetada EOF )
            // InternalFirewalll.g:101:2: iv_ruleReglaEtiquetada= ruleReglaEtiquetada EOF
            {
             newCompositeNode(grammarAccess.getReglaEtiquetadaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReglaEtiquetada=ruleReglaEtiquetada();

            state._fsp--;

             current =iv_ruleReglaEtiquetada; 
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
    // $ANTLR end "entryRuleReglaEtiquetada"


    // $ANTLR start "ruleReglaEtiquetada"
    // InternalFirewalll.g:107:1: ruleReglaEtiquetada returns [EObject current=null] : ( ( ( (lv_lan_0_0= RULE_ID ) ) otherlv_1= ':' )? ( (lv_regla_2_0= ruleRegla ) ) ) ;
    public final EObject ruleReglaEtiquetada() throws RecognitionException {
        EObject current = null;

        Token lv_lan_0_0=null;
        Token otherlv_1=null;
        EObject lv_regla_2_0 = null;



        	enterRule();

        try {
            // InternalFirewalll.g:113:2: ( ( ( ( (lv_lan_0_0= RULE_ID ) ) otherlv_1= ':' )? ( (lv_regla_2_0= ruleRegla ) ) ) )
            // InternalFirewalll.g:114:2: ( ( ( (lv_lan_0_0= RULE_ID ) ) otherlv_1= ':' )? ( (lv_regla_2_0= ruleRegla ) ) )
            {
            // InternalFirewalll.g:114:2: ( ( ( (lv_lan_0_0= RULE_ID ) ) otherlv_1= ':' )? ( (lv_regla_2_0= ruleRegla ) ) )
            // InternalFirewalll.g:115:3: ( ( (lv_lan_0_0= RULE_ID ) ) otherlv_1= ':' )? ( (lv_regla_2_0= ruleRegla ) )
            {
            // InternalFirewalll.g:115:3: ( ( (lv_lan_0_0= RULE_ID ) ) otherlv_1= ':' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalFirewalll.g:116:4: ( (lv_lan_0_0= RULE_ID ) ) otherlv_1= ':'
                    {
                    // InternalFirewalll.g:116:4: ( (lv_lan_0_0= RULE_ID ) )
                    // InternalFirewalll.g:117:5: (lv_lan_0_0= RULE_ID )
                    {
                    // InternalFirewalll.g:117:5: (lv_lan_0_0= RULE_ID )
                    // InternalFirewalll.g:118:6: lv_lan_0_0= RULE_ID
                    {
                    lv_lan_0_0=(Token)match(input,RULE_ID,FOLLOW_4); 

                    						newLeafNode(lv_lan_0_0, grammarAccess.getReglaEtiquetadaAccess().getLanIDTerminalRuleCall_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getReglaEtiquetadaRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"lan",
                    							lv_lan_0_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,11,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getReglaEtiquetadaAccess().getColonKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalFirewalll.g:139:3: ( (lv_regla_2_0= ruleRegla ) )
            // InternalFirewalll.g:140:4: (lv_regla_2_0= ruleRegla )
            {
            // InternalFirewalll.g:140:4: (lv_regla_2_0= ruleRegla )
            // InternalFirewalll.g:141:5: lv_regla_2_0= ruleRegla
            {

            					newCompositeNode(grammarAccess.getReglaEtiquetadaAccess().getReglaReglaParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_regla_2_0=ruleRegla();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReglaEtiquetadaRule());
            					}
            					set(
            						current,
            						"regla",
            						lv_regla_2_0,
            						"edu.tadp.firewall.Firewalll.Regla");
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
    // $ANTLR end "ruleReglaEtiquetada"


    // $ANTLR start "entryRuleRegla"
    // InternalFirewalll.g:162:1: entryRuleRegla returns [EObject current=null] : iv_ruleRegla= ruleRegla EOF ;
    public final EObject entryRuleRegla() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegla = null;


        try {
            // InternalFirewalll.g:162:46: (iv_ruleRegla= ruleRegla EOF )
            // InternalFirewalll.g:163:2: iv_ruleRegla= ruleRegla EOF
            {
             newCompositeNode(grammarAccess.getReglaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRegla=ruleRegla();

            state._fsp--;

             current =iv_ruleRegla; 
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
    // $ANTLR end "entryRuleRegla"


    // $ANTLR start "ruleRegla"
    // InternalFirewalll.g:169:1: ruleRegla returns [EObject current=null] : (otherlv_0= 'Si' ( (lv_condicion_1_0= ruleCondicion ) ) otherlv_2= 'hay' otherlv_3= 'que' ( (lv_accion_4_0= ruleAccion ) ) otherlv_5= '!' ) ;
    public final EObject ruleRegla() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_condicion_1_0 = null;

        EObject lv_accion_4_0 = null;



        	enterRule();

        try {
            // InternalFirewalll.g:175:2: ( (otherlv_0= 'Si' ( (lv_condicion_1_0= ruleCondicion ) ) otherlv_2= 'hay' otherlv_3= 'que' ( (lv_accion_4_0= ruleAccion ) ) otherlv_5= '!' ) )
            // InternalFirewalll.g:176:2: (otherlv_0= 'Si' ( (lv_condicion_1_0= ruleCondicion ) ) otherlv_2= 'hay' otherlv_3= 'que' ( (lv_accion_4_0= ruleAccion ) ) otherlv_5= '!' )
            {
            // InternalFirewalll.g:176:2: (otherlv_0= 'Si' ( (lv_condicion_1_0= ruleCondicion ) ) otherlv_2= 'hay' otherlv_3= 'que' ( (lv_accion_4_0= ruleAccion ) ) otherlv_5= '!' )
            // InternalFirewalll.g:177:3: otherlv_0= 'Si' ( (lv_condicion_1_0= ruleCondicion ) ) otherlv_2= 'hay' otherlv_3= 'que' ( (lv_accion_4_0= ruleAccion ) ) otherlv_5= '!'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getReglaAccess().getSiKeyword_0());
            		
            // InternalFirewalll.g:181:3: ( (lv_condicion_1_0= ruleCondicion ) )
            // InternalFirewalll.g:182:4: (lv_condicion_1_0= ruleCondicion )
            {
            // InternalFirewalll.g:182:4: (lv_condicion_1_0= ruleCondicion )
            // InternalFirewalll.g:183:5: lv_condicion_1_0= ruleCondicion
            {

            					newCompositeNode(grammarAccess.getReglaAccess().getCondicionCondicionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_condicion_1_0=ruleCondicion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReglaRule());
            					}
            					set(
            						current,
            						"condicion",
            						lv_condicion_1_0,
            						"edu.tadp.firewall.Firewalll.Condicion");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getReglaAccess().getHayKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getReglaAccess().getQueKeyword_3());
            		
            // InternalFirewalll.g:208:3: ( (lv_accion_4_0= ruleAccion ) )
            // InternalFirewalll.g:209:4: (lv_accion_4_0= ruleAccion )
            {
            // InternalFirewalll.g:209:4: (lv_accion_4_0= ruleAccion )
            // InternalFirewalll.g:210:5: lv_accion_4_0= ruleAccion
            {

            					newCompositeNode(grammarAccess.getReglaAccess().getAccionAccionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_10);
            lv_accion_4_0=ruleAccion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReglaRule());
            					}
            					set(
            						current,
            						"accion",
            						lv_accion_4_0,
            						"edu.tadp.firewall.Firewalll.Accion");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getReglaAccess().getExclamationMarkKeyword_5());
            		

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
    // $ANTLR end "ruleRegla"


    // $ANTLR start "entryRuleAccion"
    // InternalFirewalll.g:235:1: entryRuleAccion returns [EObject current=null] : iv_ruleAccion= ruleAccion EOF ;
    public final EObject entryRuleAccion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccion = null;


        try {
            // InternalFirewalll.g:235:47: (iv_ruleAccion= ruleAccion EOF )
            // InternalFirewalll.g:236:2: iv_ruleAccion= ruleAccion EOF
            {
             newCompositeNode(grammarAccess.getAccionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAccion=ruleAccion();

            state._fsp--;

             current =iv_ruleAccion; 
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
    // $ANTLR end "entryRuleAccion"


    // $ANTLR start "ruleAccion"
    // InternalFirewalll.g:242:1: ruleAccion returns [EObject current=null] : (this_AceptarAccion_0= ruleAceptarAccion | this_BloquearAccion_1= ruleBloquearAccion | this_ForwardearAccion_2= ruleForwardearAccion ) ;
    public final EObject ruleAccion() throws RecognitionException {
        EObject current = null;

        EObject this_AceptarAccion_0 = null;

        EObject this_BloquearAccion_1 = null;

        EObject this_ForwardearAccion_2 = null;



        	enterRule();

        try {
            // InternalFirewalll.g:248:2: ( (this_AceptarAccion_0= ruleAceptarAccion | this_BloquearAccion_1= ruleBloquearAccion | this_ForwardearAccion_2= ruleForwardearAccion ) )
            // InternalFirewalll.g:249:2: (this_AceptarAccion_0= ruleAceptarAccion | this_BloquearAccion_1= ruleBloquearAccion | this_ForwardearAccion_2= ruleForwardearAccion )
            {
            // InternalFirewalll.g:249:2: (this_AceptarAccion_0= ruleAceptarAccion | this_BloquearAccion_1= ruleBloquearAccion | this_ForwardearAccion_2= ruleForwardearAccion )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt3=1;
                }
                break;
            case 18:
                {
                alt3=2;
                }
                break;
            case 16:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalFirewalll.g:250:3: this_AceptarAccion_0= ruleAceptarAccion
                    {

                    			newCompositeNode(grammarAccess.getAccionAccess().getAceptarAccionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AceptarAccion_0=ruleAceptarAccion();

                    state._fsp--;


                    			current = this_AceptarAccion_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalFirewalll.g:259:3: this_BloquearAccion_1= ruleBloquearAccion
                    {

                    			newCompositeNode(grammarAccess.getAccionAccess().getBloquearAccionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_BloquearAccion_1=ruleBloquearAccion();

                    state._fsp--;


                    			current = this_BloquearAccion_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalFirewalll.g:268:3: this_ForwardearAccion_2= ruleForwardearAccion
                    {

                    			newCompositeNode(grammarAccess.getAccionAccess().getForwardearAccionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ForwardearAccion_2=ruleForwardearAccion();

                    state._fsp--;


                    			current = this_ForwardearAccion_2;
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
    // $ANTLR end "ruleAccion"


    // $ANTLR start "entryRuleForwardearAccion"
    // InternalFirewalll.g:280:1: entryRuleForwardearAccion returns [EObject current=null] : iv_ruleForwardearAccion= ruleForwardearAccion EOF ;
    public final EObject entryRuleForwardearAccion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForwardearAccion = null;


        try {
            // InternalFirewalll.g:280:57: (iv_ruleForwardearAccion= ruleForwardearAccion EOF )
            // InternalFirewalll.g:281:2: iv_ruleForwardearAccion= ruleForwardearAccion EOF
            {
             newCompositeNode(grammarAccess.getForwardearAccionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleForwardearAccion=ruleForwardearAccion();

            state._fsp--;

             current =iv_ruleForwardearAccion; 
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
    // $ANTLR end "entryRuleForwardearAccion"


    // $ANTLR start "ruleForwardearAccion"
    // InternalFirewalll.g:287:1: ruleForwardearAccion returns [EObject current=null] : ( () otherlv_1= 'forwardear a ' ( (lv_ip_2_0= ruleIP ) ) otherlv_3= ':' ( (lv_puerto_4_0= RULE_INT ) ) ) ;
    public final EObject ruleForwardearAccion() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_puerto_4_0=null;
        EObject lv_ip_2_0 = null;



        	enterRule();

        try {
            // InternalFirewalll.g:293:2: ( ( () otherlv_1= 'forwardear a ' ( (lv_ip_2_0= ruleIP ) ) otherlv_3= ':' ( (lv_puerto_4_0= RULE_INT ) ) ) )
            // InternalFirewalll.g:294:2: ( () otherlv_1= 'forwardear a ' ( (lv_ip_2_0= ruleIP ) ) otherlv_3= ':' ( (lv_puerto_4_0= RULE_INT ) ) )
            {
            // InternalFirewalll.g:294:2: ( () otherlv_1= 'forwardear a ' ( (lv_ip_2_0= ruleIP ) ) otherlv_3= ':' ( (lv_puerto_4_0= RULE_INT ) ) )
            // InternalFirewalll.g:295:3: () otherlv_1= 'forwardear a ' ( (lv_ip_2_0= ruleIP ) ) otherlv_3= ':' ( (lv_puerto_4_0= RULE_INT ) )
            {
            // InternalFirewalll.g:295:3: ()
            // InternalFirewalll.g:296:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getForwardearAccionAccess().getForwardearAccionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getForwardearAccionAccess().getForwardearAKeyword_1());
            		
            // InternalFirewalll.g:306:3: ( (lv_ip_2_0= ruleIP ) )
            // InternalFirewalll.g:307:4: (lv_ip_2_0= ruleIP )
            {
            // InternalFirewalll.g:307:4: (lv_ip_2_0= ruleIP )
            // InternalFirewalll.g:308:5: lv_ip_2_0= ruleIP
            {

            					newCompositeNode(grammarAccess.getForwardearAccionAccess().getIpIPParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_ip_2_0=ruleIP();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForwardearAccionRule());
            					}
            					set(
            						current,
            						"ip",
            						lv_ip_2_0,
            						"edu.tadp.firewall.Firewalll.IP");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,11,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getForwardearAccionAccess().getColonKeyword_3());
            		
            // InternalFirewalll.g:329:3: ( (lv_puerto_4_0= RULE_INT ) )
            // InternalFirewalll.g:330:4: (lv_puerto_4_0= RULE_INT )
            {
            // InternalFirewalll.g:330:4: (lv_puerto_4_0= RULE_INT )
            // InternalFirewalll.g:331:5: lv_puerto_4_0= RULE_INT
            {
            lv_puerto_4_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_puerto_4_0, grammarAccess.getForwardearAccionAccess().getPuertoINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForwardearAccionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"puerto",
            						lv_puerto_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleForwardearAccion"


    // $ANTLR start "entryRuleAceptarAccion"
    // InternalFirewalll.g:351:1: entryRuleAceptarAccion returns [EObject current=null] : iv_ruleAceptarAccion= ruleAceptarAccion EOF ;
    public final EObject entryRuleAceptarAccion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAceptarAccion = null;


        try {
            // InternalFirewalll.g:351:54: (iv_ruleAceptarAccion= ruleAceptarAccion EOF )
            // InternalFirewalll.g:352:2: iv_ruleAceptarAccion= ruleAceptarAccion EOF
            {
             newCompositeNode(grammarAccess.getAceptarAccionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAceptarAccion=ruleAceptarAccion();

            state._fsp--;

             current =iv_ruleAceptarAccion; 
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
    // $ANTLR end "entryRuleAceptarAccion"


    // $ANTLR start "ruleAceptarAccion"
    // InternalFirewalll.g:358:1: ruleAceptarAccion returns [EObject current=null] : ( () otherlv_1= 'aceptar' ) ;
    public final EObject ruleAceptarAccion() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalFirewalll.g:364:2: ( ( () otherlv_1= 'aceptar' ) )
            // InternalFirewalll.g:365:2: ( () otherlv_1= 'aceptar' )
            {
            // InternalFirewalll.g:365:2: ( () otherlv_1= 'aceptar' )
            // InternalFirewalll.g:366:3: () otherlv_1= 'aceptar'
            {
            // InternalFirewalll.g:366:3: ()
            // InternalFirewalll.g:367:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAceptarAccionAccess().getAceptarAccionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getAceptarAccionAccess().getAceptarKeyword_1());
            		

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
    // $ANTLR end "ruleAceptarAccion"


    // $ANTLR start "entryRuleBloquearAccion"
    // InternalFirewalll.g:381:1: entryRuleBloquearAccion returns [EObject current=null] : iv_ruleBloquearAccion= ruleBloquearAccion EOF ;
    public final EObject entryRuleBloquearAccion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBloquearAccion = null;


        try {
            // InternalFirewalll.g:381:55: (iv_ruleBloquearAccion= ruleBloquearAccion EOF )
            // InternalFirewalll.g:382:2: iv_ruleBloquearAccion= ruleBloquearAccion EOF
            {
             newCompositeNode(grammarAccess.getBloquearAccionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBloquearAccion=ruleBloquearAccion();

            state._fsp--;

             current =iv_ruleBloquearAccion; 
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
    // $ANTLR end "entryRuleBloquearAccion"


    // $ANTLR start "ruleBloquearAccion"
    // InternalFirewalll.g:388:1: ruleBloquearAccion returns [EObject current=null] : ( () otherlv_1= 'bloquear' ) ;
    public final EObject ruleBloquearAccion() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalFirewalll.g:394:2: ( ( () otherlv_1= 'bloquear' ) )
            // InternalFirewalll.g:395:2: ( () otherlv_1= 'bloquear' )
            {
            // InternalFirewalll.g:395:2: ( () otherlv_1= 'bloquear' )
            // InternalFirewalll.g:396:3: () otherlv_1= 'bloquear'
            {
            // InternalFirewalll.g:396:3: ()
            // InternalFirewalll.g:397:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBloquearAccionAccess().getBloquearAccionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getBloquearAccionAccess().getBloquearKeyword_1());
            		

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
    // $ANTLR end "ruleBloquearAccion"


    // $ANTLR start "entryRuleCondicion"
    // InternalFirewalll.g:411:1: entryRuleCondicion returns [EObject current=null] : iv_ruleCondicion= ruleCondicion EOF ;
    public final EObject entryRuleCondicion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondicion = null;


        try {
            // InternalFirewalll.g:411:50: (iv_ruleCondicion= ruleCondicion EOF )
            // InternalFirewalll.g:412:2: iv_ruleCondicion= ruleCondicion EOF
            {
             newCompositeNode(grammarAccess.getCondicionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondicion=ruleCondicion();

            state._fsp--;

             current =iv_ruleCondicion; 
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
    // $ANTLR end "entryRuleCondicion"


    // $ANTLR start "ruleCondicion"
    // InternalFirewalll.g:418:1: ruleCondicion returns [EObject current=null] : (this_CondicionPuerto_0= ruleCondicionPuerto | this_CondicionIP_1= ruleCondicionIP ) ;
    public final EObject ruleCondicion() throws RecognitionException {
        EObject current = null;

        EObject this_CondicionPuerto_0 = null;

        EObject this_CondicionIP_1 = null;



        	enterRule();

        try {
            // InternalFirewalll.g:424:2: ( (this_CondicionPuerto_0= ruleCondicionPuerto | this_CondicionIP_1= ruleCondicionIP ) )
            // InternalFirewalll.g:425:2: (this_CondicionPuerto_0= ruleCondicionPuerto | this_CondicionIP_1= ruleCondicionIP )
            {
            // InternalFirewalll.g:425:2: (this_CondicionPuerto_0= ruleCondicionPuerto | this_CondicionIP_1= ruleCondicionIP )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            else if ( (LA4_0==20) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalFirewalll.g:426:3: this_CondicionPuerto_0= ruleCondicionPuerto
                    {

                    			newCompositeNode(grammarAccess.getCondicionAccess().getCondicionPuertoParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_CondicionPuerto_0=ruleCondicionPuerto();

                    state._fsp--;


                    			current = this_CondicionPuerto_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalFirewalll.g:435:3: this_CondicionIP_1= ruleCondicionIP
                    {

                    			newCompositeNode(grammarAccess.getCondicionAccess().getCondicionIPParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CondicionIP_1=ruleCondicionIP();

                    state._fsp--;


                    			current = this_CondicionIP_1;
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
    // $ANTLR end "ruleCondicion"


    // $ANTLR start "entryRuleCondicionPuerto"
    // InternalFirewalll.g:447:1: entryRuleCondicionPuerto returns [EObject current=null] : iv_ruleCondicionPuerto= ruleCondicionPuerto EOF ;
    public final EObject entryRuleCondicionPuerto() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondicionPuerto = null;


        try {
            // InternalFirewalll.g:447:56: (iv_ruleCondicionPuerto= ruleCondicionPuerto EOF )
            // InternalFirewalll.g:448:2: iv_ruleCondicionPuerto= ruleCondicionPuerto EOF
            {
             newCompositeNode(grammarAccess.getCondicionPuertoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondicionPuerto=ruleCondicionPuerto();

            state._fsp--;

             current =iv_ruleCondicionPuerto; 
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
    // $ANTLR end "entryRuleCondicionPuerto"


    // $ANTLR start "ruleCondicionPuerto"
    // InternalFirewalll.g:454:1: ruleCondicionPuerto returns [EObject current=null] : (otherlv_0= 'el puerto es' ( (lv_puerto_1_0= RULE_INT ) ) ) ;
    public final EObject ruleCondicionPuerto() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_puerto_1_0=null;


        	enterRule();

        try {
            // InternalFirewalll.g:460:2: ( (otherlv_0= 'el puerto es' ( (lv_puerto_1_0= RULE_INT ) ) ) )
            // InternalFirewalll.g:461:2: (otherlv_0= 'el puerto es' ( (lv_puerto_1_0= RULE_INT ) ) )
            {
            // InternalFirewalll.g:461:2: (otherlv_0= 'el puerto es' ( (lv_puerto_1_0= RULE_INT ) ) )
            // InternalFirewalll.g:462:3: otherlv_0= 'el puerto es' ( (lv_puerto_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getCondicionPuertoAccess().getElPuertoEsKeyword_0());
            		
            // InternalFirewalll.g:466:3: ( (lv_puerto_1_0= RULE_INT ) )
            // InternalFirewalll.g:467:4: (lv_puerto_1_0= RULE_INT )
            {
            // InternalFirewalll.g:467:4: (lv_puerto_1_0= RULE_INT )
            // InternalFirewalll.g:468:5: lv_puerto_1_0= RULE_INT
            {
            lv_puerto_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_puerto_1_0, grammarAccess.getCondicionPuertoAccess().getPuertoINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCondicionPuertoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"puerto",
            						lv_puerto_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleCondicionPuerto"


    // $ANTLR start "entryRuleCondicionIP"
    // InternalFirewalll.g:488:1: entryRuleCondicionIP returns [EObject current=null] : iv_ruleCondicionIP= ruleCondicionIP EOF ;
    public final EObject entryRuleCondicionIP() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondicionIP = null;


        try {
            // InternalFirewalll.g:488:52: (iv_ruleCondicionIP= ruleCondicionIP EOF )
            // InternalFirewalll.g:489:2: iv_ruleCondicionIP= ruleCondicionIP EOF
            {
             newCompositeNode(grammarAccess.getCondicionIPRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondicionIP=ruleCondicionIP();

            state._fsp--;

             current =iv_ruleCondicionIP; 
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
    // $ANTLR end "entryRuleCondicionIP"


    // $ANTLR start "ruleCondicionIP"
    // InternalFirewalll.g:495:1: ruleCondicionIP returns [EObject current=null] : (otherlv_0= 'la ip es' ( (lv_ip_1_0= ruleIP ) ) ) ;
    public final EObject ruleCondicionIP() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_ip_1_0 = null;



        	enterRule();

        try {
            // InternalFirewalll.g:501:2: ( (otherlv_0= 'la ip es' ( (lv_ip_1_0= ruleIP ) ) ) )
            // InternalFirewalll.g:502:2: (otherlv_0= 'la ip es' ( (lv_ip_1_0= ruleIP ) ) )
            {
            // InternalFirewalll.g:502:2: (otherlv_0= 'la ip es' ( (lv_ip_1_0= ruleIP ) ) )
            // InternalFirewalll.g:503:3: otherlv_0= 'la ip es' ( (lv_ip_1_0= ruleIP ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getCondicionIPAccess().getLaIpEsKeyword_0());
            		
            // InternalFirewalll.g:507:3: ( (lv_ip_1_0= ruleIP ) )
            // InternalFirewalll.g:508:4: (lv_ip_1_0= ruleIP )
            {
            // InternalFirewalll.g:508:4: (lv_ip_1_0= ruleIP )
            // InternalFirewalll.g:509:5: lv_ip_1_0= ruleIP
            {

            					newCompositeNode(grammarAccess.getCondicionIPAccess().getIpIPParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_ip_1_0=ruleIP();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCondicionIPRule());
            					}
            					set(
            						current,
            						"ip",
            						lv_ip_1_0,
            						"edu.tadp.firewall.Firewalll.IP");
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
    // $ANTLR end "ruleCondicionIP"


    // $ANTLR start "entryRuleIP"
    // InternalFirewalll.g:530:1: entryRuleIP returns [EObject current=null] : iv_ruleIP= ruleIP EOF ;
    public final EObject entryRuleIP() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIP = null;


        try {
            // InternalFirewalll.g:530:43: (iv_ruleIP= ruleIP EOF )
            // InternalFirewalll.g:531:2: iv_ruleIP= ruleIP EOF
            {
             newCompositeNode(grammarAccess.getIPRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIP=ruleIP();

            state._fsp--;

             current =iv_ruleIP; 
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
    // $ANTLR end "entryRuleIP"


    // $ANTLR start "ruleIP"
    // InternalFirewalll.g:537:1: ruleIP returns [EObject current=null] : ( ( (lv_primero_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_segundo_2_0= RULE_INT ) ) otherlv_3= '.' ( (lv_tercero_4_0= RULE_INT ) ) otherlv_5= '.' ( (lv_cuarto_6_0= RULE_INT ) ) ) ;
    public final EObject ruleIP() throws RecognitionException {
        EObject current = null;

        Token lv_primero_0_0=null;
        Token otherlv_1=null;
        Token lv_segundo_2_0=null;
        Token otherlv_3=null;
        Token lv_tercero_4_0=null;
        Token otherlv_5=null;
        Token lv_cuarto_6_0=null;


        	enterRule();

        try {
            // InternalFirewalll.g:543:2: ( ( ( (lv_primero_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_segundo_2_0= RULE_INT ) ) otherlv_3= '.' ( (lv_tercero_4_0= RULE_INT ) ) otherlv_5= '.' ( (lv_cuarto_6_0= RULE_INT ) ) ) )
            // InternalFirewalll.g:544:2: ( ( (lv_primero_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_segundo_2_0= RULE_INT ) ) otherlv_3= '.' ( (lv_tercero_4_0= RULE_INT ) ) otherlv_5= '.' ( (lv_cuarto_6_0= RULE_INT ) ) )
            {
            // InternalFirewalll.g:544:2: ( ( (lv_primero_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_segundo_2_0= RULE_INT ) ) otherlv_3= '.' ( (lv_tercero_4_0= RULE_INT ) ) otherlv_5= '.' ( (lv_cuarto_6_0= RULE_INT ) ) )
            // InternalFirewalll.g:545:3: ( (lv_primero_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_segundo_2_0= RULE_INT ) ) otherlv_3= '.' ( (lv_tercero_4_0= RULE_INT ) ) otherlv_5= '.' ( (lv_cuarto_6_0= RULE_INT ) )
            {
            // InternalFirewalll.g:545:3: ( (lv_primero_0_0= RULE_INT ) )
            // InternalFirewalll.g:546:4: (lv_primero_0_0= RULE_INT )
            {
            // InternalFirewalll.g:546:4: (lv_primero_0_0= RULE_INT )
            // InternalFirewalll.g:547:5: lv_primero_0_0= RULE_INT
            {
            lv_primero_0_0=(Token)match(input,RULE_INT,FOLLOW_12); 

            					newLeafNode(lv_primero_0_0, grammarAccess.getIPAccess().getPrimeroINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIPRule());
            					}
            					setWithLastConsumed(
            						current,
            						"primero",
            						lv_primero_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getIPAccess().getFullStopKeyword_1());
            		
            // InternalFirewalll.g:567:3: ( (lv_segundo_2_0= RULE_INT ) )
            // InternalFirewalll.g:568:4: (lv_segundo_2_0= RULE_INT )
            {
            // InternalFirewalll.g:568:4: (lv_segundo_2_0= RULE_INT )
            // InternalFirewalll.g:569:5: lv_segundo_2_0= RULE_INT
            {
            lv_segundo_2_0=(Token)match(input,RULE_INT,FOLLOW_12); 

            					newLeafNode(lv_segundo_2_0, grammarAccess.getIPAccess().getSegundoINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIPRule());
            					}
            					setWithLastConsumed(
            						current,
            						"segundo",
            						lv_segundo_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getIPAccess().getFullStopKeyword_3());
            		
            // InternalFirewalll.g:589:3: ( (lv_tercero_4_0= RULE_INT ) )
            // InternalFirewalll.g:590:4: (lv_tercero_4_0= RULE_INT )
            {
            // InternalFirewalll.g:590:4: (lv_tercero_4_0= RULE_INT )
            // InternalFirewalll.g:591:5: lv_tercero_4_0= RULE_INT
            {
            lv_tercero_4_0=(Token)match(input,RULE_INT,FOLLOW_12); 

            					newLeafNode(lv_tercero_4_0, grammarAccess.getIPAccess().getTerceroINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIPRule());
            					}
            					setWithLastConsumed(
            						current,
            						"tercero",
            						lv_tercero_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,21,FOLLOW_11); 

            			newLeafNode(otherlv_5, grammarAccess.getIPAccess().getFullStopKeyword_5());
            		
            // InternalFirewalll.g:611:3: ( (lv_cuarto_6_0= RULE_INT ) )
            // InternalFirewalll.g:612:4: (lv_cuarto_6_0= RULE_INT )
            {
            // InternalFirewalll.g:612:4: (lv_cuarto_6_0= RULE_INT )
            // InternalFirewalll.g:613:5: lv_cuarto_6_0= RULE_INT
            {
            lv_cuarto_6_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_cuarto_6_0, grammarAccess.getIPAccess().getCuartoINTTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIPRule());
            					}
            					setWithLastConsumed(
            						current,
            						"cuarto",
            						lv_cuarto_6_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleIP"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});

}