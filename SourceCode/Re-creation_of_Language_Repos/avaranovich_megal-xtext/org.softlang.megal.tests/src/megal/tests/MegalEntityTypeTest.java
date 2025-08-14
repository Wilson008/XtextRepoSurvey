/**
 */
package megal.tests;

import junit.textui.TestRunner;

import megal.MegalEntityType;
import megal.MegalFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Entity Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MegalEntityTypeTest extends MegalNamedTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MegalEntityTypeTest.class);
	}

	/**
	 * Constructs a new Entity Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MegalEntityTypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Entity Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MegalEntityType getFixture() {
		return (MegalEntityType)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MegalFactory.eINSTANCE.createMegalEntityType());
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

} //MegalEntityTypeTest
