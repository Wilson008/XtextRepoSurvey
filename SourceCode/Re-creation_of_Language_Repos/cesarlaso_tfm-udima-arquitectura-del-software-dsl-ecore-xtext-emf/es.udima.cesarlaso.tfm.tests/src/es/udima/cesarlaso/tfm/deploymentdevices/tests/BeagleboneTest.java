/**
 */
package es.udima.cesarlaso.tfm.deploymentdevices.tests;

import es.udima.cesarlaso.tfm.deploymentdevices.Beaglebone;
import es.udima.cesarlaso.tfm.deploymentdevices.DeploymentdevicesFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Beaglebone</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BeagleboneTest extends JavaDeviceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BeagleboneTest.class);
	}

	/**
	 * Constructs a new Beaglebone test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BeagleboneTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Beaglebone test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Beaglebone getFixture() {
		return (Beaglebone)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DeploymentdevicesFactory.eINSTANCE.createBeaglebone());
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

} //BeagleboneTest
