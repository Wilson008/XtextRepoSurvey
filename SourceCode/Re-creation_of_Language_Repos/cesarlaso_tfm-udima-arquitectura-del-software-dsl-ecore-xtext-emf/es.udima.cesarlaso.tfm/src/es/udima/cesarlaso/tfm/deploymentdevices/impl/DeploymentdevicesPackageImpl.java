/**
 */
package es.udima.cesarlaso.tfm.deploymentdevices.impl;

import es.udima.cesarlaso.tfm.deploymentdevices.Beaglebone;
import es.udima.cesarlaso.tfm.deploymentdevices.DeploymentdevicesFactory;
import es.udima.cesarlaso.tfm.deploymentdevices.DeploymentdevicesPackage;
import es.udima.cesarlaso.tfm.deploymentdevices.Device;
import es.udima.cesarlaso.tfm.deploymentdevices.JavaDevice;
import es.udima.cesarlaso.tfm.deploymentdevices.OperatingSystemDevice;
import es.udima.cesarlaso.tfm.deploymentdevices.Raspberry;
import es.udima.cesarlaso.tfm.deploymentdevices.Simulator;
import es.udima.cesarlaso.tfm.deploymentdevices.WifiConfiguration;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DeploymentdevicesPackageImpl extends EPackageImpl implements DeploymentdevicesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operatingSystemDeviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaDeviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simulatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass raspberryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass beagleboneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esp8266EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wifiConfigurationEClass = null;

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
	 * @see es.udima.cesarlaso.tfm.deploymentdevices.DeploymentdevicesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DeploymentdevicesPackageImpl() {
		super(eNS_URI, DeploymentdevicesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DeploymentdevicesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DeploymentdevicesPackage init() {
		if (isInited) return (DeploymentdevicesPackage)EPackage.Registry.INSTANCE.getEPackage(DeploymentdevicesPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDeploymentdevicesPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DeploymentdevicesPackageImpl theDeploymentdevicesPackage = registeredDeploymentdevicesPackage instanceof DeploymentdevicesPackageImpl ? (DeploymentdevicesPackageImpl)registeredDeploymentdevicesPackage : new DeploymentdevicesPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theDeploymentdevicesPackage.createPackageContents();

		// Initialize created meta-data
		theDeploymentdevicesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDeploymentdevicesPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DeploymentdevicesPackage.eNS_URI, theDeploymentdevicesPackage);
		return theDeploymentdevicesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDevice() {
		return deviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDevice_WifiConfiguration() {
		return (EReference)deviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDevice__GetDeviceNumber() {
		return deviceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOperatingSystemDevice() {
		return operatingSystemDeviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJavaDevice() {
		return javaDeviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSimulator() {
		return simulatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRaspberry() {
		return raspberryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBeaglebone() {
		return beagleboneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getESP8266() {
		return esp8266EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWifiConfiguration() {
		return wifiConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWifiConfiguration_Ssid() {
		return (EAttribute)wifiConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWifiConfiguration_Password() {
		return (EAttribute)wifiConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeploymentdevicesFactory getDeploymentdevicesFactory() {
		return (DeploymentdevicesFactory)getEFactoryInstance();
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
		deviceEClass = createEClass(DEVICE);
		createEReference(deviceEClass, DEVICE__WIFI_CONFIGURATION);
		createEOperation(deviceEClass, DEVICE___GET_DEVICE_NUMBER);

		operatingSystemDeviceEClass = createEClass(OPERATING_SYSTEM_DEVICE);

		javaDeviceEClass = createEClass(JAVA_DEVICE);

		simulatorEClass = createEClass(SIMULATOR);

		raspberryEClass = createEClass(RASPBERRY);

		beagleboneEClass = createEClass(BEAGLEBONE);

		esp8266EClass = createEClass(ESP8266);

		wifiConfigurationEClass = createEClass(WIFI_CONFIGURATION);
		createEAttribute(wifiConfigurationEClass, WIFI_CONFIGURATION__SSID);
		createEAttribute(wifiConfigurationEClass, WIFI_CONFIGURATION__PASSWORD);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		operatingSystemDeviceEClass.getESuperTypes().add(this.getDevice());
		javaDeviceEClass.getESuperTypes().add(this.getOperatingSystemDevice());
		simulatorEClass.getESuperTypes().add(this.getJavaDevice());
		raspberryEClass.getESuperTypes().add(this.getJavaDevice());
		beagleboneEClass.getESuperTypes().add(this.getJavaDevice());
		esp8266EClass.getESuperTypes().add(this.getDevice());

		// Initialize classes, features, and operations; add parameters
		initEClass(deviceEClass, Device.class, "Device", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDevice_WifiConfiguration(), this.getWifiConfiguration(), null, "wifiConfiguration", null, 0, 1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getDevice__GetDeviceNumber(), ecorePackage.getELong(), "getDeviceNumber", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(operatingSystemDeviceEClass, OperatingSystemDevice.class, "OperatingSystemDevice", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(javaDeviceEClass, JavaDevice.class, "JavaDevice", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(simulatorEClass, Simulator.class, "Simulator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(raspberryEClass, Raspberry.class, "Raspberry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(beagleboneEClass, Beaglebone.class, "Beaglebone", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(esp8266EClass, es.udima.cesarlaso.tfm.deploymentdevices.ESP8266.class, "ESP8266", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(wifiConfigurationEClass, WifiConfiguration.class, "WifiConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWifiConfiguration_Ssid(), ecorePackage.getEString(), "ssid", null, 1, 1, WifiConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWifiConfiguration_Password(), ecorePackage.getEString(), "password", null, 1, 1, WifiConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //DeploymentdevicesPackageImpl
