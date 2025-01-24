/**
 */
package es.udima.cesarlaso.tfm.healthmonitors;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see es.udima.cesarlaso.tfm.healthmonitors.HealthmonitorsFactory
 * @model kind="package"
 * @generated
 */
public interface HealthmonitorsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "healthmonitors";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://tfm.cesarlaso.udima.es/healthmonitors";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "es.udima.cesarlaso.tfm.healthmonitors";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HealthmonitorsPackage eINSTANCE = es.udima.cesarlaso.tfm.healthmonitors.impl.HealthmonitorsPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.healthmonitors.impl.HealthMonitorImpl <em>Health Monitor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.HealthMonitorImpl
	 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.HealthmonitorsPackageImpl#getHealthMonitor()
	 * @generated
	 */
	int HEALTH_MONITOR = 0;

	/**
	 * The number of structural features of the '<em>Health Monitor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_MONITOR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Health Monitor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_MONITOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.healthmonitors.impl.HealthMonitorItemImpl <em>Health Monitor Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.HealthMonitorItemImpl
	 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.HealthmonitorsPackageImpl#getHealthMonitorItem()
	 * @generated
	 */
	int HEALTH_MONITOR_ITEM = 1;

	/**
	 * The feature id for the '<em><b>Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_MONITOR_ITEM__TIME = 0;

	/**
	 * The number of structural features of the '<em>Health Monitor Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_MONITOR_ITEM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Health Monitor Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_MONITOR_ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.healthmonitors.impl.HealthMonitorDataImpl <em>Health Monitor Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.HealthMonitorDataImpl
	 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.HealthmonitorsPackageImpl#getHealthMonitorData()
	 * @generated
	 */
	int HEALTH_MONITOR_DATA = 2;

	/**
	 * The feature id for the '<em><b>Adquisition Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_MONITOR_DATA__ADQUISITION_TIMESTAMP = 0;

	/**
	 * The number of structural features of the '<em>Health Monitor Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_MONITOR_DATA_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Health Monitor Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_MONITOR_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.healthmonitors.impl.LoadImpl <em>Load</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.LoadImpl
	 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.HealthmonitorsPackageImpl#getLoad()
	 * @generated
	 */
	int LOAD = 3;

	/**
	 * The number of structural features of the '<em>Load</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_FEATURE_COUNT = HEALTH_MONITOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Load</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_OPERATION_COUNT = HEALTH_MONITOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.healthmonitors.impl.CpuLoadImpl <em>Cpu Load</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.CpuLoadImpl
	 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.HealthmonitorsPackageImpl#getCpuLoad()
	 * @generated
	 */
	int CPU_LOAD = 4;

	/**
	 * The number of structural features of the '<em>Cpu Load</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_LOAD_FEATURE_COUNT = LOAD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cpu Load</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_LOAD_OPERATION_COUNT = LOAD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.healthmonitors.impl.RamLoadImpl <em>Ram Load</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.RamLoadImpl
	 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.HealthmonitorsPackageImpl#getRamLoad()
	 * @generated
	 */
	int RAM_LOAD = 5;

	/**
	 * The number of structural features of the '<em>Ram Load</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_LOAD_FEATURE_COUNT = LOAD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ram Load</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_LOAD_OPERATION_COUNT = LOAD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.healthmonitors.impl.TemperatureImpl <em>Temperature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.TemperatureImpl
	 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.HealthmonitorsPackageImpl#getTemperature()
	 * @generated
	 */
	int TEMPERATURE = 6;

	/**
	 * The number of structural features of the '<em>Temperature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPERATURE_FEATURE_COUNT = HEALTH_MONITOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Temperature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPERATURE_OPERATION_COUNT = HEALTH_MONITOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.healthmonitors.impl.CpuTemperatureImpl <em>Cpu Temperature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.CpuTemperatureImpl
	 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.HealthmonitorsPackageImpl#getCpuTemperature()
	 * @generated
	 */
	int CPU_TEMPERATURE = 7;

	/**
	 * The number of structural features of the '<em>Cpu Temperature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_TEMPERATURE_FEATURE_COUNT = TEMPERATURE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cpu Temperature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_TEMPERATURE_OPERATION_COUNT = TEMPERATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.healthmonitors.impl.GpuTemperatureImpl <em>Gpu Temperature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.GpuTemperatureImpl
	 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.HealthmonitorsPackageImpl#getGpuTemperature()
	 * @generated
	 */
	int GPU_TEMPERATURE = 8;

	/**
	 * The number of structural features of the '<em>Gpu Temperature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_TEMPERATURE_FEATURE_COUNT = TEMPERATURE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Gpu Temperature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_TEMPERATURE_OPERATION_COUNT = TEMPERATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.healthmonitors.impl.StorageImpl <em>Storage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.StorageImpl
	 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.HealthmonitorsPackageImpl#getStorage()
	 * @generated
	 */
	int STORAGE = 9;

	/**
	 * The number of structural features of the '<em>Storage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_FEATURE_COUNT = HEALTH_MONITOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Storage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_OPERATION_COUNT = HEALTH_MONITOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.healthmonitors.impl.NetworkImpl <em>Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.NetworkImpl
	 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.HealthmonitorsPackageImpl#getNetwork()
	 * @generated
	 */
	int NETWORK = 10;

	/**
	 * The number of structural features of the '<em>Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_FEATURE_COUNT = HEALTH_MONITOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_OPERATION_COUNT = HEALTH_MONITOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.healthmonitors.impl.StoragePartitionImpl <em>Storage Partition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.StoragePartitionImpl
	 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.HealthmonitorsPackageImpl#getStoragePartition()
	 * @generated
	 */
	int STORAGE_PARTITION = 11;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_PARTITION__DEVICE = 0;

	/**
	 * The feature id for the '<em><b>Mount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_PARTITION__MOUNT = 1;

	/**
	 * The feature id for the '<em><b>File System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_PARTITION__FILE_SYSTEM = 2;

	/**
	 * The feature id for the '<em><b>Inode Free</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_PARTITION__INODE_FREE = 3;

	/**
	 * The feature id for the '<em><b>Inode Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_PARTITION__INODE_TOTAL = 4;

	/**
	 * The feature id for the '<em><b>Space Free</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_PARTITION__SPACE_FREE = 5;

	/**
	 * The feature id for the '<em><b>Space Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_PARTITION__SPACE_TOTAL = 6;

	/**
	 * The number of structural features of the '<em>Storage Partition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_PARTITION_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Storage Partition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_PARTITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.healthmonitors.impl.StorageStatsImpl <em>Storage Stats</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.StorageStatsImpl
	 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.HealthmonitorsPackageImpl#getStorageStats()
	 * @generated
	 */
	int STORAGE_STATS = 12;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_STATS__DEVICE = 0;

	/**
	 * The feature id for the '<em><b>Reads</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_STATS__READS = 1;

	/**
	 * The feature id for the '<em><b>Writes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_STATS__WRITES = 2;

	/**
	 * The number of structural features of the '<em>Storage Stats</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_STATS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Storage Stats</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_STATS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.healthmonitors.impl.NetworkInterfaceImpl <em>Network Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.NetworkInterfaceImpl
	 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.HealthmonitorsPackageImpl#getNetworkInterface()
	 * @generated
	 */
	int NETWORK_INTERFACE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INTERFACE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Rx Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INTERFACE__RX_BYTES = 1;

	/**
	 * The feature id for the '<em><b>Tx Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INTERFACE__TX_BYTES = 2;

	/**
	 * The feature id for the '<em><b>Rx Packets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INTERFACE__RX_PACKETS = 3;

	/**
	 * The feature id for the '<em><b>Tx Packets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INTERFACE__TX_PACKETS = 4;

	/**
	 * The number of structural features of the '<em>Network Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INTERFACE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Network Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INTERFACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.healthmonitors.impl.CpuLoadItemImpl <em>Cpu Load Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.CpuLoadItemImpl
	 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.HealthmonitorsPackageImpl#getCpuLoadItem()
	 * @generated
	 */
	int CPU_LOAD_ITEM = 14;

	/**
	 * The feature id for the '<em><b>Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_LOAD_ITEM__TIME = HEALTH_MONITOR_ITEM__TIME;

	/**
	 * The number of structural features of the '<em>Cpu Load Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_LOAD_ITEM_FEATURE_COUNT = HEALTH_MONITOR_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cpu Load Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_LOAD_ITEM_OPERATION_COUNT = HEALTH_MONITOR_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.healthmonitors.impl.RamLoadItemImpl <em>Ram Load Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.RamLoadItemImpl
	 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.HealthmonitorsPackageImpl#getRamLoadItem()
	 * @generated
	 */
	int RAM_LOAD_ITEM = 15;

	/**
	 * The feature id for the '<em><b>Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_LOAD_ITEM__TIME = HEALTH_MONITOR_ITEM__TIME;

	/**
	 * The number of structural features of the '<em>Ram Load Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_LOAD_ITEM_FEATURE_COUNT = HEALTH_MONITOR_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ram Load Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_LOAD_ITEM_OPERATION_COUNT = HEALTH_MONITOR_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.healthmonitors.impl.CpuTemperatureItemImpl <em>Cpu Temperature Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.CpuTemperatureItemImpl
	 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.HealthmonitorsPackageImpl#getCpuTemperatureItem()
	 * @generated
	 */
	int CPU_TEMPERATURE_ITEM = 16;

	/**
	 * The feature id for the '<em><b>Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_TEMPERATURE_ITEM__TIME = HEALTH_MONITOR_ITEM__TIME;

	/**
	 * The number of structural features of the '<em>Cpu Temperature Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_TEMPERATURE_ITEM_FEATURE_COUNT = HEALTH_MONITOR_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cpu Temperature Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_TEMPERATURE_ITEM_OPERATION_COUNT = HEALTH_MONITOR_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.healthmonitors.impl.GpuTemperatureItemImpl <em>Gpu Temperature Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.GpuTemperatureItemImpl
	 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.HealthmonitorsPackageImpl#getGpuTemperatureItem()
	 * @generated
	 */
	int GPU_TEMPERATURE_ITEM = 17;

	/**
	 * The feature id for the '<em><b>Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_TEMPERATURE_ITEM__TIME = HEALTH_MONITOR_ITEM__TIME;

	/**
	 * The number of structural features of the '<em>Gpu Temperature Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_TEMPERATURE_ITEM_FEATURE_COUNT = HEALTH_MONITOR_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Gpu Temperature Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_TEMPERATURE_ITEM_OPERATION_COUNT = HEALTH_MONITOR_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.healthmonitors.impl.StorageItemImpl <em>Storage Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.StorageItemImpl
	 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.HealthmonitorsPackageImpl#getStorageItem()
	 * @generated
	 */
	int STORAGE_ITEM = 18;

	/**
	 * The feature id for the '<em><b>Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_ITEM__TIME = HEALTH_MONITOR_ITEM__TIME;

	/**
	 * The number of structural features of the '<em>Storage Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_ITEM_FEATURE_COUNT = HEALTH_MONITOR_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Storage Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_ITEM_OPERATION_COUNT = HEALTH_MONITOR_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.healthmonitors.impl.NetworkItemImpl <em>Network Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.NetworkItemImpl
	 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.HealthmonitorsPackageImpl#getNetworkItem()
	 * @generated
	 */
	int NETWORK_ITEM = 19;

	/**
	 * The feature id for the '<em><b>Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_ITEM__TIME = HEALTH_MONITOR_ITEM__TIME;

	/**
	 * The number of structural features of the '<em>Network Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_ITEM_FEATURE_COUNT = HEALTH_MONITOR_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Network Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_ITEM_OPERATION_COUNT = HEALTH_MONITOR_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.healthmonitors.impl.CpuLoadDataImpl <em>Cpu Load Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.CpuLoadDataImpl
	 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.HealthmonitorsPackageImpl#getCpuLoadData()
	 * @generated
	 */
	int CPU_LOAD_DATA = 20;

	/**
	 * The feature id for the '<em><b>Adquisition Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_LOAD_DATA__ADQUISITION_TIMESTAMP = HEALTH_MONITOR_DATA__ADQUISITION_TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Load</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_LOAD_DATA__LOAD = HEALTH_MONITOR_DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cpu Load Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_LOAD_DATA_FEATURE_COUNT = HEALTH_MONITOR_DATA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Cpu Load Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_LOAD_DATA_OPERATION_COUNT = HEALTH_MONITOR_DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.healthmonitors.impl.RamLoadDataImpl <em>Ram Load Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.RamLoadDataImpl
	 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.HealthmonitorsPackageImpl#getRamLoadData()
	 * @generated
	 */
	int RAM_LOAD_DATA = 21;

	/**
	 * The feature id for the '<em><b>Adquisition Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_LOAD_DATA__ADQUISITION_TIMESTAMP = HEALTH_MONITOR_DATA__ADQUISITION_TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_LOAD_DATA__SIZE = HEALTH_MONITOR_DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Free</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_LOAD_DATA__FREE = HEALTH_MONITOR_DATA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ram Load Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_LOAD_DATA_FEATURE_COUNT = HEALTH_MONITOR_DATA_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Ram Load Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_LOAD_DATA_OPERATION_COUNT = HEALTH_MONITOR_DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.healthmonitors.impl.CpuTemperatureDataImpl <em>Cpu Temperature Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.CpuTemperatureDataImpl
	 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.HealthmonitorsPackageImpl#getCpuTemperatureData()
	 * @generated
	 */
	int CPU_TEMPERATURE_DATA = 22;

	/**
	 * The feature id for the '<em><b>Adquisition Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_TEMPERATURE_DATA__ADQUISITION_TIMESTAMP = HEALTH_MONITOR_DATA__ADQUISITION_TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_TEMPERATURE_DATA__TEMPERATURE = HEALTH_MONITOR_DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cpu Temperature Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_TEMPERATURE_DATA_FEATURE_COUNT = HEALTH_MONITOR_DATA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Cpu Temperature Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_TEMPERATURE_DATA_OPERATION_COUNT = HEALTH_MONITOR_DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.healthmonitors.impl.GpuTemperatureDataImpl <em>Gpu Temperature Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.GpuTemperatureDataImpl
	 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.HealthmonitorsPackageImpl#getGpuTemperatureData()
	 * @generated
	 */
	int GPU_TEMPERATURE_DATA = 23;

	/**
	 * The feature id for the '<em><b>Adquisition Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_TEMPERATURE_DATA__ADQUISITION_TIMESTAMP = HEALTH_MONITOR_DATA__ADQUISITION_TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_TEMPERATURE_DATA__TEMPERATURE = HEALTH_MONITOR_DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gpu Temperature Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_TEMPERATURE_DATA_FEATURE_COUNT = HEALTH_MONITOR_DATA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Gpu Temperature Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_TEMPERATURE_DATA_OPERATION_COUNT = HEALTH_MONITOR_DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.healthmonitors.impl.StorageDataImpl <em>Storage Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.StorageDataImpl
	 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.HealthmonitorsPackageImpl#getStorageData()
	 * @generated
	 */
	int STORAGE_DATA = 24;

	/**
	 * The feature id for the '<em><b>Adquisition Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_DATA__ADQUISITION_TIMESTAMP = HEALTH_MONITOR_DATA__ADQUISITION_TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Partitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_DATA__PARTITIONS = HEALTH_MONITOR_DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Stats</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_DATA__STATS = HEALTH_MONITOR_DATA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Storage Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_DATA_FEATURE_COUNT = HEALTH_MONITOR_DATA_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Storage Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_DATA_OPERATION_COUNT = HEALTH_MONITOR_DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.healthmonitors.impl.NetworkDataImpl <em>Network Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.NetworkDataImpl
	 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.HealthmonitorsPackageImpl#getNetworkData()
	 * @generated
	 */
	int NETWORK_DATA = 25;

	/**
	 * The feature id for the '<em><b>Adquisition Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_DATA__ADQUISITION_TIMESTAMP = HEALTH_MONITOR_DATA__ADQUISITION_TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_DATA__INTERFACES = HEALTH_MONITOR_DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Network Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_DATA_FEATURE_COUNT = HEALTH_MONITOR_DATA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Network Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_DATA_OPERATION_COUNT = HEALTH_MONITOR_DATA_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.healthmonitors.HealthMonitor <em>Health Monitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Health Monitor</em>'.
	 * @see es.udima.cesarlaso.tfm.healthmonitors.HealthMonitor
	 * @generated
	 */
	EClass getHealthMonitor();

	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.healthmonitors.HealthMonitorItem <em>Health Monitor Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Health Monitor Item</em>'.
	 * @see es.udima.cesarlaso.tfm.healthmonitors.HealthMonitorItem
	 * @generated
	 */
	EClass getHealthMonitorItem();

	/**
	 * Returns the meta object for the containment reference '{@link es.udima.cesarlaso.tfm.healthmonitors.HealthMonitorItem#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time</em>'.
	 * @see es.udima.cesarlaso.tfm.healthmonitors.HealthMonitorItem#getTime()
	 * @see #getHealthMonitorItem()
	 * @generated
	 */
	EReference getHealthMonitorItem_Time();

	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.healthmonitors.HealthMonitorData <em>Health Monitor Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Health Monitor Data</em>'.
	 * @see es.udima.cesarlaso.tfm.healthmonitors.HealthMonitorData
	 * @generated
	 */
	EClass getHealthMonitorData();

	/**
	 * Returns the meta object for the attribute '{@link es.udima.cesarlaso.tfm.healthmonitors.HealthMonitorData#getAdquisitionTimestamp <em>Adquisition Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adquisition Timestamp</em>'.
	 * @see es.udima.cesarlaso.tfm.healthmonitors.HealthMonitorData#getAdquisitionTimestamp()
	 * @see #getHealthMonitorData()
	 * @generated
	 */
	EAttribute getHealthMonitorData_AdquisitionTimestamp();

	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.healthmonitors.Load <em>Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Load</em>'.
	 * @see es.udima.cesarlaso.tfm.healthmonitors.Load
	 * @generated
	 */
	EClass getLoad();

	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.healthmonitors.CpuLoad <em>Cpu Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cpu Load</em>'.
	 * @see es.udima.cesarlaso.tfm.healthmonitors.CpuLoad
	 * @generated
	 */
	EClass getCpuLoad();

	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.healthmonitors.RamLoad <em>Ram Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ram Load</em>'.
	 * @see es.udima.cesarlaso.tfm.healthmonitors.RamLoad
	 * @generated
	 */
	EClass getRamLoad();

	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.healthmonitors.Temperature <em>Temperature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Temperature</em>'.
	 * @see es.udima.cesarlaso.tfm.healthmonitors.Temperature
	 * @generated
	 */
	EClass getTemperature();

	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.healthmonitors.CpuTemperature <em>Cpu Temperature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cpu Temperature</em>'.
	 * @see es.udima.cesarlaso.tfm.healthmonitors.CpuTemperature
	 * @generated
	 */
	EClass getCpuTemperature();

	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.healthmonitors.GpuTemperature <em>Gpu Temperature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gpu Temperature</em>'.
	 * @see es.udima.cesarlaso.tfm.healthmonitors.GpuTemperature
	 * @generated
	 */
	EClass getGpuTemperature();

	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.healthmonitors.Storage <em>Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Storage</em>'.
	 * @see es.udima.cesarlaso.tfm.healthmonitors.Storage
	 * @generated
	 */
	EClass getStorage();

	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.healthmonitors.Network <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network</em>'.
	 * @see es.udima.cesarlaso.tfm.healthmonitors.Network
	 * @generated
	 */
	EClass getNetwork();

	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.healthmonitors.StoragePartition <em>Storage Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Storage Partition</em>'.
	 * @see es.udima.cesarlaso.tfm.healthmonitors.StoragePartition
	 * @generated
	 */
	EClass getStoragePartition();

	/**
	 * Returns the meta object for the attribute '{@link es.udima.cesarlaso.tfm.healthmonitors.StoragePartition#getDevice <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device</em>'.
	 * @see es.udima.cesarlaso.tfm.healthmonitors.StoragePartition#getDevice()
	 * @see #getStoragePartition()
	 * @generated
	 */
	EAttribute getStoragePartition_Device();

	/**
	 * Returns the meta object for the attribute '{@link es.udima.cesarlaso.tfm.healthmonitors.StoragePartition#getMount <em>Mount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mount</em>'.
	 * @see es.udima.cesarlaso.tfm.healthmonitors.StoragePartition#getMount()
	 * @see #getStoragePartition()
	 * @generated
	 */
	EAttribute getStoragePartition_Mount();

	/**
	 * Returns the meta object for the attribute '{@link es.udima.cesarlaso.tfm.healthmonitors.StoragePartition#getFileSystem <em>File System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File System</em>'.
	 * @see es.udima.cesarlaso.tfm.healthmonitors.StoragePartition#getFileSystem()
	 * @see #getStoragePartition()
	 * @generated
	 */
	EAttribute getStoragePartition_FileSystem();

	/**
	 * Returns the meta object for the attribute '{@link es.udima.cesarlaso.tfm.healthmonitors.StoragePartition#getInodeFree <em>Inode Free</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inode Free</em>'.
	 * @see es.udima.cesarlaso.tfm.healthmonitors.StoragePartition#getInodeFree()
	 * @see #getStoragePartition()
	 * @generated
	 */
	EAttribute getStoragePartition_InodeFree();

	/**
	 * Returns the meta object for the attribute '{@link es.udima.cesarlaso.tfm.healthmonitors.StoragePartition#getInodeTotal <em>Inode Total</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inode Total</em>'.
	 * @see es.udima.cesarlaso.tfm.healthmonitors.StoragePartition#getInodeTotal()
	 * @see #getStoragePartition()
	 * @generated
	 */
	EAttribute getStoragePartition_InodeTotal();

	/**
	 * Returns the meta object for the attribute '{@link es.udima.cesarlaso.tfm.healthmonitors.StoragePartition#getSpaceFree <em>Space Free</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Space Free</em>'.
	 * @see es.udima.cesarlaso.tfm.healthmonitors.StoragePartition#getSpaceFree()
	 * @see #getStoragePartition()
	 * @generated
	 */
	EAttribute getStoragePartition_SpaceFree();

	/**
	 * Returns the meta object for the attribute '{@link es.udima.cesarlaso.tfm.healthmonitors.StoragePartition#getSpaceTotal <em>Space Total</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Space Total</em>'.
	 * @see es.udima.cesarlaso.tfm.healthmonitors.StoragePartition#getSpaceTotal()
	 * @see #getStoragePartition()
	 * @generated
	 */
	EAttribute getStoragePartition_SpaceTotal();

	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.healthmonitors.StorageStats <em>Storage Stats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Storage Stats</em>'.
	 * @see es.udima.cesarlaso.tfm.healthmonitors.StorageStats
	 * @generated
	 */
	EClass getStorageStats();

	/**
	 * Returns the meta object for the attribute '{@link es.udima.cesarlaso.tfm.healthmonitors.StorageStats#getDevice <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device</em>'.
	 * @see es.udima.cesarlaso.tfm.healthmonitors.StorageStats#getDevice()
	 * @see #getStorageStats()
	 * @generated
	 */
	EAttribute getStorageStats_Device();

	/**
	 * Returns the meta object for the attribute '{@link es.udima.cesarlaso.tfm.healthmonitors.StorageStats#getReads <em>Reads</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reads</em>'.
	 * @see es.udima.cesarlaso.tfm.healthmonitors.StorageStats#getReads()
	 * @see #getStorageStats()
	 * @generated
	 */
	EAttribute getStorageStats_Reads();

	/**
	 * Returns the meta object for the attribute '{@link es.udima.cesarlaso.tfm.healthmonitors.StorageStats#getWrites <em>Writes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Writes</em>'.
	 * @see es.udima.cesarlaso.tfm.healthmonitors.StorageStats#getWrites()
	 * @see #getStorageStats()
	 * @generated
	 */
	EAttribute getStorageStats_Writes();

	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.healthmonitors.NetworkInterface <em>Network Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Interface</em>'.
	 * @see es.udima.cesarlaso.tfm.healthmonitors.NetworkInterface
	 * @generated
	 */
	EClass getNetworkInterface();

	/**
	 * Returns the meta object for the attribute '{@link es.udima.cesarlaso.tfm.healthmonitors.NetworkInterface#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.udima.cesarlaso.tfm.healthmonitors.NetworkInterface#getName()
	 * @see #getNetworkInterface()
	 * @generated
	 */
	EAttribute getNetworkInterface_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.udima.cesarlaso.tfm.healthmonitors.NetworkInterface#getRxBytes <em>Rx Bytes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rx Bytes</em>'.
	 * @see es.udima.cesarlaso.tfm.healthmonitors.NetworkInterface#getRxBytes()
	 * @see #getNetworkInterface()
	 * @generated
	 */
	EAttribute getNetworkInterface_RxBytes();

	/**
	 * Returns the meta object for the attribute '{@link es.udima.cesarlaso.tfm.healthmonitors.NetworkInterface#getTxBytes <em>Tx Bytes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tx Bytes</em>'.
	 * @see es.udima.cesarlaso.tfm.healthmonitors.NetworkInterface#getTxBytes()
	 * @see #getNetworkInterface()
	 * @generated
	 */
	EAttribute getNetworkInterface_TxBytes();

	/**
	 * Returns the meta object for the attribute '{@link es.udima.cesarlaso.tfm.healthmonitors.NetworkInterface#getRxPackets <em>Rx Packets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rx Packets</em>'.
	 * @see es.udima.cesarlaso.tfm.healthmonitors.NetworkInterface#getRxPackets()
	 * @see #getNetworkInterface()
	 * @generated
	 */
	EAttribute getNetworkInterface_RxPackets();

	/**
	 * Returns the meta object for the attribute '{@link es.udima.cesarlaso.tfm.healthmonitors.NetworkInterface#getTxPackets <em>Tx Packets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tx Packets</em>'.
	 * @see es.udima.cesarlaso.tfm.healthmonitors.NetworkInterface#getTxPackets()
	 * @see #getNetworkInterface()
	 * @generated
	 */
	EAttribute getNetworkInterface_TxPackets();

	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.healthmonitors.CpuLoadItem <em>Cpu Load Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cpu Load Item</em>'.
	 * @see es.udima.cesarlaso.tfm.healthmonitors.CpuLoadItem
	 * @generated
	 */
	EClass getCpuLoadItem();

	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.healthmonitors.RamLoadItem <em>Ram Load Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ram Load Item</em>'.
	 * @see es.udima.cesarlaso.tfm.healthmonitors.RamLoadItem
	 * @generated
	 */
	EClass getRamLoadItem();

	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.healthmonitors.CpuTemperatureItem <em>Cpu Temperature Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cpu Temperature Item</em>'.
	 * @see es.udima.cesarlaso.tfm.healthmonitors.CpuTemperatureItem
	 * @generated
	 */
	EClass getCpuTemperatureItem();

	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.healthmonitors.GpuTemperatureItem <em>Gpu Temperature Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gpu Temperature Item</em>'.
	 * @see es.udima.cesarlaso.tfm.healthmonitors.GpuTemperatureItem
	 * @generated
	 */
	EClass getGpuTemperatureItem();

	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.healthmonitors.StorageItem <em>Storage Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Storage Item</em>'.
	 * @see es.udima.cesarlaso.tfm.healthmonitors.StorageItem
	 * @generated
	 */
	EClass getStorageItem();

	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.healthmonitors.NetworkItem <em>Network Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Item</em>'.
	 * @see es.udima.cesarlaso.tfm.healthmonitors.NetworkItem
	 * @generated
	 */
	EClass getNetworkItem();

	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.healthmonitors.CpuLoadData <em>Cpu Load Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cpu Load Data</em>'.
	 * @see es.udima.cesarlaso.tfm.healthmonitors.CpuLoadData
	 * @generated
	 */
	EClass getCpuLoadData();

	/**
	 * Returns the meta object for the attribute '{@link es.udima.cesarlaso.tfm.healthmonitors.CpuLoadData#getLoad <em>Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Load</em>'.
	 * @see es.udima.cesarlaso.tfm.healthmonitors.CpuLoadData#getLoad()
	 * @see #getCpuLoadData()
	 * @generated
	 */
	EAttribute getCpuLoadData_Load();

	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.healthmonitors.RamLoadData <em>Ram Load Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ram Load Data</em>'.
	 * @see es.udima.cesarlaso.tfm.healthmonitors.RamLoadData
	 * @generated
	 */
	EClass getRamLoadData();

	/**
	 * Returns the meta object for the attribute '{@link es.udima.cesarlaso.tfm.healthmonitors.RamLoadData#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see es.udima.cesarlaso.tfm.healthmonitors.RamLoadData#getSize()
	 * @see #getRamLoadData()
	 * @generated
	 */
	EAttribute getRamLoadData_Size();

	/**
	 * Returns the meta object for the attribute '{@link es.udima.cesarlaso.tfm.healthmonitors.RamLoadData#getFree <em>Free</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Free</em>'.
	 * @see es.udima.cesarlaso.tfm.healthmonitors.RamLoadData#getFree()
	 * @see #getRamLoadData()
	 * @generated
	 */
	EAttribute getRamLoadData_Free();

	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.healthmonitors.CpuTemperatureData <em>Cpu Temperature Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cpu Temperature Data</em>'.
	 * @see es.udima.cesarlaso.tfm.healthmonitors.CpuTemperatureData
	 * @generated
	 */
	EClass getCpuTemperatureData();

	/**
	 * Returns the meta object for the attribute '{@link es.udima.cesarlaso.tfm.healthmonitors.CpuTemperatureData#getTemperature <em>Temperature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temperature</em>'.
	 * @see es.udima.cesarlaso.tfm.healthmonitors.CpuTemperatureData#getTemperature()
	 * @see #getCpuTemperatureData()
	 * @generated
	 */
	EAttribute getCpuTemperatureData_Temperature();

	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.healthmonitors.GpuTemperatureData <em>Gpu Temperature Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gpu Temperature Data</em>'.
	 * @see es.udima.cesarlaso.tfm.healthmonitors.GpuTemperatureData
	 * @generated
	 */
	EClass getGpuTemperatureData();

	/**
	 * Returns the meta object for the attribute '{@link es.udima.cesarlaso.tfm.healthmonitors.GpuTemperatureData#getTemperature <em>Temperature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temperature</em>'.
	 * @see es.udima.cesarlaso.tfm.healthmonitors.GpuTemperatureData#getTemperature()
	 * @see #getGpuTemperatureData()
	 * @generated
	 */
	EAttribute getGpuTemperatureData_Temperature();

	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.healthmonitors.StorageData <em>Storage Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Storage Data</em>'.
	 * @see es.udima.cesarlaso.tfm.healthmonitors.StorageData
	 * @generated
	 */
	EClass getStorageData();

	/**
	 * Returns the meta object for the containment reference list '{@link es.udima.cesarlaso.tfm.healthmonitors.StorageData#getPartitions <em>Partitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Partitions</em>'.
	 * @see es.udima.cesarlaso.tfm.healthmonitors.StorageData#getPartitions()
	 * @see #getStorageData()
	 * @generated
	 */
	EReference getStorageData_Partitions();

	/**
	 * Returns the meta object for the containment reference list '{@link es.udima.cesarlaso.tfm.healthmonitors.StorageData#getStats <em>Stats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stats</em>'.
	 * @see es.udima.cesarlaso.tfm.healthmonitors.StorageData#getStats()
	 * @see #getStorageData()
	 * @generated
	 */
	EReference getStorageData_Stats();

	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.healthmonitors.NetworkData <em>Network Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Data</em>'.
	 * @see es.udima.cesarlaso.tfm.healthmonitors.NetworkData
	 * @generated
	 */
	EClass getNetworkData();

	/**
	 * Returns the meta object for the containment reference list '{@link es.udima.cesarlaso.tfm.healthmonitors.NetworkData#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interfaces</em>'.
	 * @see es.udima.cesarlaso.tfm.healthmonitors.NetworkData#getInterfaces()
	 * @see #getNetworkData()
	 * @generated
	 */
	EReference getNetworkData_Interfaces();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HealthmonitorsFactory getHealthmonitorsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.healthmonitors.impl.HealthMonitorImpl <em>Health Monitor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.HealthMonitorImpl
		 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.HealthmonitorsPackageImpl#getHealthMonitor()
		 * @generated
		 */
		EClass HEALTH_MONITOR = eINSTANCE.getHealthMonitor();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.healthmonitors.impl.HealthMonitorItemImpl <em>Health Monitor Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.HealthMonitorItemImpl
		 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.HealthmonitorsPackageImpl#getHealthMonitorItem()
		 * @generated
		 */
		EClass HEALTH_MONITOR_ITEM = eINSTANCE.getHealthMonitorItem();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEALTH_MONITOR_ITEM__TIME = eINSTANCE.getHealthMonitorItem_Time();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.healthmonitors.impl.HealthMonitorDataImpl <em>Health Monitor Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.HealthMonitorDataImpl
		 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.HealthmonitorsPackageImpl#getHealthMonitorData()
		 * @generated
		 */
		EClass HEALTH_MONITOR_DATA = eINSTANCE.getHealthMonitorData();

		/**
		 * The meta object literal for the '<em><b>Adquisition Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEALTH_MONITOR_DATA__ADQUISITION_TIMESTAMP = eINSTANCE.getHealthMonitorData_AdquisitionTimestamp();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.healthmonitors.impl.LoadImpl <em>Load</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.LoadImpl
		 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.HealthmonitorsPackageImpl#getLoad()
		 * @generated
		 */
		EClass LOAD = eINSTANCE.getLoad();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.healthmonitors.impl.CpuLoadImpl <em>Cpu Load</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.CpuLoadImpl
		 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.HealthmonitorsPackageImpl#getCpuLoad()
		 * @generated
		 */
		EClass CPU_LOAD = eINSTANCE.getCpuLoad();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.healthmonitors.impl.RamLoadImpl <em>Ram Load</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.RamLoadImpl
		 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.HealthmonitorsPackageImpl#getRamLoad()
		 * @generated
		 */
		EClass RAM_LOAD = eINSTANCE.getRamLoad();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.healthmonitors.impl.TemperatureImpl <em>Temperature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.TemperatureImpl
		 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.HealthmonitorsPackageImpl#getTemperature()
		 * @generated
		 */
		EClass TEMPERATURE = eINSTANCE.getTemperature();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.healthmonitors.impl.CpuTemperatureImpl <em>Cpu Temperature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.CpuTemperatureImpl
		 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.HealthmonitorsPackageImpl#getCpuTemperature()
		 * @generated
		 */
		EClass CPU_TEMPERATURE = eINSTANCE.getCpuTemperature();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.healthmonitors.impl.GpuTemperatureImpl <em>Gpu Temperature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.GpuTemperatureImpl
		 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.HealthmonitorsPackageImpl#getGpuTemperature()
		 * @generated
		 */
		EClass GPU_TEMPERATURE = eINSTANCE.getGpuTemperature();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.healthmonitors.impl.StorageImpl <em>Storage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.StorageImpl
		 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.HealthmonitorsPackageImpl#getStorage()
		 * @generated
		 */
		EClass STORAGE = eINSTANCE.getStorage();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.healthmonitors.impl.NetworkImpl <em>Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.NetworkImpl
		 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.HealthmonitorsPackageImpl#getNetwork()
		 * @generated
		 */
		EClass NETWORK = eINSTANCE.getNetwork();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.healthmonitors.impl.StoragePartitionImpl <em>Storage Partition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.StoragePartitionImpl
		 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.HealthmonitorsPackageImpl#getStoragePartition()
		 * @generated
		 */
		EClass STORAGE_PARTITION = eINSTANCE.getStoragePartition();

		/**
		 * The meta object literal for the '<em><b>Device</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORAGE_PARTITION__DEVICE = eINSTANCE.getStoragePartition_Device();

		/**
		 * The meta object literal for the '<em><b>Mount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORAGE_PARTITION__MOUNT = eINSTANCE.getStoragePartition_Mount();

		/**
		 * The meta object literal for the '<em><b>File System</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORAGE_PARTITION__FILE_SYSTEM = eINSTANCE.getStoragePartition_FileSystem();

		/**
		 * The meta object literal for the '<em><b>Inode Free</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORAGE_PARTITION__INODE_FREE = eINSTANCE.getStoragePartition_InodeFree();

		/**
		 * The meta object literal for the '<em><b>Inode Total</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORAGE_PARTITION__INODE_TOTAL = eINSTANCE.getStoragePartition_InodeTotal();

		/**
		 * The meta object literal for the '<em><b>Space Free</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORAGE_PARTITION__SPACE_FREE = eINSTANCE.getStoragePartition_SpaceFree();

		/**
		 * The meta object literal for the '<em><b>Space Total</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORAGE_PARTITION__SPACE_TOTAL = eINSTANCE.getStoragePartition_SpaceTotal();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.healthmonitors.impl.StorageStatsImpl <em>Storage Stats</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.StorageStatsImpl
		 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.HealthmonitorsPackageImpl#getStorageStats()
		 * @generated
		 */
		EClass STORAGE_STATS = eINSTANCE.getStorageStats();

		/**
		 * The meta object literal for the '<em><b>Device</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORAGE_STATS__DEVICE = eINSTANCE.getStorageStats_Device();

		/**
		 * The meta object literal for the '<em><b>Reads</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORAGE_STATS__READS = eINSTANCE.getStorageStats_Reads();

		/**
		 * The meta object literal for the '<em><b>Writes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORAGE_STATS__WRITES = eINSTANCE.getStorageStats_Writes();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.healthmonitors.impl.NetworkInterfaceImpl <em>Network Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.NetworkInterfaceImpl
		 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.HealthmonitorsPackageImpl#getNetworkInterface()
		 * @generated
		 */
		EClass NETWORK_INTERFACE = eINSTANCE.getNetworkInterface();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_INTERFACE__NAME = eINSTANCE.getNetworkInterface_Name();

		/**
		 * The meta object literal for the '<em><b>Rx Bytes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_INTERFACE__RX_BYTES = eINSTANCE.getNetworkInterface_RxBytes();

		/**
		 * The meta object literal for the '<em><b>Tx Bytes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_INTERFACE__TX_BYTES = eINSTANCE.getNetworkInterface_TxBytes();

		/**
		 * The meta object literal for the '<em><b>Rx Packets</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_INTERFACE__RX_PACKETS = eINSTANCE.getNetworkInterface_RxPackets();

		/**
		 * The meta object literal for the '<em><b>Tx Packets</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_INTERFACE__TX_PACKETS = eINSTANCE.getNetworkInterface_TxPackets();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.healthmonitors.impl.CpuLoadItemImpl <em>Cpu Load Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.CpuLoadItemImpl
		 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.HealthmonitorsPackageImpl#getCpuLoadItem()
		 * @generated
		 */
		EClass CPU_LOAD_ITEM = eINSTANCE.getCpuLoadItem();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.healthmonitors.impl.RamLoadItemImpl <em>Ram Load Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.RamLoadItemImpl
		 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.HealthmonitorsPackageImpl#getRamLoadItem()
		 * @generated
		 */
		EClass RAM_LOAD_ITEM = eINSTANCE.getRamLoadItem();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.healthmonitors.impl.CpuTemperatureItemImpl <em>Cpu Temperature Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.CpuTemperatureItemImpl
		 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.HealthmonitorsPackageImpl#getCpuTemperatureItem()
		 * @generated
		 */
		EClass CPU_TEMPERATURE_ITEM = eINSTANCE.getCpuTemperatureItem();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.healthmonitors.impl.GpuTemperatureItemImpl <em>Gpu Temperature Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.GpuTemperatureItemImpl
		 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.HealthmonitorsPackageImpl#getGpuTemperatureItem()
		 * @generated
		 */
		EClass GPU_TEMPERATURE_ITEM = eINSTANCE.getGpuTemperatureItem();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.healthmonitors.impl.StorageItemImpl <em>Storage Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.StorageItemImpl
		 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.HealthmonitorsPackageImpl#getStorageItem()
		 * @generated
		 */
		EClass STORAGE_ITEM = eINSTANCE.getStorageItem();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.healthmonitors.impl.NetworkItemImpl <em>Network Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.NetworkItemImpl
		 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.HealthmonitorsPackageImpl#getNetworkItem()
		 * @generated
		 */
		EClass NETWORK_ITEM = eINSTANCE.getNetworkItem();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.healthmonitors.impl.CpuLoadDataImpl <em>Cpu Load Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.CpuLoadDataImpl
		 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.HealthmonitorsPackageImpl#getCpuLoadData()
		 * @generated
		 */
		EClass CPU_LOAD_DATA = eINSTANCE.getCpuLoadData();

		/**
		 * The meta object literal for the '<em><b>Load</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CPU_LOAD_DATA__LOAD = eINSTANCE.getCpuLoadData_Load();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.healthmonitors.impl.RamLoadDataImpl <em>Ram Load Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.RamLoadDataImpl
		 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.HealthmonitorsPackageImpl#getRamLoadData()
		 * @generated
		 */
		EClass RAM_LOAD_DATA = eINSTANCE.getRamLoadData();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RAM_LOAD_DATA__SIZE = eINSTANCE.getRamLoadData_Size();

		/**
		 * The meta object literal for the '<em><b>Free</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RAM_LOAD_DATA__FREE = eINSTANCE.getRamLoadData_Free();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.healthmonitors.impl.CpuTemperatureDataImpl <em>Cpu Temperature Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.CpuTemperatureDataImpl
		 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.HealthmonitorsPackageImpl#getCpuTemperatureData()
		 * @generated
		 */
		EClass CPU_TEMPERATURE_DATA = eINSTANCE.getCpuTemperatureData();

		/**
		 * The meta object literal for the '<em><b>Temperature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CPU_TEMPERATURE_DATA__TEMPERATURE = eINSTANCE.getCpuTemperatureData_Temperature();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.healthmonitors.impl.GpuTemperatureDataImpl <em>Gpu Temperature Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.GpuTemperatureDataImpl
		 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.HealthmonitorsPackageImpl#getGpuTemperatureData()
		 * @generated
		 */
		EClass GPU_TEMPERATURE_DATA = eINSTANCE.getGpuTemperatureData();

		/**
		 * The meta object literal for the '<em><b>Temperature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GPU_TEMPERATURE_DATA__TEMPERATURE = eINSTANCE.getGpuTemperatureData_Temperature();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.healthmonitors.impl.StorageDataImpl <em>Storage Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.StorageDataImpl
		 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.HealthmonitorsPackageImpl#getStorageData()
		 * @generated
		 */
		EClass STORAGE_DATA = eINSTANCE.getStorageData();

		/**
		 * The meta object literal for the '<em><b>Partitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORAGE_DATA__PARTITIONS = eINSTANCE.getStorageData_Partitions();

		/**
		 * The meta object literal for the '<em><b>Stats</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORAGE_DATA__STATS = eINSTANCE.getStorageData_Stats();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.healthmonitors.impl.NetworkDataImpl <em>Network Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.NetworkDataImpl
		 * @see es.udima.cesarlaso.tfm.healthmonitors.impl.HealthmonitorsPackageImpl#getNetworkData()
		 * @generated
		 */
		EClass NETWORK_DATA = eINSTANCE.getNetworkData();

		/**
		 * The meta object literal for the '<em><b>Interfaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_DATA__INTERFACES = eINSTANCE.getNetworkData_Interfaces();

	}

} //HealthmonitorsPackage
