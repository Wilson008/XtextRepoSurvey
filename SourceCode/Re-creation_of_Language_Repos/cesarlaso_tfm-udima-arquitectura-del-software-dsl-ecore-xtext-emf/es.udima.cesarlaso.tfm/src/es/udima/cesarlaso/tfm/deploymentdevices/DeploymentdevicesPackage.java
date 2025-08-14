/**
 */
package es.udima.cesarlaso.tfm.deploymentdevices;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
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
 * @see es.udima.cesarlaso.tfm.deploymentdevices.DeploymentdevicesFactory
 * @model kind="package"
 * @generated
 */
public interface DeploymentdevicesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "deploymentdevices";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://tfm.cesarlaso.udima.es/deploymentdevices";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "es.udima.cesarlaso.tfm.deploymentdevices";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DeploymentdevicesPackage eINSTANCE = es.udima.cesarlaso.tfm.deploymentdevices.impl.DeploymentdevicesPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.deploymentdevices.impl.DeviceImpl <em>Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.deploymentdevices.impl.DeviceImpl
	 * @see es.udima.cesarlaso.tfm.deploymentdevices.impl.DeploymentdevicesPackageImpl#getDevice()
	 * @generated
	 */
	int DEVICE = 0;

	/**
	 * The feature id for the '<em><b>Wifi Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__WIFI_CONFIGURATION = 0;

	/**
	 * The number of structural features of the '<em>Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Device Number</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE___GET_DEVICE_NUMBER = 0;

	/**
	 * The number of operations of the '<em>Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.deploymentdevices.impl.OperatingSystemDeviceImpl <em>Operating System Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.deploymentdevices.impl.OperatingSystemDeviceImpl
	 * @see es.udima.cesarlaso.tfm.deploymentdevices.impl.DeploymentdevicesPackageImpl#getOperatingSystemDevice()
	 * @generated
	 */
	int OPERATING_SYSTEM_DEVICE = 1;

	/**
	 * The feature id for the '<em><b>Wifi Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_SYSTEM_DEVICE__WIFI_CONFIGURATION = DEVICE__WIFI_CONFIGURATION;

	/**
	 * The number of structural features of the '<em>Operating System Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_SYSTEM_DEVICE_FEATURE_COUNT = DEVICE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Device Number</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_SYSTEM_DEVICE___GET_DEVICE_NUMBER = DEVICE___GET_DEVICE_NUMBER;

	/**
	 * The number of operations of the '<em>Operating System Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_SYSTEM_DEVICE_OPERATION_COUNT = DEVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.deploymentdevices.impl.JavaDeviceImpl <em>Java Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.deploymentdevices.impl.JavaDeviceImpl
	 * @see es.udima.cesarlaso.tfm.deploymentdevices.impl.DeploymentdevicesPackageImpl#getJavaDevice()
	 * @generated
	 */
	int JAVA_DEVICE = 2;

	/**
	 * The feature id for the '<em><b>Wifi Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_DEVICE__WIFI_CONFIGURATION = OPERATING_SYSTEM_DEVICE__WIFI_CONFIGURATION;

	/**
	 * The number of structural features of the '<em>Java Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_DEVICE_FEATURE_COUNT = OPERATING_SYSTEM_DEVICE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Device Number</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_DEVICE___GET_DEVICE_NUMBER = OPERATING_SYSTEM_DEVICE___GET_DEVICE_NUMBER;

	/**
	 * The number of operations of the '<em>Java Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_DEVICE_OPERATION_COUNT = OPERATING_SYSTEM_DEVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.deploymentdevices.impl.SimulatorImpl <em>Simulator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.deploymentdevices.impl.SimulatorImpl
	 * @see es.udima.cesarlaso.tfm.deploymentdevices.impl.DeploymentdevicesPackageImpl#getSimulator()
	 * @generated
	 */
	int SIMULATOR = 3;

	/**
	 * The feature id for the '<em><b>Wifi Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATOR__WIFI_CONFIGURATION = JAVA_DEVICE__WIFI_CONFIGURATION;

	/**
	 * The number of structural features of the '<em>Simulator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATOR_FEATURE_COUNT = JAVA_DEVICE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Device Number</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATOR___GET_DEVICE_NUMBER = JAVA_DEVICE___GET_DEVICE_NUMBER;

	/**
	 * The number of operations of the '<em>Simulator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATOR_OPERATION_COUNT = JAVA_DEVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.deploymentdevices.impl.RaspberryImpl <em>Raspberry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.deploymentdevices.impl.RaspberryImpl
	 * @see es.udima.cesarlaso.tfm.deploymentdevices.impl.DeploymentdevicesPackageImpl#getRaspberry()
	 * @generated
	 */
	int RASPBERRY = 4;

	/**
	 * The feature id for the '<em><b>Wifi Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASPBERRY__WIFI_CONFIGURATION = JAVA_DEVICE__WIFI_CONFIGURATION;

	/**
	 * The number of structural features of the '<em>Raspberry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASPBERRY_FEATURE_COUNT = JAVA_DEVICE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Device Number</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASPBERRY___GET_DEVICE_NUMBER = JAVA_DEVICE___GET_DEVICE_NUMBER;

	/**
	 * The number of operations of the '<em>Raspberry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASPBERRY_OPERATION_COUNT = JAVA_DEVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.deploymentdevices.impl.BeagleboneImpl <em>Beaglebone</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.deploymentdevices.impl.BeagleboneImpl
	 * @see es.udima.cesarlaso.tfm.deploymentdevices.impl.DeploymentdevicesPackageImpl#getBeaglebone()
	 * @generated
	 */
	int BEAGLEBONE = 5;

	/**
	 * The feature id for the '<em><b>Wifi Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEAGLEBONE__WIFI_CONFIGURATION = JAVA_DEVICE__WIFI_CONFIGURATION;

	/**
	 * The number of structural features of the '<em>Beaglebone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEAGLEBONE_FEATURE_COUNT = JAVA_DEVICE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Device Number</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEAGLEBONE___GET_DEVICE_NUMBER = JAVA_DEVICE___GET_DEVICE_NUMBER;

	/**
	 * The number of operations of the '<em>Beaglebone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEAGLEBONE_OPERATION_COUNT = JAVA_DEVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.deploymentdevices.impl.ESP8266Impl <em>ESP8266</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.deploymentdevices.impl.ESP8266Impl
	 * @see es.udima.cesarlaso.tfm.deploymentdevices.impl.DeploymentdevicesPackageImpl#getESP8266()
	 * @generated
	 */
	int ESP8266 = 6;

	/**
	 * The feature id for the '<em><b>Wifi Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESP8266__WIFI_CONFIGURATION = DEVICE__WIFI_CONFIGURATION;

	/**
	 * The number of structural features of the '<em>ESP8266</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESP8266_FEATURE_COUNT = DEVICE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Device Number</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESP8266___GET_DEVICE_NUMBER = DEVICE___GET_DEVICE_NUMBER;

	/**
	 * The number of operations of the '<em>ESP8266</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESP8266_OPERATION_COUNT = DEVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.deploymentdevices.impl.WifiConfigurationImpl <em>Wifi Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.deploymentdevices.impl.WifiConfigurationImpl
	 * @see es.udima.cesarlaso.tfm.deploymentdevices.impl.DeploymentdevicesPackageImpl#getWifiConfiguration()
	 * @generated
	 */
	int WIFI_CONFIGURATION = 7;

	/**
	 * The feature id for the '<em><b>Ssid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIFI_CONFIGURATION__SSID = 0;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIFI_CONFIGURATION__PASSWORD = 1;

	/**
	 * The number of structural features of the '<em>Wifi Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIFI_CONFIGURATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Wifi Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIFI_CONFIGURATION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.deploymentdevices.Device <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device</em>'.
	 * @see es.udima.cesarlaso.tfm.deploymentdevices.Device
	 * @generated
	 */
	EClass getDevice();

	/**
	 * Returns the meta object for the containment reference '{@link es.udima.cesarlaso.tfm.deploymentdevices.Device#getWifiConfiguration <em>Wifi Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Wifi Configuration</em>'.
	 * @see es.udima.cesarlaso.tfm.deploymentdevices.Device#getWifiConfiguration()
	 * @see #getDevice()
	 * @generated
	 */
	EReference getDevice_WifiConfiguration();

	/**
	 * Returns the meta object for the '{@link es.udima.cesarlaso.tfm.deploymentdevices.Device#getDeviceNumber() <em>Get Device Number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Device Number</em>' operation.
	 * @see es.udima.cesarlaso.tfm.deploymentdevices.Device#getDeviceNumber()
	 * @generated
	 */
	EOperation getDevice__GetDeviceNumber();

	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.deploymentdevices.OperatingSystemDevice <em>Operating System Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operating System Device</em>'.
	 * @see es.udima.cesarlaso.tfm.deploymentdevices.OperatingSystemDevice
	 * @generated
	 */
	EClass getOperatingSystemDevice();

	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.deploymentdevices.JavaDevice <em>Java Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Device</em>'.
	 * @see es.udima.cesarlaso.tfm.deploymentdevices.JavaDevice
	 * @generated
	 */
	EClass getJavaDevice();

	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.deploymentdevices.Simulator <em>Simulator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simulator</em>'.
	 * @see es.udima.cesarlaso.tfm.deploymentdevices.Simulator
	 * @generated
	 */
	EClass getSimulator();

	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.deploymentdevices.Raspberry <em>Raspberry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Raspberry</em>'.
	 * @see es.udima.cesarlaso.tfm.deploymentdevices.Raspberry
	 * @generated
	 */
	EClass getRaspberry();

	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.deploymentdevices.Beaglebone <em>Beaglebone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Beaglebone</em>'.
	 * @see es.udima.cesarlaso.tfm.deploymentdevices.Beaglebone
	 * @generated
	 */
	EClass getBeaglebone();

	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.deploymentdevices.ESP8266 <em>ESP8266</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ESP8266</em>'.
	 * @see es.udima.cesarlaso.tfm.deploymentdevices.ESP8266
	 * @generated
	 */
	EClass getESP8266();

	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.deploymentdevices.WifiConfiguration <em>Wifi Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wifi Configuration</em>'.
	 * @see es.udima.cesarlaso.tfm.deploymentdevices.WifiConfiguration
	 * @generated
	 */
	EClass getWifiConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link es.udima.cesarlaso.tfm.deploymentdevices.WifiConfiguration#getSsid <em>Ssid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ssid</em>'.
	 * @see es.udima.cesarlaso.tfm.deploymentdevices.WifiConfiguration#getSsid()
	 * @see #getWifiConfiguration()
	 * @generated
	 */
	EAttribute getWifiConfiguration_Ssid();

	/**
	 * Returns the meta object for the attribute '{@link es.udima.cesarlaso.tfm.deploymentdevices.WifiConfiguration#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see es.udima.cesarlaso.tfm.deploymentdevices.WifiConfiguration#getPassword()
	 * @see #getWifiConfiguration()
	 * @generated
	 */
	EAttribute getWifiConfiguration_Password();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DeploymentdevicesFactory getDeploymentdevicesFactory();

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
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.deploymentdevices.impl.DeviceImpl <em>Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.deploymentdevices.impl.DeviceImpl
		 * @see es.udima.cesarlaso.tfm.deploymentdevices.impl.DeploymentdevicesPackageImpl#getDevice()
		 * @generated
		 */
		EClass DEVICE = eINSTANCE.getDevice();

		/**
		 * The meta object literal for the '<em><b>Wifi Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE__WIFI_CONFIGURATION = eINSTANCE.getDevice_WifiConfiguration();

		/**
		 * The meta object literal for the '<em><b>Get Device Number</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DEVICE___GET_DEVICE_NUMBER = eINSTANCE.getDevice__GetDeviceNumber();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.deploymentdevices.impl.OperatingSystemDeviceImpl <em>Operating System Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.deploymentdevices.impl.OperatingSystemDeviceImpl
		 * @see es.udima.cesarlaso.tfm.deploymentdevices.impl.DeploymentdevicesPackageImpl#getOperatingSystemDevice()
		 * @generated
		 */
		EClass OPERATING_SYSTEM_DEVICE = eINSTANCE.getOperatingSystemDevice();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.deploymentdevices.impl.JavaDeviceImpl <em>Java Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.deploymentdevices.impl.JavaDeviceImpl
		 * @see es.udima.cesarlaso.tfm.deploymentdevices.impl.DeploymentdevicesPackageImpl#getJavaDevice()
		 * @generated
		 */
		EClass JAVA_DEVICE = eINSTANCE.getJavaDevice();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.deploymentdevices.impl.SimulatorImpl <em>Simulator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.deploymentdevices.impl.SimulatorImpl
		 * @see es.udima.cesarlaso.tfm.deploymentdevices.impl.DeploymentdevicesPackageImpl#getSimulator()
		 * @generated
		 */
		EClass SIMULATOR = eINSTANCE.getSimulator();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.deploymentdevices.impl.RaspberryImpl <em>Raspberry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.deploymentdevices.impl.RaspberryImpl
		 * @see es.udima.cesarlaso.tfm.deploymentdevices.impl.DeploymentdevicesPackageImpl#getRaspberry()
		 * @generated
		 */
		EClass RASPBERRY = eINSTANCE.getRaspberry();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.deploymentdevices.impl.BeagleboneImpl <em>Beaglebone</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.deploymentdevices.impl.BeagleboneImpl
		 * @see es.udima.cesarlaso.tfm.deploymentdevices.impl.DeploymentdevicesPackageImpl#getBeaglebone()
		 * @generated
		 */
		EClass BEAGLEBONE = eINSTANCE.getBeaglebone();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.deploymentdevices.impl.ESP8266Impl <em>ESP8266</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.deploymentdevices.impl.ESP8266Impl
		 * @see es.udima.cesarlaso.tfm.deploymentdevices.impl.DeploymentdevicesPackageImpl#getESP8266()
		 * @generated
		 */
		EClass ESP8266 = eINSTANCE.getESP8266();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.deploymentdevices.impl.WifiConfigurationImpl <em>Wifi Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.deploymentdevices.impl.WifiConfigurationImpl
		 * @see es.udima.cesarlaso.tfm.deploymentdevices.impl.DeploymentdevicesPackageImpl#getWifiConfiguration()
		 * @generated
		 */
		EClass WIFI_CONFIGURATION = eINSTANCE.getWifiConfiguration();

		/**
		 * The meta object literal for the '<em><b>Ssid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIFI_CONFIGURATION__SSID = eINSTANCE.getWifiConfiguration_Ssid();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIFI_CONFIGURATION__PASSWORD = eINSTANCE.getWifiConfiguration_Password();

	}

} //DeploymentdevicesPackage
