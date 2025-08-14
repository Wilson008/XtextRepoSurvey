/**
 */
package es.udima.cesarlaso.tfm.deploymentdevices;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see es.udima.cesarlaso.tfm.deploymentdevices.DeploymentdevicesPackage
 * @generated
 */
public interface DeploymentdevicesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DeploymentdevicesFactory eINSTANCE = es.udima.cesarlaso.tfm.deploymentdevices.impl.DeploymentdevicesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Simulator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simulator</em>'.
	 * @generated
	 */
	Simulator createSimulator();

	/**
	 * Returns a new object of class '<em>Raspberry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Raspberry</em>'.
	 * @generated
	 */
	Raspberry createRaspberry();

	/**
	 * Returns a new object of class '<em>Beaglebone</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Beaglebone</em>'.
	 * @generated
	 */
	Beaglebone createBeaglebone();

	/**
	 * Returns a new object of class '<em>ESP8266</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ESP8266</em>'.
	 * @generated
	 */
	ESP8266 createESP8266();

	/**
	 * Returns a new object of class '<em>Wifi Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wifi Configuration</em>'.
	 * @generated
	 */
	WifiConfiguration createWifiConfiguration();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DeploymentdevicesPackage getDeploymentdevicesPackage();

} //DeploymentdevicesFactory
