/**
 */
package nowheretravel.tests;

import junit.textui.TestRunner;

import nowheretravel.NowheretravelFactory;
import nowheretravel.ParachuteTour;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Parachute Tour</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ParachuteTourTest extends TourTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ParachuteTourTest.class);
	}

	/**
	 * Constructs a new Parachute Tour test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParachuteTourTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Parachute Tour test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ParachuteTour getFixture() {
		return (ParachuteTour)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(NowheretravelFactory.eINSTANCE.createParachuteTour());
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

} //ParachuteTourTest
