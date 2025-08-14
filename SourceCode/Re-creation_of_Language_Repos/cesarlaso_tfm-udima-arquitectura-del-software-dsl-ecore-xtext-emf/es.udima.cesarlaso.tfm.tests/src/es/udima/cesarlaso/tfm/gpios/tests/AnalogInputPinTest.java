/**
 */
package es.udima.cesarlaso.tfm.gpios.tests;

import es.udima.cesarlaso.tfm.gpios.AnalogInputPin;
import es.udima.cesarlaso.tfm.gpios.GpiosFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Analog Input Pin</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AnalogInputPinTest extends AnalogPinTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AnalogInputPinTest.class);
	}

	/**
	 * Constructs a new Analog Input Pin test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalogInputPinTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Analog Input Pin test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AnalogInputPin getFixture() {
		return (AnalogInputPin)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GpiosFactory.eINSTANCE.createAnalogInputPin());
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

} //AnalogInputPinTest
