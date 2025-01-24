/**
 */
package es.udima.cesarlaso.tfm.communicationshealths.tests;

import es.udima.cesarlaso.tfm.communicationshealths.CommunicationshealthsFactory;
import es.udima.cesarlaso.tfm.communicationshealths.HealthService;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Health Service</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class HealthServiceTest extends TestCase {

	/**
	 * The fixture for this Health Service test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HealthService fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(HealthServiceTest.class);
	}

	/**
	 * Constructs a new Health Service test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HealthServiceTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Health Service test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(HealthService fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Health Service test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HealthService getFixture() {
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
		setFixture(CommunicationshealthsFactory.eINSTANCE.createHealthService());
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

} //HealthServiceTest
