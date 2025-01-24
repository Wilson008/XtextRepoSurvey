/**
 */
package es.udima.cesarlaso.tfm.communicationsprograms;

import es.udima.cesarlaso.tfm.communications.CommunicationsPackage;

import es.udima.cesarlaso.tfm.events.EventsPackage;

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
 * @see es.udima.cesarlaso.tfm.communicationsprograms.CommunicationsprogramsFactory
 * @model kind="package"
 * @generated
 */
public interface CommunicationsprogramsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "communicationsprograms";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://tfm.cesarlaso.udima.es/communications/programs";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "es.udima.cesarlaso.tfm.communications.programs";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CommunicationsprogramsPackage eINSTANCE = es.udima.cesarlaso.tfm.communicationsprograms.impl.CommunicationsprogramsPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.communicationsprograms.impl.ProgramServiceImpl <em>Program Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.communicationsprograms.impl.ProgramServiceImpl
	 * @see es.udima.cesarlaso.tfm.communicationsprograms.impl.CommunicationsprogramsPackageImpl#getProgramService()
	 * @generated
	 */
	int PROGRAM_SERVICE = 0;

	/**
	 * The feature id for the '<em><b>Generated Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_SERVICE__GENERATED_TIMESTAMP = CommunicationsPackage.SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Program Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_SERVICE_FEATURE_COUNT = CommunicationsPackage.SERVICE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Program Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_SERVICE_OPERATION_COUNT = CommunicationsPackage.SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.communicationsprograms.impl.ProgramEventEventImpl <em>Program Event Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.communicationsprograms.impl.ProgramEventEventImpl
	 * @see es.udima.cesarlaso.tfm.communicationsprograms.impl.CommunicationsprogramsPackageImpl#getProgramEventEvent()
	 * @generated
	 */
	int PROGRAM_EVENT_EVENT = 1;

	/**
	 * The feature id for the '<em><b>Generated Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_EVENT_EVENT__GENERATED_TIMESTAMP = PROGRAM_SERVICE__GENERATED_TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_EVENT_EVENT__EVENT = PROGRAM_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Program Event Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_EVENT_EVENT_FEATURE_COUNT = PROGRAM_SERVICE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Program Event Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_EVENT_EVENT_OPERATION_COUNT = PROGRAM_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.communicationsprograms.impl.ProgramActuatorServiceImpl <em>Program Actuator Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.communicationsprograms.impl.ProgramActuatorServiceImpl
	 * @see es.udima.cesarlaso.tfm.communicationsprograms.impl.CommunicationsprogramsPackageImpl#getProgramActuatorService()
	 * @generated
	 */
	int PROGRAM_ACTUATOR_SERVICE = 2;

	/**
	 * The feature id for the '<em><b>Generated Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_ACTUATOR_SERVICE__GENERATED_TIMESTAMP = PROGRAM_SERVICE__GENERATED_TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Actuator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_ACTUATOR_SERVICE__ACTUATOR = PROGRAM_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Program Actuator Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_ACTUATOR_SERVICE_FEATURE_COUNT = PROGRAM_SERVICE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Program Actuator Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_ACTUATOR_SERVICE_OPERATION_COUNT = PROGRAM_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.communicationsprograms.impl.RemoteEventImpl <em>Remote Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.communicationsprograms.impl.RemoteEventImpl
	 * @see es.udima.cesarlaso.tfm.communicationsprograms.impl.CommunicationsprogramsPackageImpl#getRemoteEvent()
	 * @generated
	 */
	int REMOTE_EVENT = 3;

	/**
	 * The feature id for the '<em><b>Actuators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_EVENT__ACTUATORS = EventsPackage.EVENT__ACTUATORS;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_EVENT__IDENTIFIER = EventsPackage.EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Remote Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_EVENT_FEATURE_COUNT = EventsPackage.EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Remote Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_EVENT_OPERATION_COUNT = EventsPackage.EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.communicationsprograms.impl.RemoteActuatorImpl <em>Remote Actuator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.communicationsprograms.impl.RemoteActuatorImpl
	 * @see es.udima.cesarlaso.tfm.communicationsprograms.impl.CommunicationsprogramsPackageImpl#getRemoteActuator()
	 * @generated
	 */
	int REMOTE_ACTUATOR = 4;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_ACTUATOR__IDENTIFIER = EventsPackage.ACTUATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Remote Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_ACTUATOR_FEATURE_COUNT = EventsPackage.ACTUATOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Remote Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_ACTUATOR_OPERATION_COUNT = EventsPackage.ACTUATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.communicationsprograms.impl.RemoteIdentifierImpl <em>Remote Identifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.communicationsprograms.impl.RemoteIdentifierImpl
	 * @see es.udima.cesarlaso.tfm.communicationsprograms.impl.CommunicationsprogramsPackageImpl#getRemoteIdentifier()
	 * @generated
	 */
	int REMOTE_IDENTIFIER = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_IDENTIFIER__NAME = 0;

	/**
	 * The number of structural features of the '<em>Remote Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_IDENTIFIER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Remote Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_IDENTIFIER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.communicationsprograms.impl.RemoteEventIdentifierImpl <em>Remote Event Identifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.communicationsprograms.impl.RemoteEventIdentifierImpl
	 * @see es.udima.cesarlaso.tfm.communicationsprograms.impl.CommunicationsprogramsPackageImpl#getRemoteEventIdentifier()
	 * @generated
	 */
	int REMOTE_EVENT_IDENTIFIER = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_EVENT_IDENTIFIER__NAME = REMOTE_IDENTIFIER__NAME;

	/**
	 * The number of structural features of the '<em>Remote Event Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_EVENT_IDENTIFIER_FEATURE_COUNT = REMOTE_IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Remote Event Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_EVENT_IDENTIFIER_OPERATION_COUNT = REMOTE_IDENTIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.communicationsprograms.impl.RemoteActuatorIdentifierImpl <em>Remote Actuator Identifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.communicationsprograms.impl.RemoteActuatorIdentifierImpl
	 * @see es.udima.cesarlaso.tfm.communicationsprograms.impl.CommunicationsprogramsPackageImpl#getRemoteActuatorIdentifier()
	 * @generated
	 */
	int REMOTE_ACTUATOR_IDENTIFIER = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_ACTUATOR_IDENTIFIER__NAME = REMOTE_IDENTIFIER__NAME;

	/**
	 * The number of structural features of the '<em>Remote Actuator Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_ACTUATOR_IDENTIFIER_FEATURE_COUNT = REMOTE_IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Remote Actuator Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_ACTUATOR_IDENTIFIER_OPERATION_COUNT = REMOTE_IDENTIFIER_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.communicationsprograms.ProgramService <em>Program Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program Service</em>'.
	 * @see es.udima.cesarlaso.tfm.communicationsprograms.ProgramService
	 * @generated
	 */
	EClass getProgramService();

	/**
	 * Returns the meta object for the attribute '{@link es.udima.cesarlaso.tfm.communicationsprograms.ProgramService#getGeneratedTimestamp <em>Generated Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Timestamp</em>'.
	 * @see es.udima.cesarlaso.tfm.communicationsprograms.ProgramService#getGeneratedTimestamp()
	 * @see #getProgramService()
	 * @generated
	 */
	EAttribute getProgramService_GeneratedTimestamp();

	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.communicationsprograms.ProgramEventEvent <em>Program Event Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program Event Event</em>'.
	 * @see es.udima.cesarlaso.tfm.communicationsprograms.ProgramEventEvent
	 * @generated
	 */
	EClass getProgramEventEvent();

	/**
	 * Returns the meta object for the containment reference '{@link es.udima.cesarlaso.tfm.communicationsprograms.ProgramEventEvent#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event</em>'.
	 * @see es.udima.cesarlaso.tfm.communicationsprograms.ProgramEventEvent#getEvent()
	 * @see #getProgramEventEvent()
	 * @generated
	 */
	EReference getProgramEventEvent_Event();

	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.communicationsprograms.ProgramActuatorService <em>Program Actuator Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program Actuator Service</em>'.
	 * @see es.udima.cesarlaso.tfm.communicationsprograms.ProgramActuatorService
	 * @generated
	 */
	EClass getProgramActuatorService();

	/**
	 * Returns the meta object for the containment reference '{@link es.udima.cesarlaso.tfm.communicationsprograms.ProgramActuatorService#getActuator <em>Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Actuator</em>'.
	 * @see es.udima.cesarlaso.tfm.communicationsprograms.ProgramActuatorService#getActuator()
	 * @see #getProgramActuatorService()
	 * @generated
	 */
	EReference getProgramActuatorService_Actuator();

	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.communicationsprograms.RemoteEvent <em>Remote Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remote Event</em>'.
	 * @see es.udima.cesarlaso.tfm.communicationsprograms.RemoteEvent
	 * @generated
	 */
	EClass getRemoteEvent();

	/**
	 * Returns the meta object for the reference '{@link es.udima.cesarlaso.tfm.communicationsprograms.RemoteEvent#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Identifier</em>'.
	 * @see es.udima.cesarlaso.tfm.communicationsprograms.RemoteEvent#getIdentifier()
	 * @see #getRemoteEvent()
	 * @generated
	 */
	EReference getRemoteEvent_Identifier();

	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.communicationsprograms.RemoteActuator <em>Remote Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remote Actuator</em>'.
	 * @see es.udima.cesarlaso.tfm.communicationsprograms.RemoteActuator
	 * @generated
	 */
	EClass getRemoteActuator();

	/**
	 * Returns the meta object for the reference '{@link es.udima.cesarlaso.tfm.communicationsprograms.RemoteActuator#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Identifier</em>'.
	 * @see es.udima.cesarlaso.tfm.communicationsprograms.RemoteActuator#getIdentifier()
	 * @see #getRemoteActuator()
	 * @generated
	 */
	EReference getRemoteActuator_Identifier();

	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.communicationsprograms.RemoteIdentifier <em>Remote Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remote Identifier</em>'.
	 * @see es.udima.cesarlaso.tfm.communicationsprograms.RemoteIdentifier
	 * @generated
	 */
	EClass getRemoteIdentifier();

	/**
	 * Returns the meta object for the attribute '{@link es.udima.cesarlaso.tfm.communicationsprograms.RemoteIdentifier#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.udima.cesarlaso.tfm.communicationsprograms.RemoteIdentifier#getName()
	 * @see #getRemoteIdentifier()
	 * @generated
	 */
	EAttribute getRemoteIdentifier_Name();

	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.communicationsprograms.RemoteEventIdentifier <em>Remote Event Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remote Event Identifier</em>'.
	 * @see es.udima.cesarlaso.tfm.communicationsprograms.RemoteEventIdentifier
	 * @generated
	 */
	EClass getRemoteEventIdentifier();

	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.communicationsprograms.RemoteActuatorIdentifier <em>Remote Actuator Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remote Actuator Identifier</em>'.
	 * @see es.udima.cesarlaso.tfm.communicationsprograms.RemoteActuatorIdentifier
	 * @generated
	 */
	EClass getRemoteActuatorIdentifier();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CommunicationsprogramsFactory getCommunicationsprogramsFactory();

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
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.communicationsprograms.impl.ProgramServiceImpl <em>Program Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.communicationsprograms.impl.ProgramServiceImpl
		 * @see es.udima.cesarlaso.tfm.communicationsprograms.impl.CommunicationsprogramsPackageImpl#getProgramService()
		 * @generated
		 */
		EClass PROGRAM_SERVICE = eINSTANCE.getProgramService();

		/**
		 * The meta object literal for the '<em><b>Generated Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM_SERVICE__GENERATED_TIMESTAMP = eINSTANCE.getProgramService_GeneratedTimestamp();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.communicationsprograms.impl.ProgramEventEventImpl <em>Program Event Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.communicationsprograms.impl.ProgramEventEventImpl
		 * @see es.udima.cesarlaso.tfm.communicationsprograms.impl.CommunicationsprogramsPackageImpl#getProgramEventEvent()
		 * @generated
		 */
		EClass PROGRAM_EVENT_EVENT = eINSTANCE.getProgramEventEvent();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM_EVENT_EVENT__EVENT = eINSTANCE.getProgramEventEvent_Event();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.communicationsprograms.impl.ProgramActuatorServiceImpl <em>Program Actuator Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.communicationsprograms.impl.ProgramActuatorServiceImpl
		 * @see es.udima.cesarlaso.tfm.communicationsprograms.impl.CommunicationsprogramsPackageImpl#getProgramActuatorService()
		 * @generated
		 */
		EClass PROGRAM_ACTUATOR_SERVICE = eINSTANCE.getProgramActuatorService();

		/**
		 * The meta object literal for the '<em><b>Actuator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM_ACTUATOR_SERVICE__ACTUATOR = eINSTANCE.getProgramActuatorService_Actuator();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.communicationsprograms.impl.RemoteEventImpl <em>Remote Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.communicationsprograms.impl.RemoteEventImpl
		 * @see es.udima.cesarlaso.tfm.communicationsprograms.impl.CommunicationsprogramsPackageImpl#getRemoteEvent()
		 * @generated
		 */
		EClass REMOTE_EVENT = eINSTANCE.getRemoteEvent();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REMOTE_EVENT__IDENTIFIER = eINSTANCE.getRemoteEvent_Identifier();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.communicationsprograms.impl.RemoteActuatorImpl <em>Remote Actuator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.communicationsprograms.impl.RemoteActuatorImpl
		 * @see es.udima.cesarlaso.tfm.communicationsprograms.impl.CommunicationsprogramsPackageImpl#getRemoteActuator()
		 * @generated
		 */
		EClass REMOTE_ACTUATOR = eINSTANCE.getRemoteActuator();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REMOTE_ACTUATOR__IDENTIFIER = eINSTANCE.getRemoteActuator_Identifier();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.communicationsprograms.impl.RemoteIdentifierImpl <em>Remote Identifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.communicationsprograms.impl.RemoteIdentifierImpl
		 * @see es.udima.cesarlaso.tfm.communicationsprograms.impl.CommunicationsprogramsPackageImpl#getRemoteIdentifier()
		 * @generated
		 */
		EClass REMOTE_IDENTIFIER = eINSTANCE.getRemoteIdentifier();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOTE_IDENTIFIER__NAME = eINSTANCE.getRemoteIdentifier_Name();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.communicationsprograms.impl.RemoteEventIdentifierImpl <em>Remote Event Identifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.communicationsprograms.impl.RemoteEventIdentifierImpl
		 * @see es.udima.cesarlaso.tfm.communicationsprograms.impl.CommunicationsprogramsPackageImpl#getRemoteEventIdentifier()
		 * @generated
		 */
		EClass REMOTE_EVENT_IDENTIFIER = eINSTANCE.getRemoteEventIdentifier();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.communicationsprograms.impl.RemoteActuatorIdentifierImpl <em>Remote Actuator Identifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.communicationsprograms.impl.RemoteActuatorIdentifierImpl
		 * @see es.udima.cesarlaso.tfm.communicationsprograms.impl.CommunicationsprogramsPackageImpl#getRemoteActuatorIdentifier()
		 * @generated
		 */
		EClass REMOTE_ACTUATOR_IDENTIFIER = eINSTANCE.getRemoteActuatorIdentifier();

	}

} //CommunicationsprogramsPackage
