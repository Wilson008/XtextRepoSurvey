package org.xtext.json.schema.parser.antlr.internal;

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
import org.xtext.json.schema.services.Draft7GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDraft7Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'\"type\"'", "':'", "','", "'\"dependencies\"'", "'}'", "'\"additionalProperties\"'", "'\"additionalItems\"'", "'\"default\"'", "'\"patternProperties\"'", "'\"examples\"'", "'\"items\"'", "'\"contains\"'", "'\"definitions\"'", "'\"title\"'", "'\"required\"'", "'['", "']'", "'\"description\"'", "'\"properties\"'", "'\"enum\"'", "'\"$schema\"'", "'\"http://json-schema.org/draft-07/schema#\"'", "'\"$id\"'", "'\"if\"'", "'\"then\"'", "'\"else\"'", "'\"const\"'", "'\"anyOf\"'", "'\"oneOf\"'", "'\"allOf\"'", "'\"not\"'", "'\"uniqueItems\"'", "'\"propertyNames\"'", "'\"minProperties\"'", "'\"maxProperties\"'", "'\"maxItems\"'", "'\"minItems\"'", "'\"maxLength\"'", "'\"minLength\"'", "'\"pattern\"'", "'\"format\"'", "'\"contentMediaType\"'", "'\"contentEncoding\"'", "'\"multiples\"'", "'\"minimum\"'", "'\"exclusiveMinimum\"'", "'\"maximum\"'", "'\"exclusiveMaximum\"'", "'\"$ref\"'", "'.'", "'true'", "'false'", "'\"string\"'", "'\"integer\"'", "'\"number\"'", "'\"object\"'", "'\"array\"'", "'\"boolean\"'", "'\"null\"'", "'\"date-time\"'", "'\"time\"'", "'\"date\"'", "'\"email\"'", "'\"idn-email\"'", "'\"hostname\"'", "'\"ipv4\"'", "'\"ipv6\"'", "'\"uri\"'", "'\"uri-reference\"'", "'\"iri\"'", "'\"iri-reference\"'", "'\"uri-template\"'", "'\"json-pointer\"'", "'\"relative-json-pointer\"'", "'\"regex\"'", "'\"$comment\"'", "'\"length\"'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__88=88;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__84=84;
    public static final int T__41=41;
    public static final int T__85=85;
    public static final int T__42=42;
    public static final int T__86=86;
    public static final int T__43=43;
    public static final int T__87=87;

    // delegates
    // delegators


        public InternalDraft7Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDraft7Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDraft7Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalDraft7.g"; }



     	private Draft7GrammarAccess grammarAccess;

        public InternalDraft7Parser(TokenStream input, Draft7GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Schema";
       	}

       	@Override
       	protected Draft7GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSchema"
    // InternalDraft7.g:65:1: entryRuleSchema returns [EObject current=null] : iv_ruleSchema= ruleSchema EOF ;
    public final EObject entryRuleSchema() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchema = null;


        try {
            // InternalDraft7.g:65:47: (iv_ruleSchema= ruleSchema EOF )
            // InternalDraft7.g:66:2: iv_ruleSchema= ruleSchema EOF
            {
             newCompositeNode(grammarAccess.getSchemaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSchema=ruleSchema();

            state._fsp--;

             current =iv_ruleSchema; 
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
    // $ANTLR end "entryRuleSchema"


    // $ANTLR start "ruleSchema"
    // InternalDraft7.g:72:1: ruleSchema returns [EObject current=null] : ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"type\"' otherlv_4= ':' ( (lv_type_5_0= ruleTypes ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"dependencies\"' otherlv_8= ':' otherlv_9= '{' ( (lv_dependencies_10_0= ruleDependencies ) ) otherlv_11= '}' (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"additionalProperties\"' otherlv_14= ':' ( (lv_additionalProperties_15_0= ruleAdditionalProperties ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"additionalItems\"' otherlv_18= ':' ( (lv_additionalItems_19_0= ruleAdditionalItems ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= '\"default\"' otherlv_22= ':' ( (lv_default_23_0= ruleDefault ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= '\"patternProperties\"' otherlv_26= ':' otherlv_27= '{' ( (lv_patternProperties_28_0= ruleNamedSchema ) ) (otherlv_29= ',' ( (lv_patternProperties_30_0= ruleNamedSchema ) ) )* otherlv_31= '}' (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= '\"examples\"' otherlv_34= ':' ( (lv_example_35_0= ruleExample ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= '\"items\"' otherlv_38= ':' ( (lv_items_39_0= ruleItems ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= '\"contains\"' otherlv_42= ':' ( (lv_contains_43_0= ruleContains ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= '\"definitions\"' otherlv_46= ':' otherlv_47= '{' ( (lv_definitions_48_0= ruleNamedSchema ) ) (otherlv_49= ',' ( (lv_definitions_50_0= ruleNamedSchema ) ) )* otherlv_51= '}' (otherlv_52= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= '\"title\"' otherlv_54= ':' ( (lv_title_55_0= RULE_STRING ) ) (otherlv_56= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_57= '\"required\"' otherlv_58= ':' otherlv_59= '[' ( (lv_requiredProperties_60_0= ruleAnyString ) ) (otherlv_61= ',' ( (lv_requiredProperties_62_0= ruleAnyString ) ) )* otherlv_63= ']' (otherlv_64= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_65= '\"description\"' otherlv_66= ':' ( (lv_description_67_0= RULE_STRING ) ) (otherlv_68= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_69= '\"properties\"' otherlv_70= ':' otherlv_71= '{' ( (lv_properties_72_0= ruleNamedSchema ) ) (otherlv_73= ',' ( (lv_properties_74_0= ruleNamedSchema ) ) )* otherlv_75= '}' (otherlv_76= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_77= '\"enum\"' otherlv_78= ':' otherlv_79= '[' ( (lv_enumValues_80_0= ruleAnyString ) ) (otherlv_81= ',' ( (lv_enumValues_82_0= ruleAnyString ) ) )* otherlv_83= ']' (otherlv_84= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_85= '\"$schema\"' otherlv_86= ':' otherlv_87= '\"http://json-schema.org/draft-07/schema#\"' (otherlv_88= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_89= '\"$id\"' otherlv_90= ':' ( (lv_id_91_0= ruleAnyString ) ) (otherlv_92= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_93= '\"if\"' otherlv_94= ':' ( (lv_ifSchema_95_0= ruleSchema ) ) (otherlv_96= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_97= '\"then\"' otherlv_98= ':' ( (lv_thenSchema_99_0= ruleSchema ) ) (otherlv_100= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_101= '\"else\"' otherlv_102= ':' ( (lv_elseSchema_103_0= ruleSchema ) ) (otherlv_104= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_105= '\"enum\"' otherlv_106= ':' otherlv_107= '[' ( (lv_enumValues_108_0= ruleAnyString ) ) (otherlv_109= ',' ( (lv_enumValues_110_0= ruleAnyString ) ) )* otherlv_111= ']' (otherlv_112= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_113= '\"const\"' otherlv_114= ':' ( ( (lv_const_115_0= ruleAnyString ) ) | ( (lv_constBoolean_116_0= ruleBoolean ) ) ) (otherlv_117= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_118= '\"anyOf\"' otherlv_119= ':' otherlv_120= '[' ( (lv_anyOfs_121_0= ruleAbstractSchema ) ) (otherlv_122= ',' ( (lv_anyOfs_123_0= ruleAbstractSchema ) ) )* otherlv_124= ']' (otherlv_125= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_126= '\"oneOf\"' otherlv_127= ':' otherlv_128= '[' ( (lv_oneOfs_129_0= ruleAbstractSchema ) ) (otherlv_130= ',' ( (lv_oneOfs_131_0= ruleAbstractSchema ) ) )* otherlv_132= ']' (otherlv_133= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_134= '\"allOf\"' otherlv_135= ':' otherlv_136= '[' ( (lv_allOfs_137_0= ruleAbstractSchema ) ) (otherlv_138= ',' ( (lv_allOfs_139_0= ruleAbstractSchema ) ) )* otherlv_140= ']' (otherlv_141= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_142= '\"not\"' otherlv_143= ':' ( (lv_not_144_0= ruleAbstractSchema ) ) (otherlv_145= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_146= '\"uniqueItems\"' otherlv_147= ':' ( (lv_unique_148_0= ruleBoolean ) ) (otherlv_149= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_150= '\"propertyNames\"' otherlv_151= ':' ( (lv_propertyNames_152_0= ruleAbstractSchema ) ) (otherlv_153= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_154= '\"minProperties\"' otherlv_155= ':' ( (lv_minProperties_156_0= RULE_INT ) ) (otherlv_157= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_158= '\"maxProperties\"' otherlv_159= ':' ( (lv_maxProperties_160_0= RULE_INT ) ) (otherlv_161= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_162= '\"maxItems\"' otherlv_163= ':' ( (lv_maxItems_164_0= RULE_INT ) ) (otherlv_165= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_166= '\"minItems\"' otherlv_167= ':' ( (lv_minItems_168_0= RULE_INT ) ) (otherlv_169= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_170= '\"maxLength\"' otherlv_171= ':' ( (lv_maxLength_172_0= RULE_INT ) ) (otherlv_173= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_174= '\"minLength\"' otherlv_175= ':' ( (lv_minLength_176_0= RULE_INT ) ) (otherlv_177= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_178= '\"pattern\"' otherlv_179= ':' ( (lv_pattern_180_0= ruleAnyString ) ) (otherlv_181= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_182= '\"format\"' otherlv_183= ':' ( (lv_format_184_0= ruleFormatTypes ) ) (otherlv_185= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_186= '\"contentMediaType\"' otherlv_187= ':' ( (lv_mediaType_188_0= ruleAnyString ) ) (otherlv_189= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_190= '\"contentEncoding\"' otherlv_191= ':' ( (lv_encoding_192_0= ruleAnyString ) ) (otherlv_193= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_194= '\"multiples\"' otherlv_195= ':' ( (lv_multipleOf_196_0= RULE_INT ) ) (otherlv_197= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_198= '\"minimum\"' otherlv_199= ':' ( (lv_minimum_200_0= ruleNumber ) ) (otherlv_201= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_202= '\"exclusiveMinimum\"' otherlv_203= ':' ( (lv_exclusiveMinimum_204_0= ruleNumber ) ) (otherlv_205= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_206= '\"maximum\"' otherlv_207= ':' ( (lv_maximum_208_0= ruleNumber ) ) (otherlv_209= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_210= '\"exclusiveMaximum\"' otherlv_211= ':' ( (lv_exclusiveMaximum_212_0= ruleNumber ) ) (otherlv_213= ',' )? ) ) ) ) )* ) ) ) otherlv_214= '}' ) ;
    public final EObject ruleSchema() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_36=null;
        Token otherlv_37=null;
        Token otherlv_38=null;
        Token otherlv_40=null;
        Token otherlv_41=null;
        Token otherlv_42=null;
        Token otherlv_44=null;
        Token otherlv_45=null;
        Token otherlv_46=null;
        Token otherlv_47=null;
        Token otherlv_49=null;
        Token otherlv_51=null;
        Token otherlv_52=null;
        Token otherlv_53=null;
        Token otherlv_54=null;
        Token lv_title_55_0=null;
        Token otherlv_56=null;
        Token otherlv_57=null;
        Token otherlv_58=null;
        Token otherlv_59=null;
        Token otherlv_61=null;
        Token otherlv_63=null;
        Token otherlv_64=null;
        Token otherlv_65=null;
        Token otherlv_66=null;
        Token lv_description_67_0=null;
        Token otherlv_68=null;
        Token otherlv_69=null;
        Token otherlv_70=null;
        Token otherlv_71=null;
        Token otherlv_73=null;
        Token otherlv_75=null;
        Token otherlv_76=null;
        Token otherlv_77=null;
        Token otherlv_78=null;
        Token otherlv_79=null;
        Token otherlv_81=null;
        Token otherlv_83=null;
        Token otherlv_84=null;
        Token otherlv_85=null;
        Token otherlv_86=null;
        Token otherlv_87=null;
        Token otherlv_88=null;
        Token otherlv_89=null;
        Token otherlv_90=null;
        Token otherlv_92=null;
        Token otherlv_93=null;
        Token otherlv_94=null;
        Token otherlv_96=null;
        Token otherlv_97=null;
        Token otherlv_98=null;
        Token otherlv_100=null;
        Token otherlv_101=null;
        Token otherlv_102=null;
        Token otherlv_104=null;
        Token otherlv_105=null;
        Token otherlv_106=null;
        Token otherlv_107=null;
        Token otherlv_109=null;
        Token otherlv_111=null;
        Token otherlv_112=null;
        Token otherlv_113=null;
        Token otherlv_114=null;
        Token otherlv_117=null;
        Token otherlv_118=null;
        Token otherlv_119=null;
        Token otherlv_120=null;
        Token otherlv_122=null;
        Token otherlv_124=null;
        Token otherlv_125=null;
        Token otherlv_126=null;
        Token otherlv_127=null;
        Token otherlv_128=null;
        Token otherlv_130=null;
        Token otherlv_132=null;
        Token otherlv_133=null;
        Token otherlv_134=null;
        Token otherlv_135=null;
        Token otherlv_136=null;
        Token otherlv_138=null;
        Token otherlv_140=null;
        Token otherlv_141=null;
        Token otherlv_142=null;
        Token otherlv_143=null;
        Token otherlv_145=null;
        Token otherlv_146=null;
        Token otherlv_147=null;
        Token otherlv_149=null;
        Token otherlv_150=null;
        Token otherlv_151=null;
        Token otherlv_153=null;
        Token otherlv_154=null;
        Token otherlv_155=null;
        Token lv_minProperties_156_0=null;
        Token otherlv_157=null;
        Token otherlv_158=null;
        Token otherlv_159=null;
        Token lv_maxProperties_160_0=null;
        Token otherlv_161=null;
        Token otherlv_162=null;
        Token otherlv_163=null;
        Token lv_maxItems_164_0=null;
        Token otherlv_165=null;
        Token otherlv_166=null;
        Token otherlv_167=null;
        Token lv_minItems_168_0=null;
        Token otherlv_169=null;
        Token otherlv_170=null;
        Token otherlv_171=null;
        Token lv_maxLength_172_0=null;
        Token otherlv_173=null;
        Token otherlv_174=null;
        Token otherlv_175=null;
        Token lv_minLength_176_0=null;
        Token otherlv_177=null;
        Token otherlv_178=null;
        Token otherlv_179=null;
        Token otherlv_181=null;
        Token otherlv_182=null;
        Token otherlv_183=null;
        Token otherlv_185=null;
        Token otherlv_186=null;
        Token otherlv_187=null;
        Token otherlv_189=null;
        Token otherlv_190=null;
        Token otherlv_191=null;
        Token otherlv_193=null;
        Token otherlv_194=null;
        Token otherlv_195=null;
        Token lv_multipleOf_196_0=null;
        Token otherlv_197=null;
        Token otherlv_198=null;
        Token otherlv_199=null;
        Token otherlv_201=null;
        Token otherlv_202=null;
        Token otherlv_203=null;
        Token otherlv_205=null;
        Token otherlv_206=null;
        Token otherlv_207=null;
        Token otherlv_209=null;
        Token otherlv_210=null;
        Token otherlv_211=null;
        Token otherlv_213=null;
        Token otherlv_214=null;
        EObject lv_type_5_0 = null;

        EObject lv_dependencies_10_0 = null;

        EObject lv_additionalProperties_15_0 = null;

        EObject lv_additionalItems_19_0 = null;

        EObject lv_default_23_0 = null;

        EObject lv_patternProperties_28_0 = null;

        EObject lv_patternProperties_30_0 = null;

        EObject lv_example_35_0 = null;

        EObject lv_items_39_0 = null;

        EObject lv_contains_43_0 = null;

        EObject lv_definitions_48_0 = null;

        EObject lv_definitions_50_0 = null;

        EObject lv_requiredProperties_60_0 = null;

        EObject lv_requiredProperties_62_0 = null;

        EObject lv_properties_72_0 = null;

        EObject lv_properties_74_0 = null;

        EObject lv_enumValues_80_0 = null;

        EObject lv_enumValues_82_0 = null;

        EObject lv_id_91_0 = null;

        EObject lv_ifSchema_95_0 = null;

        EObject lv_thenSchema_99_0 = null;

        EObject lv_elseSchema_103_0 = null;

        EObject lv_enumValues_108_0 = null;

        EObject lv_enumValues_110_0 = null;

        EObject lv_const_115_0 = null;

        Enumerator lv_constBoolean_116_0 = null;

        EObject lv_anyOfs_121_0 = null;

        EObject lv_anyOfs_123_0 = null;

        EObject lv_oneOfs_129_0 = null;

        EObject lv_oneOfs_131_0 = null;

        EObject lv_allOfs_137_0 = null;

        EObject lv_allOfs_139_0 = null;

        EObject lv_not_144_0 = null;

        Enumerator lv_unique_148_0 = null;

        EObject lv_propertyNames_152_0 = null;

        EObject lv_pattern_180_0 = null;

        Enumerator lv_format_184_0 = null;

        EObject lv_mediaType_188_0 = null;

        EObject lv_encoding_192_0 = null;

        EObject lv_minimum_200_0 = null;

        EObject lv_exclusiveMinimum_204_0 = null;

        EObject lv_maximum_208_0 = null;

        EObject lv_exclusiveMaximum_212_0 = null;



        	enterRule();

        try {
            // InternalDraft7.g:78:2: ( ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"type\"' otherlv_4= ':' ( (lv_type_5_0= ruleTypes ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"dependencies\"' otherlv_8= ':' otherlv_9= '{' ( (lv_dependencies_10_0= ruleDependencies ) ) otherlv_11= '}' (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"additionalProperties\"' otherlv_14= ':' ( (lv_additionalProperties_15_0= ruleAdditionalProperties ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"additionalItems\"' otherlv_18= ':' ( (lv_additionalItems_19_0= ruleAdditionalItems ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= '\"default\"' otherlv_22= ':' ( (lv_default_23_0= ruleDefault ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= '\"patternProperties\"' otherlv_26= ':' otherlv_27= '{' ( (lv_patternProperties_28_0= ruleNamedSchema ) ) (otherlv_29= ',' ( (lv_patternProperties_30_0= ruleNamedSchema ) ) )* otherlv_31= '}' (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= '\"examples\"' otherlv_34= ':' ( (lv_example_35_0= ruleExample ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= '\"items\"' otherlv_38= ':' ( (lv_items_39_0= ruleItems ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= '\"contains\"' otherlv_42= ':' ( (lv_contains_43_0= ruleContains ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= '\"definitions\"' otherlv_46= ':' otherlv_47= '{' ( (lv_definitions_48_0= ruleNamedSchema ) ) (otherlv_49= ',' ( (lv_definitions_50_0= ruleNamedSchema ) ) )* otherlv_51= '}' (otherlv_52= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= '\"title\"' otherlv_54= ':' ( (lv_title_55_0= RULE_STRING ) ) (otherlv_56= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_57= '\"required\"' otherlv_58= ':' otherlv_59= '[' ( (lv_requiredProperties_60_0= ruleAnyString ) ) (otherlv_61= ',' ( (lv_requiredProperties_62_0= ruleAnyString ) ) )* otherlv_63= ']' (otherlv_64= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_65= '\"description\"' otherlv_66= ':' ( (lv_description_67_0= RULE_STRING ) ) (otherlv_68= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_69= '\"properties\"' otherlv_70= ':' otherlv_71= '{' ( (lv_properties_72_0= ruleNamedSchema ) ) (otherlv_73= ',' ( (lv_properties_74_0= ruleNamedSchema ) ) )* otherlv_75= '}' (otherlv_76= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_77= '\"enum\"' otherlv_78= ':' otherlv_79= '[' ( (lv_enumValues_80_0= ruleAnyString ) ) (otherlv_81= ',' ( (lv_enumValues_82_0= ruleAnyString ) ) )* otherlv_83= ']' (otherlv_84= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_85= '\"$schema\"' otherlv_86= ':' otherlv_87= '\"http://json-schema.org/draft-07/schema#\"' (otherlv_88= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_89= '\"$id\"' otherlv_90= ':' ( (lv_id_91_0= ruleAnyString ) ) (otherlv_92= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_93= '\"if\"' otherlv_94= ':' ( (lv_ifSchema_95_0= ruleSchema ) ) (otherlv_96= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_97= '\"then\"' otherlv_98= ':' ( (lv_thenSchema_99_0= ruleSchema ) ) (otherlv_100= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_101= '\"else\"' otherlv_102= ':' ( (lv_elseSchema_103_0= ruleSchema ) ) (otherlv_104= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_105= '\"enum\"' otherlv_106= ':' otherlv_107= '[' ( (lv_enumValues_108_0= ruleAnyString ) ) (otherlv_109= ',' ( (lv_enumValues_110_0= ruleAnyString ) ) )* otherlv_111= ']' (otherlv_112= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_113= '\"const\"' otherlv_114= ':' ( ( (lv_const_115_0= ruleAnyString ) ) | ( (lv_constBoolean_116_0= ruleBoolean ) ) ) (otherlv_117= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_118= '\"anyOf\"' otherlv_119= ':' otherlv_120= '[' ( (lv_anyOfs_121_0= ruleAbstractSchema ) ) (otherlv_122= ',' ( (lv_anyOfs_123_0= ruleAbstractSchema ) ) )* otherlv_124= ']' (otherlv_125= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_126= '\"oneOf\"' otherlv_127= ':' otherlv_128= '[' ( (lv_oneOfs_129_0= ruleAbstractSchema ) ) (otherlv_130= ',' ( (lv_oneOfs_131_0= ruleAbstractSchema ) ) )* otherlv_132= ']' (otherlv_133= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_134= '\"allOf\"' otherlv_135= ':' otherlv_136= '[' ( (lv_allOfs_137_0= ruleAbstractSchema ) ) (otherlv_138= ',' ( (lv_allOfs_139_0= ruleAbstractSchema ) ) )* otherlv_140= ']' (otherlv_141= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_142= '\"not\"' otherlv_143= ':' ( (lv_not_144_0= ruleAbstractSchema ) ) (otherlv_145= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_146= '\"uniqueItems\"' otherlv_147= ':' ( (lv_unique_148_0= ruleBoolean ) ) (otherlv_149= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_150= '\"propertyNames\"' otherlv_151= ':' ( (lv_propertyNames_152_0= ruleAbstractSchema ) ) (otherlv_153= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_154= '\"minProperties\"' otherlv_155= ':' ( (lv_minProperties_156_0= RULE_INT ) ) (otherlv_157= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_158= '\"maxProperties\"' otherlv_159= ':' ( (lv_maxProperties_160_0= RULE_INT ) ) (otherlv_161= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_162= '\"maxItems\"' otherlv_163= ':' ( (lv_maxItems_164_0= RULE_INT ) ) (otherlv_165= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_166= '\"minItems\"' otherlv_167= ':' ( (lv_minItems_168_0= RULE_INT ) ) (otherlv_169= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_170= '\"maxLength\"' otherlv_171= ':' ( (lv_maxLength_172_0= RULE_INT ) ) (otherlv_173= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_174= '\"minLength\"' otherlv_175= ':' ( (lv_minLength_176_0= RULE_INT ) ) (otherlv_177= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_178= '\"pattern\"' otherlv_179= ':' ( (lv_pattern_180_0= ruleAnyString ) ) (otherlv_181= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_182= '\"format\"' otherlv_183= ':' ( (lv_format_184_0= ruleFormatTypes ) ) (otherlv_185= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_186= '\"contentMediaType\"' otherlv_187= ':' ( (lv_mediaType_188_0= ruleAnyString ) ) (otherlv_189= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_190= '\"contentEncoding\"' otherlv_191= ':' ( (lv_encoding_192_0= ruleAnyString ) ) (otherlv_193= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_194= '\"multiples\"' otherlv_195= ':' ( (lv_multipleOf_196_0= RULE_INT ) ) (otherlv_197= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_198= '\"minimum\"' otherlv_199= ':' ( (lv_minimum_200_0= ruleNumber ) ) (otherlv_201= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_202= '\"exclusiveMinimum\"' otherlv_203= ':' ( (lv_exclusiveMinimum_204_0= ruleNumber ) ) (otherlv_205= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_206= '\"maximum\"' otherlv_207= ':' ( (lv_maximum_208_0= ruleNumber ) ) (otherlv_209= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_210= '\"exclusiveMaximum\"' otherlv_211= ':' ( (lv_exclusiveMaximum_212_0= ruleNumber ) ) (otherlv_213= ',' )? ) ) ) ) )* ) ) ) otherlv_214= '}' ) )
            // InternalDraft7.g:79:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"type\"' otherlv_4= ':' ( (lv_type_5_0= ruleTypes ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"dependencies\"' otherlv_8= ':' otherlv_9= '{' ( (lv_dependencies_10_0= ruleDependencies ) ) otherlv_11= '}' (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"additionalProperties\"' otherlv_14= ':' ( (lv_additionalProperties_15_0= ruleAdditionalProperties ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"additionalItems\"' otherlv_18= ':' ( (lv_additionalItems_19_0= ruleAdditionalItems ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= '\"default\"' otherlv_22= ':' ( (lv_default_23_0= ruleDefault ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= '\"patternProperties\"' otherlv_26= ':' otherlv_27= '{' ( (lv_patternProperties_28_0= ruleNamedSchema ) ) (otherlv_29= ',' ( (lv_patternProperties_30_0= ruleNamedSchema ) ) )* otherlv_31= '}' (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= '\"examples\"' otherlv_34= ':' ( (lv_example_35_0= ruleExample ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= '\"items\"' otherlv_38= ':' ( (lv_items_39_0= ruleItems ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= '\"contains\"' otherlv_42= ':' ( (lv_contains_43_0= ruleContains ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= '\"definitions\"' otherlv_46= ':' otherlv_47= '{' ( (lv_definitions_48_0= ruleNamedSchema ) ) (otherlv_49= ',' ( (lv_definitions_50_0= ruleNamedSchema ) ) )* otherlv_51= '}' (otherlv_52= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= '\"title\"' otherlv_54= ':' ( (lv_title_55_0= RULE_STRING ) ) (otherlv_56= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_57= '\"required\"' otherlv_58= ':' otherlv_59= '[' ( (lv_requiredProperties_60_0= ruleAnyString ) ) (otherlv_61= ',' ( (lv_requiredProperties_62_0= ruleAnyString ) ) )* otherlv_63= ']' (otherlv_64= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_65= '\"description\"' otherlv_66= ':' ( (lv_description_67_0= RULE_STRING ) ) (otherlv_68= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_69= '\"properties\"' otherlv_70= ':' otherlv_71= '{' ( (lv_properties_72_0= ruleNamedSchema ) ) (otherlv_73= ',' ( (lv_properties_74_0= ruleNamedSchema ) ) )* otherlv_75= '}' (otherlv_76= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_77= '\"enum\"' otherlv_78= ':' otherlv_79= '[' ( (lv_enumValues_80_0= ruleAnyString ) ) (otherlv_81= ',' ( (lv_enumValues_82_0= ruleAnyString ) ) )* otherlv_83= ']' (otherlv_84= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_85= '\"$schema\"' otherlv_86= ':' otherlv_87= '\"http://json-schema.org/draft-07/schema#\"' (otherlv_88= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_89= '\"$id\"' otherlv_90= ':' ( (lv_id_91_0= ruleAnyString ) ) (otherlv_92= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_93= '\"if\"' otherlv_94= ':' ( (lv_ifSchema_95_0= ruleSchema ) ) (otherlv_96= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_97= '\"then\"' otherlv_98= ':' ( (lv_thenSchema_99_0= ruleSchema ) ) (otherlv_100= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_101= '\"else\"' otherlv_102= ':' ( (lv_elseSchema_103_0= ruleSchema ) ) (otherlv_104= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_105= '\"enum\"' otherlv_106= ':' otherlv_107= '[' ( (lv_enumValues_108_0= ruleAnyString ) ) (otherlv_109= ',' ( (lv_enumValues_110_0= ruleAnyString ) ) )* otherlv_111= ']' (otherlv_112= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_113= '\"const\"' otherlv_114= ':' ( ( (lv_const_115_0= ruleAnyString ) ) | ( (lv_constBoolean_116_0= ruleBoolean ) ) ) (otherlv_117= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_118= '\"anyOf\"' otherlv_119= ':' otherlv_120= '[' ( (lv_anyOfs_121_0= ruleAbstractSchema ) ) (otherlv_122= ',' ( (lv_anyOfs_123_0= ruleAbstractSchema ) ) )* otherlv_124= ']' (otherlv_125= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_126= '\"oneOf\"' otherlv_127= ':' otherlv_128= '[' ( (lv_oneOfs_129_0= ruleAbstractSchema ) ) (otherlv_130= ',' ( (lv_oneOfs_131_0= ruleAbstractSchema ) ) )* otherlv_132= ']' (otherlv_133= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_134= '\"allOf\"' otherlv_135= ':' otherlv_136= '[' ( (lv_allOfs_137_0= ruleAbstractSchema ) ) (otherlv_138= ',' ( (lv_allOfs_139_0= ruleAbstractSchema ) ) )* otherlv_140= ']' (otherlv_141= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_142= '\"not\"' otherlv_143= ':' ( (lv_not_144_0= ruleAbstractSchema ) ) (otherlv_145= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_146= '\"uniqueItems\"' otherlv_147= ':' ( (lv_unique_148_0= ruleBoolean ) ) (otherlv_149= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_150= '\"propertyNames\"' otherlv_151= ':' ( (lv_propertyNames_152_0= ruleAbstractSchema ) ) (otherlv_153= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_154= '\"minProperties\"' otherlv_155= ':' ( (lv_minProperties_156_0= RULE_INT ) ) (otherlv_157= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_158= '\"maxProperties\"' otherlv_159= ':' ( (lv_maxProperties_160_0= RULE_INT ) ) (otherlv_161= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_162= '\"maxItems\"' otherlv_163= ':' ( (lv_maxItems_164_0= RULE_INT ) ) (otherlv_165= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_166= '\"minItems\"' otherlv_167= ':' ( (lv_minItems_168_0= RULE_INT ) ) (otherlv_169= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_170= '\"maxLength\"' otherlv_171= ':' ( (lv_maxLength_172_0= RULE_INT ) ) (otherlv_173= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_174= '\"minLength\"' otherlv_175= ':' ( (lv_minLength_176_0= RULE_INT ) ) (otherlv_177= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_178= '\"pattern\"' otherlv_179= ':' ( (lv_pattern_180_0= ruleAnyString ) ) (otherlv_181= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_182= '\"format\"' otherlv_183= ':' ( (lv_format_184_0= ruleFormatTypes ) ) (otherlv_185= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_186= '\"contentMediaType\"' otherlv_187= ':' ( (lv_mediaType_188_0= ruleAnyString ) ) (otherlv_189= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_190= '\"contentEncoding\"' otherlv_191= ':' ( (lv_encoding_192_0= ruleAnyString ) ) (otherlv_193= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_194= '\"multiples\"' otherlv_195= ':' ( (lv_multipleOf_196_0= RULE_INT ) ) (otherlv_197= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_198= '\"minimum\"' otherlv_199= ':' ( (lv_minimum_200_0= ruleNumber ) ) (otherlv_201= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_202= '\"exclusiveMinimum\"' otherlv_203= ':' ( (lv_exclusiveMinimum_204_0= ruleNumber ) ) (otherlv_205= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_206= '\"maximum\"' otherlv_207= ':' ( (lv_maximum_208_0= ruleNumber ) ) (otherlv_209= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_210= '\"exclusiveMaximum\"' otherlv_211= ':' ( (lv_exclusiveMaximum_212_0= ruleNumber ) ) (otherlv_213= ',' )? ) ) ) ) )* ) ) ) otherlv_214= '}' )
            {
            // InternalDraft7.g:79:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"type\"' otherlv_4= ':' ( (lv_type_5_0= ruleTypes ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"dependencies\"' otherlv_8= ':' otherlv_9= '{' ( (lv_dependencies_10_0= ruleDependencies ) ) otherlv_11= '}' (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"additionalProperties\"' otherlv_14= ':' ( (lv_additionalProperties_15_0= ruleAdditionalProperties ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"additionalItems\"' otherlv_18= ':' ( (lv_additionalItems_19_0= ruleAdditionalItems ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= '\"default\"' otherlv_22= ':' ( (lv_default_23_0= ruleDefault ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= '\"patternProperties\"' otherlv_26= ':' otherlv_27= '{' ( (lv_patternProperties_28_0= ruleNamedSchema ) ) (otherlv_29= ',' ( (lv_patternProperties_30_0= ruleNamedSchema ) ) )* otherlv_31= '}' (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= '\"examples\"' otherlv_34= ':' ( (lv_example_35_0= ruleExample ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= '\"items\"' otherlv_38= ':' ( (lv_items_39_0= ruleItems ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= '\"contains\"' otherlv_42= ':' ( (lv_contains_43_0= ruleContains ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= '\"definitions\"' otherlv_46= ':' otherlv_47= '{' ( (lv_definitions_48_0= ruleNamedSchema ) ) (otherlv_49= ',' ( (lv_definitions_50_0= ruleNamedSchema ) ) )* otherlv_51= '}' (otherlv_52= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= '\"title\"' otherlv_54= ':' ( (lv_title_55_0= RULE_STRING ) ) (otherlv_56= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_57= '\"required\"' otherlv_58= ':' otherlv_59= '[' ( (lv_requiredProperties_60_0= ruleAnyString ) ) (otherlv_61= ',' ( (lv_requiredProperties_62_0= ruleAnyString ) ) )* otherlv_63= ']' (otherlv_64= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_65= '\"description\"' otherlv_66= ':' ( (lv_description_67_0= RULE_STRING ) ) (otherlv_68= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_69= '\"properties\"' otherlv_70= ':' otherlv_71= '{' ( (lv_properties_72_0= ruleNamedSchema ) ) (otherlv_73= ',' ( (lv_properties_74_0= ruleNamedSchema ) ) )* otherlv_75= '}' (otherlv_76= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_77= '\"enum\"' otherlv_78= ':' otherlv_79= '[' ( (lv_enumValues_80_0= ruleAnyString ) ) (otherlv_81= ',' ( (lv_enumValues_82_0= ruleAnyString ) ) )* otherlv_83= ']' (otherlv_84= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_85= '\"$schema\"' otherlv_86= ':' otherlv_87= '\"http://json-schema.org/draft-07/schema#\"' (otherlv_88= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_89= '\"$id\"' otherlv_90= ':' ( (lv_id_91_0= ruleAnyString ) ) (otherlv_92= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_93= '\"if\"' otherlv_94= ':' ( (lv_ifSchema_95_0= ruleSchema ) ) (otherlv_96= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_97= '\"then\"' otherlv_98= ':' ( (lv_thenSchema_99_0= ruleSchema ) ) (otherlv_100= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_101= '\"else\"' otherlv_102= ':' ( (lv_elseSchema_103_0= ruleSchema ) ) (otherlv_104= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_105= '\"enum\"' otherlv_106= ':' otherlv_107= '[' ( (lv_enumValues_108_0= ruleAnyString ) ) (otherlv_109= ',' ( (lv_enumValues_110_0= ruleAnyString ) ) )* otherlv_111= ']' (otherlv_112= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_113= '\"const\"' otherlv_114= ':' ( ( (lv_const_115_0= ruleAnyString ) ) | ( (lv_constBoolean_116_0= ruleBoolean ) ) ) (otherlv_117= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_118= '\"anyOf\"' otherlv_119= ':' otherlv_120= '[' ( (lv_anyOfs_121_0= ruleAbstractSchema ) ) (otherlv_122= ',' ( (lv_anyOfs_123_0= ruleAbstractSchema ) ) )* otherlv_124= ']' (otherlv_125= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_126= '\"oneOf\"' otherlv_127= ':' otherlv_128= '[' ( (lv_oneOfs_129_0= ruleAbstractSchema ) ) (otherlv_130= ',' ( (lv_oneOfs_131_0= ruleAbstractSchema ) ) )* otherlv_132= ']' (otherlv_133= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_134= '\"allOf\"' otherlv_135= ':' otherlv_136= '[' ( (lv_allOfs_137_0= ruleAbstractSchema ) ) (otherlv_138= ',' ( (lv_allOfs_139_0= ruleAbstractSchema ) ) )* otherlv_140= ']' (otherlv_141= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_142= '\"not\"' otherlv_143= ':' ( (lv_not_144_0= ruleAbstractSchema ) ) (otherlv_145= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_146= '\"uniqueItems\"' otherlv_147= ':' ( (lv_unique_148_0= ruleBoolean ) ) (otherlv_149= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_150= '\"propertyNames\"' otherlv_151= ':' ( (lv_propertyNames_152_0= ruleAbstractSchema ) ) (otherlv_153= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_154= '\"minProperties\"' otherlv_155= ':' ( (lv_minProperties_156_0= RULE_INT ) ) (otherlv_157= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_158= '\"maxProperties\"' otherlv_159= ':' ( (lv_maxProperties_160_0= RULE_INT ) ) (otherlv_161= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_162= '\"maxItems\"' otherlv_163= ':' ( (lv_maxItems_164_0= RULE_INT ) ) (otherlv_165= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_166= '\"minItems\"' otherlv_167= ':' ( (lv_minItems_168_0= RULE_INT ) ) (otherlv_169= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_170= '\"maxLength\"' otherlv_171= ':' ( (lv_maxLength_172_0= RULE_INT ) ) (otherlv_173= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_174= '\"minLength\"' otherlv_175= ':' ( (lv_minLength_176_0= RULE_INT ) ) (otherlv_177= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_178= '\"pattern\"' otherlv_179= ':' ( (lv_pattern_180_0= ruleAnyString ) ) (otherlv_181= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_182= '\"format\"' otherlv_183= ':' ( (lv_format_184_0= ruleFormatTypes ) ) (otherlv_185= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_186= '\"contentMediaType\"' otherlv_187= ':' ( (lv_mediaType_188_0= ruleAnyString ) ) (otherlv_189= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_190= '\"contentEncoding\"' otherlv_191= ':' ( (lv_encoding_192_0= ruleAnyString ) ) (otherlv_193= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_194= '\"multiples\"' otherlv_195= ':' ( (lv_multipleOf_196_0= RULE_INT ) ) (otherlv_197= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_198= '\"minimum\"' otherlv_199= ':' ( (lv_minimum_200_0= ruleNumber ) ) (otherlv_201= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_202= '\"exclusiveMinimum\"' otherlv_203= ':' ( (lv_exclusiveMinimum_204_0= ruleNumber ) ) (otherlv_205= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_206= '\"maximum\"' otherlv_207= ':' ( (lv_maximum_208_0= ruleNumber ) ) (otherlv_209= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_210= '\"exclusiveMaximum\"' otherlv_211= ':' ( (lv_exclusiveMaximum_212_0= ruleNumber ) ) (otherlv_213= ',' )? ) ) ) ) )* ) ) ) otherlv_214= '}' )
            // InternalDraft7.g:80:3: () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"type\"' otherlv_4= ':' ( (lv_type_5_0= ruleTypes ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"dependencies\"' otherlv_8= ':' otherlv_9= '{' ( (lv_dependencies_10_0= ruleDependencies ) ) otherlv_11= '}' (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"additionalProperties\"' otherlv_14= ':' ( (lv_additionalProperties_15_0= ruleAdditionalProperties ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"additionalItems\"' otherlv_18= ':' ( (lv_additionalItems_19_0= ruleAdditionalItems ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= '\"default\"' otherlv_22= ':' ( (lv_default_23_0= ruleDefault ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= '\"patternProperties\"' otherlv_26= ':' otherlv_27= '{' ( (lv_patternProperties_28_0= ruleNamedSchema ) ) (otherlv_29= ',' ( (lv_patternProperties_30_0= ruleNamedSchema ) ) )* otherlv_31= '}' (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= '\"examples\"' otherlv_34= ':' ( (lv_example_35_0= ruleExample ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= '\"items\"' otherlv_38= ':' ( (lv_items_39_0= ruleItems ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= '\"contains\"' otherlv_42= ':' ( (lv_contains_43_0= ruleContains ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= '\"definitions\"' otherlv_46= ':' otherlv_47= '{' ( (lv_definitions_48_0= ruleNamedSchema ) ) (otherlv_49= ',' ( (lv_definitions_50_0= ruleNamedSchema ) ) )* otherlv_51= '}' (otherlv_52= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= '\"title\"' otherlv_54= ':' ( (lv_title_55_0= RULE_STRING ) ) (otherlv_56= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_57= '\"required\"' otherlv_58= ':' otherlv_59= '[' ( (lv_requiredProperties_60_0= ruleAnyString ) ) (otherlv_61= ',' ( (lv_requiredProperties_62_0= ruleAnyString ) ) )* otherlv_63= ']' (otherlv_64= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_65= '\"description\"' otherlv_66= ':' ( (lv_description_67_0= RULE_STRING ) ) (otherlv_68= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_69= '\"properties\"' otherlv_70= ':' otherlv_71= '{' ( (lv_properties_72_0= ruleNamedSchema ) ) (otherlv_73= ',' ( (lv_properties_74_0= ruleNamedSchema ) ) )* otherlv_75= '}' (otherlv_76= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_77= '\"enum\"' otherlv_78= ':' otherlv_79= '[' ( (lv_enumValues_80_0= ruleAnyString ) ) (otherlv_81= ',' ( (lv_enumValues_82_0= ruleAnyString ) ) )* otherlv_83= ']' (otherlv_84= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_85= '\"$schema\"' otherlv_86= ':' otherlv_87= '\"http://json-schema.org/draft-07/schema#\"' (otherlv_88= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_89= '\"$id\"' otherlv_90= ':' ( (lv_id_91_0= ruleAnyString ) ) (otherlv_92= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_93= '\"if\"' otherlv_94= ':' ( (lv_ifSchema_95_0= ruleSchema ) ) (otherlv_96= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_97= '\"then\"' otherlv_98= ':' ( (lv_thenSchema_99_0= ruleSchema ) ) (otherlv_100= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_101= '\"else\"' otherlv_102= ':' ( (lv_elseSchema_103_0= ruleSchema ) ) (otherlv_104= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_105= '\"enum\"' otherlv_106= ':' otherlv_107= '[' ( (lv_enumValues_108_0= ruleAnyString ) ) (otherlv_109= ',' ( (lv_enumValues_110_0= ruleAnyString ) ) )* otherlv_111= ']' (otherlv_112= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_113= '\"const\"' otherlv_114= ':' ( ( (lv_const_115_0= ruleAnyString ) ) | ( (lv_constBoolean_116_0= ruleBoolean ) ) ) (otherlv_117= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_118= '\"anyOf\"' otherlv_119= ':' otherlv_120= '[' ( (lv_anyOfs_121_0= ruleAbstractSchema ) ) (otherlv_122= ',' ( (lv_anyOfs_123_0= ruleAbstractSchema ) ) )* otherlv_124= ']' (otherlv_125= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_126= '\"oneOf\"' otherlv_127= ':' otherlv_128= '[' ( (lv_oneOfs_129_0= ruleAbstractSchema ) ) (otherlv_130= ',' ( (lv_oneOfs_131_0= ruleAbstractSchema ) ) )* otherlv_132= ']' (otherlv_133= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_134= '\"allOf\"' otherlv_135= ':' otherlv_136= '[' ( (lv_allOfs_137_0= ruleAbstractSchema ) ) (otherlv_138= ',' ( (lv_allOfs_139_0= ruleAbstractSchema ) ) )* otherlv_140= ']' (otherlv_141= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_142= '\"not\"' otherlv_143= ':' ( (lv_not_144_0= ruleAbstractSchema ) ) (otherlv_145= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_146= '\"uniqueItems\"' otherlv_147= ':' ( (lv_unique_148_0= ruleBoolean ) ) (otherlv_149= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_150= '\"propertyNames\"' otherlv_151= ':' ( (lv_propertyNames_152_0= ruleAbstractSchema ) ) (otherlv_153= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_154= '\"minProperties\"' otherlv_155= ':' ( (lv_minProperties_156_0= RULE_INT ) ) (otherlv_157= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_158= '\"maxProperties\"' otherlv_159= ':' ( (lv_maxProperties_160_0= RULE_INT ) ) (otherlv_161= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_162= '\"maxItems\"' otherlv_163= ':' ( (lv_maxItems_164_0= RULE_INT ) ) (otherlv_165= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_166= '\"minItems\"' otherlv_167= ':' ( (lv_minItems_168_0= RULE_INT ) ) (otherlv_169= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_170= '\"maxLength\"' otherlv_171= ':' ( (lv_maxLength_172_0= RULE_INT ) ) (otherlv_173= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_174= '\"minLength\"' otherlv_175= ':' ( (lv_minLength_176_0= RULE_INT ) ) (otherlv_177= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_178= '\"pattern\"' otherlv_179= ':' ( (lv_pattern_180_0= ruleAnyString ) ) (otherlv_181= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_182= '\"format\"' otherlv_183= ':' ( (lv_format_184_0= ruleFormatTypes ) ) (otherlv_185= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_186= '\"contentMediaType\"' otherlv_187= ':' ( (lv_mediaType_188_0= ruleAnyString ) ) (otherlv_189= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_190= '\"contentEncoding\"' otherlv_191= ':' ( (lv_encoding_192_0= ruleAnyString ) ) (otherlv_193= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_194= '\"multiples\"' otherlv_195= ':' ( (lv_multipleOf_196_0= RULE_INT ) ) (otherlv_197= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_198= '\"minimum\"' otherlv_199= ':' ( (lv_minimum_200_0= ruleNumber ) ) (otherlv_201= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_202= '\"exclusiveMinimum\"' otherlv_203= ':' ( (lv_exclusiveMinimum_204_0= ruleNumber ) ) (otherlv_205= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_206= '\"maximum\"' otherlv_207= ':' ( (lv_maximum_208_0= ruleNumber ) ) (otherlv_209= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_210= '\"exclusiveMaximum\"' otherlv_211= ':' ( (lv_exclusiveMaximum_212_0= ruleNumber ) ) (otherlv_213= ',' )? ) ) ) ) )* ) ) ) otherlv_214= '}'
            {
            // InternalDraft7.g:80:3: ()
            // InternalDraft7.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSchemaAccess().getSchemaAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSchemaAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalDraft7.g:91:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"type\"' otherlv_4= ':' ( (lv_type_5_0= ruleTypes ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"dependencies\"' otherlv_8= ':' otherlv_9= '{' ( (lv_dependencies_10_0= ruleDependencies ) ) otherlv_11= '}' (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"additionalProperties\"' otherlv_14= ':' ( (lv_additionalProperties_15_0= ruleAdditionalProperties ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"additionalItems\"' otherlv_18= ':' ( (lv_additionalItems_19_0= ruleAdditionalItems ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= '\"default\"' otherlv_22= ':' ( (lv_default_23_0= ruleDefault ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= '\"patternProperties\"' otherlv_26= ':' otherlv_27= '{' ( (lv_patternProperties_28_0= ruleNamedSchema ) ) (otherlv_29= ',' ( (lv_patternProperties_30_0= ruleNamedSchema ) ) )* otherlv_31= '}' (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= '\"examples\"' otherlv_34= ':' ( (lv_example_35_0= ruleExample ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= '\"items\"' otherlv_38= ':' ( (lv_items_39_0= ruleItems ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= '\"contains\"' otherlv_42= ':' ( (lv_contains_43_0= ruleContains ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= '\"definitions\"' otherlv_46= ':' otherlv_47= '{' ( (lv_definitions_48_0= ruleNamedSchema ) ) (otherlv_49= ',' ( (lv_definitions_50_0= ruleNamedSchema ) ) )* otherlv_51= '}' (otherlv_52= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= '\"title\"' otherlv_54= ':' ( (lv_title_55_0= RULE_STRING ) ) (otherlv_56= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_57= '\"required\"' otherlv_58= ':' otherlv_59= '[' ( (lv_requiredProperties_60_0= ruleAnyString ) ) (otherlv_61= ',' ( (lv_requiredProperties_62_0= ruleAnyString ) ) )* otherlv_63= ']' (otherlv_64= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_65= '\"description\"' otherlv_66= ':' ( (lv_description_67_0= RULE_STRING ) ) (otherlv_68= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_69= '\"properties\"' otherlv_70= ':' otherlv_71= '{' ( (lv_properties_72_0= ruleNamedSchema ) ) (otherlv_73= ',' ( (lv_properties_74_0= ruleNamedSchema ) ) )* otherlv_75= '}' (otherlv_76= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_77= '\"enum\"' otherlv_78= ':' otherlv_79= '[' ( (lv_enumValues_80_0= ruleAnyString ) ) (otherlv_81= ',' ( (lv_enumValues_82_0= ruleAnyString ) ) )* otherlv_83= ']' (otherlv_84= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_85= '\"$schema\"' otherlv_86= ':' otherlv_87= '\"http://json-schema.org/draft-07/schema#\"' (otherlv_88= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_89= '\"$id\"' otherlv_90= ':' ( (lv_id_91_0= ruleAnyString ) ) (otherlv_92= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_93= '\"if\"' otherlv_94= ':' ( (lv_ifSchema_95_0= ruleSchema ) ) (otherlv_96= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_97= '\"then\"' otherlv_98= ':' ( (lv_thenSchema_99_0= ruleSchema ) ) (otherlv_100= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_101= '\"else\"' otherlv_102= ':' ( (lv_elseSchema_103_0= ruleSchema ) ) (otherlv_104= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_105= '\"enum\"' otherlv_106= ':' otherlv_107= '[' ( (lv_enumValues_108_0= ruleAnyString ) ) (otherlv_109= ',' ( (lv_enumValues_110_0= ruleAnyString ) ) )* otherlv_111= ']' (otherlv_112= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_113= '\"const\"' otherlv_114= ':' ( ( (lv_const_115_0= ruleAnyString ) ) | ( (lv_constBoolean_116_0= ruleBoolean ) ) ) (otherlv_117= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_118= '\"anyOf\"' otherlv_119= ':' otherlv_120= '[' ( (lv_anyOfs_121_0= ruleAbstractSchema ) ) (otherlv_122= ',' ( (lv_anyOfs_123_0= ruleAbstractSchema ) ) )* otherlv_124= ']' (otherlv_125= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_126= '\"oneOf\"' otherlv_127= ':' otherlv_128= '[' ( (lv_oneOfs_129_0= ruleAbstractSchema ) ) (otherlv_130= ',' ( (lv_oneOfs_131_0= ruleAbstractSchema ) ) )* otherlv_132= ']' (otherlv_133= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_134= '\"allOf\"' otherlv_135= ':' otherlv_136= '[' ( (lv_allOfs_137_0= ruleAbstractSchema ) ) (otherlv_138= ',' ( (lv_allOfs_139_0= ruleAbstractSchema ) ) )* otherlv_140= ']' (otherlv_141= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_142= '\"not\"' otherlv_143= ':' ( (lv_not_144_0= ruleAbstractSchema ) ) (otherlv_145= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_146= '\"uniqueItems\"' otherlv_147= ':' ( (lv_unique_148_0= ruleBoolean ) ) (otherlv_149= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_150= '\"propertyNames\"' otherlv_151= ':' ( (lv_propertyNames_152_0= ruleAbstractSchema ) ) (otherlv_153= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_154= '\"minProperties\"' otherlv_155= ':' ( (lv_minProperties_156_0= RULE_INT ) ) (otherlv_157= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_158= '\"maxProperties\"' otherlv_159= ':' ( (lv_maxProperties_160_0= RULE_INT ) ) (otherlv_161= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_162= '\"maxItems\"' otherlv_163= ':' ( (lv_maxItems_164_0= RULE_INT ) ) (otherlv_165= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_166= '\"minItems\"' otherlv_167= ':' ( (lv_minItems_168_0= RULE_INT ) ) (otherlv_169= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_170= '\"maxLength\"' otherlv_171= ':' ( (lv_maxLength_172_0= RULE_INT ) ) (otherlv_173= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_174= '\"minLength\"' otherlv_175= ':' ( (lv_minLength_176_0= RULE_INT ) ) (otherlv_177= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_178= '\"pattern\"' otherlv_179= ':' ( (lv_pattern_180_0= ruleAnyString ) ) (otherlv_181= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_182= '\"format\"' otherlv_183= ':' ( (lv_format_184_0= ruleFormatTypes ) ) (otherlv_185= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_186= '\"contentMediaType\"' otherlv_187= ':' ( (lv_mediaType_188_0= ruleAnyString ) ) (otherlv_189= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_190= '\"contentEncoding\"' otherlv_191= ':' ( (lv_encoding_192_0= ruleAnyString ) ) (otherlv_193= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_194= '\"multiples\"' otherlv_195= ':' ( (lv_multipleOf_196_0= RULE_INT ) ) (otherlv_197= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_198= '\"minimum\"' otherlv_199= ':' ( (lv_minimum_200_0= ruleNumber ) ) (otherlv_201= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_202= '\"exclusiveMinimum\"' otherlv_203= ':' ( (lv_exclusiveMinimum_204_0= ruleNumber ) ) (otherlv_205= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_206= '\"maximum\"' otherlv_207= ':' ( (lv_maximum_208_0= ruleNumber ) ) (otherlv_209= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_210= '\"exclusiveMaximum\"' otherlv_211= ':' ( (lv_exclusiveMaximum_212_0= ruleNumber ) ) (otherlv_213= ',' )? ) ) ) ) )* ) ) )
            // InternalDraft7.g:92:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"type\"' otherlv_4= ':' ( (lv_type_5_0= ruleTypes ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"dependencies\"' otherlv_8= ':' otherlv_9= '{' ( (lv_dependencies_10_0= ruleDependencies ) ) otherlv_11= '}' (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"additionalProperties\"' otherlv_14= ':' ( (lv_additionalProperties_15_0= ruleAdditionalProperties ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"additionalItems\"' otherlv_18= ':' ( (lv_additionalItems_19_0= ruleAdditionalItems ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= '\"default\"' otherlv_22= ':' ( (lv_default_23_0= ruleDefault ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= '\"patternProperties\"' otherlv_26= ':' otherlv_27= '{' ( (lv_patternProperties_28_0= ruleNamedSchema ) ) (otherlv_29= ',' ( (lv_patternProperties_30_0= ruleNamedSchema ) ) )* otherlv_31= '}' (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= '\"examples\"' otherlv_34= ':' ( (lv_example_35_0= ruleExample ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= '\"items\"' otherlv_38= ':' ( (lv_items_39_0= ruleItems ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= '\"contains\"' otherlv_42= ':' ( (lv_contains_43_0= ruleContains ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= '\"definitions\"' otherlv_46= ':' otherlv_47= '{' ( (lv_definitions_48_0= ruleNamedSchema ) ) (otherlv_49= ',' ( (lv_definitions_50_0= ruleNamedSchema ) ) )* otherlv_51= '}' (otherlv_52= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= '\"title\"' otherlv_54= ':' ( (lv_title_55_0= RULE_STRING ) ) (otherlv_56= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_57= '\"required\"' otherlv_58= ':' otherlv_59= '[' ( (lv_requiredProperties_60_0= ruleAnyString ) ) (otherlv_61= ',' ( (lv_requiredProperties_62_0= ruleAnyString ) ) )* otherlv_63= ']' (otherlv_64= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_65= '\"description\"' otherlv_66= ':' ( (lv_description_67_0= RULE_STRING ) ) (otherlv_68= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_69= '\"properties\"' otherlv_70= ':' otherlv_71= '{' ( (lv_properties_72_0= ruleNamedSchema ) ) (otherlv_73= ',' ( (lv_properties_74_0= ruleNamedSchema ) ) )* otherlv_75= '}' (otherlv_76= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_77= '\"enum\"' otherlv_78= ':' otherlv_79= '[' ( (lv_enumValues_80_0= ruleAnyString ) ) (otherlv_81= ',' ( (lv_enumValues_82_0= ruleAnyString ) ) )* otherlv_83= ']' (otherlv_84= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_85= '\"$schema\"' otherlv_86= ':' otherlv_87= '\"http://json-schema.org/draft-07/schema#\"' (otherlv_88= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_89= '\"$id\"' otherlv_90= ':' ( (lv_id_91_0= ruleAnyString ) ) (otherlv_92= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_93= '\"if\"' otherlv_94= ':' ( (lv_ifSchema_95_0= ruleSchema ) ) (otherlv_96= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_97= '\"then\"' otherlv_98= ':' ( (lv_thenSchema_99_0= ruleSchema ) ) (otherlv_100= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_101= '\"else\"' otherlv_102= ':' ( (lv_elseSchema_103_0= ruleSchema ) ) (otherlv_104= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_105= '\"enum\"' otherlv_106= ':' otherlv_107= '[' ( (lv_enumValues_108_0= ruleAnyString ) ) (otherlv_109= ',' ( (lv_enumValues_110_0= ruleAnyString ) ) )* otherlv_111= ']' (otherlv_112= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_113= '\"const\"' otherlv_114= ':' ( ( (lv_const_115_0= ruleAnyString ) ) | ( (lv_constBoolean_116_0= ruleBoolean ) ) ) (otherlv_117= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_118= '\"anyOf\"' otherlv_119= ':' otherlv_120= '[' ( (lv_anyOfs_121_0= ruleAbstractSchema ) ) (otherlv_122= ',' ( (lv_anyOfs_123_0= ruleAbstractSchema ) ) )* otherlv_124= ']' (otherlv_125= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_126= '\"oneOf\"' otherlv_127= ':' otherlv_128= '[' ( (lv_oneOfs_129_0= ruleAbstractSchema ) ) (otherlv_130= ',' ( (lv_oneOfs_131_0= ruleAbstractSchema ) ) )* otherlv_132= ']' (otherlv_133= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_134= '\"allOf\"' otherlv_135= ':' otherlv_136= '[' ( (lv_allOfs_137_0= ruleAbstractSchema ) ) (otherlv_138= ',' ( (lv_allOfs_139_0= ruleAbstractSchema ) ) )* otherlv_140= ']' (otherlv_141= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_142= '\"not\"' otherlv_143= ':' ( (lv_not_144_0= ruleAbstractSchema ) ) (otherlv_145= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_146= '\"uniqueItems\"' otherlv_147= ':' ( (lv_unique_148_0= ruleBoolean ) ) (otherlv_149= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_150= '\"propertyNames\"' otherlv_151= ':' ( (lv_propertyNames_152_0= ruleAbstractSchema ) ) (otherlv_153= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_154= '\"minProperties\"' otherlv_155= ':' ( (lv_minProperties_156_0= RULE_INT ) ) (otherlv_157= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_158= '\"maxProperties\"' otherlv_159= ':' ( (lv_maxProperties_160_0= RULE_INT ) ) (otherlv_161= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_162= '\"maxItems\"' otherlv_163= ':' ( (lv_maxItems_164_0= RULE_INT ) ) (otherlv_165= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_166= '\"minItems\"' otherlv_167= ':' ( (lv_minItems_168_0= RULE_INT ) ) (otherlv_169= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_170= '\"maxLength\"' otherlv_171= ':' ( (lv_maxLength_172_0= RULE_INT ) ) (otherlv_173= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_174= '\"minLength\"' otherlv_175= ':' ( (lv_minLength_176_0= RULE_INT ) ) (otherlv_177= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_178= '\"pattern\"' otherlv_179= ':' ( (lv_pattern_180_0= ruleAnyString ) ) (otherlv_181= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_182= '\"format\"' otherlv_183= ':' ( (lv_format_184_0= ruleFormatTypes ) ) (otherlv_185= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_186= '\"contentMediaType\"' otherlv_187= ':' ( (lv_mediaType_188_0= ruleAnyString ) ) (otherlv_189= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_190= '\"contentEncoding\"' otherlv_191= ':' ( (lv_encoding_192_0= ruleAnyString ) ) (otherlv_193= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_194= '\"multiples\"' otherlv_195= ':' ( (lv_multipleOf_196_0= RULE_INT ) ) (otherlv_197= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_198= '\"minimum\"' otherlv_199= ':' ( (lv_minimum_200_0= ruleNumber ) ) (otherlv_201= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_202= '\"exclusiveMinimum\"' otherlv_203= ':' ( (lv_exclusiveMinimum_204_0= ruleNumber ) ) (otherlv_205= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_206= '\"maximum\"' otherlv_207= ':' ( (lv_maximum_208_0= ruleNumber ) ) (otherlv_209= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_210= '\"exclusiveMaximum\"' otherlv_211= ':' ( (lv_exclusiveMaximum_212_0= ruleNumber ) ) (otherlv_213= ',' )? ) ) ) ) )* ) )
            {
            // InternalDraft7.g:92:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"type\"' otherlv_4= ':' ( (lv_type_5_0= ruleTypes ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"dependencies\"' otherlv_8= ':' otherlv_9= '{' ( (lv_dependencies_10_0= ruleDependencies ) ) otherlv_11= '}' (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"additionalProperties\"' otherlv_14= ':' ( (lv_additionalProperties_15_0= ruleAdditionalProperties ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"additionalItems\"' otherlv_18= ':' ( (lv_additionalItems_19_0= ruleAdditionalItems ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= '\"default\"' otherlv_22= ':' ( (lv_default_23_0= ruleDefault ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= '\"patternProperties\"' otherlv_26= ':' otherlv_27= '{' ( (lv_patternProperties_28_0= ruleNamedSchema ) ) (otherlv_29= ',' ( (lv_patternProperties_30_0= ruleNamedSchema ) ) )* otherlv_31= '}' (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= '\"examples\"' otherlv_34= ':' ( (lv_example_35_0= ruleExample ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= '\"items\"' otherlv_38= ':' ( (lv_items_39_0= ruleItems ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= '\"contains\"' otherlv_42= ':' ( (lv_contains_43_0= ruleContains ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= '\"definitions\"' otherlv_46= ':' otherlv_47= '{' ( (lv_definitions_48_0= ruleNamedSchema ) ) (otherlv_49= ',' ( (lv_definitions_50_0= ruleNamedSchema ) ) )* otherlv_51= '}' (otherlv_52= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= '\"title\"' otherlv_54= ':' ( (lv_title_55_0= RULE_STRING ) ) (otherlv_56= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_57= '\"required\"' otherlv_58= ':' otherlv_59= '[' ( (lv_requiredProperties_60_0= ruleAnyString ) ) (otherlv_61= ',' ( (lv_requiredProperties_62_0= ruleAnyString ) ) )* otherlv_63= ']' (otherlv_64= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_65= '\"description\"' otherlv_66= ':' ( (lv_description_67_0= RULE_STRING ) ) (otherlv_68= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_69= '\"properties\"' otherlv_70= ':' otherlv_71= '{' ( (lv_properties_72_0= ruleNamedSchema ) ) (otherlv_73= ',' ( (lv_properties_74_0= ruleNamedSchema ) ) )* otherlv_75= '}' (otherlv_76= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_77= '\"enum\"' otherlv_78= ':' otherlv_79= '[' ( (lv_enumValues_80_0= ruleAnyString ) ) (otherlv_81= ',' ( (lv_enumValues_82_0= ruleAnyString ) ) )* otherlv_83= ']' (otherlv_84= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_85= '\"$schema\"' otherlv_86= ':' otherlv_87= '\"http://json-schema.org/draft-07/schema#\"' (otherlv_88= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_89= '\"$id\"' otherlv_90= ':' ( (lv_id_91_0= ruleAnyString ) ) (otherlv_92= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_93= '\"if\"' otherlv_94= ':' ( (lv_ifSchema_95_0= ruleSchema ) ) (otherlv_96= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_97= '\"then\"' otherlv_98= ':' ( (lv_thenSchema_99_0= ruleSchema ) ) (otherlv_100= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_101= '\"else\"' otherlv_102= ':' ( (lv_elseSchema_103_0= ruleSchema ) ) (otherlv_104= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_105= '\"enum\"' otherlv_106= ':' otherlv_107= '[' ( (lv_enumValues_108_0= ruleAnyString ) ) (otherlv_109= ',' ( (lv_enumValues_110_0= ruleAnyString ) ) )* otherlv_111= ']' (otherlv_112= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_113= '\"const\"' otherlv_114= ':' ( ( (lv_const_115_0= ruleAnyString ) ) | ( (lv_constBoolean_116_0= ruleBoolean ) ) ) (otherlv_117= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_118= '\"anyOf\"' otherlv_119= ':' otherlv_120= '[' ( (lv_anyOfs_121_0= ruleAbstractSchema ) ) (otherlv_122= ',' ( (lv_anyOfs_123_0= ruleAbstractSchema ) ) )* otherlv_124= ']' (otherlv_125= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_126= '\"oneOf\"' otherlv_127= ':' otherlv_128= '[' ( (lv_oneOfs_129_0= ruleAbstractSchema ) ) (otherlv_130= ',' ( (lv_oneOfs_131_0= ruleAbstractSchema ) ) )* otherlv_132= ']' (otherlv_133= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_134= '\"allOf\"' otherlv_135= ':' otherlv_136= '[' ( (lv_allOfs_137_0= ruleAbstractSchema ) ) (otherlv_138= ',' ( (lv_allOfs_139_0= ruleAbstractSchema ) ) )* otherlv_140= ']' (otherlv_141= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_142= '\"not\"' otherlv_143= ':' ( (lv_not_144_0= ruleAbstractSchema ) ) (otherlv_145= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_146= '\"uniqueItems\"' otherlv_147= ':' ( (lv_unique_148_0= ruleBoolean ) ) (otherlv_149= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_150= '\"propertyNames\"' otherlv_151= ':' ( (lv_propertyNames_152_0= ruleAbstractSchema ) ) (otherlv_153= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_154= '\"minProperties\"' otherlv_155= ':' ( (lv_minProperties_156_0= RULE_INT ) ) (otherlv_157= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_158= '\"maxProperties\"' otherlv_159= ':' ( (lv_maxProperties_160_0= RULE_INT ) ) (otherlv_161= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_162= '\"maxItems\"' otherlv_163= ':' ( (lv_maxItems_164_0= RULE_INT ) ) (otherlv_165= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_166= '\"minItems\"' otherlv_167= ':' ( (lv_minItems_168_0= RULE_INT ) ) (otherlv_169= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_170= '\"maxLength\"' otherlv_171= ':' ( (lv_maxLength_172_0= RULE_INT ) ) (otherlv_173= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_174= '\"minLength\"' otherlv_175= ':' ( (lv_minLength_176_0= RULE_INT ) ) (otherlv_177= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_178= '\"pattern\"' otherlv_179= ':' ( (lv_pattern_180_0= ruleAnyString ) ) (otherlv_181= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_182= '\"format\"' otherlv_183= ':' ( (lv_format_184_0= ruleFormatTypes ) ) (otherlv_185= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_186= '\"contentMediaType\"' otherlv_187= ':' ( (lv_mediaType_188_0= ruleAnyString ) ) (otherlv_189= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_190= '\"contentEncoding\"' otherlv_191= ':' ( (lv_encoding_192_0= ruleAnyString ) ) (otherlv_193= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_194= '\"multiples\"' otherlv_195= ':' ( (lv_multipleOf_196_0= RULE_INT ) ) (otherlv_197= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_198= '\"minimum\"' otherlv_199= ':' ( (lv_minimum_200_0= ruleNumber ) ) (otherlv_201= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_202= '\"exclusiveMinimum\"' otherlv_203= ':' ( (lv_exclusiveMinimum_204_0= ruleNumber ) ) (otherlv_205= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_206= '\"maximum\"' otherlv_207= ':' ( (lv_maximum_208_0= ruleNumber ) ) (otherlv_209= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_210= '\"exclusiveMaximum\"' otherlv_211= ':' ( (lv_exclusiveMaximum_212_0= ruleNumber ) ) (otherlv_213= ',' )? ) ) ) ) )* ) )
            // InternalDraft7.g:93:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"type\"' otherlv_4= ':' ( (lv_type_5_0= ruleTypes ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"dependencies\"' otherlv_8= ':' otherlv_9= '{' ( (lv_dependencies_10_0= ruleDependencies ) ) otherlv_11= '}' (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"additionalProperties\"' otherlv_14= ':' ( (lv_additionalProperties_15_0= ruleAdditionalProperties ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"additionalItems\"' otherlv_18= ':' ( (lv_additionalItems_19_0= ruleAdditionalItems ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= '\"default\"' otherlv_22= ':' ( (lv_default_23_0= ruleDefault ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= '\"patternProperties\"' otherlv_26= ':' otherlv_27= '{' ( (lv_patternProperties_28_0= ruleNamedSchema ) ) (otherlv_29= ',' ( (lv_patternProperties_30_0= ruleNamedSchema ) ) )* otherlv_31= '}' (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= '\"examples\"' otherlv_34= ':' ( (lv_example_35_0= ruleExample ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= '\"items\"' otherlv_38= ':' ( (lv_items_39_0= ruleItems ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= '\"contains\"' otherlv_42= ':' ( (lv_contains_43_0= ruleContains ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= '\"definitions\"' otherlv_46= ':' otherlv_47= '{' ( (lv_definitions_48_0= ruleNamedSchema ) ) (otherlv_49= ',' ( (lv_definitions_50_0= ruleNamedSchema ) ) )* otherlv_51= '}' (otherlv_52= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= '\"title\"' otherlv_54= ':' ( (lv_title_55_0= RULE_STRING ) ) (otherlv_56= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_57= '\"required\"' otherlv_58= ':' otherlv_59= '[' ( (lv_requiredProperties_60_0= ruleAnyString ) ) (otherlv_61= ',' ( (lv_requiredProperties_62_0= ruleAnyString ) ) )* otherlv_63= ']' (otherlv_64= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_65= '\"description\"' otherlv_66= ':' ( (lv_description_67_0= RULE_STRING ) ) (otherlv_68= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_69= '\"properties\"' otherlv_70= ':' otherlv_71= '{' ( (lv_properties_72_0= ruleNamedSchema ) ) (otherlv_73= ',' ( (lv_properties_74_0= ruleNamedSchema ) ) )* otherlv_75= '}' (otherlv_76= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_77= '\"enum\"' otherlv_78= ':' otherlv_79= '[' ( (lv_enumValues_80_0= ruleAnyString ) ) (otherlv_81= ',' ( (lv_enumValues_82_0= ruleAnyString ) ) )* otherlv_83= ']' (otherlv_84= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_85= '\"$schema\"' otherlv_86= ':' otherlv_87= '\"http://json-schema.org/draft-07/schema#\"' (otherlv_88= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_89= '\"$id\"' otherlv_90= ':' ( (lv_id_91_0= ruleAnyString ) ) (otherlv_92= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_93= '\"if\"' otherlv_94= ':' ( (lv_ifSchema_95_0= ruleSchema ) ) (otherlv_96= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_97= '\"then\"' otherlv_98= ':' ( (lv_thenSchema_99_0= ruleSchema ) ) (otherlv_100= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_101= '\"else\"' otherlv_102= ':' ( (lv_elseSchema_103_0= ruleSchema ) ) (otherlv_104= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_105= '\"enum\"' otherlv_106= ':' otherlv_107= '[' ( (lv_enumValues_108_0= ruleAnyString ) ) (otherlv_109= ',' ( (lv_enumValues_110_0= ruleAnyString ) ) )* otherlv_111= ']' (otherlv_112= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_113= '\"const\"' otherlv_114= ':' ( ( (lv_const_115_0= ruleAnyString ) ) | ( (lv_constBoolean_116_0= ruleBoolean ) ) ) (otherlv_117= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_118= '\"anyOf\"' otherlv_119= ':' otherlv_120= '[' ( (lv_anyOfs_121_0= ruleAbstractSchema ) ) (otherlv_122= ',' ( (lv_anyOfs_123_0= ruleAbstractSchema ) ) )* otherlv_124= ']' (otherlv_125= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_126= '\"oneOf\"' otherlv_127= ':' otherlv_128= '[' ( (lv_oneOfs_129_0= ruleAbstractSchema ) ) (otherlv_130= ',' ( (lv_oneOfs_131_0= ruleAbstractSchema ) ) )* otherlv_132= ']' (otherlv_133= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_134= '\"allOf\"' otherlv_135= ':' otherlv_136= '[' ( (lv_allOfs_137_0= ruleAbstractSchema ) ) (otherlv_138= ',' ( (lv_allOfs_139_0= ruleAbstractSchema ) ) )* otherlv_140= ']' (otherlv_141= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_142= '\"not\"' otherlv_143= ':' ( (lv_not_144_0= ruleAbstractSchema ) ) (otherlv_145= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_146= '\"uniqueItems\"' otherlv_147= ':' ( (lv_unique_148_0= ruleBoolean ) ) (otherlv_149= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_150= '\"propertyNames\"' otherlv_151= ':' ( (lv_propertyNames_152_0= ruleAbstractSchema ) ) (otherlv_153= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_154= '\"minProperties\"' otherlv_155= ':' ( (lv_minProperties_156_0= RULE_INT ) ) (otherlv_157= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_158= '\"maxProperties\"' otherlv_159= ':' ( (lv_maxProperties_160_0= RULE_INT ) ) (otherlv_161= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_162= '\"maxItems\"' otherlv_163= ':' ( (lv_maxItems_164_0= RULE_INT ) ) (otherlv_165= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_166= '\"minItems\"' otherlv_167= ':' ( (lv_minItems_168_0= RULE_INT ) ) (otherlv_169= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_170= '\"maxLength\"' otherlv_171= ':' ( (lv_maxLength_172_0= RULE_INT ) ) (otherlv_173= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_174= '\"minLength\"' otherlv_175= ':' ( (lv_minLength_176_0= RULE_INT ) ) (otherlv_177= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_178= '\"pattern\"' otherlv_179= ':' ( (lv_pattern_180_0= ruleAnyString ) ) (otherlv_181= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_182= '\"format\"' otherlv_183= ':' ( (lv_format_184_0= ruleFormatTypes ) ) (otherlv_185= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_186= '\"contentMediaType\"' otherlv_187= ':' ( (lv_mediaType_188_0= ruleAnyString ) ) (otherlv_189= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_190= '\"contentEncoding\"' otherlv_191= ':' ( (lv_encoding_192_0= ruleAnyString ) ) (otherlv_193= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_194= '\"multiples\"' otherlv_195= ':' ( (lv_multipleOf_196_0= RULE_INT ) ) (otherlv_197= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_198= '\"minimum\"' otherlv_199= ':' ( (lv_minimum_200_0= ruleNumber ) ) (otherlv_201= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_202= '\"exclusiveMinimum\"' otherlv_203= ':' ( (lv_exclusiveMinimum_204_0= ruleNumber ) ) (otherlv_205= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_206= '\"maximum\"' otherlv_207= ':' ( (lv_maximum_208_0= ruleNumber ) ) (otherlv_209= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_210= '\"exclusiveMaximum\"' otherlv_211= ':' ( (lv_exclusiveMaximum_212_0= ruleNumber ) ) (otherlv_213= ',' )? ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getSchemaAccess().getUnorderedGroup_2());
            				
            // InternalDraft7.g:96:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"type\"' otherlv_4= ':' ( (lv_type_5_0= ruleTypes ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"dependencies\"' otherlv_8= ':' otherlv_9= '{' ( (lv_dependencies_10_0= ruleDependencies ) ) otherlv_11= '}' (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"additionalProperties\"' otherlv_14= ':' ( (lv_additionalProperties_15_0= ruleAdditionalProperties ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"additionalItems\"' otherlv_18= ':' ( (lv_additionalItems_19_0= ruleAdditionalItems ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= '\"default\"' otherlv_22= ':' ( (lv_default_23_0= ruleDefault ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= '\"patternProperties\"' otherlv_26= ':' otherlv_27= '{' ( (lv_patternProperties_28_0= ruleNamedSchema ) ) (otherlv_29= ',' ( (lv_patternProperties_30_0= ruleNamedSchema ) ) )* otherlv_31= '}' (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= '\"examples\"' otherlv_34= ':' ( (lv_example_35_0= ruleExample ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= '\"items\"' otherlv_38= ':' ( (lv_items_39_0= ruleItems ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= '\"contains\"' otherlv_42= ':' ( (lv_contains_43_0= ruleContains ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= '\"definitions\"' otherlv_46= ':' otherlv_47= '{' ( (lv_definitions_48_0= ruleNamedSchema ) ) (otherlv_49= ',' ( (lv_definitions_50_0= ruleNamedSchema ) ) )* otherlv_51= '}' (otherlv_52= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= '\"title\"' otherlv_54= ':' ( (lv_title_55_0= RULE_STRING ) ) (otherlv_56= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_57= '\"required\"' otherlv_58= ':' otherlv_59= '[' ( (lv_requiredProperties_60_0= ruleAnyString ) ) (otherlv_61= ',' ( (lv_requiredProperties_62_0= ruleAnyString ) ) )* otherlv_63= ']' (otherlv_64= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_65= '\"description\"' otherlv_66= ':' ( (lv_description_67_0= RULE_STRING ) ) (otherlv_68= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_69= '\"properties\"' otherlv_70= ':' otherlv_71= '{' ( (lv_properties_72_0= ruleNamedSchema ) ) (otherlv_73= ',' ( (lv_properties_74_0= ruleNamedSchema ) ) )* otherlv_75= '}' (otherlv_76= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_77= '\"enum\"' otherlv_78= ':' otherlv_79= '[' ( (lv_enumValues_80_0= ruleAnyString ) ) (otherlv_81= ',' ( (lv_enumValues_82_0= ruleAnyString ) ) )* otherlv_83= ']' (otherlv_84= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_85= '\"$schema\"' otherlv_86= ':' otherlv_87= '\"http://json-schema.org/draft-07/schema#\"' (otherlv_88= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_89= '\"$id\"' otherlv_90= ':' ( (lv_id_91_0= ruleAnyString ) ) (otherlv_92= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_93= '\"if\"' otherlv_94= ':' ( (lv_ifSchema_95_0= ruleSchema ) ) (otherlv_96= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_97= '\"then\"' otherlv_98= ':' ( (lv_thenSchema_99_0= ruleSchema ) ) (otherlv_100= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_101= '\"else\"' otherlv_102= ':' ( (lv_elseSchema_103_0= ruleSchema ) ) (otherlv_104= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_105= '\"enum\"' otherlv_106= ':' otherlv_107= '[' ( (lv_enumValues_108_0= ruleAnyString ) ) (otherlv_109= ',' ( (lv_enumValues_110_0= ruleAnyString ) ) )* otherlv_111= ']' (otherlv_112= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_113= '\"const\"' otherlv_114= ':' ( ( (lv_const_115_0= ruleAnyString ) ) | ( (lv_constBoolean_116_0= ruleBoolean ) ) ) (otherlv_117= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_118= '\"anyOf\"' otherlv_119= ':' otherlv_120= '[' ( (lv_anyOfs_121_0= ruleAbstractSchema ) ) (otherlv_122= ',' ( (lv_anyOfs_123_0= ruleAbstractSchema ) ) )* otherlv_124= ']' (otherlv_125= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_126= '\"oneOf\"' otherlv_127= ':' otherlv_128= '[' ( (lv_oneOfs_129_0= ruleAbstractSchema ) ) (otherlv_130= ',' ( (lv_oneOfs_131_0= ruleAbstractSchema ) ) )* otherlv_132= ']' (otherlv_133= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_134= '\"allOf\"' otherlv_135= ':' otherlv_136= '[' ( (lv_allOfs_137_0= ruleAbstractSchema ) ) (otherlv_138= ',' ( (lv_allOfs_139_0= ruleAbstractSchema ) ) )* otherlv_140= ']' (otherlv_141= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_142= '\"not\"' otherlv_143= ':' ( (lv_not_144_0= ruleAbstractSchema ) ) (otherlv_145= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_146= '\"uniqueItems\"' otherlv_147= ':' ( (lv_unique_148_0= ruleBoolean ) ) (otherlv_149= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_150= '\"propertyNames\"' otherlv_151= ':' ( (lv_propertyNames_152_0= ruleAbstractSchema ) ) (otherlv_153= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_154= '\"minProperties\"' otherlv_155= ':' ( (lv_minProperties_156_0= RULE_INT ) ) (otherlv_157= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_158= '\"maxProperties\"' otherlv_159= ':' ( (lv_maxProperties_160_0= RULE_INT ) ) (otherlv_161= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_162= '\"maxItems\"' otherlv_163= ':' ( (lv_maxItems_164_0= RULE_INT ) ) (otherlv_165= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_166= '\"minItems\"' otherlv_167= ':' ( (lv_minItems_168_0= RULE_INT ) ) (otherlv_169= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_170= '\"maxLength\"' otherlv_171= ':' ( (lv_maxLength_172_0= RULE_INT ) ) (otherlv_173= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_174= '\"minLength\"' otherlv_175= ':' ( (lv_minLength_176_0= RULE_INT ) ) (otherlv_177= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_178= '\"pattern\"' otherlv_179= ':' ( (lv_pattern_180_0= ruleAnyString ) ) (otherlv_181= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_182= '\"format\"' otherlv_183= ':' ( (lv_format_184_0= ruleFormatTypes ) ) (otherlv_185= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_186= '\"contentMediaType\"' otherlv_187= ':' ( (lv_mediaType_188_0= ruleAnyString ) ) (otherlv_189= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_190= '\"contentEncoding\"' otherlv_191= ':' ( (lv_encoding_192_0= ruleAnyString ) ) (otherlv_193= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_194= '\"multiples\"' otherlv_195= ':' ( (lv_multipleOf_196_0= RULE_INT ) ) (otherlv_197= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_198= '\"minimum\"' otherlv_199= ':' ( (lv_minimum_200_0= ruleNumber ) ) (otherlv_201= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_202= '\"exclusiveMinimum\"' otherlv_203= ':' ( (lv_exclusiveMinimum_204_0= ruleNumber ) ) (otherlv_205= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_206= '\"maximum\"' otherlv_207= ':' ( (lv_maximum_208_0= ruleNumber ) ) (otherlv_209= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_210= '\"exclusiveMaximum\"' otherlv_211= ':' ( (lv_exclusiveMaximum_212_0= ruleNumber ) ) (otherlv_213= ',' )? ) ) ) ) )* )
            // InternalDraft7.g:97:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"type\"' otherlv_4= ':' ( (lv_type_5_0= ruleTypes ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"dependencies\"' otherlv_8= ':' otherlv_9= '{' ( (lv_dependencies_10_0= ruleDependencies ) ) otherlv_11= '}' (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"additionalProperties\"' otherlv_14= ':' ( (lv_additionalProperties_15_0= ruleAdditionalProperties ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"additionalItems\"' otherlv_18= ':' ( (lv_additionalItems_19_0= ruleAdditionalItems ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= '\"default\"' otherlv_22= ':' ( (lv_default_23_0= ruleDefault ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= '\"patternProperties\"' otherlv_26= ':' otherlv_27= '{' ( (lv_patternProperties_28_0= ruleNamedSchema ) ) (otherlv_29= ',' ( (lv_patternProperties_30_0= ruleNamedSchema ) ) )* otherlv_31= '}' (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= '\"examples\"' otherlv_34= ':' ( (lv_example_35_0= ruleExample ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= '\"items\"' otherlv_38= ':' ( (lv_items_39_0= ruleItems ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= '\"contains\"' otherlv_42= ':' ( (lv_contains_43_0= ruleContains ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= '\"definitions\"' otherlv_46= ':' otherlv_47= '{' ( (lv_definitions_48_0= ruleNamedSchema ) ) (otherlv_49= ',' ( (lv_definitions_50_0= ruleNamedSchema ) ) )* otherlv_51= '}' (otherlv_52= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= '\"title\"' otherlv_54= ':' ( (lv_title_55_0= RULE_STRING ) ) (otherlv_56= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_57= '\"required\"' otherlv_58= ':' otherlv_59= '[' ( (lv_requiredProperties_60_0= ruleAnyString ) ) (otherlv_61= ',' ( (lv_requiredProperties_62_0= ruleAnyString ) ) )* otherlv_63= ']' (otherlv_64= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_65= '\"description\"' otherlv_66= ':' ( (lv_description_67_0= RULE_STRING ) ) (otherlv_68= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_69= '\"properties\"' otherlv_70= ':' otherlv_71= '{' ( (lv_properties_72_0= ruleNamedSchema ) ) (otherlv_73= ',' ( (lv_properties_74_0= ruleNamedSchema ) ) )* otherlv_75= '}' (otherlv_76= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_77= '\"enum\"' otherlv_78= ':' otherlv_79= '[' ( (lv_enumValues_80_0= ruleAnyString ) ) (otherlv_81= ',' ( (lv_enumValues_82_0= ruleAnyString ) ) )* otherlv_83= ']' (otherlv_84= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_85= '\"$schema\"' otherlv_86= ':' otherlv_87= '\"http://json-schema.org/draft-07/schema#\"' (otherlv_88= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_89= '\"$id\"' otherlv_90= ':' ( (lv_id_91_0= ruleAnyString ) ) (otherlv_92= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_93= '\"if\"' otherlv_94= ':' ( (lv_ifSchema_95_0= ruleSchema ) ) (otherlv_96= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_97= '\"then\"' otherlv_98= ':' ( (lv_thenSchema_99_0= ruleSchema ) ) (otherlv_100= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_101= '\"else\"' otherlv_102= ':' ( (lv_elseSchema_103_0= ruleSchema ) ) (otherlv_104= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_105= '\"enum\"' otherlv_106= ':' otherlv_107= '[' ( (lv_enumValues_108_0= ruleAnyString ) ) (otherlv_109= ',' ( (lv_enumValues_110_0= ruleAnyString ) ) )* otherlv_111= ']' (otherlv_112= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_113= '\"const\"' otherlv_114= ':' ( ( (lv_const_115_0= ruleAnyString ) ) | ( (lv_constBoolean_116_0= ruleBoolean ) ) ) (otherlv_117= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_118= '\"anyOf\"' otherlv_119= ':' otherlv_120= '[' ( (lv_anyOfs_121_0= ruleAbstractSchema ) ) (otherlv_122= ',' ( (lv_anyOfs_123_0= ruleAbstractSchema ) ) )* otherlv_124= ']' (otherlv_125= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_126= '\"oneOf\"' otherlv_127= ':' otherlv_128= '[' ( (lv_oneOfs_129_0= ruleAbstractSchema ) ) (otherlv_130= ',' ( (lv_oneOfs_131_0= ruleAbstractSchema ) ) )* otherlv_132= ']' (otherlv_133= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_134= '\"allOf\"' otherlv_135= ':' otherlv_136= '[' ( (lv_allOfs_137_0= ruleAbstractSchema ) ) (otherlv_138= ',' ( (lv_allOfs_139_0= ruleAbstractSchema ) ) )* otherlv_140= ']' (otherlv_141= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_142= '\"not\"' otherlv_143= ':' ( (lv_not_144_0= ruleAbstractSchema ) ) (otherlv_145= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_146= '\"uniqueItems\"' otherlv_147= ':' ( (lv_unique_148_0= ruleBoolean ) ) (otherlv_149= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_150= '\"propertyNames\"' otherlv_151= ':' ( (lv_propertyNames_152_0= ruleAbstractSchema ) ) (otherlv_153= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_154= '\"minProperties\"' otherlv_155= ':' ( (lv_minProperties_156_0= RULE_INT ) ) (otherlv_157= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_158= '\"maxProperties\"' otherlv_159= ':' ( (lv_maxProperties_160_0= RULE_INT ) ) (otherlv_161= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_162= '\"maxItems\"' otherlv_163= ':' ( (lv_maxItems_164_0= RULE_INT ) ) (otherlv_165= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_166= '\"minItems\"' otherlv_167= ':' ( (lv_minItems_168_0= RULE_INT ) ) (otherlv_169= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_170= '\"maxLength\"' otherlv_171= ':' ( (lv_maxLength_172_0= RULE_INT ) ) (otherlv_173= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_174= '\"minLength\"' otherlv_175= ':' ( (lv_minLength_176_0= RULE_INT ) ) (otherlv_177= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_178= '\"pattern\"' otherlv_179= ':' ( (lv_pattern_180_0= ruleAnyString ) ) (otherlv_181= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_182= '\"format\"' otherlv_183= ':' ( (lv_format_184_0= ruleFormatTypes ) ) (otherlv_185= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_186= '\"contentMediaType\"' otherlv_187= ':' ( (lv_mediaType_188_0= ruleAnyString ) ) (otherlv_189= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_190= '\"contentEncoding\"' otherlv_191= ':' ( (lv_encoding_192_0= ruleAnyString ) ) (otherlv_193= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_194= '\"multiples\"' otherlv_195= ':' ( (lv_multipleOf_196_0= RULE_INT ) ) (otherlv_197= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_198= '\"minimum\"' otherlv_199= ':' ( (lv_minimum_200_0= ruleNumber ) ) (otherlv_201= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_202= '\"exclusiveMinimum\"' otherlv_203= ':' ( (lv_exclusiveMinimum_204_0= ruleNumber ) ) (otherlv_205= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_206= '\"maximum\"' otherlv_207= ':' ( (lv_maximum_208_0= ruleNumber ) ) (otherlv_209= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_210= '\"exclusiveMaximum\"' otherlv_211= ':' ( (lv_exclusiveMaximum_212_0= ruleNumber ) ) (otherlv_213= ',' )? ) ) ) ) )*
            {
            // InternalDraft7.g:97:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"type\"' otherlv_4= ':' ( (lv_type_5_0= ruleTypes ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"dependencies\"' otherlv_8= ':' otherlv_9= '{' ( (lv_dependencies_10_0= ruleDependencies ) ) otherlv_11= '}' (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"additionalProperties\"' otherlv_14= ':' ( (lv_additionalProperties_15_0= ruleAdditionalProperties ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"additionalItems\"' otherlv_18= ':' ( (lv_additionalItems_19_0= ruleAdditionalItems ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= '\"default\"' otherlv_22= ':' ( (lv_default_23_0= ruleDefault ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= '\"patternProperties\"' otherlv_26= ':' otherlv_27= '{' ( (lv_patternProperties_28_0= ruleNamedSchema ) ) (otherlv_29= ',' ( (lv_patternProperties_30_0= ruleNamedSchema ) ) )* otherlv_31= '}' (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= '\"examples\"' otherlv_34= ':' ( (lv_example_35_0= ruleExample ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= '\"items\"' otherlv_38= ':' ( (lv_items_39_0= ruleItems ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= '\"contains\"' otherlv_42= ':' ( (lv_contains_43_0= ruleContains ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= '\"definitions\"' otherlv_46= ':' otherlv_47= '{' ( (lv_definitions_48_0= ruleNamedSchema ) ) (otherlv_49= ',' ( (lv_definitions_50_0= ruleNamedSchema ) ) )* otherlv_51= '}' (otherlv_52= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= '\"title\"' otherlv_54= ':' ( (lv_title_55_0= RULE_STRING ) ) (otherlv_56= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_57= '\"required\"' otherlv_58= ':' otherlv_59= '[' ( (lv_requiredProperties_60_0= ruleAnyString ) ) (otherlv_61= ',' ( (lv_requiredProperties_62_0= ruleAnyString ) ) )* otherlv_63= ']' (otherlv_64= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_65= '\"description\"' otherlv_66= ':' ( (lv_description_67_0= RULE_STRING ) ) (otherlv_68= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_69= '\"properties\"' otherlv_70= ':' otherlv_71= '{' ( (lv_properties_72_0= ruleNamedSchema ) ) (otherlv_73= ',' ( (lv_properties_74_0= ruleNamedSchema ) ) )* otherlv_75= '}' (otherlv_76= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_77= '\"enum\"' otherlv_78= ':' otherlv_79= '[' ( (lv_enumValues_80_0= ruleAnyString ) ) (otherlv_81= ',' ( (lv_enumValues_82_0= ruleAnyString ) ) )* otherlv_83= ']' (otherlv_84= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_85= '\"$schema\"' otherlv_86= ':' otherlv_87= '\"http://json-schema.org/draft-07/schema#\"' (otherlv_88= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_89= '\"$id\"' otherlv_90= ':' ( (lv_id_91_0= ruleAnyString ) ) (otherlv_92= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_93= '\"if\"' otherlv_94= ':' ( (lv_ifSchema_95_0= ruleSchema ) ) (otherlv_96= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_97= '\"then\"' otherlv_98= ':' ( (lv_thenSchema_99_0= ruleSchema ) ) (otherlv_100= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_101= '\"else\"' otherlv_102= ':' ( (lv_elseSchema_103_0= ruleSchema ) ) (otherlv_104= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_105= '\"enum\"' otherlv_106= ':' otherlv_107= '[' ( (lv_enumValues_108_0= ruleAnyString ) ) (otherlv_109= ',' ( (lv_enumValues_110_0= ruleAnyString ) ) )* otherlv_111= ']' (otherlv_112= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_113= '\"const\"' otherlv_114= ':' ( ( (lv_const_115_0= ruleAnyString ) ) | ( (lv_constBoolean_116_0= ruleBoolean ) ) ) (otherlv_117= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_118= '\"anyOf\"' otherlv_119= ':' otherlv_120= '[' ( (lv_anyOfs_121_0= ruleAbstractSchema ) ) (otherlv_122= ',' ( (lv_anyOfs_123_0= ruleAbstractSchema ) ) )* otherlv_124= ']' (otherlv_125= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_126= '\"oneOf\"' otherlv_127= ':' otherlv_128= '[' ( (lv_oneOfs_129_0= ruleAbstractSchema ) ) (otherlv_130= ',' ( (lv_oneOfs_131_0= ruleAbstractSchema ) ) )* otherlv_132= ']' (otherlv_133= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_134= '\"allOf\"' otherlv_135= ':' otherlv_136= '[' ( (lv_allOfs_137_0= ruleAbstractSchema ) ) (otherlv_138= ',' ( (lv_allOfs_139_0= ruleAbstractSchema ) ) )* otherlv_140= ']' (otherlv_141= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_142= '\"not\"' otherlv_143= ':' ( (lv_not_144_0= ruleAbstractSchema ) ) (otherlv_145= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_146= '\"uniqueItems\"' otherlv_147= ':' ( (lv_unique_148_0= ruleBoolean ) ) (otherlv_149= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_150= '\"propertyNames\"' otherlv_151= ':' ( (lv_propertyNames_152_0= ruleAbstractSchema ) ) (otherlv_153= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_154= '\"minProperties\"' otherlv_155= ':' ( (lv_minProperties_156_0= RULE_INT ) ) (otherlv_157= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_158= '\"maxProperties\"' otherlv_159= ':' ( (lv_maxProperties_160_0= RULE_INT ) ) (otherlv_161= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_162= '\"maxItems\"' otherlv_163= ':' ( (lv_maxItems_164_0= RULE_INT ) ) (otherlv_165= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_166= '\"minItems\"' otherlv_167= ':' ( (lv_minItems_168_0= RULE_INT ) ) (otherlv_169= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_170= '\"maxLength\"' otherlv_171= ':' ( (lv_maxLength_172_0= RULE_INT ) ) (otherlv_173= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_174= '\"minLength\"' otherlv_175= ':' ( (lv_minLength_176_0= RULE_INT ) ) (otherlv_177= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_178= '\"pattern\"' otherlv_179= ':' ( (lv_pattern_180_0= ruleAnyString ) ) (otherlv_181= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_182= '\"format\"' otherlv_183= ':' ( (lv_format_184_0= ruleFormatTypes ) ) (otherlv_185= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_186= '\"contentMediaType\"' otherlv_187= ':' ( (lv_mediaType_188_0= ruleAnyString ) ) (otherlv_189= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_190= '\"contentEncoding\"' otherlv_191= ':' ( (lv_encoding_192_0= ruleAnyString ) ) (otherlv_193= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_194= '\"multiples\"' otherlv_195= ':' ( (lv_multipleOf_196_0= RULE_INT ) ) (otherlv_197= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_198= '\"minimum\"' otherlv_199= ':' ( (lv_minimum_200_0= ruleNumber ) ) (otherlv_201= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_202= '\"exclusiveMinimum\"' otherlv_203= ':' ( (lv_exclusiveMinimum_204_0= ruleNumber ) ) (otherlv_205= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_206= '\"maximum\"' otherlv_207= ':' ( (lv_maximum_208_0= ruleNumber ) ) (otherlv_209= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_210= '\"exclusiveMaximum\"' otherlv_211= ':' ( (lv_exclusiveMaximum_212_0= ruleNumber ) ) (otherlv_213= ',' )? ) ) ) ) )*
            loop54:
            do {
                int alt54=44;
                alt54 = dfa54.predict(input);
                switch (alt54) {
            	case 1 :
            	    // InternalDraft7.g:98:4: ({...}? => ( ({...}? => (otherlv_3= '\"type\"' otherlv_4= ':' ( (lv_type_5_0= ruleTypes ) ) (otherlv_6= ',' )? ) ) ) )
            	    {
            	    // InternalDraft7.g:98:4: ({...}? => ( ({...}? => (otherlv_3= '\"type\"' otherlv_4= ':' ( (lv_type_5_0= ruleTypes ) ) (otherlv_6= ',' )? ) ) ) )
            	    // InternalDraft7.g:99:5: {...}? => ( ({...}? => (otherlv_3= '\"type\"' otherlv_4= ':' ( (lv_type_5_0= ruleTypes ) ) (otherlv_6= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalDraft7.g:99:103: ( ({...}? => (otherlv_3= '\"type\"' otherlv_4= ':' ( (lv_type_5_0= ruleTypes ) ) (otherlv_6= ',' )? ) ) )
            	    // InternalDraft7.g:100:6: ({...}? => (otherlv_3= '\"type\"' otherlv_4= ':' ( (lv_type_5_0= ruleTypes ) ) (otherlv_6= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalDraft7.g:103:9: ({...}? => (otherlv_3= '\"type\"' otherlv_4= ':' ( (lv_type_5_0= ruleTypes ) ) (otherlv_6= ',' )? ) )
            	    // InternalDraft7.g:103:10: {...}? => (otherlv_3= '\"type\"' otherlv_4= ':' ( (lv_type_5_0= ruleTypes ) ) (otherlv_6= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalDraft7.g:103:19: (otherlv_3= '\"type\"' otherlv_4= ':' ( (lv_type_5_0= ruleTypes ) ) (otherlv_6= ',' )? )
            	    // InternalDraft7.g:103:20: otherlv_3= '\"type\"' otherlv_4= ':' ( (lv_type_5_0= ruleTypes ) ) (otherlv_6= ',' )?
            	    {
            	    otherlv_3=(Token)match(input,12,FOLLOW_4); 

            	    									newLeafNode(otherlv_3, grammarAccess.getSchemaAccess().getTypeKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,13,FOLLOW_5); 

            	    									newLeafNode(otherlv_4, grammarAccess.getSchemaAccess().getColonKeyword_2_0_1());
            	    								
            	    // InternalDraft7.g:111:9: ( (lv_type_5_0= ruleTypes ) )
            	    // InternalDraft7.g:112:10: (lv_type_5_0= ruleTypes )
            	    {
            	    // InternalDraft7.g:112:10: (lv_type_5_0= ruleTypes )
            	    // InternalDraft7.g:113:11: lv_type_5_0= ruleTypes
            	    {

            	    											newCompositeNode(grammarAccess.getSchemaAccess().getTypeTypesParserRuleCall_2_0_2_0());
            	    										
            	    pushFollow(FOLLOW_6);
            	    lv_type_5_0=ruleTypes();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    											}
            	    											set(
            	    												current,
            	    												"type",
            	    												lv_type_5_0,
            	    												"org.xtext.json.schema.Draft7.Types");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalDraft7.g:130:9: (otherlv_6= ',' )?
            	    int alt1=2;
            	    int LA1_0 = input.LA(1);

            	    if ( (LA1_0==14) ) {
            	        alt1=1;
            	    }
            	    switch (alt1) {
            	        case 1 :
            	            // InternalDraft7.g:131:10: otherlv_6= ','
            	            {
            	            otherlv_6=(Token)match(input,14,FOLLOW_3); 

            	            										newLeafNode(otherlv_6, grammarAccess.getSchemaAccess().getCommaKeyword_2_0_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSchemaAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalDraft7.g:142:4: ({...}? => ( ({...}? => (otherlv_7= '\"dependencies\"' otherlv_8= ':' otherlv_9= '{' ( (lv_dependencies_10_0= ruleDependencies ) ) otherlv_11= '}' (otherlv_12= ',' )? ) ) ) )
            	    {
            	    // InternalDraft7.g:142:4: ({...}? => ( ({...}? => (otherlv_7= '\"dependencies\"' otherlv_8= ':' otherlv_9= '{' ( (lv_dependencies_10_0= ruleDependencies ) ) otherlv_11= '}' (otherlv_12= ',' )? ) ) ) )
            	    // InternalDraft7.g:143:5: {...}? => ( ({...}? => (otherlv_7= '\"dependencies\"' otherlv_8= ':' otherlv_9= '{' ( (lv_dependencies_10_0= ruleDependencies ) ) otherlv_11= '}' (otherlv_12= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalDraft7.g:143:103: ( ({...}? => (otherlv_7= '\"dependencies\"' otherlv_8= ':' otherlv_9= '{' ( (lv_dependencies_10_0= ruleDependencies ) ) otherlv_11= '}' (otherlv_12= ',' )? ) ) )
            	    // InternalDraft7.g:144:6: ({...}? => (otherlv_7= '\"dependencies\"' otherlv_8= ':' otherlv_9= '{' ( (lv_dependencies_10_0= ruleDependencies ) ) otherlv_11= '}' (otherlv_12= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalDraft7.g:147:9: ({...}? => (otherlv_7= '\"dependencies\"' otherlv_8= ':' otherlv_9= '{' ( (lv_dependencies_10_0= ruleDependencies ) ) otherlv_11= '}' (otherlv_12= ',' )? ) )
            	    // InternalDraft7.g:147:10: {...}? => (otherlv_7= '\"dependencies\"' otherlv_8= ':' otherlv_9= '{' ( (lv_dependencies_10_0= ruleDependencies ) ) otherlv_11= '}' (otherlv_12= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalDraft7.g:147:19: (otherlv_7= '\"dependencies\"' otherlv_8= ':' otherlv_9= '{' ( (lv_dependencies_10_0= ruleDependencies ) ) otherlv_11= '}' (otherlv_12= ',' )? )
            	    // InternalDraft7.g:147:20: otherlv_7= '\"dependencies\"' otherlv_8= ':' otherlv_9= '{' ( (lv_dependencies_10_0= ruleDependencies ) ) otherlv_11= '}' (otherlv_12= ',' )?
            	    {
            	    otherlv_7=(Token)match(input,15,FOLLOW_4); 

            	    									newLeafNode(otherlv_7, grammarAccess.getSchemaAccess().getDependenciesKeyword_2_1_0());
            	    								
            	    otherlv_8=(Token)match(input,13,FOLLOW_7); 

            	    									newLeafNode(otherlv_8, grammarAccess.getSchemaAccess().getColonKeyword_2_1_1());
            	    								
            	    otherlv_9=(Token)match(input,11,FOLLOW_8); 

            	    									newLeafNode(otherlv_9, grammarAccess.getSchemaAccess().getLeftCurlyBracketKeyword_2_1_2());
            	    								
            	    // InternalDraft7.g:159:9: ( (lv_dependencies_10_0= ruleDependencies ) )
            	    // InternalDraft7.g:160:10: (lv_dependencies_10_0= ruleDependencies )
            	    {
            	    // InternalDraft7.g:160:10: (lv_dependencies_10_0= ruleDependencies )
            	    // InternalDraft7.g:161:11: lv_dependencies_10_0= ruleDependencies
            	    {

            	    											newCompositeNode(grammarAccess.getSchemaAccess().getDependenciesDependenciesParserRuleCall_2_1_3_0());
            	    										
            	    pushFollow(FOLLOW_9);
            	    lv_dependencies_10_0=ruleDependencies();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    											}
            	    											set(
            	    												current,
            	    												"dependencies",
            	    												lv_dependencies_10_0,
            	    												"org.xtext.json.schema.Draft7.Dependencies");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    otherlv_11=(Token)match(input,16,FOLLOW_6); 

            	    									newLeafNode(otherlv_11, grammarAccess.getSchemaAccess().getRightCurlyBracketKeyword_2_1_4());
            	    								
            	    // InternalDraft7.g:182:9: (otherlv_12= ',' )?
            	    int alt2=2;
            	    int LA2_0 = input.LA(1);

            	    if ( (LA2_0==14) ) {
            	        alt2=1;
            	    }
            	    switch (alt2) {
            	        case 1 :
            	            // InternalDraft7.g:183:10: otherlv_12= ','
            	            {
            	            otherlv_12=(Token)match(input,14,FOLLOW_3); 

            	            										newLeafNode(otherlv_12, grammarAccess.getSchemaAccess().getCommaKeyword_2_1_5());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSchemaAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalDraft7.g:194:4: ({...}? => ( ({...}? => (otherlv_13= '\"additionalProperties\"' otherlv_14= ':' ( (lv_additionalProperties_15_0= ruleAdditionalProperties ) ) (otherlv_16= ',' )? ) ) ) )
            	    {
            	    // InternalDraft7.g:194:4: ({...}? => ( ({...}? => (otherlv_13= '\"additionalProperties\"' otherlv_14= ':' ( (lv_additionalProperties_15_0= ruleAdditionalProperties ) ) (otherlv_16= ',' )? ) ) ) )
            	    // InternalDraft7.g:195:5: {...}? => ( ({...}? => (otherlv_13= '\"additionalProperties\"' otherlv_14= ':' ( (lv_additionalProperties_15_0= ruleAdditionalProperties ) ) (otherlv_16= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalDraft7.g:195:103: ( ({...}? => (otherlv_13= '\"additionalProperties\"' otherlv_14= ':' ( (lv_additionalProperties_15_0= ruleAdditionalProperties ) ) (otherlv_16= ',' )? ) ) )
            	    // InternalDraft7.g:196:6: ({...}? => (otherlv_13= '\"additionalProperties\"' otherlv_14= ':' ( (lv_additionalProperties_15_0= ruleAdditionalProperties ) ) (otherlv_16= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalDraft7.g:199:9: ({...}? => (otherlv_13= '\"additionalProperties\"' otherlv_14= ':' ( (lv_additionalProperties_15_0= ruleAdditionalProperties ) ) (otherlv_16= ',' )? ) )
            	    // InternalDraft7.g:199:10: {...}? => (otherlv_13= '\"additionalProperties\"' otherlv_14= ':' ( (lv_additionalProperties_15_0= ruleAdditionalProperties ) ) (otherlv_16= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalDraft7.g:199:19: (otherlv_13= '\"additionalProperties\"' otherlv_14= ':' ( (lv_additionalProperties_15_0= ruleAdditionalProperties ) ) (otherlv_16= ',' )? )
            	    // InternalDraft7.g:199:20: otherlv_13= '\"additionalProperties\"' otherlv_14= ':' ( (lv_additionalProperties_15_0= ruleAdditionalProperties ) ) (otherlv_16= ',' )?
            	    {
            	    otherlv_13=(Token)match(input,17,FOLLOW_4); 

            	    									newLeafNode(otherlv_13, grammarAccess.getSchemaAccess().getAdditionalPropertiesKeyword_2_2_0());
            	    								
            	    otherlv_14=(Token)match(input,13,FOLLOW_10); 

            	    									newLeafNode(otherlv_14, grammarAccess.getSchemaAccess().getColonKeyword_2_2_1());
            	    								
            	    // InternalDraft7.g:207:9: ( (lv_additionalProperties_15_0= ruleAdditionalProperties ) )
            	    // InternalDraft7.g:208:10: (lv_additionalProperties_15_0= ruleAdditionalProperties )
            	    {
            	    // InternalDraft7.g:208:10: (lv_additionalProperties_15_0= ruleAdditionalProperties )
            	    // InternalDraft7.g:209:11: lv_additionalProperties_15_0= ruleAdditionalProperties
            	    {

            	    											newCompositeNode(grammarAccess.getSchemaAccess().getAdditionalPropertiesAdditionalPropertiesParserRuleCall_2_2_2_0());
            	    										
            	    pushFollow(FOLLOW_6);
            	    lv_additionalProperties_15_0=ruleAdditionalProperties();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    											}
            	    											set(
            	    												current,
            	    												"additionalProperties",
            	    												lv_additionalProperties_15_0,
            	    												"org.xtext.json.schema.Draft7.AdditionalProperties");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalDraft7.g:226:9: (otherlv_16= ',' )?
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0==14) ) {
            	        alt3=1;
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // InternalDraft7.g:227:10: otherlv_16= ','
            	            {
            	            otherlv_16=(Token)match(input,14,FOLLOW_3); 

            	            										newLeafNode(otherlv_16, grammarAccess.getSchemaAccess().getCommaKeyword_2_2_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSchemaAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalDraft7.g:238:4: ({...}? => ( ({...}? => (otherlv_17= '\"additionalItems\"' otherlv_18= ':' ( (lv_additionalItems_19_0= ruleAdditionalItems ) ) (otherlv_20= ',' )? ) ) ) )
            	    {
            	    // InternalDraft7.g:238:4: ({...}? => ( ({...}? => (otherlv_17= '\"additionalItems\"' otherlv_18= ':' ( (lv_additionalItems_19_0= ruleAdditionalItems ) ) (otherlv_20= ',' )? ) ) ) )
            	    // InternalDraft7.g:239:5: {...}? => ( ({...}? => (otherlv_17= '\"additionalItems\"' otherlv_18= ':' ( (lv_additionalItems_19_0= ruleAdditionalItems ) ) (otherlv_20= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // InternalDraft7.g:239:103: ( ({...}? => (otherlv_17= '\"additionalItems\"' otherlv_18= ':' ( (lv_additionalItems_19_0= ruleAdditionalItems ) ) (otherlv_20= ',' )? ) ) )
            	    // InternalDraft7.g:240:6: ({...}? => (otherlv_17= '\"additionalItems\"' otherlv_18= ':' ( (lv_additionalItems_19_0= ruleAdditionalItems ) ) (otherlv_20= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 3);
            	    					
            	    // InternalDraft7.g:243:9: ({...}? => (otherlv_17= '\"additionalItems\"' otherlv_18= ':' ( (lv_additionalItems_19_0= ruleAdditionalItems ) ) (otherlv_20= ',' )? ) )
            	    // InternalDraft7.g:243:10: {...}? => (otherlv_17= '\"additionalItems\"' otherlv_18= ':' ( (lv_additionalItems_19_0= ruleAdditionalItems ) ) (otherlv_20= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalDraft7.g:243:19: (otherlv_17= '\"additionalItems\"' otherlv_18= ':' ( (lv_additionalItems_19_0= ruleAdditionalItems ) ) (otherlv_20= ',' )? )
            	    // InternalDraft7.g:243:20: otherlv_17= '\"additionalItems\"' otherlv_18= ':' ( (lv_additionalItems_19_0= ruleAdditionalItems ) ) (otherlv_20= ',' )?
            	    {
            	    otherlv_17=(Token)match(input,18,FOLLOW_4); 

            	    									newLeafNode(otherlv_17, grammarAccess.getSchemaAccess().getAdditionalItemsKeyword_2_3_0());
            	    								
            	    otherlv_18=(Token)match(input,13,FOLLOW_10); 

            	    									newLeafNode(otherlv_18, grammarAccess.getSchemaAccess().getColonKeyword_2_3_1());
            	    								
            	    // InternalDraft7.g:251:9: ( (lv_additionalItems_19_0= ruleAdditionalItems ) )
            	    // InternalDraft7.g:252:10: (lv_additionalItems_19_0= ruleAdditionalItems )
            	    {
            	    // InternalDraft7.g:252:10: (lv_additionalItems_19_0= ruleAdditionalItems )
            	    // InternalDraft7.g:253:11: lv_additionalItems_19_0= ruleAdditionalItems
            	    {

            	    											newCompositeNode(grammarAccess.getSchemaAccess().getAdditionalItemsAdditionalItemsParserRuleCall_2_3_2_0());
            	    										
            	    pushFollow(FOLLOW_6);
            	    lv_additionalItems_19_0=ruleAdditionalItems();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    											}
            	    											set(
            	    												current,
            	    												"additionalItems",
            	    												lv_additionalItems_19_0,
            	    												"org.xtext.json.schema.Draft7.AdditionalItems");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalDraft7.g:270:9: (otherlv_20= ',' )?
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0==14) ) {
            	        alt4=1;
            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // InternalDraft7.g:271:10: otherlv_20= ','
            	            {
            	            otherlv_20=(Token)match(input,14,FOLLOW_3); 

            	            										newLeafNode(otherlv_20, grammarAccess.getSchemaAccess().getCommaKeyword_2_3_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSchemaAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalDraft7.g:282:4: ({...}? => ( ({...}? => (otherlv_21= '\"default\"' otherlv_22= ':' ( (lv_default_23_0= ruleDefault ) ) (otherlv_24= ',' )? ) ) ) )
            	    {
            	    // InternalDraft7.g:282:4: ({...}? => ( ({...}? => (otherlv_21= '\"default\"' otherlv_22= ':' ( (lv_default_23_0= ruleDefault ) ) (otherlv_24= ',' )? ) ) ) )
            	    // InternalDraft7.g:283:5: {...}? => ( ({...}? => (otherlv_21= '\"default\"' otherlv_22= ':' ( (lv_default_23_0= ruleDefault ) ) (otherlv_24= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // InternalDraft7.g:283:103: ( ({...}? => (otherlv_21= '\"default\"' otherlv_22= ':' ( (lv_default_23_0= ruleDefault ) ) (otherlv_24= ',' )? ) ) )
            	    // InternalDraft7.g:284:6: ({...}? => (otherlv_21= '\"default\"' otherlv_22= ':' ( (lv_default_23_0= ruleDefault ) ) (otherlv_24= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 4);
            	    					
            	    // InternalDraft7.g:287:9: ({...}? => (otherlv_21= '\"default\"' otherlv_22= ':' ( (lv_default_23_0= ruleDefault ) ) (otherlv_24= ',' )? ) )
            	    // InternalDraft7.g:287:10: {...}? => (otherlv_21= '\"default\"' otherlv_22= ':' ( (lv_default_23_0= ruleDefault ) ) (otherlv_24= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalDraft7.g:287:19: (otherlv_21= '\"default\"' otherlv_22= ':' ( (lv_default_23_0= ruleDefault ) ) (otherlv_24= ',' )? )
            	    // InternalDraft7.g:287:20: otherlv_21= '\"default\"' otherlv_22= ':' ( (lv_default_23_0= ruleDefault ) ) (otherlv_24= ',' )?
            	    {
            	    otherlv_21=(Token)match(input,19,FOLLOW_4); 

            	    									newLeafNode(otherlv_21, grammarAccess.getSchemaAccess().getDefaultKeyword_2_4_0());
            	    								
            	    otherlv_22=(Token)match(input,13,FOLLOW_11); 

            	    									newLeafNode(otherlv_22, grammarAccess.getSchemaAccess().getColonKeyword_2_4_1());
            	    								
            	    // InternalDraft7.g:295:9: ( (lv_default_23_0= ruleDefault ) )
            	    // InternalDraft7.g:296:10: (lv_default_23_0= ruleDefault )
            	    {
            	    // InternalDraft7.g:296:10: (lv_default_23_0= ruleDefault )
            	    // InternalDraft7.g:297:11: lv_default_23_0= ruleDefault
            	    {

            	    											newCompositeNode(grammarAccess.getSchemaAccess().getDefaultDefaultParserRuleCall_2_4_2_0());
            	    										
            	    pushFollow(FOLLOW_6);
            	    lv_default_23_0=ruleDefault();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    											}
            	    											set(
            	    												current,
            	    												"default",
            	    												lv_default_23_0,
            	    												"org.xtext.json.schema.Draft7.Default");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalDraft7.g:314:9: (otherlv_24= ',' )?
            	    int alt5=2;
            	    int LA5_0 = input.LA(1);

            	    if ( (LA5_0==14) ) {
            	        alt5=1;
            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // InternalDraft7.g:315:10: otherlv_24= ','
            	            {
            	            otherlv_24=(Token)match(input,14,FOLLOW_3); 

            	            										newLeafNode(otherlv_24, grammarAccess.getSchemaAccess().getCommaKeyword_2_4_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSchemaAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalDraft7.g:326:4: ({...}? => ( ({...}? => (otherlv_25= '\"patternProperties\"' otherlv_26= ':' otherlv_27= '{' ( (lv_patternProperties_28_0= ruleNamedSchema ) ) (otherlv_29= ',' ( (lv_patternProperties_30_0= ruleNamedSchema ) ) )* otherlv_31= '}' (otherlv_32= ',' )? ) ) ) )
            	    {
            	    // InternalDraft7.g:326:4: ({...}? => ( ({...}? => (otherlv_25= '\"patternProperties\"' otherlv_26= ':' otherlv_27= '{' ( (lv_patternProperties_28_0= ruleNamedSchema ) ) (otherlv_29= ',' ( (lv_patternProperties_30_0= ruleNamedSchema ) ) )* otherlv_31= '}' (otherlv_32= ',' )? ) ) ) )
            	    // InternalDraft7.g:327:5: {...}? => ( ({...}? => (otherlv_25= '\"patternProperties\"' otherlv_26= ':' otherlv_27= '{' ( (lv_patternProperties_28_0= ruleNamedSchema ) ) (otherlv_29= ',' ( (lv_patternProperties_30_0= ruleNamedSchema ) ) )* otherlv_31= '}' (otherlv_32= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // InternalDraft7.g:327:103: ( ({...}? => (otherlv_25= '\"patternProperties\"' otherlv_26= ':' otherlv_27= '{' ( (lv_patternProperties_28_0= ruleNamedSchema ) ) (otherlv_29= ',' ( (lv_patternProperties_30_0= ruleNamedSchema ) ) )* otherlv_31= '}' (otherlv_32= ',' )? ) ) )
            	    // InternalDraft7.g:328:6: ({...}? => (otherlv_25= '\"patternProperties\"' otherlv_26= ':' otherlv_27= '{' ( (lv_patternProperties_28_0= ruleNamedSchema ) ) (otherlv_29= ',' ( (lv_patternProperties_30_0= ruleNamedSchema ) ) )* otherlv_31= '}' (otherlv_32= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 5);
            	    					
            	    // InternalDraft7.g:331:9: ({...}? => (otherlv_25= '\"patternProperties\"' otherlv_26= ':' otherlv_27= '{' ( (lv_patternProperties_28_0= ruleNamedSchema ) ) (otherlv_29= ',' ( (lv_patternProperties_30_0= ruleNamedSchema ) ) )* otherlv_31= '}' (otherlv_32= ',' )? ) )
            	    // InternalDraft7.g:331:10: {...}? => (otherlv_25= '\"patternProperties\"' otherlv_26= ':' otherlv_27= '{' ( (lv_patternProperties_28_0= ruleNamedSchema ) ) (otherlv_29= ',' ( (lv_patternProperties_30_0= ruleNamedSchema ) ) )* otherlv_31= '}' (otherlv_32= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalDraft7.g:331:19: (otherlv_25= '\"patternProperties\"' otherlv_26= ':' otherlv_27= '{' ( (lv_patternProperties_28_0= ruleNamedSchema ) ) (otherlv_29= ',' ( (lv_patternProperties_30_0= ruleNamedSchema ) ) )* otherlv_31= '}' (otherlv_32= ',' )? )
            	    // InternalDraft7.g:331:20: otherlv_25= '\"patternProperties\"' otherlv_26= ':' otherlv_27= '{' ( (lv_patternProperties_28_0= ruleNamedSchema ) ) (otherlv_29= ',' ( (lv_patternProperties_30_0= ruleNamedSchema ) ) )* otherlv_31= '}' (otherlv_32= ',' )?
            	    {
            	    otherlv_25=(Token)match(input,20,FOLLOW_4); 

            	    									newLeafNode(otherlv_25, grammarAccess.getSchemaAccess().getPatternPropertiesKeyword_2_5_0());
            	    								
            	    otherlv_26=(Token)match(input,13,FOLLOW_7); 

            	    									newLeafNode(otherlv_26, grammarAccess.getSchemaAccess().getColonKeyword_2_5_1());
            	    								
            	    otherlv_27=(Token)match(input,11,FOLLOW_8); 

            	    									newLeafNode(otherlv_27, grammarAccess.getSchemaAccess().getLeftCurlyBracketKeyword_2_5_2());
            	    								
            	    // InternalDraft7.g:343:9: ( (lv_patternProperties_28_0= ruleNamedSchema ) )
            	    // InternalDraft7.g:344:10: (lv_patternProperties_28_0= ruleNamedSchema )
            	    {
            	    // InternalDraft7.g:344:10: (lv_patternProperties_28_0= ruleNamedSchema )
            	    // InternalDraft7.g:345:11: lv_patternProperties_28_0= ruleNamedSchema
            	    {

            	    											newCompositeNode(grammarAccess.getSchemaAccess().getPatternPropertiesNamedSchemaParserRuleCall_2_5_3_0());
            	    										
            	    pushFollow(FOLLOW_12);
            	    lv_patternProperties_28_0=ruleNamedSchema();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    											}
            	    											add(
            	    												current,
            	    												"patternProperties",
            	    												lv_patternProperties_28_0,
            	    												"org.xtext.json.schema.Draft7.NamedSchema");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalDraft7.g:362:9: (otherlv_29= ',' ( (lv_patternProperties_30_0= ruleNamedSchema ) ) )*
            	    loop6:
            	    do {
            	        int alt6=2;
            	        int LA6_0 = input.LA(1);

            	        if ( (LA6_0==14) ) {
            	            alt6=1;
            	        }


            	        switch (alt6) {
            	    	case 1 :
            	    	    // InternalDraft7.g:363:10: otherlv_29= ',' ( (lv_patternProperties_30_0= ruleNamedSchema ) )
            	    	    {
            	    	    otherlv_29=(Token)match(input,14,FOLLOW_8); 

            	    	    										newLeafNode(otherlv_29, grammarAccess.getSchemaAccess().getCommaKeyword_2_5_4_0());
            	    	    									
            	    	    // InternalDraft7.g:367:10: ( (lv_patternProperties_30_0= ruleNamedSchema ) )
            	    	    // InternalDraft7.g:368:11: (lv_patternProperties_30_0= ruleNamedSchema )
            	    	    {
            	    	    // InternalDraft7.g:368:11: (lv_patternProperties_30_0= ruleNamedSchema )
            	    	    // InternalDraft7.g:369:12: lv_patternProperties_30_0= ruleNamedSchema
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getSchemaAccess().getPatternPropertiesNamedSchemaParserRuleCall_2_5_4_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_12);
            	    	    lv_patternProperties_30_0=ruleNamedSchema();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"patternProperties",
            	    	    													lv_patternProperties_30_0,
            	    	    													"org.xtext.json.schema.Draft7.NamedSchema");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop6;
            	        }
            	    } while (true);

            	    otherlv_31=(Token)match(input,16,FOLLOW_6); 

            	    									newLeafNode(otherlv_31, grammarAccess.getSchemaAccess().getRightCurlyBracketKeyword_2_5_5());
            	    								
            	    // InternalDraft7.g:391:9: (otherlv_32= ',' )?
            	    int alt7=2;
            	    int LA7_0 = input.LA(1);

            	    if ( (LA7_0==14) ) {
            	        alt7=1;
            	    }
            	    switch (alt7) {
            	        case 1 :
            	            // InternalDraft7.g:392:10: otherlv_32= ','
            	            {
            	            otherlv_32=(Token)match(input,14,FOLLOW_3); 

            	            										newLeafNode(otherlv_32, grammarAccess.getSchemaAccess().getCommaKeyword_2_5_6());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSchemaAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalDraft7.g:403:4: ({...}? => ( ({...}? => (otherlv_33= '\"examples\"' otherlv_34= ':' ( (lv_example_35_0= ruleExample ) ) (otherlv_36= ',' )? ) ) ) )
            	    {
            	    // InternalDraft7.g:403:4: ({...}? => ( ({...}? => (otherlv_33= '\"examples\"' otherlv_34= ':' ( (lv_example_35_0= ruleExample ) ) (otherlv_36= ',' )? ) ) ) )
            	    // InternalDraft7.g:404:5: {...}? => ( ({...}? => (otherlv_33= '\"examples\"' otherlv_34= ':' ( (lv_example_35_0= ruleExample ) ) (otherlv_36= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 6)");
            	    }
            	    // InternalDraft7.g:404:103: ( ({...}? => (otherlv_33= '\"examples\"' otherlv_34= ':' ( (lv_example_35_0= ruleExample ) ) (otherlv_36= ',' )? ) ) )
            	    // InternalDraft7.g:405:6: ({...}? => (otherlv_33= '\"examples\"' otherlv_34= ':' ( (lv_example_35_0= ruleExample ) ) (otherlv_36= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 6);
            	    					
            	    // InternalDraft7.g:408:9: ({...}? => (otherlv_33= '\"examples\"' otherlv_34= ':' ( (lv_example_35_0= ruleExample ) ) (otherlv_36= ',' )? ) )
            	    // InternalDraft7.g:408:10: {...}? => (otherlv_33= '\"examples\"' otherlv_34= ':' ( (lv_example_35_0= ruleExample ) ) (otherlv_36= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalDraft7.g:408:19: (otherlv_33= '\"examples\"' otherlv_34= ':' ( (lv_example_35_0= ruleExample ) ) (otherlv_36= ',' )? )
            	    // InternalDraft7.g:408:20: otherlv_33= '\"examples\"' otherlv_34= ':' ( (lv_example_35_0= ruleExample ) ) (otherlv_36= ',' )?
            	    {
            	    otherlv_33=(Token)match(input,21,FOLLOW_4); 

            	    									newLeafNode(otherlv_33, grammarAccess.getSchemaAccess().getExamplesKeyword_2_6_0());
            	    								
            	    otherlv_34=(Token)match(input,13,FOLLOW_11); 

            	    									newLeafNode(otherlv_34, grammarAccess.getSchemaAccess().getColonKeyword_2_6_1());
            	    								
            	    // InternalDraft7.g:416:9: ( (lv_example_35_0= ruleExample ) )
            	    // InternalDraft7.g:417:10: (lv_example_35_0= ruleExample )
            	    {
            	    // InternalDraft7.g:417:10: (lv_example_35_0= ruleExample )
            	    // InternalDraft7.g:418:11: lv_example_35_0= ruleExample
            	    {

            	    											newCompositeNode(grammarAccess.getSchemaAccess().getExampleExampleParserRuleCall_2_6_2_0());
            	    										
            	    pushFollow(FOLLOW_6);
            	    lv_example_35_0=ruleExample();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    											}
            	    											set(
            	    												current,
            	    												"example",
            	    												lv_example_35_0,
            	    												"org.xtext.json.schema.Draft7.Example");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalDraft7.g:435:9: (otherlv_36= ',' )?
            	    int alt8=2;
            	    int LA8_0 = input.LA(1);

            	    if ( (LA8_0==14) ) {
            	        alt8=1;
            	    }
            	    switch (alt8) {
            	        case 1 :
            	            // InternalDraft7.g:436:10: otherlv_36= ','
            	            {
            	            otherlv_36=(Token)match(input,14,FOLLOW_3); 

            	            										newLeafNode(otherlv_36, grammarAccess.getSchemaAccess().getCommaKeyword_2_6_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSchemaAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // InternalDraft7.g:447:4: ({...}? => ( ({...}? => (otherlv_37= '\"items\"' otherlv_38= ':' ( (lv_items_39_0= ruleItems ) ) (otherlv_40= ',' )? ) ) ) )
            	    {
            	    // InternalDraft7.g:447:4: ({...}? => ( ({...}? => (otherlv_37= '\"items\"' otherlv_38= ':' ( (lv_items_39_0= ruleItems ) ) (otherlv_40= ',' )? ) ) ) )
            	    // InternalDraft7.g:448:5: {...}? => ( ({...}? => (otherlv_37= '\"items\"' otherlv_38= ':' ( (lv_items_39_0= ruleItems ) ) (otherlv_40= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 7)");
            	    }
            	    // InternalDraft7.g:448:103: ( ({...}? => (otherlv_37= '\"items\"' otherlv_38= ':' ( (lv_items_39_0= ruleItems ) ) (otherlv_40= ',' )? ) ) )
            	    // InternalDraft7.g:449:6: ({...}? => (otherlv_37= '\"items\"' otherlv_38= ':' ( (lv_items_39_0= ruleItems ) ) (otherlv_40= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 7);
            	    					
            	    // InternalDraft7.g:452:9: ({...}? => (otherlv_37= '\"items\"' otherlv_38= ':' ( (lv_items_39_0= ruleItems ) ) (otherlv_40= ',' )? ) )
            	    // InternalDraft7.g:452:10: {...}? => (otherlv_37= '\"items\"' otherlv_38= ':' ( (lv_items_39_0= ruleItems ) ) (otherlv_40= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalDraft7.g:452:19: (otherlv_37= '\"items\"' otherlv_38= ':' ( (lv_items_39_0= ruleItems ) ) (otherlv_40= ',' )? )
            	    // InternalDraft7.g:452:20: otherlv_37= '\"items\"' otherlv_38= ':' ( (lv_items_39_0= ruleItems ) ) (otherlv_40= ',' )?
            	    {
            	    otherlv_37=(Token)match(input,22,FOLLOW_4); 

            	    									newLeafNode(otherlv_37, grammarAccess.getSchemaAccess().getItemsKeyword_2_7_0());
            	    								
            	    otherlv_38=(Token)match(input,13,FOLLOW_13); 

            	    									newLeafNode(otherlv_38, grammarAccess.getSchemaAccess().getColonKeyword_2_7_1());
            	    								
            	    // InternalDraft7.g:460:9: ( (lv_items_39_0= ruleItems ) )
            	    // InternalDraft7.g:461:10: (lv_items_39_0= ruleItems )
            	    {
            	    // InternalDraft7.g:461:10: (lv_items_39_0= ruleItems )
            	    // InternalDraft7.g:462:11: lv_items_39_0= ruleItems
            	    {

            	    											newCompositeNode(grammarAccess.getSchemaAccess().getItemsItemsParserRuleCall_2_7_2_0());
            	    										
            	    pushFollow(FOLLOW_6);
            	    lv_items_39_0=ruleItems();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    											}
            	    											set(
            	    												current,
            	    												"items",
            	    												lv_items_39_0,
            	    												"org.xtext.json.schema.Draft7.Items");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalDraft7.g:479:9: (otherlv_40= ',' )?
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( (LA9_0==14) ) {
            	        alt9=1;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // InternalDraft7.g:480:10: otherlv_40= ','
            	            {
            	            otherlv_40=(Token)match(input,14,FOLLOW_3); 

            	            										newLeafNode(otherlv_40, grammarAccess.getSchemaAccess().getCommaKeyword_2_7_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSchemaAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // InternalDraft7.g:491:4: ({...}? => ( ({...}? => (otherlv_41= '\"contains\"' otherlv_42= ':' ( (lv_contains_43_0= ruleContains ) ) (otherlv_44= ',' )? ) ) ) )
            	    {
            	    // InternalDraft7.g:491:4: ({...}? => ( ({...}? => (otherlv_41= '\"contains\"' otherlv_42= ':' ( (lv_contains_43_0= ruleContains ) ) (otherlv_44= ',' )? ) ) ) )
            	    // InternalDraft7.g:492:5: {...}? => ( ({...}? => (otherlv_41= '\"contains\"' otherlv_42= ':' ( (lv_contains_43_0= ruleContains ) ) (otherlv_44= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 8)");
            	    }
            	    // InternalDraft7.g:492:103: ( ({...}? => (otherlv_41= '\"contains\"' otherlv_42= ':' ( (lv_contains_43_0= ruleContains ) ) (otherlv_44= ',' )? ) ) )
            	    // InternalDraft7.g:493:6: ({...}? => (otherlv_41= '\"contains\"' otherlv_42= ':' ( (lv_contains_43_0= ruleContains ) ) (otherlv_44= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 8);
            	    					
            	    // InternalDraft7.g:496:9: ({...}? => (otherlv_41= '\"contains\"' otherlv_42= ':' ( (lv_contains_43_0= ruleContains ) ) (otherlv_44= ',' )? ) )
            	    // InternalDraft7.g:496:10: {...}? => (otherlv_41= '\"contains\"' otherlv_42= ':' ( (lv_contains_43_0= ruleContains ) ) (otherlv_44= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalDraft7.g:496:19: (otherlv_41= '\"contains\"' otherlv_42= ':' ( (lv_contains_43_0= ruleContains ) ) (otherlv_44= ',' )? )
            	    // InternalDraft7.g:496:20: otherlv_41= '\"contains\"' otherlv_42= ':' ( (lv_contains_43_0= ruleContains ) ) (otherlv_44= ',' )?
            	    {
            	    otherlv_41=(Token)match(input,23,FOLLOW_4); 

            	    									newLeafNode(otherlv_41, grammarAccess.getSchemaAccess().getContainsKeyword_2_8_0());
            	    								
            	    otherlv_42=(Token)match(input,13,FOLLOW_14); 

            	    									newLeafNode(otherlv_42, grammarAccess.getSchemaAccess().getColonKeyword_2_8_1());
            	    								
            	    // InternalDraft7.g:504:9: ( (lv_contains_43_0= ruleContains ) )
            	    // InternalDraft7.g:505:10: (lv_contains_43_0= ruleContains )
            	    {
            	    // InternalDraft7.g:505:10: (lv_contains_43_0= ruleContains )
            	    // InternalDraft7.g:506:11: lv_contains_43_0= ruleContains
            	    {

            	    											newCompositeNode(grammarAccess.getSchemaAccess().getContainsContainsParserRuleCall_2_8_2_0());
            	    										
            	    pushFollow(FOLLOW_6);
            	    lv_contains_43_0=ruleContains();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    											}
            	    											set(
            	    												current,
            	    												"contains",
            	    												lv_contains_43_0,
            	    												"org.xtext.json.schema.Draft7.Contains");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalDraft7.g:523:9: (otherlv_44= ',' )?
            	    int alt10=2;
            	    int LA10_0 = input.LA(1);

            	    if ( (LA10_0==14) ) {
            	        alt10=1;
            	    }
            	    switch (alt10) {
            	        case 1 :
            	            // InternalDraft7.g:524:10: otherlv_44= ','
            	            {
            	            otherlv_44=(Token)match(input,14,FOLLOW_3); 

            	            										newLeafNode(otherlv_44, grammarAccess.getSchemaAccess().getCommaKeyword_2_8_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSchemaAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 10 :
            	    // InternalDraft7.g:535:4: ({...}? => ( ({...}? => (otherlv_45= '\"definitions\"' otherlv_46= ':' otherlv_47= '{' ( (lv_definitions_48_0= ruleNamedSchema ) ) (otherlv_49= ',' ( (lv_definitions_50_0= ruleNamedSchema ) ) )* otherlv_51= '}' (otherlv_52= ',' )? ) ) ) )
            	    {
            	    // InternalDraft7.g:535:4: ({...}? => ( ({...}? => (otherlv_45= '\"definitions\"' otherlv_46= ':' otherlv_47= '{' ( (lv_definitions_48_0= ruleNamedSchema ) ) (otherlv_49= ',' ( (lv_definitions_50_0= ruleNamedSchema ) ) )* otherlv_51= '}' (otherlv_52= ',' )? ) ) ) )
            	    // InternalDraft7.g:536:5: {...}? => ( ({...}? => (otherlv_45= '\"definitions\"' otherlv_46= ':' otherlv_47= '{' ( (lv_definitions_48_0= ruleNamedSchema ) ) (otherlv_49= ',' ( (lv_definitions_50_0= ruleNamedSchema ) ) )* otherlv_51= '}' (otherlv_52= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 9) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 9)");
            	    }
            	    // InternalDraft7.g:536:103: ( ({...}? => (otherlv_45= '\"definitions\"' otherlv_46= ':' otherlv_47= '{' ( (lv_definitions_48_0= ruleNamedSchema ) ) (otherlv_49= ',' ( (lv_definitions_50_0= ruleNamedSchema ) ) )* otherlv_51= '}' (otherlv_52= ',' )? ) ) )
            	    // InternalDraft7.g:537:6: ({...}? => (otherlv_45= '\"definitions\"' otherlv_46= ':' otherlv_47= '{' ( (lv_definitions_48_0= ruleNamedSchema ) ) (otherlv_49= ',' ( (lv_definitions_50_0= ruleNamedSchema ) ) )* otherlv_51= '}' (otherlv_52= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 9);
            	    					
            	    // InternalDraft7.g:540:9: ({...}? => (otherlv_45= '\"definitions\"' otherlv_46= ':' otherlv_47= '{' ( (lv_definitions_48_0= ruleNamedSchema ) ) (otherlv_49= ',' ( (lv_definitions_50_0= ruleNamedSchema ) ) )* otherlv_51= '}' (otherlv_52= ',' )? ) )
            	    // InternalDraft7.g:540:10: {...}? => (otherlv_45= '\"definitions\"' otherlv_46= ':' otherlv_47= '{' ( (lv_definitions_48_0= ruleNamedSchema ) ) (otherlv_49= ',' ( (lv_definitions_50_0= ruleNamedSchema ) ) )* otherlv_51= '}' (otherlv_52= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalDraft7.g:540:19: (otherlv_45= '\"definitions\"' otherlv_46= ':' otherlv_47= '{' ( (lv_definitions_48_0= ruleNamedSchema ) ) (otherlv_49= ',' ( (lv_definitions_50_0= ruleNamedSchema ) ) )* otherlv_51= '}' (otherlv_52= ',' )? )
            	    // InternalDraft7.g:540:20: otherlv_45= '\"definitions\"' otherlv_46= ':' otherlv_47= '{' ( (lv_definitions_48_0= ruleNamedSchema ) ) (otherlv_49= ',' ( (lv_definitions_50_0= ruleNamedSchema ) ) )* otherlv_51= '}' (otherlv_52= ',' )?
            	    {
            	    otherlv_45=(Token)match(input,24,FOLLOW_4); 

            	    									newLeafNode(otherlv_45, grammarAccess.getSchemaAccess().getDefinitionsKeyword_2_9_0());
            	    								
            	    otherlv_46=(Token)match(input,13,FOLLOW_7); 

            	    									newLeafNode(otherlv_46, grammarAccess.getSchemaAccess().getColonKeyword_2_9_1());
            	    								
            	    otherlv_47=(Token)match(input,11,FOLLOW_8); 

            	    									newLeafNode(otherlv_47, grammarAccess.getSchemaAccess().getLeftCurlyBracketKeyword_2_9_2());
            	    								
            	    // InternalDraft7.g:552:9: ( (lv_definitions_48_0= ruleNamedSchema ) )
            	    // InternalDraft7.g:553:10: (lv_definitions_48_0= ruleNamedSchema )
            	    {
            	    // InternalDraft7.g:553:10: (lv_definitions_48_0= ruleNamedSchema )
            	    // InternalDraft7.g:554:11: lv_definitions_48_0= ruleNamedSchema
            	    {

            	    											newCompositeNode(grammarAccess.getSchemaAccess().getDefinitionsNamedSchemaParserRuleCall_2_9_3_0());
            	    										
            	    pushFollow(FOLLOW_12);
            	    lv_definitions_48_0=ruleNamedSchema();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    											}
            	    											add(
            	    												current,
            	    												"definitions",
            	    												lv_definitions_48_0,
            	    												"org.xtext.json.schema.Draft7.NamedSchema");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalDraft7.g:571:9: (otherlv_49= ',' ( (lv_definitions_50_0= ruleNamedSchema ) ) )*
            	    loop11:
            	    do {
            	        int alt11=2;
            	        int LA11_0 = input.LA(1);

            	        if ( (LA11_0==14) ) {
            	            alt11=1;
            	        }


            	        switch (alt11) {
            	    	case 1 :
            	    	    // InternalDraft7.g:572:10: otherlv_49= ',' ( (lv_definitions_50_0= ruleNamedSchema ) )
            	    	    {
            	    	    otherlv_49=(Token)match(input,14,FOLLOW_8); 

            	    	    										newLeafNode(otherlv_49, grammarAccess.getSchemaAccess().getCommaKeyword_2_9_4_0());
            	    	    									
            	    	    // InternalDraft7.g:576:10: ( (lv_definitions_50_0= ruleNamedSchema ) )
            	    	    // InternalDraft7.g:577:11: (lv_definitions_50_0= ruleNamedSchema )
            	    	    {
            	    	    // InternalDraft7.g:577:11: (lv_definitions_50_0= ruleNamedSchema )
            	    	    // InternalDraft7.g:578:12: lv_definitions_50_0= ruleNamedSchema
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getSchemaAccess().getDefinitionsNamedSchemaParserRuleCall_2_9_4_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_12);
            	    	    lv_definitions_50_0=ruleNamedSchema();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"definitions",
            	    	    													lv_definitions_50_0,
            	    	    													"org.xtext.json.schema.Draft7.NamedSchema");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop11;
            	        }
            	    } while (true);

            	    otherlv_51=(Token)match(input,16,FOLLOW_6); 

            	    									newLeafNode(otherlv_51, grammarAccess.getSchemaAccess().getRightCurlyBracketKeyword_2_9_5());
            	    								
            	    // InternalDraft7.g:600:9: (otherlv_52= ',' )?
            	    int alt12=2;
            	    int LA12_0 = input.LA(1);

            	    if ( (LA12_0==14) ) {
            	        alt12=1;
            	    }
            	    switch (alt12) {
            	        case 1 :
            	            // InternalDraft7.g:601:10: otherlv_52= ','
            	            {
            	            otherlv_52=(Token)match(input,14,FOLLOW_3); 

            	            										newLeafNode(otherlv_52, grammarAccess.getSchemaAccess().getCommaKeyword_2_9_6());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSchemaAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 11 :
            	    // InternalDraft7.g:612:4: ({...}? => ( ({...}? => (otherlv_53= '\"title\"' otherlv_54= ':' ( (lv_title_55_0= RULE_STRING ) ) (otherlv_56= ',' )? ) ) ) )
            	    {
            	    // InternalDraft7.g:612:4: ({...}? => ( ({...}? => (otherlv_53= '\"title\"' otherlv_54= ':' ( (lv_title_55_0= RULE_STRING ) ) (otherlv_56= ',' )? ) ) ) )
            	    // InternalDraft7.g:613:5: {...}? => ( ({...}? => (otherlv_53= '\"title\"' otherlv_54= ':' ( (lv_title_55_0= RULE_STRING ) ) (otherlv_56= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 10) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 10)");
            	    }
            	    // InternalDraft7.g:613:104: ( ({...}? => (otherlv_53= '\"title\"' otherlv_54= ':' ( (lv_title_55_0= RULE_STRING ) ) (otherlv_56= ',' )? ) ) )
            	    // InternalDraft7.g:614:6: ({...}? => (otherlv_53= '\"title\"' otherlv_54= ':' ( (lv_title_55_0= RULE_STRING ) ) (otherlv_56= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 10);
            	    					
            	    // InternalDraft7.g:617:9: ({...}? => (otherlv_53= '\"title\"' otherlv_54= ':' ( (lv_title_55_0= RULE_STRING ) ) (otherlv_56= ',' )? ) )
            	    // InternalDraft7.g:617:10: {...}? => (otherlv_53= '\"title\"' otherlv_54= ':' ( (lv_title_55_0= RULE_STRING ) ) (otherlv_56= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalDraft7.g:617:19: (otherlv_53= '\"title\"' otherlv_54= ':' ( (lv_title_55_0= RULE_STRING ) ) (otherlv_56= ',' )? )
            	    // InternalDraft7.g:617:20: otherlv_53= '\"title\"' otherlv_54= ':' ( (lv_title_55_0= RULE_STRING ) ) (otherlv_56= ',' )?
            	    {
            	    otherlv_53=(Token)match(input,25,FOLLOW_4); 

            	    									newLeafNode(otherlv_53, grammarAccess.getSchemaAccess().getTitleKeyword_2_10_0());
            	    								
            	    otherlv_54=(Token)match(input,13,FOLLOW_15); 

            	    									newLeafNode(otherlv_54, grammarAccess.getSchemaAccess().getColonKeyword_2_10_1());
            	    								
            	    // InternalDraft7.g:625:9: ( (lv_title_55_0= RULE_STRING ) )
            	    // InternalDraft7.g:626:10: (lv_title_55_0= RULE_STRING )
            	    {
            	    // InternalDraft7.g:626:10: (lv_title_55_0= RULE_STRING )
            	    // InternalDraft7.g:627:11: lv_title_55_0= RULE_STRING
            	    {
            	    lv_title_55_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            	    											newLeafNode(lv_title_55_0, grammarAccess.getSchemaAccess().getTitleSTRINGTerminalRuleCall_2_10_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getSchemaRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"title",
            	    												lv_title_55_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }

            	    // InternalDraft7.g:643:9: (otherlv_56= ',' )?
            	    int alt13=2;
            	    int LA13_0 = input.LA(1);

            	    if ( (LA13_0==14) ) {
            	        alt13=1;
            	    }
            	    switch (alt13) {
            	        case 1 :
            	            // InternalDraft7.g:644:10: otherlv_56= ','
            	            {
            	            otherlv_56=(Token)match(input,14,FOLLOW_3); 

            	            										newLeafNode(otherlv_56, grammarAccess.getSchemaAccess().getCommaKeyword_2_10_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSchemaAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 12 :
            	    // InternalDraft7.g:655:4: ({...}? => ( ({...}? => (otherlv_57= '\"required\"' otherlv_58= ':' otherlv_59= '[' ( (lv_requiredProperties_60_0= ruleAnyString ) ) (otherlv_61= ',' ( (lv_requiredProperties_62_0= ruleAnyString ) ) )* otherlv_63= ']' (otherlv_64= ',' )? ) ) ) )
            	    {
            	    // InternalDraft7.g:655:4: ({...}? => ( ({...}? => (otherlv_57= '\"required\"' otherlv_58= ':' otherlv_59= '[' ( (lv_requiredProperties_60_0= ruleAnyString ) ) (otherlv_61= ',' ( (lv_requiredProperties_62_0= ruleAnyString ) ) )* otherlv_63= ']' (otherlv_64= ',' )? ) ) ) )
            	    // InternalDraft7.g:656:5: {...}? => ( ({...}? => (otherlv_57= '\"required\"' otherlv_58= ':' otherlv_59= '[' ( (lv_requiredProperties_60_0= ruleAnyString ) ) (otherlv_61= ',' ( (lv_requiredProperties_62_0= ruleAnyString ) ) )* otherlv_63= ']' (otherlv_64= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 11) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 11)");
            	    }
            	    // InternalDraft7.g:656:104: ( ({...}? => (otherlv_57= '\"required\"' otherlv_58= ':' otherlv_59= '[' ( (lv_requiredProperties_60_0= ruleAnyString ) ) (otherlv_61= ',' ( (lv_requiredProperties_62_0= ruleAnyString ) ) )* otherlv_63= ']' (otherlv_64= ',' )? ) ) )
            	    // InternalDraft7.g:657:6: ({...}? => (otherlv_57= '\"required\"' otherlv_58= ':' otherlv_59= '[' ( (lv_requiredProperties_60_0= ruleAnyString ) ) (otherlv_61= ',' ( (lv_requiredProperties_62_0= ruleAnyString ) ) )* otherlv_63= ']' (otherlv_64= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 11);
            	    					
            	    // InternalDraft7.g:660:9: ({...}? => (otherlv_57= '\"required\"' otherlv_58= ':' otherlv_59= '[' ( (lv_requiredProperties_60_0= ruleAnyString ) ) (otherlv_61= ',' ( (lv_requiredProperties_62_0= ruleAnyString ) ) )* otherlv_63= ']' (otherlv_64= ',' )? ) )
            	    // InternalDraft7.g:660:10: {...}? => (otherlv_57= '\"required\"' otherlv_58= ':' otherlv_59= '[' ( (lv_requiredProperties_60_0= ruleAnyString ) ) (otherlv_61= ',' ( (lv_requiredProperties_62_0= ruleAnyString ) ) )* otherlv_63= ']' (otherlv_64= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalDraft7.g:660:19: (otherlv_57= '\"required\"' otherlv_58= ':' otherlv_59= '[' ( (lv_requiredProperties_60_0= ruleAnyString ) ) (otherlv_61= ',' ( (lv_requiredProperties_62_0= ruleAnyString ) ) )* otherlv_63= ']' (otherlv_64= ',' )? )
            	    // InternalDraft7.g:660:20: otherlv_57= '\"required\"' otherlv_58= ':' otherlv_59= '[' ( (lv_requiredProperties_60_0= ruleAnyString ) ) (otherlv_61= ',' ( (lv_requiredProperties_62_0= ruleAnyString ) ) )* otherlv_63= ']' (otherlv_64= ',' )?
            	    {
            	    otherlv_57=(Token)match(input,26,FOLLOW_4); 

            	    									newLeafNode(otherlv_57, grammarAccess.getSchemaAccess().getRequiredKeyword_2_11_0());
            	    								
            	    otherlv_58=(Token)match(input,13,FOLLOW_16); 

            	    									newLeafNode(otherlv_58, grammarAccess.getSchemaAccess().getColonKeyword_2_11_1());
            	    								
            	    otherlv_59=(Token)match(input,27,FOLLOW_8); 

            	    									newLeafNode(otherlv_59, grammarAccess.getSchemaAccess().getLeftSquareBracketKeyword_2_11_2());
            	    								
            	    // InternalDraft7.g:672:9: ( (lv_requiredProperties_60_0= ruleAnyString ) )
            	    // InternalDraft7.g:673:10: (lv_requiredProperties_60_0= ruleAnyString )
            	    {
            	    // InternalDraft7.g:673:10: (lv_requiredProperties_60_0= ruleAnyString )
            	    // InternalDraft7.g:674:11: lv_requiredProperties_60_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getSchemaAccess().getRequiredPropertiesAnyStringParserRuleCall_2_11_3_0());
            	    										
            	    pushFollow(FOLLOW_17);
            	    lv_requiredProperties_60_0=ruleAnyString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    											}
            	    											add(
            	    												current,
            	    												"requiredProperties",
            	    												lv_requiredProperties_60_0,
            	    												"org.xtext.json.schema.Draft7.AnyString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalDraft7.g:691:9: (otherlv_61= ',' ( (lv_requiredProperties_62_0= ruleAnyString ) ) )*
            	    loop14:
            	    do {
            	        int alt14=2;
            	        int LA14_0 = input.LA(1);

            	        if ( (LA14_0==14) ) {
            	            alt14=1;
            	        }


            	        switch (alt14) {
            	    	case 1 :
            	    	    // InternalDraft7.g:692:10: otherlv_61= ',' ( (lv_requiredProperties_62_0= ruleAnyString ) )
            	    	    {
            	    	    otherlv_61=(Token)match(input,14,FOLLOW_8); 

            	    	    										newLeafNode(otherlv_61, grammarAccess.getSchemaAccess().getCommaKeyword_2_11_4_0());
            	    	    									
            	    	    // InternalDraft7.g:696:10: ( (lv_requiredProperties_62_0= ruleAnyString ) )
            	    	    // InternalDraft7.g:697:11: (lv_requiredProperties_62_0= ruleAnyString )
            	    	    {
            	    	    // InternalDraft7.g:697:11: (lv_requiredProperties_62_0= ruleAnyString )
            	    	    // InternalDraft7.g:698:12: lv_requiredProperties_62_0= ruleAnyString
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getSchemaAccess().getRequiredPropertiesAnyStringParserRuleCall_2_11_4_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_17);
            	    	    lv_requiredProperties_62_0=ruleAnyString();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"requiredProperties",
            	    	    													lv_requiredProperties_62_0,
            	    	    													"org.xtext.json.schema.Draft7.AnyString");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop14;
            	        }
            	    } while (true);

            	    otherlv_63=(Token)match(input,28,FOLLOW_6); 

            	    									newLeafNode(otherlv_63, grammarAccess.getSchemaAccess().getRightSquareBracketKeyword_2_11_5());
            	    								
            	    // InternalDraft7.g:720:9: (otherlv_64= ',' )?
            	    int alt15=2;
            	    int LA15_0 = input.LA(1);

            	    if ( (LA15_0==14) ) {
            	        alt15=1;
            	    }
            	    switch (alt15) {
            	        case 1 :
            	            // InternalDraft7.g:721:10: otherlv_64= ','
            	            {
            	            otherlv_64=(Token)match(input,14,FOLLOW_3); 

            	            										newLeafNode(otherlv_64, grammarAccess.getSchemaAccess().getCommaKeyword_2_11_6());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSchemaAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 13 :
            	    // InternalDraft7.g:732:4: ({...}? => ( ({...}? => (otherlv_65= '\"description\"' otherlv_66= ':' ( (lv_description_67_0= RULE_STRING ) ) (otherlv_68= ',' )? ) ) ) )
            	    {
            	    // InternalDraft7.g:732:4: ({...}? => ( ({...}? => (otherlv_65= '\"description\"' otherlv_66= ':' ( (lv_description_67_0= RULE_STRING ) ) (otherlv_68= ',' )? ) ) ) )
            	    // InternalDraft7.g:733:5: {...}? => ( ({...}? => (otherlv_65= '\"description\"' otherlv_66= ':' ( (lv_description_67_0= RULE_STRING ) ) (otherlv_68= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 12) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 12)");
            	    }
            	    // InternalDraft7.g:733:104: ( ({...}? => (otherlv_65= '\"description\"' otherlv_66= ':' ( (lv_description_67_0= RULE_STRING ) ) (otherlv_68= ',' )? ) ) )
            	    // InternalDraft7.g:734:6: ({...}? => (otherlv_65= '\"description\"' otherlv_66= ':' ( (lv_description_67_0= RULE_STRING ) ) (otherlv_68= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 12);
            	    					
            	    // InternalDraft7.g:737:9: ({...}? => (otherlv_65= '\"description\"' otherlv_66= ':' ( (lv_description_67_0= RULE_STRING ) ) (otherlv_68= ',' )? ) )
            	    // InternalDraft7.g:737:10: {...}? => (otherlv_65= '\"description\"' otherlv_66= ':' ( (lv_description_67_0= RULE_STRING ) ) (otherlv_68= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalDraft7.g:737:19: (otherlv_65= '\"description\"' otherlv_66= ':' ( (lv_description_67_0= RULE_STRING ) ) (otherlv_68= ',' )? )
            	    // InternalDraft7.g:737:20: otherlv_65= '\"description\"' otherlv_66= ':' ( (lv_description_67_0= RULE_STRING ) ) (otherlv_68= ',' )?
            	    {
            	    otherlv_65=(Token)match(input,29,FOLLOW_4); 

            	    									newLeafNode(otherlv_65, grammarAccess.getSchemaAccess().getDescriptionKeyword_2_12_0());
            	    								
            	    otherlv_66=(Token)match(input,13,FOLLOW_15); 

            	    									newLeafNode(otherlv_66, grammarAccess.getSchemaAccess().getColonKeyword_2_12_1());
            	    								
            	    // InternalDraft7.g:745:9: ( (lv_description_67_0= RULE_STRING ) )
            	    // InternalDraft7.g:746:10: (lv_description_67_0= RULE_STRING )
            	    {
            	    // InternalDraft7.g:746:10: (lv_description_67_0= RULE_STRING )
            	    // InternalDraft7.g:747:11: lv_description_67_0= RULE_STRING
            	    {
            	    lv_description_67_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            	    											newLeafNode(lv_description_67_0, grammarAccess.getSchemaAccess().getDescriptionSTRINGTerminalRuleCall_2_12_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getSchemaRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"description",
            	    												lv_description_67_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }

            	    // InternalDraft7.g:763:9: (otherlv_68= ',' )?
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( (LA16_0==14) ) {
            	        alt16=1;
            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // InternalDraft7.g:764:10: otherlv_68= ','
            	            {
            	            otherlv_68=(Token)match(input,14,FOLLOW_3); 

            	            										newLeafNode(otherlv_68, grammarAccess.getSchemaAccess().getCommaKeyword_2_12_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSchemaAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 14 :
            	    // InternalDraft7.g:775:4: ({...}? => ( ({...}? => (otherlv_69= '\"properties\"' otherlv_70= ':' otherlv_71= '{' ( (lv_properties_72_0= ruleNamedSchema ) ) (otherlv_73= ',' ( (lv_properties_74_0= ruleNamedSchema ) ) )* otherlv_75= '}' (otherlv_76= ',' )? ) ) ) )
            	    {
            	    // InternalDraft7.g:775:4: ({...}? => ( ({...}? => (otherlv_69= '\"properties\"' otherlv_70= ':' otherlv_71= '{' ( (lv_properties_72_0= ruleNamedSchema ) ) (otherlv_73= ',' ( (lv_properties_74_0= ruleNamedSchema ) ) )* otherlv_75= '}' (otherlv_76= ',' )? ) ) ) )
            	    // InternalDraft7.g:776:5: {...}? => ( ({...}? => (otherlv_69= '\"properties\"' otherlv_70= ':' otherlv_71= '{' ( (lv_properties_72_0= ruleNamedSchema ) ) (otherlv_73= ',' ( (lv_properties_74_0= ruleNamedSchema ) ) )* otherlv_75= '}' (otherlv_76= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 13) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 13)");
            	    }
            	    // InternalDraft7.g:776:104: ( ({...}? => (otherlv_69= '\"properties\"' otherlv_70= ':' otherlv_71= '{' ( (lv_properties_72_0= ruleNamedSchema ) ) (otherlv_73= ',' ( (lv_properties_74_0= ruleNamedSchema ) ) )* otherlv_75= '}' (otherlv_76= ',' )? ) ) )
            	    // InternalDraft7.g:777:6: ({...}? => (otherlv_69= '\"properties\"' otherlv_70= ':' otherlv_71= '{' ( (lv_properties_72_0= ruleNamedSchema ) ) (otherlv_73= ',' ( (lv_properties_74_0= ruleNamedSchema ) ) )* otherlv_75= '}' (otherlv_76= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 13);
            	    					
            	    // InternalDraft7.g:780:9: ({...}? => (otherlv_69= '\"properties\"' otherlv_70= ':' otherlv_71= '{' ( (lv_properties_72_0= ruleNamedSchema ) ) (otherlv_73= ',' ( (lv_properties_74_0= ruleNamedSchema ) ) )* otherlv_75= '}' (otherlv_76= ',' )? ) )
            	    // InternalDraft7.g:780:10: {...}? => (otherlv_69= '\"properties\"' otherlv_70= ':' otherlv_71= '{' ( (lv_properties_72_0= ruleNamedSchema ) ) (otherlv_73= ',' ( (lv_properties_74_0= ruleNamedSchema ) ) )* otherlv_75= '}' (otherlv_76= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalDraft7.g:780:19: (otherlv_69= '\"properties\"' otherlv_70= ':' otherlv_71= '{' ( (lv_properties_72_0= ruleNamedSchema ) ) (otherlv_73= ',' ( (lv_properties_74_0= ruleNamedSchema ) ) )* otherlv_75= '}' (otherlv_76= ',' )? )
            	    // InternalDraft7.g:780:20: otherlv_69= '\"properties\"' otherlv_70= ':' otherlv_71= '{' ( (lv_properties_72_0= ruleNamedSchema ) ) (otherlv_73= ',' ( (lv_properties_74_0= ruleNamedSchema ) ) )* otherlv_75= '}' (otherlv_76= ',' )?
            	    {
            	    otherlv_69=(Token)match(input,30,FOLLOW_4); 

            	    									newLeafNode(otherlv_69, grammarAccess.getSchemaAccess().getPropertiesKeyword_2_13_0());
            	    								
            	    otherlv_70=(Token)match(input,13,FOLLOW_7); 

            	    									newLeafNode(otherlv_70, grammarAccess.getSchemaAccess().getColonKeyword_2_13_1());
            	    								
            	    otherlv_71=(Token)match(input,11,FOLLOW_8); 

            	    									newLeafNode(otherlv_71, grammarAccess.getSchemaAccess().getLeftCurlyBracketKeyword_2_13_2());
            	    								
            	    // InternalDraft7.g:792:9: ( (lv_properties_72_0= ruleNamedSchema ) )
            	    // InternalDraft7.g:793:10: (lv_properties_72_0= ruleNamedSchema )
            	    {
            	    // InternalDraft7.g:793:10: (lv_properties_72_0= ruleNamedSchema )
            	    // InternalDraft7.g:794:11: lv_properties_72_0= ruleNamedSchema
            	    {

            	    											newCompositeNode(grammarAccess.getSchemaAccess().getPropertiesNamedSchemaParserRuleCall_2_13_3_0());
            	    										
            	    pushFollow(FOLLOW_12);
            	    lv_properties_72_0=ruleNamedSchema();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    											}
            	    											add(
            	    												current,
            	    												"properties",
            	    												lv_properties_72_0,
            	    												"org.xtext.json.schema.Draft7.NamedSchema");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalDraft7.g:811:9: (otherlv_73= ',' ( (lv_properties_74_0= ruleNamedSchema ) ) )*
            	    loop17:
            	    do {
            	        int alt17=2;
            	        int LA17_0 = input.LA(1);

            	        if ( (LA17_0==14) ) {
            	            alt17=1;
            	        }


            	        switch (alt17) {
            	    	case 1 :
            	    	    // InternalDraft7.g:812:10: otherlv_73= ',' ( (lv_properties_74_0= ruleNamedSchema ) )
            	    	    {
            	    	    otherlv_73=(Token)match(input,14,FOLLOW_8); 

            	    	    										newLeafNode(otherlv_73, grammarAccess.getSchemaAccess().getCommaKeyword_2_13_4_0());
            	    	    									
            	    	    // InternalDraft7.g:816:10: ( (lv_properties_74_0= ruleNamedSchema ) )
            	    	    // InternalDraft7.g:817:11: (lv_properties_74_0= ruleNamedSchema )
            	    	    {
            	    	    // InternalDraft7.g:817:11: (lv_properties_74_0= ruleNamedSchema )
            	    	    // InternalDraft7.g:818:12: lv_properties_74_0= ruleNamedSchema
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getSchemaAccess().getPropertiesNamedSchemaParserRuleCall_2_13_4_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_12);
            	    	    lv_properties_74_0=ruleNamedSchema();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"properties",
            	    	    													lv_properties_74_0,
            	    	    													"org.xtext.json.schema.Draft7.NamedSchema");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop17;
            	        }
            	    } while (true);

            	    otherlv_75=(Token)match(input,16,FOLLOW_6); 

            	    									newLeafNode(otherlv_75, grammarAccess.getSchemaAccess().getRightCurlyBracketKeyword_2_13_5());
            	    								
            	    // InternalDraft7.g:840:9: (otherlv_76= ',' )?
            	    int alt18=2;
            	    int LA18_0 = input.LA(1);

            	    if ( (LA18_0==14) ) {
            	        alt18=1;
            	    }
            	    switch (alt18) {
            	        case 1 :
            	            // InternalDraft7.g:841:10: otherlv_76= ','
            	            {
            	            otherlv_76=(Token)match(input,14,FOLLOW_3); 

            	            										newLeafNode(otherlv_76, grammarAccess.getSchemaAccess().getCommaKeyword_2_13_6());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSchemaAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 15 :
            	    // InternalDraft7.g:852:4: ({...}? => ( ({...}? => (otherlv_77= '\"enum\"' otherlv_78= ':' otherlv_79= '[' ( (lv_enumValues_80_0= ruleAnyString ) ) (otherlv_81= ',' ( (lv_enumValues_82_0= ruleAnyString ) ) )* otherlv_83= ']' (otherlv_84= ',' )? ) ) ) )
            	    {
            	    // InternalDraft7.g:852:4: ({...}? => ( ({...}? => (otherlv_77= '\"enum\"' otherlv_78= ':' otherlv_79= '[' ( (lv_enumValues_80_0= ruleAnyString ) ) (otherlv_81= ',' ( (lv_enumValues_82_0= ruleAnyString ) ) )* otherlv_83= ']' (otherlv_84= ',' )? ) ) ) )
            	    // InternalDraft7.g:853:5: {...}? => ( ({...}? => (otherlv_77= '\"enum\"' otherlv_78= ':' otherlv_79= '[' ( (lv_enumValues_80_0= ruleAnyString ) ) (otherlv_81= ',' ( (lv_enumValues_82_0= ruleAnyString ) ) )* otherlv_83= ']' (otherlv_84= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14)");
            	    }
            	    // InternalDraft7.g:853:104: ( ({...}? => (otherlv_77= '\"enum\"' otherlv_78= ':' otherlv_79= '[' ( (lv_enumValues_80_0= ruleAnyString ) ) (otherlv_81= ',' ( (lv_enumValues_82_0= ruleAnyString ) ) )* otherlv_83= ']' (otherlv_84= ',' )? ) ) )
            	    // InternalDraft7.g:854:6: ({...}? => (otherlv_77= '\"enum\"' otherlv_78= ':' otherlv_79= '[' ( (lv_enumValues_80_0= ruleAnyString ) ) (otherlv_81= ',' ( (lv_enumValues_82_0= ruleAnyString ) ) )* otherlv_83= ']' (otherlv_84= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14);
            	    					
            	    // InternalDraft7.g:857:9: ({...}? => (otherlv_77= '\"enum\"' otherlv_78= ':' otherlv_79= '[' ( (lv_enumValues_80_0= ruleAnyString ) ) (otherlv_81= ',' ( (lv_enumValues_82_0= ruleAnyString ) ) )* otherlv_83= ']' (otherlv_84= ',' )? ) )
            	    // InternalDraft7.g:857:10: {...}? => (otherlv_77= '\"enum\"' otherlv_78= ':' otherlv_79= '[' ( (lv_enumValues_80_0= ruleAnyString ) ) (otherlv_81= ',' ( (lv_enumValues_82_0= ruleAnyString ) ) )* otherlv_83= ']' (otherlv_84= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalDraft7.g:857:19: (otherlv_77= '\"enum\"' otherlv_78= ':' otherlv_79= '[' ( (lv_enumValues_80_0= ruleAnyString ) ) (otherlv_81= ',' ( (lv_enumValues_82_0= ruleAnyString ) ) )* otherlv_83= ']' (otherlv_84= ',' )? )
            	    // InternalDraft7.g:857:20: otherlv_77= '\"enum\"' otherlv_78= ':' otherlv_79= '[' ( (lv_enumValues_80_0= ruleAnyString ) ) (otherlv_81= ',' ( (lv_enumValues_82_0= ruleAnyString ) ) )* otherlv_83= ']' (otherlv_84= ',' )?
            	    {
            	    otherlv_77=(Token)match(input,31,FOLLOW_4); 

            	    									newLeafNode(otherlv_77, grammarAccess.getSchemaAccess().getEnumKeyword_2_14_0());
            	    								
            	    otherlv_78=(Token)match(input,13,FOLLOW_16); 

            	    									newLeafNode(otherlv_78, grammarAccess.getSchemaAccess().getColonKeyword_2_14_1());
            	    								
            	    otherlv_79=(Token)match(input,27,FOLLOW_8); 

            	    									newLeafNode(otherlv_79, grammarAccess.getSchemaAccess().getLeftSquareBracketKeyword_2_14_2());
            	    								
            	    // InternalDraft7.g:869:9: ( (lv_enumValues_80_0= ruleAnyString ) )
            	    // InternalDraft7.g:870:10: (lv_enumValues_80_0= ruleAnyString )
            	    {
            	    // InternalDraft7.g:870:10: (lv_enumValues_80_0= ruleAnyString )
            	    // InternalDraft7.g:871:11: lv_enumValues_80_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getSchemaAccess().getEnumValuesAnyStringParserRuleCall_2_14_3_0());
            	    										
            	    pushFollow(FOLLOW_17);
            	    lv_enumValues_80_0=ruleAnyString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    											}
            	    											add(
            	    												current,
            	    												"enumValues",
            	    												lv_enumValues_80_0,
            	    												"org.xtext.json.schema.Draft7.AnyString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalDraft7.g:888:9: (otherlv_81= ',' ( (lv_enumValues_82_0= ruleAnyString ) ) )*
            	    loop19:
            	    do {
            	        int alt19=2;
            	        int LA19_0 = input.LA(1);

            	        if ( (LA19_0==14) ) {
            	            alt19=1;
            	        }


            	        switch (alt19) {
            	    	case 1 :
            	    	    // InternalDraft7.g:889:10: otherlv_81= ',' ( (lv_enumValues_82_0= ruleAnyString ) )
            	    	    {
            	    	    otherlv_81=(Token)match(input,14,FOLLOW_8); 

            	    	    										newLeafNode(otherlv_81, grammarAccess.getSchemaAccess().getCommaKeyword_2_14_4_0());
            	    	    									
            	    	    // InternalDraft7.g:893:10: ( (lv_enumValues_82_0= ruleAnyString ) )
            	    	    // InternalDraft7.g:894:11: (lv_enumValues_82_0= ruleAnyString )
            	    	    {
            	    	    // InternalDraft7.g:894:11: (lv_enumValues_82_0= ruleAnyString )
            	    	    // InternalDraft7.g:895:12: lv_enumValues_82_0= ruleAnyString
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getSchemaAccess().getEnumValuesAnyStringParserRuleCall_2_14_4_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_17);
            	    	    lv_enumValues_82_0=ruleAnyString();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"enumValues",
            	    	    													lv_enumValues_82_0,
            	    	    													"org.xtext.json.schema.Draft7.AnyString");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop19;
            	        }
            	    } while (true);

            	    otherlv_83=(Token)match(input,28,FOLLOW_6); 

            	    									newLeafNode(otherlv_83, grammarAccess.getSchemaAccess().getRightSquareBracketKeyword_2_14_5());
            	    								
            	    // InternalDraft7.g:917:9: (otherlv_84= ',' )?
            	    int alt20=2;
            	    int LA20_0 = input.LA(1);

            	    if ( (LA20_0==14) ) {
            	        alt20=1;
            	    }
            	    switch (alt20) {
            	        case 1 :
            	            // InternalDraft7.g:918:10: otherlv_84= ','
            	            {
            	            otherlv_84=(Token)match(input,14,FOLLOW_3); 

            	            										newLeafNode(otherlv_84, grammarAccess.getSchemaAccess().getCommaKeyword_2_14_6());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSchemaAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 16 :
            	    // InternalDraft7.g:929:4: ({...}? => ( ({...}? => (otherlv_85= '\"$schema\"' otherlv_86= ':' otherlv_87= '\"http://json-schema.org/draft-07/schema#\"' (otherlv_88= ',' )? ) ) ) )
            	    {
            	    // InternalDraft7.g:929:4: ({...}? => ( ({...}? => (otherlv_85= '\"$schema\"' otherlv_86= ':' otherlv_87= '\"http://json-schema.org/draft-07/schema#\"' (otherlv_88= ',' )? ) ) ) )
            	    // InternalDraft7.g:930:5: {...}? => ( ({...}? => (otherlv_85= '\"$schema\"' otherlv_86= ':' otherlv_87= '\"http://json-schema.org/draft-07/schema#\"' (otherlv_88= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 15) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 15)");
            	    }
            	    // InternalDraft7.g:930:104: ( ({...}? => (otherlv_85= '\"$schema\"' otherlv_86= ':' otherlv_87= '\"http://json-schema.org/draft-07/schema#\"' (otherlv_88= ',' )? ) ) )
            	    // InternalDraft7.g:931:6: ({...}? => (otherlv_85= '\"$schema\"' otherlv_86= ':' otherlv_87= '\"http://json-schema.org/draft-07/schema#\"' (otherlv_88= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 15);
            	    					
            	    // InternalDraft7.g:934:9: ({...}? => (otherlv_85= '\"$schema\"' otherlv_86= ':' otherlv_87= '\"http://json-schema.org/draft-07/schema#\"' (otherlv_88= ',' )? ) )
            	    // InternalDraft7.g:934:10: {...}? => (otherlv_85= '\"$schema\"' otherlv_86= ':' otherlv_87= '\"http://json-schema.org/draft-07/schema#\"' (otherlv_88= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalDraft7.g:934:19: (otherlv_85= '\"$schema\"' otherlv_86= ':' otherlv_87= '\"http://json-schema.org/draft-07/schema#\"' (otherlv_88= ',' )? )
            	    // InternalDraft7.g:934:20: otherlv_85= '\"$schema\"' otherlv_86= ':' otherlv_87= '\"http://json-schema.org/draft-07/schema#\"' (otherlv_88= ',' )?
            	    {
            	    otherlv_85=(Token)match(input,32,FOLLOW_4); 

            	    									newLeafNode(otherlv_85, grammarAccess.getSchemaAccess().getSchemaKeyword_2_15_0());
            	    								
            	    otherlv_86=(Token)match(input,13,FOLLOW_18); 

            	    									newLeafNode(otherlv_86, grammarAccess.getSchemaAccess().getColonKeyword_2_15_1());
            	    								
            	    otherlv_87=(Token)match(input,33,FOLLOW_6); 

            	    									newLeafNode(otherlv_87, grammarAccess.getSchemaAccess().getHttpJsonSchemaOrgDraft07SchemaKeyword_2_15_2());
            	    								
            	    // InternalDraft7.g:946:9: (otherlv_88= ',' )?
            	    int alt21=2;
            	    int LA21_0 = input.LA(1);

            	    if ( (LA21_0==14) ) {
            	        alt21=1;
            	    }
            	    switch (alt21) {
            	        case 1 :
            	            // InternalDraft7.g:947:10: otherlv_88= ','
            	            {
            	            otherlv_88=(Token)match(input,14,FOLLOW_3); 

            	            										newLeafNode(otherlv_88, grammarAccess.getSchemaAccess().getCommaKeyword_2_15_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSchemaAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 17 :
            	    // InternalDraft7.g:958:4: ({...}? => ( ({...}? => (otherlv_89= '\"$id\"' otherlv_90= ':' ( (lv_id_91_0= ruleAnyString ) ) (otherlv_92= ',' )? ) ) ) )
            	    {
            	    // InternalDraft7.g:958:4: ({...}? => ( ({...}? => (otherlv_89= '\"$id\"' otherlv_90= ':' ( (lv_id_91_0= ruleAnyString ) ) (otherlv_92= ',' )? ) ) ) )
            	    // InternalDraft7.g:959:5: {...}? => ( ({...}? => (otherlv_89= '\"$id\"' otherlv_90= ':' ( (lv_id_91_0= ruleAnyString ) ) (otherlv_92= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 16) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 16)");
            	    }
            	    // InternalDraft7.g:959:104: ( ({...}? => (otherlv_89= '\"$id\"' otherlv_90= ':' ( (lv_id_91_0= ruleAnyString ) ) (otherlv_92= ',' )? ) ) )
            	    // InternalDraft7.g:960:6: ({...}? => (otherlv_89= '\"$id\"' otherlv_90= ':' ( (lv_id_91_0= ruleAnyString ) ) (otherlv_92= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 16);
            	    					
            	    // InternalDraft7.g:963:9: ({...}? => (otherlv_89= '\"$id\"' otherlv_90= ':' ( (lv_id_91_0= ruleAnyString ) ) (otherlv_92= ',' )? ) )
            	    // InternalDraft7.g:963:10: {...}? => (otherlv_89= '\"$id\"' otherlv_90= ':' ( (lv_id_91_0= ruleAnyString ) ) (otherlv_92= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalDraft7.g:963:19: (otherlv_89= '\"$id\"' otherlv_90= ':' ( (lv_id_91_0= ruleAnyString ) ) (otherlv_92= ',' )? )
            	    // InternalDraft7.g:963:20: otherlv_89= '\"$id\"' otherlv_90= ':' ( (lv_id_91_0= ruleAnyString ) ) (otherlv_92= ',' )?
            	    {
            	    otherlv_89=(Token)match(input,34,FOLLOW_4); 

            	    									newLeafNode(otherlv_89, grammarAccess.getSchemaAccess().getIdKeyword_2_16_0());
            	    								
            	    otherlv_90=(Token)match(input,13,FOLLOW_8); 

            	    									newLeafNode(otherlv_90, grammarAccess.getSchemaAccess().getColonKeyword_2_16_1());
            	    								
            	    // InternalDraft7.g:971:9: ( (lv_id_91_0= ruleAnyString ) )
            	    // InternalDraft7.g:972:10: (lv_id_91_0= ruleAnyString )
            	    {
            	    // InternalDraft7.g:972:10: (lv_id_91_0= ruleAnyString )
            	    // InternalDraft7.g:973:11: lv_id_91_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getSchemaAccess().getIdAnyStringParserRuleCall_2_16_2_0());
            	    										
            	    pushFollow(FOLLOW_6);
            	    lv_id_91_0=ruleAnyString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    											}
            	    											set(
            	    												current,
            	    												"id",
            	    												lv_id_91_0,
            	    												"org.xtext.json.schema.Draft7.AnyString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalDraft7.g:990:9: (otherlv_92= ',' )?
            	    int alt22=2;
            	    int LA22_0 = input.LA(1);

            	    if ( (LA22_0==14) ) {
            	        alt22=1;
            	    }
            	    switch (alt22) {
            	        case 1 :
            	            // InternalDraft7.g:991:10: otherlv_92= ','
            	            {
            	            otherlv_92=(Token)match(input,14,FOLLOW_3); 

            	            										newLeafNode(otherlv_92, grammarAccess.getSchemaAccess().getCommaKeyword_2_16_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSchemaAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 18 :
            	    // InternalDraft7.g:1002:4: ({...}? => ( ({...}? => (otherlv_93= '\"if\"' otherlv_94= ':' ( (lv_ifSchema_95_0= ruleSchema ) ) (otherlv_96= ',' )? ) ) ) )
            	    {
            	    // InternalDraft7.g:1002:4: ({...}? => ( ({...}? => (otherlv_93= '\"if\"' otherlv_94= ':' ( (lv_ifSchema_95_0= ruleSchema ) ) (otherlv_96= ',' )? ) ) ) )
            	    // InternalDraft7.g:1003:5: {...}? => ( ({...}? => (otherlv_93= '\"if\"' otherlv_94= ':' ( (lv_ifSchema_95_0= ruleSchema ) ) (otherlv_96= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 17) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 17)");
            	    }
            	    // InternalDraft7.g:1003:104: ( ({...}? => (otherlv_93= '\"if\"' otherlv_94= ':' ( (lv_ifSchema_95_0= ruleSchema ) ) (otherlv_96= ',' )? ) ) )
            	    // InternalDraft7.g:1004:6: ({...}? => (otherlv_93= '\"if\"' otherlv_94= ':' ( (lv_ifSchema_95_0= ruleSchema ) ) (otherlv_96= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 17);
            	    					
            	    // InternalDraft7.g:1007:9: ({...}? => (otherlv_93= '\"if\"' otherlv_94= ':' ( (lv_ifSchema_95_0= ruleSchema ) ) (otherlv_96= ',' )? ) )
            	    // InternalDraft7.g:1007:10: {...}? => (otherlv_93= '\"if\"' otherlv_94= ':' ( (lv_ifSchema_95_0= ruleSchema ) ) (otherlv_96= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalDraft7.g:1007:19: (otherlv_93= '\"if\"' otherlv_94= ':' ( (lv_ifSchema_95_0= ruleSchema ) ) (otherlv_96= ',' )? )
            	    // InternalDraft7.g:1007:20: otherlv_93= '\"if\"' otherlv_94= ':' ( (lv_ifSchema_95_0= ruleSchema ) ) (otherlv_96= ',' )?
            	    {
            	    otherlv_93=(Token)match(input,35,FOLLOW_4); 

            	    									newLeafNode(otherlv_93, grammarAccess.getSchemaAccess().getIfKeyword_2_17_0());
            	    								
            	    otherlv_94=(Token)match(input,13,FOLLOW_10); 

            	    									newLeafNode(otherlv_94, grammarAccess.getSchemaAccess().getColonKeyword_2_17_1());
            	    								
            	    // InternalDraft7.g:1015:9: ( (lv_ifSchema_95_0= ruleSchema ) )
            	    // InternalDraft7.g:1016:10: (lv_ifSchema_95_0= ruleSchema )
            	    {
            	    // InternalDraft7.g:1016:10: (lv_ifSchema_95_0= ruleSchema )
            	    // InternalDraft7.g:1017:11: lv_ifSchema_95_0= ruleSchema
            	    {

            	    											newCompositeNode(grammarAccess.getSchemaAccess().getIfSchemaSchemaParserRuleCall_2_17_2_0());
            	    										
            	    pushFollow(FOLLOW_6);
            	    lv_ifSchema_95_0=ruleSchema();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    											}
            	    											set(
            	    												current,
            	    												"ifSchema",
            	    												lv_ifSchema_95_0,
            	    												"org.xtext.json.schema.Draft7.Schema");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalDraft7.g:1034:9: (otherlv_96= ',' )?
            	    int alt23=2;
            	    int LA23_0 = input.LA(1);

            	    if ( (LA23_0==14) ) {
            	        alt23=1;
            	    }
            	    switch (alt23) {
            	        case 1 :
            	            // InternalDraft7.g:1035:10: otherlv_96= ','
            	            {
            	            otherlv_96=(Token)match(input,14,FOLLOW_3); 

            	            										newLeafNode(otherlv_96, grammarAccess.getSchemaAccess().getCommaKeyword_2_17_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSchemaAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 19 :
            	    // InternalDraft7.g:1046:4: ({...}? => ( ({...}? => (otherlv_97= '\"then\"' otherlv_98= ':' ( (lv_thenSchema_99_0= ruleSchema ) ) (otherlv_100= ',' )? ) ) ) )
            	    {
            	    // InternalDraft7.g:1046:4: ({...}? => ( ({...}? => (otherlv_97= '\"then\"' otherlv_98= ':' ( (lv_thenSchema_99_0= ruleSchema ) ) (otherlv_100= ',' )? ) ) ) )
            	    // InternalDraft7.g:1047:5: {...}? => ( ({...}? => (otherlv_97= '\"then\"' otherlv_98= ':' ( (lv_thenSchema_99_0= ruleSchema ) ) (otherlv_100= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 18) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 18)");
            	    }
            	    // InternalDraft7.g:1047:104: ( ({...}? => (otherlv_97= '\"then\"' otherlv_98= ':' ( (lv_thenSchema_99_0= ruleSchema ) ) (otherlv_100= ',' )? ) ) )
            	    // InternalDraft7.g:1048:6: ({...}? => (otherlv_97= '\"then\"' otherlv_98= ':' ( (lv_thenSchema_99_0= ruleSchema ) ) (otherlv_100= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 18);
            	    					
            	    // InternalDraft7.g:1051:9: ({...}? => (otherlv_97= '\"then\"' otherlv_98= ':' ( (lv_thenSchema_99_0= ruleSchema ) ) (otherlv_100= ',' )? ) )
            	    // InternalDraft7.g:1051:10: {...}? => (otherlv_97= '\"then\"' otherlv_98= ':' ( (lv_thenSchema_99_0= ruleSchema ) ) (otherlv_100= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalDraft7.g:1051:19: (otherlv_97= '\"then\"' otherlv_98= ':' ( (lv_thenSchema_99_0= ruleSchema ) ) (otherlv_100= ',' )? )
            	    // InternalDraft7.g:1051:20: otherlv_97= '\"then\"' otherlv_98= ':' ( (lv_thenSchema_99_0= ruleSchema ) ) (otherlv_100= ',' )?
            	    {
            	    otherlv_97=(Token)match(input,36,FOLLOW_4); 

            	    									newLeafNode(otherlv_97, grammarAccess.getSchemaAccess().getThenKeyword_2_18_0());
            	    								
            	    otherlv_98=(Token)match(input,13,FOLLOW_10); 

            	    									newLeafNode(otherlv_98, grammarAccess.getSchemaAccess().getColonKeyword_2_18_1());
            	    								
            	    // InternalDraft7.g:1059:9: ( (lv_thenSchema_99_0= ruleSchema ) )
            	    // InternalDraft7.g:1060:10: (lv_thenSchema_99_0= ruleSchema )
            	    {
            	    // InternalDraft7.g:1060:10: (lv_thenSchema_99_0= ruleSchema )
            	    // InternalDraft7.g:1061:11: lv_thenSchema_99_0= ruleSchema
            	    {

            	    											newCompositeNode(grammarAccess.getSchemaAccess().getThenSchemaSchemaParserRuleCall_2_18_2_0());
            	    										
            	    pushFollow(FOLLOW_6);
            	    lv_thenSchema_99_0=ruleSchema();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    											}
            	    											set(
            	    												current,
            	    												"thenSchema",
            	    												lv_thenSchema_99_0,
            	    												"org.xtext.json.schema.Draft7.Schema");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalDraft7.g:1078:9: (otherlv_100= ',' )?
            	    int alt24=2;
            	    int LA24_0 = input.LA(1);

            	    if ( (LA24_0==14) ) {
            	        alt24=1;
            	    }
            	    switch (alt24) {
            	        case 1 :
            	            // InternalDraft7.g:1079:10: otherlv_100= ','
            	            {
            	            otherlv_100=(Token)match(input,14,FOLLOW_3); 

            	            										newLeafNode(otherlv_100, grammarAccess.getSchemaAccess().getCommaKeyword_2_18_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSchemaAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 20 :
            	    // InternalDraft7.g:1090:4: ({...}? => ( ({...}? => (otherlv_101= '\"else\"' otherlv_102= ':' ( (lv_elseSchema_103_0= ruleSchema ) ) (otherlv_104= ',' )? ) ) ) )
            	    {
            	    // InternalDraft7.g:1090:4: ({...}? => ( ({...}? => (otherlv_101= '\"else\"' otherlv_102= ':' ( (lv_elseSchema_103_0= ruleSchema ) ) (otherlv_104= ',' )? ) ) ) )
            	    // InternalDraft7.g:1091:5: {...}? => ( ({...}? => (otherlv_101= '\"else\"' otherlv_102= ':' ( (lv_elseSchema_103_0= ruleSchema ) ) (otherlv_104= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 19) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 19)");
            	    }
            	    // InternalDraft7.g:1091:104: ( ({...}? => (otherlv_101= '\"else\"' otherlv_102= ':' ( (lv_elseSchema_103_0= ruleSchema ) ) (otherlv_104= ',' )? ) ) )
            	    // InternalDraft7.g:1092:6: ({...}? => (otherlv_101= '\"else\"' otherlv_102= ':' ( (lv_elseSchema_103_0= ruleSchema ) ) (otherlv_104= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 19);
            	    					
            	    // InternalDraft7.g:1095:9: ({...}? => (otherlv_101= '\"else\"' otherlv_102= ':' ( (lv_elseSchema_103_0= ruleSchema ) ) (otherlv_104= ',' )? ) )
            	    // InternalDraft7.g:1095:10: {...}? => (otherlv_101= '\"else\"' otherlv_102= ':' ( (lv_elseSchema_103_0= ruleSchema ) ) (otherlv_104= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalDraft7.g:1095:19: (otherlv_101= '\"else\"' otherlv_102= ':' ( (lv_elseSchema_103_0= ruleSchema ) ) (otherlv_104= ',' )? )
            	    // InternalDraft7.g:1095:20: otherlv_101= '\"else\"' otherlv_102= ':' ( (lv_elseSchema_103_0= ruleSchema ) ) (otherlv_104= ',' )?
            	    {
            	    otherlv_101=(Token)match(input,37,FOLLOW_4); 

            	    									newLeafNode(otherlv_101, grammarAccess.getSchemaAccess().getElseKeyword_2_19_0());
            	    								
            	    otherlv_102=(Token)match(input,13,FOLLOW_10); 

            	    									newLeafNode(otherlv_102, grammarAccess.getSchemaAccess().getColonKeyword_2_19_1());
            	    								
            	    // InternalDraft7.g:1103:9: ( (lv_elseSchema_103_0= ruleSchema ) )
            	    // InternalDraft7.g:1104:10: (lv_elseSchema_103_0= ruleSchema )
            	    {
            	    // InternalDraft7.g:1104:10: (lv_elseSchema_103_0= ruleSchema )
            	    // InternalDraft7.g:1105:11: lv_elseSchema_103_0= ruleSchema
            	    {

            	    											newCompositeNode(grammarAccess.getSchemaAccess().getElseSchemaSchemaParserRuleCall_2_19_2_0());
            	    										
            	    pushFollow(FOLLOW_6);
            	    lv_elseSchema_103_0=ruleSchema();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    											}
            	    											set(
            	    												current,
            	    												"elseSchema",
            	    												lv_elseSchema_103_0,
            	    												"org.xtext.json.schema.Draft7.Schema");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalDraft7.g:1122:9: (otherlv_104= ',' )?
            	    int alt25=2;
            	    int LA25_0 = input.LA(1);

            	    if ( (LA25_0==14) ) {
            	        alt25=1;
            	    }
            	    switch (alt25) {
            	        case 1 :
            	            // InternalDraft7.g:1123:10: otherlv_104= ','
            	            {
            	            otherlv_104=(Token)match(input,14,FOLLOW_3); 

            	            										newLeafNode(otherlv_104, grammarAccess.getSchemaAccess().getCommaKeyword_2_19_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSchemaAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 21 :
            	    // InternalDraft7.g:1134:4: ({...}? => ( ({...}? => (otherlv_105= '\"enum\"' otherlv_106= ':' otherlv_107= '[' ( (lv_enumValues_108_0= ruleAnyString ) ) (otherlv_109= ',' ( (lv_enumValues_110_0= ruleAnyString ) ) )* otherlv_111= ']' (otherlv_112= ',' )? ) ) ) )
            	    {
            	    // InternalDraft7.g:1134:4: ({...}? => ( ({...}? => (otherlv_105= '\"enum\"' otherlv_106= ':' otherlv_107= '[' ( (lv_enumValues_108_0= ruleAnyString ) ) (otherlv_109= ',' ( (lv_enumValues_110_0= ruleAnyString ) ) )* otherlv_111= ']' (otherlv_112= ',' )? ) ) ) )
            	    // InternalDraft7.g:1135:5: {...}? => ( ({...}? => (otherlv_105= '\"enum\"' otherlv_106= ':' otherlv_107= '[' ( (lv_enumValues_108_0= ruleAnyString ) ) (otherlv_109= ',' ( (lv_enumValues_110_0= ruleAnyString ) ) )* otherlv_111= ']' (otherlv_112= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20)");
            	    }
            	    // InternalDraft7.g:1135:104: ( ({...}? => (otherlv_105= '\"enum\"' otherlv_106= ':' otherlv_107= '[' ( (lv_enumValues_108_0= ruleAnyString ) ) (otherlv_109= ',' ( (lv_enumValues_110_0= ruleAnyString ) ) )* otherlv_111= ']' (otherlv_112= ',' )? ) ) )
            	    // InternalDraft7.g:1136:6: ({...}? => (otherlv_105= '\"enum\"' otherlv_106= ':' otherlv_107= '[' ( (lv_enumValues_108_0= ruleAnyString ) ) (otherlv_109= ',' ( (lv_enumValues_110_0= ruleAnyString ) ) )* otherlv_111= ']' (otherlv_112= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20);
            	    					
            	    // InternalDraft7.g:1139:9: ({...}? => (otherlv_105= '\"enum\"' otherlv_106= ':' otherlv_107= '[' ( (lv_enumValues_108_0= ruleAnyString ) ) (otherlv_109= ',' ( (lv_enumValues_110_0= ruleAnyString ) ) )* otherlv_111= ']' (otherlv_112= ',' )? ) )
            	    // InternalDraft7.g:1139:10: {...}? => (otherlv_105= '\"enum\"' otherlv_106= ':' otherlv_107= '[' ( (lv_enumValues_108_0= ruleAnyString ) ) (otherlv_109= ',' ( (lv_enumValues_110_0= ruleAnyString ) ) )* otherlv_111= ']' (otherlv_112= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalDraft7.g:1139:19: (otherlv_105= '\"enum\"' otherlv_106= ':' otherlv_107= '[' ( (lv_enumValues_108_0= ruleAnyString ) ) (otherlv_109= ',' ( (lv_enumValues_110_0= ruleAnyString ) ) )* otherlv_111= ']' (otherlv_112= ',' )? )
            	    // InternalDraft7.g:1139:20: otherlv_105= '\"enum\"' otherlv_106= ':' otherlv_107= '[' ( (lv_enumValues_108_0= ruleAnyString ) ) (otherlv_109= ',' ( (lv_enumValues_110_0= ruleAnyString ) ) )* otherlv_111= ']' (otherlv_112= ',' )?
            	    {
            	    otherlv_105=(Token)match(input,31,FOLLOW_4); 

            	    									newLeafNode(otherlv_105, grammarAccess.getSchemaAccess().getEnumKeyword_2_20_0());
            	    								
            	    otherlv_106=(Token)match(input,13,FOLLOW_16); 

            	    									newLeafNode(otherlv_106, grammarAccess.getSchemaAccess().getColonKeyword_2_20_1());
            	    								
            	    otherlv_107=(Token)match(input,27,FOLLOW_8); 

            	    									newLeafNode(otherlv_107, grammarAccess.getSchemaAccess().getLeftSquareBracketKeyword_2_20_2());
            	    								
            	    // InternalDraft7.g:1151:9: ( (lv_enumValues_108_0= ruleAnyString ) )
            	    // InternalDraft7.g:1152:10: (lv_enumValues_108_0= ruleAnyString )
            	    {
            	    // InternalDraft7.g:1152:10: (lv_enumValues_108_0= ruleAnyString )
            	    // InternalDraft7.g:1153:11: lv_enumValues_108_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getSchemaAccess().getEnumValuesAnyStringParserRuleCall_2_20_3_0());
            	    										
            	    pushFollow(FOLLOW_17);
            	    lv_enumValues_108_0=ruleAnyString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    											}
            	    											add(
            	    												current,
            	    												"enumValues",
            	    												lv_enumValues_108_0,
            	    												"org.xtext.json.schema.Draft7.AnyString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalDraft7.g:1170:9: (otherlv_109= ',' ( (lv_enumValues_110_0= ruleAnyString ) ) )*
            	    loop26:
            	    do {
            	        int alt26=2;
            	        int LA26_0 = input.LA(1);

            	        if ( (LA26_0==14) ) {
            	            alt26=1;
            	        }


            	        switch (alt26) {
            	    	case 1 :
            	    	    // InternalDraft7.g:1171:10: otherlv_109= ',' ( (lv_enumValues_110_0= ruleAnyString ) )
            	    	    {
            	    	    otherlv_109=(Token)match(input,14,FOLLOW_8); 

            	    	    										newLeafNode(otherlv_109, grammarAccess.getSchemaAccess().getCommaKeyword_2_20_4_0());
            	    	    									
            	    	    // InternalDraft7.g:1175:10: ( (lv_enumValues_110_0= ruleAnyString ) )
            	    	    // InternalDraft7.g:1176:11: (lv_enumValues_110_0= ruleAnyString )
            	    	    {
            	    	    // InternalDraft7.g:1176:11: (lv_enumValues_110_0= ruleAnyString )
            	    	    // InternalDraft7.g:1177:12: lv_enumValues_110_0= ruleAnyString
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getSchemaAccess().getEnumValuesAnyStringParserRuleCall_2_20_4_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_17);
            	    	    lv_enumValues_110_0=ruleAnyString();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"enumValues",
            	    	    													lv_enumValues_110_0,
            	    	    													"org.xtext.json.schema.Draft7.AnyString");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop26;
            	        }
            	    } while (true);

            	    otherlv_111=(Token)match(input,28,FOLLOW_6); 

            	    									newLeafNode(otherlv_111, grammarAccess.getSchemaAccess().getRightSquareBracketKeyword_2_20_5());
            	    								
            	    // InternalDraft7.g:1199:9: (otherlv_112= ',' )?
            	    int alt27=2;
            	    int LA27_0 = input.LA(1);

            	    if ( (LA27_0==14) ) {
            	        alt27=1;
            	    }
            	    switch (alt27) {
            	        case 1 :
            	            // InternalDraft7.g:1200:10: otherlv_112= ','
            	            {
            	            otherlv_112=(Token)match(input,14,FOLLOW_3); 

            	            										newLeafNode(otherlv_112, grammarAccess.getSchemaAccess().getCommaKeyword_2_20_6());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSchemaAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 22 :
            	    // InternalDraft7.g:1211:4: ({...}? => ( ({...}? => (otherlv_113= '\"const\"' otherlv_114= ':' ( ( (lv_const_115_0= ruleAnyString ) ) | ( (lv_constBoolean_116_0= ruleBoolean ) ) ) (otherlv_117= ',' )? ) ) ) )
            	    {
            	    // InternalDraft7.g:1211:4: ({...}? => ( ({...}? => (otherlv_113= '\"const\"' otherlv_114= ':' ( ( (lv_const_115_0= ruleAnyString ) ) | ( (lv_constBoolean_116_0= ruleBoolean ) ) ) (otherlv_117= ',' )? ) ) ) )
            	    // InternalDraft7.g:1212:5: {...}? => ( ({...}? => (otherlv_113= '\"const\"' otherlv_114= ':' ( ( (lv_const_115_0= ruleAnyString ) ) | ( (lv_constBoolean_116_0= ruleBoolean ) ) ) (otherlv_117= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 21) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 21)");
            	    }
            	    // InternalDraft7.g:1212:104: ( ({...}? => (otherlv_113= '\"const\"' otherlv_114= ':' ( ( (lv_const_115_0= ruleAnyString ) ) | ( (lv_constBoolean_116_0= ruleBoolean ) ) ) (otherlv_117= ',' )? ) ) )
            	    // InternalDraft7.g:1213:6: ({...}? => (otherlv_113= '\"const\"' otherlv_114= ':' ( ( (lv_const_115_0= ruleAnyString ) ) | ( (lv_constBoolean_116_0= ruleBoolean ) ) ) (otherlv_117= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 21);
            	    					
            	    // InternalDraft7.g:1216:9: ({...}? => (otherlv_113= '\"const\"' otherlv_114= ':' ( ( (lv_const_115_0= ruleAnyString ) ) | ( (lv_constBoolean_116_0= ruleBoolean ) ) ) (otherlv_117= ',' )? ) )
            	    // InternalDraft7.g:1216:10: {...}? => (otherlv_113= '\"const\"' otherlv_114= ':' ( ( (lv_const_115_0= ruleAnyString ) ) | ( (lv_constBoolean_116_0= ruleBoolean ) ) ) (otherlv_117= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalDraft7.g:1216:19: (otherlv_113= '\"const\"' otherlv_114= ':' ( ( (lv_const_115_0= ruleAnyString ) ) | ( (lv_constBoolean_116_0= ruleBoolean ) ) ) (otherlv_117= ',' )? )
            	    // InternalDraft7.g:1216:20: otherlv_113= '\"const\"' otherlv_114= ':' ( ( (lv_const_115_0= ruleAnyString ) ) | ( (lv_constBoolean_116_0= ruleBoolean ) ) ) (otherlv_117= ',' )?
            	    {
            	    otherlv_113=(Token)match(input,38,FOLLOW_4); 

            	    									newLeafNode(otherlv_113, grammarAccess.getSchemaAccess().getConstKeyword_2_21_0());
            	    								
            	    otherlv_114=(Token)match(input,13,FOLLOW_19); 

            	    									newLeafNode(otherlv_114, grammarAccess.getSchemaAccess().getColonKeyword_2_21_1());
            	    								
            	    // InternalDraft7.g:1224:9: ( ( (lv_const_115_0= ruleAnyString ) ) | ( (lv_constBoolean_116_0= ruleBoolean ) ) )
            	    int alt28=2;
            	    int LA28_0 = input.LA(1);

            	    if ( (LA28_0==RULE_STRING||LA28_0==12||LA28_0==15||(LA28_0>=17 && LA28_0<=26)||(LA28_0>=29 && LA28_0<=60)||(LA28_0>=64 && LA28_0<=88)) ) {
            	        alt28=1;
            	    }
            	    else if ( ((LA28_0>=62 && LA28_0<=63)) ) {
            	        alt28=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 28, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt28) {
            	        case 1 :
            	            // InternalDraft7.g:1225:10: ( (lv_const_115_0= ruleAnyString ) )
            	            {
            	            // InternalDraft7.g:1225:10: ( (lv_const_115_0= ruleAnyString ) )
            	            // InternalDraft7.g:1226:11: (lv_const_115_0= ruleAnyString )
            	            {
            	            // InternalDraft7.g:1226:11: (lv_const_115_0= ruleAnyString )
            	            // InternalDraft7.g:1227:12: lv_const_115_0= ruleAnyString
            	            {

            	            												newCompositeNode(grammarAccess.getSchemaAccess().getConstAnyStringParserRuleCall_2_21_2_0_0());
            	            											
            	            pushFollow(FOLLOW_6);
            	            lv_const_115_0=ruleAnyString();

            	            state._fsp--;


            	            												if (current==null) {
            	            													current = createModelElementForParent(grammarAccess.getSchemaRule());
            	            												}
            	            												set(
            	            													current,
            	            													"const",
            	            													lv_const_115_0,
            	            													"org.xtext.json.schema.Draft7.AnyString");
            	            												afterParserOrEnumRuleCall();
            	            											

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalDraft7.g:1245:10: ( (lv_constBoolean_116_0= ruleBoolean ) )
            	            {
            	            // InternalDraft7.g:1245:10: ( (lv_constBoolean_116_0= ruleBoolean ) )
            	            // InternalDraft7.g:1246:11: (lv_constBoolean_116_0= ruleBoolean )
            	            {
            	            // InternalDraft7.g:1246:11: (lv_constBoolean_116_0= ruleBoolean )
            	            // InternalDraft7.g:1247:12: lv_constBoolean_116_0= ruleBoolean
            	            {

            	            												newCompositeNode(grammarAccess.getSchemaAccess().getConstBooleanBooleanEnumRuleCall_2_21_2_1_0());
            	            											
            	            pushFollow(FOLLOW_6);
            	            lv_constBoolean_116_0=ruleBoolean();

            	            state._fsp--;


            	            												if (current==null) {
            	            													current = createModelElementForParent(grammarAccess.getSchemaRule());
            	            												}
            	            												set(
            	            													current,
            	            													"constBoolean",
            	            													lv_constBoolean_116_0,
            	            													"org.xtext.json.schema.Draft7.Boolean");
            	            												afterParserOrEnumRuleCall();
            	            											

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalDraft7.g:1265:9: (otherlv_117= ',' )?
            	    int alt29=2;
            	    int LA29_0 = input.LA(1);

            	    if ( (LA29_0==14) ) {
            	        alt29=1;
            	    }
            	    switch (alt29) {
            	        case 1 :
            	            // InternalDraft7.g:1266:10: otherlv_117= ','
            	            {
            	            otherlv_117=(Token)match(input,14,FOLLOW_3); 

            	            										newLeafNode(otherlv_117, grammarAccess.getSchemaAccess().getCommaKeyword_2_21_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSchemaAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 23 :
            	    // InternalDraft7.g:1277:4: ({...}? => ( ({...}? => (otherlv_118= '\"anyOf\"' otherlv_119= ':' otherlv_120= '[' ( (lv_anyOfs_121_0= ruleAbstractSchema ) ) (otherlv_122= ',' ( (lv_anyOfs_123_0= ruleAbstractSchema ) ) )* otherlv_124= ']' (otherlv_125= ',' )? ) ) ) )
            	    {
            	    // InternalDraft7.g:1277:4: ({...}? => ( ({...}? => (otherlv_118= '\"anyOf\"' otherlv_119= ':' otherlv_120= '[' ( (lv_anyOfs_121_0= ruleAbstractSchema ) ) (otherlv_122= ',' ( (lv_anyOfs_123_0= ruleAbstractSchema ) ) )* otherlv_124= ']' (otherlv_125= ',' )? ) ) ) )
            	    // InternalDraft7.g:1278:5: {...}? => ( ({...}? => (otherlv_118= '\"anyOf\"' otherlv_119= ':' otherlv_120= '[' ( (lv_anyOfs_121_0= ruleAbstractSchema ) ) (otherlv_122= ',' ( (lv_anyOfs_123_0= ruleAbstractSchema ) ) )* otherlv_124= ']' (otherlv_125= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 22) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 22)");
            	    }
            	    // InternalDraft7.g:1278:104: ( ({...}? => (otherlv_118= '\"anyOf\"' otherlv_119= ':' otherlv_120= '[' ( (lv_anyOfs_121_0= ruleAbstractSchema ) ) (otherlv_122= ',' ( (lv_anyOfs_123_0= ruleAbstractSchema ) ) )* otherlv_124= ']' (otherlv_125= ',' )? ) ) )
            	    // InternalDraft7.g:1279:6: ({...}? => (otherlv_118= '\"anyOf\"' otherlv_119= ':' otherlv_120= '[' ( (lv_anyOfs_121_0= ruleAbstractSchema ) ) (otherlv_122= ',' ( (lv_anyOfs_123_0= ruleAbstractSchema ) ) )* otherlv_124= ']' (otherlv_125= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 22);
            	    					
            	    // InternalDraft7.g:1282:9: ({...}? => (otherlv_118= '\"anyOf\"' otherlv_119= ':' otherlv_120= '[' ( (lv_anyOfs_121_0= ruleAbstractSchema ) ) (otherlv_122= ',' ( (lv_anyOfs_123_0= ruleAbstractSchema ) ) )* otherlv_124= ']' (otherlv_125= ',' )? ) )
            	    // InternalDraft7.g:1282:10: {...}? => (otherlv_118= '\"anyOf\"' otherlv_119= ':' otherlv_120= '[' ( (lv_anyOfs_121_0= ruleAbstractSchema ) ) (otherlv_122= ',' ( (lv_anyOfs_123_0= ruleAbstractSchema ) ) )* otherlv_124= ']' (otherlv_125= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalDraft7.g:1282:19: (otherlv_118= '\"anyOf\"' otherlv_119= ':' otherlv_120= '[' ( (lv_anyOfs_121_0= ruleAbstractSchema ) ) (otherlv_122= ',' ( (lv_anyOfs_123_0= ruleAbstractSchema ) ) )* otherlv_124= ']' (otherlv_125= ',' )? )
            	    // InternalDraft7.g:1282:20: otherlv_118= '\"anyOf\"' otherlv_119= ':' otherlv_120= '[' ( (lv_anyOfs_121_0= ruleAbstractSchema ) ) (otherlv_122= ',' ( (lv_anyOfs_123_0= ruleAbstractSchema ) ) )* otherlv_124= ']' (otherlv_125= ',' )?
            	    {
            	    otherlv_118=(Token)match(input,39,FOLLOW_4); 

            	    									newLeafNode(otherlv_118, grammarAccess.getSchemaAccess().getAnyOfKeyword_2_22_0());
            	    								
            	    otherlv_119=(Token)match(input,13,FOLLOW_16); 

            	    									newLeafNode(otherlv_119, grammarAccess.getSchemaAccess().getColonKeyword_2_22_1());
            	    								
            	    otherlv_120=(Token)match(input,27,FOLLOW_10); 

            	    									newLeafNode(otherlv_120, grammarAccess.getSchemaAccess().getLeftSquareBracketKeyword_2_22_2());
            	    								
            	    // InternalDraft7.g:1294:9: ( (lv_anyOfs_121_0= ruleAbstractSchema ) )
            	    // InternalDraft7.g:1295:10: (lv_anyOfs_121_0= ruleAbstractSchema )
            	    {
            	    // InternalDraft7.g:1295:10: (lv_anyOfs_121_0= ruleAbstractSchema )
            	    // InternalDraft7.g:1296:11: lv_anyOfs_121_0= ruleAbstractSchema
            	    {

            	    											newCompositeNode(grammarAccess.getSchemaAccess().getAnyOfsAbstractSchemaParserRuleCall_2_22_3_0());
            	    										
            	    pushFollow(FOLLOW_17);
            	    lv_anyOfs_121_0=ruleAbstractSchema();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    											}
            	    											add(
            	    												current,
            	    												"anyOfs",
            	    												lv_anyOfs_121_0,
            	    												"org.xtext.json.schema.Draft7.AbstractSchema");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalDraft7.g:1313:9: (otherlv_122= ',' ( (lv_anyOfs_123_0= ruleAbstractSchema ) ) )*
            	    loop30:
            	    do {
            	        int alt30=2;
            	        int LA30_0 = input.LA(1);

            	        if ( (LA30_0==14) ) {
            	            alt30=1;
            	        }


            	        switch (alt30) {
            	    	case 1 :
            	    	    // InternalDraft7.g:1314:10: otherlv_122= ',' ( (lv_anyOfs_123_0= ruleAbstractSchema ) )
            	    	    {
            	    	    otherlv_122=(Token)match(input,14,FOLLOW_10); 

            	    	    										newLeafNode(otherlv_122, grammarAccess.getSchemaAccess().getCommaKeyword_2_22_4_0());
            	    	    									
            	    	    // InternalDraft7.g:1318:10: ( (lv_anyOfs_123_0= ruleAbstractSchema ) )
            	    	    // InternalDraft7.g:1319:11: (lv_anyOfs_123_0= ruleAbstractSchema )
            	    	    {
            	    	    // InternalDraft7.g:1319:11: (lv_anyOfs_123_0= ruleAbstractSchema )
            	    	    // InternalDraft7.g:1320:12: lv_anyOfs_123_0= ruleAbstractSchema
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getSchemaAccess().getAnyOfsAbstractSchemaParserRuleCall_2_22_4_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_17);
            	    	    lv_anyOfs_123_0=ruleAbstractSchema();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"anyOfs",
            	    	    													lv_anyOfs_123_0,
            	    	    													"org.xtext.json.schema.Draft7.AbstractSchema");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop30;
            	        }
            	    } while (true);

            	    otherlv_124=(Token)match(input,28,FOLLOW_6); 

            	    									newLeafNode(otherlv_124, grammarAccess.getSchemaAccess().getRightSquareBracketKeyword_2_22_5());
            	    								
            	    // InternalDraft7.g:1342:9: (otherlv_125= ',' )?
            	    int alt31=2;
            	    int LA31_0 = input.LA(1);

            	    if ( (LA31_0==14) ) {
            	        alt31=1;
            	    }
            	    switch (alt31) {
            	        case 1 :
            	            // InternalDraft7.g:1343:10: otherlv_125= ','
            	            {
            	            otherlv_125=(Token)match(input,14,FOLLOW_3); 

            	            										newLeafNode(otherlv_125, grammarAccess.getSchemaAccess().getCommaKeyword_2_22_6());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSchemaAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 24 :
            	    // InternalDraft7.g:1354:4: ({...}? => ( ({...}? => (otherlv_126= '\"oneOf\"' otherlv_127= ':' otherlv_128= '[' ( (lv_oneOfs_129_0= ruleAbstractSchema ) ) (otherlv_130= ',' ( (lv_oneOfs_131_0= ruleAbstractSchema ) ) )* otherlv_132= ']' (otherlv_133= ',' )? ) ) ) )
            	    {
            	    // InternalDraft7.g:1354:4: ({...}? => ( ({...}? => (otherlv_126= '\"oneOf\"' otherlv_127= ':' otherlv_128= '[' ( (lv_oneOfs_129_0= ruleAbstractSchema ) ) (otherlv_130= ',' ( (lv_oneOfs_131_0= ruleAbstractSchema ) ) )* otherlv_132= ']' (otherlv_133= ',' )? ) ) ) )
            	    // InternalDraft7.g:1355:5: {...}? => ( ({...}? => (otherlv_126= '\"oneOf\"' otherlv_127= ':' otherlv_128= '[' ( (lv_oneOfs_129_0= ruleAbstractSchema ) ) (otherlv_130= ',' ( (lv_oneOfs_131_0= ruleAbstractSchema ) ) )* otherlv_132= ']' (otherlv_133= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 23) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 23)");
            	    }
            	    // InternalDraft7.g:1355:104: ( ({...}? => (otherlv_126= '\"oneOf\"' otherlv_127= ':' otherlv_128= '[' ( (lv_oneOfs_129_0= ruleAbstractSchema ) ) (otherlv_130= ',' ( (lv_oneOfs_131_0= ruleAbstractSchema ) ) )* otherlv_132= ']' (otherlv_133= ',' )? ) ) )
            	    // InternalDraft7.g:1356:6: ({...}? => (otherlv_126= '\"oneOf\"' otherlv_127= ':' otherlv_128= '[' ( (lv_oneOfs_129_0= ruleAbstractSchema ) ) (otherlv_130= ',' ( (lv_oneOfs_131_0= ruleAbstractSchema ) ) )* otherlv_132= ']' (otherlv_133= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 23);
            	    					
            	    // InternalDraft7.g:1359:9: ({...}? => (otherlv_126= '\"oneOf\"' otherlv_127= ':' otherlv_128= '[' ( (lv_oneOfs_129_0= ruleAbstractSchema ) ) (otherlv_130= ',' ( (lv_oneOfs_131_0= ruleAbstractSchema ) ) )* otherlv_132= ']' (otherlv_133= ',' )? ) )
            	    // InternalDraft7.g:1359:10: {...}? => (otherlv_126= '\"oneOf\"' otherlv_127= ':' otherlv_128= '[' ( (lv_oneOfs_129_0= ruleAbstractSchema ) ) (otherlv_130= ',' ( (lv_oneOfs_131_0= ruleAbstractSchema ) ) )* otherlv_132= ']' (otherlv_133= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalDraft7.g:1359:19: (otherlv_126= '\"oneOf\"' otherlv_127= ':' otherlv_128= '[' ( (lv_oneOfs_129_0= ruleAbstractSchema ) ) (otherlv_130= ',' ( (lv_oneOfs_131_0= ruleAbstractSchema ) ) )* otherlv_132= ']' (otherlv_133= ',' )? )
            	    // InternalDraft7.g:1359:20: otherlv_126= '\"oneOf\"' otherlv_127= ':' otherlv_128= '[' ( (lv_oneOfs_129_0= ruleAbstractSchema ) ) (otherlv_130= ',' ( (lv_oneOfs_131_0= ruleAbstractSchema ) ) )* otherlv_132= ']' (otherlv_133= ',' )?
            	    {
            	    otherlv_126=(Token)match(input,40,FOLLOW_4); 

            	    									newLeafNode(otherlv_126, grammarAccess.getSchemaAccess().getOneOfKeyword_2_23_0());
            	    								
            	    otherlv_127=(Token)match(input,13,FOLLOW_16); 

            	    									newLeafNode(otherlv_127, grammarAccess.getSchemaAccess().getColonKeyword_2_23_1());
            	    								
            	    otherlv_128=(Token)match(input,27,FOLLOW_10); 

            	    									newLeafNode(otherlv_128, grammarAccess.getSchemaAccess().getLeftSquareBracketKeyword_2_23_2());
            	    								
            	    // InternalDraft7.g:1371:9: ( (lv_oneOfs_129_0= ruleAbstractSchema ) )
            	    // InternalDraft7.g:1372:10: (lv_oneOfs_129_0= ruleAbstractSchema )
            	    {
            	    // InternalDraft7.g:1372:10: (lv_oneOfs_129_0= ruleAbstractSchema )
            	    // InternalDraft7.g:1373:11: lv_oneOfs_129_0= ruleAbstractSchema
            	    {

            	    											newCompositeNode(grammarAccess.getSchemaAccess().getOneOfsAbstractSchemaParserRuleCall_2_23_3_0());
            	    										
            	    pushFollow(FOLLOW_17);
            	    lv_oneOfs_129_0=ruleAbstractSchema();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    											}
            	    											add(
            	    												current,
            	    												"oneOfs",
            	    												lv_oneOfs_129_0,
            	    												"org.xtext.json.schema.Draft7.AbstractSchema");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalDraft7.g:1390:9: (otherlv_130= ',' ( (lv_oneOfs_131_0= ruleAbstractSchema ) ) )*
            	    loop32:
            	    do {
            	        int alt32=2;
            	        int LA32_0 = input.LA(1);

            	        if ( (LA32_0==14) ) {
            	            alt32=1;
            	        }


            	        switch (alt32) {
            	    	case 1 :
            	    	    // InternalDraft7.g:1391:10: otherlv_130= ',' ( (lv_oneOfs_131_0= ruleAbstractSchema ) )
            	    	    {
            	    	    otherlv_130=(Token)match(input,14,FOLLOW_10); 

            	    	    										newLeafNode(otherlv_130, grammarAccess.getSchemaAccess().getCommaKeyword_2_23_4_0());
            	    	    									
            	    	    // InternalDraft7.g:1395:10: ( (lv_oneOfs_131_0= ruleAbstractSchema ) )
            	    	    // InternalDraft7.g:1396:11: (lv_oneOfs_131_0= ruleAbstractSchema )
            	    	    {
            	    	    // InternalDraft7.g:1396:11: (lv_oneOfs_131_0= ruleAbstractSchema )
            	    	    // InternalDraft7.g:1397:12: lv_oneOfs_131_0= ruleAbstractSchema
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getSchemaAccess().getOneOfsAbstractSchemaParserRuleCall_2_23_4_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_17);
            	    	    lv_oneOfs_131_0=ruleAbstractSchema();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"oneOfs",
            	    	    													lv_oneOfs_131_0,
            	    	    													"org.xtext.json.schema.Draft7.AbstractSchema");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop32;
            	        }
            	    } while (true);

            	    otherlv_132=(Token)match(input,28,FOLLOW_6); 

            	    									newLeafNode(otherlv_132, grammarAccess.getSchemaAccess().getRightSquareBracketKeyword_2_23_5());
            	    								
            	    // InternalDraft7.g:1419:9: (otherlv_133= ',' )?
            	    int alt33=2;
            	    int LA33_0 = input.LA(1);

            	    if ( (LA33_0==14) ) {
            	        alt33=1;
            	    }
            	    switch (alt33) {
            	        case 1 :
            	            // InternalDraft7.g:1420:10: otherlv_133= ','
            	            {
            	            otherlv_133=(Token)match(input,14,FOLLOW_3); 

            	            										newLeafNode(otherlv_133, grammarAccess.getSchemaAccess().getCommaKeyword_2_23_6());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSchemaAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 25 :
            	    // InternalDraft7.g:1431:4: ({...}? => ( ({...}? => (otherlv_134= '\"allOf\"' otherlv_135= ':' otherlv_136= '[' ( (lv_allOfs_137_0= ruleAbstractSchema ) ) (otherlv_138= ',' ( (lv_allOfs_139_0= ruleAbstractSchema ) ) )* otherlv_140= ']' (otherlv_141= ',' )? ) ) ) )
            	    {
            	    // InternalDraft7.g:1431:4: ({...}? => ( ({...}? => (otherlv_134= '\"allOf\"' otherlv_135= ':' otherlv_136= '[' ( (lv_allOfs_137_0= ruleAbstractSchema ) ) (otherlv_138= ',' ( (lv_allOfs_139_0= ruleAbstractSchema ) ) )* otherlv_140= ']' (otherlv_141= ',' )? ) ) ) )
            	    // InternalDraft7.g:1432:5: {...}? => ( ({...}? => (otherlv_134= '\"allOf\"' otherlv_135= ':' otherlv_136= '[' ( (lv_allOfs_137_0= ruleAbstractSchema ) ) (otherlv_138= ',' ( (lv_allOfs_139_0= ruleAbstractSchema ) ) )* otherlv_140= ']' (otherlv_141= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 24) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 24)");
            	    }
            	    // InternalDraft7.g:1432:104: ( ({...}? => (otherlv_134= '\"allOf\"' otherlv_135= ':' otherlv_136= '[' ( (lv_allOfs_137_0= ruleAbstractSchema ) ) (otherlv_138= ',' ( (lv_allOfs_139_0= ruleAbstractSchema ) ) )* otherlv_140= ']' (otherlv_141= ',' )? ) ) )
            	    // InternalDraft7.g:1433:6: ({...}? => (otherlv_134= '\"allOf\"' otherlv_135= ':' otherlv_136= '[' ( (lv_allOfs_137_0= ruleAbstractSchema ) ) (otherlv_138= ',' ( (lv_allOfs_139_0= ruleAbstractSchema ) ) )* otherlv_140= ']' (otherlv_141= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 24);
            	    					
            	    // InternalDraft7.g:1436:9: ({...}? => (otherlv_134= '\"allOf\"' otherlv_135= ':' otherlv_136= '[' ( (lv_allOfs_137_0= ruleAbstractSchema ) ) (otherlv_138= ',' ( (lv_allOfs_139_0= ruleAbstractSchema ) ) )* otherlv_140= ']' (otherlv_141= ',' )? ) )
            	    // InternalDraft7.g:1436:10: {...}? => (otherlv_134= '\"allOf\"' otherlv_135= ':' otherlv_136= '[' ( (lv_allOfs_137_0= ruleAbstractSchema ) ) (otherlv_138= ',' ( (lv_allOfs_139_0= ruleAbstractSchema ) ) )* otherlv_140= ']' (otherlv_141= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalDraft7.g:1436:19: (otherlv_134= '\"allOf\"' otherlv_135= ':' otherlv_136= '[' ( (lv_allOfs_137_0= ruleAbstractSchema ) ) (otherlv_138= ',' ( (lv_allOfs_139_0= ruleAbstractSchema ) ) )* otherlv_140= ']' (otherlv_141= ',' )? )
            	    // InternalDraft7.g:1436:20: otherlv_134= '\"allOf\"' otherlv_135= ':' otherlv_136= '[' ( (lv_allOfs_137_0= ruleAbstractSchema ) ) (otherlv_138= ',' ( (lv_allOfs_139_0= ruleAbstractSchema ) ) )* otherlv_140= ']' (otherlv_141= ',' )?
            	    {
            	    otherlv_134=(Token)match(input,41,FOLLOW_4); 

            	    									newLeafNode(otherlv_134, grammarAccess.getSchemaAccess().getAllOfKeyword_2_24_0());
            	    								
            	    otherlv_135=(Token)match(input,13,FOLLOW_16); 

            	    									newLeafNode(otherlv_135, grammarAccess.getSchemaAccess().getColonKeyword_2_24_1());
            	    								
            	    otherlv_136=(Token)match(input,27,FOLLOW_10); 

            	    									newLeafNode(otherlv_136, grammarAccess.getSchemaAccess().getLeftSquareBracketKeyword_2_24_2());
            	    								
            	    // InternalDraft7.g:1448:9: ( (lv_allOfs_137_0= ruleAbstractSchema ) )
            	    // InternalDraft7.g:1449:10: (lv_allOfs_137_0= ruleAbstractSchema )
            	    {
            	    // InternalDraft7.g:1449:10: (lv_allOfs_137_0= ruleAbstractSchema )
            	    // InternalDraft7.g:1450:11: lv_allOfs_137_0= ruleAbstractSchema
            	    {

            	    											newCompositeNode(grammarAccess.getSchemaAccess().getAllOfsAbstractSchemaParserRuleCall_2_24_3_0());
            	    										
            	    pushFollow(FOLLOW_17);
            	    lv_allOfs_137_0=ruleAbstractSchema();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    											}
            	    											add(
            	    												current,
            	    												"allOfs",
            	    												lv_allOfs_137_0,
            	    												"org.xtext.json.schema.Draft7.AbstractSchema");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalDraft7.g:1467:9: (otherlv_138= ',' ( (lv_allOfs_139_0= ruleAbstractSchema ) ) )*
            	    loop34:
            	    do {
            	        int alt34=2;
            	        int LA34_0 = input.LA(1);

            	        if ( (LA34_0==14) ) {
            	            alt34=1;
            	        }


            	        switch (alt34) {
            	    	case 1 :
            	    	    // InternalDraft7.g:1468:10: otherlv_138= ',' ( (lv_allOfs_139_0= ruleAbstractSchema ) )
            	    	    {
            	    	    otherlv_138=(Token)match(input,14,FOLLOW_10); 

            	    	    										newLeafNode(otherlv_138, grammarAccess.getSchemaAccess().getCommaKeyword_2_24_4_0());
            	    	    									
            	    	    // InternalDraft7.g:1472:10: ( (lv_allOfs_139_0= ruleAbstractSchema ) )
            	    	    // InternalDraft7.g:1473:11: (lv_allOfs_139_0= ruleAbstractSchema )
            	    	    {
            	    	    // InternalDraft7.g:1473:11: (lv_allOfs_139_0= ruleAbstractSchema )
            	    	    // InternalDraft7.g:1474:12: lv_allOfs_139_0= ruleAbstractSchema
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getSchemaAccess().getAllOfsAbstractSchemaParserRuleCall_2_24_4_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_17);
            	    	    lv_allOfs_139_0=ruleAbstractSchema();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"allOfs",
            	    	    													lv_allOfs_139_0,
            	    	    													"org.xtext.json.schema.Draft7.AbstractSchema");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop34;
            	        }
            	    } while (true);

            	    otherlv_140=(Token)match(input,28,FOLLOW_6); 

            	    									newLeafNode(otherlv_140, grammarAccess.getSchemaAccess().getRightSquareBracketKeyword_2_24_5());
            	    								
            	    // InternalDraft7.g:1496:9: (otherlv_141= ',' )?
            	    int alt35=2;
            	    int LA35_0 = input.LA(1);

            	    if ( (LA35_0==14) ) {
            	        alt35=1;
            	    }
            	    switch (alt35) {
            	        case 1 :
            	            // InternalDraft7.g:1497:10: otherlv_141= ','
            	            {
            	            otherlv_141=(Token)match(input,14,FOLLOW_3); 

            	            										newLeafNode(otherlv_141, grammarAccess.getSchemaAccess().getCommaKeyword_2_24_6());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSchemaAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 26 :
            	    // InternalDraft7.g:1508:4: ({...}? => ( ({...}? => (otherlv_142= '\"not\"' otherlv_143= ':' ( (lv_not_144_0= ruleAbstractSchema ) ) (otherlv_145= ',' )? ) ) ) )
            	    {
            	    // InternalDraft7.g:1508:4: ({...}? => ( ({...}? => (otherlv_142= '\"not\"' otherlv_143= ':' ( (lv_not_144_0= ruleAbstractSchema ) ) (otherlv_145= ',' )? ) ) ) )
            	    // InternalDraft7.g:1509:5: {...}? => ( ({...}? => (otherlv_142= '\"not\"' otherlv_143= ':' ( (lv_not_144_0= ruleAbstractSchema ) ) (otherlv_145= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 25) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 25)");
            	    }
            	    // InternalDraft7.g:1509:104: ( ({...}? => (otherlv_142= '\"not\"' otherlv_143= ':' ( (lv_not_144_0= ruleAbstractSchema ) ) (otherlv_145= ',' )? ) ) )
            	    // InternalDraft7.g:1510:6: ({...}? => (otherlv_142= '\"not\"' otherlv_143= ':' ( (lv_not_144_0= ruleAbstractSchema ) ) (otherlv_145= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 25);
            	    					
            	    // InternalDraft7.g:1513:9: ({...}? => (otherlv_142= '\"not\"' otherlv_143= ':' ( (lv_not_144_0= ruleAbstractSchema ) ) (otherlv_145= ',' )? ) )
            	    // InternalDraft7.g:1513:10: {...}? => (otherlv_142= '\"not\"' otherlv_143= ':' ( (lv_not_144_0= ruleAbstractSchema ) ) (otherlv_145= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalDraft7.g:1513:19: (otherlv_142= '\"not\"' otherlv_143= ':' ( (lv_not_144_0= ruleAbstractSchema ) ) (otherlv_145= ',' )? )
            	    // InternalDraft7.g:1513:20: otherlv_142= '\"not\"' otherlv_143= ':' ( (lv_not_144_0= ruleAbstractSchema ) ) (otherlv_145= ',' )?
            	    {
            	    otherlv_142=(Token)match(input,42,FOLLOW_4); 

            	    									newLeafNode(otherlv_142, grammarAccess.getSchemaAccess().getNotKeyword_2_25_0());
            	    								
            	    otherlv_143=(Token)match(input,13,FOLLOW_10); 

            	    									newLeafNode(otherlv_143, grammarAccess.getSchemaAccess().getColonKeyword_2_25_1());
            	    								
            	    // InternalDraft7.g:1521:9: ( (lv_not_144_0= ruleAbstractSchema ) )
            	    // InternalDraft7.g:1522:10: (lv_not_144_0= ruleAbstractSchema )
            	    {
            	    // InternalDraft7.g:1522:10: (lv_not_144_0= ruleAbstractSchema )
            	    // InternalDraft7.g:1523:11: lv_not_144_0= ruleAbstractSchema
            	    {

            	    											newCompositeNode(grammarAccess.getSchemaAccess().getNotAbstractSchemaParserRuleCall_2_25_2_0());
            	    										
            	    pushFollow(FOLLOW_6);
            	    lv_not_144_0=ruleAbstractSchema();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    											}
            	    											set(
            	    												current,
            	    												"not",
            	    												lv_not_144_0,
            	    												"org.xtext.json.schema.Draft7.AbstractSchema");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalDraft7.g:1540:9: (otherlv_145= ',' )?
            	    int alt36=2;
            	    int LA36_0 = input.LA(1);

            	    if ( (LA36_0==14) ) {
            	        alt36=1;
            	    }
            	    switch (alt36) {
            	        case 1 :
            	            // InternalDraft7.g:1541:10: otherlv_145= ','
            	            {
            	            otherlv_145=(Token)match(input,14,FOLLOW_3); 

            	            										newLeafNode(otherlv_145, grammarAccess.getSchemaAccess().getCommaKeyword_2_25_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSchemaAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 27 :
            	    // InternalDraft7.g:1552:4: ({...}? => ( ({...}? => (otherlv_146= '\"uniqueItems\"' otherlv_147= ':' ( (lv_unique_148_0= ruleBoolean ) ) (otherlv_149= ',' )? ) ) ) )
            	    {
            	    // InternalDraft7.g:1552:4: ({...}? => ( ({...}? => (otherlv_146= '\"uniqueItems\"' otherlv_147= ':' ( (lv_unique_148_0= ruleBoolean ) ) (otherlv_149= ',' )? ) ) ) )
            	    // InternalDraft7.g:1553:5: {...}? => ( ({...}? => (otherlv_146= '\"uniqueItems\"' otherlv_147= ':' ( (lv_unique_148_0= ruleBoolean ) ) (otherlv_149= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 26) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 26)");
            	    }
            	    // InternalDraft7.g:1553:104: ( ({...}? => (otherlv_146= '\"uniqueItems\"' otherlv_147= ':' ( (lv_unique_148_0= ruleBoolean ) ) (otherlv_149= ',' )? ) ) )
            	    // InternalDraft7.g:1554:6: ({...}? => (otherlv_146= '\"uniqueItems\"' otherlv_147= ':' ( (lv_unique_148_0= ruleBoolean ) ) (otherlv_149= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 26);
            	    					
            	    // InternalDraft7.g:1557:9: ({...}? => (otherlv_146= '\"uniqueItems\"' otherlv_147= ':' ( (lv_unique_148_0= ruleBoolean ) ) (otherlv_149= ',' )? ) )
            	    // InternalDraft7.g:1557:10: {...}? => (otherlv_146= '\"uniqueItems\"' otherlv_147= ':' ( (lv_unique_148_0= ruleBoolean ) ) (otherlv_149= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalDraft7.g:1557:19: (otherlv_146= '\"uniqueItems\"' otherlv_147= ':' ( (lv_unique_148_0= ruleBoolean ) ) (otherlv_149= ',' )? )
            	    // InternalDraft7.g:1557:20: otherlv_146= '\"uniqueItems\"' otherlv_147= ':' ( (lv_unique_148_0= ruleBoolean ) ) (otherlv_149= ',' )?
            	    {
            	    otherlv_146=(Token)match(input,43,FOLLOW_4); 

            	    									newLeafNode(otherlv_146, grammarAccess.getSchemaAccess().getUniqueItemsKeyword_2_26_0());
            	    								
            	    otherlv_147=(Token)match(input,13,FOLLOW_20); 

            	    									newLeafNode(otherlv_147, grammarAccess.getSchemaAccess().getColonKeyword_2_26_1());
            	    								
            	    // InternalDraft7.g:1565:9: ( (lv_unique_148_0= ruleBoolean ) )
            	    // InternalDraft7.g:1566:10: (lv_unique_148_0= ruleBoolean )
            	    {
            	    // InternalDraft7.g:1566:10: (lv_unique_148_0= ruleBoolean )
            	    // InternalDraft7.g:1567:11: lv_unique_148_0= ruleBoolean
            	    {

            	    											newCompositeNode(grammarAccess.getSchemaAccess().getUniqueBooleanEnumRuleCall_2_26_2_0());
            	    										
            	    pushFollow(FOLLOW_6);
            	    lv_unique_148_0=ruleBoolean();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    											}
            	    											set(
            	    												current,
            	    												"unique",
            	    												lv_unique_148_0,
            	    												"org.xtext.json.schema.Draft7.Boolean");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalDraft7.g:1584:9: (otherlv_149= ',' )?
            	    int alt37=2;
            	    int LA37_0 = input.LA(1);

            	    if ( (LA37_0==14) ) {
            	        alt37=1;
            	    }
            	    switch (alt37) {
            	        case 1 :
            	            // InternalDraft7.g:1585:10: otherlv_149= ','
            	            {
            	            otherlv_149=(Token)match(input,14,FOLLOW_3); 

            	            										newLeafNode(otherlv_149, grammarAccess.getSchemaAccess().getCommaKeyword_2_26_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSchemaAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 28 :
            	    // InternalDraft7.g:1596:4: ({...}? => ( ({...}? => (otherlv_150= '\"propertyNames\"' otherlv_151= ':' ( (lv_propertyNames_152_0= ruleAbstractSchema ) ) (otherlv_153= ',' )? ) ) ) )
            	    {
            	    // InternalDraft7.g:1596:4: ({...}? => ( ({...}? => (otherlv_150= '\"propertyNames\"' otherlv_151= ':' ( (lv_propertyNames_152_0= ruleAbstractSchema ) ) (otherlv_153= ',' )? ) ) ) )
            	    // InternalDraft7.g:1597:5: {...}? => ( ({...}? => (otherlv_150= '\"propertyNames\"' otherlv_151= ':' ( (lv_propertyNames_152_0= ruleAbstractSchema ) ) (otherlv_153= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 27) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 27)");
            	    }
            	    // InternalDraft7.g:1597:104: ( ({...}? => (otherlv_150= '\"propertyNames\"' otherlv_151= ':' ( (lv_propertyNames_152_0= ruleAbstractSchema ) ) (otherlv_153= ',' )? ) ) )
            	    // InternalDraft7.g:1598:6: ({...}? => (otherlv_150= '\"propertyNames\"' otherlv_151= ':' ( (lv_propertyNames_152_0= ruleAbstractSchema ) ) (otherlv_153= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 27);
            	    					
            	    // InternalDraft7.g:1601:9: ({...}? => (otherlv_150= '\"propertyNames\"' otherlv_151= ':' ( (lv_propertyNames_152_0= ruleAbstractSchema ) ) (otherlv_153= ',' )? ) )
            	    // InternalDraft7.g:1601:10: {...}? => (otherlv_150= '\"propertyNames\"' otherlv_151= ':' ( (lv_propertyNames_152_0= ruleAbstractSchema ) ) (otherlv_153= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalDraft7.g:1601:19: (otherlv_150= '\"propertyNames\"' otherlv_151= ':' ( (lv_propertyNames_152_0= ruleAbstractSchema ) ) (otherlv_153= ',' )? )
            	    // InternalDraft7.g:1601:20: otherlv_150= '\"propertyNames\"' otherlv_151= ':' ( (lv_propertyNames_152_0= ruleAbstractSchema ) ) (otherlv_153= ',' )?
            	    {
            	    otherlv_150=(Token)match(input,44,FOLLOW_4); 

            	    									newLeafNode(otherlv_150, grammarAccess.getSchemaAccess().getPropertyNamesKeyword_2_27_0());
            	    								
            	    otherlv_151=(Token)match(input,13,FOLLOW_10); 

            	    									newLeafNode(otherlv_151, grammarAccess.getSchemaAccess().getColonKeyword_2_27_1());
            	    								
            	    // InternalDraft7.g:1609:9: ( (lv_propertyNames_152_0= ruleAbstractSchema ) )
            	    // InternalDraft7.g:1610:10: (lv_propertyNames_152_0= ruleAbstractSchema )
            	    {
            	    // InternalDraft7.g:1610:10: (lv_propertyNames_152_0= ruleAbstractSchema )
            	    // InternalDraft7.g:1611:11: lv_propertyNames_152_0= ruleAbstractSchema
            	    {

            	    											newCompositeNode(grammarAccess.getSchemaAccess().getPropertyNamesAbstractSchemaParserRuleCall_2_27_2_0());
            	    										
            	    pushFollow(FOLLOW_6);
            	    lv_propertyNames_152_0=ruleAbstractSchema();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    											}
            	    											set(
            	    												current,
            	    												"propertyNames",
            	    												lv_propertyNames_152_0,
            	    												"org.xtext.json.schema.Draft7.AbstractSchema");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalDraft7.g:1628:9: (otherlv_153= ',' )?
            	    int alt38=2;
            	    int LA38_0 = input.LA(1);

            	    if ( (LA38_0==14) ) {
            	        alt38=1;
            	    }
            	    switch (alt38) {
            	        case 1 :
            	            // InternalDraft7.g:1629:10: otherlv_153= ','
            	            {
            	            otherlv_153=(Token)match(input,14,FOLLOW_3); 

            	            										newLeafNode(otherlv_153, grammarAccess.getSchemaAccess().getCommaKeyword_2_27_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSchemaAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 29 :
            	    // InternalDraft7.g:1640:4: ({...}? => ( ({...}? => (otherlv_154= '\"minProperties\"' otherlv_155= ':' ( (lv_minProperties_156_0= RULE_INT ) ) (otherlv_157= ',' )? ) ) ) )
            	    {
            	    // InternalDraft7.g:1640:4: ({...}? => ( ({...}? => (otherlv_154= '\"minProperties\"' otherlv_155= ':' ( (lv_minProperties_156_0= RULE_INT ) ) (otherlv_157= ',' )? ) ) ) )
            	    // InternalDraft7.g:1641:5: {...}? => ( ({...}? => (otherlv_154= '\"minProperties\"' otherlv_155= ':' ( (lv_minProperties_156_0= RULE_INT ) ) (otherlv_157= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 28) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 28)");
            	    }
            	    // InternalDraft7.g:1641:104: ( ({...}? => (otherlv_154= '\"minProperties\"' otherlv_155= ':' ( (lv_minProperties_156_0= RULE_INT ) ) (otherlv_157= ',' )? ) ) )
            	    // InternalDraft7.g:1642:6: ({...}? => (otherlv_154= '\"minProperties\"' otherlv_155= ':' ( (lv_minProperties_156_0= RULE_INT ) ) (otherlv_157= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 28);
            	    					
            	    // InternalDraft7.g:1645:9: ({...}? => (otherlv_154= '\"minProperties\"' otherlv_155= ':' ( (lv_minProperties_156_0= RULE_INT ) ) (otherlv_157= ',' )? ) )
            	    // InternalDraft7.g:1645:10: {...}? => (otherlv_154= '\"minProperties\"' otherlv_155= ':' ( (lv_minProperties_156_0= RULE_INT ) ) (otherlv_157= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalDraft7.g:1645:19: (otherlv_154= '\"minProperties\"' otherlv_155= ':' ( (lv_minProperties_156_0= RULE_INT ) ) (otherlv_157= ',' )? )
            	    // InternalDraft7.g:1645:20: otherlv_154= '\"minProperties\"' otherlv_155= ':' ( (lv_minProperties_156_0= RULE_INT ) ) (otherlv_157= ',' )?
            	    {
            	    otherlv_154=(Token)match(input,45,FOLLOW_4); 

            	    									newLeafNode(otherlv_154, grammarAccess.getSchemaAccess().getMinPropertiesKeyword_2_28_0());
            	    								
            	    otherlv_155=(Token)match(input,13,FOLLOW_21); 

            	    									newLeafNode(otherlv_155, grammarAccess.getSchemaAccess().getColonKeyword_2_28_1());
            	    								
            	    // InternalDraft7.g:1653:9: ( (lv_minProperties_156_0= RULE_INT ) )
            	    // InternalDraft7.g:1654:10: (lv_minProperties_156_0= RULE_INT )
            	    {
            	    // InternalDraft7.g:1654:10: (lv_minProperties_156_0= RULE_INT )
            	    // InternalDraft7.g:1655:11: lv_minProperties_156_0= RULE_INT
            	    {
            	    lv_minProperties_156_0=(Token)match(input,RULE_INT,FOLLOW_6); 

            	    											newLeafNode(lv_minProperties_156_0, grammarAccess.getSchemaAccess().getMinPropertiesINTTerminalRuleCall_2_28_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getSchemaRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"minProperties",
            	    												lv_minProperties_156_0,
            	    												"org.eclipse.xtext.common.Terminals.INT");
            	    										

            	    }


            	    }

            	    // InternalDraft7.g:1671:9: (otherlv_157= ',' )?
            	    int alt39=2;
            	    int LA39_0 = input.LA(1);

            	    if ( (LA39_0==14) ) {
            	        alt39=1;
            	    }
            	    switch (alt39) {
            	        case 1 :
            	            // InternalDraft7.g:1672:10: otherlv_157= ','
            	            {
            	            otherlv_157=(Token)match(input,14,FOLLOW_3); 

            	            										newLeafNode(otherlv_157, grammarAccess.getSchemaAccess().getCommaKeyword_2_28_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSchemaAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 30 :
            	    // InternalDraft7.g:1683:4: ({...}? => ( ({...}? => (otherlv_158= '\"maxProperties\"' otherlv_159= ':' ( (lv_maxProperties_160_0= RULE_INT ) ) (otherlv_161= ',' )? ) ) ) )
            	    {
            	    // InternalDraft7.g:1683:4: ({...}? => ( ({...}? => (otherlv_158= '\"maxProperties\"' otherlv_159= ':' ( (lv_maxProperties_160_0= RULE_INT ) ) (otherlv_161= ',' )? ) ) ) )
            	    // InternalDraft7.g:1684:5: {...}? => ( ({...}? => (otherlv_158= '\"maxProperties\"' otherlv_159= ':' ( (lv_maxProperties_160_0= RULE_INT ) ) (otherlv_161= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 29) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 29)");
            	    }
            	    // InternalDraft7.g:1684:104: ( ({...}? => (otherlv_158= '\"maxProperties\"' otherlv_159= ':' ( (lv_maxProperties_160_0= RULE_INT ) ) (otherlv_161= ',' )? ) ) )
            	    // InternalDraft7.g:1685:6: ({...}? => (otherlv_158= '\"maxProperties\"' otherlv_159= ':' ( (lv_maxProperties_160_0= RULE_INT ) ) (otherlv_161= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 29);
            	    					
            	    // InternalDraft7.g:1688:9: ({...}? => (otherlv_158= '\"maxProperties\"' otherlv_159= ':' ( (lv_maxProperties_160_0= RULE_INT ) ) (otherlv_161= ',' )? ) )
            	    // InternalDraft7.g:1688:10: {...}? => (otherlv_158= '\"maxProperties\"' otherlv_159= ':' ( (lv_maxProperties_160_0= RULE_INT ) ) (otherlv_161= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalDraft7.g:1688:19: (otherlv_158= '\"maxProperties\"' otherlv_159= ':' ( (lv_maxProperties_160_0= RULE_INT ) ) (otherlv_161= ',' )? )
            	    // InternalDraft7.g:1688:20: otherlv_158= '\"maxProperties\"' otherlv_159= ':' ( (lv_maxProperties_160_0= RULE_INT ) ) (otherlv_161= ',' )?
            	    {
            	    otherlv_158=(Token)match(input,46,FOLLOW_4); 

            	    									newLeafNode(otherlv_158, grammarAccess.getSchemaAccess().getMaxPropertiesKeyword_2_29_0());
            	    								
            	    otherlv_159=(Token)match(input,13,FOLLOW_21); 

            	    									newLeafNode(otherlv_159, grammarAccess.getSchemaAccess().getColonKeyword_2_29_1());
            	    								
            	    // InternalDraft7.g:1696:9: ( (lv_maxProperties_160_0= RULE_INT ) )
            	    // InternalDraft7.g:1697:10: (lv_maxProperties_160_0= RULE_INT )
            	    {
            	    // InternalDraft7.g:1697:10: (lv_maxProperties_160_0= RULE_INT )
            	    // InternalDraft7.g:1698:11: lv_maxProperties_160_0= RULE_INT
            	    {
            	    lv_maxProperties_160_0=(Token)match(input,RULE_INT,FOLLOW_6); 

            	    											newLeafNode(lv_maxProperties_160_0, grammarAccess.getSchemaAccess().getMaxPropertiesINTTerminalRuleCall_2_29_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getSchemaRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"maxProperties",
            	    												lv_maxProperties_160_0,
            	    												"org.eclipse.xtext.common.Terminals.INT");
            	    										

            	    }


            	    }

            	    // InternalDraft7.g:1714:9: (otherlv_161= ',' )?
            	    int alt40=2;
            	    int LA40_0 = input.LA(1);

            	    if ( (LA40_0==14) ) {
            	        alt40=1;
            	    }
            	    switch (alt40) {
            	        case 1 :
            	            // InternalDraft7.g:1715:10: otherlv_161= ','
            	            {
            	            otherlv_161=(Token)match(input,14,FOLLOW_3); 

            	            										newLeafNode(otherlv_161, grammarAccess.getSchemaAccess().getCommaKeyword_2_29_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSchemaAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 31 :
            	    // InternalDraft7.g:1726:4: ({...}? => ( ({...}? => (otherlv_162= '\"maxItems\"' otherlv_163= ':' ( (lv_maxItems_164_0= RULE_INT ) ) (otherlv_165= ',' )? ) ) ) )
            	    {
            	    // InternalDraft7.g:1726:4: ({...}? => ( ({...}? => (otherlv_162= '\"maxItems\"' otherlv_163= ':' ( (lv_maxItems_164_0= RULE_INT ) ) (otherlv_165= ',' )? ) ) ) )
            	    // InternalDraft7.g:1727:5: {...}? => ( ({...}? => (otherlv_162= '\"maxItems\"' otherlv_163= ':' ( (lv_maxItems_164_0= RULE_INT ) ) (otherlv_165= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 30) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 30)");
            	    }
            	    // InternalDraft7.g:1727:104: ( ({...}? => (otherlv_162= '\"maxItems\"' otherlv_163= ':' ( (lv_maxItems_164_0= RULE_INT ) ) (otherlv_165= ',' )? ) ) )
            	    // InternalDraft7.g:1728:6: ({...}? => (otherlv_162= '\"maxItems\"' otherlv_163= ':' ( (lv_maxItems_164_0= RULE_INT ) ) (otherlv_165= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 30);
            	    					
            	    // InternalDraft7.g:1731:9: ({...}? => (otherlv_162= '\"maxItems\"' otherlv_163= ':' ( (lv_maxItems_164_0= RULE_INT ) ) (otherlv_165= ',' )? ) )
            	    // InternalDraft7.g:1731:10: {...}? => (otherlv_162= '\"maxItems\"' otherlv_163= ':' ( (lv_maxItems_164_0= RULE_INT ) ) (otherlv_165= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalDraft7.g:1731:19: (otherlv_162= '\"maxItems\"' otherlv_163= ':' ( (lv_maxItems_164_0= RULE_INT ) ) (otherlv_165= ',' )? )
            	    // InternalDraft7.g:1731:20: otherlv_162= '\"maxItems\"' otherlv_163= ':' ( (lv_maxItems_164_0= RULE_INT ) ) (otherlv_165= ',' )?
            	    {
            	    otherlv_162=(Token)match(input,47,FOLLOW_4); 

            	    									newLeafNode(otherlv_162, grammarAccess.getSchemaAccess().getMaxItemsKeyword_2_30_0());
            	    								
            	    otherlv_163=(Token)match(input,13,FOLLOW_21); 

            	    									newLeafNode(otherlv_163, grammarAccess.getSchemaAccess().getColonKeyword_2_30_1());
            	    								
            	    // InternalDraft7.g:1739:9: ( (lv_maxItems_164_0= RULE_INT ) )
            	    // InternalDraft7.g:1740:10: (lv_maxItems_164_0= RULE_INT )
            	    {
            	    // InternalDraft7.g:1740:10: (lv_maxItems_164_0= RULE_INT )
            	    // InternalDraft7.g:1741:11: lv_maxItems_164_0= RULE_INT
            	    {
            	    lv_maxItems_164_0=(Token)match(input,RULE_INT,FOLLOW_6); 

            	    											newLeafNode(lv_maxItems_164_0, grammarAccess.getSchemaAccess().getMaxItemsINTTerminalRuleCall_2_30_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getSchemaRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"maxItems",
            	    												lv_maxItems_164_0,
            	    												"org.eclipse.xtext.common.Terminals.INT");
            	    										

            	    }


            	    }

            	    // InternalDraft7.g:1757:9: (otherlv_165= ',' )?
            	    int alt41=2;
            	    int LA41_0 = input.LA(1);

            	    if ( (LA41_0==14) ) {
            	        alt41=1;
            	    }
            	    switch (alt41) {
            	        case 1 :
            	            // InternalDraft7.g:1758:10: otherlv_165= ','
            	            {
            	            otherlv_165=(Token)match(input,14,FOLLOW_3); 

            	            										newLeafNode(otherlv_165, grammarAccess.getSchemaAccess().getCommaKeyword_2_30_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSchemaAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 32 :
            	    // InternalDraft7.g:1769:4: ({...}? => ( ({...}? => (otherlv_166= '\"minItems\"' otherlv_167= ':' ( (lv_minItems_168_0= RULE_INT ) ) (otherlv_169= ',' )? ) ) ) )
            	    {
            	    // InternalDraft7.g:1769:4: ({...}? => ( ({...}? => (otherlv_166= '\"minItems\"' otherlv_167= ':' ( (lv_minItems_168_0= RULE_INT ) ) (otherlv_169= ',' )? ) ) ) )
            	    // InternalDraft7.g:1770:5: {...}? => ( ({...}? => (otherlv_166= '\"minItems\"' otherlv_167= ':' ( (lv_minItems_168_0= RULE_INT ) ) (otherlv_169= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 31) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 31)");
            	    }
            	    // InternalDraft7.g:1770:104: ( ({...}? => (otherlv_166= '\"minItems\"' otherlv_167= ':' ( (lv_minItems_168_0= RULE_INT ) ) (otherlv_169= ',' )? ) ) )
            	    // InternalDraft7.g:1771:6: ({...}? => (otherlv_166= '\"minItems\"' otherlv_167= ':' ( (lv_minItems_168_0= RULE_INT ) ) (otherlv_169= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 31);
            	    					
            	    // InternalDraft7.g:1774:9: ({...}? => (otherlv_166= '\"minItems\"' otherlv_167= ':' ( (lv_minItems_168_0= RULE_INT ) ) (otherlv_169= ',' )? ) )
            	    // InternalDraft7.g:1774:10: {...}? => (otherlv_166= '\"minItems\"' otherlv_167= ':' ( (lv_minItems_168_0= RULE_INT ) ) (otherlv_169= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalDraft7.g:1774:19: (otherlv_166= '\"minItems\"' otherlv_167= ':' ( (lv_minItems_168_0= RULE_INT ) ) (otherlv_169= ',' )? )
            	    // InternalDraft7.g:1774:20: otherlv_166= '\"minItems\"' otherlv_167= ':' ( (lv_minItems_168_0= RULE_INT ) ) (otherlv_169= ',' )?
            	    {
            	    otherlv_166=(Token)match(input,48,FOLLOW_4); 

            	    									newLeafNode(otherlv_166, grammarAccess.getSchemaAccess().getMinItemsKeyword_2_31_0());
            	    								
            	    otherlv_167=(Token)match(input,13,FOLLOW_21); 

            	    									newLeafNode(otherlv_167, grammarAccess.getSchemaAccess().getColonKeyword_2_31_1());
            	    								
            	    // InternalDraft7.g:1782:9: ( (lv_minItems_168_0= RULE_INT ) )
            	    // InternalDraft7.g:1783:10: (lv_minItems_168_0= RULE_INT )
            	    {
            	    // InternalDraft7.g:1783:10: (lv_minItems_168_0= RULE_INT )
            	    // InternalDraft7.g:1784:11: lv_minItems_168_0= RULE_INT
            	    {
            	    lv_minItems_168_0=(Token)match(input,RULE_INT,FOLLOW_6); 

            	    											newLeafNode(lv_minItems_168_0, grammarAccess.getSchemaAccess().getMinItemsINTTerminalRuleCall_2_31_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getSchemaRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"minItems",
            	    												lv_minItems_168_0,
            	    												"org.eclipse.xtext.common.Terminals.INT");
            	    										

            	    }


            	    }

            	    // InternalDraft7.g:1800:9: (otherlv_169= ',' )?
            	    int alt42=2;
            	    int LA42_0 = input.LA(1);

            	    if ( (LA42_0==14) ) {
            	        alt42=1;
            	    }
            	    switch (alt42) {
            	        case 1 :
            	            // InternalDraft7.g:1801:10: otherlv_169= ','
            	            {
            	            otherlv_169=(Token)match(input,14,FOLLOW_3); 

            	            										newLeafNode(otherlv_169, grammarAccess.getSchemaAccess().getCommaKeyword_2_31_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSchemaAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 33 :
            	    // InternalDraft7.g:1812:4: ({...}? => ( ({...}? => (otherlv_170= '\"maxLength\"' otherlv_171= ':' ( (lv_maxLength_172_0= RULE_INT ) ) (otherlv_173= ',' )? ) ) ) )
            	    {
            	    // InternalDraft7.g:1812:4: ({...}? => ( ({...}? => (otherlv_170= '\"maxLength\"' otherlv_171= ':' ( (lv_maxLength_172_0= RULE_INT ) ) (otherlv_173= ',' )? ) ) ) )
            	    // InternalDraft7.g:1813:5: {...}? => ( ({...}? => (otherlv_170= '\"maxLength\"' otherlv_171= ':' ( (lv_maxLength_172_0= RULE_INT ) ) (otherlv_173= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 32) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 32)");
            	    }
            	    // InternalDraft7.g:1813:104: ( ({...}? => (otherlv_170= '\"maxLength\"' otherlv_171= ':' ( (lv_maxLength_172_0= RULE_INT ) ) (otherlv_173= ',' )? ) ) )
            	    // InternalDraft7.g:1814:6: ({...}? => (otherlv_170= '\"maxLength\"' otherlv_171= ':' ( (lv_maxLength_172_0= RULE_INT ) ) (otherlv_173= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 32);
            	    					
            	    // InternalDraft7.g:1817:9: ({...}? => (otherlv_170= '\"maxLength\"' otherlv_171= ':' ( (lv_maxLength_172_0= RULE_INT ) ) (otherlv_173= ',' )? ) )
            	    // InternalDraft7.g:1817:10: {...}? => (otherlv_170= '\"maxLength\"' otherlv_171= ':' ( (lv_maxLength_172_0= RULE_INT ) ) (otherlv_173= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalDraft7.g:1817:19: (otherlv_170= '\"maxLength\"' otherlv_171= ':' ( (lv_maxLength_172_0= RULE_INT ) ) (otherlv_173= ',' )? )
            	    // InternalDraft7.g:1817:20: otherlv_170= '\"maxLength\"' otherlv_171= ':' ( (lv_maxLength_172_0= RULE_INT ) ) (otherlv_173= ',' )?
            	    {
            	    otherlv_170=(Token)match(input,49,FOLLOW_4); 

            	    									newLeafNode(otherlv_170, grammarAccess.getSchemaAccess().getMaxLengthKeyword_2_32_0());
            	    								
            	    otherlv_171=(Token)match(input,13,FOLLOW_21); 

            	    									newLeafNode(otherlv_171, grammarAccess.getSchemaAccess().getColonKeyword_2_32_1());
            	    								
            	    // InternalDraft7.g:1825:9: ( (lv_maxLength_172_0= RULE_INT ) )
            	    // InternalDraft7.g:1826:10: (lv_maxLength_172_0= RULE_INT )
            	    {
            	    // InternalDraft7.g:1826:10: (lv_maxLength_172_0= RULE_INT )
            	    // InternalDraft7.g:1827:11: lv_maxLength_172_0= RULE_INT
            	    {
            	    lv_maxLength_172_0=(Token)match(input,RULE_INT,FOLLOW_6); 

            	    											newLeafNode(lv_maxLength_172_0, grammarAccess.getSchemaAccess().getMaxLengthINTTerminalRuleCall_2_32_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getSchemaRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"maxLength",
            	    												lv_maxLength_172_0,
            	    												"org.eclipse.xtext.common.Terminals.INT");
            	    										

            	    }


            	    }

            	    // InternalDraft7.g:1843:9: (otherlv_173= ',' )?
            	    int alt43=2;
            	    int LA43_0 = input.LA(1);

            	    if ( (LA43_0==14) ) {
            	        alt43=1;
            	    }
            	    switch (alt43) {
            	        case 1 :
            	            // InternalDraft7.g:1844:10: otherlv_173= ','
            	            {
            	            otherlv_173=(Token)match(input,14,FOLLOW_3); 

            	            										newLeafNode(otherlv_173, grammarAccess.getSchemaAccess().getCommaKeyword_2_32_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSchemaAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 34 :
            	    // InternalDraft7.g:1855:4: ({...}? => ( ({...}? => (otherlv_174= '\"minLength\"' otherlv_175= ':' ( (lv_minLength_176_0= RULE_INT ) ) (otherlv_177= ',' )? ) ) ) )
            	    {
            	    // InternalDraft7.g:1855:4: ({...}? => ( ({...}? => (otherlv_174= '\"minLength\"' otherlv_175= ':' ( (lv_minLength_176_0= RULE_INT ) ) (otherlv_177= ',' )? ) ) ) )
            	    // InternalDraft7.g:1856:5: {...}? => ( ({...}? => (otherlv_174= '\"minLength\"' otherlv_175= ':' ( (lv_minLength_176_0= RULE_INT ) ) (otherlv_177= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 33) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 33)");
            	    }
            	    // InternalDraft7.g:1856:104: ( ({...}? => (otherlv_174= '\"minLength\"' otherlv_175= ':' ( (lv_minLength_176_0= RULE_INT ) ) (otherlv_177= ',' )? ) ) )
            	    // InternalDraft7.g:1857:6: ({...}? => (otherlv_174= '\"minLength\"' otherlv_175= ':' ( (lv_minLength_176_0= RULE_INT ) ) (otherlv_177= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 33);
            	    					
            	    // InternalDraft7.g:1860:9: ({...}? => (otherlv_174= '\"minLength\"' otherlv_175= ':' ( (lv_minLength_176_0= RULE_INT ) ) (otherlv_177= ',' )? ) )
            	    // InternalDraft7.g:1860:10: {...}? => (otherlv_174= '\"minLength\"' otherlv_175= ':' ( (lv_minLength_176_0= RULE_INT ) ) (otherlv_177= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalDraft7.g:1860:19: (otherlv_174= '\"minLength\"' otherlv_175= ':' ( (lv_minLength_176_0= RULE_INT ) ) (otherlv_177= ',' )? )
            	    // InternalDraft7.g:1860:20: otherlv_174= '\"minLength\"' otherlv_175= ':' ( (lv_minLength_176_0= RULE_INT ) ) (otherlv_177= ',' )?
            	    {
            	    otherlv_174=(Token)match(input,50,FOLLOW_4); 

            	    									newLeafNode(otherlv_174, grammarAccess.getSchemaAccess().getMinLengthKeyword_2_33_0());
            	    								
            	    otherlv_175=(Token)match(input,13,FOLLOW_21); 

            	    									newLeafNode(otherlv_175, grammarAccess.getSchemaAccess().getColonKeyword_2_33_1());
            	    								
            	    // InternalDraft7.g:1868:9: ( (lv_minLength_176_0= RULE_INT ) )
            	    // InternalDraft7.g:1869:10: (lv_minLength_176_0= RULE_INT )
            	    {
            	    // InternalDraft7.g:1869:10: (lv_minLength_176_0= RULE_INT )
            	    // InternalDraft7.g:1870:11: lv_minLength_176_0= RULE_INT
            	    {
            	    lv_minLength_176_0=(Token)match(input,RULE_INT,FOLLOW_6); 

            	    											newLeafNode(lv_minLength_176_0, grammarAccess.getSchemaAccess().getMinLengthINTTerminalRuleCall_2_33_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getSchemaRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"minLength",
            	    												lv_minLength_176_0,
            	    												"org.eclipse.xtext.common.Terminals.INT");
            	    										

            	    }


            	    }

            	    // InternalDraft7.g:1886:9: (otherlv_177= ',' )?
            	    int alt44=2;
            	    int LA44_0 = input.LA(1);

            	    if ( (LA44_0==14) ) {
            	        alt44=1;
            	    }
            	    switch (alt44) {
            	        case 1 :
            	            // InternalDraft7.g:1887:10: otherlv_177= ','
            	            {
            	            otherlv_177=(Token)match(input,14,FOLLOW_3); 

            	            										newLeafNode(otherlv_177, grammarAccess.getSchemaAccess().getCommaKeyword_2_33_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSchemaAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 35 :
            	    // InternalDraft7.g:1898:4: ({...}? => ( ({...}? => (otherlv_178= '\"pattern\"' otherlv_179= ':' ( (lv_pattern_180_0= ruleAnyString ) ) (otherlv_181= ',' )? ) ) ) )
            	    {
            	    // InternalDraft7.g:1898:4: ({...}? => ( ({...}? => (otherlv_178= '\"pattern\"' otherlv_179= ':' ( (lv_pattern_180_0= ruleAnyString ) ) (otherlv_181= ',' )? ) ) ) )
            	    // InternalDraft7.g:1899:5: {...}? => ( ({...}? => (otherlv_178= '\"pattern\"' otherlv_179= ':' ( (lv_pattern_180_0= ruleAnyString ) ) (otherlv_181= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 34) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 34)");
            	    }
            	    // InternalDraft7.g:1899:104: ( ({...}? => (otherlv_178= '\"pattern\"' otherlv_179= ':' ( (lv_pattern_180_0= ruleAnyString ) ) (otherlv_181= ',' )? ) ) )
            	    // InternalDraft7.g:1900:6: ({...}? => (otherlv_178= '\"pattern\"' otherlv_179= ':' ( (lv_pattern_180_0= ruleAnyString ) ) (otherlv_181= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 34);
            	    					
            	    // InternalDraft7.g:1903:9: ({...}? => (otherlv_178= '\"pattern\"' otherlv_179= ':' ( (lv_pattern_180_0= ruleAnyString ) ) (otherlv_181= ',' )? ) )
            	    // InternalDraft7.g:1903:10: {...}? => (otherlv_178= '\"pattern\"' otherlv_179= ':' ( (lv_pattern_180_0= ruleAnyString ) ) (otherlv_181= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalDraft7.g:1903:19: (otherlv_178= '\"pattern\"' otherlv_179= ':' ( (lv_pattern_180_0= ruleAnyString ) ) (otherlv_181= ',' )? )
            	    // InternalDraft7.g:1903:20: otherlv_178= '\"pattern\"' otherlv_179= ':' ( (lv_pattern_180_0= ruleAnyString ) ) (otherlv_181= ',' )?
            	    {
            	    otherlv_178=(Token)match(input,51,FOLLOW_4); 

            	    									newLeafNode(otherlv_178, grammarAccess.getSchemaAccess().getPatternKeyword_2_34_0());
            	    								
            	    otherlv_179=(Token)match(input,13,FOLLOW_8); 

            	    									newLeafNode(otherlv_179, grammarAccess.getSchemaAccess().getColonKeyword_2_34_1());
            	    								
            	    // InternalDraft7.g:1911:9: ( (lv_pattern_180_0= ruleAnyString ) )
            	    // InternalDraft7.g:1912:10: (lv_pattern_180_0= ruleAnyString )
            	    {
            	    // InternalDraft7.g:1912:10: (lv_pattern_180_0= ruleAnyString )
            	    // InternalDraft7.g:1913:11: lv_pattern_180_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getSchemaAccess().getPatternAnyStringParserRuleCall_2_34_2_0());
            	    										
            	    pushFollow(FOLLOW_6);
            	    lv_pattern_180_0=ruleAnyString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    											}
            	    											set(
            	    												current,
            	    												"pattern",
            	    												lv_pattern_180_0,
            	    												"org.xtext.json.schema.Draft7.AnyString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalDraft7.g:1930:9: (otherlv_181= ',' )?
            	    int alt45=2;
            	    int LA45_0 = input.LA(1);

            	    if ( (LA45_0==14) ) {
            	        alt45=1;
            	    }
            	    switch (alt45) {
            	        case 1 :
            	            // InternalDraft7.g:1931:10: otherlv_181= ','
            	            {
            	            otherlv_181=(Token)match(input,14,FOLLOW_3); 

            	            										newLeafNode(otherlv_181, grammarAccess.getSchemaAccess().getCommaKeyword_2_34_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSchemaAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 36 :
            	    // InternalDraft7.g:1942:4: ({...}? => ( ({...}? => (otherlv_182= '\"format\"' otherlv_183= ':' ( (lv_format_184_0= ruleFormatTypes ) ) (otherlv_185= ',' )? ) ) ) )
            	    {
            	    // InternalDraft7.g:1942:4: ({...}? => ( ({...}? => (otherlv_182= '\"format\"' otherlv_183= ':' ( (lv_format_184_0= ruleFormatTypes ) ) (otherlv_185= ',' )? ) ) ) )
            	    // InternalDraft7.g:1943:5: {...}? => ( ({...}? => (otherlv_182= '\"format\"' otherlv_183= ':' ( (lv_format_184_0= ruleFormatTypes ) ) (otherlv_185= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 35) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 35)");
            	    }
            	    // InternalDraft7.g:1943:104: ( ({...}? => (otherlv_182= '\"format\"' otherlv_183= ':' ( (lv_format_184_0= ruleFormatTypes ) ) (otherlv_185= ',' )? ) ) )
            	    // InternalDraft7.g:1944:6: ({...}? => (otherlv_182= '\"format\"' otherlv_183= ':' ( (lv_format_184_0= ruleFormatTypes ) ) (otherlv_185= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 35);
            	    					
            	    // InternalDraft7.g:1947:9: ({...}? => (otherlv_182= '\"format\"' otherlv_183= ':' ( (lv_format_184_0= ruleFormatTypes ) ) (otherlv_185= ',' )? ) )
            	    // InternalDraft7.g:1947:10: {...}? => (otherlv_182= '\"format\"' otherlv_183= ':' ( (lv_format_184_0= ruleFormatTypes ) ) (otherlv_185= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalDraft7.g:1947:19: (otherlv_182= '\"format\"' otherlv_183= ':' ( (lv_format_184_0= ruleFormatTypes ) ) (otherlv_185= ',' )? )
            	    // InternalDraft7.g:1947:20: otherlv_182= '\"format\"' otherlv_183= ':' ( (lv_format_184_0= ruleFormatTypes ) ) (otherlv_185= ',' )?
            	    {
            	    otherlv_182=(Token)match(input,52,FOLLOW_4); 

            	    									newLeafNode(otherlv_182, grammarAccess.getSchemaAccess().getFormatKeyword_2_35_0());
            	    								
            	    otherlv_183=(Token)match(input,13,FOLLOW_22); 

            	    									newLeafNode(otherlv_183, grammarAccess.getSchemaAccess().getColonKeyword_2_35_1());
            	    								
            	    // InternalDraft7.g:1955:9: ( (lv_format_184_0= ruleFormatTypes ) )
            	    // InternalDraft7.g:1956:10: (lv_format_184_0= ruleFormatTypes )
            	    {
            	    // InternalDraft7.g:1956:10: (lv_format_184_0= ruleFormatTypes )
            	    // InternalDraft7.g:1957:11: lv_format_184_0= ruleFormatTypes
            	    {

            	    											newCompositeNode(grammarAccess.getSchemaAccess().getFormatFormatTypesEnumRuleCall_2_35_2_0());
            	    										
            	    pushFollow(FOLLOW_6);
            	    lv_format_184_0=ruleFormatTypes();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    											}
            	    											set(
            	    												current,
            	    												"format",
            	    												lv_format_184_0,
            	    												"org.xtext.json.schema.Draft7.FormatTypes");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalDraft7.g:1974:9: (otherlv_185= ',' )?
            	    int alt46=2;
            	    int LA46_0 = input.LA(1);

            	    if ( (LA46_0==14) ) {
            	        alt46=1;
            	    }
            	    switch (alt46) {
            	        case 1 :
            	            // InternalDraft7.g:1975:10: otherlv_185= ','
            	            {
            	            otherlv_185=(Token)match(input,14,FOLLOW_3); 

            	            										newLeafNode(otherlv_185, grammarAccess.getSchemaAccess().getCommaKeyword_2_35_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSchemaAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 37 :
            	    // InternalDraft7.g:1986:4: ({...}? => ( ({...}? => (otherlv_186= '\"contentMediaType\"' otherlv_187= ':' ( (lv_mediaType_188_0= ruleAnyString ) ) (otherlv_189= ',' )? ) ) ) )
            	    {
            	    // InternalDraft7.g:1986:4: ({...}? => ( ({...}? => (otherlv_186= '\"contentMediaType\"' otherlv_187= ':' ( (lv_mediaType_188_0= ruleAnyString ) ) (otherlv_189= ',' )? ) ) ) )
            	    // InternalDraft7.g:1987:5: {...}? => ( ({...}? => (otherlv_186= '\"contentMediaType\"' otherlv_187= ':' ( (lv_mediaType_188_0= ruleAnyString ) ) (otherlv_189= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 36) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 36)");
            	    }
            	    // InternalDraft7.g:1987:104: ( ({...}? => (otherlv_186= '\"contentMediaType\"' otherlv_187= ':' ( (lv_mediaType_188_0= ruleAnyString ) ) (otherlv_189= ',' )? ) ) )
            	    // InternalDraft7.g:1988:6: ({...}? => (otherlv_186= '\"contentMediaType\"' otherlv_187= ':' ( (lv_mediaType_188_0= ruleAnyString ) ) (otherlv_189= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 36);
            	    					
            	    // InternalDraft7.g:1991:9: ({...}? => (otherlv_186= '\"contentMediaType\"' otherlv_187= ':' ( (lv_mediaType_188_0= ruleAnyString ) ) (otherlv_189= ',' )? ) )
            	    // InternalDraft7.g:1991:10: {...}? => (otherlv_186= '\"contentMediaType\"' otherlv_187= ':' ( (lv_mediaType_188_0= ruleAnyString ) ) (otherlv_189= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalDraft7.g:1991:19: (otherlv_186= '\"contentMediaType\"' otherlv_187= ':' ( (lv_mediaType_188_0= ruleAnyString ) ) (otherlv_189= ',' )? )
            	    // InternalDraft7.g:1991:20: otherlv_186= '\"contentMediaType\"' otherlv_187= ':' ( (lv_mediaType_188_0= ruleAnyString ) ) (otherlv_189= ',' )?
            	    {
            	    otherlv_186=(Token)match(input,53,FOLLOW_4); 

            	    									newLeafNode(otherlv_186, grammarAccess.getSchemaAccess().getContentMediaTypeKeyword_2_36_0());
            	    								
            	    otherlv_187=(Token)match(input,13,FOLLOW_8); 

            	    									newLeafNode(otherlv_187, grammarAccess.getSchemaAccess().getColonKeyword_2_36_1());
            	    								
            	    // InternalDraft7.g:1999:9: ( (lv_mediaType_188_0= ruleAnyString ) )
            	    // InternalDraft7.g:2000:10: (lv_mediaType_188_0= ruleAnyString )
            	    {
            	    // InternalDraft7.g:2000:10: (lv_mediaType_188_0= ruleAnyString )
            	    // InternalDraft7.g:2001:11: lv_mediaType_188_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getSchemaAccess().getMediaTypeAnyStringParserRuleCall_2_36_2_0());
            	    										
            	    pushFollow(FOLLOW_6);
            	    lv_mediaType_188_0=ruleAnyString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    											}
            	    											set(
            	    												current,
            	    												"mediaType",
            	    												lv_mediaType_188_0,
            	    												"org.xtext.json.schema.Draft7.AnyString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalDraft7.g:2018:9: (otherlv_189= ',' )?
            	    int alt47=2;
            	    int LA47_0 = input.LA(1);

            	    if ( (LA47_0==14) ) {
            	        alt47=1;
            	    }
            	    switch (alt47) {
            	        case 1 :
            	            // InternalDraft7.g:2019:10: otherlv_189= ','
            	            {
            	            otherlv_189=(Token)match(input,14,FOLLOW_3); 

            	            										newLeafNode(otherlv_189, grammarAccess.getSchemaAccess().getCommaKeyword_2_36_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSchemaAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 38 :
            	    // InternalDraft7.g:2030:4: ({...}? => ( ({...}? => (otherlv_190= '\"contentEncoding\"' otherlv_191= ':' ( (lv_encoding_192_0= ruleAnyString ) ) (otherlv_193= ',' )? ) ) ) )
            	    {
            	    // InternalDraft7.g:2030:4: ({...}? => ( ({...}? => (otherlv_190= '\"contentEncoding\"' otherlv_191= ':' ( (lv_encoding_192_0= ruleAnyString ) ) (otherlv_193= ',' )? ) ) ) )
            	    // InternalDraft7.g:2031:5: {...}? => ( ({...}? => (otherlv_190= '\"contentEncoding\"' otherlv_191= ':' ( (lv_encoding_192_0= ruleAnyString ) ) (otherlv_193= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 37) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 37)");
            	    }
            	    // InternalDraft7.g:2031:104: ( ({...}? => (otherlv_190= '\"contentEncoding\"' otherlv_191= ':' ( (lv_encoding_192_0= ruleAnyString ) ) (otherlv_193= ',' )? ) ) )
            	    // InternalDraft7.g:2032:6: ({...}? => (otherlv_190= '\"contentEncoding\"' otherlv_191= ':' ( (lv_encoding_192_0= ruleAnyString ) ) (otherlv_193= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 37);
            	    					
            	    // InternalDraft7.g:2035:9: ({...}? => (otherlv_190= '\"contentEncoding\"' otherlv_191= ':' ( (lv_encoding_192_0= ruleAnyString ) ) (otherlv_193= ',' )? ) )
            	    // InternalDraft7.g:2035:10: {...}? => (otherlv_190= '\"contentEncoding\"' otherlv_191= ':' ( (lv_encoding_192_0= ruleAnyString ) ) (otherlv_193= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalDraft7.g:2035:19: (otherlv_190= '\"contentEncoding\"' otherlv_191= ':' ( (lv_encoding_192_0= ruleAnyString ) ) (otherlv_193= ',' )? )
            	    // InternalDraft7.g:2035:20: otherlv_190= '\"contentEncoding\"' otherlv_191= ':' ( (lv_encoding_192_0= ruleAnyString ) ) (otherlv_193= ',' )?
            	    {
            	    otherlv_190=(Token)match(input,54,FOLLOW_4); 

            	    									newLeafNode(otherlv_190, grammarAccess.getSchemaAccess().getContentEncodingKeyword_2_37_0());
            	    								
            	    otherlv_191=(Token)match(input,13,FOLLOW_8); 

            	    									newLeafNode(otherlv_191, grammarAccess.getSchemaAccess().getColonKeyword_2_37_1());
            	    								
            	    // InternalDraft7.g:2043:9: ( (lv_encoding_192_0= ruleAnyString ) )
            	    // InternalDraft7.g:2044:10: (lv_encoding_192_0= ruleAnyString )
            	    {
            	    // InternalDraft7.g:2044:10: (lv_encoding_192_0= ruleAnyString )
            	    // InternalDraft7.g:2045:11: lv_encoding_192_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getSchemaAccess().getEncodingAnyStringParserRuleCall_2_37_2_0());
            	    										
            	    pushFollow(FOLLOW_6);
            	    lv_encoding_192_0=ruleAnyString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    											}
            	    											set(
            	    												current,
            	    												"encoding",
            	    												lv_encoding_192_0,
            	    												"org.xtext.json.schema.Draft7.AnyString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalDraft7.g:2062:9: (otherlv_193= ',' )?
            	    int alt48=2;
            	    int LA48_0 = input.LA(1);

            	    if ( (LA48_0==14) ) {
            	        alt48=1;
            	    }
            	    switch (alt48) {
            	        case 1 :
            	            // InternalDraft7.g:2063:10: otherlv_193= ','
            	            {
            	            otherlv_193=(Token)match(input,14,FOLLOW_3); 

            	            										newLeafNode(otherlv_193, grammarAccess.getSchemaAccess().getCommaKeyword_2_37_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSchemaAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 39 :
            	    // InternalDraft7.g:2074:4: ({...}? => ( ({...}? => (otherlv_194= '\"multiples\"' otherlv_195= ':' ( (lv_multipleOf_196_0= RULE_INT ) ) (otherlv_197= ',' )? ) ) ) )
            	    {
            	    // InternalDraft7.g:2074:4: ({...}? => ( ({...}? => (otherlv_194= '\"multiples\"' otherlv_195= ':' ( (lv_multipleOf_196_0= RULE_INT ) ) (otherlv_197= ',' )? ) ) ) )
            	    // InternalDraft7.g:2075:5: {...}? => ( ({...}? => (otherlv_194= '\"multiples\"' otherlv_195= ':' ( (lv_multipleOf_196_0= RULE_INT ) ) (otherlv_197= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 38) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 38)");
            	    }
            	    // InternalDraft7.g:2075:104: ( ({...}? => (otherlv_194= '\"multiples\"' otherlv_195= ':' ( (lv_multipleOf_196_0= RULE_INT ) ) (otherlv_197= ',' )? ) ) )
            	    // InternalDraft7.g:2076:6: ({...}? => (otherlv_194= '\"multiples\"' otherlv_195= ':' ( (lv_multipleOf_196_0= RULE_INT ) ) (otherlv_197= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 38);
            	    					
            	    // InternalDraft7.g:2079:9: ({...}? => (otherlv_194= '\"multiples\"' otherlv_195= ':' ( (lv_multipleOf_196_0= RULE_INT ) ) (otherlv_197= ',' )? ) )
            	    // InternalDraft7.g:2079:10: {...}? => (otherlv_194= '\"multiples\"' otherlv_195= ':' ( (lv_multipleOf_196_0= RULE_INT ) ) (otherlv_197= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalDraft7.g:2079:19: (otherlv_194= '\"multiples\"' otherlv_195= ':' ( (lv_multipleOf_196_0= RULE_INT ) ) (otherlv_197= ',' )? )
            	    // InternalDraft7.g:2079:20: otherlv_194= '\"multiples\"' otherlv_195= ':' ( (lv_multipleOf_196_0= RULE_INT ) ) (otherlv_197= ',' )?
            	    {
            	    otherlv_194=(Token)match(input,55,FOLLOW_4); 

            	    									newLeafNode(otherlv_194, grammarAccess.getSchemaAccess().getMultiplesKeyword_2_38_0());
            	    								
            	    otherlv_195=(Token)match(input,13,FOLLOW_21); 

            	    									newLeafNode(otherlv_195, grammarAccess.getSchemaAccess().getColonKeyword_2_38_1());
            	    								
            	    // InternalDraft7.g:2087:9: ( (lv_multipleOf_196_0= RULE_INT ) )
            	    // InternalDraft7.g:2088:10: (lv_multipleOf_196_0= RULE_INT )
            	    {
            	    // InternalDraft7.g:2088:10: (lv_multipleOf_196_0= RULE_INT )
            	    // InternalDraft7.g:2089:11: lv_multipleOf_196_0= RULE_INT
            	    {
            	    lv_multipleOf_196_0=(Token)match(input,RULE_INT,FOLLOW_6); 

            	    											newLeafNode(lv_multipleOf_196_0, grammarAccess.getSchemaAccess().getMultipleOfINTTerminalRuleCall_2_38_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getSchemaRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"multipleOf",
            	    												lv_multipleOf_196_0,
            	    												"org.eclipse.xtext.common.Terminals.INT");
            	    										

            	    }


            	    }

            	    // InternalDraft7.g:2105:9: (otherlv_197= ',' )?
            	    int alt49=2;
            	    int LA49_0 = input.LA(1);

            	    if ( (LA49_0==14) ) {
            	        alt49=1;
            	    }
            	    switch (alt49) {
            	        case 1 :
            	            // InternalDraft7.g:2106:10: otherlv_197= ','
            	            {
            	            otherlv_197=(Token)match(input,14,FOLLOW_3); 

            	            										newLeafNode(otherlv_197, grammarAccess.getSchemaAccess().getCommaKeyword_2_38_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSchemaAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 40 :
            	    // InternalDraft7.g:2117:4: ({...}? => ( ({...}? => (otherlv_198= '\"minimum\"' otherlv_199= ':' ( (lv_minimum_200_0= ruleNumber ) ) (otherlv_201= ',' )? ) ) ) )
            	    {
            	    // InternalDraft7.g:2117:4: ({...}? => ( ({...}? => (otherlv_198= '\"minimum\"' otherlv_199= ':' ( (lv_minimum_200_0= ruleNumber ) ) (otherlv_201= ',' )? ) ) ) )
            	    // InternalDraft7.g:2118:5: {...}? => ( ({...}? => (otherlv_198= '\"minimum\"' otherlv_199= ':' ( (lv_minimum_200_0= ruleNumber ) ) (otherlv_201= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 39) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 39)");
            	    }
            	    // InternalDraft7.g:2118:104: ( ({...}? => (otherlv_198= '\"minimum\"' otherlv_199= ':' ( (lv_minimum_200_0= ruleNumber ) ) (otherlv_201= ',' )? ) ) )
            	    // InternalDraft7.g:2119:6: ({...}? => (otherlv_198= '\"minimum\"' otherlv_199= ':' ( (lv_minimum_200_0= ruleNumber ) ) (otherlv_201= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 39);
            	    					
            	    // InternalDraft7.g:2122:9: ({...}? => (otherlv_198= '\"minimum\"' otherlv_199= ':' ( (lv_minimum_200_0= ruleNumber ) ) (otherlv_201= ',' )? ) )
            	    // InternalDraft7.g:2122:10: {...}? => (otherlv_198= '\"minimum\"' otherlv_199= ':' ( (lv_minimum_200_0= ruleNumber ) ) (otherlv_201= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalDraft7.g:2122:19: (otherlv_198= '\"minimum\"' otherlv_199= ':' ( (lv_minimum_200_0= ruleNumber ) ) (otherlv_201= ',' )? )
            	    // InternalDraft7.g:2122:20: otherlv_198= '\"minimum\"' otherlv_199= ':' ( (lv_minimum_200_0= ruleNumber ) ) (otherlv_201= ',' )?
            	    {
            	    otherlv_198=(Token)match(input,56,FOLLOW_4); 

            	    									newLeafNode(otherlv_198, grammarAccess.getSchemaAccess().getMinimumKeyword_2_39_0());
            	    								
            	    otherlv_199=(Token)match(input,13,FOLLOW_21); 

            	    									newLeafNode(otherlv_199, grammarAccess.getSchemaAccess().getColonKeyword_2_39_1());
            	    								
            	    // InternalDraft7.g:2130:9: ( (lv_minimum_200_0= ruleNumber ) )
            	    // InternalDraft7.g:2131:10: (lv_minimum_200_0= ruleNumber )
            	    {
            	    // InternalDraft7.g:2131:10: (lv_minimum_200_0= ruleNumber )
            	    // InternalDraft7.g:2132:11: lv_minimum_200_0= ruleNumber
            	    {

            	    											newCompositeNode(grammarAccess.getSchemaAccess().getMinimumNumberParserRuleCall_2_39_2_0());
            	    										
            	    pushFollow(FOLLOW_6);
            	    lv_minimum_200_0=ruleNumber();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    											}
            	    											set(
            	    												current,
            	    												"minimum",
            	    												lv_minimum_200_0,
            	    												"org.xtext.json.schema.Draft7.Number");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalDraft7.g:2149:9: (otherlv_201= ',' )?
            	    int alt50=2;
            	    int LA50_0 = input.LA(1);

            	    if ( (LA50_0==14) ) {
            	        alt50=1;
            	    }
            	    switch (alt50) {
            	        case 1 :
            	            // InternalDraft7.g:2150:10: otherlv_201= ','
            	            {
            	            otherlv_201=(Token)match(input,14,FOLLOW_3); 

            	            										newLeafNode(otherlv_201, grammarAccess.getSchemaAccess().getCommaKeyword_2_39_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSchemaAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 41 :
            	    // InternalDraft7.g:2161:4: ({...}? => ( ({...}? => (otherlv_202= '\"exclusiveMinimum\"' otherlv_203= ':' ( (lv_exclusiveMinimum_204_0= ruleNumber ) ) (otherlv_205= ',' )? ) ) ) )
            	    {
            	    // InternalDraft7.g:2161:4: ({...}? => ( ({...}? => (otherlv_202= '\"exclusiveMinimum\"' otherlv_203= ':' ( (lv_exclusiveMinimum_204_0= ruleNumber ) ) (otherlv_205= ',' )? ) ) ) )
            	    // InternalDraft7.g:2162:5: {...}? => ( ({...}? => (otherlv_202= '\"exclusiveMinimum\"' otherlv_203= ':' ( (lv_exclusiveMinimum_204_0= ruleNumber ) ) (otherlv_205= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 40) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 40)");
            	    }
            	    // InternalDraft7.g:2162:104: ( ({...}? => (otherlv_202= '\"exclusiveMinimum\"' otherlv_203= ':' ( (lv_exclusiveMinimum_204_0= ruleNumber ) ) (otherlv_205= ',' )? ) ) )
            	    // InternalDraft7.g:2163:6: ({...}? => (otherlv_202= '\"exclusiveMinimum\"' otherlv_203= ':' ( (lv_exclusiveMinimum_204_0= ruleNumber ) ) (otherlv_205= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 40);
            	    					
            	    // InternalDraft7.g:2166:9: ({...}? => (otherlv_202= '\"exclusiveMinimum\"' otherlv_203= ':' ( (lv_exclusiveMinimum_204_0= ruleNumber ) ) (otherlv_205= ',' )? ) )
            	    // InternalDraft7.g:2166:10: {...}? => (otherlv_202= '\"exclusiveMinimum\"' otherlv_203= ':' ( (lv_exclusiveMinimum_204_0= ruleNumber ) ) (otherlv_205= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalDraft7.g:2166:19: (otherlv_202= '\"exclusiveMinimum\"' otherlv_203= ':' ( (lv_exclusiveMinimum_204_0= ruleNumber ) ) (otherlv_205= ',' )? )
            	    // InternalDraft7.g:2166:20: otherlv_202= '\"exclusiveMinimum\"' otherlv_203= ':' ( (lv_exclusiveMinimum_204_0= ruleNumber ) ) (otherlv_205= ',' )?
            	    {
            	    otherlv_202=(Token)match(input,57,FOLLOW_4); 

            	    									newLeafNode(otherlv_202, grammarAccess.getSchemaAccess().getExclusiveMinimumKeyword_2_40_0());
            	    								
            	    otherlv_203=(Token)match(input,13,FOLLOW_21); 

            	    									newLeafNode(otherlv_203, grammarAccess.getSchemaAccess().getColonKeyword_2_40_1());
            	    								
            	    // InternalDraft7.g:2174:9: ( (lv_exclusiveMinimum_204_0= ruleNumber ) )
            	    // InternalDraft7.g:2175:10: (lv_exclusiveMinimum_204_0= ruleNumber )
            	    {
            	    // InternalDraft7.g:2175:10: (lv_exclusiveMinimum_204_0= ruleNumber )
            	    // InternalDraft7.g:2176:11: lv_exclusiveMinimum_204_0= ruleNumber
            	    {

            	    											newCompositeNode(grammarAccess.getSchemaAccess().getExclusiveMinimumNumberParserRuleCall_2_40_2_0());
            	    										
            	    pushFollow(FOLLOW_6);
            	    lv_exclusiveMinimum_204_0=ruleNumber();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    											}
            	    											set(
            	    												current,
            	    												"exclusiveMinimum",
            	    												lv_exclusiveMinimum_204_0,
            	    												"org.xtext.json.schema.Draft7.Number");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalDraft7.g:2193:9: (otherlv_205= ',' )?
            	    int alt51=2;
            	    int LA51_0 = input.LA(1);

            	    if ( (LA51_0==14) ) {
            	        alt51=1;
            	    }
            	    switch (alt51) {
            	        case 1 :
            	            // InternalDraft7.g:2194:10: otherlv_205= ','
            	            {
            	            otherlv_205=(Token)match(input,14,FOLLOW_3); 

            	            										newLeafNode(otherlv_205, grammarAccess.getSchemaAccess().getCommaKeyword_2_40_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSchemaAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 42 :
            	    // InternalDraft7.g:2205:4: ({...}? => ( ({...}? => (otherlv_206= '\"maximum\"' otherlv_207= ':' ( (lv_maximum_208_0= ruleNumber ) ) (otherlv_209= ',' )? ) ) ) )
            	    {
            	    // InternalDraft7.g:2205:4: ({...}? => ( ({...}? => (otherlv_206= '\"maximum\"' otherlv_207= ':' ( (lv_maximum_208_0= ruleNumber ) ) (otherlv_209= ',' )? ) ) ) )
            	    // InternalDraft7.g:2206:5: {...}? => ( ({...}? => (otherlv_206= '\"maximum\"' otherlv_207= ':' ( (lv_maximum_208_0= ruleNumber ) ) (otherlv_209= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 41) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 41)");
            	    }
            	    // InternalDraft7.g:2206:104: ( ({...}? => (otherlv_206= '\"maximum\"' otherlv_207= ':' ( (lv_maximum_208_0= ruleNumber ) ) (otherlv_209= ',' )? ) ) )
            	    // InternalDraft7.g:2207:6: ({...}? => (otherlv_206= '\"maximum\"' otherlv_207= ':' ( (lv_maximum_208_0= ruleNumber ) ) (otherlv_209= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 41);
            	    					
            	    // InternalDraft7.g:2210:9: ({...}? => (otherlv_206= '\"maximum\"' otherlv_207= ':' ( (lv_maximum_208_0= ruleNumber ) ) (otherlv_209= ',' )? ) )
            	    // InternalDraft7.g:2210:10: {...}? => (otherlv_206= '\"maximum\"' otherlv_207= ':' ( (lv_maximum_208_0= ruleNumber ) ) (otherlv_209= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalDraft7.g:2210:19: (otherlv_206= '\"maximum\"' otherlv_207= ':' ( (lv_maximum_208_0= ruleNumber ) ) (otherlv_209= ',' )? )
            	    // InternalDraft7.g:2210:20: otherlv_206= '\"maximum\"' otherlv_207= ':' ( (lv_maximum_208_0= ruleNumber ) ) (otherlv_209= ',' )?
            	    {
            	    otherlv_206=(Token)match(input,58,FOLLOW_4); 

            	    									newLeafNode(otherlv_206, grammarAccess.getSchemaAccess().getMaximumKeyword_2_41_0());
            	    								
            	    otherlv_207=(Token)match(input,13,FOLLOW_21); 

            	    									newLeafNode(otherlv_207, grammarAccess.getSchemaAccess().getColonKeyword_2_41_1());
            	    								
            	    // InternalDraft7.g:2218:9: ( (lv_maximum_208_0= ruleNumber ) )
            	    // InternalDraft7.g:2219:10: (lv_maximum_208_0= ruleNumber )
            	    {
            	    // InternalDraft7.g:2219:10: (lv_maximum_208_0= ruleNumber )
            	    // InternalDraft7.g:2220:11: lv_maximum_208_0= ruleNumber
            	    {

            	    											newCompositeNode(grammarAccess.getSchemaAccess().getMaximumNumberParserRuleCall_2_41_2_0());
            	    										
            	    pushFollow(FOLLOW_6);
            	    lv_maximum_208_0=ruleNumber();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    											}
            	    											set(
            	    												current,
            	    												"maximum",
            	    												lv_maximum_208_0,
            	    												"org.xtext.json.schema.Draft7.Number");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalDraft7.g:2237:9: (otherlv_209= ',' )?
            	    int alt52=2;
            	    int LA52_0 = input.LA(1);

            	    if ( (LA52_0==14) ) {
            	        alt52=1;
            	    }
            	    switch (alt52) {
            	        case 1 :
            	            // InternalDraft7.g:2238:10: otherlv_209= ','
            	            {
            	            otherlv_209=(Token)match(input,14,FOLLOW_3); 

            	            										newLeafNode(otherlv_209, grammarAccess.getSchemaAccess().getCommaKeyword_2_41_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSchemaAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 43 :
            	    // InternalDraft7.g:2249:4: ({...}? => ( ({...}? => (otherlv_210= '\"exclusiveMaximum\"' otherlv_211= ':' ( (lv_exclusiveMaximum_212_0= ruleNumber ) ) (otherlv_213= ',' )? ) ) ) )
            	    {
            	    // InternalDraft7.g:2249:4: ({...}? => ( ({...}? => (otherlv_210= '\"exclusiveMaximum\"' otherlv_211= ':' ( (lv_exclusiveMaximum_212_0= ruleNumber ) ) (otherlv_213= ',' )? ) ) ) )
            	    // InternalDraft7.g:2250:5: {...}? => ( ({...}? => (otherlv_210= '\"exclusiveMaximum\"' otherlv_211= ':' ( (lv_exclusiveMaximum_212_0= ruleNumber ) ) (otherlv_213= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 42) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 42)");
            	    }
            	    // InternalDraft7.g:2250:104: ( ({...}? => (otherlv_210= '\"exclusiveMaximum\"' otherlv_211= ':' ( (lv_exclusiveMaximum_212_0= ruleNumber ) ) (otherlv_213= ',' )? ) ) )
            	    // InternalDraft7.g:2251:6: ({...}? => (otherlv_210= '\"exclusiveMaximum\"' otherlv_211= ':' ( (lv_exclusiveMaximum_212_0= ruleNumber ) ) (otherlv_213= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 42);
            	    					
            	    // InternalDraft7.g:2254:9: ({...}? => (otherlv_210= '\"exclusiveMaximum\"' otherlv_211= ':' ( (lv_exclusiveMaximum_212_0= ruleNumber ) ) (otherlv_213= ',' )? ) )
            	    // InternalDraft7.g:2254:10: {...}? => (otherlv_210= '\"exclusiveMaximum\"' otherlv_211= ':' ( (lv_exclusiveMaximum_212_0= ruleNumber ) ) (otherlv_213= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalDraft7.g:2254:19: (otherlv_210= '\"exclusiveMaximum\"' otherlv_211= ':' ( (lv_exclusiveMaximum_212_0= ruleNumber ) ) (otherlv_213= ',' )? )
            	    // InternalDraft7.g:2254:20: otherlv_210= '\"exclusiveMaximum\"' otherlv_211= ':' ( (lv_exclusiveMaximum_212_0= ruleNumber ) ) (otherlv_213= ',' )?
            	    {
            	    otherlv_210=(Token)match(input,59,FOLLOW_4); 

            	    									newLeafNode(otherlv_210, grammarAccess.getSchemaAccess().getExclusiveMaximumKeyword_2_42_0());
            	    								
            	    otherlv_211=(Token)match(input,13,FOLLOW_21); 

            	    									newLeafNode(otherlv_211, grammarAccess.getSchemaAccess().getColonKeyword_2_42_1());
            	    								
            	    // InternalDraft7.g:2262:9: ( (lv_exclusiveMaximum_212_0= ruleNumber ) )
            	    // InternalDraft7.g:2263:10: (lv_exclusiveMaximum_212_0= ruleNumber )
            	    {
            	    // InternalDraft7.g:2263:10: (lv_exclusiveMaximum_212_0= ruleNumber )
            	    // InternalDraft7.g:2264:11: lv_exclusiveMaximum_212_0= ruleNumber
            	    {

            	    											newCompositeNode(grammarAccess.getSchemaAccess().getExclusiveMaximumNumberParserRuleCall_2_42_2_0());
            	    										
            	    pushFollow(FOLLOW_6);
            	    lv_exclusiveMaximum_212_0=ruleNumber();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    											}
            	    											set(
            	    												current,
            	    												"exclusiveMaximum",
            	    												lv_exclusiveMaximum_212_0,
            	    												"org.xtext.json.schema.Draft7.Number");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalDraft7.g:2281:9: (otherlv_213= ',' )?
            	    int alt53=2;
            	    int LA53_0 = input.LA(1);

            	    if ( (LA53_0==14) ) {
            	        alt53=1;
            	    }
            	    switch (alt53) {
            	        case 1 :
            	            // InternalDraft7.g:2282:10: otherlv_213= ','
            	            {
            	            otherlv_213=(Token)match(input,14,FOLLOW_3); 

            	            										newLeafNode(otherlv_213, grammarAccess.getSchemaAccess().getCommaKeyword_2_42_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSchemaAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getSchemaAccess().getUnorderedGroup_2());
            				

            }

            otherlv_214=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_214, grammarAccess.getSchemaAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleSchema"


    // $ANTLR start "entryRuleDependencies"
    // InternalDraft7.g:2308:1: entryRuleDependencies returns [EObject current=null] : iv_ruleDependencies= ruleDependencies EOF ;
    public final EObject entryRuleDependencies() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependencies = null;


        try {
            // InternalDraft7.g:2308:53: (iv_ruleDependencies= ruleDependencies EOF )
            // InternalDraft7.g:2309:2: iv_ruleDependencies= ruleDependencies EOF
            {
             newCompositeNode(grammarAccess.getDependenciesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDependencies=ruleDependencies();

            state._fsp--;

             current =iv_ruleDependencies; 
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
    // $ANTLR end "entryRuleDependencies"


    // $ANTLR start "ruleDependencies"
    // InternalDraft7.g:2315:1: ruleDependencies returns [EObject current=null] : ( ( (lv_PropertyDependency_0_0= rulePropertyDependency ) ) | ( ( (lv_schemaDependencies_1_0= ruleNamedSchema ) ) (otherlv_2= ',' ( (lv_schemaDependencies_3_0= ruleNamedSchema ) ) )* ) ) ;
    public final EObject ruleDependencies() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_PropertyDependency_0_0 = null;

        EObject lv_schemaDependencies_1_0 = null;

        EObject lv_schemaDependencies_3_0 = null;



        	enterRule();

        try {
            // InternalDraft7.g:2321:2: ( ( ( (lv_PropertyDependency_0_0= rulePropertyDependency ) ) | ( ( (lv_schemaDependencies_1_0= ruleNamedSchema ) ) (otherlv_2= ',' ( (lv_schemaDependencies_3_0= ruleNamedSchema ) ) )* ) ) )
            // InternalDraft7.g:2322:2: ( ( (lv_PropertyDependency_0_0= rulePropertyDependency ) ) | ( ( (lv_schemaDependencies_1_0= ruleNamedSchema ) ) (otherlv_2= ',' ( (lv_schemaDependencies_3_0= ruleNamedSchema ) ) )* ) )
            {
            // InternalDraft7.g:2322:2: ( ( (lv_PropertyDependency_0_0= rulePropertyDependency ) ) | ( ( (lv_schemaDependencies_1_0= ruleNamedSchema ) ) (otherlv_2= ',' ( (lv_schemaDependencies_3_0= ruleNamedSchema ) ) )* ) )
            int alt56=2;
            alt56 = dfa56.predict(input);
            switch (alt56) {
                case 1 :
                    // InternalDraft7.g:2323:3: ( (lv_PropertyDependency_0_0= rulePropertyDependency ) )
                    {
                    // InternalDraft7.g:2323:3: ( (lv_PropertyDependency_0_0= rulePropertyDependency ) )
                    // InternalDraft7.g:2324:4: (lv_PropertyDependency_0_0= rulePropertyDependency )
                    {
                    // InternalDraft7.g:2324:4: (lv_PropertyDependency_0_0= rulePropertyDependency )
                    // InternalDraft7.g:2325:5: lv_PropertyDependency_0_0= rulePropertyDependency
                    {

                    					newCompositeNode(grammarAccess.getDependenciesAccess().getPropertyDependencyPropertyDependencyParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_PropertyDependency_0_0=rulePropertyDependency();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDependenciesRule());
                    					}
                    					set(
                    						current,
                    						"PropertyDependency",
                    						lv_PropertyDependency_0_0,
                    						"org.xtext.json.schema.Draft7.PropertyDependency");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDraft7.g:2343:3: ( ( (lv_schemaDependencies_1_0= ruleNamedSchema ) ) (otherlv_2= ',' ( (lv_schemaDependencies_3_0= ruleNamedSchema ) ) )* )
                    {
                    // InternalDraft7.g:2343:3: ( ( (lv_schemaDependencies_1_0= ruleNamedSchema ) ) (otherlv_2= ',' ( (lv_schemaDependencies_3_0= ruleNamedSchema ) ) )* )
                    // InternalDraft7.g:2344:4: ( (lv_schemaDependencies_1_0= ruleNamedSchema ) ) (otherlv_2= ',' ( (lv_schemaDependencies_3_0= ruleNamedSchema ) ) )*
                    {
                    // InternalDraft7.g:2344:4: ( (lv_schemaDependencies_1_0= ruleNamedSchema ) )
                    // InternalDraft7.g:2345:5: (lv_schemaDependencies_1_0= ruleNamedSchema )
                    {
                    // InternalDraft7.g:2345:5: (lv_schemaDependencies_1_0= ruleNamedSchema )
                    // InternalDraft7.g:2346:6: lv_schemaDependencies_1_0= ruleNamedSchema
                    {

                    						newCompositeNode(grammarAccess.getDependenciesAccess().getSchemaDependenciesNamedSchemaParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_schemaDependencies_1_0=ruleNamedSchema();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDependenciesRule());
                    						}
                    						add(
                    							current,
                    							"schemaDependencies",
                    							lv_schemaDependencies_1_0,
                    							"org.xtext.json.schema.Draft7.NamedSchema");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDraft7.g:2363:4: (otherlv_2= ',' ( (lv_schemaDependencies_3_0= ruleNamedSchema ) ) )*
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==14) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // InternalDraft7.g:2364:5: otherlv_2= ',' ( (lv_schemaDependencies_3_0= ruleNamedSchema ) )
                    	    {
                    	    otherlv_2=(Token)match(input,14,FOLLOW_8); 

                    	    					newLeafNode(otherlv_2, grammarAccess.getDependenciesAccess().getCommaKeyword_1_1_0());
                    	    				
                    	    // InternalDraft7.g:2368:5: ( (lv_schemaDependencies_3_0= ruleNamedSchema ) )
                    	    // InternalDraft7.g:2369:6: (lv_schemaDependencies_3_0= ruleNamedSchema )
                    	    {
                    	    // InternalDraft7.g:2369:6: (lv_schemaDependencies_3_0= ruleNamedSchema )
                    	    // InternalDraft7.g:2370:7: lv_schemaDependencies_3_0= ruleNamedSchema
                    	    {

                    	    							newCompositeNode(grammarAccess.getDependenciesAccess().getSchemaDependenciesNamedSchemaParserRuleCall_1_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_23);
                    	    lv_schemaDependencies_3_0=ruleNamedSchema();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDependenciesRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"schemaDependencies",
                    	    								lv_schemaDependencies_3_0,
                    	    								"org.xtext.json.schema.Draft7.NamedSchema");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop55;
                        }
                    } while (true);


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
    // $ANTLR end "ruleDependencies"


    // $ANTLR start "entryRulePropertyDependency"
    // InternalDraft7.g:2393:1: entryRulePropertyDependency returns [EObject current=null] : iv_rulePropertyDependency= rulePropertyDependency EOF ;
    public final EObject entryRulePropertyDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyDependency = null;


        try {
            // InternalDraft7.g:2393:59: (iv_rulePropertyDependency= rulePropertyDependency EOF )
            // InternalDraft7.g:2394:2: iv_rulePropertyDependency= rulePropertyDependency EOF
            {
             newCompositeNode(grammarAccess.getPropertyDependencyRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePropertyDependency=rulePropertyDependency();

            state._fsp--;

             current =iv_rulePropertyDependency; 
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
    // $ANTLR end "entryRulePropertyDependency"


    // $ANTLR start "rulePropertyDependency"
    // InternalDraft7.g:2400:1: rulePropertyDependency returns [EObject current=null] : ( ( (lv_name_0_0= ruleAnyString ) ) otherlv_1= ':' otherlv_2= '[' ( (lv_dependencies_3_0= ruleAnyString ) ) (otherlv_4= ',' ( (lv_dependencies_5_0= ruleAnyString ) ) )* otherlv_6= ']' ) ;
    public final EObject rulePropertyDependency() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_name_0_0 = null;

        EObject lv_dependencies_3_0 = null;

        EObject lv_dependencies_5_0 = null;



        	enterRule();

        try {
            // InternalDraft7.g:2406:2: ( ( ( (lv_name_0_0= ruleAnyString ) ) otherlv_1= ':' otherlv_2= '[' ( (lv_dependencies_3_0= ruleAnyString ) ) (otherlv_4= ',' ( (lv_dependencies_5_0= ruleAnyString ) ) )* otherlv_6= ']' ) )
            // InternalDraft7.g:2407:2: ( ( (lv_name_0_0= ruleAnyString ) ) otherlv_1= ':' otherlv_2= '[' ( (lv_dependencies_3_0= ruleAnyString ) ) (otherlv_4= ',' ( (lv_dependencies_5_0= ruleAnyString ) ) )* otherlv_6= ']' )
            {
            // InternalDraft7.g:2407:2: ( ( (lv_name_0_0= ruleAnyString ) ) otherlv_1= ':' otherlv_2= '[' ( (lv_dependencies_3_0= ruleAnyString ) ) (otherlv_4= ',' ( (lv_dependencies_5_0= ruleAnyString ) ) )* otherlv_6= ']' )
            // InternalDraft7.g:2408:3: ( (lv_name_0_0= ruleAnyString ) ) otherlv_1= ':' otherlv_2= '[' ( (lv_dependencies_3_0= ruleAnyString ) ) (otherlv_4= ',' ( (lv_dependencies_5_0= ruleAnyString ) ) )* otherlv_6= ']'
            {
            // InternalDraft7.g:2408:3: ( (lv_name_0_0= ruleAnyString ) )
            // InternalDraft7.g:2409:4: (lv_name_0_0= ruleAnyString )
            {
            // InternalDraft7.g:2409:4: (lv_name_0_0= ruleAnyString )
            // InternalDraft7.g:2410:5: lv_name_0_0= ruleAnyString
            {

            					newCompositeNode(grammarAccess.getPropertyDependencyAccess().getNameAnyStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_0_0=ruleAnyString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPropertyDependencyRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.xtext.json.schema.Draft7.AnyString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getPropertyDependencyAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,27,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getPropertyDependencyAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalDraft7.g:2435:3: ( (lv_dependencies_3_0= ruleAnyString ) )
            // InternalDraft7.g:2436:4: (lv_dependencies_3_0= ruleAnyString )
            {
            // InternalDraft7.g:2436:4: (lv_dependencies_3_0= ruleAnyString )
            // InternalDraft7.g:2437:5: lv_dependencies_3_0= ruleAnyString
            {

            					newCompositeNode(grammarAccess.getPropertyDependencyAccess().getDependenciesAnyStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_17);
            lv_dependencies_3_0=ruleAnyString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPropertyDependencyRule());
            					}
            					add(
            						current,
            						"dependencies",
            						lv_dependencies_3_0,
            						"org.xtext.json.schema.Draft7.AnyString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDraft7.g:2454:3: (otherlv_4= ',' ( (lv_dependencies_5_0= ruleAnyString ) ) )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==14) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalDraft7.g:2455:4: otherlv_4= ',' ( (lv_dependencies_5_0= ruleAnyString ) )
            	    {
            	    otherlv_4=(Token)match(input,14,FOLLOW_8); 

            	    				newLeafNode(otherlv_4, grammarAccess.getPropertyDependencyAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalDraft7.g:2459:4: ( (lv_dependencies_5_0= ruleAnyString ) )
            	    // InternalDraft7.g:2460:5: (lv_dependencies_5_0= ruleAnyString )
            	    {
            	    // InternalDraft7.g:2460:5: (lv_dependencies_5_0= ruleAnyString )
            	    // InternalDraft7.g:2461:6: lv_dependencies_5_0= ruleAnyString
            	    {

            	    						newCompositeNode(grammarAccess.getPropertyDependencyAccess().getDependenciesAnyStringParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_dependencies_5_0=ruleAnyString();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPropertyDependencyRule());
            	    						}
            	    						add(
            	    							current,
            	    							"dependencies",
            	    							lv_dependencies_5_0,
            	    							"org.xtext.json.schema.Draft7.AnyString");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);

            otherlv_6=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getPropertyDependencyAccess().getRightSquareBracketKeyword_5());
            		

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
    // $ANTLR end "rulePropertyDependency"


    // $ANTLR start "entryRuleContains"
    // InternalDraft7.g:2487:1: entryRuleContains returns [EObject current=null] : iv_ruleContains= ruleContains EOF ;
    public final EObject entryRuleContains() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContains = null;


        try {
            // InternalDraft7.g:2487:49: (iv_ruleContains= ruleContains EOF )
            // InternalDraft7.g:2488:2: iv_ruleContains= ruleContains EOF
            {
             newCompositeNode(grammarAccess.getContainsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContains=ruleContains();

            state._fsp--;

             current =iv_ruleContains; 
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
    // $ANTLR end "entryRuleContains"


    // $ANTLR start "ruleContains"
    // InternalDraft7.g:2494:1: ruleContains returns [EObject current=null] : ( (otherlv_0= '[' ( (lv_containSchemas_1_0= ruleSchema ) ) (otherlv_2= ',' ( (lv_containSchemas_3_0= ruleSchema ) ) )* otherlv_4= ']' ) | (otherlv_5= '{' ( (lv_containSchemas_6_0= ruleSchema ) ) otherlv_7= '}' ) ) ;
    public final EObject ruleContains() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_containSchemas_1_0 = null;

        EObject lv_containSchemas_3_0 = null;

        EObject lv_containSchemas_6_0 = null;



        	enterRule();

        try {
            // InternalDraft7.g:2500:2: ( ( (otherlv_0= '[' ( (lv_containSchemas_1_0= ruleSchema ) ) (otherlv_2= ',' ( (lv_containSchemas_3_0= ruleSchema ) ) )* otherlv_4= ']' ) | (otherlv_5= '{' ( (lv_containSchemas_6_0= ruleSchema ) ) otherlv_7= '}' ) ) )
            // InternalDraft7.g:2501:2: ( (otherlv_0= '[' ( (lv_containSchemas_1_0= ruleSchema ) ) (otherlv_2= ',' ( (lv_containSchemas_3_0= ruleSchema ) ) )* otherlv_4= ']' ) | (otherlv_5= '{' ( (lv_containSchemas_6_0= ruleSchema ) ) otherlv_7= '}' ) )
            {
            // InternalDraft7.g:2501:2: ( (otherlv_0= '[' ( (lv_containSchemas_1_0= ruleSchema ) ) (otherlv_2= ',' ( (lv_containSchemas_3_0= ruleSchema ) ) )* otherlv_4= ']' ) | (otherlv_5= '{' ( (lv_containSchemas_6_0= ruleSchema ) ) otherlv_7= '}' ) )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==27) ) {
                alt59=1;
            }
            else if ( (LA59_0==11) ) {
                alt59=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // InternalDraft7.g:2502:3: (otherlv_0= '[' ( (lv_containSchemas_1_0= ruleSchema ) ) (otherlv_2= ',' ( (lv_containSchemas_3_0= ruleSchema ) ) )* otherlv_4= ']' )
                    {
                    // InternalDraft7.g:2502:3: (otherlv_0= '[' ( (lv_containSchemas_1_0= ruleSchema ) ) (otherlv_2= ',' ( (lv_containSchemas_3_0= ruleSchema ) ) )* otherlv_4= ']' )
                    // InternalDraft7.g:2503:4: otherlv_0= '[' ( (lv_containSchemas_1_0= ruleSchema ) ) (otherlv_2= ',' ( (lv_containSchemas_3_0= ruleSchema ) ) )* otherlv_4= ']'
                    {
                    otherlv_0=(Token)match(input,27,FOLLOW_10); 

                    				newLeafNode(otherlv_0, grammarAccess.getContainsAccess().getLeftSquareBracketKeyword_0_0());
                    			
                    // InternalDraft7.g:2507:4: ( (lv_containSchemas_1_0= ruleSchema ) )
                    // InternalDraft7.g:2508:5: (lv_containSchemas_1_0= ruleSchema )
                    {
                    // InternalDraft7.g:2508:5: (lv_containSchemas_1_0= ruleSchema )
                    // InternalDraft7.g:2509:6: lv_containSchemas_1_0= ruleSchema
                    {

                    						newCompositeNode(grammarAccess.getContainsAccess().getContainSchemasSchemaParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_containSchemas_1_0=ruleSchema();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getContainsRule());
                    						}
                    						add(
                    							current,
                    							"containSchemas",
                    							lv_containSchemas_1_0,
                    							"org.xtext.json.schema.Draft7.Schema");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDraft7.g:2526:4: (otherlv_2= ',' ( (lv_containSchemas_3_0= ruleSchema ) ) )*
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==14) ) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // InternalDraft7.g:2527:5: otherlv_2= ',' ( (lv_containSchemas_3_0= ruleSchema ) )
                    	    {
                    	    otherlv_2=(Token)match(input,14,FOLLOW_10); 

                    	    					newLeafNode(otherlv_2, grammarAccess.getContainsAccess().getCommaKeyword_0_2_0());
                    	    				
                    	    // InternalDraft7.g:2531:5: ( (lv_containSchemas_3_0= ruleSchema ) )
                    	    // InternalDraft7.g:2532:6: (lv_containSchemas_3_0= ruleSchema )
                    	    {
                    	    // InternalDraft7.g:2532:6: (lv_containSchemas_3_0= ruleSchema )
                    	    // InternalDraft7.g:2533:7: lv_containSchemas_3_0= ruleSchema
                    	    {

                    	    							newCompositeNode(grammarAccess.getContainsAccess().getContainSchemasSchemaParserRuleCall_0_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    lv_containSchemas_3_0=ruleSchema();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getContainsRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"containSchemas",
                    	    								lv_containSchemas_3_0,
                    	    								"org.xtext.json.schema.Draft7.Schema");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop58;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,28,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getContainsAccess().getRightSquareBracketKeyword_0_3());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDraft7.g:2557:3: (otherlv_5= '{' ( (lv_containSchemas_6_0= ruleSchema ) ) otherlv_7= '}' )
                    {
                    // InternalDraft7.g:2557:3: (otherlv_5= '{' ( (lv_containSchemas_6_0= ruleSchema ) ) otherlv_7= '}' )
                    // InternalDraft7.g:2558:4: otherlv_5= '{' ( (lv_containSchemas_6_0= ruleSchema ) ) otherlv_7= '}'
                    {
                    otherlv_5=(Token)match(input,11,FOLLOW_10); 

                    				newLeafNode(otherlv_5, grammarAccess.getContainsAccess().getLeftCurlyBracketKeyword_1_0());
                    			
                    // InternalDraft7.g:2562:4: ( (lv_containSchemas_6_0= ruleSchema ) )
                    // InternalDraft7.g:2563:5: (lv_containSchemas_6_0= ruleSchema )
                    {
                    // InternalDraft7.g:2563:5: (lv_containSchemas_6_0= ruleSchema )
                    // InternalDraft7.g:2564:6: lv_containSchemas_6_0= ruleSchema
                    {

                    						newCompositeNode(grammarAccess.getContainsAccess().getContainSchemasSchemaParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_containSchemas_6_0=ruleSchema();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getContainsRule());
                    						}
                    						add(
                    							current,
                    							"containSchemas",
                    							lv_containSchemas_6_0,
                    							"org.xtext.json.schema.Draft7.Schema");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getContainsAccess().getRightCurlyBracketKeyword_1_2());
                    			

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
    // $ANTLR end "ruleContains"


    // $ANTLR start "entryRuleItems"
    // InternalDraft7.g:2590:1: entryRuleItems returns [EObject current=null] : iv_ruleItems= ruleItems EOF ;
    public final EObject entryRuleItems() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItems = null;


        try {
            // InternalDraft7.g:2590:46: (iv_ruleItems= ruleItems EOF )
            // InternalDraft7.g:2591:2: iv_ruleItems= ruleItems EOF
            {
             newCompositeNode(grammarAccess.getItemsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleItems=ruleItems();

            state._fsp--;

             current =iv_ruleItems; 
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
    // $ANTLR end "entryRuleItems"


    // $ANTLR start "ruleItems"
    // InternalDraft7.g:2597:1: ruleItems returns [EObject current=null] : ( (otherlv_0= '[' ( (lv_items_1_0= ruleAbstractSchema ) ) (otherlv_2= ',' ( (lv_items_3_0= ruleAbstractSchema ) ) )* otherlv_4= ']' ) | ( (lv_items_5_0= ruleAbstractSchema ) ) | ( (lv_selfReference_6_0= ruleBoolean ) ) ) ;
    public final EObject ruleItems() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_items_1_0 = null;

        EObject lv_items_3_0 = null;

        EObject lv_items_5_0 = null;

        Enumerator lv_selfReference_6_0 = null;



        	enterRule();

        try {
            // InternalDraft7.g:2603:2: ( ( (otherlv_0= '[' ( (lv_items_1_0= ruleAbstractSchema ) ) (otherlv_2= ',' ( (lv_items_3_0= ruleAbstractSchema ) ) )* otherlv_4= ']' ) | ( (lv_items_5_0= ruleAbstractSchema ) ) | ( (lv_selfReference_6_0= ruleBoolean ) ) ) )
            // InternalDraft7.g:2604:2: ( (otherlv_0= '[' ( (lv_items_1_0= ruleAbstractSchema ) ) (otherlv_2= ',' ( (lv_items_3_0= ruleAbstractSchema ) ) )* otherlv_4= ']' ) | ( (lv_items_5_0= ruleAbstractSchema ) ) | ( (lv_selfReference_6_0= ruleBoolean ) ) )
            {
            // InternalDraft7.g:2604:2: ( (otherlv_0= '[' ( (lv_items_1_0= ruleAbstractSchema ) ) (otherlv_2= ',' ( (lv_items_3_0= ruleAbstractSchema ) ) )* otherlv_4= ']' ) | ( (lv_items_5_0= ruleAbstractSchema ) ) | ( (lv_selfReference_6_0= ruleBoolean ) ) )
            int alt61=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt61=1;
                }
                break;
            case 11:
                {
                alt61=2;
                }
                break;
            case 62:
            case 63:
                {
                alt61=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }

            switch (alt61) {
                case 1 :
                    // InternalDraft7.g:2605:3: (otherlv_0= '[' ( (lv_items_1_0= ruleAbstractSchema ) ) (otherlv_2= ',' ( (lv_items_3_0= ruleAbstractSchema ) ) )* otherlv_4= ']' )
                    {
                    // InternalDraft7.g:2605:3: (otherlv_0= '[' ( (lv_items_1_0= ruleAbstractSchema ) ) (otherlv_2= ',' ( (lv_items_3_0= ruleAbstractSchema ) ) )* otherlv_4= ']' )
                    // InternalDraft7.g:2606:4: otherlv_0= '[' ( (lv_items_1_0= ruleAbstractSchema ) ) (otherlv_2= ',' ( (lv_items_3_0= ruleAbstractSchema ) ) )* otherlv_4= ']'
                    {
                    otherlv_0=(Token)match(input,27,FOLLOW_10); 

                    				newLeafNode(otherlv_0, grammarAccess.getItemsAccess().getLeftSquareBracketKeyword_0_0());
                    			
                    // InternalDraft7.g:2610:4: ( (lv_items_1_0= ruleAbstractSchema ) )
                    // InternalDraft7.g:2611:5: (lv_items_1_0= ruleAbstractSchema )
                    {
                    // InternalDraft7.g:2611:5: (lv_items_1_0= ruleAbstractSchema )
                    // InternalDraft7.g:2612:6: lv_items_1_0= ruleAbstractSchema
                    {

                    						newCompositeNode(grammarAccess.getItemsAccess().getItemsAbstractSchemaParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_items_1_0=ruleAbstractSchema();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getItemsRule());
                    						}
                    						add(
                    							current,
                    							"items",
                    							lv_items_1_0,
                    							"org.xtext.json.schema.Draft7.AbstractSchema");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDraft7.g:2629:4: (otherlv_2= ',' ( (lv_items_3_0= ruleAbstractSchema ) ) )*
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( (LA60_0==14) ) {
                            alt60=1;
                        }


                        switch (alt60) {
                    	case 1 :
                    	    // InternalDraft7.g:2630:5: otherlv_2= ',' ( (lv_items_3_0= ruleAbstractSchema ) )
                    	    {
                    	    otherlv_2=(Token)match(input,14,FOLLOW_10); 

                    	    					newLeafNode(otherlv_2, grammarAccess.getItemsAccess().getCommaKeyword_0_2_0());
                    	    				
                    	    // InternalDraft7.g:2634:5: ( (lv_items_3_0= ruleAbstractSchema ) )
                    	    // InternalDraft7.g:2635:6: (lv_items_3_0= ruleAbstractSchema )
                    	    {
                    	    // InternalDraft7.g:2635:6: (lv_items_3_0= ruleAbstractSchema )
                    	    // InternalDraft7.g:2636:7: lv_items_3_0= ruleAbstractSchema
                    	    {

                    	    							newCompositeNode(grammarAccess.getItemsAccess().getItemsAbstractSchemaParserRuleCall_0_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    lv_items_3_0=ruleAbstractSchema();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getItemsRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"items",
                    	    								lv_items_3_0,
                    	    								"org.xtext.json.schema.Draft7.AbstractSchema");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop60;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,28,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getItemsAccess().getRightSquareBracketKeyword_0_3());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDraft7.g:2660:3: ( (lv_items_5_0= ruleAbstractSchema ) )
                    {
                    // InternalDraft7.g:2660:3: ( (lv_items_5_0= ruleAbstractSchema ) )
                    // InternalDraft7.g:2661:4: (lv_items_5_0= ruleAbstractSchema )
                    {
                    // InternalDraft7.g:2661:4: (lv_items_5_0= ruleAbstractSchema )
                    // InternalDraft7.g:2662:5: lv_items_5_0= ruleAbstractSchema
                    {

                    					newCompositeNode(grammarAccess.getItemsAccess().getItemsAbstractSchemaParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_items_5_0=ruleAbstractSchema();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getItemsRule());
                    					}
                    					add(
                    						current,
                    						"items",
                    						lv_items_5_0,
                    						"org.xtext.json.schema.Draft7.AbstractSchema");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalDraft7.g:2680:3: ( (lv_selfReference_6_0= ruleBoolean ) )
                    {
                    // InternalDraft7.g:2680:3: ( (lv_selfReference_6_0= ruleBoolean ) )
                    // InternalDraft7.g:2681:4: (lv_selfReference_6_0= ruleBoolean )
                    {
                    // InternalDraft7.g:2681:4: (lv_selfReference_6_0= ruleBoolean )
                    // InternalDraft7.g:2682:5: lv_selfReference_6_0= ruleBoolean
                    {

                    					newCompositeNode(grammarAccess.getItemsAccess().getSelfReferenceBooleanEnumRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_selfReference_6_0=ruleBoolean();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getItemsRule());
                    					}
                    					set(
                    						current,
                    						"selfReference",
                    						lv_selfReference_6_0,
                    						"org.xtext.json.schema.Draft7.Boolean");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleItems"


    // $ANTLR start "entryRuleAdditionalProperties"
    // InternalDraft7.g:2703:1: entryRuleAdditionalProperties returns [EObject current=null] : iv_ruleAdditionalProperties= ruleAdditionalProperties EOF ;
    public final EObject entryRuleAdditionalProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditionalProperties = null;


        try {
            // InternalDraft7.g:2703:61: (iv_ruleAdditionalProperties= ruleAdditionalProperties EOF )
            // InternalDraft7.g:2704:2: iv_ruleAdditionalProperties= ruleAdditionalProperties EOF
            {
             newCompositeNode(grammarAccess.getAdditionalPropertiesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAdditionalProperties=ruleAdditionalProperties();

            state._fsp--;

             current =iv_ruleAdditionalProperties; 
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
    // $ANTLR end "entryRuleAdditionalProperties"


    // $ANTLR start "ruleAdditionalProperties"
    // InternalDraft7.g:2710:1: ruleAdditionalProperties returns [EObject current=null] : ( ( (lv_allowedBoolean_0_0= ruleBoolean ) ) | ( (lv_schema_1_0= ruleAbstractSchema ) ) ) ;
    public final EObject ruleAdditionalProperties() throws RecognitionException {
        EObject current = null;

        Enumerator lv_allowedBoolean_0_0 = null;

        EObject lv_schema_1_0 = null;



        	enterRule();

        try {
            // InternalDraft7.g:2716:2: ( ( ( (lv_allowedBoolean_0_0= ruleBoolean ) ) | ( (lv_schema_1_0= ruleAbstractSchema ) ) ) )
            // InternalDraft7.g:2717:2: ( ( (lv_allowedBoolean_0_0= ruleBoolean ) ) | ( (lv_schema_1_0= ruleAbstractSchema ) ) )
            {
            // InternalDraft7.g:2717:2: ( ( (lv_allowedBoolean_0_0= ruleBoolean ) ) | ( (lv_schema_1_0= ruleAbstractSchema ) ) )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( ((LA62_0>=62 && LA62_0<=63)) ) {
                alt62=1;
            }
            else if ( (LA62_0==11) ) {
                alt62=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // InternalDraft7.g:2718:3: ( (lv_allowedBoolean_0_0= ruleBoolean ) )
                    {
                    // InternalDraft7.g:2718:3: ( (lv_allowedBoolean_0_0= ruleBoolean ) )
                    // InternalDraft7.g:2719:4: (lv_allowedBoolean_0_0= ruleBoolean )
                    {
                    // InternalDraft7.g:2719:4: (lv_allowedBoolean_0_0= ruleBoolean )
                    // InternalDraft7.g:2720:5: lv_allowedBoolean_0_0= ruleBoolean
                    {

                    					newCompositeNode(grammarAccess.getAdditionalPropertiesAccess().getAllowedBooleanBooleanEnumRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_allowedBoolean_0_0=ruleBoolean();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAdditionalPropertiesRule());
                    					}
                    					set(
                    						current,
                    						"allowedBoolean",
                    						lv_allowedBoolean_0_0,
                    						"org.xtext.json.schema.Draft7.Boolean");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDraft7.g:2738:3: ( (lv_schema_1_0= ruleAbstractSchema ) )
                    {
                    // InternalDraft7.g:2738:3: ( (lv_schema_1_0= ruleAbstractSchema ) )
                    // InternalDraft7.g:2739:4: (lv_schema_1_0= ruleAbstractSchema )
                    {
                    // InternalDraft7.g:2739:4: (lv_schema_1_0= ruleAbstractSchema )
                    // InternalDraft7.g:2740:5: lv_schema_1_0= ruleAbstractSchema
                    {

                    					newCompositeNode(grammarAccess.getAdditionalPropertiesAccess().getSchemaAbstractSchemaParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_schema_1_0=ruleAbstractSchema();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAdditionalPropertiesRule());
                    					}
                    					set(
                    						current,
                    						"schema",
                    						lv_schema_1_0,
                    						"org.xtext.json.schema.Draft7.AbstractSchema");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleAdditionalProperties"


    // $ANTLR start "entryRuleAdditionalItems"
    // InternalDraft7.g:2761:1: entryRuleAdditionalItems returns [EObject current=null] : iv_ruleAdditionalItems= ruleAdditionalItems EOF ;
    public final EObject entryRuleAdditionalItems() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditionalItems = null;


        try {
            // InternalDraft7.g:2761:56: (iv_ruleAdditionalItems= ruleAdditionalItems EOF )
            // InternalDraft7.g:2762:2: iv_ruleAdditionalItems= ruleAdditionalItems EOF
            {
             newCompositeNode(grammarAccess.getAdditionalItemsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAdditionalItems=ruleAdditionalItems();

            state._fsp--;

             current =iv_ruleAdditionalItems; 
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
    // $ANTLR end "entryRuleAdditionalItems"


    // $ANTLR start "ruleAdditionalItems"
    // InternalDraft7.g:2768:1: ruleAdditionalItems returns [EObject current=null] : ( ( (lv_allowedBoolean_0_0= ruleBoolean ) ) | ( (lv_schema_1_0= ruleAbstractSchema ) ) ) ;
    public final EObject ruleAdditionalItems() throws RecognitionException {
        EObject current = null;

        Enumerator lv_allowedBoolean_0_0 = null;

        EObject lv_schema_1_0 = null;



        	enterRule();

        try {
            // InternalDraft7.g:2774:2: ( ( ( (lv_allowedBoolean_0_0= ruleBoolean ) ) | ( (lv_schema_1_0= ruleAbstractSchema ) ) ) )
            // InternalDraft7.g:2775:2: ( ( (lv_allowedBoolean_0_0= ruleBoolean ) ) | ( (lv_schema_1_0= ruleAbstractSchema ) ) )
            {
            // InternalDraft7.g:2775:2: ( ( (lv_allowedBoolean_0_0= ruleBoolean ) ) | ( (lv_schema_1_0= ruleAbstractSchema ) ) )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( ((LA63_0>=62 && LA63_0<=63)) ) {
                alt63=1;
            }
            else if ( (LA63_0==11) ) {
                alt63=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // InternalDraft7.g:2776:3: ( (lv_allowedBoolean_0_0= ruleBoolean ) )
                    {
                    // InternalDraft7.g:2776:3: ( (lv_allowedBoolean_0_0= ruleBoolean ) )
                    // InternalDraft7.g:2777:4: (lv_allowedBoolean_0_0= ruleBoolean )
                    {
                    // InternalDraft7.g:2777:4: (lv_allowedBoolean_0_0= ruleBoolean )
                    // InternalDraft7.g:2778:5: lv_allowedBoolean_0_0= ruleBoolean
                    {

                    					newCompositeNode(grammarAccess.getAdditionalItemsAccess().getAllowedBooleanBooleanEnumRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_allowedBoolean_0_0=ruleBoolean();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAdditionalItemsRule());
                    					}
                    					set(
                    						current,
                    						"allowedBoolean",
                    						lv_allowedBoolean_0_0,
                    						"org.xtext.json.schema.Draft7.Boolean");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDraft7.g:2796:3: ( (lv_schema_1_0= ruleAbstractSchema ) )
                    {
                    // InternalDraft7.g:2796:3: ( (lv_schema_1_0= ruleAbstractSchema ) )
                    // InternalDraft7.g:2797:4: (lv_schema_1_0= ruleAbstractSchema )
                    {
                    // InternalDraft7.g:2797:4: (lv_schema_1_0= ruleAbstractSchema )
                    // InternalDraft7.g:2798:5: lv_schema_1_0= ruleAbstractSchema
                    {

                    					newCompositeNode(grammarAccess.getAdditionalItemsAccess().getSchemaAbstractSchemaParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_schema_1_0=ruleAbstractSchema();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAdditionalItemsRule());
                    					}
                    					set(
                    						current,
                    						"schema",
                    						lv_schema_1_0,
                    						"org.xtext.json.schema.Draft7.AbstractSchema");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleAdditionalItems"


    // $ANTLR start "entryRuleDefault"
    // InternalDraft7.g:2819:1: entryRuleDefault returns [EObject current=null] : iv_ruleDefault= ruleDefault EOF ;
    public final EObject entryRuleDefault() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefault = null;


        try {
            // InternalDraft7.g:2819:48: (iv_ruleDefault= ruleDefault EOF )
            // InternalDraft7.g:2820:2: iv_ruleDefault= ruleDefault EOF
            {
             newCompositeNode(grammarAccess.getDefaultRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefault=ruleDefault();

            state._fsp--;

             current =iv_ruleDefault; 
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
    // $ANTLR end "entryRuleDefault"


    // $ANTLR start "ruleDefault"
    // InternalDraft7.g:2826:1: ruleDefault returns [EObject current=null] : ( ( (lv_defaultSchema_0_0= ruleAbstractSchema ) ) | ( (lv_defaultString_1_0= ruleAnyString ) ) | ( (lv_defaultBoolean_2_0= ruleBoolean ) ) | ( (lv_defaultNumber_3_0= ruleNumber ) ) | ( () (otherlv_5= '[' ( ( (lv_defaultArrayItems_6_0= ruleAbstractSchema ) ) (otherlv_7= ',' ( (lv_defaultArrayItems_8_0= ruleAbstractSchema ) ) )* )? otherlv_9= ']' ) ) ) ;
    public final EObject ruleDefault() throws RecognitionException {
        EObject current = null;

        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_defaultSchema_0_0 = null;

        EObject lv_defaultString_1_0 = null;

        Enumerator lv_defaultBoolean_2_0 = null;

        EObject lv_defaultNumber_3_0 = null;

        EObject lv_defaultArrayItems_6_0 = null;

        EObject lv_defaultArrayItems_8_0 = null;



        	enterRule();

        try {
            // InternalDraft7.g:2832:2: ( ( ( (lv_defaultSchema_0_0= ruleAbstractSchema ) ) | ( (lv_defaultString_1_0= ruleAnyString ) ) | ( (lv_defaultBoolean_2_0= ruleBoolean ) ) | ( (lv_defaultNumber_3_0= ruleNumber ) ) | ( () (otherlv_5= '[' ( ( (lv_defaultArrayItems_6_0= ruleAbstractSchema ) ) (otherlv_7= ',' ( (lv_defaultArrayItems_8_0= ruleAbstractSchema ) ) )* )? otherlv_9= ']' ) ) ) )
            // InternalDraft7.g:2833:2: ( ( (lv_defaultSchema_0_0= ruleAbstractSchema ) ) | ( (lv_defaultString_1_0= ruleAnyString ) ) | ( (lv_defaultBoolean_2_0= ruleBoolean ) ) | ( (lv_defaultNumber_3_0= ruleNumber ) ) | ( () (otherlv_5= '[' ( ( (lv_defaultArrayItems_6_0= ruleAbstractSchema ) ) (otherlv_7= ',' ( (lv_defaultArrayItems_8_0= ruleAbstractSchema ) ) )* )? otherlv_9= ']' ) ) )
            {
            // InternalDraft7.g:2833:2: ( ( (lv_defaultSchema_0_0= ruleAbstractSchema ) ) | ( (lv_defaultString_1_0= ruleAnyString ) ) | ( (lv_defaultBoolean_2_0= ruleBoolean ) ) | ( (lv_defaultNumber_3_0= ruleNumber ) ) | ( () (otherlv_5= '[' ( ( (lv_defaultArrayItems_6_0= ruleAbstractSchema ) ) (otherlv_7= ',' ( (lv_defaultArrayItems_8_0= ruleAbstractSchema ) ) )* )? otherlv_9= ']' ) ) )
            int alt66=5;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt66=1;
                }
                break;
            case RULE_STRING:
            case 12:
            case 15:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 29:
            case 30:
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
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
                {
                alt66=2;
                }
                break;
            case 62:
            case 63:
                {
                alt66=3;
                }
                break;
            case RULE_INT:
                {
                alt66=4;
                }
                break;
            case 27:
                {
                alt66=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }

            switch (alt66) {
                case 1 :
                    // InternalDraft7.g:2834:3: ( (lv_defaultSchema_0_0= ruleAbstractSchema ) )
                    {
                    // InternalDraft7.g:2834:3: ( (lv_defaultSchema_0_0= ruleAbstractSchema ) )
                    // InternalDraft7.g:2835:4: (lv_defaultSchema_0_0= ruleAbstractSchema )
                    {
                    // InternalDraft7.g:2835:4: (lv_defaultSchema_0_0= ruleAbstractSchema )
                    // InternalDraft7.g:2836:5: lv_defaultSchema_0_0= ruleAbstractSchema
                    {

                    					newCompositeNode(grammarAccess.getDefaultAccess().getDefaultSchemaAbstractSchemaParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_defaultSchema_0_0=ruleAbstractSchema();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDefaultRule());
                    					}
                    					set(
                    						current,
                    						"defaultSchema",
                    						lv_defaultSchema_0_0,
                    						"org.xtext.json.schema.Draft7.AbstractSchema");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDraft7.g:2854:3: ( (lv_defaultString_1_0= ruleAnyString ) )
                    {
                    // InternalDraft7.g:2854:3: ( (lv_defaultString_1_0= ruleAnyString ) )
                    // InternalDraft7.g:2855:4: (lv_defaultString_1_0= ruleAnyString )
                    {
                    // InternalDraft7.g:2855:4: (lv_defaultString_1_0= ruleAnyString )
                    // InternalDraft7.g:2856:5: lv_defaultString_1_0= ruleAnyString
                    {

                    					newCompositeNode(grammarAccess.getDefaultAccess().getDefaultStringAnyStringParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_defaultString_1_0=ruleAnyString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDefaultRule());
                    					}
                    					set(
                    						current,
                    						"defaultString",
                    						lv_defaultString_1_0,
                    						"org.xtext.json.schema.Draft7.AnyString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalDraft7.g:2874:3: ( (lv_defaultBoolean_2_0= ruleBoolean ) )
                    {
                    // InternalDraft7.g:2874:3: ( (lv_defaultBoolean_2_0= ruleBoolean ) )
                    // InternalDraft7.g:2875:4: (lv_defaultBoolean_2_0= ruleBoolean )
                    {
                    // InternalDraft7.g:2875:4: (lv_defaultBoolean_2_0= ruleBoolean )
                    // InternalDraft7.g:2876:5: lv_defaultBoolean_2_0= ruleBoolean
                    {

                    					newCompositeNode(grammarAccess.getDefaultAccess().getDefaultBooleanBooleanEnumRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_defaultBoolean_2_0=ruleBoolean();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDefaultRule());
                    					}
                    					set(
                    						current,
                    						"defaultBoolean",
                    						lv_defaultBoolean_2_0,
                    						"org.xtext.json.schema.Draft7.Boolean");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalDraft7.g:2894:3: ( (lv_defaultNumber_3_0= ruleNumber ) )
                    {
                    // InternalDraft7.g:2894:3: ( (lv_defaultNumber_3_0= ruleNumber ) )
                    // InternalDraft7.g:2895:4: (lv_defaultNumber_3_0= ruleNumber )
                    {
                    // InternalDraft7.g:2895:4: (lv_defaultNumber_3_0= ruleNumber )
                    // InternalDraft7.g:2896:5: lv_defaultNumber_3_0= ruleNumber
                    {

                    					newCompositeNode(grammarAccess.getDefaultAccess().getDefaultNumberNumberParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_defaultNumber_3_0=ruleNumber();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDefaultRule());
                    					}
                    					set(
                    						current,
                    						"defaultNumber",
                    						lv_defaultNumber_3_0,
                    						"org.xtext.json.schema.Draft7.Number");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalDraft7.g:2914:3: ( () (otherlv_5= '[' ( ( (lv_defaultArrayItems_6_0= ruleAbstractSchema ) ) (otherlv_7= ',' ( (lv_defaultArrayItems_8_0= ruleAbstractSchema ) ) )* )? otherlv_9= ']' ) )
                    {
                    // InternalDraft7.g:2914:3: ( () (otherlv_5= '[' ( ( (lv_defaultArrayItems_6_0= ruleAbstractSchema ) ) (otherlv_7= ',' ( (lv_defaultArrayItems_8_0= ruleAbstractSchema ) ) )* )? otherlv_9= ']' ) )
                    // InternalDraft7.g:2915:4: () (otherlv_5= '[' ( ( (lv_defaultArrayItems_6_0= ruleAbstractSchema ) ) (otherlv_7= ',' ( (lv_defaultArrayItems_8_0= ruleAbstractSchema ) ) )* )? otherlv_9= ']' )
                    {
                    // InternalDraft7.g:2915:4: ()
                    // InternalDraft7.g:2916:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getDefaultAccess().getDefaultAction_4_0(),
                    						current);
                    				

                    }

                    // InternalDraft7.g:2922:4: (otherlv_5= '[' ( ( (lv_defaultArrayItems_6_0= ruleAbstractSchema ) ) (otherlv_7= ',' ( (lv_defaultArrayItems_8_0= ruleAbstractSchema ) ) )* )? otherlv_9= ']' )
                    // InternalDraft7.g:2923:5: otherlv_5= '[' ( ( (lv_defaultArrayItems_6_0= ruleAbstractSchema ) ) (otherlv_7= ',' ( (lv_defaultArrayItems_8_0= ruleAbstractSchema ) ) )* )? otherlv_9= ']'
                    {
                    otherlv_5=(Token)match(input,27,FOLLOW_24); 

                    					newLeafNode(otherlv_5, grammarAccess.getDefaultAccess().getLeftSquareBracketKeyword_4_1_0());
                    				
                    // InternalDraft7.g:2927:5: ( ( (lv_defaultArrayItems_6_0= ruleAbstractSchema ) ) (otherlv_7= ',' ( (lv_defaultArrayItems_8_0= ruleAbstractSchema ) ) )* )?
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==11) ) {
                        alt65=1;
                    }
                    switch (alt65) {
                        case 1 :
                            // InternalDraft7.g:2928:6: ( (lv_defaultArrayItems_6_0= ruleAbstractSchema ) ) (otherlv_7= ',' ( (lv_defaultArrayItems_8_0= ruleAbstractSchema ) ) )*
                            {
                            // InternalDraft7.g:2928:6: ( (lv_defaultArrayItems_6_0= ruleAbstractSchema ) )
                            // InternalDraft7.g:2929:7: (lv_defaultArrayItems_6_0= ruleAbstractSchema )
                            {
                            // InternalDraft7.g:2929:7: (lv_defaultArrayItems_6_0= ruleAbstractSchema )
                            // InternalDraft7.g:2930:8: lv_defaultArrayItems_6_0= ruleAbstractSchema
                            {

                            								newCompositeNode(grammarAccess.getDefaultAccess().getDefaultArrayItemsAbstractSchemaParserRuleCall_4_1_1_0_0());
                            							
                            pushFollow(FOLLOW_17);
                            lv_defaultArrayItems_6_0=ruleAbstractSchema();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getDefaultRule());
                            								}
                            								add(
                            									current,
                            									"defaultArrayItems",
                            									lv_defaultArrayItems_6_0,
                            									"org.xtext.json.schema.Draft7.AbstractSchema");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }

                            // InternalDraft7.g:2947:6: (otherlv_7= ',' ( (lv_defaultArrayItems_8_0= ruleAbstractSchema ) ) )*
                            loop64:
                            do {
                                int alt64=2;
                                int LA64_0 = input.LA(1);

                                if ( (LA64_0==14) ) {
                                    alt64=1;
                                }


                                switch (alt64) {
                            	case 1 :
                            	    // InternalDraft7.g:2948:7: otherlv_7= ',' ( (lv_defaultArrayItems_8_0= ruleAbstractSchema ) )
                            	    {
                            	    otherlv_7=(Token)match(input,14,FOLLOW_10); 

                            	    							newLeafNode(otherlv_7, grammarAccess.getDefaultAccess().getCommaKeyword_4_1_1_1_0());
                            	    						
                            	    // InternalDraft7.g:2952:7: ( (lv_defaultArrayItems_8_0= ruleAbstractSchema ) )
                            	    // InternalDraft7.g:2953:8: (lv_defaultArrayItems_8_0= ruleAbstractSchema )
                            	    {
                            	    // InternalDraft7.g:2953:8: (lv_defaultArrayItems_8_0= ruleAbstractSchema )
                            	    // InternalDraft7.g:2954:9: lv_defaultArrayItems_8_0= ruleAbstractSchema
                            	    {

                            	    									newCompositeNode(grammarAccess.getDefaultAccess().getDefaultArrayItemsAbstractSchemaParserRuleCall_4_1_1_1_1_0());
                            	    								
                            	    pushFollow(FOLLOW_17);
                            	    lv_defaultArrayItems_8_0=ruleAbstractSchema();

                            	    state._fsp--;


                            	    									if (current==null) {
                            	    										current = createModelElementForParent(grammarAccess.getDefaultRule());
                            	    									}
                            	    									add(
                            	    										current,
                            	    										"defaultArrayItems",
                            	    										lv_defaultArrayItems_8_0,
                            	    										"org.xtext.json.schema.Draft7.AbstractSchema");
                            	    									afterParserOrEnumRuleCall();
                            	    								

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop64;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_9=(Token)match(input,28,FOLLOW_2); 

                    					newLeafNode(otherlv_9, grammarAccess.getDefaultAccess().getRightSquareBracketKeyword_4_1_2());
                    				

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
    // $ANTLR end "ruleDefault"


    // $ANTLR start "entryRuleExample"
    // InternalDraft7.g:2983:1: entryRuleExample returns [EObject current=null] : iv_ruleExample= ruleExample EOF ;
    public final EObject entryRuleExample() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExample = null;


        try {
            // InternalDraft7.g:2983:48: (iv_ruleExample= ruleExample EOF )
            // InternalDraft7.g:2984:2: iv_ruleExample= ruleExample EOF
            {
             newCompositeNode(grammarAccess.getExampleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExample=ruleExample();

            state._fsp--;

             current =iv_ruleExample; 
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
    // $ANTLR end "entryRuleExample"


    // $ANTLR start "ruleExample"
    // InternalDraft7.g:2990:1: ruleExample returns [EObject current=null] : ( ( (lv_exampleSchema_0_0= ruleSchema ) ) | ( (lv_exampleString_1_0= ruleAnyString ) ) | ( (lv_exampleBoolean_2_0= ruleBoolean ) ) | ( (lv_exampleNumber_3_0= ruleNumber ) ) | (otherlv_4= '[' ( (lv_exampleArrayItems_5_0= ruleSchema ) ) (otherlv_6= ',' ( (lv_exampleArrayItems_7_0= ruleSchema ) ) )* otherlv_8= ']' ) ) ;
    public final EObject ruleExample() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_exampleSchema_0_0 = null;

        EObject lv_exampleString_1_0 = null;

        Enumerator lv_exampleBoolean_2_0 = null;

        EObject lv_exampleNumber_3_0 = null;

        EObject lv_exampleArrayItems_5_0 = null;

        EObject lv_exampleArrayItems_7_0 = null;



        	enterRule();

        try {
            // InternalDraft7.g:2996:2: ( ( ( (lv_exampleSchema_0_0= ruleSchema ) ) | ( (lv_exampleString_1_0= ruleAnyString ) ) | ( (lv_exampleBoolean_2_0= ruleBoolean ) ) | ( (lv_exampleNumber_3_0= ruleNumber ) ) | (otherlv_4= '[' ( (lv_exampleArrayItems_5_0= ruleSchema ) ) (otherlv_6= ',' ( (lv_exampleArrayItems_7_0= ruleSchema ) ) )* otherlv_8= ']' ) ) )
            // InternalDraft7.g:2997:2: ( ( (lv_exampleSchema_0_0= ruleSchema ) ) | ( (lv_exampleString_1_0= ruleAnyString ) ) | ( (lv_exampleBoolean_2_0= ruleBoolean ) ) | ( (lv_exampleNumber_3_0= ruleNumber ) ) | (otherlv_4= '[' ( (lv_exampleArrayItems_5_0= ruleSchema ) ) (otherlv_6= ',' ( (lv_exampleArrayItems_7_0= ruleSchema ) ) )* otherlv_8= ']' ) )
            {
            // InternalDraft7.g:2997:2: ( ( (lv_exampleSchema_0_0= ruleSchema ) ) | ( (lv_exampleString_1_0= ruleAnyString ) ) | ( (lv_exampleBoolean_2_0= ruleBoolean ) ) | ( (lv_exampleNumber_3_0= ruleNumber ) ) | (otherlv_4= '[' ( (lv_exampleArrayItems_5_0= ruleSchema ) ) (otherlv_6= ',' ( (lv_exampleArrayItems_7_0= ruleSchema ) ) )* otherlv_8= ']' ) )
            int alt68=5;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt68=1;
                }
                break;
            case RULE_STRING:
            case 12:
            case 15:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 29:
            case 30:
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
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
                {
                alt68=2;
                }
                break;
            case 62:
            case 63:
                {
                alt68=3;
                }
                break;
            case RULE_INT:
                {
                alt68=4;
                }
                break;
            case 27:
                {
                alt68=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }

            switch (alt68) {
                case 1 :
                    // InternalDraft7.g:2998:3: ( (lv_exampleSchema_0_0= ruleSchema ) )
                    {
                    // InternalDraft7.g:2998:3: ( (lv_exampleSchema_0_0= ruleSchema ) )
                    // InternalDraft7.g:2999:4: (lv_exampleSchema_0_0= ruleSchema )
                    {
                    // InternalDraft7.g:2999:4: (lv_exampleSchema_0_0= ruleSchema )
                    // InternalDraft7.g:3000:5: lv_exampleSchema_0_0= ruleSchema
                    {

                    					newCompositeNode(grammarAccess.getExampleAccess().getExampleSchemaSchemaParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_exampleSchema_0_0=ruleSchema();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExampleRule());
                    					}
                    					set(
                    						current,
                    						"exampleSchema",
                    						lv_exampleSchema_0_0,
                    						"org.xtext.json.schema.Draft7.Schema");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDraft7.g:3018:3: ( (lv_exampleString_1_0= ruleAnyString ) )
                    {
                    // InternalDraft7.g:3018:3: ( (lv_exampleString_1_0= ruleAnyString ) )
                    // InternalDraft7.g:3019:4: (lv_exampleString_1_0= ruleAnyString )
                    {
                    // InternalDraft7.g:3019:4: (lv_exampleString_1_0= ruleAnyString )
                    // InternalDraft7.g:3020:5: lv_exampleString_1_0= ruleAnyString
                    {

                    					newCompositeNode(grammarAccess.getExampleAccess().getExampleStringAnyStringParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_exampleString_1_0=ruleAnyString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExampleRule());
                    					}
                    					set(
                    						current,
                    						"exampleString",
                    						lv_exampleString_1_0,
                    						"org.xtext.json.schema.Draft7.AnyString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalDraft7.g:3038:3: ( (lv_exampleBoolean_2_0= ruleBoolean ) )
                    {
                    // InternalDraft7.g:3038:3: ( (lv_exampleBoolean_2_0= ruleBoolean ) )
                    // InternalDraft7.g:3039:4: (lv_exampleBoolean_2_0= ruleBoolean )
                    {
                    // InternalDraft7.g:3039:4: (lv_exampleBoolean_2_0= ruleBoolean )
                    // InternalDraft7.g:3040:5: lv_exampleBoolean_2_0= ruleBoolean
                    {

                    					newCompositeNode(grammarAccess.getExampleAccess().getExampleBooleanBooleanEnumRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_exampleBoolean_2_0=ruleBoolean();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExampleRule());
                    					}
                    					set(
                    						current,
                    						"exampleBoolean",
                    						lv_exampleBoolean_2_0,
                    						"org.xtext.json.schema.Draft7.Boolean");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalDraft7.g:3058:3: ( (lv_exampleNumber_3_0= ruleNumber ) )
                    {
                    // InternalDraft7.g:3058:3: ( (lv_exampleNumber_3_0= ruleNumber ) )
                    // InternalDraft7.g:3059:4: (lv_exampleNumber_3_0= ruleNumber )
                    {
                    // InternalDraft7.g:3059:4: (lv_exampleNumber_3_0= ruleNumber )
                    // InternalDraft7.g:3060:5: lv_exampleNumber_3_0= ruleNumber
                    {

                    					newCompositeNode(grammarAccess.getExampleAccess().getExampleNumberNumberParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_exampleNumber_3_0=ruleNumber();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExampleRule());
                    					}
                    					set(
                    						current,
                    						"exampleNumber",
                    						lv_exampleNumber_3_0,
                    						"org.xtext.json.schema.Draft7.Number");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalDraft7.g:3078:3: (otherlv_4= '[' ( (lv_exampleArrayItems_5_0= ruleSchema ) ) (otherlv_6= ',' ( (lv_exampleArrayItems_7_0= ruleSchema ) ) )* otherlv_8= ']' )
                    {
                    // InternalDraft7.g:3078:3: (otherlv_4= '[' ( (lv_exampleArrayItems_5_0= ruleSchema ) ) (otherlv_6= ',' ( (lv_exampleArrayItems_7_0= ruleSchema ) ) )* otherlv_8= ']' )
                    // InternalDraft7.g:3079:4: otherlv_4= '[' ( (lv_exampleArrayItems_5_0= ruleSchema ) ) (otherlv_6= ',' ( (lv_exampleArrayItems_7_0= ruleSchema ) ) )* otherlv_8= ']'
                    {
                    otherlv_4=(Token)match(input,27,FOLLOW_10); 

                    				newLeafNode(otherlv_4, grammarAccess.getExampleAccess().getLeftSquareBracketKeyword_4_0());
                    			
                    // InternalDraft7.g:3083:4: ( (lv_exampleArrayItems_5_0= ruleSchema ) )
                    // InternalDraft7.g:3084:5: (lv_exampleArrayItems_5_0= ruleSchema )
                    {
                    // InternalDraft7.g:3084:5: (lv_exampleArrayItems_5_0= ruleSchema )
                    // InternalDraft7.g:3085:6: lv_exampleArrayItems_5_0= ruleSchema
                    {

                    						newCompositeNode(grammarAccess.getExampleAccess().getExampleArrayItemsSchemaParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_exampleArrayItems_5_0=ruleSchema();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExampleRule());
                    						}
                    						add(
                    							current,
                    							"exampleArrayItems",
                    							lv_exampleArrayItems_5_0,
                    							"org.xtext.json.schema.Draft7.Schema");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDraft7.g:3102:4: (otherlv_6= ',' ( (lv_exampleArrayItems_7_0= ruleSchema ) ) )*
                    loop67:
                    do {
                        int alt67=2;
                        int LA67_0 = input.LA(1);

                        if ( (LA67_0==14) ) {
                            alt67=1;
                        }


                        switch (alt67) {
                    	case 1 :
                    	    // InternalDraft7.g:3103:5: otherlv_6= ',' ( (lv_exampleArrayItems_7_0= ruleSchema ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_10); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getExampleAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalDraft7.g:3107:5: ( (lv_exampleArrayItems_7_0= ruleSchema ) )
                    	    // InternalDraft7.g:3108:6: (lv_exampleArrayItems_7_0= ruleSchema )
                    	    {
                    	    // InternalDraft7.g:3108:6: (lv_exampleArrayItems_7_0= ruleSchema )
                    	    // InternalDraft7.g:3109:7: lv_exampleArrayItems_7_0= ruleSchema
                    	    {

                    	    							newCompositeNode(grammarAccess.getExampleAccess().getExampleArrayItemsSchemaParserRuleCall_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    lv_exampleArrayItems_7_0=ruleSchema();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getExampleRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"exampleArrayItems",
                    	    								lv_exampleArrayItems_7_0,
                    	    								"org.xtext.json.schema.Draft7.Schema");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop67;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,28,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getExampleAccess().getRightSquareBracketKeyword_4_3());
                    			

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
    // $ANTLR end "ruleExample"


    // $ANTLR start "entryRuleTypes"
    // InternalDraft7.g:3136:1: entryRuleTypes returns [EObject current=null] : iv_ruleTypes= ruleTypes EOF ;
    public final EObject entryRuleTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypes = null;


        try {
            // InternalDraft7.g:3136:46: (iv_ruleTypes= ruleTypes EOF )
            // InternalDraft7.g:3137:2: iv_ruleTypes= ruleTypes EOF
            {
             newCompositeNode(grammarAccess.getTypesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypes=ruleTypes();

            state._fsp--;

             current =iv_ruleTypes; 
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
    // $ANTLR end "entryRuleTypes"


    // $ANTLR start "ruleTypes"
    // InternalDraft7.g:3143:1: ruleTypes returns [EObject current=null] : ( (otherlv_0= '[' ( (lv_jsonTypes_1_0= ruleJsonTypes ) ) (otherlv_2= ',' ( (lv_jsonTypes_3_0= ruleJsonTypes ) ) )* otherlv_4= ']' ) | ( (lv_jsonTypes_5_0= ruleJsonTypes ) ) ) ;
    public final EObject ruleTypes() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_jsonTypes_1_0 = null;

        Enumerator lv_jsonTypes_3_0 = null;

        Enumerator lv_jsonTypes_5_0 = null;



        	enterRule();

        try {
            // InternalDraft7.g:3149:2: ( ( (otherlv_0= '[' ( (lv_jsonTypes_1_0= ruleJsonTypes ) ) (otherlv_2= ',' ( (lv_jsonTypes_3_0= ruleJsonTypes ) ) )* otherlv_4= ']' ) | ( (lv_jsonTypes_5_0= ruleJsonTypes ) ) ) )
            // InternalDraft7.g:3150:2: ( (otherlv_0= '[' ( (lv_jsonTypes_1_0= ruleJsonTypes ) ) (otherlv_2= ',' ( (lv_jsonTypes_3_0= ruleJsonTypes ) ) )* otherlv_4= ']' ) | ( (lv_jsonTypes_5_0= ruleJsonTypes ) ) )
            {
            // InternalDraft7.g:3150:2: ( (otherlv_0= '[' ( (lv_jsonTypes_1_0= ruleJsonTypes ) ) (otherlv_2= ',' ( (lv_jsonTypes_3_0= ruleJsonTypes ) ) )* otherlv_4= ']' ) | ( (lv_jsonTypes_5_0= ruleJsonTypes ) ) )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==27) ) {
                alt70=1;
            }
            else if ( ((LA70_0>=64 && LA70_0<=70)) ) {
                alt70=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }
            switch (alt70) {
                case 1 :
                    // InternalDraft7.g:3151:3: (otherlv_0= '[' ( (lv_jsonTypes_1_0= ruleJsonTypes ) ) (otherlv_2= ',' ( (lv_jsonTypes_3_0= ruleJsonTypes ) ) )* otherlv_4= ']' )
                    {
                    // InternalDraft7.g:3151:3: (otherlv_0= '[' ( (lv_jsonTypes_1_0= ruleJsonTypes ) ) (otherlv_2= ',' ( (lv_jsonTypes_3_0= ruleJsonTypes ) ) )* otherlv_4= ']' )
                    // InternalDraft7.g:3152:4: otherlv_0= '[' ( (lv_jsonTypes_1_0= ruleJsonTypes ) ) (otherlv_2= ',' ( (lv_jsonTypes_3_0= ruleJsonTypes ) ) )* otherlv_4= ']'
                    {
                    otherlv_0=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_0, grammarAccess.getTypesAccess().getLeftSquareBracketKeyword_0_0());
                    			
                    // InternalDraft7.g:3156:4: ( (lv_jsonTypes_1_0= ruleJsonTypes ) )
                    // InternalDraft7.g:3157:5: (lv_jsonTypes_1_0= ruleJsonTypes )
                    {
                    // InternalDraft7.g:3157:5: (lv_jsonTypes_1_0= ruleJsonTypes )
                    // InternalDraft7.g:3158:6: lv_jsonTypes_1_0= ruleJsonTypes
                    {

                    						newCompositeNode(grammarAccess.getTypesAccess().getJsonTypesJsonTypesEnumRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_jsonTypes_1_0=ruleJsonTypes();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTypesRule());
                    						}
                    						add(
                    							current,
                    							"jsonTypes",
                    							lv_jsonTypes_1_0,
                    							"org.xtext.json.schema.Draft7.JsonTypes");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDraft7.g:3175:4: (otherlv_2= ',' ( (lv_jsonTypes_3_0= ruleJsonTypes ) ) )*
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==14) ) {
                            alt69=1;
                        }


                        switch (alt69) {
                    	case 1 :
                    	    // InternalDraft7.g:3176:5: otherlv_2= ',' ( (lv_jsonTypes_3_0= ruleJsonTypes ) )
                    	    {
                    	    otherlv_2=(Token)match(input,14,FOLLOW_5); 

                    	    					newLeafNode(otherlv_2, grammarAccess.getTypesAccess().getCommaKeyword_0_2_0());
                    	    				
                    	    // InternalDraft7.g:3180:5: ( (lv_jsonTypes_3_0= ruleJsonTypes ) )
                    	    // InternalDraft7.g:3181:6: (lv_jsonTypes_3_0= ruleJsonTypes )
                    	    {
                    	    // InternalDraft7.g:3181:6: (lv_jsonTypes_3_0= ruleJsonTypes )
                    	    // InternalDraft7.g:3182:7: lv_jsonTypes_3_0= ruleJsonTypes
                    	    {

                    	    							newCompositeNode(grammarAccess.getTypesAccess().getJsonTypesJsonTypesEnumRuleCall_0_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    lv_jsonTypes_3_0=ruleJsonTypes();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTypesRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"jsonTypes",
                    	    								lv_jsonTypes_3_0,
                    	    								"org.xtext.json.schema.Draft7.JsonTypes");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop69;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,28,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getTypesAccess().getRightSquareBracketKeyword_0_3());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDraft7.g:3206:3: ( (lv_jsonTypes_5_0= ruleJsonTypes ) )
                    {
                    // InternalDraft7.g:3206:3: ( (lv_jsonTypes_5_0= ruleJsonTypes ) )
                    // InternalDraft7.g:3207:4: (lv_jsonTypes_5_0= ruleJsonTypes )
                    {
                    // InternalDraft7.g:3207:4: (lv_jsonTypes_5_0= ruleJsonTypes )
                    // InternalDraft7.g:3208:5: lv_jsonTypes_5_0= ruleJsonTypes
                    {

                    					newCompositeNode(grammarAccess.getTypesAccess().getJsonTypesJsonTypesEnumRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_jsonTypes_5_0=ruleJsonTypes();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTypesRule());
                    					}
                    					add(
                    						current,
                    						"jsonTypes",
                    						lv_jsonTypes_5_0,
                    						"org.xtext.json.schema.Draft7.JsonTypes");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleTypes"


    // $ANTLR start "entryRuleAbstractSchema"
    // InternalDraft7.g:3229:1: entryRuleAbstractSchema returns [EObject current=null] : iv_ruleAbstractSchema= ruleAbstractSchema EOF ;
    public final EObject entryRuleAbstractSchema() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractSchema = null;


        try {
            // InternalDraft7.g:3229:55: (iv_ruleAbstractSchema= ruleAbstractSchema EOF )
            // InternalDraft7.g:3230:2: iv_ruleAbstractSchema= ruleAbstractSchema EOF
            {
             newCompositeNode(grammarAccess.getAbstractSchemaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractSchema=ruleAbstractSchema();

            state._fsp--;

             current =iv_ruleAbstractSchema; 
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
    // $ANTLR end "entryRuleAbstractSchema"


    // $ANTLR start "ruleAbstractSchema"
    // InternalDraft7.g:3236:1: ruleAbstractSchema returns [EObject current=null] : (this_Reference_0= ruleReference | this_Schema_1= ruleSchema ) ;
    public final EObject ruleAbstractSchema() throws RecognitionException {
        EObject current = null;

        EObject this_Reference_0 = null;

        EObject this_Schema_1 = null;



        	enterRule();

        try {
            // InternalDraft7.g:3242:2: ( (this_Reference_0= ruleReference | this_Schema_1= ruleSchema ) )
            // InternalDraft7.g:3243:2: (this_Reference_0= ruleReference | this_Schema_1= ruleSchema )
            {
            // InternalDraft7.g:3243:2: (this_Reference_0= ruleReference | this_Schema_1= ruleSchema )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==11) ) {
                int LA71_1 = input.LA(2);

                if ( (LA71_1==60) ) {
                    alt71=1;
                }
                else if ( (LA71_1==12||(LA71_1>=15 && LA71_1<=26)||(LA71_1>=29 && LA71_1<=32)||(LA71_1>=34 && LA71_1<=59)) ) {
                    alt71=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 71, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }
            switch (alt71) {
                case 1 :
                    // InternalDraft7.g:3244:3: this_Reference_0= ruleReference
                    {

                    			newCompositeNode(grammarAccess.getAbstractSchemaAccess().getReferenceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Reference_0=ruleReference();

                    state._fsp--;


                    			current = this_Reference_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDraft7.g:3253:3: this_Schema_1= ruleSchema
                    {

                    			newCompositeNode(grammarAccess.getAbstractSchemaAccess().getSchemaParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Schema_1=ruleSchema();

                    state._fsp--;


                    			current = this_Schema_1;
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
    // $ANTLR end "ruleAbstractSchema"


    // $ANTLR start "entryRuleReference"
    // InternalDraft7.g:3265:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // InternalDraft7.g:3265:50: (iv_ruleReference= ruleReference EOF )
            // InternalDraft7.g:3266:2: iv_ruleReference= ruleReference EOF
            {
             newCompositeNode(grammarAccess.getReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReference=ruleReference();

            state._fsp--;

             current =iv_ruleReference; 
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
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // InternalDraft7.g:3272:1: ruleReference returns [EObject current=null] : ( () otherlv_1= '{' otherlv_2= '\"$ref\"' otherlv_3= ':' ( (lv_uri_4_0= ruleAnyString ) ) otherlv_5= '}' ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_uri_4_0 = null;



        	enterRule();

        try {
            // InternalDraft7.g:3278:2: ( ( () otherlv_1= '{' otherlv_2= '\"$ref\"' otherlv_3= ':' ( (lv_uri_4_0= ruleAnyString ) ) otherlv_5= '}' ) )
            // InternalDraft7.g:3279:2: ( () otherlv_1= '{' otherlv_2= '\"$ref\"' otherlv_3= ':' ( (lv_uri_4_0= ruleAnyString ) ) otherlv_5= '}' )
            {
            // InternalDraft7.g:3279:2: ( () otherlv_1= '{' otherlv_2= '\"$ref\"' otherlv_3= ':' ( (lv_uri_4_0= ruleAnyString ) ) otherlv_5= '}' )
            // InternalDraft7.g:3280:3: () otherlv_1= '{' otherlv_2= '\"$ref\"' otherlv_3= ':' ( (lv_uri_4_0= ruleAnyString ) ) otherlv_5= '}'
            {
            // InternalDraft7.g:3280:3: ()
            // InternalDraft7.g:3281:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getReferenceAccess().getReferenceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getReferenceAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,60,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getReferenceAccess().getRefKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getReferenceAccess().getColonKeyword_3());
            		
            // InternalDraft7.g:3299:3: ( (lv_uri_4_0= ruleAnyString ) )
            // InternalDraft7.g:3300:4: (lv_uri_4_0= ruleAnyString )
            {
            // InternalDraft7.g:3300:4: (lv_uri_4_0= ruleAnyString )
            // InternalDraft7.g:3301:5: lv_uri_4_0= ruleAnyString
            {

            					newCompositeNode(grammarAccess.getReferenceAccess().getUriAnyStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_9);
            lv_uri_4_0=ruleAnyString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReferenceRule());
            					}
            					set(
            						current,
            						"uri",
            						lv_uri_4_0,
            						"org.xtext.json.schema.Draft7.AnyString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getReferenceAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleReference"


    // $ANTLR start "entryRuleNamedSchema"
    // InternalDraft7.g:3326:1: entryRuleNamedSchema returns [EObject current=null] : iv_ruleNamedSchema= ruleNamedSchema EOF ;
    public final EObject entryRuleNamedSchema() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedSchema = null;


        try {
            // InternalDraft7.g:3326:52: (iv_ruleNamedSchema= ruleNamedSchema EOF )
            // InternalDraft7.g:3327:2: iv_ruleNamedSchema= ruleNamedSchema EOF
            {
             newCompositeNode(grammarAccess.getNamedSchemaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNamedSchema=ruleNamedSchema();

            state._fsp--;

             current =iv_ruleNamedSchema; 
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
    // $ANTLR end "entryRuleNamedSchema"


    // $ANTLR start "ruleNamedSchema"
    // InternalDraft7.g:3333:1: ruleNamedSchema returns [EObject current=null] : ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' ( (lv_schema_3_0= ruleAbstractSchema ) ) ) ;
    public final EObject ruleNamedSchema() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_name_1_0 = null;

        EObject lv_schema_3_0 = null;



        	enterRule();

        try {
            // InternalDraft7.g:3339:2: ( ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' ( (lv_schema_3_0= ruleAbstractSchema ) ) ) )
            // InternalDraft7.g:3340:2: ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' ( (lv_schema_3_0= ruleAbstractSchema ) ) )
            {
            // InternalDraft7.g:3340:2: ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' ( (lv_schema_3_0= ruleAbstractSchema ) ) )
            // InternalDraft7.g:3341:3: () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' ( (lv_schema_3_0= ruleAbstractSchema ) )
            {
            // InternalDraft7.g:3341:3: ()
            // InternalDraft7.g:3342:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNamedSchemaAccess().getNamedSchemaAction_0(),
            					current);
            			

            }

            // InternalDraft7.g:3348:3: ( (lv_name_1_0= ruleAnyString ) )
            // InternalDraft7.g:3349:4: (lv_name_1_0= ruleAnyString )
            {
            // InternalDraft7.g:3349:4: (lv_name_1_0= ruleAnyString )
            // InternalDraft7.g:3350:5: lv_name_1_0= ruleAnyString
            {

            					newCompositeNode(grammarAccess.getNamedSchemaAccess().getNameAnyStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleAnyString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNamedSchemaRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.json.schema.Draft7.AnyString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getNamedSchemaAccess().getColonKeyword_2());
            		
            // InternalDraft7.g:3371:3: ( (lv_schema_3_0= ruleAbstractSchema ) )
            // InternalDraft7.g:3372:4: (lv_schema_3_0= ruleAbstractSchema )
            {
            // InternalDraft7.g:3372:4: (lv_schema_3_0= ruleAbstractSchema )
            // InternalDraft7.g:3373:5: lv_schema_3_0= ruleAbstractSchema
            {

            					newCompositeNode(grammarAccess.getNamedSchemaAccess().getSchemaAbstractSchemaParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_schema_3_0=ruleAbstractSchema();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNamedSchemaRule());
            					}
            					set(
            						current,
            						"schema",
            						lv_schema_3_0,
            						"org.xtext.json.schema.Draft7.AbstractSchema");
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
    // $ANTLR end "ruleNamedSchema"


    // $ANTLR start "entryRuleAnyString"
    // InternalDraft7.g:3394:1: entryRuleAnyString returns [EObject current=null] : iv_ruleAnyString= ruleAnyString EOF ;
    public final EObject entryRuleAnyString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnyString = null;


        try {
            // InternalDraft7.g:3394:50: (iv_ruleAnyString= ruleAnyString EOF )
            // InternalDraft7.g:3395:2: iv_ruleAnyString= ruleAnyString EOF
            {
             newCompositeNode(grammarAccess.getAnyStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnyString=ruleAnyString();

            state._fsp--;

             current =iv_ruleAnyString; 
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
    // $ANTLR end "entryRuleAnyString"


    // $ANTLR start "ruleAnyString"
    // InternalDraft7.g:3401:1: ruleAnyString returns [EObject current=null] : ( ( (lv_name_0_0= RULE_STRING ) ) | ( (lv_keyword_1_0= ruleJsonSchemaKeyword ) ) ) ;
    public final EObject ruleAnyString() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Enumerator lv_keyword_1_0 = null;



        	enterRule();

        try {
            // InternalDraft7.g:3407:2: ( ( ( (lv_name_0_0= RULE_STRING ) ) | ( (lv_keyword_1_0= ruleJsonSchemaKeyword ) ) ) )
            // InternalDraft7.g:3408:2: ( ( (lv_name_0_0= RULE_STRING ) ) | ( (lv_keyword_1_0= ruleJsonSchemaKeyword ) ) )
            {
            // InternalDraft7.g:3408:2: ( ( (lv_name_0_0= RULE_STRING ) ) | ( (lv_keyword_1_0= ruleJsonSchemaKeyword ) ) )
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==RULE_STRING) ) {
                alt72=1;
            }
            else if ( (LA72_0==12||LA72_0==15||(LA72_0>=17 && LA72_0<=26)||(LA72_0>=29 && LA72_0<=60)||(LA72_0>=64 && LA72_0<=88)) ) {
                alt72=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }
            switch (alt72) {
                case 1 :
                    // InternalDraft7.g:3409:3: ( (lv_name_0_0= RULE_STRING ) )
                    {
                    // InternalDraft7.g:3409:3: ( (lv_name_0_0= RULE_STRING ) )
                    // InternalDraft7.g:3410:4: (lv_name_0_0= RULE_STRING )
                    {
                    // InternalDraft7.g:3410:4: (lv_name_0_0= RULE_STRING )
                    // InternalDraft7.g:3411:5: lv_name_0_0= RULE_STRING
                    {
                    lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_name_0_0, grammarAccess.getAnyStringAccess().getNameSTRINGTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAnyStringRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_0_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDraft7.g:3428:3: ( (lv_keyword_1_0= ruleJsonSchemaKeyword ) )
                    {
                    // InternalDraft7.g:3428:3: ( (lv_keyword_1_0= ruleJsonSchemaKeyword ) )
                    // InternalDraft7.g:3429:4: (lv_keyword_1_0= ruleJsonSchemaKeyword )
                    {
                    // InternalDraft7.g:3429:4: (lv_keyword_1_0= ruleJsonSchemaKeyword )
                    // InternalDraft7.g:3430:5: lv_keyword_1_0= ruleJsonSchemaKeyword
                    {

                    					newCompositeNode(grammarAccess.getAnyStringAccess().getKeywordJsonSchemaKeywordEnumRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_keyword_1_0=ruleJsonSchemaKeyword();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAnyStringRule());
                    					}
                    					set(
                    						current,
                    						"keyword",
                    						lv_keyword_1_0,
                    						"org.xtext.json.schema.Draft7.JsonSchemaKeyword");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleAnyString"


    // $ANTLR start "entryRuleNumber"
    // InternalDraft7.g:3451:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // InternalDraft7.g:3451:47: (iv_ruleNumber= ruleNumber EOF )
            // InternalDraft7.g:3452:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber; 
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
    // InternalDraft7.g:3458:1: ruleNumber returns [EObject current=null] : ( ( (lv_number_0_0= RULE_INT ) ) (otherlv_1= '.' ( (lv_decimal_2_0= RULE_INT ) ) )? ) ;
    public final EObject ruleNumber() throws RecognitionException {
        EObject current = null;

        Token lv_number_0_0=null;
        Token otherlv_1=null;
        Token lv_decimal_2_0=null;


        	enterRule();

        try {
            // InternalDraft7.g:3464:2: ( ( ( (lv_number_0_0= RULE_INT ) ) (otherlv_1= '.' ( (lv_decimal_2_0= RULE_INT ) ) )? ) )
            // InternalDraft7.g:3465:2: ( ( (lv_number_0_0= RULE_INT ) ) (otherlv_1= '.' ( (lv_decimal_2_0= RULE_INT ) ) )? )
            {
            // InternalDraft7.g:3465:2: ( ( (lv_number_0_0= RULE_INT ) ) (otherlv_1= '.' ( (lv_decimal_2_0= RULE_INT ) ) )? )
            // InternalDraft7.g:3466:3: ( (lv_number_0_0= RULE_INT ) ) (otherlv_1= '.' ( (lv_decimal_2_0= RULE_INT ) ) )?
            {
            // InternalDraft7.g:3466:3: ( (lv_number_0_0= RULE_INT ) )
            // InternalDraft7.g:3467:4: (lv_number_0_0= RULE_INT )
            {
            // InternalDraft7.g:3467:4: (lv_number_0_0= RULE_INT )
            // InternalDraft7.g:3468:5: lv_number_0_0= RULE_INT
            {
            lv_number_0_0=(Token)match(input,RULE_INT,FOLLOW_26); 

            					newLeafNode(lv_number_0_0, grammarAccess.getNumberAccess().getNumberINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNumberRule());
            					}
            					setWithLastConsumed(
            						current,
            						"number",
            						lv_number_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalDraft7.g:3484:3: (otherlv_1= '.' ( (lv_decimal_2_0= RULE_INT ) ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==61) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalDraft7.g:3485:4: otherlv_1= '.' ( (lv_decimal_2_0= RULE_INT ) )
                    {
                    otherlv_1=(Token)match(input,61,FOLLOW_21); 

                    				newLeafNode(otherlv_1, grammarAccess.getNumberAccess().getFullStopKeyword_1_0());
                    			
                    // InternalDraft7.g:3489:4: ( (lv_decimal_2_0= RULE_INT ) )
                    // InternalDraft7.g:3490:5: (lv_decimal_2_0= RULE_INT )
                    {
                    // InternalDraft7.g:3490:5: (lv_decimal_2_0= RULE_INT )
                    // InternalDraft7.g:3491:6: lv_decimal_2_0= RULE_INT
                    {
                    lv_decimal_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_decimal_2_0, grammarAccess.getNumberAccess().getDecimalINTTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNumberRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"decimal",
                    							lv_decimal_2_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

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
    // $ANTLR end "ruleNumber"


    // $ANTLR start "ruleBoolean"
    // InternalDraft7.g:3512:1: ruleBoolean returns [Enumerator current=null] : ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) ;
    public final Enumerator ruleBoolean() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDraft7.g:3518:2: ( ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) )
            // InternalDraft7.g:3519:2: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            {
            // InternalDraft7.g:3519:2: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==62) ) {
                alt74=1;
            }
            else if ( (LA74_0==63) ) {
                alt74=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }
            switch (alt74) {
                case 1 :
                    // InternalDraft7.g:3520:3: (enumLiteral_0= 'true' )
                    {
                    // InternalDraft7.g:3520:3: (enumLiteral_0= 'true' )
                    // InternalDraft7.g:3521:4: enumLiteral_0= 'true'
                    {
                    enumLiteral_0=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getBooleanAccess().getTrueValueEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBooleanAccess().getTrueValueEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDraft7.g:3528:3: (enumLiteral_1= 'false' )
                    {
                    // InternalDraft7.g:3528:3: (enumLiteral_1= 'false' )
                    // InternalDraft7.g:3529:4: enumLiteral_1= 'false'
                    {
                    enumLiteral_1=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getBooleanAccess().getFalseValueEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBooleanAccess().getFalseValueEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "ruleJsonTypes"
    // InternalDraft7.g:3539:1: ruleJsonTypes returns [Enumerator current=null] : ( (enumLiteral_0= '\"string\"' ) | (enumLiteral_1= '\"integer\"' ) | (enumLiteral_2= '\"number\"' ) | (enumLiteral_3= '\"object\"' ) | (enumLiteral_4= '\"array\"' ) | (enumLiteral_5= '\"boolean\"' ) | (enumLiteral_6= '\"null\"' ) ) ;
    public final Enumerator ruleJsonTypes() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;


        	enterRule();

        try {
            // InternalDraft7.g:3545:2: ( ( (enumLiteral_0= '\"string\"' ) | (enumLiteral_1= '\"integer\"' ) | (enumLiteral_2= '\"number\"' ) | (enumLiteral_3= '\"object\"' ) | (enumLiteral_4= '\"array\"' ) | (enumLiteral_5= '\"boolean\"' ) | (enumLiteral_6= '\"null\"' ) ) )
            // InternalDraft7.g:3546:2: ( (enumLiteral_0= '\"string\"' ) | (enumLiteral_1= '\"integer\"' ) | (enumLiteral_2= '\"number\"' ) | (enumLiteral_3= '\"object\"' ) | (enumLiteral_4= '\"array\"' ) | (enumLiteral_5= '\"boolean\"' ) | (enumLiteral_6= '\"null\"' ) )
            {
            // InternalDraft7.g:3546:2: ( (enumLiteral_0= '\"string\"' ) | (enumLiteral_1= '\"integer\"' ) | (enumLiteral_2= '\"number\"' ) | (enumLiteral_3= '\"object\"' ) | (enumLiteral_4= '\"array\"' ) | (enumLiteral_5= '\"boolean\"' ) | (enumLiteral_6= '\"null\"' ) )
            int alt75=7;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt75=1;
                }
                break;
            case 65:
                {
                alt75=2;
                }
                break;
            case 66:
                {
                alt75=3;
                }
                break;
            case 67:
                {
                alt75=4;
                }
                break;
            case 68:
                {
                alt75=5;
                }
                break;
            case 69:
                {
                alt75=6;
                }
                break;
            case 70:
                {
                alt75=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }

            switch (alt75) {
                case 1 :
                    // InternalDraft7.g:3547:3: (enumLiteral_0= '\"string\"' )
                    {
                    // InternalDraft7.g:3547:3: (enumLiteral_0= '\"string\"' )
                    // InternalDraft7.g:3548:4: enumLiteral_0= '\"string\"'
                    {
                    enumLiteral_0=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getJsonTypesAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getJsonTypesAccess().getStringEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDraft7.g:3555:3: (enumLiteral_1= '\"integer\"' )
                    {
                    // InternalDraft7.g:3555:3: (enumLiteral_1= '\"integer\"' )
                    // InternalDraft7.g:3556:4: enumLiteral_1= '\"integer\"'
                    {
                    enumLiteral_1=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getJsonTypesAccess().getIntegerEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getJsonTypesAccess().getIntegerEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDraft7.g:3563:3: (enumLiteral_2= '\"number\"' )
                    {
                    // InternalDraft7.g:3563:3: (enumLiteral_2= '\"number\"' )
                    // InternalDraft7.g:3564:4: enumLiteral_2= '\"number\"'
                    {
                    enumLiteral_2=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getJsonTypesAccess().getNumberEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getJsonTypesAccess().getNumberEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDraft7.g:3571:3: (enumLiteral_3= '\"object\"' )
                    {
                    // InternalDraft7.g:3571:3: (enumLiteral_3= '\"object\"' )
                    // InternalDraft7.g:3572:4: enumLiteral_3= '\"object\"'
                    {
                    enumLiteral_3=(Token)match(input,67,FOLLOW_2); 

                    				current = grammarAccess.getJsonTypesAccess().getObjectEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getJsonTypesAccess().getObjectEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalDraft7.g:3579:3: (enumLiteral_4= '\"array\"' )
                    {
                    // InternalDraft7.g:3579:3: (enumLiteral_4= '\"array\"' )
                    // InternalDraft7.g:3580:4: enumLiteral_4= '\"array\"'
                    {
                    enumLiteral_4=(Token)match(input,68,FOLLOW_2); 

                    				current = grammarAccess.getJsonTypesAccess().getArrayEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getJsonTypesAccess().getArrayEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalDraft7.g:3587:3: (enumLiteral_5= '\"boolean\"' )
                    {
                    // InternalDraft7.g:3587:3: (enumLiteral_5= '\"boolean\"' )
                    // InternalDraft7.g:3588:4: enumLiteral_5= '\"boolean\"'
                    {
                    enumLiteral_5=(Token)match(input,69,FOLLOW_2); 

                    				current = grammarAccess.getJsonTypesAccess().getBooleanEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getJsonTypesAccess().getBooleanEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalDraft7.g:3595:3: (enumLiteral_6= '\"null\"' )
                    {
                    // InternalDraft7.g:3595:3: (enumLiteral_6= '\"null\"' )
                    // InternalDraft7.g:3596:4: enumLiteral_6= '\"null\"'
                    {
                    enumLiteral_6=(Token)match(input,70,FOLLOW_2); 

                    				current = grammarAccess.getJsonTypesAccess().getNullEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getJsonTypesAccess().getNullEnumLiteralDeclaration_6());
                    			

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
    // $ANTLR end "ruleJsonTypes"


    // $ANTLR start "ruleFormatTypes"
    // InternalDraft7.g:3606:1: ruleFormatTypes returns [Enumerator current=null] : ( (enumLiteral_0= '\"date-time\"' ) | (enumLiteral_1= '\"time\"' ) | (enumLiteral_2= '\"date\"' ) | (enumLiteral_3= '\"email\"' ) | (enumLiteral_4= '\"idn-email\"' ) | (enumLiteral_5= '\"hostname\"' ) | (enumLiteral_6= '\"ipv4\"' ) | (enumLiteral_7= '\"ipv6\"' ) | (enumLiteral_8= '\"uri\"' ) | (enumLiteral_9= '\"uri-reference\"' ) | (enumLiteral_10= '\"iri\"' ) | (enumLiteral_11= '\"iri-reference\"' ) | (enumLiteral_12= '\"uri-template\"' ) | (enumLiteral_13= '\"json-pointer\"' ) | (enumLiteral_14= '\"relative-json-pointer\"' ) | (enumLiteral_15= '\"regex\"' ) ) ;
    public final Enumerator ruleFormatTypes() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;
        Token enumLiteral_12=null;
        Token enumLiteral_13=null;
        Token enumLiteral_14=null;
        Token enumLiteral_15=null;


        	enterRule();

        try {
            // InternalDraft7.g:3612:2: ( ( (enumLiteral_0= '\"date-time\"' ) | (enumLiteral_1= '\"time\"' ) | (enumLiteral_2= '\"date\"' ) | (enumLiteral_3= '\"email\"' ) | (enumLiteral_4= '\"idn-email\"' ) | (enumLiteral_5= '\"hostname\"' ) | (enumLiteral_6= '\"ipv4\"' ) | (enumLiteral_7= '\"ipv6\"' ) | (enumLiteral_8= '\"uri\"' ) | (enumLiteral_9= '\"uri-reference\"' ) | (enumLiteral_10= '\"iri\"' ) | (enumLiteral_11= '\"iri-reference\"' ) | (enumLiteral_12= '\"uri-template\"' ) | (enumLiteral_13= '\"json-pointer\"' ) | (enumLiteral_14= '\"relative-json-pointer\"' ) | (enumLiteral_15= '\"regex\"' ) ) )
            // InternalDraft7.g:3613:2: ( (enumLiteral_0= '\"date-time\"' ) | (enumLiteral_1= '\"time\"' ) | (enumLiteral_2= '\"date\"' ) | (enumLiteral_3= '\"email\"' ) | (enumLiteral_4= '\"idn-email\"' ) | (enumLiteral_5= '\"hostname\"' ) | (enumLiteral_6= '\"ipv4\"' ) | (enumLiteral_7= '\"ipv6\"' ) | (enumLiteral_8= '\"uri\"' ) | (enumLiteral_9= '\"uri-reference\"' ) | (enumLiteral_10= '\"iri\"' ) | (enumLiteral_11= '\"iri-reference\"' ) | (enumLiteral_12= '\"uri-template\"' ) | (enumLiteral_13= '\"json-pointer\"' ) | (enumLiteral_14= '\"relative-json-pointer\"' ) | (enumLiteral_15= '\"regex\"' ) )
            {
            // InternalDraft7.g:3613:2: ( (enumLiteral_0= '\"date-time\"' ) | (enumLiteral_1= '\"time\"' ) | (enumLiteral_2= '\"date\"' ) | (enumLiteral_3= '\"email\"' ) | (enumLiteral_4= '\"idn-email\"' ) | (enumLiteral_5= '\"hostname\"' ) | (enumLiteral_6= '\"ipv4\"' ) | (enumLiteral_7= '\"ipv6\"' ) | (enumLiteral_8= '\"uri\"' ) | (enumLiteral_9= '\"uri-reference\"' ) | (enumLiteral_10= '\"iri\"' ) | (enumLiteral_11= '\"iri-reference\"' ) | (enumLiteral_12= '\"uri-template\"' ) | (enumLiteral_13= '\"json-pointer\"' ) | (enumLiteral_14= '\"relative-json-pointer\"' ) | (enumLiteral_15= '\"regex\"' ) )
            int alt76=16;
            switch ( input.LA(1) ) {
            case 71:
                {
                alt76=1;
                }
                break;
            case 72:
                {
                alt76=2;
                }
                break;
            case 73:
                {
                alt76=3;
                }
                break;
            case 74:
                {
                alt76=4;
                }
                break;
            case 75:
                {
                alt76=5;
                }
                break;
            case 76:
                {
                alt76=6;
                }
                break;
            case 77:
                {
                alt76=7;
                }
                break;
            case 78:
                {
                alt76=8;
                }
                break;
            case 79:
                {
                alt76=9;
                }
                break;
            case 80:
                {
                alt76=10;
                }
                break;
            case 81:
                {
                alt76=11;
                }
                break;
            case 82:
                {
                alt76=12;
                }
                break;
            case 83:
                {
                alt76=13;
                }
                break;
            case 84:
                {
                alt76=14;
                }
                break;
            case 85:
                {
                alt76=15;
                }
                break;
            case 86:
                {
                alt76=16;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }

            switch (alt76) {
                case 1 :
                    // InternalDraft7.g:3614:3: (enumLiteral_0= '\"date-time\"' )
                    {
                    // InternalDraft7.g:3614:3: (enumLiteral_0= '\"date-time\"' )
                    // InternalDraft7.g:3615:4: enumLiteral_0= '\"date-time\"'
                    {
                    enumLiteral_0=(Token)match(input,71,FOLLOW_2); 

                    				current = grammarAccess.getFormatTypesAccess().getDate_timeEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getFormatTypesAccess().getDate_timeEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDraft7.g:3622:3: (enumLiteral_1= '\"time\"' )
                    {
                    // InternalDraft7.g:3622:3: (enumLiteral_1= '\"time\"' )
                    // InternalDraft7.g:3623:4: enumLiteral_1= '\"time\"'
                    {
                    enumLiteral_1=(Token)match(input,72,FOLLOW_2); 

                    				current = grammarAccess.getFormatTypesAccess().getTimeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getFormatTypesAccess().getTimeEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDraft7.g:3630:3: (enumLiteral_2= '\"date\"' )
                    {
                    // InternalDraft7.g:3630:3: (enumLiteral_2= '\"date\"' )
                    // InternalDraft7.g:3631:4: enumLiteral_2= '\"date\"'
                    {
                    enumLiteral_2=(Token)match(input,73,FOLLOW_2); 

                    				current = grammarAccess.getFormatTypesAccess().getDateEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getFormatTypesAccess().getDateEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDraft7.g:3638:3: (enumLiteral_3= '\"email\"' )
                    {
                    // InternalDraft7.g:3638:3: (enumLiteral_3= '\"email\"' )
                    // InternalDraft7.g:3639:4: enumLiteral_3= '\"email\"'
                    {
                    enumLiteral_3=(Token)match(input,74,FOLLOW_2); 

                    				current = grammarAccess.getFormatTypesAccess().getEmailEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getFormatTypesAccess().getEmailEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalDraft7.g:3646:3: (enumLiteral_4= '\"idn-email\"' )
                    {
                    // InternalDraft7.g:3646:3: (enumLiteral_4= '\"idn-email\"' )
                    // InternalDraft7.g:3647:4: enumLiteral_4= '\"idn-email\"'
                    {
                    enumLiteral_4=(Token)match(input,75,FOLLOW_2); 

                    				current = grammarAccess.getFormatTypesAccess().getIdn_emailEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getFormatTypesAccess().getIdn_emailEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalDraft7.g:3654:3: (enumLiteral_5= '\"hostname\"' )
                    {
                    // InternalDraft7.g:3654:3: (enumLiteral_5= '\"hostname\"' )
                    // InternalDraft7.g:3655:4: enumLiteral_5= '\"hostname\"'
                    {
                    enumLiteral_5=(Token)match(input,76,FOLLOW_2); 

                    				current = grammarAccess.getFormatTypesAccess().getHostnameEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getFormatTypesAccess().getHostnameEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalDraft7.g:3662:3: (enumLiteral_6= '\"ipv4\"' )
                    {
                    // InternalDraft7.g:3662:3: (enumLiteral_6= '\"ipv4\"' )
                    // InternalDraft7.g:3663:4: enumLiteral_6= '\"ipv4\"'
                    {
                    enumLiteral_6=(Token)match(input,77,FOLLOW_2); 

                    				current = grammarAccess.getFormatTypesAccess().getIpv4EnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getFormatTypesAccess().getIpv4EnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalDraft7.g:3670:3: (enumLiteral_7= '\"ipv6\"' )
                    {
                    // InternalDraft7.g:3670:3: (enumLiteral_7= '\"ipv6\"' )
                    // InternalDraft7.g:3671:4: enumLiteral_7= '\"ipv6\"'
                    {
                    enumLiteral_7=(Token)match(input,78,FOLLOW_2); 

                    				current = grammarAccess.getFormatTypesAccess().getIpv6EnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getFormatTypesAccess().getIpv6EnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalDraft7.g:3678:3: (enumLiteral_8= '\"uri\"' )
                    {
                    // InternalDraft7.g:3678:3: (enumLiteral_8= '\"uri\"' )
                    // InternalDraft7.g:3679:4: enumLiteral_8= '\"uri\"'
                    {
                    enumLiteral_8=(Token)match(input,79,FOLLOW_2); 

                    				current = grammarAccess.getFormatTypesAccess().getUriEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getFormatTypesAccess().getUriEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalDraft7.g:3686:3: (enumLiteral_9= '\"uri-reference\"' )
                    {
                    // InternalDraft7.g:3686:3: (enumLiteral_9= '\"uri-reference\"' )
                    // InternalDraft7.g:3687:4: enumLiteral_9= '\"uri-reference\"'
                    {
                    enumLiteral_9=(Token)match(input,80,FOLLOW_2); 

                    				current = grammarAccess.getFormatTypesAccess().getUri_referenceEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getFormatTypesAccess().getUri_referenceEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalDraft7.g:3694:3: (enumLiteral_10= '\"iri\"' )
                    {
                    // InternalDraft7.g:3694:3: (enumLiteral_10= '\"iri\"' )
                    // InternalDraft7.g:3695:4: enumLiteral_10= '\"iri\"'
                    {
                    enumLiteral_10=(Token)match(input,81,FOLLOW_2); 

                    				current = grammarAccess.getFormatTypesAccess().getIriEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getFormatTypesAccess().getIriEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalDraft7.g:3702:3: (enumLiteral_11= '\"iri-reference\"' )
                    {
                    // InternalDraft7.g:3702:3: (enumLiteral_11= '\"iri-reference\"' )
                    // InternalDraft7.g:3703:4: enumLiteral_11= '\"iri-reference\"'
                    {
                    enumLiteral_11=(Token)match(input,82,FOLLOW_2); 

                    				current = grammarAccess.getFormatTypesAccess().getIri_referenceEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_11, grammarAccess.getFormatTypesAccess().getIri_referenceEnumLiteralDeclaration_11());
                    			

                    }


                    }
                    break;
                case 13 :
                    // InternalDraft7.g:3710:3: (enumLiteral_12= '\"uri-template\"' )
                    {
                    // InternalDraft7.g:3710:3: (enumLiteral_12= '\"uri-template\"' )
                    // InternalDraft7.g:3711:4: enumLiteral_12= '\"uri-template\"'
                    {
                    enumLiteral_12=(Token)match(input,83,FOLLOW_2); 

                    				current = grammarAccess.getFormatTypesAccess().getUri_templateEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_12, grammarAccess.getFormatTypesAccess().getUri_templateEnumLiteralDeclaration_12());
                    			

                    }


                    }
                    break;
                case 14 :
                    // InternalDraft7.g:3718:3: (enumLiteral_13= '\"json-pointer\"' )
                    {
                    // InternalDraft7.g:3718:3: (enumLiteral_13= '\"json-pointer\"' )
                    // InternalDraft7.g:3719:4: enumLiteral_13= '\"json-pointer\"'
                    {
                    enumLiteral_13=(Token)match(input,84,FOLLOW_2); 

                    				current = grammarAccess.getFormatTypesAccess().getJson_pointerEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_13, grammarAccess.getFormatTypesAccess().getJson_pointerEnumLiteralDeclaration_13());
                    			

                    }


                    }
                    break;
                case 15 :
                    // InternalDraft7.g:3726:3: (enumLiteral_14= '\"relative-json-pointer\"' )
                    {
                    // InternalDraft7.g:3726:3: (enumLiteral_14= '\"relative-json-pointer\"' )
                    // InternalDraft7.g:3727:4: enumLiteral_14= '\"relative-json-pointer\"'
                    {
                    enumLiteral_14=(Token)match(input,85,FOLLOW_2); 

                    				current = grammarAccess.getFormatTypesAccess().getRelative_json_pointerEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_14, grammarAccess.getFormatTypesAccess().getRelative_json_pointerEnumLiteralDeclaration_14());
                    			

                    }


                    }
                    break;
                case 16 :
                    // InternalDraft7.g:3734:3: (enumLiteral_15= '\"regex\"' )
                    {
                    // InternalDraft7.g:3734:3: (enumLiteral_15= '\"regex\"' )
                    // InternalDraft7.g:3735:4: enumLiteral_15= '\"regex\"'
                    {
                    enumLiteral_15=(Token)match(input,86,FOLLOW_2); 

                    				current = grammarAccess.getFormatTypesAccess().getRegexEnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_15, grammarAccess.getFormatTypesAccess().getRegexEnumLiteralDeclaration_15());
                    			

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
    // $ANTLR end "ruleFormatTypes"


    // $ANTLR start "ruleJsonSchemaKeyword"
    // InternalDraft7.g:3745:1: ruleJsonSchemaKeyword returns [Enumerator current=null] : ( (enumLiteral_0= '\"title\"' ) | (enumLiteral_1= '\"http://json-schema.org/draft-07/schema#\"' ) | (enumLiteral_2= '\"additionalProperties\"' ) | (enumLiteral_3= '\"additionalItems\"' ) | (enumLiteral_4= '\"description\"' ) | (enumLiteral_5= '\"$comment\"' ) | (enumLiteral_6= '\"$id\"' ) | (enumLiteral_7= '\"definitions\"' ) | (enumLiteral_8= '\"default\"' ) | (enumLiteral_9= '\"examples\"' ) | (enumLiteral_10= '\"$schema\"' ) | (enumLiteral_11= '\"$ref\"' ) | (enumLiteral_12= '\"enum\"' ) | (enumLiteral_13= '\"const\"' ) | (enumLiteral_14= '\"type\"' ) | (enumLiteral_15= '\"string\"' ) | (enumLiteral_16= '\"integer\"' ) | (enumLiteral_17= '\"number\"' ) | (enumLiteral_18= '\"object\"' ) | (enumLiteral_19= '\"array\"' ) | (enumLiteral_20= '\"boolean\"' ) | (enumLiteral_21= '\"null\"' ) | (enumLiteral_22= '\"date-time\"' ) | (enumLiteral_23= '\"time\"' ) | (enumLiteral_24= '\"date\"' ) | (enumLiteral_25= '\"email\"' ) | (enumLiteral_26= '\"idn-email\"' ) | (enumLiteral_27= '\"hostname\"' ) | (enumLiteral_28= '\"ipv4\"' ) | (enumLiteral_29= '\"ipv6\"' ) | (enumLiteral_30= '\"uri\"' ) | (enumLiteral_31= '\"uri-reference\"' ) | (enumLiteral_32= '\"iri\"' ) | (enumLiteral_33= '\"iri-reference\"' ) | (enumLiteral_34= '\"uri-template\"' ) | (enumLiteral_35= '\"json-pointer\"' ) | (enumLiteral_36= '\"relative-json-pointer\"' ) | (enumLiteral_37= '\"regex\"' ) | (enumLiteral_38= '\"contains\"' ) | (enumLiteral_39= '\"uniqueItems\"' ) | (enumLiteral_40= '\"propertyNames\"' ) | (enumLiteral_41= '\"length\"' ) | (enumLiteral_42= '\"minLength\"' ) | (enumLiteral_43= '\"maxLength\"' ) | (enumLiteral_44= '\"minItems\"' ) | (enumLiteral_45= '\"maxItems\"' ) | (enumLiteral_46= '\"pattern\"' ) | (enumLiteral_47= '\"format\"' ) | (enumLiteral_48= '\"minProperties\"' ) | (enumLiteral_49= '\"maxProperties\"' ) | (enumLiteral_50= '\"dependencies\"' ) | (enumLiteral_51= '\"patternProperties\"' ) | (enumLiteral_52= '\"required\"' ) | (enumLiteral_53= '\"properties\"' ) | (enumLiteral_54= '\"if\"' ) | (enumLiteral_55= '\"then\"' ) | (enumLiteral_56= '\"else\"' ) | (enumLiteral_57= '\"anyOf\"' ) | (enumLiteral_58= '\"oneOf\"' ) | (enumLiteral_59= '\"allOf\"' ) | (enumLiteral_60= '\"not\"' ) | (enumLiteral_61= '\"items\"' ) | (enumLiteral_62= '\"contentMediaType\"' ) | (enumLiteral_63= '\"contentEncoding\"' ) | (enumLiteral_64= '\"multiples\"' ) | (enumLiteral_65= '\"minimum\"' ) | (enumLiteral_66= '\"exclusiveMinimum\"' ) | (enumLiteral_67= '\"maximum\"' ) | (enumLiteral_68= '\"exclusiveMaximum\"' ) ) ;
    public final Enumerator ruleJsonSchemaKeyword() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;
        Token enumLiteral_12=null;
        Token enumLiteral_13=null;
        Token enumLiteral_14=null;
        Token enumLiteral_15=null;
        Token enumLiteral_16=null;
        Token enumLiteral_17=null;
        Token enumLiteral_18=null;
        Token enumLiteral_19=null;
        Token enumLiteral_20=null;
        Token enumLiteral_21=null;
        Token enumLiteral_22=null;
        Token enumLiteral_23=null;
        Token enumLiteral_24=null;
        Token enumLiteral_25=null;
        Token enumLiteral_26=null;
        Token enumLiteral_27=null;
        Token enumLiteral_28=null;
        Token enumLiteral_29=null;
        Token enumLiteral_30=null;
        Token enumLiteral_31=null;
        Token enumLiteral_32=null;
        Token enumLiteral_33=null;
        Token enumLiteral_34=null;
        Token enumLiteral_35=null;
        Token enumLiteral_36=null;
        Token enumLiteral_37=null;
        Token enumLiteral_38=null;
        Token enumLiteral_39=null;
        Token enumLiteral_40=null;
        Token enumLiteral_41=null;
        Token enumLiteral_42=null;
        Token enumLiteral_43=null;
        Token enumLiteral_44=null;
        Token enumLiteral_45=null;
        Token enumLiteral_46=null;
        Token enumLiteral_47=null;
        Token enumLiteral_48=null;
        Token enumLiteral_49=null;
        Token enumLiteral_50=null;
        Token enumLiteral_51=null;
        Token enumLiteral_52=null;
        Token enumLiteral_53=null;
        Token enumLiteral_54=null;
        Token enumLiteral_55=null;
        Token enumLiteral_56=null;
        Token enumLiteral_57=null;
        Token enumLiteral_58=null;
        Token enumLiteral_59=null;
        Token enumLiteral_60=null;
        Token enumLiteral_61=null;
        Token enumLiteral_62=null;
        Token enumLiteral_63=null;
        Token enumLiteral_64=null;
        Token enumLiteral_65=null;
        Token enumLiteral_66=null;
        Token enumLiteral_67=null;
        Token enumLiteral_68=null;


        	enterRule();

        try {
            // InternalDraft7.g:3751:2: ( ( (enumLiteral_0= '\"title\"' ) | (enumLiteral_1= '\"http://json-schema.org/draft-07/schema#\"' ) | (enumLiteral_2= '\"additionalProperties\"' ) | (enumLiteral_3= '\"additionalItems\"' ) | (enumLiteral_4= '\"description\"' ) | (enumLiteral_5= '\"$comment\"' ) | (enumLiteral_6= '\"$id\"' ) | (enumLiteral_7= '\"definitions\"' ) | (enumLiteral_8= '\"default\"' ) | (enumLiteral_9= '\"examples\"' ) | (enumLiteral_10= '\"$schema\"' ) | (enumLiteral_11= '\"$ref\"' ) | (enumLiteral_12= '\"enum\"' ) | (enumLiteral_13= '\"const\"' ) | (enumLiteral_14= '\"type\"' ) | (enumLiteral_15= '\"string\"' ) | (enumLiteral_16= '\"integer\"' ) | (enumLiteral_17= '\"number\"' ) | (enumLiteral_18= '\"object\"' ) | (enumLiteral_19= '\"array\"' ) | (enumLiteral_20= '\"boolean\"' ) | (enumLiteral_21= '\"null\"' ) | (enumLiteral_22= '\"date-time\"' ) | (enumLiteral_23= '\"time\"' ) | (enumLiteral_24= '\"date\"' ) | (enumLiteral_25= '\"email\"' ) | (enumLiteral_26= '\"idn-email\"' ) | (enumLiteral_27= '\"hostname\"' ) | (enumLiteral_28= '\"ipv4\"' ) | (enumLiteral_29= '\"ipv6\"' ) | (enumLiteral_30= '\"uri\"' ) | (enumLiteral_31= '\"uri-reference\"' ) | (enumLiteral_32= '\"iri\"' ) | (enumLiteral_33= '\"iri-reference\"' ) | (enumLiteral_34= '\"uri-template\"' ) | (enumLiteral_35= '\"json-pointer\"' ) | (enumLiteral_36= '\"relative-json-pointer\"' ) | (enumLiteral_37= '\"regex\"' ) | (enumLiteral_38= '\"contains\"' ) | (enumLiteral_39= '\"uniqueItems\"' ) | (enumLiteral_40= '\"propertyNames\"' ) | (enumLiteral_41= '\"length\"' ) | (enumLiteral_42= '\"minLength\"' ) | (enumLiteral_43= '\"maxLength\"' ) | (enumLiteral_44= '\"minItems\"' ) | (enumLiteral_45= '\"maxItems\"' ) | (enumLiteral_46= '\"pattern\"' ) | (enumLiteral_47= '\"format\"' ) | (enumLiteral_48= '\"minProperties\"' ) | (enumLiteral_49= '\"maxProperties\"' ) | (enumLiteral_50= '\"dependencies\"' ) | (enumLiteral_51= '\"patternProperties\"' ) | (enumLiteral_52= '\"required\"' ) | (enumLiteral_53= '\"properties\"' ) | (enumLiteral_54= '\"if\"' ) | (enumLiteral_55= '\"then\"' ) | (enumLiteral_56= '\"else\"' ) | (enumLiteral_57= '\"anyOf\"' ) | (enumLiteral_58= '\"oneOf\"' ) | (enumLiteral_59= '\"allOf\"' ) | (enumLiteral_60= '\"not\"' ) | (enumLiteral_61= '\"items\"' ) | (enumLiteral_62= '\"contentMediaType\"' ) | (enumLiteral_63= '\"contentEncoding\"' ) | (enumLiteral_64= '\"multiples\"' ) | (enumLiteral_65= '\"minimum\"' ) | (enumLiteral_66= '\"exclusiveMinimum\"' ) | (enumLiteral_67= '\"maximum\"' ) | (enumLiteral_68= '\"exclusiveMaximum\"' ) ) )
            // InternalDraft7.g:3752:2: ( (enumLiteral_0= '\"title\"' ) | (enumLiteral_1= '\"http://json-schema.org/draft-07/schema#\"' ) | (enumLiteral_2= '\"additionalProperties\"' ) | (enumLiteral_3= '\"additionalItems\"' ) | (enumLiteral_4= '\"description\"' ) | (enumLiteral_5= '\"$comment\"' ) | (enumLiteral_6= '\"$id\"' ) | (enumLiteral_7= '\"definitions\"' ) | (enumLiteral_8= '\"default\"' ) | (enumLiteral_9= '\"examples\"' ) | (enumLiteral_10= '\"$schema\"' ) | (enumLiteral_11= '\"$ref\"' ) | (enumLiteral_12= '\"enum\"' ) | (enumLiteral_13= '\"const\"' ) | (enumLiteral_14= '\"type\"' ) | (enumLiteral_15= '\"string\"' ) | (enumLiteral_16= '\"integer\"' ) | (enumLiteral_17= '\"number\"' ) | (enumLiteral_18= '\"object\"' ) | (enumLiteral_19= '\"array\"' ) | (enumLiteral_20= '\"boolean\"' ) | (enumLiteral_21= '\"null\"' ) | (enumLiteral_22= '\"date-time\"' ) | (enumLiteral_23= '\"time\"' ) | (enumLiteral_24= '\"date\"' ) | (enumLiteral_25= '\"email\"' ) | (enumLiteral_26= '\"idn-email\"' ) | (enumLiteral_27= '\"hostname\"' ) | (enumLiteral_28= '\"ipv4\"' ) | (enumLiteral_29= '\"ipv6\"' ) | (enumLiteral_30= '\"uri\"' ) | (enumLiteral_31= '\"uri-reference\"' ) | (enumLiteral_32= '\"iri\"' ) | (enumLiteral_33= '\"iri-reference\"' ) | (enumLiteral_34= '\"uri-template\"' ) | (enumLiteral_35= '\"json-pointer\"' ) | (enumLiteral_36= '\"relative-json-pointer\"' ) | (enumLiteral_37= '\"regex\"' ) | (enumLiteral_38= '\"contains\"' ) | (enumLiteral_39= '\"uniqueItems\"' ) | (enumLiteral_40= '\"propertyNames\"' ) | (enumLiteral_41= '\"length\"' ) | (enumLiteral_42= '\"minLength\"' ) | (enumLiteral_43= '\"maxLength\"' ) | (enumLiteral_44= '\"minItems\"' ) | (enumLiteral_45= '\"maxItems\"' ) | (enumLiteral_46= '\"pattern\"' ) | (enumLiteral_47= '\"format\"' ) | (enumLiteral_48= '\"minProperties\"' ) | (enumLiteral_49= '\"maxProperties\"' ) | (enumLiteral_50= '\"dependencies\"' ) | (enumLiteral_51= '\"patternProperties\"' ) | (enumLiteral_52= '\"required\"' ) | (enumLiteral_53= '\"properties\"' ) | (enumLiteral_54= '\"if\"' ) | (enumLiteral_55= '\"then\"' ) | (enumLiteral_56= '\"else\"' ) | (enumLiteral_57= '\"anyOf\"' ) | (enumLiteral_58= '\"oneOf\"' ) | (enumLiteral_59= '\"allOf\"' ) | (enumLiteral_60= '\"not\"' ) | (enumLiteral_61= '\"items\"' ) | (enumLiteral_62= '\"contentMediaType\"' ) | (enumLiteral_63= '\"contentEncoding\"' ) | (enumLiteral_64= '\"multiples\"' ) | (enumLiteral_65= '\"minimum\"' ) | (enumLiteral_66= '\"exclusiveMinimum\"' ) | (enumLiteral_67= '\"maximum\"' ) | (enumLiteral_68= '\"exclusiveMaximum\"' ) )
            {
            // InternalDraft7.g:3752:2: ( (enumLiteral_0= '\"title\"' ) | (enumLiteral_1= '\"http://json-schema.org/draft-07/schema#\"' ) | (enumLiteral_2= '\"additionalProperties\"' ) | (enumLiteral_3= '\"additionalItems\"' ) | (enumLiteral_4= '\"description\"' ) | (enumLiteral_5= '\"$comment\"' ) | (enumLiteral_6= '\"$id\"' ) | (enumLiteral_7= '\"definitions\"' ) | (enumLiteral_8= '\"default\"' ) | (enumLiteral_9= '\"examples\"' ) | (enumLiteral_10= '\"$schema\"' ) | (enumLiteral_11= '\"$ref\"' ) | (enumLiteral_12= '\"enum\"' ) | (enumLiteral_13= '\"const\"' ) | (enumLiteral_14= '\"type\"' ) | (enumLiteral_15= '\"string\"' ) | (enumLiteral_16= '\"integer\"' ) | (enumLiteral_17= '\"number\"' ) | (enumLiteral_18= '\"object\"' ) | (enumLiteral_19= '\"array\"' ) | (enumLiteral_20= '\"boolean\"' ) | (enumLiteral_21= '\"null\"' ) | (enumLiteral_22= '\"date-time\"' ) | (enumLiteral_23= '\"time\"' ) | (enumLiteral_24= '\"date\"' ) | (enumLiteral_25= '\"email\"' ) | (enumLiteral_26= '\"idn-email\"' ) | (enumLiteral_27= '\"hostname\"' ) | (enumLiteral_28= '\"ipv4\"' ) | (enumLiteral_29= '\"ipv6\"' ) | (enumLiteral_30= '\"uri\"' ) | (enumLiteral_31= '\"uri-reference\"' ) | (enumLiteral_32= '\"iri\"' ) | (enumLiteral_33= '\"iri-reference\"' ) | (enumLiteral_34= '\"uri-template\"' ) | (enumLiteral_35= '\"json-pointer\"' ) | (enumLiteral_36= '\"relative-json-pointer\"' ) | (enumLiteral_37= '\"regex\"' ) | (enumLiteral_38= '\"contains\"' ) | (enumLiteral_39= '\"uniqueItems\"' ) | (enumLiteral_40= '\"propertyNames\"' ) | (enumLiteral_41= '\"length\"' ) | (enumLiteral_42= '\"minLength\"' ) | (enumLiteral_43= '\"maxLength\"' ) | (enumLiteral_44= '\"minItems\"' ) | (enumLiteral_45= '\"maxItems\"' ) | (enumLiteral_46= '\"pattern\"' ) | (enumLiteral_47= '\"format\"' ) | (enumLiteral_48= '\"minProperties\"' ) | (enumLiteral_49= '\"maxProperties\"' ) | (enumLiteral_50= '\"dependencies\"' ) | (enumLiteral_51= '\"patternProperties\"' ) | (enumLiteral_52= '\"required\"' ) | (enumLiteral_53= '\"properties\"' ) | (enumLiteral_54= '\"if\"' ) | (enumLiteral_55= '\"then\"' ) | (enumLiteral_56= '\"else\"' ) | (enumLiteral_57= '\"anyOf\"' ) | (enumLiteral_58= '\"oneOf\"' ) | (enumLiteral_59= '\"allOf\"' ) | (enumLiteral_60= '\"not\"' ) | (enumLiteral_61= '\"items\"' ) | (enumLiteral_62= '\"contentMediaType\"' ) | (enumLiteral_63= '\"contentEncoding\"' ) | (enumLiteral_64= '\"multiples\"' ) | (enumLiteral_65= '\"minimum\"' ) | (enumLiteral_66= '\"exclusiveMinimum\"' ) | (enumLiteral_67= '\"maximum\"' ) | (enumLiteral_68= '\"exclusiveMaximum\"' ) )
            int alt77=69;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt77=1;
                }
                break;
            case 33:
                {
                alt77=2;
                }
                break;
            case 17:
                {
                alt77=3;
                }
                break;
            case 18:
                {
                alt77=4;
                }
                break;
            case 29:
                {
                alt77=5;
                }
                break;
            case 87:
                {
                alt77=6;
                }
                break;
            case 34:
                {
                alt77=7;
                }
                break;
            case 24:
                {
                alt77=8;
                }
                break;
            case 19:
                {
                alt77=9;
                }
                break;
            case 21:
                {
                alt77=10;
                }
                break;
            case 32:
                {
                alt77=11;
                }
                break;
            case 60:
                {
                alt77=12;
                }
                break;
            case 31:
                {
                alt77=13;
                }
                break;
            case 38:
                {
                alt77=14;
                }
                break;
            case 12:
                {
                alt77=15;
                }
                break;
            case 64:
                {
                alt77=16;
                }
                break;
            case 65:
                {
                alt77=17;
                }
                break;
            case 66:
                {
                alt77=18;
                }
                break;
            case 67:
                {
                alt77=19;
                }
                break;
            case 68:
                {
                alt77=20;
                }
                break;
            case 69:
                {
                alt77=21;
                }
                break;
            case 70:
                {
                alt77=22;
                }
                break;
            case 71:
                {
                alt77=23;
                }
                break;
            case 72:
                {
                alt77=24;
                }
                break;
            case 73:
                {
                alt77=25;
                }
                break;
            case 74:
                {
                alt77=26;
                }
                break;
            case 75:
                {
                alt77=27;
                }
                break;
            case 76:
                {
                alt77=28;
                }
                break;
            case 77:
                {
                alt77=29;
                }
                break;
            case 78:
                {
                alt77=30;
                }
                break;
            case 79:
                {
                alt77=31;
                }
                break;
            case 80:
                {
                alt77=32;
                }
                break;
            case 81:
                {
                alt77=33;
                }
                break;
            case 82:
                {
                alt77=34;
                }
                break;
            case 83:
                {
                alt77=35;
                }
                break;
            case 84:
                {
                alt77=36;
                }
                break;
            case 85:
                {
                alt77=37;
                }
                break;
            case 86:
                {
                alt77=38;
                }
                break;
            case 23:
                {
                alt77=39;
                }
                break;
            case 43:
                {
                alt77=40;
                }
                break;
            case 44:
                {
                alt77=41;
                }
                break;
            case 88:
                {
                alt77=42;
                }
                break;
            case 50:
                {
                alt77=43;
                }
                break;
            case 49:
                {
                alt77=44;
                }
                break;
            case 48:
                {
                alt77=45;
                }
                break;
            case 47:
                {
                alt77=46;
                }
                break;
            case 51:
                {
                alt77=47;
                }
                break;
            case 52:
                {
                alt77=48;
                }
                break;
            case 45:
                {
                alt77=49;
                }
                break;
            case 46:
                {
                alt77=50;
                }
                break;
            case 15:
                {
                alt77=51;
                }
                break;
            case 20:
                {
                alt77=52;
                }
                break;
            case 26:
                {
                alt77=53;
                }
                break;
            case 30:
                {
                alt77=54;
                }
                break;
            case 35:
                {
                alt77=55;
                }
                break;
            case 36:
                {
                alt77=56;
                }
                break;
            case 37:
                {
                alt77=57;
                }
                break;
            case 39:
                {
                alt77=58;
                }
                break;
            case 40:
                {
                alt77=59;
                }
                break;
            case 41:
                {
                alt77=60;
                }
                break;
            case 42:
                {
                alt77=61;
                }
                break;
            case 22:
                {
                alt77=62;
                }
                break;
            case 53:
                {
                alt77=63;
                }
                break;
            case 54:
                {
                alt77=64;
                }
                break;
            case 55:
                {
                alt77=65;
                }
                break;
            case 56:
                {
                alt77=66;
                }
                break;
            case 57:
                {
                alt77=67;
                }
                break;
            case 58:
                {
                alt77=68;
                }
                break;
            case 59:
                {
                alt77=69;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }

            switch (alt77) {
                case 1 :
                    // InternalDraft7.g:3753:3: (enumLiteral_0= '\"title\"' )
                    {
                    // InternalDraft7.g:3753:3: (enumLiteral_0= '\"title\"' )
                    // InternalDraft7.g:3754:4: enumLiteral_0= '\"title\"'
                    {
                    enumLiteral_0=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getJsonSchemaKeywordAccess().getTitleEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getJsonSchemaKeywordAccess().getTitleEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDraft7.g:3761:3: (enumLiteral_1= '\"http://json-schema.org/draft-07/schema#\"' )
                    {
                    // InternalDraft7.g:3761:3: (enumLiteral_1= '\"http://json-schema.org/draft-07/schema#\"' )
                    // InternalDraft7.g:3762:4: enumLiteral_1= '\"http://json-schema.org/draft-07/schema#\"'
                    {
                    enumLiteral_1=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getJsonSchemaKeywordAccess().getSchemaDraft7EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getJsonSchemaKeywordAccess().getSchemaDraft7EnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDraft7.g:3769:3: (enumLiteral_2= '\"additionalProperties\"' )
                    {
                    // InternalDraft7.g:3769:3: (enumLiteral_2= '\"additionalProperties\"' )
                    // InternalDraft7.g:3770:4: enumLiteral_2= '\"additionalProperties\"'
                    {
                    enumLiteral_2=(Token)match(input,17,FOLLOW_2); 

                    				current = grammarAccess.getJsonSchemaKeywordAccess().getAdditionalPropertiesEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getJsonSchemaKeywordAccess().getAdditionalPropertiesEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDraft7.g:3777:3: (enumLiteral_3= '\"additionalItems\"' )
                    {
                    // InternalDraft7.g:3777:3: (enumLiteral_3= '\"additionalItems\"' )
                    // InternalDraft7.g:3778:4: enumLiteral_3= '\"additionalItems\"'
                    {
                    enumLiteral_3=(Token)match(input,18,FOLLOW_2); 

                    				current = grammarAccess.getJsonSchemaKeywordAccess().getAdditionalItemsEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getJsonSchemaKeywordAccess().getAdditionalItemsEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalDraft7.g:3785:3: (enumLiteral_4= '\"description\"' )
                    {
                    // InternalDraft7.g:3785:3: (enumLiteral_4= '\"description\"' )
                    // InternalDraft7.g:3786:4: enumLiteral_4= '\"description\"'
                    {
                    enumLiteral_4=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getJsonSchemaKeywordAccess().getDescriptionEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getJsonSchemaKeywordAccess().getDescriptionEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalDraft7.g:3793:3: (enumLiteral_5= '\"$comment\"' )
                    {
                    // InternalDraft7.g:3793:3: (enumLiteral_5= '\"$comment\"' )
                    // InternalDraft7.g:3794:4: enumLiteral_5= '\"$comment\"'
                    {
                    enumLiteral_5=(Token)match(input,87,FOLLOW_2); 

                    				current = grammarAccess.getJsonSchemaKeywordAccess().getCommentEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getJsonSchemaKeywordAccess().getCommentEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalDraft7.g:3801:3: (enumLiteral_6= '\"$id\"' )
                    {
                    // InternalDraft7.g:3801:3: (enumLiteral_6= '\"$id\"' )
                    // InternalDraft7.g:3802:4: enumLiteral_6= '\"$id\"'
                    {
                    enumLiteral_6=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getJsonSchemaKeywordAccess().getIdEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getJsonSchemaKeywordAccess().getIdEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalDraft7.g:3809:3: (enumLiteral_7= '\"definitions\"' )
                    {
                    // InternalDraft7.g:3809:3: (enumLiteral_7= '\"definitions\"' )
                    // InternalDraft7.g:3810:4: enumLiteral_7= '\"definitions\"'
                    {
                    enumLiteral_7=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getJsonSchemaKeywordAccess().getDefinitionsEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getJsonSchemaKeywordAccess().getDefinitionsEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalDraft7.g:3817:3: (enumLiteral_8= '\"default\"' )
                    {
                    // InternalDraft7.g:3817:3: (enumLiteral_8= '\"default\"' )
                    // InternalDraft7.g:3818:4: enumLiteral_8= '\"default\"'
                    {
                    enumLiteral_8=(Token)match(input,19,FOLLOW_2); 

                    				current = grammarAccess.getJsonSchemaKeywordAccess().getDefaultEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getJsonSchemaKeywordAccess().getDefaultEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalDraft7.g:3825:3: (enumLiteral_9= '\"examples\"' )
                    {
                    // InternalDraft7.g:3825:3: (enumLiteral_9= '\"examples\"' )
                    // InternalDraft7.g:3826:4: enumLiteral_9= '\"examples\"'
                    {
                    enumLiteral_9=(Token)match(input,21,FOLLOW_2); 

                    				current = grammarAccess.getJsonSchemaKeywordAccess().getExamplesEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getJsonSchemaKeywordAccess().getExamplesEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalDraft7.g:3833:3: (enumLiteral_10= '\"$schema\"' )
                    {
                    // InternalDraft7.g:3833:3: (enumLiteral_10= '\"$schema\"' )
                    // InternalDraft7.g:3834:4: enumLiteral_10= '\"$schema\"'
                    {
                    enumLiteral_10=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getJsonSchemaKeywordAccess().getSchemaEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getJsonSchemaKeywordAccess().getSchemaEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalDraft7.g:3841:3: (enumLiteral_11= '\"$ref\"' )
                    {
                    // InternalDraft7.g:3841:3: (enumLiteral_11= '\"$ref\"' )
                    // InternalDraft7.g:3842:4: enumLiteral_11= '\"$ref\"'
                    {
                    enumLiteral_11=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getJsonSchemaKeywordAccess().getRefEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_11, grammarAccess.getJsonSchemaKeywordAccess().getRefEnumLiteralDeclaration_11());
                    			

                    }


                    }
                    break;
                case 13 :
                    // InternalDraft7.g:3849:3: (enumLiteral_12= '\"enum\"' )
                    {
                    // InternalDraft7.g:3849:3: (enumLiteral_12= '\"enum\"' )
                    // InternalDraft7.g:3850:4: enumLiteral_12= '\"enum\"'
                    {
                    enumLiteral_12=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getJsonSchemaKeywordAccess().getEnumKeywordEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_12, grammarAccess.getJsonSchemaKeywordAccess().getEnumKeywordEnumLiteralDeclaration_12());
                    			

                    }


                    }
                    break;
                case 14 :
                    // InternalDraft7.g:3857:3: (enumLiteral_13= '\"const\"' )
                    {
                    // InternalDraft7.g:3857:3: (enumLiteral_13= '\"const\"' )
                    // InternalDraft7.g:3858:4: enumLiteral_13= '\"const\"'
                    {
                    enumLiteral_13=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getJsonSchemaKeywordAccess().getConstEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_13, grammarAccess.getJsonSchemaKeywordAccess().getConstEnumLiteralDeclaration_13());
                    			

                    }


                    }
                    break;
                case 15 :
                    // InternalDraft7.g:3865:3: (enumLiteral_14= '\"type\"' )
                    {
                    // InternalDraft7.g:3865:3: (enumLiteral_14= '\"type\"' )
                    // InternalDraft7.g:3866:4: enumLiteral_14= '\"type\"'
                    {
                    enumLiteral_14=(Token)match(input,12,FOLLOW_2); 

                    				current = grammarAccess.getJsonSchemaKeywordAccess().getTypeEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_14, grammarAccess.getJsonSchemaKeywordAccess().getTypeEnumLiteralDeclaration_14());
                    			

                    }


                    }
                    break;
                case 16 :
                    // InternalDraft7.g:3873:3: (enumLiteral_15= '\"string\"' )
                    {
                    // InternalDraft7.g:3873:3: (enumLiteral_15= '\"string\"' )
                    // InternalDraft7.g:3874:4: enumLiteral_15= '\"string\"'
                    {
                    enumLiteral_15=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getJsonSchemaKeywordAccess().getStringEnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_15, grammarAccess.getJsonSchemaKeywordAccess().getStringEnumLiteralDeclaration_15());
                    			

                    }


                    }
                    break;
                case 17 :
                    // InternalDraft7.g:3881:3: (enumLiteral_16= '\"integer\"' )
                    {
                    // InternalDraft7.g:3881:3: (enumLiteral_16= '\"integer\"' )
                    // InternalDraft7.g:3882:4: enumLiteral_16= '\"integer\"'
                    {
                    enumLiteral_16=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getJsonSchemaKeywordAccess().getIntegerEnumLiteralDeclaration_16().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_16, grammarAccess.getJsonSchemaKeywordAccess().getIntegerEnumLiteralDeclaration_16());
                    			

                    }


                    }
                    break;
                case 18 :
                    // InternalDraft7.g:3889:3: (enumLiteral_17= '\"number\"' )
                    {
                    // InternalDraft7.g:3889:3: (enumLiteral_17= '\"number\"' )
                    // InternalDraft7.g:3890:4: enumLiteral_17= '\"number\"'
                    {
                    enumLiteral_17=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getJsonSchemaKeywordAccess().getNumberEnumLiteralDeclaration_17().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_17, grammarAccess.getJsonSchemaKeywordAccess().getNumberEnumLiteralDeclaration_17());
                    			

                    }


                    }
                    break;
                case 19 :
                    // InternalDraft7.g:3897:3: (enumLiteral_18= '\"object\"' )
                    {
                    // InternalDraft7.g:3897:3: (enumLiteral_18= '\"object\"' )
                    // InternalDraft7.g:3898:4: enumLiteral_18= '\"object\"'
                    {
                    enumLiteral_18=(Token)match(input,67,FOLLOW_2); 

                    				current = grammarAccess.getJsonSchemaKeywordAccess().getObjectEnumLiteralDeclaration_18().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_18, grammarAccess.getJsonSchemaKeywordAccess().getObjectEnumLiteralDeclaration_18());
                    			

                    }


                    }
                    break;
                case 20 :
                    // InternalDraft7.g:3905:3: (enumLiteral_19= '\"array\"' )
                    {
                    // InternalDraft7.g:3905:3: (enumLiteral_19= '\"array\"' )
                    // InternalDraft7.g:3906:4: enumLiteral_19= '\"array\"'
                    {
                    enumLiteral_19=(Token)match(input,68,FOLLOW_2); 

                    				current = grammarAccess.getJsonSchemaKeywordAccess().getArrayEnumLiteralDeclaration_19().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_19, grammarAccess.getJsonSchemaKeywordAccess().getArrayEnumLiteralDeclaration_19());
                    			

                    }


                    }
                    break;
                case 21 :
                    // InternalDraft7.g:3913:3: (enumLiteral_20= '\"boolean\"' )
                    {
                    // InternalDraft7.g:3913:3: (enumLiteral_20= '\"boolean\"' )
                    // InternalDraft7.g:3914:4: enumLiteral_20= '\"boolean\"'
                    {
                    enumLiteral_20=(Token)match(input,69,FOLLOW_2); 

                    				current = grammarAccess.getJsonSchemaKeywordAccess().getBooleanEnumLiteralDeclaration_20().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_20, grammarAccess.getJsonSchemaKeywordAccess().getBooleanEnumLiteralDeclaration_20());
                    			

                    }


                    }
                    break;
                case 22 :
                    // InternalDraft7.g:3921:3: (enumLiteral_21= '\"null\"' )
                    {
                    // InternalDraft7.g:3921:3: (enumLiteral_21= '\"null\"' )
                    // InternalDraft7.g:3922:4: enumLiteral_21= '\"null\"'
                    {
                    enumLiteral_21=(Token)match(input,70,FOLLOW_2); 

                    				current = grammarAccess.getJsonSchemaKeywordAccess().getNullEnumLiteralDeclaration_21().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_21, grammarAccess.getJsonSchemaKeywordAccess().getNullEnumLiteralDeclaration_21());
                    			

                    }


                    }
                    break;
                case 23 :
                    // InternalDraft7.g:3929:3: (enumLiteral_22= '\"date-time\"' )
                    {
                    // InternalDraft7.g:3929:3: (enumLiteral_22= '\"date-time\"' )
                    // InternalDraft7.g:3930:4: enumLiteral_22= '\"date-time\"'
                    {
                    enumLiteral_22=(Token)match(input,71,FOLLOW_2); 

                    				current = grammarAccess.getJsonSchemaKeywordAccess().getDate_timeEnumLiteralDeclaration_22().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_22, grammarAccess.getJsonSchemaKeywordAccess().getDate_timeEnumLiteralDeclaration_22());
                    			

                    }


                    }
                    break;
                case 24 :
                    // InternalDraft7.g:3937:3: (enumLiteral_23= '\"time\"' )
                    {
                    // InternalDraft7.g:3937:3: (enumLiteral_23= '\"time\"' )
                    // InternalDraft7.g:3938:4: enumLiteral_23= '\"time\"'
                    {
                    enumLiteral_23=(Token)match(input,72,FOLLOW_2); 

                    				current = grammarAccess.getJsonSchemaKeywordAccess().getTimeEnumLiteralDeclaration_23().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_23, grammarAccess.getJsonSchemaKeywordAccess().getTimeEnumLiteralDeclaration_23());
                    			

                    }


                    }
                    break;
                case 25 :
                    // InternalDraft7.g:3945:3: (enumLiteral_24= '\"date\"' )
                    {
                    // InternalDraft7.g:3945:3: (enumLiteral_24= '\"date\"' )
                    // InternalDraft7.g:3946:4: enumLiteral_24= '\"date\"'
                    {
                    enumLiteral_24=(Token)match(input,73,FOLLOW_2); 

                    				current = grammarAccess.getJsonSchemaKeywordAccess().getDateEnumLiteralDeclaration_24().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_24, grammarAccess.getJsonSchemaKeywordAccess().getDateEnumLiteralDeclaration_24());
                    			

                    }


                    }
                    break;
                case 26 :
                    // InternalDraft7.g:3953:3: (enumLiteral_25= '\"email\"' )
                    {
                    // InternalDraft7.g:3953:3: (enumLiteral_25= '\"email\"' )
                    // InternalDraft7.g:3954:4: enumLiteral_25= '\"email\"'
                    {
                    enumLiteral_25=(Token)match(input,74,FOLLOW_2); 

                    				current = grammarAccess.getJsonSchemaKeywordAccess().getEmailEnumLiteralDeclaration_25().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_25, grammarAccess.getJsonSchemaKeywordAccess().getEmailEnumLiteralDeclaration_25());
                    			

                    }


                    }
                    break;
                case 27 :
                    // InternalDraft7.g:3961:3: (enumLiteral_26= '\"idn-email\"' )
                    {
                    // InternalDraft7.g:3961:3: (enumLiteral_26= '\"idn-email\"' )
                    // InternalDraft7.g:3962:4: enumLiteral_26= '\"idn-email\"'
                    {
                    enumLiteral_26=(Token)match(input,75,FOLLOW_2); 

                    				current = grammarAccess.getJsonSchemaKeywordAccess().getIdn_emailEnumLiteralDeclaration_26().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_26, grammarAccess.getJsonSchemaKeywordAccess().getIdn_emailEnumLiteralDeclaration_26());
                    			

                    }


                    }
                    break;
                case 28 :
                    // InternalDraft7.g:3969:3: (enumLiteral_27= '\"hostname\"' )
                    {
                    // InternalDraft7.g:3969:3: (enumLiteral_27= '\"hostname\"' )
                    // InternalDraft7.g:3970:4: enumLiteral_27= '\"hostname\"'
                    {
                    enumLiteral_27=(Token)match(input,76,FOLLOW_2); 

                    				current = grammarAccess.getJsonSchemaKeywordAccess().getHostnameEnumLiteralDeclaration_27().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_27, grammarAccess.getJsonSchemaKeywordAccess().getHostnameEnumLiteralDeclaration_27());
                    			

                    }


                    }
                    break;
                case 29 :
                    // InternalDraft7.g:3977:3: (enumLiteral_28= '\"ipv4\"' )
                    {
                    // InternalDraft7.g:3977:3: (enumLiteral_28= '\"ipv4\"' )
                    // InternalDraft7.g:3978:4: enumLiteral_28= '\"ipv4\"'
                    {
                    enumLiteral_28=(Token)match(input,77,FOLLOW_2); 

                    				current = grammarAccess.getJsonSchemaKeywordAccess().getIpv4EnumLiteralDeclaration_28().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_28, grammarAccess.getJsonSchemaKeywordAccess().getIpv4EnumLiteralDeclaration_28());
                    			

                    }


                    }
                    break;
                case 30 :
                    // InternalDraft7.g:3985:3: (enumLiteral_29= '\"ipv6\"' )
                    {
                    // InternalDraft7.g:3985:3: (enumLiteral_29= '\"ipv6\"' )
                    // InternalDraft7.g:3986:4: enumLiteral_29= '\"ipv6\"'
                    {
                    enumLiteral_29=(Token)match(input,78,FOLLOW_2); 

                    				current = grammarAccess.getJsonSchemaKeywordAccess().getIpv6EnumLiteralDeclaration_29().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_29, grammarAccess.getJsonSchemaKeywordAccess().getIpv6EnumLiteralDeclaration_29());
                    			

                    }


                    }
                    break;
                case 31 :
                    // InternalDraft7.g:3993:3: (enumLiteral_30= '\"uri\"' )
                    {
                    // InternalDraft7.g:3993:3: (enumLiteral_30= '\"uri\"' )
                    // InternalDraft7.g:3994:4: enumLiteral_30= '\"uri\"'
                    {
                    enumLiteral_30=(Token)match(input,79,FOLLOW_2); 

                    				current = grammarAccess.getJsonSchemaKeywordAccess().getUriEnumLiteralDeclaration_30().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_30, grammarAccess.getJsonSchemaKeywordAccess().getUriEnumLiteralDeclaration_30());
                    			

                    }


                    }
                    break;
                case 32 :
                    // InternalDraft7.g:4001:3: (enumLiteral_31= '\"uri-reference\"' )
                    {
                    // InternalDraft7.g:4001:3: (enumLiteral_31= '\"uri-reference\"' )
                    // InternalDraft7.g:4002:4: enumLiteral_31= '\"uri-reference\"'
                    {
                    enumLiteral_31=(Token)match(input,80,FOLLOW_2); 

                    				current = grammarAccess.getJsonSchemaKeywordAccess().getUri_referenceEnumLiteralDeclaration_31().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_31, grammarAccess.getJsonSchemaKeywordAccess().getUri_referenceEnumLiteralDeclaration_31());
                    			

                    }


                    }
                    break;
                case 33 :
                    // InternalDraft7.g:4009:3: (enumLiteral_32= '\"iri\"' )
                    {
                    // InternalDraft7.g:4009:3: (enumLiteral_32= '\"iri\"' )
                    // InternalDraft7.g:4010:4: enumLiteral_32= '\"iri\"'
                    {
                    enumLiteral_32=(Token)match(input,81,FOLLOW_2); 

                    				current = grammarAccess.getJsonSchemaKeywordAccess().getIriEnumLiteralDeclaration_32().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_32, grammarAccess.getJsonSchemaKeywordAccess().getIriEnumLiteralDeclaration_32());
                    			

                    }


                    }
                    break;
                case 34 :
                    // InternalDraft7.g:4017:3: (enumLiteral_33= '\"iri-reference\"' )
                    {
                    // InternalDraft7.g:4017:3: (enumLiteral_33= '\"iri-reference\"' )
                    // InternalDraft7.g:4018:4: enumLiteral_33= '\"iri-reference\"'
                    {
                    enumLiteral_33=(Token)match(input,82,FOLLOW_2); 

                    				current = grammarAccess.getJsonSchemaKeywordAccess().getIri_referenceEnumLiteralDeclaration_33().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_33, grammarAccess.getJsonSchemaKeywordAccess().getIri_referenceEnumLiteralDeclaration_33());
                    			

                    }


                    }
                    break;
                case 35 :
                    // InternalDraft7.g:4025:3: (enumLiteral_34= '\"uri-template\"' )
                    {
                    // InternalDraft7.g:4025:3: (enumLiteral_34= '\"uri-template\"' )
                    // InternalDraft7.g:4026:4: enumLiteral_34= '\"uri-template\"'
                    {
                    enumLiteral_34=(Token)match(input,83,FOLLOW_2); 

                    				current = grammarAccess.getJsonSchemaKeywordAccess().getUri_templateEnumLiteralDeclaration_34().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_34, grammarAccess.getJsonSchemaKeywordAccess().getUri_templateEnumLiteralDeclaration_34());
                    			

                    }


                    }
                    break;
                case 36 :
                    // InternalDraft7.g:4033:3: (enumLiteral_35= '\"json-pointer\"' )
                    {
                    // InternalDraft7.g:4033:3: (enumLiteral_35= '\"json-pointer\"' )
                    // InternalDraft7.g:4034:4: enumLiteral_35= '\"json-pointer\"'
                    {
                    enumLiteral_35=(Token)match(input,84,FOLLOW_2); 

                    				current = grammarAccess.getJsonSchemaKeywordAccess().getJson_pointerEnumLiteralDeclaration_35().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_35, grammarAccess.getJsonSchemaKeywordAccess().getJson_pointerEnumLiteralDeclaration_35());
                    			

                    }


                    }
                    break;
                case 37 :
                    // InternalDraft7.g:4041:3: (enumLiteral_36= '\"relative-json-pointer\"' )
                    {
                    // InternalDraft7.g:4041:3: (enumLiteral_36= '\"relative-json-pointer\"' )
                    // InternalDraft7.g:4042:4: enumLiteral_36= '\"relative-json-pointer\"'
                    {
                    enumLiteral_36=(Token)match(input,85,FOLLOW_2); 

                    				current = grammarAccess.getJsonSchemaKeywordAccess().getRelative_json_pointerEnumLiteralDeclaration_36().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_36, grammarAccess.getJsonSchemaKeywordAccess().getRelative_json_pointerEnumLiteralDeclaration_36());
                    			

                    }


                    }
                    break;
                case 38 :
                    // InternalDraft7.g:4049:3: (enumLiteral_37= '\"regex\"' )
                    {
                    // InternalDraft7.g:4049:3: (enumLiteral_37= '\"regex\"' )
                    // InternalDraft7.g:4050:4: enumLiteral_37= '\"regex\"'
                    {
                    enumLiteral_37=(Token)match(input,86,FOLLOW_2); 

                    				current = grammarAccess.getJsonSchemaKeywordAccess().getRegexEnumLiteralDeclaration_37().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_37, grammarAccess.getJsonSchemaKeywordAccess().getRegexEnumLiteralDeclaration_37());
                    			

                    }


                    }
                    break;
                case 39 :
                    // InternalDraft7.g:4057:3: (enumLiteral_38= '\"contains\"' )
                    {
                    // InternalDraft7.g:4057:3: (enumLiteral_38= '\"contains\"' )
                    // InternalDraft7.g:4058:4: enumLiteral_38= '\"contains\"'
                    {
                    enumLiteral_38=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getJsonSchemaKeywordAccess().getContainsEnumLiteralDeclaration_38().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_38, grammarAccess.getJsonSchemaKeywordAccess().getContainsEnumLiteralDeclaration_38());
                    			

                    }


                    }
                    break;
                case 40 :
                    // InternalDraft7.g:4065:3: (enumLiteral_39= '\"uniqueItems\"' )
                    {
                    // InternalDraft7.g:4065:3: (enumLiteral_39= '\"uniqueItems\"' )
                    // InternalDraft7.g:4066:4: enumLiteral_39= '\"uniqueItems\"'
                    {
                    enumLiteral_39=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getJsonSchemaKeywordAccess().getUniqueItemsEnumLiteralDeclaration_39().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_39, grammarAccess.getJsonSchemaKeywordAccess().getUniqueItemsEnumLiteralDeclaration_39());
                    			

                    }


                    }
                    break;
                case 41 :
                    // InternalDraft7.g:4073:3: (enumLiteral_40= '\"propertyNames\"' )
                    {
                    // InternalDraft7.g:4073:3: (enumLiteral_40= '\"propertyNames\"' )
                    // InternalDraft7.g:4074:4: enumLiteral_40= '\"propertyNames\"'
                    {
                    enumLiteral_40=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getJsonSchemaKeywordAccess().getPropertyNamesEnumLiteralDeclaration_40().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_40, grammarAccess.getJsonSchemaKeywordAccess().getPropertyNamesEnumLiteralDeclaration_40());
                    			

                    }


                    }
                    break;
                case 42 :
                    // InternalDraft7.g:4081:3: (enumLiteral_41= '\"length\"' )
                    {
                    // InternalDraft7.g:4081:3: (enumLiteral_41= '\"length\"' )
                    // InternalDraft7.g:4082:4: enumLiteral_41= '\"length\"'
                    {
                    enumLiteral_41=(Token)match(input,88,FOLLOW_2); 

                    				current = grammarAccess.getJsonSchemaKeywordAccess().getLengthEnumLiteralDeclaration_41().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_41, grammarAccess.getJsonSchemaKeywordAccess().getLengthEnumLiteralDeclaration_41());
                    			

                    }


                    }
                    break;
                case 43 :
                    // InternalDraft7.g:4089:3: (enumLiteral_42= '\"minLength\"' )
                    {
                    // InternalDraft7.g:4089:3: (enumLiteral_42= '\"minLength\"' )
                    // InternalDraft7.g:4090:4: enumLiteral_42= '\"minLength\"'
                    {
                    enumLiteral_42=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getJsonSchemaKeywordAccess().getMinLengthEnumLiteralDeclaration_42().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_42, grammarAccess.getJsonSchemaKeywordAccess().getMinLengthEnumLiteralDeclaration_42());
                    			

                    }


                    }
                    break;
                case 44 :
                    // InternalDraft7.g:4097:3: (enumLiteral_43= '\"maxLength\"' )
                    {
                    // InternalDraft7.g:4097:3: (enumLiteral_43= '\"maxLength\"' )
                    // InternalDraft7.g:4098:4: enumLiteral_43= '\"maxLength\"'
                    {
                    enumLiteral_43=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getJsonSchemaKeywordAccess().getMaxLengthEnumLiteralDeclaration_43().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_43, grammarAccess.getJsonSchemaKeywordAccess().getMaxLengthEnumLiteralDeclaration_43());
                    			

                    }


                    }
                    break;
                case 45 :
                    // InternalDraft7.g:4105:3: (enumLiteral_44= '\"minItems\"' )
                    {
                    // InternalDraft7.g:4105:3: (enumLiteral_44= '\"minItems\"' )
                    // InternalDraft7.g:4106:4: enumLiteral_44= '\"minItems\"'
                    {
                    enumLiteral_44=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getJsonSchemaKeywordAccess().getMinItemsEnumLiteralDeclaration_44().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_44, grammarAccess.getJsonSchemaKeywordAccess().getMinItemsEnumLiteralDeclaration_44());
                    			

                    }


                    }
                    break;
                case 46 :
                    // InternalDraft7.g:4113:3: (enumLiteral_45= '\"maxItems\"' )
                    {
                    // InternalDraft7.g:4113:3: (enumLiteral_45= '\"maxItems\"' )
                    // InternalDraft7.g:4114:4: enumLiteral_45= '\"maxItems\"'
                    {
                    enumLiteral_45=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getJsonSchemaKeywordAccess().getMaxItemsEnumLiteralDeclaration_45().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_45, grammarAccess.getJsonSchemaKeywordAccess().getMaxItemsEnumLiteralDeclaration_45());
                    			

                    }


                    }
                    break;
                case 47 :
                    // InternalDraft7.g:4121:3: (enumLiteral_46= '\"pattern\"' )
                    {
                    // InternalDraft7.g:4121:3: (enumLiteral_46= '\"pattern\"' )
                    // InternalDraft7.g:4122:4: enumLiteral_46= '\"pattern\"'
                    {
                    enumLiteral_46=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getJsonSchemaKeywordAccess().getPatternEnumLiteralDeclaration_46().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_46, grammarAccess.getJsonSchemaKeywordAccess().getPatternEnumLiteralDeclaration_46());
                    			

                    }


                    }
                    break;
                case 48 :
                    // InternalDraft7.g:4129:3: (enumLiteral_47= '\"format\"' )
                    {
                    // InternalDraft7.g:4129:3: (enumLiteral_47= '\"format\"' )
                    // InternalDraft7.g:4130:4: enumLiteral_47= '\"format\"'
                    {
                    enumLiteral_47=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getJsonSchemaKeywordAccess().getFormatEnumLiteralDeclaration_47().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_47, grammarAccess.getJsonSchemaKeywordAccess().getFormatEnumLiteralDeclaration_47());
                    			

                    }


                    }
                    break;
                case 49 :
                    // InternalDraft7.g:4137:3: (enumLiteral_48= '\"minProperties\"' )
                    {
                    // InternalDraft7.g:4137:3: (enumLiteral_48= '\"minProperties\"' )
                    // InternalDraft7.g:4138:4: enumLiteral_48= '\"minProperties\"'
                    {
                    enumLiteral_48=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getJsonSchemaKeywordAccess().getMinPropertiesEnumLiteralDeclaration_48().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_48, grammarAccess.getJsonSchemaKeywordAccess().getMinPropertiesEnumLiteralDeclaration_48());
                    			

                    }


                    }
                    break;
                case 50 :
                    // InternalDraft7.g:4145:3: (enumLiteral_49= '\"maxProperties\"' )
                    {
                    // InternalDraft7.g:4145:3: (enumLiteral_49= '\"maxProperties\"' )
                    // InternalDraft7.g:4146:4: enumLiteral_49= '\"maxProperties\"'
                    {
                    enumLiteral_49=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getJsonSchemaKeywordAccess().getMaxPropertiesEnumLiteralDeclaration_49().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_49, grammarAccess.getJsonSchemaKeywordAccess().getMaxPropertiesEnumLiteralDeclaration_49());
                    			

                    }


                    }
                    break;
                case 51 :
                    // InternalDraft7.g:4153:3: (enumLiteral_50= '\"dependencies\"' )
                    {
                    // InternalDraft7.g:4153:3: (enumLiteral_50= '\"dependencies\"' )
                    // InternalDraft7.g:4154:4: enumLiteral_50= '\"dependencies\"'
                    {
                    enumLiteral_50=(Token)match(input,15,FOLLOW_2); 

                    				current = grammarAccess.getJsonSchemaKeywordAccess().getDependenciesEnumLiteralDeclaration_50().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_50, grammarAccess.getJsonSchemaKeywordAccess().getDependenciesEnumLiteralDeclaration_50());
                    			

                    }


                    }
                    break;
                case 52 :
                    // InternalDraft7.g:4161:3: (enumLiteral_51= '\"patternProperties\"' )
                    {
                    // InternalDraft7.g:4161:3: (enumLiteral_51= '\"patternProperties\"' )
                    // InternalDraft7.g:4162:4: enumLiteral_51= '\"patternProperties\"'
                    {
                    enumLiteral_51=(Token)match(input,20,FOLLOW_2); 

                    				current = grammarAccess.getJsonSchemaKeywordAccess().getPatternPropertiesEnumLiteralDeclaration_51().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_51, grammarAccess.getJsonSchemaKeywordAccess().getPatternPropertiesEnumLiteralDeclaration_51());
                    			

                    }


                    }
                    break;
                case 53 :
                    // InternalDraft7.g:4169:3: (enumLiteral_52= '\"required\"' )
                    {
                    // InternalDraft7.g:4169:3: (enumLiteral_52= '\"required\"' )
                    // InternalDraft7.g:4170:4: enumLiteral_52= '\"required\"'
                    {
                    enumLiteral_52=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getJsonSchemaKeywordAccess().getRequiredEnumLiteralDeclaration_52().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_52, grammarAccess.getJsonSchemaKeywordAccess().getRequiredEnumLiteralDeclaration_52());
                    			

                    }


                    }
                    break;
                case 54 :
                    // InternalDraft7.g:4177:3: (enumLiteral_53= '\"properties\"' )
                    {
                    // InternalDraft7.g:4177:3: (enumLiteral_53= '\"properties\"' )
                    // InternalDraft7.g:4178:4: enumLiteral_53= '\"properties\"'
                    {
                    enumLiteral_53=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getJsonSchemaKeywordAccess().getPropertiesEnumLiteralDeclaration_53().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_53, grammarAccess.getJsonSchemaKeywordAccess().getPropertiesEnumLiteralDeclaration_53());
                    			

                    }


                    }
                    break;
                case 55 :
                    // InternalDraft7.g:4185:3: (enumLiteral_54= '\"if\"' )
                    {
                    // InternalDraft7.g:4185:3: (enumLiteral_54= '\"if\"' )
                    // InternalDraft7.g:4186:4: enumLiteral_54= '\"if\"'
                    {
                    enumLiteral_54=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getJsonSchemaKeywordAccess().getIfEnumLiteralDeclaration_54().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_54, grammarAccess.getJsonSchemaKeywordAccess().getIfEnumLiteralDeclaration_54());
                    			

                    }


                    }
                    break;
                case 56 :
                    // InternalDraft7.g:4193:3: (enumLiteral_55= '\"then\"' )
                    {
                    // InternalDraft7.g:4193:3: (enumLiteral_55= '\"then\"' )
                    // InternalDraft7.g:4194:4: enumLiteral_55= '\"then\"'
                    {
                    enumLiteral_55=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getJsonSchemaKeywordAccess().getThenEnumLiteralDeclaration_55().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_55, grammarAccess.getJsonSchemaKeywordAccess().getThenEnumLiteralDeclaration_55());
                    			

                    }


                    }
                    break;
                case 57 :
                    // InternalDraft7.g:4201:3: (enumLiteral_56= '\"else\"' )
                    {
                    // InternalDraft7.g:4201:3: (enumLiteral_56= '\"else\"' )
                    // InternalDraft7.g:4202:4: enumLiteral_56= '\"else\"'
                    {
                    enumLiteral_56=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getJsonSchemaKeywordAccess().getElseEnumLiteralDeclaration_56().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_56, grammarAccess.getJsonSchemaKeywordAccess().getElseEnumLiteralDeclaration_56());
                    			

                    }


                    }
                    break;
                case 58 :
                    // InternalDraft7.g:4209:3: (enumLiteral_57= '\"anyOf\"' )
                    {
                    // InternalDraft7.g:4209:3: (enumLiteral_57= '\"anyOf\"' )
                    // InternalDraft7.g:4210:4: enumLiteral_57= '\"anyOf\"'
                    {
                    enumLiteral_57=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getJsonSchemaKeywordAccess().getAnyOfEnumLiteralDeclaration_57().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_57, grammarAccess.getJsonSchemaKeywordAccess().getAnyOfEnumLiteralDeclaration_57());
                    			

                    }


                    }
                    break;
                case 59 :
                    // InternalDraft7.g:4217:3: (enumLiteral_58= '\"oneOf\"' )
                    {
                    // InternalDraft7.g:4217:3: (enumLiteral_58= '\"oneOf\"' )
                    // InternalDraft7.g:4218:4: enumLiteral_58= '\"oneOf\"'
                    {
                    enumLiteral_58=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getJsonSchemaKeywordAccess().getOneOfEnumLiteralDeclaration_58().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_58, grammarAccess.getJsonSchemaKeywordAccess().getOneOfEnumLiteralDeclaration_58());
                    			

                    }


                    }
                    break;
                case 60 :
                    // InternalDraft7.g:4225:3: (enumLiteral_59= '\"allOf\"' )
                    {
                    // InternalDraft7.g:4225:3: (enumLiteral_59= '\"allOf\"' )
                    // InternalDraft7.g:4226:4: enumLiteral_59= '\"allOf\"'
                    {
                    enumLiteral_59=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getJsonSchemaKeywordAccess().getAllOfEnumLiteralDeclaration_59().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_59, grammarAccess.getJsonSchemaKeywordAccess().getAllOfEnumLiteralDeclaration_59());
                    			

                    }


                    }
                    break;
                case 61 :
                    // InternalDraft7.g:4233:3: (enumLiteral_60= '\"not\"' )
                    {
                    // InternalDraft7.g:4233:3: (enumLiteral_60= '\"not\"' )
                    // InternalDraft7.g:4234:4: enumLiteral_60= '\"not\"'
                    {
                    enumLiteral_60=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getJsonSchemaKeywordAccess().getNotEnumLiteralDeclaration_60().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_60, grammarAccess.getJsonSchemaKeywordAccess().getNotEnumLiteralDeclaration_60());
                    			

                    }


                    }
                    break;
                case 62 :
                    // InternalDraft7.g:4241:3: (enumLiteral_61= '\"items\"' )
                    {
                    // InternalDraft7.g:4241:3: (enumLiteral_61= '\"items\"' )
                    // InternalDraft7.g:4242:4: enumLiteral_61= '\"items\"'
                    {
                    enumLiteral_61=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getJsonSchemaKeywordAccess().getItemsEnumLiteralDeclaration_61().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_61, grammarAccess.getJsonSchemaKeywordAccess().getItemsEnumLiteralDeclaration_61());
                    			

                    }


                    }
                    break;
                case 63 :
                    // InternalDraft7.g:4249:3: (enumLiteral_62= '\"contentMediaType\"' )
                    {
                    // InternalDraft7.g:4249:3: (enumLiteral_62= '\"contentMediaType\"' )
                    // InternalDraft7.g:4250:4: enumLiteral_62= '\"contentMediaType\"'
                    {
                    enumLiteral_62=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getJsonSchemaKeywordAccess().getContentMediaTypeEnumLiteralDeclaration_62().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_62, grammarAccess.getJsonSchemaKeywordAccess().getContentMediaTypeEnumLiteralDeclaration_62());
                    			

                    }


                    }
                    break;
                case 64 :
                    // InternalDraft7.g:4257:3: (enumLiteral_63= '\"contentEncoding\"' )
                    {
                    // InternalDraft7.g:4257:3: (enumLiteral_63= '\"contentEncoding\"' )
                    // InternalDraft7.g:4258:4: enumLiteral_63= '\"contentEncoding\"'
                    {
                    enumLiteral_63=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getJsonSchemaKeywordAccess().getContentEncodingEnumLiteralDeclaration_63().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_63, grammarAccess.getJsonSchemaKeywordAccess().getContentEncodingEnumLiteralDeclaration_63());
                    			

                    }


                    }
                    break;
                case 65 :
                    // InternalDraft7.g:4265:3: (enumLiteral_64= '\"multiples\"' )
                    {
                    // InternalDraft7.g:4265:3: (enumLiteral_64= '\"multiples\"' )
                    // InternalDraft7.g:4266:4: enumLiteral_64= '\"multiples\"'
                    {
                    enumLiteral_64=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getJsonSchemaKeywordAccess().getMultiplesEnumLiteralDeclaration_64().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_64, grammarAccess.getJsonSchemaKeywordAccess().getMultiplesEnumLiteralDeclaration_64());
                    			

                    }


                    }
                    break;
                case 66 :
                    // InternalDraft7.g:4273:3: (enumLiteral_65= '\"minimum\"' )
                    {
                    // InternalDraft7.g:4273:3: (enumLiteral_65= '\"minimum\"' )
                    // InternalDraft7.g:4274:4: enumLiteral_65= '\"minimum\"'
                    {
                    enumLiteral_65=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getJsonSchemaKeywordAccess().getMinimumEnumLiteralDeclaration_65().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_65, grammarAccess.getJsonSchemaKeywordAccess().getMinimumEnumLiteralDeclaration_65());
                    			

                    }


                    }
                    break;
                case 67 :
                    // InternalDraft7.g:4281:3: (enumLiteral_66= '\"exclusiveMinimum\"' )
                    {
                    // InternalDraft7.g:4281:3: (enumLiteral_66= '\"exclusiveMinimum\"' )
                    // InternalDraft7.g:4282:4: enumLiteral_66= '\"exclusiveMinimum\"'
                    {
                    enumLiteral_66=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getJsonSchemaKeywordAccess().getExclusiveMinimumEnumLiteralDeclaration_66().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_66, grammarAccess.getJsonSchemaKeywordAccess().getExclusiveMinimumEnumLiteralDeclaration_66());
                    			

                    }


                    }
                    break;
                case 68 :
                    // InternalDraft7.g:4289:3: (enumLiteral_67= '\"maximum\"' )
                    {
                    // InternalDraft7.g:4289:3: (enumLiteral_67= '\"maximum\"' )
                    // InternalDraft7.g:4290:4: enumLiteral_67= '\"maximum\"'
                    {
                    enumLiteral_67=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getJsonSchemaKeywordAccess().getMaximumEnumLiteralDeclaration_67().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_67, grammarAccess.getJsonSchemaKeywordAccess().getMaximumEnumLiteralDeclaration_67());
                    			

                    }


                    }
                    break;
                case 69 :
                    // InternalDraft7.g:4297:3: (enumLiteral_68= '\"exclusiveMaximum\"' )
                    {
                    // InternalDraft7.g:4297:3: (enumLiteral_68= '\"exclusiveMaximum\"' )
                    // InternalDraft7.g:4298:4: enumLiteral_68= '\"exclusiveMaximum\"'
                    {
                    enumLiteral_68=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getJsonSchemaKeywordAccess().getExclusiveMaximumEnumLiteralDeclaration_68().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_68, grammarAccess.getJsonSchemaKeywordAccess().getExclusiveMaximumEnumLiteralDeclaration_68());
                    			

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
    // $ANTLR end "ruleJsonSchemaKeyword"

    // Delegated rules


    protected DFA54 dfa54 = new DFA54(this);
    protected DFA56 dfa56 = new DFA56(this);
    static final String dfa_1s = "\u00be\uffff";
    static final String dfa_2s = "\1\14\17\uffff\1\15\33\uffff\1\33\1\4\106\16\1\4\1\0\106\16\2\uffff";
    static final String dfa_3s = "\1\73\17\uffff\1\15\33\uffff\1\33\1\130\106\34\1\130\1\0\106\34\2\uffff";
    static final String dfa_4s = "\1\uffff\1\54\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\uffff\1\20\1\21\1\22\1\23\1\24\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\u0090\uffff\1\17\1\25";
    static final String dfa_5s = "\1\153\17\uffff\1\u008d\33\uffff\1\4\1\51\1\106\1\65\1\101\1\115\1\130\1\143\1\157\1\171\1\u0083\1\u008e\1\7\1\22\1\36\1\53\1\70\1\104\1\120\1\133\1\146\1\161\1\173\1\u0085\1\u0090\1\12\1\25\1\41\1\57\1\73\1\107\1\122\1\135\1\150\1\163\1\175\1\u0087\1\0\1\14\1\27\1\43\1\61\1\75\1\111\1\124\1\137\1\152\1\165\1\177\1\u0089\1\2\1\16\1\32\1\45\1\63\1\77\1\113\1\126\1\141\1\155\1\167\1\u0081\1\u008b\1\5\1\20\1\34\1\50\1\66\1\102\1\116\1\131\1\144\1\47\1\54\1\30\1\10\1\23\1\37\1\55\1\71\1\105\1\121\1\134\1\147\1\162\1\174\1\u0086\1\u0091\1\13\1\26\1\42\1\60\1\74\1\110\1\123\1\136\1\151\1\164\1\176\1\u0088\1\1\1\15\1\31\1\44\1\62\1\76\1\112\1\125\1\140\1\154\1\166\1\u0080\1\u008a\1\3\1\17\1\33\1\46\1\64\1\100\1\114\1\127\1\142\1\156\1\170\1\u0082\1\u008c\1\6\1\21\1\35\1\52\1\67\1\103\1\117\1\132\1\145\1\160\1\172\1\u0084\1\u008f\1\11\1\24\1\40\1\56\1\72\2\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\2\uffff\1\3\1\1\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\2\uffff\1\16\1\17\1\20\1\21\1\uffff\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53",
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
            "",
            "",
            "",
            "",
            "",
            "\1\54",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\55",
            "\1\56\7\uffff\1\75\2\uffff\1\141\1\uffff\1\61\1\62\1\67\1\142\1\70\1\154\1\125\1\66\1\57\1\143\2\uffff\1\63\1\144\1\73\1\71\1\60\1\65\1\145\1\146\1\147\1\74\1\150\1\151\1\152\1\153\1\126\1\127\1\137\1\140\1\134\1\133\1\132\1\131\1\135\1\136\1\155\1\156\1\157\1\160\1\161\1\162\1\163\1\72\3\uffff\1\76\1\77\1\100\1\101\1\102\1\103\1\104\1\105\1\106\1\107\1\110\1\111\1\112\1\113\1\114\1\115\1\116\1\117\1\120\1\121\1\122\1\123\1\124\1\64\1\130",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\166\7\uffff\1\u0085\2\uffff\1\u00a9\1\uffff\1\171\1\172\1\177\1\u00aa\1\u0080\1\u00b4\1\u009d\1\176\1\167\1\u00ab\2\uffff\1\173\1\u00ac\1\u0083\1\u0081\1\170\1\175\1\u00ad\1\u00ae\1\u00af\1\u0084\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u009e\1\u009f\1\u00a7\1\u00a8\1\u00a4\1\u00a3\1\u00a2\1\u00a1\1\u00a5\1\u00a6\1\u00b5\1\u00b6\1\u00b7\1\u00b8\1\u00b9\1\u00ba\1\u00bb\1\u0082\3\uffff\1\u0086\1\u0087\1\u0088\1\u0089\1\u008a\1\u008b\1\u008c\1\u008d\1\u008e\1\u008f\1\u0090\1\u0091\1\u0092\1\u0093\1\u0094\1\u0095\1\u0096\1\u0097\1\u0098\1\u0099\1\u009a\1\u009b\1\u009c\1\174\1\u00a0",
            "\1\uffff",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "\1\164\15\uffff\1\165",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA54 extends DFA {

        public DFA54(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 54;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "()* loopback of 97:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"type\"' otherlv_4= ':' ( (lv_type_5_0= ruleTypes ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"dependencies\"' otherlv_8= ':' otherlv_9= '{' ( (lv_dependencies_10_0= ruleDependencies ) ) otherlv_11= '}' (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"additionalProperties\"' otherlv_14= ':' ( (lv_additionalProperties_15_0= ruleAdditionalProperties ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"additionalItems\"' otherlv_18= ':' ( (lv_additionalItems_19_0= ruleAdditionalItems ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= '\"default\"' otherlv_22= ':' ( (lv_default_23_0= ruleDefault ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= '\"patternProperties\"' otherlv_26= ':' otherlv_27= '{' ( (lv_patternProperties_28_0= ruleNamedSchema ) ) (otherlv_29= ',' ( (lv_patternProperties_30_0= ruleNamedSchema ) ) )* otherlv_31= '}' (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= '\"examples\"' otherlv_34= ':' ( (lv_example_35_0= ruleExample ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= '\"items\"' otherlv_38= ':' ( (lv_items_39_0= ruleItems ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= '\"contains\"' otherlv_42= ':' ( (lv_contains_43_0= ruleContains ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= '\"definitions\"' otherlv_46= ':' otherlv_47= '{' ( (lv_definitions_48_0= ruleNamedSchema ) ) (otherlv_49= ',' ( (lv_definitions_50_0= ruleNamedSchema ) ) )* otherlv_51= '}' (otherlv_52= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= '\"title\"' otherlv_54= ':' ( (lv_title_55_0= RULE_STRING ) ) (otherlv_56= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_57= '\"required\"' otherlv_58= ':' otherlv_59= '[' ( (lv_requiredProperties_60_0= ruleAnyString ) ) (otherlv_61= ',' ( (lv_requiredProperties_62_0= ruleAnyString ) ) )* otherlv_63= ']' (otherlv_64= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_65= '\"description\"' otherlv_66= ':' ( (lv_description_67_0= RULE_STRING ) ) (otherlv_68= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_69= '\"properties\"' otherlv_70= ':' otherlv_71= '{' ( (lv_properties_72_0= ruleNamedSchema ) ) (otherlv_73= ',' ( (lv_properties_74_0= ruleNamedSchema ) ) )* otherlv_75= '}' (otherlv_76= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_77= '\"enum\"' otherlv_78= ':' otherlv_79= '[' ( (lv_enumValues_80_0= ruleAnyString ) ) (otherlv_81= ',' ( (lv_enumValues_82_0= ruleAnyString ) ) )* otherlv_83= ']' (otherlv_84= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_85= '\"$schema\"' otherlv_86= ':' otherlv_87= '\"http://json-schema.org/draft-07/schema#\"' (otherlv_88= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_89= '\"$id\"' otherlv_90= ':' ( (lv_id_91_0= ruleAnyString ) ) (otherlv_92= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_93= '\"if\"' otherlv_94= ':' ( (lv_ifSchema_95_0= ruleSchema ) ) (otherlv_96= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_97= '\"then\"' otherlv_98= ':' ( (lv_thenSchema_99_0= ruleSchema ) ) (otherlv_100= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_101= '\"else\"' otherlv_102= ':' ( (lv_elseSchema_103_0= ruleSchema ) ) (otherlv_104= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_105= '\"enum\"' otherlv_106= ':' otherlv_107= '[' ( (lv_enumValues_108_0= ruleAnyString ) ) (otherlv_109= ',' ( (lv_enumValues_110_0= ruleAnyString ) ) )* otherlv_111= ']' (otherlv_112= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_113= '\"const\"' otherlv_114= ':' ( ( (lv_const_115_0= ruleAnyString ) ) | ( (lv_constBoolean_116_0= ruleBoolean ) ) ) (otherlv_117= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_118= '\"anyOf\"' otherlv_119= ':' otherlv_120= '[' ( (lv_anyOfs_121_0= ruleAbstractSchema ) ) (otherlv_122= ',' ( (lv_anyOfs_123_0= ruleAbstractSchema ) ) )* otherlv_124= ']' (otherlv_125= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_126= '\"oneOf\"' otherlv_127= ':' otherlv_128= '[' ( (lv_oneOfs_129_0= ruleAbstractSchema ) ) (otherlv_130= ',' ( (lv_oneOfs_131_0= ruleAbstractSchema ) ) )* otherlv_132= ']' (otherlv_133= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_134= '\"allOf\"' otherlv_135= ':' otherlv_136= '[' ( (lv_allOfs_137_0= ruleAbstractSchema ) ) (otherlv_138= ',' ( (lv_allOfs_139_0= ruleAbstractSchema ) ) )* otherlv_140= ']' (otherlv_141= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_142= '\"not\"' otherlv_143= ':' ( (lv_not_144_0= ruleAbstractSchema ) ) (otherlv_145= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_146= '\"uniqueItems\"' otherlv_147= ':' ( (lv_unique_148_0= ruleBoolean ) ) (otherlv_149= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_150= '\"propertyNames\"' otherlv_151= ':' ( (lv_propertyNames_152_0= ruleAbstractSchema ) ) (otherlv_153= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_154= '\"minProperties\"' otherlv_155= ':' ( (lv_minProperties_156_0= RULE_INT ) ) (otherlv_157= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_158= '\"maxProperties\"' otherlv_159= ':' ( (lv_maxProperties_160_0= RULE_INT ) ) (otherlv_161= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_162= '\"maxItems\"' otherlv_163= ':' ( (lv_maxItems_164_0= RULE_INT ) ) (otherlv_165= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_166= '\"minItems\"' otherlv_167= ':' ( (lv_minItems_168_0= RULE_INT ) ) (otherlv_169= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_170= '\"maxLength\"' otherlv_171= ':' ( (lv_maxLength_172_0= RULE_INT ) ) (otherlv_173= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_174= '\"minLength\"' otherlv_175= ':' ( (lv_minLength_176_0= RULE_INT ) ) (otherlv_177= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_178= '\"pattern\"' otherlv_179= ':' ( (lv_pattern_180_0= ruleAnyString ) ) (otherlv_181= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_182= '\"format\"' otherlv_183= ':' ( (lv_format_184_0= ruleFormatTypes ) ) (otherlv_185= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_186= '\"contentMediaType\"' otherlv_187= ':' ( (lv_mediaType_188_0= ruleAnyString ) ) (otherlv_189= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_190= '\"contentEncoding\"' otherlv_191= ':' ( (lv_encoding_192_0= ruleAnyString ) ) (otherlv_193= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_194= '\"multiples\"' otherlv_195= ':' ( (lv_multipleOf_196_0= RULE_INT ) ) (otherlv_197= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_198= '\"minimum\"' otherlv_199= ':' ( (lv_minimum_200_0= ruleNumber ) ) (otherlv_201= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_202= '\"exclusiveMinimum\"' otherlv_203= ':' ( (lv_exclusiveMinimum_204_0= ruleNumber ) ) (otherlv_205= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_206= '\"maximum\"' otherlv_207= ':' ( (lv_maximum_208_0= ruleNumber ) ) (otherlv_209= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_210= '\"exclusiveMaximum\"' otherlv_211= ':' ( (lv_exclusiveMaximum_212_0= ruleNumber ) ) (otherlv_213= ',' )? ) ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA54_81 = input.LA(1);

                         
                        int index54_81 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_81 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                        else if ( LA54_81 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                         
                        input.seek(index54_81);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA54_144 = input.LA(1);

                         
                        int index54_144 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_144 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                        else if ( LA54_144 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                         
                        input.seek(index54_144);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA54_94 = input.LA(1);

                         
                        int index54_94 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_94 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                        else if ( LA54_94 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                         
                        input.seek(index54_94);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA54_157 = input.LA(1);

                         
                        int index54_157 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_157 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                        else if ( LA54_157 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                         
                        input.seek(index54_157);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA54_44 = input.LA(1);

                         
                        int index54_44 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_44 == 27 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 45;}

                         
                        input.seek(index54_44);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA54_107 = input.LA(1);

                         
                        int index54_107 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_107 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                        else if ( LA54_107 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                         
                        input.seek(index54_107);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA54_170 = input.LA(1);

                         
                        int index54_170 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_170 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                        else if ( LA54_170 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                         
                        input.seek(index54_170);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA54_56 = input.LA(1);

                         
                        int index54_56 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_56 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                        else if ( LA54_56 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                         
                        input.seek(index54_56);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA54_119 = input.LA(1);

                         
                        int index54_119 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_119 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                        else if ( LA54_119 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                         
                        input.seek(index54_119);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA54_183 = input.LA(1);

                         
                        int index54_183 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_183 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                        else if ( LA54_183 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                         
                        input.seek(index54_183);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA54_69 = input.LA(1);

                         
                        int index54_69 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_69 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                        else if ( LA54_69 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                         
                        input.seek(index54_69);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA54_132 = input.LA(1);

                         
                        int index54_132 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_132 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                        else if ( LA54_132 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                         
                        input.seek(index54_132);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA54_82 = input.LA(1);

                         
                        int index54_82 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_82 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                        else if ( LA54_82 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                         
                        input.seek(index54_82);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA54_145 = input.LA(1);

                         
                        int index54_145 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_145 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                        else if ( LA54_145 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                         
                        input.seek(index54_145);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA54_95 = input.LA(1);

                         
                        int index54_95 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_95 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                        else if ( LA54_95 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                         
                        input.seek(index54_95);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA54_158 = input.LA(1);

                         
                        int index54_158 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_158 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                        else if ( LA54_158 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                         
                        input.seek(index54_158);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA54_108 = input.LA(1);

                         
                        int index54_108 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_108 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                        else if ( LA54_108 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                         
                        input.seek(index54_108);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA54_171 = input.LA(1);

                         
                        int index54_171 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_171 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                        else if ( LA54_171 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                         
                        input.seek(index54_171);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA54_57 = input.LA(1);

                         
                        int index54_57 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_57 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                        else if ( LA54_57 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                         
                        input.seek(index54_57);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA54_120 = input.LA(1);

                         
                        int index54_120 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_120 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                        else if ( LA54_120 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                         
                        input.seek(index54_120);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA54_184 = input.LA(1);

                         
                        int index54_184 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_184 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                        else if ( LA54_184 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                         
                        input.seek(index54_184);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA54_70 = input.LA(1);

                         
                        int index54_70 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_70 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                        else if ( LA54_70 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                         
                        input.seek(index54_70);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA54_133 = input.LA(1);

                         
                        int index54_133 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_133 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                        else if ( LA54_133 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                         
                        input.seek(index54_133);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA54_83 = input.LA(1);

                         
                        int index54_83 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_83 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                        else if ( LA54_83 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                         
                        input.seek(index54_83);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA54_118 = input.LA(1);

                         
                        int index54_118 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_118 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                        else if ( LA54_118 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                         
                        input.seek(index54_118);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA54_146 = input.LA(1);

                         
                        int index54_146 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_146 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                        else if ( LA54_146 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                         
                        input.seek(index54_146);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA54_96 = input.LA(1);

                         
                        int index54_96 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_96 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                        else if ( LA54_96 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                         
                        input.seek(index54_96);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA54_159 = input.LA(1);

                         
                        int index54_159 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_159 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                        else if ( LA54_159 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                         
                        input.seek(index54_159);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA54_109 = input.LA(1);

                         
                        int index54_109 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_109 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                        else if ( LA54_109 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                         
                        input.seek(index54_109);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA54_172 = input.LA(1);

                         
                        int index54_172 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_172 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                        else if ( LA54_172 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                         
                        input.seek(index54_172);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA54_58 = input.LA(1);

                         
                        int index54_58 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_58 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                        else if ( LA54_58 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                         
                        input.seek(index54_58);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA54_121 = input.LA(1);

                         
                        int index54_121 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_121 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                        else if ( LA54_121 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                         
                        input.seek(index54_121);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA54_185 = input.LA(1);

                         
                        int index54_185 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_185 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                        else if ( LA54_185 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                         
                        input.seek(index54_185);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA54_71 = input.LA(1);

                         
                        int index54_71 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_71 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                        else if ( LA54_71 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                         
                        input.seek(index54_71);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA54_134 = input.LA(1);

                         
                        int index54_134 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_134 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                        else if ( LA54_134 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                         
                        input.seek(index54_134);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA54_84 = input.LA(1);

                         
                        int index54_84 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_84 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                        else if ( LA54_84 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                         
                        input.seek(index54_84);
                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA54_147 = input.LA(1);

                         
                        int index54_147 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_147 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                        else if ( LA54_147 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                         
                        input.seek(index54_147);
                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA54_97 = input.LA(1);

                         
                        int index54_97 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_97 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                        else if ( LA54_97 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                         
                        input.seek(index54_97);
                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA54_160 = input.LA(1);

                         
                        int index54_160 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_160 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                        else if ( LA54_160 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                         
                        input.seek(index54_160);
                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA54_116 = input.LA(1);

                         
                        int index54_116 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_116 == RULE_STRING && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 118;}

                        else if ( LA54_116 == 25 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 119;}

                        else if ( LA54_116 == 33 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 120;}

                        else if ( LA54_116 == 17 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 121;}

                        else if ( LA54_116 == 18 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 122;}

                        else if ( LA54_116 == 29 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 123;}

                        else if ( LA54_116 == 87 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 124;}

                        else if ( LA54_116 == 34 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 125;}

                        else if ( LA54_116 == 24 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 126;}

                        else if ( LA54_116 == 19 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 127;}

                        else if ( LA54_116 == 21 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 128;}

                        else if ( LA54_116 == 32 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 129;}

                        else if ( LA54_116 == 60 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 130;}

                        else if ( LA54_116 == 31 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 131;}

                        else if ( LA54_116 == 38 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 132;}

                        else if ( LA54_116 == 12 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 133;}

                        else if ( LA54_116 == 64 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 134;}

                        else if ( LA54_116 == 65 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 135;}

                        else if ( LA54_116 == 66 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 136;}

                        else if ( LA54_116 == 67 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 137;}

                        else if ( LA54_116 == 68 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 138;}

                        else if ( LA54_116 == 69 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 139;}

                        else if ( LA54_116 == 70 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 140;}

                        else if ( LA54_116 == 71 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 141;}

                        else if ( LA54_116 == 72 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 142;}

                        else if ( LA54_116 == 73 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 143;}

                        else if ( LA54_116 == 74 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 144;}

                        else if ( LA54_116 == 75 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 145;}

                        else if ( LA54_116 == 76 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 146;}

                        else if ( LA54_116 == 77 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 147;}

                        else if ( LA54_116 == 78 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 148;}

                        else if ( LA54_116 == 79 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 149;}

                        else if ( LA54_116 == 80 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 150;}

                        else if ( LA54_116 == 81 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 151;}

                        else if ( LA54_116 == 82 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 152;}

                        else if ( LA54_116 == 83 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 153;}

                        else if ( LA54_116 == 84 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 154;}

                        else if ( LA54_116 == 85 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 155;}

                        else if ( LA54_116 == 86 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 156;}

                        else if ( LA54_116 == 23 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 157;}

                        else if ( LA54_116 == 43 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 158;}

                        else if ( LA54_116 == 44 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 159;}

                        else if ( LA54_116 == 88 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 160;}

                        else if ( LA54_116 == 50 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 161;}

                        else if ( LA54_116 == 49 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 162;}

                        else if ( LA54_116 == 48 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 163;}

                        else if ( LA54_116 == 47 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 164;}

                        else if ( LA54_116 == 51 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 165;}

                        else if ( LA54_116 == 52 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 166;}

                        else if ( LA54_116 == 45 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 167;}

                        else if ( LA54_116 == 46 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 168;}

                        else if ( LA54_116 == 15 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 169;}

                        else if ( LA54_116 == 20 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 170;}

                        else if ( LA54_116 == 26 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 171;}

                        else if ( LA54_116 == 30 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 172;}

                        else if ( LA54_116 == 35 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 173;}

                        else if ( LA54_116 == 36 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 174;}

                        else if ( LA54_116 == 37 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 175;}

                        else if ( LA54_116 == 39 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 176;}

                        else if ( LA54_116 == 40 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 177;}

                        else if ( LA54_116 == 41 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 178;}

                        else if ( LA54_116 == 42 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 179;}

                        else if ( LA54_116 == 22 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 180;}

                        else if ( LA54_116 == 53 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 181;}

                        else if ( LA54_116 == 54 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 182;}

                        else if ( LA54_116 == 55 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 183;}

                        else if ( LA54_116 == 56 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 184;}

                        else if ( LA54_116 == 57 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 185;}

                        else if ( LA54_116 == 58 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 186;}

                        else if ( LA54_116 == 59 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 187;}

                         
                        input.seek(index54_116);
                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA54_110 = input.LA(1);

                         
                        int index54_110 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_110 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                        else if ( LA54_110 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                         
                        input.seek(index54_110);
                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA54_45 = input.LA(1);

                         
                        int index54_45 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_45 == RULE_STRING && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 46;}

                        else if ( LA54_45 == 25 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 47;}

                        else if ( LA54_45 == 33 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 48;}

                        else if ( LA54_45 == 17 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 49;}

                        else if ( LA54_45 == 18 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 50;}

                        else if ( LA54_45 == 29 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 51;}

                        else if ( LA54_45 == 87 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 52;}

                        else if ( LA54_45 == 34 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 53;}

                        else if ( LA54_45 == 24 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 54;}

                        else if ( LA54_45 == 19 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 55;}

                        else if ( LA54_45 == 21 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 56;}

                        else if ( LA54_45 == 32 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 57;}

                        else if ( LA54_45 == 60 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 58;}

                        else if ( LA54_45 == 31 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 59;}

                        else if ( LA54_45 == 38 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 60;}

                        else if ( LA54_45 == 12 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 61;}

                        else if ( LA54_45 == 64 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 62;}

                        else if ( LA54_45 == 65 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 63;}

                        else if ( LA54_45 == 66 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 64;}

                        else if ( LA54_45 == 67 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 65;}

                        else if ( LA54_45 == 68 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 66;}

                        else if ( LA54_45 == 69 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 67;}

                        else if ( LA54_45 == 70 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 68;}

                        else if ( LA54_45 == 71 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 69;}

                        else if ( LA54_45 == 72 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 70;}

                        else if ( LA54_45 == 73 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 71;}

                        else if ( LA54_45 == 74 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 72;}

                        else if ( LA54_45 == 75 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 73;}

                        else if ( LA54_45 == 76 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 74;}

                        else if ( LA54_45 == 77 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 75;}

                        else if ( LA54_45 == 78 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 76;}

                        else if ( LA54_45 == 79 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 77;}

                        else if ( LA54_45 == 80 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 78;}

                        else if ( LA54_45 == 81 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 79;}

                        else if ( LA54_45 == 82 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 80;}

                        else if ( LA54_45 == 83 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 81;}

                        else if ( LA54_45 == 84 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 82;}

                        else if ( LA54_45 == 85 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 83;}

                        else if ( LA54_45 == 86 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 84;}

                        else if ( LA54_45 == 23 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 85;}

                        else if ( LA54_45 == 43 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 86;}

                        else if ( LA54_45 == 44 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 87;}

                        else if ( LA54_45 == 88 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 88;}

                        else if ( LA54_45 == 50 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 89;}

                        else if ( LA54_45 == 49 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 90;}

                        else if ( LA54_45 == 48 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 91;}

                        else if ( LA54_45 == 47 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 92;}

                        else if ( LA54_45 == 51 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 93;}

                        else if ( LA54_45 == 52 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 94;}

                        else if ( LA54_45 == 45 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 95;}

                        else if ( LA54_45 == 46 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 96;}

                        else if ( LA54_45 == 15 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 97;}

                        else if ( LA54_45 == 20 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 98;}

                        else if ( LA54_45 == 26 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 99;}

                        else if ( LA54_45 == 30 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 100;}

                        else if ( LA54_45 == 35 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 101;}

                        else if ( LA54_45 == 36 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 102;}

                        else if ( LA54_45 == 37 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 103;}

                        else if ( LA54_45 == 39 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 104;}

                        else if ( LA54_45 == 40 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 105;}

                        else if ( LA54_45 == 41 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 106;}

                        else if ( LA54_45 == 42 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 107;}

                        else if ( LA54_45 == 22 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 108;}

                        else if ( LA54_45 == 53 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 109;}

                        else if ( LA54_45 == 54 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 110;}

                        else if ( LA54_45 == 55 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 111;}

                        else if ( LA54_45 == 56 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 112;}

                        else if ( LA54_45 == 57 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 113;}

                        else if ( LA54_45 == 58 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 114;}

                        else if ( LA54_45 == 59 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 115;}

                         
                        input.seek(index54_45);
                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA54_173 = input.LA(1);

                         
                        int index54_173 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_173 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                        else if ( LA54_173 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                         
                        input.seek(index54_173);
                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA54_59 = input.LA(1);

                         
                        int index54_59 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_59 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                        else if ( LA54_59 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                         
                        input.seek(index54_59);
                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA54_117 = input.LA(1);

                         
                        int index54_117 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) ) {s = 188;}

                        else if ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) {s = 189;}

                         
                        input.seek(index54_117);
                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA54_122 = input.LA(1);

                         
                        int index54_122 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_122 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                        else if ( LA54_122 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                         
                        input.seek(index54_122);
                        if ( s>=0 ) return s;
                        break;
                    case 46 : 
                        int LA54_186 = input.LA(1);

                         
                        int index54_186 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_186 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                        else if ( LA54_186 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                         
                        input.seek(index54_186);
                        if ( s>=0 ) return s;
                        break;
                    case 47 : 
                        int LA54_72 = input.LA(1);

                         
                        int index54_72 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_72 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                        else if ( LA54_72 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                         
                        input.seek(index54_72);
                        if ( s>=0 ) return s;
                        break;
                    case 48 : 
                        int LA54_135 = input.LA(1);

                         
                        int index54_135 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_135 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                        else if ( LA54_135 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                         
                        input.seek(index54_135);
                        if ( s>=0 ) return s;
                        break;
                    case 49 : 
                        int LA54_85 = input.LA(1);

                         
                        int index54_85 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_85 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                        else if ( LA54_85 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                         
                        input.seek(index54_85);
                        if ( s>=0 ) return s;
                        break;
                    case 50 : 
                        int LA54_148 = input.LA(1);

                         
                        int index54_148 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_148 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                        else if ( LA54_148 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                         
                        input.seek(index54_148);
                        if ( s>=0 ) return s;
                        break;
                    case 51 : 
                        int LA54_98 = input.LA(1);

                         
                        int index54_98 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_98 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                        else if ( LA54_98 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                         
                        input.seek(index54_98);
                        if ( s>=0 ) return s;
                        break;
                    case 52 : 
                        int LA54_161 = input.LA(1);

                         
                        int index54_161 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_161 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                        else if ( LA54_161 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                         
                        input.seek(index54_161);
                        if ( s>=0 ) return s;
                        break;
                    case 53 : 
                        int LA54_47 = input.LA(1);

                         
                        int index54_47 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_47 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                        else if ( LA54_47 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                         
                        input.seek(index54_47);
                        if ( s>=0 ) return s;
                        break;
                    case 54 : 
                        int LA54_111 = input.LA(1);

                         
                        int index54_111 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_111 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                        else if ( LA54_111 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                         
                        input.seek(index54_111);
                        if ( s>=0 ) return s;
                        break;
                    case 55 : 
                        int LA54_174 = input.LA(1);

                         
                        int index54_174 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_174 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                        else if ( LA54_174 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                         
                        input.seek(index54_174);
                        if ( s>=0 ) return s;
                        break;
                    case 56 : 
                        int LA54_60 = input.LA(1);

                         
                        int index54_60 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_60 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                        else if ( LA54_60 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                         
                        input.seek(index54_60);
                        if ( s>=0 ) return s;
                        break;
                    case 57 : 
                        int LA54_123 = input.LA(1);

                         
                        int index54_123 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_123 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                        else if ( LA54_123 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                         
                        input.seek(index54_123);
                        if ( s>=0 ) return s;
                        break;
                    case 58 : 
                        int LA54_187 = input.LA(1);

                         
                        int index54_187 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_187 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                        else if ( LA54_187 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                         
                        input.seek(index54_187);
                        if ( s>=0 ) return s;
                        break;
                    case 59 : 
                        int LA54_73 = input.LA(1);

                         
                        int index54_73 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_73 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                        else if ( LA54_73 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                         
                        input.seek(index54_73);
                        if ( s>=0 ) return s;
                        break;
                    case 60 : 
                        int LA54_136 = input.LA(1);

                         
                        int index54_136 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_136 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                        else if ( LA54_136 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                         
                        input.seek(index54_136);
                        if ( s>=0 ) return s;
                        break;
                    case 61 : 
                        int LA54_86 = input.LA(1);

                         
                        int index54_86 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_86 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                        else if ( LA54_86 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                         
                        input.seek(index54_86);
                        if ( s>=0 ) return s;
                        break;
                    case 62 : 
                        int LA54_149 = input.LA(1);

                         
                        int index54_149 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_149 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                        else if ( LA54_149 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                         
                        input.seek(index54_149);
                        if ( s>=0 ) return s;
                        break;
                    case 63 : 
                        int LA54_99 = input.LA(1);

                         
                        int index54_99 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_99 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                        else if ( LA54_99 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                         
                        input.seek(index54_99);
                        if ( s>=0 ) return s;
                        break;
                    case 64 : 
                        int LA54_162 = input.LA(1);

                         
                        int index54_162 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_162 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                        else if ( LA54_162 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                         
                        input.seek(index54_162);
                        if ( s>=0 ) return s;
                        break;
                    case 65 : 
                        int LA54_48 = input.LA(1);

                         
                        int index54_48 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_48 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                        else if ( LA54_48 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                         
                        input.seek(index54_48);
                        if ( s>=0 ) return s;
                        break;
                    case 66 : 
                        int LA54_112 = input.LA(1);

                         
                        int index54_112 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_112 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                        else if ( LA54_112 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                         
                        input.seek(index54_112);
                        if ( s>=0 ) return s;
                        break;
                    case 67 : 
                        int LA54_175 = input.LA(1);

                         
                        int index54_175 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_175 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                        else if ( LA54_175 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                         
                        input.seek(index54_175);
                        if ( s>=0 ) return s;
                        break;
                    case 68 : 
                        int LA54_61 = input.LA(1);

                         
                        int index54_61 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_61 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                        else if ( LA54_61 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                         
                        input.seek(index54_61);
                        if ( s>=0 ) return s;
                        break;
                    case 69 : 
                        int LA54_124 = input.LA(1);

                         
                        int index54_124 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_124 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                        else if ( LA54_124 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                         
                        input.seek(index54_124);
                        if ( s>=0 ) return s;
                        break;
                    case 70 : 
                        int LA54_46 = input.LA(1);

                         
                        int index54_46 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_46 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                        else if ( LA54_46 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                         
                        input.seek(index54_46);
                        if ( s>=0 ) return s;
                        break;
                    case 71 : 
                        int LA54_74 = input.LA(1);

                         
                        int index54_74 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_74 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                        else if ( LA54_74 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                         
                        input.seek(index54_74);
                        if ( s>=0 ) return s;
                        break;
                    case 72 : 
                        int LA54_137 = input.LA(1);

                         
                        int index54_137 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_137 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                        else if ( LA54_137 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                         
                        input.seek(index54_137);
                        if ( s>=0 ) return s;
                        break;
                    case 73 : 
                        int LA54_87 = input.LA(1);

                         
                        int index54_87 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_87 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                        else if ( LA54_87 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                         
                        input.seek(index54_87);
                        if ( s>=0 ) return s;
                        break;
                    case 74 : 
                        int LA54_150 = input.LA(1);

                         
                        int index54_150 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_150 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                        else if ( LA54_150 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                         
                        input.seek(index54_150);
                        if ( s>=0 ) return s;
                        break;
                    case 75 : 
                        int LA54_100 = input.LA(1);

                         
                        int index54_100 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_100 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                        else if ( LA54_100 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                         
                        input.seek(index54_100);
                        if ( s>=0 ) return s;
                        break;
                    case 76 : 
                        int LA54_163 = input.LA(1);

                         
                        int index54_163 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_163 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                        else if ( LA54_163 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                         
                        input.seek(index54_163);
                        if ( s>=0 ) return s;
                        break;
                    case 77 : 
                        int LA54_49 = input.LA(1);

                         
                        int index54_49 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_49 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                        else if ( LA54_49 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                         
                        input.seek(index54_49);
                        if ( s>=0 ) return s;
                        break;
                    case 78 : 
                        int LA54_113 = input.LA(1);

                         
                        int index54_113 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_113 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                        else if ( LA54_113 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                         
                        input.seek(index54_113);
                        if ( s>=0 ) return s;
                        break;
                    case 79 : 
                        int LA54_176 = input.LA(1);

                         
                        int index54_176 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_176 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                        else if ( LA54_176 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                         
                        input.seek(index54_176);
                        if ( s>=0 ) return s;
                        break;
                    case 80 : 
                        int LA54_62 = input.LA(1);

                         
                        int index54_62 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_62 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                        else if ( LA54_62 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                         
                        input.seek(index54_62);
                        if ( s>=0 ) return s;
                        break;
                    case 81 : 
                        int LA54_125 = input.LA(1);

                         
                        int index54_125 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_125 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                        else if ( LA54_125 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                         
                        input.seek(index54_125);
                        if ( s>=0 ) return s;
                        break;
                    case 82 : 
                        int LA54_75 = input.LA(1);

                         
                        int index54_75 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_75 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                        else if ( LA54_75 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                         
                        input.seek(index54_75);
                        if ( s>=0 ) return s;
                        break;
                    case 83 : 
                        int LA54_138 = input.LA(1);

                         
                        int index54_138 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_138 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                        else if ( LA54_138 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                         
                        input.seek(index54_138);
                        if ( s>=0 ) return s;
                        break;
                    case 84 : 
                        int LA54_88 = input.LA(1);

                         
                        int index54_88 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_88 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                        else if ( LA54_88 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                         
                        input.seek(index54_88);
                        if ( s>=0 ) return s;
                        break;
                    case 85 : 
                        int LA54_151 = input.LA(1);

                         
                        int index54_151 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_151 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                        else if ( LA54_151 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                         
                        input.seek(index54_151);
                        if ( s>=0 ) return s;
                        break;
                    case 86 : 
                        int LA54_101 = input.LA(1);

                         
                        int index54_101 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_101 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                        else if ( LA54_101 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                         
                        input.seek(index54_101);
                        if ( s>=0 ) return s;
                        break;
                    case 87 : 
                        int LA54_164 = input.LA(1);

                         
                        int index54_164 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_164 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                        else if ( LA54_164 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                         
                        input.seek(index54_164);
                        if ( s>=0 ) return s;
                        break;
                    case 88 : 
                        int LA54_50 = input.LA(1);

                         
                        int index54_50 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_50 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                        else if ( LA54_50 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                         
                        input.seek(index54_50);
                        if ( s>=0 ) return s;
                        break;
                    case 89 : 
                        int LA54_114 = input.LA(1);

                         
                        int index54_114 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_114 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                        else if ( LA54_114 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                         
                        input.seek(index54_114);
                        if ( s>=0 ) return s;
                        break;
                    case 90 : 
                        int LA54_177 = input.LA(1);

                         
                        int index54_177 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_177 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                        else if ( LA54_177 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                         
                        input.seek(index54_177);
                        if ( s>=0 ) return s;
                        break;
                    case 91 : 
                        int LA54_63 = input.LA(1);

                         
                        int index54_63 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_63 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                        else if ( LA54_63 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                         
                        input.seek(index54_63);
                        if ( s>=0 ) return s;
                        break;
                    case 92 : 
                        int LA54_126 = input.LA(1);

                         
                        int index54_126 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_126 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                        else if ( LA54_126 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                         
                        input.seek(index54_126);
                        if ( s>=0 ) return s;
                        break;
                    case 93 : 
                        int LA54_76 = input.LA(1);

                         
                        int index54_76 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_76 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                        else if ( LA54_76 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                         
                        input.seek(index54_76);
                        if ( s>=0 ) return s;
                        break;
                    case 94 : 
                        int LA54_139 = input.LA(1);

                         
                        int index54_139 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_139 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                        else if ( LA54_139 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                         
                        input.seek(index54_139);
                        if ( s>=0 ) return s;
                        break;
                    case 95 : 
                        int LA54_89 = input.LA(1);

                         
                        int index54_89 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_89 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                        else if ( LA54_89 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                         
                        input.seek(index54_89);
                        if ( s>=0 ) return s;
                        break;
                    case 96 : 
                        int LA54_152 = input.LA(1);

                         
                        int index54_152 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_152 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                        else if ( LA54_152 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                         
                        input.seek(index54_152);
                        if ( s>=0 ) return s;
                        break;
                    case 97 : 
                        int LA54_102 = input.LA(1);

                         
                        int index54_102 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_102 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                        else if ( LA54_102 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                         
                        input.seek(index54_102);
                        if ( s>=0 ) return s;
                        break;
                    case 98 : 
                        int LA54_165 = input.LA(1);

                         
                        int index54_165 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_165 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                        else if ( LA54_165 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                         
                        input.seek(index54_165);
                        if ( s>=0 ) return s;
                        break;
                    case 99 : 
                        int LA54_51 = input.LA(1);

                         
                        int index54_51 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_51 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                        else if ( LA54_51 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                         
                        input.seek(index54_51);
                        if ( s>=0 ) return s;
                        break;
                    case 100 : 
                        int LA54_115 = input.LA(1);

                         
                        int index54_115 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_115 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                        else if ( LA54_115 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                         
                        input.seek(index54_115);
                        if ( s>=0 ) return s;
                        break;
                    case 101 : 
                        int LA54_178 = input.LA(1);

                         
                        int index54_178 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_178 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                        else if ( LA54_178 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                         
                        input.seek(index54_178);
                        if ( s>=0 ) return s;
                        break;
                    case 102 : 
                        int LA54_64 = input.LA(1);

                         
                        int index54_64 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_64 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                        else if ( LA54_64 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                         
                        input.seek(index54_64);
                        if ( s>=0 ) return s;
                        break;
                    case 103 : 
                        int LA54_127 = input.LA(1);

                         
                        int index54_127 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_127 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                        else if ( LA54_127 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                         
                        input.seek(index54_127);
                        if ( s>=0 ) return s;
                        break;
                    case 104 : 
                        int LA54_77 = input.LA(1);

                         
                        int index54_77 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_77 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                        else if ( LA54_77 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                         
                        input.seek(index54_77);
                        if ( s>=0 ) return s;
                        break;
                    case 105 : 
                        int LA54_140 = input.LA(1);

                         
                        int index54_140 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_140 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                        else if ( LA54_140 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                         
                        input.seek(index54_140);
                        if ( s>=0 ) return s;
                        break;
                    case 106 : 
                        int LA54_90 = input.LA(1);

                         
                        int index54_90 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_90 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                        else if ( LA54_90 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                         
                        input.seek(index54_90);
                        if ( s>=0 ) return s;
                        break;
                    case 107 : 
                        int LA54_0 = input.LA(1);

                         
                        int index54_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA54_0==16) ) {s = 1;}

                        else if ( LA54_0 == 12 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 0) ) {s = 2;}

                        else if ( LA54_0 == 15 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 1) ) {s = 3;}

                        else if ( LA54_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 2) ) {s = 4;}

                        else if ( LA54_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 3) ) {s = 5;}

                        else if ( LA54_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 4) ) {s = 6;}

                        else if ( LA54_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 5) ) {s = 7;}

                        else if ( LA54_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 6) ) {s = 8;}

                        else if ( LA54_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 7) ) {s = 9;}

                        else if ( LA54_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 8) ) {s = 10;}

                        else if ( LA54_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 9) ) {s = 11;}

                        else if ( LA54_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 10) ) {s = 12;}

                        else if ( LA54_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 11) ) {s = 13;}

                        else if ( LA54_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 12) ) {s = 14;}

                        else if ( LA54_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 13) ) {s = 15;}

                        else if ( LA54_0 == 31 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 16;}

                        else if ( LA54_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 15) ) {s = 17;}

                        else if ( LA54_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 16) ) {s = 18;}

                        else if ( LA54_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 17) ) {s = 19;}

                        else if ( LA54_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 18) ) {s = 20;}

                        else if ( LA54_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 19) ) {s = 21;}

                        else if ( LA54_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 21) ) {s = 22;}

                        else if ( LA54_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 22) ) {s = 23;}

                        else if ( LA54_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 23) ) {s = 24;}

                        else if ( LA54_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 24) ) {s = 25;}

                        else if ( LA54_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 25) ) {s = 26;}

                        else if ( LA54_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 26) ) {s = 27;}

                        else if ( LA54_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 27) ) {s = 28;}

                        else if ( LA54_0 == 45 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 28) ) {s = 29;}

                        else if ( LA54_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 29) ) {s = 30;}

                        else if ( LA54_0 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 30) ) {s = 31;}

                        else if ( LA54_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 31) ) {s = 32;}

                        else if ( LA54_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 32) ) {s = 33;}

                        else if ( LA54_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 33) ) {s = 34;}

                        else if ( LA54_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 34) ) {s = 35;}

                        else if ( LA54_0 == 52 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 35) ) {s = 36;}

                        else if ( LA54_0 == 53 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 36) ) {s = 37;}

                        else if ( LA54_0 == 54 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 37) ) {s = 38;}

                        else if ( LA54_0 == 55 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 38) ) {s = 39;}

                        else if ( LA54_0 == 56 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 39) ) {s = 40;}

                        else if ( LA54_0 == 57 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 40) ) {s = 41;}

                        else if ( LA54_0 == 58 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 41) ) {s = 42;}

                        else if ( LA54_0 == 59 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 42) ) {s = 43;}

                         
                        input.seek(index54_0);
                        if ( s>=0 ) return s;
                        break;
                    case 108 : 
                        int LA54_153 = input.LA(1);

                         
                        int index54_153 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_153 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                        else if ( LA54_153 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                         
                        input.seek(index54_153);
                        if ( s>=0 ) return s;
                        break;
                    case 109 : 
                        int LA54_103 = input.LA(1);

                         
                        int index54_103 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_103 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                        else if ( LA54_103 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                         
                        input.seek(index54_103);
                        if ( s>=0 ) return s;
                        break;
                    case 110 : 
                        int LA54_166 = input.LA(1);

                         
                        int index54_166 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_166 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                        else if ( LA54_166 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                         
                        input.seek(index54_166);
                        if ( s>=0 ) return s;
                        break;
                    case 111 : 
                        int LA54_52 = input.LA(1);

                         
                        int index54_52 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_52 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                        else if ( LA54_52 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                         
                        input.seek(index54_52);
                        if ( s>=0 ) return s;
                        break;
                    case 112 : 
                        int LA54_179 = input.LA(1);

                         
                        int index54_179 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_179 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                        else if ( LA54_179 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                         
                        input.seek(index54_179);
                        if ( s>=0 ) return s;
                        break;
                    case 113 : 
                        int LA54_65 = input.LA(1);

                         
                        int index54_65 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_65 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                        else if ( LA54_65 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                         
                        input.seek(index54_65);
                        if ( s>=0 ) return s;
                        break;
                    case 114 : 
                        int LA54_128 = input.LA(1);

                         
                        int index54_128 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_128 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                        else if ( LA54_128 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                         
                        input.seek(index54_128);
                        if ( s>=0 ) return s;
                        break;
                    case 115 : 
                        int LA54_78 = input.LA(1);

                         
                        int index54_78 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_78 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                        else if ( LA54_78 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                         
                        input.seek(index54_78);
                        if ( s>=0 ) return s;
                        break;
                    case 116 : 
                        int LA54_141 = input.LA(1);

                         
                        int index54_141 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_141 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                        else if ( LA54_141 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                         
                        input.seek(index54_141);
                        if ( s>=0 ) return s;
                        break;
                    case 117 : 
                        int LA54_91 = input.LA(1);

                         
                        int index54_91 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_91 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                        else if ( LA54_91 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                         
                        input.seek(index54_91);
                        if ( s>=0 ) return s;
                        break;
                    case 118 : 
                        int LA54_154 = input.LA(1);

                         
                        int index54_154 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_154 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                        else if ( LA54_154 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                         
                        input.seek(index54_154);
                        if ( s>=0 ) return s;
                        break;
                    case 119 : 
                        int LA54_104 = input.LA(1);

                         
                        int index54_104 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_104 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                        else if ( LA54_104 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                         
                        input.seek(index54_104);
                        if ( s>=0 ) return s;
                        break;
                    case 120 : 
                        int LA54_167 = input.LA(1);

                         
                        int index54_167 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_167 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                        else if ( LA54_167 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                         
                        input.seek(index54_167);
                        if ( s>=0 ) return s;
                        break;
                    case 121 : 
                        int LA54_53 = input.LA(1);

                         
                        int index54_53 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_53 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                        else if ( LA54_53 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                         
                        input.seek(index54_53);
                        if ( s>=0 ) return s;
                        break;
                    case 122 : 
                        int LA54_180 = input.LA(1);

                         
                        int index54_180 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_180 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                        else if ( LA54_180 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                         
                        input.seek(index54_180);
                        if ( s>=0 ) return s;
                        break;
                    case 123 : 
                        int LA54_66 = input.LA(1);

                         
                        int index54_66 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_66 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                        else if ( LA54_66 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                         
                        input.seek(index54_66);
                        if ( s>=0 ) return s;
                        break;
                    case 124 : 
                        int LA54_129 = input.LA(1);

                         
                        int index54_129 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_129 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                        else if ( LA54_129 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                         
                        input.seek(index54_129);
                        if ( s>=0 ) return s;
                        break;
                    case 125 : 
                        int LA54_79 = input.LA(1);

                         
                        int index54_79 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_79 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                        else if ( LA54_79 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                         
                        input.seek(index54_79);
                        if ( s>=0 ) return s;
                        break;
                    case 126 : 
                        int LA54_142 = input.LA(1);

                         
                        int index54_142 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_142 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                        else if ( LA54_142 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                         
                        input.seek(index54_142);
                        if ( s>=0 ) return s;
                        break;
                    case 127 : 
                        int LA54_92 = input.LA(1);

                         
                        int index54_92 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_92 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                        else if ( LA54_92 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                         
                        input.seek(index54_92);
                        if ( s>=0 ) return s;
                        break;
                    case 128 : 
                        int LA54_155 = input.LA(1);

                         
                        int index54_155 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_155 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                        else if ( LA54_155 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                         
                        input.seek(index54_155);
                        if ( s>=0 ) return s;
                        break;
                    case 129 : 
                        int LA54_105 = input.LA(1);

                         
                        int index54_105 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_105 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                        else if ( LA54_105 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                         
                        input.seek(index54_105);
                        if ( s>=0 ) return s;
                        break;
                    case 130 : 
                        int LA54_168 = input.LA(1);

                         
                        int index54_168 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_168 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                        else if ( LA54_168 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                         
                        input.seek(index54_168);
                        if ( s>=0 ) return s;
                        break;
                    case 131 : 
                        int LA54_54 = input.LA(1);

                         
                        int index54_54 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_54 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                        else if ( LA54_54 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                         
                        input.seek(index54_54);
                        if ( s>=0 ) return s;
                        break;
                    case 132 : 
                        int LA54_181 = input.LA(1);

                         
                        int index54_181 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_181 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                        else if ( LA54_181 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                         
                        input.seek(index54_181);
                        if ( s>=0 ) return s;
                        break;
                    case 133 : 
                        int LA54_67 = input.LA(1);

                         
                        int index54_67 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_67 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                        else if ( LA54_67 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                         
                        input.seek(index54_67);
                        if ( s>=0 ) return s;
                        break;
                    case 134 : 
                        int LA54_130 = input.LA(1);

                         
                        int index54_130 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_130 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                        else if ( LA54_130 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                         
                        input.seek(index54_130);
                        if ( s>=0 ) return s;
                        break;
                    case 135 : 
                        int LA54_80 = input.LA(1);

                         
                        int index54_80 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_80 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                        else if ( LA54_80 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                         
                        input.seek(index54_80);
                        if ( s>=0 ) return s;
                        break;
                    case 136 : 
                        int LA54_143 = input.LA(1);

                         
                        int index54_143 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_143 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                        else if ( LA54_143 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                         
                        input.seek(index54_143);
                        if ( s>=0 ) return s;
                        break;
                    case 137 : 
                        int LA54_93 = input.LA(1);

                         
                        int index54_93 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_93 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                        else if ( LA54_93 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                         
                        input.seek(index54_93);
                        if ( s>=0 ) return s;
                        break;
                    case 138 : 
                        int LA54_156 = input.LA(1);

                         
                        int index54_156 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_156 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                        else if ( LA54_156 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                         
                        input.seek(index54_156);
                        if ( s>=0 ) return s;
                        break;
                    case 139 : 
                        int LA54_106 = input.LA(1);

                         
                        int index54_106 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_106 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                        else if ( LA54_106 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                         
                        input.seek(index54_106);
                        if ( s>=0 ) return s;
                        break;
                    case 140 : 
                        int LA54_169 = input.LA(1);

                         
                        int index54_169 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_169 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                        else if ( LA54_169 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                         
                        input.seek(index54_169);
                        if ( s>=0 ) return s;
                        break;
                    case 141 : 
                        int LA54_16 = input.LA(1);

                         
                        int index54_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_16 == 13 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 44;}

                         
                        input.seek(index54_16);
                        if ( s>=0 ) return s;
                        break;
                    case 142 : 
                        int LA54_55 = input.LA(1);

                         
                        int index54_55 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_55 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                        else if ( LA54_55 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                         
                        input.seek(index54_55);
                        if ( s>=0 ) return s;
                        break;
                    case 143 : 
                        int LA54_182 = input.LA(1);

                         
                        int index54_182 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_182 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                        else if ( LA54_182 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                         
                        input.seek(index54_182);
                        if ( s>=0 ) return s;
                        break;
                    case 144 : 
                        int LA54_68 = input.LA(1);

                         
                        int index54_68 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_68 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                        else if ( LA54_68 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                         
                        input.seek(index54_68);
                        if ( s>=0 ) return s;
                        break;
                    case 145 : 
                        int LA54_131 = input.LA(1);

                         
                        int index54_131 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_131 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 117;}

                        else if ( LA54_131 == 14 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 20) ) ) {s = 116;}

                         
                        input.seek(index54_131);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 54, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_7s = "\112\uffff";
    static final String dfa_8s = "\1\4\106\15\1\13\2\uffff";
    static final String dfa_9s = "\1\130\106\15\1\33\2\uffff";
    static final String dfa_10s = "\110\uffff\1\1\1\2";
    static final String dfa_11s = "\112\uffff}>";
    static final String[] dfa_12s = {
            "\1\1\7\uffff\1\20\2\uffff\1\64\1\uffff\1\4\1\5\1\12\1\65\1\13\1\77\1\50\1\11\1\2\1\66\2\uffff\1\6\1\67\1\16\1\14\1\3\1\10\1\70\1\71\1\72\1\17\1\73\1\74\1\75\1\76\1\51\1\52\1\62\1\63\1\57\1\56\1\55\1\54\1\60\1\61\1\100\1\101\1\102\1\103\1\104\1\105\1\106\1\15\3\uffff\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\7\1\53",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\111\17\uffff\1\110",
            "",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA56 extends DFA {

        public DFA56(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 56;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "2322:2: ( ( (lv_PropertyDependency_0_0= rulePropertyDependency ) ) | ( ( (lv_schemaDependencies_1_0= ruleNamedSchema ) ) (otherlv_2= ',' ( (lv_schemaDependencies_3_0= ruleNamedSchema ) ) )* ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0FFFFFFDE7FF9000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000008000000L,0x000000000000007FL});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0FFFFFFDE7FFD000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x1FFFFFFFE7FE9010L,0x0000000001FFFFFFL});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0xC000000000000800L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0xDFFFFFFFEFFE9830L,0x0000000001FFFFFFL});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0xC000000008000800L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000008000800L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000010004000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0xDFFFFFFFE7FE9010L,0x0000000001FFFFFFL});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0xC000000000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000000L,0x00000000007FFF80L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0xC000000010000800L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x2000000000000002L});

}
