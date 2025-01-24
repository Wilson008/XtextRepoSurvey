/**
 */
package majordomo.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import majordomo.MajordomoFactory;
import majordomo.SensorValue;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Sensor Value</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SensorValueTest extends TestCase {

	/**
	 * The fixture for this Sensor Value test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SensorValue fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SensorValueTest.class);
	}

	/**
	 * Constructs a new Sensor Value test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorValueTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Sensor Value test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SensorValue fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Sensor Value test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SensorValue getFixture() {
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
		setFixture(MajordomoFactory.eINSTANCE.createSensorValue());
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

} //SensorValueTest
