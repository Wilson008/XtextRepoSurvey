/**
 */
package es.udima.cesarlaso.tfm.communicationsevents.tests;

import es.udima.cesarlaso.tfm.communicationsevents.CommunicationseventsFactory;
import es.udima.cesarlaso.tfm.communicationsevents.ServerConnected;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Server Connected</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ServerConnectedTest extends ServerEventTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ServerConnectedTest.class);
	}

	/**
	 * Constructs a new Server Connected test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerConnectedTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Server Connected test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ServerConnected getFixture() {
		return (ServerConnected)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CommunicationseventsFactory.eINSTANCE.createServerConnected());
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

} //ServerConnectedTest
