/**
 */
package es.udima.cesarlaso.tfm.communicationsevents.tests;

import es.udima.cesarlaso.tfm.communicationsevents.CommunicationseventsFactory;
import es.udima.cesarlaso.tfm.communicationsevents.NetworkConnected;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Network Connected</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NetworkConnectedTest extends NetworkEventTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NetworkConnectedTest.class);
	}

	/**
	 * Constructs a new Network Connected test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkConnectedTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Network Connected test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected NetworkConnected getFixture() {
		return (NetworkConnected)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CommunicationseventsFactory.eINSTANCE.createNetworkConnected());
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

} //NetworkConnectedTest
