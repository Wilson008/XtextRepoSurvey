/*
 * generated by Xtext 2.35.0
 */
package es.udima.tfm.cesarlaso.tests

import com.google.inject.Inject
import es.udima.cesarlaso.tfm.iotproyects.IotProyect
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith

@ExtendWith(InjectionExtension)
@InjectWith(IotDslInjectorProvider)
class IotDslParsingTest {
	@Inject
	ParseHelper<IotProyect> parseHelper
	
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
