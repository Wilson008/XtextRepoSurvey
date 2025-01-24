/**
 */
package es.udima.cesarlaso.tfm.healthmonitors.impl;

import es.udima.cesarlaso.tfm.events.EventsPackage;

import es.udima.cesarlaso.tfm.healthmonitors.CpuLoad;
import es.udima.cesarlaso.tfm.healthmonitors.CpuLoadData;
import es.udima.cesarlaso.tfm.healthmonitors.CpuLoadItem;
import es.udima.cesarlaso.tfm.healthmonitors.CpuTemperature;
import es.udima.cesarlaso.tfm.healthmonitors.CpuTemperatureData;
import es.udima.cesarlaso.tfm.healthmonitors.CpuTemperatureItem;
import es.udima.cesarlaso.tfm.healthmonitors.GpuTemperature;
import es.udima.cesarlaso.tfm.healthmonitors.GpuTemperatureData;
import es.udima.cesarlaso.tfm.healthmonitors.GpuTemperatureItem;
import es.udima.cesarlaso.tfm.healthmonitors.HealthMonitor;
import es.udima.cesarlaso.tfm.healthmonitors.HealthMonitorData;
import es.udima.cesarlaso.tfm.healthmonitors.HealthMonitorItem;
import es.udima.cesarlaso.tfm.healthmonitors.HealthmonitorsFactory;
import es.udima.cesarlaso.tfm.healthmonitors.HealthmonitorsPackage;
import es.udima.cesarlaso.tfm.healthmonitors.Load;
import es.udima.cesarlaso.tfm.healthmonitors.Network;
import es.udima.cesarlaso.tfm.healthmonitors.NetworkData;
import es.udima.cesarlaso.tfm.healthmonitors.NetworkInterface;
import es.udima.cesarlaso.tfm.healthmonitors.NetworkItem;
import es.udima.cesarlaso.tfm.healthmonitors.RamLoad;
import es.udima.cesarlaso.tfm.healthmonitors.RamLoadData;
import es.udima.cesarlaso.tfm.healthmonitors.RamLoadItem;
import es.udima.cesarlaso.tfm.healthmonitors.Storage;
import es.udima.cesarlaso.tfm.healthmonitors.StorageData;
import es.udima.cesarlaso.tfm.healthmonitors.StorageItem;
import es.udima.cesarlaso.tfm.healthmonitors.StoragePartition;
import es.udima.cesarlaso.tfm.healthmonitors.StorageStats;
import es.udima.cesarlaso.tfm.healthmonitors.Temperature;

