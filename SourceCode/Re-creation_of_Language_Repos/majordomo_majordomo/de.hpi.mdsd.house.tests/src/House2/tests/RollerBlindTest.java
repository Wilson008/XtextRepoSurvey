/**
 */
package House2.tests;

import House2.House2Factory;
import House2.RollerBlind;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Roller Blind</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RollerBlindTest extends ActorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RollerBlindTest.class);
	}

	/**
	 * Constructs a new Roller Blind test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RollerBlindTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Roller Blind test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RollerBlind getFixture() {
		return (RollerBlind)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(House2Factory.eINSTANCE.createRollerBlind());
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

} //RollerBlindTest
