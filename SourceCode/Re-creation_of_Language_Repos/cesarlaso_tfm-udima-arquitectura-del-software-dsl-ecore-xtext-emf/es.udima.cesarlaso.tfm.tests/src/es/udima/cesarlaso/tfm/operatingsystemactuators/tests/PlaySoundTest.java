/**
 */
package es.udima.cesarlaso.tfm.operatingsystemactuators.tests;

import es.udima.cesarlaso.tfm.operatingsystemactuators.OperatingsystemactuatorsFactory;
import es.udima.cesarlaso.tfm.operatingsystemactuators.PlaySound;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Play Sound</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PlaySoundTest extends OperatingSystemActuatorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PlaySoundTest.class);
	}

	/**
	 * Constructs a new Play Sound test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlaySoundTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Play Sound test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PlaySound getFixture() {
		return (PlaySound)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OperatingsystemactuatorsFactory.eINSTANCE.createPlaySound());
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

} //PlaySoundTest
