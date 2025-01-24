/**
 */
package es.udima.cesarlaso.tfm.timers.tests;

import es.udima.cesarlaso.tfm.timers.Now;
import es.udima.cesarlaso.tfm.timers.TimersFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Now</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NowTest extends TimerTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NowTest.class);
	}

	/**
	 * Constructs a new Now test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NowTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Now test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Now getFixture() {
		return (Now)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TimersFactory.eINSTANCE.createNow());
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

} //NowTest
