package ch.vobos.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTypescriptLexer extends Lexer {
    public static final int RULE_DOC_COMMENT_END=6;
    public static final int RULE_STRING=10;
    public static final int RULE_DOC_COMMENT_LINE=5;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int RULE_DOC_ANNOTATION_PREFIX=7;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=9;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalTypescriptLexer() {;} 
    public InternalTypescriptLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalTypescriptLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalTypescript.g"; }

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTypescript.g:11:7: ( 'import' )
            // InternalTypescript.g:11:9: 'import'
            {
            match("import"); 


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
            // InternalTypescript.g:12:7: ( '=' )
            // InternalTypescript.g:12:9: '='
            {
            match('='); 

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
            // InternalTypescript.g:13:7: ( 'module' )
            // InternalTypescript.g:13:9: 'module'
            {
            match("module"); 


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
            // InternalTypescript.g:14:7: ( '.' )
            // InternalTypescript.g:14:9: '.'
            {
            match('.'); 

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
            // InternalTypescript.g:15:7: ( '{' )
            // InternalTypescript.g:15:9: '{'
            {
            match('{'); 

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
            // InternalTypescript.g:16:7: ( '}' )
            // InternalTypescript.g:16:9: '}'
            {
            match('}'); 

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
            // InternalTypescript.g:17:7: ( 'export' )
            // InternalTypescript.g:17:9: 'export'
            {
            match("export"); 


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
            // InternalTypescript.g:18:7: ( ';' )
            // InternalTypescript.g:18:9: ';'
            {
            match(';'); 

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
            // InternalTypescript.g:19:7: ( 'interface' )
            // InternalTypescript.g:19:9: 'interface'
            {
            match("interface"); 


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
            // InternalTypescript.g:20:7: ( 'class' )
            // InternalTypescript.g:20:9: 'class'
            {
            match("class"); 


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
            // InternalTypescript.g:21:7: ( 'extends' )
            // InternalTypescript.g:21:9: 'extends'
            {
            match("extends"); 


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
            // InternalTypescript.g:22:7: ( ',' )
            // InternalTypescript.g:22:9: ','
            {
            match(','); 

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
            // InternalTypescript.g:23:7: ( '?' )
            // InternalTypescript.g:23:9: '?'
            {
            match('?'); 

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
            // InternalTypescript.g:24:7: ( ':' )
            // InternalTypescript.g:24:9: ':'
            {
            match(':'); 

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
            // InternalTypescript.g:25:7: ( '[' )
            // InternalTypescript.g:25:9: '['
            {
            match('['); 

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
            // InternalTypescript.g:26:7: ( ']' )
            // InternalTypescript.g:26:9: ']'
            {
            match(']'); 

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
            // InternalTypescript.g:27:7: ( '/**' )
            // InternalTypescript.g:27:9: '/**'
            {
            match("/**"); 


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
            // InternalTypescript.g:28:7: ( 'any' )
            // InternalTypescript.g:28:9: 'any'
            {
            match("any"); 


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
            // InternalTypescript.g:29:7: ( 'number' )
            // InternalTypescript.g:29:9: 'number'
            {
            match("number"); 


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
            // InternalTypescript.g:30:7: ( 'boolean' )
            // InternalTypescript.g:30:9: 'boolean'
            {
            match("boolean"); 


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
            // InternalTypescript.g:31:7: ( 'string' )
            // InternalTypescript.g:31:9: 'string'
            {
            match("string"); 


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
            // InternalTypescript.g:32:7: ( 'void' )
            // InternalTypescript.g:32:9: 'void'
            {
            match("void"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "RULE_DOC_COMMENT_END"
    public final void mRULE_DOC_COMMENT_END() throws RecognitionException {
        try {
            int _type = RULE_DOC_COMMENT_END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTypescript.g:1595:22: ( ( ' ' | '\\t' )* '*' '/' )
            // InternalTypescript.g:1595:24: ( ' ' | '\\t' )* '*' '/'
            {
            // InternalTypescript.g:1595:24: ( ' ' | '\\t' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='\t'||LA1_0==' ') ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTypescript.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
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

            match('*'); 
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOC_COMMENT_END"

    // $ANTLR start "RULE_DOC_ANNOTATION_PREFIX"
    public final void mRULE_DOC_ANNOTATION_PREFIX() throws RecognitionException {
        try {
            int _type = RULE_DOC_ANNOTATION_PREFIX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTypescript.g:1597:28: ( ( ' ' | '\\t' )* '* @' )
            // InternalTypescript.g:1597:30: ( ' ' | '\\t' )* '* @'
            {
            // InternalTypescript.g:1597:30: ( ' ' | '\\t' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='\t'||LA2_0==' ') ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalTypescript.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
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

            match("* @"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOC_ANNOTATION_PREFIX"

    // $ANTLR start "RULE_DOC_COMMENT_LINE"
    public final void mRULE_DOC_COMMENT_LINE() throws RecognitionException {
        try {
            int _type = RULE_DOC_COMMENT_LINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTypescript.g:1599:23: ( ( ' ' | '\\t' )* '*' ~ ( '/' ) ~ ( '@' ) ( options {greedy=false; } : . )* ( '\\r' )? '\\n' )
            // InternalTypescript.g:1599:25: ( ' ' | '\\t' )* '*' ~ ( '/' ) ~ ( '@' ) ( options {greedy=false; } : . )* ( '\\r' )? '\\n'
            {
            // InternalTypescript.g:1599:25: ( ' ' | '\\t' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\t'||LA3_0==' ') ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalTypescript.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
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

            match('*'); 
            if ( (input.LA(1)>='\u0000' && input.LA(1)<='.')||(input.LA(1)>='0' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( (input.LA(1)>='\u0000' && input.LA(1)<='?')||(input.LA(1)>='A' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalTypescript.g:1599:55: ( options {greedy=false; } : . )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='\r') ) {
                    alt4=2;
                }
                else if ( (LA4_0=='\n') ) {
                    alt4=2;
                }
                else if ( ((LA4_0>='\u0000' && LA4_0<='\t')||(LA4_0>='\u000B' && LA4_0<='\f')||(LA4_0>='\u000E' && LA4_0<='\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalTypescript.g:1599:83: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalTypescript.g:1599:87: ( '\\r' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='\r') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalTypescript.g:1599:87: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOC_COMMENT_LINE"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTypescript.g:1601:17: ( '/*' ~ ( '*' ) ( options {greedy=false; } : . )* '*/' )
            // InternalTypescript.g:1601:19: '/*' ~ ( '*' ) ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            if ( (input.LA(1)>='\u0000' && input.LA(1)<=')')||(input.LA(1)>='+' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalTypescript.g:1601:31: ( options {greedy=false; } : . )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='*') ) {
                    int LA6_1 = input.LA(2);

                    if ( (LA6_1=='/') ) {
                        alt6=2;
                    }
                    else if ( ((LA6_1>='\u0000' && LA6_1<='.')||(LA6_1>='0' && LA6_1<='\uFFFF')) ) {
                        alt6=1;
                    }


                }
                else if ( ((LA6_0>='\u0000' && LA6_0<=')')||(LA6_0>='+' && LA6_0<='\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalTypescript.g:1601:59: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop6;
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

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTypescript.g:1603:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalTypescript.g:1603:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalTypescript.g:1603:11: ( '^' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='^') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalTypescript.g:1603:11: '^'
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

            // InternalTypescript.g:1603:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')||(LA8_0>='A' && LA8_0<='Z')||LA8_0=='_'||(LA8_0>='a' && LA8_0<='z')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalTypescript.g:
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

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTypescript.g:1605:10: ( ( '0' .. '9' )+ )
            // InternalTypescript.g:1605:12: ( '0' .. '9' )+
            {
            // InternalTypescript.g:1605:12: ( '0' .. '9' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalTypescript.g:1605:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTypescript.g:1607:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalTypescript.g:1607:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalTypescript.g:1607:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\"') ) {
                alt12=1;
            }
            else if ( (LA12_0=='\'') ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalTypescript.g:1607:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalTypescript.g:1607:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop10:
                    do {
                        int alt10=3;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0=='\\') ) {
                            alt10=1;
                        }
                        else if ( ((LA10_0>='\u0000' && LA10_0<='!')||(LA10_0>='#' && LA10_0<='[')||(LA10_0>=']' && LA10_0<='\uFFFF')) ) {
                            alt10=2;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalTypescript.g:1607:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalTypescript.g:1607:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop10;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalTypescript.g:1607:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalTypescript.g:1607:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop11:
                    do {
                        int alt11=3;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0=='\\') ) {
                            alt11=1;
                        }
                        else if ( ((LA11_0>='\u0000' && LA11_0<='&')||(LA11_0>='(' && LA11_0<='[')||(LA11_0>=']' && LA11_0<='\uFFFF')) ) {
                            alt11=2;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalTypescript.g:1607:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalTypescript.g:1607:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop11;
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

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTypescript.g:1609:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalTypescript.g:1609:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalTypescript.g:1609:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\u0000' && LA13_0<='\t')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalTypescript.g:1609:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalTypescript.g:1609:40: ( ( '\\r' )? '\\n' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\n'||LA15_0=='\r') ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalTypescript.g:1609:41: ( '\\r' )? '\\n'
                    {
                    // InternalTypescript.g:1609:41: ( '\\r' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='\r') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalTypescript.g:1609:41: '\\r'
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
            // InternalTypescript.g:1611:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalTypescript.g:1611:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalTypescript.g:1611:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // InternalTypescript.g:
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
            // InternalTypescript.g:1613:16: ( . )
            // InternalTypescript.g:1613:18: .
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
        // InternalTypescript.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | RULE_DOC_COMMENT_END | RULE_DOC_ANNOTATION_PREFIX | RULE_DOC_COMMENT_LINE | RULE_ML_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt17=32;
        alt17 = dfa17.predict(input);
        switch (alt17) {
            case 1 :
                // InternalTypescript.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // InternalTypescript.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // InternalTypescript.g:1:22: T__16
                {
                mT__16(); 

                }
                break;
            case 4 :
                // InternalTypescript.g:1:28: T__17
                {
                mT__17(); 

                }
                break;
            case 5 :
                // InternalTypescript.g:1:34: T__18
                {
                mT__18(); 

                }
                break;
            case 6 :
                // InternalTypescript.g:1:40: T__19
                {
                mT__19(); 

                }
                break;
            case 7 :
                // InternalTypescript.g:1:46: T__20
                {
                mT__20(); 

                }
                break;
            case 8 :
                // InternalTypescript.g:1:52: T__21
                {
                mT__21(); 

                }
                break;
            case 9 :
                // InternalTypescript.g:1:58: T__22
                {
                mT__22(); 

                }
                break;
            case 10 :
                // InternalTypescript.g:1:64: T__23
                {
                mT__23(); 

                }
                break;
            case 11 :
                // InternalTypescript.g:1:70: T__24
                {
                mT__24(); 

                }
                break;
            case 12 :
                // InternalTypescript.g:1:76: T__25
                {
                mT__25(); 

                }
                break;
            case 13 :
                // InternalTypescript.g:1:82: T__26
                {
                mT__26(); 

                }
                break;
            case 14 :
                // InternalTypescript.g:1:88: T__27
                {
                mT__27(); 

                }
                break;
            case 15 :
                // InternalTypescript.g:1:94: T__28
                {
                mT__28(); 

                }
                break;
            case 16 :
                // InternalTypescript.g:1:100: T__29
                {
                mT__29(); 

                }
                break;
            case 17 :
                // InternalTypescript.g:1:106: T__30
                {
                mT__30(); 

                }
                break;
            case 18 :
                // InternalTypescript.g:1:112: T__31
                {
                mT__31(); 

                }
                break;
            case 19 :
                // InternalTypescript.g:1:118: T__32
                {
                mT__32(); 

                }
                break;
            case 20 :
                // InternalTypescript.g:1:124: T__33
                {
                mT__33(); 

                }
                break;
            case 21 :
                // InternalTypescript.g:1:130: T__34
                {
                mT__34(); 

                }
                break;
            case 22 :
                // InternalTypescript.g:1:136: T__35
                {
                mT__35(); 

                }
                break;
            case 23 :
                // InternalTypescript.g:1:142: RULE_DOC_COMMENT_END
                {
                mRULE_DOC_COMMENT_END(); 

                }
                break;
            case 24 :
                // InternalTypescript.g:1:163: RULE_DOC_ANNOTATION_PREFIX
                {
                mRULE_DOC_ANNOTATION_PREFIX(); 

                }
                break;
            case 25 :
                // InternalTypescript.g:1:190: RULE_DOC_COMMENT_LINE
                {
                mRULE_DOC_COMMENT_LINE(); 

                }
                break;
            case 26 :
                // InternalTypescript.g:1:212: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 27 :
                // InternalTypescript.g:1:228: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 28 :
                // InternalTypescript.g:1:236: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 29 :
                // InternalTypescript.g:1:245: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 30 :
                // InternalTypescript.g:1:257: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 31 :
                // InternalTypescript.g:1:273: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 32 :
                // InternalTypescript.g:1:281: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA17_eotS =
        "\1\uffff\1\40\1\uffff\1\40\3\uffff\1\40\1\uffff\1\40\5\uffff\1\35\5\40\1\67\2\35\2\uffff\2\35\2\uffff\2\40\2\uffff\1\40\3\uffff\1\40\1\uffff\1\40\7\uffff\5\40\1\uffff\1\67\6\uffff\6\40\2\uffff\1\121\4\40\1\uffff\6\40\1\uffff\3\40\1\137\5\40\1\145\3\40\1\uffff\1\151\1\40\1\153\1\154\1\40\1\uffff\1\156\1\40\1\160\1\uffff\1\40\2\uffff\1\162\1\uffff\1\163\1\uffff\1\40\2\uffff\1\165\1\uffff";
    static final String DFA17_eofS =
        "\166\uffff";
    static final String DFA17_minS =
        "\1\0\1\155\1\uffff\1\157\3\uffff\1\170\1\uffff\1\154\5\uffff\1\52\1\156\1\165\1\157\1\164\1\157\1\11\1\0\1\101\2\uffff\2\0\2\uffff\1\160\1\164\2\uffff\1\144\3\uffff\1\160\1\uffff\1\141\5\uffff\1\0\1\uffff\1\171\1\155\1\157\1\162\1\151\1\0\1\11\2\uffff\1\0\3\uffff\1\157\1\145\1\165\1\157\1\145\1\163\2\uffff\1\60\1\142\1\154\1\151\1\144\1\uffff\2\162\1\154\1\162\1\156\1\163\1\uffff\2\145\1\156\1\60\1\164\1\146\1\145\1\164\1\144\1\60\1\162\1\141\1\147\1\uffff\1\60\1\141\2\60\1\163\1\uffff\1\60\1\156\1\60\1\uffff\1\143\2\uffff\1\60\1\uffff\1\60\1\uffff\1\145\2\uffff\1\60\1\uffff";
    static final String DFA17_maxS =
        "\1\uffff\1\156\1\uffff\1\157\3\uffff\1\170\1\uffff\1\154\5\uffff\1\57\1\156\1\165\1\157\1\164\1\157\1\52\1\uffff\1\172\2\uffff\2\uffff\2\uffff\1\160\1\164\2\uffff\1\144\3\uffff\1\164\1\uffff\1\141\5\uffff\1\uffff\1\uffff\1\171\1\155\1\157\1\162\1\151\1\uffff\1\52\2\uffff\1\uffff\3\uffff\1\157\1\145\1\165\1\157\1\145\1\163\2\uffff\1\172\1\142\1\154\1\151\1\144\1\uffff\2\162\1\154\1\162\1\156\1\163\1\uffff\2\145\1\156\1\172\1\164\1\146\1\145\1\164\1\144\1\172\1\162\1\141\1\147\1\uffff\1\172\1\141\2\172\1\163\1\uffff\1\172\1\156\1\172\1\uffff\1\143\2\uffff\1\172\1\uffff\1\172\1\uffff\1\145\2\uffff\1\172\1\uffff";
    static final String DFA17_acceptS =
        "\2\uffff\1\2\1\uffff\1\4\1\5\1\6\1\uffff\1\10\1\uffff\1\14\1\15\1\16\1\17\1\20\11\uffff\1\33\1\34\2\uffff\1\37\1\40\2\uffff\1\33\1\2\1\uffff\1\4\1\5\1\6\1\uffff\1\10\1\uffff\1\14\1\15\1\16\1\17\1\20\1\uffff\1\36\7\uffff\1\37\1\27\1\uffff\1\31\1\34\1\35\6\uffff\1\21\1\32\5\uffff\1\30\6\uffff\1\22\15\uffff\1\26\5\uffff\1\12\3\uffff\1\1\1\uffff\1\3\1\7\1\uffff\1\23\1\uffff\1\25\1\uffff\1\13\1\24\1\uffff\1\11";
    static final String DFA17_specialS =
        "\1\1\25\uffff\1\2\3\uffff\1\3\1\0\22\uffff\1\4\6\uffff\1\5\3\uffff\1\6\74\uffff}>";
    static final String[] DFA17_transitionS = {
            "\11\35\1\25\1\34\2\35\1\34\22\35\1\25\1\35\1\32\4\35\1\33\2\35\1\26\1\35\1\12\1\35\1\4\1\17\12\31\1\14\1\10\1\35\1\2\1\35\1\13\1\35\32\30\1\15\1\35\1\16\1\27\1\30\1\35\1\20\1\22\1\11\1\30\1\7\3\30\1\1\3\30\1\3\1\21\4\30\1\23\2\30\1\24\4\30\1\5\1\35\1\6\uff82\35",
            "\1\36\1\37",
            "",
            "\1\42",
            "",
            "",
            "",
            "\1\46",
            "",
            "\1\50",
            "",
            "",
            "",
            "",
            "",
            "\1\56\4\uffff\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\66\26\uffff\1\66\11\uffff\1\65",
            "\40\72\1\71\16\72\1\70\uffd0\72",
            "\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "",
            "\0\74",
            "\0\74",
            "",
            "",
            "\1\75",
            "\1\76",
            "",
            "",
            "\1\77",
            "",
            "",
            "",
            "\1\100\3\uffff\1\101",
            "",
            "\1\102",
            "",
            "",
            "",
            "",
            "",
            "\52\104\1\103\uffd5\104",
            "",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\40\72\1\71\16\72\1\70\uffd0\72",
            "\1\66\26\uffff\1\66\11\uffff\1\65",
            "",
            "",
            "\100\72\1\112\uffbf\72",
            "",
            "",
            "",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "",
            "\1\134",
            "\1\135",
            "\1\136",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\146",
            "\1\147",
            "\1\150",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\152",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\155",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\157",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "\1\161",
            "",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "\1\164",
            "",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
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
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | RULE_DOC_COMMENT_END | RULE_DOC_ANNOTATION_PREFIX | RULE_DOC_COMMENT_LINE | RULE_ML_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_27 = input.LA(1);

                        s = -1;
                        if ( ((LA17_27>='\u0000' && LA17_27<='\uFFFF')) ) {s = 60;}

                        else s = 29;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA17_0 = input.LA(1);

                        s = -1;
                        if ( (LA17_0=='i') ) {s = 1;}

                        else if ( (LA17_0=='=') ) {s = 2;}

                        else if ( (LA17_0=='m') ) {s = 3;}

                        else if ( (LA17_0=='.') ) {s = 4;}

                        else if ( (LA17_0=='{') ) {s = 5;}

                        else if ( (LA17_0=='}') ) {s = 6;}

                        else if ( (LA17_0=='e') ) {s = 7;}

                        else if ( (LA17_0==';') ) {s = 8;}

                        else if ( (LA17_0=='c') ) {s = 9;}

                        else if ( (LA17_0==',') ) {s = 10;}

                        else if ( (LA17_0=='?') ) {s = 11;}

                        else if ( (LA17_0==':') ) {s = 12;}

                        else if ( (LA17_0=='[') ) {s = 13;}

                        else if ( (LA17_0==']') ) {s = 14;}

                        else if ( (LA17_0=='/') ) {s = 15;}

                        else if ( (LA17_0=='a') ) {s = 16;}

                        else if ( (LA17_0=='n') ) {s = 17;}

                        else if ( (LA17_0=='b') ) {s = 18;}

                        else if ( (LA17_0=='s') ) {s = 19;}

                        else if ( (LA17_0=='v') ) {s = 20;}

                        else if ( (LA17_0=='\t'||LA17_0==' ') ) {s = 21;}

                        else if ( (LA17_0=='*') ) {s = 22;}

                        else if ( (LA17_0=='^') ) {s = 23;}

                        else if ( ((LA17_0>='A' && LA17_0<='Z')||LA17_0=='_'||LA17_0=='d'||(LA17_0>='f' && LA17_0<='h')||(LA17_0>='j' && LA17_0<='l')||(LA17_0>='o' && LA17_0<='r')||(LA17_0>='t' && LA17_0<='u')||(LA17_0>='w' && LA17_0<='z')) ) {s = 24;}

                        else if ( ((LA17_0>='0' && LA17_0<='9')) ) {s = 25;}

                        else if ( (LA17_0=='\"') ) {s = 26;}

                        else if ( (LA17_0=='\'') ) {s = 27;}

                        else if ( (LA17_0=='\n'||LA17_0=='\r') ) {s = 28;}

                        else if ( ((LA17_0>='\u0000' && LA17_0<='\b')||(LA17_0>='\u000B' && LA17_0<='\f')||(LA17_0>='\u000E' && LA17_0<='\u001F')||LA17_0=='!'||(LA17_0>='#' && LA17_0<='&')||(LA17_0>='(' && LA17_0<=')')||LA17_0=='+'||LA17_0=='-'||LA17_0=='<'||LA17_0=='>'||LA17_0=='@'||LA17_0=='\\'||LA17_0=='`'||LA17_0=='|'||(LA17_0>='~' && LA17_0<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA17_22 = input.LA(1);

                        s = -1;
                        if ( (LA17_22=='/') ) {s = 56;}

                        else if ( (LA17_22==' ') ) {s = 57;}

                        else if ( ((LA17_22>='\u0000' && LA17_22<='\u001F')||(LA17_22>='!' && LA17_22<='.')||(LA17_22>='0' && LA17_22<='\uFFFF')) ) {s = 58;}

                        else s = 29;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA17_26 = input.LA(1);

                        s = -1;
                        if ( ((LA17_26>='\u0000' && LA17_26<='\uFFFF')) ) {s = 60;}

                        else s = 29;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA17_46 = input.LA(1);

                        s = -1;
                        if ( (LA17_46=='*') ) {s = 67;}

                        else if ( ((LA17_46>='\u0000' && LA17_46<=')')||(LA17_46>='+' && LA17_46<='\uFFFF')) ) {s = 68;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA17_53 = input.LA(1);

                        s = -1;
                        if ( (LA17_53==' ') ) {s = 57;}

                        else if ( (LA17_53=='/') ) {s = 56;}

                        else if ( ((LA17_53>='\u0000' && LA17_53<='\u001F')||(LA17_53>='!' && LA17_53<='.')||(LA17_53>='0' && LA17_53<='\uFFFF')) ) {s = 58;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA17_57 = input.LA(1);

                        s = -1;
                        if ( (LA17_57=='@') ) {s = 74;}

                        else if ( ((LA17_57>='\u0000' && LA17_57<='?')||(LA17_57>='A' && LA17_57<='\uFFFF')) ) {s = 58;}

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