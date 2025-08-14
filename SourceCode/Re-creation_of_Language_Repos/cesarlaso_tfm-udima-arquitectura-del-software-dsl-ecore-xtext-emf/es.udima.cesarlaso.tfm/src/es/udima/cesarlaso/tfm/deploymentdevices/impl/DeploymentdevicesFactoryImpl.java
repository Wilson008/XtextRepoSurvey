/**
 */
package es.udima.cesarlaso.tfm.deploymentdevices.impl;

import es.udima.cesarlaso.tfm.deploymentdevices.*;

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
public class DeploymentdevicesFactoryImpl extends EFactoryImpl implements DeploymentdevicesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DeploymentdevicesFactory init() {
		try {
			DeploymentdevicesFactory theDeploymentdevicesFactory = (DeploymentdevicesFactory)EPackage.Registry.INSTANCE.getEFactory(DeploymentdevicesPackage.eNS_URI);
			if (theDeploymentdevicesFactory != null) {
				return theDeploymentdevicesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DeploymentdevicesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentdevicesFactoryImpl() {
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
			case DeploymentdevicesPackage.SIMULATOR: return createSimulator();
			case DeploymentdevicesPackage.RASPBERRY: return createRaspberry();
			case DeploymentdevicesPackage.BEAGLEBONE: return createBeaglebone();
			case DeploymentdevicesPackage.ESP8266: return createESP8266();
			case DeploymentdevicesPackage.WIFI_CONFIGURATION: return createWifiConfiguration();
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
	public Simulator createSimulator() {
		SimulatorImpl simulator = new SimulatorImpl();
		return simulator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Raspberry createRaspberry() {
		RaspberryImpl raspberry = new RaspberryImpl();
		return raspberry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Beaglebone createBeaglebone() {
		BeagleboneImpl beaglebone = new BeagleboneImpl();
		return beaglebone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ESP8266 createESP8266() {
		ESP8266Impl esp8266 = new ESP8266Impl();
		return esp8266;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WifiConfiguration createWifiConfiguration() {
		WifiConfigurationImpl wifiConfiguration = new WifiConfigurationImpl();
		return wifiConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeploymentdevicesPackage getDeploymentdevicesPackage() {
		return (DeploymentdevicesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DeploymentdevicesPackage getPackage() {
		return DeploymentdevicesPackage.eINSTANCE;
	}

} //DeploymentdevicesFactoryImpl
