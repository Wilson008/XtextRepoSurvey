/**
 */
package nowheretravel.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import nowheretravel.Connection;
import nowheretravel.NowheretravelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConnectionTest extends TestCase {

	/**
	 * The fixture for this Connection test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Connection fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ConnectionTest.class);
	}

	/**
	 * Constructs a new Connection test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Connection test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Connection fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Connection test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Connection getFixture() {
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
		setFixture(NowheretravelFactory.eINSTANCE.createConnection());
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

} //ConnectionTest
