/**
 */
package es.udima.cesarlaso.tfm.gpiosactuators.tests;

import es.udima.cesarlaso.tfm.gpiosactuators.GpiosactuatorsFactory;
import es.udima.cesarlaso.tfm.gpiosactuators.Pwm;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Pwm</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PwmTest extends AnalogActuatorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PwmTest.class);
	}

	/**
	 * Constructs a new Pwm test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PwmTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Pwm test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Pwm getFixture() {
		return (Pwm)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GpiosactuatorsFactory.eINSTANCE.createPwm());
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

} //PwmTest
