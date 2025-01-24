/**
 */
package es.udima.cesarlaso.tfm.healthmonitors;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see es.udima.cesarlaso.tfm.healthmonitors.HealthmonitorsPackage
 * @generated
 */
public interface HealthmonitorsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HealthmonitorsFactory eINSTANCE = es.udima.cesarlaso.tfm.healthmonitors.impl.HealthmonitorsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Storage Partition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Storage Partition</em>'.
	 * @generated
	 */
	StoragePartition createStoragePartition();

	/**
	 * Returns a new object of class '<em>Storage Stats</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Storage Stats</em>'.
	 * @generated
	 */
	StorageStats createStorageStats();

	/**
	 * Returns a new object of class '<em>Network Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Network Interface</em>'.
	 * @generated
	 */
	NetworkInterface createNetworkInterface();

	/**
	 * Returns a new object of class '<em>Cpu Load Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cpu Load Item</em>'.
	 * @generated
	 */
	CpuLoadItem createCpuLoadItem();

	/**
	 * Returns a new object of class '<em>Ram Load Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ram Load Item</em>'.
	 * @generated
	 */
	RamLoadItem createRamLoadItem();

	/**
	 * Returns a new object of class '<em>Cpu Temperature Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cpu Temperature Item</em>'.
	 * @generated
	 */
	CpuTemperatureItem createCpuTemperatureItem();

	/**
	 * Returns a new object of class '<em>Gpu Temperature Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gpu Temperature Item</em>'.
	 * @generated
	 */
	GpuTemperatureItem createGpuTemperatureItem();

	/**
	 * Returns a new object of class '<em>Storage Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Storage Item</em>'.
	 * @generated
	 */
	StorageItem createStorageItem();

	/**
	 * Returns a new object of class '<em>Network Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Network Item</em>'.
	 * @generated
	 */
	NetworkItem createNetworkItem();

	/**
	 * Returns a new object of class '<em>Cpu Load Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cpu Load Data</em>'.
	 * @generated
	 */
	CpuLoadData createCpuLoadData();

	/**
	 * Returns a new object of class '<em>Ram Load Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ram Load Data</em>'.
	 * @generated
	 */
	RamLoadData createRamLoadData();

	/**
	 * Returns a new object of class '<em>Cpu Temperature Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cpu Temperature Data</em>'.
	 * @generated
	 */
	CpuTemperatureData createCpuTemperatureData();

	/**
	 * Returns a new object of class '<em>Gpu Temperature Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gpu Temperature Data</em>'.
	 * @generated
	 */
	GpuTemperatureData createGpuTemperatureData();

	/**
	 * Returns a new object of class '<em>Storage Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Storage Data</em>'.
	 * @generated
	 */
	StorageData createStorageData();

	/**
	 * Returns a new object of class '<em>Network Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Network Data</em>'.
	 * @generated
	 */
	NetworkData createNetworkData();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	HealthmonitorsPackage getHealthmonitorsPackage();

} //HealthmonitorsFactory
