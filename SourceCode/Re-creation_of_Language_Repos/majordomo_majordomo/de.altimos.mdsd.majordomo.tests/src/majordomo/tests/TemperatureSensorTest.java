/**
 */
package majordomo.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import majordomo.MajordomoFactory;
import majordomo.TemperatureSensor;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Temperature Sensor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link majordomo.FloatSensor#getValue() <em>Get Value</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class TemperatureSensorTest extends TestCase {

	/**
	 * The fixture for this Temperature Sensor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemperatureSensor fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TemperatureSensorTest.class);
	}

	/**
	 * Constructs a new Temperature Sensor test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemperatureSensorTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Temperature Sensor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(TemperatureSensor fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Temperature Sensor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemperatureSensor getFixture() {
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
		setFixture(MajordomoFactory.eINSTANCE.createTemperatureSensor());
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
	 * Tests the '{@link majordomo.FloatSensor#getValue() <em>Get Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see majordomo.FloatSensor#getValue()
	 * @generated
	 */
	public void testGetValue() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //TemperatureSensorTest
