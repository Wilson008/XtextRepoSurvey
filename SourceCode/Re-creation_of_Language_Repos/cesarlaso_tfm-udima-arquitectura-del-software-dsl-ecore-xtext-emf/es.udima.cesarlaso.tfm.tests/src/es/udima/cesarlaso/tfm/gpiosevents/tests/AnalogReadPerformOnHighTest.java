/**
 */
package es.udima.cesarlaso.tfm.gpiosevents.tests;

import es.udima.cesarlaso.tfm.gpiosevents.AnalogReadPerformOnHigh;
import es.udima.cesarlaso.tfm.gpiosevents.GpioseventsFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Analog Read Perform On High</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AnalogReadPerformOnHighTest extends AnalogReadPerformOnChangeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AnalogReadPerformOnHighTest.class);
	}

	/**
	 * Constructs a new Analog Read Perform On High test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalogReadPerformOnHighTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Analog Read Perform On High test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AnalogReadPerformOnHigh getFixture() {
		return (AnalogReadPerformOnHigh)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GpioseventsFactory.eINSTANCE.createAnalogReadPerformOnHigh());
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

} //AnalogReadPerformOnHighTest
