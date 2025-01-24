/**
 */
package nowheretravel.tests;

import junit.textui.TestRunner;

import nowheretravel.CarRental;
import nowheretravel.NowheretravelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Car Rental</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CarRentalTest extends ItemTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CarRentalTest.class);
	}

	/**
	 * Constructs a new Car Rental test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarRentalTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Car Rental test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CarRental getFixture() {
		return (CarRental)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(NowheretravelFactory.eINSTANCE.createCarRental());
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

} //CarRentalTest
