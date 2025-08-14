/**
 */
package es.udima.cesarlaso.tfm.healthmonitors;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Storage Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.udima.cesarlaso.tfm.healthmonitors.StorageData#getPartitions <em>Partitions</em>}</li>
 *   <li>{@link es.udima.cesarlaso.tfm.healthmonitors.StorageData#getStats <em>Stats</em>}</li>
 * </ul>
 *
 * @see es.udima.cesarlaso.tfm.healthmonitors.HealthmonitorsPackage#getStorageData()
 * @model
 * @generated
 */
public interface StorageData extends HealthMonitorData, Storage {
	/**
	 * Returns the value of the '<em><b>Partitions</b></em>' containment reference list.
	 * The list contents are of type {@link es.udima.cesarlaso.tfm.healthmonitors.StoragePartition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partitions</em>' containment reference list.
	 * @see es.udima.cesarlaso.tfm.healthmonitors.HealthmonitorsPackage#getStorageData_Partitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<StoragePartition> getPartitions();

	/**
	 * Returns the value of the '<em><b>Stats</b></em>' containment reference list.
	 * The list contents are of type {@link es.udima.cesarlaso.tfm.healthmonitors.StorageStats}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stats</em>' containment reference list.
	 * @see es.udima.cesarlaso.tfm.healthmonitors.HealthmonitorsPackage#getStorageData_Stats()
	 * @model containment="true"
	 * @generated
	 */
	EList<StorageStats> getStats();

} // StorageData