import es.udima.cesarlaso.tfm.timers.TimersPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HealthmonitorsPackageImpl extends EPackageImpl implements HealthmonitorsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass healthMonitorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass healthMonitorItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass healthMonitorDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cpuLoadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ramLoadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass temperatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cpuTemperatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gpuTemperatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storagePartitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storageStatsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cpuLoadItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ramLoadItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cpuTemperatureItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gpuTemperatureItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storageItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cpuLoadDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ramLoadDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cpuTemperatureDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gpuTemperatureDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storageDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkDataEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see es.udima.cesarlaso.tfm.healthmonitors.HealthmonitorsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private HealthmonitorsPackageImpl() {
		super(eNS_URI, HealthmonitorsFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link HealthmonitorsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static HealthmonitorsPackage init() {
		if (isInited) return (HealthmonitorsPackage)EPackage.Registry.INSTANCE.getEPackage(HealthmonitorsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredHealthmonitorsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		HealthmonitorsPackageImpl theHealthmonitorsPackage = registeredHealthmonitorsPackage instanceof HealthmonitorsPackageImpl ? (HealthmonitorsPackageImpl)registeredHealthmonitorsPackage : new HealthmonitorsPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EventsPackage.eINSTANCE.eClass();
		TimersPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theHealthmonitorsPackage.createPackageContents();

		// Initialize created meta-data
		theHealthmonitorsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theHealthmonitorsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(HealthmonitorsPackage.eNS_URI, theHealthmonitorsPackage);
		return theHealthmonitorsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHealthMonitor() {
		return healthMonitorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHealthMonitorItem() {
		return healthMonitorItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHealthMonitorItem_Time() {
		return (EReference)healthMonitorItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHealthMonitorData() {
		return healthMonitorDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHealthMonitorData_AdquisitionTimestamp() {
		return (EAttribute)healthMonitorDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLoad() {
		return loadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCpuLoad() {
		return cpuLoadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRamLoad() {
		return ramLoadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTemperature() {
		return temperatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCpuTemperature() {
		return cpuTemperatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGpuTemperature() {
		return gpuTemperatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStorage() {
		return storageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNetwork() {
		return networkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStoragePartition() {
		return storagePartitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStoragePartition_Device() {
		return (EAttribute)storagePartitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStoragePartition_Mount() {
		return (EAttribute)storagePartitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStoragePartition_FileSystem() {
		return (EAttribute)storagePartitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStoragePartition_InodeFree() {
		return (EAttribute)storagePartitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStoragePartition_InodeTotal() {
		return (EAttribute)storagePartitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStoragePartition_SpaceFree() {
		return (EAttribute)storagePartitionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStoragePartition_SpaceTotal() {
		return (EAttribute)storagePartitionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStorageStats() {
		return storageStatsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStorageStats_Device() {
		return (EAttribute)storageStatsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStorageStats_Reads() {
		return (EAttribute)storageStatsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStorageStats_Writes() {
		return (EAttribute)storageStatsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNetworkInterface() {
		return networkInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetworkInterface_Name() {
		return (EAttribute)networkInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetworkInterface_RxBytes() {
		return (EAttribute)networkInterfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetworkInterface_TxBytes() {
		return (EAttribute)networkInterfaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetworkInterface_RxPackets() {
		return (EAttribute)networkInterfaceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetworkInterface_TxPackets() {
		return (EAttribute)networkInterfaceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCpuLoadItem() {
		return cpuLoadItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRamLoadItem() {
		return ramLoadItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCpuTemperatureItem() {
		return cpuTemperatureItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGpuTemperatureItem() {
		return gpuTemperatureItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStorageItem() {
		return storageItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNetworkItem() {
		return networkItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCpuLoadData() {
		return cpuLoadDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCpuLoadData_Load() {
		return (EAttribute)cpuLoadDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRamLoadData() {
		return ramLoadDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRamLoadData_Size() {
		return (EAttribute)ramLoadDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRamLoadData_Free() {
		return (EAttribute)ramLoadDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCpuTemperatureData() {
		return cpuTemperatureDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCpuTemperatureData_Temperature() {
		return (EAttribute)cpuTemperatureDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGpuTemperatureData() {
		return gpuTemperatureDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGpuTemperatureData_Temperature() {
		return (EAttribute)gpuTemperatureDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStorageData() {
		return storageDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStorageData_Partitions() {
		return (EReference)storageDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStorageData_Stats() {
		return (EReference)storageDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNetworkData() {
		return networkDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNetworkData_Interfaces() {
		return (EReference)networkDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HealthmonitorsFactory getHealthmonitorsFactory() {
		return (HealthmonitorsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		healthMonitorEClass = createEClass(HEALTH_MONITOR);

		healthMonitorItemEClass = createEClass(HEALTH_MONITOR_ITEM);
		createEReference(healthMonitorItemEClass, HEALTH_MONITOR_ITEM__TIME);

		healthMonitorDataEClass = createEClass(HEALTH_MONITOR_DATA);
		createEAttribute(healthMonitorDataEClass, HEALTH_MONITOR_DATA__ADQUISITION_TIMESTAMP);

		loadEClass = createEClass(LOAD);

		cpuLoadEClass = createEClass(CPU_LOAD);

		ramLoadEClass = createEClass(RAM_LOAD);

		temperatureEClass = createEClass(TEMPERATURE);

		cpuTemperatureEClass = createEClass(CPU_TEMPERATURE);

		gpuTemperatureEClass = createEClass(GPU_TEMPERATURE);

		storageEClass = createEClass(STORAGE);

		networkEClass = createEClass(NETWORK);

		storagePartitionEClass = createEClass(STORAGE_PARTITION);
		createEAttribute(storagePartitionEClass, STORAGE_PARTITION__DEVICE);
		createEAttribute(storagePartitionEClass, STORAGE_PARTITION__MOUNT);
		createEAttribute(storagePartitionEClass, STORAGE_PARTITION__FILE_SYSTEM);
		createEAttribute(storagePartitionEClass, STORAGE_PARTITION__INODE_FREE);
		createEAttribute(storagePartitionEClass, STORAGE_PARTITION__INODE_TOTAL);
		createEAttribute(storagePartitionEClass, STORAGE_PARTITION__SPACE_FREE);
		createEAttribute(storagePartitionEClass, STORAGE_PARTITION__SPACE_TOTAL);

		storageStatsEClass = createEClass(STORAGE_STATS);
		createEAttribute(storageStatsEClass, STORAGE_STATS__DEVICE);
		createEAttribute(storageStatsEClass, STORAGE_STATS__READS);
		createEAttribute(storageStatsEClass, STORAGE_STATS__WRITES);

		networkInterfaceEClass = createEClass(NETWORK_INTERFACE);
		createEAttribute(networkInterfaceEClass, NETWORK_INTERFACE__NAME);
		createEAttribute(networkInterfaceEClass, NETWORK_INTERFACE__RX_BYTES);
		createEAttribute(networkInterfaceEClass, NETWORK_INTERFACE__TX_BYTES);
		createEAttribute(networkInterfaceEClass, NETWORK_INTERFACE__RX_PACKETS);
		createEAttribute(networkInterfaceEClass, NETWORK_INTERFACE__TX_PACKETS);

		cpuLoadItemEClass = createEClass(CPU_LOAD_ITEM);

		ramLoadItemEClass = createEClass(RAM_LOAD_ITEM);

		cpuTemperatureItemEClass = createEClass(CPU_TEMPERATURE_ITEM);

		gpuTemperatureItemEClass = createEClass(GPU_TEMPERATURE_ITEM);

		storageItemEClass = createEClass(STORAGE_ITEM);

		networkItemEClass = createEClass(NETWORK_ITEM);

		cpuLoadDataEClass = createEClass(CPU_LOAD_DATA);
		createEAttribute(cpuLoadDataEClass, CPU_LOAD_DATA__LOAD);

		ramLoadDataEClass = createEClass(RAM_LOAD_DATA);
		createEAttribute(ramLoadDataEClass, RAM_LOAD_DATA__SIZE);
		createEAttribute(ramLoadDataEClass, RAM_LOAD_DATA__FREE);

		cpuTemperatureDataEClass = createEClass(CPU_TEMPERATURE_DATA);
		createEAttribute(cpuTemperatureDataEClass, CPU_TEMPERATURE_DATA__TEMPERATURE);

		gpuTemperatureDataEClass = createEClass(GPU_TEMPERATURE_DATA);
		createEAttribute(gpuTemperatureDataEClass, GPU_TEMPERATURE_DATA__TEMPERATURE);

		storageDataEClass = createEClass(STORAGE_DATA);
		createEReference(storageDataEClass, STORAGE_DATA__PARTITIONS);
		createEReference(storageDataEClass, STORAGE_DATA__STATS);

		networkDataEClass = createEClass(NETWORK_DATA);
		createEReference(networkDataEClass, NETWORK_DATA__INTERFACES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		TimersPackage theTimersPackage = (TimersPackage)EPackage.Registry.INSTANCE.getEPackage(TimersPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		loadEClass.getESuperTypes().add(this.getHealthMonitor());
		cpuLoadEClass.getESuperTypes().add(this.getLoad());
		ramLoadEClass.getESuperTypes().add(this.getLoad());
		temperatureEClass.getESuperTypes().add(this.getHealthMonitor());
		cpuTemperatureEClass.getESuperTypes().add(this.getTemperature());
		gpuTemperatureEClass.getESuperTypes().add(this.getTemperature());
		storageEClass.getESuperTypes().add(this.getHealthMonitor());
		networkEClass.getESuperTypes().add(this.getHealthMonitor());
		cpuLoadItemEClass.getESuperTypes().add(this.getHealthMonitorItem());
		cpuLoadItemEClass.getESuperTypes().add(this.getCpuLoad());
		ramLoadItemEClass.getESuperTypes().add(this.getHealthMonitorItem());
		ramLoadItemEClass.getESuperTypes().add(this.getRamLoad());
		cpuTemperatureItemEClass.getESuperTypes().add(this.getHealthMonitorItem());
		cpuTemperatureItemEClass.getESuperTypes().add(this.getCpuTemperature());
		gpuTemperatureItemEClass.getESuperTypes().add(this.getHealthMonitorItem());
		gpuTemperatureItemEClass.getESuperTypes().add(this.getGpuTemperature());
		storageItemEClass.getESuperTypes().add(this.getHealthMonitorItem());
		storageItemEClass.getESuperTypes().add(this.getStorage());
		networkItemEClass.getESuperTypes().add(this.getHealthMonitorItem());
		networkItemEClass.getESuperTypes().add(this.getNetwork());
		cpuLoadDataEClass.getESuperTypes().add(this.getHealthMonitorData());
		cpuLoadDataEClass.getESuperTypes().add(this.getCpuLoad());
		ramLoadDataEClass.getESuperTypes().add(this.getHealthMonitorData());
		ramLoadDataEClass.getESuperTypes().add(this.getRamLoad());
		cpuTemperatureDataEClass.getESuperTypes().add(this.getHealthMonitorData());
		cpuTemperatureDataEClass.getESuperTypes().add(this.getCpuTemperature());
		gpuTemperatureDataEClass.getESuperTypes().add(this.getHealthMonitorData());
		gpuTemperatureDataEClass.getESuperTypes().add(this.getGpuTemperature());
		storageDataEClass.getESuperTypes().add(this.getHealthMonitorData());
		storageDataEClass.getESuperTypes().add(this.getStorage());
		networkDataEClass.getESuperTypes().add(this.getHealthMonitorData());
		networkDataEClass.getESuperTypes().add(this.getNetwork());

		// Initialize classes, features, and operations; add parameters
		initEClass(healthMonitorEClass, HealthMonitor.class, "HealthMonitor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(healthMonitorItemEClass, HealthMonitorItem.class, "HealthMonitorItem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHealthMonitorItem_Time(), theTimersPackage.getTimer(), null, "time", null, 1, 1, HealthMonitorItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(healthMonitorDataEClass, HealthMonitorData.class, "HealthMonitorData", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHealthMonitorData_AdquisitionTimestamp(), ecorePackage.getELong(), "adquisitionTimestamp", null, 1, 1, HealthMonitorData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(loadEClass, Load.class, "Load", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cpuLoadEClass, CpuLoad.class, "CpuLoad", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ramLoadEClass, RamLoad.class, "RamLoad", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(temperatureEClass, Temperature.class, "Temperature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cpuTemperatureEClass, CpuTemperature.class, "CpuTemperature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(gpuTemperatureEClass, GpuTemperature.class, "GpuTemperature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(storageEClass, Storage.class, "Storage", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(networkEClass, Network.class, "Network", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(storagePartitionEClass, StoragePartition.class, "StoragePartition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStoragePartition_Device(), ecorePackage.getEString(), "device", null, 1, 1, StoragePartition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStoragePartition_Mount(), ecorePackage.getEString(), "mount", null, 1, 1, StoragePartition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStoragePartition_FileSystem(), ecorePackage.getEString(), "fileSystem", null, 1, 1, StoragePartition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStoragePartition_InodeFree(), ecorePackage.getELong(), "inodeFree", null, 1, 1, StoragePartition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStoragePartition_InodeTotal(), ecorePackage.getELong(), "inodeTotal", null, 1, 1, StoragePartition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStoragePartition_SpaceFree(), ecorePackage.getELong(), "spaceFree", null, 1, 1, StoragePartition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStoragePartition_SpaceTotal(), ecorePackage.getELong(), "spaceTotal", null, 1, 1, StoragePartition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(storageStatsEClass, StorageStats.class, "StorageStats", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStorageStats_Device(), ecorePackage.getEString(), "device", null, 1, 1, StorageStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStorageStats_Reads(), ecorePackage.getELong(), "reads", null, 1, 1, StorageStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStorageStats_Writes(), ecorePackage.getELong(), "writes", null, 1, 1, StorageStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(networkInterfaceEClass, NetworkInterface.class, "NetworkInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNetworkInterface_Name(), ecorePackage.getEString(), "name", null, 1, 1, NetworkInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkInterface_RxBytes(), ecorePackage.getELong(), "rxBytes", null, 1, 1, NetworkInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkInterface_TxBytes(), ecorePackage.getELong(), "txBytes", null, 1, 1, NetworkInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkInterface_RxPackets(), ecorePackage.getELong(), "rxPackets", null, 1, 1, NetworkInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkInterface_TxPackets(), ecorePackage.getELong(), "txPackets", null, 1, 1, NetworkInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cpuLoadItemEClass, CpuLoadItem.class, "CpuLoadItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ramLoadItemEClass, RamLoadItem.class, "RamLoadItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cpuTemperatureItemEClass, CpuTemperatureItem.class, "CpuTemperatureItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(gpuTemperatureItemEClass, GpuTemperatureItem.class, "GpuTemperatureItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(storageItemEClass, StorageItem.class, "StorageItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(networkItemEClass, NetworkItem.class, "NetworkItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cpuLoadDataEClass, CpuLoadData.class, "CpuLoadData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCpuLoadData_Load(), ecorePackage.getEInt(), "load", null, 1, 1, CpuLoadData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ramLoadDataEClass, RamLoadData.class, "RamLoadData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRamLoadData_Size(), ecorePackage.getEInt(), "size", null, 1, 1, RamLoadData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRamLoadData_Free(), ecorePackage.getEInt(), "free", null, 1, 1, RamLoadData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cpuTemperatureDataEClass, CpuTemperatureData.class, "CpuTemperatureData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCpuTemperatureData_Temperature(), ecorePackage.getEFloat(), "temperature", null, 1, 1, CpuTemperatureData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gpuTemperatureDataEClass, GpuTemperatureData.class, "GpuTemperatureData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGpuTemperatureData_Temperature(), ecorePackage.getEFloat(), "temperature", null, 1, 1, GpuTemperatureData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(storageDataEClass, StorageData.class, "StorageData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStorageData_Partitions(), this.getStoragePartition(), null, "partitions", null, 0, -1, StorageData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStorageData_Stats(), this.getStorageStats(), null, "stats", null, 0, -1, StorageData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(networkDataEClass, NetworkData.class, "NetworkData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNetworkData_Interfaces(), this.getNetworkInterface(), null, "interfaces", null, 1, -1, NetworkData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //HealthmonitorsPackageImpl
