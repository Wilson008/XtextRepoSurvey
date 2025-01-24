/**
 */
package megal.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import megal.MegalFactory;
import megal.MegalLink;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MegalLinkTest extends TestCase {

	/**
	 * The fixture for this Link test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MegalLink fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MegalLinkTest.class);
	}

	/**
	 * Constructs a new Link test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MegalLinkTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Link test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(MegalLink fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Link test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MegalLink getFixture() {
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
		setFixture(MegalFactory.eINSTANCE.createMegalLink());
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

} //MegalLinkTest
