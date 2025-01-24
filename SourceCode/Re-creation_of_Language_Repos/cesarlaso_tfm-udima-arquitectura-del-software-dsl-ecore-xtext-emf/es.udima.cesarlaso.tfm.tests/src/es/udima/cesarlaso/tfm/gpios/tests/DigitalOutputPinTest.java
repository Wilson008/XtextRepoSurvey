/**
 */
package es.udima.cesarlaso.tfm.gpios.tests;

import es.udima.cesarlaso.tfm.gpios.DigitalOutputPin;
import es.udima.cesarlaso.tfm.gpios.GpiosFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Digital Output Pin</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DigitalOutputPinTest extends DigitalPinTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DigitalOutputPinTest.class);
	}

	/**
	 * Constructs a new Digital Output Pin test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DigitalOutputPinTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Digital Output Pin test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DigitalOutputPin getFixture() {
		return (DigitalOutputPin)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GpiosFactory.eINSTANCE.createDigitalOutputPin());
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

} //DigitalOutputPinTest
