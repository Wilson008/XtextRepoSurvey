/**
 */
package es.udima.cesarlaso.tfm.gpiosevents.tests;

import es.udima.cesarlaso.tfm.gpiosevents.AnalogRead;
import es.udima.cesarlaso.tfm.gpiosevents.GpioseventsFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Analog Read</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AnalogReadTest extends AnalogEventTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AnalogReadTest.class);
	}

	/**
	 * Constructs a new Analog Read test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalogReadTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Analog Read test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AnalogRead getFixture() {
		return (AnalogRead)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GpioseventsFactory.eINSTANCE.createAnalogRead());
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

} //AnalogReadTest
