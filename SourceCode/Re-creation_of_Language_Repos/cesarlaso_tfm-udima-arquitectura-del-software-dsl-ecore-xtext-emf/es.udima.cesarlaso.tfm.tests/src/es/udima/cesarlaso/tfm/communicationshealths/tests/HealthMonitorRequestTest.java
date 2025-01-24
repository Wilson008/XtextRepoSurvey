/**
 */
package es.udima.cesarlaso.tfm.communicationshealths.tests;

import es.udima.cesarlaso.tfm.communicationshealths.CommunicationshealthsFactory;
import es.udima.cesarlaso.tfm.communicationshealths.HealthMonitorRequest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Health Monitor Request</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class HealthMonitorRequestTest extends HealthServiceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(HealthMonitorRequestTest.class);
	}

	/**
	 * Constructs a new Health Monitor Request test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HealthMonitorRequestTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Health Monitor Request test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected HealthMonitorRequest getFixture() {
		return (HealthMonitorRequest)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CommunicationshealthsFactory.eINSTANCE.createHealthMonitorRequest());
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

} //HealthMonitorRequestTest
