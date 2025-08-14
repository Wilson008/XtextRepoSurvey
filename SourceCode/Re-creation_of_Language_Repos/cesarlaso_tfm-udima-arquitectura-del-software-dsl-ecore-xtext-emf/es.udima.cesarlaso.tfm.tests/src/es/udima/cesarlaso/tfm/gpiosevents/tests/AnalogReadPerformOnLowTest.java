/**
 */
package es.udima.cesarlaso.tfm.gpiosevents.tests;

import es.udima.cesarlaso.tfm.gpiosevents.AnalogReadPerformOnLow;
import es.udima.cesarlaso.tfm.gpiosevents.GpioseventsFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Analog Read Perform On Low</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AnalogReadPerformOnLowTest extends AnalogReadPerformOnChangeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AnalogReadPerformOnLowTest.class);
	}

	/**
	 * Constructs a new Analog Read Perform On Low test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalogReadPerformOnLowTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Analog Read Perform On Low test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AnalogReadPerformOnLow getFixture() {
		return (AnalogReadPerformOnLow)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GpioseventsFactory.eINSTANCE.createAnalogReadPerformOnLow());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //AnalogReadPerformOnLowTest
