/*
 * generated by Xtext 2.35.0
 */
package dk.itu.mdd.nowheretravel.dsl;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class NowhereTravelDslStandaloneSetup extends NowhereTravelDslStandaloneSetupGenerated {

	public static void doSetup() {
		new NowhereTravelDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
