/**
 */
package megal.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import megal.MegalFactory;
import megal.QueryStatement;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Query Statement</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class QueryStatementTest extends TestCase {

	/**
	 * The fixture for this Query Statement test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QueryStatement fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(QueryStatementTest.class);
	}

	/**
	 * Constructs a new Query Statement test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryStatementTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Query Statement test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(QueryStatement fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Query Statement test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QueryStatement getFixture() {
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
		setFixture(MegalFactory.eINSTANCE.createQueryStatement());
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

} //QueryStatementTest
