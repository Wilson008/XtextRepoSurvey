/**
 */
package majordomo.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import majordomo.Majordomo;
import majordomo.MajordomoFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Majordomo</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MajordomoTest extends TestCase {

	/**
	 * The fixture for this Majordomo test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Majordomo fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MajordomoTest.class);
	}

	/**
	 * Constructs a new Majordomo test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MajordomoTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Majordomo test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Majordomo fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Majordomo test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Majordomo getFixture() {
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
		setFixture(MajordomoFactory.eINSTANCE.createMajordomo());
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

} //MajordomoTest
