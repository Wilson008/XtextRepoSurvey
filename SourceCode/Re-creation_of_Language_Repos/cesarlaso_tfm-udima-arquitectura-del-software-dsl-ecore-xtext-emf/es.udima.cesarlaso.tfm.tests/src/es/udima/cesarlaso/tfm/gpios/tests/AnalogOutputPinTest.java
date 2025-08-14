/**
 */
package es.udima.cesarlaso.tfm.gpios.tests;

import es.udima.cesarlaso.tfm.gpios.AnalogOutputPin;
import es.udima.cesarlaso.tfm.gpios.GpiosFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Analog Output Pin</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AnalogOutputPinTest extends AnalogPinTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AnalogOutputPinTest.class);
	}

	/**
	 * Constructs a new Analog Output Pin test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalogOutputPinTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Analog Output Pin test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AnalogOutputPin getFixture() {
		return (AnalogOutputPin)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GpiosFactory.eINSTANCE.createAnalogOutputPin());
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

} //AnalogOutputPinTest
