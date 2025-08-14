/**
 */
package es.udima.cesarlaso.tfm.deploymentdevices.util;

import es.udima.cesarlaso.tfm.deploymentdevices.*;

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
 * @see es.udima.cesarlaso.tfm.deploymentdevices.DeploymentdevicesPackage
 * @generated
 */
public class DeploymentdevicesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DeploymentdevicesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentdevicesSwitch() {
		if (modelPackage == null) {
			modelPackage = DeploymentdevicesPackage.eINSTANCE;
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
			case DeploymentdevicesPackage.DEVICE: {
				Device device = (Device)theEObject;
				T result = caseDevice(device);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeploymentdevicesPackage.OPERATING_SYSTEM_DEVICE: {
				OperatingSystemDevice operatingSystemDevice = (OperatingSystemDevice)theEObject;
				T result = caseOperatingSystemDevice(operatingSystemDevice);
				if (result == null) result = caseDevice(operatingSystemDevice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeploymentdevicesPackage.JAVA_DEVICE: {
				JavaDevice javaDevice = (JavaDevice)theEObject;
				T result = caseJavaDevice(javaDevice);
				if (result == null) result = caseOperatingSystemDevice(javaDevice);
				if (result == null) result = caseDevice(javaDevice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeploymentdevicesPackage.SIMULATOR: {
				Simulator simulator = (Simulator)theEObject;
				T result = caseSimulator(simulator);
				if (result == null) result = caseJavaDevice(simulator);
				if (result == null) result = caseOperatingSystemDevice(simulator);
				if (result == null) result = caseDevice(simulator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeploymentdevicesPackage.RASPBERRY: {
				Raspberry raspberry = (Raspberry)theEObject;
				T result = caseRaspberry(raspberry);
				if (result == null) result = caseJavaDevice(raspberry);
				if (result == null) result = caseOperatingSystemDevice(raspberry);
				if (result == null) result = caseDevice(raspberry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeploymentdevicesPackage.BEAGLEBONE: {
				Beaglebone beaglebone = (Beaglebone)theEObject;
				T result = caseBeaglebone(beaglebone);
				if (result == null) result = caseJavaDevice(beaglebone);
				if (result == null) result = caseOperatingSystemDevice(beaglebone);
				if (result == null) result = caseDevice(beaglebone);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeploymentdevicesPackage.ESP8266: {
				ESP8266 esp8266 = (ESP8266)theEObject;
				T result = caseESP8266(esp8266);
				if (result == null) result = caseDevice(esp8266);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeploymentdevicesPackage.WIFI_CONFIGURATION: {
				WifiConfiguration wifiConfiguration = (WifiConfiguration)theEObject;
				T result = caseWifiConfiguration(wifiConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDevice(Device object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operating System Device</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operating System Device</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperatingSystemDevice(OperatingSystemDevice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java Device</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java Device</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJavaDevice(JavaDevice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simulator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simulator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimulator(Simulator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Raspberry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Raspberry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRaspberry(Raspberry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Beaglebone</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Beaglebone</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBeaglebone(Beaglebone object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ESP8266</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ESP8266</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESP8266(ESP8266 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wifi Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wifi Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWifiConfiguration(WifiConfiguration object) {
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

} //DeploymentdevicesSwitch
