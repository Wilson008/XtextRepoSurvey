/**
 */
package io.yaktor.domain.tests;

import io.yaktor.domain.DomainFactory;
import io.yaktor.domain.PersistenceOptions;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Persistence Options</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PersistenceOptionsTest extends TestCase {

	/**
	 * The fixture for this Persistence Options test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersistenceOptions fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PersistenceOptionsTest.class);
	}

	/**
	 * Constructs a new Persistence Options test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersistenceOptionsTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Persistence Options test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(PersistenceOptions fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Persistence Options test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersistenceOptions getFixture() {
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
		setFixture(DomainFactory.eINSTANCE.createPersistenceOptions());
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

} //PersistenceOptionsTest
