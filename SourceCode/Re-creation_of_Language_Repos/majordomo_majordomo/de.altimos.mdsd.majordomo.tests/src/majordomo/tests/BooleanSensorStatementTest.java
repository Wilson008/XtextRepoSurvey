/**
 */
package majordomo.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import majordomo.BooleanSensorStatement;
import majordomo.MajordomoFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Boolean Sensor Statement</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BooleanSensorStatementTest extends TestCase {

	/**
	 * The fixture for this Boolean Sensor Statement test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanSensorStatement fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BooleanSensorStatementTest.class);
	}

	/**
	 * Constructs a new Boolean Sensor Statement test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanSensorStatementTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Boolean Sensor Statement test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(BooleanSensorStatement fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Boolean Sensor Statement test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanSensorStatement getFixture() {
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
		setFixture(MajordomoFactory.eINSTANCE.createBooleanSensorStatement());
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

} //BooleanSensorStatementTest
