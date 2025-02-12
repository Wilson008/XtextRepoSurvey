/*
 * generated by Xtext 2.35.0
 */
package dk.itu.mdd.nowheretravel.dsl.formatting2

import com.google.inject.Inject
import dk.itu.mdd.nowheretravel.dsl.services.NowhereTravelDslGrammarAccess
import nowheretravel.Data
import nowheretravel.Travel
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class NowhereTravelDslFormatter extends AbstractFormatter2 {
	
	@Inject extension NowhereTravelDslGrammarAccess

	def dispatch void format(Travel travel, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		travel.start.format
		for (item : travel.items) {
			item.format
		}
		for (data : travel.data) {
			data.format
		}
		for (connection : travel.connections) {
			connection.format
		}
		travel.end.format
	}

	def dispatch void format(Data data, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (parameter : data.parameters) {
			parameter.format
		}
	}
	
}
