/*
 * generated by Xtext 2.35.0
 */
package io.yaktor;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class DomainStandaloneSetup extends DomainStandaloneSetupGenerated {

	public static void doSetup() {
		new DomainStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
