/**
 */
package megal.tests;

import junit.textui.TestRunner;

import megal.MegalFactory;
import megal.MegalRelationship;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MegalRelationshipTest extends MegalDeclarationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MegalRelationshipTest.class);
	}

	/**
	 * Constructs a new Relationship test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MegalRelationshipTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Relationship test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MegalRelationship getFixture() {
		return (MegalRelationship)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MegalFactory.eINSTANCE.createMegalRelationship());
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

} //MegalRelationshipTest
