/**
 */
package es.udima.cesarlaso.tfm.operatingsystemactuators.tests;

import es.udima.cesarlaso.tfm.operatingsystemactuators.Download;
import es.udima.cesarlaso.tfm.operatingsystemactuators.OperatingsystemactuatorsFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Download</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DownloadTest extends OperatingSystemActuatorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DownloadTest.class);
	}

	/**
	 * Constructs a new Download test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DownloadTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Download test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Download getFixture() {
		return (Download)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OperatingsystemactuatorsFactory.eINSTANCE.createDownload());
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

} //DownloadTest
