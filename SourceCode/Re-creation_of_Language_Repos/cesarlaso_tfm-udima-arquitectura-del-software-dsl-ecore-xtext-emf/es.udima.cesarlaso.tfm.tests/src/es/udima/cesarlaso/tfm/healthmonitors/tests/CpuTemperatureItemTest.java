/**
 */
package es.udima.cesarlaso.tfm.healthmonitors.tests;

import es.udima.cesarlaso.tfm.healthmonitors.CpuTemperatureItem;
import es.udima.cesarlaso.tfm.healthmonitors.HealthmonitorsFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Cpu Temperature Item</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CpuTemperatureItemTest extends HealthMonitorItemTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CpuTemperatureItemTest.class);
	}

	/**
	 * Constructs a new Cpu Temperature Item test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CpuTemperatureItemTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Cpu Temperature Item test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CpuTemperatureItem getFixture() {
		return (CpuTemperatureItem)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(HealthmonitorsFactory.eINSTANCE.createCpuTemperatureItem());
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

} //CpuTemperatureItemTest
