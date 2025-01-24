/**
 */
package es.udima.cesarlaso.tfm.gpiosevents.tests;

import es.udima.cesarlaso.tfm.gpiosevents.GpioseventsFactory;
import es.udima.cesarlaso.tfm.gpiosevents.PulseInput;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Pulse Input</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PulseInputTest extends DigitalEventTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PulseInputTest.class);
	}

	/**
	 * Constructs a new Pulse Input test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PulseInputTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Pulse Input test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PulseInput getFixture() {
		return (PulseInput)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GpioseventsFactory.eINSTANCE.createPulseInput());
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

} //PulseInputTest
