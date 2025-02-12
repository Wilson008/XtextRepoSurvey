/**
 */
package megal.tests;

import junit.textui.TestRunner;

import megal.MegalFactory;
import megal.MegalRelationshipType;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Relationship Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MegalRelationshipTypeTest extends MegalNamedTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MegalRelationshipTypeTest.class);
	}

	/**
	 * Constructs a new Relationship Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MegalRelationshipTypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Relationship Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MegalRelationshipType getFixture() {
		return (MegalRelationshipType)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MegalFactory.eINSTANCE.createMegalRelationshipType());
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

} //MegalRelationshipTypeTest
