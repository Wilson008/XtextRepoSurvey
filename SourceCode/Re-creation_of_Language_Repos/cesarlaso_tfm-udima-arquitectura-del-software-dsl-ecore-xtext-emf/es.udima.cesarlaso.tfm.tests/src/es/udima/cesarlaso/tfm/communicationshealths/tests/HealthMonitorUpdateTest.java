/**
 */
package es.udima.cesarlaso.tfm.communicationshealths.tests;

import es.udima.cesarlaso.tfm.communicationshealths.CommunicationshealthsFactory;
import es.udima.cesarlaso.tfm.communicationshealths.HealthMonitorUpdate;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Health Monitor Update</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class HealthMonitorUpdateTest extends HealthServiceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(HealthMonitorUpdateTest.class);
	}

	/**
	 * Constructs a new Health Monitor Update test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HealthMonitorUpdateTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Health Monitor Update test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected HealthMonitorUpdate getFixture() {
		return (HealthMonitorUpdate)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CommunicationshealthsFactory.eINSTANCE.createHealthMonitorUpdate());
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

} //HealthMonitorUpdateTest
