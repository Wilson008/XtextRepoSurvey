/**
 */
package es.udima.cesarlaso.tfm.healthmonitors.impl;

import es.udima.cesarlaso.tfm.healthmonitors.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HealthmonitorsFactoryImpl extends EFactoryImpl implements HealthmonitorsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HealthmonitorsFactory init() {
		try {
			HealthmonitorsFactory theHealthmonitorsFactory = (HealthmonitorsFactory)EPackage.Registry.INSTANCE.getEFactory(HealthmonitorsPackage.eNS_URI);
			if (theHealthmonitorsFactory != null) {
				return theHealthmonitorsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HealthmonitorsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HealthmonitorsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case HealthmonitorsPackage.STORAGE_PARTITION: return createStoragePartition();
			case HealthmonitorsPackage.STORAGE_STATS: return createStorageStats();
			case HealthmonitorsPackage.NETWORK_INTERFACE: return createNetworkInterface();
			case HealthmonitorsPackage.CPU_LOAD_ITEM: return createCpuLoadItem();
			case HealthmonitorsPackage.RAM_LOAD_ITEM: return createRamLoadItem();
			case HealthmonitorsPackage.CPU_TEMPERATURE_ITEM: return createCpuTemperatureItem();
			case HealthmonitorsPackage.GPU_TEMPERATURE_ITEM: return createGpuTemperatureItem();
			case HealthmonitorsPackage.STORAGE_ITEM: return createStorageItem();
			case HealthmonitorsPackage.NETWORK_ITEM: return createNetworkItem();
			case HealthmonitorsPackage.CPU_LOAD_DATA: return createCpuLoadData();
			case HealthmonitorsPackage.RAM_LOAD_DATA: return createRamLoadData();
			case HealthmonitorsPackage.CPU_TEMPERATURE_DATA: return createCpuTemperatureData();
			case HealthmonitorsPackage.GPU_TEMPERATURE_DATA: return createGpuTemperatureData();
			case HealthmonitorsPackage.STORAGE_DATA: return createStorageData();
			case HealthmonitorsPackage.NETWORK_DATA: return createNetworkData();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StoragePartition createStoragePartition() {
		StoragePartitionImpl storagePartition = new StoragePartitionImpl();
		return storagePartition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StorageStats createStorageStats() {
		StorageStatsImpl storageStats = new StorageStatsImpl();
		return storageStats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NetworkInterface createNetworkInterface() {
		NetworkInterfaceImpl networkInterface = new NetworkInterfaceImpl();
		return networkInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CpuLoadItem createCpuLoadItem() {
		CpuLoadItemImpl cpuLoadItem = new CpuLoadItemImpl();
		return cpuLoadItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RamLoadItem createRamLoadItem() {
		RamLoadItemImpl ramLoadItem = new RamLoadItemImpl();
		return ramLoadItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CpuTemperatureItem createCpuTemperatureItem() {
		CpuTemperatureItemImpl cpuTemperatureItem = new CpuTemperatureItemImpl();
		return cpuTemperatureItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GpuTemperatureItem createGpuTemperatureItem() {
		GpuTemperatureItemImpl gpuTemperatureItem = new GpuTemperatureItemImpl();
		return gpuTemperatureItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StorageItem createStorageItem() {
		StorageItemImpl storageItem = new StorageItemImpl();
		return storageItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NetworkItem createNetworkItem() {
		NetworkItemImpl networkItem = new NetworkItemImpl();
		return networkItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CpuLoadData createCpuLoadData() {
		CpuLoadDataImpl cpuLoadData = new CpuLoadDataImpl();
		return cpuLoadData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RamLoadData createRamLoadData() {
		RamLoadDataImpl ramLoadData = new RamLoadDataImpl();
		return ramLoadData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CpuTemperatureData createCpuTemperatureData() {
		CpuTemperatureDataImpl cpuTemperatureData = new CpuTemperatureDataImpl();
		return cpuTemperatureData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GpuTemperatureData createGpuTemperatureData() {
		GpuTemperatureDataImpl gpuTemperatureData = new GpuTemperatureDataImpl();
		return gpuTemperatureData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StorageData createStorageData() {
		StorageDataImpl storageData = new StorageDataImpl();
		return storageData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NetworkData createNetworkData() {
		NetworkDataImpl networkData = new NetworkDataImpl();
		return networkData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HealthmonitorsPackage getHealthmonitorsPackage() {
		return (HealthmonitorsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static HealthmonitorsPackage getPackage() {
		return HealthmonitorsPackage.eINSTANCE;
	}

} //HealthmonitorsFactoryImpl
