/**
 */
package es.udima.cesarlaso.tfm.gpiosevents.tests;

import es.udima.cesarlaso.tfm.gpiosevents.GpioseventsFactory;
import es.udima.cesarlaso.tfm.gpiosevents.Interrupted;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Interrupted</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InterruptedTest extends DigitalEventTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InterruptedTest.class);
	}

	/**
	 * Constructs a new Interrupted test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterruptedTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Interrupted test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Interrupted getFixture() {
		return (Interrupted)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GpioseventsFactory.eINSTANCE.createInterrupted());
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

} //InterruptedTest
