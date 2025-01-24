/**
 */
package hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.tests;

import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.IntegerParameter;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.StatepubsubmodelFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Integer Parameter</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IntegerParameterTest extends NodeParameterTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IntegerParameterTest.class);
	}

	/**
	 * Constructs a new Integer Parameter test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerParameterTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Integer Parameter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected IntegerParameter getFixture() {
		return (IntegerParameter) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(StatepubsubmodelFactory.eINSTANCE.createIntegerParameter());
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

} //IntegerParameterTest
