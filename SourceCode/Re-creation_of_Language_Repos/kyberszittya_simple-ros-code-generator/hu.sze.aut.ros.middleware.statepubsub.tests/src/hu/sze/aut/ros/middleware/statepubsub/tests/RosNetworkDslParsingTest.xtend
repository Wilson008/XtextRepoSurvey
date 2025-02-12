/*
 * generated by Xtext 2.35.0
 */
package hu.sze.aut.ros.middleware.statepubsub.tests

import com.google.inject.Inject
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Stack
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith

@ExtendWith(InjectionExtension)
@InjectWith(RosNetworkDslInjectorProvider)
class RosNetworkDslParsingTest {
	@Inject
	ParseHelper<Stack> parseHelper
	
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
