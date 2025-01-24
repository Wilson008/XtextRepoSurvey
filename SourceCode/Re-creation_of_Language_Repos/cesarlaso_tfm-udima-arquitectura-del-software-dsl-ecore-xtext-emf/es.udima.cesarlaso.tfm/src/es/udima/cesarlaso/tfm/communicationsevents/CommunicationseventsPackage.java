/**
 */
package es.udima.cesarlaso.tfm.communicationsevents;

import es.udima.cesarlaso.tfm.events.EventsPackage;

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
 * @see es.udima.cesarlaso.tfm.communicationsevents.CommunicationseventsFactory
 * @model kind="package"
 * @generated
 */
public interface CommunicationseventsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "communicationsevents";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://tfm.cesarlaso.udima.es/communications/events";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "es.udima.cesarlaso.tfm.communications.events";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CommunicationseventsPackage eINSTANCE = es.udima.cesarlaso.tfm.communicationsevents.impl.CommunicationseventsPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.communicationsevents.impl.CommunicationEventImpl <em>Communication Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.communicationsevents.impl.CommunicationEventImpl
	 * @see es.udima.cesarlaso.tfm.communicationsevents.impl.CommunicationseventsPackageImpl#getCommunicationEvent()
	 * @generated
	 */
	int COMMUNICATION_EVENT = 0;

	/**
	 * The feature id for the '<em><b>Actuators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT__ACTUATORS = EventsPackage.EVENT__ACTUATORS;

	/**
	 * The number of structural features of the '<em>Communication Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_FEATURE_COUNT = EventsPackage.EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Communication Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_OPERATION_COUNT = EventsPackage.EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.communicationsevents.impl.NetworkEventImpl <em>Network Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.communicationsevents.impl.NetworkEventImpl
	 * @see es.udima.cesarlaso.tfm.communicationsevents.impl.CommunicationseventsPackageImpl#getNetworkEvent()
	 * @generated
	 */
	int NETWORK_EVENT = 1;

	/**
	 * The feature id for the '<em><b>Actuators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_EVENT__ACTUATORS = COMMUNICATION_EVENT__ACTUATORS;

	/**
	 * The number of structural features of the '<em>Network Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_EVENT_FEATURE_COUNT = COMMUNICATION_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Network Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_EVENT_OPERATION_COUNT = COMMUNICATION_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.communicationsevents.impl.NetworkConnectedImpl <em>Network Connected</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.communicationsevents.impl.NetworkConnectedImpl
	 * @see es.udima.cesarlaso.tfm.communicationsevents.impl.CommunicationseventsPackageImpl#getNetworkConnected()
	 * @generated
	 */
	int NETWORK_CONNECTED = 2;

	/**
	 * The feature id for the '<em><b>Actuators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_CONNECTED__ACTUATORS = NETWORK_EVENT__ACTUATORS;

	/**
	 * The number of structural features of the '<em>Network Connected</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_CONNECTED_FEATURE_COUNT = NETWORK_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Network Connected</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_CONNECTED_OPERATION_COUNT = NETWORK_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.communicationsevents.impl.NetworkDisconnectedImpl <em>Network Disconnected</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.communicationsevents.impl.NetworkDisconnectedImpl
	 * @see es.udima.cesarlaso.tfm.communicationsevents.impl.CommunicationseventsPackageImpl#getNetworkDisconnected()
	 * @generated
	 */
	int NETWORK_DISCONNECTED = 3;

	/**
	 * The feature id for the '<em><b>Actuators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_DISCONNECTED__ACTUATORS = NETWORK_EVENT__ACTUATORS;

	/**
	 * The number of structural features of the '<em>Network Disconnected</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_DISCONNECTED_FEATURE_COUNT = NETWORK_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Network Disconnected</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_DISCONNECTED_OPERATION_COUNT = NETWORK_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.communicationsevents.impl.ServerEventImpl <em>Server Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.communicationsevents.impl.ServerEventImpl
	 * @see es.udima.cesarlaso.tfm.communicationsevents.impl.CommunicationseventsPackageImpl#getServerEvent()
	 * @generated
	 */
	int SERVER_EVENT = 4;

	/**
	 * The feature id for the '<em><b>Actuators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_EVENT__ACTUATORS = COMMUNICATION_EVENT__ACTUATORS;

	/**
	 * The number of structural features of the '<em>Server Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_EVENT_FEATURE_COUNT = COMMUNICATION_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Server Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_EVENT_OPERATION_COUNT = COMMUNICATION_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.communicationsevents.impl.ServerConnectedImpl <em>Server Connected</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.communicationsevents.impl.ServerConnectedImpl
	 * @see es.udima.cesarlaso.tfm.communicationsevents.impl.CommunicationseventsPackageImpl#getServerConnected()
	 * @generated
	 */
	int SERVER_CONNECTED = 5;

	/**
	 * The feature id for the '<em><b>Actuators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_CONNECTED__ACTUATORS = SERVER_EVENT__ACTUATORS;

	/**
	 * The number of structural features of the '<em>Server Connected</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_CONNECTED_FEATURE_COUNT = SERVER_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Server Connected</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_CONNECTED_OPERATION_COUNT = SERVER_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.communicationsevents.impl.ServerDisconnectedImpl <em>Server Disconnected</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.communicationsevents.impl.ServerDisconnectedImpl
	 * @see es.udima.cesarlaso.tfm.communicationsevents.impl.CommunicationseventsPackageImpl#getServerDisconnected()
	 * @generated
	 */
	int SERVER_DISCONNECTED = 6;

	/**
	 * The feature id for the '<em><b>Actuators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_DISCONNECTED__ACTUATORS = SERVER_EVENT__ACTUATORS;

	/**
	 * The number of structural features of the '<em>Server Disconnected</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_DISCONNECTED_FEATURE_COUNT = SERVER_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Server Disconnected</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_DISCONNECTED_OPERATION_COUNT = SERVER_EVENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.communicationsevents.CommunicationEvent <em>Communication Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication Event</em>'.
	 * @see es.udima.cesarlaso.tfm.communicationsevents.CommunicationEvent
	 * @generated
	 */
	EClass getCommunicationEvent();

	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.communicationsevents.NetworkEvent <em>Network Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Event</em>'.
	 * @see es.udima.cesarlaso.tfm.communicationsevents.NetworkEvent
	 * @generated
	 */
	EClass getNetworkEvent();

	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.communicationsevents.NetworkConnected <em>Network Connected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Connected</em>'.
	 * @see es.udima.cesarlaso.tfm.communicationsevents.NetworkConnected
	 * @generated
	 */
	EClass getNetworkConnected();

	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.communicationsevents.NetworkDisconnected <em>Network Disconnected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Disconnected</em>'.
	 * @see es.udima.cesarlaso.tfm.communicationsevents.NetworkDisconnected
	 * @generated
	 */
	EClass getNetworkDisconnected();

	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.communicationsevents.ServerEvent <em>Server Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Server Event</em>'.
	 * @see es.udima.cesarlaso.tfm.communicationsevents.ServerEvent
	 * @generated
	 */
	EClass getServerEvent();

	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.communicationsevents.ServerConnected <em>Server Connected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Server Connected</em>'.
	 * @see es.udima.cesarlaso.tfm.communicationsevents.ServerConnected
	 * @generated
	 */
	EClass getServerConnected();

	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.communicationsevents.ServerDisconnected <em>Server Disconnected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Server Disconnected</em>'.
	 * @see es.udima.cesarlaso.tfm.communicationsevents.ServerDisconnected
	 * @generated
	 */
	EClass getServerDisconnected();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CommunicationseventsFactory getCommunicationseventsFactory();

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
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.communicationsevents.impl.CommunicationEventImpl <em>Communication Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.communicationsevents.impl.CommunicationEventImpl
		 * @see es.udima.cesarlaso.tfm.communicationsevents.impl.CommunicationseventsPackageImpl#getCommunicationEvent()
		 * @generated
		 */
		EClass COMMUNICATION_EVENT = eINSTANCE.getCommunicationEvent();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.communicationsevents.impl.NetworkEventImpl <em>Network Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.communicationsevents.impl.NetworkEventImpl
		 * @see es.udima.cesarlaso.tfm.communicationsevents.impl.CommunicationseventsPackageImpl#getNetworkEvent()
		 * @generated
		 */
		EClass NETWORK_EVENT = eINSTANCE.getNetworkEvent();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.communicationsevents.impl.NetworkConnectedImpl <em>Network Connected</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.communicationsevents.impl.NetworkConnectedImpl
		 * @see es.udima.cesarlaso.tfm.communicationsevents.impl.CommunicationseventsPackageImpl#getNetworkConnected()
		 * @generated
		 */
		EClass NETWORK_CONNECTED = eINSTANCE.getNetworkConnected();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.communicationsevents.impl.NetworkDisconnectedImpl <em>Network Disconnected</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.communicationsevents.impl.NetworkDisconnectedImpl
		 * @see es.udima.cesarlaso.tfm.communicationsevents.impl.CommunicationseventsPackageImpl#getNetworkDisconnected()
		 * @generated
		 */
		EClass NETWORK_DISCONNECTED = eINSTANCE.getNetworkDisconnected();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.communicationsevents.impl.ServerEventImpl <em>Server Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.communicationsevents.impl.ServerEventImpl
		 * @see es.udima.cesarlaso.tfm.communicationsevents.impl.CommunicationseventsPackageImpl#getServerEvent()
		 * @generated
		 */
		EClass SERVER_EVENT = eINSTANCE.getServerEvent();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.communicationsevents.impl.ServerConnectedImpl <em>Server Connected</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.communicationsevents.impl.ServerConnectedImpl
		 * @see es.udima.cesarlaso.tfm.communicationsevents.impl.CommunicationseventsPackageImpl#getServerConnected()
		 * @generated
		 */
		EClass SERVER_CONNECTED = eINSTANCE.getServerConnected();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.communicationsevents.impl.ServerDisconnectedImpl <em>Server Disconnected</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.communicationsevents.impl.ServerDisconnectedImpl
		 * @see es.udima.cesarlaso.tfm.communicationsevents.impl.CommunicationseventsPackageImpl#getServerDisconnected()
		 * @generated
		 */
		EClass SERVER_DISCONNECTED = eINSTANCE.getServerDisconnected();

	}

} //CommunicationseventsPackage
