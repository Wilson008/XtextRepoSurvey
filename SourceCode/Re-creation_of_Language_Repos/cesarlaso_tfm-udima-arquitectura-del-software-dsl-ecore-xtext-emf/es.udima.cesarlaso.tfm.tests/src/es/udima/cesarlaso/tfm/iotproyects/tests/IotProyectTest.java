/**
 */
package es.udima.cesarlaso.tfm.iotproyects.tests;

import es.udima.cesarlaso.tfm.iotproyects.IotProyect;
import es.udima.cesarlaso.tfm.iotproyects.IotproyectsFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Iot Proyect</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IotProyectTest extends TestCase {

	/**
	 * The fixture for this Iot Proyect test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IotProyect fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IotProyectTest.class);
	}

	/**
	 * Constructs a new Iot Proyect test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IotProyectTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Iot Proyect test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(IotProyect fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Iot Proyect test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IotProyect getFixture() {
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
		setFixture(IotproyectsFactory.eINSTANCE.createIotProyect());
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

} //IotProyectTest
