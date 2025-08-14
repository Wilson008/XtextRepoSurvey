/**
 */
package io.yaktor.mongoNode.tests;

import io.yaktor.mongoNode.MongoNodeFactory;
import io.yaktor.mongoNode.Ttl;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Ttl</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TtlTest extends TestCase {

	/**
	 * The fixture for this Ttl test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Ttl fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TtlTest.class);
	}

	/**
	 * Constructs a new Ttl test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TtlTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Ttl test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Ttl fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Ttl test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Ttl getFixture() {
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
		setFixture(MongoNodeFactory.eINSTANCE.createTtl());
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

} //TtlTest
