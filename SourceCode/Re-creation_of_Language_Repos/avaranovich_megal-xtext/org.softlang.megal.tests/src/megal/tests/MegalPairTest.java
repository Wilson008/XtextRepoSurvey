/**
 */
package megal.tests;

import junit.textui.TestRunner;

import megal.MegalFactory;
import megal.MegalPair;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Pair</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MegalPairTest extends MegalDeclarationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MegalPairTest.class);
	}

	/**
	 * Constructs a new Pair test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MegalPairTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Pair test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MegalPair getFixture() {
		return (MegalPair)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MegalFactory.eINSTANCE.createMegalPair());
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

} //MegalPairTest
