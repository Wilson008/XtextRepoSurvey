package es.udima.tfm.cesarlaso.parser.antlr.internal;

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
import es.udima.tfm.cesarlaso.services.IotDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalIotDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'IotProyect'", "'{'", "'product_code'", "'version'", "'devices'", "','", "'}'", "'servers'", "'-'", "'program'", "'gpio_aliases'", "'remote_identifiers'", "'files'", "'start_state'", "'states'", "'state'", "'network_connected'", "'network_disconnected'", "'server_connected'", "'server_disconnected'", "'timer'", "'now'", "'repeat_every'", "'clock'", "'cron'", "'interrupted'", "'button'", "'mode'", "'min_duration'", "'button_acumulator'", "'count'", "'button_released'", "'pulse_input'", "'width'", "'space_width'", "'analog_read'", "'every'", "'loops'", "'analog_read_on_high'", "'value_higher_than'", "'analog_read_on_low'", "'value_lower_than'", "'h'", "'m'", "'s'", "'file_path'", "'with_path'", "'remote_event'", "'remote_actuator'", "'system_command'", "'download'", "'to'", "'play_sound'", "'with_volume'", "'background_image'", "'draw_image'", "'x'", "'y'", "'z'", "'color'", "'resize'", "'play_video'", "'change_state'", "'gpio_input_digital'", "'connected_to_pin'", "'gpio_output_digital'", "'gpio_input_analog'", "'gpio_output_analog'", "'remote_event_identifier'", "'remote_actuator_identifier'", "'sequential'", "'change'", "'duration'", "'pulse'", "'times'", "'ms'", "'blink'", "'interval'", "'blink_timer'", "'during'", "'pwm'", "'value'", "'pwm_transform'", "'ssid'", "'with_password'", "'simulator'", "'raspberry'", "'beaglebone'", "'esp8266'", "'java_server'", "'network_interface_address'", "'network_interface_port'", "'Millisecond'", "'Second'", "'Minute'", "'Hour'", "'none'", "'auto'", "'fill'", "'pull_up'", "'pull_down'", "'rising'", "'falling'", "'changes'", "'low'", "'high'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int RULE_INT=6;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
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
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__99=99;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int T__115=115;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__114=114;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__116=116;
    public static final int T__80=80;
    public static final int T__111=111;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__113=113;
    public static final int T__83=83;
    public static final int T__112=112;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int T__109=109;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

    // delegates
    // delegators


        public InternalIotDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalIotDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalIotDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalIotDsl.g"; }



     	private IotDslGrammarAccess grammarAccess;

        public InternalIotDslParser(TokenStream input, IotDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "IotProyect";
       	}

       	@Override
       	protected IotDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleIotProyect"
    // InternalIotDsl.g:65:1: entryRuleIotProyect returns [EObject current=null] : iv_ruleIotProyect= ruleIotProyect EOF ;
    public final EObject entryRuleIotProyect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIotProyect = null;


        try {
            // InternalIotDsl.g:65:51: (iv_ruleIotProyect= ruleIotProyect EOF )
            // InternalIotDsl.g:66:2: iv_ruleIotProyect= ruleIotProyect EOF
            {
             newCompositeNode(grammarAccess.getIotProyectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIotProyect=ruleIotProyect();

            state._fsp--;

             current =iv_ruleIotProyect; 
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
    // $ANTLR end "entryRuleIotProyect"


    // $ANTLR start "ruleIotProyect"
    // InternalIotDsl.g:72:1: ruleIotProyect returns [EObject current=null] : (otherlv_0= 'IotProyect' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'product_code' ( (lv_productCode_4_0= ruleEInt ) ) otherlv_5= 'version' ( (lv_version_6_0= ruleEInt ) ) otherlv_7= 'devices' otherlv_8= '{' ( (lv_deploymentDevice_9_0= ruleDevice ) ) (otherlv_10= ',' ( (lv_deploymentDevice_11_0= ruleDevice ) ) )* otherlv_12= '}' otherlv_13= 'servers' otherlv_14= '{' ( (lv_server_15_0= ruleServer ) ) (otherlv_16= ',' ( (lv_server_17_0= ruleServer ) ) )* otherlv_18= '}' ( (lv_program_19_0= ruleProgram ) ) otherlv_20= '}' ) ;
    public final EObject ruleIotProyect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_productCode_4_0 = null;

        AntlrDatatypeRuleToken lv_version_6_0 = null;

        EObject lv_deploymentDevice_9_0 = null;

        EObject lv_deploymentDevice_11_0 = null;

        EObject lv_server_15_0 = null;

        EObject lv_server_17_0 = null;

        EObject lv_program_19_0 = null;



        	enterRule();

        try {
            // InternalIotDsl.g:78:2: ( (otherlv_0= 'IotProyect' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'product_code' ( (lv_productCode_4_0= ruleEInt ) ) otherlv_5= 'version' ( (lv_version_6_0= ruleEInt ) ) otherlv_7= 'devices' otherlv_8= '{' ( (lv_deploymentDevice_9_0= ruleDevice ) ) (otherlv_10= ',' ( (lv_deploymentDevice_11_0= ruleDevice ) ) )* otherlv_12= '}' otherlv_13= 'servers' otherlv_14= '{' ( (lv_server_15_0= ruleServer ) ) (otherlv_16= ',' ( (lv_server_17_0= ruleServer ) ) )* otherlv_18= '}' ( (lv_program_19_0= ruleProgram ) ) otherlv_20= '}' ) )
            // InternalIotDsl.g:79:2: (otherlv_0= 'IotProyect' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'product_code' ( (lv_productCode_4_0= ruleEInt ) ) otherlv_5= 'version' ( (lv_version_6_0= ruleEInt ) ) otherlv_7= 'devices' otherlv_8= '{' ( (lv_deploymentDevice_9_0= ruleDevice ) ) (otherlv_10= ',' ( (lv_deploymentDevice_11_0= ruleDevice ) ) )* otherlv_12= '}' otherlv_13= 'servers' otherlv_14= '{' ( (lv_server_15_0= ruleServer ) ) (otherlv_16= ',' ( (lv_server_17_0= ruleServer ) ) )* otherlv_18= '}' ( (lv_program_19_0= ruleProgram ) ) otherlv_20= '}' )
            {
            // InternalIotDsl.g:79:2: (otherlv_0= 'IotProyect' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'product_code' ( (lv_productCode_4_0= ruleEInt ) ) otherlv_5= 'version' ( (lv_version_6_0= ruleEInt ) ) otherlv_7= 'devices' otherlv_8= '{' ( (lv_deploymentDevice_9_0= ruleDevice ) ) (otherlv_10= ',' ( (lv_deploymentDevice_11_0= ruleDevice ) ) )* otherlv_12= '}' otherlv_13= 'servers' otherlv_14= '{' ( (lv_server_15_0= ruleServer ) ) (otherlv_16= ',' ( (lv_server_17_0= ruleServer ) ) )* otherlv_18= '}' ( (lv_program_19_0= ruleProgram ) ) otherlv_20= '}' )
            // InternalIotDsl.g:80:3: otherlv_0= 'IotProyect' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'product_code' ( (lv_productCode_4_0= ruleEInt ) ) otherlv_5= 'version' ( (lv_version_6_0= ruleEInt ) ) otherlv_7= 'devices' otherlv_8= '{' ( (lv_deploymentDevice_9_0= ruleDevice ) ) (otherlv_10= ',' ( (lv_deploymentDevice_11_0= ruleDevice ) ) )* otherlv_12= '}' otherlv_13= 'servers' otherlv_14= '{' ( (lv_server_15_0= ruleServer ) ) (otherlv_16= ',' ( (lv_server_17_0= ruleServer ) ) )* otherlv_18= '}' ( (lv_program_19_0= ruleProgram ) ) otherlv_20= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getIotProyectAccess().getIotProyectKeyword_0());
            		
            // InternalIotDsl.g:84:3: ( (lv_name_1_0= ruleEString ) )
            // InternalIotDsl.g:85:4: (lv_name_1_0= ruleEString )
            {
            // InternalIotDsl.g:85:4: (lv_name_1_0= ruleEString )
            // InternalIotDsl.g:86:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getIotProyectAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIotProyectRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"es.udima.tfm.cesarlaso.IotDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getIotProyectAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getIotProyectAccess().getProduct_codeKeyword_3());
            		
            // InternalIotDsl.g:111:3: ( (lv_productCode_4_0= ruleEInt ) )
            // InternalIotDsl.g:112:4: (lv_productCode_4_0= ruleEInt )
            {
            // InternalIotDsl.g:112:4: (lv_productCode_4_0= ruleEInt )
            // InternalIotDsl.g:113:5: lv_productCode_4_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getIotProyectAccess().getProductCodeEIntParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_productCode_4_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIotProyectRule());
            					}
            					set(
            						current,
            						"productCode",
            						lv_productCode_4_0,
            						"es.udima.tfm.cesarlaso.IotDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getIotProyectAccess().getVersionKeyword_5());
            		
            // InternalIotDsl.g:134:3: ( (lv_version_6_0= ruleEInt ) )
            // InternalIotDsl.g:135:4: (lv_version_6_0= ruleEInt )
            {
            // InternalIotDsl.g:135:4: (lv_version_6_0= ruleEInt )
            // InternalIotDsl.g:136:5: lv_version_6_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getIotProyectAccess().getVersionEIntParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_8);
            lv_version_6_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIotProyectRule());
            					}
            					set(
            						current,
            						"version",
            						lv_version_6_0,
            						"es.udima.tfm.cesarlaso.IotDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_7, grammarAccess.getIotProyectAccess().getDevicesKeyword_7());
            		
            otherlv_8=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_8, grammarAccess.getIotProyectAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalIotDsl.g:161:3: ( (lv_deploymentDevice_9_0= ruleDevice ) )
            // InternalIotDsl.g:162:4: (lv_deploymentDevice_9_0= ruleDevice )
            {
            // InternalIotDsl.g:162:4: (lv_deploymentDevice_9_0= ruleDevice )
            // InternalIotDsl.g:163:5: lv_deploymentDevice_9_0= ruleDevice
            {

            					newCompositeNode(grammarAccess.getIotProyectAccess().getDeploymentDeviceDeviceParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_10);
            lv_deploymentDevice_9_0=ruleDevice();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIotProyectRule());
            					}
            					add(
            						current,
            						"deploymentDevice",
            						lv_deploymentDevice_9_0,
            						"es.udima.tfm.cesarlaso.IotDsl.Device");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalIotDsl.g:180:3: (otherlv_10= ',' ( (lv_deploymentDevice_11_0= ruleDevice ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalIotDsl.g:181:4: otherlv_10= ',' ( (lv_deploymentDevice_11_0= ruleDevice ) )
            	    {
            	    otherlv_10=(Token)match(input,16,FOLLOW_9); 

            	    				newLeafNode(otherlv_10, grammarAccess.getIotProyectAccess().getCommaKeyword_10_0());
            	    			
            	    // InternalIotDsl.g:185:4: ( (lv_deploymentDevice_11_0= ruleDevice ) )
            	    // InternalIotDsl.g:186:5: (lv_deploymentDevice_11_0= ruleDevice )
            	    {
            	    // InternalIotDsl.g:186:5: (lv_deploymentDevice_11_0= ruleDevice )
            	    // InternalIotDsl.g:187:6: lv_deploymentDevice_11_0= ruleDevice
            	    {

            	    						newCompositeNode(grammarAccess.getIotProyectAccess().getDeploymentDeviceDeviceParserRuleCall_10_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_deploymentDevice_11_0=ruleDevice();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getIotProyectRule());
            	    						}
            	    						add(
            	    							current,
            	    							"deploymentDevice",
            	    							lv_deploymentDevice_11_0,
            	    							"es.udima.tfm.cesarlaso.IotDsl.Device");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_12=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_12, grammarAccess.getIotProyectAccess().getRightCurlyBracketKeyword_11());
            		
            otherlv_13=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_13, grammarAccess.getIotProyectAccess().getServersKeyword_12());
            		
            otherlv_14=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_14, grammarAccess.getIotProyectAccess().getLeftCurlyBracketKeyword_13());
            		
            // InternalIotDsl.g:217:3: ( (lv_server_15_0= ruleServer ) )
            // InternalIotDsl.g:218:4: (lv_server_15_0= ruleServer )
            {
            // InternalIotDsl.g:218:4: (lv_server_15_0= ruleServer )
            // InternalIotDsl.g:219:5: lv_server_15_0= ruleServer
            {

            					newCompositeNode(grammarAccess.getIotProyectAccess().getServerServerParserRuleCall_14_0());
            				
            pushFollow(FOLLOW_10);
            lv_server_15_0=ruleServer();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIotProyectRule());
            					}
            					add(
            						current,
            						"server",
            						lv_server_15_0,
            						"es.udima.tfm.cesarlaso.IotDsl.Server");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalIotDsl.g:236:3: (otherlv_16= ',' ( (lv_server_17_0= ruleServer ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalIotDsl.g:237:4: otherlv_16= ',' ( (lv_server_17_0= ruleServer ) )
            	    {
            	    otherlv_16=(Token)match(input,16,FOLLOW_12); 

            	    				newLeafNode(otherlv_16, grammarAccess.getIotProyectAccess().getCommaKeyword_15_0());
            	    			
            	    // InternalIotDsl.g:241:4: ( (lv_server_17_0= ruleServer ) )
            	    // InternalIotDsl.g:242:5: (lv_server_17_0= ruleServer )
            	    {
            	    // InternalIotDsl.g:242:5: (lv_server_17_0= ruleServer )
            	    // InternalIotDsl.g:243:6: lv_server_17_0= ruleServer
            	    {

            	    						newCompositeNode(grammarAccess.getIotProyectAccess().getServerServerParserRuleCall_15_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_server_17_0=ruleServer();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getIotProyectRule());
            	    						}
            	    						add(
            	    							current,
            	    							"server",
            	    							lv_server_17_0,
            	    							"es.udima.tfm.cesarlaso.IotDsl.Server");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_18=(Token)match(input,17,FOLLOW_13); 

            			newLeafNode(otherlv_18, grammarAccess.getIotProyectAccess().getRightCurlyBracketKeyword_16());
            		
            // InternalIotDsl.g:265:3: ( (lv_program_19_0= ruleProgram ) )
            // InternalIotDsl.g:266:4: (lv_program_19_0= ruleProgram )
            {
            // InternalIotDsl.g:266:4: (lv_program_19_0= ruleProgram )
            // InternalIotDsl.g:267:5: lv_program_19_0= ruleProgram
            {

            					newCompositeNode(grammarAccess.getIotProyectAccess().getProgramProgramParserRuleCall_17_0());
            				
            pushFollow(FOLLOW_14);
            lv_program_19_0=ruleProgram();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIotProyectRule());
            					}
            					set(
            						current,
            						"program",
            						lv_program_19_0,
            						"es.udima.tfm.cesarlaso.IotDsl.Program");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_20=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_20, grammarAccess.getIotProyectAccess().getRightCurlyBracketKeyword_18());
            		

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
    // $ANTLR end "ruleIotProyect"


    // $ANTLR start "entryRuleDevice"
    // InternalIotDsl.g:292:1: entryRuleDevice returns [EObject current=null] : iv_ruleDevice= ruleDevice EOF ;
    public final EObject entryRuleDevice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDevice = null;


        try {
            // InternalIotDsl.g:292:47: (iv_ruleDevice= ruleDevice EOF )
            // InternalIotDsl.g:293:2: iv_ruleDevice= ruleDevice EOF
            {
             newCompositeNode(grammarAccess.getDeviceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDevice=ruleDevice();

            state._fsp--;

             current =iv_ruleDevice; 
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
    // $ANTLR end "entryRuleDevice"


    // $ANTLR start "ruleDevice"
    // InternalIotDsl.g:299:1: ruleDevice returns [EObject current=null] : (this_Simulator_0= ruleSimulator | this_Raspberry_1= ruleRaspberry | this_Beaglebone_2= ruleBeaglebone | this_ESP8266_3= ruleESP8266 ) ;
    public final EObject ruleDevice() throws RecognitionException {
        EObject current = null;

        EObject this_Simulator_0 = null;

        EObject this_Raspberry_1 = null;

        EObject this_Beaglebone_2 = null;

        EObject this_ESP8266_3 = null;



        	enterRule();

        try {
            // InternalIotDsl.g:305:2: ( (this_Simulator_0= ruleSimulator | this_Raspberry_1= ruleRaspberry | this_Beaglebone_2= ruleBeaglebone | this_ESP8266_3= ruleESP8266 ) )
            // InternalIotDsl.g:306:2: (this_Simulator_0= ruleSimulator | this_Raspberry_1= ruleRaspberry | this_Beaglebone_2= ruleBeaglebone | this_ESP8266_3= ruleESP8266 )
            {
            // InternalIotDsl.g:306:2: (this_Simulator_0= ruleSimulator | this_Raspberry_1= ruleRaspberry | this_Beaglebone_2= ruleBeaglebone | this_ESP8266_3= ruleESP8266 )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 96:
                {
                alt3=1;
                }
                break;
            case 97:
                {
                alt3=2;
                }
                break;
            case 98:
                {
                alt3=3;
                }
                break;
            case 99:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalIotDsl.g:307:3: this_Simulator_0= ruleSimulator
                    {

                    			newCompositeNode(grammarAccess.getDeviceAccess().getSimulatorParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Simulator_0=ruleSimulator();

                    state._fsp--;


                    			current = this_Simulator_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalIotDsl.g:316:3: this_Raspberry_1= ruleRaspberry
                    {

                    			newCompositeNode(grammarAccess.getDeviceAccess().getRaspberryParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Raspberry_1=ruleRaspberry();

                    state._fsp--;


                    			current = this_Raspberry_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalIotDsl.g:325:3: this_Beaglebone_2= ruleBeaglebone
                    {

                    			newCompositeNode(grammarAccess.getDeviceAccess().getBeagleboneParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Beaglebone_2=ruleBeaglebone();

                    state._fsp--;


                    			current = this_Beaglebone_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalIotDsl.g:334:3: this_ESP8266_3= ruleESP8266
                    {

                    			newCompositeNode(grammarAccess.getDeviceAccess().getESP8266ParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ESP8266_3=ruleESP8266();

                    state._fsp--;


                    			current = this_ESP8266_3;
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
    // $ANTLR end "ruleDevice"


    // $ANTLR start "entryRuleServer"
    // InternalIotDsl.g:346:1: entryRuleServer returns [EObject current=null] : iv_ruleServer= ruleServer EOF ;
    public final EObject entryRuleServer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServer = null;


        try {
            // InternalIotDsl.g:346:47: (iv_ruleServer= ruleServer EOF )
            // InternalIotDsl.g:347:2: iv_ruleServer= ruleServer EOF
            {
             newCompositeNode(grammarAccess.getServerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleServer=ruleServer();

            state._fsp--;

             current =iv_ruleServer; 
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
    // $ANTLR end "entryRuleServer"


    // $ANTLR start "ruleServer"
    // InternalIotDsl.g:353:1: ruleServer returns [EObject current=null] : this_JavaServer_0= ruleJavaServer ;
    public final EObject ruleServer() throws RecognitionException {
        EObject current = null;

        EObject this_JavaServer_0 = null;



        	enterRule();

        try {
            // InternalIotDsl.g:359:2: (this_JavaServer_0= ruleJavaServer )
            // InternalIotDsl.g:360:2: this_JavaServer_0= ruleJavaServer
            {

            		newCompositeNode(grammarAccess.getServerAccess().getJavaServerParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_JavaServer_0=ruleJavaServer();

            state._fsp--;


            		current = this_JavaServer_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleServer"


    // $ANTLR start "entryRulePin"
    // InternalIotDsl.g:371:1: entryRulePin returns [EObject current=null] : iv_rulePin= rulePin EOF ;
    public final EObject entryRulePin() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePin = null;


        try {
            // InternalIotDsl.g:371:44: (iv_rulePin= rulePin EOF )
            // InternalIotDsl.g:372:2: iv_rulePin= rulePin EOF
            {
             newCompositeNode(grammarAccess.getPinRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePin=rulePin();

            state._fsp--;

             current =iv_rulePin; 
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
    // $ANTLR end "entryRulePin"


    // $ANTLR start "rulePin"
    // InternalIotDsl.g:378:1: rulePin returns [EObject current=null] : (this_DigitalInputPin_0= ruleDigitalInputPin | this_DigitalOutputPin_1= ruleDigitalOutputPin | this_AnalogInputPin_2= ruleAnalogInputPin | this_AnalogOutputPin_3= ruleAnalogOutputPin ) ;
    public final EObject rulePin() throws RecognitionException {
        EObject current = null;

        EObject this_DigitalInputPin_0 = null;

        EObject this_DigitalOutputPin_1 = null;

        EObject this_AnalogInputPin_2 = null;

        EObject this_AnalogOutputPin_3 = null;



        	enterRule();

        try {
            // InternalIotDsl.g:384:2: ( (this_DigitalInputPin_0= ruleDigitalInputPin | this_DigitalOutputPin_1= ruleDigitalOutputPin | this_AnalogInputPin_2= ruleAnalogInputPin | this_AnalogOutputPin_3= ruleAnalogOutputPin ) )
            // InternalIotDsl.g:385:2: (this_DigitalInputPin_0= ruleDigitalInputPin | this_DigitalOutputPin_1= ruleDigitalOutputPin | this_AnalogInputPin_2= ruleAnalogInputPin | this_AnalogOutputPin_3= ruleAnalogOutputPin )
            {
            // InternalIotDsl.g:385:2: (this_DigitalInputPin_0= ruleDigitalInputPin | this_DigitalOutputPin_1= ruleDigitalOutputPin | this_AnalogInputPin_2= ruleAnalogInputPin | this_AnalogOutputPin_3= ruleAnalogOutputPin )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 74:
                {
                alt4=1;
                }
                break;
            case 76:
                {
                alt4=2;
                }
                break;
            case 77:
                {
                alt4=3;
                }
                break;
            case 78:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalIotDsl.g:386:3: this_DigitalInputPin_0= ruleDigitalInputPin
                    {

                    			newCompositeNode(grammarAccess.getPinAccess().getDigitalInputPinParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DigitalInputPin_0=ruleDigitalInputPin();

                    state._fsp--;


                    			current = this_DigitalInputPin_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalIotDsl.g:395:3: this_DigitalOutputPin_1= ruleDigitalOutputPin
                    {

                    			newCompositeNode(grammarAccess.getPinAccess().getDigitalOutputPinParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DigitalOutputPin_1=ruleDigitalOutputPin();

                    state._fsp--;


                    			current = this_DigitalOutputPin_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalIotDsl.g:404:3: this_AnalogInputPin_2= ruleAnalogInputPin
                    {

                    			newCompositeNode(grammarAccess.getPinAccess().getAnalogInputPinParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_AnalogInputPin_2=ruleAnalogInputPin();

                    state._fsp--;


                    			current = this_AnalogInputPin_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalIotDsl.g:413:3: this_AnalogOutputPin_3= ruleAnalogOutputPin
                    {

                    			newCompositeNode(grammarAccess.getPinAccess().getAnalogOutputPinParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_AnalogOutputPin_3=ruleAnalogOutputPin();

                    state._fsp--;


                    			current = this_AnalogOutputPin_3;
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
    // $ANTLR end "rulePin"


    // $ANTLR start "entryRuleEvent"
    // InternalIotDsl.g:425:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalIotDsl.g:425:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalIotDsl.g:426:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
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
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // InternalIotDsl.g:432:1: ruleEvent returns [EObject current=null] : (this_GpioInterrupted_0= ruleGpioInterrupted | this_GpioButtonInput_1= ruleGpioButtonInput | this_GpioButtonInputAccumulator_2= ruleGpioButtonInputAccumulator | this_GpioButtonReleased_3= ruleGpioButtonReleased | this_GpioPulseInput_4= ruleGpioPulseInput | this_GpioAnalogRead_5= ruleGpioAnalogRead | this_GpioAnalogReadPerformOnHigh_6= ruleGpioAnalogReadPerformOnHigh | this_GpioAnalogReadPerformOnLow_7= ruleGpioAnalogReadPerformOnLow | this_TimerEvent_8= ruleTimerEvent | this_RemoteEvent_9= ruleRemoteEvent | this_NetworkConnected_10= ruleNetworkConnected | this_NetworkDisconnected_11= ruleNetworkDisconnected | this_ServerConnected_12= ruleServerConnected | this_ServerDisconnected_13= ruleServerDisconnected ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        EObject this_GpioInterrupted_0 = null;

        EObject this_GpioButtonInput_1 = null;

        EObject this_GpioButtonInputAccumulator_2 = null;

        EObject this_GpioButtonReleased_3 = null;

        EObject this_GpioPulseInput_4 = null;

        EObject this_GpioAnalogRead_5 = null;

        EObject this_GpioAnalogReadPerformOnHigh_6 = null;

        EObject this_GpioAnalogReadPerformOnLow_7 = null;

        EObject this_TimerEvent_8 = null;

        EObject this_RemoteEvent_9 = null;

        EObject this_NetworkConnected_10 = null;

        EObject this_NetworkDisconnected_11 = null;

        EObject this_ServerConnected_12 = null;

        EObject this_ServerDisconnected_13 = null;



        	enterRule();

        try {
            // InternalIotDsl.g:438:2: ( (this_GpioInterrupted_0= ruleGpioInterrupted | this_GpioButtonInput_1= ruleGpioButtonInput | this_GpioButtonInputAccumulator_2= ruleGpioButtonInputAccumulator | this_GpioButtonReleased_3= ruleGpioButtonReleased | this_GpioPulseInput_4= ruleGpioPulseInput | this_GpioAnalogRead_5= ruleGpioAnalogRead | this_GpioAnalogReadPerformOnHigh_6= ruleGpioAnalogReadPerformOnHigh | this_GpioAnalogReadPerformOnLow_7= ruleGpioAnalogReadPerformOnLow | this_TimerEvent_8= ruleTimerEvent | this_RemoteEvent_9= ruleRemoteEvent | this_NetworkConnected_10= ruleNetworkConnected | this_NetworkDisconnected_11= ruleNetworkDisconnected | this_ServerConnected_12= ruleServerConnected | this_ServerDisconnected_13= ruleServerDisconnected ) )
            // InternalIotDsl.g:439:2: (this_GpioInterrupted_0= ruleGpioInterrupted | this_GpioButtonInput_1= ruleGpioButtonInput | this_GpioButtonInputAccumulator_2= ruleGpioButtonInputAccumulator | this_GpioButtonReleased_3= ruleGpioButtonReleased | this_GpioPulseInput_4= ruleGpioPulseInput | this_GpioAnalogRead_5= ruleGpioAnalogRead | this_GpioAnalogReadPerformOnHigh_6= ruleGpioAnalogReadPerformOnHigh | this_GpioAnalogReadPerformOnLow_7= ruleGpioAnalogReadPerformOnLow | this_TimerEvent_8= ruleTimerEvent | this_RemoteEvent_9= ruleRemoteEvent | this_NetworkConnected_10= ruleNetworkConnected | this_NetworkDisconnected_11= ruleNetworkDisconnected | this_ServerConnected_12= ruleServerConnected | this_ServerDisconnected_13= ruleServerDisconnected )
            {
            // InternalIotDsl.g:439:2: (this_GpioInterrupted_0= ruleGpioInterrupted | this_GpioButtonInput_1= ruleGpioButtonInput | this_GpioButtonInputAccumulator_2= ruleGpioButtonInputAccumulator | this_GpioButtonReleased_3= ruleGpioButtonReleased | this_GpioPulseInput_4= ruleGpioPulseInput | this_GpioAnalogRead_5= ruleGpioAnalogRead | this_GpioAnalogReadPerformOnHigh_6= ruleGpioAnalogReadPerformOnHigh | this_GpioAnalogReadPerformOnLow_7= ruleGpioAnalogReadPerformOnLow | this_TimerEvent_8= ruleTimerEvent | this_RemoteEvent_9= ruleRemoteEvent | this_NetworkConnected_10= ruleNetworkConnected | this_NetworkDisconnected_11= ruleNetworkDisconnected | this_ServerConnected_12= ruleServerConnected | this_ServerDisconnected_13= ruleServerDisconnected )
            int alt5=14;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt5=1;
                }
                break;
            case 37:
                {
                alt5=2;
                }
                break;
            case 40:
                {
                alt5=3;
                }
                break;
            case 42:
                {
                alt5=4;
                }
                break;
            case 43:
                {
                alt5=5;
                }
                break;
            case 46:
                {
                alt5=6;
                }
                break;
            case 49:
                {
                alt5=7;
                }
                break;
            case 51:
                {
                alt5=8;
                }
                break;
            case 31:
                {
                alt5=9;
                }
                break;
            case 58:
                {
                alt5=10;
                }
                break;
            case 27:
                {
                alt5=11;
                }
                break;
            case 28:
                {
                alt5=12;
                }
                break;
            case 29:
                {
                alt5=13;
                }
                break;
            case 30:
                {
                alt5=14;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalIotDsl.g:440:3: this_GpioInterrupted_0= ruleGpioInterrupted
                    {

                    			newCompositeNode(grammarAccess.getEventAccess().getGpioInterruptedParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_GpioInterrupted_0=ruleGpioInterrupted();

                    state._fsp--;


                    			current = this_GpioInterrupted_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalIotDsl.g:449:3: this_GpioButtonInput_1= ruleGpioButtonInput
                    {

                    			newCompositeNode(grammarAccess.getEventAccess().getGpioButtonInputParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_GpioButtonInput_1=ruleGpioButtonInput();

                    state._fsp--;


                    			current = this_GpioButtonInput_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalIotDsl.g:458:3: this_GpioButtonInputAccumulator_2= ruleGpioButtonInputAccumulator
                    {

                    			newCompositeNode(grammarAccess.getEventAccess().getGpioButtonInputAccumulatorParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_GpioButtonInputAccumulator_2=ruleGpioButtonInputAccumulator();

                    state._fsp--;


                    			current = this_GpioButtonInputAccumulator_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalIotDsl.g:467:3: this_GpioButtonReleased_3= ruleGpioButtonReleased
                    {

                    			newCompositeNode(grammarAccess.getEventAccess().getGpioButtonReleasedParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_GpioButtonReleased_3=ruleGpioButtonReleased();

                    state._fsp--;


                    			current = this_GpioButtonReleased_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalIotDsl.g:476:3: this_GpioPulseInput_4= ruleGpioPulseInput
                    {

                    			newCompositeNode(grammarAccess.getEventAccess().getGpioPulseInputParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_GpioPulseInput_4=ruleGpioPulseInput();

                    state._fsp--;


                    			current = this_GpioPulseInput_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalIotDsl.g:485:3: this_GpioAnalogRead_5= ruleGpioAnalogRead
                    {

                    			newCompositeNode(grammarAccess.getEventAccess().getGpioAnalogReadParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_GpioAnalogRead_5=ruleGpioAnalogRead();

                    state._fsp--;


                    			current = this_GpioAnalogRead_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalIotDsl.g:494:3: this_GpioAnalogReadPerformOnHigh_6= ruleGpioAnalogReadPerformOnHigh
                    {

                    			newCompositeNode(grammarAccess.getEventAccess().getGpioAnalogReadPerformOnHighParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_GpioAnalogReadPerformOnHigh_6=ruleGpioAnalogReadPerformOnHigh();

                    state._fsp--;


                    			current = this_GpioAnalogReadPerformOnHigh_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalIotDsl.g:503:3: this_GpioAnalogReadPerformOnLow_7= ruleGpioAnalogReadPerformOnLow
                    {

                    			newCompositeNode(grammarAccess.getEventAccess().getGpioAnalogReadPerformOnLowParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_GpioAnalogReadPerformOnLow_7=ruleGpioAnalogReadPerformOnLow();

                    state._fsp--;


                    			current = this_GpioAnalogReadPerformOnLow_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalIotDsl.g:512:3: this_TimerEvent_8= ruleTimerEvent
                    {

                    			newCompositeNode(grammarAccess.getEventAccess().getTimerEventParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_TimerEvent_8=ruleTimerEvent();

                    state._fsp--;


                    			current = this_TimerEvent_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalIotDsl.g:521:3: this_RemoteEvent_9= ruleRemoteEvent
                    {

                    			newCompositeNode(grammarAccess.getEventAccess().getRemoteEventParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_RemoteEvent_9=ruleRemoteEvent();

                    state._fsp--;


                    			current = this_RemoteEvent_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalIotDsl.g:530:3: this_NetworkConnected_10= ruleNetworkConnected
                    {

                    			newCompositeNode(grammarAccess.getEventAccess().getNetworkConnectedParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_NetworkConnected_10=ruleNetworkConnected();

                    state._fsp--;


                    			current = this_NetworkConnected_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalIotDsl.g:539:3: this_NetworkDisconnected_11= ruleNetworkDisconnected
                    {

                    			newCompositeNode(grammarAccess.getEventAccess().getNetworkDisconnectedParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_NetworkDisconnected_11=ruleNetworkDisconnected();

                    state._fsp--;


                    			current = this_NetworkDisconnected_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 13 :
                    // InternalIotDsl.g:548:3: this_ServerConnected_12= ruleServerConnected
                    {

                    			newCompositeNode(grammarAccess.getEventAccess().getServerConnectedParserRuleCall_12());
                    		
                    pushFollow(FOLLOW_2);
                    this_ServerConnected_12=ruleServerConnected();

                    state._fsp--;


                    			current = this_ServerConnected_12;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 14 :
                    // InternalIotDsl.g:557:3: this_ServerDisconnected_13= ruleServerDisconnected
                    {

                    			newCompositeNode(grammarAccess.getEventAccess().getServerDisconnectedParserRuleCall_13());
                    		
                    pushFollow(FOLLOW_2);
                    this_ServerDisconnected_13=ruleServerDisconnected();

                    state._fsp--;


                    			current = this_ServerDisconnected_13;
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
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleTimer"
    // InternalIotDsl.g:569:1: entryRuleTimer returns [EObject current=null] : iv_ruleTimer= ruleTimer EOF ;
    public final EObject entryRuleTimer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimer = null;


        try {
            // InternalIotDsl.g:569:46: (iv_ruleTimer= ruleTimer EOF )
            // InternalIotDsl.g:570:2: iv_ruleTimer= ruleTimer EOF
            {
             newCompositeNode(grammarAccess.getTimerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTimer=ruleTimer();

            state._fsp--;

             current =iv_ruleTimer; 
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
    // $ANTLR end "entryRuleTimer"


    // $ANTLR start "ruleTimer"
    // InternalIotDsl.g:576:1: ruleTimer returns [EObject current=null] : (this_Now_0= ruleNow | this_Repeated_1= ruleRepeated | this_Clock_2= ruleClock | this_Cron_3= ruleCron ) ;
    public final EObject ruleTimer() throws RecognitionException {
        EObject current = null;

        EObject this_Now_0 = null;

        EObject this_Repeated_1 = null;

        EObject this_Clock_2 = null;

        EObject this_Cron_3 = null;



        	enterRule();

        try {
            // InternalIotDsl.g:582:2: ( (this_Now_0= ruleNow | this_Repeated_1= ruleRepeated | this_Clock_2= ruleClock | this_Cron_3= ruleCron ) )
            // InternalIotDsl.g:583:2: (this_Now_0= ruleNow | this_Repeated_1= ruleRepeated | this_Clock_2= ruleClock | this_Cron_3= ruleCron )
            {
            // InternalIotDsl.g:583:2: (this_Now_0= ruleNow | this_Repeated_1= ruleRepeated | this_Clock_2= ruleClock | this_Cron_3= ruleCron )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt6=1;
                }
                break;
            case 33:
                {
                alt6=2;
                }
                break;
            case 34:
                {
                alt6=3;
                }
                break;
            case 35:
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
                    // InternalIotDsl.g:584:3: this_Now_0= ruleNow
                    {

                    			newCompositeNode(grammarAccess.getTimerAccess().getNowParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Now_0=ruleNow();

                    state._fsp--;


                    			current = this_Now_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalIotDsl.g:593:3: this_Repeated_1= ruleRepeated
                    {

                    			newCompositeNode(grammarAccess.getTimerAccess().getRepeatedParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Repeated_1=ruleRepeated();

                    state._fsp--;


                    			current = this_Repeated_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalIotDsl.g:602:3: this_Clock_2= ruleClock
                    {

                    			newCompositeNode(grammarAccess.getTimerAccess().getClockParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Clock_2=ruleClock();

                    state._fsp--;


                    			current = this_Clock_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalIotDsl.g:611:3: this_Cron_3= ruleCron
                    {

                    			newCompositeNode(grammarAccess.getTimerAccess().getCronParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Cron_3=ruleCron();

                    state._fsp--;


                    			current = this_Cron_3;
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
    // $ANTLR end "ruleTimer"


    // $ANTLR start "entryRuleActuator"
    // InternalIotDsl.g:623:1: entryRuleActuator returns [EObject current=null] : iv_ruleActuator= ruleActuator EOF ;
    public final EObject entryRuleActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActuator = null;


        try {
            // InternalIotDsl.g:623:49: (iv_ruleActuator= ruleActuator EOF )
            // InternalIotDsl.g:624:2: iv_ruleActuator= ruleActuator EOF
            {
             newCompositeNode(grammarAccess.getActuatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActuator=ruleActuator();

            state._fsp--;

             current =iv_ruleActuator; 
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
    // $ANTLR end "entryRuleActuator"


    // $ANTLR start "ruleActuator"
    // InternalIotDsl.g:630:1: ruleActuator returns [EObject current=null] : (this_SequentialActuators_0= ruleSequentialActuators | this_ChangeOutput_1= ruleChangeOutput | this_ButtonOutput_2= ruleButtonOutput | this_PulseOutput_3= rulePulseOutput | this_BlinkOutput_4= ruleBlinkOutput | this_BlinkTimerOutput_5= ruleBlinkTimerOutput | this_Pwm_6= rulePwm | this_TransformTo_7= ruleTransformTo | this_RemoteActuator_8= ruleRemoteActuator | this_SystemCommand_9= ruleSystemCommand | this_Download_10= ruleDownload | this_PlaySound_11= rulePlaySound | this_BackgroundImage_12= ruleBackgroundImage | this_DrawImage_13= ruleDrawImage | this_PlayVideo_14= rulePlayVideo | this_ChangeStateActuator_15= ruleChangeStateActuator ) ;
    public final EObject ruleActuator() throws RecognitionException {
        EObject current = null;

        EObject this_SequentialActuators_0 = null;

        EObject this_ChangeOutput_1 = null;

        EObject this_ButtonOutput_2 = null;

        EObject this_PulseOutput_3 = null;

        EObject this_BlinkOutput_4 = null;

        EObject this_BlinkTimerOutput_5 = null;

        EObject this_Pwm_6 = null;

        EObject this_TransformTo_7 = null;

        EObject this_RemoteActuator_8 = null;

        EObject this_SystemCommand_9 = null;

        EObject this_Download_10 = null;

        EObject this_PlaySound_11 = null;

        EObject this_BackgroundImage_12 = null;

        EObject this_DrawImage_13 = null;

        EObject this_PlayVideo_14 = null;

        EObject this_ChangeStateActuator_15 = null;



        	enterRule();

        try {
            // InternalIotDsl.g:636:2: ( (this_SequentialActuators_0= ruleSequentialActuators | this_ChangeOutput_1= ruleChangeOutput | this_ButtonOutput_2= ruleButtonOutput | this_PulseOutput_3= rulePulseOutput | this_BlinkOutput_4= ruleBlinkOutput | this_BlinkTimerOutput_5= ruleBlinkTimerOutput | this_Pwm_6= rulePwm | this_TransformTo_7= ruleTransformTo | this_RemoteActuator_8= ruleRemoteActuator | this_SystemCommand_9= ruleSystemCommand | this_Download_10= ruleDownload | this_PlaySound_11= rulePlaySound | this_BackgroundImage_12= ruleBackgroundImage | this_DrawImage_13= ruleDrawImage | this_PlayVideo_14= rulePlayVideo | this_ChangeStateActuator_15= ruleChangeStateActuator ) )
            // InternalIotDsl.g:637:2: (this_SequentialActuators_0= ruleSequentialActuators | this_ChangeOutput_1= ruleChangeOutput | this_ButtonOutput_2= ruleButtonOutput | this_PulseOutput_3= rulePulseOutput | this_BlinkOutput_4= ruleBlinkOutput | this_BlinkTimerOutput_5= ruleBlinkTimerOutput | this_Pwm_6= rulePwm | this_TransformTo_7= ruleTransformTo | this_RemoteActuator_8= ruleRemoteActuator | this_SystemCommand_9= ruleSystemCommand | this_Download_10= ruleDownload | this_PlaySound_11= rulePlaySound | this_BackgroundImage_12= ruleBackgroundImage | this_DrawImage_13= ruleDrawImage | this_PlayVideo_14= rulePlayVideo | this_ChangeStateActuator_15= ruleChangeStateActuator )
            {
            // InternalIotDsl.g:637:2: (this_SequentialActuators_0= ruleSequentialActuators | this_ChangeOutput_1= ruleChangeOutput | this_ButtonOutput_2= ruleButtonOutput | this_PulseOutput_3= rulePulseOutput | this_BlinkOutput_4= ruleBlinkOutput | this_BlinkTimerOutput_5= ruleBlinkTimerOutput | this_Pwm_6= rulePwm | this_TransformTo_7= ruleTransformTo | this_RemoteActuator_8= ruleRemoteActuator | this_SystemCommand_9= ruleSystemCommand | this_Download_10= ruleDownload | this_PlaySound_11= rulePlaySound | this_BackgroundImage_12= ruleBackgroundImage | this_DrawImage_13= ruleDrawImage | this_PlayVideo_14= rulePlayVideo | this_ChangeStateActuator_15= ruleChangeStateActuator )
            int alt7=16;
            switch ( input.LA(1) ) {
            case 81:
                {
                alt7=1;
                }
                break;
            case 82:
                {
                alt7=2;
                }
                break;
            case 37:
                {
                alt7=3;
                }
                break;
            case 84:
                {
                alt7=4;
                }
                break;
            case 87:
                {
                alt7=5;
                }
                break;
            case 89:
                {
                alt7=6;
                }
                break;
            case 91:
                {
                alt7=7;
                }
                break;
            case 93:
                {
                alt7=8;
                }
                break;
            case 59:
                {
                alt7=9;
                }
                break;
            case 60:
                {
                alt7=10;
                }
                break;
            case 61:
                {
                alt7=11;
                }
                break;
            case 63:
                {
                alt7=12;
                }
                break;
            case 65:
                {
                alt7=13;
                }
                break;
            case 66:
                {
                alt7=14;
                }
                break;
            case 72:
                {
                alt7=15;
                }
                break;
            case 73:
                {
                alt7=16;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalIotDsl.g:638:3: this_SequentialActuators_0= ruleSequentialActuators
                    {

                    			newCompositeNode(grammarAccess.getActuatorAccess().getSequentialActuatorsParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SequentialActuators_0=ruleSequentialActuators();

                    state._fsp--;


                    			current = this_SequentialActuators_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalIotDsl.g:647:3: this_ChangeOutput_1= ruleChangeOutput
                    {

                    			newCompositeNode(grammarAccess.getActuatorAccess().getChangeOutputParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ChangeOutput_1=ruleChangeOutput();

                    state._fsp--;


                    			current = this_ChangeOutput_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalIotDsl.g:656:3: this_ButtonOutput_2= ruleButtonOutput
                    {

                    			newCompositeNode(grammarAccess.getActuatorAccess().getButtonOutputParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ButtonOutput_2=ruleButtonOutput();

                    state._fsp--;


                    			current = this_ButtonOutput_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalIotDsl.g:665:3: this_PulseOutput_3= rulePulseOutput
                    {

                    			newCompositeNode(grammarAccess.getActuatorAccess().getPulseOutputParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_PulseOutput_3=rulePulseOutput();

                    state._fsp--;


                    			current = this_PulseOutput_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalIotDsl.g:674:3: this_BlinkOutput_4= ruleBlinkOutput
                    {

                    			newCompositeNode(grammarAccess.getActuatorAccess().getBlinkOutputParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_BlinkOutput_4=ruleBlinkOutput();

                    state._fsp--;


                    			current = this_BlinkOutput_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalIotDsl.g:683:3: this_BlinkTimerOutput_5= ruleBlinkTimerOutput
                    {

                    			newCompositeNode(grammarAccess.getActuatorAccess().getBlinkTimerOutputParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_BlinkTimerOutput_5=ruleBlinkTimerOutput();

                    state._fsp--;


                    			current = this_BlinkTimerOutput_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalIotDsl.g:692:3: this_Pwm_6= rulePwm
                    {

                    			newCompositeNode(grammarAccess.getActuatorAccess().getPwmParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Pwm_6=rulePwm();

                    state._fsp--;


                    			current = this_Pwm_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalIotDsl.g:701:3: this_TransformTo_7= ruleTransformTo
                    {

                    			newCompositeNode(grammarAccess.getActuatorAccess().getTransformToParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_TransformTo_7=ruleTransformTo();

                    state._fsp--;


                    			current = this_TransformTo_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalIotDsl.g:710:3: this_RemoteActuator_8= ruleRemoteActuator
                    {

                    			newCompositeNode(grammarAccess.getActuatorAccess().getRemoteActuatorParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_RemoteActuator_8=ruleRemoteActuator();

                    state._fsp--;


                    			current = this_RemoteActuator_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalIotDsl.g:719:3: this_SystemCommand_9= ruleSystemCommand
                    {

                    			newCompositeNode(grammarAccess.getActuatorAccess().getSystemCommandParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_SystemCommand_9=ruleSystemCommand();

                    state._fsp--;


                    			current = this_SystemCommand_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalIotDsl.g:728:3: this_Download_10= ruleDownload
                    {

                    			newCompositeNode(grammarAccess.getActuatorAccess().getDownloadParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_Download_10=ruleDownload();

                    state._fsp--;


                    			current = this_Download_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalIotDsl.g:737:3: this_PlaySound_11= rulePlaySound
                    {

                    			newCompositeNode(grammarAccess.getActuatorAccess().getPlaySoundParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_PlaySound_11=rulePlaySound();

                    state._fsp--;


                    			current = this_PlaySound_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 13 :
                    // InternalIotDsl.g:746:3: this_BackgroundImage_12= ruleBackgroundImage
                    {

                    			newCompositeNode(grammarAccess.getActuatorAccess().getBackgroundImageParserRuleCall_12());
                    		
                    pushFollow(FOLLOW_2);
                    this_BackgroundImage_12=ruleBackgroundImage();

                    state._fsp--;


                    			current = this_BackgroundImage_12;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 14 :
                    // InternalIotDsl.g:755:3: this_DrawImage_13= ruleDrawImage
                    {

                    			newCompositeNode(grammarAccess.getActuatorAccess().getDrawImageParserRuleCall_13());
                    		
                    pushFollow(FOLLOW_2);
                    this_DrawImage_13=ruleDrawImage();

                    state._fsp--;


                    			current = this_DrawImage_13;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 15 :
                    // InternalIotDsl.g:764:3: this_PlayVideo_14= rulePlayVideo
                    {

                    			newCompositeNode(grammarAccess.getActuatorAccess().getPlayVideoParserRuleCall_14());
                    		
                    pushFollow(FOLLOW_2);
                    this_PlayVideo_14=rulePlayVideo();

                    state._fsp--;


                    			current = this_PlayVideo_14;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 16 :
                    // InternalIotDsl.g:773:3: this_ChangeStateActuator_15= ruleChangeStateActuator
                    {

                    			newCompositeNode(grammarAccess.getActuatorAccess().getChangeStateActuatorParserRuleCall_15());
                    		
                    pushFollow(FOLLOW_2);
                    this_ChangeStateActuator_15=ruleChangeStateActuator();

                    state._fsp--;


                    			current = this_ChangeStateActuator_15;
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
    // $ANTLR end "ruleActuator"


    // $ANTLR start "entryRuleRemoteIdentifier"
    // InternalIotDsl.g:785:1: entryRuleRemoteIdentifier returns [EObject current=null] : iv_ruleRemoteIdentifier= ruleRemoteIdentifier EOF ;
    public final EObject entryRuleRemoteIdentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRemoteIdentifier = null;


        try {
            // InternalIotDsl.g:785:57: (iv_ruleRemoteIdentifier= ruleRemoteIdentifier EOF )
            // InternalIotDsl.g:786:2: iv_ruleRemoteIdentifier= ruleRemoteIdentifier EOF
            {
             newCompositeNode(grammarAccess.getRemoteIdentifierRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRemoteIdentifier=ruleRemoteIdentifier();

            state._fsp--;

             current =iv_ruleRemoteIdentifier; 
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
    // $ANTLR end "entryRuleRemoteIdentifier"


    // $ANTLR start "ruleRemoteIdentifier"
    // InternalIotDsl.g:792:1: ruleRemoteIdentifier returns [EObject current=null] : (this_RemoteEventIdentifier_0= ruleRemoteEventIdentifier | this_RemoteActuatorIdentifier_1= ruleRemoteActuatorIdentifier ) ;
    public final EObject ruleRemoteIdentifier() throws RecognitionException {
        EObject current = null;

        EObject this_RemoteEventIdentifier_0 = null;

        EObject this_RemoteActuatorIdentifier_1 = null;



        	enterRule();

        try {
            // InternalIotDsl.g:798:2: ( (this_RemoteEventIdentifier_0= ruleRemoteEventIdentifier | this_RemoteActuatorIdentifier_1= ruleRemoteActuatorIdentifier ) )
            // InternalIotDsl.g:799:2: (this_RemoteEventIdentifier_0= ruleRemoteEventIdentifier | this_RemoteActuatorIdentifier_1= ruleRemoteActuatorIdentifier )
            {
            // InternalIotDsl.g:799:2: (this_RemoteEventIdentifier_0= ruleRemoteEventIdentifier | this_RemoteActuatorIdentifier_1= ruleRemoteActuatorIdentifier )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==79) ) {
                alt8=1;
            }
            else if ( (LA8_0==80) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalIotDsl.g:800:3: this_RemoteEventIdentifier_0= ruleRemoteEventIdentifier
                    {

                    			newCompositeNode(grammarAccess.getRemoteIdentifierAccess().getRemoteEventIdentifierParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_RemoteEventIdentifier_0=ruleRemoteEventIdentifier();

                    state._fsp--;


                    			current = this_RemoteEventIdentifier_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalIotDsl.g:809:3: this_RemoteActuatorIdentifier_1= ruleRemoteActuatorIdentifier
                    {

                    			newCompositeNode(grammarAccess.getRemoteIdentifierAccess().getRemoteActuatorIdentifierParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RemoteActuatorIdentifier_1=ruleRemoteActuatorIdentifier();

                    state._fsp--;


                    			current = this_RemoteActuatorIdentifier_1;
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
    // $ANTLR end "ruleRemoteIdentifier"


    // $ANTLR start "entryRuleEString"
    // InternalIotDsl.g:821:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalIotDsl.g:821:47: (iv_ruleEString= ruleEString EOF )
            // InternalIotDsl.g:822:2: iv_ruleEString= ruleEString EOF
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
    // InternalIotDsl.g:828:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalIotDsl.g:834:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalIotDsl.g:835:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalIotDsl.g:835:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalIotDsl.g:836:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalIotDsl.g:844:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleEInt"
    // InternalIotDsl.g:855:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalIotDsl.g:855:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalIotDsl.g:856:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalIotDsl.g:862:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalIotDsl.g:868:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalIotDsl.g:869:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalIotDsl.g:869:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalIotDsl.g:870:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalIotDsl.g:870:3: (kw= '-' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalIotDsl.g:871:4: kw= '-'
                    {
                    kw=(Token)match(input,19,FOLLOW_15); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleELong"
    // InternalIotDsl.g:888:1: entryRuleELong returns [String current=null] : iv_ruleELong= ruleELong EOF ;
    public final String entryRuleELong() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleELong = null;


        try {
            // InternalIotDsl.g:888:45: (iv_ruleELong= ruleELong EOF )
            // InternalIotDsl.g:889:2: iv_ruleELong= ruleELong EOF
            {
             newCompositeNode(grammarAccess.getELongRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleELong=ruleELong();

            state._fsp--;

             current =iv_ruleELong.getText(); 
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
    // $ANTLR end "entryRuleELong"


    // $ANTLR start "ruleELong"
    // InternalIotDsl.g:895:1: ruleELong returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleELong() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalIotDsl.g:901:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalIotDsl.g:902:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalIotDsl.g:902:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalIotDsl.g:903:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalIotDsl.g:903:3: (kw= '-' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==19) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalIotDsl.g:904:4: kw= '-'
                    {
                    kw=(Token)match(input,19,FOLLOW_15); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getELongAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getELongAccess().getINTTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleELong"


    // $ANTLR start "entryRuleProgram"
    // InternalIotDsl.g:921:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalIotDsl.g:921:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalIotDsl.g:922:2: iv_ruleProgram= ruleProgram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
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
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalIotDsl.g:928:1: ruleProgram returns [EObject current=null] : (otherlv_0= 'program' otherlv_1= '{' (otherlv_2= 'gpio_aliases' otherlv_3= '{' ( (lv_gpioAliases_4_0= rulePin ) ) (otherlv_5= ',' ( (lv_gpioAliases_6_0= rulePin ) ) )* otherlv_7= '}' )? (otherlv_8= 'remote_identifiers' otherlv_9= '{' ( (lv_remoteIdentifiers_10_0= ruleRemoteIdentifier ) ) (otherlv_11= ',' ( (lv_remoteIdentifiers_12_0= ruleRemoteIdentifier ) ) )* otherlv_13= '}' )? (otherlv_14= 'files' otherlv_15= '{' ( (lv_files_16_0= ruleFilePath ) ) (otherlv_17= ',' ( (lv_files_18_0= ruleFilePath ) ) )* otherlv_19= '}' )? otherlv_20= 'start_state' ( ( ruleEString ) ) otherlv_22= 'states' otherlv_23= '{' ( (lv_states_24_0= ruleProgramState ) ) (otherlv_25= ',' ( (lv_states_26_0= ruleProgramState ) ) )* otherlv_27= '}' otherlv_28= '}' ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        EObject lv_gpioAliases_4_0 = null;

        EObject lv_gpioAliases_6_0 = null;

        EObject lv_remoteIdentifiers_10_0 = null;

        EObject lv_remoteIdentifiers_12_0 = null;

        EObject lv_files_16_0 = null;

        EObject lv_files_18_0 = null;

        EObject lv_states_24_0 = null;

        EObject lv_states_26_0 = null;



        	enterRule();

        try {
            // InternalIotDsl.g:934:2: ( (otherlv_0= 'program' otherlv_1= '{' (otherlv_2= 'gpio_aliases' otherlv_3= '{' ( (lv_gpioAliases_4_0= rulePin ) ) (otherlv_5= ',' ( (lv_gpioAliases_6_0= rulePin ) ) )* otherlv_7= '}' )? (otherlv_8= 'remote_identifiers' otherlv_9= '{' ( (lv_remoteIdentifiers_10_0= ruleRemoteIdentifier ) ) (otherlv_11= ',' ( (lv_remoteIdentifiers_12_0= ruleRemoteIdentifier ) ) )* otherlv_13= '}' )? (otherlv_14= 'files' otherlv_15= '{' ( (lv_files_16_0= ruleFilePath ) ) (otherlv_17= ',' ( (lv_files_18_0= ruleFilePath ) ) )* otherlv_19= '}' )? otherlv_20= 'start_state' ( ( ruleEString ) ) otherlv_22= 'states' otherlv_23= '{' ( (lv_states_24_0= ruleProgramState ) ) (otherlv_25= ',' ( (lv_states_26_0= ruleProgramState ) ) )* otherlv_27= '}' otherlv_28= '}' ) )
            // InternalIotDsl.g:935:2: (otherlv_0= 'program' otherlv_1= '{' (otherlv_2= 'gpio_aliases' otherlv_3= '{' ( (lv_gpioAliases_4_0= rulePin ) ) (otherlv_5= ',' ( (lv_gpioAliases_6_0= rulePin ) ) )* otherlv_7= '}' )? (otherlv_8= 'remote_identifiers' otherlv_9= '{' ( (lv_remoteIdentifiers_10_0= ruleRemoteIdentifier ) ) (otherlv_11= ',' ( (lv_remoteIdentifiers_12_0= ruleRemoteIdentifier ) ) )* otherlv_13= '}' )? (otherlv_14= 'files' otherlv_15= '{' ( (lv_files_16_0= ruleFilePath ) ) (otherlv_17= ',' ( (lv_files_18_0= ruleFilePath ) ) )* otherlv_19= '}' )? otherlv_20= 'start_state' ( ( ruleEString ) ) otherlv_22= 'states' otherlv_23= '{' ( (lv_states_24_0= ruleProgramState ) ) (otherlv_25= ',' ( (lv_states_26_0= ruleProgramState ) ) )* otherlv_27= '}' otherlv_28= '}' )
            {
            // InternalIotDsl.g:935:2: (otherlv_0= 'program' otherlv_1= '{' (otherlv_2= 'gpio_aliases' otherlv_3= '{' ( (lv_gpioAliases_4_0= rulePin ) ) (otherlv_5= ',' ( (lv_gpioAliases_6_0= rulePin ) ) )* otherlv_7= '}' )? (otherlv_8= 'remote_identifiers' otherlv_9= '{' ( (lv_remoteIdentifiers_10_0= ruleRemoteIdentifier ) ) (otherlv_11= ',' ( (lv_remoteIdentifiers_12_0= ruleRemoteIdentifier ) ) )* otherlv_13= '}' )? (otherlv_14= 'files' otherlv_15= '{' ( (lv_files_16_0= ruleFilePath ) ) (otherlv_17= ',' ( (lv_files_18_0= ruleFilePath ) ) )* otherlv_19= '}' )? otherlv_20= 'start_state' ( ( ruleEString ) ) otherlv_22= 'states' otherlv_23= '{' ( (lv_states_24_0= ruleProgramState ) ) (otherlv_25= ',' ( (lv_states_26_0= ruleProgramState ) ) )* otherlv_27= '}' otherlv_28= '}' )
            // InternalIotDsl.g:936:3: otherlv_0= 'program' otherlv_1= '{' (otherlv_2= 'gpio_aliases' otherlv_3= '{' ( (lv_gpioAliases_4_0= rulePin ) ) (otherlv_5= ',' ( (lv_gpioAliases_6_0= rulePin ) ) )* otherlv_7= '}' )? (otherlv_8= 'remote_identifiers' otherlv_9= '{' ( (lv_remoteIdentifiers_10_0= ruleRemoteIdentifier ) ) (otherlv_11= ',' ( (lv_remoteIdentifiers_12_0= ruleRemoteIdentifier ) ) )* otherlv_13= '}' )? (otherlv_14= 'files' otherlv_15= '{' ( (lv_files_16_0= ruleFilePath ) ) (otherlv_17= ',' ( (lv_files_18_0= ruleFilePath ) ) )* otherlv_19= '}' )? otherlv_20= 'start_state' ( ( ruleEString ) ) otherlv_22= 'states' otherlv_23= '{' ( (lv_states_24_0= ruleProgramState ) ) (otherlv_25= ',' ( (lv_states_26_0= ruleProgramState ) ) )* otherlv_27= '}' otherlv_28= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getProgramAccess().getProgramKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalIotDsl.g:944:3: (otherlv_2= 'gpio_aliases' otherlv_3= '{' ( (lv_gpioAliases_4_0= rulePin ) ) (otherlv_5= ',' ( (lv_gpioAliases_6_0= rulePin ) ) )* otherlv_7= '}' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==21) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalIotDsl.g:945:4: otherlv_2= 'gpio_aliases' otherlv_3= '{' ( (lv_gpioAliases_4_0= rulePin ) ) (otherlv_5= ',' ( (lv_gpioAliases_6_0= rulePin ) ) )* otherlv_7= '}'
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getProgramAccess().getGpio_aliasesKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,12,FOLLOW_17); 

                    				newLeafNode(otherlv_3, grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_2_1());
                    			
                    // InternalIotDsl.g:953:4: ( (lv_gpioAliases_4_0= rulePin ) )
                    // InternalIotDsl.g:954:5: (lv_gpioAliases_4_0= rulePin )
                    {
                    // InternalIotDsl.g:954:5: (lv_gpioAliases_4_0= rulePin )
                    // InternalIotDsl.g:955:6: lv_gpioAliases_4_0= rulePin
                    {

                    						newCompositeNode(grammarAccess.getProgramAccess().getGpioAliasesPinParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_gpioAliases_4_0=rulePin();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProgramRule());
                    						}
                    						add(
                    							current,
                    							"gpioAliases",
                    							lv_gpioAliases_4_0,
                    							"es.udima.tfm.cesarlaso.IotDsl.Pin");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalIotDsl.g:972:4: (otherlv_5= ',' ( (lv_gpioAliases_6_0= rulePin ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==16) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalIotDsl.g:973:5: otherlv_5= ',' ( (lv_gpioAliases_6_0= rulePin ) )
                    	    {
                    	    otherlv_5=(Token)match(input,16,FOLLOW_17); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getProgramAccess().getCommaKeyword_2_3_0());
                    	    				
                    	    // InternalIotDsl.g:977:5: ( (lv_gpioAliases_6_0= rulePin ) )
                    	    // InternalIotDsl.g:978:6: (lv_gpioAliases_6_0= rulePin )
                    	    {
                    	    // InternalIotDsl.g:978:6: (lv_gpioAliases_6_0= rulePin )
                    	    // InternalIotDsl.g:979:7: lv_gpioAliases_6_0= rulePin
                    	    {

                    	    							newCompositeNode(grammarAccess.getProgramAccess().getGpioAliasesPinParserRuleCall_2_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_gpioAliases_6_0=rulePin();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getProgramRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"gpioAliases",
                    	    								lv_gpioAliases_6_0,
                    	    								"es.udima.tfm.cesarlaso.IotDsl.Pin");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,17,FOLLOW_18); 

                    				newLeafNode(otherlv_7, grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_2_4());
                    			

                    }
                    break;

            }

            // InternalIotDsl.g:1002:3: (otherlv_8= 'remote_identifiers' otherlv_9= '{' ( (lv_remoteIdentifiers_10_0= ruleRemoteIdentifier ) ) (otherlv_11= ',' ( (lv_remoteIdentifiers_12_0= ruleRemoteIdentifier ) ) )* otherlv_13= '}' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==22) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalIotDsl.g:1003:4: otherlv_8= 'remote_identifiers' otherlv_9= '{' ( (lv_remoteIdentifiers_10_0= ruleRemoteIdentifier ) ) (otherlv_11= ',' ( (lv_remoteIdentifiers_12_0= ruleRemoteIdentifier ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,22,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getProgramAccess().getRemote_identifiersKeyword_3_0());
                    			
                    otherlv_9=(Token)match(input,12,FOLLOW_19); 

                    				newLeafNode(otherlv_9, grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalIotDsl.g:1011:4: ( (lv_remoteIdentifiers_10_0= ruleRemoteIdentifier ) )
                    // InternalIotDsl.g:1012:5: (lv_remoteIdentifiers_10_0= ruleRemoteIdentifier )
                    {
                    // InternalIotDsl.g:1012:5: (lv_remoteIdentifiers_10_0= ruleRemoteIdentifier )
                    // InternalIotDsl.g:1013:6: lv_remoteIdentifiers_10_0= ruleRemoteIdentifier
                    {

                    						newCompositeNode(grammarAccess.getProgramAccess().getRemoteIdentifiersRemoteIdentifierParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_remoteIdentifiers_10_0=ruleRemoteIdentifier();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProgramRule());
                    						}
                    						add(
                    							current,
                    							"remoteIdentifiers",
                    							lv_remoteIdentifiers_10_0,
                    							"es.udima.tfm.cesarlaso.IotDsl.RemoteIdentifier");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalIotDsl.g:1030:4: (otherlv_11= ',' ( (lv_remoteIdentifiers_12_0= ruleRemoteIdentifier ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==16) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalIotDsl.g:1031:5: otherlv_11= ',' ( (lv_remoteIdentifiers_12_0= ruleRemoteIdentifier ) )
                    	    {
                    	    otherlv_11=(Token)match(input,16,FOLLOW_19); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getProgramAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalIotDsl.g:1035:5: ( (lv_remoteIdentifiers_12_0= ruleRemoteIdentifier ) )
                    	    // InternalIotDsl.g:1036:6: (lv_remoteIdentifiers_12_0= ruleRemoteIdentifier )
                    	    {
                    	    // InternalIotDsl.g:1036:6: (lv_remoteIdentifiers_12_0= ruleRemoteIdentifier )
                    	    // InternalIotDsl.g:1037:7: lv_remoteIdentifiers_12_0= ruleRemoteIdentifier
                    	    {

                    	    							newCompositeNode(grammarAccess.getProgramAccess().getRemoteIdentifiersRemoteIdentifierParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_remoteIdentifiers_12_0=ruleRemoteIdentifier();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getProgramRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"remoteIdentifiers",
                    	    								lv_remoteIdentifiers_12_0,
                    	    								"es.udima.tfm.cesarlaso.IotDsl.RemoteIdentifier");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,17,FOLLOW_20); 

                    				newLeafNode(otherlv_13, grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalIotDsl.g:1060:3: (otherlv_14= 'files' otherlv_15= '{' ( (lv_files_16_0= ruleFilePath ) ) (otherlv_17= ',' ( (lv_files_18_0= ruleFilePath ) ) )* otherlv_19= '}' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==23) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalIotDsl.g:1061:4: otherlv_14= 'files' otherlv_15= '{' ( (lv_files_16_0= ruleFilePath ) ) (otherlv_17= ',' ( (lv_files_18_0= ruleFilePath ) ) )* otherlv_19= '}'
                    {
                    otherlv_14=(Token)match(input,23,FOLLOW_4); 

                    				newLeafNode(otherlv_14, grammarAccess.getProgramAccess().getFilesKeyword_4_0());
                    			
                    otherlv_15=(Token)match(input,12,FOLLOW_21); 

                    				newLeafNode(otherlv_15, grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalIotDsl.g:1069:4: ( (lv_files_16_0= ruleFilePath ) )
                    // InternalIotDsl.g:1070:5: (lv_files_16_0= ruleFilePath )
                    {
                    // InternalIotDsl.g:1070:5: (lv_files_16_0= ruleFilePath )
                    // InternalIotDsl.g:1071:6: lv_files_16_0= ruleFilePath
                    {

                    						newCompositeNode(grammarAccess.getProgramAccess().getFilesFilePathParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_files_16_0=ruleFilePath();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProgramRule());
                    						}
                    						add(
                    							current,
                    							"files",
                    							lv_files_16_0,
                    							"es.udima.tfm.cesarlaso.IotDsl.FilePath");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalIotDsl.g:1088:4: (otherlv_17= ',' ( (lv_files_18_0= ruleFilePath ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==16) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalIotDsl.g:1089:5: otherlv_17= ',' ( (lv_files_18_0= ruleFilePath ) )
                    	    {
                    	    otherlv_17=(Token)match(input,16,FOLLOW_21); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getProgramAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalIotDsl.g:1093:5: ( (lv_files_18_0= ruleFilePath ) )
                    	    // InternalIotDsl.g:1094:6: (lv_files_18_0= ruleFilePath )
                    	    {
                    	    // InternalIotDsl.g:1094:6: (lv_files_18_0= ruleFilePath )
                    	    // InternalIotDsl.g:1095:7: lv_files_18_0= ruleFilePath
                    	    {

                    	    							newCompositeNode(grammarAccess.getProgramAccess().getFilesFilePathParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_files_18_0=ruleFilePath();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getProgramRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"files",
                    	    								lv_files_18_0,
                    	    								"es.udima.tfm.cesarlaso.IotDsl.FilePath");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,17,FOLLOW_22); 

                    				newLeafNode(otherlv_19, grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_20=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_20, grammarAccess.getProgramAccess().getStart_stateKeyword_5());
            		
            // InternalIotDsl.g:1122:3: ( ( ruleEString ) )
            // InternalIotDsl.g:1123:4: ( ruleEString )
            {
            // InternalIotDsl.g:1123:4: ( ruleEString )
            // InternalIotDsl.g:1124:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProgramRule());
            					}
            				

            					newCompositeNode(grammarAccess.getProgramAccess().getStateProgramStateCrossReference_6_0());
            				
            pushFollow(FOLLOW_23);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_22=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_22, grammarAccess.getProgramAccess().getStatesKeyword_7());
            		
            otherlv_23=(Token)match(input,12,FOLLOW_24); 

            			newLeafNode(otherlv_23, grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalIotDsl.g:1146:3: ( (lv_states_24_0= ruleProgramState ) )
            // InternalIotDsl.g:1147:4: (lv_states_24_0= ruleProgramState )
            {
            // InternalIotDsl.g:1147:4: (lv_states_24_0= ruleProgramState )
            // InternalIotDsl.g:1148:5: lv_states_24_0= ruleProgramState
            {

            					newCompositeNode(grammarAccess.getProgramAccess().getStatesProgramStateParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_10);
            lv_states_24_0=ruleProgramState();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProgramRule());
            					}
            					add(
            						current,
            						"states",
            						lv_states_24_0,
            						"es.udima.tfm.cesarlaso.IotDsl.ProgramState");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalIotDsl.g:1165:3: (otherlv_25= ',' ( (lv_states_26_0= ruleProgramState ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==16) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalIotDsl.g:1166:4: otherlv_25= ',' ( (lv_states_26_0= ruleProgramState ) )
            	    {
            	    otherlv_25=(Token)match(input,16,FOLLOW_24); 

            	    				newLeafNode(otherlv_25, grammarAccess.getProgramAccess().getCommaKeyword_10_0());
            	    			
            	    // InternalIotDsl.g:1170:4: ( (lv_states_26_0= ruleProgramState ) )
            	    // InternalIotDsl.g:1171:5: (lv_states_26_0= ruleProgramState )
            	    {
            	    // InternalIotDsl.g:1171:5: (lv_states_26_0= ruleProgramState )
            	    // InternalIotDsl.g:1172:6: lv_states_26_0= ruleProgramState
            	    {

            	    						newCompositeNode(grammarAccess.getProgramAccess().getStatesProgramStateParserRuleCall_10_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_states_26_0=ruleProgramState();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getProgramRule());
            	    						}
            	    						add(
            	    							current,
            	    							"states",
            	    							lv_states_26_0,
            	    							"es.udima.tfm.cesarlaso.IotDsl.ProgramState");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_27=(Token)match(input,17,FOLLOW_14); 

            			newLeafNode(otherlv_27, grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_11());
            		
            otherlv_28=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_28, grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_12());
            		

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
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleProgramState"
    // InternalIotDsl.g:1202:1: entryRuleProgramState returns [EObject current=null] : iv_ruleProgramState= ruleProgramState EOF ;
    public final EObject entryRuleProgramState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgramState = null;


        try {
            // InternalIotDsl.g:1202:53: (iv_ruleProgramState= ruleProgramState EOF )
            // InternalIotDsl.g:1203:2: iv_ruleProgramState= ruleProgramState EOF
            {
             newCompositeNode(grammarAccess.getProgramStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProgramState=ruleProgramState();

            state._fsp--;

             current =iv_ruleProgramState; 
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
    // $ANTLR end "entryRuleProgramState"


    // $ANTLR start "ruleProgramState"
    // InternalIotDsl.g:1209:1: ruleProgramState returns [EObject current=null] : (otherlv_0= 'state' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_events_3_0= ruleEvent ) ) (otherlv_4= ',' ( (lv_events_5_0= ruleEvent ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleProgramState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_events_3_0 = null;

        EObject lv_events_5_0 = null;



        	enterRule();

        try {
            // InternalIotDsl.g:1215:2: ( (otherlv_0= 'state' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_events_3_0= ruleEvent ) ) (otherlv_4= ',' ( (lv_events_5_0= ruleEvent ) ) )* otherlv_6= '}' ) )
            // InternalIotDsl.g:1216:2: (otherlv_0= 'state' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_events_3_0= ruleEvent ) ) (otherlv_4= ',' ( (lv_events_5_0= ruleEvent ) ) )* otherlv_6= '}' )
            {
            // InternalIotDsl.g:1216:2: (otherlv_0= 'state' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_events_3_0= ruleEvent ) ) (otherlv_4= ',' ( (lv_events_5_0= ruleEvent ) ) )* otherlv_6= '}' )
            // InternalIotDsl.g:1217:3: otherlv_0= 'state' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_events_3_0= ruleEvent ) ) (otherlv_4= ',' ( (lv_events_5_0= ruleEvent ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getProgramStateAccess().getStateKeyword_0());
            		
            // InternalIotDsl.g:1221:3: ( (lv_name_1_0= ruleEString ) )
            // InternalIotDsl.g:1222:4: (lv_name_1_0= ruleEString )
            {
            // InternalIotDsl.g:1222:4: (lv_name_1_0= ruleEString )
            // InternalIotDsl.g:1223:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getProgramStateAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProgramStateRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"es.udima.tfm.cesarlaso.IotDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getProgramStateAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalIotDsl.g:1244:3: ( (lv_events_3_0= ruleEvent ) )
            // InternalIotDsl.g:1245:4: (lv_events_3_0= ruleEvent )
            {
            // InternalIotDsl.g:1245:4: (lv_events_3_0= ruleEvent )
            // InternalIotDsl.g:1246:5: lv_events_3_0= ruleEvent
            {

            					newCompositeNode(grammarAccess.getProgramStateAccess().getEventsEventParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_10);
            lv_events_3_0=ruleEvent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProgramStateRule());
            					}
            					add(
            						current,
            						"events",
            						lv_events_3_0,
            						"es.udima.tfm.cesarlaso.IotDsl.Event");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalIotDsl.g:1263:3: (otherlv_4= ',' ( (lv_events_5_0= ruleEvent ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==16) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalIotDsl.g:1264:4: otherlv_4= ',' ( (lv_events_5_0= ruleEvent ) )
            	    {
            	    otherlv_4=(Token)match(input,16,FOLLOW_25); 

            	    				newLeafNode(otherlv_4, grammarAccess.getProgramStateAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalIotDsl.g:1268:4: ( (lv_events_5_0= ruleEvent ) )
            	    // InternalIotDsl.g:1269:5: (lv_events_5_0= ruleEvent )
            	    {
            	    // InternalIotDsl.g:1269:5: (lv_events_5_0= ruleEvent )
            	    // InternalIotDsl.g:1270:6: lv_events_5_0= ruleEvent
            	    {

            	    						newCompositeNode(grammarAccess.getProgramStateAccess().getEventsEventParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_events_5_0=ruleEvent();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getProgramStateRule());
            	    						}
            	    						add(
            	    							current,
            	    							"events",
            	    							lv_events_5_0,
            	    							"es.udima.tfm.cesarlaso.IotDsl.Event");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            otherlv_6=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getProgramStateAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleProgramState"


    // $ANTLR start "entryRuleNetworkConnected"
    // InternalIotDsl.g:1296:1: entryRuleNetworkConnected returns [EObject current=null] : iv_ruleNetworkConnected= ruleNetworkConnected EOF ;
    public final EObject entryRuleNetworkConnected() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetworkConnected = null;


        try {
            // InternalIotDsl.g:1296:57: (iv_ruleNetworkConnected= ruleNetworkConnected EOF )
            // InternalIotDsl.g:1297:2: iv_ruleNetworkConnected= ruleNetworkConnected EOF
            {
             newCompositeNode(grammarAccess.getNetworkConnectedRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNetworkConnected=ruleNetworkConnected();

            state._fsp--;

             current =iv_ruleNetworkConnected; 
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
    // $ANTLR end "entryRuleNetworkConnected"


    // $ANTLR start "ruleNetworkConnected"
    // InternalIotDsl.g:1303:1: ruleNetworkConnected returns [EObject current=null] : (otherlv_0= 'network_connected' otherlv_1= '{' ( (lv_actuators_2_0= ruleActuator ) ) (otherlv_3= ',' ( (lv_actuators_4_0= ruleActuator ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleNetworkConnected() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_actuators_2_0 = null;

        EObject lv_actuators_4_0 = null;



        	enterRule();

        try {
            // InternalIotDsl.g:1309:2: ( (otherlv_0= 'network_connected' otherlv_1= '{' ( (lv_actuators_2_0= ruleActuator ) ) (otherlv_3= ',' ( (lv_actuators_4_0= ruleActuator ) ) )* otherlv_5= '}' ) )
            // InternalIotDsl.g:1310:2: (otherlv_0= 'network_connected' otherlv_1= '{' ( (lv_actuators_2_0= ruleActuator ) ) (otherlv_3= ',' ( (lv_actuators_4_0= ruleActuator ) ) )* otherlv_5= '}' )
            {
            // InternalIotDsl.g:1310:2: (otherlv_0= 'network_connected' otherlv_1= '{' ( (lv_actuators_2_0= ruleActuator ) ) (otherlv_3= ',' ( (lv_actuators_4_0= ruleActuator ) ) )* otherlv_5= '}' )
            // InternalIotDsl.g:1311:3: otherlv_0= 'network_connected' otherlv_1= '{' ( (lv_actuators_2_0= ruleActuator ) ) (otherlv_3= ',' ( (lv_actuators_4_0= ruleActuator ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getNetworkConnectedAccess().getNetwork_connectedKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getNetworkConnectedAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalIotDsl.g:1319:3: ( (lv_actuators_2_0= ruleActuator ) )
            // InternalIotDsl.g:1320:4: (lv_actuators_2_0= ruleActuator )
            {
            // InternalIotDsl.g:1320:4: (lv_actuators_2_0= ruleActuator )
            // InternalIotDsl.g:1321:5: lv_actuators_2_0= ruleActuator
            {

            					newCompositeNode(grammarAccess.getNetworkConnectedAccess().getActuatorsActuatorParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_10);
            lv_actuators_2_0=ruleActuator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNetworkConnectedRule());
            					}
            					add(
            						current,
            						"actuators",
            						lv_actuators_2_0,
            						"es.udima.tfm.cesarlaso.IotDsl.Actuator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalIotDsl.g:1338:3: (otherlv_3= ',' ( (lv_actuators_4_0= ruleActuator ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==16) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalIotDsl.g:1339:4: otherlv_3= ',' ( (lv_actuators_4_0= ruleActuator ) )
            	    {
            	    otherlv_3=(Token)match(input,16,FOLLOW_26); 

            	    				newLeafNode(otherlv_3, grammarAccess.getNetworkConnectedAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalIotDsl.g:1343:4: ( (lv_actuators_4_0= ruleActuator ) )
            	    // InternalIotDsl.g:1344:5: (lv_actuators_4_0= ruleActuator )
            	    {
            	    // InternalIotDsl.g:1344:5: (lv_actuators_4_0= ruleActuator )
            	    // InternalIotDsl.g:1345:6: lv_actuators_4_0= ruleActuator
            	    {

            	    						newCompositeNode(grammarAccess.getNetworkConnectedAccess().getActuatorsActuatorParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_actuators_4_0=ruleActuator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getNetworkConnectedRule());
            	    						}
            	    						add(
            	    							current,
            	    							"actuators",
            	    							lv_actuators_4_0,
            	    							"es.udima.tfm.cesarlaso.IotDsl.Actuator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getNetworkConnectedAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleNetworkConnected"


    // $ANTLR start "entryRuleNetworkDisconnected"
    // InternalIotDsl.g:1371:1: entryRuleNetworkDisconnected returns [EObject current=null] : iv_ruleNetworkDisconnected= ruleNetworkDisconnected EOF ;
    public final EObject entryRuleNetworkDisconnected() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetworkDisconnected = null;


        try {
            // InternalIotDsl.g:1371:60: (iv_ruleNetworkDisconnected= ruleNetworkDisconnected EOF )
            // InternalIotDsl.g:1372:2: iv_ruleNetworkDisconnected= ruleNetworkDisconnected EOF
            {
             newCompositeNode(grammarAccess.getNetworkDisconnectedRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNetworkDisconnected=ruleNetworkDisconnected();

            state._fsp--;

             current =iv_ruleNetworkDisconnected; 
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
    // $ANTLR end "entryRuleNetworkDisconnected"


    // $ANTLR start "ruleNetworkDisconnected"
    // InternalIotDsl.g:1378:1: ruleNetworkDisconnected returns [EObject current=null] : (otherlv_0= 'network_disconnected' otherlv_1= '{' ( (lv_actuators_2_0= ruleActuator ) ) (otherlv_3= ',' ( (lv_actuators_4_0= ruleActuator ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleNetworkDisconnected() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_actuators_2_0 = null;

        EObject lv_actuators_4_0 = null;



        	enterRule();

        try {
            // InternalIotDsl.g:1384:2: ( (otherlv_0= 'network_disconnected' otherlv_1= '{' ( (lv_actuators_2_0= ruleActuator ) ) (otherlv_3= ',' ( (lv_actuators_4_0= ruleActuator ) ) )* otherlv_5= '}' ) )
            // InternalIotDsl.g:1385:2: (otherlv_0= 'network_disconnected' otherlv_1= '{' ( (lv_actuators_2_0= ruleActuator ) ) (otherlv_3= ',' ( (lv_actuators_4_0= ruleActuator ) ) )* otherlv_5= '}' )
            {
            // InternalIotDsl.g:1385:2: (otherlv_0= 'network_disconnected' otherlv_1= '{' ( (lv_actuators_2_0= ruleActuator ) ) (otherlv_3= ',' ( (lv_actuators_4_0= ruleActuator ) ) )* otherlv_5= '}' )
            // InternalIotDsl.g:1386:3: otherlv_0= 'network_disconnected' otherlv_1= '{' ( (lv_actuators_2_0= ruleActuator ) ) (otherlv_3= ',' ( (lv_actuators_4_0= ruleActuator ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getNetworkDisconnectedAccess().getNetwork_disconnectedKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getNetworkDisconnectedAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalIotDsl.g:1394:3: ( (lv_actuators_2_0= ruleActuator ) )
            // InternalIotDsl.g:1395:4: (lv_actuators_2_0= ruleActuator )
            {
            // InternalIotDsl.g:1395:4: (lv_actuators_2_0= ruleActuator )
            // InternalIotDsl.g:1396:5: lv_actuators_2_0= ruleActuator
            {

            					newCompositeNode(grammarAccess.getNetworkDisconnectedAccess().getActuatorsActuatorParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_10);
            lv_actuators_2_0=ruleActuator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNetworkDisconnectedRule());
            					}
            					add(
            						current,
            						"actuators",
            						lv_actuators_2_0,
            						"es.udima.tfm.cesarlaso.IotDsl.Actuator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalIotDsl.g:1413:3: (otherlv_3= ',' ( (lv_actuators_4_0= ruleActuator ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==16) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalIotDsl.g:1414:4: otherlv_3= ',' ( (lv_actuators_4_0= ruleActuator ) )
            	    {
            	    otherlv_3=(Token)match(input,16,FOLLOW_26); 

            	    				newLeafNode(otherlv_3, grammarAccess.getNetworkDisconnectedAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalIotDsl.g:1418:4: ( (lv_actuators_4_0= ruleActuator ) )
            	    // InternalIotDsl.g:1419:5: (lv_actuators_4_0= ruleActuator )
            	    {
            	    // InternalIotDsl.g:1419:5: (lv_actuators_4_0= ruleActuator )
            	    // InternalIotDsl.g:1420:6: lv_actuators_4_0= ruleActuator
            	    {

            	    						newCompositeNode(grammarAccess.getNetworkDisconnectedAccess().getActuatorsActuatorParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_actuators_4_0=ruleActuator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getNetworkDisconnectedRule());
            	    						}
            	    						add(
            	    							current,
            	    							"actuators",
            	    							lv_actuators_4_0,
            	    							"es.udima.tfm.cesarlaso.IotDsl.Actuator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getNetworkDisconnectedAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleNetworkDisconnected"


    // $ANTLR start "entryRuleServerConnected"
    // InternalIotDsl.g:1446:1: entryRuleServerConnected returns [EObject current=null] : iv_ruleServerConnected= ruleServerConnected EOF ;
    public final EObject entryRuleServerConnected() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServerConnected = null;


        try {
            // InternalIotDsl.g:1446:56: (iv_ruleServerConnected= ruleServerConnected EOF )
            // InternalIotDsl.g:1447:2: iv_ruleServerConnected= ruleServerConnected EOF
            {
             newCompositeNode(grammarAccess.getServerConnectedRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleServerConnected=ruleServerConnected();

            state._fsp--;

             current =iv_ruleServerConnected; 
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
    // $ANTLR end "entryRuleServerConnected"


    // $ANTLR start "ruleServerConnected"
    // InternalIotDsl.g:1453:1: ruleServerConnected returns [EObject current=null] : (otherlv_0= 'server_connected' otherlv_1= '{' ( (lv_actuators_2_0= ruleActuator ) ) (otherlv_3= ',' ( (lv_actuators_4_0= ruleActuator ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleServerConnected() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_actuators_2_0 = null;

        EObject lv_actuators_4_0 = null;



        	enterRule();

        try {
            // InternalIotDsl.g:1459:2: ( (otherlv_0= 'server_connected' otherlv_1= '{' ( (lv_actuators_2_0= ruleActuator ) ) (otherlv_3= ',' ( (lv_actuators_4_0= ruleActuator ) ) )* otherlv_5= '}' ) )
            // InternalIotDsl.g:1460:2: (otherlv_0= 'server_connected' otherlv_1= '{' ( (lv_actuators_2_0= ruleActuator ) ) (otherlv_3= ',' ( (lv_actuators_4_0= ruleActuator ) ) )* otherlv_5= '}' )
            {
            // InternalIotDsl.g:1460:2: (otherlv_0= 'server_connected' otherlv_1= '{' ( (lv_actuators_2_0= ruleActuator ) ) (otherlv_3= ',' ( (lv_actuators_4_0= ruleActuator ) ) )* otherlv_5= '}' )
            // InternalIotDsl.g:1461:3: otherlv_0= 'server_connected' otherlv_1= '{' ( (lv_actuators_2_0= ruleActuator ) ) (otherlv_3= ',' ( (lv_actuators_4_0= ruleActuator ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getServerConnectedAccess().getServer_connectedKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getServerConnectedAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalIotDsl.g:1469:3: ( (lv_actuators_2_0= ruleActuator ) )
            // InternalIotDsl.g:1470:4: (lv_actuators_2_0= ruleActuator )
            {
            // InternalIotDsl.g:1470:4: (lv_actuators_2_0= ruleActuator )
            // InternalIotDsl.g:1471:5: lv_actuators_2_0= ruleActuator
            {

            					newCompositeNode(grammarAccess.getServerConnectedAccess().getActuatorsActuatorParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_10);
            lv_actuators_2_0=ruleActuator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getServerConnectedRule());
            					}
            					add(
            						current,
            						"actuators",
            						lv_actuators_2_0,
            						"es.udima.tfm.cesarlaso.IotDsl.Actuator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalIotDsl.g:1488:3: (otherlv_3= ',' ( (lv_actuators_4_0= ruleActuator ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==16) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalIotDsl.g:1489:4: otherlv_3= ',' ( (lv_actuators_4_0= ruleActuator ) )
            	    {
            	    otherlv_3=(Token)match(input,16,FOLLOW_26); 

            	    				newLeafNode(otherlv_3, grammarAccess.getServerConnectedAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalIotDsl.g:1493:4: ( (lv_actuators_4_0= ruleActuator ) )
            	    // InternalIotDsl.g:1494:5: (lv_actuators_4_0= ruleActuator )
            	    {
            	    // InternalIotDsl.g:1494:5: (lv_actuators_4_0= ruleActuator )
            	    // InternalIotDsl.g:1495:6: lv_actuators_4_0= ruleActuator
            	    {

            	    						newCompositeNode(grammarAccess.getServerConnectedAccess().getActuatorsActuatorParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_actuators_4_0=ruleActuator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getServerConnectedRule());
            	    						}
            	    						add(
            	    							current,
            	    							"actuators",
            	    							lv_actuators_4_0,
            	    							"es.udima.tfm.cesarlaso.IotDsl.Actuator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getServerConnectedAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleServerConnected"


    // $ANTLR start "entryRuleServerDisconnected"
    // InternalIotDsl.g:1521:1: entryRuleServerDisconnected returns [EObject current=null] : iv_ruleServerDisconnected= ruleServerDisconnected EOF ;
    public final EObject entryRuleServerDisconnected() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServerDisconnected = null;


        try {
            // InternalIotDsl.g:1521:59: (iv_ruleServerDisconnected= ruleServerDisconnected EOF )
            // InternalIotDsl.g:1522:2: iv_ruleServerDisconnected= ruleServerDisconnected EOF
            {
             newCompositeNode(grammarAccess.getServerDisconnectedRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleServerDisconnected=ruleServerDisconnected();

            state._fsp--;

             current =iv_ruleServerDisconnected; 
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
    // $ANTLR end "entryRuleServerDisconnected"


    // $ANTLR start "ruleServerDisconnected"
    // InternalIotDsl.g:1528:1: ruleServerDisconnected returns [EObject current=null] : (otherlv_0= 'server_disconnected' otherlv_1= '{' ( (lv_actuators_2_0= ruleActuator ) ) (otherlv_3= ',' ( (lv_actuators_4_0= ruleActuator ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleServerDisconnected() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_actuators_2_0 = null;

        EObject lv_actuators_4_0 = null;



        	enterRule();

        try {
            // InternalIotDsl.g:1534:2: ( (otherlv_0= 'server_disconnected' otherlv_1= '{' ( (lv_actuators_2_0= ruleActuator ) ) (otherlv_3= ',' ( (lv_actuators_4_0= ruleActuator ) ) )* otherlv_5= '}' ) )
            // InternalIotDsl.g:1535:2: (otherlv_0= 'server_disconnected' otherlv_1= '{' ( (lv_actuators_2_0= ruleActuator ) ) (otherlv_3= ',' ( (lv_actuators_4_0= ruleActuator ) ) )* otherlv_5= '}' )
            {
            // InternalIotDsl.g:1535:2: (otherlv_0= 'server_disconnected' otherlv_1= '{' ( (lv_actuators_2_0= ruleActuator ) ) (otherlv_3= ',' ( (lv_actuators_4_0= ruleActuator ) ) )* otherlv_5= '}' )
            // InternalIotDsl.g:1536:3: otherlv_0= 'server_disconnected' otherlv_1= '{' ( (lv_actuators_2_0= ruleActuator ) ) (otherlv_3= ',' ( (lv_actuators_4_0= ruleActuator ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getServerDisconnectedAccess().getServer_disconnectedKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getServerDisconnectedAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalIotDsl.g:1544:3: ( (lv_actuators_2_0= ruleActuator ) )
            // InternalIotDsl.g:1545:4: (lv_actuators_2_0= ruleActuator )
            {
            // InternalIotDsl.g:1545:4: (lv_actuators_2_0= ruleActuator )
            // InternalIotDsl.g:1546:5: lv_actuators_2_0= ruleActuator
            {

            					newCompositeNode(grammarAccess.getServerDisconnectedAccess().getActuatorsActuatorParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_10);
            lv_actuators_2_0=ruleActuator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getServerDisconnectedRule());
            					}
            					add(
            						current,
            						"actuators",
            						lv_actuators_2_0,
            						"es.udima.tfm.cesarlaso.IotDsl.Actuator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalIotDsl.g:1563:3: (otherlv_3= ',' ( (lv_actuators_4_0= ruleActuator ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==16) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalIotDsl.g:1564:4: otherlv_3= ',' ( (lv_actuators_4_0= ruleActuator ) )
            	    {
            	    otherlv_3=(Token)match(input,16,FOLLOW_26); 

            	    				newLeafNode(otherlv_3, grammarAccess.getServerDisconnectedAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalIotDsl.g:1568:4: ( (lv_actuators_4_0= ruleActuator ) )
            	    // InternalIotDsl.g:1569:5: (lv_actuators_4_0= ruleActuator )
            	    {
            	    // InternalIotDsl.g:1569:5: (lv_actuators_4_0= ruleActuator )
            	    // InternalIotDsl.g:1570:6: lv_actuators_4_0= ruleActuator
            	    {

            	    						newCompositeNode(grammarAccess.getServerDisconnectedAccess().getActuatorsActuatorParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_actuators_4_0=ruleActuator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getServerDisconnectedRule());
            	    						}
            	    						add(
            	    							current,
            	    							"actuators",
            	    							lv_actuators_4_0,
            	    							"es.udima.tfm.cesarlaso.IotDsl.Actuator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getServerDisconnectedAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleServerDisconnected"


    // $ANTLR start "entryRuleTimerEvent"
    // InternalIotDsl.g:1596:1: entryRuleTimerEvent returns [EObject current=null] : iv_ruleTimerEvent= ruleTimerEvent EOF ;
    public final EObject entryRuleTimerEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimerEvent = null;


        try {
            // InternalIotDsl.g:1596:51: (iv_ruleTimerEvent= ruleTimerEvent EOF )
            // InternalIotDsl.g:1597:2: iv_ruleTimerEvent= ruleTimerEvent EOF
            {
             newCompositeNode(grammarAccess.getTimerEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTimerEvent=ruleTimerEvent();

            state._fsp--;

             current =iv_ruleTimerEvent; 
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
    // $ANTLR end "entryRuleTimerEvent"


    // $ANTLR start "ruleTimerEvent"
    // InternalIotDsl.g:1603:1: ruleTimerEvent returns [EObject current=null] : (otherlv_0= 'timer' otherlv_1= '{' ( (lv_timer_2_0= ruleTimer ) ) otherlv_3= '{' ( (lv_actuators_4_0= ruleActuator ) ) (otherlv_5= ',' ( (lv_actuators_6_0= ruleActuator ) ) )* otherlv_7= '}' otherlv_8= '}' ) ;
    public final EObject ruleTimerEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_timer_2_0 = null;

        EObject lv_actuators_4_0 = null;

        EObject lv_actuators_6_0 = null;



        	enterRule();

        try {
            // InternalIotDsl.g:1609:2: ( (otherlv_0= 'timer' otherlv_1= '{' ( (lv_timer_2_0= ruleTimer ) ) otherlv_3= '{' ( (lv_actuators_4_0= ruleActuator ) ) (otherlv_5= ',' ( (lv_actuators_6_0= ruleActuator ) ) )* otherlv_7= '}' otherlv_8= '}' ) )
            // InternalIotDsl.g:1610:2: (otherlv_0= 'timer' otherlv_1= '{' ( (lv_timer_2_0= ruleTimer ) ) otherlv_3= '{' ( (lv_actuators_4_0= ruleActuator ) ) (otherlv_5= ',' ( (lv_actuators_6_0= ruleActuator ) ) )* otherlv_7= '}' otherlv_8= '}' )
            {
            // InternalIotDsl.g:1610:2: (otherlv_0= 'timer' otherlv_1= '{' ( (lv_timer_2_0= ruleTimer ) ) otherlv_3= '{' ( (lv_actuators_4_0= ruleActuator ) ) (otherlv_5= ',' ( (lv_actuators_6_0= ruleActuator ) ) )* otherlv_7= '}' otherlv_8= '}' )
            // InternalIotDsl.g:1611:3: otherlv_0= 'timer' otherlv_1= '{' ( (lv_timer_2_0= ruleTimer ) ) otherlv_3= '{' ( (lv_actuators_4_0= ruleActuator ) ) (otherlv_5= ',' ( (lv_actuators_6_0= ruleActuator ) ) )* otherlv_7= '}' otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTimerEventAccess().getTimerKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getTimerEventAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalIotDsl.g:1619:3: ( (lv_timer_2_0= ruleTimer ) )
            // InternalIotDsl.g:1620:4: (lv_timer_2_0= ruleTimer )
            {
            // InternalIotDsl.g:1620:4: (lv_timer_2_0= ruleTimer )
            // InternalIotDsl.g:1621:5: lv_timer_2_0= ruleTimer
            {

            					newCompositeNode(grammarAccess.getTimerEventAccess().getTimerTimerParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_timer_2_0=ruleTimer();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTimerEventRule());
            					}
            					set(
            						current,
            						"timer",
            						lv_timer_2_0,
            						"es.udima.tfm.cesarlaso.IotDsl.Timer");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_3, grammarAccess.getTimerEventAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalIotDsl.g:1642:3: ( (lv_actuators_4_0= ruleActuator ) )
            // InternalIotDsl.g:1643:4: (lv_actuators_4_0= ruleActuator )
            {
            // InternalIotDsl.g:1643:4: (lv_actuators_4_0= ruleActuator )
            // InternalIotDsl.g:1644:5: lv_actuators_4_0= ruleActuator
            {

            					newCompositeNode(grammarAccess.getTimerEventAccess().getActuatorsActuatorParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_10);
            lv_actuators_4_0=ruleActuator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTimerEventRule());
            					}
            					add(
            						current,
            						"actuators",
            						lv_actuators_4_0,
            						"es.udima.tfm.cesarlaso.IotDsl.Actuator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalIotDsl.g:1661:3: (otherlv_5= ',' ( (lv_actuators_6_0= ruleActuator ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==16) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalIotDsl.g:1662:4: otherlv_5= ',' ( (lv_actuators_6_0= ruleActuator ) )
            	    {
            	    otherlv_5=(Token)match(input,16,FOLLOW_26); 

            	    				newLeafNode(otherlv_5, grammarAccess.getTimerEventAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalIotDsl.g:1666:4: ( (lv_actuators_6_0= ruleActuator ) )
            	    // InternalIotDsl.g:1667:5: (lv_actuators_6_0= ruleActuator )
            	    {
            	    // InternalIotDsl.g:1667:5: (lv_actuators_6_0= ruleActuator )
            	    // InternalIotDsl.g:1668:6: lv_actuators_6_0= ruleActuator
            	    {

            	    						newCompositeNode(grammarAccess.getTimerEventAccess().getActuatorsActuatorParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_actuators_6_0=ruleActuator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTimerEventRule());
            	    						}
            	    						add(
            	    							current,
            	    							"actuators",
            	    							lv_actuators_6_0,
            	    							"es.udima.tfm.cesarlaso.IotDsl.Actuator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            otherlv_7=(Token)match(input,17,FOLLOW_14); 

            			newLeafNode(otherlv_7, grammarAccess.getTimerEventAccess().getRightCurlyBracketKeyword_6());
            		
            otherlv_8=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getTimerEventAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleTimerEvent"


    // $ANTLR start "entryRuleNow"
    // InternalIotDsl.g:1698:1: entryRuleNow returns [EObject current=null] : iv_ruleNow= ruleNow EOF ;
    public final EObject entryRuleNow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNow = null;


        try {
            // InternalIotDsl.g:1698:44: (iv_ruleNow= ruleNow EOF )
            // InternalIotDsl.g:1699:2: iv_ruleNow= ruleNow EOF
            {
             newCompositeNode(grammarAccess.getNowRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNow=ruleNow();

            state._fsp--;

             current =iv_ruleNow; 
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
    // $ANTLR end "entryRuleNow"


    // $ANTLR start "ruleNow"
    // InternalIotDsl.g:1705:1: ruleNow returns [EObject current=null] : (otherlv_0= 'now' () ) ;
    public final EObject ruleNow() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalIotDsl.g:1711:2: ( (otherlv_0= 'now' () ) )
            // InternalIotDsl.g:1712:2: (otherlv_0= 'now' () )
            {
            // InternalIotDsl.g:1712:2: (otherlv_0= 'now' () )
            // InternalIotDsl.g:1713:3: otherlv_0= 'now' ()
            {
            otherlv_0=(Token)match(input,32,FOLLOW_2); 

            			newLeafNode(otherlv_0, grammarAccess.getNowAccess().getNowKeyword_0());
            		
            // InternalIotDsl.g:1717:3: ()
            // InternalIotDsl.g:1718:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNowAccess().getNowAction_1(),
            					current);
            			

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
    // $ANTLR end "ruleNow"


    // $ANTLR start "entryRuleRepeated"
    // InternalIotDsl.g:1728:1: entryRuleRepeated returns [EObject current=null] : iv_ruleRepeated= ruleRepeated EOF ;
    public final EObject entryRuleRepeated() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepeated = null;


        try {
            // InternalIotDsl.g:1728:49: (iv_ruleRepeated= ruleRepeated EOF )
            // InternalIotDsl.g:1729:2: iv_ruleRepeated= ruleRepeated EOF
            {
             newCompositeNode(grammarAccess.getRepeatedRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRepeated=ruleRepeated();

            state._fsp--;

             current =iv_ruleRepeated; 
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
    // $ANTLR end "entryRuleRepeated"


    // $ANTLR start "ruleRepeated"
    // InternalIotDsl.g:1735:1: ruleRepeated returns [EObject current=null] : (otherlv_0= 'repeat_every' ( (lv_value_1_0= ruleTimeUnitValue ) ) ) ;
    public final EObject ruleRepeated() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalIotDsl.g:1741:2: ( (otherlv_0= 'repeat_every' ( (lv_value_1_0= ruleTimeUnitValue ) ) ) )
            // InternalIotDsl.g:1742:2: (otherlv_0= 'repeat_every' ( (lv_value_1_0= ruleTimeUnitValue ) ) )
            {
            // InternalIotDsl.g:1742:2: (otherlv_0= 'repeat_every' ( (lv_value_1_0= ruleTimeUnitValue ) ) )
            // InternalIotDsl.g:1743:3: otherlv_0= 'repeat_every' ( (lv_value_1_0= ruleTimeUnitValue ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getRepeatedAccess().getRepeat_everyKeyword_0());
            		
            // InternalIotDsl.g:1747:3: ( (lv_value_1_0= ruleTimeUnitValue ) )
            // InternalIotDsl.g:1748:4: (lv_value_1_0= ruleTimeUnitValue )
            {
            // InternalIotDsl.g:1748:4: (lv_value_1_0= ruleTimeUnitValue )
            // InternalIotDsl.g:1749:5: lv_value_1_0= ruleTimeUnitValue
            {

            					newCompositeNode(grammarAccess.getRepeatedAccess().getValueTimeUnitValueParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_1_0=ruleTimeUnitValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRepeatedRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
            						"es.udima.tfm.cesarlaso.IotDsl.TimeUnitValue");
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
    // $ANTLR end "ruleRepeated"


    // $ANTLR start "entryRuleClock"
    // InternalIotDsl.g:1770:1: entryRuleClock returns [EObject current=null] : iv_ruleClock= ruleClock EOF ;
    public final EObject entryRuleClock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClock = null;


        try {
            // InternalIotDsl.g:1770:46: (iv_ruleClock= ruleClock EOF )
            // InternalIotDsl.g:1771:2: iv_ruleClock= ruleClock EOF
            {
             newCompositeNode(grammarAccess.getClockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClock=ruleClock();

            state._fsp--;

             current =iv_ruleClock; 
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
    // $ANTLR end "entryRuleClock"


    // $ANTLR start "ruleClock"
    // InternalIotDsl.g:1777:1: ruleClock returns [EObject current=null] : (otherlv_0= 'clock' ( (lv_value_1_0= ruleTime ) ) ) ;
    public final EObject ruleClock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalIotDsl.g:1783:2: ( (otherlv_0= 'clock' ( (lv_value_1_0= ruleTime ) ) ) )
            // InternalIotDsl.g:1784:2: (otherlv_0= 'clock' ( (lv_value_1_0= ruleTime ) ) )
            {
            // InternalIotDsl.g:1784:2: (otherlv_0= 'clock' ( (lv_value_1_0= ruleTime ) ) )
            // InternalIotDsl.g:1785:3: otherlv_0= 'clock' ( (lv_value_1_0= ruleTime ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getClockAccess().getClockKeyword_0());
            		
            // InternalIotDsl.g:1789:3: ( (lv_value_1_0= ruleTime ) )
            // InternalIotDsl.g:1790:4: (lv_value_1_0= ruleTime )
            {
            // InternalIotDsl.g:1790:4: (lv_value_1_0= ruleTime )
            // InternalIotDsl.g:1791:5: lv_value_1_0= ruleTime
            {

            					newCompositeNode(grammarAccess.getClockAccess().getValueTimeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_1_0=ruleTime();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClockRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
            						"es.udima.tfm.cesarlaso.IotDsl.Time");
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
    // $ANTLR end "ruleClock"


    // $ANTLR start "entryRuleCron"
    // InternalIotDsl.g:1812:1: entryRuleCron returns [EObject current=null] : iv_ruleCron= ruleCron EOF ;
    public final EObject entryRuleCron() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCron = null;


        try {
            // InternalIotDsl.g:1812:45: (iv_ruleCron= ruleCron EOF )
            // InternalIotDsl.g:1813:2: iv_ruleCron= ruleCron EOF
            {
             newCompositeNode(grammarAccess.getCronRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCron=ruleCron();

            state._fsp--;

             current =iv_ruleCron; 
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
    // $ANTLR end "entryRuleCron"


    // $ANTLR start "ruleCron"
    // InternalIotDsl.g:1819:1: ruleCron returns [EObject current=null] : (otherlv_0= 'cron' ( (lv_value_1_0= ruleEString ) ) ) ;
    public final EObject ruleCron() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalIotDsl.g:1825:2: ( (otherlv_0= 'cron' ( (lv_value_1_0= ruleEString ) ) ) )
            // InternalIotDsl.g:1826:2: (otherlv_0= 'cron' ( (lv_value_1_0= ruleEString ) ) )
            {
            // InternalIotDsl.g:1826:2: (otherlv_0= 'cron' ( (lv_value_1_0= ruleEString ) ) )
            // InternalIotDsl.g:1827:3: otherlv_0= 'cron' ( (lv_value_1_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCronAccess().getCronKeyword_0());
            		
            // InternalIotDsl.g:1831:3: ( (lv_value_1_0= ruleEString ) )
            // InternalIotDsl.g:1832:4: (lv_value_1_0= ruleEString )
            {
            // InternalIotDsl.g:1832:4: (lv_value_1_0= ruleEString )
            // InternalIotDsl.g:1833:5: lv_value_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCronAccess().getValueEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCronRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
            						"es.udima.tfm.cesarlaso.IotDsl.EString");
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
    // $ANTLR end "ruleCron"


    // $ANTLR start "entryRuleGpioInterrupted"
    // InternalIotDsl.g:1854:1: entryRuleGpioInterrupted returns [EObject current=null] : iv_ruleGpioInterrupted= ruleGpioInterrupted EOF ;
    public final EObject entryRuleGpioInterrupted() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGpioInterrupted = null;


        try {
            // InternalIotDsl.g:1854:56: (iv_ruleGpioInterrupted= ruleGpioInterrupted EOF )
            // InternalIotDsl.g:1855:2: iv_ruleGpioInterrupted= ruleGpioInterrupted EOF
            {
             newCompositeNode(grammarAccess.getGpioInterruptedRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGpioInterrupted=ruleGpioInterrupted();

            state._fsp--;

             current =iv_ruleGpioInterrupted; 
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
    // $ANTLR end "entryRuleGpioInterrupted"


    // $ANTLR start "ruleGpioInterrupted"
    // InternalIotDsl.g:1861:1: ruleGpioInterrupted returns [EObject current=null] : (otherlv_0= 'interrupted' ( ( ruleEString ) ) ( (lv_mode_2_0= ruleGpioInterruptMode ) ) otherlv_3= '{' ( (lv_actuators_4_0= ruleActuator ) ) (otherlv_5= ',' ( (lv_actuators_6_0= ruleActuator ) ) )* otherlv_7= '}' ) ;
    public final EObject ruleGpioInterrupted() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Enumerator lv_mode_2_0 = null;

        EObject lv_actuators_4_0 = null;

        EObject lv_actuators_6_0 = null;



        	enterRule();

        try {
            // InternalIotDsl.g:1867:2: ( (otherlv_0= 'interrupted' ( ( ruleEString ) ) ( (lv_mode_2_0= ruleGpioInterruptMode ) ) otherlv_3= '{' ( (lv_actuators_4_0= ruleActuator ) ) (otherlv_5= ',' ( (lv_actuators_6_0= ruleActuator ) ) )* otherlv_7= '}' ) )
            // InternalIotDsl.g:1868:2: (otherlv_0= 'interrupted' ( ( ruleEString ) ) ( (lv_mode_2_0= ruleGpioInterruptMode ) ) otherlv_3= '{' ( (lv_actuators_4_0= ruleActuator ) ) (otherlv_5= ',' ( (lv_actuators_6_0= ruleActuator ) ) )* otherlv_7= '}' )
            {
            // InternalIotDsl.g:1868:2: (otherlv_0= 'interrupted' ( ( ruleEString ) ) ( (lv_mode_2_0= ruleGpioInterruptMode ) ) otherlv_3= '{' ( (lv_actuators_4_0= ruleActuator ) ) (otherlv_5= ',' ( (lv_actuators_6_0= ruleActuator ) ) )* otherlv_7= '}' )
            // InternalIotDsl.g:1869:3: otherlv_0= 'interrupted' ( ( ruleEString ) ) ( (lv_mode_2_0= ruleGpioInterruptMode ) ) otherlv_3= '{' ( (lv_actuators_4_0= ruleActuator ) ) (otherlv_5= ',' ( (lv_actuators_6_0= ruleActuator ) ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGpioInterruptedAccess().getInterruptedKeyword_0());
            		
            // InternalIotDsl.g:1873:3: ( ( ruleEString ) )
            // InternalIotDsl.g:1874:4: ( ruleEString )
            {
            // InternalIotDsl.g:1874:4: ( ruleEString )
            // InternalIotDsl.g:1875:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGpioInterruptedRule());
            					}
            				

            					newCompositeNode(grammarAccess.getGpioInterruptedAccess().getPinDigitalInputPinCrossReference_1_0());
            				
            pushFollow(FOLLOW_28);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalIotDsl.g:1889:3: ( (lv_mode_2_0= ruleGpioInterruptMode ) )
            // InternalIotDsl.g:1890:4: (lv_mode_2_0= ruleGpioInterruptMode )
            {
            // InternalIotDsl.g:1890:4: (lv_mode_2_0= ruleGpioInterruptMode )
            // InternalIotDsl.g:1891:5: lv_mode_2_0= ruleGpioInterruptMode
            {

            					newCompositeNode(grammarAccess.getGpioInterruptedAccess().getModeGpioInterruptModeEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_mode_2_0=ruleGpioInterruptMode();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGpioInterruptedRule());
            					}
            					set(
            						current,
            						"mode",
            						lv_mode_2_0,
            						"es.udima.tfm.cesarlaso.IotDsl.GpioInterruptMode");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_3, grammarAccess.getGpioInterruptedAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalIotDsl.g:1912:3: ( (lv_actuators_4_0= ruleActuator ) )
            // InternalIotDsl.g:1913:4: (lv_actuators_4_0= ruleActuator )
            {
            // InternalIotDsl.g:1913:4: (lv_actuators_4_0= ruleActuator )
            // InternalIotDsl.g:1914:5: lv_actuators_4_0= ruleActuator
            {

            					newCompositeNode(grammarAccess.getGpioInterruptedAccess().getActuatorsActuatorParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_10);
            lv_actuators_4_0=ruleActuator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGpioInterruptedRule());
            					}
            					add(
            						current,
            						"actuators",
            						lv_actuators_4_0,
            						"es.udima.tfm.cesarlaso.IotDsl.Actuator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalIotDsl.g:1931:3: (otherlv_5= ',' ( (lv_actuators_6_0= ruleActuator ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==16) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalIotDsl.g:1932:4: otherlv_5= ',' ( (lv_actuators_6_0= ruleActuator ) )
            	    {
            	    otherlv_5=(Token)match(input,16,FOLLOW_26); 

            	    				newLeafNode(otherlv_5, grammarAccess.getGpioInterruptedAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalIotDsl.g:1936:4: ( (lv_actuators_6_0= ruleActuator ) )
            	    // InternalIotDsl.g:1937:5: (lv_actuators_6_0= ruleActuator )
            	    {
            	    // InternalIotDsl.g:1937:5: (lv_actuators_6_0= ruleActuator )
            	    // InternalIotDsl.g:1938:6: lv_actuators_6_0= ruleActuator
            	    {

            	    						newCompositeNode(grammarAccess.getGpioInterruptedAccess().getActuatorsActuatorParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_actuators_6_0=ruleActuator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGpioInterruptedRule());
            	    						}
            	    						add(
            	    							current,
            	    							"actuators",
            	    							lv_actuators_6_0,
            	    							"es.udima.tfm.cesarlaso.IotDsl.Actuator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            otherlv_7=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getGpioInterruptedAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleGpioInterrupted"


    // $ANTLR start "entryRuleGpioButtonInput"
    // InternalIotDsl.g:1964:1: entryRuleGpioButtonInput returns [EObject current=null] : iv_ruleGpioButtonInput= ruleGpioButtonInput EOF ;
    public final EObject entryRuleGpioButtonInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGpioButtonInput = null;


        try {
            // InternalIotDsl.g:1964:56: (iv_ruleGpioButtonInput= ruleGpioButtonInput EOF )
            // InternalIotDsl.g:1965:2: iv_ruleGpioButtonInput= ruleGpioButtonInput EOF
            {
             newCompositeNode(grammarAccess.getGpioButtonInputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGpioButtonInput=ruleGpioButtonInput();

            state._fsp--;

             current =iv_ruleGpioButtonInput; 
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
    // $ANTLR end "entryRuleGpioButtonInput"


    // $ANTLR start "ruleGpioButtonInput"
    // InternalIotDsl.g:1971:1: ruleGpioButtonInput returns [EObject current=null] : (otherlv_0= 'button' ( ( ruleEString ) ) otherlv_2= '{' otherlv_3= 'mode' ( (lv_mode_4_0= rulePinResistor ) ) otherlv_5= 'min_duration' ( (lv_minDuration_6_0= ruleEInt ) ) otherlv_7= '{' ( (lv_actuators_8_0= ruleActuator ) ) (otherlv_9= ',' ( (lv_actuators_10_0= ruleActuator ) ) )* otherlv_11= '}' otherlv_12= '}' ) ;
    public final EObject ruleGpioButtonInput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Enumerator lv_mode_4_0 = null;

        AntlrDatatypeRuleToken lv_minDuration_6_0 = null;

        EObject lv_actuators_8_0 = null;

        EObject lv_actuators_10_0 = null;



        	enterRule();

        try {
            // InternalIotDsl.g:1977:2: ( (otherlv_0= 'button' ( ( ruleEString ) ) otherlv_2= '{' otherlv_3= 'mode' ( (lv_mode_4_0= rulePinResistor ) ) otherlv_5= 'min_duration' ( (lv_minDuration_6_0= ruleEInt ) ) otherlv_7= '{' ( (lv_actuators_8_0= ruleActuator ) ) (otherlv_9= ',' ( (lv_actuators_10_0= ruleActuator ) ) )* otherlv_11= '}' otherlv_12= '}' ) )
            // InternalIotDsl.g:1978:2: (otherlv_0= 'button' ( ( ruleEString ) ) otherlv_2= '{' otherlv_3= 'mode' ( (lv_mode_4_0= rulePinResistor ) ) otherlv_5= 'min_duration' ( (lv_minDuration_6_0= ruleEInt ) ) otherlv_7= '{' ( (lv_actuators_8_0= ruleActuator ) ) (otherlv_9= ',' ( (lv_actuators_10_0= ruleActuator ) ) )* otherlv_11= '}' otherlv_12= '}' )
            {
            // InternalIotDsl.g:1978:2: (otherlv_0= 'button' ( ( ruleEString ) ) otherlv_2= '{' otherlv_3= 'mode' ( (lv_mode_4_0= rulePinResistor ) ) otherlv_5= 'min_duration' ( (lv_minDuration_6_0= ruleEInt ) ) otherlv_7= '{' ( (lv_actuators_8_0= ruleActuator ) ) (otherlv_9= ',' ( (lv_actuators_10_0= ruleActuator ) ) )* otherlv_11= '}' otherlv_12= '}' )
            // InternalIotDsl.g:1979:3: otherlv_0= 'button' ( ( ruleEString ) ) otherlv_2= '{' otherlv_3= 'mode' ( (lv_mode_4_0= rulePinResistor ) ) otherlv_5= 'min_duration' ( (lv_minDuration_6_0= ruleEInt ) ) otherlv_7= '{' ( (lv_actuators_8_0= ruleActuator ) ) (otherlv_9= ',' ( (lv_actuators_10_0= ruleActuator ) ) )* otherlv_11= '}' otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGpioButtonInputAccess().getButtonKeyword_0());
            		
            // InternalIotDsl.g:1983:3: ( ( ruleEString ) )
            // InternalIotDsl.g:1984:4: ( ruleEString )
            {
            // InternalIotDsl.g:1984:4: ( ruleEString )
            // InternalIotDsl.g:1985:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGpioButtonInputRule());
            					}
            				

            					newCompositeNode(grammarAccess.getGpioButtonInputAccess().getPinDigitalInputPinCrossReference_1_0());
            				
            pushFollow(FOLLOW_4);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getGpioButtonInputAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,38,FOLLOW_30); 

            			newLeafNode(otherlv_3, grammarAccess.getGpioButtonInputAccess().getModeKeyword_3());
            		
            // InternalIotDsl.g:2007:3: ( (lv_mode_4_0= rulePinResistor ) )
            // InternalIotDsl.g:2008:4: (lv_mode_4_0= rulePinResistor )
            {
            // InternalIotDsl.g:2008:4: (lv_mode_4_0= rulePinResistor )
            // InternalIotDsl.g:2009:5: lv_mode_4_0= rulePinResistor
            {

            					newCompositeNode(grammarAccess.getGpioButtonInputAccess().getModePinResistorEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_31);
            lv_mode_4_0=rulePinResistor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGpioButtonInputRule());
            					}
            					set(
            						current,
            						"mode",
            						lv_mode_4_0,
            						"es.udima.tfm.cesarlaso.IotDsl.PinResistor");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,39,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getGpioButtonInputAccess().getMin_durationKeyword_5());
            		
            // InternalIotDsl.g:2030:3: ( (lv_minDuration_6_0= ruleEInt ) )
            // InternalIotDsl.g:2031:4: (lv_minDuration_6_0= ruleEInt )
            {
            // InternalIotDsl.g:2031:4: (lv_minDuration_6_0= ruleEInt )
            // InternalIotDsl.g:2032:5: lv_minDuration_6_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getGpioButtonInputAccess().getMinDurationEIntParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_4);
            lv_minDuration_6_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGpioButtonInputRule());
            					}
            					set(
            						current,
            						"minDuration",
            						lv_minDuration_6_0,
            						"es.udima.tfm.cesarlaso.IotDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_7, grammarAccess.getGpioButtonInputAccess().getLeftCurlyBracketKeyword_7());
            		
            // InternalIotDsl.g:2053:3: ( (lv_actuators_8_0= ruleActuator ) )
            // InternalIotDsl.g:2054:4: (lv_actuators_8_0= ruleActuator )
            {
            // InternalIotDsl.g:2054:4: (lv_actuators_8_0= ruleActuator )
            // InternalIotDsl.g:2055:5: lv_actuators_8_0= ruleActuator
            {

            					newCompositeNode(grammarAccess.getGpioButtonInputAccess().getActuatorsActuatorParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_10);
            lv_actuators_8_0=ruleActuator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGpioButtonInputRule());
            					}
            					add(
            						current,
            						"actuators",
            						lv_actuators_8_0,
            						"es.udima.tfm.cesarlaso.IotDsl.Actuator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalIotDsl.g:2072:3: (otherlv_9= ',' ( (lv_actuators_10_0= ruleActuator ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==16) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalIotDsl.g:2073:4: otherlv_9= ',' ( (lv_actuators_10_0= ruleActuator ) )
            	    {
            	    otherlv_9=(Token)match(input,16,FOLLOW_26); 

            	    				newLeafNode(otherlv_9, grammarAccess.getGpioButtonInputAccess().getCommaKeyword_9_0());
            	    			
            	    // InternalIotDsl.g:2077:4: ( (lv_actuators_10_0= ruleActuator ) )
            	    // InternalIotDsl.g:2078:5: (lv_actuators_10_0= ruleActuator )
            	    {
            	    // InternalIotDsl.g:2078:5: (lv_actuators_10_0= ruleActuator )
            	    // InternalIotDsl.g:2079:6: lv_actuators_10_0= ruleActuator
            	    {

            	    						newCompositeNode(grammarAccess.getGpioButtonInputAccess().getActuatorsActuatorParserRuleCall_9_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_actuators_10_0=ruleActuator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGpioButtonInputRule());
            	    						}
            	    						add(
            	    							current,
            	    							"actuators",
            	    							lv_actuators_10_0,
            	    							"es.udima.tfm.cesarlaso.IotDsl.Actuator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            otherlv_11=(Token)match(input,17,FOLLOW_14); 

            			newLeafNode(otherlv_11, grammarAccess.getGpioButtonInputAccess().getRightCurlyBracketKeyword_10());
            		
            otherlv_12=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getGpioButtonInputAccess().getRightCurlyBracketKeyword_11());
            		

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
    // $ANTLR end "ruleGpioButtonInput"


    // $ANTLR start "entryRuleGpioButtonInputAccumulator"
    // InternalIotDsl.g:2109:1: entryRuleGpioButtonInputAccumulator returns [EObject current=null] : iv_ruleGpioButtonInputAccumulator= ruleGpioButtonInputAccumulator EOF ;
    public final EObject entryRuleGpioButtonInputAccumulator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGpioButtonInputAccumulator = null;


        try {
            // InternalIotDsl.g:2109:67: (iv_ruleGpioButtonInputAccumulator= ruleGpioButtonInputAccumulator EOF )
            // InternalIotDsl.g:2110:2: iv_ruleGpioButtonInputAccumulator= ruleGpioButtonInputAccumulator EOF
            {
             newCompositeNode(grammarAccess.getGpioButtonInputAccumulatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGpioButtonInputAccumulator=ruleGpioButtonInputAccumulator();

            state._fsp--;

             current =iv_ruleGpioButtonInputAccumulator; 
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
    // $ANTLR end "entryRuleGpioButtonInputAccumulator"


    // $ANTLR start "ruleGpioButtonInputAccumulator"
    // InternalIotDsl.g:2116:1: ruleGpioButtonInputAccumulator returns [EObject current=null] : (otherlv_0= 'button_acumulator' ( ( ruleEString ) ) otherlv_2= '{' otherlv_3= 'mode' ( (lv_mode_4_0= rulePinResistor ) ) otherlv_5= 'min_duration' ( (lv_minDuration_6_0= ruleEInt ) ) otherlv_7= 'count' ( (lv_count_8_0= ruleEInt ) ) otherlv_9= '{' ( (lv_actuators_10_0= ruleActuator ) ) (otherlv_11= ',' ( (lv_actuators_12_0= ruleActuator ) ) )* otherlv_13= '}' otherlv_14= '}' ) ;
    public final EObject ruleGpioButtonInputAccumulator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Enumerator lv_mode_4_0 = null;

        AntlrDatatypeRuleToken lv_minDuration_6_0 = null;

        AntlrDatatypeRuleToken lv_count_8_0 = null;

        EObject lv_actuators_10_0 = null;

        EObject lv_actuators_12_0 = null;



        	enterRule();

        try {
            // InternalIotDsl.g:2122:2: ( (otherlv_0= 'button_acumulator' ( ( ruleEString ) ) otherlv_2= '{' otherlv_3= 'mode' ( (lv_mode_4_0= rulePinResistor ) ) otherlv_5= 'min_duration' ( (lv_minDuration_6_0= ruleEInt ) ) otherlv_7= 'count' ( (lv_count_8_0= ruleEInt ) ) otherlv_9= '{' ( (lv_actuators_10_0= ruleActuator ) ) (otherlv_11= ',' ( (lv_actuators_12_0= ruleActuator ) ) )* otherlv_13= '}' otherlv_14= '}' ) )
            // InternalIotDsl.g:2123:2: (otherlv_0= 'button_acumulator' ( ( ruleEString ) ) otherlv_2= '{' otherlv_3= 'mode' ( (lv_mode_4_0= rulePinResistor ) ) otherlv_5= 'min_duration' ( (lv_minDuration_6_0= ruleEInt ) ) otherlv_7= 'count' ( (lv_count_8_0= ruleEInt ) ) otherlv_9= '{' ( (lv_actuators_10_0= ruleActuator ) ) (otherlv_11= ',' ( (lv_actuators_12_0= ruleActuator ) ) )* otherlv_13= '}' otherlv_14= '}' )
            {
            // InternalIotDsl.g:2123:2: (otherlv_0= 'button_acumulator' ( ( ruleEString ) ) otherlv_2= '{' otherlv_3= 'mode' ( (lv_mode_4_0= rulePinResistor ) ) otherlv_5= 'min_duration' ( (lv_minDuration_6_0= ruleEInt ) ) otherlv_7= 'count' ( (lv_count_8_0= ruleEInt ) ) otherlv_9= '{' ( (lv_actuators_10_0= ruleActuator ) ) (otherlv_11= ',' ( (lv_actuators_12_0= ruleActuator ) ) )* otherlv_13= '}' otherlv_14= '}' )
            // InternalIotDsl.g:2124:3: otherlv_0= 'button_acumulator' ( ( ruleEString ) ) otherlv_2= '{' otherlv_3= 'mode' ( (lv_mode_4_0= rulePinResistor ) ) otherlv_5= 'min_duration' ( (lv_minDuration_6_0= ruleEInt ) ) otherlv_7= 'count' ( (lv_count_8_0= ruleEInt ) ) otherlv_9= '{' ( (lv_actuators_10_0= ruleActuator ) ) (otherlv_11= ',' ( (lv_actuators_12_0= ruleActuator ) ) )* otherlv_13= '}' otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGpioButtonInputAccumulatorAccess().getButton_acumulatorKeyword_0());
            		
            // InternalIotDsl.g:2128:3: ( ( ruleEString ) )
            // InternalIotDsl.g:2129:4: ( ruleEString )
            {
            // InternalIotDsl.g:2129:4: ( ruleEString )
            // InternalIotDsl.g:2130:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGpioButtonInputAccumulatorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getGpioButtonInputAccumulatorAccess().getPinDigitalInputPinCrossReference_1_0());
            				
            pushFollow(FOLLOW_4);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getGpioButtonInputAccumulatorAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,38,FOLLOW_30); 

            			newLeafNode(otherlv_3, grammarAccess.getGpioButtonInputAccumulatorAccess().getModeKeyword_3());
            		
            // InternalIotDsl.g:2152:3: ( (lv_mode_4_0= rulePinResistor ) )
            // InternalIotDsl.g:2153:4: (lv_mode_4_0= rulePinResistor )
            {
            // InternalIotDsl.g:2153:4: (lv_mode_4_0= rulePinResistor )
            // InternalIotDsl.g:2154:5: lv_mode_4_0= rulePinResistor
            {

            					newCompositeNode(grammarAccess.getGpioButtonInputAccumulatorAccess().getModePinResistorEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_31);
            lv_mode_4_0=rulePinResistor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGpioButtonInputAccumulatorRule());
            					}
            					set(
            						current,
            						"mode",
            						lv_mode_4_0,
            						"es.udima.tfm.cesarlaso.IotDsl.PinResistor");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,39,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getGpioButtonInputAccumulatorAccess().getMin_durationKeyword_5());
            		
            // InternalIotDsl.g:2175:3: ( (lv_minDuration_6_0= ruleEInt ) )
            // InternalIotDsl.g:2176:4: (lv_minDuration_6_0= ruleEInt )
            {
            // InternalIotDsl.g:2176:4: (lv_minDuration_6_0= ruleEInt )
            // InternalIotDsl.g:2177:5: lv_minDuration_6_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getGpioButtonInputAccumulatorAccess().getMinDurationEIntParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_32);
            lv_minDuration_6_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGpioButtonInputAccumulatorRule());
            					}
            					set(
            						current,
            						"minDuration",
            						lv_minDuration_6_0,
            						"es.udima.tfm.cesarlaso.IotDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,41,FOLLOW_6); 

            			newLeafNode(otherlv_7, grammarAccess.getGpioButtonInputAccumulatorAccess().getCountKeyword_7());
            		
            // InternalIotDsl.g:2198:3: ( (lv_count_8_0= ruleEInt ) )
            // InternalIotDsl.g:2199:4: (lv_count_8_0= ruleEInt )
            {
            // InternalIotDsl.g:2199:4: (lv_count_8_0= ruleEInt )
            // InternalIotDsl.g:2200:5: lv_count_8_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getGpioButtonInputAccumulatorAccess().getCountEIntParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_4);
            lv_count_8_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGpioButtonInputAccumulatorRule());
            					}
            					set(
            						current,
            						"count",
            						lv_count_8_0,
            						"es.udima.tfm.cesarlaso.IotDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_9, grammarAccess.getGpioButtonInputAccumulatorAccess().getLeftCurlyBracketKeyword_9());
            		
            // InternalIotDsl.g:2221:3: ( (lv_actuators_10_0= ruleActuator ) )
            // InternalIotDsl.g:2222:4: (lv_actuators_10_0= ruleActuator )
            {
            // InternalIotDsl.g:2222:4: (lv_actuators_10_0= ruleActuator )
            // InternalIotDsl.g:2223:5: lv_actuators_10_0= ruleActuator
            {

            					newCompositeNode(grammarAccess.getGpioButtonInputAccumulatorAccess().getActuatorsActuatorParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_10);
            lv_actuators_10_0=ruleActuator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGpioButtonInputAccumulatorRule());
            					}
            					add(
            						current,
            						"actuators",
            						lv_actuators_10_0,
            						"es.udima.tfm.cesarlaso.IotDsl.Actuator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalIotDsl.g:2240:3: (otherlv_11= ',' ( (lv_actuators_12_0= ruleActuator ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==16) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalIotDsl.g:2241:4: otherlv_11= ',' ( (lv_actuators_12_0= ruleActuator ) )
            	    {
            	    otherlv_11=(Token)match(input,16,FOLLOW_26); 

            	    				newLeafNode(otherlv_11, grammarAccess.getGpioButtonInputAccumulatorAccess().getCommaKeyword_11_0());
            	    			
            	    // InternalIotDsl.g:2245:4: ( (lv_actuators_12_0= ruleActuator ) )
            	    // InternalIotDsl.g:2246:5: (lv_actuators_12_0= ruleActuator )
            	    {
            	    // InternalIotDsl.g:2246:5: (lv_actuators_12_0= ruleActuator )
            	    // InternalIotDsl.g:2247:6: lv_actuators_12_0= ruleActuator
            	    {

            	    						newCompositeNode(grammarAccess.getGpioButtonInputAccumulatorAccess().getActuatorsActuatorParserRuleCall_11_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_actuators_12_0=ruleActuator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGpioButtonInputAccumulatorRule());
            	    						}
            	    						add(
            	    							current,
            	    							"actuators",
            	    							lv_actuators_12_0,
            	    							"es.udima.tfm.cesarlaso.IotDsl.Actuator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            otherlv_13=(Token)match(input,17,FOLLOW_14); 

            			newLeafNode(otherlv_13, grammarAccess.getGpioButtonInputAccumulatorAccess().getRightCurlyBracketKeyword_12());
            		
            otherlv_14=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getGpioButtonInputAccumulatorAccess().getRightCurlyBracketKeyword_13());
            		

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
    // $ANTLR end "ruleGpioButtonInputAccumulator"


    // $ANTLR start "entryRuleGpioButtonReleased"
    // InternalIotDsl.g:2277:1: entryRuleGpioButtonReleased returns [EObject current=null] : iv_ruleGpioButtonReleased= ruleGpioButtonReleased EOF ;
    public final EObject entryRuleGpioButtonReleased() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGpioButtonReleased = null;


        try {
            // InternalIotDsl.g:2277:59: (iv_ruleGpioButtonReleased= ruleGpioButtonReleased EOF )
            // InternalIotDsl.g:2278:2: iv_ruleGpioButtonReleased= ruleGpioButtonReleased EOF
            {
             newCompositeNode(grammarAccess.getGpioButtonReleasedRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGpioButtonReleased=ruleGpioButtonReleased();

            state._fsp--;

             current =iv_ruleGpioButtonReleased; 
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
    // $ANTLR end "entryRuleGpioButtonReleased"


    // $ANTLR start "ruleGpioButtonReleased"
    // InternalIotDsl.g:2284:1: ruleGpioButtonReleased returns [EObject current=null] : (otherlv_0= 'button_released' ( ( ruleEString ) ) otherlv_2= '{' otherlv_3= 'mode' ( (lv_mode_4_0= rulePinResistor ) ) otherlv_5= '{' ( (lv_actuators_6_0= ruleActuator ) ) (otherlv_7= ',' ( (lv_actuators_8_0= ruleActuator ) ) )* otherlv_9= '}' otherlv_10= '}' ) ;
    public final EObject ruleGpioButtonReleased() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Enumerator lv_mode_4_0 = null;

        EObject lv_actuators_6_0 = null;

        EObject lv_actuators_8_0 = null;



        	enterRule();

        try {
            // InternalIotDsl.g:2290:2: ( (otherlv_0= 'button_released' ( ( ruleEString ) ) otherlv_2= '{' otherlv_3= 'mode' ( (lv_mode_4_0= rulePinResistor ) ) otherlv_5= '{' ( (lv_actuators_6_0= ruleActuator ) ) (otherlv_7= ',' ( (lv_actuators_8_0= ruleActuator ) ) )* otherlv_9= '}' otherlv_10= '}' ) )
            // InternalIotDsl.g:2291:2: (otherlv_0= 'button_released' ( ( ruleEString ) ) otherlv_2= '{' otherlv_3= 'mode' ( (lv_mode_4_0= rulePinResistor ) ) otherlv_5= '{' ( (lv_actuators_6_0= ruleActuator ) ) (otherlv_7= ',' ( (lv_actuators_8_0= ruleActuator ) ) )* otherlv_9= '}' otherlv_10= '}' )
            {
            // InternalIotDsl.g:2291:2: (otherlv_0= 'button_released' ( ( ruleEString ) ) otherlv_2= '{' otherlv_3= 'mode' ( (lv_mode_4_0= rulePinResistor ) ) otherlv_5= '{' ( (lv_actuators_6_0= ruleActuator ) ) (otherlv_7= ',' ( (lv_actuators_8_0= ruleActuator ) ) )* otherlv_9= '}' otherlv_10= '}' )
            // InternalIotDsl.g:2292:3: otherlv_0= 'button_released' ( ( ruleEString ) ) otherlv_2= '{' otherlv_3= 'mode' ( (lv_mode_4_0= rulePinResistor ) ) otherlv_5= '{' ( (lv_actuators_6_0= ruleActuator ) ) (otherlv_7= ',' ( (lv_actuators_8_0= ruleActuator ) ) )* otherlv_9= '}' otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGpioButtonReleasedAccess().getButton_releasedKeyword_0());
            		
            // InternalIotDsl.g:2296:3: ( ( ruleEString ) )
            // InternalIotDsl.g:2297:4: ( ruleEString )
            {
            // InternalIotDsl.g:2297:4: ( ruleEString )
            // InternalIotDsl.g:2298:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGpioButtonReleasedRule());
            					}
            				

            					newCompositeNode(grammarAccess.getGpioButtonReleasedAccess().getPinDigitalInputPinCrossReference_1_0());
            				
            pushFollow(FOLLOW_4);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getGpioButtonReleasedAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,38,FOLLOW_30); 

            			newLeafNode(otherlv_3, grammarAccess.getGpioButtonReleasedAccess().getModeKeyword_3());
            		
            // InternalIotDsl.g:2320:3: ( (lv_mode_4_0= rulePinResistor ) )
            // InternalIotDsl.g:2321:4: (lv_mode_4_0= rulePinResistor )
            {
            // InternalIotDsl.g:2321:4: (lv_mode_4_0= rulePinResistor )
            // InternalIotDsl.g:2322:5: lv_mode_4_0= rulePinResistor
            {

            					newCompositeNode(grammarAccess.getGpioButtonReleasedAccess().getModePinResistorEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_4);
            lv_mode_4_0=rulePinResistor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGpioButtonReleasedRule());
            					}
            					set(
            						current,
            						"mode",
            						lv_mode_4_0,
            						"es.udima.tfm.cesarlaso.IotDsl.PinResistor");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_5, grammarAccess.getGpioButtonReleasedAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalIotDsl.g:2343:3: ( (lv_actuators_6_0= ruleActuator ) )
            // InternalIotDsl.g:2344:4: (lv_actuators_6_0= ruleActuator )
            {
            // InternalIotDsl.g:2344:4: (lv_actuators_6_0= ruleActuator )
            // InternalIotDsl.g:2345:5: lv_actuators_6_0= ruleActuator
            {

            					newCompositeNode(grammarAccess.getGpioButtonReleasedAccess().getActuatorsActuatorParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_10);
            lv_actuators_6_0=ruleActuator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGpioButtonReleasedRule());
            					}
            					add(
            						current,
            						"actuators",
            						lv_actuators_6_0,
            						"es.udima.tfm.cesarlaso.IotDsl.Actuator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalIotDsl.g:2362:3: (otherlv_7= ',' ( (lv_actuators_8_0= ruleActuator ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==16) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalIotDsl.g:2363:4: otherlv_7= ',' ( (lv_actuators_8_0= ruleActuator ) )
            	    {
            	    otherlv_7=(Token)match(input,16,FOLLOW_26); 

            	    				newLeafNode(otherlv_7, grammarAccess.getGpioButtonReleasedAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalIotDsl.g:2367:4: ( (lv_actuators_8_0= ruleActuator ) )
            	    // InternalIotDsl.g:2368:5: (lv_actuators_8_0= ruleActuator )
            	    {
            	    // InternalIotDsl.g:2368:5: (lv_actuators_8_0= ruleActuator )
            	    // InternalIotDsl.g:2369:6: lv_actuators_8_0= ruleActuator
            	    {

            	    						newCompositeNode(grammarAccess.getGpioButtonReleasedAccess().getActuatorsActuatorParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_actuators_8_0=ruleActuator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGpioButtonReleasedRule());
            	    						}
            	    						add(
            	    							current,
            	    							"actuators",
            	    							lv_actuators_8_0,
            	    							"es.udima.tfm.cesarlaso.IotDsl.Actuator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            otherlv_9=(Token)match(input,17,FOLLOW_14); 

            			newLeafNode(otherlv_9, grammarAccess.getGpioButtonReleasedAccess().getRightCurlyBracketKeyword_8());
            		
            otherlv_10=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getGpioButtonReleasedAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleGpioButtonReleased"


    // $ANTLR start "entryRuleGpioPulseInput"
    // InternalIotDsl.g:2399:1: entryRuleGpioPulseInput returns [EObject current=null] : iv_ruleGpioPulseInput= ruleGpioPulseInput EOF ;
    public final EObject entryRuleGpioPulseInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGpioPulseInput = null;


        try {
            // InternalIotDsl.g:2399:55: (iv_ruleGpioPulseInput= ruleGpioPulseInput EOF )
            // InternalIotDsl.g:2400:2: iv_ruleGpioPulseInput= ruleGpioPulseInput EOF
            {
             newCompositeNode(grammarAccess.getGpioPulseInputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGpioPulseInput=ruleGpioPulseInput();

            state._fsp--;

             current =iv_ruleGpioPulseInput; 
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
    // $ANTLR end "entryRuleGpioPulseInput"


    // $ANTLR start "ruleGpioPulseInput"
    // InternalIotDsl.g:2406:1: ruleGpioPulseInput returns [EObject current=null] : (otherlv_0= 'pulse_input' ( ( ruleEString ) ) otherlv_2= '{' otherlv_3= 'mode' ( (lv_mode_4_0= rulePinResistor ) ) otherlv_5= 'count' ( (lv_count_6_0= ruleEInt ) ) otherlv_7= 'width' ( (lv_width_8_0= ruleEInt ) ) otherlv_9= 'space_width' ( (lv_spaceWidth_10_0= ruleEInt ) ) otherlv_11= '{' ( (lv_actuators_12_0= ruleActuator ) ) (otherlv_13= ',' ( (lv_actuators_14_0= ruleActuator ) ) )* otherlv_15= '}' otherlv_16= '}' ) ;
    public final EObject ruleGpioPulseInput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Enumerator lv_mode_4_0 = null;

        AntlrDatatypeRuleToken lv_count_6_0 = null;

        AntlrDatatypeRuleToken lv_width_8_0 = null;

        AntlrDatatypeRuleToken lv_spaceWidth_10_0 = null;

        EObject lv_actuators_12_0 = null;

        EObject lv_actuators_14_0 = null;



        	enterRule();

        try {
            // InternalIotDsl.g:2412:2: ( (otherlv_0= 'pulse_input' ( ( ruleEString ) ) otherlv_2= '{' otherlv_3= 'mode' ( (lv_mode_4_0= rulePinResistor ) ) otherlv_5= 'count' ( (lv_count_6_0= ruleEInt ) ) otherlv_7= 'width' ( (lv_width_8_0= ruleEInt ) ) otherlv_9= 'space_width' ( (lv_spaceWidth_10_0= ruleEInt ) ) otherlv_11= '{' ( (lv_actuators_12_0= ruleActuator ) ) (otherlv_13= ',' ( (lv_actuators_14_0= ruleActuator ) ) )* otherlv_15= '}' otherlv_16= '}' ) )
            // InternalIotDsl.g:2413:2: (otherlv_0= 'pulse_input' ( ( ruleEString ) ) otherlv_2= '{' otherlv_3= 'mode' ( (lv_mode_4_0= rulePinResistor ) ) otherlv_5= 'count' ( (lv_count_6_0= ruleEInt ) ) otherlv_7= 'width' ( (lv_width_8_0= ruleEInt ) ) otherlv_9= 'space_width' ( (lv_spaceWidth_10_0= ruleEInt ) ) otherlv_11= '{' ( (lv_actuators_12_0= ruleActuator ) ) (otherlv_13= ',' ( (lv_actuators_14_0= ruleActuator ) ) )* otherlv_15= '}' otherlv_16= '}' )
            {
            // InternalIotDsl.g:2413:2: (otherlv_0= 'pulse_input' ( ( ruleEString ) ) otherlv_2= '{' otherlv_3= 'mode' ( (lv_mode_4_0= rulePinResistor ) ) otherlv_5= 'count' ( (lv_count_6_0= ruleEInt ) ) otherlv_7= 'width' ( (lv_width_8_0= ruleEInt ) ) otherlv_9= 'space_width' ( (lv_spaceWidth_10_0= ruleEInt ) ) otherlv_11= '{' ( (lv_actuators_12_0= ruleActuator ) ) (otherlv_13= ',' ( (lv_actuators_14_0= ruleActuator ) ) )* otherlv_15= '}' otherlv_16= '}' )
            // InternalIotDsl.g:2414:3: otherlv_0= 'pulse_input' ( ( ruleEString ) ) otherlv_2= '{' otherlv_3= 'mode' ( (lv_mode_4_0= rulePinResistor ) ) otherlv_5= 'count' ( (lv_count_6_0= ruleEInt ) ) otherlv_7= 'width' ( (lv_width_8_0= ruleEInt ) ) otherlv_9= 'space_width' ( (lv_spaceWidth_10_0= ruleEInt ) ) otherlv_11= '{' ( (lv_actuators_12_0= ruleActuator ) ) (otherlv_13= ',' ( (lv_actuators_14_0= ruleActuator ) ) )* otherlv_15= '}' otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGpioPulseInputAccess().getPulse_inputKeyword_0());
            		
            // InternalIotDsl.g:2418:3: ( ( ruleEString ) )
            // InternalIotDsl.g:2419:4: ( ruleEString )
            {
            // InternalIotDsl.g:2419:4: ( ruleEString )
            // InternalIotDsl.g:2420:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGpioPulseInputRule());
            					}
            				

            					newCompositeNode(grammarAccess.getGpioPulseInputAccess().getPinDigitalInputPinCrossReference_1_0());
            				
            pushFollow(FOLLOW_4);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getGpioPulseInputAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,38,FOLLOW_30); 

            			newLeafNode(otherlv_3, grammarAccess.getGpioPulseInputAccess().getModeKeyword_3());
            		
            // InternalIotDsl.g:2442:3: ( (lv_mode_4_0= rulePinResistor ) )
            // InternalIotDsl.g:2443:4: (lv_mode_4_0= rulePinResistor )
            {
            // InternalIotDsl.g:2443:4: (lv_mode_4_0= rulePinResistor )
            // InternalIotDsl.g:2444:5: lv_mode_4_0= rulePinResistor
            {

            					newCompositeNode(grammarAccess.getGpioPulseInputAccess().getModePinResistorEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_32);
            lv_mode_4_0=rulePinResistor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGpioPulseInputRule());
            					}
            					set(
            						current,
            						"mode",
            						lv_mode_4_0,
            						"es.udima.tfm.cesarlaso.IotDsl.PinResistor");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,41,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getGpioPulseInputAccess().getCountKeyword_5());
            		
            // InternalIotDsl.g:2465:3: ( (lv_count_6_0= ruleEInt ) )
            // InternalIotDsl.g:2466:4: (lv_count_6_0= ruleEInt )
            {
            // InternalIotDsl.g:2466:4: (lv_count_6_0= ruleEInt )
            // InternalIotDsl.g:2467:5: lv_count_6_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getGpioPulseInputAccess().getCountEIntParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_33);
            lv_count_6_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGpioPulseInputRule());
            					}
            					set(
            						current,
            						"count",
            						lv_count_6_0,
            						"es.udima.tfm.cesarlaso.IotDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,44,FOLLOW_6); 

            			newLeafNode(otherlv_7, grammarAccess.getGpioPulseInputAccess().getWidthKeyword_7());
            		
            // InternalIotDsl.g:2488:3: ( (lv_width_8_0= ruleEInt ) )
            // InternalIotDsl.g:2489:4: (lv_width_8_0= ruleEInt )
            {
            // InternalIotDsl.g:2489:4: (lv_width_8_0= ruleEInt )
            // InternalIotDsl.g:2490:5: lv_width_8_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getGpioPulseInputAccess().getWidthEIntParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_34);
            lv_width_8_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGpioPulseInputRule());
            					}
            					set(
            						current,
            						"width",
            						lv_width_8_0,
            						"es.udima.tfm.cesarlaso.IotDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,45,FOLLOW_6); 

            			newLeafNode(otherlv_9, grammarAccess.getGpioPulseInputAccess().getSpace_widthKeyword_9());
            		
            // InternalIotDsl.g:2511:3: ( (lv_spaceWidth_10_0= ruleEInt ) )
            // InternalIotDsl.g:2512:4: (lv_spaceWidth_10_0= ruleEInt )
            {
            // InternalIotDsl.g:2512:4: (lv_spaceWidth_10_0= ruleEInt )
            // InternalIotDsl.g:2513:5: lv_spaceWidth_10_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getGpioPulseInputAccess().getSpaceWidthEIntParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_4);
            lv_spaceWidth_10_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGpioPulseInputRule());
            					}
            					set(
            						current,
            						"spaceWidth",
            						lv_spaceWidth_10_0,
            						"es.udima.tfm.cesarlaso.IotDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_11, grammarAccess.getGpioPulseInputAccess().getLeftCurlyBracketKeyword_11());
            		
            // InternalIotDsl.g:2534:3: ( (lv_actuators_12_0= ruleActuator ) )
            // InternalIotDsl.g:2535:4: (lv_actuators_12_0= ruleActuator )
            {
            // InternalIotDsl.g:2535:4: (lv_actuators_12_0= ruleActuator )
            // InternalIotDsl.g:2536:5: lv_actuators_12_0= ruleActuator
            {

            					newCompositeNode(grammarAccess.getGpioPulseInputAccess().getActuatorsActuatorParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_10);
            lv_actuators_12_0=ruleActuator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGpioPulseInputRule());
            					}
            					add(
            						current,
            						"actuators",
            						lv_actuators_12_0,
            						"es.udima.tfm.cesarlaso.IotDsl.Actuator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalIotDsl.g:2553:3: (otherlv_13= ',' ( (lv_actuators_14_0= ruleActuator ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==16) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalIotDsl.g:2554:4: otherlv_13= ',' ( (lv_actuators_14_0= ruleActuator ) )
            	    {
            	    otherlv_13=(Token)match(input,16,FOLLOW_26); 

            	    				newLeafNode(otherlv_13, grammarAccess.getGpioPulseInputAccess().getCommaKeyword_13_0());
            	    			
            	    // InternalIotDsl.g:2558:4: ( (lv_actuators_14_0= ruleActuator ) )
            	    // InternalIotDsl.g:2559:5: (lv_actuators_14_0= ruleActuator )
            	    {
            	    // InternalIotDsl.g:2559:5: (lv_actuators_14_0= ruleActuator )
            	    // InternalIotDsl.g:2560:6: lv_actuators_14_0= ruleActuator
            	    {

            	    						newCompositeNode(grammarAccess.getGpioPulseInputAccess().getActuatorsActuatorParserRuleCall_13_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_actuators_14_0=ruleActuator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGpioPulseInputRule());
            	    						}
            	    						add(
            	    							current,
            	    							"actuators",
            	    							lv_actuators_14_0,
            	    							"es.udima.tfm.cesarlaso.IotDsl.Actuator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            otherlv_15=(Token)match(input,17,FOLLOW_14); 

            			newLeafNode(otherlv_15, grammarAccess.getGpioPulseInputAccess().getRightCurlyBracketKeyword_14());
            		
            otherlv_16=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getGpioPulseInputAccess().getRightCurlyBracketKeyword_15());
            		

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
    // $ANTLR end "ruleGpioPulseInput"


    // $ANTLR start "entryRuleGpioAnalogRead"
    // InternalIotDsl.g:2590:1: entryRuleGpioAnalogRead returns [EObject current=null] : iv_ruleGpioAnalogRead= ruleGpioAnalogRead EOF ;
    public final EObject entryRuleGpioAnalogRead() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGpioAnalogRead = null;


        try {
            // InternalIotDsl.g:2590:55: (iv_ruleGpioAnalogRead= ruleGpioAnalogRead EOF )
            // InternalIotDsl.g:2591:2: iv_ruleGpioAnalogRead= ruleGpioAnalogRead EOF
            {
             newCompositeNode(grammarAccess.getGpioAnalogReadRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGpioAnalogRead=ruleGpioAnalogRead();

            state._fsp--;

             current =iv_ruleGpioAnalogRead; 
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
    // $ANTLR end "entryRuleGpioAnalogRead"


    // $ANTLR start "ruleGpioAnalogRead"
    // InternalIotDsl.g:2597:1: ruleGpioAnalogRead returns [EObject current=null] : (otherlv_0= 'analog_read' ( ( ruleEString ) ) otherlv_2= 'every' ( (lv_pollIntervalLoops_3_0= ruleEInt ) ) otherlv_4= 'loops' otherlv_5= '{' ( (lv_actuators_6_0= ruleActuator ) ) (otherlv_7= ',' ( (lv_actuators_8_0= ruleActuator ) ) )* otherlv_9= '}' ) ;
    public final EObject ruleGpioAnalogRead() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_pollIntervalLoops_3_0 = null;

        EObject lv_actuators_6_0 = null;

        EObject lv_actuators_8_0 = null;



        	enterRule();

        try {
            // InternalIotDsl.g:2603:2: ( (otherlv_0= 'analog_read' ( ( ruleEString ) ) otherlv_2= 'every' ( (lv_pollIntervalLoops_3_0= ruleEInt ) ) otherlv_4= 'loops' otherlv_5= '{' ( (lv_actuators_6_0= ruleActuator ) ) (otherlv_7= ',' ( (lv_actuators_8_0= ruleActuator ) ) )* otherlv_9= '}' ) )
            // InternalIotDsl.g:2604:2: (otherlv_0= 'analog_read' ( ( ruleEString ) ) otherlv_2= 'every' ( (lv_pollIntervalLoops_3_0= ruleEInt ) ) otherlv_4= 'loops' otherlv_5= '{' ( (lv_actuators_6_0= ruleActuator ) ) (otherlv_7= ',' ( (lv_actuators_8_0= ruleActuator ) ) )* otherlv_9= '}' )
            {
            // InternalIotDsl.g:2604:2: (otherlv_0= 'analog_read' ( ( ruleEString ) ) otherlv_2= 'every' ( (lv_pollIntervalLoops_3_0= ruleEInt ) ) otherlv_4= 'loops' otherlv_5= '{' ( (lv_actuators_6_0= ruleActuator ) ) (otherlv_7= ',' ( (lv_actuators_8_0= ruleActuator ) ) )* otherlv_9= '}' )
            // InternalIotDsl.g:2605:3: otherlv_0= 'analog_read' ( ( ruleEString ) ) otherlv_2= 'every' ( (lv_pollIntervalLoops_3_0= ruleEInt ) ) otherlv_4= 'loops' otherlv_5= '{' ( (lv_actuators_6_0= ruleActuator ) ) (otherlv_7= ',' ( (lv_actuators_8_0= ruleActuator ) ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGpioAnalogReadAccess().getAnalog_readKeyword_0());
            		
            // InternalIotDsl.g:2609:3: ( ( ruleEString ) )
            // InternalIotDsl.g:2610:4: ( ruleEString )
            {
            // InternalIotDsl.g:2610:4: ( ruleEString )
            // InternalIotDsl.g:2611:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGpioAnalogReadRule());
            					}
            				

            					newCompositeNode(grammarAccess.getGpioAnalogReadAccess().getPinAnalogInputPinCrossReference_1_0());
            				
            pushFollow(FOLLOW_35);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,47,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getGpioAnalogReadAccess().getEveryKeyword_2());
            		
            // InternalIotDsl.g:2629:3: ( (lv_pollIntervalLoops_3_0= ruleEInt ) )
            // InternalIotDsl.g:2630:4: (lv_pollIntervalLoops_3_0= ruleEInt )
            {
            // InternalIotDsl.g:2630:4: (lv_pollIntervalLoops_3_0= ruleEInt )
            // InternalIotDsl.g:2631:5: lv_pollIntervalLoops_3_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getGpioAnalogReadAccess().getPollIntervalLoopsEIntParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_36);
            lv_pollIntervalLoops_3_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGpioAnalogReadRule());
            					}
            					set(
            						current,
            						"pollIntervalLoops",
            						lv_pollIntervalLoops_3_0,
            						"es.udima.tfm.cesarlaso.IotDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,48,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getGpioAnalogReadAccess().getLoopsKeyword_4());
            		
            otherlv_5=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_5, grammarAccess.getGpioAnalogReadAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalIotDsl.g:2656:3: ( (lv_actuators_6_0= ruleActuator ) )
            // InternalIotDsl.g:2657:4: (lv_actuators_6_0= ruleActuator )
            {
            // InternalIotDsl.g:2657:4: (lv_actuators_6_0= ruleActuator )
            // InternalIotDsl.g:2658:5: lv_actuators_6_0= ruleActuator
            {

            					newCompositeNode(grammarAccess.getGpioAnalogReadAccess().getActuatorsActuatorParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_10);
            lv_actuators_6_0=ruleActuator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGpioAnalogReadRule());
            					}
            					add(
            						current,
            						"actuators",
            						lv_actuators_6_0,
            						"es.udima.tfm.cesarlaso.IotDsl.Actuator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalIotDsl.g:2675:3: (otherlv_7= ',' ( (lv_actuators_8_0= ruleActuator ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==16) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalIotDsl.g:2676:4: otherlv_7= ',' ( (lv_actuators_8_0= ruleActuator ) )
            	    {
            	    otherlv_7=(Token)match(input,16,FOLLOW_26); 

            	    				newLeafNode(otherlv_7, grammarAccess.getGpioAnalogReadAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalIotDsl.g:2680:4: ( (lv_actuators_8_0= ruleActuator ) )
            	    // InternalIotDsl.g:2681:5: (lv_actuators_8_0= ruleActuator )
            	    {
            	    // InternalIotDsl.g:2681:5: (lv_actuators_8_0= ruleActuator )
            	    // InternalIotDsl.g:2682:6: lv_actuators_8_0= ruleActuator
            	    {

            	    						newCompositeNode(grammarAccess.getGpioAnalogReadAccess().getActuatorsActuatorParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_actuators_8_0=ruleActuator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGpioAnalogReadRule());
            	    						}
            	    						add(
            	    							current,
            	    							"actuators",
            	    							lv_actuators_8_0,
            	    							"es.udima.tfm.cesarlaso.IotDsl.Actuator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            otherlv_9=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getGpioAnalogReadAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleGpioAnalogRead"


    // $ANTLR start "entryRuleGpioAnalogReadPerformOnHigh"
    // InternalIotDsl.g:2708:1: entryRuleGpioAnalogReadPerformOnHigh returns [EObject current=null] : iv_ruleGpioAnalogReadPerformOnHigh= ruleGpioAnalogReadPerformOnHigh EOF ;
    public final EObject entryRuleGpioAnalogReadPerformOnHigh() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGpioAnalogReadPerformOnHigh = null;


        try {
            // InternalIotDsl.g:2708:68: (iv_ruleGpioAnalogReadPerformOnHigh= ruleGpioAnalogReadPerformOnHigh EOF )
            // InternalIotDsl.g:2709:2: iv_ruleGpioAnalogReadPerformOnHigh= ruleGpioAnalogReadPerformOnHigh EOF
            {
             newCompositeNode(grammarAccess.getGpioAnalogReadPerformOnHighRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGpioAnalogReadPerformOnHigh=ruleGpioAnalogReadPerformOnHigh();

            state._fsp--;

             current =iv_ruleGpioAnalogReadPerformOnHigh; 
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
    // $ANTLR end "entryRuleGpioAnalogReadPerformOnHigh"


    // $ANTLR start "ruleGpioAnalogReadPerformOnHigh"
    // InternalIotDsl.g:2715:1: ruleGpioAnalogReadPerformOnHigh returns [EObject current=null] : (otherlv_0= 'analog_read_on_high' ( ( ruleEString ) ) otherlv_2= 'every' ( (lv_pollIntervalLoops_3_0= ruleEInt ) ) otherlv_4= 'loops' otherlv_5= 'value_higher_than' ( (lv_value_6_0= ruleEInt ) ) otherlv_7= '{' ( (lv_actuators_8_0= ruleActuator ) ) (otherlv_9= ',' ( (lv_actuators_10_0= ruleActuator ) ) )* otherlv_11= '}' ) ;
    public final EObject ruleGpioAnalogReadPerformOnHigh() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_pollIntervalLoops_3_0 = null;

        AntlrDatatypeRuleToken lv_value_6_0 = null;

        EObject lv_actuators_8_0 = null;

        EObject lv_actuators_10_0 = null;



        	enterRule();

        try {
            // InternalIotDsl.g:2721:2: ( (otherlv_0= 'analog_read_on_high' ( ( ruleEString ) ) otherlv_2= 'every' ( (lv_pollIntervalLoops_3_0= ruleEInt ) ) otherlv_4= 'loops' otherlv_5= 'value_higher_than' ( (lv_value_6_0= ruleEInt ) ) otherlv_7= '{' ( (lv_actuators_8_0= ruleActuator ) ) (otherlv_9= ',' ( (lv_actuators_10_0= ruleActuator ) ) )* otherlv_11= '}' ) )
            // InternalIotDsl.g:2722:2: (otherlv_0= 'analog_read_on_high' ( ( ruleEString ) ) otherlv_2= 'every' ( (lv_pollIntervalLoops_3_0= ruleEInt ) ) otherlv_4= 'loops' otherlv_5= 'value_higher_than' ( (lv_value_6_0= ruleEInt ) ) otherlv_7= '{' ( (lv_actuators_8_0= ruleActuator ) ) (otherlv_9= ',' ( (lv_actuators_10_0= ruleActuator ) ) )* otherlv_11= '}' )
            {
            // InternalIotDsl.g:2722:2: (otherlv_0= 'analog_read_on_high' ( ( ruleEString ) ) otherlv_2= 'every' ( (lv_pollIntervalLoops_3_0= ruleEInt ) ) otherlv_4= 'loops' otherlv_5= 'value_higher_than' ( (lv_value_6_0= ruleEInt ) ) otherlv_7= '{' ( (lv_actuators_8_0= ruleActuator ) ) (otherlv_9= ',' ( (lv_actuators_10_0= ruleActuator ) ) )* otherlv_11= '}' )
            // InternalIotDsl.g:2723:3: otherlv_0= 'analog_read_on_high' ( ( ruleEString ) ) otherlv_2= 'every' ( (lv_pollIntervalLoops_3_0= ruleEInt ) ) otherlv_4= 'loops' otherlv_5= 'value_higher_than' ( (lv_value_6_0= ruleEInt ) ) otherlv_7= '{' ( (lv_actuators_8_0= ruleActuator ) ) (otherlv_9= ',' ( (lv_actuators_10_0= ruleActuator ) ) )* otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,49,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGpioAnalogReadPerformOnHighAccess().getAnalog_read_on_highKeyword_0());
            		
            // InternalIotDsl.g:2727:3: ( ( ruleEString ) )
            // InternalIotDsl.g:2728:4: ( ruleEString )
            {
            // InternalIotDsl.g:2728:4: ( ruleEString )
            // InternalIotDsl.g:2729:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGpioAnalogReadPerformOnHighRule());
            					}
            				

            					newCompositeNode(grammarAccess.getGpioAnalogReadPerformOnHighAccess().getPinAnalogInputPinCrossReference_1_0());
            				
            pushFollow(FOLLOW_35);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,47,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getGpioAnalogReadPerformOnHighAccess().getEveryKeyword_2());
            		
            // InternalIotDsl.g:2747:3: ( (lv_pollIntervalLoops_3_0= ruleEInt ) )
            // InternalIotDsl.g:2748:4: (lv_pollIntervalLoops_3_0= ruleEInt )
            {
            // InternalIotDsl.g:2748:4: (lv_pollIntervalLoops_3_0= ruleEInt )
            // InternalIotDsl.g:2749:5: lv_pollIntervalLoops_3_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getGpioAnalogReadPerformOnHighAccess().getPollIntervalLoopsEIntParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_36);
            lv_pollIntervalLoops_3_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGpioAnalogReadPerformOnHighRule());
            					}
            					set(
            						current,
            						"pollIntervalLoops",
            						lv_pollIntervalLoops_3_0,
            						"es.udima.tfm.cesarlaso.IotDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,48,FOLLOW_37); 

            			newLeafNode(otherlv_4, grammarAccess.getGpioAnalogReadPerformOnHighAccess().getLoopsKeyword_4());
            		
            otherlv_5=(Token)match(input,50,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getGpioAnalogReadPerformOnHighAccess().getValue_higher_thanKeyword_5());
            		
            // InternalIotDsl.g:2774:3: ( (lv_value_6_0= ruleEInt ) )
            // InternalIotDsl.g:2775:4: (lv_value_6_0= ruleEInt )
            {
            // InternalIotDsl.g:2775:4: (lv_value_6_0= ruleEInt )
            // InternalIotDsl.g:2776:5: lv_value_6_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getGpioAnalogReadPerformOnHighAccess().getValueEIntParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_4);
            lv_value_6_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGpioAnalogReadPerformOnHighRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_6_0,
            						"es.udima.tfm.cesarlaso.IotDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_7, grammarAccess.getGpioAnalogReadPerformOnHighAccess().getLeftCurlyBracketKeyword_7());
            		
            // InternalIotDsl.g:2797:3: ( (lv_actuators_8_0= ruleActuator ) )
            // InternalIotDsl.g:2798:4: (lv_actuators_8_0= ruleActuator )
            {
            // InternalIotDsl.g:2798:4: (lv_actuators_8_0= ruleActuator )
            // InternalIotDsl.g:2799:5: lv_actuators_8_0= ruleActuator
            {

            					newCompositeNode(grammarAccess.getGpioAnalogReadPerformOnHighAccess().getActuatorsActuatorParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_10);
            lv_actuators_8_0=ruleActuator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGpioAnalogReadPerformOnHighRule());
            					}
            					add(
            						current,
            						"actuators",
            						lv_actuators_8_0,
            						"es.udima.tfm.cesarlaso.IotDsl.Actuator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalIotDsl.g:2816:3: (otherlv_9= ',' ( (lv_actuators_10_0= ruleActuator ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==16) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalIotDsl.g:2817:4: otherlv_9= ',' ( (lv_actuators_10_0= ruleActuator ) )
            	    {
            	    otherlv_9=(Token)match(input,16,FOLLOW_26); 

            	    				newLeafNode(otherlv_9, grammarAccess.getGpioAnalogReadPerformOnHighAccess().getCommaKeyword_9_0());
            	    			
            	    // InternalIotDsl.g:2821:4: ( (lv_actuators_10_0= ruleActuator ) )
            	    // InternalIotDsl.g:2822:5: (lv_actuators_10_0= ruleActuator )
            	    {
            	    // InternalIotDsl.g:2822:5: (lv_actuators_10_0= ruleActuator )
            	    // InternalIotDsl.g:2823:6: lv_actuators_10_0= ruleActuator
            	    {

            	    						newCompositeNode(grammarAccess.getGpioAnalogReadPerformOnHighAccess().getActuatorsActuatorParserRuleCall_9_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_actuators_10_0=ruleActuator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGpioAnalogReadPerformOnHighRule());
            	    						}
            	    						add(
            	    							current,
            	    							"actuators",
            	    							lv_actuators_10_0,
            	    							"es.udima.tfm.cesarlaso.IotDsl.Actuator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            otherlv_11=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getGpioAnalogReadPerformOnHighAccess().getRightCurlyBracketKeyword_10());
            		

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
    // $ANTLR end "ruleGpioAnalogReadPerformOnHigh"


    // $ANTLR start "entryRuleGpioAnalogReadPerformOnLow"
    // InternalIotDsl.g:2849:1: entryRuleGpioAnalogReadPerformOnLow returns [EObject current=null] : iv_ruleGpioAnalogReadPerformOnLow= ruleGpioAnalogReadPerformOnLow EOF ;
    public final EObject entryRuleGpioAnalogReadPerformOnLow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGpioAnalogReadPerformOnLow = null;


        try {
            // InternalIotDsl.g:2849:67: (iv_ruleGpioAnalogReadPerformOnLow= ruleGpioAnalogReadPerformOnLow EOF )
            // InternalIotDsl.g:2850:2: iv_ruleGpioAnalogReadPerformOnLow= ruleGpioAnalogReadPerformOnLow EOF
            {
             newCompositeNode(grammarAccess.getGpioAnalogReadPerformOnLowRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGpioAnalogReadPerformOnLow=ruleGpioAnalogReadPerformOnLow();

            state._fsp--;

             current =iv_ruleGpioAnalogReadPerformOnLow; 
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
    // $ANTLR end "entryRuleGpioAnalogReadPerformOnLow"


    // $ANTLR start "ruleGpioAnalogReadPerformOnLow"
    // InternalIotDsl.g:2856:1: ruleGpioAnalogReadPerformOnLow returns [EObject current=null] : (otherlv_0= 'analog_read_on_low' ( ( ruleEString ) ) otherlv_2= 'every' ( (lv_pollIntervalLoops_3_0= ruleEInt ) ) otherlv_4= 'loops' otherlv_5= 'value_lower_than' ( (lv_value_6_0= ruleEInt ) ) otherlv_7= '{' ( (lv_actuators_8_0= ruleActuator ) ) (otherlv_9= ',' ( (lv_actuators_10_0= ruleActuator ) ) )* otherlv_11= '}' ) ;
    public final EObject ruleGpioAnalogReadPerformOnLow() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_pollIntervalLoops_3_0 = null;

        AntlrDatatypeRuleToken lv_value_6_0 = null;

        EObject lv_actuators_8_0 = null;

        EObject lv_actuators_10_0 = null;



        	enterRule();

        try {
            // InternalIotDsl.g:2862:2: ( (otherlv_0= 'analog_read_on_low' ( ( ruleEString ) ) otherlv_2= 'every' ( (lv_pollIntervalLoops_3_0= ruleEInt ) ) otherlv_4= 'loops' otherlv_5= 'value_lower_than' ( (lv_value_6_0= ruleEInt ) ) otherlv_7= '{' ( (lv_actuators_8_0= ruleActuator ) ) (otherlv_9= ',' ( (lv_actuators_10_0= ruleActuator ) ) )* otherlv_11= '}' ) )
            // InternalIotDsl.g:2863:2: (otherlv_0= 'analog_read_on_low' ( ( ruleEString ) ) otherlv_2= 'every' ( (lv_pollIntervalLoops_3_0= ruleEInt ) ) otherlv_4= 'loops' otherlv_5= 'value_lower_than' ( (lv_value_6_0= ruleEInt ) ) otherlv_7= '{' ( (lv_actuators_8_0= ruleActuator ) ) (otherlv_9= ',' ( (lv_actuators_10_0= ruleActuator ) ) )* otherlv_11= '}' )
            {
            // InternalIotDsl.g:2863:2: (otherlv_0= 'analog_read_on_low' ( ( ruleEString ) ) otherlv_2= 'every' ( (lv_pollIntervalLoops_3_0= ruleEInt ) ) otherlv_4= 'loops' otherlv_5= 'value_lower_than' ( (lv_value_6_0= ruleEInt ) ) otherlv_7= '{' ( (lv_actuators_8_0= ruleActuator ) ) (otherlv_9= ',' ( (lv_actuators_10_0= ruleActuator ) ) )* otherlv_11= '}' )
            // InternalIotDsl.g:2864:3: otherlv_0= 'analog_read_on_low' ( ( ruleEString ) ) otherlv_2= 'every' ( (lv_pollIntervalLoops_3_0= ruleEInt ) ) otherlv_4= 'loops' otherlv_5= 'value_lower_than' ( (lv_value_6_0= ruleEInt ) ) otherlv_7= '{' ( (lv_actuators_8_0= ruleActuator ) ) (otherlv_9= ',' ( (lv_actuators_10_0= ruleActuator ) ) )* otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGpioAnalogReadPerformOnLowAccess().getAnalog_read_on_lowKeyword_0());
            		
            // InternalIotDsl.g:2868:3: ( ( ruleEString ) )
            // InternalIotDsl.g:2869:4: ( ruleEString )
            {
            // InternalIotDsl.g:2869:4: ( ruleEString )
            // InternalIotDsl.g:2870:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGpioAnalogReadPerformOnLowRule());
            					}
            				

            					newCompositeNode(grammarAccess.getGpioAnalogReadPerformOnLowAccess().getPinAnalogInputPinCrossReference_1_0());
            				
            pushFollow(FOLLOW_35);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,47,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getGpioAnalogReadPerformOnLowAccess().getEveryKeyword_2());
            		
            // InternalIotDsl.g:2888:3: ( (lv_pollIntervalLoops_3_0= ruleEInt ) )
            // InternalIotDsl.g:2889:4: (lv_pollIntervalLoops_3_0= ruleEInt )
            {
            // InternalIotDsl.g:2889:4: (lv_pollIntervalLoops_3_0= ruleEInt )
            // InternalIotDsl.g:2890:5: lv_pollIntervalLoops_3_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getGpioAnalogReadPerformOnLowAccess().getPollIntervalLoopsEIntParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_36);
            lv_pollIntervalLoops_3_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGpioAnalogReadPerformOnLowRule());
            					}
            					set(
            						current,
            						"pollIntervalLoops",
            						lv_pollIntervalLoops_3_0,
            						"es.udima.tfm.cesarlaso.IotDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,48,FOLLOW_38); 

            			newLeafNode(otherlv_4, grammarAccess.getGpioAnalogReadPerformOnLowAccess().getLoopsKeyword_4());
            		
            otherlv_5=(Token)match(input,52,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getGpioAnalogReadPerformOnLowAccess().getValue_lower_thanKeyword_5());
            		
            // InternalIotDsl.g:2915:3: ( (lv_value_6_0= ruleEInt ) )
            // InternalIotDsl.g:2916:4: (lv_value_6_0= ruleEInt )
            {
            // InternalIotDsl.g:2916:4: (lv_value_6_0= ruleEInt )
            // InternalIotDsl.g:2917:5: lv_value_6_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getGpioAnalogReadPerformOnLowAccess().getValueEIntParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_4);
            lv_value_6_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGpioAnalogReadPerformOnLowRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_6_0,
            						"es.udima.tfm.cesarlaso.IotDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_7, grammarAccess.getGpioAnalogReadPerformOnLowAccess().getLeftCurlyBracketKeyword_7());
            		
            // InternalIotDsl.g:2938:3: ( (lv_actuators_8_0= ruleActuator ) )
            // InternalIotDsl.g:2939:4: (lv_actuators_8_0= ruleActuator )
            {
            // InternalIotDsl.g:2939:4: (lv_actuators_8_0= ruleActuator )
            // InternalIotDsl.g:2940:5: lv_actuators_8_0= ruleActuator
            {

            					newCompositeNode(grammarAccess.getGpioAnalogReadPerformOnLowAccess().getActuatorsActuatorParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_10);
            lv_actuators_8_0=ruleActuator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGpioAnalogReadPerformOnLowRule());
            					}
            					add(
            						current,
            						"actuators",
            						lv_actuators_8_0,
            						"es.udima.tfm.cesarlaso.IotDsl.Actuator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalIotDsl.g:2957:3: (otherlv_9= ',' ( (lv_actuators_10_0= ruleActuator ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==16) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalIotDsl.g:2958:4: otherlv_9= ',' ( (lv_actuators_10_0= ruleActuator ) )
            	    {
            	    otherlv_9=(Token)match(input,16,FOLLOW_26); 

            	    				newLeafNode(otherlv_9, grammarAccess.getGpioAnalogReadPerformOnLowAccess().getCommaKeyword_9_0());
            	    			
            	    // InternalIotDsl.g:2962:4: ( (lv_actuators_10_0= ruleActuator ) )
            	    // InternalIotDsl.g:2963:5: (lv_actuators_10_0= ruleActuator )
            	    {
            	    // InternalIotDsl.g:2963:5: (lv_actuators_10_0= ruleActuator )
            	    // InternalIotDsl.g:2964:6: lv_actuators_10_0= ruleActuator
            	    {

            	    						newCompositeNode(grammarAccess.getGpioAnalogReadPerformOnLowAccess().getActuatorsActuatorParserRuleCall_9_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_actuators_10_0=ruleActuator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGpioAnalogReadPerformOnLowRule());
            	    						}
            	    						add(
            	    							current,
            	    							"actuators",
            	    							lv_actuators_10_0,
            	    							"es.udima.tfm.cesarlaso.IotDsl.Actuator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            otherlv_11=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getGpioAnalogReadPerformOnLowAccess().getRightCurlyBracketKeyword_10());
            		

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
    // $ANTLR end "ruleGpioAnalogReadPerformOnLow"


    // $ANTLR start "entryRuleTime"
    // InternalIotDsl.g:2990:1: entryRuleTime returns [EObject current=null] : iv_ruleTime= ruleTime EOF ;
    public final EObject entryRuleTime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTime = null;


        try {
            // InternalIotDsl.g:2990:45: (iv_ruleTime= ruleTime EOF )
            // InternalIotDsl.g:2991:2: iv_ruleTime= ruleTime EOF
            {
             newCompositeNode(grammarAccess.getTimeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTime=ruleTime();

            state._fsp--;

             current =iv_ruleTime; 
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
    // $ANTLR end "entryRuleTime"


    // $ANTLR start "ruleTime"
    // InternalIotDsl.g:2997:1: ruleTime returns [EObject current=null] : ( ( (lv_hour_0_0= ruleEInt ) ) otherlv_1= 'h' ( (lv_minute_2_0= ruleEInt ) ) otherlv_3= 'm' ( (lv_second_4_0= ruleEInt ) ) otherlv_5= 's' ) ;
    public final EObject ruleTime() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_hour_0_0 = null;

        AntlrDatatypeRuleToken lv_minute_2_0 = null;

        AntlrDatatypeRuleToken lv_second_4_0 = null;



        	enterRule();

        try {
            // InternalIotDsl.g:3003:2: ( ( ( (lv_hour_0_0= ruleEInt ) ) otherlv_1= 'h' ( (lv_minute_2_0= ruleEInt ) ) otherlv_3= 'm' ( (lv_second_4_0= ruleEInt ) ) otherlv_5= 's' ) )
            // InternalIotDsl.g:3004:2: ( ( (lv_hour_0_0= ruleEInt ) ) otherlv_1= 'h' ( (lv_minute_2_0= ruleEInt ) ) otherlv_3= 'm' ( (lv_second_4_0= ruleEInt ) ) otherlv_5= 's' )
            {
            // InternalIotDsl.g:3004:2: ( ( (lv_hour_0_0= ruleEInt ) ) otherlv_1= 'h' ( (lv_minute_2_0= ruleEInt ) ) otherlv_3= 'm' ( (lv_second_4_0= ruleEInt ) ) otherlv_5= 's' )
            // InternalIotDsl.g:3005:3: ( (lv_hour_0_0= ruleEInt ) ) otherlv_1= 'h' ( (lv_minute_2_0= ruleEInt ) ) otherlv_3= 'm' ( (lv_second_4_0= ruleEInt ) ) otherlv_5= 's'
            {
            // InternalIotDsl.g:3005:3: ( (lv_hour_0_0= ruleEInt ) )
            // InternalIotDsl.g:3006:4: (lv_hour_0_0= ruleEInt )
            {
            // InternalIotDsl.g:3006:4: (lv_hour_0_0= ruleEInt )
            // InternalIotDsl.g:3007:5: lv_hour_0_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getTimeAccess().getHourEIntParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_39);
            lv_hour_0_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTimeRule());
            					}
            					set(
            						current,
            						"hour",
            						lv_hour_0_0,
            						"es.udima.tfm.cesarlaso.IotDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,53,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getTimeAccess().getHKeyword_1());
            		
            // InternalIotDsl.g:3028:3: ( (lv_minute_2_0= ruleEInt ) )
            // InternalIotDsl.g:3029:4: (lv_minute_2_0= ruleEInt )
            {
            // InternalIotDsl.g:3029:4: (lv_minute_2_0= ruleEInt )
            // InternalIotDsl.g:3030:5: lv_minute_2_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getTimeAccess().getMinuteEIntParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_40);
            lv_minute_2_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTimeRule());
            					}
            					set(
            						current,
            						"minute",
            						lv_minute_2_0,
            						"es.udima.tfm.cesarlaso.IotDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,54,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getTimeAccess().getMKeyword_3());
            		
            // InternalIotDsl.g:3051:3: ( (lv_second_4_0= ruleEInt ) )
            // InternalIotDsl.g:3052:4: (lv_second_4_0= ruleEInt )
            {
            // InternalIotDsl.g:3052:4: (lv_second_4_0= ruleEInt )
            // InternalIotDsl.g:3053:5: lv_second_4_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getTimeAccess().getSecondEIntParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_41);
            lv_second_4_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTimeRule());
            					}
            					set(
            						current,
            						"second",
            						lv_second_4_0,
            						"es.udima.tfm.cesarlaso.IotDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,55,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getTimeAccess().getSKeyword_5());
            		

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
    // $ANTLR end "ruleTime"


    // $ANTLR start "entryRuleTimeUnitValue"
    // InternalIotDsl.g:3078:1: entryRuleTimeUnitValue returns [EObject current=null] : iv_ruleTimeUnitValue= ruleTimeUnitValue EOF ;
    public final EObject entryRuleTimeUnitValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeUnitValue = null;


        try {
            // InternalIotDsl.g:3078:54: (iv_ruleTimeUnitValue= ruleTimeUnitValue EOF )
            // InternalIotDsl.g:3079:2: iv_ruleTimeUnitValue= ruleTimeUnitValue EOF
            {
             newCompositeNode(grammarAccess.getTimeUnitValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTimeUnitValue=ruleTimeUnitValue();

            state._fsp--;

             current =iv_ruleTimeUnitValue; 
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
    // $ANTLR end "entryRuleTimeUnitValue"


    // $ANTLR start "ruleTimeUnitValue"
    // InternalIotDsl.g:3085:1: ruleTimeUnitValue returns [EObject current=null] : ( ( (lv_value_0_0= ruleEInt ) ) ( (lv_unit_1_0= ruleTimeUnitType ) ) ) ;
    public final EObject ruleTimeUnitValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;

        Enumerator lv_unit_1_0 = null;



        	enterRule();

        try {
            // InternalIotDsl.g:3091:2: ( ( ( (lv_value_0_0= ruleEInt ) ) ( (lv_unit_1_0= ruleTimeUnitType ) ) ) )
            // InternalIotDsl.g:3092:2: ( ( (lv_value_0_0= ruleEInt ) ) ( (lv_unit_1_0= ruleTimeUnitType ) ) )
            {
            // InternalIotDsl.g:3092:2: ( ( (lv_value_0_0= ruleEInt ) ) ( (lv_unit_1_0= ruleTimeUnitType ) ) )
            // InternalIotDsl.g:3093:3: ( (lv_value_0_0= ruleEInt ) ) ( (lv_unit_1_0= ruleTimeUnitType ) )
            {
            // InternalIotDsl.g:3093:3: ( (lv_value_0_0= ruleEInt ) )
            // InternalIotDsl.g:3094:4: (lv_value_0_0= ruleEInt )
            {
            // InternalIotDsl.g:3094:4: (lv_value_0_0= ruleEInt )
            // InternalIotDsl.g:3095:5: lv_value_0_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getTimeUnitValueAccess().getValueEIntParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_42);
            lv_value_0_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTimeUnitValueRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_0_0,
            						"es.udima.tfm.cesarlaso.IotDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalIotDsl.g:3112:3: ( (lv_unit_1_0= ruleTimeUnitType ) )
            // InternalIotDsl.g:3113:4: (lv_unit_1_0= ruleTimeUnitType )
            {
            // InternalIotDsl.g:3113:4: (lv_unit_1_0= ruleTimeUnitType )
            // InternalIotDsl.g:3114:5: lv_unit_1_0= ruleTimeUnitType
            {

            					newCompositeNode(grammarAccess.getTimeUnitValueAccess().getUnitTimeUnitTypeEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_unit_1_0=ruleTimeUnitType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTimeUnitValueRule());
            					}
            					set(
            						current,
            						"unit",
            						lv_unit_1_0,
            						"es.udima.tfm.cesarlaso.IotDsl.TimeUnitType");
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
    // $ANTLR end "ruleTimeUnitValue"


    // $ANTLR start "entryRuleFilePath"
    // InternalIotDsl.g:3135:1: entryRuleFilePath returns [EObject current=null] : iv_ruleFilePath= ruleFilePath EOF ;
    public final EObject entryRuleFilePath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilePath = null;


        try {
            // InternalIotDsl.g:3135:49: (iv_ruleFilePath= ruleFilePath EOF )
            // InternalIotDsl.g:3136:2: iv_ruleFilePath= ruleFilePath EOF
            {
             newCompositeNode(grammarAccess.getFilePathRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFilePath=ruleFilePath();

            state._fsp--;

             current =iv_ruleFilePath; 
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
    // $ANTLR end "entryRuleFilePath"


    // $ANTLR start "ruleFilePath"
    // InternalIotDsl.g:3142:1: ruleFilePath returns [EObject current=null] : (otherlv_0= 'file_path' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'with_path' ( (lv_filePath_3_0= ruleEString ) ) ) ;
    public final EObject ruleFilePath() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_filePath_3_0 = null;



        	enterRule();

        try {
            // InternalIotDsl.g:3148:2: ( (otherlv_0= 'file_path' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'with_path' ( (lv_filePath_3_0= ruleEString ) ) ) )
            // InternalIotDsl.g:3149:2: (otherlv_0= 'file_path' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'with_path' ( (lv_filePath_3_0= ruleEString ) ) )
            {
            // InternalIotDsl.g:3149:2: (otherlv_0= 'file_path' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'with_path' ( (lv_filePath_3_0= ruleEString ) ) )
            // InternalIotDsl.g:3150:3: otherlv_0= 'file_path' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'with_path' ( (lv_filePath_3_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,56,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFilePathAccess().getFile_pathKeyword_0());
            		
            // InternalIotDsl.g:3154:3: ( (lv_name_1_0= ruleEString ) )
            // InternalIotDsl.g:3155:4: (lv_name_1_0= ruleEString )
            {
            // InternalIotDsl.g:3155:4: (lv_name_1_0= ruleEString )
            // InternalIotDsl.g:3156:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFilePathAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_43);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFilePathRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"es.udima.tfm.cesarlaso.IotDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,57,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getFilePathAccess().getWith_pathKeyword_2());
            		
            // InternalIotDsl.g:3177:3: ( (lv_filePath_3_0= ruleEString ) )
            // InternalIotDsl.g:3178:4: (lv_filePath_3_0= ruleEString )
            {
            // InternalIotDsl.g:3178:4: (lv_filePath_3_0= ruleEString )
            // InternalIotDsl.g:3179:5: lv_filePath_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFilePathAccess().getFilePathEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_filePath_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFilePathRule());
            					}
            					set(
            						current,
            						"filePath",
            						lv_filePath_3_0,
            						"es.udima.tfm.cesarlaso.IotDsl.EString");
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
    // $ANTLR end "ruleFilePath"


    // $ANTLR start "entryRuleRemoteEvent"
    // InternalIotDsl.g:3200:1: entryRuleRemoteEvent returns [EObject current=null] : iv_ruleRemoteEvent= ruleRemoteEvent EOF ;
    public final EObject entryRuleRemoteEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRemoteEvent = null;


        try {
            // InternalIotDsl.g:3200:52: (iv_ruleRemoteEvent= ruleRemoteEvent EOF )
            // InternalIotDsl.g:3201:2: iv_ruleRemoteEvent= ruleRemoteEvent EOF
            {
             newCompositeNode(grammarAccess.getRemoteEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRemoteEvent=ruleRemoteEvent();

            state._fsp--;

             current =iv_ruleRemoteEvent; 
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
    // $ANTLR end "entryRuleRemoteEvent"


    // $ANTLR start "ruleRemoteEvent"
    // InternalIotDsl.g:3207:1: ruleRemoteEvent returns [EObject current=null] : (otherlv_0= 'remote_event' ( ( ruleEString ) ) otherlv_2= '{' ( (lv_actuators_3_0= ruleActuator ) ) (otherlv_4= ',' ( (lv_actuators_5_0= ruleActuator ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleRemoteEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_actuators_3_0 = null;

        EObject lv_actuators_5_0 = null;



        	enterRule();

        try {
            // InternalIotDsl.g:3213:2: ( (otherlv_0= 'remote_event' ( ( ruleEString ) ) otherlv_2= '{' ( (lv_actuators_3_0= ruleActuator ) ) (otherlv_4= ',' ( (lv_actuators_5_0= ruleActuator ) ) )* otherlv_6= '}' ) )
            // InternalIotDsl.g:3214:2: (otherlv_0= 'remote_event' ( ( ruleEString ) ) otherlv_2= '{' ( (lv_actuators_3_0= ruleActuator ) ) (otherlv_4= ',' ( (lv_actuators_5_0= ruleActuator ) ) )* otherlv_6= '}' )
            {
            // InternalIotDsl.g:3214:2: (otherlv_0= 'remote_event' ( ( ruleEString ) ) otherlv_2= '{' ( (lv_actuators_3_0= ruleActuator ) ) (otherlv_4= ',' ( (lv_actuators_5_0= ruleActuator ) ) )* otherlv_6= '}' )
            // InternalIotDsl.g:3215:3: otherlv_0= 'remote_event' ( ( ruleEString ) ) otherlv_2= '{' ( (lv_actuators_3_0= ruleActuator ) ) (otherlv_4= ',' ( (lv_actuators_5_0= ruleActuator ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,58,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRemoteEventAccess().getRemote_eventKeyword_0());
            		
            // InternalIotDsl.g:3219:3: ( ( ruleEString ) )
            // InternalIotDsl.g:3220:4: ( ruleEString )
            {
            // InternalIotDsl.g:3220:4: ( ruleEString )
            // InternalIotDsl.g:3221:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRemoteEventRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRemoteEventAccess().getIdentifierRemoteEventIdentifierCrossReference_1_0());
            				
            pushFollow(FOLLOW_4);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getRemoteEventAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalIotDsl.g:3239:3: ( (lv_actuators_3_0= ruleActuator ) )
            // InternalIotDsl.g:3240:4: (lv_actuators_3_0= ruleActuator )
            {
            // InternalIotDsl.g:3240:4: (lv_actuators_3_0= ruleActuator )
            // InternalIotDsl.g:3241:5: lv_actuators_3_0= ruleActuator
            {

            					newCompositeNode(grammarAccess.getRemoteEventAccess().getActuatorsActuatorParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_10);
            lv_actuators_3_0=ruleActuator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRemoteEventRule());
            					}
            					add(
            						current,
            						"actuators",
            						lv_actuators_3_0,
            						"es.udima.tfm.cesarlaso.IotDsl.Actuator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalIotDsl.g:3258:3: (otherlv_4= ',' ( (lv_actuators_5_0= ruleActuator ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==16) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalIotDsl.g:3259:4: otherlv_4= ',' ( (lv_actuators_5_0= ruleActuator ) )
            	    {
            	    otherlv_4=(Token)match(input,16,FOLLOW_26); 

            	    				newLeafNode(otherlv_4, grammarAccess.getRemoteEventAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalIotDsl.g:3263:4: ( (lv_actuators_5_0= ruleActuator ) )
            	    // InternalIotDsl.g:3264:5: (lv_actuators_5_0= ruleActuator )
            	    {
            	    // InternalIotDsl.g:3264:5: (lv_actuators_5_0= ruleActuator )
            	    // InternalIotDsl.g:3265:6: lv_actuators_5_0= ruleActuator
            	    {

            	    						newCompositeNode(grammarAccess.getRemoteEventAccess().getActuatorsActuatorParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_actuators_5_0=ruleActuator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRemoteEventRule());
            	    						}
            	    						add(
            	    							current,
            	    							"actuators",
            	    							lv_actuators_5_0,
            	    							"es.udima.tfm.cesarlaso.IotDsl.Actuator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            otherlv_6=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getRemoteEventAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleRemoteEvent"


    // $ANTLR start "entryRuleRemoteActuator"
    // InternalIotDsl.g:3291:1: entryRuleRemoteActuator returns [EObject current=null] : iv_ruleRemoteActuator= ruleRemoteActuator EOF ;
    public final EObject entryRuleRemoteActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRemoteActuator = null;


        try {
            // InternalIotDsl.g:3291:55: (iv_ruleRemoteActuator= ruleRemoteActuator EOF )
            // InternalIotDsl.g:3292:2: iv_ruleRemoteActuator= ruleRemoteActuator EOF
            {
             newCompositeNode(grammarAccess.getRemoteActuatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRemoteActuator=ruleRemoteActuator();

            state._fsp--;

             current =iv_ruleRemoteActuator; 
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
    // $ANTLR end "entryRuleRemoteActuator"


    // $ANTLR start "ruleRemoteActuator"
    // InternalIotDsl.g:3298:1: ruleRemoteActuator returns [EObject current=null] : (otherlv_0= 'remote_actuator' ( ( ruleEString ) ) ) ;
    public final EObject ruleRemoteActuator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalIotDsl.g:3304:2: ( (otherlv_0= 'remote_actuator' ( ( ruleEString ) ) ) )
            // InternalIotDsl.g:3305:2: (otherlv_0= 'remote_actuator' ( ( ruleEString ) ) )
            {
            // InternalIotDsl.g:3305:2: (otherlv_0= 'remote_actuator' ( ( ruleEString ) ) )
            // InternalIotDsl.g:3306:3: otherlv_0= 'remote_actuator' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,59,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRemoteActuatorAccess().getRemote_actuatorKeyword_0());
            		
            // InternalIotDsl.g:3310:3: ( ( ruleEString ) )
            // InternalIotDsl.g:3311:4: ( ruleEString )
            {
            // InternalIotDsl.g:3311:4: ( ruleEString )
            // InternalIotDsl.g:3312:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRemoteActuatorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRemoteActuatorAccess().getIdentifierRemoteActuatorIdentifierCrossReference_1_0());
            				
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
    // $ANTLR end "ruleRemoteActuator"


    // $ANTLR start "entryRuleSystemCommand"
    // InternalIotDsl.g:3330:1: entryRuleSystemCommand returns [EObject current=null] : iv_ruleSystemCommand= ruleSystemCommand EOF ;
    public final EObject entryRuleSystemCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemCommand = null;


        try {
            // InternalIotDsl.g:3330:54: (iv_ruleSystemCommand= ruleSystemCommand EOF )
            // InternalIotDsl.g:3331:2: iv_ruleSystemCommand= ruleSystemCommand EOF
            {
             newCompositeNode(grammarAccess.getSystemCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSystemCommand=ruleSystemCommand();

            state._fsp--;

             current =iv_ruleSystemCommand; 
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
    // $ANTLR end "entryRuleSystemCommand"


    // $ANTLR start "ruleSystemCommand"
    // InternalIotDsl.g:3337:1: ruleSystemCommand returns [EObject current=null] : (otherlv_0= 'system_command' ( ( ruleEString ) ) ) ;
    public final EObject ruleSystemCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalIotDsl.g:3343:2: ( (otherlv_0= 'system_command' ( ( ruleEString ) ) ) )
            // InternalIotDsl.g:3344:2: (otherlv_0= 'system_command' ( ( ruleEString ) ) )
            {
            // InternalIotDsl.g:3344:2: (otherlv_0= 'system_command' ( ( ruleEString ) ) )
            // InternalIotDsl.g:3345:3: otherlv_0= 'system_command' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,60,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSystemCommandAccess().getSystem_commandKeyword_0());
            		
            // InternalIotDsl.g:3349:3: ( ( ruleEString ) )
            // InternalIotDsl.g:3350:4: ( ruleEString )
            {
            // InternalIotDsl.g:3350:4: ( ruleEString )
            // InternalIotDsl.g:3351:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSystemCommandRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSystemCommandAccess().getFilePathFilePathCrossReference_1_0());
            				
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
    // $ANTLR end "ruleSystemCommand"


    // $ANTLR start "entryRuleDownload"
    // InternalIotDsl.g:3369:1: entryRuleDownload returns [EObject current=null] : iv_ruleDownload= ruleDownload EOF ;
    public final EObject entryRuleDownload() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDownload = null;


        try {
            // InternalIotDsl.g:3369:49: (iv_ruleDownload= ruleDownload EOF )
            // InternalIotDsl.g:3370:2: iv_ruleDownload= ruleDownload EOF
            {
             newCompositeNode(grammarAccess.getDownloadRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDownload=ruleDownload();

            state._fsp--;

             current =iv_ruleDownload; 
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
    // $ANTLR end "entryRuleDownload"


    // $ANTLR start "ruleDownload"
    // InternalIotDsl.g:3376:1: ruleDownload returns [EObject current=null] : (otherlv_0= 'download' ( (lv_url_1_0= ruleEString ) ) otherlv_2= 'to' ( ( ruleEString ) ) ) ;
    public final EObject ruleDownload() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_url_1_0 = null;



        	enterRule();

        try {
            // InternalIotDsl.g:3382:2: ( (otherlv_0= 'download' ( (lv_url_1_0= ruleEString ) ) otherlv_2= 'to' ( ( ruleEString ) ) ) )
            // InternalIotDsl.g:3383:2: (otherlv_0= 'download' ( (lv_url_1_0= ruleEString ) ) otherlv_2= 'to' ( ( ruleEString ) ) )
            {
            // InternalIotDsl.g:3383:2: (otherlv_0= 'download' ( (lv_url_1_0= ruleEString ) ) otherlv_2= 'to' ( ( ruleEString ) ) )
            // InternalIotDsl.g:3384:3: otherlv_0= 'download' ( (lv_url_1_0= ruleEString ) ) otherlv_2= 'to' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,61,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDownloadAccess().getDownloadKeyword_0());
            		
            // InternalIotDsl.g:3388:3: ( (lv_url_1_0= ruleEString ) )
            // InternalIotDsl.g:3389:4: (lv_url_1_0= ruleEString )
            {
            // InternalIotDsl.g:3389:4: (lv_url_1_0= ruleEString )
            // InternalIotDsl.g:3390:5: lv_url_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDownloadAccess().getUrlEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_44);
            lv_url_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDownloadRule());
            					}
            					set(
            						current,
            						"url",
            						lv_url_1_0,
            						"es.udima.tfm.cesarlaso.IotDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,62,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getDownloadAccess().getToKeyword_2());
            		
            // InternalIotDsl.g:3411:3: ( ( ruleEString ) )
            // InternalIotDsl.g:3412:4: ( ruleEString )
            {
            // InternalIotDsl.g:3412:4: ( ruleEString )
            // InternalIotDsl.g:3413:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDownloadRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDownloadAccess().getFilePathFilePathCrossReference_3_0());
            				
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
    // $ANTLR end "ruleDownload"


    // $ANTLR start "entryRulePlaySound"
    // InternalIotDsl.g:3431:1: entryRulePlaySound returns [EObject current=null] : iv_rulePlaySound= rulePlaySound EOF ;
    public final EObject entryRulePlaySound() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlaySound = null;


        try {
            // InternalIotDsl.g:3431:50: (iv_rulePlaySound= rulePlaySound EOF )
            // InternalIotDsl.g:3432:2: iv_rulePlaySound= rulePlaySound EOF
            {
             newCompositeNode(grammarAccess.getPlaySoundRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlaySound=rulePlaySound();

            state._fsp--;

             current =iv_rulePlaySound; 
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
    // $ANTLR end "entryRulePlaySound"


    // $ANTLR start "rulePlaySound"
    // InternalIotDsl.g:3438:1: rulePlaySound returns [EObject current=null] : (otherlv_0= 'play_sound' (otherlv_1= 'with_volume' ( (lv_volume_2_0= ruleEInt ) ) )? ( ( ruleEString ) ) ) ;
    public final EObject rulePlaySound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_volume_2_0 = null;



        	enterRule();

        try {
            // InternalIotDsl.g:3444:2: ( (otherlv_0= 'play_sound' (otherlv_1= 'with_volume' ( (lv_volume_2_0= ruleEInt ) ) )? ( ( ruleEString ) ) ) )
            // InternalIotDsl.g:3445:2: (otherlv_0= 'play_sound' (otherlv_1= 'with_volume' ( (lv_volume_2_0= ruleEInt ) ) )? ( ( ruleEString ) ) )
            {
            // InternalIotDsl.g:3445:2: (otherlv_0= 'play_sound' (otherlv_1= 'with_volume' ( (lv_volume_2_0= ruleEInt ) ) )? ( ( ruleEString ) ) )
            // InternalIotDsl.g:3446:3: otherlv_0= 'play_sound' (otherlv_1= 'with_volume' ( (lv_volume_2_0= ruleEInt ) ) )? ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,63,FOLLOW_45); 

            			newLeafNode(otherlv_0, grammarAccess.getPlaySoundAccess().getPlay_soundKeyword_0());
            		
            // InternalIotDsl.g:3450:3: (otherlv_1= 'with_volume' ( (lv_volume_2_0= ruleEInt ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==64) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalIotDsl.g:3451:4: otherlv_1= 'with_volume' ( (lv_volume_2_0= ruleEInt ) )
                    {
                    otherlv_1=(Token)match(input,64,FOLLOW_6); 

                    				newLeafNode(otherlv_1, grammarAccess.getPlaySoundAccess().getWith_volumeKeyword_1_0());
                    			
                    // InternalIotDsl.g:3455:4: ( (lv_volume_2_0= ruleEInt ) )
                    // InternalIotDsl.g:3456:5: (lv_volume_2_0= ruleEInt )
                    {
                    // InternalIotDsl.g:3456:5: (lv_volume_2_0= ruleEInt )
                    // InternalIotDsl.g:3457:6: lv_volume_2_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getPlaySoundAccess().getVolumeEIntParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_3);
                    lv_volume_2_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPlaySoundRule());
                    						}
                    						set(
                    							current,
                    							"volume",
                    							lv_volume_2_0,
                    							"es.udima.tfm.cesarlaso.IotDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalIotDsl.g:3475:3: ( ( ruleEString ) )
            // InternalIotDsl.g:3476:4: ( ruleEString )
            {
            // InternalIotDsl.g:3476:4: ( ruleEString )
            // InternalIotDsl.g:3477:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlaySoundRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPlaySoundAccess().getFilePathFilePathCrossReference_2_0());
            				
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
    // $ANTLR end "rulePlaySound"


    // $ANTLR start "entryRuleBackgroundImage"
    // InternalIotDsl.g:3495:1: entryRuleBackgroundImage returns [EObject current=null] : iv_ruleBackgroundImage= ruleBackgroundImage EOF ;
    public final EObject entryRuleBackgroundImage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBackgroundImage = null;


        try {
            // InternalIotDsl.g:3495:56: (iv_ruleBackgroundImage= ruleBackgroundImage EOF )
            // InternalIotDsl.g:3496:2: iv_ruleBackgroundImage= ruleBackgroundImage EOF
            {
             newCompositeNode(grammarAccess.getBackgroundImageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBackgroundImage=ruleBackgroundImage();

            state._fsp--;

             current =iv_ruleBackgroundImage; 
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
    // $ANTLR end "entryRuleBackgroundImage"


    // $ANTLR start "ruleBackgroundImage"
    // InternalIotDsl.g:3502:1: ruleBackgroundImage returns [EObject current=null] : (otherlv_0= 'background_image' ( ( ruleEString ) ) ( (lv_resizeType_2_0= ruleResizeType ) ) ) ;
    public final EObject ruleBackgroundImage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_resizeType_2_0 = null;



        	enterRule();

        try {
            // InternalIotDsl.g:3508:2: ( (otherlv_0= 'background_image' ( ( ruleEString ) ) ( (lv_resizeType_2_0= ruleResizeType ) ) ) )
            // InternalIotDsl.g:3509:2: (otherlv_0= 'background_image' ( ( ruleEString ) ) ( (lv_resizeType_2_0= ruleResizeType ) ) )
            {
            // InternalIotDsl.g:3509:2: (otherlv_0= 'background_image' ( ( ruleEString ) ) ( (lv_resizeType_2_0= ruleResizeType ) ) )
            // InternalIotDsl.g:3510:3: otherlv_0= 'background_image' ( ( ruleEString ) ) ( (lv_resizeType_2_0= ruleResizeType ) )
            {
            otherlv_0=(Token)match(input,65,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getBackgroundImageAccess().getBackground_imageKeyword_0());
            		
            // InternalIotDsl.g:3514:3: ( ( ruleEString ) )
            // InternalIotDsl.g:3515:4: ( ruleEString )
            {
            // InternalIotDsl.g:3515:4: ( ruleEString )
            // InternalIotDsl.g:3516:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBackgroundImageRule());
            					}
            				

            					newCompositeNode(grammarAccess.getBackgroundImageAccess().getFilePathFilePathCrossReference_1_0());
            				
            pushFollow(FOLLOW_46);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalIotDsl.g:3530:3: ( (lv_resizeType_2_0= ruleResizeType ) )
            // InternalIotDsl.g:3531:4: (lv_resizeType_2_0= ruleResizeType )
            {
            // InternalIotDsl.g:3531:4: (lv_resizeType_2_0= ruleResizeType )
            // InternalIotDsl.g:3532:5: lv_resizeType_2_0= ruleResizeType
            {

            					newCompositeNode(grammarAccess.getBackgroundImageAccess().getResizeTypeResizeTypeEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_resizeType_2_0=ruleResizeType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBackgroundImageRule());
            					}
            					set(
            						current,
            						"resizeType",
            						lv_resizeType_2_0,
            						"es.udima.tfm.cesarlaso.IotDsl.ResizeType");
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
    // $ANTLR end "ruleBackgroundImage"


    // $ANTLR start "entryRuleDrawImage"
    // InternalIotDsl.g:3553:1: entryRuleDrawImage returns [EObject current=null] : iv_ruleDrawImage= ruleDrawImage EOF ;
    public final EObject entryRuleDrawImage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDrawImage = null;


        try {
            // InternalIotDsl.g:3553:50: (iv_ruleDrawImage= ruleDrawImage EOF )
            // InternalIotDsl.g:3554:2: iv_ruleDrawImage= ruleDrawImage EOF
            {
             newCompositeNode(grammarAccess.getDrawImageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDrawImage=ruleDrawImage();

            state._fsp--;

             current =iv_ruleDrawImage; 
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
    // $ANTLR end "entryRuleDrawImage"


    // $ANTLR start "ruleDrawImage"
    // InternalIotDsl.g:3560:1: ruleDrawImage returns [EObject current=null] : (otherlv_0= 'draw_image' ( ( ruleEString ) ) otherlv_2= '{' otherlv_3= 'x' ( (lv_positionX_4_0= ruleEInt ) ) otherlv_5= 'y' ( (lv_positionY_6_0= ruleEInt ) ) otherlv_7= 'z' ( (lv_positionZ_8_0= ruleEInt ) ) otherlv_9= 'color' ( (lv_color_10_0= ruleELong ) ) otherlv_11= 'resize' ( (lv_resizeType_12_0= ruleResizeType ) ) otherlv_13= '}' ) ;
    public final EObject ruleDrawImage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_positionX_4_0 = null;

        AntlrDatatypeRuleToken lv_positionY_6_0 = null;

        AntlrDatatypeRuleToken lv_positionZ_8_0 = null;

        AntlrDatatypeRuleToken lv_color_10_0 = null;

        Enumerator lv_resizeType_12_0 = null;



        	enterRule();

        try {
            // InternalIotDsl.g:3566:2: ( (otherlv_0= 'draw_image' ( ( ruleEString ) ) otherlv_2= '{' otherlv_3= 'x' ( (lv_positionX_4_0= ruleEInt ) ) otherlv_5= 'y' ( (lv_positionY_6_0= ruleEInt ) ) otherlv_7= 'z' ( (lv_positionZ_8_0= ruleEInt ) ) otherlv_9= 'color' ( (lv_color_10_0= ruleELong ) ) otherlv_11= 'resize' ( (lv_resizeType_12_0= ruleResizeType ) ) otherlv_13= '}' ) )
            // InternalIotDsl.g:3567:2: (otherlv_0= 'draw_image' ( ( ruleEString ) ) otherlv_2= '{' otherlv_3= 'x' ( (lv_positionX_4_0= ruleEInt ) ) otherlv_5= 'y' ( (lv_positionY_6_0= ruleEInt ) ) otherlv_7= 'z' ( (lv_positionZ_8_0= ruleEInt ) ) otherlv_9= 'color' ( (lv_color_10_0= ruleELong ) ) otherlv_11= 'resize' ( (lv_resizeType_12_0= ruleResizeType ) ) otherlv_13= '}' )
            {
            // InternalIotDsl.g:3567:2: (otherlv_0= 'draw_image' ( ( ruleEString ) ) otherlv_2= '{' otherlv_3= 'x' ( (lv_positionX_4_0= ruleEInt ) ) otherlv_5= 'y' ( (lv_positionY_6_0= ruleEInt ) ) otherlv_7= 'z' ( (lv_positionZ_8_0= ruleEInt ) ) otherlv_9= 'color' ( (lv_color_10_0= ruleELong ) ) otherlv_11= 'resize' ( (lv_resizeType_12_0= ruleResizeType ) ) otherlv_13= '}' )
            // InternalIotDsl.g:3568:3: otherlv_0= 'draw_image' ( ( ruleEString ) ) otherlv_2= '{' otherlv_3= 'x' ( (lv_positionX_4_0= ruleEInt ) ) otherlv_5= 'y' ( (lv_positionY_6_0= ruleEInt ) ) otherlv_7= 'z' ( (lv_positionZ_8_0= ruleEInt ) ) otherlv_9= 'color' ( (lv_color_10_0= ruleELong ) ) otherlv_11= 'resize' ( (lv_resizeType_12_0= ruleResizeType ) ) otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,66,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDrawImageAccess().getDraw_imageKeyword_0());
            		
            // InternalIotDsl.g:3572:3: ( ( ruleEString ) )
            // InternalIotDsl.g:3573:4: ( ruleEString )
            {
            // InternalIotDsl.g:3573:4: ( ruleEString )
            // InternalIotDsl.g:3574:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDrawImageRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDrawImageAccess().getFilePathFilePathCrossReference_1_0());
            				
            pushFollow(FOLLOW_4);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_47); 

            			newLeafNode(otherlv_2, grammarAccess.getDrawImageAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,67,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getDrawImageAccess().getXKeyword_3());
            		
            // InternalIotDsl.g:3596:3: ( (lv_positionX_4_0= ruleEInt ) )
            // InternalIotDsl.g:3597:4: (lv_positionX_4_0= ruleEInt )
            {
            // InternalIotDsl.g:3597:4: (lv_positionX_4_0= ruleEInt )
            // InternalIotDsl.g:3598:5: lv_positionX_4_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getDrawImageAccess().getPositionXEIntParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_48);
            lv_positionX_4_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDrawImageRule());
            					}
            					set(
            						current,
            						"positionX",
            						lv_positionX_4_0,
            						"es.udima.tfm.cesarlaso.IotDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,68,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getDrawImageAccess().getYKeyword_5());
            		
            // InternalIotDsl.g:3619:3: ( (lv_positionY_6_0= ruleEInt ) )
            // InternalIotDsl.g:3620:4: (lv_positionY_6_0= ruleEInt )
            {
            // InternalIotDsl.g:3620:4: (lv_positionY_6_0= ruleEInt )
            // InternalIotDsl.g:3621:5: lv_positionY_6_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getDrawImageAccess().getPositionYEIntParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_49);
            lv_positionY_6_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDrawImageRule());
            					}
            					set(
            						current,
            						"positionY",
            						lv_positionY_6_0,
            						"es.udima.tfm.cesarlaso.IotDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,69,FOLLOW_6); 

            			newLeafNode(otherlv_7, grammarAccess.getDrawImageAccess().getZKeyword_7());
            		
            // InternalIotDsl.g:3642:3: ( (lv_positionZ_8_0= ruleEInt ) )
            // InternalIotDsl.g:3643:4: (lv_positionZ_8_0= ruleEInt )
            {
            // InternalIotDsl.g:3643:4: (lv_positionZ_8_0= ruleEInt )
            // InternalIotDsl.g:3644:5: lv_positionZ_8_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getDrawImageAccess().getPositionZEIntParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_50);
            lv_positionZ_8_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDrawImageRule());
            					}
            					set(
            						current,
            						"positionZ",
            						lv_positionZ_8_0,
            						"es.udima.tfm.cesarlaso.IotDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,70,FOLLOW_6); 

            			newLeafNode(otherlv_9, grammarAccess.getDrawImageAccess().getColorKeyword_9());
            		
            // InternalIotDsl.g:3665:3: ( (lv_color_10_0= ruleELong ) )
            // InternalIotDsl.g:3666:4: (lv_color_10_0= ruleELong )
            {
            // InternalIotDsl.g:3666:4: (lv_color_10_0= ruleELong )
            // InternalIotDsl.g:3667:5: lv_color_10_0= ruleELong
            {

            					newCompositeNode(grammarAccess.getDrawImageAccess().getColorELongParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_51);
            lv_color_10_0=ruleELong();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDrawImageRule());
            					}
            					set(
            						current,
            						"color",
            						lv_color_10_0,
            						"es.udima.tfm.cesarlaso.IotDsl.ELong");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,71,FOLLOW_46); 

            			newLeafNode(otherlv_11, grammarAccess.getDrawImageAccess().getResizeKeyword_11());
            		
            // InternalIotDsl.g:3688:3: ( (lv_resizeType_12_0= ruleResizeType ) )
            // InternalIotDsl.g:3689:4: (lv_resizeType_12_0= ruleResizeType )
            {
            // InternalIotDsl.g:3689:4: (lv_resizeType_12_0= ruleResizeType )
            // InternalIotDsl.g:3690:5: lv_resizeType_12_0= ruleResizeType
            {

            					newCompositeNode(grammarAccess.getDrawImageAccess().getResizeTypeResizeTypeEnumRuleCall_12_0());
            				
            pushFollow(FOLLOW_14);
            lv_resizeType_12_0=ruleResizeType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDrawImageRule());
            					}
            					set(
            						current,
            						"resizeType",
            						lv_resizeType_12_0,
            						"es.udima.tfm.cesarlaso.IotDsl.ResizeType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getDrawImageAccess().getRightCurlyBracketKeyword_13());
            		

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
    // $ANTLR end "ruleDrawImage"


    // $ANTLR start "entryRulePlayVideo"
    // InternalIotDsl.g:3715:1: entryRulePlayVideo returns [EObject current=null] : iv_rulePlayVideo= rulePlayVideo EOF ;
    public final EObject entryRulePlayVideo() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlayVideo = null;


        try {
            // InternalIotDsl.g:3715:50: (iv_rulePlayVideo= rulePlayVideo EOF )
            // InternalIotDsl.g:3716:2: iv_rulePlayVideo= rulePlayVideo EOF
            {
             newCompositeNode(grammarAccess.getPlayVideoRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlayVideo=rulePlayVideo();

            state._fsp--;

             current =iv_rulePlayVideo; 
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
    // $ANTLR end "entryRulePlayVideo"


    // $ANTLR start "rulePlayVideo"
    // InternalIotDsl.g:3722:1: rulePlayVideo returns [EObject current=null] : (otherlv_0= 'play_video' ( ( ruleEString ) ) otherlv_2= '{' otherlv_3= 'x' ( (lv_positionX_4_0= ruleEInt ) ) otherlv_5= 'y' ( (lv_positionY_6_0= ruleEInt ) ) otherlv_7= 'z' ( (lv_positionZ_8_0= ruleEInt ) ) otherlv_9= 'color' ( (lv_color_10_0= ruleELong ) ) otherlv_11= 'resize' ( (lv_resizeType_12_0= ruleResizeType ) ) otherlv_13= '}' ) ;
    public final EObject rulePlayVideo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_positionX_4_0 = null;

        AntlrDatatypeRuleToken lv_positionY_6_0 = null;

        AntlrDatatypeRuleToken lv_positionZ_8_0 = null;

        AntlrDatatypeRuleToken lv_color_10_0 = null;

        Enumerator lv_resizeType_12_0 = null;



        	enterRule();

        try {
            // InternalIotDsl.g:3728:2: ( (otherlv_0= 'play_video' ( ( ruleEString ) ) otherlv_2= '{' otherlv_3= 'x' ( (lv_positionX_4_0= ruleEInt ) ) otherlv_5= 'y' ( (lv_positionY_6_0= ruleEInt ) ) otherlv_7= 'z' ( (lv_positionZ_8_0= ruleEInt ) ) otherlv_9= 'color' ( (lv_color_10_0= ruleELong ) ) otherlv_11= 'resize' ( (lv_resizeType_12_0= ruleResizeType ) ) otherlv_13= '}' ) )
            // InternalIotDsl.g:3729:2: (otherlv_0= 'play_video' ( ( ruleEString ) ) otherlv_2= '{' otherlv_3= 'x' ( (lv_positionX_4_0= ruleEInt ) ) otherlv_5= 'y' ( (lv_positionY_6_0= ruleEInt ) ) otherlv_7= 'z' ( (lv_positionZ_8_0= ruleEInt ) ) otherlv_9= 'color' ( (lv_color_10_0= ruleELong ) ) otherlv_11= 'resize' ( (lv_resizeType_12_0= ruleResizeType ) ) otherlv_13= '}' )
            {
            // InternalIotDsl.g:3729:2: (otherlv_0= 'play_video' ( ( ruleEString ) ) otherlv_2= '{' otherlv_3= 'x' ( (lv_positionX_4_0= ruleEInt ) ) otherlv_5= 'y' ( (lv_positionY_6_0= ruleEInt ) ) otherlv_7= 'z' ( (lv_positionZ_8_0= ruleEInt ) ) otherlv_9= 'color' ( (lv_color_10_0= ruleELong ) ) otherlv_11= 'resize' ( (lv_resizeType_12_0= ruleResizeType ) ) otherlv_13= '}' )
            // InternalIotDsl.g:3730:3: otherlv_0= 'play_video' ( ( ruleEString ) ) otherlv_2= '{' otherlv_3= 'x' ( (lv_positionX_4_0= ruleEInt ) ) otherlv_5= 'y' ( (lv_positionY_6_0= ruleEInt ) ) otherlv_7= 'z' ( (lv_positionZ_8_0= ruleEInt ) ) otherlv_9= 'color' ( (lv_color_10_0= ruleELong ) ) otherlv_11= 'resize' ( (lv_resizeType_12_0= ruleResizeType ) ) otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,72,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPlayVideoAccess().getPlay_videoKeyword_0());
            		
            // InternalIotDsl.g:3734:3: ( ( ruleEString ) )
            // InternalIotDsl.g:3735:4: ( ruleEString )
            {
            // InternalIotDsl.g:3735:4: ( ruleEString )
            // InternalIotDsl.g:3736:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlayVideoRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPlayVideoAccess().getFilePathFilePathCrossReference_1_0());
            				
            pushFollow(FOLLOW_4);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_47); 

            			newLeafNode(otherlv_2, grammarAccess.getPlayVideoAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,67,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getPlayVideoAccess().getXKeyword_3());
            		
            // InternalIotDsl.g:3758:3: ( (lv_positionX_4_0= ruleEInt ) )
            // InternalIotDsl.g:3759:4: (lv_positionX_4_0= ruleEInt )
            {
            // InternalIotDsl.g:3759:4: (lv_positionX_4_0= ruleEInt )
            // InternalIotDsl.g:3760:5: lv_positionX_4_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getPlayVideoAccess().getPositionXEIntParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_48);
            lv_positionX_4_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPlayVideoRule());
            					}
            					set(
            						current,
            						"positionX",
            						lv_positionX_4_0,
            						"es.udima.tfm.cesarlaso.IotDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,68,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getPlayVideoAccess().getYKeyword_5());
            		
            // InternalIotDsl.g:3781:3: ( (lv_positionY_6_0= ruleEInt ) )
            // InternalIotDsl.g:3782:4: (lv_positionY_6_0= ruleEInt )
            {
            // InternalIotDsl.g:3782:4: (lv_positionY_6_0= ruleEInt )
            // InternalIotDsl.g:3783:5: lv_positionY_6_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getPlayVideoAccess().getPositionYEIntParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_49);
            lv_positionY_6_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPlayVideoRule());
            					}
            					set(
            						current,
            						"positionY",
            						lv_positionY_6_0,
            						"es.udima.tfm.cesarlaso.IotDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,69,FOLLOW_6); 

            			newLeafNode(otherlv_7, grammarAccess.getPlayVideoAccess().getZKeyword_7());
            		
            // InternalIotDsl.g:3804:3: ( (lv_positionZ_8_0= ruleEInt ) )
            // InternalIotDsl.g:3805:4: (lv_positionZ_8_0= ruleEInt )
            {
            // InternalIotDsl.g:3805:4: (lv_positionZ_8_0= ruleEInt )
            // InternalIotDsl.g:3806:5: lv_positionZ_8_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getPlayVideoAccess().getPositionZEIntParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_50);
            lv_positionZ_8_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPlayVideoRule());
            					}
            					set(
            						current,
            						"positionZ",
            						lv_positionZ_8_0,
            						"es.udima.tfm.cesarlaso.IotDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,70,FOLLOW_6); 

            			newLeafNode(otherlv_9, grammarAccess.getPlayVideoAccess().getColorKeyword_9());
            		
            // InternalIotDsl.g:3827:3: ( (lv_color_10_0= ruleELong ) )
            // InternalIotDsl.g:3828:4: (lv_color_10_0= ruleELong )
            {
            // InternalIotDsl.g:3828:4: (lv_color_10_0= ruleELong )
            // InternalIotDsl.g:3829:5: lv_color_10_0= ruleELong
            {

            					newCompositeNode(grammarAccess.getPlayVideoAccess().getColorELongParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_51);
            lv_color_10_0=ruleELong();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPlayVideoRule());
            					}
            					set(
            						current,
            						"color",
            						lv_color_10_0,
            						"es.udima.tfm.cesarlaso.IotDsl.ELong");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,71,FOLLOW_46); 

            			newLeafNode(otherlv_11, grammarAccess.getPlayVideoAccess().getResizeKeyword_11());
            		
            // InternalIotDsl.g:3850:3: ( (lv_resizeType_12_0= ruleResizeType ) )
            // InternalIotDsl.g:3851:4: (lv_resizeType_12_0= ruleResizeType )
            {
            // InternalIotDsl.g:3851:4: (lv_resizeType_12_0= ruleResizeType )
            // InternalIotDsl.g:3852:5: lv_resizeType_12_0= ruleResizeType
            {

            					newCompositeNode(grammarAccess.getPlayVideoAccess().getResizeTypeResizeTypeEnumRuleCall_12_0());
            				
            pushFollow(FOLLOW_14);
            lv_resizeType_12_0=ruleResizeType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPlayVideoRule());
            					}
            					set(
            						current,
            						"resizeType",
            						lv_resizeType_12_0,
            						"es.udima.tfm.cesarlaso.IotDsl.ResizeType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getPlayVideoAccess().getRightCurlyBracketKeyword_13());
            		

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
    // $ANTLR end "rulePlayVideo"


    // $ANTLR start "entryRuleChangeStateActuator"
    // InternalIotDsl.g:3877:1: entryRuleChangeStateActuator returns [EObject current=null] : iv_ruleChangeStateActuator= ruleChangeStateActuator EOF ;
    public final EObject entryRuleChangeStateActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChangeStateActuator = null;


        try {
            // InternalIotDsl.g:3877:60: (iv_ruleChangeStateActuator= ruleChangeStateActuator EOF )
            // InternalIotDsl.g:3878:2: iv_ruleChangeStateActuator= ruleChangeStateActuator EOF
            {
             newCompositeNode(grammarAccess.getChangeStateActuatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChangeStateActuator=ruleChangeStateActuator();

            state._fsp--;

             current =iv_ruleChangeStateActuator; 
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
    // $ANTLR end "entryRuleChangeStateActuator"


    // $ANTLR start "ruleChangeStateActuator"
    // InternalIotDsl.g:3884:1: ruleChangeStateActuator returns [EObject current=null] : (otherlv_0= 'change_state' ( ( ruleEString ) ) ) ;
    public final EObject ruleChangeStateActuator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalIotDsl.g:3890:2: ( (otherlv_0= 'change_state' ( ( ruleEString ) ) ) )
            // InternalIotDsl.g:3891:2: (otherlv_0= 'change_state' ( ( ruleEString ) ) )
            {
            // InternalIotDsl.g:3891:2: (otherlv_0= 'change_state' ( ( ruleEString ) ) )
            // InternalIotDsl.g:3892:3: otherlv_0= 'change_state' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,73,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getChangeStateActuatorAccess().getChange_stateKeyword_0());
            		
            // InternalIotDsl.g:3896:3: ( ( ruleEString ) )
            // InternalIotDsl.g:3897:4: ( ruleEString )
            {
            // InternalIotDsl.g:3897:4: ( ruleEString )
            // InternalIotDsl.g:3898:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChangeStateActuatorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getChangeStateActuatorAccess().getStateProgramStateCrossReference_1_0());
            				
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
    // $ANTLR end "ruleChangeStateActuator"


    // $ANTLR start "entryRuleDigitalInputPin"
    // InternalIotDsl.g:3916:1: entryRuleDigitalInputPin returns [EObject current=null] : iv_ruleDigitalInputPin= ruleDigitalInputPin EOF ;
    public final EObject entryRuleDigitalInputPin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDigitalInputPin = null;


        try {
            // InternalIotDsl.g:3916:56: (iv_ruleDigitalInputPin= ruleDigitalInputPin EOF )
            // InternalIotDsl.g:3917:2: iv_ruleDigitalInputPin= ruleDigitalInputPin EOF
            {
             newCompositeNode(grammarAccess.getDigitalInputPinRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDigitalInputPin=ruleDigitalInputPin();

            state._fsp--;

             current =iv_ruleDigitalInputPin; 
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
    // $ANTLR end "entryRuleDigitalInputPin"


    // $ANTLR start "ruleDigitalInputPin"
    // InternalIotDsl.g:3923:1: ruleDigitalInputPin returns [EObject current=null] : (otherlv_0= 'gpio_input_digital' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'connected_to_pin' ( (lv_number_3_0= ruleEInt ) ) ) ;
    public final EObject ruleDigitalInputPin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_number_3_0 = null;



        	enterRule();

        try {
            // InternalIotDsl.g:3929:2: ( (otherlv_0= 'gpio_input_digital' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'connected_to_pin' ( (lv_number_3_0= ruleEInt ) ) ) )
            // InternalIotDsl.g:3930:2: (otherlv_0= 'gpio_input_digital' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'connected_to_pin' ( (lv_number_3_0= ruleEInt ) ) )
            {
            // InternalIotDsl.g:3930:2: (otherlv_0= 'gpio_input_digital' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'connected_to_pin' ( (lv_number_3_0= ruleEInt ) ) )
            // InternalIotDsl.g:3931:3: otherlv_0= 'gpio_input_digital' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'connected_to_pin' ( (lv_number_3_0= ruleEInt ) )
            {
            otherlv_0=(Token)match(input,74,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDigitalInputPinAccess().getGpio_input_digitalKeyword_0());
            		
            // InternalIotDsl.g:3935:3: ( (lv_name_1_0= ruleEString ) )
            // InternalIotDsl.g:3936:4: (lv_name_1_0= ruleEString )
            {
            // InternalIotDsl.g:3936:4: (lv_name_1_0= ruleEString )
            // InternalIotDsl.g:3937:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDigitalInputPinAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_52);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDigitalInputPinRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"es.udima.tfm.cesarlaso.IotDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,75,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getDigitalInputPinAccess().getConnected_to_pinKeyword_2());
            		
            // InternalIotDsl.g:3958:3: ( (lv_number_3_0= ruleEInt ) )
            // InternalIotDsl.g:3959:4: (lv_number_3_0= ruleEInt )
            {
            // InternalIotDsl.g:3959:4: (lv_number_3_0= ruleEInt )
            // InternalIotDsl.g:3960:5: lv_number_3_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getDigitalInputPinAccess().getNumberEIntParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_number_3_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDigitalInputPinRule());
            					}
            					set(
            						current,
            						"number",
            						lv_number_3_0,
            						"es.udima.tfm.cesarlaso.IotDsl.EInt");
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
    // $ANTLR end "ruleDigitalInputPin"


    // $ANTLR start "entryRuleDigitalOutputPin"
    // InternalIotDsl.g:3981:1: entryRuleDigitalOutputPin returns [EObject current=null] : iv_ruleDigitalOutputPin= ruleDigitalOutputPin EOF ;
    public final EObject entryRuleDigitalOutputPin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDigitalOutputPin = null;


        try {
            // InternalIotDsl.g:3981:57: (iv_ruleDigitalOutputPin= ruleDigitalOutputPin EOF )
            // InternalIotDsl.g:3982:2: iv_ruleDigitalOutputPin= ruleDigitalOutputPin EOF
            {
             newCompositeNode(grammarAccess.getDigitalOutputPinRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDigitalOutputPin=ruleDigitalOutputPin();

            state._fsp--;

             current =iv_ruleDigitalOutputPin; 
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
    // $ANTLR end "entryRuleDigitalOutputPin"


    // $ANTLR start "ruleDigitalOutputPin"
    // InternalIotDsl.g:3988:1: ruleDigitalOutputPin returns [EObject current=null] : (otherlv_0= 'gpio_output_digital' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'connected_to_pin' ( (lv_number_3_0= ruleEInt ) ) ) ;
    public final EObject ruleDigitalOutputPin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_number_3_0 = null;



        	enterRule();

        try {
            // InternalIotDsl.g:3994:2: ( (otherlv_0= 'gpio_output_digital' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'connected_to_pin' ( (lv_number_3_0= ruleEInt ) ) ) )
            // InternalIotDsl.g:3995:2: (otherlv_0= 'gpio_output_digital' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'connected_to_pin' ( (lv_number_3_0= ruleEInt ) ) )
            {
            // InternalIotDsl.g:3995:2: (otherlv_0= 'gpio_output_digital' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'connected_to_pin' ( (lv_number_3_0= ruleEInt ) ) )
            // InternalIotDsl.g:3996:3: otherlv_0= 'gpio_output_digital' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'connected_to_pin' ( (lv_number_3_0= ruleEInt ) )
            {
            otherlv_0=(Token)match(input,76,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDigitalOutputPinAccess().getGpio_output_digitalKeyword_0());
            		
            // InternalIotDsl.g:4000:3: ( (lv_name_1_0= ruleEString ) )
            // InternalIotDsl.g:4001:4: (lv_name_1_0= ruleEString )
            {
            // InternalIotDsl.g:4001:4: (lv_name_1_0= ruleEString )
            // InternalIotDsl.g:4002:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDigitalOutputPinAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_52);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDigitalOutputPinRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"es.udima.tfm.cesarlaso.IotDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,75,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getDigitalOutputPinAccess().getConnected_to_pinKeyword_2());
            		
            // InternalIotDsl.g:4023:3: ( (lv_number_3_0= ruleEInt ) )
            // InternalIotDsl.g:4024:4: (lv_number_3_0= ruleEInt )
            {
            // InternalIotDsl.g:4024:4: (lv_number_3_0= ruleEInt )
            // InternalIotDsl.g:4025:5: lv_number_3_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getDigitalOutputPinAccess().getNumberEIntParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_number_3_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDigitalOutputPinRule());
            					}
            					set(
            						current,
            						"number",
            						lv_number_3_0,
            						"es.udima.tfm.cesarlaso.IotDsl.EInt");
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
    // $ANTLR end "ruleDigitalOutputPin"


    // $ANTLR start "entryRuleAnalogInputPin"
    // InternalIotDsl.g:4046:1: entryRuleAnalogInputPin returns [EObject current=null] : iv_ruleAnalogInputPin= ruleAnalogInputPin EOF ;
    public final EObject entryRuleAnalogInputPin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnalogInputPin = null;


        try {
            // InternalIotDsl.g:4046:55: (iv_ruleAnalogInputPin= ruleAnalogInputPin EOF )
            // InternalIotDsl.g:4047:2: iv_ruleAnalogInputPin= ruleAnalogInputPin EOF
            {
             newCompositeNode(grammarAccess.getAnalogInputPinRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnalogInputPin=ruleAnalogInputPin();

            state._fsp--;

             current =iv_ruleAnalogInputPin; 
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
    // $ANTLR end "entryRuleAnalogInputPin"


    // $ANTLR start "ruleAnalogInputPin"
    // InternalIotDsl.g:4053:1: ruleAnalogInputPin returns [EObject current=null] : (otherlv_0= 'gpio_input_analog' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'connected_to_pin' ( (lv_number_3_0= ruleEInt ) ) ) ;
    public final EObject ruleAnalogInputPin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_number_3_0 = null;



        	enterRule();

        try {
            // InternalIotDsl.g:4059:2: ( (otherlv_0= 'gpio_input_analog' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'connected_to_pin' ( (lv_number_3_0= ruleEInt ) ) ) )
            // InternalIotDsl.g:4060:2: (otherlv_0= 'gpio_input_analog' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'connected_to_pin' ( (lv_number_3_0= ruleEInt ) ) )
            {
            // InternalIotDsl.g:4060:2: (otherlv_0= 'gpio_input_analog' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'connected_to_pin' ( (lv_number_3_0= ruleEInt ) ) )
            // InternalIotDsl.g:4061:3: otherlv_0= 'gpio_input_analog' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'connected_to_pin' ( (lv_number_3_0= ruleEInt ) )
            {
            otherlv_0=(Token)match(input,77,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAnalogInputPinAccess().getGpio_input_analogKeyword_0());
            		
            // InternalIotDsl.g:4065:3: ( (lv_name_1_0= ruleEString ) )
            // InternalIotDsl.g:4066:4: (lv_name_1_0= ruleEString )
            {
            // InternalIotDsl.g:4066:4: (lv_name_1_0= ruleEString )
            // InternalIotDsl.g:4067:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAnalogInputPinAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_52);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAnalogInputPinRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"es.udima.tfm.cesarlaso.IotDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,75,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getAnalogInputPinAccess().getConnected_to_pinKeyword_2());
            		
            // InternalIotDsl.g:4088:3: ( (lv_number_3_0= ruleEInt ) )
            // InternalIotDsl.g:4089:4: (lv_number_3_0= ruleEInt )
            {
            // InternalIotDsl.g:4089:4: (lv_number_3_0= ruleEInt )
            // InternalIotDsl.g:4090:5: lv_number_3_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getAnalogInputPinAccess().getNumberEIntParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_number_3_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAnalogInputPinRule());
            					}
            					set(
            						current,
            						"number",
            						lv_number_3_0,
            						"es.udima.tfm.cesarlaso.IotDsl.EInt");
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
    // $ANTLR end "ruleAnalogInputPin"


    // $ANTLR start "entryRuleAnalogOutputPin"
    // InternalIotDsl.g:4111:1: entryRuleAnalogOutputPin returns [EObject current=null] : iv_ruleAnalogOutputPin= ruleAnalogOutputPin EOF ;
    public final EObject entryRuleAnalogOutputPin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnalogOutputPin = null;


        try {
            // InternalIotDsl.g:4111:56: (iv_ruleAnalogOutputPin= ruleAnalogOutputPin EOF )
            // InternalIotDsl.g:4112:2: iv_ruleAnalogOutputPin= ruleAnalogOutputPin EOF
            {
             newCompositeNode(grammarAccess.getAnalogOutputPinRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnalogOutputPin=ruleAnalogOutputPin();

            state._fsp--;

             current =iv_ruleAnalogOutputPin; 
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
    // $ANTLR end "entryRuleAnalogOutputPin"


    // $ANTLR start "ruleAnalogOutputPin"
    // InternalIotDsl.g:4118:1: ruleAnalogOutputPin returns [EObject current=null] : (otherlv_0= 'gpio_output_analog' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'connected_to_pin' ( (lv_number_3_0= ruleEInt ) ) ) ;
    public final EObject ruleAnalogOutputPin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_number_3_0 = null;



        	enterRule();

        try {
            // InternalIotDsl.g:4124:2: ( (otherlv_0= 'gpio_output_analog' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'connected_to_pin' ( (lv_number_3_0= ruleEInt ) ) ) )
            // InternalIotDsl.g:4125:2: (otherlv_0= 'gpio_output_analog' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'connected_to_pin' ( (lv_number_3_0= ruleEInt ) ) )
            {
            // InternalIotDsl.g:4125:2: (otherlv_0= 'gpio_output_analog' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'connected_to_pin' ( (lv_number_3_0= ruleEInt ) ) )
            // InternalIotDsl.g:4126:3: otherlv_0= 'gpio_output_analog' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'connected_to_pin' ( (lv_number_3_0= ruleEInt ) )
            {
            otherlv_0=(Token)match(input,78,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAnalogOutputPinAccess().getGpio_output_analogKeyword_0());
            		
            // InternalIotDsl.g:4130:3: ( (lv_name_1_0= ruleEString ) )
            // InternalIotDsl.g:4131:4: (lv_name_1_0= ruleEString )
            {
            // InternalIotDsl.g:4131:4: (lv_name_1_0= ruleEString )
            // InternalIotDsl.g:4132:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAnalogOutputPinAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_52);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAnalogOutputPinRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"es.udima.tfm.cesarlaso.IotDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,75,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getAnalogOutputPinAccess().getConnected_to_pinKeyword_2());
            		
            // InternalIotDsl.g:4153:3: ( (lv_number_3_0= ruleEInt ) )
            // InternalIotDsl.g:4154:4: (lv_number_3_0= ruleEInt )
            {
            // InternalIotDsl.g:4154:4: (lv_number_3_0= ruleEInt )
            // InternalIotDsl.g:4155:5: lv_number_3_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getAnalogOutputPinAccess().getNumberEIntParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_number_3_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAnalogOutputPinRule());
            					}
            					set(
            						current,
            						"number",
            						lv_number_3_0,
            						"es.udima.tfm.cesarlaso.IotDsl.EInt");
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
    // $ANTLR end "ruleAnalogOutputPin"


    // $ANTLR start "entryRuleRemoteEventIdentifier"
    // InternalIotDsl.g:4176:1: entryRuleRemoteEventIdentifier returns [EObject current=null] : iv_ruleRemoteEventIdentifier= ruleRemoteEventIdentifier EOF ;
    public final EObject entryRuleRemoteEventIdentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRemoteEventIdentifier = null;


        try {
            // InternalIotDsl.g:4176:62: (iv_ruleRemoteEventIdentifier= ruleRemoteEventIdentifier EOF )
            // InternalIotDsl.g:4177:2: iv_ruleRemoteEventIdentifier= ruleRemoteEventIdentifier EOF
            {
             newCompositeNode(grammarAccess.getRemoteEventIdentifierRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRemoteEventIdentifier=ruleRemoteEventIdentifier();

            state._fsp--;

             current =iv_ruleRemoteEventIdentifier; 
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
    // $ANTLR end "entryRuleRemoteEventIdentifier"


    // $ANTLR start "ruleRemoteEventIdentifier"
    // InternalIotDsl.g:4183:1: ruleRemoteEventIdentifier returns [EObject current=null] : (otherlv_0= 'remote_event_identifier' ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleRemoteEventIdentifier() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalIotDsl.g:4189:2: ( (otherlv_0= 'remote_event_identifier' ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalIotDsl.g:4190:2: (otherlv_0= 'remote_event_identifier' ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalIotDsl.g:4190:2: (otherlv_0= 'remote_event_identifier' ( (lv_name_1_0= ruleEString ) ) )
            // InternalIotDsl.g:4191:3: otherlv_0= 'remote_event_identifier' ( (lv_name_1_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,79,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRemoteEventIdentifierAccess().getRemote_event_identifierKeyword_0());
            		
            // InternalIotDsl.g:4195:3: ( (lv_name_1_0= ruleEString ) )
            // InternalIotDsl.g:4196:4: (lv_name_1_0= ruleEString )
            {
            // InternalIotDsl.g:4196:4: (lv_name_1_0= ruleEString )
            // InternalIotDsl.g:4197:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRemoteEventIdentifierAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRemoteEventIdentifierRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"es.udima.tfm.cesarlaso.IotDsl.EString");
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
    // $ANTLR end "ruleRemoteEventIdentifier"


    // $ANTLR start "entryRuleRemoteActuatorIdentifier"
    // InternalIotDsl.g:4218:1: entryRuleRemoteActuatorIdentifier returns [EObject current=null] : iv_ruleRemoteActuatorIdentifier= ruleRemoteActuatorIdentifier EOF ;
    public final EObject entryRuleRemoteActuatorIdentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRemoteActuatorIdentifier = null;


        try {
            // InternalIotDsl.g:4218:65: (iv_ruleRemoteActuatorIdentifier= ruleRemoteActuatorIdentifier EOF )
            // InternalIotDsl.g:4219:2: iv_ruleRemoteActuatorIdentifier= ruleRemoteActuatorIdentifier EOF
            {
             newCompositeNode(grammarAccess.getRemoteActuatorIdentifierRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRemoteActuatorIdentifier=ruleRemoteActuatorIdentifier();

            state._fsp--;

             current =iv_ruleRemoteActuatorIdentifier; 
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
    // $ANTLR end "entryRuleRemoteActuatorIdentifier"


    // $ANTLR start "ruleRemoteActuatorIdentifier"
    // InternalIotDsl.g:4225:1: ruleRemoteActuatorIdentifier returns [EObject current=null] : (otherlv_0= 'remote_actuator_identifier' ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleRemoteActuatorIdentifier() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalIotDsl.g:4231:2: ( (otherlv_0= 'remote_actuator_identifier' ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalIotDsl.g:4232:2: (otherlv_0= 'remote_actuator_identifier' ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalIotDsl.g:4232:2: (otherlv_0= 'remote_actuator_identifier' ( (lv_name_1_0= ruleEString ) ) )
            // InternalIotDsl.g:4233:3: otherlv_0= 'remote_actuator_identifier' ( (lv_name_1_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,80,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRemoteActuatorIdentifierAccess().getRemote_actuator_identifierKeyword_0());
            		
            // InternalIotDsl.g:4237:3: ( (lv_name_1_0= ruleEString ) )
            // InternalIotDsl.g:4238:4: (lv_name_1_0= ruleEString )
            {
            // InternalIotDsl.g:4238:4: (lv_name_1_0= ruleEString )
            // InternalIotDsl.g:4239:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRemoteActuatorIdentifierAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRemoteActuatorIdentifierRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"es.udima.tfm.cesarlaso.IotDsl.EString");
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
    // $ANTLR end "ruleRemoteActuatorIdentifier"


    // $ANTLR start "entryRuleSequentialActuators"
    // InternalIotDsl.g:4260:1: entryRuleSequentialActuators returns [EObject current=null] : iv_ruleSequentialActuators= ruleSequentialActuators EOF ;
    public final EObject entryRuleSequentialActuators() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequentialActuators = null;


        try {
            // InternalIotDsl.g:4260:60: (iv_ruleSequentialActuators= ruleSequentialActuators EOF )
            // InternalIotDsl.g:4261:2: iv_ruleSequentialActuators= ruleSequentialActuators EOF
            {
             newCompositeNode(grammarAccess.getSequentialActuatorsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSequentialActuators=ruleSequentialActuators();

            state._fsp--;

             current =iv_ruleSequentialActuators; 
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
    // $ANTLR end "entryRuleSequentialActuators"


    // $ANTLR start "ruleSequentialActuators"
    // InternalIotDsl.g:4267:1: ruleSequentialActuators returns [EObject current=null] : (otherlv_0= 'sequential' otherlv_1= '{' ( (lv_actuators_2_0= ruleActuator ) ) (otherlv_3= ',' ( (lv_actuators_4_0= ruleActuator ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleSequentialActuators() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_actuators_2_0 = null;

        EObject lv_actuators_4_0 = null;



        	enterRule();

        try {
            // InternalIotDsl.g:4273:2: ( (otherlv_0= 'sequential' otherlv_1= '{' ( (lv_actuators_2_0= ruleActuator ) ) (otherlv_3= ',' ( (lv_actuators_4_0= ruleActuator ) ) )* otherlv_5= '}' ) )
            // InternalIotDsl.g:4274:2: (otherlv_0= 'sequential' otherlv_1= '{' ( (lv_actuators_2_0= ruleActuator ) ) (otherlv_3= ',' ( (lv_actuators_4_0= ruleActuator ) ) )* otherlv_5= '}' )
            {
            // InternalIotDsl.g:4274:2: (otherlv_0= 'sequential' otherlv_1= '{' ( (lv_actuators_2_0= ruleActuator ) ) (otherlv_3= ',' ( (lv_actuators_4_0= ruleActuator ) ) )* otherlv_5= '}' )
            // InternalIotDsl.g:4275:3: otherlv_0= 'sequential' otherlv_1= '{' ( (lv_actuators_2_0= ruleActuator ) ) (otherlv_3= ',' ( (lv_actuators_4_0= ruleActuator ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,81,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSequentialActuatorsAccess().getSequentialKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getSequentialActuatorsAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalIotDsl.g:4283:3: ( (lv_actuators_2_0= ruleActuator ) )
            // InternalIotDsl.g:4284:4: (lv_actuators_2_0= ruleActuator )
            {
            // InternalIotDsl.g:4284:4: (lv_actuators_2_0= ruleActuator )
            // InternalIotDsl.g:4285:5: lv_actuators_2_0= ruleActuator
            {

            					newCompositeNode(grammarAccess.getSequentialActuatorsAccess().getActuatorsActuatorParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_10);
            lv_actuators_2_0=ruleActuator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSequentialActuatorsRule());
            					}
            					add(
            						current,
            						"actuators",
            						lv_actuators_2_0,
            						"es.udima.tfm.cesarlaso.IotDsl.Actuator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalIotDsl.g:4302:3: (otherlv_3= ',' ( (lv_actuators_4_0= ruleActuator ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==16) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalIotDsl.g:4303:4: otherlv_3= ',' ( (lv_actuators_4_0= ruleActuator ) )
            	    {
            	    otherlv_3=(Token)match(input,16,FOLLOW_26); 

            	    				newLeafNode(otherlv_3, grammarAccess.getSequentialActuatorsAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalIotDsl.g:4307:4: ( (lv_actuators_4_0= ruleActuator ) )
            	    // InternalIotDsl.g:4308:5: (lv_actuators_4_0= ruleActuator )
            	    {
            	    // InternalIotDsl.g:4308:5: (lv_actuators_4_0= ruleActuator )
            	    // InternalIotDsl.g:4309:6: lv_actuators_4_0= ruleActuator
            	    {

            	    						newCompositeNode(grammarAccess.getSequentialActuatorsAccess().getActuatorsActuatorParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_actuators_4_0=ruleActuator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSequentialActuatorsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"actuators",
            	    							lv_actuators_4_0,
            	    							"es.udima.tfm.cesarlaso.IotDsl.Actuator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getSequentialActuatorsAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleSequentialActuators"


    // $ANTLR start "entryRuleChangeOutput"
    // InternalIotDsl.g:4335:1: entryRuleChangeOutput returns [EObject current=null] : iv_ruleChangeOutput= ruleChangeOutput EOF ;
    public final EObject entryRuleChangeOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChangeOutput = null;


        try {
            // InternalIotDsl.g:4335:53: (iv_ruleChangeOutput= ruleChangeOutput EOF )
            // InternalIotDsl.g:4336:2: iv_ruleChangeOutput= ruleChangeOutput EOF
            {
             newCompositeNode(grammarAccess.getChangeOutputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChangeOutput=ruleChangeOutput();

            state._fsp--;

             current =iv_ruleChangeOutput; 
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
    // $ANTLR end "entryRuleChangeOutput"


    // $ANTLR start "ruleChangeOutput"
    // InternalIotDsl.g:4342:1: ruleChangeOutput returns [EObject current=null] : (otherlv_0= 'change' ( ( ruleEString ) ) ( (lv_status_2_0= ruleDigitalPinStatus ) ) ) ;
    public final EObject ruleChangeOutput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_status_2_0 = null;



        	enterRule();

        try {
            // InternalIotDsl.g:4348:2: ( (otherlv_0= 'change' ( ( ruleEString ) ) ( (lv_status_2_0= ruleDigitalPinStatus ) ) ) )
            // InternalIotDsl.g:4349:2: (otherlv_0= 'change' ( ( ruleEString ) ) ( (lv_status_2_0= ruleDigitalPinStatus ) ) )
            {
            // InternalIotDsl.g:4349:2: (otherlv_0= 'change' ( ( ruleEString ) ) ( (lv_status_2_0= ruleDigitalPinStatus ) ) )
            // InternalIotDsl.g:4350:3: otherlv_0= 'change' ( ( ruleEString ) ) ( (lv_status_2_0= ruleDigitalPinStatus ) )
            {
            otherlv_0=(Token)match(input,82,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getChangeOutputAccess().getChangeKeyword_0());
            		
            // InternalIotDsl.g:4354:3: ( ( ruleEString ) )
            // InternalIotDsl.g:4355:4: ( ruleEString )
            {
            // InternalIotDsl.g:4355:4: ( ruleEString )
            // InternalIotDsl.g:4356:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChangeOutputRule());
            					}
            				

            					newCompositeNode(grammarAccess.getChangeOutputAccess().getPinDigitalOutputPinCrossReference_1_0());
            				
            pushFollow(FOLLOW_53);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalIotDsl.g:4370:3: ( (lv_status_2_0= ruleDigitalPinStatus ) )
            // InternalIotDsl.g:4371:4: (lv_status_2_0= ruleDigitalPinStatus )
            {
            // InternalIotDsl.g:4371:4: (lv_status_2_0= ruleDigitalPinStatus )
            // InternalIotDsl.g:4372:5: lv_status_2_0= ruleDigitalPinStatus
            {

            					newCompositeNode(grammarAccess.getChangeOutputAccess().getStatusDigitalPinStatusEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_status_2_0=ruleDigitalPinStatus();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getChangeOutputRule());
            					}
            					set(
            						current,
            						"status",
            						lv_status_2_0,
            						"es.udima.tfm.cesarlaso.IotDsl.DigitalPinStatus");
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
    // $ANTLR end "ruleChangeOutput"


    // $ANTLR start "entryRuleButtonOutput"
    // InternalIotDsl.g:4393:1: entryRuleButtonOutput returns [EObject current=null] : iv_ruleButtonOutput= ruleButtonOutput EOF ;
    public final EObject entryRuleButtonOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButtonOutput = null;


        try {
            // InternalIotDsl.g:4393:53: (iv_ruleButtonOutput= ruleButtonOutput EOF )
            // InternalIotDsl.g:4394:2: iv_ruleButtonOutput= ruleButtonOutput EOF
            {
             newCompositeNode(grammarAccess.getButtonOutputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleButtonOutput=ruleButtonOutput();

            state._fsp--;

             current =iv_ruleButtonOutput; 
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
    // $ANTLR end "entryRuleButtonOutput"


    // $ANTLR start "ruleButtonOutput"
    // InternalIotDsl.g:4400:1: ruleButtonOutput returns [EObject current=null] : (otherlv_0= 'button' ( ( ruleEString ) ) otherlv_2= 'duration' ( (lv_duration_3_0= ruleTimeUnitValue ) ) ) ;
    public final EObject ruleButtonOutput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_duration_3_0 = null;



        	enterRule();

        try {
            // InternalIotDsl.g:4406:2: ( (otherlv_0= 'button' ( ( ruleEString ) ) otherlv_2= 'duration' ( (lv_duration_3_0= ruleTimeUnitValue ) ) ) )
            // InternalIotDsl.g:4407:2: (otherlv_0= 'button' ( ( ruleEString ) ) otherlv_2= 'duration' ( (lv_duration_3_0= ruleTimeUnitValue ) ) )
            {
            // InternalIotDsl.g:4407:2: (otherlv_0= 'button' ( ( ruleEString ) ) otherlv_2= 'duration' ( (lv_duration_3_0= ruleTimeUnitValue ) ) )
            // InternalIotDsl.g:4408:3: otherlv_0= 'button' ( ( ruleEString ) ) otherlv_2= 'duration' ( (lv_duration_3_0= ruleTimeUnitValue ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getButtonOutputAccess().getButtonKeyword_0());
            		
            // InternalIotDsl.g:4412:3: ( ( ruleEString ) )
            // InternalIotDsl.g:4413:4: ( ruleEString )
            {
            // InternalIotDsl.g:4413:4: ( ruleEString )
            // InternalIotDsl.g:4414:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getButtonOutputRule());
            					}
            				

            					newCompositeNode(grammarAccess.getButtonOutputAccess().getPinDigitalOutputPinCrossReference_1_0());
            				
            pushFollow(FOLLOW_54);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,83,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getButtonOutputAccess().getDurationKeyword_2());
            		
            // InternalIotDsl.g:4432:3: ( (lv_duration_3_0= ruleTimeUnitValue ) )
            // InternalIotDsl.g:4433:4: (lv_duration_3_0= ruleTimeUnitValue )
            {
            // InternalIotDsl.g:4433:4: (lv_duration_3_0= ruleTimeUnitValue )
            // InternalIotDsl.g:4434:5: lv_duration_3_0= ruleTimeUnitValue
            {

            					newCompositeNode(grammarAccess.getButtonOutputAccess().getDurationTimeUnitValueParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_duration_3_0=ruleTimeUnitValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getButtonOutputRule());
            					}
            					set(
            						current,
            						"duration",
            						lv_duration_3_0,
            						"es.udima.tfm.cesarlaso.IotDsl.TimeUnitValue");
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
    // $ANTLR end "ruleButtonOutput"


    // $ANTLR start "entryRulePulseOutput"
    // InternalIotDsl.g:4455:1: entryRulePulseOutput returns [EObject current=null] : iv_rulePulseOutput= rulePulseOutput EOF ;
    public final EObject entryRulePulseOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePulseOutput = null;


        try {
            // InternalIotDsl.g:4455:52: (iv_rulePulseOutput= rulePulseOutput EOF )
            // InternalIotDsl.g:4456:2: iv_rulePulseOutput= rulePulseOutput EOF
            {
             newCompositeNode(grammarAccess.getPulseOutputRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePulseOutput=rulePulseOutput();

            state._fsp--;

             current =iv_rulePulseOutput; 
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
    // $ANTLR end "entryRulePulseOutput"


    // $ANTLR start "rulePulseOutput"
    // InternalIotDsl.g:4462:1: rulePulseOutput returns [EObject current=null] : (otherlv_0= 'pulse' ( ( ruleEString ) ) otherlv_2= '{' otherlv_3= 'times' ( (lv_count_4_0= ruleEInt ) ) otherlv_5= 'width' ( (lv_width_6_0= ruleEInt ) ) otherlv_7= 'ms' otherlv_8= 'space_width' ( (lv_spaceWidth_9_0= ruleEInt ) ) otherlv_10= 'ms' otherlv_11= '}' ) ;
    public final EObject rulePulseOutput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_count_4_0 = null;

        AntlrDatatypeRuleToken lv_width_6_0 = null;

        AntlrDatatypeRuleToken lv_spaceWidth_9_0 = null;



        	enterRule();

        try {
            // InternalIotDsl.g:4468:2: ( (otherlv_0= 'pulse' ( ( ruleEString ) ) otherlv_2= '{' otherlv_3= 'times' ( (lv_count_4_0= ruleEInt ) ) otherlv_5= 'width' ( (lv_width_6_0= ruleEInt ) ) otherlv_7= 'ms' otherlv_8= 'space_width' ( (lv_spaceWidth_9_0= ruleEInt ) ) otherlv_10= 'ms' otherlv_11= '}' ) )
            // InternalIotDsl.g:4469:2: (otherlv_0= 'pulse' ( ( ruleEString ) ) otherlv_2= '{' otherlv_3= 'times' ( (lv_count_4_0= ruleEInt ) ) otherlv_5= 'width' ( (lv_width_6_0= ruleEInt ) ) otherlv_7= 'ms' otherlv_8= 'space_width' ( (lv_spaceWidth_9_0= ruleEInt ) ) otherlv_10= 'ms' otherlv_11= '}' )
            {
            // InternalIotDsl.g:4469:2: (otherlv_0= 'pulse' ( ( ruleEString ) ) otherlv_2= '{' otherlv_3= 'times' ( (lv_count_4_0= ruleEInt ) ) otherlv_5= 'width' ( (lv_width_6_0= ruleEInt ) ) otherlv_7= 'ms' otherlv_8= 'space_width' ( (lv_spaceWidth_9_0= ruleEInt ) ) otherlv_10= 'ms' otherlv_11= '}' )
            // InternalIotDsl.g:4470:3: otherlv_0= 'pulse' ( ( ruleEString ) ) otherlv_2= '{' otherlv_3= 'times' ( (lv_count_4_0= ruleEInt ) ) otherlv_5= 'width' ( (lv_width_6_0= ruleEInt ) ) otherlv_7= 'ms' otherlv_8= 'space_width' ( (lv_spaceWidth_9_0= ruleEInt ) ) otherlv_10= 'ms' otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,84,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPulseOutputAccess().getPulseKeyword_0());
            		
            // InternalIotDsl.g:4474:3: ( ( ruleEString ) )
            // InternalIotDsl.g:4475:4: ( ruleEString )
            {
            // InternalIotDsl.g:4475:4: ( ruleEString )
            // InternalIotDsl.g:4476:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPulseOutputRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPulseOutputAccess().getPinDigitalOutputPinCrossReference_1_0());
            				
            pushFollow(FOLLOW_4);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_55); 

            			newLeafNode(otherlv_2, grammarAccess.getPulseOutputAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,85,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getPulseOutputAccess().getTimesKeyword_3());
            		
            // InternalIotDsl.g:4498:3: ( (lv_count_4_0= ruleEInt ) )
            // InternalIotDsl.g:4499:4: (lv_count_4_0= ruleEInt )
            {
            // InternalIotDsl.g:4499:4: (lv_count_4_0= ruleEInt )
            // InternalIotDsl.g:4500:5: lv_count_4_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getPulseOutputAccess().getCountEIntParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_33);
            lv_count_4_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPulseOutputRule());
            					}
            					set(
            						current,
            						"count",
            						lv_count_4_0,
            						"es.udima.tfm.cesarlaso.IotDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,44,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getPulseOutputAccess().getWidthKeyword_5());
            		
            // InternalIotDsl.g:4521:3: ( (lv_width_6_0= ruleEInt ) )
            // InternalIotDsl.g:4522:4: (lv_width_6_0= ruleEInt )
            {
            // InternalIotDsl.g:4522:4: (lv_width_6_0= ruleEInt )
            // InternalIotDsl.g:4523:5: lv_width_6_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getPulseOutputAccess().getWidthEIntParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_56);
            lv_width_6_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPulseOutputRule());
            					}
            					set(
            						current,
            						"width",
            						lv_width_6_0,
            						"es.udima.tfm.cesarlaso.IotDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,86,FOLLOW_34); 

            			newLeafNode(otherlv_7, grammarAccess.getPulseOutputAccess().getMsKeyword_7());
            		
            otherlv_8=(Token)match(input,45,FOLLOW_6); 

            			newLeafNode(otherlv_8, grammarAccess.getPulseOutputAccess().getSpace_widthKeyword_8());
            		
            // InternalIotDsl.g:4548:3: ( (lv_spaceWidth_9_0= ruleEInt ) )
            // InternalIotDsl.g:4549:4: (lv_spaceWidth_9_0= ruleEInt )
            {
            // InternalIotDsl.g:4549:4: (lv_spaceWidth_9_0= ruleEInt )
            // InternalIotDsl.g:4550:5: lv_spaceWidth_9_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getPulseOutputAccess().getSpaceWidthEIntParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_56);
            lv_spaceWidth_9_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPulseOutputRule());
            					}
            					set(
            						current,
            						"spaceWidth",
            						lv_spaceWidth_9_0,
            						"es.udima.tfm.cesarlaso.IotDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,86,FOLLOW_14); 

            			newLeafNode(otherlv_10, grammarAccess.getPulseOutputAccess().getMsKeyword_10());
            		
            otherlv_11=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getPulseOutputAccess().getRightCurlyBracketKeyword_11());
            		

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
    // $ANTLR end "rulePulseOutput"


    // $ANTLR start "entryRuleBlinkOutput"
    // InternalIotDsl.g:4579:1: entryRuleBlinkOutput returns [EObject current=null] : iv_ruleBlinkOutput= ruleBlinkOutput EOF ;
    public final EObject entryRuleBlinkOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlinkOutput = null;


        try {
            // InternalIotDsl.g:4579:52: (iv_ruleBlinkOutput= ruleBlinkOutput EOF )
            // InternalIotDsl.g:4580:2: iv_ruleBlinkOutput= ruleBlinkOutput EOF
            {
             newCompositeNode(grammarAccess.getBlinkOutputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBlinkOutput=ruleBlinkOutput();

            state._fsp--;

             current =iv_ruleBlinkOutput; 
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
    // $ANTLR end "entryRuleBlinkOutput"


    // $ANTLR start "ruleBlinkOutput"
    // InternalIotDsl.g:4586:1: ruleBlinkOutput returns [EObject current=null] : (otherlv_0= 'blink' ( ( ruleEString ) ) otherlv_2= 'interval' ( (lv_interval_3_0= ruleTimeUnitValue ) ) ) ;
    public final EObject ruleBlinkOutput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_interval_3_0 = null;



        	enterRule();

        try {
            // InternalIotDsl.g:4592:2: ( (otherlv_0= 'blink' ( ( ruleEString ) ) otherlv_2= 'interval' ( (lv_interval_3_0= ruleTimeUnitValue ) ) ) )
            // InternalIotDsl.g:4593:2: (otherlv_0= 'blink' ( ( ruleEString ) ) otherlv_2= 'interval' ( (lv_interval_3_0= ruleTimeUnitValue ) ) )
            {
            // InternalIotDsl.g:4593:2: (otherlv_0= 'blink' ( ( ruleEString ) ) otherlv_2= 'interval' ( (lv_interval_3_0= ruleTimeUnitValue ) ) )
            // InternalIotDsl.g:4594:3: otherlv_0= 'blink' ( ( ruleEString ) ) otherlv_2= 'interval' ( (lv_interval_3_0= ruleTimeUnitValue ) )
            {
            otherlv_0=(Token)match(input,87,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getBlinkOutputAccess().getBlinkKeyword_0());
            		
            // InternalIotDsl.g:4598:3: ( ( ruleEString ) )
            // InternalIotDsl.g:4599:4: ( ruleEString )
            {
            // InternalIotDsl.g:4599:4: ( ruleEString )
            // InternalIotDsl.g:4600:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBlinkOutputRule());
            					}
            				

            					newCompositeNode(grammarAccess.getBlinkOutputAccess().getPinDigitalOutputPinCrossReference_1_0());
            				
            pushFollow(FOLLOW_57);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,88,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getBlinkOutputAccess().getIntervalKeyword_2());
            		
            // InternalIotDsl.g:4618:3: ( (lv_interval_3_0= ruleTimeUnitValue ) )
            // InternalIotDsl.g:4619:4: (lv_interval_3_0= ruleTimeUnitValue )
            {
            // InternalIotDsl.g:4619:4: (lv_interval_3_0= ruleTimeUnitValue )
            // InternalIotDsl.g:4620:5: lv_interval_3_0= ruleTimeUnitValue
            {

            					newCompositeNode(grammarAccess.getBlinkOutputAccess().getIntervalTimeUnitValueParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_interval_3_0=ruleTimeUnitValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBlinkOutputRule());
            					}
            					set(
            						current,
            						"interval",
            						lv_interval_3_0,
            						"es.udima.tfm.cesarlaso.IotDsl.TimeUnitValue");
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
    // $ANTLR end "ruleBlinkOutput"


    // $ANTLR start "entryRuleBlinkTimerOutput"
    // InternalIotDsl.g:4641:1: entryRuleBlinkTimerOutput returns [EObject current=null] : iv_ruleBlinkTimerOutput= ruleBlinkTimerOutput EOF ;
    public final EObject entryRuleBlinkTimerOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlinkTimerOutput = null;


        try {
            // InternalIotDsl.g:4641:57: (iv_ruleBlinkTimerOutput= ruleBlinkTimerOutput EOF )
            // InternalIotDsl.g:4642:2: iv_ruleBlinkTimerOutput= ruleBlinkTimerOutput EOF
            {
             newCompositeNode(grammarAccess.getBlinkTimerOutputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBlinkTimerOutput=ruleBlinkTimerOutput();

            state._fsp--;

             current =iv_ruleBlinkTimerOutput; 
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
    // $ANTLR end "entryRuleBlinkTimerOutput"


    // $ANTLR start "ruleBlinkTimerOutput"
    // InternalIotDsl.g:4648:1: ruleBlinkTimerOutput returns [EObject current=null] : (otherlv_0= 'blink_timer' ( ( ruleEString ) ) otherlv_2= '{' otherlv_3= 'during' ( (lv_duration_4_0= ruleTimeUnitValue ) ) otherlv_5= 'interval' ( (lv_interval_6_0= ruleTimeUnitValue ) ) otherlv_7= '}' ) ;
    public final EObject ruleBlinkTimerOutput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_duration_4_0 = null;

        EObject lv_interval_6_0 = null;



        	enterRule();

        try {
            // InternalIotDsl.g:4654:2: ( (otherlv_0= 'blink_timer' ( ( ruleEString ) ) otherlv_2= '{' otherlv_3= 'during' ( (lv_duration_4_0= ruleTimeUnitValue ) ) otherlv_5= 'interval' ( (lv_interval_6_0= ruleTimeUnitValue ) ) otherlv_7= '}' ) )
            // InternalIotDsl.g:4655:2: (otherlv_0= 'blink_timer' ( ( ruleEString ) ) otherlv_2= '{' otherlv_3= 'during' ( (lv_duration_4_0= ruleTimeUnitValue ) ) otherlv_5= 'interval' ( (lv_interval_6_0= ruleTimeUnitValue ) ) otherlv_7= '}' )
            {
            // InternalIotDsl.g:4655:2: (otherlv_0= 'blink_timer' ( ( ruleEString ) ) otherlv_2= '{' otherlv_3= 'during' ( (lv_duration_4_0= ruleTimeUnitValue ) ) otherlv_5= 'interval' ( (lv_interval_6_0= ruleTimeUnitValue ) ) otherlv_7= '}' )
            // InternalIotDsl.g:4656:3: otherlv_0= 'blink_timer' ( ( ruleEString ) ) otherlv_2= '{' otherlv_3= 'during' ( (lv_duration_4_0= ruleTimeUnitValue ) ) otherlv_5= 'interval' ( (lv_interval_6_0= ruleTimeUnitValue ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,89,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getBlinkTimerOutputAccess().getBlink_timerKeyword_0());
            		
            // InternalIotDsl.g:4660:3: ( ( ruleEString ) )
            // InternalIotDsl.g:4661:4: ( ruleEString )
            {
            // InternalIotDsl.g:4661:4: ( ruleEString )
            // InternalIotDsl.g:4662:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBlinkTimerOutputRule());
            					}
            				

            					newCompositeNode(grammarAccess.getBlinkTimerOutputAccess().getPinDigitalOutputPinCrossReference_1_0());
            				
            pushFollow(FOLLOW_4);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_58); 

            			newLeafNode(otherlv_2, grammarAccess.getBlinkTimerOutputAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,90,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getBlinkTimerOutputAccess().getDuringKeyword_3());
            		
            // InternalIotDsl.g:4684:3: ( (lv_duration_4_0= ruleTimeUnitValue ) )
            // InternalIotDsl.g:4685:4: (lv_duration_4_0= ruleTimeUnitValue )
            {
            // InternalIotDsl.g:4685:4: (lv_duration_4_0= ruleTimeUnitValue )
            // InternalIotDsl.g:4686:5: lv_duration_4_0= ruleTimeUnitValue
            {

            					newCompositeNode(grammarAccess.getBlinkTimerOutputAccess().getDurationTimeUnitValueParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_57);
            lv_duration_4_0=ruleTimeUnitValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBlinkTimerOutputRule());
            					}
            					set(
            						current,
            						"duration",
            						lv_duration_4_0,
            						"es.udima.tfm.cesarlaso.IotDsl.TimeUnitValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,88,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getBlinkTimerOutputAccess().getIntervalKeyword_5());
            		
            // InternalIotDsl.g:4707:3: ( (lv_interval_6_0= ruleTimeUnitValue ) )
            // InternalIotDsl.g:4708:4: (lv_interval_6_0= ruleTimeUnitValue )
            {
            // InternalIotDsl.g:4708:4: (lv_interval_6_0= ruleTimeUnitValue )
            // InternalIotDsl.g:4709:5: lv_interval_6_0= ruleTimeUnitValue
            {

            					newCompositeNode(grammarAccess.getBlinkTimerOutputAccess().getIntervalTimeUnitValueParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_14);
            lv_interval_6_0=ruleTimeUnitValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBlinkTimerOutputRule());
            					}
            					set(
            						current,
            						"interval",
            						lv_interval_6_0,
            						"es.udima.tfm.cesarlaso.IotDsl.TimeUnitValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getBlinkTimerOutputAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleBlinkTimerOutput"


    // $ANTLR start "entryRulePwm"
    // InternalIotDsl.g:4734:1: entryRulePwm returns [EObject current=null] : iv_rulePwm= rulePwm EOF ;
    public final EObject entryRulePwm() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePwm = null;


        try {
            // InternalIotDsl.g:4734:44: (iv_rulePwm= rulePwm EOF )
            // InternalIotDsl.g:4735:2: iv_rulePwm= rulePwm EOF
            {
             newCompositeNode(grammarAccess.getPwmRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePwm=rulePwm();

            state._fsp--;

             current =iv_rulePwm; 
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
    // $ANTLR end "entryRulePwm"


    // $ANTLR start "rulePwm"
    // InternalIotDsl.g:4741:1: rulePwm returns [EObject current=null] : (otherlv_0= 'pwm' ( ( ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleEInt ) ) otherlv_5= '}' ) ;
    public final EObject rulePwm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalIotDsl.g:4747:2: ( (otherlv_0= 'pwm' ( ( ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleEInt ) ) otherlv_5= '}' ) )
            // InternalIotDsl.g:4748:2: (otherlv_0= 'pwm' ( ( ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleEInt ) ) otherlv_5= '}' )
            {
            // InternalIotDsl.g:4748:2: (otherlv_0= 'pwm' ( ( ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleEInt ) ) otherlv_5= '}' )
            // InternalIotDsl.g:4749:3: otherlv_0= 'pwm' ( ( ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleEInt ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,91,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPwmAccess().getPwmKeyword_0());
            		
            // InternalIotDsl.g:4753:3: ( ( ruleEString ) )
            // InternalIotDsl.g:4754:4: ( ruleEString )
            {
            // InternalIotDsl.g:4754:4: ( ruleEString )
            // InternalIotDsl.g:4755:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPwmRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPwmAccess().getPinAnalogOutputPinCrossReference_1_0());
            				
            pushFollow(FOLLOW_4);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_59); 

            			newLeafNode(otherlv_2, grammarAccess.getPwmAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,92,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getPwmAccess().getValueKeyword_3());
            		
            // InternalIotDsl.g:4777:3: ( (lv_value_4_0= ruleEInt ) )
            // InternalIotDsl.g:4778:4: (lv_value_4_0= ruleEInt )
            {
            // InternalIotDsl.g:4778:4: (lv_value_4_0= ruleEInt )
            // InternalIotDsl.g:4779:5: lv_value_4_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getPwmAccess().getValueEIntParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_14);
            lv_value_4_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPwmRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_4_0,
            						"es.udima.tfm.cesarlaso.IotDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPwmAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "rulePwm"


    // $ANTLR start "entryRuleTransformTo"
    // InternalIotDsl.g:4804:1: entryRuleTransformTo returns [EObject current=null] : iv_ruleTransformTo= ruleTransformTo EOF ;
    public final EObject entryRuleTransformTo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransformTo = null;


        try {
            // InternalIotDsl.g:4804:52: (iv_ruleTransformTo= ruleTransformTo EOF )
            // InternalIotDsl.g:4805:2: iv_ruleTransformTo= ruleTransformTo EOF
            {
             newCompositeNode(grammarAccess.getTransformToRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransformTo=ruleTransformTo();

            state._fsp--;

             current =iv_ruleTransformTo; 
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
    // $ANTLR end "entryRuleTransformTo"


    // $ANTLR start "ruleTransformTo"
    // InternalIotDsl.g:4811:1: ruleTransformTo returns [EObject current=null] : (otherlv_0= 'pwm_transform' ( ( ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleEInt ) ) otherlv_5= 'duration' ( (lv_duration_6_0= ruleTimeUnitValue ) ) otherlv_7= '}' ) ;
    public final EObject ruleTransformTo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_value_4_0 = null;

        EObject lv_duration_6_0 = null;



        	enterRule();

        try {
            // InternalIotDsl.g:4817:2: ( (otherlv_0= 'pwm_transform' ( ( ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleEInt ) ) otherlv_5= 'duration' ( (lv_duration_6_0= ruleTimeUnitValue ) ) otherlv_7= '}' ) )
            // InternalIotDsl.g:4818:2: (otherlv_0= 'pwm_transform' ( ( ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleEInt ) ) otherlv_5= 'duration' ( (lv_duration_6_0= ruleTimeUnitValue ) ) otherlv_7= '}' )
            {
            // InternalIotDsl.g:4818:2: (otherlv_0= 'pwm_transform' ( ( ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleEInt ) ) otherlv_5= 'duration' ( (lv_duration_6_0= ruleTimeUnitValue ) ) otherlv_7= '}' )
            // InternalIotDsl.g:4819:3: otherlv_0= 'pwm_transform' ( ( ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleEInt ) ) otherlv_5= 'duration' ( (lv_duration_6_0= ruleTimeUnitValue ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,93,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTransformToAccess().getPwm_transformKeyword_0());
            		
            // InternalIotDsl.g:4823:3: ( ( ruleEString ) )
            // InternalIotDsl.g:4824:4: ( ruleEString )
            {
            // InternalIotDsl.g:4824:4: ( ruleEString )
            // InternalIotDsl.g:4825:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransformToRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTransformToAccess().getPinAnalogOutputPinCrossReference_1_0());
            				
            pushFollow(FOLLOW_4);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_59); 

            			newLeafNode(otherlv_2, grammarAccess.getTransformToAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,92,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getTransformToAccess().getValueKeyword_3());
            		
            // InternalIotDsl.g:4847:3: ( (lv_value_4_0= ruleEInt ) )
            // InternalIotDsl.g:4848:4: (lv_value_4_0= ruleEInt )
            {
            // InternalIotDsl.g:4848:4: (lv_value_4_0= ruleEInt )
            // InternalIotDsl.g:4849:5: lv_value_4_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getTransformToAccess().getValueEIntParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_54);
            lv_value_4_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransformToRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_4_0,
            						"es.udima.tfm.cesarlaso.IotDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,83,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getTransformToAccess().getDurationKeyword_5());
            		
            // InternalIotDsl.g:4870:3: ( (lv_duration_6_0= ruleTimeUnitValue ) )
            // InternalIotDsl.g:4871:4: (lv_duration_6_0= ruleTimeUnitValue )
            {
            // InternalIotDsl.g:4871:4: (lv_duration_6_0= ruleTimeUnitValue )
            // InternalIotDsl.g:4872:5: lv_duration_6_0= ruleTimeUnitValue
            {

            					newCompositeNode(grammarAccess.getTransformToAccess().getDurationTimeUnitValueParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_14);
            lv_duration_6_0=ruleTimeUnitValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransformToRule());
            					}
            					set(
            						current,
            						"duration",
            						lv_duration_6_0,
            						"es.udima.tfm.cesarlaso.IotDsl.TimeUnitValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getTransformToAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleTransformTo"


    // $ANTLR start "entryRuleWifiConfiguration"
    // InternalIotDsl.g:4897:1: entryRuleWifiConfiguration returns [EObject current=null] : iv_ruleWifiConfiguration= ruleWifiConfiguration EOF ;
    public final EObject entryRuleWifiConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWifiConfiguration = null;


        try {
            // InternalIotDsl.g:4897:58: (iv_ruleWifiConfiguration= ruleWifiConfiguration EOF )
            // InternalIotDsl.g:4898:2: iv_ruleWifiConfiguration= ruleWifiConfiguration EOF
            {
             newCompositeNode(grammarAccess.getWifiConfigurationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWifiConfiguration=ruleWifiConfiguration();

            state._fsp--;

             current =iv_ruleWifiConfiguration; 
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
    // $ANTLR end "entryRuleWifiConfiguration"


    // $ANTLR start "ruleWifiConfiguration"
    // InternalIotDsl.g:4904:1: ruleWifiConfiguration returns [EObject current=null] : (otherlv_0= 'ssid' ( (lv_ssid_1_0= ruleEString ) ) otherlv_2= 'with_password' ( (lv_password_3_0= ruleEString ) ) ) ;
    public final EObject ruleWifiConfiguration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_ssid_1_0 = null;

        AntlrDatatypeRuleToken lv_password_3_0 = null;



        	enterRule();

        try {
            // InternalIotDsl.g:4910:2: ( (otherlv_0= 'ssid' ( (lv_ssid_1_0= ruleEString ) ) otherlv_2= 'with_password' ( (lv_password_3_0= ruleEString ) ) ) )
            // InternalIotDsl.g:4911:2: (otherlv_0= 'ssid' ( (lv_ssid_1_0= ruleEString ) ) otherlv_2= 'with_password' ( (lv_password_3_0= ruleEString ) ) )
            {
            // InternalIotDsl.g:4911:2: (otherlv_0= 'ssid' ( (lv_ssid_1_0= ruleEString ) ) otherlv_2= 'with_password' ( (lv_password_3_0= ruleEString ) ) )
            // InternalIotDsl.g:4912:3: otherlv_0= 'ssid' ( (lv_ssid_1_0= ruleEString ) ) otherlv_2= 'with_password' ( (lv_password_3_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,94,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getWifiConfigurationAccess().getSsidKeyword_0());
            		
            // InternalIotDsl.g:4916:3: ( (lv_ssid_1_0= ruleEString ) )
            // InternalIotDsl.g:4917:4: (lv_ssid_1_0= ruleEString )
            {
            // InternalIotDsl.g:4917:4: (lv_ssid_1_0= ruleEString )
            // InternalIotDsl.g:4918:5: lv_ssid_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getWifiConfigurationAccess().getSsidEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_60);
            lv_ssid_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWifiConfigurationRule());
            					}
            					set(
            						current,
            						"ssid",
            						lv_ssid_1_0,
            						"es.udima.tfm.cesarlaso.IotDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,95,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getWifiConfigurationAccess().getWith_passwordKeyword_2());
            		
            // InternalIotDsl.g:4939:3: ( (lv_password_3_0= ruleEString ) )
            // InternalIotDsl.g:4940:4: (lv_password_3_0= ruleEString )
            {
            // InternalIotDsl.g:4940:4: (lv_password_3_0= ruleEString )
            // InternalIotDsl.g:4941:5: lv_password_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getWifiConfigurationAccess().getPasswordEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_password_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWifiConfigurationRule());
            					}
            					set(
            						current,
            						"password",
            						lv_password_3_0,
            						"es.udima.tfm.cesarlaso.IotDsl.EString");
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
    // $ANTLR end "ruleWifiConfiguration"


    // $ANTLR start "entryRuleSimulator"
    // InternalIotDsl.g:4962:1: entryRuleSimulator returns [EObject current=null] : iv_ruleSimulator= ruleSimulator EOF ;
    public final EObject entryRuleSimulator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimulator = null;


        try {
            // InternalIotDsl.g:4962:50: (iv_ruleSimulator= ruleSimulator EOF )
            // InternalIotDsl.g:4963:2: iv_ruleSimulator= ruleSimulator EOF
            {
             newCompositeNode(grammarAccess.getSimulatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimulator=ruleSimulator();

            state._fsp--;

             current =iv_ruleSimulator; 
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
    // $ANTLR end "entryRuleSimulator"


    // $ANTLR start "ruleSimulator"
    // InternalIotDsl.g:4969:1: ruleSimulator returns [EObject current=null] : ( () otherlv_1= 'simulator' ) ;
    public final EObject ruleSimulator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalIotDsl.g:4975:2: ( ( () otherlv_1= 'simulator' ) )
            // InternalIotDsl.g:4976:2: ( () otherlv_1= 'simulator' )
            {
            // InternalIotDsl.g:4976:2: ( () otherlv_1= 'simulator' )
            // InternalIotDsl.g:4977:3: () otherlv_1= 'simulator'
            {
            // InternalIotDsl.g:4977:3: ()
            // InternalIotDsl.g:4978:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSimulatorAccess().getSimulatorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,96,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getSimulatorAccess().getSimulatorKeyword_1());
            		

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
    // $ANTLR end "ruleSimulator"


    // $ANTLR start "entryRuleRaspberry"
    // InternalIotDsl.g:4992:1: entryRuleRaspberry returns [EObject current=null] : iv_ruleRaspberry= ruleRaspberry EOF ;
    public final EObject entryRuleRaspberry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRaspberry = null;


        try {
            // InternalIotDsl.g:4992:50: (iv_ruleRaspberry= ruleRaspberry EOF )
            // InternalIotDsl.g:4993:2: iv_ruleRaspberry= ruleRaspberry EOF
            {
             newCompositeNode(grammarAccess.getRaspberryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRaspberry=ruleRaspberry();

            state._fsp--;

             current =iv_ruleRaspberry; 
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
    // $ANTLR end "entryRuleRaspberry"


    // $ANTLR start "ruleRaspberry"
    // InternalIotDsl.g:4999:1: ruleRaspberry returns [EObject current=null] : ( () otherlv_1= 'raspberry' (otherlv_2= '{' ( (lv_wifiConfiguration_3_0= ruleWifiConfiguration ) ) otherlv_4= '}' )? ) ;
    public final EObject ruleRaspberry() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_wifiConfiguration_3_0 = null;



        	enterRule();

        try {
            // InternalIotDsl.g:5005:2: ( ( () otherlv_1= 'raspberry' (otherlv_2= '{' ( (lv_wifiConfiguration_3_0= ruleWifiConfiguration ) ) otherlv_4= '}' )? ) )
            // InternalIotDsl.g:5006:2: ( () otherlv_1= 'raspberry' (otherlv_2= '{' ( (lv_wifiConfiguration_3_0= ruleWifiConfiguration ) ) otherlv_4= '}' )? )
            {
            // InternalIotDsl.g:5006:2: ( () otherlv_1= 'raspberry' (otherlv_2= '{' ( (lv_wifiConfiguration_3_0= ruleWifiConfiguration ) ) otherlv_4= '}' )? )
            // InternalIotDsl.g:5007:3: () otherlv_1= 'raspberry' (otherlv_2= '{' ( (lv_wifiConfiguration_3_0= ruleWifiConfiguration ) ) otherlv_4= '}' )?
            {
            // InternalIotDsl.g:5007:3: ()
            // InternalIotDsl.g:5008:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRaspberryAccess().getRaspberryAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,97,FOLLOW_61); 

            			newLeafNode(otherlv_1, grammarAccess.getRaspberryAccess().getRaspberryKeyword_1());
            		
            // InternalIotDsl.g:5018:3: (otherlv_2= '{' ( (lv_wifiConfiguration_3_0= ruleWifiConfiguration ) ) otherlv_4= '}' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==12) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalIotDsl.g:5019:4: otherlv_2= '{' ( (lv_wifiConfiguration_3_0= ruleWifiConfiguration ) ) otherlv_4= '}'
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_62); 

                    				newLeafNode(otherlv_2, grammarAccess.getRaspberryAccess().getLeftCurlyBracketKeyword_2_0());
                    			
                    // InternalIotDsl.g:5023:4: ( (lv_wifiConfiguration_3_0= ruleWifiConfiguration ) )
                    // InternalIotDsl.g:5024:5: (lv_wifiConfiguration_3_0= ruleWifiConfiguration )
                    {
                    // InternalIotDsl.g:5024:5: (lv_wifiConfiguration_3_0= ruleWifiConfiguration )
                    // InternalIotDsl.g:5025:6: lv_wifiConfiguration_3_0= ruleWifiConfiguration
                    {

                    						newCompositeNode(grammarAccess.getRaspberryAccess().getWifiConfigurationWifiConfigurationParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_wifiConfiguration_3_0=ruleWifiConfiguration();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRaspberryRule());
                    						}
                    						set(
                    							current,
                    							"wifiConfiguration",
                    							lv_wifiConfiguration_3_0,
                    							"es.udima.tfm.cesarlaso.IotDsl.WifiConfiguration");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getRaspberryAccess().getRightCurlyBracketKeyword_2_2());
                    			

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
    // $ANTLR end "ruleRaspberry"


    // $ANTLR start "entryRuleBeaglebone"
    // InternalIotDsl.g:5051:1: entryRuleBeaglebone returns [EObject current=null] : iv_ruleBeaglebone= ruleBeaglebone EOF ;
    public final EObject entryRuleBeaglebone() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBeaglebone = null;


        try {
            // InternalIotDsl.g:5051:51: (iv_ruleBeaglebone= ruleBeaglebone EOF )
            // InternalIotDsl.g:5052:2: iv_ruleBeaglebone= ruleBeaglebone EOF
            {
             newCompositeNode(grammarAccess.getBeagleboneRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBeaglebone=ruleBeaglebone();

            state._fsp--;

             current =iv_ruleBeaglebone; 
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
    // $ANTLR end "entryRuleBeaglebone"


    // $ANTLR start "ruleBeaglebone"
    // InternalIotDsl.g:5058:1: ruleBeaglebone returns [EObject current=null] : ( () otherlv_1= 'beaglebone' (otherlv_2= '{' ( (lv_wifiConfiguration_3_0= ruleWifiConfiguration ) ) otherlv_4= '}' )? ) ;
    public final EObject ruleBeaglebone() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_wifiConfiguration_3_0 = null;



        	enterRule();

        try {
            // InternalIotDsl.g:5064:2: ( ( () otherlv_1= 'beaglebone' (otherlv_2= '{' ( (lv_wifiConfiguration_3_0= ruleWifiConfiguration ) ) otherlv_4= '}' )? ) )
            // InternalIotDsl.g:5065:2: ( () otherlv_1= 'beaglebone' (otherlv_2= '{' ( (lv_wifiConfiguration_3_0= ruleWifiConfiguration ) ) otherlv_4= '}' )? )
            {
            // InternalIotDsl.g:5065:2: ( () otherlv_1= 'beaglebone' (otherlv_2= '{' ( (lv_wifiConfiguration_3_0= ruleWifiConfiguration ) ) otherlv_4= '}' )? )
            // InternalIotDsl.g:5066:3: () otherlv_1= 'beaglebone' (otherlv_2= '{' ( (lv_wifiConfiguration_3_0= ruleWifiConfiguration ) ) otherlv_4= '}' )?
            {
            // InternalIotDsl.g:5066:3: ()
            // InternalIotDsl.g:5067:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBeagleboneAccess().getBeagleboneAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,98,FOLLOW_61); 

            			newLeafNode(otherlv_1, grammarAccess.getBeagleboneAccess().getBeagleboneKeyword_1());
            		
            // InternalIotDsl.g:5077:3: (otherlv_2= '{' ( (lv_wifiConfiguration_3_0= ruleWifiConfiguration ) ) otherlv_4= '}' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==12) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalIotDsl.g:5078:4: otherlv_2= '{' ( (lv_wifiConfiguration_3_0= ruleWifiConfiguration ) ) otherlv_4= '}'
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_62); 

                    				newLeafNode(otherlv_2, grammarAccess.getBeagleboneAccess().getLeftCurlyBracketKeyword_2_0());
                    			
                    // InternalIotDsl.g:5082:4: ( (lv_wifiConfiguration_3_0= ruleWifiConfiguration ) )
                    // InternalIotDsl.g:5083:5: (lv_wifiConfiguration_3_0= ruleWifiConfiguration )
                    {
                    // InternalIotDsl.g:5083:5: (lv_wifiConfiguration_3_0= ruleWifiConfiguration )
                    // InternalIotDsl.g:5084:6: lv_wifiConfiguration_3_0= ruleWifiConfiguration
                    {

                    						newCompositeNode(grammarAccess.getBeagleboneAccess().getWifiConfigurationWifiConfigurationParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_wifiConfiguration_3_0=ruleWifiConfiguration();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBeagleboneRule());
                    						}
                    						set(
                    							current,
                    							"wifiConfiguration",
                    							lv_wifiConfiguration_3_0,
                    							"es.udima.tfm.cesarlaso.IotDsl.WifiConfiguration");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getBeagleboneAccess().getRightCurlyBracketKeyword_2_2());
                    			

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
    // $ANTLR end "ruleBeaglebone"


    // $ANTLR start "entryRuleESP8266"
    // InternalIotDsl.g:5110:1: entryRuleESP8266 returns [EObject current=null] : iv_ruleESP8266= ruleESP8266 EOF ;
    public final EObject entryRuleESP8266() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleESP8266 = null;


        try {
            // InternalIotDsl.g:5110:48: (iv_ruleESP8266= ruleESP8266 EOF )
            // InternalIotDsl.g:5111:2: iv_ruleESP8266= ruleESP8266 EOF
            {
             newCompositeNode(grammarAccess.getESP8266Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleESP8266=ruleESP8266();

            state._fsp--;

             current =iv_ruleESP8266; 
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
    // $ANTLR end "entryRuleESP8266"


    // $ANTLR start "ruleESP8266"
    // InternalIotDsl.g:5117:1: ruleESP8266 returns [EObject current=null] : ( () otherlv_1= 'esp8266' (otherlv_2= '{' ( (lv_wifiConfiguration_3_0= ruleWifiConfiguration ) ) otherlv_4= '}' )? ) ;
    public final EObject ruleESP8266() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_wifiConfiguration_3_0 = null;



        	enterRule();

        try {
            // InternalIotDsl.g:5123:2: ( ( () otherlv_1= 'esp8266' (otherlv_2= '{' ( (lv_wifiConfiguration_3_0= ruleWifiConfiguration ) ) otherlv_4= '}' )? ) )
            // InternalIotDsl.g:5124:2: ( () otherlv_1= 'esp8266' (otherlv_2= '{' ( (lv_wifiConfiguration_3_0= ruleWifiConfiguration ) ) otherlv_4= '}' )? )
            {
            // InternalIotDsl.g:5124:2: ( () otherlv_1= 'esp8266' (otherlv_2= '{' ( (lv_wifiConfiguration_3_0= ruleWifiConfiguration ) ) otherlv_4= '}' )? )
            // InternalIotDsl.g:5125:3: () otherlv_1= 'esp8266' (otherlv_2= '{' ( (lv_wifiConfiguration_3_0= ruleWifiConfiguration ) ) otherlv_4= '}' )?
            {
            // InternalIotDsl.g:5125:3: ()
            // InternalIotDsl.g:5126:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getESP8266Access().getESP8266Action_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,99,FOLLOW_61); 

            			newLeafNode(otherlv_1, grammarAccess.getESP8266Access().getEsp8266Keyword_1());
            		
            // InternalIotDsl.g:5136:3: (otherlv_2= '{' ( (lv_wifiConfiguration_3_0= ruleWifiConfiguration ) ) otherlv_4= '}' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==12) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalIotDsl.g:5137:4: otherlv_2= '{' ( (lv_wifiConfiguration_3_0= ruleWifiConfiguration ) ) otherlv_4= '}'
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_62); 

                    				newLeafNode(otherlv_2, grammarAccess.getESP8266Access().getLeftCurlyBracketKeyword_2_0());
                    			
                    // InternalIotDsl.g:5141:4: ( (lv_wifiConfiguration_3_0= ruleWifiConfiguration ) )
                    // InternalIotDsl.g:5142:5: (lv_wifiConfiguration_3_0= ruleWifiConfiguration )
                    {
                    // InternalIotDsl.g:5142:5: (lv_wifiConfiguration_3_0= ruleWifiConfiguration )
                    // InternalIotDsl.g:5143:6: lv_wifiConfiguration_3_0= ruleWifiConfiguration
                    {

                    						newCompositeNode(grammarAccess.getESP8266Access().getWifiConfigurationWifiConfigurationParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_wifiConfiguration_3_0=ruleWifiConfiguration();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getESP8266Rule());
                    						}
                    						set(
                    							current,
                    							"wifiConfiguration",
                    							lv_wifiConfiguration_3_0,
                    							"es.udima.tfm.cesarlaso.IotDsl.WifiConfiguration");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getESP8266Access().getRightCurlyBracketKeyword_2_2());
                    			

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
    // $ANTLR end "ruleESP8266"


    // $ANTLR start "entryRuleJavaServer"
    // InternalIotDsl.g:5169:1: entryRuleJavaServer returns [EObject current=null] : iv_ruleJavaServer= ruleJavaServer EOF ;
    public final EObject entryRuleJavaServer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJavaServer = null;


        try {
            // InternalIotDsl.g:5169:51: (iv_ruleJavaServer= ruleJavaServer EOF )
            // InternalIotDsl.g:5170:2: iv_ruleJavaServer= ruleJavaServer EOF
            {
             newCompositeNode(grammarAccess.getJavaServerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJavaServer=ruleJavaServer();

            state._fsp--;

             current =iv_ruleJavaServer; 
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
    // $ANTLR end "entryRuleJavaServer"


    // $ANTLR start "ruleJavaServer"
    // InternalIotDsl.g:5176:1: ruleJavaServer returns [EObject current=null] : (otherlv_0= 'java_server' otherlv_1= '{' otherlv_2= 'network_interface_address' ( (lv_networkInterfaceAddress_3_0= ruleEString ) ) otherlv_4= 'network_interface_port' ( (lv_networkInterfacePort_5_0= ruleEInt ) ) otherlv_6= '}' ) ;
    public final EObject ruleJavaServer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_networkInterfaceAddress_3_0 = null;

        AntlrDatatypeRuleToken lv_networkInterfacePort_5_0 = null;



        	enterRule();

        try {
            // InternalIotDsl.g:5182:2: ( (otherlv_0= 'java_server' otherlv_1= '{' otherlv_2= 'network_interface_address' ( (lv_networkInterfaceAddress_3_0= ruleEString ) ) otherlv_4= 'network_interface_port' ( (lv_networkInterfacePort_5_0= ruleEInt ) ) otherlv_6= '}' ) )
            // InternalIotDsl.g:5183:2: (otherlv_0= 'java_server' otherlv_1= '{' otherlv_2= 'network_interface_address' ( (lv_networkInterfaceAddress_3_0= ruleEString ) ) otherlv_4= 'network_interface_port' ( (lv_networkInterfacePort_5_0= ruleEInt ) ) otherlv_6= '}' )
            {
            // InternalIotDsl.g:5183:2: (otherlv_0= 'java_server' otherlv_1= '{' otherlv_2= 'network_interface_address' ( (lv_networkInterfaceAddress_3_0= ruleEString ) ) otherlv_4= 'network_interface_port' ( (lv_networkInterfacePort_5_0= ruleEInt ) ) otherlv_6= '}' )
            // InternalIotDsl.g:5184:3: otherlv_0= 'java_server' otherlv_1= '{' otherlv_2= 'network_interface_address' ( (lv_networkInterfaceAddress_3_0= ruleEString ) ) otherlv_4= 'network_interface_port' ( (lv_networkInterfacePort_5_0= ruleEInt ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,100,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getJavaServerAccess().getJava_serverKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_63); 

            			newLeafNode(otherlv_1, grammarAccess.getJavaServerAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,101,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getJavaServerAccess().getNetwork_interface_addressKeyword_2());
            		
            // InternalIotDsl.g:5196:3: ( (lv_networkInterfaceAddress_3_0= ruleEString ) )
            // InternalIotDsl.g:5197:4: (lv_networkInterfaceAddress_3_0= ruleEString )
            {
            // InternalIotDsl.g:5197:4: (lv_networkInterfaceAddress_3_0= ruleEString )
            // InternalIotDsl.g:5198:5: lv_networkInterfaceAddress_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getJavaServerAccess().getNetworkInterfaceAddressEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_64);
            lv_networkInterfaceAddress_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJavaServerRule());
            					}
            					set(
            						current,
            						"networkInterfaceAddress",
            						lv_networkInterfaceAddress_3_0,
            						"es.udima.tfm.cesarlaso.IotDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,102,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getJavaServerAccess().getNetwork_interface_portKeyword_4());
            		
            // InternalIotDsl.g:5219:3: ( (lv_networkInterfacePort_5_0= ruleEInt ) )
            // InternalIotDsl.g:5220:4: (lv_networkInterfacePort_5_0= ruleEInt )
            {
            // InternalIotDsl.g:5220:4: (lv_networkInterfacePort_5_0= ruleEInt )
            // InternalIotDsl.g:5221:5: lv_networkInterfacePort_5_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getJavaServerAccess().getNetworkInterfacePortEIntParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_14);
            lv_networkInterfacePort_5_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJavaServerRule());
            					}
            					set(
            						current,
            						"networkInterfacePort",
            						lv_networkInterfacePort_5_0,
            						"es.udima.tfm.cesarlaso.IotDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getJavaServerAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleJavaServer"


    // $ANTLR start "ruleTimeUnitType"
    // InternalIotDsl.g:5246:1: ruleTimeUnitType returns [Enumerator current=null] : ( (enumLiteral_0= 'Millisecond' ) | (enumLiteral_1= 'Second' ) | (enumLiteral_2= 'Minute' ) | (enumLiteral_3= 'Hour' ) ) ;
    public final Enumerator ruleTimeUnitType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalIotDsl.g:5252:2: ( ( (enumLiteral_0= 'Millisecond' ) | (enumLiteral_1= 'Second' ) | (enumLiteral_2= 'Minute' ) | (enumLiteral_3= 'Hour' ) ) )
            // InternalIotDsl.g:5253:2: ( (enumLiteral_0= 'Millisecond' ) | (enumLiteral_1= 'Second' ) | (enumLiteral_2= 'Minute' ) | (enumLiteral_3= 'Hour' ) )
            {
            // InternalIotDsl.g:5253:2: ( (enumLiteral_0= 'Millisecond' ) | (enumLiteral_1= 'Second' ) | (enumLiteral_2= 'Minute' ) | (enumLiteral_3= 'Hour' ) )
            int alt39=4;
            switch ( input.LA(1) ) {
            case 103:
                {
                alt39=1;
                }
                break;
            case 104:
                {
                alt39=2;
                }
                break;
            case 105:
                {
                alt39=3;
                }
                break;
            case 106:
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
                    // InternalIotDsl.g:5254:3: (enumLiteral_0= 'Millisecond' )
                    {
                    // InternalIotDsl.g:5254:3: (enumLiteral_0= 'Millisecond' )
                    // InternalIotDsl.g:5255:4: enumLiteral_0= 'Millisecond'
                    {
                    enumLiteral_0=(Token)match(input,103,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitTypeAccess().getMillisecondEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTimeUnitTypeAccess().getMillisecondEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalIotDsl.g:5262:3: (enumLiteral_1= 'Second' )
                    {
                    // InternalIotDsl.g:5262:3: (enumLiteral_1= 'Second' )
                    // InternalIotDsl.g:5263:4: enumLiteral_1= 'Second'
                    {
                    enumLiteral_1=(Token)match(input,104,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitTypeAccess().getSecondEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTimeUnitTypeAccess().getSecondEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalIotDsl.g:5270:3: (enumLiteral_2= 'Minute' )
                    {
                    // InternalIotDsl.g:5270:3: (enumLiteral_2= 'Minute' )
                    // InternalIotDsl.g:5271:4: enumLiteral_2= 'Minute'
                    {
                    enumLiteral_2=(Token)match(input,105,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitTypeAccess().getMinuteEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTimeUnitTypeAccess().getMinuteEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalIotDsl.g:5278:3: (enumLiteral_3= 'Hour' )
                    {
                    // InternalIotDsl.g:5278:3: (enumLiteral_3= 'Hour' )
                    // InternalIotDsl.g:5279:4: enumLiteral_3= 'Hour'
                    {
                    enumLiteral_3=(Token)match(input,106,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitTypeAccess().getHourEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTimeUnitTypeAccess().getHourEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleTimeUnitType"


    // $ANTLR start "ruleResizeType"
    // InternalIotDsl.g:5289:1: ruleResizeType returns [Enumerator current=null] : ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'auto' ) | (enumLiteral_2= 'fill' ) ) ;
    public final Enumerator ruleResizeType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalIotDsl.g:5295:2: ( ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'auto' ) | (enumLiteral_2= 'fill' ) ) )
            // InternalIotDsl.g:5296:2: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'auto' ) | (enumLiteral_2= 'fill' ) )
            {
            // InternalIotDsl.g:5296:2: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'auto' ) | (enumLiteral_2= 'fill' ) )
            int alt40=3;
            switch ( input.LA(1) ) {
            case 107:
                {
                alt40=1;
                }
                break;
            case 108:
                {
                alt40=2;
                }
                break;
            case 109:
                {
                alt40=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // InternalIotDsl.g:5297:3: (enumLiteral_0= 'none' )
                    {
                    // InternalIotDsl.g:5297:3: (enumLiteral_0= 'none' )
                    // InternalIotDsl.g:5298:4: enumLiteral_0= 'none'
                    {
                    enumLiteral_0=(Token)match(input,107,FOLLOW_2); 

                    				current = grammarAccess.getResizeTypeAccess().getNoneEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getResizeTypeAccess().getNoneEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalIotDsl.g:5305:3: (enumLiteral_1= 'auto' )
                    {
                    // InternalIotDsl.g:5305:3: (enumLiteral_1= 'auto' )
                    // InternalIotDsl.g:5306:4: enumLiteral_1= 'auto'
                    {
                    enumLiteral_1=(Token)match(input,108,FOLLOW_2); 

                    				current = grammarAccess.getResizeTypeAccess().getAutoEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getResizeTypeAccess().getAutoEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalIotDsl.g:5313:3: (enumLiteral_2= 'fill' )
                    {
                    // InternalIotDsl.g:5313:3: (enumLiteral_2= 'fill' )
                    // InternalIotDsl.g:5314:4: enumLiteral_2= 'fill'
                    {
                    enumLiteral_2=(Token)match(input,109,FOLLOW_2); 

                    				current = grammarAccess.getResizeTypeAccess().getFillEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getResizeTypeAccess().getFillEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleResizeType"


    // $ANTLR start "rulePinResistor"
    // InternalIotDsl.g:5324:1: rulePinResistor returns [Enumerator current=null] : ( (enumLiteral_0= 'pull_up' ) | (enumLiteral_1= 'pull_down' ) ) ;
    public final Enumerator rulePinResistor() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalIotDsl.g:5330:2: ( ( (enumLiteral_0= 'pull_up' ) | (enumLiteral_1= 'pull_down' ) ) )
            // InternalIotDsl.g:5331:2: ( (enumLiteral_0= 'pull_up' ) | (enumLiteral_1= 'pull_down' ) )
            {
            // InternalIotDsl.g:5331:2: ( (enumLiteral_0= 'pull_up' ) | (enumLiteral_1= 'pull_down' ) )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==110) ) {
                alt41=1;
            }
            else if ( (LA41_0==111) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // InternalIotDsl.g:5332:3: (enumLiteral_0= 'pull_up' )
                    {
                    // InternalIotDsl.g:5332:3: (enumLiteral_0= 'pull_up' )
                    // InternalIotDsl.g:5333:4: enumLiteral_0= 'pull_up'
                    {
                    enumLiteral_0=(Token)match(input,110,FOLLOW_2); 

                    				current = grammarAccess.getPinResistorAccess().getPullUpEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPinResistorAccess().getPullUpEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalIotDsl.g:5340:3: (enumLiteral_1= 'pull_down' )
                    {
                    // InternalIotDsl.g:5340:3: (enumLiteral_1= 'pull_down' )
                    // InternalIotDsl.g:5341:4: enumLiteral_1= 'pull_down'
                    {
                    enumLiteral_1=(Token)match(input,111,FOLLOW_2); 

                    				current = grammarAccess.getPinResistorAccess().getPullDownEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPinResistorAccess().getPullDownEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "rulePinResistor"


    // $ANTLR start "ruleGpioInterruptMode"
    // InternalIotDsl.g:5351:1: ruleGpioInterruptMode returns [Enumerator current=null] : ( (enumLiteral_0= 'rising' ) | (enumLiteral_1= 'falling' ) | (enumLiteral_2= 'changes' ) | (enumLiteral_3= 'low' ) | (enumLiteral_4= 'high' ) ) ;
    public final Enumerator ruleGpioInterruptMode() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalIotDsl.g:5357:2: ( ( (enumLiteral_0= 'rising' ) | (enumLiteral_1= 'falling' ) | (enumLiteral_2= 'changes' ) | (enumLiteral_3= 'low' ) | (enumLiteral_4= 'high' ) ) )
            // InternalIotDsl.g:5358:2: ( (enumLiteral_0= 'rising' ) | (enumLiteral_1= 'falling' ) | (enumLiteral_2= 'changes' ) | (enumLiteral_3= 'low' ) | (enumLiteral_4= 'high' ) )
            {
            // InternalIotDsl.g:5358:2: ( (enumLiteral_0= 'rising' ) | (enumLiteral_1= 'falling' ) | (enumLiteral_2= 'changes' ) | (enumLiteral_3= 'low' ) | (enumLiteral_4= 'high' ) )
            int alt42=5;
            switch ( input.LA(1) ) {
            case 112:
                {
                alt42=1;
                }
                break;
            case 113:
                {
                alt42=2;
                }
                break;
            case 114:
                {
                alt42=3;
                }
                break;
            case 115:
                {
                alt42=4;
                }
                break;
            case 116:
                {
                alt42=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // InternalIotDsl.g:5359:3: (enumLiteral_0= 'rising' )
                    {
                    // InternalIotDsl.g:5359:3: (enumLiteral_0= 'rising' )
                    // InternalIotDsl.g:5360:4: enumLiteral_0= 'rising'
                    {
                    enumLiteral_0=(Token)match(input,112,FOLLOW_2); 

                    				current = grammarAccess.getGpioInterruptModeAccess().getRisingEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getGpioInterruptModeAccess().getRisingEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalIotDsl.g:5367:3: (enumLiteral_1= 'falling' )
                    {
                    // InternalIotDsl.g:5367:3: (enumLiteral_1= 'falling' )
                    // InternalIotDsl.g:5368:4: enumLiteral_1= 'falling'
                    {
                    enumLiteral_1=(Token)match(input,113,FOLLOW_2); 

                    				current = grammarAccess.getGpioInterruptModeAccess().getFallingEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getGpioInterruptModeAccess().getFallingEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalIotDsl.g:5375:3: (enumLiteral_2= 'changes' )
                    {
                    // InternalIotDsl.g:5375:3: (enumLiteral_2= 'changes' )
                    // InternalIotDsl.g:5376:4: enumLiteral_2= 'changes'
                    {
                    enumLiteral_2=(Token)match(input,114,FOLLOW_2); 

                    				current = grammarAccess.getGpioInterruptModeAccess().getChangesEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getGpioInterruptModeAccess().getChangesEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalIotDsl.g:5383:3: (enumLiteral_3= 'low' )
                    {
                    // InternalIotDsl.g:5383:3: (enumLiteral_3= 'low' )
                    // InternalIotDsl.g:5384:4: enumLiteral_3= 'low'
                    {
                    enumLiteral_3=(Token)match(input,115,FOLLOW_2); 

                    				current = grammarAccess.getGpioInterruptModeAccess().getLowEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getGpioInterruptModeAccess().getLowEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalIotDsl.g:5391:3: (enumLiteral_4= 'high' )
                    {
                    // InternalIotDsl.g:5391:3: (enumLiteral_4= 'high' )
                    // InternalIotDsl.g:5392:4: enumLiteral_4= 'high'
                    {
                    enumLiteral_4=(Token)match(input,116,FOLLOW_2); 

                    				current = grammarAccess.getGpioInterruptModeAccess().getHighEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getGpioInterruptModeAccess().getHighEnumLiteralDeclaration_4());
                    			

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
    // $ANTLR end "ruleGpioInterruptMode"


    // $ANTLR start "ruleDigitalPinStatus"
    // InternalIotDsl.g:5402:1: ruleDigitalPinStatus returns [Enumerator current=null] : ( (enumLiteral_0= 'high' ) | (enumLiteral_1= 'low' ) ) ;
    public final Enumerator ruleDigitalPinStatus() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalIotDsl.g:5408:2: ( ( (enumLiteral_0= 'high' ) | (enumLiteral_1= 'low' ) ) )
            // InternalIotDsl.g:5409:2: ( (enumLiteral_0= 'high' ) | (enumLiteral_1= 'low' ) )
            {
            // InternalIotDsl.g:5409:2: ( (enumLiteral_0= 'high' ) | (enumLiteral_1= 'low' ) )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==116) ) {
                alt43=1;
            }
            else if ( (LA43_0==115) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // InternalIotDsl.g:5410:3: (enumLiteral_0= 'high' )
                    {
                    // InternalIotDsl.g:5410:3: (enumLiteral_0= 'high' )
                    // InternalIotDsl.g:5411:4: enumLiteral_0= 'high'
                    {
                    enumLiteral_0=(Token)match(input,116,FOLLOW_2); 

                    				current = grammarAccess.getDigitalPinStatusAccess().getHighEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDigitalPinStatusAccess().getHighEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalIotDsl.g:5418:3: (enumLiteral_1= 'low' )
                    {
                    // InternalIotDsl.g:5418:3: (enumLiteral_1= 'low' )
                    // InternalIotDsl.g:5419:4: enumLiteral_1= 'low'
                    {
                    enumLiteral_1=(Token)match(input,115,FOLLOW_2); 

                    				current = grammarAccess.getDigitalPinStatusAccess().getLowEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDigitalPinStatusAccess().getLowEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleDigitalPinStatus"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000080040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000000L,0x0000000F00000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001E00000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000000L,0x0000000000007400L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001C00000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000000L,0x0000000000018000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x040A4D30F8000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0xB800002000000000L,0x000000002A960306L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000F00000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000000L,0x001F000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000000L,0x0000C00000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000078000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000030L,0x0000000000000001L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000000L,0x0000380000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x0018000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});

}