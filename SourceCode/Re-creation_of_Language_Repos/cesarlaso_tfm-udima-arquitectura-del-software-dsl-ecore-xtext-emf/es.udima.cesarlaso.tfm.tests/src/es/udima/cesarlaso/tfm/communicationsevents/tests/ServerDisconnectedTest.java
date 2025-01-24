/**
 */
package es.udima.cesarlaso.tfm.communicationsevents.tests;

import es.udima.cesarlaso.tfm.communicationsevents.CommunicationseventsFactory;
import es.udima.cesarlaso.tfm.communicationsevents.ServerDisconnected;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Server Disconnected</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ServerDisconnectedTest extends ServerEventTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ServerDisconnectedTest.class);
	}

	/**
	 * Constructs a new Server Disconnected test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerDisconnectedTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Server Disconnected test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ServerDisconnected getFixture() {
		return (ServerDisconnected)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CommunicationseventsFactory.eINSTANCE.createServerDisconnected());
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

} //ServerDisconnectedTest
