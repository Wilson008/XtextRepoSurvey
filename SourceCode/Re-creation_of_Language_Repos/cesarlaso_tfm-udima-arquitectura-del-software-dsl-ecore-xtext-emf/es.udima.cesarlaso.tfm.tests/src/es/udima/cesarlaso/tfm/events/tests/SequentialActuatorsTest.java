/**
 */
package es.udima.cesarlaso.tfm.events.tests;

import es.udima.cesarlaso.tfm.events.EventsFactory;
import es.udima.cesarlaso.tfm.events.SequentialActuators;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Sequential Actuators</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SequentialActuatorsTest extends ActuatorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SequentialActuatorsTest.class);
	}

	/**
	 * Constructs a new Sequential Actuators test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequentialActuatorsTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Sequential Actuators test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SequentialActuators getFixture() {
		return (SequentialActuators)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(EventsFactory.eINSTANCE.createSequentialActuators());
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

} //SequentialActuatorsTest
