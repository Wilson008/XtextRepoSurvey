package es.unex.quercusseg.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGraphqlXtextLexer extends Lexer {
    public static final int RULE_NAME=4;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=14;
    public static final int T__19=19;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int RULE_NULLVALUE=8;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=12;
    public static final int RULE_COMMA=9;
    public static final int RULE_WS=15;
    public static final int RULE_DIGIT=5;
    public static final int RULE_COMMENT=10;
    public static final int RULE_ANY_OTHER=16;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=11;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=13;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_BOOLEANVALUE=7;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalGraphqlXtextLexer() {;} 
    public InternalGraphqlXtextLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalGraphqlXtextLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalGraphqlXtext.g"; }

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGraphqlXtext.g:11:7: ( 'query' )
            // InternalGraphqlXtext.g:11:9: 'query'
            {
            match("query"); 


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
            // InternalGraphqlXtext.g:12:7: ( 'mutation' )
            // InternalGraphqlXtext.g:12:9: 'mutation'
            {
            match("mutation"); 


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
            // InternalGraphqlXtext.g:13:7: ( '(' )
            // InternalGraphqlXtext.g:13:9: '('
            {
            match('('); 

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
            // InternalGraphqlXtext.g:14:7: ( ')' )
            // InternalGraphqlXtext.g:14:9: ')'
            {
            match(')'); 

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
            // InternalGraphqlXtext.g:15:7: ( '{' )
            // InternalGraphqlXtext.g:15:9: '{'
            {
            match('{'); 

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
            // InternalGraphqlXtext.g:16:7: ( '}' )
            // InternalGraphqlXtext.g:16:9: '}'
            {
            match('}'); 

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
            // InternalGraphqlXtext.g:17:7: ( ':' )
            // InternalGraphqlXtext.g:17:9: ':'
            {
            match(':'); 

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
            // InternalGraphqlXtext.g:18:7: ( '...' )
            // InternalGraphqlXtext.g:18:9: '...'
            {
            match("..."); 


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
            // InternalGraphqlXtext.g:19:7: ( 'fragment' )
            // InternalGraphqlXtext.g:19:9: 'fragment'
            {
            match("fragment"); 


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
            // InternalGraphqlXtext.g:20:7: ( 'on' )
            // InternalGraphqlXtext.g:20:9: 'on'
            {
            match("on"); 


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
            // InternalGraphqlXtext.g:21:7: ( '[' )
            // InternalGraphqlXtext.g:21:9: '['
            {
            match('['); 

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
            // InternalGraphqlXtext.g:22:7: ( ']' )
            // InternalGraphqlXtext.g:22:9: ']'
            {
            match(']'); 

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
            // InternalGraphqlXtext.g:23:7: ( '$' )
            // InternalGraphqlXtext.g:23:9: '$'
            {
            match('$'); 

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
            // InternalGraphqlXtext.g:24:7: ( '=' )
            // InternalGraphqlXtext.g:24:9: '='
            {
            match('='); 

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
            // InternalGraphqlXtext.g:25:7: ( '@' )
            // InternalGraphqlXtext.g:25:9: '@'
            {
            match('@'); 

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
            // InternalGraphqlXtext.g:26:7: ( '!' )
            // InternalGraphqlXtext.g:26:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "RULE_COMMA"
    public final void mRULE_COMMA() throws RecognitionException {
        try {
            int _type = RULE_COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGraphqlXtext.g:3684:12: ( ',' )
            // InternalGraphqlXtext.g:3684:14: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMMA"

    // $ANTLR start "RULE_COMMENT"
    public final void mRULE_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGraphqlXtext.g:3686:14: ( '#' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalGraphqlXtext.g:3686:16: '#' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match('#'); 
            // InternalGraphqlXtext.g:3686:20: (~ ( ( '\\n' | '\\r' ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='\t')||(LA1_0>='\u000B' && LA1_0<='\f')||(LA1_0>='\u000E' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGraphqlXtext.g:3686:20: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop1;
                }
            } while (true);

            // InternalGraphqlXtext.g:3686:36: ( ( '\\r' )? '\\n' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\n'||LA3_0=='\r') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalGraphqlXtext.g:3686:37: ( '\\r' )? '\\n'
                    {
                    // InternalGraphqlXtext.g:3686:37: ( '\\r' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0=='\r') ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // InternalGraphqlXtext.g:3686:37: '\\r'
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
    // $ANTLR end "RULE_COMMENT"

    // $ANTLR start "RULE_BOOLEANVALUE"
    public final void mRULE_BOOLEANVALUE() throws RecognitionException {
        try {
            int _type = RULE_BOOLEANVALUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGraphqlXtext.g:3688:19: ( ( 'true' | 'false' ) )
            // InternalGraphqlXtext.g:3688:21: ( 'true' | 'false' )
            {
            // InternalGraphqlXtext.g:3688:21: ( 'true' | 'false' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='t') ) {
                alt4=1;
            }
            else if ( (LA4_0=='f') ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalGraphqlXtext.g:3688:22: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalGraphqlXtext.g:3688:29: 'false'
                    {
                    match("false"); 


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
    // $ANTLR end "RULE_BOOLEANVALUE"

    // $ANTLR start "RULE_NULLVALUE"
    public final void mRULE_NULLVALUE() throws RecognitionException {
        try {
            int _type = RULE_NULLVALUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGraphqlXtext.g:3690:16: ( 'null' )
            // InternalGraphqlXtext.g:3690:18: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NULLVALUE"

    // $ANTLR start "RULE_DIGIT"
    public final void mRULE_DIGIT() throws RecognitionException {
        try {
            int _type = RULE_DIGIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGraphqlXtext.g:3692:12: ( '0' .. '9' )
            // InternalGraphqlXtext.g:3692:14: '0' .. '9'
            {
            matchRange('0','9'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIGIT"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGraphqlXtext.g:3694:10: ( ( RULE_DIGIT )+ )
            // InternalGraphqlXtext.g:3694:12: ( RULE_DIGIT )+
            {
            // InternalGraphqlXtext.g:3694:12: ( RULE_DIGIT )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalGraphqlXtext.g:3694:12: RULE_DIGIT
            	    {
            	    mRULE_DIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_NAME"
    public final void mRULE_NAME() throws RecognitionException {
        try {
            int _type = RULE_NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGraphqlXtext.g:3696:11: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalGraphqlXtext.g:3696:13: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalGraphqlXtext.g:3696:37: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalGraphqlXtext.g:
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
            	    break loop6;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NAME"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGraphqlXtext.g:3698:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalGraphqlXtext.g:3698:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalGraphqlXtext.g:3698:11: ( '^' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='^') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalGraphqlXtext.g:3698:11: '^'
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

            // InternalGraphqlXtext.g:3698:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')||(LA8_0>='A' && LA8_0<='Z')||LA8_0=='_'||(LA8_0>='a' && LA8_0<='z')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalGraphqlXtext.g:
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
            	    break loop8;
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
            // InternalGraphqlXtext.g:3700:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalGraphqlXtext.g:3700:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalGraphqlXtext.g:3700:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\"') ) {
                alt11=1;
            }
            else if ( (LA11_0=='\'') ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalGraphqlXtext.g:3700:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalGraphqlXtext.g:3700:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop9:
                    do {
                        int alt9=3;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='\\') ) {
                            alt9=1;
                        }
                        else if ( ((LA9_0>='\u0000' && LA9_0<='!')||(LA9_0>='#' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='\uFFFF')) ) {
                            alt9=2;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalGraphqlXtext.g:3700:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalGraphqlXtext.g:3700:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop9;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalGraphqlXtext.g:3700:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalGraphqlXtext.g:3700:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop10:
                    do {
                        int alt10=3;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0=='\\') ) {
                            alt10=1;
                        }
                        else if ( ((LA10_0>='\u0000' && LA10_0<='&')||(LA10_0>='(' && LA10_0<='[')||(LA10_0>=']' && LA10_0<='\uFFFF')) ) {
                            alt10=2;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalGraphqlXtext.g:3700:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalGraphqlXtext.g:3700:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    match('\''); 

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
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGraphqlXtext.g:3702:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalGraphqlXtext.g:3702:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalGraphqlXtext.g:3702:24: ( options {greedy=false; } : . )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0=='*') ) {
                    int LA12_1 = input.LA(2);

                    if ( (LA12_1=='/') ) {
                        alt12=2;
                    }
                    else if ( ((LA12_1>='\u0000' && LA12_1<='.')||(LA12_1>='0' && LA12_1<='\uFFFF')) ) {
                        alt12=1;
                    }


                }
                else if ( ((LA12_0>='\u0000' && LA12_0<=')')||(LA12_0>='+' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalGraphqlXtext.g:3702:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGraphqlXtext.g:3704:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalGraphqlXtext.g:3704:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalGraphqlXtext.g:3704:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\u0000' && LA13_0<='\t')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalGraphqlXtext.g:3704:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop13;
                }
            } while (true);

            // InternalGraphqlXtext.g:3704:40: ( ( '\\r' )? '\\n' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\n'||LA15_0=='\r') ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalGraphqlXtext.g:3704:41: ( '\\r' )? '\\n'
                    {
                    // InternalGraphqlXtext.g:3704:41: ( '\\r' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='\r') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalGraphqlXtext.g:3704:41: '\\r'
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
            // InternalGraphqlXtext.g:3706:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalGraphqlXtext.g:3706:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalGraphqlXtext.g:3706:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='\t' && LA16_0<='\n')||LA16_0=='\r'||LA16_0==' ') ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalGraphqlXtext.g:
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
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGraphqlXtext.g:3708:16: ( . )
            // InternalGraphqlXtext.g:3708:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalGraphqlXtext.g:1:8: ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | RULE_COMMA | RULE_COMMENT | RULE_BOOLEANVALUE | RULE_NULLVALUE | RULE_DIGIT | RULE_INT | RULE_NAME | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt17=29;
        alt17 = dfa17.predict(input);
        switch (alt17) {
            case 1 :
                // InternalGraphqlXtext.g:1:10: T__17
                {
                mT__17(); 

                }
                break;
            case 2 :
                // InternalGraphqlXtext.g:1:16: T__18
                {
                mT__18(); 

                }
                break;
            case 3 :
                // InternalGraphqlXtext.g:1:22: T__19
                {
                mT__19(); 

                }
                break;
            case 4 :
                // InternalGraphqlXtext.g:1:28: T__20
                {
                mT__20(); 

                }
                break;
            case 5 :
                // InternalGraphqlXtext.g:1:34: T__21
                {
                mT__21(); 

                }
                break;
            case 6 :
                // InternalGraphqlXtext.g:1:40: T__22
                {
                mT__22(); 

                }
                break;
            case 7 :
                // InternalGraphqlXtext.g:1:46: T__23
                {
                mT__23(); 

                }
                break;
            case 8 :
                // InternalGraphqlXtext.g:1:52: T__24
                {
                mT__24(); 

                }
                break;
            case 9 :
                // InternalGraphqlXtext.g:1:58: T__25
                {
                mT__25(); 

                }
                break;
            case 10 :
                // InternalGraphqlXtext.g:1:64: T__26
                {
                mT__26(); 

                }
                break;
            case 11 :
                // InternalGraphqlXtext.g:1:70: T__27
                {
                mT__27(); 

                }
                break;
            case 12 :
                // InternalGraphqlXtext.g:1:76: T__28
                {
                mT__28(); 

                }
                break;
            case 13 :
                // InternalGraphqlXtext.g:1:82: T__29
                {
                mT__29(); 

                }
                break;
            case 14 :
                // InternalGraphqlXtext.g:1:88: T__30
                {
                mT__30(); 

                }
                break;
            case 15 :
                // InternalGraphqlXtext.g:1:94: T__31
                {
                mT__31(); 

                }
                break;
            case 16 :
                // InternalGraphqlXtext.g:1:100: T__32
                {
                mT__32(); 

                }
                break;
            case 17 :
                // InternalGraphqlXtext.g:1:106: RULE_COMMA
                {
                mRULE_COMMA(); 

                }
                break;
            case 18 :
                // InternalGraphqlXtext.g:1:117: RULE_COMMENT
                {
                mRULE_COMMENT(); 

                }
                break;
            case 19 :
                // InternalGraphqlXtext.g:1:130: RULE_BOOLEANVALUE
                {
                mRULE_BOOLEANVALUE(); 

                }
                break;
            case 20 :
                // InternalGraphqlXtext.g:1:148: RULE_NULLVALUE
                {
                mRULE_NULLVALUE(); 

                }
                break;
            case 21 :
                // InternalGraphqlXtext.g:1:163: RULE_DIGIT
                {
                mRULE_DIGIT(); 

                }
                break;
            case 22 :
                // InternalGraphqlXtext.g:1:174: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 23 :
                // InternalGraphqlXtext.g:1:183: RULE_NAME
                {
                mRULE_NAME(); 

                }
                break;
            case 24 :
                // InternalGraphqlXtext.g:1:193: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 25 :
                // InternalGraphqlXtext.g:1:201: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 26 :
                // InternalGraphqlXtext.g:1:213: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 27 :
                // InternalGraphqlXtext.g:1:229: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 28 :
                // InternalGraphqlXtext.g:1:245: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 29 :
                // InternalGraphqlXtext.g:1:253: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA17_eotS =
        "\1\uffff\2\37\5\uffff\1\34\2\37\10\uffff\2\37\1\64\1\37\4\34\2\uffff\2\37\1\uffff\1\37\6\uffff\2\37\1\77\10\uffff\2\37\7\uffff\4\37\1\uffff\6\37\1\114\1\115\1\116\2\37\1\114\3\uffff\4\37\1\125\1\126\2\uffff";
    static final String DFA17_eofS =
        "\127\uffff";
    static final String DFA17_minS =
        "\1\0\2\60\5\uffff\1\56\2\60\10\uffff\4\60\1\101\2\0\1\52\2\uffff\2\60\1\uffff\1\60\6\uffff\3\60\10\uffff\2\60\7\uffff\4\60\1\uffff\14\60\3\uffff\6\60\2\uffff";
    static final String DFA17_maxS =
        "\1\uffff\2\172\5\uffff\1\56\2\172\10\uffff\2\172\1\71\2\172\2\uffff\1\57\2\uffff\2\172\1\uffff\1\172\6\uffff\3\172\10\uffff\2\172\7\uffff\4\172\1\uffff\14\172\3\uffff\6\172\2\uffff";
    static final String DFA17_acceptS =
        "\3\uffff\1\3\1\4\1\5\1\6\1\7\3\uffff\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\10\uffff\1\34\1\35\2\uffff\1\27\1\uffff\1\3\1\4\1\5\1\6\1\7\1\10\3\uffff\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\2\uffff\1\25\1\26\1\30\1\31\1\32\1\33\1\34\4\uffff\1\12\14\uffff\1\23\1\24\1\1\6\uffff\1\2\1\11";
    static final String DFA17_specialS =
        "\1\1\27\uffff\1\0\1\2\75\uffff}>";
    static final String[] DFA17_transitionS = {
            "\11\34\2\33\2\34\1\33\22\34\1\33\1\20\1\30\1\22\1\15\2\34\1\31\1\3\1\4\2\34\1\21\1\34\1\10\1\32\12\25\1\7\2\34\1\16\2\34\1\17\32\26\1\13\1\34\1\14\1\27\1\26\1\34\5\26\1\11\6\26\1\2\1\24\1\12\1\26\1\1\2\26\1\23\6\26\1\5\1\34\1\6\uff82\34",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\24\36\1\35\5\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\24\36\1\40\5\36",
            "",
            "",
            "",
            "",
            "",
            "\1\46",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\1\50\20\36\1\47\10\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\15\36\1\51\14\36",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\21\36\1\62\10\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\24\36\1\63\5\36",
            "\12\65",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\32\66\4\uffff\1\66\1\uffff\32\66",
            "\0\67",
            "\0\67",
            "\1\70\4\uffff\1\71",
            "",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\4\36\1\73\25\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\23\36\1\74\6\36",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\1\75\31\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\13\36\1\76\16\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\24\36\1\100\5\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\13\36\1\101\16\36",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\21\36\1\102\10\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\1\103\31\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\6\36\1\104\23\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\22\36\1\105\7\36",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\4\36\1\106\25\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\13\36\1\107\16\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\30\36\1\110\1\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\23\36\1\111\6\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\14\36\1\112\15\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\4\36\1\113\25\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\10\36\1\117\21\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\4\36\1\120\25\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\16\36\1\121\13\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\15\36\1\122\14\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\15\36\1\123\14\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\23\36\1\124\6\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            ""
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | RULE_COMMA | RULE_COMMENT | RULE_BOOLEANVALUE | RULE_NULLVALUE | RULE_DIGIT | RULE_INT | RULE_NAME | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_24 = input.LA(1);

                        s = -1;
                        if ( ((LA17_24>='\u0000' && LA17_24<='\uFFFF')) ) {s = 55;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA17_0 = input.LA(1);

                        s = -1;
                        if ( (LA17_0=='q') ) {s = 1;}

                        else if ( (LA17_0=='m') ) {s = 2;}

                        else if ( (LA17_0=='(') ) {s = 3;}

                        else if ( (LA17_0==')') ) {s = 4;}

                        else if ( (LA17_0=='{') ) {s = 5;}

                        else if ( (LA17_0=='}') ) {s = 6;}

                        else if ( (LA17_0==':') ) {s = 7;}

                        else if ( (LA17_0=='.') ) {s = 8;}

                        else if ( (LA17_0=='f') ) {s = 9;}

                        else if ( (LA17_0=='o') ) {s = 10;}

                        else if ( (LA17_0=='[') ) {s = 11;}

                        else if ( (LA17_0==']') ) {s = 12;}

                        else if ( (LA17_0=='$') ) {s = 13;}

                        else if ( (LA17_0=='=') ) {s = 14;}

                        else if ( (LA17_0=='@') ) {s = 15;}

                        else if ( (LA17_0=='!') ) {s = 16;}

                        else if ( (LA17_0==',') ) {s = 17;}

                        else if ( (LA17_0=='#') ) {s = 18;}

                        else if ( (LA17_0=='t') ) {s = 19;}

                        else if ( (LA17_0=='n') ) {s = 20;}

                        else if ( ((LA17_0>='0' && LA17_0<='9')) ) {s = 21;}

                        else if ( ((LA17_0>='A' && LA17_0<='Z')||LA17_0=='_'||(LA17_0>='a' && LA17_0<='e')||(LA17_0>='g' && LA17_0<='l')||LA17_0=='p'||(LA17_0>='r' && LA17_0<='s')||(LA17_0>='u' && LA17_0<='z')) ) {s = 22;}

                        else if ( (LA17_0=='^') ) {s = 23;}

                        else if ( (LA17_0=='\"') ) {s = 24;}

                        else if ( (LA17_0=='\'') ) {s = 25;}

                        else if ( (LA17_0=='/') ) {s = 26;}

                        else if ( ((LA17_0>='\t' && LA17_0<='\n')||LA17_0=='\r'||LA17_0==' ') ) {s = 27;}

                        else if ( ((LA17_0>='\u0000' && LA17_0<='\b')||(LA17_0>='\u000B' && LA17_0<='\f')||(LA17_0>='\u000E' && LA17_0<='\u001F')||(LA17_0>='%' && LA17_0<='&')||(LA17_0>='*' && LA17_0<='+')||LA17_0=='-'||(LA17_0>=';' && LA17_0<='<')||(LA17_0>='>' && LA17_0<='?')||LA17_0=='\\'||LA17_0=='`'||LA17_0=='|'||(LA17_0>='~' && LA17_0<='\uFFFF')) ) {s = 28;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA17_25 = input.LA(1);

                        s = -1;
                        if ( ((LA17_25>='\u0000' && LA17_25<='\uFFFF')) ) {s = 55;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 17, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}