/**
 */
package es.udima.cesarlaso.tfm.healthmonitors;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Storage Stats</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.udima.cesarlaso.tfm.healthmonitors.StorageStats#getDevice <em>Device</em>}</li>
 *   <li>{@link es.udima.cesarlaso.tfm.healthmonitors.StorageStats#getReads <em>Reads</em>}</li>
 *   <li>{@link es.udima.cesarlaso.tfm.healthmonitors.StorageStats#getWrites <em>Writes</em>}</li>
 * </ul>
 *
 * @see es.udima.cesarlaso.tfm.healthmonitors.HealthmonitorsPackage#getStorageStats()
 * @model
 * @generated
 */
public interface StorageStats extends EObject {
	/**
	 * Returns the value of the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device</em>' attribute.
	 * @see #setDevice(String)
	 * @see es.udima.cesarlaso.tfm.healthmonitors.HealthmonitorsPackage#getStorageStats_Device()
	 * @model required="true"
	 * @generated
	 */
	String getDevice();

	/**
	 * Sets the value of the '{@link es.udima.cesarlaso.tfm.healthmonitors.StorageStats#getDevice <em>Device</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device</em>' attribute.
	 * @see #getDevice()
	 * @generated
	 */
	void setDevice(String value);

	/**
	 * Returns the value of the '<em><b>Reads</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reads</em>' attribute.
	 * @see #setReads(long)
	 * @see es.udima.cesarlaso.tfm.healthmonitors.HealthmonitorsPackage#getStorageStats_Reads()
	 * @model required="true"
	 * @generated
	 */
	long getReads();

	/**
	 * Sets the value of the '{@link es.udima.cesarlaso.tfm.healthmonitors.StorageStats#getReads <em>Reads</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reads</em>' attribute.
	 * @see #getReads()
	 * @generated
	 */
	void setReads(long value);

	/**
	 * Returns the value of the '<em><b>Writes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Writes</em>' attribute.
	 * @see #setWrites(long)
	 * @see es.udima.cesarlaso.tfm.healthmonitors.HealthmonitorsPackage#getStorageStats_Writes()
	 * @model required="true"
	 * @generated
	 */
	long getWrites();

	/**
	 * Sets the value of the '{@link es.udima.cesarlaso.tfm.healthmonitors.StorageStats#getWrites <em>Writes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Writes</em>' attribute.
	 * @see #getWrites()
	 * @generated
	 */
	void setWrites(long value);

} // StorageStats
