/**
 */
package majordomo.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import majordomo.MajordomoFactory;
import majordomo.PreparedValue;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Prepared Value</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PreparedValueTest extends TestCase {

	/**
	 * The fixture for this Prepared Value test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PreparedValue fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PreparedValueTest.class);
	}

	/**
	 * Constructs a new Prepared Value test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreparedValueTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Prepared Value test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(PreparedValue fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Prepared Value test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PreparedValue getFixture() {
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
		setFixture(MajordomoFactory.eINSTANCE.createPreparedValue());
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

} //PreparedValueTest
