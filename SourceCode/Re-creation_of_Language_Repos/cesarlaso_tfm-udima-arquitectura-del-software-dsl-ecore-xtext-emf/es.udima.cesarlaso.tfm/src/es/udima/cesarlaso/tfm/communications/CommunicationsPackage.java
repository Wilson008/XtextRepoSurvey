/**
 */
package es.udima.cesarlaso.tfm.communications;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see es.udima.cesarlaso.tfm.communications.CommunicationsFactory
 * @model kind="package"
 * @generated
 */
public interface CommunicationsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "communications";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://tfm.cesarlaso.udima.es/communications";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "es.udima.cesarlaso.tfm.communications";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CommunicationsPackage eINSTANCE = es.udima.cesarlaso.tfm.communications.impl.CommunicationsPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.communications.impl.PacketImpl <em>Packet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.communications.impl.PacketImpl
	 * @see es.udima.cesarlaso.tfm.communications.impl.CommunicationsPackageImpl#getPacket()
	 * @generated
	 */
	int PACKET = 0;

	/**
	 * The feature id for the '<em><b>Secuence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKET__SECUENCE = 0;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKET__TIMESTAMP = 1;

	/**
	 * The feature id for the '<em><b>Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKET__SERVICES = 2;

	/**
	 * The number of structural features of the '<em>Packet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKET_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Packet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.communications.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.communications.impl.ServiceImpl
	 * @see es.udima.cesarlaso.tfm.communications.impl.CommunicationsPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 1;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.communications.impl.ServiceRequestImpl <em>Service Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.communications.impl.ServiceRequestImpl
	 * @see es.udima.cesarlaso.tfm.communications.impl.CommunicationsPackageImpl#getServiceRequest()
	 * @generated
	 */
	int SERVICE_REQUEST = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REQUEST__ID = 0;

	/**
	 * The number of structural features of the '<em>Service Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REQUEST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Service Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.communications.impl.ServiceResponseImpl <em>Service Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.communications.impl.ServiceResponseImpl
	 * @see es.udima.cesarlaso.tfm.communications.impl.CommunicationsPackageImpl#getServiceResponse()
	 * @generated
	 */
	int SERVICE_RESPONSE = 3;

	/**
	 * The feature id for the '<em><b>Request Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_RESPONSE__REQUEST_ID = 0;

	/**
	 * The number of structural features of the '<em>Service Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_RESPONSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Service Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.communications.impl.ServiceNotificationImpl <em>Service Notification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.communications.impl.ServiceNotificationImpl
	 * @see es.udima.cesarlaso.tfm.communications.impl.CommunicationsPackageImpl#getServiceNotification()
	 * @generated
	 */
	int SERVICE_NOTIFICATION = 4;

	/**
	 * The number of structural features of the '<em>Service Notification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_NOTIFICATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Service Notification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_NOTIFICATION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.communications.Packet <em>Packet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Packet</em>'.
	 * @see es.udima.cesarlaso.tfm.communications.Packet
	 * @generated
	 */
	EClass getPacket();

	/**
	 * Returns the meta object for the attribute '{@link es.udima.cesarlaso.tfm.communications.Packet#getSecuence <em>Secuence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Secuence</em>'.
	 * @see es.udima.cesarlaso.tfm.communications.Packet#getSecuence()
	 * @see #getPacket()
	 * @generated
	 */
	EAttribute getPacket_Secuence();

	/**
	 * Returns the meta object for the attribute '{@link es.udima.cesarlaso.tfm.communications.Packet#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see es.udima.cesarlaso.tfm.communications.Packet#getTimestamp()
	 * @see #getPacket()
	 * @generated
	 */
	EAttribute getPacket_Timestamp();

	/**
	 * Returns the meta object for the reference list '{@link es.udima.cesarlaso.tfm.communications.Packet#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Services</em>'.
	 * @see es.udima.cesarlaso.tfm.communications.Packet#getServices()
	 * @see #getPacket()
	 * @generated
	 */
	EReference getPacket_Services();

	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.communications.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see es.udima.cesarlaso.tfm.communications.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.communications.ServiceRequest <em>Service Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Request</em>'.
	 * @see es.udima.cesarlaso.tfm.communications.ServiceRequest
	 * @generated
	 */
	EClass getServiceRequest();

	/**
	 * Returns the meta object for the attribute '{@link es.udima.cesarlaso.tfm.communications.ServiceRequest#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see es.udima.cesarlaso.tfm.communications.ServiceRequest#getId()
	 * @see #getServiceRequest()
	 * @generated
	 */
	EAttribute getServiceRequest_Id();

	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.communications.ServiceResponse <em>Service Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Response</em>'.
	 * @see es.udima.cesarlaso.tfm.communications.ServiceResponse
	 * @generated
	 */
	EClass getServiceResponse();

	/**
	 * Returns the meta object for the attribute '{@link es.udima.cesarlaso.tfm.communications.ServiceResponse#getRequestId <em>Request Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Request Id</em>'.
	 * @see es.udima.cesarlaso.tfm.communications.ServiceResponse#getRequestId()
	 * @see #getServiceResponse()
	 * @generated
	 */
	EAttribute getServiceResponse_RequestId();

	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.communications.ServiceNotification <em>Service Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Notification</em>'.
	 * @see es.udima.cesarlaso.tfm.communications.ServiceNotification
	 * @generated
	 */
	EClass getServiceNotification();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CommunicationsFactory getCommunicationsFactory();

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
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.communications.impl.PacketImpl <em>Packet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.communications.impl.PacketImpl
		 * @see es.udima.cesarlaso.tfm.communications.impl.CommunicationsPackageImpl#getPacket()
		 * @generated
		 */
		EClass PACKET = eINSTANCE.getPacket();

		/**
		 * The meta object literal for the '<em><b>Secuence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKET__SECUENCE = eINSTANCE.getPacket_Secuence();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKET__TIMESTAMP = eINSTANCE.getPacket_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKET__SERVICES = eINSTANCE.getPacket_Services();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.communications.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.communications.impl.ServiceImpl
		 * @see es.udima.cesarlaso.tfm.communications.impl.CommunicationsPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.communications.impl.ServiceRequestImpl <em>Service Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.communications.impl.ServiceRequestImpl
		 * @see es.udima.cesarlaso.tfm.communications.impl.CommunicationsPackageImpl#getServiceRequest()
		 * @generated
		 */
		EClass SERVICE_REQUEST = eINSTANCE.getServiceRequest();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_REQUEST__ID = eINSTANCE.getServiceRequest_Id();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.communications.impl.ServiceResponseImpl <em>Service Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.communications.impl.ServiceResponseImpl
		 * @see es.udima.cesarlaso.tfm.communications.impl.CommunicationsPackageImpl#getServiceResponse()
		 * @generated
		 */
		EClass SERVICE_RESPONSE = eINSTANCE.getServiceResponse();

		/**
		 * The meta object literal for the '<em><b>Request Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_RESPONSE__REQUEST_ID = eINSTANCE.getServiceResponse_RequestId();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.communications.impl.ServiceNotificationImpl <em>Service Notification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.communications.impl.ServiceNotificationImpl
		 * @see es.udima.cesarlaso.tfm.communications.impl.CommunicationsPackageImpl#getServiceNotification()
		 * @generated
		 */
		EClass SERVICE_NOTIFICATION = eINSTANCE.getServiceNotification();

	}

} //CommunicationsPackage
