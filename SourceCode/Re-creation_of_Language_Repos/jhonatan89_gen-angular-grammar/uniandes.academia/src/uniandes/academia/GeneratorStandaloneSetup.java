/*
 * generated by Xtext 2.35.0
 */
package uniandes.academia;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class GeneratorStandaloneSetup extends GeneratorStandaloneSetupGenerated {

	public static void doSetup() {
		new GeneratorStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
