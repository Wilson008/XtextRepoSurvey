/**
 */
package es.udima.cesarlaso.tfm.gpiosevents.tests;

import es.udima.cesarlaso.tfm.gpiosevents.ButtonInput;
import es.udima.cesarlaso.tfm.gpiosevents.GpioseventsFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Button Input</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ButtonInputTest extends DigitalEventTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ButtonInputTest.class);
	}

	/**
	 * Constructs a new Button Input test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ButtonInputTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Button Input test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ButtonInput getFixture() {
		return (ButtonInput)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GpioseventsFactory.eINSTANCE.createButtonInput());
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

} //ButtonInputTest
