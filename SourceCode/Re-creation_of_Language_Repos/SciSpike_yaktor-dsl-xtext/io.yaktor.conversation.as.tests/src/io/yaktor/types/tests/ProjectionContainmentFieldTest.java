/**
 */
package io.yaktor.types.tests;

import io.yaktor.types.ProjectionContainmentField;
import io.yaktor.types.TypesFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Projection Containment Field</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProjectionContainmentFieldTest extends ProjectionFieldTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProjectionContainmentFieldTest.class);
	}

	/**
	 * Constructs a new Projection Containment Field test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectionContainmentFieldTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Projection Containment Field test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ProjectionContainmentField getFixture() {
		return (ProjectionContainmentField)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TypesFactory.eINSTANCE.createProjectionContainmentField());
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

} //ProjectionContainmentFieldTest
