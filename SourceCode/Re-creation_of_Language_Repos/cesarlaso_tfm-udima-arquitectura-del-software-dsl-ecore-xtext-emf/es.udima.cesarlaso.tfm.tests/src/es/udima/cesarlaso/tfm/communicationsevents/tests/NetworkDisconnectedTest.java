/**
 */
package es.udima.cesarlaso.tfm.communicationsevents.tests;

import es.udima.cesarlaso.tfm.communicationsevents.CommunicationseventsFactory;
import es.udima.cesarlaso.tfm.communicationsevents.NetworkDisconnected;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Network Disconnected</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NetworkDisconnectedTest extends NetworkEventTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NetworkDisconnectedTest.class);
	}

	/**
	 * Constructs a new Network Disconnected test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkDisconnectedTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Network Disconnected test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected NetworkDisconnected getFixture() {
		return (NetworkDisconnected)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CommunicationseventsFactory.eINSTANCE.createNetworkDisconnected());
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

} //NetworkDisconnectedTest
