/**
 */
package majordomo.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import majordomo.MajordomoFactory;
import majordomo.SwitchSensor;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Switch Sensor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link majordomo.BooleanSensor#getValue() <em>Get Value</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class SwitchSensorTest extends TestCase {

	/**
	 * The fixture for this Switch Sensor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SwitchSensor fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SwitchSensorTest.class);
	}

	/**
	 * Constructs a new Switch Sensor test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchSensorTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Switch Sensor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SwitchSensor fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Switch Sensor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SwitchSensor getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MajordomoFactory.eINSTANCE.createSwitchSensor());
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

	/**
	 * Tests the '{@link majordomo.BooleanSensor#getValue() <em>Get Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see majordomo.BooleanSensor#getValue()
	 * @generated
	 */
	public void testGetValue() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //SwitchSensorTest
