/**
 */
package es.udima.cesarlaso.tfm.timers.tests;

import es.udima.cesarlaso.tfm.timers.TimerEvent;
import es.udima.cesarlaso.tfm.timers.TimersFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Timer Event</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TimerEventTest extends TestCase {

	/**
	 * The fixture for this Timer Event test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimerEvent fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TimerEventTest.class);
	}

	/**
	 * Constructs a new Timer Event test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimerEventTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Timer Event test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(TimerEvent fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Timer Event test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimerEvent getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TimersFactory.eINSTANCE.createTimerEvent());
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

} //TimerEventTest
