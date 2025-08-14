/**
 */
package es.udima.cesarlaso.tfm.deploymentdevices.tests;

import es.udima.cesarlaso.tfm.deploymentdevices.DeploymentdevicesFactory;
import es.udima.cesarlaso.tfm.deploymentdevices.ESP8266;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>ESP8266</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ESP8266Test extends DeviceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ESP8266Test.class);
	}

	/**
	 * Constructs a new ESP8266 test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESP8266Test(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this ESP8266 test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ESP8266 getFixture() {
		return (ESP8266)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DeploymentdevicesFactory.eINSTANCE.createESP8266());
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

} //ESP8266Test
