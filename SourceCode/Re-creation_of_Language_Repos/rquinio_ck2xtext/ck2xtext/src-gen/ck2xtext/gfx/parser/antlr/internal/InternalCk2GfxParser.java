package ck2xtext.gfx.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import ck2xtext.gfx.services.Ck2GfxGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCk2GfxParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_BOOL", "RULE_ID", "RULE_HEX", "RULE_DIGIT", "RULE_NON_ASCII_CAP", "RULE_NON_ASCII_LOW", "RULE_ID_PART", "RULE_SL_COMMENT", "RULE_WS", "'{'", "'}'", "'x'", "'='", "'y'", "'spriteTypes'", "'spriteType'", "'textSpriteType'", "'name'", "'texturefile'", "'textureFile'", "'noOfFrames'", "'noOfframes'", "'loadType'", "'allwaystransparent'", "'noRefCount'", "'norefcount'", "'effectFile'", "'transparencecheck'", "'can_be_lowres'", "'clicksound'", "'frameAnimatedSpriteType'", "'animation_rate_fps'", "'looping'", "'play_on_show'", "'corneredTileSpriteType'", "'size'", "'borderSize'", "'tilingCenter'", "'progressbartype'", "'color'", "'colortwo'", "'textureFile1'", "'textureFile2'", "'horizontal'", "'maxValue'", "'portraitType'", "'layer'", "'hair_color_index'", "'hair_color'", "'eye_color_index'", "'eye_color'", "'headgear_that_hides_hair'", "'maskedShieldType'", "'LineChartType'", "'linewidth'", "'CoatOfArmsType'", "'frame'", "'mask'", "'seal_overlay'", "'effect'", "'center'", "'scale'", "'objectTypes'", "'EMFXActorType'", "'actorfile'", "'idle'", "'move'", "'attack'", "'use_animation'", "'cull_distance'", "'scale_on_cull_distance'", "'animation'", "'file'", "'defaultAnimationTime'", "'pdxmesh'", "'arrowType'", "'bodytexture'", "'endAt'", "'height'", "'type'", "'heading'", "'bitmapfonts'", "'bitmapfont'", "'fontname'", "'colorcodes'", "'color_override'", "'-'", "'+'", "'.'", "'f'"
    };
    public static final int RULE_HEX=8;
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
    public static final int RULE_ID=7;
    public static final int RULE_DIGIT=9;
    public static final int RULE_INT=4;
    public static final int T__66=66;
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
    public static final int RULE_BOOL=6;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int RULE_NON_ASCII_CAP=10;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__95=95;
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
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=13;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int RULE_ID_PART=12;
    public static final int T__82=82;
    public static final int RULE_NON_ASCII_LOW=11;
    public static final int T__83=83;
    public static final int RULE_WS=14;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;

    // delegates
    // delegators


        public InternalCk2GfxParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCk2GfxParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCk2GfxParser.tokenNames; }
    public String getGrammarFileName() { return "InternalCk2Gfx.g"; }



     	private Ck2GfxGrammarAccess grammarAccess;

        public InternalCk2GfxParser(TokenStream input, Ck2GfxGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected Ck2GfxGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalCk2Gfx.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalCk2Gfx.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalCk2Gfx.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalCk2Gfx.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_types_0_1= ruleSpriteTypes | lv_types_0_2= ruleObjectTypes | lv_types_0_3= ruleBitmapFonts ) ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_types_0_1 = null;

        EObject lv_types_0_2 = null;

        EObject lv_types_0_3 = null;



        	enterRule();

        try {
            // InternalCk2Gfx.g:77:2: ( ( ( (lv_types_0_1= ruleSpriteTypes | lv_types_0_2= ruleObjectTypes | lv_types_0_3= ruleBitmapFonts ) ) )* )
            // InternalCk2Gfx.g:78:2: ( ( (lv_types_0_1= ruleSpriteTypes | lv_types_0_2= ruleObjectTypes | lv_types_0_3= ruleBitmapFonts ) ) )*
            {
            // InternalCk2Gfx.g:78:2: ( ( (lv_types_0_1= ruleSpriteTypes | lv_types_0_2= ruleObjectTypes | lv_types_0_3= ruleBitmapFonts ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==20||LA2_0==68||LA2_0==87) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalCk2Gfx.g:79:3: ( (lv_types_0_1= ruleSpriteTypes | lv_types_0_2= ruleObjectTypes | lv_types_0_3= ruleBitmapFonts ) )
            	    {
            	    // InternalCk2Gfx.g:79:3: ( (lv_types_0_1= ruleSpriteTypes | lv_types_0_2= ruleObjectTypes | lv_types_0_3= ruleBitmapFonts ) )
            	    // InternalCk2Gfx.g:80:4: (lv_types_0_1= ruleSpriteTypes | lv_types_0_2= ruleObjectTypes | lv_types_0_3= ruleBitmapFonts )
            	    {
            	    // InternalCk2Gfx.g:80:4: (lv_types_0_1= ruleSpriteTypes | lv_types_0_2= ruleObjectTypes | lv_types_0_3= ruleBitmapFonts )
            	    int alt1=3;
            	    switch ( input.LA(1) ) {
            	    case 20:
            	        {
            	        alt1=1;
            	        }
            	        break;
            	    case 68:
            	        {
            	        alt1=2;
            	        }
            	        break;
            	    case 87:
            	        {
            	        alt1=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 1, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt1) {
            	        case 1 :
            	            // InternalCk2Gfx.g:81:5: lv_types_0_1= ruleSpriteTypes
            	            {

            	            					newCompositeNode(grammarAccess.getModelAccess().getTypesSpriteTypesParserRuleCall_0_0());
            	            				
            	            pushFollow(FOLLOW_3);
            	            lv_types_0_1=ruleSpriteTypes();

            	            state._fsp--;


            	            					if (current==null) {
            	            						current = createModelElementForParent(grammarAccess.getModelRule());
            	            					}
            	            					add(
            	            						current,
            	            						"types",
            	            						lv_types_0_1,
            	            						"ck2xtext.gfx.Ck2Gfx.SpriteTypes");
            	            					afterParserOrEnumRuleCall();
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // InternalCk2Gfx.g:97:5: lv_types_0_2= ruleObjectTypes
            	            {

            	            					newCompositeNode(grammarAccess.getModelAccess().getTypesObjectTypesParserRuleCall_0_1());
            	            				
            	            pushFollow(FOLLOW_3);
            	            lv_types_0_2=ruleObjectTypes();

            	            state._fsp--;


            	            					if (current==null) {
            	            						current = createModelElementForParent(grammarAccess.getModelRule());
            	            					}
            	            					add(
            	            						current,
            	            						"types",
            	            						lv_types_0_2,
            	            						"ck2xtext.gfx.Ck2Gfx.ObjectTypes");
            	            					afterParserOrEnumRuleCall();
            	            				

            	            }
            	            break;
            	        case 3 :
            	            // InternalCk2Gfx.g:113:5: lv_types_0_3= ruleBitmapFonts
            	            {

            	            					newCompositeNode(grammarAccess.getModelAccess().getTypesBitmapFontsParserRuleCall_0_2());
            	            				
            	            pushFollow(FOLLOW_3);
            	            lv_types_0_3=ruleBitmapFonts();

            	            state._fsp--;


            	            					if (current==null) {
            	            						current = createModelElementForParent(grammarAccess.getModelRule());
            	            					}
            	            					add(
            	            						current,
            	            						"types",
            	            						lv_types_0_3,
            	            						"ck2xtext.gfx.Ck2Gfx.BitmapFonts");
            	            					afterParserOrEnumRuleCall();
            	            				

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleColor"
    // InternalCk2Gfx.g:134:1: entryRuleColor returns [EObject current=null] : iv_ruleColor= ruleColor EOF ;
    public final EObject entryRuleColor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColor = null;


        try {
            // InternalCk2Gfx.g:134:46: (iv_ruleColor= ruleColor EOF )
            // InternalCk2Gfx.g:135:2: iv_ruleColor= ruleColor EOF
            {
             newCompositeNode(grammarAccess.getColorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColor=ruleColor();

            state._fsp--;

             current =iv_ruleColor; 
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
    // $ANTLR end "entryRuleColor"


    // $ANTLR start "ruleColor"
    // InternalCk2Gfx.g:141:1: ruleColor returns [EObject current=null] : (otherlv_0= '{' ( (lv_r_1_0= RULE_INT ) ) ( (lv_g_2_0= RULE_INT ) ) ( (lv_b_3_0= RULE_INT ) ) otherlv_4= '}' ) ;
    public final EObject ruleColor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_r_1_0=null;
        Token lv_g_2_0=null;
        Token lv_b_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalCk2Gfx.g:147:2: ( (otherlv_0= '{' ( (lv_r_1_0= RULE_INT ) ) ( (lv_g_2_0= RULE_INT ) ) ( (lv_b_3_0= RULE_INT ) ) otherlv_4= '}' ) )
            // InternalCk2Gfx.g:148:2: (otherlv_0= '{' ( (lv_r_1_0= RULE_INT ) ) ( (lv_g_2_0= RULE_INT ) ) ( (lv_b_3_0= RULE_INT ) ) otherlv_4= '}' )
            {
            // InternalCk2Gfx.g:148:2: (otherlv_0= '{' ( (lv_r_1_0= RULE_INT ) ) ( (lv_g_2_0= RULE_INT ) ) ( (lv_b_3_0= RULE_INT ) ) otherlv_4= '}' )
            // InternalCk2Gfx.g:149:3: otherlv_0= '{' ( (lv_r_1_0= RULE_INT ) ) ( (lv_g_2_0= RULE_INT ) ) ( (lv_b_3_0= RULE_INT ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getColorAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalCk2Gfx.g:153:3: ( (lv_r_1_0= RULE_INT ) )
            // InternalCk2Gfx.g:154:4: (lv_r_1_0= RULE_INT )
            {
            // InternalCk2Gfx.g:154:4: (lv_r_1_0= RULE_INT )
            // InternalCk2Gfx.g:155:5: lv_r_1_0= RULE_INT
            {
            lv_r_1_0=(Token)match(input,RULE_INT,FOLLOW_4); 

            					newLeafNode(lv_r_1_0, grammarAccess.getColorAccess().getRINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getColorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"r",
            						lv_r_1_0,
            						"ck2xtext.common.Ck2Terminals.INT");
            				

            }


            }

            // InternalCk2Gfx.g:171:3: ( (lv_g_2_0= RULE_INT ) )
            // InternalCk2Gfx.g:172:4: (lv_g_2_0= RULE_INT )
            {
            // InternalCk2Gfx.g:172:4: (lv_g_2_0= RULE_INT )
            // InternalCk2Gfx.g:173:5: lv_g_2_0= RULE_INT
            {
            lv_g_2_0=(Token)match(input,RULE_INT,FOLLOW_4); 

            					newLeafNode(lv_g_2_0, grammarAccess.getColorAccess().getGINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getColorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"g",
            						lv_g_2_0,
            						"ck2xtext.common.Ck2Terminals.INT");
            				

            }


            }

            // InternalCk2Gfx.g:189:3: ( (lv_b_3_0= RULE_INT ) )
            // InternalCk2Gfx.g:190:4: (lv_b_3_0= RULE_INT )
            {
            // InternalCk2Gfx.g:190:4: (lv_b_3_0= RULE_INT )
            // InternalCk2Gfx.g:191:5: lv_b_3_0= RULE_INT
            {
            lv_b_3_0=(Token)match(input,RULE_INT,FOLLOW_5); 

            					newLeafNode(lv_b_3_0, grammarAccess.getColorAccess().getBINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getColorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"b",
            						lv_b_3_0,
            						"ck2xtext.common.Ck2Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getColorAccess().getRightCurlyBracketKeyword_4());
            		

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


    // $ANTLR start "entryRuleColorRatio"
    // InternalCk2Gfx.g:215:1: entryRuleColorRatio returns [EObject current=null] : iv_ruleColorRatio= ruleColorRatio EOF ;
    public final EObject entryRuleColorRatio() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColorRatio = null;


        try {
            // InternalCk2Gfx.g:215:51: (iv_ruleColorRatio= ruleColorRatio EOF )
            // InternalCk2Gfx.g:216:2: iv_ruleColorRatio= ruleColorRatio EOF
            {
             newCompositeNode(grammarAccess.getColorRatioRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColorRatio=ruleColorRatio();

            state._fsp--;

             current =iv_ruleColorRatio; 
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
    // $ANTLR end "entryRuleColorRatio"


    // $ANTLR start "ruleColorRatio"
    // InternalCk2Gfx.g:222:1: ruleColorRatio returns [EObject current=null] : (otherlv_0= '{' ( (lv_r_1_0= ruleDouble ) ) ( (lv_g_2_0= ruleDouble ) ) ( (lv_b_3_0= ruleDouble ) ) otherlv_4= '}' ) ;
    public final EObject ruleColorRatio() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_r_1_0 = null;

        AntlrDatatypeRuleToken lv_g_2_0 = null;

        AntlrDatatypeRuleToken lv_b_3_0 = null;



        	enterRule();

        try {
            // InternalCk2Gfx.g:228:2: ( (otherlv_0= '{' ( (lv_r_1_0= ruleDouble ) ) ( (lv_g_2_0= ruleDouble ) ) ( (lv_b_3_0= ruleDouble ) ) otherlv_4= '}' ) )
            // InternalCk2Gfx.g:229:2: (otherlv_0= '{' ( (lv_r_1_0= ruleDouble ) ) ( (lv_g_2_0= ruleDouble ) ) ( (lv_b_3_0= ruleDouble ) ) otherlv_4= '}' )
            {
            // InternalCk2Gfx.g:229:2: (otherlv_0= '{' ( (lv_r_1_0= ruleDouble ) ) ( (lv_g_2_0= ruleDouble ) ) ( (lv_b_3_0= ruleDouble ) ) otherlv_4= '}' )
            // InternalCk2Gfx.g:230:3: otherlv_0= '{' ( (lv_r_1_0= ruleDouble ) ) ( (lv_g_2_0= ruleDouble ) ) ( (lv_b_3_0= ruleDouble ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getColorRatioAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalCk2Gfx.g:234:3: ( (lv_r_1_0= ruleDouble ) )
            // InternalCk2Gfx.g:235:4: (lv_r_1_0= ruleDouble )
            {
            // InternalCk2Gfx.g:235:4: (lv_r_1_0= ruleDouble )
            // InternalCk2Gfx.g:236:5: lv_r_1_0= ruleDouble
            {

            					newCompositeNode(grammarAccess.getColorRatioAccess().getRDoubleParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_r_1_0=ruleDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getColorRatioRule());
            					}
            					set(
            						current,
            						"r",
            						lv_r_1_0,
            						"ck2xtext.common.Ck2Terminals.Double");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCk2Gfx.g:253:3: ( (lv_g_2_0= ruleDouble ) )
            // InternalCk2Gfx.g:254:4: (lv_g_2_0= ruleDouble )
            {
            // InternalCk2Gfx.g:254:4: (lv_g_2_0= ruleDouble )
            // InternalCk2Gfx.g:255:5: lv_g_2_0= ruleDouble
            {

            					newCompositeNode(grammarAccess.getColorRatioAccess().getGDoubleParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_g_2_0=ruleDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getColorRatioRule());
            					}
            					set(
            						current,
            						"g",
            						lv_g_2_0,
            						"ck2xtext.common.Ck2Terminals.Double");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCk2Gfx.g:272:3: ( (lv_b_3_0= ruleDouble ) )
            // InternalCk2Gfx.g:273:4: (lv_b_3_0= ruleDouble )
            {
            // InternalCk2Gfx.g:273:4: (lv_b_3_0= ruleDouble )
            // InternalCk2Gfx.g:274:5: lv_b_3_0= ruleDouble
            {

            					newCompositeNode(grammarAccess.getColorRatioAccess().getBDoubleParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_5);
            lv_b_3_0=ruleDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getColorRatioRule());
            					}
            					set(
            						current,
            						"b",
            						lv_b_3_0,
            						"ck2xtext.common.Ck2Terminals.Double");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getColorRatioAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleColorRatio"


    // $ANTLR start "entryRuleCoordinates"
    // InternalCk2Gfx.g:299:1: entryRuleCoordinates returns [EObject current=null] : iv_ruleCoordinates= ruleCoordinates EOF ;
    public final EObject entryRuleCoordinates() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoordinates = null;


        try {
            // InternalCk2Gfx.g:299:52: (iv_ruleCoordinates= ruleCoordinates EOF )
            // InternalCk2Gfx.g:300:2: iv_ruleCoordinates= ruleCoordinates EOF
            {
             newCompositeNode(grammarAccess.getCoordinatesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCoordinates=ruleCoordinates();

            state._fsp--;

             current =iv_ruleCoordinates; 
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
    // $ANTLR end "entryRuleCoordinates"


    // $ANTLR start "ruleCoordinates"
    // InternalCk2Gfx.g:306:1: ruleCoordinates returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'x' otherlv_2= '=' ( (lv_x_3_0= ruleNumber ) ) otherlv_4= 'y' otherlv_5= '=' ( (lv_y_6_0= ruleNumber ) ) otherlv_7= '}' ) ;
    public final EObject ruleCoordinates() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_x_3_0 = null;

        AntlrDatatypeRuleToken lv_y_6_0 = null;



        	enterRule();

        try {
            // InternalCk2Gfx.g:312:2: ( (otherlv_0= '{' otherlv_1= 'x' otherlv_2= '=' ( (lv_x_3_0= ruleNumber ) ) otherlv_4= 'y' otherlv_5= '=' ( (lv_y_6_0= ruleNumber ) ) otherlv_7= '}' ) )
            // InternalCk2Gfx.g:313:2: (otherlv_0= '{' otherlv_1= 'x' otherlv_2= '=' ( (lv_x_3_0= ruleNumber ) ) otherlv_4= 'y' otherlv_5= '=' ( (lv_y_6_0= ruleNumber ) ) otherlv_7= '}' )
            {
            // InternalCk2Gfx.g:313:2: (otherlv_0= '{' otherlv_1= 'x' otherlv_2= '=' ( (lv_x_3_0= ruleNumber ) ) otherlv_4= 'y' otherlv_5= '=' ( (lv_y_6_0= ruleNumber ) ) otherlv_7= '}' )
            // InternalCk2Gfx.g:314:3: otherlv_0= '{' otherlv_1= 'x' otherlv_2= '=' ( (lv_x_3_0= ruleNumber ) ) otherlv_4= 'y' otherlv_5= '=' ( (lv_y_6_0= ruleNumber ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getCoordinatesAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getCoordinatesAccess().getXKeyword_1());
            		
            otherlv_2=(Token)match(input,18,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getCoordinatesAccess().getEqualsSignKeyword_2());
            		
            // InternalCk2Gfx.g:326:3: ( (lv_x_3_0= ruleNumber ) )
            // InternalCk2Gfx.g:327:4: (lv_x_3_0= ruleNumber )
            {
            // InternalCk2Gfx.g:327:4: (lv_x_3_0= ruleNumber )
            // InternalCk2Gfx.g:328:5: lv_x_3_0= ruleNumber
            {

            					newCompositeNode(grammarAccess.getCoordinatesAccess().getXNumberParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_9);
            lv_x_3_0=ruleNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCoordinatesRule());
            					}
            					set(
            						current,
            						"x",
            						lv_x_3_0,
            						"ck2xtext.common.Ck2Terminals.Number");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,19,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getCoordinatesAccess().getYKeyword_4());
            		
            otherlv_5=(Token)match(input,18,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getCoordinatesAccess().getEqualsSignKeyword_5());
            		
            // InternalCk2Gfx.g:353:3: ( (lv_y_6_0= ruleNumber ) )
            // InternalCk2Gfx.g:354:4: (lv_y_6_0= ruleNumber )
            {
            // InternalCk2Gfx.g:354:4: (lv_y_6_0= ruleNumber )
            // InternalCk2Gfx.g:355:5: lv_y_6_0= ruleNumber
            {

            					newCompositeNode(grammarAccess.getCoordinatesAccess().getYNumberParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_5);
            lv_y_6_0=ruleNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCoordinatesRule());
            					}
            					set(
            						current,
            						"y",
            						lv_y_6_0,
            						"ck2xtext.common.Ck2Terminals.Number");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getCoordinatesAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleCoordinates"


    // $ANTLR start "entryRuleSpriteTypes"
    // InternalCk2Gfx.g:380:1: entryRuleSpriteTypes returns [EObject current=null] : iv_ruleSpriteTypes= ruleSpriteTypes EOF ;
    public final EObject entryRuleSpriteTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpriteTypes = null;


        try {
            // InternalCk2Gfx.g:380:52: (iv_ruleSpriteTypes= ruleSpriteTypes EOF )
            // InternalCk2Gfx.g:381:2: iv_ruleSpriteTypes= ruleSpriteTypes EOF
            {
             newCompositeNode(grammarAccess.getSpriteTypesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpriteTypes=ruleSpriteTypes();

            state._fsp--;

             current =iv_ruleSpriteTypes; 
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
    // $ANTLR end "entryRuleSpriteTypes"


    // $ANTLR start "ruleSpriteTypes"
    // InternalCk2Gfx.g:387:1: ruleSpriteTypes returns [EObject current=null] : ( () otherlv_1= 'spriteTypes' otherlv_2= '=' otherlv_3= '{' ( ( (lv_types_4_1= ruleSpriteType | lv_types_4_2= ruleAnimatedSpriteType | lv_types_4_3= ruleCorneredTileSpriteType | lv_types_4_4= ruleProgressbarType | lv_types_4_5= ruleCoatOfArmsType | lv_types_4_6= rulePortraitType | lv_types_4_7= ruleMaskedShieldType | lv_types_4_8= ruleLineChartType ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleSpriteTypes() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_types_4_1 = null;

        EObject lv_types_4_2 = null;

        EObject lv_types_4_3 = null;

        EObject lv_types_4_4 = null;

        EObject lv_types_4_5 = null;

        EObject lv_types_4_6 = null;

        EObject lv_types_4_7 = null;

        EObject lv_types_4_8 = null;



        	enterRule();

        try {
            // InternalCk2Gfx.g:393:2: ( ( () otherlv_1= 'spriteTypes' otherlv_2= '=' otherlv_3= '{' ( ( (lv_types_4_1= ruleSpriteType | lv_types_4_2= ruleAnimatedSpriteType | lv_types_4_3= ruleCorneredTileSpriteType | lv_types_4_4= ruleProgressbarType | lv_types_4_5= ruleCoatOfArmsType | lv_types_4_6= rulePortraitType | lv_types_4_7= ruleMaskedShieldType | lv_types_4_8= ruleLineChartType ) ) )* otherlv_5= '}' ) )
            // InternalCk2Gfx.g:394:2: ( () otherlv_1= 'spriteTypes' otherlv_2= '=' otherlv_3= '{' ( ( (lv_types_4_1= ruleSpriteType | lv_types_4_2= ruleAnimatedSpriteType | lv_types_4_3= ruleCorneredTileSpriteType | lv_types_4_4= ruleProgressbarType | lv_types_4_5= ruleCoatOfArmsType | lv_types_4_6= rulePortraitType | lv_types_4_7= ruleMaskedShieldType | lv_types_4_8= ruleLineChartType ) ) )* otherlv_5= '}' )
            {
            // InternalCk2Gfx.g:394:2: ( () otherlv_1= 'spriteTypes' otherlv_2= '=' otherlv_3= '{' ( ( (lv_types_4_1= ruleSpriteType | lv_types_4_2= ruleAnimatedSpriteType | lv_types_4_3= ruleCorneredTileSpriteType | lv_types_4_4= ruleProgressbarType | lv_types_4_5= ruleCoatOfArmsType | lv_types_4_6= rulePortraitType | lv_types_4_7= ruleMaskedShieldType | lv_types_4_8= ruleLineChartType ) ) )* otherlv_5= '}' )
            // InternalCk2Gfx.g:395:3: () otherlv_1= 'spriteTypes' otherlv_2= '=' otherlv_3= '{' ( ( (lv_types_4_1= ruleSpriteType | lv_types_4_2= ruleAnimatedSpriteType | lv_types_4_3= ruleCorneredTileSpriteType | lv_types_4_4= ruleProgressbarType | lv_types_4_5= ruleCoatOfArmsType | lv_types_4_6= rulePortraitType | lv_types_4_7= ruleMaskedShieldType | lv_types_4_8= ruleLineChartType ) ) )* otherlv_5= '}'
            {
            // InternalCk2Gfx.g:395:3: ()
            // InternalCk2Gfx.g:396:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSpriteTypesAccess().getSpriteTypesAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getSpriteTypesAccess().getSpriteTypesKeyword_1());
            		
            otherlv_2=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getSpriteTypesAccess().getEqualsSignKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getSpriteTypesAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCk2Gfx.g:414:3: ( ( (lv_types_4_1= ruleSpriteType | lv_types_4_2= ruleAnimatedSpriteType | lv_types_4_3= ruleCorneredTileSpriteType | lv_types_4_4= ruleProgressbarType | lv_types_4_5= ruleCoatOfArmsType | lv_types_4_6= rulePortraitType | lv_types_4_7= ruleMaskedShieldType | lv_types_4_8= ruleLineChartType ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=21 && LA4_0<=22)||LA4_0==36||LA4_0==40||LA4_0==44||LA4_0==51||(LA4_0>=58 && LA4_0<=59)||LA4_0==61) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalCk2Gfx.g:415:4: ( (lv_types_4_1= ruleSpriteType | lv_types_4_2= ruleAnimatedSpriteType | lv_types_4_3= ruleCorneredTileSpriteType | lv_types_4_4= ruleProgressbarType | lv_types_4_5= ruleCoatOfArmsType | lv_types_4_6= rulePortraitType | lv_types_4_7= ruleMaskedShieldType | lv_types_4_8= ruleLineChartType ) )
            	    {
            	    // InternalCk2Gfx.g:415:4: ( (lv_types_4_1= ruleSpriteType | lv_types_4_2= ruleAnimatedSpriteType | lv_types_4_3= ruleCorneredTileSpriteType | lv_types_4_4= ruleProgressbarType | lv_types_4_5= ruleCoatOfArmsType | lv_types_4_6= rulePortraitType | lv_types_4_7= ruleMaskedShieldType | lv_types_4_8= ruleLineChartType ) )
            	    // InternalCk2Gfx.g:416:5: (lv_types_4_1= ruleSpriteType | lv_types_4_2= ruleAnimatedSpriteType | lv_types_4_3= ruleCorneredTileSpriteType | lv_types_4_4= ruleProgressbarType | lv_types_4_5= ruleCoatOfArmsType | lv_types_4_6= rulePortraitType | lv_types_4_7= ruleMaskedShieldType | lv_types_4_8= ruleLineChartType )
            	    {
            	    // InternalCk2Gfx.g:416:5: (lv_types_4_1= ruleSpriteType | lv_types_4_2= ruleAnimatedSpriteType | lv_types_4_3= ruleCorneredTileSpriteType | lv_types_4_4= ruleProgressbarType | lv_types_4_5= ruleCoatOfArmsType | lv_types_4_6= rulePortraitType | lv_types_4_7= ruleMaskedShieldType | lv_types_4_8= ruleLineChartType )
            	    int alt3=8;
            	    switch ( input.LA(1) ) {
            	    case 21:
            	    case 22:
            	        {
            	        alt3=1;
            	        }
            	        break;
            	    case 36:
            	        {
            	        alt3=2;
            	        }
            	        break;
            	    case 40:
            	        {
            	        alt3=3;
            	        }
            	        break;
            	    case 44:
            	        {
            	        alt3=4;
            	        }
            	        break;
            	    case 61:
            	        {
            	        alt3=5;
            	        }
            	        break;
            	    case 51:
            	        {
            	        alt3=6;
            	        }
            	        break;
            	    case 58:
            	        {
            	        alt3=7;
            	        }
            	        break;
            	    case 59:
            	        {
            	        alt3=8;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 3, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt3) {
            	        case 1 :
            	            // InternalCk2Gfx.g:417:6: lv_types_4_1= ruleSpriteType
            	            {

            	            						newCompositeNode(grammarAccess.getSpriteTypesAccess().getTypesSpriteTypeParserRuleCall_4_0_0());
            	            					
            	            pushFollow(FOLLOW_11);
            	            lv_types_4_1=ruleSpriteType();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getSpriteTypesRule());
            	            						}
            	            						add(
            	            							current,
            	            							"types",
            	            							lv_types_4_1,
            	            							"ck2xtext.gfx.Ck2Gfx.SpriteType");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalCk2Gfx.g:433:6: lv_types_4_2= ruleAnimatedSpriteType
            	            {

            	            						newCompositeNode(grammarAccess.getSpriteTypesAccess().getTypesAnimatedSpriteTypeParserRuleCall_4_0_1());
            	            					
            	            pushFollow(FOLLOW_11);
            	            lv_types_4_2=ruleAnimatedSpriteType();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getSpriteTypesRule());
            	            						}
            	            						add(
            	            							current,
            	            							"types",
            	            							lv_types_4_2,
            	            							"ck2xtext.gfx.Ck2Gfx.AnimatedSpriteType");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 3 :
            	            // InternalCk2Gfx.g:449:6: lv_types_4_3= ruleCorneredTileSpriteType
            	            {

            	            						newCompositeNode(grammarAccess.getSpriteTypesAccess().getTypesCorneredTileSpriteTypeParserRuleCall_4_0_2());
            	            					
            	            pushFollow(FOLLOW_11);
            	            lv_types_4_3=ruleCorneredTileSpriteType();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getSpriteTypesRule());
            	            						}
            	            						add(
            	            							current,
            	            							"types",
            	            							lv_types_4_3,
            	            							"ck2xtext.gfx.Ck2Gfx.CorneredTileSpriteType");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 4 :
            	            // InternalCk2Gfx.g:465:6: lv_types_4_4= ruleProgressbarType
            	            {

            	            						newCompositeNode(grammarAccess.getSpriteTypesAccess().getTypesProgressbarTypeParserRuleCall_4_0_3());
            	            					
            	            pushFollow(FOLLOW_11);
            	            lv_types_4_4=ruleProgressbarType();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getSpriteTypesRule());
            	            						}
            	            						add(
            	            							current,
            	            							"types",
            	            							lv_types_4_4,
            	            							"ck2xtext.gfx.Ck2Gfx.ProgressbarType");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 5 :
            	            // InternalCk2Gfx.g:481:6: lv_types_4_5= ruleCoatOfArmsType
            	            {

            	            						newCompositeNode(grammarAccess.getSpriteTypesAccess().getTypesCoatOfArmsTypeParserRuleCall_4_0_4());
            	            					
            	            pushFollow(FOLLOW_11);
            	            lv_types_4_5=ruleCoatOfArmsType();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getSpriteTypesRule());
            	            						}
            	            						add(
            	            							current,
            	            							"types",
            	            							lv_types_4_5,
            	            							"ck2xtext.gfx.Ck2Gfx.CoatOfArmsType");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 6 :
            	            // InternalCk2Gfx.g:497:6: lv_types_4_6= rulePortraitType
            	            {

            	            						newCompositeNode(grammarAccess.getSpriteTypesAccess().getTypesPortraitTypeParserRuleCall_4_0_5());
            	            					
            	            pushFollow(FOLLOW_11);
            	            lv_types_4_6=rulePortraitType();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getSpriteTypesRule());
            	            						}
            	            						add(
            	            							current,
            	            							"types",
            	            							lv_types_4_6,
            	            							"ck2xtext.gfx.Ck2Gfx.PortraitType");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 7 :
            	            // InternalCk2Gfx.g:513:6: lv_types_4_7= ruleMaskedShieldType
            	            {

            	            						newCompositeNode(grammarAccess.getSpriteTypesAccess().getTypesMaskedShieldTypeParserRuleCall_4_0_6());
            	            					
            	            pushFollow(FOLLOW_11);
            	            lv_types_4_7=ruleMaskedShieldType();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getSpriteTypesRule());
            	            						}
            	            						add(
            	            							current,
            	            							"types",
            	            							lv_types_4_7,
            	            							"ck2xtext.gfx.Ck2Gfx.MaskedShieldType");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 8 :
            	            // InternalCk2Gfx.g:529:6: lv_types_4_8= ruleLineChartType
            	            {

            	            						newCompositeNode(grammarAccess.getSpriteTypesAccess().getTypesLineChartTypeParserRuleCall_4_0_7());
            	            					
            	            pushFollow(FOLLOW_11);
            	            lv_types_4_8=ruleLineChartType();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getSpriteTypesRule());
            	            						}
            	            						add(
            	            							current,
            	            							"types",
            	            							lv_types_4_8,
            	            							"ck2xtext.gfx.Ck2Gfx.LineChartType");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_5=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getSpriteTypesAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleSpriteTypes"


    // $ANTLR start "entryRuleSpriteType"
    // InternalCk2Gfx.g:555:1: entryRuleSpriteType returns [EObject current=null] : iv_ruleSpriteType= ruleSpriteType EOF ;
    public final EObject entryRuleSpriteType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpriteType = null;


        try {
            // InternalCk2Gfx.g:555:51: (iv_ruleSpriteType= ruleSpriteType EOF )
            // InternalCk2Gfx.g:556:2: iv_ruleSpriteType= ruleSpriteType EOF
            {
             newCompositeNode(grammarAccess.getSpriteTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpriteType=ruleSpriteType();

            state._fsp--;

             current =iv_ruleSpriteType; 
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
    // $ANTLR end "entryRuleSpriteType"


    // $ANTLR start "ruleSpriteType"
    // InternalCk2Gfx.g:562:1: ruleSpriteType returns [EObject current=null] : ( (otherlv_0= 'spriteType' | otherlv_1= 'textSpriteType' ) otherlv_2= '=' otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_name_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'texturefile' | otherlv_9= 'textureFile' ) otherlv_10= '=' ( (lv_textureFile_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_12= 'noOfFrames' | otherlv_13= 'noOfframes' ) otherlv_14= '=' ( (lv_noOfFrames_15_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'loadType' otherlv_17= '=' ( (lv_loadType_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'allwaystransparent' otherlv_20= '=' ( (lv_allwaysTransparent_21_0= RULE_BOOL ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_22= 'noRefCount' | otherlv_23= 'norefcount' ) otherlv_24= '=' ( (lv_noRefCount_25_0= RULE_BOOL ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'effectFile' otherlv_27= '=' ( (lv_effectFile_28_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'transparencecheck' otherlv_30= '=' ( (lv_transparenceCheck_31_0= RULE_BOOL ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'can_be_lowres' otherlv_33= '=' ( (lv_canBeLowres_34_0= RULE_BOOL ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'clicksound' otherlv_36= '=' ( (lv_clickSound_37_0= RULE_ID ) ) ) ) ) ) )+ {...}?) ) ) otherlv_38= '}' ) ;
    public final EObject ruleSpriteType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_name_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_textureFile_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token lv_noOfFrames_15_0=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token lv_loadType_18_0=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token lv_allwaysTransparent_21_0=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token lv_noRefCount_25_0=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token lv_effectFile_28_0=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token lv_transparenceCheck_31_0=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token lv_canBeLowres_34_0=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token lv_clickSound_37_0=null;
        Token otherlv_38=null;


        	enterRule();

        try {
            // InternalCk2Gfx.g:568:2: ( ( (otherlv_0= 'spriteType' | otherlv_1= 'textSpriteType' ) otherlv_2= '=' otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_name_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'texturefile' | otherlv_9= 'textureFile' ) otherlv_10= '=' ( (lv_textureFile_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_12= 'noOfFrames' | otherlv_13= 'noOfframes' ) otherlv_14= '=' ( (lv_noOfFrames_15_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'loadType' otherlv_17= '=' ( (lv_loadType_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'allwaystransparent' otherlv_20= '=' ( (lv_allwaysTransparent_21_0= RULE_BOOL ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_22= 'noRefCount' | otherlv_23= 'norefcount' ) otherlv_24= '=' ( (lv_noRefCount_25_0= RULE_BOOL ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'effectFile' otherlv_27= '=' ( (lv_effectFile_28_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'transparencecheck' otherlv_30= '=' ( (lv_transparenceCheck_31_0= RULE_BOOL ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'can_be_lowres' otherlv_33= '=' ( (lv_canBeLowres_34_0= RULE_BOOL ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'clicksound' otherlv_36= '=' ( (lv_clickSound_37_0= RULE_ID ) ) ) ) ) ) )+ {...}?) ) ) otherlv_38= '}' ) )
            // InternalCk2Gfx.g:569:2: ( (otherlv_0= 'spriteType' | otherlv_1= 'textSpriteType' ) otherlv_2= '=' otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_name_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'texturefile' | otherlv_9= 'textureFile' ) otherlv_10= '=' ( (lv_textureFile_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_12= 'noOfFrames' | otherlv_13= 'noOfframes' ) otherlv_14= '=' ( (lv_noOfFrames_15_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'loadType' otherlv_17= '=' ( (lv_loadType_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'allwaystransparent' otherlv_20= '=' ( (lv_allwaysTransparent_21_0= RULE_BOOL ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_22= 'noRefCount' | otherlv_23= 'norefcount' ) otherlv_24= '=' ( (lv_noRefCount_25_0= RULE_BOOL ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'effectFile' otherlv_27= '=' ( (lv_effectFile_28_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'transparencecheck' otherlv_30= '=' ( (lv_transparenceCheck_31_0= RULE_BOOL ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'can_be_lowres' otherlv_33= '=' ( (lv_canBeLowres_34_0= RULE_BOOL ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'clicksound' otherlv_36= '=' ( (lv_clickSound_37_0= RULE_ID ) ) ) ) ) ) )+ {...}?) ) ) otherlv_38= '}' )
            {
            // InternalCk2Gfx.g:569:2: ( (otherlv_0= 'spriteType' | otherlv_1= 'textSpriteType' ) otherlv_2= '=' otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_name_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'texturefile' | otherlv_9= 'textureFile' ) otherlv_10= '=' ( (lv_textureFile_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_12= 'noOfFrames' | otherlv_13= 'noOfframes' ) otherlv_14= '=' ( (lv_noOfFrames_15_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'loadType' otherlv_17= '=' ( (lv_loadType_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'allwaystransparent' otherlv_20= '=' ( (lv_allwaysTransparent_21_0= RULE_BOOL ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_22= 'noRefCount' | otherlv_23= 'norefcount' ) otherlv_24= '=' ( (lv_noRefCount_25_0= RULE_BOOL ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'effectFile' otherlv_27= '=' ( (lv_effectFile_28_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'transparencecheck' otherlv_30= '=' ( (lv_transparenceCheck_31_0= RULE_BOOL ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'can_be_lowres' otherlv_33= '=' ( (lv_canBeLowres_34_0= RULE_BOOL ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'clicksound' otherlv_36= '=' ( (lv_clickSound_37_0= RULE_ID ) ) ) ) ) ) )+ {...}?) ) ) otherlv_38= '}' )
            // InternalCk2Gfx.g:570:3: (otherlv_0= 'spriteType' | otherlv_1= 'textSpriteType' ) otherlv_2= '=' otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_name_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'texturefile' | otherlv_9= 'textureFile' ) otherlv_10= '=' ( (lv_textureFile_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_12= 'noOfFrames' | otherlv_13= 'noOfframes' ) otherlv_14= '=' ( (lv_noOfFrames_15_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'loadType' otherlv_17= '=' ( (lv_loadType_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'allwaystransparent' otherlv_20= '=' ( (lv_allwaysTransparent_21_0= RULE_BOOL ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_22= 'noRefCount' | otherlv_23= 'norefcount' ) otherlv_24= '=' ( (lv_noRefCount_25_0= RULE_BOOL ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'effectFile' otherlv_27= '=' ( (lv_effectFile_28_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'transparencecheck' otherlv_30= '=' ( (lv_transparenceCheck_31_0= RULE_BOOL ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'can_be_lowres' otherlv_33= '=' ( (lv_canBeLowres_34_0= RULE_BOOL ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'clicksound' otherlv_36= '=' ( (lv_clickSound_37_0= RULE_ID ) ) ) ) ) ) )+ {...}?) ) ) otherlv_38= '}'
            {
            // InternalCk2Gfx.g:570:3: (otherlv_0= 'spriteType' | otherlv_1= 'textSpriteType' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            else if ( (LA5_0==22) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalCk2Gfx.g:571:4: otherlv_0= 'spriteType'
                    {
                    otherlv_0=(Token)match(input,21,FOLLOW_8); 

                    				newLeafNode(otherlv_0, grammarAccess.getSpriteTypeAccess().getSpriteTypeKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalCk2Gfx.g:576:4: otherlv_1= 'textSpriteType'
                    {
                    otherlv_1=(Token)match(input,22,FOLLOW_8); 

                    				newLeafNode(otherlv_1, grammarAccess.getSpriteTypeAccess().getTextSpriteTypeKeyword_0_1());
                    			

                    }
                    break;

            }

            otherlv_2=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getSpriteTypeAccess().getEqualsSignKeyword_1());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getSpriteTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCk2Gfx.g:589:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_name_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'texturefile' | otherlv_9= 'textureFile' ) otherlv_10= '=' ( (lv_textureFile_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_12= 'noOfFrames' | otherlv_13= 'noOfframes' ) otherlv_14= '=' ( (lv_noOfFrames_15_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'loadType' otherlv_17= '=' ( (lv_loadType_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'allwaystransparent' otherlv_20= '=' ( (lv_allwaysTransparent_21_0= RULE_BOOL ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_22= 'noRefCount' | otherlv_23= 'norefcount' ) otherlv_24= '=' ( (lv_noRefCount_25_0= RULE_BOOL ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'effectFile' otherlv_27= '=' ( (lv_effectFile_28_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'transparencecheck' otherlv_30= '=' ( (lv_transparenceCheck_31_0= RULE_BOOL ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'can_be_lowres' otherlv_33= '=' ( (lv_canBeLowres_34_0= RULE_BOOL ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'clicksound' otherlv_36= '=' ( (lv_clickSound_37_0= RULE_ID ) ) ) ) ) ) )+ {...}?) ) )
            // InternalCk2Gfx.g:590:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_name_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'texturefile' | otherlv_9= 'textureFile' ) otherlv_10= '=' ( (lv_textureFile_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_12= 'noOfFrames' | otherlv_13= 'noOfframes' ) otherlv_14= '=' ( (lv_noOfFrames_15_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'loadType' otherlv_17= '=' ( (lv_loadType_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'allwaystransparent' otherlv_20= '=' ( (lv_allwaysTransparent_21_0= RULE_BOOL ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_22= 'noRefCount' | otherlv_23= 'norefcount' ) otherlv_24= '=' ( (lv_noRefCount_25_0= RULE_BOOL ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'effectFile' otherlv_27= '=' ( (lv_effectFile_28_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'transparencecheck' otherlv_30= '=' ( (lv_transparenceCheck_31_0= RULE_BOOL ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'can_be_lowres' otherlv_33= '=' ( (lv_canBeLowres_34_0= RULE_BOOL ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'clicksound' otherlv_36= '=' ( (lv_clickSound_37_0= RULE_ID ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalCk2Gfx.g:590:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_name_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'texturefile' | otherlv_9= 'textureFile' ) otherlv_10= '=' ( (lv_textureFile_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_12= 'noOfFrames' | otherlv_13= 'noOfframes' ) otherlv_14= '=' ( (lv_noOfFrames_15_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'loadType' otherlv_17= '=' ( (lv_loadType_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'allwaystransparent' otherlv_20= '=' ( (lv_allwaysTransparent_21_0= RULE_BOOL ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_22= 'noRefCount' | otherlv_23= 'norefcount' ) otherlv_24= '=' ( (lv_noRefCount_25_0= RULE_BOOL ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'effectFile' otherlv_27= '=' ( (lv_effectFile_28_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'transparencecheck' otherlv_30= '=' ( (lv_transparenceCheck_31_0= RULE_BOOL ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'can_be_lowres' otherlv_33= '=' ( (lv_canBeLowres_34_0= RULE_BOOL ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'clicksound' otherlv_36= '=' ( (lv_clickSound_37_0= RULE_ID ) ) ) ) ) ) )+ {...}?) )
            // InternalCk2Gfx.g:591:5: ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_name_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'texturefile' | otherlv_9= 'textureFile' ) otherlv_10= '=' ( (lv_textureFile_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_12= 'noOfFrames' | otherlv_13= 'noOfframes' ) otherlv_14= '=' ( (lv_noOfFrames_15_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'loadType' otherlv_17= '=' ( (lv_loadType_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'allwaystransparent' otherlv_20= '=' ( (lv_allwaysTransparent_21_0= RULE_BOOL ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_22= 'noRefCount' | otherlv_23= 'norefcount' ) otherlv_24= '=' ( (lv_noRefCount_25_0= RULE_BOOL ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'effectFile' otherlv_27= '=' ( (lv_effectFile_28_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'transparencecheck' otherlv_30= '=' ( (lv_transparenceCheck_31_0= RULE_BOOL ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'can_be_lowres' otherlv_33= '=' ( (lv_canBeLowres_34_0= RULE_BOOL ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'clicksound' otherlv_36= '=' ( (lv_clickSound_37_0= RULE_ID ) ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getSpriteTypeAccess().getUnorderedGroup_3());
            				
            // InternalCk2Gfx.g:594:5: ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_name_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'texturefile' | otherlv_9= 'textureFile' ) otherlv_10= '=' ( (lv_textureFile_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_12= 'noOfFrames' | otherlv_13= 'noOfframes' ) otherlv_14= '=' ( (lv_noOfFrames_15_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'loadType' otherlv_17= '=' ( (lv_loadType_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'allwaystransparent' otherlv_20= '=' ( (lv_allwaysTransparent_21_0= RULE_BOOL ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_22= 'noRefCount' | otherlv_23= 'norefcount' ) otherlv_24= '=' ( (lv_noRefCount_25_0= RULE_BOOL ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'effectFile' otherlv_27= '=' ( (lv_effectFile_28_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'transparencecheck' otherlv_30= '=' ( (lv_transparenceCheck_31_0= RULE_BOOL ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'can_be_lowres' otherlv_33= '=' ( (lv_canBeLowres_34_0= RULE_BOOL ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'clicksound' otherlv_36= '=' ( (lv_clickSound_37_0= RULE_ID ) ) ) ) ) ) )+ {...}?)
            // InternalCk2Gfx.g:595:6: ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_name_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'texturefile' | otherlv_9= 'textureFile' ) otherlv_10= '=' ( (lv_textureFile_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_12= 'noOfFrames' | otherlv_13= 'noOfframes' ) otherlv_14= '=' ( (lv_noOfFrames_15_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'loadType' otherlv_17= '=' ( (lv_loadType_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'allwaystransparent' otherlv_20= '=' ( (lv_allwaysTransparent_21_0= RULE_BOOL ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_22= 'noRefCount' | otherlv_23= 'norefcount' ) otherlv_24= '=' ( (lv_noRefCount_25_0= RULE_BOOL ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'effectFile' otherlv_27= '=' ( (lv_effectFile_28_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'transparencecheck' otherlv_30= '=' ( (lv_transparenceCheck_31_0= RULE_BOOL ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'can_be_lowres' otherlv_33= '=' ( (lv_canBeLowres_34_0= RULE_BOOL ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'clicksound' otherlv_36= '=' ( (lv_clickSound_37_0= RULE_ID ) ) ) ) ) ) )+ {...}?
            {
            // InternalCk2Gfx.g:595:6: ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_name_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'texturefile' | otherlv_9= 'textureFile' ) otherlv_10= '=' ( (lv_textureFile_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_12= 'noOfFrames' | otherlv_13= 'noOfframes' ) otherlv_14= '=' ( (lv_noOfFrames_15_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'loadType' otherlv_17= '=' ( (lv_loadType_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'allwaystransparent' otherlv_20= '=' ( (lv_allwaysTransparent_21_0= RULE_BOOL ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_22= 'noRefCount' | otherlv_23= 'norefcount' ) otherlv_24= '=' ( (lv_noRefCount_25_0= RULE_BOOL ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'effectFile' otherlv_27= '=' ( (lv_effectFile_28_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'transparencecheck' otherlv_30= '=' ( (lv_transparenceCheck_31_0= RULE_BOOL ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'can_be_lowres' otherlv_33= '=' ( (lv_canBeLowres_34_0= RULE_BOOL ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'clicksound' otherlv_36= '=' ( (lv_clickSound_37_0= RULE_ID ) ) ) ) ) ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=11;
                alt9 = dfa9.predict(input);
                switch (alt9) {
            	case 1 :
            	    // InternalCk2Gfx.g:596:4: ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_name_7_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalCk2Gfx.g:596:4: ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_name_7_0= RULE_STRING ) ) ) ) ) )
            	    // InternalCk2Gfx.g:597:5: {...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_name_7_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSpriteTypeAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleSpriteType", "getUnorderedGroupHelper().canSelect(grammarAccess.getSpriteTypeAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalCk2Gfx.g:597:107: ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_name_7_0= RULE_STRING ) ) ) ) )
            	    // InternalCk2Gfx.g:598:6: ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_name_7_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSpriteTypeAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalCk2Gfx.g:601:9: ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_name_7_0= RULE_STRING ) ) ) )
            	    // InternalCk2Gfx.g:601:10: {...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_name_7_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSpriteType", "true");
            	    }
            	    // InternalCk2Gfx.g:601:19: (otherlv_5= 'name' otherlv_6= '=' ( (lv_name_7_0= RULE_STRING ) ) )
            	    // InternalCk2Gfx.g:601:20: otherlv_5= 'name' otherlv_6= '=' ( (lv_name_7_0= RULE_STRING ) )
            	    {
            	    otherlv_5=(Token)match(input,23,FOLLOW_8); 

            	    									newLeafNode(otherlv_5, grammarAccess.getSpriteTypeAccess().getNameKeyword_3_0_0());
            	    								
            	    otherlv_6=(Token)match(input,18,FOLLOW_13); 

            	    									newLeafNode(otherlv_6, grammarAccess.getSpriteTypeAccess().getEqualsSignKeyword_3_0_1());
            	    								
            	    // InternalCk2Gfx.g:609:9: ( (lv_name_7_0= RULE_STRING ) )
            	    // InternalCk2Gfx.g:610:10: (lv_name_7_0= RULE_STRING )
            	    {
            	    // InternalCk2Gfx.g:610:10: (lv_name_7_0= RULE_STRING )
            	    // InternalCk2Gfx.g:611:11: lv_name_7_0= RULE_STRING
            	    {
            	    lv_name_7_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

            	    											newLeafNode(lv_name_7_0, grammarAccess.getSpriteTypeAccess().getNameSTRINGTerminalRuleCall_3_0_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getSpriteTypeRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"name",
            	    												lv_name_7_0,
            	    												"ck2xtext.common.Ck2Terminals.STRING");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSpriteTypeAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalCk2Gfx.g:633:4: ({...}? => ( ({...}? => ( (otherlv_8= 'texturefile' | otherlv_9= 'textureFile' ) otherlv_10= '=' ( (lv_textureFile_11_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalCk2Gfx.g:633:4: ({...}? => ( ({...}? => ( (otherlv_8= 'texturefile' | otherlv_9= 'textureFile' ) otherlv_10= '=' ( (lv_textureFile_11_0= RULE_STRING ) ) ) ) ) )
            	    // InternalCk2Gfx.g:634:5: {...}? => ( ({...}? => ( (otherlv_8= 'texturefile' | otherlv_9= 'textureFile' ) otherlv_10= '=' ( (lv_textureFile_11_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSpriteTypeAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleSpriteType", "getUnorderedGroupHelper().canSelect(grammarAccess.getSpriteTypeAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalCk2Gfx.g:634:107: ( ({...}? => ( (otherlv_8= 'texturefile' | otherlv_9= 'textureFile' ) otherlv_10= '=' ( (lv_textureFile_11_0= RULE_STRING ) ) ) ) )
            	    // InternalCk2Gfx.g:635:6: ({...}? => ( (otherlv_8= 'texturefile' | otherlv_9= 'textureFile' ) otherlv_10= '=' ( (lv_textureFile_11_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSpriteTypeAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalCk2Gfx.g:638:9: ({...}? => ( (otherlv_8= 'texturefile' | otherlv_9= 'textureFile' ) otherlv_10= '=' ( (lv_textureFile_11_0= RULE_STRING ) ) ) )
            	    // InternalCk2Gfx.g:638:10: {...}? => ( (otherlv_8= 'texturefile' | otherlv_9= 'textureFile' ) otherlv_10= '=' ( (lv_textureFile_11_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSpriteType", "true");
            	    }
            	    // InternalCk2Gfx.g:638:19: ( (otherlv_8= 'texturefile' | otherlv_9= 'textureFile' ) otherlv_10= '=' ( (lv_textureFile_11_0= RULE_STRING ) ) )
            	    // InternalCk2Gfx.g:638:20: (otherlv_8= 'texturefile' | otherlv_9= 'textureFile' ) otherlv_10= '=' ( (lv_textureFile_11_0= RULE_STRING ) )
            	    {
            	    // InternalCk2Gfx.g:638:20: (otherlv_8= 'texturefile' | otherlv_9= 'textureFile' )
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0==24) ) {
            	        alt6=1;
            	    }
            	    else if ( (LA6_0==25) ) {
            	        alt6=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 6, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // InternalCk2Gfx.g:639:10: otherlv_8= 'texturefile'
            	            {
            	            otherlv_8=(Token)match(input,24,FOLLOW_8); 

            	            										newLeafNode(otherlv_8, grammarAccess.getSpriteTypeAccess().getTexturefileKeyword_3_1_0_0());
            	            									

            	            }
            	            break;
            	        case 2 :
            	            // InternalCk2Gfx.g:644:10: otherlv_9= 'textureFile'
            	            {
            	            otherlv_9=(Token)match(input,25,FOLLOW_8); 

            	            										newLeafNode(otherlv_9, grammarAccess.getSpriteTypeAccess().getTextureFileKeyword_3_1_0_1());
            	            									

            	            }
            	            break;

            	    }

            	    otherlv_10=(Token)match(input,18,FOLLOW_13); 

            	    									newLeafNode(otherlv_10, grammarAccess.getSpriteTypeAccess().getEqualsSignKeyword_3_1_1());
            	    								
            	    // InternalCk2Gfx.g:653:9: ( (lv_textureFile_11_0= RULE_STRING ) )
            	    // InternalCk2Gfx.g:654:10: (lv_textureFile_11_0= RULE_STRING )
            	    {
            	    // InternalCk2Gfx.g:654:10: (lv_textureFile_11_0= RULE_STRING )
            	    // InternalCk2Gfx.g:655:11: lv_textureFile_11_0= RULE_STRING
            	    {
            	    lv_textureFile_11_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

            	    											newLeafNode(lv_textureFile_11_0, grammarAccess.getSpriteTypeAccess().getTextureFileSTRINGTerminalRuleCall_3_1_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getSpriteTypeRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"textureFile",
            	    												lv_textureFile_11_0,
            	    												"ck2xtext.common.Ck2Terminals.STRING");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSpriteTypeAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalCk2Gfx.g:677:4: ({...}? => ( ({...}? => ( (otherlv_12= 'noOfFrames' | otherlv_13= 'noOfframes' ) otherlv_14= '=' ( (lv_noOfFrames_15_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalCk2Gfx.g:677:4: ({...}? => ( ({...}? => ( (otherlv_12= 'noOfFrames' | otherlv_13= 'noOfframes' ) otherlv_14= '=' ( (lv_noOfFrames_15_0= RULE_INT ) ) ) ) ) )
            	    // InternalCk2Gfx.g:678:5: {...}? => ( ({...}? => ( (otherlv_12= 'noOfFrames' | otherlv_13= 'noOfframes' ) otherlv_14= '=' ( (lv_noOfFrames_15_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSpriteTypeAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleSpriteType", "getUnorderedGroupHelper().canSelect(grammarAccess.getSpriteTypeAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalCk2Gfx.g:678:107: ( ({...}? => ( (otherlv_12= 'noOfFrames' | otherlv_13= 'noOfframes' ) otherlv_14= '=' ( (lv_noOfFrames_15_0= RULE_INT ) ) ) ) )
            	    // InternalCk2Gfx.g:679:6: ({...}? => ( (otherlv_12= 'noOfFrames' | otherlv_13= 'noOfframes' ) otherlv_14= '=' ( (lv_noOfFrames_15_0= RULE_INT ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSpriteTypeAccess().getUnorderedGroup_3(), 2);
            	    					
            	    // InternalCk2Gfx.g:682:9: ({...}? => ( (otherlv_12= 'noOfFrames' | otherlv_13= 'noOfframes' ) otherlv_14= '=' ( (lv_noOfFrames_15_0= RULE_INT ) ) ) )
            	    // InternalCk2Gfx.g:682:10: {...}? => ( (otherlv_12= 'noOfFrames' | otherlv_13= 'noOfframes' ) otherlv_14= '=' ( (lv_noOfFrames_15_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSpriteType", "true");
            	    }
            	    // InternalCk2Gfx.g:682:19: ( (otherlv_12= 'noOfFrames' | otherlv_13= 'noOfframes' ) otherlv_14= '=' ( (lv_noOfFrames_15_0= RULE_INT ) ) )
            	    // InternalCk2Gfx.g:682:20: (otherlv_12= 'noOfFrames' | otherlv_13= 'noOfframes' ) otherlv_14= '=' ( (lv_noOfFrames_15_0= RULE_INT ) )
            	    {
            	    // InternalCk2Gfx.g:682:20: (otherlv_12= 'noOfFrames' | otherlv_13= 'noOfframes' )
            	    int alt7=2;
            	    int LA7_0 = input.LA(1);

            	    if ( (LA7_0==26) ) {
            	        alt7=1;
            	    }
            	    else if ( (LA7_0==27) ) {
            	        alt7=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 7, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt7) {
            	        case 1 :
            	            // InternalCk2Gfx.g:683:10: otherlv_12= 'noOfFrames'
            	            {
            	            otherlv_12=(Token)match(input,26,FOLLOW_8); 

            	            										newLeafNode(otherlv_12, grammarAccess.getSpriteTypeAccess().getNoOfFramesKeyword_3_2_0_0());
            	            									

            	            }
            	            break;
            	        case 2 :
            	            // InternalCk2Gfx.g:688:10: otherlv_13= 'noOfframes'
            	            {
            	            otherlv_13=(Token)match(input,27,FOLLOW_8); 

            	            										newLeafNode(otherlv_13, grammarAccess.getSpriteTypeAccess().getNoOfframesKeyword_3_2_0_1());
            	            									

            	            }
            	            break;

            	    }

            	    otherlv_14=(Token)match(input,18,FOLLOW_4); 

            	    									newLeafNode(otherlv_14, grammarAccess.getSpriteTypeAccess().getEqualsSignKeyword_3_2_1());
            	    								
            	    // InternalCk2Gfx.g:697:9: ( (lv_noOfFrames_15_0= RULE_INT ) )
            	    // InternalCk2Gfx.g:698:10: (lv_noOfFrames_15_0= RULE_INT )
            	    {
            	    // InternalCk2Gfx.g:698:10: (lv_noOfFrames_15_0= RULE_INT )
            	    // InternalCk2Gfx.g:699:11: lv_noOfFrames_15_0= RULE_INT
            	    {
            	    lv_noOfFrames_15_0=(Token)match(input,RULE_INT,FOLLOW_14); 

            	    											newLeafNode(lv_noOfFrames_15_0, grammarAccess.getSpriteTypeAccess().getNoOfFramesINTTerminalRuleCall_3_2_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getSpriteTypeRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"noOfFrames",
            	    												lv_noOfFrames_15_0,
            	    												"ck2xtext.common.Ck2Terminals.INT");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSpriteTypeAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalCk2Gfx.g:721:4: ({...}? => ( ({...}? => (otherlv_16= 'loadType' otherlv_17= '=' ( (lv_loadType_18_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalCk2Gfx.g:721:4: ({...}? => ( ({...}? => (otherlv_16= 'loadType' otherlv_17= '=' ( (lv_loadType_18_0= RULE_STRING ) ) ) ) ) )
            	    // InternalCk2Gfx.g:722:5: {...}? => ( ({...}? => (otherlv_16= 'loadType' otherlv_17= '=' ( (lv_loadType_18_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSpriteTypeAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleSpriteType", "getUnorderedGroupHelper().canSelect(grammarAccess.getSpriteTypeAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // InternalCk2Gfx.g:722:107: ( ({...}? => (otherlv_16= 'loadType' otherlv_17= '=' ( (lv_loadType_18_0= RULE_STRING ) ) ) ) )
            	    // InternalCk2Gfx.g:723:6: ({...}? => (otherlv_16= 'loadType' otherlv_17= '=' ( (lv_loadType_18_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSpriteTypeAccess().getUnorderedGroup_3(), 3);
            	    					
            	    // InternalCk2Gfx.g:726:9: ({...}? => (otherlv_16= 'loadType' otherlv_17= '=' ( (lv_loadType_18_0= RULE_STRING ) ) ) )
            	    // InternalCk2Gfx.g:726:10: {...}? => (otherlv_16= 'loadType' otherlv_17= '=' ( (lv_loadType_18_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSpriteType", "true");
            	    }
            	    // InternalCk2Gfx.g:726:19: (otherlv_16= 'loadType' otherlv_17= '=' ( (lv_loadType_18_0= RULE_STRING ) ) )
            	    // InternalCk2Gfx.g:726:20: otherlv_16= 'loadType' otherlv_17= '=' ( (lv_loadType_18_0= RULE_STRING ) )
            	    {
            	    otherlv_16=(Token)match(input,28,FOLLOW_8); 

            	    									newLeafNode(otherlv_16, grammarAccess.getSpriteTypeAccess().getLoadTypeKeyword_3_3_0());
            	    								
            	    otherlv_17=(Token)match(input,18,FOLLOW_13); 

            	    									newLeafNode(otherlv_17, grammarAccess.getSpriteTypeAccess().getEqualsSignKeyword_3_3_1());
            	    								
            	    // InternalCk2Gfx.g:734:9: ( (lv_loadType_18_0= RULE_STRING ) )
            	    // InternalCk2Gfx.g:735:10: (lv_loadType_18_0= RULE_STRING )
            	    {
            	    // InternalCk2Gfx.g:735:10: (lv_loadType_18_0= RULE_STRING )
            	    // InternalCk2Gfx.g:736:11: lv_loadType_18_0= RULE_STRING
            	    {
            	    lv_loadType_18_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

            	    											newLeafNode(lv_loadType_18_0, grammarAccess.getSpriteTypeAccess().getLoadTypeSTRINGTerminalRuleCall_3_3_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getSpriteTypeRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"loadType",
            	    												lv_loadType_18_0,
            	    												"ck2xtext.common.Ck2Terminals.STRING");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSpriteTypeAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalCk2Gfx.g:758:4: ({...}? => ( ({...}? => (otherlv_19= 'allwaystransparent' otherlv_20= '=' ( (lv_allwaysTransparent_21_0= RULE_BOOL ) ) ) ) ) )
            	    {
            	    // InternalCk2Gfx.g:758:4: ({...}? => ( ({...}? => (otherlv_19= 'allwaystransparent' otherlv_20= '=' ( (lv_allwaysTransparent_21_0= RULE_BOOL ) ) ) ) ) )
            	    // InternalCk2Gfx.g:759:5: {...}? => ( ({...}? => (otherlv_19= 'allwaystransparent' otherlv_20= '=' ( (lv_allwaysTransparent_21_0= RULE_BOOL ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSpriteTypeAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleSpriteType", "getUnorderedGroupHelper().canSelect(grammarAccess.getSpriteTypeAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // InternalCk2Gfx.g:759:107: ( ({...}? => (otherlv_19= 'allwaystransparent' otherlv_20= '=' ( (lv_allwaysTransparent_21_0= RULE_BOOL ) ) ) ) )
            	    // InternalCk2Gfx.g:760:6: ({...}? => (otherlv_19= 'allwaystransparent' otherlv_20= '=' ( (lv_allwaysTransparent_21_0= RULE_BOOL ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSpriteTypeAccess().getUnorderedGroup_3(), 4);
            	    					
            	    // InternalCk2Gfx.g:763:9: ({...}? => (otherlv_19= 'allwaystransparent' otherlv_20= '=' ( (lv_allwaysTransparent_21_0= RULE_BOOL ) ) ) )
            	    // InternalCk2Gfx.g:763:10: {...}? => (otherlv_19= 'allwaystransparent' otherlv_20= '=' ( (lv_allwaysTransparent_21_0= RULE_BOOL ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSpriteType", "true");
            	    }
            	    // InternalCk2Gfx.g:763:19: (otherlv_19= 'allwaystransparent' otherlv_20= '=' ( (lv_allwaysTransparent_21_0= RULE_BOOL ) ) )
            	    // InternalCk2Gfx.g:763:20: otherlv_19= 'allwaystransparent' otherlv_20= '=' ( (lv_allwaysTransparent_21_0= RULE_BOOL ) )
            	    {
            	    otherlv_19=(Token)match(input,29,FOLLOW_8); 

            	    									newLeafNode(otherlv_19, grammarAccess.getSpriteTypeAccess().getAllwaystransparentKeyword_3_4_0());
            	    								
            	    otherlv_20=(Token)match(input,18,FOLLOW_15); 

            	    									newLeafNode(otherlv_20, grammarAccess.getSpriteTypeAccess().getEqualsSignKeyword_3_4_1());
            	    								
            	    // InternalCk2Gfx.g:771:9: ( (lv_allwaysTransparent_21_0= RULE_BOOL ) )
            	    // InternalCk2Gfx.g:772:10: (lv_allwaysTransparent_21_0= RULE_BOOL )
            	    {
            	    // InternalCk2Gfx.g:772:10: (lv_allwaysTransparent_21_0= RULE_BOOL )
            	    // InternalCk2Gfx.g:773:11: lv_allwaysTransparent_21_0= RULE_BOOL
            	    {
            	    lv_allwaysTransparent_21_0=(Token)match(input,RULE_BOOL,FOLLOW_14); 

            	    											newLeafNode(lv_allwaysTransparent_21_0, grammarAccess.getSpriteTypeAccess().getAllwaysTransparentBOOLTerminalRuleCall_3_4_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getSpriteTypeRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"allwaysTransparent",
            	    												lv_allwaysTransparent_21_0,
            	    												"ck2xtext.common.Ck2Terminals.BOOL");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSpriteTypeAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalCk2Gfx.g:795:4: ({...}? => ( ({...}? => ( (otherlv_22= 'noRefCount' | otherlv_23= 'norefcount' ) otherlv_24= '=' ( (lv_noRefCount_25_0= RULE_BOOL ) ) ) ) ) )
            	    {
            	    // InternalCk2Gfx.g:795:4: ({...}? => ( ({...}? => ( (otherlv_22= 'noRefCount' | otherlv_23= 'norefcount' ) otherlv_24= '=' ( (lv_noRefCount_25_0= RULE_BOOL ) ) ) ) ) )
            	    // InternalCk2Gfx.g:796:5: {...}? => ( ({...}? => ( (otherlv_22= 'noRefCount' | otherlv_23= 'norefcount' ) otherlv_24= '=' ( (lv_noRefCount_25_0= RULE_BOOL ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSpriteTypeAccess().getUnorderedGroup_3(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleSpriteType", "getUnorderedGroupHelper().canSelect(grammarAccess.getSpriteTypeAccess().getUnorderedGroup_3(), 5)");
            	    }
            	    // InternalCk2Gfx.g:796:107: ( ({...}? => ( (otherlv_22= 'noRefCount' | otherlv_23= 'norefcount' ) otherlv_24= '=' ( (lv_noRefCount_25_0= RULE_BOOL ) ) ) ) )
            	    // InternalCk2Gfx.g:797:6: ({...}? => ( (otherlv_22= 'noRefCount' | otherlv_23= 'norefcount' ) otherlv_24= '=' ( (lv_noRefCount_25_0= RULE_BOOL ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSpriteTypeAccess().getUnorderedGroup_3(), 5);
            	    					
            	    // InternalCk2Gfx.g:800:9: ({...}? => ( (otherlv_22= 'noRefCount' | otherlv_23= 'norefcount' ) otherlv_24= '=' ( (lv_noRefCount_25_0= RULE_BOOL ) ) ) )
            	    // InternalCk2Gfx.g:800:10: {...}? => ( (otherlv_22= 'noRefCount' | otherlv_23= 'norefcount' ) otherlv_24= '=' ( (lv_noRefCount_25_0= RULE_BOOL ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSpriteType", "true");
            	    }
            	    // InternalCk2Gfx.g:800:19: ( (otherlv_22= 'noRefCount' | otherlv_23= 'norefcount' ) otherlv_24= '=' ( (lv_noRefCount_25_0= RULE_BOOL ) ) )
            	    // InternalCk2Gfx.g:800:20: (otherlv_22= 'noRefCount' | otherlv_23= 'norefcount' ) otherlv_24= '=' ( (lv_noRefCount_25_0= RULE_BOOL ) )
            	    {
            	    // InternalCk2Gfx.g:800:20: (otherlv_22= 'noRefCount' | otherlv_23= 'norefcount' )
            	    int alt8=2;
            	    int LA8_0 = input.LA(1);

            	    if ( (LA8_0==30) ) {
            	        alt8=1;
            	    }
            	    else if ( (LA8_0==31) ) {
            	        alt8=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 8, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt8) {
            	        case 1 :
            	            // InternalCk2Gfx.g:801:10: otherlv_22= 'noRefCount'
            	            {
            	            otherlv_22=(Token)match(input,30,FOLLOW_8); 

            	            										newLeafNode(otherlv_22, grammarAccess.getSpriteTypeAccess().getNoRefCountKeyword_3_5_0_0());
            	            									

            	            }
            	            break;
            	        case 2 :
            	            // InternalCk2Gfx.g:806:10: otherlv_23= 'norefcount'
            	            {
            	            otherlv_23=(Token)match(input,31,FOLLOW_8); 

            	            										newLeafNode(otherlv_23, grammarAccess.getSpriteTypeAccess().getNorefcountKeyword_3_5_0_1());
            	            									

            	            }
            	            break;

            	    }

            	    otherlv_24=(Token)match(input,18,FOLLOW_15); 

            	    									newLeafNode(otherlv_24, grammarAccess.getSpriteTypeAccess().getEqualsSignKeyword_3_5_1());
            	    								
            	    // InternalCk2Gfx.g:815:9: ( (lv_noRefCount_25_0= RULE_BOOL ) )
            	    // InternalCk2Gfx.g:816:10: (lv_noRefCount_25_0= RULE_BOOL )
            	    {
            	    // InternalCk2Gfx.g:816:10: (lv_noRefCount_25_0= RULE_BOOL )
            	    // InternalCk2Gfx.g:817:11: lv_noRefCount_25_0= RULE_BOOL
            	    {
            	    lv_noRefCount_25_0=(Token)match(input,RULE_BOOL,FOLLOW_14); 

            	    											newLeafNode(lv_noRefCount_25_0, grammarAccess.getSpriteTypeAccess().getNoRefCountBOOLTerminalRuleCall_3_5_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getSpriteTypeRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"noRefCount",
            	    												lv_noRefCount_25_0,
            	    												"ck2xtext.common.Ck2Terminals.BOOL");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSpriteTypeAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalCk2Gfx.g:839:4: ({...}? => ( ({...}? => (otherlv_26= 'effectFile' otherlv_27= '=' ( (lv_effectFile_28_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalCk2Gfx.g:839:4: ({...}? => ( ({...}? => (otherlv_26= 'effectFile' otherlv_27= '=' ( (lv_effectFile_28_0= RULE_STRING ) ) ) ) ) )
            	    // InternalCk2Gfx.g:840:5: {...}? => ( ({...}? => (otherlv_26= 'effectFile' otherlv_27= '=' ( (lv_effectFile_28_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSpriteTypeAccess().getUnorderedGroup_3(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleSpriteType", "getUnorderedGroupHelper().canSelect(grammarAccess.getSpriteTypeAccess().getUnorderedGroup_3(), 6)");
            	    }
            	    // InternalCk2Gfx.g:840:107: ( ({...}? => (otherlv_26= 'effectFile' otherlv_27= '=' ( (lv_effectFile_28_0= RULE_STRING ) ) ) ) )
            	    // InternalCk2Gfx.g:841:6: ({...}? => (otherlv_26= 'effectFile' otherlv_27= '=' ( (lv_effectFile_28_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSpriteTypeAccess().getUnorderedGroup_3(), 6);
            	    					
            	    // InternalCk2Gfx.g:844:9: ({...}? => (otherlv_26= 'effectFile' otherlv_27= '=' ( (lv_effectFile_28_0= RULE_STRING ) ) ) )
            	    // InternalCk2Gfx.g:844:10: {...}? => (otherlv_26= 'effectFile' otherlv_27= '=' ( (lv_effectFile_28_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSpriteType", "true");
            	    }
            	    // InternalCk2Gfx.g:844:19: (otherlv_26= 'effectFile' otherlv_27= '=' ( (lv_effectFile_28_0= RULE_STRING ) ) )
            	    // InternalCk2Gfx.g:844:20: otherlv_26= 'effectFile' otherlv_27= '=' ( (lv_effectFile_28_0= RULE_STRING ) )
            	    {
            	    otherlv_26=(Token)match(input,32,FOLLOW_8); 

            	    									newLeafNode(otherlv_26, grammarAccess.getSpriteTypeAccess().getEffectFileKeyword_3_6_0());
            	    								
            	    otherlv_27=(Token)match(input,18,FOLLOW_13); 

            	    									newLeafNode(otherlv_27, grammarAccess.getSpriteTypeAccess().getEqualsSignKeyword_3_6_1());
            	    								
            	    // InternalCk2Gfx.g:852:9: ( (lv_effectFile_28_0= RULE_STRING ) )
            	    // InternalCk2Gfx.g:853:10: (lv_effectFile_28_0= RULE_STRING )
            	    {
            	    // InternalCk2Gfx.g:853:10: (lv_effectFile_28_0= RULE_STRING )
            	    // InternalCk2Gfx.g:854:11: lv_effectFile_28_0= RULE_STRING
            	    {
            	    lv_effectFile_28_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

            	    											newLeafNode(lv_effectFile_28_0, grammarAccess.getSpriteTypeAccess().getEffectFileSTRINGTerminalRuleCall_3_6_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getSpriteTypeRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"effectFile",
            	    												lv_effectFile_28_0,
            	    												"ck2xtext.common.Ck2Terminals.STRING");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSpriteTypeAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // InternalCk2Gfx.g:876:4: ({...}? => ( ({...}? => (otherlv_29= 'transparencecheck' otherlv_30= '=' ( (lv_transparenceCheck_31_0= RULE_BOOL ) ) ) ) ) )
            	    {
            	    // InternalCk2Gfx.g:876:4: ({...}? => ( ({...}? => (otherlv_29= 'transparencecheck' otherlv_30= '=' ( (lv_transparenceCheck_31_0= RULE_BOOL ) ) ) ) ) )
            	    // InternalCk2Gfx.g:877:5: {...}? => ( ({...}? => (otherlv_29= 'transparencecheck' otherlv_30= '=' ( (lv_transparenceCheck_31_0= RULE_BOOL ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSpriteTypeAccess().getUnorderedGroup_3(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleSpriteType", "getUnorderedGroupHelper().canSelect(grammarAccess.getSpriteTypeAccess().getUnorderedGroup_3(), 7)");
            	    }
            	    // InternalCk2Gfx.g:877:107: ( ({...}? => (otherlv_29= 'transparencecheck' otherlv_30= '=' ( (lv_transparenceCheck_31_0= RULE_BOOL ) ) ) ) )
            	    // InternalCk2Gfx.g:878:6: ({...}? => (otherlv_29= 'transparencecheck' otherlv_30= '=' ( (lv_transparenceCheck_31_0= RULE_BOOL ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSpriteTypeAccess().getUnorderedGroup_3(), 7);
            	    					
            	    // InternalCk2Gfx.g:881:9: ({...}? => (otherlv_29= 'transparencecheck' otherlv_30= '=' ( (lv_transparenceCheck_31_0= RULE_BOOL ) ) ) )
            	    // InternalCk2Gfx.g:881:10: {...}? => (otherlv_29= 'transparencecheck' otherlv_30= '=' ( (lv_transparenceCheck_31_0= RULE_BOOL ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSpriteType", "true");
            	    }
            	    // InternalCk2Gfx.g:881:19: (otherlv_29= 'transparencecheck' otherlv_30= '=' ( (lv_transparenceCheck_31_0= RULE_BOOL ) ) )
            	    // InternalCk2Gfx.g:881:20: otherlv_29= 'transparencecheck' otherlv_30= '=' ( (lv_transparenceCheck_31_0= RULE_BOOL ) )
            	    {
            	    otherlv_29=(Token)match(input,33,FOLLOW_8); 

            	    									newLeafNode(otherlv_29, grammarAccess.getSpriteTypeAccess().getTransparencecheckKeyword_3_7_0());
            	    								
            	    otherlv_30=(Token)match(input,18,FOLLOW_15); 

            	    									newLeafNode(otherlv_30, grammarAccess.getSpriteTypeAccess().getEqualsSignKeyword_3_7_1());
            	    								
            	    // InternalCk2Gfx.g:889:9: ( (lv_transparenceCheck_31_0= RULE_BOOL ) )
            	    // InternalCk2Gfx.g:890:10: (lv_transparenceCheck_31_0= RULE_BOOL )
            	    {
            	    // InternalCk2Gfx.g:890:10: (lv_transparenceCheck_31_0= RULE_BOOL )
            	    // InternalCk2Gfx.g:891:11: lv_transparenceCheck_31_0= RULE_BOOL
            	    {
            	    lv_transparenceCheck_31_0=(Token)match(input,RULE_BOOL,FOLLOW_14); 

            	    											newLeafNode(lv_transparenceCheck_31_0, grammarAccess.getSpriteTypeAccess().getTransparenceCheckBOOLTerminalRuleCall_3_7_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getSpriteTypeRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"transparenceCheck",
            	    												lv_transparenceCheck_31_0,
            	    												"ck2xtext.common.Ck2Terminals.BOOL");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSpriteTypeAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // InternalCk2Gfx.g:913:4: ({...}? => ( ({...}? => (otherlv_32= 'can_be_lowres' otherlv_33= '=' ( (lv_canBeLowres_34_0= RULE_BOOL ) ) ) ) ) )
            	    {
            	    // InternalCk2Gfx.g:913:4: ({...}? => ( ({...}? => (otherlv_32= 'can_be_lowres' otherlv_33= '=' ( (lv_canBeLowres_34_0= RULE_BOOL ) ) ) ) ) )
            	    // InternalCk2Gfx.g:914:5: {...}? => ( ({...}? => (otherlv_32= 'can_be_lowres' otherlv_33= '=' ( (lv_canBeLowres_34_0= RULE_BOOL ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSpriteTypeAccess().getUnorderedGroup_3(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleSpriteType", "getUnorderedGroupHelper().canSelect(grammarAccess.getSpriteTypeAccess().getUnorderedGroup_3(), 8)");
            	    }
            	    // InternalCk2Gfx.g:914:107: ( ({...}? => (otherlv_32= 'can_be_lowres' otherlv_33= '=' ( (lv_canBeLowres_34_0= RULE_BOOL ) ) ) ) )
            	    // InternalCk2Gfx.g:915:6: ({...}? => (otherlv_32= 'can_be_lowres' otherlv_33= '=' ( (lv_canBeLowres_34_0= RULE_BOOL ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSpriteTypeAccess().getUnorderedGroup_3(), 8);
            	    					
            	    // InternalCk2Gfx.g:918:9: ({...}? => (otherlv_32= 'can_be_lowres' otherlv_33= '=' ( (lv_canBeLowres_34_0= RULE_BOOL ) ) ) )
            	    // InternalCk2Gfx.g:918:10: {...}? => (otherlv_32= 'can_be_lowres' otherlv_33= '=' ( (lv_canBeLowres_34_0= RULE_BOOL ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSpriteType", "true");
            	    }
            	    // InternalCk2Gfx.g:918:19: (otherlv_32= 'can_be_lowres' otherlv_33= '=' ( (lv_canBeLowres_34_0= RULE_BOOL ) ) )
            	    // InternalCk2Gfx.g:918:20: otherlv_32= 'can_be_lowres' otherlv_33= '=' ( (lv_canBeLowres_34_0= RULE_BOOL ) )
            	    {
            	    otherlv_32=(Token)match(input,34,FOLLOW_8); 

            	    									newLeafNode(otherlv_32, grammarAccess.getSpriteTypeAccess().getCan_be_lowresKeyword_3_8_0());
            	    								
            	    otherlv_33=(Token)match(input,18,FOLLOW_15); 

            	    									newLeafNode(otherlv_33, grammarAccess.getSpriteTypeAccess().getEqualsSignKeyword_3_8_1());
            	    								
            	    // InternalCk2Gfx.g:926:9: ( (lv_canBeLowres_34_0= RULE_BOOL ) )
            	    // InternalCk2Gfx.g:927:10: (lv_canBeLowres_34_0= RULE_BOOL )
            	    {
            	    // InternalCk2Gfx.g:927:10: (lv_canBeLowres_34_0= RULE_BOOL )
            	    // InternalCk2Gfx.g:928:11: lv_canBeLowres_34_0= RULE_BOOL
            	    {
            	    lv_canBeLowres_34_0=(Token)match(input,RULE_BOOL,FOLLOW_14); 

            	    											newLeafNode(lv_canBeLowres_34_0, grammarAccess.getSpriteTypeAccess().getCanBeLowresBOOLTerminalRuleCall_3_8_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getSpriteTypeRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"canBeLowres",
            	    												lv_canBeLowres_34_0,
            	    												"ck2xtext.common.Ck2Terminals.BOOL");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSpriteTypeAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 10 :
            	    // InternalCk2Gfx.g:950:4: ({...}? => ( ({...}? => (otherlv_35= 'clicksound' otherlv_36= '=' ( (lv_clickSound_37_0= RULE_ID ) ) ) ) ) )
            	    {
            	    // InternalCk2Gfx.g:950:4: ({...}? => ( ({...}? => (otherlv_35= 'clicksound' otherlv_36= '=' ( (lv_clickSound_37_0= RULE_ID ) ) ) ) ) )
            	    // InternalCk2Gfx.g:951:5: {...}? => ( ({...}? => (otherlv_35= 'clicksound' otherlv_36= '=' ( (lv_clickSound_37_0= RULE_ID ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSpriteTypeAccess().getUnorderedGroup_3(), 9) ) {
            	        throw new FailedPredicateException(input, "ruleSpriteType", "getUnorderedGroupHelper().canSelect(grammarAccess.getSpriteTypeAccess().getUnorderedGroup_3(), 9)");
            	    }
            	    // InternalCk2Gfx.g:951:107: ( ({...}? => (otherlv_35= 'clicksound' otherlv_36= '=' ( (lv_clickSound_37_0= RULE_ID ) ) ) ) )
            	    // InternalCk2Gfx.g:952:6: ({...}? => (otherlv_35= 'clicksound' otherlv_36= '=' ( (lv_clickSound_37_0= RULE_ID ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSpriteTypeAccess().getUnorderedGroup_3(), 9);
            	    					
            	    // InternalCk2Gfx.g:955:9: ({...}? => (otherlv_35= 'clicksound' otherlv_36= '=' ( (lv_clickSound_37_0= RULE_ID ) ) ) )
            	    // InternalCk2Gfx.g:955:10: {...}? => (otherlv_35= 'clicksound' otherlv_36= '=' ( (lv_clickSound_37_0= RULE_ID ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSpriteType", "true");
            	    }
            	    // InternalCk2Gfx.g:955:19: (otherlv_35= 'clicksound' otherlv_36= '=' ( (lv_clickSound_37_0= RULE_ID ) ) )
            	    // InternalCk2Gfx.g:955:20: otherlv_35= 'clicksound' otherlv_36= '=' ( (lv_clickSound_37_0= RULE_ID ) )
            	    {
            	    otherlv_35=(Token)match(input,35,FOLLOW_8); 

            	    									newLeafNode(otherlv_35, grammarAccess.getSpriteTypeAccess().getClicksoundKeyword_3_9_0());
            	    								
            	    otherlv_36=(Token)match(input,18,FOLLOW_16); 

            	    									newLeafNode(otherlv_36, grammarAccess.getSpriteTypeAccess().getEqualsSignKeyword_3_9_1());
            	    								
            	    // InternalCk2Gfx.g:963:9: ( (lv_clickSound_37_0= RULE_ID ) )
            	    // InternalCk2Gfx.g:964:10: (lv_clickSound_37_0= RULE_ID )
            	    {
            	    // InternalCk2Gfx.g:964:10: (lv_clickSound_37_0= RULE_ID )
            	    // InternalCk2Gfx.g:965:11: lv_clickSound_37_0= RULE_ID
            	    {
            	    lv_clickSound_37_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            	    											newLeafNode(lv_clickSound_37_0, grammarAccess.getSpriteTypeAccess().getClickSoundIDTerminalRuleCall_3_9_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getSpriteTypeRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"clickSound",
            	    												lv_clickSound_37_0,
            	    												"ck2xtext.common.Ck2Terminals.ID");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSpriteTypeAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getSpriteTypeAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "ruleSpriteType", "getUnorderedGroupHelper().canLeave(grammarAccess.getSpriteTypeAccess().getUnorderedGroup_3())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getSpriteTypeAccess().getUnorderedGroup_3());
            				

            }

            otherlv_38=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_38, grammarAccess.getSpriteTypeAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleSpriteType"


    // $ANTLR start "entryRuleAnimatedSpriteType"
    // InternalCk2Gfx.g:1003:1: entryRuleAnimatedSpriteType returns [EObject current=null] : iv_ruleAnimatedSpriteType= ruleAnimatedSpriteType EOF ;
    public final EObject entryRuleAnimatedSpriteType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnimatedSpriteType = null;


        try {
            // InternalCk2Gfx.g:1003:59: (iv_ruleAnimatedSpriteType= ruleAnimatedSpriteType EOF )
            // InternalCk2Gfx.g:1004:2: iv_ruleAnimatedSpriteType= ruleAnimatedSpriteType EOF
            {
             newCompositeNode(grammarAccess.getAnimatedSpriteTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnimatedSpriteType=ruleAnimatedSpriteType();

            state._fsp--;

             current =iv_ruleAnimatedSpriteType; 
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
    // $ANTLR end "entryRuleAnimatedSpriteType"


    // $ANTLR start "ruleAnimatedSpriteType"
    // InternalCk2Gfx.g:1010:1: ruleAnimatedSpriteType returns [EObject current=null] : (otherlv_0= 'frameAnimatedSpriteType' otherlv_1= '=' otherlv_2= '{' otherlv_3= 'name' otherlv_4= '=' ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= 'texturefile' otherlv_7= '=' ( (lv_texturefile_8_0= RULE_STRING ) ) otherlv_9= 'noOfFrames' otherlv_10= '=' ( (lv_noOfFrames_11_0= RULE_INT ) ) otherlv_12= 'animation_rate_fps' otherlv_13= '=' ( (lv_animationRateFps_14_0= ruleNumber ) ) otherlv_15= 'looping' otherlv_16= '=' ( (lv_looping_17_0= RULE_BOOL ) ) otherlv_18= 'play_on_show' otherlv_19= '=' ( (lv_playOnShow_20_0= RULE_BOOL ) ) otherlv_21= '}' ) ;
    public final EObject ruleAnimatedSpriteType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_texturefile_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_noOfFrames_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token lv_looping_17_0=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token lv_playOnShow_20_0=null;
        Token otherlv_21=null;
        AntlrDatatypeRuleToken lv_animationRateFps_14_0 = null;



        	enterRule();

        try {
            // InternalCk2Gfx.g:1016:2: ( (otherlv_0= 'frameAnimatedSpriteType' otherlv_1= '=' otherlv_2= '{' otherlv_3= 'name' otherlv_4= '=' ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= 'texturefile' otherlv_7= '=' ( (lv_texturefile_8_0= RULE_STRING ) ) otherlv_9= 'noOfFrames' otherlv_10= '=' ( (lv_noOfFrames_11_0= RULE_INT ) ) otherlv_12= 'animation_rate_fps' otherlv_13= '=' ( (lv_animationRateFps_14_0= ruleNumber ) ) otherlv_15= 'looping' otherlv_16= '=' ( (lv_looping_17_0= RULE_BOOL ) ) otherlv_18= 'play_on_show' otherlv_19= '=' ( (lv_playOnShow_20_0= RULE_BOOL ) ) otherlv_21= '}' ) )
            // InternalCk2Gfx.g:1017:2: (otherlv_0= 'frameAnimatedSpriteType' otherlv_1= '=' otherlv_2= '{' otherlv_3= 'name' otherlv_4= '=' ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= 'texturefile' otherlv_7= '=' ( (lv_texturefile_8_0= RULE_STRING ) ) otherlv_9= 'noOfFrames' otherlv_10= '=' ( (lv_noOfFrames_11_0= RULE_INT ) ) otherlv_12= 'animation_rate_fps' otherlv_13= '=' ( (lv_animationRateFps_14_0= ruleNumber ) ) otherlv_15= 'looping' otherlv_16= '=' ( (lv_looping_17_0= RULE_BOOL ) ) otherlv_18= 'play_on_show' otherlv_19= '=' ( (lv_playOnShow_20_0= RULE_BOOL ) ) otherlv_21= '}' )
            {
            // InternalCk2Gfx.g:1017:2: (otherlv_0= 'frameAnimatedSpriteType' otherlv_1= '=' otherlv_2= '{' otherlv_3= 'name' otherlv_4= '=' ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= 'texturefile' otherlv_7= '=' ( (lv_texturefile_8_0= RULE_STRING ) ) otherlv_9= 'noOfFrames' otherlv_10= '=' ( (lv_noOfFrames_11_0= RULE_INT ) ) otherlv_12= 'animation_rate_fps' otherlv_13= '=' ( (lv_animationRateFps_14_0= ruleNumber ) ) otherlv_15= 'looping' otherlv_16= '=' ( (lv_looping_17_0= RULE_BOOL ) ) otherlv_18= 'play_on_show' otherlv_19= '=' ( (lv_playOnShow_20_0= RULE_BOOL ) ) otherlv_21= '}' )
            // InternalCk2Gfx.g:1018:3: otherlv_0= 'frameAnimatedSpriteType' otherlv_1= '=' otherlv_2= '{' otherlv_3= 'name' otherlv_4= '=' ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= 'texturefile' otherlv_7= '=' ( (lv_texturefile_8_0= RULE_STRING ) ) otherlv_9= 'noOfFrames' otherlv_10= '=' ( (lv_noOfFrames_11_0= RULE_INT ) ) otherlv_12= 'animation_rate_fps' otherlv_13= '=' ( (lv_animationRateFps_14_0= ruleNumber ) ) otherlv_15= 'looping' otherlv_16= '=' ( (lv_looping_17_0= RULE_BOOL ) ) otherlv_18= 'play_on_show' otherlv_19= '=' ( (lv_playOnShow_20_0= RULE_BOOL ) ) otherlv_21= '}'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getAnimatedSpriteTypeAccess().getFrameAnimatedSpriteTypeKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getAnimatedSpriteTypeAccess().getEqualsSignKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getAnimatedSpriteTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,23,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getAnimatedSpriteTypeAccess().getNameKeyword_3());
            		
            otherlv_4=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getAnimatedSpriteTypeAccess().getEqualsSignKeyword_4());
            		
            // InternalCk2Gfx.g:1038:3: ( (lv_name_5_0= RULE_STRING ) )
            // InternalCk2Gfx.g:1039:4: (lv_name_5_0= RULE_STRING )
            {
            // InternalCk2Gfx.g:1039:4: (lv_name_5_0= RULE_STRING )
            // InternalCk2Gfx.g:1040:5: lv_name_5_0= RULE_STRING
            {
            lv_name_5_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

            					newLeafNode(lv_name_5_0, grammarAccess.getAnimatedSpriteTypeAccess().getNameSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAnimatedSpriteTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_5_0,
            						"ck2xtext.common.Ck2Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,24,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getAnimatedSpriteTypeAccess().getTexturefileKeyword_6());
            		
            otherlv_7=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_7, grammarAccess.getAnimatedSpriteTypeAccess().getEqualsSignKeyword_7());
            		
            // InternalCk2Gfx.g:1064:3: ( (lv_texturefile_8_0= RULE_STRING ) )
            // InternalCk2Gfx.g:1065:4: (lv_texturefile_8_0= RULE_STRING )
            {
            // InternalCk2Gfx.g:1065:4: (lv_texturefile_8_0= RULE_STRING )
            // InternalCk2Gfx.g:1066:5: lv_texturefile_8_0= RULE_STRING
            {
            lv_texturefile_8_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

            					newLeafNode(lv_texturefile_8_0, grammarAccess.getAnimatedSpriteTypeAccess().getTexturefileSTRINGTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAnimatedSpriteTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"texturefile",
            						lv_texturefile_8_0,
            						"ck2xtext.common.Ck2Terminals.STRING");
            				

            }


            }

            otherlv_9=(Token)match(input,26,FOLLOW_8); 

            			newLeafNode(otherlv_9, grammarAccess.getAnimatedSpriteTypeAccess().getNoOfFramesKeyword_9());
            		
            otherlv_10=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_10, grammarAccess.getAnimatedSpriteTypeAccess().getEqualsSignKeyword_10());
            		
            // InternalCk2Gfx.g:1090:3: ( (lv_noOfFrames_11_0= RULE_INT ) )
            // InternalCk2Gfx.g:1091:4: (lv_noOfFrames_11_0= RULE_INT )
            {
            // InternalCk2Gfx.g:1091:4: (lv_noOfFrames_11_0= RULE_INT )
            // InternalCk2Gfx.g:1092:5: lv_noOfFrames_11_0= RULE_INT
            {
            lv_noOfFrames_11_0=(Token)match(input,RULE_INT,FOLLOW_20); 

            					newLeafNode(lv_noOfFrames_11_0, grammarAccess.getAnimatedSpriteTypeAccess().getNoOfFramesINTTerminalRuleCall_11_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAnimatedSpriteTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"noOfFrames",
            						lv_noOfFrames_11_0,
            						"ck2xtext.common.Ck2Terminals.INT");
            				

            }


            }

            otherlv_12=(Token)match(input,37,FOLLOW_8); 

            			newLeafNode(otherlv_12, grammarAccess.getAnimatedSpriteTypeAccess().getAnimation_rate_fpsKeyword_12());
            		
            otherlv_13=(Token)match(input,18,FOLLOW_6); 

            			newLeafNode(otherlv_13, grammarAccess.getAnimatedSpriteTypeAccess().getEqualsSignKeyword_13());
            		
            // InternalCk2Gfx.g:1116:3: ( (lv_animationRateFps_14_0= ruleNumber ) )
            // InternalCk2Gfx.g:1117:4: (lv_animationRateFps_14_0= ruleNumber )
            {
            // InternalCk2Gfx.g:1117:4: (lv_animationRateFps_14_0= ruleNumber )
            // InternalCk2Gfx.g:1118:5: lv_animationRateFps_14_0= ruleNumber
            {

            					newCompositeNode(grammarAccess.getAnimatedSpriteTypeAccess().getAnimationRateFpsNumberParserRuleCall_14_0());
            				
            pushFollow(FOLLOW_21);
            lv_animationRateFps_14_0=ruleNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAnimatedSpriteTypeRule());
            					}
            					set(
            						current,
            						"animationRateFps",
            						lv_animationRateFps_14_0,
            						"ck2xtext.common.Ck2Terminals.Number");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_15=(Token)match(input,38,FOLLOW_8); 

            			newLeafNode(otherlv_15, grammarAccess.getAnimatedSpriteTypeAccess().getLoopingKeyword_15());
            		
            otherlv_16=(Token)match(input,18,FOLLOW_15); 

            			newLeafNode(otherlv_16, grammarAccess.getAnimatedSpriteTypeAccess().getEqualsSignKeyword_16());
            		
            // InternalCk2Gfx.g:1143:3: ( (lv_looping_17_0= RULE_BOOL ) )
            // InternalCk2Gfx.g:1144:4: (lv_looping_17_0= RULE_BOOL )
            {
            // InternalCk2Gfx.g:1144:4: (lv_looping_17_0= RULE_BOOL )
            // InternalCk2Gfx.g:1145:5: lv_looping_17_0= RULE_BOOL
            {
            lv_looping_17_0=(Token)match(input,RULE_BOOL,FOLLOW_22); 

            					newLeafNode(lv_looping_17_0, grammarAccess.getAnimatedSpriteTypeAccess().getLoopingBOOLTerminalRuleCall_17_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAnimatedSpriteTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"looping",
            						lv_looping_17_0,
            						"ck2xtext.common.Ck2Terminals.BOOL");
            				

            }


            }

            otherlv_18=(Token)match(input,39,FOLLOW_8); 

            			newLeafNode(otherlv_18, grammarAccess.getAnimatedSpriteTypeAccess().getPlay_on_showKeyword_18());
            		
            otherlv_19=(Token)match(input,18,FOLLOW_15); 

            			newLeafNode(otherlv_19, grammarAccess.getAnimatedSpriteTypeAccess().getEqualsSignKeyword_19());
            		
            // InternalCk2Gfx.g:1169:3: ( (lv_playOnShow_20_0= RULE_BOOL ) )
            // InternalCk2Gfx.g:1170:4: (lv_playOnShow_20_0= RULE_BOOL )
            {
            // InternalCk2Gfx.g:1170:4: (lv_playOnShow_20_0= RULE_BOOL )
            // InternalCk2Gfx.g:1171:5: lv_playOnShow_20_0= RULE_BOOL
            {
            lv_playOnShow_20_0=(Token)match(input,RULE_BOOL,FOLLOW_5); 

            					newLeafNode(lv_playOnShow_20_0, grammarAccess.getAnimatedSpriteTypeAccess().getPlayOnShowBOOLTerminalRuleCall_20_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAnimatedSpriteTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"playOnShow",
            						lv_playOnShow_20_0,
            						"ck2xtext.common.Ck2Terminals.BOOL");
            				

            }


            }

            otherlv_21=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_21, grammarAccess.getAnimatedSpriteTypeAccess().getRightCurlyBracketKeyword_21());
            		

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
    // $ANTLR end "ruleAnimatedSpriteType"


    // $ANTLR start "entryRuleCorneredTileSpriteType"
    // InternalCk2Gfx.g:1195:1: entryRuleCorneredTileSpriteType returns [EObject current=null] : iv_ruleCorneredTileSpriteType= ruleCorneredTileSpriteType EOF ;
    public final EObject entryRuleCorneredTileSpriteType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCorneredTileSpriteType = null;


        try {
            // InternalCk2Gfx.g:1195:63: (iv_ruleCorneredTileSpriteType= ruleCorneredTileSpriteType EOF )
            // InternalCk2Gfx.g:1196:2: iv_ruleCorneredTileSpriteType= ruleCorneredTileSpriteType EOF
            {
             newCompositeNode(grammarAccess.getCorneredTileSpriteTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCorneredTileSpriteType=ruleCorneredTileSpriteType();

            state._fsp--;

             current =iv_ruleCorneredTileSpriteType; 
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
    // $ANTLR end "entryRuleCorneredTileSpriteType"


    // $ANTLR start "ruleCorneredTileSpriteType"
    // InternalCk2Gfx.g:1202:1: ruleCorneredTileSpriteType returns [EObject current=null] : (otherlv_0= 'corneredTileSpriteType' otherlv_1= '=' otherlv_2= '{' otherlv_3= 'name' otherlv_4= '=' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= 'size' otherlv_7= '=' ( (lv_size_8_0= ruleCoordinates ) ) )? (otherlv_9= 'texturefile' otherlv_10= '=' ( (lv_texturefile_11_0= RULE_STRING ) ) )? (otherlv_12= 'textureFile' otherlv_13= '=' ( (lv_texturefile_14_0= RULE_STRING ) ) )? (otherlv_15= 'borderSize' otherlv_16= '=' ( (lv_borderSize_17_0= ruleCoordinates ) ) )? (otherlv_18= 'allwaystransparent' otherlv_19= '=' ( (lv_allwaysTransparent_20_0= RULE_BOOL ) ) )? (otherlv_21= 'noRefCount' otherlv_22= '=' ( (lv_noRefCount_23_0= RULE_BOOL ) ) )? (otherlv_24= 'loadType' otherlv_25= '=' ( (lv_loadType_26_0= RULE_STRING ) ) )? (otherlv_27= 'tilingCenter' otherlv_28= '=' ( (lv_tilingCenter_29_0= RULE_BOOL ) ) )? otherlv_30= '}' ) ;
    public final EObject ruleCorneredTileSpriteType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_texturefile_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_texturefile_14_0=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token lv_allwaysTransparent_20_0=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token lv_noRefCount_23_0=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token lv_loadType_26_0=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token lv_tilingCenter_29_0=null;
        Token otherlv_30=null;
        EObject lv_size_8_0 = null;

        EObject lv_borderSize_17_0 = null;



        	enterRule();

        try {
            // InternalCk2Gfx.g:1208:2: ( (otherlv_0= 'corneredTileSpriteType' otherlv_1= '=' otherlv_2= '{' otherlv_3= 'name' otherlv_4= '=' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= 'size' otherlv_7= '=' ( (lv_size_8_0= ruleCoordinates ) ) )? (otherlv_9= 'texturefile' otherlv_10= '=' ( (lv_texturefile_11_0= RULE_STRING ) ) )? (otherlv_12= 'textureFile' otherlv_13= '=' ( (lv_texturefile_14_0= RULE_STRING ) ) )? (otherlv_15= 'borderSize' otherlv_16= '=' ( (lv_borderSize_17_0= ruleCoordinates ) ) )? (otherlv_18= 'allwaystransparent' otherlv_19= '=' ( (lv_allwaysTransparent_20_0= RULE_BOOL ) ) )? (otherlv_21= 'noRefCount' otherlv_22= '=' ( (lv_noRefCount_23_0= RULE_BOOL ) ) )? (otherlv_24= 'loadType' otherlv_25= '=' ( (lv_loadType_26_0= RULE_STRING ) ) )? (otherlv_27= 'tilingCenter' otherlv_28= '=' ( (lv_tilingCenter_29_0= RULE_BOOL ) ) )? otherlv_30= '}' ) )
            // InternalCk2Gfx.g:1209:2: (otherlv_0= 'corneredTileSpriteType' otherlv_1= '=' otherlv_2= '{' otherlv_3= 'name' otherlv_4= '=' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= 'size' otherlv_7= '=' ( (lv_size_8_0= ruleCoordinates ) ) )? (otherlv_9= 'texturefile' otherlv_10= '=' ( (lv_texturefile_11_0= RULE_STRING ) ) )? (otherlv_12= 'textureFile' otherlv_13= '=' ( (lv_texturefile_14_0= RULE_STRING ) ) )? (otherlv_15= 'borderSize' otherlv_16= '=' ( (lv_borderSize_17_0= ruleCoordinates ) ) )? (otherlv_18= 'allwaystransparent' otherlv_19= '=' ( (lv_allwaysTransparent_20_0= RULE_BOOL ) ) )? (otherlv_21= 'noRefCount' otherlv_22= '=' ( (lv_noRefCount_23_0= RULE_BOOL ) ) )? (otherlv_24= 'loadType' otherlv_25= '=' ( (lv_loadType_26_0= RULE_STRING ) ) )? (otherlv_27= 'tilingCenter' otherlv_28= '=' ( (lv_tilingCenter_29_0= RULE_BOOL ) ) )? otherlv_30= '}' )
            {
            // InternalCk2Gfx.g:1209:2: (otherlv_0= 'corneredTileSpriteType' otherlv_1= '=' otherlv_2= '{' otherlv_3= 'name' otherlv_4= '=' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= 'size' otherlv_7= '=' ( (lv_size_8_0= ruleCoordinates ) ) )? (otherlv_9= 'texturefile' otherlv_10= '=' ( (lv_texturefile_11_0= RULE_STRING ) ) )? (otherlv_12= 'textureFile' otherlv_13= '=' ( (lv_texturefile_14_0= RULE_STRING ) ) )? (otherlv_15= 'borderSize' otherlv_16= '=' ( (lv_borderSize_17_0= ruleCoordinates ) ) )? (otherlv_18= 'allwaystransparent' otherlv_19= '=' ( (lv_allwaysTransparent_20_0= RULE_BOOL ) ) )? (otherlv_21= 'noRefCount' otherlv_22= '=' ( (lv_noRefCount_23_0= RULE_BOOL ) ) )? (otherlv_24= 'loadType' otherlv_25= '=' ( (lv_loadType_26_0= RULE_STRING ) ) )? (otherlv_27= 'tilingCenter' otherlv_28= '=' ( (lv_tilingCenter_29_0= RULE_BOOL ) ) )? otherlv_30= '}' )
            // InternalCk2Gfx.g:1210:3: otherlv_0= 'corneredTileSpriteType' otherlv_1= '=' otherlv_2= '{' otherlv_3= 'name' otherlv_4= '=' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= 'size' otherlv_7= '=' ( (lv_size_8_0= ruleCoordinates ) ) )? (otherlv_9= 'texturefile' otherlv_10= '=' ( (lv_texturefile_11_0= RULE_STRING ) ) )? (otherlv_12= 'textureFile' otherlv_13= '=' ( (lv_texturefile_14_0= RULE_STRING ) ) )? (otherlv_15= 'borderSize' otherlv_16= '=' ( (lv_borderSize_17_0= ruleCoordinates ) ) )? (otherlv_18= 'allwaystransparent' otherlv_19= '=' ( (lv_allwaysTransparent_20_0= RULE_BOOL ) ) )? (otherlv_21= 'noRefCount' otherlv_22= '=' ( (lv_noRefCount_23_0= RULE_BOOL ) ) )? (otherlv_24= 'loadType' otherlv_25= '=' ( (lv_loadType_26_0= RULE_STRING ) ) )? (otherlv_27= 'tilingCenter' otherlv_28= '=' ( (lv_tilingCenter_29_0= RULE_BOOL ) ) )? otherlv_30= '}'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getCorneredTileSpriteTypeAccess().getCorneredTileSpriteTypeKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getCorneredTileSpriteTypeAccess().getEqualsSignKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getCorneredTileSpriteTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,23,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getCorneredTileSpriteTypeAccess().getNameKeyword_3());
            		
            otherlv_4=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getCorneredTileSpriteTypeAccess().getEqualsSignKeyword_4());
            		
            // InternalCk2Gfx.g:1230:3: ( (lv_name_5_0= RULE_STRING ) )
            // InternalCk2Gfx.g:1231:4: (lv_name_5_0= RULE_STRING )
            {
            // InternalCk2Gfx.g:1231:4: (lv_name_5_0= RULE_STRING )
            // InternalCk2Gfx.g:1232:5: lv_name_5_0= RULE_STRING
            {
            lv_name_5_0=(Token)match(input,RULE_STRING,FOLLOW_23); 

            					newLeafNode(lv_name_5_0, grammarAccess.getCorneredTileSpriteTypeAccess().getNameSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCorneredTileSpriteTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_5_0,
            						"ck2xtext.common.Ck2Terminals.STRING");
            				

            }


            }

            // InternalCk2Gfx.g:1248:3: (otherlv_6= 'size' otherlv_7= '=' ( (lv_size_8_0= ruleCoordinates ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==41) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalCk2Gfx.g:1249:4: otherlv_6= 'size' otherlv_7= '=' ( (lv_size_8_0= ruleCoordinates ) )
                    {
                    otherlv_6=(Token)match(input,41,FOLLOW_8); 

                    				newLeafNode(otherlv_6, grammarAccess.getCorneredTileSpriteTypeAccess().getSizeKeyword_6_0());
                    			
                    otherlv_7=(Token)match(input,18,FOLLOW_10); 

                    				newLeafNode(otherlv_7, grammarAccess.getCorneredTileSpriteTypeAccess().getEqualsSignKeyword_6_1());
                    			
                    // InternalCk2Gfx.g:1257:4: ( (lv_size_8_0= ruleCoordinates ) )
                    // InternalCk2Gfx.g:1258:5: (lv_size_8_0= ruleCoordinates )
                    {
                    // InternalCk2Gfx.g:1258:5: (lv_size_8_0= ruleCoordinates )
                    // InternalCk2Gfx.g:1259:6: lv_size_8_0= ruleCoordinates
                    {

                    						newCompositeNode(grammarAccess.getCorneredTileSpriteTypeAccess().getSizeCoordinatesParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_size_8_0=ruleCoordinates();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCorneredTileSpriteTypeRule());
                    						}
                    						set(
                    							current,
                    							"size",
                    							lv_size_8_0,
                    							"ck2xtext.gfx.Ck2Gfx.Coordinates");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCk2Gfx.g:1277:3: (otherlv_9= 'texturefile' otherlv_10= '=' ( (lv_texturefile_11_0= RULE_STRING ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==24) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalCk2Gfx.g:1278:4: otherlv_9= 'texturefile' otherlv_10= '=' ( (lv_texturefile_11_0= RULE_STRING ) )
                    {
                    otherlv_9=(Token)match(input,24,FOLLOW_8); 

                    				newLeafNode(otherlv_9, grammarAccess.getCorneredTileSpriteTypeAccess().getTexturefileKeyword_7_0());
                    			
                    otherlv_10=(Token)match(input,18,FOLLOW_13); 

                    				newLeafNode(otherlv_10, grammarAccess.getCorneredTileSpriteTypeAccess().getEqualsSignKeyword_7_1());
                    			
                    // InternalCk2Gfx.g:1286:4: ( (lv_texturefile_11_0= RULE_STRING ) )
                    // InternalCk2Gfx.g:1287:5: (lv_texturefile_11_0= RULE_STRING )
                    {
                    // InternalCk2Gfx.g:1287:5: (lv_texturefile_11_0= RULE_STRING )
                    // InternalCk2Gfx.g:1288:6: lv_texturefile_11_0= RULE_STRING
                    {
                    lv_texturefile_11_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

                    						newLeafNode(lv_texturefile_11_0, grammarAccess.getCorneredTileSpriteTypeAccess().getTexturefileSTRINGTerminalRuleCall_7_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCorneredTileSpriteTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"texturefile",
                    							lv_texturefile_11_0,
                    							"ck2xtext.common.Ck2Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCk2Gfx.g:1305:3: (otherlv_12= 'textureFile' otherlv_13= '=' ( (lv_texturefile_14_0= RULE_STRING ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==25) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalCk2Gfx.g:1306:4: otherlv_12= 'textureFile' otherlv_13= '=' ( (lv_texturefile_14_0= RULE_STRING ) )
                    {
                    otherlv_12=(Token)match(input,25,FOLLOW_8); 

                    				newLeafNode(otherlv_12, grammarAccess.getCorneredTileSpriteTypeAccess().getTextureFileKeyword_8_0());
                    			
                    otherlv_13=(Token)match(input,18,FOLLOW_13); 

                    				newLeafNode(otherlv_13, grammarAccess.getCorneredTileSpriteTypeAccess().getEqualsSignKeyword_8_1());
                    			
                    // InternalCk2Gfx.g:1314:4: ( (lv_texturefile_14_0= RULE_STRING ) )
                    // InternalCk2Gfx.g:1315:5: (lv_texturefile_14_0= RULE_STRING )
                    {
                    // InternalCk2Gfx.g:1315:5: (lv_texturefile_14_0= RULE_STRING )
                    // InternalCk2Gfx.g:1316:6: lv_texturefile_14_0= RULE_STRING
                    {
                    lv_texturefile_14_0=(Token)match(input,RULE_STRING,FOLLOW_26); 

                    						newLeafNode(lv_texturefile_14_0, grammarAccess.getCorneredTileSpriteTypeAccess().getTexturefileSTRINGTerminalRuleCall_8_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCorneredTileSpriteTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"texturefile",
                    							lv_texturefile_14_0,
                    							"ck2xtext.common.Ck2Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCk2Gfx.g:1333:3: (otherlv_15= 'borderSize' otherlv_16= '=' ( (lv_borderSize_17_0= ruleCoordinates ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==42) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalCk2Gfx.g:1334:4: otherlv_15= 'borderSize' otherlv_16= '=' ( (lv_borderSize_17_0= ruleCoordinates ) )
                    {
                    otherlv_15=(Token)match(input,42,FOLLOW_8); 

                    				newLeafNode(otherlv_15, grammarAccess.getCorneredTileSpriteTypeAccess().getBorderSizeKeyword_9_0());
                    			
                    otherlv_16=(Token)match(input,18,FOLLOW_10); 

                    				newLeafNode(otherlv_16, grammarAccess.getCorneredTileSpriteTypeAccess().getEqualsSignKeyword_9_1());
                    			
                    // InternalCk2Gfx.g:1342:4: ( (lv_borderSize_17_0= ruleCoordinates ) )
                    // InternalCk2Gfx.g:1343:5: (lv_borderSize_17_0= ruleCoordinates )
                    {
                    // InternalCk2Gfx.g:1343:5: (lv_borderSize_17_0= ruleCoordinates )
                    // InternalCk2Gfx.g:1344:6: lv_borderSize_17_0= ruleCoordinates
                    {

                    						newCompositeNode(grammarAccess.getCorneredTileSpriteTypeAccess().getBorderSizeCoordinatesParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_borderSize_17_0=ruleCoordinates();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCorneredTileSpriteTypeRule());
                    						}
                    						set(
                    							current,
                    							"borderSize",
                    							lv_borderSize_17_0,
                    							"ck2xtext.gfx.Ck2Gfx.Coordinates");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCk2Gfx.g:1362:3: (otherlv_18= 'allwaystransparent' otherlv_19= '=' ( (lv_allwaysTransparent_20_0= RULE_BOOL ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==29) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalCk2Gfx.g:1363:4: otherlv_18= 'allwaystransparent' otherlv_19= '=' ( (lv_allwaysTransparent_20_0= RULE_BOOL ) )
                    {
                    otherlv_18=(Token)match(input,29,FOLLOW_8); 

                    				newLeafNode(otherlv_18, grammarAccess.getCorneredTileSpriteTypeAccess().getAllwaystransparentKeyword_10_0());
                    			
                    otherlv_19=(Token)match(input,18,FOLLOW_15); 

                    				newLeafNode(otherlv_19, grammarAccess.getCorneredTileSpriteTypeAccess().getEqualsSignKeyword_10_1());
                    			
                    // InternalCk2Gfx.g:1371:4: ( (lv_allwaysTransparent_20_0= RULE_BOOL ) )
                    // InternalCk2Gfx.g:1372:5: (lv_allwaysTransparent_20_0= RULE_BOOL )
                    {
                    // InternalCk2Gfx.g:1372:5: (lv_allwaysTransparent_20_0= RULE_BOOL )
                    // InternalCk2Gfx.g:1373:6: lv_allwaysTransparent_20_0= RULE_BOOL
                    {
                    lv_allwaysTransparent_20_0=(Token)match(input,RULE_BOOL,FOLLOW_28); 

                    						newLeafNode(lv_allwaysTransparent_20_0, grammarAccess.getCorneredTileSpriteTypeAccess().getAllwaysTransparentBOOLTerminalRuleCall_10_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCorneredTileSpriteTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"allwaysTransparent",
                    							lv_allwaysTransparent_20_0,
                    							"ck2xtext.common.Ck2Terminals.BOOL");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCk2Gfx.g:1390:3: (otherlv_21= 'noRefCount' otherlv_22= '=' ( (lv_noRefCount_23_0= RULE_BOOL ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==30) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalCk2Gfx.g:1391:4: otherlv_21= 'noRefCount' otherlv_22= '=' ( (lv_noRefCount_23_0= RULE_BOOL ) )
                    {
                    otherlv_21=(Token)match(input,30,FOLLOW_8); 

                    				newLeafNode(otherlv_21, grammarAccess.getCorneredTileSpriteTypeAccess().getNoRefCountKeyword_11_0());
                    			
                    otherlv_22=(Token)match(input,18,FOLLOW_15); 

                    				newLeafNode(otherlv_22, grammarAccess.getCorneredTileSpriteTypeAccess().getEqualsSignKeyword_11_1());
                    			
                    // InternalCk2Gfx.g:1399:4: ( (lv_noRefCount_23_0= RULE_BOOL ) )
                    // InternalCk2Gfx.g:1400:5: (lv_noRefCount_23_0= RULE_BOOL )
                    {
                    // InternalCk2Gfx.g:1400:5: (lv_noRefCount_23_0= RULE_BOOL )
                    // InternalCk2Gfx.g:1401:6: lv_noRefCount_23_0= RULE_BOOL
                    {
                    lv_noRefCount_23_0=(Token)match(input,RULE_BOOL,FOLLOW_29); 

                    						newLeafNode(lv_noRefCount_23_0, grammarAccess.getCorneredTileSpriteTypeAccess().getNoRefCountBOOLTerminalRuleCall_11_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCorneredTileSpriteTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"noRefCount",
                    							lv_noRefCount_23_0,
                    							"ck2xtext.common.Ck2Terminals.BOOL");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCk2Gfx.g:1418:3: (otherlv_24= 'loadType' otherlv_25= '=' ( (lv_loadType_26_0= RULE_STRING ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==28) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalCk2Gfx.g:1419:4: otherlv_24= 'loadType' otherlv_25= '=' ( (lv_loadType_26_0= RULE_STRING ) )
                    {
                    otherlv_24=(Token)match(input,28,FOLLOW_8); 

                    				newLeafNode(otherlv_24, grammarAccess.getCorneredTileSpriteTypeAccess().getLoadTypeKeyword_12_0());
                    			
                    otherlv_25=(Token)match(input,18,FOLLOW_13); 

                    				newLeafNode(otherlv_25, grammarAccess.getCorneredTileSpriteTypeAccess().getEqualsSignKeyword_12_1());
                    			
                    // InternalCk2Gfx.g:1427:4: ( (lv_loadType_26_0= RULE_STRING ) )
                    // InternalCk2Gfx.g:1428:5: (lv_loadType_26_0= RULE_STRING )
                    {
                    // InternalCk2Gfx.g:1428:5: (lv_loadType_26_0= RULE_STRING )
                    // InternalCk2Gfx.g:1429:6: lv_loadType_26_0= RULE_STRING
                    {
                    lv_loadType_26_0=(Token)match(input,RULE_STRING,FOLLOW_30); 

                    						newLeafNode(lv_loadType_26_0, grammarAccess.getCorneredTileSpriteTypeAccess().getLoadTypeSTRINGTerminalRuleCall_12_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCorneredTileSpriteTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"loadType",
                    							lv_loadType_26_0,
                    							"ck2xtext.common.Ck2Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCk2Gfx.g:1446:3: (otherlv_27= 'tilingCenter' otherlv_28= '=' ( (lv_tilingCenter_29_0= RULE_BOOL ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==43) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalCk2Gfx.g:1447:4: otherlv_27= 'tilingCenter' otherlv_28= '=' ( (lv_tilingCenter_29_0= RULE_BOOL ) )
                    {
                    otherlv_27=(Token)match(input,43,FOLLOW_8); 

                    				newLeafNode(otherlv_27, grammarAccess.getCorneredTileSpriteTypeAccess().getTilingCenterKeyword_13_0());
                    			
                    otherlv_28=(Token)match(input,18,FOLLOW_15); 

                    				newLeafNode(otherlv_28, grammarAccess.getCorneredTileSpriteTypeAccess().getEqualsSignKeyword_13_1());
                    			
                    // InternalCk2Gfx.g:1455:4: ( (lv_tilingCenter_29_0= RULE_BOOL ) )
                    // InternalCk2Gfx.g:1456:5: (lv_tilingCenter_29_0= RULE_BOOL )
                    {
                    // InternalCk2Gfx.g:1456:5: (lv_tilingCenter_29_0= RULE_BOOL )
                    // InternalCk2Gfx.g:1457:6: lv_tilingCenter_29_0= RULE_BOOL
                    {
                    lv_tilingCenter_29_0=(Token)match(input,RULE_BOOL,FOLLOW_5); 

                    						newLeafNode(lv_tilingCenter_29_0, grammarAccess.getCorneredTileSpriteTypeAccess().getTilingCenterBOOLTerminalRuleCall_13_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCorneredTileSpriteTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"tilingCenter",
                    							lv_tilingCenter_29_0,
                    							"ck2xtext.common.Ck2Terminals.BOOL");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_30=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_30, grammarAccess.getCorneredTileSpriteTypeAccess().getRightCurlyBracketKeyword_14());
            		

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
    // $ANTLR end "ruleCorneredTileSpriteType"


    // $ANTLR start "entryRuleProgressbarType"
    // InternalCk2Gfx.g:1482:1: entryRuleProgressbarType returns [EObject current=null] : iv_ruleProgressbarType= ruleProgressbarType EOF ;
    public final EObject entryRuleProgressbarType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgressbarType = null;


        try {
            // InternalCk2Gfx.g:1482:56: (iv_ruleProgressbarType= ruleProgressbarType EOF )
            // InternalCk2Gfx.g:1483:2: iv_ruleProgressbarType= ruleProgressbarType EOF
            {
             newCompositeNode(grammarAccess.getProgressbarTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProgressbarType=ruleProgressbarType();

            state._fsp--;

             current =iv_ruleProgressbarType; 
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
    // $ANTLR end "entryRuleProgressbarType"


    // $ANTLR start "ruleProgressbarType"
    // InternalCk2Gfx.g:1489:1: ruleProgressbarType returns [EObject current=null] : (otherlv_0= 'progressbartype' otherlv_1= '=' otherlv_2= '{' otherlv_3= 'name' otherlv_4= '=' ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= 'color' otherlv_7= '=' ( (lv_color_8_0= ruleColorRatio ) ) otherlv_9= 'colortwo' otherlv_10= '=' ( (lv_color2_11_0= ruleColorRatio ) ) (otherlv_12= 'textureFile1' otherlv_13= '=' ( (lv_textureFile1_14_0= RULE_STRING ) ) )? (otherlv_15= 'textureFile2' otherlv_16= '=' ( (lv_textureFile2_17_0= RULE_STRING ) ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_19= 'size' otherlv_20= '=' ( (lv_size_21_0= ruleCoordinates ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'horizontal' otherlv_23= '=' ( (lv_horizontal_24_0= RULE_BOOL ) ) ) ) ) ) )+ {...}?) ) ) otherlv_25= 'effectFile' otherlv_26= '=' ( (lv_effectFile_27_0= RULE_STRING ) ) (otherlv_28= 'allwaystransparent' otherlv_29= '=' ( (lv_allwaysTransparent_30_0= RULE_BOOL ) ) )? (otherlv_31= 'maxValue' otherlv_32= '=' ( (lv_maxValue_33_0= ruleNumber ) ) )? (otherlv_34= 'loadType' otherlv_35= '=' ( (lv_loadType_36_0= RULE_STRING ) ) )? (otherlv_37= 'norefcount' otherlv_38= '=' ( (lv_noRefCount_39_0= RULE_BOOL ) ) )? otherlv_40= '}' ) ;
    public final EObject ruleProgressbarType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_textureFile1_14_0=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token lv_textureFile2_17_0=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token lv_horizontal_24_0=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token lv_effectFile_27_0=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token lv_allwaysTransparent_30_0=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token lv_loadType_36_0=null;
        Token otherlv_37=null;
        Token otherlv_38=null;
        Token lv_noRefCount_39_0=null;
        Token otherlv_40=null;
        EObject lv_color_8_0 = null;

        EObject lv_color2_11_0 = null;

        EObject lv_size_21_0 = null;

        AntlrDatatypeRuleToken lv_maxValue_33_0 = null;



        	enterRule();

        try {
            // InternalCk2Gfx.g:1495:2: ( (otherlv_0= 'progressbartype' otherlv_1= '=' otherlv_2= '{' otherlv_3= 'name' otherlv_4= '=' ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= 'color' otherlv_7= '=' ( (lv_color_8_0= ruleColorRatio ) ) otherlv_9= 'colortwo' otherlv_10= '=' ( (lv_color2_11_0= ruleColorRatio ) ) (otherlv_12= 'textureFile1' otherlv_13= '=' ( (lv_textureFile1_14_0= RULE_STRING ) ) )? (otherlv_15= 'textureFile2' otherlv_16= '=' ( (lv_textureFile2_17_0= RULE_STRING ) ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_19= 'size' otherlv_20= '=' ( (lv_size_21_0= ruleCoordinates ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'horizontal' otherlv_23= '=' ( (lv_horizontal_24_0= RULE_BOOL ) ) ) ) ) ) )+ {...}?) ) ) otherlv_25= 'effectFile' otherlv_26= '=' ( (lv_effectFile_27_0= RULE_STRING ) ) (otherlv_28= 'allwaystransparent' otherlv_29= '=' ( (lv_allwaysTransparent_30_0= RULE_BOOL ) ) )? (otherlv_31= 'maxValue' otherlv_32= '=' ( (lv_maxValue_33_0= ruleNumber ) ) )? (otherlv_34= 'loadType' otherlv_35= '=' ( (lv_loadType_36_0= RULE_STRING ) ) )? (otherlv_37= 'norefcount' otherlv_38= '=' ( (lv_noRefCount_39_0= RULE_BOOL ) ) )? otherlv_40= '}' ) )
            // InternalCk2Gfx.g:1496:2: (otherlv_0= 'progressbartype' otherlv_1= '=' otherlv_2= '{' otherlv_3= 'name' otherlv_4= '=' ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= 'color' otherlv_7= '=' ( (lv_color_8_0= ruleColorRatio ) ) otherlv_9= 'colortwo' otherlv_10= '=' ( (lv_color2_11_0= ruleColorRatio ) ) (otherlv_12= 'textureFile1' otherlv_13= '=' ( (lv_textureFile1_14_0= RULE_STRING ) ) )? (otherlv_15= 'textureFile2' otherlv_16= '=' ( (lv_textureFile2_17_0= RULE_STRING ) ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_19= 'size' otherlv_20= '=' ( (lv_size_21_0= ruleCoordinates ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'horizontal' otherlv_23= '=' ( (lv_horizontal_24_0= RULE_BOOL ) ) ) ) ) ) )+ {...}?) ) ) otherlv_25= 'effectFile' otherlv_26= '=' ( (lv_effectFile_27_0= RULE_STRING ) ) (otherlv_28= 'allwaystransparent' otherlv_29= '=' ( (lv_allwaysTransparent_30_0= RULE_BOOL ) ) )? (otherlv_31= 'maxValue' otherlv_32= '=' ( (lv_maxValue_33_0= ruleNumber ) ) )? (otherlv_34= 'loadType' otherlv_35= '=' ( (lv_loadType_36_0= RULE_STRING ) ) )? (otherlv_37= 'norefcount' otherlv_38= '=' ( (lv_noRefCount_39_0= RULE_BOOL ) ) )? otherlv_40= '}' )
            {
            // InternalCk2Gfx.g:1496:2: (otherlv_0= 'progressbartype' otherlv_1= '=' otherlv_2= '{' otherlv_3= 'name' otherlv_4= '=' ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= 'color' otherlv_7= '=' ( (lv_color_8_0= ruleColorRatio ) ) otherlv_9= 'colortwo' otherlv_10= '=' ( (lv_color2_11_0= ruleColorRatio ) ) (otherlv_12= 'textureFile1' otherlv_13= '=' ( (lv_textureFile1_14_0= RULE_STRING ) ) )? (otherlv_15= 'textureFile2' otherlv_16= '=' ( (lv_textureFile2_17_0= RULE_STRING ) ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_19= 'size' otherlv_20= '=' ( (lv_size_21_0= ruleCoordinates ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'horizontal' otherlv_23= '=' ( (lv_horizontal_24_0= RULE_BOOL ) ) ) ) ) ) )+ {...}?) ) ) otherlv_25= 'effectFile' otherlv_26= '=' ( (lv_effectFile_27_0= RULE_STRING ) ) (otherlv_28= 'allwaystransparent' otherlv_29= '=' ( (lv_allwaysTransparent_30_0= RULE_BOOL ) ) )? (otherlv_31= 'maxValue' otherlv_32= '=' ( (lv_maxValue_33_0= ruleNumber ) ) )? (otherlv_34= 'loadType' otherlv_35= '=' ( (lv_loadType_36_0= RULE_STRING ) ) )? (otherlv_37= 'norefcount' otherlv_38= '=' ( (lv_noRefCount_39_0= RULE_BOOL ) ) )? otherlv_40= '}' )
            // InternalCk2Gfx.g:1497:3: otherlv_0= 'progressbartype' otherlv_1= '=' otherlv_2= '{' otherlv_3= 'name' otherlv_4= '=' ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= 'color' otherlv_7= '=' ( (lv_color_8_0= ruleColorRatio ) ) otherlv_9= 'colortwo' otherlv_10= '=' ( (lv_color2_11_0= ruleColorRatio ) ) (otherlv_12= 'textureFile1' otherlv_13= '=' ( (lv_textureFile1_14_0= RULE_STRING ) ) )? (otherlv_15= 'textureFile2' otherlv_16= '=' ( (lv_textureFile2_17_0= RULE_STRING ) ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_19= 'size' otherlv_20= '=' ( (lv_size_21_0= ruleCoordinates ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'horizontal' otherlv_23= '=' ( (lv_horizontal_24_0= RULE_BOOL ) ) ) ) ) ) )+ {...}?) ) ) otherlv_25= 'effectFile' otherlv_26= '=' ( (lv_effectFile_27_0= RULE_STRING ) ) (otherlv_28= 'allwaystransparent' otherlv_29= '=' ( (lv_allwaysTransparent_30_0= RULE_BOOL ) ) )? (otherlv_31= 'maxValue' otherlv_32= '=' ( (lv_maxValue_33_0= ruleNumber ) ) )? (otherlv_34= 'loadType' otherlv_35= '=' ( (lv_loadType_36_0= RULE_STRING ) ) )? (otherlv_37= 'norefcount' otherlv_38= '=' ( (lv_noRefCount_39_0= RULE_BOOL ) ) )? otherlv_40= '}'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getProgressbarTypeAccess().getProgressbartypeKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getProgressbarTypeAccess().getEqualsSignKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getProgressbarTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,23,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getProgressbarTypeAccess().getNameKeyword_3());
            		
            otherlv_4=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getProgressbarTypeAccess().getEqualsSignKeyword_4());
            		
            // InternalCk2Gfx.g:1517:3: ( (lv_name_5_0= RULE_STRING ) )
            // InternalCk2Gfx.g:1518:4: (lv_name_5_0= RULE_STRING )
            {
            // InternalCk2Gfx.g:1518:4: (lv_name_5_0= RULE_STRING )
            // InternalCk2Gfx.g:1519:5: lv_name_5_0= RULE_STRING
            {
            lv_name_5_0=(Token)match(input,RULE_STRING,FOLLOW_31); 

            					newLeafNode(lv_name_5_0, grammarAccess.getProgressbarTypeAccess().getNameSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProgressbarTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_5_0,
            						"ck2xtext.common.Ck2Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,45,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getProgressbarTypeAccess().getColorKeyword_6());
            		
            otherlv_7=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_7, grammarAccess.getProgressbarTypeAccess().getEqualsSignKeyword_7());
            		
            // InternalCk2Gfx.g:1543:3: ( (lv_color_8_0= ruleColorRatio ) )
            // InternalCk2Gfx.g:1544:4: (lv_color_8_0= ruleColorRatio )
            {
            // InternalCk2Gfx.g:1544:4: (lv_color_8_0= ruleColorRatio )
            // InternalCk2Gfx.g:1545:5: lv_color_8_0= ruleColorRatio
            {

            					newCompositeNode(grammarAccess.getProgressbarTypeAccess().getColorColorRatioParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_32);
            lv_color_8_0=ruleColorRatio();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProgressbarTypeRule());
            					}
            					set(
            						current,
            						"color",
            						lv_color_8_0,
            						"ck2xtext.gfx.Ck2Gfx.ColorRatio");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,46,FOLLOW_8); 

            			newLeafNode(otherlv_9, grammarAccess.getProgressbarTypeAccess().getColortwoKeyword_9());
            		
            otherlv_10=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_10, grammarAccess.getProgressbarTypeAccess().getEqualsSignKeyword_10());
            		
            // InternalCk2Gfx.g:1570:3: ( (lv_color2_11_0= ruleColorRatio ) )
            // InternalCk2Gfx.g:1571:4: (lv_color2_11_0= ruleColorRatio )
            {
            // InternalCk2Gfx.g:1571:4: (lv_color2_11_0= ruleColorRatio )
            // InternalCk2Gfx.g:1572:5: lv_color2_11_0= ruleColorRatio
            {

            					newCompositeNode(grammarAccess.getProgressbarTypeAccess().getColor2ColorRatioParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_33);
            lv_color2_11_0=ruleColorRatio();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProgressbarTypeRule());
            					}
            					set(
            						current,
            						"color2",
            						lv_color2_11_0,
            						"ck2xtext.gfx.Ck2Gfx.ColorRatio");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCk2Gfx.g:1589:3: (otherlv_12= 'textureFile1' otherlv_13= '=' ( (lv_textureFile1_14_0= RULE_STRING ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==47) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalCk2Gfx.g:1590:4: otherlv_12= 'textureFile1' otherlv_13= '=' ( (lv_textureFile1_14_0= RULE_STRING ) )
                    {
                    otherlv_12=(Token)match(input,47,FOLLOW_8); 

                    				newLeafNode(otherlv_12, grammarAccess.getProgressbarTypeAccess().getTextureFile1Keyword_12_0());
                    			
                    otherlv_13=(Token)match(input,18,FOLLOW_13); 

                    				newLeafNode(otherlv_13, grammarAccess.getProgressbarTypeAccess().getEqualsSignKeyword_12_1());
                    			
                    // InternalCk2Gfx.g:1598:4: ( (lv_textureFile1_14_0= RULE_STRING ) )
                    // InternalCk2Gfx.g:1599:5: (lv_textureFile1_14_0= RULE_STRING )
                    {
                    // InternalCk2Gfx.g:1599:5: (lv_textureFile1_14_0= RULE_STRING )
                    // InternalCk2Gfx.g:1600:6: lv_textureFile1_14_0= RULE_STRING
                    {
                    lv_textureFile1_14_0=(Token)match(input,RULE_STRING,FOLLOW_34); 

                    						newLeafNode(lv_textureFile1_14_0, grammarAccess.getProgressbarTypeAccess().getTextureFile1STRINGTerminalRuleCall_12_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getProgressbarTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"textureFile1",
                    							lv_textureFile1_14_0,
                    							"ck2xtext.common.Ck2Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCk2Gfx.g:1617:3: (otherlv_15= 'textureFile2' otherlv_16= '=' ( (lv_textureFile2_17_0= RULE_STRING ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==48) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalCk2Gfx.g:1618:4: otherlv_15= 'textureFile2' otherlv_16= '=' ( (lv_textureFile2_17_0= RULE_STRING ) )
                    {
                    otherlv_15=(Token)match(input,48,FOLLOW_8); 

                    				newLeafNode(otherlv_15, grammarAccess.getProgressbarTypeAccess().getTextureFile2Keyword_13_0());
                    			
                    otherlv_16=(Token)match(input,18,FOLLOW_13); 

                    				newLeafNode(otherlv_16, grammarAccess.getProgressbarTypeAccess().getEqualsSignKeyword_13_1());
                    			
                    // InternalCk2Gfx.g:1626:4: ( (lv_textureFile2_17_0= RULE_STRING ) )
                    // InternalCk2Gfx.g:1627:5: (lv_textureFile2_17_0= RULE_STRING )
                    {
                    // InternalCk2Gfx.g:1627:5: (lv_textureFile2_17_0= RULE_STRING )
                    // InternalCk2Gfx.g:1628:6: lv_textureFile2_17_0= RULE_STRING
                    {
                    lv_textureFile2_17_0=(Token)match(input,RULE_STRING,FOLLOW_35); 

                    						newLeafNode(lv_textureFile2_17_0, grammarAccess.getProgressbarTypeAccess().getTextureFile2STRINGTerminalRuleCall_13_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getProgressbarTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"textureFile2",
                    							lv_textureFile2_17_0,
                    							"ck2xtext.common.Ck2Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCk2Gfx.g:1645:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_19= 'size' otherlv_20= '=' ( (lv_size_21_0= ruleCoordinates ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'horizontal' otherlv_23= '=' ( (lv_horizontal_24_0= RULE_BOOL ) ) ) ) ) ) )+ {...}?) ) )
            // InternalCk2Gfx.g:1646:4: ( ( ( ({...}? => ( ({...}? => (otherlv_19= 'size' otherlv_20= '=' ( (lv_size_21_0= ruleCoordinates ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'horizontal' otherlv_23= '=' ( (lv_horizontal_24_0= RULE_BOOL ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalCk2Gfx.g:1646:4: ( ( ( ({...}? => ( ({...}? => (otherlv_19= 'size' otherlv_20= '=' ( (lv_size_21_0= ruleCoordinates ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'horizontal' otherlv_23= '=' ( (lv_horizontal_24_0= RULE_BOOL ) ) ) ) ) ) )+ {...}?) )
            // InternalCk2Gfx.g:1647:5: ( ( ({...}? => ( ({...}? => (otherlv_19= 'size' otherlv_20= '=' ( (lv_size_21_0= ruleCoordinates ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'horizontal' otherlv_23= '=' ( (lv_horizontal_24_0= RULE_BOOL ) ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getProgressbarTypeAccess().getUnorderedGroup_14());
            				
            // InternalCk2Gfx.g:1650:5: ( ( ({...}? => ( ({...}? => (otherlv_19= 'size' otherlv_20= '=' ( (lv_size_21_0= ruleCoordinates ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'horizontal' otherlv_23= '=' ( (lv_horizontal_24_0= RULE_BOOL ) ) ) ) ) ) )+ {...}?)
            // InternalCk2Gfx.g:1651:6: ( ({...}? => ( ({...}? => (otherlv_19= 'size' otherlv_20= '=' ( (lv_size_21_0= ruleCoordinates ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'horizontal' otherlv_23= '=' ( (lv_horizontal_24_0= RULE_BOOL ) ) ) ) ) ) )+ {...}?
            {
            // InternalCk2Gfx.g:1651:6: ( ({...}? => ( ({...}? => (otherlv_19= 'size' otherlv_20= '=' ( (lv_size_21_0= ruleCoordinates ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'horizontal' otherlv_23= '=' ( (lv_horizontal_24_0= RULE_BOOL ) ) ) ) ) ) )+
            int cnt20=0;
            loop20:
            do {
                int alt20=3;
                int LA20_0 = input.LA(1);

                if ( LA20_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getProgressbarTypeAccess().getUnorderedGroup_14(), 0) ) {
                    alt20=1;
                }
                else if ( LA20_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getProgressbarTypeAccess().getUnorderedGroup_14(), 1) ) {
                    alt20=2;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalCk2Gfx.g:1652:4: ({...}? => ( ({...}? => (otherlv_19= 'size' otherlv_20= '=' ( (lv_size_21_0= ruleCoordinates ) ) ) ) ) )
            	    {
            	    // InternalCk2Gfx.g:1652:4: ({...}? => ( ({...}? => (otherlv_19= 'size' otherlv_20= '=' ( (lv_size_21_0= ruleCoordinates ) ) ) ) ) )
            	    // InternalCk2Gfx.g:1653:5: {...}? => ( ({...}? => (otherlv_19= 'size' otherlv_20= '=' ( (lv_size_21_0= ruleCoordinates ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getProgressbarTypeAccess().getUnorderedGroup_14(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleProgressbarType", "getUnorderedGroupHelper().canSelect(grammarAccess.getProgressbarTypeAccess().getUnorderedGroup_14(), 0)");
            	    }
            	    // InternalCk2Gfx.g:1653:113: ( ({...}? => (otherlv_19= 'size' otherlv_20= '=' ( (lv_size_21_0= ruleCoordinates ) ) ) ) )
            	    // InternalCk2Gfx.g:1654:6: ({...}? => (otherlv_19= 'size' otherlv_20= '=' ( (lv_size_21_0= ruleCoordinates ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getProgressbarTypeAccess().getUnorderedGroup_14(), 0);
            	    					
            	    // InternalCk2Gfx.g:1657:9: ({...}? => (otherlv_19= 'size' otherlv_20= '=' ( (lv_size_21_0= ruleCoordinates ) ) ) )
            	    // InternalCk2Gfx.g:1657:10: {...}? => (otherlv_19= 'size' otherlv_20= '=' ( (lv_size_21_0= ruleCoordinates ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleProgressbarType", "true");
            	    }
            	    // InternalCk2Gfx.g:1657:19: (otherlv_19= 'size' otherlv_20= '=' ( (lv_size_21_0= ruleCoordinates ) ) )
            	    // InternalCk2Gfx.g:1657:20: otherlv_19= 'size' otherlv_20= '=' ( (lv_size_21_0= ruleCoordinates ) )
            	    {
            	    otherlv_19=(Token)match(input,41,FOLLOW_8); 

            	    									newLeafNode(otherlv_19, grammarAccess.getProgressbarTypeAccess().getSizeKeyword_14_0_0());
            	    								
            	    otherlv_20=(Token)match(input,18,FOLLOW_10); 

            	    									newLeafNode(otherlv_20, grammarAccess.getProgressbarTypeAccess().getEqualsSignKeyword_14_0_1());
            	    								
            	    // InternalCk2Gfx.g:1665:9: ( (lv_size_21_0= ruleCoordinates ) )
            	    // InternalCk2Gfx.g:1666:10: (lv_size_21_0= ruleCoordinates )
            	    {
            	    // InternalCk2Gfx.g:1666:10: (lv_size_21_0= ruleCoordinates )
            	    // InternalCk2Gfx.g:1667:11: lv_size_21_0= ruleCoordinates
            	    {

            	    											newCompositeNode(grammarAccess.getProgressbarTypeAccess().getSizeCoordinatesParserRuleCall_14_0_2_0());
            	    										
            	    pushFollow(FOLLOW_36);
            	    lv_size_21_0=ruleCoordinates();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getProgressbarTypeRule());
            	    											}
            	    											set(
            	    												current,
            	    												"size",
            	    												lv_size_21_0,
            	    												"ck2xtext.gfx.Ck2Gfx.Coordinates");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getProgressbarTypeAccess().getUnorderedGroup_14());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalCk2Gfx.g:1690:4: ({...}? => ( ({...}? => (otherlv_22= 'horizontal' otherlv_23= '=' ( (lv_horizontal_24_0= RULE_BOOL ) ) ) ) ) )
            	    {
            	    // InternalCk2Gfx.g:1690:4: ({...}? => ( ({...}? => (otherlv_22= 'horizontal' otherlv_23= '=' ( (lv_horizontal_24_0= RULE_BOOL ) ) ) ) ) )
            	    // InternalCk2Gfx.g:1691:5: {...}? => ( ({...}? => (otherlv_22= 'horizontal' otherlv_23= '=' ( (lv_horizontal_24_0= RULE_BOOL ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getProgressbarTypeAccess().getUnorderedGroup_14(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleProgressbarType", "getUnorderedGroupHelper().canSelect(grammarAccess.getProgressbarTypeAccess().getUnorderedGroup_14(), 1)");
            	    }
            	    // InternalCk2Gfx.g:1691:113: ( ({...}? => (otherlv_22= 'horizontal' otherlv_23= '=' ( (lv_horizontal_24_0= RULE_BOOL ) ) ) ) )
            	    // InternalCk2Gfx.g:1692:6: ({...}? => (otherlv_22= 'horizontal' otherlv_23= '=' ( (lv_horizontal_24_0= RULE_BOOL ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getProgressbarTypeAccess().getUnorderedGroup_14(), 1);
            	    					
            	    // InternalCk2Gfx.g:1695:9: ({...}? => (otherlv_22= 'horizontal' otherlv_23= '=' ( (lv_horizontal_24_0= RULE_BOOL ) ) ) )
            	    // InternalCk2Gfx.g:1695:10: {...}? => (otherlv_22= 'horizontal' otherlv_23= '=' ( (lv_horizontal_24_0= RULE_BOOL ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleProgressbarType", "true");
            	    }
            	    // InternalCk2Gfx.g:1695:19: (otherlv_22= 'horizontal' otherlv_23= '=' ( (lv_horizontal_24_0= RULE_BOOL ) ) )
            	    // InternalCk2Gfx.g:1695:20: otherlv_22= 'horizontal' otherlv_23= '=' ( (lv_horizontal_24_0= RULE_BOOL ) )
            	    {
            	    otherlv_22=(Token)match(input,49,FOLLOW_8); 

            	    									newLeafNode(otherlv_22, grammarAccess.getProgressbarTypeAccess().getHorizontalKeyword_14_1_0());
            	    								
            	    otherlv_23=(Token)match(input,18,FOLLOW_15); 

            	    									newLeafNode(otherlv_23, grammarAccess.getProgressbarTypeAccess().getEqualsSignKeyword_14_1_1());
            	    								
            	    // InternalCk2Gfx.g:1703:9: ( (lv_horizontal_24_0= RULE_BOOL ) )
            	    // InternalCk2Gfx.g:1704:10: (lv_horizontal_24_0= RULE_BOOL )
            	    {
            	    // InternalCk2Gfx.g:1704:10: (lv_horizontal_24_0= RULE_BOOL )
            	    // InternalCk2Gfx.g:1705:11: lv_horizontal_24_0= RULE_BOOL
            	    {
            	    lv_horizontal_24_0=(Token)match(input,RULE_BOOL,FOLLOW_36); 

            	    											newLeafNode(lv_horizontal_24_0, grammarAccess.getProgressbarTypeAccess().getHorizontalBOOLTerminalRuleCall_14_1_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getProgressbarTypeRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"horizontal",
            	    												lv_horizontal_24_0,
            	    												"ck2xtext.common.Ck2Terminals.BOOL");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getProgressbarTypeAccess().getUnorderedGroup_14());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getProgressbarTypeAccess().getUnorderedGroup_14()) ) {
                throw new FailedPredicateException(input, "ruleProgressbarType", "getUnorderedGroupHelper().canLeave(grammarAccess.getProgressbarTypeAccess().getUnorderedGroup_14())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getProgressbarTypeAccess().getUnorderedGroup_14());
            				

            }

            otherlv_25=(Token)match(input,32,FOLLOW_8); 

            			newLeafNode(otherlv_25, grammarAccess.getProgressbarTypeAccess().getEffectFileKeyword_15());
            		
            otherlv_26=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_26, grammarAccess.getProgressbarTypeAccess().getEqualsSignKeyword_16());
            		
            // InternalCk2Gfx.g:1743:3: ( (lv_effectFile_27_0= RULE_STRING ) )
            // InternalCk2Gfx.g:1744:4: (lv_effectFile_27_0= RULE_STRING )
            {
            // InternalCk2Gfx.g:1744:4: (lv_effectFile_27_0= RULE_STRING )
            // InternalCk2Gfx.g:1745:5: lv_effectFile_27_0= RULE_STRING
            {
            lv_effectFile_27_0=(Token)match(input,RULE_STRING,FOLLOW_37); 

            					newLeafNode(lv_effectFile_27_0, grammarAccess.getProgressbarTypeAccess().getEffectFileSTRINGTerminalRuleCall_17_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProgressbarTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"effectFile",
            						lv_effectFile_27_0,
            						"ck2xtext.common.Ck2Terminals.STRING");
            				

            }


            }

            // InternalCk2Gfx.g:1761:3: (otherlv_28= 'allwaystransparent' otherlv_29= '=' ( (lv_allwaysTransparent_30_0= RULE_BOOL ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==29) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalCk2Gfx.g:1762:4: otherlv_28= 'allwaystransparent' otherlv_29= '=' ( (lv_allwaysTransparent_30_0= RULE_BOOL ) )
                    {
                    otherlv_28=(Token)match(input,29,FOLLOW_8); 

                    				newLeafNode(otherlv_28, grammarAccess.getProgressbarTypeAccess().getAllwaystransparentKeyword_18_0());
                    			
                    otherlv_29=(Token)match(input,18,FOLLOW_15); 

                    				newLeafNode(otherlv_29, grammarAccess.getProgressbarTypeAccess().getEqualsSignKeyword_18_1());
                    			
                    // InternalCk2Gfx.g:1770:4: ( (lv_allwaysTransparent_30_0= RULE_BOOL ) )
                    // InternalCk2Gfx.g:1771:5: (lv_allwaysTransparent_30_0= RULE_BOOL )
                    {
                    // InternalCk2Gfx.g:1771:5: (lv_allwaysTransparent_30_0= RULE_BOOL )
                    // InternalCk2Gfx.g:1772:6: lv_allwaysTransparent_30_0= RULE_BOOL
                    {
                    lv_allwaysTransparent_30_0=(Token)match(input,RULE_BOOL,FOLLOW_38); 

                    						newLeafNode(lv_allwaysTransparent_30_0, grammarAccess.getProgressbarTypeAccess().getAllwaysTransparentBOOLTerminalRuleCall_18_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getProgressbarTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"allwaysTransparent",
                    							lv_allwaysTransparent_30_0,
                    							"ck2xtext.common.Ck2Terminals.BOOL");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCk2Gfx.g:1789:3: (otherlv_31= 'maxValue' otherlv_32= '=' ( (lv_maxValue_33_0= ruleNumber ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==50) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalCk2Gfx.g:1790:4: otherlv_31= 'maxValue' otherlv_32= '=' ( (lv_maxValue_33_0= ruleNumber ) )
                    {
                    otherlv_31=(Token)match(input,50,FOLLOW_8); 

                    				newLeafNode(otherlv_31, grammarAccess.getProgressbarTypeAccess().getMaxValueKeyword_19_0());
                    			
                    otherlv_32=(Token)match(input,18,FOLLOW_6); 

                    				newLeafNode(otherlv_32, grammarAccess.getProgressbarTypeAccess().getEqualsSignKeyword_19_1());
                    			
                    // InternalCk2Gfx.g:1798:4: ( (lv_maxValue_33_0= ruleNumber ) )
                    // InternalCk2Gfx.g:1799:5: (lv_maxValue_33_0= ruleNumber )
                    {
                    // InternalCk2Gfx.g:1799:5: (lv_maxValue_33_0= ruleNumber )
                    // InternalCk2Gfx.g:1800:6: lv_maxValue_33_0= ruleNumber
                    {

                    						newCompositeNode(grammarAccess.getProgressbarTypeAccess().getMaxValueNumberParserRuleCall_19_2_0());
                    					
                    pushFollow(FOLLOW_39);
                    lv_maxValue_33_0=ruleNumber();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProgressbarTypeRule());
                    						}
                    						set(
                    							current,
                    							"maxValue",
                    							lv_maxValue_33_0,
                    							"ck2xtext.common.Ck2Terminals.Number");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCk2Gfx.g:1818:3: (otherlv_34= 'loadType' otherlv_35= '=' ( (lv_loadType_36_0= RULE_STRING ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==28) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalCk2Gfx.g:1819:4: otherlv_34= 'loadType' otherlv_35= '=' ( (lv_loadType_36_0= RULE_STRING ) )
                    {
                    otherlv_34=(Token)match(input,28,FOLLOW_8); 

                    				newLeafNode(otherlv_34, grammarAccess.getProgressbarTypeAccess().getLoadTypeKeyword_20_0());
                    			
                    otherlv_35=(Token)match(input,18,FOLLOW_13); 

                    				newLeafNode(otherlv_35, grammarAccess.getProgressbarTypeAccess().getEqualsSignKeyword_20_1());
                    			
                    // InternalCk2Gfx.g:1827:4: ( (lv_loadType_36_0= RULE_STRING ) )
                    // InternalCk2Gfx.g:1828:5: (lv_loadType_36_0= RULE_STRING )
                    {
                    // InternalCk2Gfx.g:1828:5: (lv_loadType_36_0= RULE_STRING )
                    // InternalCk2Gfx.g:1829:6: lv_loadType_36_0= RULE_STRING
                    {
                    lv_loadType_36_0=(Token)match(input,RULE_STRING,FOLLOW_40); 

                    						newLeafNode(lv_loadType_36_0, grammarAccess.getProgressbarTypeAccess().getLoadTypeSTRINGTerminalRuleCall_20_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getProgressbarTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"loadType",
                    							lv_loadType_36_0,
                    							"ck2xtext.common.Ck2Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCk2Gfx.g:1846:3: (otherlv_37= 'norefcount' otherlv_38= '=' ( (lv_noRefCount_39_0= RULE_BOOL ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==31) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalCk2Gfx.g:1847:4: otherlv_37= 'norefcount' otherlv_38= '=' ( (lv_noRefCount_39_0= RULE_BOOL ) )
                    {
                    otherlv_37=(Token)match(input,31,FOLLOW_8); 

                    				newLeafNode(otherlv_37, grammarAccess.getProgressbarTypeAccess().getNorefcountKeyword_21_0());
                    			
                    otherlv_38=(Token)match(input,18,FOLLOW_15); 

                    				newLeafNode(otherlv_38, grammarAccess.getProgressbarTypeAccess().getEqualsSignKeyword_21_1());
                    			
                    // InternalCk2Gfx.g:1855:4: ( (lv_noRefCount_39_0= RULE_BOOL ) )
                    // InternalCk2Gfx.g:1856:5: (lv_noRefCount_39_0= RULE_BOOL )
                    {
                    // InternalCk2Gfx.g:1856:5: (lv_noRefCount_39_0= RULE_BOOL )
                    // InternalCk2Gfx.g:1857:6: lv_noRefCount_39_0= RULE_BOOL
                    {
                    lv_noRefCount_39_0=(Token)match(input,RULE_BOOL,FOLLOW_5); 

                    						newLeafNode(lv_noRefCount_39_0, grammarAccess.getProgressbarTypeAccess().getNoRefCountBOOLTerminalRuleCall_21_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getProgressbarTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"noRefCount",
                    							lv_noRefCount_39_0,
                    							"ck2xtext.common.Ck2Terminals.BOOL");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_40=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_40, grammarAccess.getProgressbarTypeAccess().getRightCurlyBracketKeyword_22());
            		

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
    // $ANTLR end "ruleProgressbarType"


    // $ANTLR start "entryRulePortraitType"
    // InternalCk2Gfx.g:1882:1: entryRulePortraitType returns [EObject current=null] : iv_rulePortraitType= rulePortraitType EOF ;
    public final EObject entryRulePortraitType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePortraitType = null;


        try {
            // InternalCk2Gfx.g:1882:53: (iv_rulePortraitType= rulePortraitType EOF )
            // InternalCk2Gfx.g:1883:2: iv_rulePortraitType= rulePortraitType EOF
            {
             newCompositeNode(grammarAccess.getPortraitTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePortraitType=rulePortraitType();

            state._fsp--;

             current =iv_rulePortraitType; 
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
    // $ANTLR end "entryRulePortraitType"


    // $ANTLR start "rulePortraitType"
    // InternalCk2Gfx.g:1889:1: rulePortraitType returns [EObject current=null] : (otherlv_0= 'portraitType' otherlv_1= '=' otherlv_2= '{' otherlv_3= 'name' otherlv_4= '=' ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= 'effectFile' otherlv_7= '=' ( (lv_effectFile_8_0= RULE_STRING ) ) otherlv_9= 'layer' otherlv_10= '=' otherlv_11= '{' ( (lv_layers_12_0= RULE_STRING ) )+ otherlv_13= '}' (otherlv_14= 'hair_color_index' otherlv_15= '=' ( (lv_hairColorIndex_16_0= RULE_INT ) ) )? (otherlv_17= 'hair_color' otherlv_18= '=' otherlv_19= '{' ( (lv_hairColor_20_0= ruleColor ) )+ otherlv_21= '}' )? (otherlv_22= 'eye_color_index' otherlv_23= '=' ( (lv_eyeColorIndex_24_0= RULE_INT ) ) )? (otherlv_25= 'eye_color' otherlv_26= '=' otherlv_27= '{' ( (lv_eyeColor_28_0= ruleColor ) )+ otherlv_29= '}' )? (otherlv_30= 'headgear_that_hides_hair' otherlv_31= '=' otherlv_32= '{' ( (lv_headgearThatHidesHair_33_0= RULE_INT ) )* otherlv_34= '}' )? otherlv_35= '}' ) ;
    public final EObject rulePortraitType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_effectFile_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_layers_12_0=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token lv_hairColorIndex_16_0=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token lv_eyeColorIndex_24_0=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token lv_headgearThatHidesHair_33_0=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        EObject lv_hairColor_20_0 = null;

        EObject lv_eyeColor_28_0 = null;



        	enterRule();

        try {
            // InternalCk2Gfx.g:1895:2: ( (otherlv_0= 'portraitType' otherlv_1= '=' otherlv_2= '{' otherlv_3= 'name' otherlv_4= '=' ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= 'effectFile' otherlv_7= '=' ( (lv_effectFile_8_0= RULE_STRING ) ) otherlv_9= 'layer' otherlv_10= '=' otherlv_11= '{' ( (lv_layers_12_0= RULE_STRING ) )+ otherlv_13= '}' (otherlv_14= 'hair_color_index' otherlv_15= '=' ( (lv_hairColorIndex_16_0= RULE_INT ) ) )? (otherlv_17= 'hair_color' otherlv_18= '=' otherlv_19= '{' ( (lv_hairColor_20_0= ruleColor ) )+ otherlv_21= '}' )? (otherlv_22= 'eye_color_index' otherlv_23= '=' ( (lv_eyeColorIndex_24_0= RULE_INT ) ) )? (otherlv_25= 'eye_color' otherlv_26= '=' otherlv_27= '{' ( (lv_eyeColor_28_0= ruleColor ) )+ otherlv_29= '}' )? (otherlv_30= 'headgear_that_hides_hair' otherlv_31= '=' otherlv_32= '{' ( (lv_headgearThatHidesHair_33_0= RULE_INT ) )* otherlv_34= '}' )? otherlv_35= '}' ) )
            // InternalCk2Gfx.g:1896:2: (otherlv_0= 'portraitType' otherlv_1= '=' otherlv_2= '{' otherlv_3= 'name' otherlv_4= '=' ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= 'effectFile' otherlv_7= '=' ( (lv_effectFile_8_0= RULE_STRING ) ) otherlv_9= 'layer' otherlv_10= '=' otherlv_11= '{' ( (lv_layers_12_0= RULE_STRING ) )+ otherlv_13= '}' (otherlv_14= 'hair_color_index' otherlv_15= '=' ( (lv_hairColorIndex_16_0= RULE_INT ) ) )? (otherlv_17= 'hair_color' otherlv_18= '=' otherlv_19= '{' ( (lv_hairColor_20_0= ruleColor ) )+ otherlv_21= '}' )? (otherlv_22= 'eye_color_index' otherlv_23= '=' ( (lv_eyeColorIndex_24_0= RULE_INT ) ) )? (otherlv_25= 'eye_color' otherlv_26= '=' otherlv_27= '{' ( (lv_eyeColor_28_0= ruleColor ) )+ otherlv_29= '}' )? (otherlv_30= 'headgear_that_hides_hair' otherlv_31= '=' otherlv_32= '{' ( (lv_headgearThatHidesHair_33_0= RULE_INT ) )* otherlv_34= '}' )? otherlv_35= '}' )
            {
            // InternalCk2Gfx.g:1896:2: (otherlv_0= 'portraitType' otherlv_1= '=' otherlv_2= '{' otherlv_3= 'name' otherlv_4= '=' ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= 'effectFile' otherlv_7= '=' ( (lv_effectFile_8_0= RULE_STRING ) ) otherlv_9= 'layer' otherlv_10= '=' otherlv_11= '{' ( (lv_layers_12_0= RULE_STRING ) )+ otherlv_13= '}' (otherlv_14= 'hair_color_index' otherlv_15= '=' ( (lv_hairColorIndex_16_0= RULE_INT ) ) )? (otherlv_17= 'hair_color' otherlv_18= '=' otherlv_19= '{' ( (lv_hairColor_20_0= ruleColor ) )+ otherlv_21= '}' )? (otherlv_22= 'eye_color_index' otherlv_23= '=' ( (lv_eyeColorIndex_24_0= RULE_INT ) ) )? (otherlv_25= 'eye_color' otherlv_26= '=' otherlv_27= '{' ( (lv_eyeColor_28_0= ruleColor ) )+ otherlv_29= '}' )? (otherlv_30= 'headgear_that_hides_hair' otherlv_31= '=' otherlv_32= '{' ( (lv_headgearThatHidesHair_33_0= RULE_INT ) )* otherlv_34= '}' )? otherlv_35= '}' )
            // InternalCk2Gfx.g:1897:3: otherlv_0= 'portraitType' otherlv_1= '=' otherlv_2= '{' otherlv_3= 'name' otherlv_4= '=' ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= 'effectFile' otherlv_7= '=' ( (lv_effectFile_8_0= RULE_STRING ) ) otherlv_9= 'layer' otherlv_10= '=' otherlv_11= '{' ( (lv_layers_12_0= RULE_STRING ) )+ otherlv_13= '}' (otherlv_14= 'hair_color_index' otherlv_15= '=' ( (lv_hairColorIndex_16_0= RULE_INT ) ) )? (otherlv_17= 'hair_color' otherlv_18= '=' otherlv_19= '{' ( (lv_hairColor_20_0= ruleColor ) )+ otherlv_21= '}' )? (otherlv_22= 'eye_color_index' otherlv_23= '=' ( (lv_eyeColorIndex_24_0= RULE_INT ) ) )? (otherlv_25= 'eye_color' otherlv_26= '=' otherlv_27= '{' ( (lv_eyeColor_28_0= ruleColor ) )+ otherlv_29= '}' )? (otherlv_30= 'headgear_that_hides_hair' otherlv_31= '=' otherlv_32= '{' ( (lv_headgearThatHidesHair_33_0= RULE_INT ) )* otherlv_34= '}' )? otherlv_35= '}'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getPortraitTypeAccess().getPortraitTypeKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getPortraitTypeAccess().getEqualsSignKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getPortraitTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,23,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getPortraitTypeAccess().getNameKeyword_3());
            		
            otherlv_4=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getPortraitTypeAccess().getEqualsSignKeyword_4());
            		
            // InternalCk2Gfx.g:1917:3: ( (lv_name_5_0= RULE_STRING ) )
            // InternalCk2Gfx.g:1918:4: (lv_name_5_0= RULE_STRING )
            {
            // InternalCk2Gfx.g:1918:4: (lv_name_5_0= RULE_STRING )
            // InternalCk2Gfx.g:1919:5: lv_name_5_0= RULE_STRING
            {
            lv_name_5_0=(Token)match(input,RULE_STRING,FOLLOW_41); 

            					newLeafNode(lv_name_5_0, grammarAccess.getPortraitTypeAccess().getNameSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPortraitTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_5_0,
            						"ck2xtext.common.Ck2Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,32,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getPortraitTypeAccess().getEffectFileKeyword_6());
            		
            otherlv_7=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_7, grammarAccess.getPortraitTypeAccess().getEqualsSignKeyword_7());
            		
            // InternalCk2Gfx.g:1943:3: ( (lv_effectFile_8_0= RULE_STRING ) )
            // InternalCk2Gfx.g:1944:4: (lv_effectFile_8_0= RULE_STRING )
            {
            // InternalCk2Gfx.g:1944:4: (lv_effectFile_8_0= RULE_STRING )
            // InternalCk2Gfx.g:1945:5: lv_effectFile_8_0= RULE_STRING
            {
            lv_effectFile_8_0=(Token)match(input,RULE_STRING,FOLLOW_42); 

            					newLeafNode(lv_effectFile_8_0, grammarAccess.getPortraitTypeAccess().getEffectFileSTRINGTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPortraitTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"effectFile",
            						lv_effectFile_8_0,
            						"ck2xtext.common.Ck2Terminals.STRING");
            				

            }


            }

            otherlv_9=(Token)match(input,52,FOLLOW_8); 

            			newLeafNode(otherlv_9, grammarAccess.getPortraitTypeAccess().getLayerKeyword_9());
            		
            otherlv_10=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_10, grammarAccess.getPortraitTypeAccess().getEqualsSignKeyword_10());
            		
            otherlv_11=(Token)match(input,15,FOLLOW_13); 

            			newLeafNode(otherlv_11, grammarAccess.getPortraitTypeAccess().getLeftCurlyBracketKeyword_11());
            		
            // InternalCk2Gfx.g:1973:3: ( (lv_layers_12_0= RULE_STRING ) )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_STRING) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalCk2Gfx.g:1974:4: (lv_layers_12_0= RULE_STRING )
            	    {
            	    // InternalCk2Gfx.g:1974:4: (lv_layers_12_0= RULE_STRING )
            	    // InternalCk2Gfx.g:1975:5: lv_layers_12_0= RULE_STRING
            	    {
            	    lv_layers_12_0=(Token)match(input,RULE_STRING,FOLLOW_43); 

            	    					newLeafNode(lv_layers_12_0, grammarAccess.getPortraitTypeAccess().getLayersSTRINGTerminalRuleCall_12_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getPortraitTypeRule());
            	    					}
            	    					addWithLastConsumed(
            	    						current,
            	    						"layers",
            	    						lv_layers_12_0,
            	    						"ck2xtext.common.Ck2Terminals.STRING");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt25 >= 1 ) break loop25;
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
            } while (true);

            otherlv_13=(Token)match(input,16,FOLLOW_44); 

            			newLeafNode(otherlv_13, grammarAccess.getPortraitTypeAccess().getRightCurlyBracketKeyword_13());
            		
            // InternalCk2Gfx.g:1995:3: (otherlv_14= 'hair_color_index' otherlv_15= '=' ( (lv_hairColorIndex_16_0= RULE_INT ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==53) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalCk2Gfx.g:1996:4: otherlv_14= 'hair_color_index' otherlv_15= '=' ( (lv_hairColorIndex_16_0= RULE_INT ) )
                    {
                    otherlv_14=(Token)match(input,53,FOLLOW_8); 

                    				newLeafNode(otherlv_14, grammarAccess.getPortraitTypeAccess().getHair_color_indexKeyword_14_0());
                    			
                    otherlv_15=(Token)match(input,18,FOLLOW_4); 

                    				newLeafNode(otherlv_15, grammarAccess.getPortraitTypeAccess().getEqualsSignKeyword_14_1());
                    			
                    // InternalCk2Gfx.g:2004:4: ( (lv_hairColorIndex_16_0= RULE_INT ) )
                    // InternalCk2Gfx.g:2005:5: (lv_hairColorIndex_16_0= RULE_INT )
                    {
                    // InternalCk2Gfx.g:2005:5: (lv_hairColorIndex_16_0= RULE_INT )
                    // InternalCk2Gfx.g:2006:6: lv_hairColorIndex_16_0= RULE_INT
                    {
                    lv_hairColorIndex_16_0=(Token)match(input,RULE_INT,FOLLOW_45); 

                    						newLeafNode(lv_hairColorIndex_16_0, grammarAccess.getPortraitTypeAccess().getHairColorIndexINTTerminalRuleCall_14_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPortraitTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"hairColorIndex",
                    							lv_hairColorIndex_16_0,
                    							"ck2xtext.common.Ck2Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCk2Gfx.g:2023:3: (otherlv_17= 'hair_color' otherlv_18= '=' otherlv_19= '{' ( (lv_hairColor_20_0= ruleColor ) )+ otherlv_21= '}' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==54) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalCk2Gfx.g:2024:4: otherlv_17= 'hair_color' otherlv_18= '=' otherlv_19= '{' ( (lv_hairColor_20_0= ruleColor ) )+ otherlv_21= '}'
                    {
                    otherlv_17=(Token)match(input,54,FOLLOW_8); 

                    				newLeafNode(otherlv_17, grammarAccess.getPortraitTypeAccess().getHair_colorKeyword_15_0());
                    			
                    otherlv_18=(Token)match(input,18,FOLLOW_10); 

                    				newLeafNode(otherlv_18, grammarAccess.getPortraitTypeAccess().getEqualsSignKeyword_15_1());
                    			
                    otherlv_19=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_19, grammarAccess.getPortraitTypeAccess().getLeftCurlyBracketKeyword_15_2());
                    			
                    // InternalCk2Gfx.g:2036:4: ( (lv_hairColor_20_0= ruleColor ) )+
                    int cnt27=0;
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==15) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalCk2Gfx.g:2037:5: (lv_hairColor_20_0= ruleColor )
                    	    {
                    	    // InternalCk2Gfx.g:2037:5: (lv_hairColor_20_0= ruleColor )
                    	    // InternalCk2Gfx.g:2038:6: lv_hairColor_20_0= ruleColor
                    	    {

                    	    						newCompositeNode(grammarAccess.getPortraitTypeAccess().getHairColorColorParserRuleCall_15_3_0());
                    	    					
                    	    pushFollow(FOLLOW_46);
                    	    lv_hairColor_20_0=ruleColor();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getPortraitTypeRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"hairColor",
                    	    							lv_hairColor_20_0,
                    	    							"ck2xtext.gfx.Ck2Gfx.Color");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt27 >= 1 ) break loop27;
                                EarlyExitException eee =
                                    new EarlyExitException(27, input);
                                throw eee;
                        }
                        cnt27++;
                    } while (true);

                    otherlv_21=(Token)match(input,16,FOLLOW_47); 

                    				newLeafNode(otherlv_21, grammarAccess.getPortraitTypeAccess().getRightCurlyBracketKeyword_15_4());
                    			

                    }
                    break;

            }

            // InternalCk2Gfx.g:2060:3: (otherlv_22= 'eye_color_index' otherlv_23= '=' ( (lv_eyeColorIndex_24_0= RULE_INT ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==55) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalCk2Gfx.g:2061:4: otherlv_22= 'eye_color_index' otherlv_23= '=' ( (lv_eyeColorIndex_24_0= RULE_INT ) )
                    {
                    otherlv_22=(Token)match(input,55,FOLLOW_8); 

                    				newLeafNode(otherlv_22, grammarAccess.getPortraitTypeAccess().getEye_color_indexKeyword_16_0());
                    			
                    otherlv_23=(Token)match(input,18,FOLLOW_4); 

                    				newLeafNode(otherlv_23, grammarAccess.getPortraitTypeAccess().getEqualsSignKeyword_16_1());
                    			
                    // InternalCk2Gfx.g:2069:4: ( (lv_eyeColorIndex_24_0= RULE_INT ) )
                    // InternalCk2Gfx.g:2070:5: (lv_eyeColorIndex_24_0= RULE_INT )
                    {
                    // InternalCk2Gfx.g:2070:5: (lv_eyeColorIndex_24_0= RULE_INT )
                    // InternalCk2Gfx.g:2071:6: lv_eyeColorIndex_24_0= RULE_INT
                    {
                    lv_eyeColorIndex_24_0=(Token)match(input,RULE_INT,FOLLOW_48); 

                    						newLeafNode(lv_eyeColorIndex_24_0, grammarAccess.getPortraitTypeAccess().getEyeColorIndexINTTerminalRuleCall_16_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPortraitTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"eyeColorIndex",
                    							lv_eyeColorIndex_24_0,
                    							"ck2xtext.common.Ck2Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCk2Gfx.g:2088:3: (otherlv_25= 'eye_color' otherlv_26= '=' otherlv_27= '{' ( (lv_eyeColor_28_0= ruleColor ) )+ otherlv_29= '}' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==56) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalCk2Gfx.g:2089:4: otherlv_25= 'eye_color' otherlv_26= '=' otherlv_27= '{' ( (lv_eyeColor_28_0= ruleColor ) )+ otherlv_29= '}'
                    {
                    otherlv_25=(Token)match(input,56,FOLLOW_8); 

                    				newLeafNode(otherlv_25, grammarAccess.getPortraitTypeAccess().getEye_colorKeyword_17_0());
                    			
                    otherlv_26=(Token)match(input,18,FOLLOW_10); 

                    				newLeafNode(otherlv_26, grammarAccess.getPortraitTypeAccess().getEqualsSignKeyword_17_1());
                    			
                    otherlv_27=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_27, grammarAccess.getPortraitTypeAccess().getLeftCurlyBracketKeyword_17_2());
                    			
                    // InternalCk2Gfx.g:2101:4: ( (lv_eyeColor_28_0= ruleColor ) )+
                    int cnt30=0;
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==15) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalCk2Gfx.g:2102:5: (lv_eyeColor_28_0= ruleColor )
                    	    {
                    	    // InternalCk2Gfx.g:2102:5: (lv_eyeColor_28_0= ruleColor )
                    	    // InternalCk2Gfx.g:2103:6: lv_eyeColor_28_0= ruleColor
                    	    {

                    	    						newCompositeNode(grammarAccess.getPortraitTypeAccess().getEyeColorColorParserRuleCall_17_3_0());
                    	    					
                    	    pushFollow(FOLLOW_46);
                    	    lv_eyeColor_28_0=ruleColor();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getPortraitTypeRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"eyeColor",
                    	    							lv_eyeColor_28_0,
                    	    							"ck2xtext.gfx.Ck2Gfx.Color");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt30 >= 1 ) break loop30;
                                EarlyExitException eee =
                                    new EarlyExitException(30, input);
                                throw eee;
                        }
                        cnt30++;
                    } while (true);

                    otherlv_29=(Token)match(input,16,FOLLOW_49); 

                    				newLeafNode(otherlv_29, grammarAccess.getPortraitTypeAccess().getRightCurlyBracketKeyword_17_4());
                    			

                    }
                    break;

            }

            // InternalCk2Gfx.g:2125:3: (otherlv_30= 'headgear_that_hides_hair' otherlv_31= '=' otherlv_32= '{' ( (lv_headgearThatHidesHair_33_0= RULE_INT ) )* otherlv_34= '}' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==57) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalCk2Gfx.g:2126:4: otherlv_30= 'headgear_that_hides_hair' otherlv_31= '=' otherlv_32= '{' ( (lv_headgearThatHidesHair_33_0= RULE_INT ) )* otherlv_34= '}'
                    {
                    otherlv_30=(Token)match(input,57,FOLLOW_8); 

                    				newLeafNode(otherlv_30, grammarAccess.getPortraitTypeAccess().getHeadgear_that_hides_hairKeyword_18_0());
                    			
                    otherlv_31=(Token)match(input,18,FOLLOW_10); 

                    				newLeafNode(otherlv_31, grammarAccess.getPortraitTypeAccess().getEqualsSignKeyword_18_1());
                    			
                    otherlv_32=(Token)match(input,15,FOLLOW_50); 

                    				newLeafNode(otherlv_32, grammarAccess.getPortraitTypeAccess().getLeftCurlyBracketKeyword_18_2());
                    			
                    // InternalCk2Gfx.g:2138:4: ( (lv_headgearThatHidesHair_33_0= RULE_INT ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==RULE_INT) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalCk2Gfx.g:2139:5: (lv_headgearThatHidesHair_33_0= RULE_INT )
                    	    {
                    	    // InternalCk2Gfx.g:2139:5: (lv_headgearThatHidesHair_33_0= RULE_INT )
                    	    // InternalCk2Gfx.g:2140:6: lv_headgearThatHidesHair_33_0= RULE_INT
                    	    {
                    	    lv_headgearThatHidesHair_33_0=(Token)match(input,RULE_INT,FOLLOW_50); 

                    	    						newLeafNode(lv_headgearThatHidesHair_33_0, grammarAccess.getPortraitTypeAccess().getHeadgearThatHidesHairINTTerminalRuleCall_18_3_0());
                    	    					

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getPortraitTypeRule());
                    	    						}
                    	    						addWithLastConsumed(
                    	    							current,
                    	    							"headgearThatHidesHair",
                    	    							lv_headgearThatHidesHair_33_0,
                    	    							"ck2xtext.common.Ck2Terminals.INT");
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);

                    otherlv_34=(Token)match(input,16,FOLLOW_5); 

                    				newLeafNode(otherlv_34, grammarAccess.getPortraitTypeAccess().getRightCurlyBracketKeyword_18_4());
                    			

                    }
                    break;

            }

            otherlv_35=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_35, grammarAccess.getPortraitTypeAccess().getRightCurlyBracketKeyword_19());
            		

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
    // $ANTLR end "rulePortraitType"


    // $ANTLR start "entryRuleMaskedShieldType"
    // InternalCk2Gfx.g:2169:1: entryRuleMaskedShieldType returns [EObject current=null] : iv_ruleMaskedShieldType= ruleMaskedShieldType EOF ;
    public final EObject entryRuleMaskedShieldType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaskedShieldType = null;


        try {
            // InternalCk2Gfx.g:2169:57: (iv_ruleMaskedShieldType= ruleMaskedShieldType EOF )
            // InternalCk2Gfx.g:2170:2: iv_ruleMaskedShieldType= ruleMaskedShieldType EOF
            {
             newCompositeNode(grammarAccess.getMaskedShieldTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMaskedShieldType=ruleMaskedShieldType();

            state._fsp--;

             current =iv_ruleMaskedShieldType; 
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
    // $ANTLR end "entryRuleMaskedShieldType"


    // $ANTLR start "ruleMaskedShieldType"
    // InternalCk2Gfx.g:2176:1: ruleMaskedShieldType returns [EObject current=null] : (otherlv_0= 'maskedShieldType' otherlv_1= '=' otherlv_2= '{' otherlv_3= 'name' otherlv_4= '=' ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= 'textureFile1' otherlv_7= '=' ( (lv_textureFile1_8_0= RULE_STRING ) ) otherlv_9= 'textureFile2' otherlv_10= '=' ( (lv_textureFile2_11_0= RULE_STRING ) ) otherlv_12= 'effectFile' otherlv_13= '=' ( (lv_effectFile_14_0= RULE_STRING ) ) (otherlv_15= 'allwaystransparent' otherlv_16= '=' ( (lv_allwaysTransparent_17_0= RULE_BOOL ) ) )? (otherlv_18= 'clicksound' otherlv_19= '=' ( (lv_clickSound_20_0= RULE_ID ) ) )? otherlv_21= '}' ) ;
    public final EObject ruleMaskedShieldType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_textureFile1_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_textureFile2_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_effectFile_14_0=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token lv_allwaysTransparent_17_0=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token lv_clickSound_20_0=null;
        Token otherlv_21=null;


        	enterRule();

        try {
            // InternalCk2Gfx.g:2182:2: ( (otherlv_0= 'maskedShieldType' otherlv_1= '=' otherlv_2= '{' otherlv_3= 'name' otherlv_4= '=' ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= 'textureFile1' otherlv_7= '=' ( (lv_textureFile1_8_0= RULE_STRING ) ) otherlv_9= 'textureFile2' otherlv_10= '=' ( (lv_textureFile2_11_0= RULE_STRING ) ) otherlv_12= 'effectFile' otherlv_13= '=' ( (lv_effectFile_14_0= RULE_STRING ) ) (otherlv_15= 'allwaystransparent' otherlv_16= '=' ( (lv_allwaysTransparent_17_0= RULE_BOOL ) ) )? (otherlv_18= 'clicksound' otherlv_19= '=' ( (lv_clickSound_20_0= RULE_ID ) ) )? otherlv_21= '}' ) )
            // InternalCk2Gfx.g:2183:2: (otherlv_0= 'maskedShieldType' otherlv_1= '=' otherlv_2= '{' otherlv_3= 'name' otherlv_4= '=' ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= 'textureFile1' otherlv_7= '=' ( (lv_textureFile1_8_0= RULE_STRING ) ) otherlv_9= 'textureFile2' otherlv_10= '=' ( (lv_textureFile2_11_0= RULE_STRING ) ) otherlv_12= 'effectFile' otherlv_13= '=' ( (lv_effectFile_14_0= RULE_STRING ) ) (otherlv_15= 'allwaystransparent' otherlv_16= '=' ( (lv_allwaysTransparent_17_0= RULE_BOOL ) ) )? (otherlv_18= 'clicksound' otherlv_19= '=' ( (lv_clickSound_20_0= RULE_ID ) ) )? otherlv_21= '}' )
            {
            // InternalCk2Gfx.g:2183:2: (otherlv_0= 'maskedShieldType' otherlv_1= '=' otherlv_2= '{' otherlv_3= 'name' otherlv_4= '=' ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= 'textureFile1' otherlv_7= '=' ( (lv_textureFile1_8_0= RULE_STRING ) ) otherlv_9= 'textureFile2' otherlv_10= '=' ( (lv_textureFile2_11_0= RULE_STRING ) ) otherlv_12= 'effectFile' otherlv_13= '=' ( (lv_effectFile_14_0= RULE_STRING ) ) (otherlv_15= 'allwaystransparent' otherlv_16= '=' ( (lv_allwaysTransparent_17_0= RULE_BOOL ) ) )? (otherlv_18= 'clicksound' otherlv_19= '=' ( (lv_clickSound_20_0= RULE_ID ) ) )? otherlv_21= '}' )
            // InternalCk2Gfx.g:2184:3: otherlv_0= 'maskedShieldType' otherlv_1= '=' otherlv_2= '{' otherlv_3= 'name' otherlv_4= '=' ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= 'textureFile1' otherlv_7= '=' ( (lv_textureFile1_8_0= RULE_STRING ) ) otherlv_9= 'textureFile2' otherlv_10= '=' ( (lv_textureFile2_11_0= RULE_STRING ) ) otherlv_12= 'effectFile' otherlv_13= '=' ( (lv_effectFile_14_0= RULE_STRING ) ) (otherlv_15= 'allwaystransparent' otherlv_16= '=' ( (lv_allwaysTransparent_17_0= RULE_BOOL ) ) )? (otherlv_18= 'clicksound' otherlv_19= '=' ( (lv_clickSound_20_0= RULE_ID ) ) )? otherlv_21= '}'
            {
            otherlv_0=(Token)match(input,58,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getMaskedShieldTypeAccess().getMaskedShieldTypeKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getMaskedShieldTypeAccess().getEqualsSignKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getMaskedShieldTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,23,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getMaskedShieldTypeAccess().getNameKeyword_3());
            		
            otherlv_4=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getMaskedShieldTypeAccess().getEqualsSignKeyword_4());
            		
            // InternalCk2Gfx.g:2204:3: ( (lv_name_5_0= RULE_STRING ) )
            // InternalCk2Gfx.g:2205:4: (lv_name_5_0= RULE_STRING )
            {
            // InternalCk2Gfx.g:2205:4: (lv_name_5_0= RULE_STRING )
            // InternalCk2Gfx.g:2206:5: lv_name_5_0= RULE_STRING
            {
            lv_name_5_0=(Token)match(input,RULE_STRING,FOLLOW_51); 

            					newLeafNode(lv_name_5_0, grammarAccess.getMaskedShieldTypeAccess().getNameSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMaskedShieldTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_5_0,
            						"ck2xtext.common.Ck2Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,47,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getMaskedShieldTypeAccess().getTextureFile1Keyword_6());
            		
            otherlv_7=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_7, grammarAccess.getMaskedShieldTypeAccess().getEqualsSignKeyword_7());
            		
            // InternalCk2Gfx.g:2230:3: ( (lv_textureFile1_8_0= RULE_STRING ) )
            // InternalCk2Gfx.g:2231:4: (lv_textureFile1_8_0= RULE_STRING )
            {
            // InternalCk2Gfx.g:2231:4: (lv_textureFile1_8_0= RULE_STRING )
            // InternalCk2Gfx.g:2232:5: lv_textureFile1_8_0= RULE_STRING
            {
            lv_textureFile1_8_0=(Token)match(input,RULE_STRING,FOLLOW_52); 

            					newLeafNode(lv_textureFile1_8_0, grammarAccess.getMaskedShieldTypeAccess().getTextureFile1STRINGTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMaskedShieldTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"textureFile1",
            						lv_textureFile1_8_0,
            						"ck2xtext.common.Ck2Terminals.STRING");
            				

            }


            }

            otherlv_9=(Token)match(input,48,FOLLOW_8); 

            			newLeafNode(otherlv_9, grammarAccess.getMaskedShieldTypeAccess().getTextureFile2Keyword_9());
            		
            otherlv_10=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_10, grammarAccess.getMaskedShieldTypeAccess().getEqualsSignKeyword_10());
            		
            // InternalCk2Gfx.g:2256:3: ( (lv_textureFile2_11_0= RULE_STRING ) )
            // InternalCk2Gfx.g:2257:4: (lv_textureFile2_11_0= RULE_STRING )
            {
            // InternalCk2Gfx.g:2257:4: (lv_textureFile2_11_0= RULE_STRING )
            // InternalCk2Gfx.g:2258:5: lv_textureFile2_11_0= RULE_STRING
            {
            lv_textureFile2_11_0=(Token)match(input,RULE_STRING,FOLLOW_41); 

            					newLeafNode(lv_textureFile2_11_0, grammarAccess.getMaskedShieldTypeAccess().getTextureFile2STRINGTerminalRuleCall_11_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMaskedShieldTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"textureFile2",
            						lv_textureFile2_11_0,
            						"ck2xtext.common.Ck2Terminals.STRING");
            				

            }


            }

            otherlv_12=(Token)match(input,32,FOLLOW_8); 

            			newLeafNode(otherlv_12, grammarAccess.getMaskedShieldTypeAccess().getEffectFileKeyword_12());
            		
            otherlv_13=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_13, grammarAccess.getMaskedShieldTypeAccess().getEqualsSignKeyword_13());
            		
            // InternalCk2Gfx.g:2282:3: ( (lv_effectFile_14_0= RULE_STRING ) )
            // InternalCk2Gfx.g:2283:4: (lv_effectFile_14_0= RULE_STRING )
            {
            // InternalCk2Gfx.g:2283:4: (lv_effectFile_14_0= RULE_STRING )
            // InternalCk2Gfx.g:2284:5: lv_effectFile_14_0= RULE_STRING
            {
            lv_effectFile_14_0=(Token)match(input,RULE_STRING,FOLLOW_53); 

            					newLeafNode(lv_effectFile_14_0, grammarAccess.getMaskedShieldTypeAccess().getEffectFileSTRINGTerminalRuleCall_14_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMaskedShieldTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"effectFile",
            						lv_effectFile_14_0,
            						"ck2xtext.common.Ck2Terminals.STRING");
            				

            }


            }

            // InternalCk2Gfx.g:2300:3: (otherlv_15= 'allwaystransparent' otherlv_16= '=' ( (lv_allwaysTransparent_17_0= RULE_BOOL ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==29) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalCk2Gfx.g:2301:4: otherlv_15= 'allwaystransparent' otherlv_16= '=' ( (lv_allwaysTransparent_17_0= RULE_BOOL ) )
                    {
                    otherlv_15=(Token)match(input,29,FOLLOW_8); 

                    				newLeafNode(otherlv_15, grammarAccess.getMaskedShieldTypeAccess().getAllwaystransparentKeyword_15_0());
                    			
                    otherlv_16=(Token)match(input,18,FOLLOW_15); 

                    				newLeafNode(otherlv_16, grammarAccess.getMaskedShieldTypeAccess().getEqualsSignKeyword_15_1());
                    			
                    // InternalCk2Gfx.g:2309:4: ( (lv_allwaysTransparent_17_0= RULE_BOOL ) )
                    // InternalCk2Gfx.g:2310:5: (lv_allwaysTransparent_17_0= RULE_BOOL )
                    {
                    // InternalCk2Gfx.g:2310:5: (lv_allwaysTransparent_17_0= RULE_BOOL )
                    // InternalCk2Gfx.g:2311:6: lv_allwaysTransparent_17_0= RULE_BOOL
                    {
                    lv_allwaysTransparent_17_0=(Token)match(input,RULE_BOOL,FOLLOW_54); 

                    						newLeafNode(lv_allwaysTransparent_17_0, grammarAccess.getMaskedShieldTypeAccess().getAllwaysTransparentBOOLTerminalRuleCall_15_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMaskedShieldTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"allwaysTransparent",
                    							lv_allwaysTransparent_17_0,
                    							"ck2xtext.common.Ck2Terminals.BOOL");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCk2Gfx.g:2328:3: (otherlv_18= 'clicksound' otherlv_19= '=' ( (lv_clickSound_20_0= RULE_ID ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==35) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalCk2Gfx.g:2329:4: otherlv_18= 'clicksound' otherlv_19= '=' ( (lv_clickSound_20_0= RULE_ID ) )
                    {
                    otherlv_18=(Token)match(input,35,FOLLOW_8); 

                    				newLeafNode(otherlv_18, grammarAccess.getMaskedShieldTypeAccess().getClicksoundKeyword_16_0());
                    			
                    otherlv_19=(Token)match(input,18,FOLLOW_16); 

                    				newLeafNode(otherlv_19, grammarAccess.getMaskedShieldTypeAccess().getEqualsSignKeyword_16_1());
                    			
                    // InternalCk2Gfx.g:2337:4: ( (lv_clickSound_20_0= RULE_ID ) )
                    // InternalCk2Gfx.g:2338:5: (lv_clickSound_20_0= RULE_ID )
                    {
                    // InternalCk2Gfx.g:2338:5: (lv_clickSound_20_0= RULE_ID )
                    // InternalCk2Gfx.g:2339:6: lv_clickSound_20_0= RULE_ID
                    {
                    lv_clickSound_20_0=(Token)match(input,RULE_ID,FOLLOW_5); 

                    						newLeafNode(lv_clickSound_20_0, grammarAccess.getMaskedShieldTypeAccess().getClickSoundIDTerminalRuleCall_16_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMaskedShieldTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"clickSound",
                    							lv_clickSound_20_0,
                    							"ck2xtext.common.Ck2Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_21=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_21, grammarAccess.getMaskedShieldTypeAccess().getRightCurlyBracketKeyword_17());
            		

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
    // $ANTLR end "ruleMaskedShieldType"


    // $ANTLR start "entryRuleLineChartType"
    // InternalCk2Gfx.g:2364:1: entryRuleLineChartType returns [EObject current=null] : iv_ruleLineChartType= ruleLineChartType EOF ;
    public final EObject entryRuleLineChartType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLineChartType = null;


        try {
            // InternalCk2Gfx.g:2364:54: (iv_ruleLineChartType= ruleLineChartType EOF )
            // InternalCk2Gfx.g:2365:2: iv_ruleLineChartType= ruleLineChartType EOF
            {
             newCompositeNode(grammarAccess.getLineChartTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLineChartType=ruleLineChartType();

            state._fsp--;

             current =iv_ruleLineChartType; 
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
    // $ANTLR end "entryRuleLineChartType"


    // $ANTLR start "ruleLineChartType"
    // InternalCk2Gfx.g:2371:1: ruleLineChartType returns [EObject current=null] : (otherlv_0= 'LineChartType' otherlv_1= '=' otherlv_2= '{' otherlv_3= 'name' otherlv_4= '=' ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= 'size' otherlv_7= '=' ( (lv_size_8_0= ruleCoordinates ) ) otherlv_9= 'linewidth' otherlv_10= '=' ( (lv_lineWidth_11_0= RULE_INT ) ) otherlv_12= '}' ) ;
    public final EObject ruleLineChartType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_lineWidth_11_0=null;
        Token otherlv_12=null;
        EObject lv_size_8_0 = null;



        	enterRule();

        try {
            // InternalCk2Gfx.g:2377:2: ( (otherlv_0= 'LineChartType' otherlv_1= '=' otherlv_2= '{' otherlv_3= 'name' otherlv_4= '=' ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= 'size' otherlv_7= '=' ( (lv_size_8_0= ruleCoordinates ) ) otherlv_9= 'linewidth' otherlv_10= '=' ( (lv_lineWidth_11_0= RULE_INT ) ) otherlv_12= '}' ) )
            // InternalCk2Gfx.g:2378:2: (otherlv_0= 'LineChartType' otherlv_1= '=' otherlv_2= '{' otherlv_3= 'name' otherlv_4= '=' ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= 'size' otherlv_7= '=' ( (lv_size_8_0= ruleCoordinates ) ) otherlv_9= 'linewidth' otherlv_10= '=' ( (lv_lineWidth_11_0= RULE_INT ) ) otherlv_12= '}' )
            {
            // InternalCk2Gfx.g:2378:2: (otherlv_0= 'LineChartType' otherlv_1= '=' otherlv_2= '{' otherlv_3= 'name' otherlv_4= '=' ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= 'size' otherlv_7= '=' ( (lv_size_8_0= ruleCoordinates ) ) otherlv_9= 'linewidth' otherlv_10= '=' ( (lv_lineWidth_11_0= RULE_INT ) ) otherlv_12= '}' )
            // InternalCk2Gfx.g:2379:3: otherlv_0= 'LineChartType' otherlv_1= '=' otherlv_2= '{' otherlv_3= 'name' otherlv_4= '=' ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= 'size' otherlv_7= '=' ( (lv_size_8_0= ruleCoordinates ) ) otherlv_9= 'linewidth' otherlv_10= '=' ( (lv_lineWidth_11_0= RULE_INT ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,59,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getLineChartTypeAccess().getLineChartTypeKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getLineChartTypeAccess().getEqualsSignKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getLineChartTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,23,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getLineChartTypeAccess().getNameKeyword_3());
            		
            otherlv_4=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getLineChartTypeAccess().getEqualsSignKeyword_4());
            		
            // InternalCk2Gfx.g:2399:3: ( (lv_name_5_0= RULE_STRING ) )
            // InternalCk2Gfx.g:2400:4: (lv_name_5_0= RULE_STRING )
            {
            // InternalCk2Gfx.g:2400:4: (lv_name_5_0= RULE_STRING )
            // InternalCk2Gfx.g:2401:5: lv_name_5_0= RULE_STRING
            {
            lv_name_5_0=(Token)match(input,RULE_STRING,FOLLOW_55); 

            					newLeafNode(lv_name_5_0, grammarAccess.getLineChartTypeAccess().getNameSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLineChartTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_5_0,
            						"ck2xtext.common.Ck2Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,41,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getLineChartTypeAccess().getSizeKeyword_6());
            		
            otherlv_7=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_7, grammarAccess.getLineChartTypeAccess().getEqualsSignKeyword_7());
            		
            // InternalCk2Gfx.g:2425:3: ( (lv_size_8_0= ruleCoordinates ) )
            // InternalCk2Gfx.g:2426:4: (lv_size_8_0= ruleCoordinates )
            {
            // InternalCk2Gfx.g:2426:4: (lv_size_8_0= ruleCoordinates )
            // InternalCk2Gfx.g:2427:5: lv_size_8_0= ruleCoordinates
            {

            					newCompositeNode(grammarAccess.getLineChartTypeAccess().getSizeCoordinatesParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_56);
            lv_size_8_0=ruleCoordinates();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLineChartTypeRule());
            					}
            					set(
            						current,
            						"size",
            						lv_size_8_0,
            						"ck2xtext.gfx.Ck2Gfx.Coordinates");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,60,FOLLOW_8); 

            			newLeafNode(otherlv_9, grammarAccess.getLineChartTypeAccess().getLinewidthKeyword_9());
            		
            otherlv_10=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_10, grammarAccess.getLineChartTypeAccess().getEqualsSignKeyword_10());
            		
            // InternalCk2Gfx.g:2452:3: ( (lv_lineWidth_11_0= RULE_INT ) )
            // InternalCk2Gfx.g:2453:4: (lv_lineWidth_11_0= RULE_INT )
            {
            // InternalCk2Gfx.g:2453:4: (lv_lineWidth_11_0= RULE_INT )
            // InternalCk2Gfx.g:2454:5: lv_lineWidth_11_0= RULE_INT
            {
            lv_lineWidth_11_0=(Token)match(input,RULE_INT,FOLLOW_5); 

            					newLeafNode(lv_lineWidth_11_0, grammarAccess.getLineChartTypeAccess().getLineWidthINTTerminalRuleCall_11_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLineChartTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"lineWidth",
            						lv_lineWidth_11_0,
            						"ck2xtext.common.Ck2Terminals.INT");
            				

            }


            }

            otherlv_12=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getLineChartTypeAccess().getRightCurlyBracketKeyword_12());
            		

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
    // $ANTLR end "ruleLineChartType"


    // $ANTLR start "entryRuleCoatOfArmsType"
    // InternalCk2Gfx.g:2478:1: entryRuleCoatOfArmsType returns [EObject current=null] : iv_ruleCoatOfArmsType= ruleCoatOfArmsType EOF ;
    public final EObject entryRuleCoatOfArmsType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoatOfArmsType = null;


        try {
            // InternalCk2Gfx.g:2478:55: (iv_ruleCoatOfArmsType= ruleCoatOfArmsType EOF )
            // InternalCk2Gfx.g:2479:2: iv_ruleCoatOfArmsType= ruleCoatOfArmsType EOF
            {
             newCompositeNode(grammarAccess.getCoatOfArmsTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCoatOfArmsType=ruleCoatOfArmsType();

            state._fsp--;

             current =iv_ruleCoatOfArmsType; 
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
    // $ANTLR end "entryRuleCoatOfArmsType"


    // $ANTLR start "ruleCoatOfArmsType"
    // InternalCk2Gfx.g:2485:1: ruleCoatOfArmsType returns [EObject current=null] : (otherlv_0= 'CoatOfArmsType' otherlv_1= '=' otherlv_2= '{' otherlv_3= 'name' otherlv_4= '=' ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= 'frame' otherlv_7= '=' ( (lv_frame_8_0= RULE_STRING ) ) otherlv_9= 'mask' otherlv_10= '=' ( (lv_mask_11_0= RULE_STRING ) ) otherlv_12= 'seal_overlay' otherlv_13= '=' ( (lv_sealOverlay_14_0= RULE_STRING ) ) otherlv_15= 'effect' otherlv_16= '=' ( (lv_effect_17_0= RULE_STRING ) ) ( (lv_layers_18_0= ruleCoatOfArmsLayer ) )+ otherlv_19= '}' ) ;
    public final EObject ruleCoatOfArmsType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_frame_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_mask_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_sealOverlay_14_0=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token lv_effect_17_0=null;
        Token otherlv_19=null;
        EObject lv_layers_18_0 = null;



        	enterRule();

        try {
            // InternalCk2Gfx.g:2491:2: ( (otherlv_0= 'CoatOfArmsType' otherlv_1= '=' otherlv_2= '{' otherlv_3= 'name' otherlv_4= '=' ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= 'frame' otherlv_7= '=' ( (lv_frame_8_0= RULE_STRING ) ) otherlv_9= 'mask' otherlv_10= '=' ( (lv_mask_11_0= RULE_STRING ) ) otherlv_12= 'seal_overlay' otherlv_13= '=' ( (lv_sealOverlay_14_0= RULE_STRING ) ) otherlv_15= 'effect' otherlv_16= '=' ( (lv_effect_17_0= RULE_STRING ) ) ( (lv_layers_18_0= ruleCoatOfArmsLayer ) )+ otherlv_19= '}' ) )
            // InternalCk2Gfx.g:2492:2: (otherlv_0= 'CoatOfArmsType' otherlv_1= '=' otherlv_2= '{' otherlv_3= 'name' otherlv_4= '=' ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= 'frame' otherlv_7= '=' ( (lv_frame_8_0= RULE_STRING ) ) otherlv_9= 'mask' otherlv_10= '=' ( (lv_mask_11_0= RULE_STRING ) ) otherlv_12= 'seal_overlay' otherlv_13= '=' ( (lv_sealOverlay_14_0= RULE_STRING ) ) otherlv_15= 'effect' otherlv_16= '=' ( (lv_effect_17_0= RULE_STRING ) ) ( (lv_layers_18_0= ruleCoatOfArmsLayer ) )+ otherlv_19= '}' )
            {
            // InternalCk2Gfx.g:2492:2: (otherlv_0= 'CoatOfArmsType' otherlv_1= '=' otherlv_2= '{' otherlv_3= 'name' otherlv_4= '=' ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= 'frame' otherlv_7= '=' ( (lv_frame_8_0= RULE_STRING ) ) otherlv_9= 'mask' otherlv_10= '=' ( (lv_mask_11_0= RULE_STRING ) ) otherlv_12= 'seal_overlay' otherlv_13= '=' ( (lv_sealOverlay_14_0= RULE_STRING ) ) otherlv_15= 'effect' otherlv_16= '=' ( (lv_effect_17_0= RULE_STRING ) ) ( (lv_layers_18_0= ruleCoatOfArmsLayer ) )+ otherlv_19= '}' )
            // InternalCk2Gfx.g:2493:3: otherlv_0= 'CoatOfArmsType' otherlv_1= '=' otherlv_2= '{' otherlv_3= 'name' otherlv_4= '=' ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= 'frame' otherlv_7= '=' ( (lv_frame_8_0= RULE_STRING ) ) otherlv_9= 'mask' otherlv_10= '=' ( (lv_mask_11_0= RULE_STRING ) ) otherlv_12= 'seal_overlay' otherlv_13= '=' ( (lv_sealOverlay_14_0= RULE_STRING ) ) otherlv_15= 'effect' otherlv_16= '=' ( (lv_effect_17_0= RULE_STRING ) ) ( (lv_layers_18_0= ruleCoatOfArmsLayer ) )+ otherlv_19= '}'
            {
            otherlv_0=(Token)match(input,61,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getCoatOfArmsTypeAccess().getCoatOfArmsTypeKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getCoatOfArmsTypeAccess().getEqualsSignKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getCoatOfArmsTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,23,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getCoatOfArmsTypeAccess().getNameKeyword_3());
            		
            otherlv_4=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getCoatOfArmsTypeAccess().getEqualsSignKeyword_4());
            		
            // InternalCk2Gfx.g:2513:3: ( (lv_name_5_0= RULE_STRING ) )
            // InternalCk2Gfx.g:2514:4: (lv_name_5_0= RULE_STRING )
            {
            // InternalCk2Gfx.g:2514:4: (lv_name_5_0= RULE_STRING )
            // InternalCk2Gfx.g:2515:5: lv_name_5_0= RULE_STRING
            {
            lv_name_5_0=(Token)match(input,RULE_STRING,FOLLOW_57); 

            					newLeafNode(lv_name_5_0, grammarAccess.getCoatOfArmsTypeAccess().getNameSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCoatOfArmsTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_5_0,
            						"ck2xtext.common.Ck2Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,62,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getCoatOfArmsTypeAccess().getFrameKeyword_6());
            		
            otherlv_7=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_7, grammarAccess.getCoatOfArmsTypeAccess().getEqualsSignKeyword_7());
            		
            // InternalCk2Gfx.g:2539:3: ( (lv_frame_8_0= RULE_STRING ) )
            // InternalCk2Gfx.g:2540:4: (lv_frame_8_0= RULE_STRING )
            {
            // InternalCk2Gfx.g:2540:4: (lv_frame_8_0= RULE_STRING )
            // InternalCk2Gfx.g:2541:5: lv_frame_8_0= RULE_STRING
            {
            lv_frame_8_0=(Token)match(input,RULE_STRING,FOLLOW_58); 

            					newLeafNode(lv_frame_8_0, grammarAccess.getCoatOfArmsTypeAccess().getFrameSTRINGTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCoatOfArmsTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"frame",
            						lv_frame_8_0,
            						"ck2xtext.common.Ck2Terminals.STRING");
            				

            }


            }

            otherlv_9=(Token)match(input,63,FOLLOW_8); 

            			newLeafNode(otherlv_9, grammarAccess.getCoatOfArmsTypeAccess().getMaskKeyword_9());
            		
            otherlv_10=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_10, grammarAccess.getCoatOfArmsTypeAccess().getEqualsSignKeyword_10());
            		
            // InternalCk2Gfx.g:2565:3: ( (lv_mask_11_0= RULE_STRING ) )
            // InternalCk2Gfx.g:2566:4: (lv_mask_11_0= RULE_STRING )
            {
            // InternalCk2Gfx.g:2566:4: (lv_mask_11_0= RULE_STRING )
            // InternalCk2Gfx.g:2567:5: lv_mask_11_0= RULE_STRING
            {
            lv_mask_11_0=(Token)match(input,RULE_STRING,FOLLOW_59); 

            					newLeafNode(lv_mask_11_0, grammarAccess.getCoatOfArmsTypeAccess().getMaskSTRINGTerminalRuleCall_11_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCoatOfArmsTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"mask",
            						lv_mask_11_0,
            						"ck2xtext.common.Ck2Terminals.STRING");
            				

            }


            }

            otherlv_12=(Token)match(input,64,FOLLOW_8); 

            			newLeafNode(otherlv_12, grammarAccess.getCoatOfArmsTypeAccess().getSeal_overlayKeyword_12());
            		
            otherlv_13=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_13, grammarAccess.getCoatOfArmsTypeAccess().getEqualsSignKeyword_13());
            		
            // InternalCk2Gfx.g:2591:3: ( (lv_sealOverlay_14_0= RULE_STRING ) )
            // InternalCk2Gfx.g:2592:4: (lv_sealOverlay_14_0= RULE_STRING )
            {
            // InternalCk2Gfx.g:2592:4: (lv_sealOverlay_14_0= RULE_STRING )
            // InternalCk2Gfx.g:2593:5: lv_sealOverlay_14_0= RULE_STRING
            {
            lv_sealOverlay_14_0=(Token)match(input,RULE_STRING,FOLLOW_60); 

            					newLeafNode(lv_sealOverlay_14_0, grammarAccess.getCoatOfArmsTypeAccess().getSealOverlaySTRINGTerminalRuleCall_14_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCoatOfArmsTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"sealOverlay",
            						lv_sealOverlay_14_0,
            						"ck2xtext.common.Ck2Terminals.STRING");
            				

            }


            }

            otherlv_15=(Token)match(input,65,FOLLOW_8); 

            			newLeafNode(otherlv_15, grammarAccess.getCoatOfArmsTypeAccess().getEffectKeyword_15());
            		
            otherlv_16=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_16, grammarAccess.getCoatOfArmsTypeAccess().getEqualsSignKeyword_16());
            		
            // InternalCk2Gfx.g:2617:3: ( (lv_effect_17_0= RULE_STRING ) )
            // InternalCk2Gfx.g:2618:4: (lv_effect_17_0= RULE_STRING )
            {
            // InternalCk2Gfx.g:2618:4: (lv_effect_17_0= RULE_STRING )
            // InternalCk2Gfx.g:2619:5: lv_effect_17_0= RULE_STRING
            {
            lv_effect_17_0=(Token)match(input,RULE_STRING,FOLLOW_42); 

            					newLeafNode(lv_effect_17_0, grammarAccess.getCoatOfArmsTypeAccess().getEffectSTRINGTerminalRuleCall_17_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCoatOfArmsTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"effect",
            						lv_effect_17_0,
            						"ck2xtext.common.Ck2Terminals.STRING");
            				

            }


            }

            // InternalCk2Gfx.g:2635:3: ( (lv_layers_18_0= ruleCoatOfArmsLayer ) )+
            int cnt36=0;
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==52) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalCk2Gfx.g:2636:4: (lv_layers_18_0= ruleCoatOfArmsLayer )
            	    {
            	    // InternalCk2Gfx.g:2636:4: (lv_layers_18_0= ruleCoatOfArmsLayer )
            	    // InternalCk2Gfx.g:2637:5: lv_layers_18_0= ruleCoatOfArmsLayer
            	    {

            	    					newCompositeNode(grammarAccess.getCoatOfArmsTypeAccess().getLayersCoatOfArmsLayerParserRuleCall_18_0());
            	    				
            	    pushFollow(FOLLOW_61);
            	    lv_layers_18_0=ruleCoatOfArmsLayer();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCoatOfArmsTypeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"layers",
            	    						lv_layers_18_0,
            	    						"ck2xtext.gfx.Ck2Gfx.CoatOfArmsLayer");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt36 >= 1 ) break loop36;
                        EarlyExitException eee =
                            new EarlyExitException(36, input);
                        throw eee;
                }
                cnt36++;
            } while (true);

            otherlv_19=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getCoatOfArmsTypeAccess().getRightCurlyBracketKeyword_19());
            		

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
    // $ANTLR end "ruleCoatOfArmsType"


    // $ANTLR start "entryRuleCoatOfArmsLayer"
    // InternalCk2Gfx.g:2662:1: entryRuleCoatOfArmsLayer returns [EObject current=null] : iv_ruleCoatOfArmsLayer= ruleCoatOfArmsLayer EOF ;
    public final EObject entryRuleCoatOfArmsLayer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoatOfArmsLayer = null;


        try {
            // InternalCk2Gfx.g:2662:56: (iv_ruleCoatOfArmsLayer= ruleCoatOfArmsLayer EOF )
            // InternalCk2Gfx.g:2663:2: iv_ruleCoatOfArmsLayer= ruleCoatOfArmsLayer EOF
            {
             newCompositeNode(grammarAccess.getCoatOfArmsLayerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCoatOfArmsLayer=ruleCoatOfArmsLayer();

            state._fsp--;

             current =iv_ruleCoatOfArmsLayer; 
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
    // $ANTLR end "entryRuleCoatOfArmsLayer"


    // $ANTLR start "ruleCoatOfArmsLayer"
    // InternalCk2Gfx.g:2669:1: ruleCoatOfArmsLayer returns [EObject current=null] : (otherlv_0= 'layer' otherlv_1= '=' otherlv_2= '{' otherlv_3= 'mask' otherlv_4= '=' ( (lv_mask_5_0= RULE_STRING ) ) otherlv_6= 'center' otherlv_7= '=' ( (lv_center_8_0= ruleCoordinates ) ) otherlv_9= 'scale' otherlv_10= '=' ( (lv_scale_11_0= ruleNumber ) ) otherlv_12= '}' ) ;
    public final EObject ruleCoatOfArmsLayer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_mask_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_center_8_0 = null;

        AntlrDatatypeRuleToken lv_scale_11_0 = null;



        	enterRule();

        try {
            // InternalCk2Gfx.g:2675:2: ( (otherlv_0= 'layer' otherlv_1= '=' otherlv_2= '{' otherlv_3= 'mask' otherlv_4= '=' ( (lv_mask_5_0= RULE_STRING ) ) otherlv_6= 'center' otherlv_7= '=' ( (lv_center_8_0= ruleCoordinates ) ) otherlv_9= 'scale' otherlv_10= '=' ( (lv_scale_11_0= ruleNumber ) ) otherlv_12= '}' ) )
            // InternalCk2Gfx.g:2676:2: (otherlv_0= 'layer' otherlv_1= '=' otherlv_2= '{' otherlv_3= 'mask' otherlv_4= '=' ( (lv_mask_5_0= RULE_STRING ) ) otherlv_6= 'center' otherlv_7= '=' ( (lv_center_8_0= ruleCoordinates ) ) otherlv_9= 'scale' otherlv_10= '=' ( (lv_scale_11_0= ruleNumber ) ) otherlv_12= '}' )
            {
            // InternalCk2Gfx.g:2676:2: (otherlv_0= 'layer' otherlv_1= '=' otherlv_2= '{' otherlv_3= 'mask' otherlv_4= '=' ( (lv_mask_5_0= RULE_STRING ) ) otherlv_6= 'center' otherlv_7= '=' ( (lv_center_8_0= ruleCoordinates ) ) otherlv_9= 'scale' otherlv_10= '=' ( (lv_scale_11_0= ruleNumber ) ) otherlv_12= '}' )
            // InternalCk2Gfx.g:2677:3: otherlv_0= 'layer' otherlv_1= '=' otherlv_2= '{' otherlv_3= 'mask' otherlv_4= '=' ( (lv_mask_5_0= RULE_STRING ) ) otherlv_6= 'center' otherlv_7= '=' ( (lv_center_8_0= ruleCoordinates ) ) otherlv_9= 'scale' otherlv_10= '=' ( (lv_scale_11_0= ruleNumber ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getCoatOfArmsLayerAccess().getLayerKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getCoatOfArmsLayerAccess().getEqualsSignKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_58); 

            			newLeafNode(otherlv_2, grammarAccess.getCoatOfArmsLayerAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,63,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getCoatOfArmsLayerAccess().getMaskKeyword_3());
            		
            otherlv_4=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getCoatOfArmsLayerAccess().getEqualsSignKeyword_4());
            		
            // InternalCk2Gfx.g:2697:3: ( (lv_mask_5_0= RULE_STRING ) )
            // InternalCk2Gfx.g:2698:4: (lv_mask_5_0= RULE_STRING )
            {
            // InternalCk2Gfx.g:2698:4: (lv_mask_5_0= RULE_STRING )
            // InternalCk2Gfx.g:2699:5: lv_mask_5_0= RULE_STRING
            {
            lv_mask_5_0=(Token)match(input,RULE_STRING,FOLLOW_62); 

            					newLeafNode(lv_mask_5_0, grammarAccess.getCoatOfArmsLayerAccess().getMaskSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCoatOfArmsLayerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"mask",
            						lv_mask_5_0,
            						"ck2xtext.common.Ck2Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,66,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getCoatOfArmsLayerAccess().getCenterKeyword_6());
            		
            otherlv_7=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_7, grammarAccess.getCoatOfArmsLayerAccess().getEqualsSignKeyword_7());
            		
            // InternalCk2Gfx.g:2723:3: ( (lv_center_8_0= ruleCoordinates ) )
            // InternalCk2Gfx.g:2724:4: (lv_center_8_0= ruleCoordinates )
            {
            // InternalCk2Gfx.g:2724:4: (lv_center_8_0= ruleCoordinates )
            // InternalCk2Gfx.g:2725:5: lv_center_8_0= ruleCoordinates
            {

            					newCompositeNode(grammarAccess.getCoatOfArmsLayerAccess().getCenterCoordinatesParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_63);
            lv_center_8_0=ruleCoordinates();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCoatOfArmsLayerRule());
            					}
            					set(
            						current,
            						"center",
            						lv_center_8_0,
            						"ck2xtext.gfx.Ck2Gfx.Coordinates");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,67,FOLLOW_8); 

            			newLeafNode(otherlv_9, grammarAccess.getCoatOfArmsLayerAccess().getScaleKeyword_9());
            		
            otherlv_10=(Token)match(input,18,FOLLOW_6); 

            			newLeafNode(otherlv_10, grammarAccess.getCoatOfArmsLayerAccess().getEqualsSignKeyword_10());
            		
            // InternalCk2Gfx.g:2750:3: ( (lv_scale_11_0= ruleNumber ) )
            // InternalCk2Gfx.g:2751:4: (lv_scale_11_0= ruleNumber )
            {
            // InternalCk2Gfx.g:2751:4: (lv_scale_11_0= ruleNumber )
            // InternalCk2Gfx.g:2752:5: lv_scale_11_0= ruleNumber
            {

            					newCompositeNode(grammarAccess.getCoatOfArmsLayerAccess().getScaleNumberParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_5);
            lv_scale_11_0=ruleNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCoatOfArmsLayerRule());
            					}
            					set(
            						current,
            						"scale",
            						lv_scale_11_0,
            						"ck2xtext.common.Ck2Terminals.Number");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_12=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getCoatOfArmsLayerAccess().getRightCurlyBracketKeyword_12());
            		

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
    // $ANTLR end "ruleCoatOfArmsLayer"


    // $ANTLR start "entryRuleObjectTypes"
    // InternalCk2Gfx.g:2777:1: entryRuleObjectTypes returns [EObject current=null] : iv_ruleObjectTypes= ruleObjectTypes EOF ;
    public final EObject entryRuleObjectTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectTypes = null;


        try {
            // InternalCk2Gfx.g:2777:52: (iv_ruleObjectTypes= ruleObjectTypes EOF )
            // InternalCk2Gfx.g:2778:2: iv_ruleObjectTypes= ruleObjectTypes EOF
            {
             newCompositeNode(grammarAccess.getObjectTypesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObjectTypes=ruleObjectTypes();

            state._fsp--;

             current =iv_ruleObjectTypes; 
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
    // $ANTLR end "entryRuleObjectTypes"


    // $ANTLR start "ruleObjectTypes"
    // InternalCk2Gfx.g:2784:1: ruleObjectTypes returns [EObject current=null] : ( () otherlv_1= 'objectTypes' otherlv_2= '=' otherlv_3= '{' ( ( (lv_types_4_1= ruleEMFXActorType | lv_types_4_2= rulePdxmesh | lv_types_4_3= ruleArrowType ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleObjectTypes() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_types_4_1 = null;

        EObject lv_types_4_2 = null;

        EObject lv_types_4_3 = null;



        	enterRule();

        try {
            // InternalCk2Gfx.g:2790:2: ( ( () otherlv_1= 'objectTypes' otherlv_2= '=' otherlv_3= '{' ( ( (lv_types_4_1= ruleEMFXActorType | lv_types_4_2= rulePdxmesh | lv_types_4_3= ruleArrowType ) ) )* otherlv_5= '}' ) )
            // InternalCk2Gfx.g:2791:2: ( () otherlv_1= 'objectTypes' otherlv_2= '=' otherlv_3= '{' ( ( (lv_types_4_1= ruleEMFXActorType | lv_types_4_2= rulePdxmesh | lv_types_4_3= ruleArrowType ) ) )* otherlv_5= '}' )
            {
            // InternalCk2Gfx.g:2791:2: ( () otherlv_1= 'objectTypes' otherlv_2= '=' otherlv_3= '{' ( ( (lv_types_4_1= ruleEMFXActorType | lv_types_4_2= rulePdxmesh | lv_types_4_3= ruleArrowType ) ) )* otherlv_5= '}' )
            // InternalCk2Gfx.g:2792:3: () otherlv_1= 'objectTypes' otherlv_2= '=' otherlv_3= '{' ( ( (lv_types_4_1= ruleEMFXActorType | lv_types_4_2= rulePdxmesh | lv_types_4_3= ruleArrowType ) ) )* otherlv_5= '}'
            {
            // InternalCk2Gfx.g:2792:3: ()
            // InternalCk2Gfx.g:2793:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getObjectTypesAccess().getObjectTypesAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,68,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getObjectTypesAccess().getObjectTypesKeyword_1());
            		
            otherlv_2=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getObjectTypesAccess().getEqualsSignKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_64); 

            			newLeafNode(otherlv_3, grammarAccess.getObjectTypesAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCk2Gfx.g:2811:3: ( ( (lv_types_4_1= ruleEMFXActorType | lv_types_4_2= rulePdxmesh | lv_types_4_3= ruleArrowType ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==69||(LA38_0>=80 && LA38_0<=81)) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalCk2Gfx.g:2812:4: ( (lv_types_4_1= ruleEMFXActorType | lv_types_4_2= rulePdxmesh | lv_types_4_3= ruleArrowType ) )
            	    {
            	    // InternalCk2Gfx.g:2812:4: ( (lv_types_4_1= ruleEMFXActorType | lv_types_4_2= rulePdxmesh | lv_types_4_3= ruleArrowType ) )
            	    // InternalCk2Gfx.g:2813:5: (lv_types_4_1= ruleEMFXActorType | lv_types_4_2= rulePdxmesh | lv_types_4_3= ruleArrowType )
            	    {
            	    // InternalCk2Gfx.g:2813:5: (lv_types_4_1= ruleEMFXActorType | lv_types_4_2= rulePdxmesh | lv_types_4_3= ruleArrowType )
            	    int alt37=3;
            	    switch ( input.LA(1) ) {
            	    case 69:
            	        {
            	        alt37=1;
            	        }
            	        break;
            	    case 80:
            	        {
            	        alt37=2;
            	        }
            	        break;
            	    case 81:
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
            	            // InternalCk2Gfx.g:2814:6: lv_types_4_1= ruleEMFXActorType
            	            {

            	            						newCompositeNode(grammarAccess.getObjectTypesAccess().getTypesEMFXActorTypeParserRuleCall_4_0_0());
            	            					
            	            pushFollow(FOLLOW_64);
            	            lv_types_4_1=ruleEMFXActorType();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getObjectTypesRule());
            	            						}
            	            						add(
            	            							current,
            	            							"types",
            	            							lv_types_4_1,
            	            							"ck2xtext.gfx.Ck2Gfx.EMFXActorType");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalCk2Gfx.g:2830:6: lv_types_4_2= rulePdxmesh
            	            {

            	            						newCompositeNode(grammarAccess.getObjectTypesAccess().getTypesPdxmeshParserRuleCall_4_0_1());
            	            					
            	            pushFollow(FOLLOW_64);
            	            lv_types_4_2=rulePdxmesh();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getObjectTypesRule());
            	            						}
            	            						add(
            	            							current,
            	            							"types",
            	            							lv_types_4_2,
            	            							"ck2xtext.gfx.Ck2Gfx.Pdxmesh");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 3 :
            	            // InternalCk2Gfx.g:2846:6: lv_types_4_3= ruleArrowType
            	            {

            	            						newCompositeNode(grammarAccess.getObjectTypesAccess().getTypesArrowTypeParserRuleCall_4_0_2());
            	            					
            	            pushFollow(FOLLOW_64);
            	            lv_types_4_3=ruleArrowType();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getObjectTypesRule());
            	            						}
            	            						add(
            	            							current,
            	            							"types",
            	            							lv_types_4_3,
            	            							"ck2xtext.gfx.Ck2Gfx.ArrowType");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            otherlv_5=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getObjectTypesAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleObjectTypes"


    // $ANTLR start "entryRuleEMFXActorType"
    // InternalCk2Gfx.g:2872:1: entryRuleEMFXActorType returns [EObject current=null] : iv_ruleEMFXActorType= ruleEMFXActorType EOF ;
    public final EObject entryRuleEMFXActorType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEMFXActorType = null;


        try {
            // InternalCk2Gfx.g:2872:54: (iv_ruleEMFXActorType= ruleEMFXActorType EOF )
            // InternalCk2Gfx.g:2873:2: iv_ruleEMFXActorType= ruleEMFXActorType EOF
            {
             newCompositeNode(grammarAccess.getEMFXActorTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEMFXActorType=ruleEMFXActorType();

            state._fsp--;

             current =iv_ruleEMFXActorType; 
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
    // $ANTLR end "entryRuleEMFXActorType"


    // $ANTLR start "ruleEMFXActorType"
    // InternalCk2Gfx.g:2879:1: ruleEMFXActorType returns [EObject current=null] : (otherlv_0= 'EMFXActorType' otherlv_1= '=' otherlv_2= '{' otherlv_3= 'name' otherlv_4= '=' ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= 'actorfile' otherlv_7= '=' ( (lv_actorFile_8_0= RULE_STRING ) ) ( (lv_animation_9_0= ruleAnimation ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_11= 'idle' otherlv_12= '=' ( (lv_idle_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'move' otherlv_15= '=' ( (lv_move_16_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'attack' otherlv_18= '=' ( (lv_attack_19_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'scale' otherlv_21= '=' ( (lv_scale_22_0= ruleDouble ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'use_animation' otherlv_24= '=' ( (lv_useAnimation_25_0= RULE_BOOL ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'cull_distance' otherlv_27= '=' ( (lv_cullDistance_28_0= ruleDouble ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'scale_on_cull_distance' otherlv_30= '=' ( (lv_scaleOnCullDistance_31_0= RULE_BOOL ) ) ) ) ) ) )+ {...}?) ) ) otherlv_32= '}' ) ;
    public final EObject ruleEMFXActorType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_actorFile_8_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_idle_13_0=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token lv_move_16_0=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token lv_attack_19_0=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token lv_useAnimation_25_0=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token lv_scaleOnCullDistance_31_0=null;
        Token otherlv_32=null;
        EObject lv_animation_9_0 = null;

        AntlrDatatypeRuleToken lv_scale_22_0 = null;

        AntlrDatatypeRuleToken lv_cullDistance_28_0 = null;



        	enterRule();

        try {
            // InternalCk2Gfx.g:2885:2: ( (otherlv_0= 'EMFXActorType' otherlv_1= '=' otherlv_2= '{' otherlv_3= 'name' otherlv_4= '=' ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= 'actorfile' otherlv_7= '=' ( (lv_actorFile_8_0= RULE_STRING ) ) ( (lv_animation_9_0= ruleAnimation ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_11= 'idle' otherlv_12= '=' ( (lv_idle_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'move' otherlv_15= '=' ( (lv_move_16_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'attack' otherlv_18= '=' ( (lv_attack_19_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'scale' otherlv_21= '=' ( (lv_scale_22_0= ruleDouble ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'use_animation' otherlv_24= '=' ( (lv_useAnimation_25_0= RULE_BOOL ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'cull_distance' otherlv_27= '=' ( (lv_cullDistance_28_0= ruleDouble ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'scale_on_cull_distance' otherlv_30= '=' ( (lv_scaleOnCullDistance_31_0= RULE_BOOL ) ) ) ) ) ) )+ {...}?) ) ) otherlv_32= '}' ) )
            // InternalCk2Gfx.g:2886:2: (otherlv_0= 'EMFXActorType' otherlv_1= '=' otherlv_2= '{' otherlv_3= 'name' otherlv_4= '=' ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= 'actorfile' otherlv_7= '=' ( (lv_actorFile_8_0= RULE_STRING ) ) ( (lv_animation_9_0= ruleAnimation ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_11= 'idle' otherlv_12= '=' ( (lv_idle_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'move' otherlv_15= '=' ( (lv_move_16_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'attack' otherlv_18= '=' ( (lv_attack_19_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'scale' otherlv_21= '=' ( (lv_scale_22_0= ruleDouble ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'use_animation' otherlv_24= '=' ( (lv_useAnimation_25_0= RULE_BOOL ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'cull_distance' otherlv_27= '=' ( (lv_cullDistance_28_0= ruleDouble ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'scale_on_cull_distance' otherlv_30= '=' ( (lv_scaleOnCullDistance_31_0= RULE_BOOL ) ) ) ) ) ) )+ {...}?) ) ) otherlv_32= '}' )
            {
            // InternalCk2Gfx.g:2886:2: (otherlv_0= 'EMFXActorType' otherlv_1= '=' otherlv_2= '{' otherlv_3= 'name' otherlv_4= '=' ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= 'actorfile' otherlv_7= '=' ( (lv_actorFile_8_0= RULE_STRING ) ) ( (lv_animation_9_0= ruleAnimation ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_11= 'idle' otherlv_12= '=' ( (lv_idle_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'move' otherlv_15= '=' ( (lv_move_16_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'attack' otherlv_18= '=' ( (lv_attack_19_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'scale' otherlv_21= '=' ( (lv_scale_22_0= ruleDouble ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'use_animation' otherlv_24= '=' ( (lv_useAnimation_25_0= RULE_BOOL ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'cull_distance' otherlv_27= '=' ( (lv_cullDistance_28_0= ruleDouble ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'scale_on_cull_distance' otherlv_30= '=' ( (lv_scaleOnCullDistance_31_0= RULE_BOOL ) ) ) ) ) ) )+ {...}?) ) ) otherlv_32= '}' )
            // InternalCk2Gfx.g:2887:3: otherlv_0= 'EMFXActorType' otherlv_1= '=' otherlv_2= '{' otherlv_3= 'name' otherlv_4= '=' ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= 'actorfile' otherlv_7= '=' ( (lv_actorFile_8_0= RULE_STRING ) ) ( (lv_animation_9_0= ruleAnimation ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_11= 'idle' otherlv_12= '=' ( (lv_idle_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'move' otherlv_15= '=' ( (lv_move_16_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'attack' otherlv_18= '=' ( (lv_attack_19_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'scale' otherlv_21= '=' ( (lv_scale_22_0= ruleDouble ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'use_animation' otherlv_24= '=' ( (lv_useAnimation_25_0= RULE_BOOL ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'cull_distance' otherlv_27= '=' ( (lv_cullDistance_28_0= ruleDouble ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'scale_on_cull_distance' otherlv_30= '=' ( (lv_scaleOnCullDistance_31_0= RULE_BOOL ) ) ) ) ) ) )+ {...}?) ) ) otherlv_32= '}'
            {
            otherlv_0=(Token)match(input,69,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getEMFXActorTypeAccess().getEMFXActorTypeKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getEMFXActorTypeAccess().getEqualsSignKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getEMFXActorTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,23,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getEMFXActorTypeAccess().getNameKeyword_3());
            		
            otherlv_4=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getEMFXActorTypeAccess().getEqualsSignKeyword_4());
            		
            // InternalCk2Gfx.g:2907:3: ( (lv_name_5_0= RULE_STRING ) )
            // InternalCk2Gfx.g:2908:4: (lv_name_5_0= RULE_STRING )
            {
            // InternalCk2Gfx.g:2908:4: (lv_name_5_0= RULE_STRING )
            // InternalCk2Gfx.g:2909:5: lv_name_5_0= RULE_STRING
            {
            lv_name_5_0=(Token)match(input,RULE_STRING,FOLLOW_65); 

            					newLeafNode(lv_name_5_0, grammarAccess.getEMFXActorTypeAccess().getNameSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEMFXActorTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_5_0,
            						"ck2xtext.common.Ck2Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,70,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getEMFXActorTypeAccess().getActorfileKeyword_6());
            		
            otherlv_7=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_7, grammarAccess.getEMFXActorTypeAccess().getEqualsSignKeyword_7());
            		
            // InternalCk2Gfx.g:2933:3: ( (lv_actorFile_8_0= RULE_STRING ) )
            // InternalCk2Gfx.g:2934:4: (lv_actorFile_8_0= RULE_STRING )
            {
            // InternalCk2Gfx.g:2934:4: (lv_actorFile_8_0= RULE_STRING )
            // InternalCk2Gfx.g:2935:5: lv_actorFile_8_0= RULE_STRING
            {
            lv_actorFile_8_0=(Token)match(input,RULE_STRING,FOLLOW_66); 

            					newLeafNode(lv_actorFile_8_0, grammarAccess.getEMFXActorTypeAccess().getActorFileSTRINGTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEMFXActorTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"actorFile",
            						lv_actorFile_8_0,
            						"ck2xtext.common.Ck2Terminals.STRING");
            				

            }


            }

            // InternalCk2Gfx.g:2951:3: ( (lv_animation_9_0= ruleAnimation ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==77) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalCk2Gfx.g:2952:4: (lv_animation_9_0= ruleAnimation )
                    {
                    // InternalCk2Gfx.g:2952:4: (lv_animation_9_0= ruleAnimation )
                    // InternalCk2Gfx.g:2953:5: lv_animation_9_0= ruleAnimation
                    {

                    					newCompositeNode(grammarAccess.getEMFXActorTypeAccess().getAnimationAnimationParserRuleCall_9_0());
                    				
                    pushFollow(FOLLOW_67);
                    lv_animation_9_0=ruleAnimation();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEMFXActorTypeRule());
                    					}
                    					set(
                    						current,
                    						"animation",
                    						lv_animation_9_0,
                    						"ck2xtext.gfx.Ck2Gfx.Animation");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalCk2Gfx.g:2970:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_11= 'idle' otherlv_12= '=' ( (lv_idle_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'move' otherlv_15= '=' ( (lv_move_16_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'attack' otherlv_18= '=' ( (lv_attack_19_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'scale' otherlv_21= '=' ( (lv_scale_22_0= ruleDouble ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'use_animation' otherlv_24= '=' ( (lv_useAnimation_25_0= RULE_BOOL ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'cull_distance' otherlv_27= '=' ( (lv_cullDistance_28_0= ruleDouble ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'scale_on_cull_distance' otherlv_30= '=' ( (lv_scaleOnCullDistance_31_0= RULE_BOOL ) ) ) ) ) ) )+ {...}?) ) )
            // InternalCk2Gfx.g:2971:4: ( ( ( ({...}? => ( ({...}? => (otherlv_11= 'idle' otherlv_12= '=' ( (lv_idle_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'move' otherlv_15= '=' ( (lv_move_16_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'attack' otherlv_18= '=' ( (lv_attack_19_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'scale' otherlv_21= '=' ( (lv_scale_22_0= ruleDouble ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'use_animation' otherlv_24= '=' ( (lv_useAnimation_25_0= RULE_BOOL ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'cull_distance' otherlv_27= '=' ( (lv_cullDistance_28_0= ruleDouble ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'scale_on_cull_distance' otherlv_30= '=' ( (lv_scaleOnCullDistance_31_0= RULE_BOOL ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalCk2Gfx.g:2971:4: ( ( ( ({...}? => ( ({...}? => (otherlv_11= 'idle' otherlv_12= '=' ( (lv_idle_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'move' otherlv_15= '=' ( (lv_move_16_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'attack' otherlv_18= '=' ( (lv_attack_19_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'scale' otherlv_21= '=' ( (lv_scale_22_0= ruleDouble ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'use_animation' otherlv_24= '=' ( (lv_useAnimation_25_0= RULE_BOOL ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'cull_distance' otherlv_27= '=' ( (lv_cullDistance_28_0= ruleDouble ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'scale_on_cull_distance' otherlv_30= '=' ( (lv_scaleOnCullDistance_31_0= RULE_BOOL ) ) ) ) ) ) )+ {...}?) )
            // InternalCk2Gfx.g:2972:5: ( ( ({...}? => ( ({...}? => (otherlv_11= 'idle' otherlv_12= '=' ( (lv_idle_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'move' otherlv_15= '=' ( (lv_move_16_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'attack' otherlv_18= '=' ( (lv_attack_19_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'scale' otherlv_21= '=' ( (lv_scale_22_0= ruleDouble ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'use_animation' otherlv_24= '=' ( (lv_useAnimation_25_0= RULE_BOOL ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'cull_distance' otherlv_27= '=' ( (lv_cullDistance_28_0= ruleDouble ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'scale_on_cull_distance' otherlv_30= '=' ( (lv_scaleOnCullDistance_31_0= RULE_BOOL ) ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getEMFXActorTypeAccess().getUnorderedGroup_10());
            				
            // InternalCk2Gfx.g:2975:5: ( ( ({...}? => ( ({...}? => (otherlv_11= 'idle' otherlv_12= '=' ( (lv_idle_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'move' otherlv_15= '=' ( (lv_move_16_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'attack' otherlv_18= '=' ( (lv_attack_19_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'scale' otherlv_21= '=' ( (lv_scale_22_0= ruleDouble ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'use_animation' otherlv_24= '=' ( (lv_useAnimation_25_0= RULE_BOOL ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'cull_distance' otherlv_27= '=' ( (lv_cullDistance_28_0= ruleDouble ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'scale_on_cull_distance' otherlv_30= '=' ( (lv_scaleOnCullDistance_31_0= RULE_BOOL ) ) ) ) ) ) )+ {...}?)
            // InternalCk2Gfx.g:2976:6: ( ({...}? => ( ({...}? => (otherlv_11= 'idle' otherlv_12= '=' ( (lv_idle_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'move' otherlv_15= '=' ( (lv_move_16_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'attack' otherlv_18= '=' ( (lv_attack_19_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'scale' otherlv_21= '=' ( (lv_scale_22_0= ruleDouble ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'use_animation' otherlv_24= '=' ( (lv_useAnimation_25_0= RULE_BOOL ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'cull_distance' otherlv_27= '=' ( (lv_cullDistance_28_0= ruleDouble ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'scale_on_cull_distance' otherlv_30= '=' ( (lv_scaleOnCullDistance_31_0= RULE_BOOL ) ) ) ) ) ) )+ {...}?
            {
            // InternalCk2Gfx.g:2976:6: ( ({...}? => ( ({...}? => (otherlv_11= 'idle' otherlv_12= '=' ( (lv_idle_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'move' otherlv_15= '=' ( (lv_move_16_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'attack' otherlv_18= '=' ( (lv_attack_19_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'scale' otherlv_21= '=' ( (lv_scale_22_0= ruleDouble ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'use_animation' otherlv_24= '=' ( (lv_useAnimation_25_0= RULE_BOOL ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'cull_distance' otherlv_27= '=' ( (lv_cullDistance_28_0= ruleDouble ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'scale_on_cull_distance' otherlv_30= '=' ( (lv_scaleOnCullDistance_31_0= RULE_BOOL ) ) ) ) ) ) )+
            int cnt40=0;
            loop40:
            do {
                int alt40=8;
                int LA40_0 = input.LA(1);

                if ( LA40_0 == 71 && getUnorderedGroupHelper().canSelect(grammarAccess.getEMFXActorTypeAccess().getUnorderedGroup_10(), 0) ) {
                    alt40=1;
                }
                else if ( LA40_0 == 72 && getUnorderedGroupHelper().canSelect(grammarAccess.getEMFXActorTypeAccess().getUnorderedGroup_10(), 1) ) {
                    alt40=2;
                }
                else if ( LA40_0 == 73 && getUnorderedGroupHelper().canSelect(grammarAccess.getEMFXActorTypeAccess().getUnorderedGroup_10(), 2) ) {
                    alt40=3;
                }
                else if ( LA40_0 == 67 && getUnorderedGroupHelper().canSelect(grammarAccess.getEMFXActorTypeAccess().getUnorderedGroup_10(), 3) ) {
                    alt40=4;
                }
                else if ( LA40_0 == 74 && getUnorderedGroupHelper().canSelect(grammarAccess.getEMFXActorTypeAccess().getUnorderedGroup_10(), 4) ) {
                    alt40=5;
                }
                else if ( LA40_0 == 75 && getUnorderedGroupHelper().canSelect(grammarAccess.getEMFXActorTypeAccess().getUnorderedGroup_10(), 5) ) {
                    alt40=6;
                }
                else if ( LA40_0 == 76 && getUnorderedGroupHelper().canSelect(grammarAccess.getEMFXActorTypeAccess().getUnorderedGroup_10(), 6) ) {
                    alt40=7;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalCk2Gfx.g:2977:4: ({...}? => ( ({...}? => (otherlv_11= 'idle' otherlv_12= '=' ( (lv_idle_13_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalCk2Gfx.g:2977:4: ({...}? => ( ({...}? => (otherlv_11= 'idle' otherlv_12= '=' ( (lv_idle_13_0= RULE_STRING ) ) ) ) ) )
            	    // InternalCk2Gfx.g:2978:5: {...}? => ( ({...}? => (otherlv_11= 'idle' otherlv_12= '=' ( (lv_idle_13_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEMFXActorTypeAccess().getUnorderedGroup_10(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEMFXActorType", "getUnorderedGroupHelper().canSelect(grammarAccess.getEMFXActorTypeAccess().getUnorderedGroup_10(), 0)");
            	    }
            	    // InternalCk2Gfx.g:2978:111: ( ({...}? => (otherlv_11= 'idle' otherlv_12= '=' ( (lv_idle_13_0= RULE_STRING ) ) ) ) )
            	    // InternalCk2Gfx.g:2979:6: ({...}? => (otherlv_11= 'idle' otherlv_12= '=' ( (lv_idle_13_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEMFXActorTypeAccess().getUnorderedGroup_10(), 0);
            	    					
            	    // InternalCk2Gfx.g:2982:9: ({...}? => (otherlv_11= 'idle' otherlv_12= '=' ( (lv_idle_13_0= RULE_STRING ) ) ) )
            	    // InternalCk2Gfx.g:2982:10: {...}? => (otherlv_11= 'idle' otherlv_12= '=' ( (lv_idle_13_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEMFXActorType", "true");
            	    }
            	    // InternalCk2Gfx.g:2982:19: (otherlv_11= 'idle' otherlv_12= '=' ( (lv_idle_13_0= RULE_STRING ) ) )
            	    // InternalCk2Gfx.g:2982:20: otherlv_11= 'idle' otherlv_12= '=' ( (lv_idle_13_0= RULE_STRING ) )
            	    {
            	    otherlv_11=(Token)match(input,71,FOLLOW_8); 

            	    									newLeafNode(otherlv_11, grammarAccess.getEMFXActorTypeAccess().getIdleKeyword_10_0_0());
            	    								
            	    otherlv_12=(Token)match(input,18,FOLLOW_13); 

            	    									newLeafNode(otherlv_12, grammarAccess.getEMFXActorTypeAccess().getEqualsSignKeyword_10_0_1());
            	    								
            	    // InternalCk2Gfx.g:2990:9: ( (lv_idle_13_0= RULE_STRING ) )
            	    // InternalCk2Gfx.g:2991:10: (lv_idle_13_0= RULE_STRING )
            	    {
            	    // InternalCk2Gfx.g:2991:10: (lv_idle_13_0= RULE_STRING )
            	    // InternalCk2Gfx.g:2992:11: lv_idle_13_0= RULE_STRING
            	    {
            	    lv_idle_13_0=(Token)match(input,RULE_STRING,FOLLOW_68); 

            	    											newLeafNode(lv_idle_13_0, grammarAccess.getEMFXActorTypeAccess().getIdleSTRINGTerminalRuleCall_10_0_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getEMFXActorTypeRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"idle",
            	    												lv_idle_13_0,
            	    												"ck2xtext.common.Ck2Terminals.STRING");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEMFXActorTypeAccess().getUnorderedGroup_10());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalCk2Gfx.g:3014:4: ({...}? => ( ({...}? => (otherlv_14= 'move' otherlv_15= '=' ( (lv_move_16_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalCk2Gfx.g:3014:4: ({...}? => ( ({...}? => (otherlv_14= 'move' otherlv_15= '=' ( (lv_move_16_0= RULE_STRING ) ) ) ) ) )
            	    // InternalCk2Gfx.g:3015:5: {...}? => ( ({...}? => (otherlv_14= 'move' otherlv_15= '=' ( (lv_move_16_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEMFXActorTypeAccess().getUnorderedGroup_10(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEMFXActorType", "getUnorderedGroupHelper().canSelect(grammarAccess.getEMFXActorTypeAccess().getUnorderedGroup_10(), 1)");
            	    }
            	    // InternalCk2Gfx.g:3015:111: ( ({...}? => (otherlv_14= 'move' otherlv_15= '=' ( (lv_move_16_0= RULE_STRING ) ) ) ) )
            	    // InternalCk2Gfx.g:3016:6: ({...}? => (otherlv_14= 'move' otherlv_15= '=' ( (lv_move_16_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEMFXActorTypeAccess().getUnorderedGroup_10(), 1);
            	    					
            	    // InternalCk2Gfx.g:3019:9: ({...}? => (otherlv_14= 'move' otherlv_15= '=' ( (lv_move_16_0= RULE_STRING ) ) ) )
            	    // InternalCk2Gfx.g:3019:10: {...}? => (otherlv_14= 'move' otherlv_15= '=' ( (lv_move_16_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEMFXActorType", "true");
            	    }
            	    // InternalCk2Gfx.g:3019:19: (otherlv_14= 'move' otherlv_15= '=' ( (lv_move_16_0= RULE_STRING ) ) )
            	    // InternalCk2Gfx.g:3019:20: otherlv_14= 'move' otherlv_15= '=' ( (lv_move_16_0= RULE_STRING ) )
            	    {
            	    otherlv_14=(Token)match(input,72,FOLLOW_8); 

            	    									newLeafNode(otherlv_14, grammarAccess.getEMFXActorTypeAccess().getMoveKeyword_10_1_0());
            	    								
            	    otherlv_15=(Token)match(input,18,FOLLOW_13); 

            	    									newLeafNode(otherlv_15, grammarAccess.getEMFXActorTypeAccess().getEqualsSignKeyword_10_1_1());
            	    								
            	    // InternalCk2Gfx.g:3027:9: ( (lv_move_16_0= RULE_STRING ) )
            	    // InternalCk2Gfx.g:3028:10: (lv_move_16_0= RULE_STRING )
            	    {
            	    // InternalCk2Gfx.g:3028:10: (lv_move_16_0= RULE_STRING )
            	    // InternalCk2Gfx.g:3029:11: lv_move_16_0= RULE_STRING
            	    {
            	    lv_move_16_0=(Token)match(input,RULE_STRING,FOLLOW_68); 

            	    											newLeafNode(lv_move_16_0, grammarAccess.getEMFXActorTypeAccess().getMoveSTRINGTerminalRuleCall_10_1_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getEMFXActorTypeRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"move",
            	    												lv_move_16_0,
            	    												"ck2xtext.common.Ck2Terminals.STRING");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEMFXActorTypeAccess().getUnorderedGroup_10());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalCk2Gfx.g:3051:4: ({...}? => ( ({...}? => (otherlv_17= 'attack' otherlv_18= '=' ( (lv_attack_19_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalCk2Gfx.g:3051:4: ({...}? => ( ({...}? => (otherlv_17= 'attack' otherlv_18= '=' ( (lv_attack_19_0= RULE_STRING ) ) ) ) ) )
            	    // InternalCk2Gfx.g:3052:5: {...}? => ( ({...}? => (otherlv_17= 'attack' otherlv_18= '=' ( (lv_attack_19_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEMFXActorTypeAccess().getUnorderedGroup_10(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEMFXActorType", "getUnorderedGroupHelper().canSelect(grammarAccess.getEMFXActorTypeAccess().getUnorderedGroup_10(), 2)");
            	    }
            	    // InternalCk2Gfx.g:3052:111: ( ({...}? => (otherlv_17= 'attack' otherlv_18= '=' ( (lv_attack_19_0= RULE_STRING ) ) ) ) )
            	    // InternalCk2Gfx.g:3053:6: ({...}? => (otherlv_17= 'attack' otherlv_18= '=' ( (lv_attack_19_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEMFXActorTypeAccess().getUnorderedGroup_10(), 2);
            	    					
            	    // InternalCk2Gfx.g:3056:9: ({...}? => (otherlv_17= 'attack' otherlv_18= '=' ( (lv_attack_19_0= RULE_STRING ) ) ) )
            	    // InternalCk2Gfx.g:3056:10: {...}? => (otherlv_17= 'attack' otherlv_18= '=' ( (lv_attack_19_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEMFXActorType", "true");
            	    }
            	    // InternalCk2Gfx.g:3056:19: (otherlv_17= 'attack' otherlv_18= '=' ( (lv_attack_19_0= RULE_STRING ) ) )
            	    // InternalCk2Gfx.g:3056:20: otherlv_17= 'attack' otherlv_18= '=' ( (lv_attack_19_0= RULE_STRING ) )
            	    {
            	    otherlv_17=(Token)match(input,73,FOLLOW_8); 

            	    									newLeafNode(otherlv_17, grammarAccess.getEMFXActorTypeAccess().getAttackKeyword_10_2_0());
            	    								
            	    otherlv_18=(Token)match(input,18,FOLLOW_13); 

            	    									newLeafNode(otherlv_18, grammarAccess.getEMFXActorTypeAccess().getEqualsSignKeyword_10_2_1());
            	    								
            	    // InternalCk2Gfx.g:3064:9: ( (lv_attack_19_0= RULE_STRING ) )
            	    // InternalCk2Gfx.g:3065:10: (lv_attack_19_0= RULE_STRING )
            	    {
            	    // InternalCk2Gfx.g:3065:10: (lv_attack_19_0= RULE_STRING )
            	    // InternalCk2Gfx.g:3066:11: lv_attack_19_0= RULE_STRING
            	    {
            	    lv_attack_19_0=(Token)match(input,RULE_STRING,FOLLOW_68); 

            	    											newLeafNode(lv_attack_19_0, grammarAccess.getEMFXActorTypeAccess().getAttackSTRINGTerminalRuleCall_10_2_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getEMFXActorTypeRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"attack",
            	    												lv_attack_19_0,
            	    												"ck2xtext.common.Ck2Terminals.STRING");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEMFXActorTypeAccess().getUnorderedGroup_10());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalCk2Gfx.g:3088:4: ({...}? => ( ({...}? => (otherlv_20= 'scale' otherlv_21= '=' ( (lv_scale_22_0= ruleDouble ) ) ) ) ) )
            	    {
            	    // InternalCk2Gfx.g:3088:4: ({...}? => ( ({...}? => (otherlv_20= 'scale' otherlv_21= '=' ( (lv_scale_22_0= ruleDouble ) ) ) ) ) )
            	    // InternalCk2Gfx.g:3089:5: {...}? => ( ({...}? => (otherlv_20= 'scale' otherlv_21= '=' ( (lv_scale_22_0= ruleDouble ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEMFXActorTypeAccess().getUnorderedGroup_10(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleEMFXActorType", "getUnorderedGroupHelper().canSelect(grammarAccess.getEMFXActorTypeAccess().getUnorderedGroup_10(), 3)");
            	    }
            	    // InternalCk2Gfx.g:3089:111: ( ({...}? => (otherlv_20= 'scale' otherlv_21= '=' ( (lv_scale_22_0= ruleDouble ) ) ) ) )
            	    // InternalCk2Gfx.g:3090:6: ({...}? => (otherlv_20= 'scale' otherlv_21= '=' ( (lv_scale_22_0= ruleDouble ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEMFXActorTypeAccess().getUnorderedGroup_10(), 3);
            	    					
            	    // InternalCk2Gfx.g:3093:9: ({...}? => (otherlv_20= 'scale' otherlv_21= '=' ( (lv_scale_22_0= ruleDouble ) ) ) )
            	    // InternalCk2Gfx.g:3093:10: {...}? => (otherlv_20= 'scale' otherlv_21= '=' ( (lv_scale_22_0= ruleDouble ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEMFXActorType", "true");
            	    }
            	    // InternalCk2Gfx.g:3093:19: (otherlv_20= 'scale' otherlv_21= '=' ( (lv_scale_22_0= ruleDouble ) ) )
            	    // InternalCk2Gfx.g:3093:20: otherlv_20= 'scale' otherlv_21= '=' ( (lv_scale_22_0= ruleDouble ) )
            	    {
            	    otherlv_20=(Token)match(input,67,FOLLOW_8); 

            	    									newLeafNode(otherlv_20, grammarAccess.getEMFXActorTypeAccess().getScaleKeyword_10_3_0());
            	    								
            	    otherlv_21=(Token)match(input,18,FOLLOW_6); 

            	    									newLeafNode(otherlv_21, grammarAccess.getEMFXActorTypeAccess().getEqualsSignKeyword_10_3_1());
            	    								
            	    // InternalCk2Gfx.g:3101:9: ( (lv_scale_22_0= ruleDouble ) )
            	    // InternalCk2Gfx.g:3102:10: (lv_scale_22_0= ruleDouble )
            	    {
            	    // InternalCk2Gfx.g:3102:10: (lv_scale_22_0= ruleDouble )
            	    // InternalCk2Gfx.g:3103:11: lv_scale_22_0= ruleDouble
            	    {

            	    											newCompositeNode(grammarAccess.getEMFXActorTypeAccess().getScaleDoubleParserRuleCall_10_3_2_0());
            	    										
            	    pushFollow(FOLLOW_68);
            	    lv_scale_22_0=ruleDouble();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getEMFXActorTypeRule());
            	    											}
            	    											set(
            	    												current,
            	    												"scale",
            	    												lv_scale_22_0,
            	    												"ck2xtext.common.Ck2Terminals.Double");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEMFXActorTypeAccess().getUnorderedGroup_10());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalCk2Gfx.g:3126:4: ({...}? => ( ({...}? => (otherlv_23= 'use_animation' otherlv_24= '=' ( (lv_useAnimation_25_0= RULE_BOOL ) ) ) ) ) )
            	    {
            	    // InternalCk2Gfx.g:3126:4: ({...}? => ( ({...}? => (otherlv_23= 'use_animation' otherlv_24= '=' ( (lv_useAnimation_25_0= RULE_BOOL ) ) ) ) ) )
            	    // InternalCk2Gfx.g:3127:5: {...}? => ( ({...}? => (otherlv_23= 'use_animation' otherlv_24= '=' ( (lv_useAnimation_25_0= RULE_BOOL ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEMFXActorTypeAccess().getUnorderedGroup_10(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleEMFXActorType", "getUnorderedGroupHelper().canSelect(grammarAccess.getEMFXActorTypeAccess().getUnorderedGroup_10(), 4)");
            	    }
            	    // InternalCk2Gfx.g:3127:111: ( ({...}? => (otherlv_23= 'use_animation' otherlv_24= '=' ( (lv_useAnimation_25_0= RULE_BOOL ) ) ) ) )
            	    // InternalCk2Gfx.g:3128:6: ({...}? => (otherlv_23= 'use_animation' otherlv_24= '=' ( (lv_useAnimation_25_0= RULE_BOOL ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEMFXActorTypeAccess().getUnorderedGroup_10(), 4);
            	    					
            	    // InternalCk2Gfx.g:3131:9: ({...}? => (otherlv_23= 'use_animation' otherlv_24= '=' ( (lv_useAnimation_25_0= RULE_BOOL ) ) ) )
            	    // InternalCk2Gfx.g:3131:10: {...}? => (otherlv_23= 'use_animation' otherlv_24= '=' ( (lv_useAnimation_25_0= RULE_BOOL ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEMFXActorType", "true");
            	    }
            	    // InternalCk2Gfx.g:3131:19: (otherlv_23= 'use_animation' otherlv_24= '=' ( (lv_useAnimation_25_0= RULE_BOOL ) ) )
            	    // InternalCk2Gfx.g:3131:20: otherlv_23= 'use_animation' otherlv_24= '=' ( (lv_useAnimation_25_0= RULE_BOOL ) )
            	    {
            	    otherlv_23=(Token)match(input,74,FOLLOW_8); 

            	    									newLeafNode(otherlv_23, grammarAccess.getEMFXActorTypeAccess().getUse_animationKeyword_10_4_0());
            	    								
            	    otherlv_24=(Token)match(input,18,FOLLOW_15); 

            	    									newLeafNode(otherlv_24, grammarAccess.getEMFXActorTypeAccess().getEqualsSignKeyword_10_4_1());
            	    								
            	    // InternalCk2Gfx.g:3139:9: ( (lv_useAnimation_25_0= RULE_BOOL ) )
            	    // InternalCk2Gfx.g:3140:10: (lv_useAnimation_25_0= RULE_BOOL )
            	    {
            	    // InternalCk2Gfx.g:3140:10: (lv_useAnimation_25_0= RULE_BOOL )
            	    // InternalCk2Gfx.g:3141:11: lv_useAnimation_25_0= RULE_BOOL
            	    {
            	    lv_useAnimation_25_0=(Token)match(input,RULE_BOOL,FOLLOW_68); 

            	    											newLeafNode(lv_useAnimation_25_0, grammarAccess.getEMFXActorTypeAccess().getUseAnimationBOOLTerminalRuleCall_10_4_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getEMFXActorTypeRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"useAnimation",
            	    												lv_useAnimation_25_0,
            	    												"ck2xtext.common.Ck2Terminals.BOOL");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEMFXActorTypeAccess().getUnorderedGroup_10());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalCk2Gfx.g:3163:4: ({...}? => ( ({...}? => (otherlv_26= 'cull_distance' otherlv_27= '=' ( (lv_cullDistance_28_0= ruleDouble ) ) ) ) ) )
            	    {
            	    // InternalCk2Gfx.g:3163:4: ({...}? => ( ({...}? => (otherlv_26= 'cull_distance' otherlv_27= '=' ( (lv_cullDistance_28_0= ruleDouble ) ) ) ) ) )
            	    // InternalCk2Gfx.g:3164:5: {...}? => ( ({...}? => (otherlv_26= 'cull_distance' otherlv_27= '=' ( (lv_cullDistance_28_0= ruleDouble ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEMFXActorTypeAccess().getUnorderedGroup_10(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleEMFXActorType", "getUnorderedGroupHelper().canSelect(grammarAccess.getEMFXActorTypeAccess().getUnorderedGroup_10(), 5)");
            	    }
            	    // InternalCk2Gfx.g:3164:111: ( ({...}? => (otherlv_26= 'cull_distance' otherlv_27= '=' ( (lv_cullDistance_28_0= ruleDouble ) ) ) ) )
            	    // InternalCk2Gfx.g:3165:6: ({...}? => (otherlv_26= 'cull_distance' otherlv_27= '=' ( (lv_cullDistance_28_0= ruleDouble ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEMFXActorTypeAccess().getUnorderedGroup_10(), 5);
            	    					
            	    // InternalCk2Gfx.g:3168:9: ({...}? => (otherlv_26= 'cull_distance' otherlv_27= '=' ( (lv_cullDistance_28_0= ruleDouble ) ) ) )
            	    // InternalCk2Gfx.g:3168:10: {...}? => (otherlv_26= 'cull_distance' otherlv_27= '=' ( (lv_cullDistance_28_0= ruleDouble ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEMFXActorType", "true");
            	    }
            	    // InternalCk2Gfx.g:3168:19: (otherlv_26= 'cull_distance' otherlv_27= '=' ( (lv_cullDistance_28_0= ruleDouble ) ) )
            	    // InternalCk2Gfx.g:3168:20: otherlv_26= 'cull_distance' otherlv_27= '=' ( (lv_cullDistance_28_0= ruleDouble ) )
            	    {
            	    otherlv_26=(Token)match(input,75,FOLLOW_8); 

            	    									newLeafNode(otherlv_26, grammarAccess.getEMFXActorTypeAccess().getCull_distanceKeyword_10_5_0());
            	    								
            	    otherlv_27=(Token)match(input,18,FOLLOW_6); 

            	    									newLeafNode(otherlv_27, grammarAccess.getEMFXActorTypeAccess().getEqualsSignKeyword_10_5_1());
            	    								
            	    // InternalCk2Gfx.g:3176:9: ( (lv_cullDistance_28_0= ruleDouble ) )
            	    // InternalCk2Gfx.g:3177:10: (lv_cullDistance_28_0= ruleDouble )
            	    {
            	    // InternalCk2Gfx.g:3177:10: (lv_cullDistance_28_0= ruleDouble )
            	    // InternalCk2Gfx.g:3178:11: lv_cullDistance_28_0= ruleDouble
            	    {

            	    											newCompositeNode(grammarAccess.getEMFXActorTypeAccess().getCullDistanceDoubleParserRuleCall_10_5_2_0());
            	    										
            	    pushFollow(FOLLOW_68);
            	    lv_cullDistance_28_0=ruleDouble();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getEMFXActorTypeRule());
            	    											}
            	    											set(
            	    												current,
            	    												"cullDistance",
            	    												lv_cullDistance_28_0,
            	    												"ck2xtext.common.Ck2Terminals.Double");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEMFXActorTypeAccess().getUnorderedGroup_10());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalCk2Gfx.g:3201:4: ({...}? => ( ({...}? => (otherlv_29= 'scale_on_cull_distance' otherlv_30= '=' ( (lv_scaleOnCullDistance_31_0= RULE_BOOL ) ) ) ) ) )
            	    {
            	    // InternalCk2Gfx.g:3201:4: ({...}? => ( ({...}? => (otherlv_29= 'scale_on_cull_distance' otherlv_30= '=' ( (lv_scaleOnCullDistance_31_0= RULE_BOOL ) ) ) ) ) )
            	    // InternalCk2Gfx.g:3202:5: {...}? => ( ({...}? => (otherlv_29= 'scale_on_cull_distance' otherlv_30= '=' ( (lv_scaleOnCullDistance_31_0= RULE_BOOL ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEMFXActorTypeAccess().getUnorderedGroup_10(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleEMFXActorType", "getUnorderedGroupHelper().canSelect(grammarAccess.getEMFXActorTypeAccess().getUnorderedGroup_10(), 6)");
            	    }
            	    // InternalCk2Gfx.g:3202:111: ( ({...}? => (otherlv_29= 'scale_on_cull_distance' otherlv_30= '=' ( (lv_scaleOnCullDistance_31_0= RULE_BOOL ) ) ) ) )
            	    // InternalCk2Gfx.g:3203:6: ({...}? => (otherlv_29= 'scale_on_cull_distance' otherlv_30= '=' ( (lv_scaleOnCullDistance_31_0= RULE_BOOL ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEMFXActorTypeAccess().getUnorderedGroup_10(), 6);
            	    					
            	    // InternalCk2Gfx.g:3206:9: ({...}? => (otherlv_29= 'scale_on_cull_distance' otherlv_30= '=' ( (lv_scaleOnCullDistance_31_0= RULE_BOOL ) ) ) )
            	    // InternalCk2Gfx.g:3206:10: {...}? => (otherlv_29= 'scale_on_cull_distance' otherlv_30= '=' ( (lv_scaleOnCullDistance_31_0= RULE_BOOL ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEMFXActorType", "true");
            	    }
            	    // InternalCk2Gfx.g:3206:19: (otherlv_29= 'scale_on_cull_distance' otherlv_30= '=' ( (lv_scaleOnCullDistance_31_0= RULE_BOOL ) ) )
            	    // InternalCk2Gfx.g:3206:20: otherlv_29= 'scale_on_cull_distance' otherlv_30= '=' ( (lv_scaleOnCullDistance_31_0= RULE_BOOL ) )
            	    {
            	    otherlv_29=(Token)match(input,76,FOLLOW_8); 

            	    									newLeafNode(otherlv_29, grammarAccess.getEMFXActorTypeAccess().getScale_on_cull_distanceKeyword_10_6_0());
            	    								
            	    otherlv_30=(Token)match(input,18,FOLLOW_15); 

            	    									newLeafNode(otherlv_30, grammarAccess.getEMFXActorTypeAccess().getEqualsSignKeyword_10_6_1());
            	    								
            	    // InternalCk2Gfx.g:3214:9: ( (lv_scaleOnCullDistance_31_0= RULE_BOOL ) )
            	    // InternalCk2Gfx.g:3215:10: (lv_scaleOnCullDistance_31_0= RULE_BOOL )
            	    {
            	    // InternalCk2Gfx.g:3215:10: (lv_scaleOnCullDistance_31_0= RULE_BOOL )
            	    // InternalCk2Gfx.g:3216:11: lv_scaleOnCullDistance_31_0= RULE_BOOL
            	    {
            	    lv_scaleOnCullDistance_31_0=(Token)match(input,RULE_BOOL,FOLLOW_68); 

            	    											newLeafNode(lv_scaleOnCullDistance_31_0, grammarAccess.getEMFXActorTypeAccess().getScaleOnCullDistanceBOOLTerminalRuleCall_10_6_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getEMFXActorTypeRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"scaleOnCullDistance",
            	    												lv_scaleOnCullDistance_31_0,
            	    												"ck2xtext.common.Ck2Terminals.BOOL");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEMFXActorTypeAccess().getUnorderedGroup_10());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt40 >= 1 ) break loop40;
                        EarlyExitException eee =
                            new EarlyExitException(40, input);
                        throw eee;
                }
                cnt40++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getEMFXActorTypeAccess().getUnorderedGroup_10()) ) {
                throw new FailedPredicateException(input, "ruleEMFXActorType", "getUnorderedGroupHelper().canLeave(grammarAccess.getEMFXActorTypeAccess().getUnorderedGroup_10())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getEMFXActorTypeAccess().getUnorderedGroup_10());
            				

            }

            otherlv_32=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_32, grammarAccess.getEMFXActorTypeAccess().getRightCurlyBracketKeyword_11());
            		

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
    // $ANTLR end "ruleEMFXActorType"


    // $ANTLR start "entryRuleAnimation"
    // InternalCk2Gfx.g:3254:1: entryRuleAnimation returns [EObject current=null] : iv_ruleAnimation= ruleAnimation EOF ;
    public final EObject entryRuleAnimation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnimation = null;


        try {
            // InternalCk2Gfx.g:3254:50: (iv_ruleAnimation= ruleAnimation EOF )
            // InternalCk2Gfx.g:3255:2: iv_ruleAnimation= ruleAnimation EOF
            {
             newCompositeNode(grammarAccess.getAnimationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnimation=ruleAnimation();

            state._fsp--;

             current =iv_ruleAnimation; 
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
    // $ANTLR end "entryRuleAnimation"


    // $ANTLR start "ruleAnimation"
    // InternalCk2Gfx.g:3261:1: ruleAnimation returns [EObject current=null] : (otherlv_0= 'animation' otherlv_1= '=' otherlv_2= '{' otherlv_3= 'name' otherlv_4= '=' ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= 'file' otherlv_7= '=' ( (lv_file_8_0= RULE_STRING ) ) otherlv_9= 'defaultAnimationTime' otherlv_10= '=' ( (lv_defaultAnimationTime_11_0= ruleNumber ) ) otherlv_12= '}' ) ;
    public final EObject ruleAnimation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_file_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_defaultAnimationTime_11_0 = null;



        	enterRule();

        try {
            // InternalCk2Gfx.g:3267:2: ( (otherlv_0= 'animation' otherlv_1= '=' otherlv_2= '{' otherlv_3= 'name' otherlv_4= '=' ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= 'file' otherlv_7= '=' ( (lv_file_8_0= RULE_STRING ) ) otherlv_9= 'defaultAnimationTime' otherlv_10= '=' ( (lv_defaultAnimationTime_11_0= ruleNumber ) ) otherlv_12= '}' ) )
            // InternalCk2Gfx.g:3268:2: (otherlv_0= 'animation' otherlv_1= '=' otherlv_2= '{' otherlv_3= 'name' otherlv_4= '=' ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= 'file' otherlv_7= '=' ( (lv_file_8_0= RULE_STRING ) ) otherlv_9= 'defaultAnimationTime' otherlv_10= '=' ( (lv_defaultAnimationTime_11_0= ruleNumber ) ) otherlv_12= '}' )
            {
            // InternalCk2Gfx.g:3268:2: (otherlv_0= 'animation' otherlv_1= '=' otherlv_2= '{' otherlv_3= 'name' otherlv_4= '=' ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= 'file' otherlv_7= '=' ( (lv_file_8_0= RULE_STRING ) ) otherlv_9= 'defaultAnimationTime' otherlv_10= '=' ( (lv_defaultAnimationTime_11_0= ruleNumber ) ) otherlv_12= '}' )
            // InternalCk2Gfx.g:3269:3: otherlv_0= 'animation' otherlv_1= '=' otherlv_2= '{' otherlv_3= 'name' otherlv_4= '=' ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= 'file' otherlv_7= '=' ( (lv_file_8_0= RULE_STRING ) ) otherlv_9= 'defaultAnimationTime' otherlv_10= '=' ( (lv_defaultAnimationTime_11_0= ruleNumber ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,77,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getAnimationAccess().getAnimationKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getAnimationAccess().getEqualsSignKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getAnimationAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,23,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getAnimationAccess().getNameKeyword_3());
            		
            otherlv_4=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getAnimationAccess().getEqualsSignKeyword_4());
            		
            // InternalCk2Gfx.g:3289:3: ( (lv_name_5_0= RULE_STRING ) )
            // InternalCk2Gfx.g:3290:4: (lv_name_5_0= RULE_STRING )
            {
            // InternalCk2Gfx.g:3290:4: (lv_name_5_0= RULE_STRING )
            // InternalCk2Gfx.g:3291:5: lv_name_5_0= RULE_STRING
            {
            lv_name_5_0=(Token)match(input,RULE_STRING,FOLLOW_69); 

            					newLeafNode(lv_name_5_0, grammarAccess.getAnimationAccess().getNameSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAnimationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_5_0,
            						"ck2xtext.common.Ck2Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,78,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getAnimationAccess().getFileKeyword_6());
            		
            otherlv_7=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_7, grammarAccess.getAnimationAccess().getEqualsSignKeyword_7());
            		
            // InternalCk2Gfx.g:3315:3: ( (lv_file_8_0= RULE_STRING ) )
            // InternalCk2Gfx.g:3316:4: (lv_file_8_0= RULE_STRING )
            {
            // InternalCk2Gfx.g:3316:4: (lv_file_8_0= RULE_STRING )
            // InternalCk2Gfx.g:3317:5: lv_file_8_0= RULE_STRING
            {
            lv_file_8_0=(Token)match(input,RULE_STRING,FOLLOW_70); 

            					newLeafNode(lv_file_8_0, grammarAccess.getAnimationAccess().getFileSTRINGTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAnimationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"file",
            						lv_file_8_0,
            						"ck2xtext.common.Ck2Terminals.STRING");
            				

            }


            }

            otherlv_9=(Token)match(input,79,FOLLOW_8); 

            			newLeafNode(otherlv_9, grammarAccess.getAnimationAccess().getDefaultAnimationTimeKeyword_9());
            		
            otherlv_10=(Token)match(input,18,FOLLOW_6); 

            			newLeafNode(otherlv_10, grammarAccess.getAnimationAccess().getEqualsSignKeyword_10());
            		
            // InternalCk2Gfx.g:3341:3: ( (lv_defaultAnimationTime_11_0= ruleNumber ) )
            // InternalCk2Gfx.g:3342:4: (lv_defaultAnimationTime_11_0= ruleNumber )
            {
            // InternalCk2Gfx.g:3342:4: (lv_defaultAnimationTime_11_0= ruleNumber )
            // InternalCk2Gfx.g:3343:5: lv_defaultAnimationTime_11_0= ruleNumber
            {

            					newCompositeNode(grammarAccess.getAnimationAccess().getDefaultAnimationTimeNumberParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_5);
            lv_defaultAnimationTime_11_0=ruleNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAnimationRule());
            					}
            					set(
            						current,
            						"defaultAnimationTime",
            						lv_defaultAnimationTime_11_0,
            						"ck2xtext.common.Ck2Terminals.Number");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_12=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getAnimationAccess().getRightCurlyBracketKeyword_12());
            		

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
    // $ANTLR end "ruleAnimation"


    // $ANTLR start "entryRulePdxmesh"
    // InternalCk2Gfx.g:3368:1: entryRulePdxmesh returns [EObject current=null] : iv_rulePdxmesh= rulePdxmesh EOF ;
    public final EObject entryRulePdxmesh() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePdxmesh = null;


        try {
            // InternalCk2Gfx.g:3368:48: (iv_rulePdxmesh= rulePdxmesh EOF )
            // InternalCk2Gfx.g:3369:2: iv_rulePdxmesh= rulePdxmesh EOF
            {
             newCompositeNode(grammarAccess.getPdxmeshRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePdxmesh=rulePdxmesh();

            state._fsp--;

             current =iv_rulePdxmesh; 
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
    // $ANTLR end "entryRulePdxmesh"


    // $ANTLR start "rulePdxmesh"
    // InternalCk2Gfx.g:3375:1: rulePdxmesh returns [EObject current=null] : (otherlv_0= 'pdxmesh' otherlv_1= '=' otherlv_2= '{' otherlv_3= 'name' otherlv_4= '=' ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= 'file' otherlv_7= '=' ( (lv_actorFile_8_0= RULE_STRING ) ) otherlv_9= 'scale' otherlv_10= '=' ( (lv_scale_11_0= ruleNumber ) ) (otherlv_12= 'cull_distance' otherlv_13= '=' ( (lv_cullDistance_14_0= ruleDouble ) ) )? (otherlv_15= 'scale_on_cull_distance' otherlv_16= '=' ( (lv_scaleOnCullDistance_17_0= RULE_BOOL ) ) )? otherlv_18= '}' ) ;
    public final EObject rulePdxmesh() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_actorFile_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token lv_scaleOnCullDistance_17_0=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_scale_11_0 = null;

        AntlrDatatypeRuleToken lv_cullDistance_14_0 = null;



        	enterRule();

        try {
            // InternalCk2Gfx.g:3381:2: ( (otherlv_0= 'pdxmesh' otherlv_1= '=' otherlv_2= '{' otherlv_3= 'name' otherlv_4= '=' ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= 'file' otherlv_7= '=' ( (lv_actorFile_8_0= RULE_STRING ) ) otherlv_9= 'scale' otherlv_10= '=' ( (lv_scale_11_0= ruleNumber ) ) (otherlv_12= 'cull_distance' otherlv_13= '=' ( (lv_cullDistance_14_0= ruleDouble ) ) )? (otherlv_15= 'scale_on_cull_distance' otherlv_16= '=' ( (lv_scaleOnCullDistance_17_0= RULE_BOOL ) ) )? otherlv_18= '}' ) )
            // InternalCk2Gfx.g:3382:2: (otherlv_0= 'pdxmesh' otherlv_1= '=' otherlv_2= '{' otherlv_3= 'name' otherlv_4= '=' ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= 'file' otherlv_7= '=' ( (lv_actorFile_8_0= RULE_STRING ) ) otherlv_9= 'scale' otherlv_10= '=' ( (lv_scale_11_0= ruleNumber ) ) (otherlv_12= 'cull_distance' otherlv_13= '=' ( (lv_cullDistance_14_0= ruleDouble ) ) )? (otherlv_15= 'scale_on_cull_distance' otherlv_16= '=' ( (lv_scaleOnCullDistance_17_0= RULE_BOOL ) ) )? otherlv_18= '}' )
            {
            // InternalCk2Gfx.g:3382:2: (otherlv_0= 'pdxmesh' otherlv_1= '=' otherlv_2= '{' otherlv_3= 'name' otherlv_4= '=' ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= 'file' otherlv_7= '=' ( (lv_actorFile_8_0= RULE_STRING ) ) otherlv_9= 'scale' otherlv_10= '=' ( (lv_scale_11_0= ruleNumber ) ) (otherlv_12= 'cull_distance' otherlv_13= '=' ( (lv_cullDistance_14_0= ruleDouble ) ) )? (otherlv_15= 'scale_on_cull_distance' otherlv_16= '=' ( (lv_scaleOnCullDistance_17_0= RULE_BOOL ) ) )? otherlv_18= '}' )
            // InternalCk2Gfx.g:3383:3: otherlv_0= 'pdxmesh' otherlv_1= '=' otherlv_2= '{' otherlv_3= 'name' otherlv_4= '=' ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= 'file' otherlv_7= '=' ( (lv_actorFile_8_0= RULE_STRING ) ) otherlv_9= 'scale' otherlv_10= '=' ( (lv_scale_11_0= ruleNumber ) ) (otherlv_12= 'cull_distance' otherlv_13= '=' ( (lv_cullDistance_14_0= ruleDouble ) ) )? (otherlv_15= 'scale_on_cull_distance' otherlv_16= '=' ( (lv_scaleOnCullDistance_17_0= RULE_BOOL ) ) )? otherlv_18= '}'
            {
            otherlv_0=(Token)match(input,80,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getPdxmeshAccess().getPdxmeshKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getPdxmeshAccess().getEqualsSignKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getPdxmeshAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,23,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getPdxmeshAccess().getNameKeyword_3());
            		
            otherlv_4=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getPdxmeshAccess().getEqualsSignKeyword_4());
            		
            // InternalCk2Gfx.g:3403:3: ( (lv_name_5_0= RULE_STRING ) )
            // InternalCk2Gfx.g:3404:4: (lv_name_5_0= RULE_STRING )
            {
            // InternalCk2Gfx.g:3404:4: (lv_name_5_0= RULE_STRING )
            // InternalCk2Gfx.g:3405:5: lv_name_5_0= RULE_STRING
            {
            lv_name_5_0=(Token)match(input,RULE_STRING,FOLLOW_69); 

            					newLeafNode(lv_name_5_0, grammarAccess.getPdxmeshAccess().getNameSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPdxmeshRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_5_0,
            						"ck2xtext.common.Ck2Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,78,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getPdxmeshAccess().getFileKeyword_6());
            		
            otherlv_7=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_7, grammarAccess.getPdxmeshAccess().getEqualsSignKeyword_7());
            		
            // InternalCk2Gfx.g:3429:3: ( (lv_actorFile_8_0= RULE_STRING ) )
            // InternalCk2Gfx.g:3430:4: (lv_actorFile_8_0= RULE_STRING )
            {
            // InternalCk2Gfx.g:3430:4: (lv_actorFile_8_0= RULE_STRING )
            // InternalCk2Gfx.g:3431:5: lv_actorFile_8_0= RULE_STRING
            {
            lv_actorFile_8_0=(Token)match(input,RULE_STRING,FOLLOW_63); 

            					newLeafNode(lv_actorFile_8_0, grammarAccess.getPdxmeshAccess().getActorFileSTRINGTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPdxmeshRule());
            					}
            					setWithLastConsumed(
            						current,
            						"actorFile",
            						lv_actorFile_8_0,
            						"ck2xtext.common.Ck2Terminals.STRING");
            				

            }


            }

            otherlv_9=(Token)match(input,67,FOLLOW_8); 

            			newLeafNode(otherlv_9, grammarAccess.getPdxmeshAccess().getScaleKeyword_9());
            		
            otherlv_10=(Token)match(input,18,FOLLOW_6); 

            			newLeafNode(otherlv_10, grammarAccess.getPdxmeshAccess().getEqualsSignKeyword_10());
            		
            // InternalCk2Gfx.g:3455:3: ( (lv_scale_11_0= ruleNumber ) )
            // InternalCk2Gfx.g:3456:4: (lv_scale_11_0= ruleNumber )
            {
            // InternalCk2Gfx.g:3456:4: (lv_scale_11_0= ruleNumber )
            // InternalCk2Gfx.g:3457:5: lv_scale_11_0= ruleNumber
            {

            					newCompositeNode(grammarAccess.getPdxmeshAccess().getScaleNumberParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_71);
            lv_scale_11_0=ruleNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPdxmeshRule());
            					}
            					set(
            						current,
            						"scale",
            						lv_scale_11_0,
            						"ck2xtext.common.Ck2Terminals.Number");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCk2Gfx.g:3474:3: (otherlv_12= 'cull_distance' otherlv_13= '=' ( (lv_cullDistance_14_0= ruleDouble ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==75) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalCk2Gfx.g:3475:4: otherlv_12= 'cull_distance' otherlv_13= '=' ( (lv_cullDistance_14_0= ruleDouble ) )
                    {
                    otherlv_12=(Token)match(input,75,FOLLOW_8); 

                    				newLeafNode(otherlv_12, grammarAccess.getPdxmeshAccess().getCull_distanceKeyword_12_0());
                    			
                    otherlv_13=(Token)match(input,18,FOLLOW_6); 

                    				newLeafNode(otherlv_13, grammarAccess.getPdxmeshAccess().getEqualsSignKeyword_12_1());
                    			
                    // InternalCk2Gfx.g:3483:4: ( (lv_cullDistance_14_0= ruleDouble ) )
                    // InternalCk2Gfx.g:3484:5: (lv_cullDistance_14_0= ruleDouble )
                    {
                    // InternalCk2Gfx.g:3484:5: (lv_cullDistance_14_0= ruleDouble )
                    // InternalCk2Gfx.g:3485:6: lv_cullDistance_14_0= ruleDouble
                    {

                    						newCompositeNode(grammarAccess.getPdxmeshAccess().getCullDistanceDoubleParserRuleCall_12_2_0());
                    					
                    pushFollow(FOLLOW_72);
                    lv_cullDistance_14_0=ruleDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPdxmeshRule());
                    						}
                    						set(
                    							current,
                    							"cullDistance",
                    							lv_cullDistance_14_0,
                    							"ck2xtext.common.Ck2Terminals.Double");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCk2Gfx.g:3503:3: (otherlv_15= 'scale_on_cull_distance' otherlv_16= '=' ( (lv_scaleOnCullDistance_17_0= RULE_BOOL ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==76) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalCk2Gfx.g:3504:4: otherlv_15= 'scale_on_cull_distance' otherlv_16= '=' ( (lv_scaleOnCullDistance_17_0= RULE_BOOL ) )
                    {
                    otherlv_15=(Token)match(input,76,FOLLOW_8); 

                    				newLeafNode(otherlv_15, grammarAccess.getPdxmeshAccess().getScale_on_cull_distanceKeyword_13_0());
                    			
                    otherlv_16=(Token)match(input,18,FOLLOW_15); 

                    				newLeafNode(otherlv_16, grammarAccess.getPdxmeshAccess().getEqualsSignKeyword_13_1());
                    			
                    // InternalCk2Gfx.g:3512:4: ( (lv_scaleOnCullDistance_17_0= RULE_BOOL ) )
                    // InternalCk2Gfx.g:3513:5: (lv_scaleOnCullDistance_17_0= RULE_BOOL )
                    {
                    // InternalCk2Gfx.g:3513:5: (lv_scaleOnCullDistance_17_0= RULE_BOOL )
                    // InternalCk2Gfx.g:3514:6: lv_scaleOnCullDistance_17_0= RULE_BOOL
                    {
                    lv_scaleOnCullDistance_17_0=(Token)match(input,RULE_BOOL,FOLLOW_5); 

                    						newLeafNode(lv_scaleOnCullDistance_17_0, grammarAccess.getPdxmeshAccess().getScaleOnCullDistanceBOOLTerminalRuleCall_13_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPdxmeshRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"scaleOnCullDistance",
                    							lv_scaleOnCullDistance_17_0,
                    							"ck2xtext.common.Ck2Terminals.BOOL");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_18=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getPdxmeshAccess().getRightCurlyBracketKeyword_14());
            		

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
    // $ANTLR end "rulePdxmesh"


    // $ANTLR start "entryRuleArrowType"
    // InternalCk2Gfx.g:3539:1: entryRuleArrowType returns [EObject current=null] : iv_ruleArrowType= ruleArrowType EOF ;
    public final EObject entryRuleArrowType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrowType = null;


        try {
            // InternalCk2Gfx.g:3539:50: (iv_ruleArrowType= ruleArrowType EOF )
            // InternalCk2Gfx.g:3540:2: iv_ruleArrowType= ruleArrowType EOF
            {
             newCompositeNode(grammarAccess.getArrowTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArrowType=ruleArrowType();

            state._fsp--;

             current =iv_ruleArrowType; 
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
    // $ANTLR end "entryRuleArrowType"


    // $ANTLR start "ruleArrowType"
    // InternalCk2Gfx.g:3546:1: ruleArrowType returns [EObject current=null] : (otherlv_0= 'arrowType' otherlv_1= '=' otherlv_2= '{' otherlv_3= 'name' otherlv_4= '=' ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= 'size' otherlv_7= '=' ( (lv_size_8_0= ruleDouble ) ) otherlv_9= 'textureFile' otherlv_10= '=' ( (lv_textureFile_11_0= RULE_STRING ) ) otherlv_12= 'bodytexture' otherlv_13= '=' ( (lv_bodyTexture_14_0= RULE_STRING ) ) otherlv_15= 'color' otherlv_16= '=' ( (lv_color_17_0= ruleColorRatio ) ) otherlv_18= 'colortwo' otherlv_19= '=' ( (lv_color2_20_0= ruleColorRatio ) ) otherlv_21= 'endAt' otherlv_22= '=' ( (lv_endAt_23_0= ruleDouble ) ) otherlv_24= 'height' otherlv_25= '=' ( (lv_height_26_0= ruleDouble ) ) otherlv_27= 'type' otherlv_28= '=' ( (lv_type_29_0= RULE_INT ) ) otherlv_30= 'heading' otherlv_31= '=' ( (lv_heading_32_0= ruleDouble ) ) otherlv_33= 'effect' otherlv_34= '=' ( (lv_effect_35_0= RULE_STRING ) ) otherlv_36= '}' ) ;
    public final EObject ruleArrowType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_textureFile_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_bodyTexture_14_0=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token lv_type_29_0=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token lv_effect_35_0=null;
        Token otherlv_36=null;
        AntlrDatatypeRuleToken lv_size_8_0 = null;

        EObject lv_color_17_0 = null;

        EObject lv_color2_20_0 = null;

        AntlrDatatypeRuleToken lv_endAt_23_0 = null;

        AntlrDatatypeRuleToken lv_height_26_0 = null;

        AntlrDatatypeRuleToken lv_heading_32_0 = null;



        	enterRule();

        try {
            // InternalCk2Gfx.g:3552:2: ( (otherlv_0= 'arrowType' otherlv_1= '=' otherlv_2= '{' otherlv_3= 'name' otherlv_4= '=' ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= 'size' otherlv_7= '=' ( (lv_size_8_0= ruleDouble ) ) otherlv_9= 'textureFile' otherlv_10= '=' ( (lv_textureFile_11_0= RULE_STRING ) ) otherlv_12= 'bodytexture' otherlv_13= '=' ( (lv_bodyTexture_14_0= RULE_STRING ) ) otherlv_15= 'color' otherlv_16= '=' ( (lv_color_17_0= ruleColorRatio ) ) otherlv_18= 'colortwo' otherlv_19= '=' ( (lv_color2_20_0= ruleColorRatio ) ) otherlv_21= 'endAt' otherlv_22= '=' ( (lv_endAt_23_0= ruleDouble ) ) otherlv_24= 'height' otherlv_25= '=' ( (lv_height_26_0= ruleDouble ) ) otherlv_27= 'type' otherlv_28= '=' ( (lv_type_29_0= RULE_INT ) ) otherlv_30= 'heading' otherlv_31= '=' ( (lv_heading_32_0= ruleDouble ) ) otherlv_33= 'effect' otherlv_34= '=' ( (lv_effect_35_0= RULE_STRING ) ) otherlv_36= '}' ) )
            // InternalCk2Gfx.g:3553:2: (otherlv_0= 'arrowType' otherlv_1= '=' otherlv_2= '{' otherlv_3= 'name' otherlv_4= '=' ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= 'size' otherlv_7= '=' ( (lv_size_8_0= ruleDouble ) ) otherlv_9= 'textureFile' otherlv_10= '=' ( (lv_textureFile_11_0= RULE_STRING ) ) otherlv_12= 'bodytexture' otherlv_13= '=' ( (lv_bodyTexture_14_0= RULE_STRING ) ) otherlv_15= 'color' otherlv_16= '=' ( (lv_color_17_0= ruleColorRatio ) ) otherlv_18= 'colortwo' otherlv_19= '=' ( (lv_color2_20_0= ruleColorRatio ) ) otherlv_21= 'endAt' otherlv_22= '=' ( (lv_endAt_23_0= ruleDouble ) ) otherlv_24= 'height' otherlv_25= '=' ( (lv_height_26_0= ruleDouble ) ) otherlv_27= 'type' otherlv_28= '=' ( (lv_type_29_0= RULE_INT ) ) otherlv_30= 'heading' otherlv_31= '=' ( (lv_heading_32_0= ruleDouble ) ) otherlv_33= 'effect' otherlv_34= '=' ( (lv_effect_35_0= RULE_STRING ) ) otherlv_36= '}' )
            {
            // InternalCk2Gfx.g:3553:2: (otherlv_0= 'arrowType' otherlv_1= '=' otherlv_2= '{' otherlv_3= 'name' otherlv_4= '=' ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= 'size' otherlv_7= '=' ( (lv_size_8_0= ruleDouble ) ) otherlv_9= 'textureFile' otherlv_10= '=' ( (lv_textureFile_11_0= RULE_STRING ) ) otherlv_12= 'bodytexture' otherlv_13= '=' ( (lv_bodyTexture_14_0= RULE_STRING ) ) otherlv_15= 'color' otherlv_16= '=' ( (lv_color_17_0= ruleColorRatio ) ) otherlv_18= 'colortwo' otherlv_19= '=' ( (lv_color2_20_0= ruleColorRatio ) ) otherlv_21= 'endAt' otherlv_22= '=' ( (lv_endAt_23_0= ruleDouble ) ) otherlv_24= 'height' otherlv_25= '=' ( (lv_height_26_0= ruleDouble ) ) otherlv_27= 'type' otherlv_28= '=' ( (lv_type_29_0= RULE_INT ) ) otherlv_30= 'heading' otherlv_31= '=' ( (lv_heading_32_0= ruleDouble ) ) otherlv_33= 'effect' otherlv_34= '=' ( (lv_effect_35_0= RULE_STRING ) ) otherlv_36= '}' )
            // InternalCk2Gfx.g:3554:3: otherlv_0= 'arrowType' otherlv_1= '=' otherlv_2= '{' otherlv_3= 'name' otherlv_4= '=' ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= 'size' otherlv_7= '=' ( (lv_size_8_0= ruleDouble ) ) otherlv_9= 'textureFile' otherlv_10= '=' ( (lv_textureFile_11_0= RULE_STRING ) ) otherlv_12= 'bodytexture' otherlv_13= '=' ( (lv_bodyTexture_14_0= RULE_STRING ) ) otherlv_15= 'color' otherlv_16= '=' ( (lv_color_17_0= ruleColorRatio ) ) otherlv_18= 'colortwo' otherlv_19= '=' ( (lv_color2_20_0= ruleColorRatio ) ) otherlv_21= 'endAt' otherlv_22= '=' ( (lv_endAt_23_0= ruleDouble ) ) otherlv_24= 'height' otherlv_25= '=' ( (lv_height_26_0= ruleDouble ) ) otherlv_27= 'type' otherlv_28= '=' ( (lv_type_29_0= RULE_INT ) ) otherlv_30= 'heading' otherlv_31= '=' ( (lv_heading_32_0= ruleDouble ) ) otherlv_33= 'effect' otherlv_34= '=' ( (lv_effect_35_0= RULE_STRING ) ) otherlv_36= '}'
            {
            otherlv_0=(Token)match(input,81,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getArrowTypeAccess().getArrowTypeKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getArrowTypeAccess().getEqualsSignKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getArrowTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,23,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getArrowTypeAccess().getNameKeyword_3());
            		
            otherlv_4=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getArrowTypeAccess().getEqualsSignKeyword_4());
            		
            // InternalCk2Gfx.g:3574:3: ( (lv_name_5_0= RULE_STRING ) )
            // InternalCk2Gfx.g:3575:4: (lv_name_5_0= RULE_STRING )
            {
            // InternalCk2Gfx.g:3575:4: (lv_name_5_0= RULE_STRING )
            // InternalCk2Gfx.g:3576:5: lv_name_5_0= RULE_STRING
            {
            lv_name_5_0=(Token)match(input,RULE_STRING,FOLLOW_55); 

            					newLeafNode(lv_name_5_0, grammarAccess.getArrowTypeAccess().getNameSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArrowTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_5_0,
            						"ck2xtext.common.Ck2Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,41,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getArrowTypeAccess().getSizeKeyword_6());
            		
            otherlv_7=(Token)match(input,18,FOLLOW_6); 

            			newLeafNode(otherlv_7, grammarAccess.getArrowTypeAccess().getEqualsSignKeyword_7());
            		
            // InternalCk2Gfx.g:3600:3: ( (lv_size_8_0= ruleDouble ) )
            // InternalCk2Gfx.g:3601:4: (lv_size_8_0= ruleDouble )
            {
            // InternalCk2Gfx.g:3601:4: (lv_size_8_0= ruleDouble )
            // InternalCk2Gfx.g:3602:5: lv_size_8_0= ruleDouble
            {

            					newCompositeNode(grammarAccess.getArrowTypeAccess().getSizeDoubleParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_73);
            lv_size_8_0=ruleDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getArrowTypeRule());
            					}
            					set(
            						current,
            						"size",
            						lv_size_8_0,
            						"ck2xtext.common.Ck2Terminals.Double");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,25,FOLLOW_8); 

            			newLeafNode(otherlv_9, grammarAccess.getArrowTypeAccess().getTextureFileKeyword_9());
            		
            otherlv_10=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_10, grammarAccess.getArrowTypeAccess().getEqualsSignKeyword_10());
            		
            // InternalCk2Gfx.g:3627:3: ( (lv_textureFile_11_0= RULE_STRING ) )
            // InternalCk2Gfx.g:3628:4: (lv_textureFile_11_0= RULE_STRING )
            {
            // InternalCk2Gfx.g:3628:4: (lv_textureFile_11_0= RULE_STRING )
            // InternalCk2Gfx.g:3629:5: lv_textureFile_11_0= RULE_STRING
            {
            lv_textureFile_11_0=(Token)match(input,RULE_STRING,FOLLOW_74); 

            					newLeafNode(lv_textureFile_11_0, grammarAccess.getArrowTypeAccess().getTextureFileSTRINGTerminalRuleCall_11_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArrowTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"textureFile",
            						lv_textureFile_11_0,
            						"ck2xtext.common.Ck2Terminals.STRING");
            				

            }


            }

            otherlv_12=(Token)match(input,82,FOLLOW_8); 

            			newLeafNode(otherlv_12, grammarAccess.getArrowTypeAccess().getBodytextureKeyword_12());
            		
            otherlv_13=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_13, grammarAccess.getArrowTypeAccess().getEqualsSignKeyword_13());
            		
            // InternalCk2Gfx.g:3653:3: ( (lv_bodyTexture_14_0= RULE_STRING ) )
            // InternalCk2Gfx.g:3654:4: (lv_bodyTexture_14_0= RULE_STRING )
            {
            // InternalCk2Gfx.g:3654:4: (lv_bodyTexture_14_0= RULE_STRING )
            // InternalCk2Gfx.g:3655:5: lv_bodyTexture_14_0= RULE_STRING
            {
            lv_bodyTexture_14_0=(Token)match(input,RULE_STRING,FOLLOW_31); 

            					newLeafNode(lv_bodyTexture_14_0, grammarAccess.getArrowTypeAccess().getBodyTextureSTRINGTerminalRuleCall_14_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArrowTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"bodyTexture",
            						lv_bodyTexture_14_0,
            						"ck2xtext.common.Ck2Terminals.STRING");
            				

            }


            }

            otherlv_15=(Token)match(input,45,FOLLOW_8); 

            			newLeafNode(otherlv_15, grammarAccess.getArrowTypeAccess().getColorKeyword_15());
            		
            otherlv_16=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_16, grammarAccess.getArrowTypeAccess().getEqualsSignKeyword_16());
            		
            // InternalCk2Gfx.g:3679:3: ( (lv_color_17_0= ruleColorRatio ) )
            // InternalCk2Gfx.g:3680:4: (lv_color_17_0= ruleColorRatio )
            {
            // InternalCk2Gfx.g:3680:4: (lv_color_17_0= ruleColorRatio )
            // InternalCk2Gfx.g:3681:5: lv_color_17_0= ruleColorRatio
            {

            					newCompositeNode(grammarAccess.getArrowTypeAccess().getColorColorRatioParserRuleCall_17_0());
            				
            pushFollow(FOLLOW_32);
            lv_color_17_0=ruleColorRatio();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getArrowTypeRule());
            					}
            					set(
            						current,
            						"color",
            						lv_color_17_0,
            						"ck2xtext.gfx.Ck2Gfx.ColorRatio");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_18=(Token)match(input,46,FOLLOW_8); 

            			newLeafNode(otherlv_18, grammarAccess.getArrowTypeAccess().getColortwoKeyword_18());
            		
            otherlv_19=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_19, grammarAccess.getArrowTypeAccess().getEqualsSignKeyword_19());
            		
            // InternalCk2Gfx.g:3706:3: ( (lv_color2_20_0= ruleColorRatio ) )
            // InternalCk2Gfx.g:3707:4: (lv_color2_20_0= ruleColorRatio )
            {
            // InternalCk2Gfx.g:3707:4: (lv_color2_20_0= ruleColorRatio )
            // InternalCk2Gfx.g:3708:5: lv_color2_20_0= ruleColorRatio
            {

            					newCompositeNode(grammarAccess.getArrowTypeAccess().getColor2ColorRatioParserRuleCall_20_0());
            				
            pushFollow(FOLLOW_75);
            lv_color2_20_0=ruleColorRatio();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getArrowTypeRule());
            					}
            					set(
            						current,
            						"color2",
            						lv_color2_20_0,
            						"ck2xtext.gfx.Ck2Gfx.ColorRatio");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_21=(Token)match(input,83,FOLLOW_8); 

            			newLeafNode(otherlv_21, grammarAccess.getArrowTypeAccess().getEndAtKeyword_21());
            		
            otherlv_22=(Token)match(input,18,FOLLOW_6); 

            			newLeafNode(otherlv_22, grammarAccess.getArrowTypeAccess().getEqualsSignKeyword_22());
            		
            // InternalCk2Gfx.g:3733:3: ( (lv_endAt_23_0= ruleDouble ) )
            // InternalCk2Gfx.g:3734:4: (lv_endAt_23_0= ruleDouble )
            {
            // InternalCk2Gfx.g:3734:4: (lv_endAt_23_0= ruleDouble )
            // InternalCk2Gfx.g:3735:5: lv_endAt_23_0= ruleDouble
            {

            					newCompositeNode(grammarAccess.getArrowTypeAccess().getEndAtDoubleParserRuleCall_23_0());
            				
            pushFollow(FOLLOW_76);
            lv_endAt_23_0=ruleDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getArrowTypeRule());
            					}
            					set(
            						current,
            						"endAt",
            						lv_endAt_23_0,
            						"ck2xtext.common.Ck2Terminals.Double");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_24=(Token)match(input,84,FOLLOW_8); 

            			newLeafNode(otherlv_24, grammarAccess.getArrowTypeAccess().getHeightKeyword_24());
            		
            otherlv_25=(Token)match(input,18,FOLLOW_6); 

            			newLeafNode(otherlv_25, grammarAccess.getArrowTypeAccess().getEqualsSignKeyword_25());
            		
            // InternalCk2Gfx.g:3760:3: ( (lv_height_26_0= ruleDouble ) )
            // InternalCk2Gfx.g:3761:4: (lv_height_26_0= ruleDouble )
            {
            // InternalCk2Gfx.g:3761:4: (lv_height_26_0= ruleDouble )
            // InternalCk2Gfx.g:3762:5: lv_height_26_0= ruleDouble
            {

            					newCompositeNode(grammarAccess.getArrowTypeAccess().getHeightDoubleParserRuleCall_26_0());
            				
            pushFollow(FOLLOW_77);
            lv_height_26_0=ruleDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getArrowTypeRule());
            					}
            					set(
            						current,
            						"height",
            						lv_height_26_0,
            						"ck2xtext.common.Ck2Terminals.Double");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_27=(Token)match(input,85,FOLLOW_8); 

            			newLeafNode(otherlv_27, grammarAccess.getArrowTypeAccess().getTypeKeyword_27());
            		
            otherlv_28=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_28, grammarAccess.getArrowTypeAccess().getEqualsSignKeyword_28());
            		
            // InternalCk2Gfx.g:3787:3: ( (lv_type_29_0= RULE_INT ) )
            // InternalCk2Gfx.g:3788:4: (lv_type_29_0= RULE_INT )
            {
            // InternalCk2Gfx.g:3788:4: (lv_type_29_0= RULE_INT )
            // InternalCk2Gfx.g:3789:5: lv_type_29_0= RULE_INT
            {
            lv_type_29_0=(Token)match(input,RULE_INT,FOLLOW_78); 

            					newLeafNode(lv_type_29_0, grammarAccess.getArrowTypeAccess().getTypeINTTerminalRuleCall_29_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArrowTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_29_0,
            						"ck2xtext.common.Ck2Terminals.INT");
            				

            }


            }

            otherlv_30=(Token)match(input,86,FOLLOW_8); 

            			newLeafNode(otherlv_30, grammarAccess.getArrowTypeAccess().getHeadingKeyword_30());
            		
            otherlv_31=(Token)match(input,18,FOLLOW_6); 

            			newLeafNode(otherlv_31, grammarAccess.getArrowTypeAccess().getEqualsSignKeyword_31());
            		
            // InternalCk2Gfx.g:3813:3: ( (lv_heading_32_0= ruleDouble ) )
            // InternalCk2Gfx.g:3814:4: (lv_heading_32_0= ruleDouble )
            {
            // InternalCk2Gfx.g:3814:4: (lv_heading_32_0= ruleDouble )
            // InternalCk2Gfx.g:3815:5: lv_heading_32_0= ruleDouble
            {

            					newCompositeNode(grammarAccess.getArrowTypeAccess().getHeadingDoubleParserRuleCall_32_0());
            				
            pushFollow(FOLLOW_60);
            lv_heading_32_0=ruleDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getArrowTypeRule());
            					}
            					set(
            						current,
            						"heading",
            						lv_heading_32_0,
            						"ck2xtext.common.Ck2Terminals.Double");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_33=(Token)match(input,65,FOLLOW_8); 

            			newLeafNode(otherlv_33, grammarAccess.getArrowTypeAccess().getEffectKeyword_33());
            		
            otherlv_34=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_34, grammarAccess.getArrowTypeAccess().getEqualsSignKeyword_34());
            		
            // InternalCk2Gfx.g:3840:3: ( (lv_effect_35_0= RULE_STRING ) )
            // InternalCk2Gfx.g:3841:4: (lv_effect_35_0= RULE_STRING )
            {
            // InternalCk2Gfx.g:3841:4: (lv_effect_35_0= RULE_STRING )
            // InternalCk2Gfx.g:3842:5: lv_effect_35_0= RULE_STRING
            {
            lv_effect_35_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

            					newLeafNode(lv_effect_35_0, grammarAccess.getArrowTypeAccess().getEffectSTRINGTerminalRuleCall_35_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArrowTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"effect",
            						lv_effect_35_0,
            						"ck2xtext.common.Ck2Terminals.STRING");
            				

            }


            }

            otherlv_36=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_36, grammarAccess.getArrowTypeAccess().getRightCurlyBracketKeyword_36());
            		

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
    // $ANTLR end "ruleArrowType"


    // $ANTLR start "entryRuleBitmapFonts"
    // InternalCk2Gfx.g:3866:1: entryRuleBitmapFonts returns [EObject current=null] : iv_ruleBitmapFonts= ruleBitmapFonts EOF ;
    public final EObject entryRuleBitmapFonts() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitmapFonts = null;


        try {
            // InternalCk2Gfx.g:3866:52: (iv_ruleBitmapFonts= ruleBitmapFonts EOF )
            // InternalCk2Gfx.g:3867:2: iv_ruleBitmapFonts= ruleBitmapFonts EOF
            {
             newCompositeNode(grammarAccess.getBitmapFontsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBitmapFonts=ruleBitmapFonts();

            state._fsp--;

             current =iv_ruleBitmapFonts; 
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
    // $ANTLR end "entryRuleBitmapFonts"


    // $ANTLR start "ruleBitmapFonts"
    // InternalCk2Gfx.g:3873:1: ruleBitmapFonts returns [EObject current=null] : ( () otherlv_1= 'bitmapfonts' otherlv_2= '=' otherlv_3= '{' ( (lv_types_4_0= ruleBitmapFont ) )* otherlv_5= '}' ) ;
    public final EObject ruleBitmapFonts() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_types_4_0 = null;



        	enterRule();

        try {
            // InternalCk2Gfx.g:3879:2: ( ( () otherlv_1= 'bitmapfonts' otherlv_2= '=' otherlv_3= '{' ( (lv_types_4_0= ruleBitmapFont ) )* otherlv_5= '}' ) )
            // InternalCk2Gfx.g:3880:2: ( () otherlv_1= 'bitmapfonts' otherlv_2= '=' otherlv_3= '{' ( (lv_types_4_0= ruleBitmapFont ) )* otherlv_5= '}' )
            {
            // InternalCk2Gfx.g:3880:2: ( () otherlv_1= 'bitmapfonts' otherlv_2= '=' otherlv_3= '{' ( (lv_types_4_0= ruleBitmapFont ) )* otherlv_5= '}' )
            // InternalCk2Gfx.g:3881:3: () otherlv_1= 'bitmapfonts' otherlv_2= '=' otherlv_3= '{' ( (lv_types_4_0= ruleBitmapFont ) )* otherlv_5= '}'
            {
            // InternalCk2Gfx.g:3881:3: ()
            // InternalCk2Gfx.g:3882:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBitmapFontsAccess().getBitmapFontsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,87,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getBitmapFontsAccess().getBitmapfontsKeyword_1());
            		
            otherlv_2=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getBitmapFontsAccess().getEqualsSignKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_79); 

            			newLeafNode(otherlv_3, grammarAccess.getBitmapFontsAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCk2Gfx.g:3900:3: ( (lv_types_4_0= ruleBitmapFont ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==88) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalCk2Gfx.g:3901:4: (lv_types_4_0= ruleBitmapFont )
            	    {
            	    // InternalCk2Gfx.g:3901:4: (lv_types_4_0= ruleBitmapFont )
            	    // InternalCk2Gfx.g:3902:5: lv_types_4_0= ruleBitmapFont
            	    {

            	    					newCompositeNode(grammarAccess.getBitmapFontsAccess().getTypesBitmapFontParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_79);
            	    lv_types_4_0=ruleBitmapFont();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBitmapFontsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"types",
            	    						lv_types_4_0,
            	    						"ck2xtext.gfx.Ck2Gfx.BitmapFont");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            otherlv_5=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getBitmapFontsAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleBitmapFonts"


    // $ANTLR start "entryRuleBitmapFont"
    // InternalCk2Gfx.g:3927:1: entryRuleBitmapFont returns [EObject current=null] : iv_ruleBitmapFont= ruleBitmapFont EOF ;
    public final EObject entryRuleBitmapFont() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitmapFont = null;


        try {
            // InternalCk2Gfx.g:3927:51: (iv_ruleBitmapFont= ruleBitmapFont EOF )
            // InternalCk2Gfx.g:3928:2: iv_ruleBitmapFont= ruleBitmapFont EOF
            {
             newCompositeNode(grammarAccess.getBitmapFontRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBitmapFont=ruleBitmapFont();

            state._fsp--;

             current =iv_ruleBitmapFont; 
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
    // $ANTLR end "entryRuleBitmapFont"


    // $ANTLR start "ruleBitmapFont"
    // InternalCk2Gfx.g:3934:1: ruleBitmapFont returns [EObject current=null] : (otherlv_0= 'bitmapfont' otherlv_1= '=' otherlv_2= '{' otherlv_3= 'name' otherlv_4= '=' ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= 'fontname' otherlv_7= '=' ( (lv_fontName_8_0= RULE_STRING ) ) otherlv_9= 'color' otherlv_10= '=' ( (lv_color_11_0= RULE_HEX ) ) (otherlv_12= 'effect' otherlv_13= '=' ( (lv_effect_14_0= RULE_BOOL ) ) )? (otherlv_15= 'colorcodes' otherlv_16= '=' otherlv_17= '{' ( (lv_colorcodes_18_0= ruleColorCode ) )+ otherlv_19= '}' )? (otherlv_20= 'color_override' otherlv_21= '=' otherlv_22= '{' ( (lv_colorcodes_23_0= ruleColorCode ) )+ otherlv_24= '}' )? otherlv_25= '}' ) ;
    public final EObject ruleBitmapFont() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_fontName_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_color_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_effect_14_0=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        EObject lv_colorcodes_18_0 = null;

        EObject lv_colorcodes_23_0 = null;



        	enterRule();

        try {
            // InternalCk2Gfx.g:3940:2: ( (otherlv_0= 'bitmapfont' otherlv_1= '=' otherlv_2= '{' otherlv_3= 'name' otherlv_4= '=' ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= 'fontname' otherlv_7= '=' ( (lv_fontName_8_0= RULE_STRING ) ) otherlv_9= 'color' otherlv_10= '=' ( (lv_color_11_0= RULE_HEX ) ) (otherlv_12= 'effect' otherlv_13= '=' ( (lv_effect_14_0= RULE_BOOL ) ) )? (otherlv_15= 'colorcodes' otherlv_16= '=' otherlv_17= '{' ( (lv_colorcodes_18_0= ruleColorCode ) )+ otherlv_19= '}' )? (otherlv_20= 'color_override' otherlv_21= '=' otherlv_22= '{' ( (lv_colorcodes_23_0= ruleColorCode ) )+ otherlv_24= '}' )? otherlv_25= '}' ) )
            // InternalCk2Gfx.g:3941:2: (otherlv_0= 'bitmapfont' otherlv_1= '=' otherlv_2= '{' otherlv_3= 'name' otherlv_4= '=' ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= 'fontname' otherlv_7= '=' ( (lv_fontName_8_0= RULE_STRING ) ) otherlv_9= 'color' otherlv_10= '=' ( (lv_color_11_0= RULE_HEX ) ) (otherlv_12= 'effect' otherlv_13= '=' ( (lv_effect_14_0= RULE_BOOL ) ) )? (otherlv_15= 'colorcodes' otherlv_16= '=' otherlv_17= '{' ( (lv_colorcodes_18_0= ruleColorCode ) )+ otherlv_19= '}' )? (otherlv_20= 'color_override' otherlv_21= '=' otherlv_22= '{' ( (lv_colorcodes_23_0= ruleColorCode ) )+ otherlv_24= '}' )? otherlv_25= '}' )
            {
            // InternalCk2Gfx.g:3941:2: (otherlv_0= 'bitmapfont' otherlv_1= '=' otherlv_2= '{' otherlv_3= 'name' otherlv_4= '=' ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= 'fontname' otherlv_7= '=' ( (lv_fontName_8_0= RULE_STRING ) ) otherlv_9= 'color' otherlv_10= '=' ( (lv_color_11_0= RULE_HEX ) ) (otherlv_12= 'effect' otherlv_13= '=' ( (lv_effect_14_0= RULE_BOOL ) ) )? (otherlv_15= 'colorcodes' otherlv_16= '=' otherlv_17= '{' ( (lv_colorcodes_18_0= ruleColorCode ) )+ otherlv_19= '}' )? (otherlv_20= 'color_override' otherlv_21= '=' otherlv_22= '{' ( (lv_colorcodes_23_0= ruleColorCode ) )+ otherlv_24= '}' )? otherlv_25= '}' )
            // InternalCk2Gfx.g:3942:3: otherlv_0= 'bitmapfont' otherlv_1= '=' otherlv_2= '{' otherlv_3= 'name' otherlv_4= '=' ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= 'fontname' otherlv_7= '=' ( (lv_fontName_8_0= RULE_STRING ) ) otherlv_9= 'color' otherlv_10= '=' ( (lv_color_11_0= RULE_HEX ) ) (otherlv_12= 'effect' otherlv_13= '=' ( (lv_effect_14_0= RULE_BOOL ) ) )? (otherlv_15= 'colorcodes' otherlv_16= '=' otherlv_17= '{' ( (lv_colorcodes_18_0= ruleColorCode ) )+ otherlv_19= '}' )? (otherlv_20= 'color_override' otherlv_21= '=' otherlv_22= '{' ( (lv_colorcodes_23_0= ruleColorCode ) )+ otherlv_24= '}' )? otherlv_25= '}'
            {
            otherlv_0=(Token)match(input,88,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getBitmapFontAccess().getBitmapfontKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getBitmapFontAccess().getEqualsSignKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getBitmapFontAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,23,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getBitmapFontAccess().getNameKeyword_3());
            		
            otherlv_4=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getBitmapFontAccess().getEqualsSignKeyword_4());
            		
            // InternalCk2Gfx.g:3962:3: ( (lv_name_5_0= RULE_STRING ) )
            // InternalCk2Gfx.g:3963:4: (lv_name_5_0= RULE_STRING )
            {
            // InternalCk2Gfx.g:3963:4: (lv_name_5_0= RULE_STRING )
            // InternalCk2Gfx.g:3964:5: lv_name_5_0= RULE_STRING
            {
            lv_name_5_0=(Token)match(input,RULE_STRING,FOLLOW_80); 

            					newLeafNode(lv_name_5_0, grammarAccess.getBitmapFontAccess().getNameSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBitmapFontRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_5_0,
            						"ck2xtext.common.Ck2Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,89,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getBitmapFontAccess().getFontnameKeyword_6());
            		
            otherlv_7=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_7, grammarAccess.getBitmapFontAccess().getEqualsSignKeyword_7());
            		
            // InternalCk2Gfx.g:3988:3: ( (lv_fontName_8_0= RULE_STRING ) )
            // InternalCk2Gfx.g:3989:4: (lv_fontName_8_0= RULE_STRING )
            {
            // InternalCk2Gfx.g:3989:4: (lv_fontName_8_0= RULE_STRING )
            // InternalCk2Gfx.g:3990:5: lv_fontName_8_0= RULE_STRING
            {
            lv_fontName_8_0=(Token)match(input,RULE_STRING,FOLLOW_31); 

            					newLeafNode(lv_fontName_8_0, grammarAccess.getBitmapFontAccess().getFontNameSTRINGTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBitmapFontRule());
            					}
            					setWithLastConsumed(
            						current,
            						"fontName",
            						lv_fontName_8_0,
            						"ck2xtext.common.Ck2Terminals.STRING");
            				

            }


            }

            otherlv_9=(Token)match(input,45,FOLLOW_8); 

            			newLeafNode(otherlv_9, grammarAccess.getBitmapFontAccess().getColorKeyword_9());
            		
            otherlv_10=(Token)match(input,18,FOLLOW_81); 

            			newLeafNode(otherlv_10, grammarAccess.getBitmapFontAccess().getEqualsSignKeyword_10());
            		
            // InternalCk2Gfx.g:4014:3: ( (lv_color_11_0= RULE_HEX ) )
            // InternalCk2Gfx.g:4015:4: (lv_color_11_0= RULE_HEX )
            {
            // InternalCk2Gfx.g:4015:4: (lv_color_11_0= RULE_HEX )
            // InternalCk2Gfx.g:4016:5: lv_color_11_0= RULE_HEX
            {
            lv_color_11_0=(Token)match(input,RULE_HEX,FOLLOW_82); 

            					newLeafNode(lv_color_11_0, grammarAccess.getBitmapFontAccess().getColorHEXTerminalRuleCall_11_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBitmapFontRule());
            					}
            					setWithLastConsumed(
            						current,
            						"color",
            						lv_color_11_0,
            						"ck2xtext.common.Ck2Terminals.HEX");
            				

            }


            }

            // InternalCk2Gfx.g:4032:3: (otherlv_12= 'effect' otherlv_13= '=' ( (lv_effect_14_0= RULE_BOOL ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==65) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalCk2Gfx.g:4033:4: otherlv_12= 'effect' otherlv_13= '=' ( (lv_effect_14_0= RULE_BOOL ) )
                    {
                    otherlv_12=(Token)match(input,65,FOLLOW_8); 

                    				newLeafNode(otherlv_12, grammarAccess.getBitmapFontAccess().getEffectKeyword_12_0());
                    			
                    otherlv_13=(Token)match(input,18,FOLLOW_15); 

                    				newLeafNode(otherlv_13, grammarAccess.getBitmapFontAccess().getEqualsSignKeyword_12_1());
                    			
                    // InternalCk2Gfx.g:4041:4: ( (lv_effect_14_0= RULE_BOOL ) )
                    // InternalCk2Gfx.g:4042:5: (lv_effect_14_0= RULE_BOOL )
                    {
                    // InternalCk2Gfx.g:4042:5: (lv_effect_14_0= RULE_BOOL )
                    // InternalCk2Gfx.g:4043:6: lv_effect_14_0= RULE_BOOL
                    {
                    lv_effect_14_0=(Token)match(input,RULE_BOOL,FOLLOW_83); 

                    						newLeafNode(lv_effect_14_0, grammarAccess.getBitmapFontAccess().getEffectBOOLTerminalRuleCall_12_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBitmapFontRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"effect",
                    							lv_effect_14_0,
                    							"ck2xtext.common.Ck2Terminals.BOOL");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCk2Gfx.g:4060:3: (otherlv_15= 'colorcodes' otherlv_16= '=' otherlv_17= '{' ( (lv_colorcodes_18_0= ruleColorCode ) )+ otherlv_19= '}' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==90) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalCk2Gfx.g:4061:4: otherlv_15= 'colorcodes' otherlv_16= '=' otherlv_17= '{' ( (lv_colorcodes_18_0= ruleColorCode ) )+ otherlv_19= '}'
                    {
                    otherlv_15=(Token)match(input,90,FOLLOW_8); 

                    				newLeafNode(otherlv_15, grammarAccess.getBitmapFontAccess().getColorcodesKeyword_13_0());
                    			
                    otherlv_16=(Token)match(input,18,FOLLOW_10); 

                    				newLeafNode(otherlv_16, grammarAccess.getBitmapFontAccess().getEqualsSignKeyword_13_1());
                    			
                    otherlv_17=(Token)match(input,15,FOLLOW_16); 

                    				newLeafNode(otherlv_17, grammarAccess.getBitmapFontAccess().getLeftCurlyBracketKeyword_13_2());
                    			
                    // InternalCk2Gfx.g:4073:4: ( (lv_colorcodes_18_0= ruleColorCode ) )+
                    int cnt45=0;
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==RULE_ID) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // InternalCk2Gfx.g:4074:5: (lv_colorcodes_18_0= ruleColorCode )
                    	    {
                    	    // InternalCk2Gfx.g:4074:5: (lv_colorcodes_18_0= ruleColorCode )
                    	    // InternalCk2Gfx.g:4075:6: lv_colorcodes_18_0= ruleColorCode
                    	    {

                    	    						newCompositeNode(grammarAccess.getBitmapFontAccess().getColorcodesColorCodeParserRuleCall_13_3_0());
                    	    					
                    	    pushFollow(FOLLOW_84);
                    	    lv_colorcodes_18_0=ruleColorCode();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getBitmapFontRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"colorcodes",
                    	    							lv_colorcodes_18_0,
                    	    							"ck2xtext.gfx.Ck2Gfx.ColorCode");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt45 >= 1 ) break loop45;
                                EarlyExitException eee =
                                    new EarlyExitException(45, input);
                                throw eee;
                        }
                        cnt45++;
                    } while (true);

                    otherlv_19=(Token)match(input,16,FOLLOW_85); 

                    				newLeafNode(otherlv_19, grammarAccess.getBitmapFontAccess().getRightCurlyBracketKeyword_13_4());
                    			

                    }
                    break;

            }

            // InternalCk2Gfx.g:4097:3: (otherlv_20= 'color_override' otherlv_21= '=' otherlv_22= '{' ( (lv_colorcodes_23_0= ruleColorCode ) )+ otherlv_24= '}' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==91) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalCk2Gfx.g:4098:4: otherlv_20= 'color_override' otherlv_21= '=' otherlv_22= '{' ( (lv_colorcodes_23_0= ruleColorCode ) )+ otherlv_24= '}'
                    {
                    otherlv_20=(Token)match(input,91,FOLLOW_8); 

                    				newLeafNode(otherlv_20, grammarAccess.getBitmapFontAccess().getColor_overrideKeyword_14_0());
                    			
                    otherlv_21=(Token)match(input,18,FOLLOW_10); 

                    				newLeafNode(otherlv_21, grammarAccess.getBitmapFontAccess().getEqualsSignKeyword_14_1());
                    			
                    otherlv_22=(Token)match(input,15,FOLLOW_16); 

                    				newLeafNode(otherlv_22, grammarAccess.getBitmapFontAccess().getLeftCurlyBracketKeyword_14_2());
                    			
                    // InternalCk2Gfx.g:4110:4: ( (lv_colorcodes_23_0= ruleColorCode ) )+
                    int cnt47=0;
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==RULE_ID) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // InternalCk2Gfx.g:4111:5: (lv_colorcodes_23_0= ruleColorCode )
                    	    {
                    	    // InternalCk2Gfx.g:4111:5: (lv_colorcodes_23_0= ruleColorCode )
                    	    // InternalCk2Gfx.g:4112:6: lv_colorcodes_23_0= ruleColorCode
                    	    {

                    	    						newCompositeNode(grammarAccess.getBitmapFontAccess().getColorcodesColorCodeParserRuleCall_14_3_0());
                    	    					
                    	    pushFollow(FOLLOW_84);
                    	    lv_colorcodes_23_0=ruleColorCode();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getBitmapFontRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"colorcodes",
                    	    							lv_colorcodes_23_0,
                    	    							"ck2xtext.gfx.Ck2Gfx.ColorCode");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt47 >= 1 ) break loop47;
                                EarlyExitException eee =
                                    new EarlyExitException(47, input);
                                throw eee;
                        }
                        cnt47++;
                    } while (true);

                    otherlv_24=(Token)match(input,16,FOLLOW_5); 

                    				newLeafNode(otherlv_24, grammarAccess.getBitmapFontAccess().getRightCurlyBracketKeyword_14_4());
                    			

                    }
                    break;

            }

            otherlv_25=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_25, grammarAccess.getBitmapFontAccess().getRightCurlyBracketKeyword_15());
            		

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
    // $ANTLR end "ruleBitmapFont"


    // $ANTLR start "entryRuleColorCode"
    // InternalCk2Gfx.g:4142:1: entryRuleColorCode returns [EObject current=null] : iv_ruleColorCode= ruleColorCode EOF ;
    public final EObject entryRuleColorCode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColorCode = null;


        try {
            // InternalCk2Gfx.g:4142:50: (iv_ruleColorCode= ruleColorCode EOF )
            // InternalCk2Gfx.g:4143:2: iv_ruleColorCode= ruleColorCode EOF
            {
             newCompositeNode(grammarAccess.getColorCodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColorCode=ruleColorCode();

            state._fsp--;

             current =iv_ruleColorCode; 
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
    // $ANTLR end "entryRuleColorCode"


    // $ANTLR start "ruleColorCode"
    // InternalCk2Gfx.g:4149:1: ruleColorCode returns [EObject current=null] : ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleColor ) ) ) ;
    public final EObject ruleColorCode() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalCk2Gfx.g:4155:2: ( ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleColor ) ) ) )
            // InternalCk2Gfx.g:4156:2: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleColor ) ) )
            {
            // InternalCk2Gfx.g:4156:2: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleColor ) ) )
            // InternalCk2Gfx.g:4157:3: ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleColor ) )
            {
            // InternalCk2Gfx.g:4157:3: ( (lv_key_0_0= RULE_ID ) )
            // InternalCk2Gfx.g:4158:4: (lv_key_0_0= RULE_ID )
            {
            // InternalCk2Gfx.g:4158:4: (lv_key_0_0= RULE_ID )
            // InternalCk2Gfx.g:4159:5: lv_key_0_0= RULE_ID
            {
            lv_key_0_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_key_0_0, grammarAccess.getColorCodeAccess().getKeyIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getColorCodeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"key",
            						lv_key_0_0,
            						"ck2xtext.common.Ck2Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getColorCodeAccess().getEqualsSignKeyword_1());
            		
            // InternalCk2Gfx.g:4179:3: ( (lv_value_2_0= ruleColor ) )
            // InternalCk2Gfx.g:4180:4: (lv_value_2_0= ruleColor )
            {
            // InternalCk2Gfx.g:4180:4: (lv_value_2_0= ruleColor )
            // InternalCk2Gfx.g:4181:5: lv_value_2_0= ruleColor
            {

            					newCompositeNode(grammarAccess.getColorCodeAccess().getValueColorParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleColor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getColorCodeRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"ck2xtext.gfx.Ck2Gfx.Color");
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
    // $ANTLR end "ruleColorCode"


    // $ANTLR start "entryRuleInteger"
    // InternalCk2Gfx.g:4202:1: entryRuleInteger returns [String current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final String entryRuleInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger = null;


        try {
            // InternalCk2Gfx.g:4202:47: (iv_ruleInteger= ruleInteger EOF )
            // InternalCk2Gfx.g:4203:2: iv_ruleInteger= ruleInteger EOF
            {
             newCompositeNode(grammarAccess.getIntegerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInteger=ruleInteger();

            state._fsp--;

             current =iv_ruleInteger.getText(); 
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
    // $ANTLR end "entryRuleInteger"


    // $ANTLR start "ruleInteger"
    // InternalCk2Gfx.g:4209:1: ruleInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' | kw= '+' )? this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalCk2Gfx.g:4215:2: ( ( (kw= '-' | kw= '+' )? this_INT_2= RULE_INT ) )
            // InternalCk2Gfx.g:4216:2: ( (kw= '-' | kw= '+' )? this_INT_2= RULE_INT )
            {
            // InternalCk2Gfx.g:4216:2: ( (kw= '-' | kw= '+' )? this_INT_2= RULE_INT )
            // InternalCk2Gfx.g:4217:3: (kw= '-' | kw= '+' )? this_INT_2= RULE_INT
            {
            // InternalCk2Gfx.g:4217:3: (kw= '-' | kw= '+' )?
            int alt49=3;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==92) ) {
                alt49=1;
            }
            else if ( (LA49_0==93) ) {
                alt49=2;
            }
            switch (alt49) {
                case 1 :
                    // InternalCk2Gfx.g:4218:4: kw= '-'
                    {
                    kw=(Token)match(input,92,FOLLOW_4); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getIntegerAccess().getHyphenMinusKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalCk2Gfx.g:4224:4: kw= '+'
                    {
                    kw=(Token)match(input,93,FOLLOW_4); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getIntegerAccess().getPlusSignKeyword_0_1());
                    			

                    }
                    break;

            }

            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getIntegerAccess().getINTTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleInteger"


    // $ANTLR start "entryRuleDouble"
    // InternalCk2Gfx.g:4241:1: entryRuleDouble returns [String current=null] : iv_ruleDouble= ruleDouble EOF ;
    public final String entryRuleDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDouble = null;


        try {
            // InternalCk2Gfx.g:4241:46: (iv_ruleDouble= ruleDouble EOF )
            // InternalCk2Gfx.g:4242:2: iv_ruleDouble= ruleDouble EOF
            {
             newCompositeNode(grammarAccess.getDoubleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDouble=ruleDouble();

            state._fsp--;

             current =iv_ruleDouble.getText(); 
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
    // $ANTLR end "entryRuleDouble"


    // $ANTLR start "ruleDouble"
    // InternalCk2Gfx.g:4248:1: ruleDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Integer_0= ruleInteger kw= '.' this_INT_2= RULE_INT (kw= 'f' )? ) ;
    public final AntlrDatatypeRuleToken ruleDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_2=null;
        AntlrDatatypeRuleToken this_Integer_0 = null;



        	enterRule();

        try {
            // InternalCk2Gfx.g:4254:2: ( (this_Integer_0= ruleInteger kw= '.' this_INT_2= RULE_INT (kw= 'f' )? ) )
            // InternalCk2Gfx.g:4255:2: (this_Integer_0= ruleInteger kw= '.' this_INT_2= RULE_INT (kw= 'f' )? )
            {
            // InternalCk2Gfx.g:4255:2: (this_Integer_0= ruleInteger kw= '.' this_INT_2= RULE_INT (kw= 'f' )? )
            // InternalCk2Gfx.g:4256:3: this_Integer_0= ruleInteger kw= '.' this_INT_2= RULE_INT (kw= 'f' )?
            {

            			newCompositeNode(grammarAccess.getDoubleAccess().getIntegerParserRuleCall_0());
            		
            pushFollow(FOLLOW_86);
            this_Integer_0=ruleInteger();

            state._fsp--;


            			current.merge(this_Integer_0);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,94,FOLLOW_4); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getDoubleAccess().getFullStopKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_87); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getDoubleAccess().getINTTerminalRuleCall_2());
            		
            // InternalCk2Gfx.g:4278:3: (kw= 'f' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==95) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalCk2Gfx.g:4279:4: kw= 'f'
                    {
                    kw=(Token)match(input,95,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getDoubleAccess().getFKeyword_3());
                    			

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
    // $ANTLR end "ruleDouble"


    // $ANTLR start "entryRuleNumber"
    // InternalCk2Gfx.g:4289:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


        try {
            // InternalCk2Gfx.g:4289:46: (iv_ruleNumber= ruleNumber EOF )
            // InternalCk2Gfx.g:4290:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber.getText(); 
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
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // InternalCk2Gfx.g:4296:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Double_0= ruleDouble | (this_Integer_1= ruleInteger (kw= 'f' )? ) ) ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Double_0 = null;

        AntlrDatatypeRuleToken this_Integer_1 = null;



        	enterRule();

        try {
            // InternalCk2Gfx.g:4302:2: ( (this_Double_0= ruleDouble | (this_Integer_1= ruleInteger (kw= 'f' )? ) ) )
            // InternalCk2Gfx.g:4303:2: (this_Double_0= ruleDouble | (this_Integer_1= ruleInteger (kw= 'f' )? ) )
            {
            // InternalCk2Gfx.g:4303:2: (this_Double_0= ruleDouble | (this_Integer_1= ruleInteger (kw= 'f' )? ) )
            int alt52=2;
            switch ( input.LA(1) ) {
            case 92:
                {
                int LA52_1 = input.LA(2);

                if ( (LA52_1==RULE_INT) ) {
                    int LA52_3 = input.LA(3);

                    if ( (LA52_3==94) ) {
                        alt52=1;
                    }
                    else if ( (LA52_3==EOF||LA52_3==16||LA52_3==19||LA52_3==28||LA52_3==31||LA52_3==38||(LA52_3>=75 && LA52_3<=76)||LA52_3==95) ) {
                        alt52=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 52, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 52, 1, input);

                    throw nvae;
                }
                }
                break;
            case 93:
                {
                int LA52_2 = input.LA(2);

                if ( (LA52_2==RULE_INT) ) {
                    int LA52_3 = input.LA(3);

                    if ( (LA52_3==94) ) {
                        alt52=1;
                    }
                    else if ( (LA52_3==EOF||LA52_3==16||LA52_3==19||LA52_3==28||LA52_3==31||LA52_3==38||(LA52_3>=75 && LA52_3<=76)||LA52_3==95) ) {
                        alt52=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 52, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 52, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA52_3 = input.LA(2);

                if ( (LA52_3==94) ) {
                    alt52=1;
                }
                else if ( (LA52_3==EOF||LA52_3==16||LA52_3==19||LA52_3==28||LA52_3==31||LA52_3==38||(LA52_3>=75 && LA52_3<=76)||LA52_3==95) ) {
                    alt52=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 52, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }

            switch (alt52) {
                case 1 :
                    // InternalCk2Gfx.g:4304:3: this_Double_0= ruleDouble
                    {

                    			newCompositeNode(grammarAccess.getNumberAccess().getDoubleParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Double_0=ruleDouble();

                    state._fsp--;


                    			current.merge(this_Double_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCk2Gfx.g:4315:3: (this_Integer_1= ruleInteger (kw= 'f' )? )
                    {
                    // InternalCk2Gfx.g:4315:3: (this_Integer_1= ruleInteger (kw= 'f' )? )
                    // InternalCk2Gfx.g:4316:4: this_Integer_1= ruleInteger (kw= 'f' )?
                    {

                    				newCompositeNode(grammarAccess.getNumberAccess().getIntegerParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_87);
                    this_Integer_1=ruleInteger();

                    state._fsp--;


                    				current.merge(this_Integer_1);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    // InternalCk2Gfx.g:4326:4: (kw= 'f' )?
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==95) ) {
                        alt51=1;
                    }
                    switch (alt51) {
                        case 1 :
                            // InternalCk2Gfx.g:4327:5: kw= 'f'
                            {
                            kw=(Token)match(input,95,FOLLOW_2); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getNumberAccess().getFKeyword_1_1());
                            				

                            }
                            break;

                    }


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
    // $ANTLR end "ruleNumber"

    // Delegated rules


    protected DFA9 dfa9 = new DFA9(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\20\13\uffff";
    static final String dfa_3s = "\1\43\13\uffff";
    static final String dfa_4s = "\1\uffff\1\13\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12";
    static final String dfa_5s = "\1\0\13\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\6\uffff\1\2\2\3\2\4\1\5\1\6\2\7\1\10\1\11\1\12\1\13",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "()+ loopback of 595:6: ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_name_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'texturefile' | otherlv_9= 'textureFile' ) otherlv_10= '=' ( (lv_textureFile_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_12= 'noOfFrames' | otherlv_13= 'noOfframes' ) otherlv_14= '=' ( (lv_noOfFrames_15_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'loadType' otherlv_17= '=' ( (lv_loadType_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'allwaystransparent' otherlv_20= '=' ( (lv_allwaysTransparent_21_0= RULE_BOOL ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_22= 'noRefCount' | otherlv_23= 'norefcount' ) otherlv_24= '=' ( (lv_noRefCount_25_0= RULE_BOOL ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'effectFile' otherlv_27= '=' ( (lv_effectFile_28_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'transparencecheck' otherlv_30= '=' ( (lv_transparenceCheck_31_0= RULE_BOOL ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'can_be_lowres' otherlv_33= '=' ( (lv_canBeLowres_34_0= RULE_BOOL ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'clicksound' otherlv_36= '=' ( (lv_clickSound_37_0= RULE_ID ) ) ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA9_0 = input.LA(1);

                         
                        int index9_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_0==16) ) {s = 1;}

                        else if ( LA9_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getSpriteTypeAccess().getUnorderedGroup_3(), 0) ) {s = 2;}

                        else if ( LA9_0 >= 24 && LA9_0 <= 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getSpriteTypeAccess().getUnorderedGroup_3(), 1) ) {s = 3;}

                        else if ( LA9_0 >= 26 && LA9_0 <= 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getSpriteTypeAccess().getUnorderedGroup_3(), 2) ) {s = 4;}

                        else if ( LA9_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getSpriteTypeAccess().getUnorderedGroup_3(), 3) ) {s = 5;}

                        else if ( LA9_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getSpriteTypeAccess().getUnorderedGroup_3(), 4) ) {s = 6;}

                        else if ( LA9_0 >= 30 && LA9_0 <= 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getSpriteTypeAccess().getUnorderedGroup_3(), 5) ) {s = 7;}

                        else if ( LA9_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getSpriteTypeAccess().getUnorderedGroup_3(), 6) ) {s = 8;}

                        else if ( LA9_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getSpriteTypeAccess().getUnorderedGroup_3(), 7) ) {s = 9;}

                        else if ( LA9_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getSpriteTypeAccess().getUnorderedGroup_3(), 8) ) {s = 10;}

                        else if ( LA9_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getSpriteTypeAccess().getUnorderedGroup_3(), 9) ) {s = 11;}

                         
                        input.seek(index9_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 9, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000100002L,0x0000000000800010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L,0x0000000030000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x2C08111000610000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000FFF800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000FFF810000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000E0073010000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000C0073010000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000C0072010000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00000C0070010000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000080070010000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000080050010000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000080010010000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000080000010000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0003820000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0003020000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0002020000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0002020100000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x00040000B0010000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0004000090010000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000090010000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000080010000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x03E0000000010000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x03C0000000010000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0380000000010000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0300000000010000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0200000000010000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000820010000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000800010000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0010000000010000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000010000L,0x0000000000030020L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003F88L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001F88L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000010000L,0x0000000000001F88L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000010000L,0x0000000000001800L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000010000L,0x0000000000001000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000010000L,0x0000000001000000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000010000L,0x000000000C000002L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000010000L,0x000000000C000000L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000010080L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000010000L,0x0000000008000000L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});

}
