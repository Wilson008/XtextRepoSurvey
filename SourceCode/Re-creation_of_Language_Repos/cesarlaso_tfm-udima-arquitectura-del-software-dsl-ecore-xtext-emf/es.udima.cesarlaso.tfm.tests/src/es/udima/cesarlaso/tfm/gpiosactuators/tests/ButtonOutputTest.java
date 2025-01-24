/**
 */
package es.udima.cesarlaso.tfm.gpiosactuators.tests;

import es.udima.cesarlaso.tfm.gpiosactuators.ButtonOutput;
import es.udima.cesarlaso.tfm.gpiosactuators.GpiosactuatorsFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Button Output</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ButtonOutputTest extends ChangeOutputTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ButtonOutputTest.class);
	}

	/**
	 * Constructs a new Button Output test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ButtonOutputTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Button Output test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ButtonOutput getFixture() {
		return (ButtonOutput)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GpiosactuatorsFactory.eINSTANCE.createButtonOutput());
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

} //ButtonOutputTest
