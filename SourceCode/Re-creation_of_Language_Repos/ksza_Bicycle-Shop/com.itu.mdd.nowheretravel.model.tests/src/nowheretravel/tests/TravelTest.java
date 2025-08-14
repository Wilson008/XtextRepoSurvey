/**
 */
package nowheretravel.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import nowheretravel.NowheretravelFactory;
import nowheretravel.Travel;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Travel</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TravelTest extends TestCase {

	/**
	 * The fixture for this Travel test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Travel fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TravelTest.class);
	}

	/**
	 * Constructs a new Travel test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TravelTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Travel test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Travel fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Travel test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Travel getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(NowheretravelFactory.eINSTANCE.createTravel());
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

} //TravelTest
