/*
 * generated by Xtext 2.35.0
 */
package dk.itu.mdd.nbs.dsl.tests

import com.google.inject.Inject
import dk.itu.mdd.nbs.dsl.nowhereBycicleDsl.Bicycle
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith

@ExtendWith(InjectionExtension)
@InjectWith(NowereBycicleDslInjectorProvider)
class NowereBycicleDslParsingTest {
	@Inject
	ParseHelper<Bicycle> parseHelper
	
	@Test
	def void loadModel() {
		val result = parseHelper.parse('''
			Hello Xtext!
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}
}
