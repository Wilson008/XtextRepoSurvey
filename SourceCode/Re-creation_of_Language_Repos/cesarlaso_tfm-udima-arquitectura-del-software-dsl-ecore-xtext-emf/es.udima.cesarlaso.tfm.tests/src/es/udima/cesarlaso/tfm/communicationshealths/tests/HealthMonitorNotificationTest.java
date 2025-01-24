/**
 */
package es.udima.cesarlaso.tfm.communicationshealths.tests;

import es.udima.cesarlaso.tfm.communicationshealths.CommunicationshealthsFactory;
import es.udima.cesarlaso.tfm.communicationshealths.HealthMonitorNotification;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Health Monitor Notification</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class HealthMonitorNotificationTest extends HealthServiceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(HealthMonitorNotificationTest.class);
	}

	/**
	 * Constructs a new Health Monitor Notification test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HealthMonitorNotificationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Health Monitor Notification test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected HealthMonitorNotification getFixture() {
		return (HealthMonitorNotification)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CommunicationshealthsFactory.eINSTANCE.createHealthMonitorNotification());
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

} //HealthMonitorNotificationTest
