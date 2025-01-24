/**
 */
package es.udima.cesarlaso.tfm.deploymentdevices.tests;

import es.udima.cesarlaso.tfm.deploymentdevices.DeploymentdevicesFactory;
import es.udima.cesarlaso.tfm.deploymentdevices.Simulator;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Simulator</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimulatorTest extends JavaDeviceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SimulatorTest.class);
	}

	/**
	 * Constructs a new Simulator test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimulatorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Simulator test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Simulator getFixture() {
		return (Simulator)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DeploymentdevicesFactory.eINSTANCE.createSimulator());
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

} //SimulatorTest
