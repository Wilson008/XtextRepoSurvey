/**
 */
package es.udima.cesarlaso.tfm.deploymentdevices.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>deploymentdevices</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class DeploymentdevicesTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new DeploymentdevicesTests("deploymentdevices Tests");
		suite.addTestSuite(SimulatorTest.class);
		suite.addTestSuite(RaspberryTest.class);
		suite.addTestSuite(BeagleboneTest.class);
		suite.addTestSuite(ESP8266Test.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentdevicesTests(String name) {
		super(name);
	}

} //DeploymentdevicesTests
