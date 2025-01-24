/**
 */
package es.udima.cesarlaso.tfm.healthmonitors.tests;

import es.udima.cesarlaso.tfm.healthmonitors.HealthmonitorsFactory;
import es.udima.cesarlaso.tfm.healthmonitors.RamLoadData;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Ram Load Data</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RamLoadDataTest extends HealthMonitorDataTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RamLoadDataTest.class);
	}

	/**
	 * Constructs a new Ram Load Data test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RamLoadDataTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Ram Load Data test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RamLoadData getFixture() {
		return (RamLoadData)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(HealthmonitorsFactory.eINSTANCE.createRamLoadData());
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

} //RamLoadDataTest
