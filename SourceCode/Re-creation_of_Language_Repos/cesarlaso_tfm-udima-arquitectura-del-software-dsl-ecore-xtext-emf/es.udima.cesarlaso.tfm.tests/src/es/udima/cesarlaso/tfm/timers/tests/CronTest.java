/**
 */
package es.udima.cesarlaso.tfm.timers.tests;

import es.udima.cesarlaso.tfm.timers.Cron;
import es.udima.cesarlaso.tfm.timers.TimersFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Cron</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CronTest extends TimerTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CronTest.class);
	}

	/**
	 * Constructs a new Cron test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CronTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Cron test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Cron getFixture() {
		return (Cron)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TimersFactory.eINSTANCE.createCron());
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

} //CronTest
