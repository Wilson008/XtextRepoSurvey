/**
 */
package es.udima.cesarlaso.tfm.operatingsystemactuators.tests;

import es.udima.cesarlaso.tfm.operatingsystemactuators.DrawImage;
import es.udima.cesarlaso.tfm.operatingsystemactuators.OperatingsystemactuatorsFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Draw Image</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DrawImageTest extends ScreenTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DrawImageTest.class);
	}

	/**
	 * Constructs a new Draw Image test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DrawImageTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Draw Image test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DrawImage getFixture() {
		return (DrawImage)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OperatingsystemactuatorsFactory.eINSTANCE.createDrawImage());
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

} //DrawImageTest
