/**
 */
package es.udima.cesarlaso.tfm.gpiosactuators.tests;

import es.udima.cesarlaso.tfm.gpiosactuators.GpiosactuatorsFactory;
import es.udima.cesarlaso.tfm.gpiosactuators.TransformTo;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Transform To</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TransformToTest extends AnalogActuatorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TransformToTest.class);
	}

	/**
	 * Constructs a new Transform To test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformToTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Transform To test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TransformTo getFixture() {
		return (TransformTo)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GpiosactuatorsFactory.eINSTANCE.createTransformTo());
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

} //TransformToTest
