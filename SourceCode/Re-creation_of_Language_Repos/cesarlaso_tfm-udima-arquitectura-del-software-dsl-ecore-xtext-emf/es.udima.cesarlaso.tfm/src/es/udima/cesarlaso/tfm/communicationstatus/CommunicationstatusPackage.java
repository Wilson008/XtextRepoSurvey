/**
 */
package es.udima.cesarlaso.tfm.communicationstatus;

import es.udima.cesarlaso.tfm.communications.CommunicationsPackage;

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
 * @see es.udima.cesarlaso.tfm.communicationstatus.CommunicationstatusFactory
 * @model kind="package"
 * @generated
 */
public interface CommunicationstatusPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "communicationstatus";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://tfm.cesarlaso.udima.es/communications/status";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "es.udima.cesarlaso.tfm.communications.status";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CommunicationstatusPackage eINSTANCE = es.udima.cesarlaso.tfm.communicationstatus.impl.CommunicationstatusPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.communicationstatus.impl.StatusServiceImpl <em>Status Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.communicationstatus.impl.StatusServiceImpl
	 * @see es.udima.cesarlaso.tfm.communicationstatus.impl.CommunicationstatusPackageImpl#getStatusService()
	 * @generated
	 */
	int STATUS_SERVICE = 0;

	/**
	 * The number of structural features of the '<em>Status Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_SERVICE_FEATURE_COUNT = CommunicationsPackage.SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Status Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_SERVICE_OPERATION_COUNT = CommunicationsPackage.SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.communicationstatus.impl.PingImpl <em>Ping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.communicationstatus.impl.PingImpl
	 * @see es.udima.cesarlaso.tfm.communicationstatus.impl.CommunicationstatusPackageImpl#getPing()
	 * @generated
	 */
	int PING = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PING__ID = STATUS_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PING_FEATURE_COUNT = STATUS_SERVICE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PING_OPERATION_COUNT = STATUS_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.communicationstatus.impl.PongImpl <em>Pong</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.communicationstatus.impl.PongImpl
	 * @see es.udima.cesarlaso.tfm.communicationstatus.impl.CommunicationstatusPackageImpl#getPong()
	 * @generated
	 */
	int PONG = 2;

	/**
	 * The feature id for the '<em><b>Request Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PONG__REQUEST_ID = STATUS_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pong</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PONG_FEATURE_COUNT = STATUS_SERVICE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pong</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PONG_OPERATION_COUNT = STATUS_SERVICE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.communicationstatus.StatusService <em>Status Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Status Service</em>'.
	 * @see es.udima.cesarlaso.tfm.communicationstatus.StatusService
	 * @generated
	 */
	EClass getStatusService();

	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.communicationstatus.Ping <em>Ping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ping</em>'.
	 * @see es.udima.cesarlaso.tfm.communicationstatus.Ping
	 * @generated
	 */
	EClass getPing();

	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.communicationstatus.Pong <em>Pong</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pong</em>'.
	 * @see es.udima.cesarlaso.tfm.communicationstatus.Pong
	 * @generated
	 */
	EClass getPong();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CommunicationstatusFactory getCommunicationstatusFactory();

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
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.communicationstatus.impl.StatusServiceImpl <em>Status Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.communicationstatus.impl.StatusServiceImpl
		 * @see es.udima.cesarlaso.tfm.communicationstatus.impl.CommunicationstatusPackageImpl#getStatusService()
		 * @generated
		 */
		EClass STATUS_SERVICE = eINSTANCE.getStatusService();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.communicationstatus.impl.PingImpl <em>Ping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.communicationstatus.impl.PingImpl
		 * @see es.udima.cesarlaso.tfm.communicationstatus.impl.CommunicationstatusPackageImpl#getPing()
		 * @generated
		 */
		EClass PING = eINSTANCE.getPing();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.communicationstatus.impl.PongImpl <em>Pong</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.communicationstatus.impl.PongImpl
		 * @see es.udima.cesarlaso.tfm.communicationstatus.impl.CommunicationstatusPackageImpl#getPong()
		 * @generated
		 */
		EClass PONG = eINSTANCE.getPong();

	}

} //CommunicationstatusPackage
