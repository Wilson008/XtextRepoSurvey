/**
 */
package es.udima.cesarlaso.tfm.communicationsprograms.tests;

import es.udima.cesarlaso.tfm.communicationsprograms.CommunicationsprogramsFactory;
import es.udima.cesarlaso.tfm.communicationsprograms.ProgramEventEvent;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Program Event Event</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProgramEventEventTest extends ProgramServiceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProgramEventEventTest.class);
	}

	/**
	 * Constructs a new Program Event Event test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgramEventEventTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Program Event Event test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ProgramEventEvent getFixture() {
		return (ProgramEventEvent)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CommunicationsprogramsFactory.eINSTANCE.createProgramEventEvent());
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

} //ProgramEventEventTest
