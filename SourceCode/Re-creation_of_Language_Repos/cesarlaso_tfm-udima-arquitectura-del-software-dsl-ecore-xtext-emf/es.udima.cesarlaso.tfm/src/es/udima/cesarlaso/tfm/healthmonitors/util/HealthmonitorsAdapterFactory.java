/**
 */
package es.udima.cesarlaso.tfm.healthmonitors.util;

import es.udima.cesarlaso.tfm.healthmonitors.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see es.udima.cesarlaso.tfm.healthmonitors.HealthmonitorsPackage
 * @generated
 */
public class HealthmonitorsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static HealthmonitorsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HealthmonitorsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = HealthmonitorsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HealthmonitorsSwitch<Adapter> modelSwitch =
		new HealthmonitorsSwitch<Adapter>() {
			@Override
			public Adapter caseHealthMonitor(HealthMonitor object) {
				return createHealthMonitorAdapter();
			}
			@Override
			public Adapter caseHealthMonitorItem(HealthMonitorItem object) {
				return createHealthMonitorItemAdapter();
			}
			@Override
			public Adapter caseHealthMonitorData(HealthMonitorData object) {
				return createHealthMonitorDataAdapter();
			}
			@Override
			public Adapter caseLoad(Load object) {
				return createLoadAdapter();
			}
			@Override
			public Adapter caseCpuLoad(CpuLoad object) {
				return createCpuLoadAdapter();
			}
			@Override
			public Adapter caseRamLoad(RamLoad object) {
				return createRamLoadAdapter();
			}
			@Override
			public Adapter caseTemperature(Temperature object) {
				return createTemperatureAdapter();
			}
			@Override
			public Adapter caseCpuTemperature(CpuTemperature object) {
				return createCpuTemperatureAdapter();
			}
			@Override
			public Adapter caseGpuTemperature(GpuTemperature object) {
				return createGpuTemperatureAdapter();
			}
			@Override
			public Adapter caseStorage(Storage object) {
				return createStorageAdapter();
			}
			@Override
			public Adapter caseNetwork(Network object) {
				return createNetworkAdapter();
			}
			@Override
			public Adapter caseStoragePartition(StoragePartition object) {
				return createStoragePartitionAdapter();
			}
			@Override
			public Adapter caseStorageStats(StorageStats object) {
				return createStorageStatsAdapter();
			}
			@Override
			public Adapter caseNetworkInterface(NetworkInterface object) {
				return createNetworkInterfaceAdapter();
			}
			@Override
			public Adapter caseCpuLoadItem(CpuLoadItem object) {
				return createCpuLoadItemAdapter();
			}
			@Override
			public Adapter caseRamLoadItem(RamLoadItem object) {
				return createRamLoadItemAdapter();
			}
			@Override
			public Adapter caseCpuTemperatureItem(CpuTemperatureItem object) {
				return createCpuTemperatureItemAdapter();
			}
			@Override
			public Adapter caseGpuTemperatureItem(GpuTemperatureItem object) {
				return createGpuTemperatureItemAdapter();
			}
			@Override
			public Adapter caseStorageItem(StorageItem object) {
				return createStorageItemAdapter();
			}
			@Override
			public Adapter caseNetworkItem(NetworkItem object) {
				return createNetworkItemAdapter();
			}
			@Override
			public Adapter caseCpuLoadData(CpuLoadData object) {
				return createCpuLoadDataAdapter();
			}
			@Override
			public Adapter caseRamLoadData(RamLoadData object) {
				return createRamLoadDataAdapter();
			}
			@Override
			public Adapter caseCpuTemperatureData(CpuTemperatureData object) {
				return createCpuTemperatureDataAdapter();
			}
			@Override
			public Adapter caseGpuTemperatureData(GpuTemperatureData object) {
				return createGpuTemperatureDataAdapter();
			}
			@Override
			public Adapter caseStorageData(StorageData object) {
				return createStorageDataAdapter();
			}
			@Override
			public Adapter caseNetworkData(NetworkData object) {
				return createNetworkDataAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link es.udima.cesarlaso.tfm.healthmonitors.HealthMonitor <em>Health Monitor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.udima.cesarlaso.tfm.healthmonitors.HealthMonitor
	 * @generated
	 */
	public Adapter createHealthMonitorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.udima.cesarlaso.tfm.healthmonitors.HealthMonitorItem <em>Health Monitor Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.udima.cesarlaso.tfm.healthmonitors.HealthMonitorItem
	 * @generated
	 */
	public Adapter createHealthMonitorItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.udima.cesarlaso.tfm.healthmonitors.HealthMonitorData <em>Health Monitor Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.udima.cesarlaso.tfm.healthmonitors.HealthMonitorData
	 * @generated
	 */
	public Adapter createHealthMonitorDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.udima.cesarlaso.tfm.healthmonitors.Load <em>Load</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.udima.cesarlaso.tfm.healthmonitors.Load
	 * @generated
	 */
	public Adapter createLoadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.udima.cesarlaso.tfm.healthmonitors.CpuLoad <em>Cpu Load</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.udima.cesarlaso.tfm.healthmonitors.CpuLoad
	 * @generated
	 */
	public Adapter createCpuLoadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.udima.cesarlaso.tfm.healthmonitors.RamLoad <em>Ram Load</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.udima.cesarlaso.tfm.healthmonitors.RamLoad
	 * @generated
	 */
	public Adapter createRamLoadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.udima.cesarlaso.tfm.healthmonitors.Temperature <em>Temperature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.udima.cesarlaso.tfm.healthmonitors.Temperature
	 * @generated
	 */
	public Adapter createTemperatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.udima.cesarlaso.tfm.healthmonitors.CpuTemperature <em>Cpu Temperature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.udima.cesarlaso.tfm.healthmonitors.CpuTemperature
	 * @generated
	 */
	public Adapter createCpuTemperatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.udima.cesarlaso.tfm.healthmonitors.GpuTemperature <em>Gpu Temperature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.udima.cesarlaso.tfm.healthmonitors.GpuTemperature
	 * @generated
	 */
	public Adapter createGpuTemperatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.udima.cesarlaso.tfm.healthmonitors.Storage <em>Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.udima.cesarlaso.tfm.healthmonitors.Storage
	 * @generated
	 */
	public Adapter createStorageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.udima.cesarlaso.tfm.healthmonitors.Network <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.udima.cesarlaso.tfm.healthmonitors.Network
	 * @generated
	 */
	public Adapter createNetworkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.udima.cesarlaso.tfm.healthmonitors.StoragePartition <em>Storage Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.udima.cesarlaso.tfm.healthmonitors.StoragePartition
	 * @generated
	 */
	public Adapter createStoragePartitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.udima.cesarlaso.tfm.healthmonitors.StorageStats <em>Storage Stats</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.udima.cesarlaso.tfm.healthmonitors.StorageStats
	 * @generated
	 */
	public Adapter createStorageStatsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.udima.cesarlaso.tfm.healthmonitors.NetworkInterface <em>Network Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.udima.cesarlaso.tfm.healthmonitors.NetworkInterface
	 * @generated
	 */
	public Adapter createNetworkInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.udima.cesarlaso.tfm.healthmonitors.CpuLoadItem <em>Cpu Load Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.udima.cesarlaso.tfm.healthmonitors.CpuLoadItem
	 * @generated
	 */
	public Adapter createCpuLoadItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.udima.cesarlaso.tfm.healthmonitors.RamLoadItem <em>Ram Load Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.udima.cesarlaso.tfm.healthmonitors.RamLoadItem
	 * @generated
	 */
	public Adapter createRamLoadItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.udima.cesarlaso.tfm.healthmonitors.CpuTemperatureItem <em>Cpu Temperature Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.udima.cesarlaso.tfm.healthmonitors.CpuTemperatureItem
	 * @generated
	 */
	public Adapter createCpuTemperatureItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.udima.cesarlaso.tfm.healthmonitors.GpuTemperatureItem <em>Gpu Temperature Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.udima.cesarlaso.tfm.healthmonitors.GpuTemperatureItem
	 * @generated
	 */
	public Adapter createGpuTemperatureItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.udima.cesarlaso.tfm.healthmonitors.StorageItem <em>Storage Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.udima.cesarlaso.tfm.healthmonitors.StorageItem
	 * @generated
	 */
	public Adapter createStorageItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.udima.cesarlaso.tfm.healthmonitors.NetworkItem <em>Network Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.udima.cesarlaso.tfm.healthmonitors.NetworkItem
	 * @generated
	 */
	public Adapter createNetworkItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.udima.cesarlaso.tfm.healthmonitors.CpuLoadData <em>Cpu Load Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.udima.cesarlaso.tfm.healthmonitors.CpuLoadData
	 * @generated
	 */
	public Adapter createCpuLoadDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.udima.cesarlaso.tfm.healthmonitors.RamLoadData <em>Ram Load Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.udima.cesarlaso.tfm.healthmonitors.RamLoadData
	 * @generated
	 */
	public Adapter createRamLoadDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.udima.cesarlaso.tfm.healthmonitors.CpuTemperatureData <em>Cpu Temperature Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.udima.cesarlaso.tfm.healthmonitors.CpuTemperatureData
	 * @generated
	 */
	public Adapter createCpuTemperatureDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.udima.cesarlaso.tfm.healthmonitors.GpuTemperatureData <em>Gpu Temperature Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.udima.cesarlaso.tfm.healthmonitors.GpuTemperatureData
	 * @generated
	 */
	public Adapter createGpuTemperatureDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.udima.cesarlaso.tfm.healthmonitors.StorageData <em>Storage Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.udima.cesarlaso.tfm.healthmonitors.StorageData
	 * @generated
	 */
	public Adapter createStorageDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.udima.cesarlaso.tfm.healthmonitors.NetworkData <em>Network Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.udima.cesarlaso.tfm.healthmonitors.NetworkData
	 * @generated
	 */
	public Adapter createNetworkDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //HealthmonitorsAdapterFactory
