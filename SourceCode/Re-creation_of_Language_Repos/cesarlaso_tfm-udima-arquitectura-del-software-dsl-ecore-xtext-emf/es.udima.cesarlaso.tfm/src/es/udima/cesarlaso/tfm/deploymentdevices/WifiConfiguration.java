/**
 */
package es.udima.cesarlaso.tfm.deploymentdevices;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wifi Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.udima.cesarlaso.tfm.deploymentdevices.WifiConfiguration#getSsid <em>Ssid</em>}</li>
 *   <li>{@link es.udima.cesarlaso.tfm.deploymentdevices.WifiConfiguration#getPassword <em>Password</em>}</li>
 * </ul>
 *
 * @see es.udima.cesarlaso.tfm.deploymentdevices.DeploymentdevicesPackage#getWifiConfiguration()
 * @model
 * @generated
 */
public interface WifiConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>Ssid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ssid</em>' attribute.
	 * @see #setSsid(String)
	 * @see es.udima.cesarlaso.tfm.deploymentdevices.DeploymentdevicesPackage#getWifiConfiguration_Ssid()
	 * @model required="true"
	 * @generated
	 */
	String getSsid();

	/**
	 * Sets the value of the '{@link es.udima.cesarlaso.tfm.deploymentdevices.WifiConfiguration#getSsid <em>Ssid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ssid</em>' attribute.
	 * @see #getSsid()
	 * @generated
	 */
	void setSsid(String value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see es.udima.cesarlaso.tfm.deploymentdevices.DeploymentdevicesPackage#getWifiConfiguration_Password()
	 * @model required="true"
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link es.udima.cesarlaso.tfm.deploymentdevices.WifiConfiguration#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

} // WifiConfiguration
