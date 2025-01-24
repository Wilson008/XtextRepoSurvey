/**
 */
package es.udima.cesarlaso.tfm.gpiosactuators.tests;

import es.udima.cesarlaso.tfm.gpiosactuators.BlinkTimerOutput;
import es.udima.cesarlaso.tfm.gpiosactuators.GpiosactuatorsFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Blink Timer Output</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BlinkTimerOutputTest extends BlinkOutputTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BlinkTimerOutputTest.class);
	}

	/**
	 * Constructs a new Blink Timer Output test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlinkTimerOutputTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Blink Timer Output test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BlinkTimerOutput getFixture() {
		return (BlinkTimerOutput)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GpiosactuatorsFactory.eINSTANCE.createBlinkTimerOutput());
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

} //BlinkTimerOutputTest
