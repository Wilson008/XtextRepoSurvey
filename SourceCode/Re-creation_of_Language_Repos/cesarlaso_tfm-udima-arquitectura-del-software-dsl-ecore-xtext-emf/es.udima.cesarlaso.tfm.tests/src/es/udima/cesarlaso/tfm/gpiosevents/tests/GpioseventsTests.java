/**
 */
package es.udima.cesarlaso.tfm.gpiosevents.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>gpiosevents</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class GpioseventsTests extends TestSuite {

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
		TestSuite suite = new GpioseventsTests("gpiosevents Tests");
		suite.addTestSuite(InterruptedTest.class);
		suite.addTestSuite(ButtonInputTest.class);
		suite.addTestSuite(ButtonInputAccumulatorTest.class);
		suite.addTestSuite(ButtonInputReleasedTest.class);
		suite.addTestSuite(PulseInputTest.class);
		suite.addTestSuite(AnalogReadTest.class);
		suite.addTestSuite(AnalogReadPerformOnHighTest.class);
		suite.addTestSuite(AnalogReadPerformOnLowTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GpioseventsTests(String name) {
		super(name);
	}

} //GpioseventsTests
