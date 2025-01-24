/**
 */
package nowheretravel.tests;

import junit.textui.TestRunner;

import nowheretravel.NowheretravelFactory;
import nowheretravel.TrekkingTour;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Trekking Tour</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TrekkingTourTest extends TourTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TrekkingTourTest.class);
	}

	/**
	 * Constructs a new Trekking Tour test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrekkingTourTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Trekking Tour test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TrekkingTour getFixture() {
		return (TrekkingTour)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(NowheretravelFactory.eINSTANCE.createTrekkingTour());
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

} //TrekkingTourTest
