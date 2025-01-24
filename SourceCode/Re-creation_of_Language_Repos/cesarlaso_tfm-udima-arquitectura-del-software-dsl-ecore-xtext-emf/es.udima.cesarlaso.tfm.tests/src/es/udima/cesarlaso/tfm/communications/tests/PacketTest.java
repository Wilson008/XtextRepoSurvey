/**
 */
package es.udima.cesarlaso.tfm.communications.tests;

import es.udima.cesarlaso.tfm.communications.CommunicationsFactory;
import es.udima.cesarlaso.tfm.communications.Packet;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Packet</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PacketTest extends TestCase {

	/**
	 * The fixture for this Packet test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Packet fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PacketTest.class);
	}

	/**
	 * Constructs a new Packet test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PacketTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Packet test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Packet fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Packet test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Packet getFixture() {
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
		setFixture(CommunicationsFactory.eINSTANCE.createPacket());
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

} //PacketTest
