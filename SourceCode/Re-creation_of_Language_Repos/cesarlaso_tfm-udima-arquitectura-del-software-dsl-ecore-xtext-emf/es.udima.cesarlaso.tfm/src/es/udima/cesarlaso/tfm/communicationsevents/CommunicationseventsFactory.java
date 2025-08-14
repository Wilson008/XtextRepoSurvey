/**
 */
package es.udima.cesarlaso.tfm.communicationsevents;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see es.udima.cesarlaso.tfm.communicationsevents.CommunicationseventsPackage
 * @generated
 */
public interface CommunicationseventsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CommunicationseventsFactory eINSTANCE = es.udima.cesarlaso.tfm.communicationsevents.impl.CommunicationseventsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Network Connected</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Network Connected</em>'.
	 * @generated
	 */
	NetworkConnected createNetworkConnected();

	/**
	 * Returns a new object of class '<em>Network Disconnected</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Network Disconnected</em>'.
	 * @generated
	 */
	NetworkDisconnected createNetworkDisconnected();

	/**
	 * Returns a new object of class '<em>Server Connected</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Server Connected</em>'.
	 * @generated
	 */
	ServerConnected createServerConnected();

	/**
	 * Returns a new object of class '<em>Server Disconnected</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Server Disconnected</em>'.
	 * @generated
	 */
	ServerDisconnected createServerDisconnected();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CommunicationseventsPackage getCommunicationseventsPackage();

} //CommunicationseventsFactory
