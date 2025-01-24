/**
 */
package es.udima.cesarlaso.tfm.events;

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
 * @see es.udima.cesarlaso.tfm.events.EventsFactory
 * @model kind="package"
 * @generated
 */
public interface EventsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "events";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://tfm.cesarlaso.udima.es/events";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "es.udima.cesarlaso.tfm.events";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EventsPackage eINSTANCE = es.udima.cesarlaso.tfm.events.impl.EventsPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.events.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.events.impl.EventImpl
	 * @see es.udima.cesarlaso.tfm.events.impl.EventsPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 0;

	/**
	 * The feature id for the '<em><b>Actuators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__ACTUATORS = 0;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.events.impl.ActuatorImpl <em>Actuator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.events.impl.ActuatorImpl
	 * @see es.udima.cesarlaso.tfm.events.impl.EventsPackageImpl#getActuator()
	 * @generated
	 */
	int ACTUATOR = 1;

	/**
	 * The number of structural features of the '<em>Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.events.impl.SequentialActuatorsImpl <em>Sequential Actuators</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.events.impl.SequentialActuatorsImpl
	 * @see es.udima.cesarlaso.tfm.events.impl.EventsPackageImpl#getSequentialActuators()
	 * @generated
	 */
	int SEQUENTIAL_ACTUATORS = 2;

	/**
	 * The feature id for the '<em><b>Actuators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENTIAL_ACTUATORS__ACTUATORS = ACTUATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sequential Actuators</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENTIAL_ACTUATORS_FEATURE_COUNT = ACTUATOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sequential Actuators</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENTIAL_ACTUATORS_OPERATION_COUNT = ACTUATOR_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.events.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see es.udima.cesarlaso.tfm.events.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the containment reference list '{@link es.udima.cesarlaso.tfm.events.Event#getActuators <em>Actuators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actuators</em>'.
	 * @see es.udima.cesarlaso.tfm.events.Event#getActuators()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_Actuators();

	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.events.Actuator <em>Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actuator</em>'.
	 * @see es.udima.cesarlaso.tfm.events.Actuator
	 * @generated
	 */
	EClass getActuator();

	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.events.SequentialActuators <em>Sequential Actuators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequential Actuators</em>'.
	 * @see es.udima.cesarlaso.tfm.events.SequentialActuators
	 * @generated
	 */
	EClass getSequentialActuators();

	/**
	 * Returns the meta object for the containment reference list '{@link es.udima.cesarlaso.tfm.events.SequentialActuators#getActuators <em>Actuators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actuators</em>'.
	 * @see es.udima.cesarlaso.tfm.events.SequentialActuators#getActuators()
	 * @see #getSequentialActuators()
	 * @generated
	 */
	EReference getSequentialActuators_Actuators();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EventsFactory getEventsFactory();

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
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.events.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.events.impl.EventImpl
		 * @see es.udima.cesarlaso.tfm.events.impl.EventsPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Actuators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__ACTUATORS = eINSTANCE.getEvent_Actuators();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.events.impl.ActuatorImpl <em>Actuator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.events.impl.ActuatorImpl
		 * @see es.udima.cesarlaso.tfm.events.impl.EventsPackageImpl#getActuator()
		 * @generated
		 */
		EClass ACTUATOR = eINSTANCE.getActuator();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.events.impl.SequentialActuatorsImpl <em>Sequential Actuators</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.events.impl.SequentialActuatorsImpl
		 * @see es.udima.cesarlaso.tfm.events.impl.EventsPackageImpl#getSequentialActuators()
		 * @generated
		 */
		EClass SEQUENTIAL_ACTUATORS = eINSTANCE.getSequentialActuators();

		/**
		 * The meta object literal for the '<em><b>Actuators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENTIAL_ACTUATORS__ACTUATORS = eINSTANCE.getSequentialActuators_Actuators();

	}

} //EventsPackage
