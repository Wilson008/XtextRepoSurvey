package eu.metatools.technocat.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTechnoCatLexer extends Lexer {
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__10=10;
    public static final int T__9=9;
    public static final int T__8=8;
    public static final int RULE_ID=5;
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
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=6;
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
    public static final int RULE_WS=7;
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

    public InternalTechnoCatLexer() {;} 
    public InternalTechnoCatLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalTechnoCatLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalTechnoCat.g"; }

    // $ANTLR start "T__8"
    public final void mT__8() throws RecognitionException {
        try {
            int _type = T__8;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTechnoCat.g:11:6: ( 'model' )
            // InternalTechnoCat.g:11:8: 'model'
            {
            match("model"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__8"

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTechnoCat.g:12:6: ( 'import' )
            // InternalTechnoCat.g:12:8: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTechnoCat.g:13:7: ( 'type' )
            // InternalTechnoCat.g:13:9: 'type'
            {
            match("type"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTechnoCat.g:14:7: ( 'from' )
            // InternalTechnoCat.g:14:9: 'from'
            {
            match("from"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTechnoCat.g:15:7: ( ',' )
            // InternalTechnoCat.g:15:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTechnoCat.g:16:7: ( '=' )
            // InternalTechnoCat.g:16:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTechnoCat.g:17:7: ( 'relation' )
            // InternalTechnoCat.g:17:9: 'relation'
            {
            match("relation"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTechnoCat.g:18:7: ( '->' )
            // InternalTechnoCat.g:18:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTechnoCat.g:19:7: ( ':' )
            // InternalTechnoCat.g:19:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTechnoCat.g:20:7: ( '+' )
            // InternalTechnoCat.g:20:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTechnoCat.g:21:7: ( '-' )
            // InternalTechnoCat.g:21:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTechnoCat.g:22:7: ( '*' )
            // InternalTechnoCat.g:22:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTechnoCat.g:23:7: ( '/' )
            // InternalTechnoCat.g:23:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTechnoCat.g:24:7: ( '%' )
            // InternalTechnoCat.g:24:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTechnoCat.g:25:7: ( '++' )
            // InternalTechnoCat.g:25:9: '++'
            {
            match("++"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTechnoCat.g:26:7: ( '--' )
            // InternalTechnoCat.g:26:9: '--'
            {
            match("--"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTechnoCat.g:27:7: ( '==' )
            // InternalTechnoCat.g:27:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTechnoCat.g:28:7: ( '!=' )
            // InternalTechnoCat.g:28:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTechnoCat.g:29:7: ( '>' )
            // InternalTechnoCat.g:29:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTechnoCat.g:30:7: ( '<' )
            // InternalTechnoCat.g:30:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTechnoCat.g:31:7: ( '>=' )
            // InternalTechnoCat.g:31:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTechnoCat.g:32:7: ( '<=' )
            // InternalTechnoCat.g:32:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTechnoCat.g:33:7: ( '!' )
            // InternalTechnoCat.g:33:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTechnoCat.g:34:7: ( '&&' )
            // InternalTechnoCat.g:34:9: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTechnoCat.g:35:7: ( '||' )
            // InternalTechnoCat.g:35:9: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTechnoCat.g:36:7: ( '~' )
            // InternalTechnoCat.g:36:9: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTechnoCat.g:37:7: ( '&' )
            // InternalTechnoCat.g:37:9: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTechnoCat.g:38:7: ( '|' )
            // InternalTechnoCat.g:38:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTechnoCat.g:39:7: ( '^' )
            // InternalTechnoCat.g:39:9: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTechnoCat.g:40:7: ( '<<' )
            // InternalTechnoCat.g:40:9: '<<'
            {
            match("<<"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTechnoCat.g:41:7: ( '>>' )
            // InternalTechnoCat.g:41:9: '>>'
            {
            match(">>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTechnoCat.g:42:7: ( '+=' )
            // InternalTechnoCat.g:42:9: '+='
            {
            match("+="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTechnoCat.g:43:7: ( '-=' )
            // InternalTechnoCat.g:43:9: '-='
            {
            match("-="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTechnoCat.g:44:7: ( '*=' )
            // InternalTechnoCat.g:44:9: '*='
            {
            match("*="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTechnoCat.g:45:7: ( '/=' )
            // InternalTechnoCat.g:45:9: '/='
            {
            match("/="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTechnoCat.g:46:7: ( '%=' )
            // InternalTechnoCat.g:46:9: '%='
            {
            match("%="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTechnoCat.g:47:7: ( '&=' )
            // InternalTechnoCat.g:47:9: '&='
            {
            match("&="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTechnoCat.g:48:7: ( '|=' )
            // InternalTechnoCat.g:48:9: '|='
            {
            match("|="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTechnoCat.g:49:7: ( '^=' )
            // InternalTechnoCat.g:49:9: '^='
            {
            match("^="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTechnoCat.g:50:7: ( '<<=' )
            // InternalTechnoCat.g:50:9: '<<='
            {
            match("<<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTechnoCat.g:51:7: ( '>>=' )
            // InternalTechnoCat.g:51:9: '>>='
            {
            match(">>="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTechnoCat.g:52:7: ( '?' )
            // InternalTechnoCat.g:52:9: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTechnoCat.g:1266:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalTechnoCat.g:1266:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalTechnoCat.g:1266:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalTechnoCat.g:1266:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalTechnoCat.g:1266:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalTechnoCat.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTechnoCat.g:1268:13: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // InternalTechnoCat.g:1268:15: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // InternalTechnoCat.g:1268:19: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\\') ) {
                    alt3=1;
                }
                else if ( ((LA3_0>='\u0000' && LA3_0<='!')||(LA3_0>='#' && LA3_0<='[')||(LA3_0>=']' && LA3_0<='\uFFFF')) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalTechnoCat.g:1268:20: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
            	    {
            	    match('\\'); 
            	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 2 :
            	    // InternalTechnoCat.g:1268:65: ~ ( ( '\\\\' | '\"' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTechnoCat.g:1270:17: ( '--' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalTechnoCat.g:1270:19: '--' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("--"); 

            // InternalTechnoCat.g:1270:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='\u0000' && LA4_0<='\t')||(LA4_0>='\u000B' && LA4_0<='\f')||(LA4_0>='\u000E' && LA4_0<='\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalTechnoCat.g:1270:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalTechnoCat.g:1270:40: ( ( '\\r' )? '\\n' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\n'||LA6_0=='\r') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalTechnoCat.g:1270:41: ( '\\r' )? '\\n'
                    {
                    // InternalTechnoCat.g:1270:41: ( '\\r' )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='\r') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalTechnoCat.g:1270:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTechnoCat.g:1272:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalTechnoCat.g:1272:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalTechnoCat.g:1272:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='\t' && LA7_0<='\n')||LA7_0=='\r'||LA7_0==' ') ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalTechnoCat.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    public void mTokens() throws RecognitionException {
        // InternalTechnoCat.g:1:8: ( T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | RULE_ID | RULE_STRING | RULE_SL_COMMENT | RULE_WS )
        int alt8=46;
        alt8 = dfa8.predict(input);
        switch (alt8) {
            case 1 :
                // InternalTechnoCat.g:1:10: T__8
                {
                mT__8(); 

                }
                break;
            case 2 :
                // InternalTechnoCat.g:1:15: T__9
                {
                mT__9(); 

                }
                break;
            case 3 :
                // InternalTechnoCat.g:1:20: T__10
                {
                mT__10(); 

                }
                break;
            case 4 :
                // InternalTechnoCat.g:1:26: T__11
                {
                mT__11(); 

                }
                break;
            case 5 :
                // InternalTechnoCat.g:1:32: T__12
                {
                mT__12(); 

                }
                break;
            case 6 :
                // InternalTechnoCat.g:1:38: T__13
                {
                mT__13(); 

                }
                break;
            case 7 :
                // InternalTechnoCat.g:1:44: T__14
                {
                mT__14(); 

                }
                break;
            case 8 :
                // InternalTechnoCat.g:1:50: T__15
                {
                mT__15(); 

                }
                break;
            case 9 :
                // InternalTechnoCat.g:1:56: T__16
                {
                mT__16(); 

                }
                break;
            case 10 :
                // InternalTechnoCat.g:1:62: T__17
                {
                mT__17(); 

                }
                break;
            case 11 :
                // InternalTechnoCat.g:1:68: T__18
                {
                mT__18(); 

                }
                break;
            case 12 :
                // InternalTechnoCat.g:1:74: T__19
                {
                mT__19(); 

                }
                break;
            case 13 :
                // InternalTechnoCat.g:1:80: T__20
                {
                mT__20(); 

                }
                break;
            case 14 :
                // InternalTechnoCat.g:1:86: T__21
                {
                mT__21(); 

                }
                break;
            case 15 :
                // InternalTechnoCat.g:1:92: T__22
                {
                mT__22(); 

                }
                break;
            case 16 :
                // InternalTechnoCat.g:1:98: T__23
                {
                mT__23(); 

                }
                break;
            case 17 :
                // InternalTechnoCat.g:1:104: T__24
                {
                mT__24(); 

                }
                break;
            case 18 :
                // InternalTechnoCat.g:1:110: T__25
                {
                mT__25(); 

                }
                break;
            case 19 :
                // InternalTechnoCat.g:1:116: T__26
                {
                mT__26(); 

                }
                break;
            case 20 :
                // InternalTechnoCat.g:1:122: T__27
                {
                mT__27(); 

                }
                break;
            case 21 :
                // InternalTechnoCat.g:1:128: T__28
                {
                mT__28(); 

                }
                break;
            case 22 :
                // InternalTechnoCat.g:1:134: T__29
                {
                mT__29(); 

                }
                break;
            case 23 :
                // InternalTechnoCat.g:1:140: T__30
                {
                mT__30(); 

                }
                break;
            case 24 :
                // InternalTechnoCat.g:1:146: T__31
                {
                mT__31(); 

                }
                break;
            case 25 :
                // InternalTechnoCat.g:1:152: T__32
                {
                mT__32(); 

                }
                break;
            case 26 :
                // InternalTechnoCat.g:1:158: T__33
                {
                mT__33(); 

                }
                break;
            case 27 :
                // InternalTechnoCat.g:1:164: T__34
                {
                mT__34(); 

                }
                break;
            case 28 :
                // InternalTechnoCat.g:1:170: T__35
                {
                mT__35(); 

                }
                break;
            case 29 :
                // InternalTechnoCat.g:1:176: T__36
                {
                mT__36(); 

                }
                break;
            case 30 :
                // InternalTechnoCat.g:1:182: T__37
                {
                mT__37(); 

                }
                break;
            case 31 :
                // InternalTechnoCat.g:1:188: T__38
                {
                mT__38(); 

                }
                break;
            case 32 :
                // InternalTechnoCat.g:1:194: T__39
                {
                mT__39(); 

                }
                break;
            case 33 :
                // InternalTechnoCat.g:1:200: T__40
                {
                mT__40(); 

                }
                break;
            case 34 :
                // InternalTechnoCat.g:1:206: T__41
                {
                mT__41(); 

                }
                break;
            case 35 :
                // InternalTechnoCat.g:1:212: T__42
                {
                mT__42(); 

                }
                break;
            case 36 :
                // InternalTechnoCat.g:1:218: T__43
                {
                mT__43(); 

                }
                break;
            case 37 :
                // InternalTechnoCat.g:1:224: T__44
                {
                mT__44(); 

                }
                break;
            case 38 :
                // InternalTechnoCat.g:1:230: T__45
                {
                mT__45(); 

                }
                break;
            case 39 :
                // InternalTechnoCat.g:1:236: T__46
                {
                mT__46(); 

                }
                break;
            case 40 :
                // InternalTechnoCat.g:1:242: T__47
                {
                mT__47(); 

                }
                break;
            case 41 :
                // InternalTechnoCat.g:1:248: T__48
                {
                mT__48(); 

                }
                break;
            case 42 :
                // InternalTechnoCat.g:1:254: T__49
                {
                mT__49(); 

                }
                break;
            case 43 :
                // InternalTechnoCat.g:1:260: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 44 :
                // InternalTechnoCat.g:1:268: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 45 :
                // InternalTechnoCat.g:1:280: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 46 :
                // InternalTechnoCat.g:1:296: RULE_WS
                {
                mRULE_WS(); 

                }
                break;

        }

    }


    protected DFA8 dfa8 = new DFA8(this);
    static final String DFA8_eotS =
        "\1\uffff\4\26\1\uffff\1\36\1\26\1\43\1\uffff\1\46\1\50\1\52\1\54\1\56\1\61\1\64\1\67\1\72\1\uffff\1\74\4\uffff\4\26\2\uffff\1\26\1\uffff\1\102\16\uffff\1\105\2\uffff\1\107\11\uffff\5\26\6\uffff\2\26\1\117\1\120\1\26\1\122\1\26\2\uffff\1\26\1\uffff\1\125\1\26\1\uffff\1\26\1\130\1\uffff";
    static final String DFA8_eofS =
        "\131\uffff";
    static final String DFA8_minS =
        "\1\11\1\157\1\155\1\171\1\162\1\uffff\1\75\1\145\1\55\1\uffff\1\53\5\75\1\74\1\46\1\75\1\uffff\1\75\4\uffff\1\144\2\160\1\157\2\uffff\1\154\1\uffff\1\0\16\uffff\1\75\2\uffff\1\75\11\uffff\1\145\1\157\1\145\1\155\1\141\6\uffff\1\154\1\162\2\60\1\164\1\60\1\164\2\uffff\1\151\1\uffff\1\60\1\157\1\uffff\1\156\1\60\1\uffff";
    static final String DFA8_maxS =
        "\1\176\1\157\1\155\1\171\1\162\1\uffff\1\75\1\145\1\76\1\uffff\5\75\1\76\2\75\1\174\1\uffff\1\172\4\uffff\1\144\2\160\1\157\2\uffff\1\154\1\uffff\1\uffff\16\uffff\1\75\2\uffff\1\75\11\uffff\1\145\1\157\1\145\1\155\1\141\6\uffff\1\154\1\162\2\172\1\164\1\172\1\164\2\uffff\1\151\1\uffff\1\172\1\157\1\uffff\1\156\1\172\1\uffff";
    static final String DFA8_acceptS =
        "\5\uffff\1\5\3\uffff\1\11\11\uffff\1\32\1\uffff\1\52\1\53\1\54\1\56\4\uffff\1\21\1\6\1\uffff\1\10\1\uffff\1\41\1\13\1\17\1\40\1\12\1\42\1\14\1\43\1\15\1\44\1\16\1\22\1\27\1\25\1\uffff\1\23\1\26\1\uffff\1\24\1\30\1\45\1\33\1\31\1\46\1\34\1\47\1\35\5\uffff\1\20\1\55\1\51\1\37\1\50\1\36\7\uffff\1\3\1\4\1\uffff\1\1\2\uffff\1\2\2\uffff\1\7";
    static final String DFA8_specialS =
        "\41\uffff\1\0\67\uffff}>";
    static final String[] DFA8_transitionS = {
            "\2\30\2\uffff\1\30\22\uffff\1\30\1\16\1\27\2\uffff\1\15\1\21\3\uffff\1\13\1\12\1\5\1\10\1\uffff\1\14\12\uffff\1\11\1\uffff\1\20\1\6\1\17\1\25\1\uffff\32\26\3\uffff\1\24\1\26\1\uffff\5\26\1\4\2\26\1\2\3\26\1\1\4\26\1\7\1\26\1\3\6\26\1\uffff\1\22\1\uffff\1\23",
            "\1\31",
            "\1\32",
            "\1\33",
            "\1\34",
            "",
            "\1\35",
            "\1\37",
            "\1\41\17\uffff\1\42\1\40",
            "",
            "\1\44\21\uffff\1\45",
            "\1\47",
            "\1\51",
            "\1\53",
            "\1\55",
            "\1\57\1\60",
            "\1\63\1\62",
            "\1\65\26\uffff\1\66",
            "\1\71\76\uffff\1\70",
            "",
            "\1\73\3\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "",
            "",
            "",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "",
            "",
            "\1\101",
            "",
            "\0\103",
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
            "\1\104",
            "",
            "",
            "\1\106",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\115",
            "\1\116",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\121",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\123",
            "",
            "",
            "\1\124",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\126",
            "",
            "\1\127",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | RULE_ID | RULE_STRING | RULE_SL_COMMENT | RULE_WS );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA8_33 = input.LA(1);

                        s = -1;
                        if ( ((LA8_33>='\u0000' && LA8_33<='\uFFFF')) ) {s = 67;}

                        else s = 66;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 8, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}