/**
 */
package es.udima.cesarlaso.tfm.communicationsprograms.tests;

import es.udima.cesarlaso.tfm.communicationsprograms.CommunicationsprogramsFactory;
import es.udima.cesarlaso.tfm.communicationsprograms.ProgramActuatorService;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Program Actuator Service</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProgramActuatorServiceTest extends ProgramServiceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProgramActuatorServiceTest.class);
	}

	/**
	 * Constructs a new Program Actuator Service test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgramActuatorServiceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Program Actuator Service test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ProgramActuatorService getFixture() {
		return (ProgramActuatorService)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CommunicationsprogramsFactory.eINSTANCE.createProgramActuatorService());
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

} //ProgramActuatorServiceTest
