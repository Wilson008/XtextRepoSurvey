/*
 * generated by Xtext 2.35.0
 */
package org.tvtower.db;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class DatabaseStandaloneSetup extends DatabaseStandaloneSetupGenerated {

	public static void doSetup() {
		new DatabaseStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
