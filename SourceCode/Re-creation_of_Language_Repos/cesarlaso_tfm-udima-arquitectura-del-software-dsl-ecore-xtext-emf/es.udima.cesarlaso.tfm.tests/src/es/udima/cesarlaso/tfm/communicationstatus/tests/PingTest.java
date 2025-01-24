/**
 */
package es.udima.cesarlaso.tfm.communicationstatus.tests;

import es.udima.cesarlaso.tfm.communicationstatus.CommunicationstatusFactory;
import es.udima.cesarlaso.tfm.communicationstatus.Ping;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Ping</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PingTest extends StatusServiceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PingTest.class);
	}

	/**
	 * Constructs a new Ping test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PingTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Ping test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Ping getFixture() {
		return (Ping)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CommunicationstatusFactory.eINSTANCE.createPing());
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

} //PingTest
