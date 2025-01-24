/**
 */
package es.udima.cesarlaso.tfm.operatingsystemactuators.tests;

import es.udima.cesarlaso.tfm.operatingsystemactuators.FilePath;
import es.udima.cesarlaso.tfm.operatingsystemactuators.OperatingsystemactuatorsFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>File Path</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FilePathTest extends TestCase {

	/**
	 * The fixture for this File Path test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FilePath fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FilePathTest.class);
	}

	/**
	 * Constructs a new File Path test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilePathTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this File Path test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(FilePath fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this File Path test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FilePath getFixture() {
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
		setFixture(OperatingsystemactuatorsFactory.eINSTANCE.createFilePath());
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

} //FilePathTest
