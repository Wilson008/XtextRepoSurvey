/*
 * generated by Xtext 2.35.0
 */
package accessdsl;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class AccessDslStandaloneSetup extends AccessDslStandaloneSetupGenerated {

	public static void doSetup() {
		new AccessDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
