/**
 */
package megal.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import megal.MegalFactory;
import megal.QueryReference;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Query Reference</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class QueryReferenceTest extends TestCase {

	/**
	 * The fixture for this Query Reference test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QueryReference fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(QueryReferenceTest.class);
	}

	/**
	 * Constructs a new Query Reference test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryReferenceTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Query Reference test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(QueryReference fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Query Reference test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QueryReference getFixture() {
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
		setFixture(MegalFactory.eINSTANCE.createQueryReference());
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

} //QueryReferenceTest
