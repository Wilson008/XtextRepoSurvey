/**
 */
package es.udima.cesarlaso.tfm.communicationsprograms.tests;

import es.udima.cesarlaso.tfm.communicationsprograms.CommunicationsprogramsFactory;
import es.udima.cesarlaso.tfm.communicationsprograms.RemoteActuator;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Remote Actuator</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RemoteActuatorTest extends TestCase {

	/**
	 * The fixture for this Remote Actuator test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RemoteActuator fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RemoteActuatorTest.class);
	}

	/**
	 * Constructs a new Remote Actuator test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoteActuatorTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Remote Actuator test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(RemoteActuator fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Remote Actuator test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RemoteActuator getFixture() {
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
		setFixture(CommunicationsprogramsFactory.eINSTANCE.createRemoteActuator());
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

} //RemoteActuatorTest
