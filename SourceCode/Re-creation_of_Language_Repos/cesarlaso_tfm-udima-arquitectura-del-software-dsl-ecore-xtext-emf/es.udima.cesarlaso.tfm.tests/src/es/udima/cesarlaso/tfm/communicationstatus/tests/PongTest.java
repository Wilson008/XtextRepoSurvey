/**
 */
package es.udima.cesarlaso.tfm.communicationstatus.tests;

import es.udima.cesarlaso.tfm.communicationstatus.CommunicationstatusFactory;
import es.udima.cesarlaso.tfm.communicationstatus.Pong;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Pong</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PongTest extends StatusServiceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PongTest.class);
	}

	/**
	 * Constructs a new Pong test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PongTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Pong test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Pong getFixture() {
		return (Pong)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CommunicationstatusFactory.eINSTANCE.createPong());
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

} //PongTest
