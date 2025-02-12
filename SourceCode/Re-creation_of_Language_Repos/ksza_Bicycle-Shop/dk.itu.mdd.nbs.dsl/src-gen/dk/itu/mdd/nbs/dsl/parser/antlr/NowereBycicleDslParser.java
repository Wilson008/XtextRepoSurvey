/*
 * generated by Xtext 2.35.0
 */
package dk.itu.mdd.nbs.dsl.parser.antlr;

import com.google.inject.Inject;
import dk.itu.mdd.nbs.dsl.parser.antlr.internal.InternalNowereBycicleDslParser;
import dk.itu.mdd.nbs.dsl.services.NowereBycicleDslGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class NowereBycicleDslParser extends AbstractAntlrParser {

	@Inject
	private NowereBycicleDslGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalNowereBycicleDslParser createParser(XtextTokenStream stream) {
		return new InternalNowereBycicleDslParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Bicycle";
	}

	public NowereBycicleDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(NowereBycicleDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
