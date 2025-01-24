/**
 */
package nowheretravel.tests;

import junit.textui.TestRunner;

import nowheretravel.Hotel;
import nowheretravel.NowheretravelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Hotel</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class HotelTest extends ItemTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(HotelTest.class);
	}

	/**
	 * Constructs a new Hotel test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HotelTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Hotel test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Hotel getFixture() {
		return (Hotel)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(NowheretravelFactory.eINSTANCE.createHotel());
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

} //HotelTest
