/**
 */
package majordomo.tests;

import junit.textui.TestRunner;

import majordomo.BinaryOrOperation;
import majordomo.MajordomoFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Binary Or Operation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BinaryOrOperationTest extends BinaryOperationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BinaryOrOperationTest.class);
	}

	/**
	 * Constructs a new Binary Or Operation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryOrOperationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Binary Or Operation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BinaryOrOperation getFixture() {
		return (BinaryOrOperation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MajordomoFactory.eINSTANCE.createBinaryOrOperation());
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

} //BinaryOrOperationTest
