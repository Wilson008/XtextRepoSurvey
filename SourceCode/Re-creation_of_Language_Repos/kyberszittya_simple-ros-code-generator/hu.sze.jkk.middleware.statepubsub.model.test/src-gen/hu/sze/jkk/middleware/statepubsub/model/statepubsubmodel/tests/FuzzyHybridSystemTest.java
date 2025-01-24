/**
 */
package hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.tests;

import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.FuzzyHybridSystem;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.StatepubsubmodelFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Fuzzy Hybrid System</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FuzzyHybridSystemTest extends HybridSystemTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FuzzyHybridSystemTest.class);
	}

	/**
	 * Constructs a new Fuzzy Hybrid System test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FuzzyHybridSystemTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Fuzzy Hybrid System test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected FuzzyHybridSystem getFixture() {
		return (FuzzyHybridSystem) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(StatepubsubmodelFactory.eINSTANCE.createFuzzyHybridSystem());
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

} //FuzzyHybridSystemTest
