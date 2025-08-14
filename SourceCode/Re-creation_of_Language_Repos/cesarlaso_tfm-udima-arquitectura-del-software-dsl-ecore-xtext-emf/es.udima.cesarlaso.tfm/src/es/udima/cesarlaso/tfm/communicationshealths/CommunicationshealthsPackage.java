/**
 */
package es.udima.cesarlaso.tfm.communicationshealths;

import es.udima.cesarlaso.tfm.communications.CommunicationsPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see es.udima.cesarlaso.tfm.communicationshealths.CommunicationshealthsFactory
 * @model kind="package"
 * @generated
 */
public interface CommunicationshealthsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "communicationshealths";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://tfm.cesarlaso.udima.es/communications/healths";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "es.udima.cesarlaso.tfm.communications.healths";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CommunicationshealthsPackage eINSTANCE = es.udima.cesarlaso.tfm.communicationshealths.impl.CommunicationshealthsPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.communicationshealths.impl.HealthServiceImpl <em>Health Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.communicationshealths.impl.HealthServiceImpl
	 * @see es.udima.cesarlaso.tfm.communicationshealths.impl.CommunicationshealthsPackageImpl#getHealthService()
	 * @generated
	 */
	int HEALTH_SERVICE = 0;

	/**
	 * The number of structural features of the '<em>Health Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_SERVICE_FEATURE_COUNT = CommunicationsPackage.SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Health Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_SERVICE_OPERATION_COUNT = CommunicationsPackage.SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.communicationshealths.impl.HealthMonitorRequestImpl <em>Health Monitor Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.communicationshealths.impl.HealthMonitorRequestImpl
	 * @see es.udima.cesarlaso.tfm.communicationshealths.impl.CommunicationshealthsPackageImpl#getHealthMonitorRequest()
	 * @generated
	 */
	int HEALTH_MONITOR_REQUEST = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_MONITOR_REQUEST__ID = HEALTH_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Monitor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_MONITOR_REQUEST__MONITOR = HEALTH_SERVICE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Health Monitor Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_MONITOR_REQUEST_FEATURE_COUNT = HEALTH_SERVICE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Health Monitor Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_MONITOR_REQUEST_OPERATION_COUNT = HEALTH_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.communicationshealths.impl.HealthMonitorUpdateImpl <em>Health Monitor Update</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.communicationshealths.impl.HealthMonitorUpdateImpl
	 * @see es.udima.cesarlaso.tfm.communicationshealths.impl.CommunicationshealthsPackageImpl#getHealthMonitorUpdate()
	 * @generated
	 */
	int HEALTH_MONITOR_UPDATE = 2;

	/**
	 * The feature id for the '<em><b>Request Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_MONITOR_UPDATE__REQUEST_ID = HEALTH_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Monitor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_MONITOR_UPDATE__MONITOR = HEALTH_SERVICE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Health Monitor Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_MONITOR_UPDATE_FEATURE_COUNT = HEALTH_SERVICE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Health Monitor Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_MONITOR_UPDATE_OPERATION_COUNT = HEALTH_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.communicationshealths.impl.HealthMonitorNotificationImpl <em>Health Monitor Notification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.communicationshealths.impl.HealthMonitorNotificationImpl
	 * @see es.udima.cesarlaso.tfm.communicationshealths.impl.CommunicationshealthsPackageImpl#getHealthMonitorNotification()
	 * @generated
	 */
	int HEALTH_MONITOR_NOTIFICATION = 3;

	/**
	 * The feature id for the '<em><b>Monitor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_MONITOR_NOTIFICATION__MONITOR = HEALTH_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Health Monitor Notification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_MONITOR_NOTIFICATION_FEATURE_COUNT = HEALTH_SERVICE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Health Monitor Notification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_MONITOR_NOTIFICATION_OPERATION_COUNT = HEALTH_SERVICE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.communicationshealths.HealthService <em>Health Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Health Service</em>'.
	 * @see es.udima.cesarlaso.tfm.communicationshealths.HealthService
	 * @generated
	 */
	EClass getHealthService();

	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.communicationshealths.HealthMonitorRequest <em>Health Monitor Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Health Monitor Request</em>'.
	 * @see es.udima.cesarlaso.tfm.communicationshealths.HealthMonitorRequest
	 * @generated
	 */
	EClass getHealthMonitorRequest();

	/**
	 * Returns the meta object for the containment reference '{@link es.udima.cesarlaso.tfm.communicationshealths.HealthMonitorRequest#getMonitor <em>Monitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Monitor</em>'.
	 * @see es.udima.cesarlaso.tfm.communicationshealths.HealthMonitorRequest#getMonitor()
	 * @see #getHealthMonitorRequest()
	 * @generated
	 */
	EReference getHealthMonitorRequest_Monitor();

	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.communicationshealths.HealthMonitorUpdate <em>Health Monitor Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Health Monitor Update</em>'.
	 * @see es.udima.cesarlaso.tfm.communicationshealths.HealthMonitorUpdate
	 * @generated
	 */
	EClass getHealthMonitorUpdate();

	/**
	 * Returns the meta object for the containment reference '{@link es.udima.cesarlaso.tfm.communicationshealths.HealthMonitorUpdate#getMonitor <em>Monitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Monitor</em>'.
	 * @see es.udima.cesarlaso.tfm.communicationshealths.HealthMonitorUpdate#getMonitor()
	 * @see #getHealthMonitorUpdate()
	 * @generated
	 */
	EReference getHealthMonitorUpdate_Monitor();

	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.communicationshealths.HealthMonitorNotification <em>Health Monitor Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Health Monitor Notification</em>'.
	 * @see es.udima.cesarlaso.tfm.communicationshealths.HealthMonitorNotification
	 * @generated
	 */
	EClass getHealthMonitorNotification();

	/**
	 * Returns the meta object for the containment reference list '{@link es.udima.cesarlaso.tfm.communicationshealths.HealthMonitorNotification#getMonitor <em>Monitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Monitor</em>'.
	 * @see es.udima.cesarlaso.tfm.communicationshealths.HealthMonitorNotification#getMonitor()
	 * @see #getHealthMonitorNotification()
	 * @generated
	 */
	EReference getHealthMonitorNotification_Monitor();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CommunicationshealthsFactory getCommunicationshealthsFactory();

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
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.communicationshealths.impl.HealthServiceImpl <em>Health Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.communicationshealths.impl.HealthServiceImpl
		 * @see es.udima.cesarlaso.tfm.communicationshealths.impl.CommunicationshealthsPackageImpl#getHealthService()
		 * @generated
		 */
		EClass HEALTH_SERVICE = eINSTANCE.getHealthService();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.communicationshealths.impl.HealthMonitorRequestImpl <em>Health Monitor Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.communicationshealths.impl.HealthMonitorRequestImpl
		 * @see es.udima.cesarlaso.tfm.communicationshealths.impl.CommunicationshealthsPackageImpl#getHealthMonitorRequest()
		 * @generated
		 */
		EClass HEALTH_MONITOR_REQUEST = eINSTANCE.getHealthMonitorRequest();

		/**
		 * The meta object literal for the '<em><b>Monitor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEALTH_MONITOR_REQUEST__MONITOR = eINSTANCE.getHealthMonitorRequest_Monitor();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.communicationshealths.impl.HealthMonitorUpdateImpl <em>Health Monitor Update</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.communicationshealths.impl.HealthMonitorUpdateImpl
		 * @see es.udima.cesarlaso.tfm.communicationshealths.impl.CommunicationshealthsPackageImpl#getHealthMonitorUpdate()
		 * @generated
		 */
		EClass HEALTH_MONITOR_UPDATE = eINSTANCE.getHealthMonitorUpdate();

		/**
		 * The meta object literal for the '<em><b>Monitor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEALTH_MONITOR_UPDATE__MONITOR = eINSTANCE.getHealthMonitorUpdate_Monitor();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.communicationshealths.impl.HealthMonitorNotificationImpl <em>Health Monitor Notification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.communicationshealths.impl.HealthMonitorNotificationImpl
		 * @see es.udima.cesarlaso.tfm.communicationshealths.impl.CommunicationshealthsPackageImpl#getHealthMonitorNotification()
		 * @generated
		 */
		EClass HEALTH_MONITOR_NOTIFICATION = eINSTANCE.getHealthMonitorNotification();

		/**
		 * The meta object literal for the '<em><b>Monitor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEALTH_MONITOR_NOTIFICATION__MONITOR = eINSTANCE.getHealthMonitorNotification_Monitor();

	}

} //CommunicationshealthsPackage
