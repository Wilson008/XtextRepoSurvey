/**
 */
package es.udima.cesarlaso.tfm.healthmonitors;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Storage Partition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.udima.cesarlaso.tfm.healthmonitors.StoragePartition#getDevice <em>Device</em>}</li>
 *   <li>{@link es.udima.cesarlaso.tfm.healthmonitors.StoragePartition#getMount <em>Mount</em>}</li>
 *   <li>{@link es.udima.cesarlaso.tfm.healthmonitors.StoragePartition#getFileSystem <em>File System</em>}</li>
 *   <li>{@link es.udima.cesarlaso.tfm.healthmonitors.StoragePartition#getInodeFree <em>Inode Free</em>}</li>
 *   <li>{@link es.udima.cesarlaso.tfm.healthmonitors.StoragePartition#getInodeTotal <em>Inode Total</em>}</li>
 *   <li>{@link es.udima.cesarlaso.tfm.healthmonitors.StoragePartition#getSpaceFree <em>Space Free</em>}</li>
 *   <li>{@link es.udima.cesarlaso.tfm.healthmonitors.StoragePartition#getSpaceTotal <em>Space Total</em>}</li>
 * </ul>
 *
 * @see es.udima.cesarlaso.tfm.healthmonitors.HealthmonitorsPackage#getStoragePartition()
 * @model
 * @generated
 */
public interface StoragePartition extends EObject {
	/**
	 * Returns the value of the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device</em>' attribute.
	 * @see #setDevice(String)
	 * @see es.udima.cesarlaso.tfm.healthmonitors.HealthmonitorsPackage#getStoragePartition_Device()
	 * @model required="true"
	 * @generated
	 */
	String getDevice();

	/**
	 * Sets the value of the '{@link es.udima.cesarlaso.tfm.healthmonitors.StoragePartition#getDevice <em>Device</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device</em>' attribute.
	 * @see #getDevice()
	 * @generated
	 */
	void setDevice(String value);

	/**
	 * Returns the value of the '<em><b>Mount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mount</em>' attribute.
	 * @see #setMount(String)
	 * @see es.udima.cesarlaso.tfm.healthmonitors.HealthmonitorsPackage#getStoragePartition_Mount()
	 * @model required="true"
	 * @generated
	 */
	String getMount();

	/**
	 * Sets the value of the '{@link es.udima.cesarlaso.tfm.healthmonitors.StoragePartition#getMount <em>Mount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mount</em>' attribute.
	 * @see #getMount()
	 * @generated
	 */
	void setMount(String value);

	/**
	 * Returns the value of the '<em><b>File System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File System</em>' attribute.
	 * @see #setFileSystem(String)
	 * @see es.udima.cesarlaso.tfm.healthmonitors.HealthmonitorsPackage#getStoragePartition_FileSystem()
	 * @model required="true"
	 * @generated
	 */
	String getFileSystem();

	/**
	 * Sets the value of the '{@link es.udima.cesarlaso.tfm.healthmonitors.StoragePartition#getFileSystem <em>File System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File System</em>' attribute.
	 * @see #getFileSystem()
	 * @generated
	 */
	void setFileSystem(String value);

	/**
	 * Returns the value of the '<em><b>Inode Free</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inode Free</em>' attribute.
	 * @see #setInodeFree(long)
	 * @see es.udima.cesarlaso.tfm.healthmonitors.HealthmonitorsPackage#getStoragePartition_InodeFree()
	 * @model required="true"
	 * @generated
	 */
	long getInodeFree();

	/**
	 * Sets the value of the '{@link es.udima.cesarlaso.tfm.healthmonitors.StoragePartition#getInodeFree <em>Inode Free</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inode Free</em>' attribute.
	 * @see #getInodeFree()
	 * @generated
	 */
	void setInodeFree(long value);

	/**
	 * Returns the value of the '<em><b>Inode Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inode Total</em>' attribute.
	 * @see #setInodeTotal(long)
	 * @see es.udima.cesarlaso.tfm.healthmonitors.HealthmonitorsPackage#getStoragePartition_InodeTotal()
	 * @model required="true"
	 * @generated
	 */
	long getInodeTotal();

	/**
	 * Sets the value of the '{@link es.udima.cesarlaso.tfm.healthmonitors.StoragePartition#getInodeTotal <em>Inode Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inode Total</em>' attribute.
	 * @see #getInodeTotal()
	 * @generated
	 */
	void setInodeTotal(long value);

	/**
	 * Returns the value of the '<em><b>Space Free</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Space Free</em>' attribute.
	 * @see #setSpaceFree(long)
	 * @see es.udima.cesarlaso.tfm.healthmonitors.HealthmonitorsPackage#getStoragePartition_SpaceFree()
	 * @model required="true"
	 * @generated
	 */
	long getSpaceFree();

	/**
	 * Sets the value of the '{@link es.udima.cesarlaso.tfm.healthmonitors.StoragePartition#getSpaceFree <em>Space Free</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Space Free</em>' attribute.
	 * @see #getSpaceFree()
	 * @generated
	 */
	void setSpaceFree(long value);

	/**
	 * Returns the value of the '<em><b>Space Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Space Total</em>' attribute.
	 * @see #setSpaceTotal(long)
	 * @see es.udima.cesarlaso.tfm.healthmonitors.HealthmonitorsPackage#getStoragePartition_SpaceTotal()
	 * @model required="true"
	 * @generated
	 */
	long getSpaceTotal();

	/**
	 * Sets the value of the '{@link es.udima.cesarlaso.tfm.healthmonitors.StoragePartition#getSpaceTotal <em>Space Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Space Total</em>' attribute.
	 * @see #getSpaceTotal()
	 * @generated
	 */
	void setSpaceTotal(long value);

} // StoragePartition
