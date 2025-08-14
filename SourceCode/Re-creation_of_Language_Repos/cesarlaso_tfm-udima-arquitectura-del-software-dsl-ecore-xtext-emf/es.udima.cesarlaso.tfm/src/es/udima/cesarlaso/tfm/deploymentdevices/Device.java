/**
 */
package es.udima.cesarlaso.tfm.deploymentdevices;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.udima.cesarlaso.tfm.deploymentdevices.Device#getWifiConfiguration <em>Wifi Configuration</em>}</li>
 * </ul>
 *
 * @see es.udima.cesarlaso.tfm.deploymentdevices.DeploymentdevicesPackage#getDevice()
 * @model abstract="true"
 * @generated
 */
public interface Device extends EObject {
	/**
	 * Returns the value of the '<em><b>Wifi Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wifi Configuration</em>' containment reference.
	 * @see #setWifiConfiguration(WifiConfiguration)
	 * @see es.udima.cesarlaso.tfm.deploymentdevices.DeploymentdevicesPackage#getDevice_WifiConfiguration()
	 * @model containment="true"
	 * @generated
	 */
	WifiConfiguration getWifiConfiguration();

	/**
	 * Sets the value of the '{@link es.udima.cesarlaso.tfm.deploymentdevices.Device#getWifiConfiguration <em>Wifi Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wifi Configuration</em>' containment reference.
	 * @see #getWifiConfiguration()
	 * @generated
	 */
	void setWifiConfiguration(WifiConfiguration value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	long getDeviceNumber();

} // Device
