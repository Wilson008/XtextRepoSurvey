/**
 */
package es.udima.cesarlaso.tfm.timers.tests;

import es.udima.cesarlaso.tfm.timers.Repeated;
import es.udima.cesarlaso.tfm.timers.TimersFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Repeated</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RepeatedTest extends TimerTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RepeatedTest.class);
	}

	/**
	 * Constructs a new Repeated test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepeatedTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Repeated test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Repeated getFixture() {
		return (Repeated)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TimersFactory.eINSTANCE.createRepeated());
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

} //RepeatedTest
