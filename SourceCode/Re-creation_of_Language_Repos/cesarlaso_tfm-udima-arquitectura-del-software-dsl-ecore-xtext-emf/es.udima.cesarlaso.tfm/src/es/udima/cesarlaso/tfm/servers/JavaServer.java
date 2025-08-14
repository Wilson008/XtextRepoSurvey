/**
 */
package es.udima.cesarlaso.tfm.servers;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java Server</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.udima.cesarlaso.tfm.servers.JavaServer#getNetworkInterfaceAddress <em>Network Interface Address</em>}</li>
 *   <li>{@link es.udima.cesarlaso.tfm.servers.JavaServer#getNetworkInterfacePort <em>Network Interface Port</em>}</li>
 * </ul>
 *
 * @see es.udima.cesarlaso.tfm.servers.ServersPackage#getJavaServer()
 * @model
 * @generated
 */
public interface JavaServer extends Server {
	/**
	 * Returns the value of the '<em><b>Network Interface Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network Interface Address</em>' attribute.
	 * @see #setNetworkInterfaceAddress(String)
	 * @see es.udima.cesarlaso.tfm.servers.ServersPackage#getJavaServer_NetworkInterfaceAddress()
	 * @model required="true"
	 * @generated
	 */
	String getNetworkInterfaceAddress();

	/**
	 * Sets the value of the '{@link es.udima.cesarlaso.tfm.servers.JavaServer#getNetworkInterfaceAddress <em>Network Interface Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network Interface Address</em>' attribute.
	 * @see #getNetworkInterfaceAddress()
	 * @generated
	 */
	void setNetworkInterfaceAddress(String value);

	/**
	 * Returns the value of the '<em><b>Network Interface Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network Interface Port</em>' attribute.
	 * @see #setNetworkInterfacePort(int)
	 * @see es.udima.cesarlaso.tfm.servers.ServersPackage#getJavaServer_NetworkInterfacePort()
	 * @model required="true"
	 * @generated
	 */
	int getNetworkInterfacePort();

	/**
	 * Sets the value of the '{@link es.udima.cesarlaso.tfm.servers.JavaServer#getNetworkInterfacePort <em>Network Interface Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network Interface Port</em>' attribute.
	 * @see #getNetworkInterfacePort()
	 * @generated
	 */
	void setNetworkInterfacePort(int value);

} // JavaServer
