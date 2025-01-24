/**
 */
package io.yaktor.domain.tests;

import io.yaktor.domain.DomainFactory;
import io.yaktor.domain.RooGenOptions;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Roo Gen Options</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RooGenOptionsTest extends GenOptionsTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RooGenOptionsTest.class);
	}

	/**
	 * Constructs a new Roo Gen Options test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RooGenOptionsTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Roo Gen Options test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RooGenOptions getFixture() {
		return (RooGenOptions)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DomainFactory.eINSTANCE.createRooGenOptions());
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

} //RooGenOptionsTest
