/**
 */
package hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.tests;

import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.ContinousState;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.StatepubsubmodelFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Continous State</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ContinousStateTest extends InternalNodeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ContinousStateTest.class);
	}

	/**
	 * Constructs a new Continous State test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContinousStateTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Continous State test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ContinousState getFixture() {
		return (ContinousState) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(StatepubsubmodelFactory.eINSTANCE.createContinousState());
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

} //ContinousStateTest
