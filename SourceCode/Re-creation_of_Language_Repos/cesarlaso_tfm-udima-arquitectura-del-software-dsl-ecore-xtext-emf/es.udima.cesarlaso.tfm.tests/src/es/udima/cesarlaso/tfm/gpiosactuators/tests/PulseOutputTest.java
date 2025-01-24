/**
 */
package es.udima.cesarlaso.tfm.gpiosactuators.tests;

import es.udima.cesarlaso.tfm.gpiosactuators.GpiosactuatorsFactory;
import es.udima.cesarlaso.tfm.gpiosactuators.PulseOutput;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Pulse Output</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PulseOutputTest extends DigitalActuatorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PulseOutputTest.class);
	}

	/**
	 * Constructs a new Pulse Output test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PulseOutputTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Pulse Output test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PulseOutput getFixture() {
		return (PulseOutput)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GpiosactuatorsFactory.eINSTANCE.createPulseOutput());
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

} //PulseOutputTest
