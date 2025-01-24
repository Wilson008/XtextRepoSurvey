/**
 */
package es.udima.cesarlaso.tfm.operatingsystemactuators.tests;

import es.udima.cesarlaso.tfm.operatingsystemactuators.OperatingsystemactuatorsFactory;
import es.udima.cesarlaso.tfm.operatingsystemactuators.PlayVideo;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Play Video</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PlayVideoTest extends ScreenTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PlayVideoTest.class);
	}

	/**
	 * Constructs a new Play Video test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlayVideoTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Play Video test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PlayVideo getFixture() {
		return (PlayVideo)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OperatingsystemactuatorsFactory.eINSTANCE.createPlayVideo());
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

} //PlayVideoTest
