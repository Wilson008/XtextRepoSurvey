/**
 */
package es.udima.cesarlaso.tfm.healthmonitors.util;

import es.udima.cesarlaso.tfm.healthmonitors.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see es.udima.cesarlaso.tfm.healthmonitors.HealthmonitorsPackage
 * @generated
 */
public class HealthmonitorsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static HealthmonitorsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HealthmonitorsSwitch() {
		if (modelPackage == null) {
			modelPackage = HealthmonitorsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case HealthmonitorsPackage.HEALTH_MONITOR: {
				HealthMonitor healthMonitor = (HealthMonitor)theEObject;
				T result = caseHealthMonitor(healthMonitor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HealthmonitorsPackage.HEALTH_MONITOR_ITEM: {
				HealthMonitorItem healthMonitorItem = (HealthMonitorItem)theEObject;
				T result = caseHealthMonitorItem(healthMonitorItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HealthmonitorsPackage.HEALTH_MONITOR_DATA: {
				HealthMonitorData healthMonitorData = (HealthMonitorData)theEObject;
				T result = caseHealthMonitorData(healthMonitorData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HealthmonitorsPackage.LOAD: {
				Load load = (Load)theEObject;
				T result = caseLoad(load);
				if (result == null) result = caseHealthMonitor(load);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HealthmonitorsPackage.CPU_LOAD: {
				CpuLoad cpuLoad = (CpuLoad)theEObject;
				T result = caseCpuLoad(cpuLoad);
				if (result == null) result = caseLoad(cpuLoad);
				if (result == null) result = caseHealthMonitor(cpuLoad);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HealthmonitorsPackage.RAM_LOAD: {
				RamLoad ramLoad = (RamLoad)theEObject;
				T result = caseRamLoad(ramLoad);
				if (result == null) result = caseLoad(ramLoad);
				if (result == null) result = caseHealthMonitor(ramLoad);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HealthmonitorsPackage.TEMPERATURE: {
				Temperature temperature = (Temperature)theEObject;
				T result = caseTemperature(temperature);
				if (result == null) result = caseHealthMonitor(temperature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HealthmonitorsPackage.CPU_TEMPERATURE: {
				CpuTemperature cpuTemperature = (CpuTemperature)theEObject;
				T result = caseCpuTemperature(cpuTemperature);
				if (result == null) result = caseTemperature(cpuTemperature);
				if (result == null) result = caseHealthMonitor(cpuTemperature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HealthmonitorsPackage.GPU_TEMPERATURE: {
				GpuTemperature gpuTemperature = (GpuTemperature)theEObject;
				T result = caseGpuTemperature(gpuTemperature);
				if (result == null) result = caseTemperature(gpuTemperature);
				if (result == null) result = caseHealthMonitor(gpuTemperature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HealthmonitorsPackage.STORAGE: {
				Storage storage = (Storage)theEObject;
				T result = caseStorage(storage);
				if (result == null) result = caseHealthMonitor(storage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HealthmonitorsPackage.NETWORK: {
				Network network = (Network)theEObject;
				T result = caseNetwork(network);
				if (result == null) result = caseHealthMonitor(network);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HealthmonitorsPackage.STORAGE_PARTITION: {
				StoragePartition storagePartition = (StoragePartition)theEObject;
				T result = caseStoragePartition(storagePartition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HealthmonitorsPackage.STORAGE_STATS: {
				StorageStats storageStats = (StorageStats)theEObject;
				T result = caseStorageStats(storageStats);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HealthmonitorsPackage.NETWORK_INTERFACE: {
				NetworkInterface networkInterface = (NetworkInterface)theEObject;
				T result = caseNetworkInterface(networkInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HealthmonitorsPackage.CPU_LOAD_ITEM: {
				CpuLoadItem cpuLoadItem = (CpuLoadItem)theEObject;
				T result = caseCpuLoadItem(cpuLoadItem);
				if (result == null) result = caseHealthMonitorItem(cpuLoadItem);
				if (result == null) result = caseCpuLoad(cpuLoadItem);
				if (result == null) result = caseLoad(cpuLoadItem);
				if (result == null) result = caseHealthMonitor(cpuLoadItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HealthmonitorsPackage.RAM_LOAD_ITEM: {
				RamLoadItem ramLoadItem = (RamLoadItem)theEObject;
				T result = caseRamLoadItem(ramLoadItem);
				if (result == null) result = caseHealthMonitorItem(ramLoadItem);
				if (result == null) result = caseRamLoad(ramLoadItem);
				if (result == null) result = caseLoad(ramLoadItem);
				if (result == null) result = caseHealthMonitor(ramLoadItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HealthmonitorsPackage.CPU_TEMPERATURE_ITEM: {
				CpuTemperatureItem cpuTemperatureItem = (CpuTemperatureItem)theEObject;
				T result = caseCpuTemperatureItem(cpuTemperatureItem);
				if (result == null) result = caseHealthMonitorItem(cpuTemperatureItem);
				if (result == null) result = caseCpuTemperature(cpuTemperatureItem);
				if (result == null) result = caseTemperature(cpuTemperatureItem);
				if (result == null) result = caseHealthMonitor(cpuTemperatureItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HealthmonitorsPackage.GPU_TEMPERATURE_ITEM: {
				GpuTemperatureItem gpuTemperatureItem = (GpuTemperatureItem)theEObject;
				T result = caseGpuTemperatureItem(gpuTemperatureItem);
				if (result == null) result = caseHealthMonitorItem(gpuTemperatureItem);
				if (result == null) result = caseGpuTemperature(gpuTemperatureItem);
				if (result == null) result = caseTemperature(gpuTemperatureItem);
				if (result == null) result = caseHealthMonitor(gpuTemperatureItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HealthmonitorsPackage.STORAGE_ITEM: {
				StorageItem storageItem = (StorageItem)theEObject;
				T result = caseStorageItem(storageItem);
				if (result == null) result = caseHealthMonitorItem(storageItem);
				if (result == null) result = caseStorage(storageItem);
				if (result == null) result = caseHealthMonitor(storageItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HealthmonitorsPackage.NETWORK_ITEM: {
				NetworkItem networkItem = (NetworkItem)theEObject;
				T result = caseNetworkItem(networkItem);
				if (result == null) result = caseHealthMonitorItem(networkItem);
				if (result == null) result = caseNetwork(networkItem);
				if (result == null) result = caseHealthMonitor(networkItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HealthmonitorsPackage.CPU_LOAD_DATA: {
				CpuLoadData cpuLoadData = (CpuLoadData)theEObject;
				T result = caseCpuLoadData(cpuLoadData);
				if (result == null) result = caseHealthMonitorData(cpuLoadData);
				if (result == null) result = caseCpuLoad(cpuLoadData);
				if (result == null) result = caseLoad(cpuLoadData);
				if (result == null) result = caseHealthMonitor(cpuLoadData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HealthmonitorsPackage.RAM_LOAD_DATA: {
				RamLoadData ramLoadData = (RamLoadData)theEObject;
				T result = caseRamLoadData(ramLoadData);
				if (result == null) result = caseHealthMonitorData(ramLoadData);
				if (result == null) result = caseRamLoad(ramLoadData);
				if (result == null) result = caseLoad(ramLoadData);
				if (result == null) result = caseHealthMonitor(ramLoadData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HealthmonitorsPackage.CPU_TEMPERATURE_DATA: {
				CpuTemperatureData cpuTemperatureData = (CpuTemperatureData)theEObject;
				T result = caseCpuTemperatureData(cpuTemperatureData);
				if (result == null) result = caseHealthMonitorData(cpuTemperatureData);
				if (result == null) result = caseCpuTemperature(cpuTemperatureData);
				if (result == null) result = caseTemperature(cpuTemperatureData);
				if (result == null) result = caseHealthMonitor(cpuTemperatureData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HealthmonitorsPackage.GPU_TEMPERATURE_DATA: {
				GpuTemperatureData gpuTemperatureData = (GpuTemperatureData)theEObject;
				T result = caseGpuTemperatureData(gpuTemperatureData);
				if (result == null) result = caseHealthMonitorData(gpuTemperatureData);
				if (result == null) result = caseGpuTemperature(gpuTemperatureData);
				if (result == null) result = caseTemperature(gpuTemperatureData);
				if (result == null) result = caseHealthMonitor(gpuTemperatureData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HealthmonitorsPackage.STORAGE_DATA: {
				StorageData storageData = (StorageData)theEObject;
				T result = caseStorageData(storageData);
				if (result == null) result = caseHealthMonitorData(storageData);
				if (result == null) result = caseStorage(storageData);
				if (result == null) result = caseHealthMonitor(storageData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HealthmonitorsPackage.NETWORK_DATA: {
				NetworkData networkData = (NetworkData)theEObject;
				T result = caseNetworkData(networkData);
				if (result == null) result = caseHealthMonitorData(networkData);
				if (result == null) result = caseNetwork(networkData);
				if (result == null) result = caseHealthMonitor(networkData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Health Monitor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Health Monitor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHealthMonitor(HealthMonitor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Health Monitor Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Health Monitor Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHealthMonitorItem(HealthMonitorItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Health Monitor Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Health Monitor Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHealthMonitorData(HealthMonitorData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Load</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Load</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoad(Load object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cpu Load</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cpu Load</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCpuLoad(CpuLoad object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ram Load</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ram Load</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRamLoad(RamLoad object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Temperature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Temperature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemperature(Temperature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cpu Temperature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cpu Temperature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCpuTemperature(CpuTemperature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gpu Temperature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gpu Temperature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGpuTemperature(GpuTemperature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Storage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Storage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStorage(Storage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetwork(Network object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Storage Partition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Storage Partition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStoragePartition(StoragePartition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Storage Stats</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Storage Stats</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStorageStats(StorageStats object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworkInterface(NetworkInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cpu Load Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cpu Load Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCpuLoadItem(CpuLoadItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ram Load Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ram Load Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRamLoadItem(RamLoadItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cpu Temperature Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cpu Temperature Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCpuTemperatureItem(CpuTemperatureItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gpu Temperature Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gpu Temperature Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGpuTemperatureItem(GpuTemperatureItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Storage Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Storage Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStorageItem(StorageItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworkItem(NetworkItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cpu Load Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cpu Load Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCpuLoadData(CpuLoadData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ram Load Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ram Load Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRamLoadData(RamLoadData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cpu Temperature Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cpu Temperature Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCpuTemperatureData(CpuTemperatureData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gpu Temperature Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gpu Temperature Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGpuTemperatureData(GpuTemperatureData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Storage Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Storage Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStorageData(StorageData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworkData(NetworkData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //HealthmonitorsSwitch
