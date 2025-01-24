/**
 */
package es.udima.cesarlaso.tfm.healthmonitors.tests;

import es.udima.cesarlaso.tfm.healthmonitors.HealthmonitorsFactory;
import es.udima.cesarlaso.tfm.healthmonitors.StoragePartition;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Storage Partition</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StoragePartitionTest extends TestCase {

	/**
	 * The fixture for this Storage Partition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StoragePartition fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StoragePartitionTest.class);
	}

	/**
	 * Constructs a new Storage Partition test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StoragePartitionTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Storage Partition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(StoragePartition fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Storage Partition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StoragePartition getFixture() {
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
		setFixture(HealthmonitorsFactory.eINSTANCE.createStoragePartition());
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

} //StoragePartitionTest
