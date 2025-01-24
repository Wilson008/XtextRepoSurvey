/**
 */
package House2.tests;

import House2.House2Factory;
import House2.TwilightSwitch;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Twilight Switch</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TwilightSwitchTest extends SensorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TwilightSwitchTest.class);
	}

	/**
	 * Constructs a new Twilight Switch test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TwilightSwitchTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Twilight Switch test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TwilightSwitch getFixture() {
		return (TwilightSwitch)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(House2Factory.eINSTANCE.createTwilightSwitch());
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

} //TwilightSwitchTest
