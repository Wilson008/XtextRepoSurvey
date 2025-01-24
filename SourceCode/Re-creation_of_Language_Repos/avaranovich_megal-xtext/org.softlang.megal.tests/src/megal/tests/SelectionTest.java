/**
 */
package megal.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import megal.MegalFactory;
import megal.Selection;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Selection</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SelectionTest extends TestCase {

	/**
	 * The fixture for this Selection test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Selection fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SelectionTest.class);
	}

	/**
	 * Constructs a new Selection test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectionTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Selection test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Selection fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Selection test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Selection getFixture() {
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
		setFixture(MegalFactory.eINSTANCE.createSelection());
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

} //SelectionTest
