/**
 */
package es.udima.cesarlaso.tfm.servers;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see es.udima.cesarlaso.tfm.servers.ServersFactory
 * @model kind="package"
 * @generated
 */
public interface ServersPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "servers";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://tfm.cesarlaso.udima.es/servers";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "es.udima.cesarlaso.tfm.servers";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ServersPackage eINSTANCE = es.udima.cesarlaso.tfm.servers.impl.ServersPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.servers.impl.ServerImpl <em>Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.servers.impl.ServerImpl
	 * @see es.udima.cesarlaso.tfm.servers.impl.ServersPackageImpl#getServer()
	 * @generated
	 */
	int SERVER = 0;

	/**
	 * The number of structural features of the '<em>Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.servers.impl.JavaServerImpl <em>Java Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.servers.impl.JavaServerImpl
	 * @see es.udima.cesarlaso.tfm.servers.impl.ServersPackageImpl#getJavaServer()
	 * @generated
	 */
	int JAVA_SERVER = 1;

	/**
	 * The feature id for the '<em><b>Network Interface Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_SERVER__NETWORK_INTERFACE_ADDRESS = SERVER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Network Interface Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_SERVER__NETWORK_INTERFACE_PORT = SERVER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Java Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_SERVER_FEATURE_COUNT = SERVER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Java Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_SERVER_OPERATION_COUNT = SERVER_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.servers.Server <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Server</em>'.
	 * @see es.udima.cesarlaso.tfm.servers.Server
	 * @generated
	 */
	EClass getServer();

	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.servers.JavaServer <em>Java Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Server</em>'.
	 * @see es.udima.cesarlaso.tfm.servers.JavaServer
	 * @generated
	 */
	EClass getJavaServer();

	/**
	 * Returns the meta object for the attribute '{@link es.udima.cesarlaso.tfm.servers.JavaServer#getNetworkInterfaceAddress <em>Network Interface Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Network Interface Address</em>'.
	 * @see es.udima.cesarlaso.tfm.servers.JavaServer#getNetworkInterfaceAddress()
	 * @see #getJavaServer()
	 * @generated
	 */
	EAttribute getJavaServer_NetworkInterfaceAddress();

	/**
	 * Returns the meta object for the attribute '{@link es.udima.cesarlaso.tfm.servers.JavaServer#getNetworkInterfacePort <em>Network Interface Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Network Interface Port</em>'.
	 * @see es.udima.cesarlaso.tfm.servers.JavaServer#getNetworkInterfacePort()
	 * @see #getJavaServer()
	 * @generated
	 */
	EAttribute getJavaServer_NetworkInterfacePort();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ServersFactory getServersFactory();

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
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.servers.impl.ServerImpl <em>Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.servers.impl.ServerImpl
		 * @see es.udima.cesarlaso.tfm.servers.impl.ServersPackageImpl#getServer()
		 * @generated
		 */
		EClass SERVER = eINSTANCE.getServer();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.servers.impl.JavaServerImpl <em>Java Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.servers.impl.JavaServerImpl
		 * @see es.udima.cesarlaso.tfm.servers.impl.ServersPackageImpl#getJavaServer()
		 * @generated
		 */
		EClass JAVA_SERVER = eINSTANCE.getJavaServer();

		/**
		 * The meta object literal for the '<em><b>Network Interface Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_SERVER__NETWORK_INTERFACE_ADDRESS = eINSTANCE.getJavaServer_NetworkInterfaceAddress();

		/**
		 * The meta object literal for the '<em><b>Network Interface Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_SERVER__NETWORK_INTERFACE_PORT = eINSTANCE.getJavaServer_NetworkInterfacePort();

	}

} //ServersPackage
