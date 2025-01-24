/**
 */
package es.udima.cesarlaso.tfm.gpios.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>gpios</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class GpiosTests extends TestSuite {

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
		TestSuite suite = new GpiosTests("gpios Tests");
		suite.addTestSuite(DigitalInputPinTest.class);
		suite.addTestSuite(DigitalOutputPinTest.class);
		suite.addTestSuite(AnalogInputPinTest.class);
		suite.addTestSuite(AnalogOutputPinTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GpiosTests(String name) {
		super(name);
	}

} //GpiosTests
