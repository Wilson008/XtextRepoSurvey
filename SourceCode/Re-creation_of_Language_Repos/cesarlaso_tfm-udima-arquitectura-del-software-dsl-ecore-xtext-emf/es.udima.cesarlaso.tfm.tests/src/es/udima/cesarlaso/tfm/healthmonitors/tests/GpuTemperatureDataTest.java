/**
 */
package es.udima.cesarlaso.tfm.healthmonitors.tests;

import es.udima.cesarlaso.tfm.healthmonitors.GpuTemperatureData;
import es.udima.cesarlaso.tfm.healthmonitors.HealthmonitorsFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Gpu Temperature Data</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GpuTemperatureDataTest extends HealthMonitorDataTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GpuTemperatureDataTest.class);
	}

	/**
	 * Constructs a new Gpu Temperature Data test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GpuTemperatureDataTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Gpu Temperature Data test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected GpuTemperatureData getFixture() {
		return (GpuTemperatureData)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(HealthmonitorsFactory.eINSTANCE.createGpuTemperatureData());
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

} //GpuTemperatureDataTest
