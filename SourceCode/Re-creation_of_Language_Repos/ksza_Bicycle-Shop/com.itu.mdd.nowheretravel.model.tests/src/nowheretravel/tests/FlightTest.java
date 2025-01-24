/**
 */
package nowheretravel.tests;

import junit.textui.TestRunner;

import nowheretravel.Flight;
import nowheretravel.NowheretravelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Flight</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FlightTest extends ItemTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FlightTest.class);
	}

	/**
	 * Constructs a new Flight test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlightTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Flight test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Flight getFixture() {
		return (Flight)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(NowheretravelFactory.eINSTANCE.createFlight());
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

} //FlightTest
