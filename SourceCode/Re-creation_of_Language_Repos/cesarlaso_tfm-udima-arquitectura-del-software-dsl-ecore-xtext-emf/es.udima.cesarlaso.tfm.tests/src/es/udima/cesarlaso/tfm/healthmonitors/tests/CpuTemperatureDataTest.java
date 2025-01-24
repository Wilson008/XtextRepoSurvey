/**
 */
package es.udima.cesarlaso.tfm.healthmonitors.tests;

import es.udima.cesarlaso.tfm.healthmonitors.CpuTemperatureData;
import es.udima.cesarlaso.tfm.healthmonitors.HealthmonitorsFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Cpu Temperature Data</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CpuTemperatureDataTest extends HealthMonitorDataTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CpuTemperatureDataTest.class);
	}

	/**
	 * Constructs a new Cpu Temperature Data test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CpuTemperatureDataTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Cpu Temperature Data test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CpuTemperatureData getFixture() {
		return (CpuTemperatureData)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(HealthmonitorsFactory.eINSTANCE.createCpuTemperatureData());
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

} //CpuTemperatureDataTest
