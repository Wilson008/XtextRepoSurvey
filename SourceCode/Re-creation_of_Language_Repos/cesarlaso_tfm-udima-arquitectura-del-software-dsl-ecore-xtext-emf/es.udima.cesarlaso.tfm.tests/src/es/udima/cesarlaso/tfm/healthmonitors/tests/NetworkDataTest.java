/**
 */
package es.udima.cesarlaso.tfm.healthmonitors.tests;

import es.udima.cesarlaso.tfm.healthmonitors.HealthmonitorsFactory;
import es.udima.cesarlaso.tfm.healthmonitors.NetworkData;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Network Data</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NetworkDataTest extends HealthMonitorDataTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NetworkDataTest.class);
	}

	/**
	 * Constructs a new Network Data test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkDataTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Network Data test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected NetworkData getFixture() {
		return (NetworkData)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(HealthmonitorsFactory.eINSTANCE.createNetworkData());
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

} //NetworkDataTest
