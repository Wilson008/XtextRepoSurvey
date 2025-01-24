/**
 */
package es.udima.cesarlaso.tfm.deploymentdevices.tests;

import es.udima.cesarlaso.tfm.deploymentdevices.DeploymentdevicesFactory;
import es.udima.cesarlaso.tfm.deploymentdevices.WifiConfiguration;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Wifi Configuration</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WifiConfigurationTest extends TestCase {

	/**
	 * The fixture for this Wifi Configuration test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WifiConfiguration fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(WifiConfigurationTest.class);
	}

	/**
	 * Constructs a new Wifi Configuration test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WifiConfigurationTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Wifi Configuration test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(WifiConfiguration fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Wifi Configuration test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WifiConfiguration getFixture() {
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
		setFixture(DeploymentdevicesFactory.eINSTANCE.createWifiConfiguration());
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

} //WifiConfigurationTest
