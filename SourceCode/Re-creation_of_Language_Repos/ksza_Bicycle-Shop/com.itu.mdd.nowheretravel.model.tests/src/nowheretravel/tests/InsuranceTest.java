/**
 */
package nowheretravel.tests;

import junit.textui.TestRunner;

import nowheretravel.Insurance;
import nowheretravel.NowheretravelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Insurance</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InsuranceTest extends ItemTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InsuranceTest.class);
	}

	/**
	 * Constructs a new Insurance test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InsuranceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Insurance test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Insurance getFixture() {
		return (Insurance)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(NowheretravelFactory.eINSTANCE.createInsurance());
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

} //InsuranceTest
