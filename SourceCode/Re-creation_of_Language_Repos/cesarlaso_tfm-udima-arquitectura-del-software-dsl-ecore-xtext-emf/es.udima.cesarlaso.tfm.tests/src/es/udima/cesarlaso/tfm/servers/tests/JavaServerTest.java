/**
 */
package es.udima.cesarlaso.tfm.servers.tests;

import es.udima.cesarlaso.tfm.servers.JavaServer;
import es.udima.cesarlaso.tfm.servers.ServersFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Java Server</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class JavaServerTest extends ServerTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(JavaServerTest.class);
	}

	/**
	 * Constructs a new Java Server test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaServerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Java Server test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected JavaServer getFixture() {
		return (JavaServer)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ServersFactory.eINSTANCE.createJavaServer());
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

} //JavaServerTest
