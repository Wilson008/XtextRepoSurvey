/**
 */
package es.udima.cesarlaso.tfm.communicationsprograms.tests;

import es.udima.cesarlaso.tfm.communicationsprograms.CommunicationsprogramsFactory;
import es.udima.cesarlaso.tfm.communicationsprograms.RemoteActuatorIdentifier;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Remote Actuator Identifier</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RemoteActuatorIdentifierTest extends RemoteIdentifierTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RemoteActuatorIdentifierTest.class);
	}

	/**
	 * Constructs a new Remote Actuator Identifier test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoteActuatorIdentifierTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Remote Actuator Identifier test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RemoteActuatorIdentifier getFixture() {
		return (RemoteActuatorIdentifier)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CommunicationsprogramsFactory.eINSTANCE.createRemoteActuatorIdentifier());
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

} //RemoteActuatorIdentifierTest
