/**
 */
package es.udima.cesarlaso.tfm.deploymentdevices.tests;

import es.udima.cesarlaso.tfm.deploymentdevices.DeploymentdevicesFactory;
import es.udima.cesarlaso.tfm.deploymentdevices.Raspberry;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Raspberry</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RaspberryTest extends JavaDeviceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RaspberryTest.class);
	}

	/**
	 * Constructs a new Raspberry test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RaspberryTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Raspberry test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Raspberry getFixture() {
		return (Raspberry)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DeploymentdevicesFactory.eINSTANCE.createRaspberry());
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

} //RaspberryTest
