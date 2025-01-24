/**
 */
package es.udima.cesarlaso.tfm.gpios.tests;

import es.udima.cesarlaso.tfm.gpios.DigitalInputPin;
import es.udima.cesarlaso.tfm.gpios.GpiosFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Digital Input Pin</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DigitalInputPinTest extends DigitalPinTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DigitalInputPinTest.class);
	}

	/**
	 * Constructs a new Digital Input Pin test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DigitalInputPinTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Digital Input Pin test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DigitalInputPin getFixture() {
		return (DigitalInputPin)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GpiosFactory.eINSTANCE.createDigitalInputPin());
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

} //DigitalInputPinTest
