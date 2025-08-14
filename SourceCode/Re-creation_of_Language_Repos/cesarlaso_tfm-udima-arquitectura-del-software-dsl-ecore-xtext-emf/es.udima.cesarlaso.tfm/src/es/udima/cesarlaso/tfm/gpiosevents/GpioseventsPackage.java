/**
 */
package es.udima.cesarlaso.tfm.gpiosevents;

import es.udima.cesarlaso.tfm.events.EventsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
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
 * @see es.udima.cesarlaso.tfm.gpiosevents.GpioseventsFactory
 * @model kind="package"
 * @generated
 */
public interface GpioseventsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "gpiosevents";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://tfm.cesarlaso.udima.es/gpios/events";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "es.udima.cesarlaso.tfm.gpios.events";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GpioseventsPackage eINSTANCE = es.udima.cesarlaso.tfm.gpiosevents.impl.GpioseventsPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.gpiosevents.impl.GpioEventImpl <em>Gpio Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.gpiosevents.impl.GpioEventImpl
	 * @see es.udima.cesarlaso.tfm.gpiosevents.impl.GpioseventsPackageImpl#getGpioEvent()
	 * @generated
	 */
	int GPIO_EVENT = 0;

	/**
	 * The feature id for the '<em><b>Actuators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPIO_EVENT__ACTUATORS = EventsPackage.EVENT__ACTUATORS;

	/**
	 * The number of structural features of the '<em>Gpio Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPIO_EVENT_FEATURE_COUNT = EventsPackage.EVENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Performed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPIO_EVENT___PERFORMED = EventsPackage.EVENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Gpio Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPIO_EVENT_OPERATION_COUNT = EventsPackage.EVENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.gpiosevents.impl.DigitalEventImpl <em>Digital Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.gpiosevents.impl.DigitalEventImpl
	 * @see es.udima.cesarlaso.tfm.gpiosevents.impl.GpioseventsPackageImpl#getDigitalEvent()
	 * @generated
	 */
	int DIGITAL_EVENT = 1;

	/**
	 * The feature id for the '<em><b>Actuators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_EVENT__ACTUATORS = GPIO_EVENT__ACTUATORS;

	/**
	 * The feature id for the '<em><b>Pin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_EVENT__PIN = GPIO_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Digital Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_EVENT_FEATURE_COUNT = GPIO_EVENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Performed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_EVENT___PERFORMED = GPIO_EVENT___PERFORMED;

	/**
	 * The number of operations of the '<em>Digital Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_EVENT_OPERATION_COUNT = GPIO_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.gpiosevents.impl.AnalogEventImpl <em>Analog Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.gpiosevents.impl.AnalogEventImpl
	 * @see es.udima.cesarlaso.tfm.gpiosevents.impl.GpioseventsPackageImpl#getAnalogEvent()
	 * @generated
	 */
	int ANALOG_EVENT = 2;

	/**
	 * The feature id for the '<em><b>Actuators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_EVENT__ACTUATORS = GPIO_EVENT__ACTUATORS;

	/**
	 * The feature id for the '<em><b>Pin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_EVENT__PIN = GPIO_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Analog Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_EVENT_FEATURE_COUNT = GPIO_EVENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Performed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_EVENT___PERFORMED = GPIO_EVENT___PERFORMED;

	/**
	 * The number of operations of the '<em>Analog Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_EVENT_OPERATION_COUNT = GPIO_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.gpiosevents.impl.InterruptedImpl <em>Interrupted</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.gpiosevents.impl.InterruptedImpl
	 * @see es.udima.cesarlaso.tfm.gpiosevents.impl.GpioseventsPackageImpl#getInterrupted()
	 * @generated
	 */
	int INTERRUPTED = 3;

	/**
	 * The feature id for the '<em><b>Actuators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPTED__ACTUATORS = DIGITAL_EVENT__ACTUATORS;

	/**
	 * The feature id for the '<em><b>Pin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPTED__PIN = DIGITAL_EVENT__PIN;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPTED__MODE = DIGITAL_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Interrupted</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPTED_FEATURE_COUNT = DIGITAL_EVENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Performed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPTED___PERFORMED = DIGITAL_EVENT___PERFORMED;

	/**
	 * The number of operations of the '<em>Interrupted</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPTED_OPERATION_COUNT = DIGITAL_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.gpiosevents.impl.ButtonInputImpl <em>Button Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.gpiosevents.impl.ButtonInputImpl
	 * @see es.udima.cesarlaso.tfm.gpiosevents.impl.GpioseventsPackageImpl#getButtonInput()
	 * @generated
	 */
	int BUTTON_INPUT = 4;

	/**
	 * The feature id for the '<em><b>Actuators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_INPUT__ACTUATORS = DIGITAL_EVENT__ACTUATORS;

	/**
	 * The feature id for the '<em><b>Pin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_INPUT__PIN = DIGITAL_EVENT__PIN;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_INPUT__MODE = DIGITAL_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_INPUT__MIN_DURATION = DIGITAL_EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Button Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_INPUT_FEATURE_COUNT = DIGITAL_EVENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Performed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_INPUT___PERFORMED = DIGITAL_EVENT___PERFORMED;

	/**
	 * The number of operations of the '<em>Button Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_INPUT_OPERATION_COUNT = DIGITAL_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.gpiosevents.impl.ButtonInputAccumulatorImpl <em>Button Input Accumulator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.gpiosevents.impl.ButtonInputAccumulatorImpl
	 * @see es.udima.cesarlaso.tfm.gpiosevents.impl.GpioseventsPackageImpl#getButtonInputAccumulator()
	 * @generated
	 */
	int BUTTON_INPUT_ACCUMULATOR = 5;

	/**
	 * The feature id for the '<em><b>Actuators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_INPUT_ACCUMULATOR__ACTUATORS = BUTTON_INPUT__ACTUATORS;

	/**
	 * The feature id for the '<em><b>Pin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_INPUT_ACCUMULATOR__PIN = BUTTON_INPUT__PIN;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_INPUT_ACCUMULATOR__MODE = BUTTON_INPUT__MODE;

	/**
	 * The feature id for the '<em><b>Min Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_INPUT_ACCUMULATOR__MIN_DURATION = BUTTON_INPUT__MIN_DURATION;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_INPUT_ACCUMULATOR__COUNT = BUTTON_INPUT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Button Input Accumulator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_INPUT_ACCUMULATOR_FEATURE_COUNT = BUTTON_INPUT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Performed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_INPUT_ACCUMULATOR___PERFORMED = BUTTON_INPUT___PERFORMED;

	/**
	 * The number of operations of the '<em>Button Input Accumulator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_INPUT_ACCUMULATOR_OPERATION_COUNT = BUTTON_INPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.gpiosevents.impl.ButtonInputReleasedImpl <em>Button Input Released</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.gpiosevents.impl.ButtonInputReleasedImpl
	 * @see es.udima.cesarlaso.tfm.gpiosevents.impl.GpioseventsPackageImpl#getButtonInputReleased()
	 * @generated
	 */
	int BUTTON_INPUT_RELEASED = 6;

	/**
	 * The feature id for the '<em><b>Actuators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_INPUT_RELEASED__ACTUATORS = DIGITAL_EVENT__ACTUATORS;

	/**
	 * The feature id for the '<em><b>Pin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_INPUT_RELEASED__PIN = DIGITAL_EVENT__PIN;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_INPUT_RELEASED__MODE = DIGITAL_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Button Input Released</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_INPUT_RELEASED_FEATURE_COUNT = DIGITAL_EVENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Performed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_INPUT_RELEASED___PERFORMED = DIGITAL_EVENT___PERFORMED;

	/**
	 * The number of operations of the '<em>Button Input Released</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_INPUT_RELEASED_OPERATION_COUNT = DIGITAL_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.gpiosevents.impl.PulseInputImpl <em>Pulse Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.gpiosevents.impl.PulseInputImpl
	 * @see es.udima.cesarlaso.tfm.gpiosevents.impl.GpioseventsPackageImpl#getPulseInput()
	 * @generated
	 */
	int PULSE_INPUT = 7;

	/**
	 * The feature id for the '<em><b>Actuators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULSE_INPUT__ACTUATORS = DIGITAL_EVENT__ACTUATORS;

	/**
	 * The feature id for the '<em><b>Pin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULSE_INPUT__PIN = DIGITAL_EVENT__PIN;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULSE_INPUT__MODE = DIGITAL_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULSE_INPUT__COUNT = DIGITAL_EVENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULSE_INPUT__WIDTH = DIGITAL_EVENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Space Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULSE_INPUT__SPACE_WIDTH = DIGITAL_EVENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Pulse Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULSE_INPUT_FEATURE_COUNT = DIGITAL_EVENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Performed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULSE_INPUT___PERFORMED = DIGITAL_EVENT___PERFORMED;

	/**
	 * The number of operations of the '<em>Pulse Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULSE_INPUT_OPERATION_COUNT = DIGITAL_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.gpiosevents.impl.AnalogReadImpl <em>Analog Read</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.gpiosevents.impl.AnalogReadImpl
	 * @see es.udima.cesarlaso.tfm.gpiosevents.impl.GpioseventsPackageImpl#getAnalogRead()
	 * @generated
	 */
	int ANALOG_READ = 8;

	/**
	 * The feature id for the '<em><b>Actuators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_READ__ACTUATORS = ANALOG_EVENT__ACTUATORS;

	/**
	 * The feature id for the '<em><b>Pin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_READ__PIN = ANALOG_EVENT__PIN;

	/**
	 * The feature id for the '<em><b>Poll Interval Loops</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_READ__POLL_INTERVAL_LOOPS = ANALOG_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Analog Read</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_READ_FEATURE_COUNT = ANALOG_EVENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Performed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_READ___PERFORMED = ANALOG_EVENT___PERFORMED;

	/**
	 * The number of operations of the '<em>Analog Read</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_READ_OPERATION_COUNT = ANALOG_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.gpiosevents.impl.AnalogReadPerformOnChangeImpl <em>Analog Read Perform On Change</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.gpiosevents.impl.AnalogReadPerformOnChangeImpl
	 * @see es.udima.cesarlaso.tfm.gpiosevents.impl.GpioseventsPackageImpl#getAnalogReadPerformOnChange()
	 * @generated
	 */
	int ANALOG_READ_PERFORM_ON_CHANGE = 9;

	/**
	 * The feature id for the '<em><b>Actuators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_READ_PERFORM_ON_CHANGE__ACTUATORS = ANALOG_READ__ACTUATORS;

	/**
	 * The feature id for the '<em><b>Pin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_READ_PERFORM_ON_CHANGE__PIN = ANALOG_READ__PIN;

	/**
	 * The feature id for the '<em><b>Poll Interval Loops</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_READ_PERFORM_ON_CHANGE__POLL_INTERVAL_LOOPS = ANALOG_READ__POLL_INTERVAL_LOOPS;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_READ_PERFORM_ON_CHANGE__VALUE = ANALOG_READ_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Analog Read Perform On Change</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_READ_PERFORM_ON_CHANGE_FEATURE_COUNT = ANALOG_READ_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Performed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_READ_PERFORM_ON_CHANGE___PERFORMED = ANALOG_READ___PERFORMED;

	/**
	 * The number of operations of the '<em>Analog Read Perform On Change</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_READ_PERFORM_ON_CHANGE_OPERATION_COUNT = ANALOG_READ_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.gpiosevents.impl.AnalogReadPerformOnHighImpl <em>Analog Read Perform On High</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.gpiosevents.impl.AnalogReadPerformOnHighImpl
	 * @see es.udima.cesarlaso.tfm.gpiosevents.impl.GpioseventsPackageImpl#getAnalogReadPerformOnHigh()
	 * @generated
	 */
	int ANALOG_READ_PERFORM_ON_HIGH = 10;

	/**
	 * The feature id for the '<em><b>Actuators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_READ_PERFORM_ON_HIGH__ACTUATORS = ANALOG_READ_PERFORM_ON_CHANGE__ACTUATORS;

	/**
	 * The feature id for the '<em><b>Pin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_READ_PERFORM_ON_HIGH__PIN = ANALOG_READ_PERFORM_ON_CHANGE__PIN;

	/**
	 * The feature id for the '<em><b>Poll Interval Loops</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_READ_PERFORM_ON_HIGH__POLL_INTERVAL_LOOPS = ANALOG_READ_PERFORM_ON_CHANGE__POLL_INTERVAL_LOOPS;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_READ_PERFORM_ON_HIGH__VALUE = ANALOG_READ_PERFORM_ON_CHANGE__VALUE;

	/**
	 * The number of structural features of the '<em>Analog Read Perform On High</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_READ_PERFORM_ON_HIGH_FEATURE_COUNT = ANALOG_READ_PERFORM_ON_CHANGE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Performed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_READ_PERFORM_ON_HIGH___PERFORMED = ANALOG_READ_PERFORM_ON_CHANGE___PERFORMED;

	/**
	 * The number of operations of the '<em>Analog Read Perform On High</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_READ_PERFORM_ON_HIGH_OPERATION_COUNT = ANALOG_READ_PERFORM_ON_CHANGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.gpiosevents.impl.AnalogReadPerformOnLowImpl <em>Analog Read Perform On Low</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.gpiosevents.impl.AnalogReadPerformOnLowImpl
	 * @see es.udima.cesarlaso.tfm.gpiosevents.impl.GpioseventsPackageImpl#getAnalogReadPerformOnLow()
	 * @generated
	 */
	int ANALOG_READ_PERFORM_ON_LOW = 11;

	/**
	 * The feature id for the '<em><b>Actuators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_READ_PERFORM_ON_LOW__ACTUATORS = ANALOG_READ_PERFORM_ON_CHANGE__ACTUATORS;

	/**
	 * The feature id for the '<em><b>Pin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_READ_PERFORM_ON_LOW__PIN = ANALOG_READ_PERFORM_ON_CHANGE__PIN;

	/**
	 * The feature id for the '<em><b>Poll Interval Loops</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_READ_PERFORM_ON_LOW__POLL_INTERVAL_LOOPS = ANALOG_READ_PERFORM_ON_CHANGE__POLL_INTERVAL_LOOPS;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_READ_PERFORM_ON_LOW__VALUE = ANALOG_READ_PERFORM_ON_CHANGE__VALUE;

	/**
	 * The number of structural features of the '<em>Analog Read Perform On Low</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_READ_PERFORM_ON_LOW_FEATURE_COUNT = ANALOG_READ_PERFORM_ON_CHANGE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Performed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_READ_PERFORM_ON_LOW___PERFORMED = ANALOG_READ_PERFORM_ON_CHANGE___PERFORMED;

	/**
	 * The number of operations of the '<em>Analog Read Perform On Low</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_READ_PERFORM_ON_LOW_OPERATION_COUNT = ANALOG_READ_PERFORM_ON_CHANGE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.gpiosevents.GpioEvent <em>Gpio Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gpio Event</em>'.
	 * @see es.udima.cesarlaso.tfm.gpiosevents.GpioEvent
	 * @generated
	 */
	EClass getGpioEvent();

	/**
	 * Returns the meta object for the '{@link es.udima.cesarlaso.tfm.gpiosevents.GpioEvent#performed() <em>Performed</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Performed</em>' operation.
	 * @see es.udima.cesarlaso.tfm.gpiosevents.GpioEvent#performed()
	 * @generated
	 */
	EOperation getGpioEvent__Performed();

	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.gpiosevents.DigitalEvent <em>Digital Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Digital Event</em>'.
	 * @see es.udima.cesarlaso.tfm.gpiosevents.DigitalEvent
	 * @generated
	 */
	EClass getDigitalEvent();

	/**
	 * Returns the meta object for the reference '{@link es.udima.cesarlaso.tfm.gpiosevents.DigitalEvent#getPin <em>Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pin</em>'.
	 * @see es.udima.cesarlaso.tfm.gpiosevents.DigitalEvent#getPin()
	 * @see #getDigitalEvent()
	 * @generated
	 */
	EReference getDigitalEvent_Pin();

	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.gpiosevents.AnalogEvent <em>Analog Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analog Event</em>'.
	 * @see es.udima.cesarlaso.tfm.gpiosevents.AnalogEvent
	 * @generated
	 */
	EClass getAnalogEvent();

	/**
	 * Returns the meta object for the reference '{@link es.udima.cesarlaso.tfm.gpiosevents.AnalogEvent#getPin <em>Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pin</em>'.
	 * @see es.udima.cesarlaso.tfm.gpiosevents.AnalogEvent#getPin()
	 * @see #getAnalogEvent()
	 * @generated
	 */
	EReference getAnalogEvent_Pin();

	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.gpiosevents.Interrupted <em>Interrupted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interrupted</em>'.
	 * @see es.udima.cesarlaso.tfm.gpiosevents.Interrupted
	 * @generated
	 */
	EClass getInterrupted();

	/**
	 * Returns the meta object for the attribute '{@link es.udima.cesarlaso.tfm.gpiosevents.Interrupted#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see es.udima.cesarlaso.tfm.gpiosevents.Interrupted#getMode()
	 * @see #getInterrupted()
	 * @generated
	 */
	EAttribute getInterrupted_Mode();

	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.gpiosevents.ButtonInput <em>Button Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button Input</em>'.
	 * @see es.udima.cesarlaso.tfm.gpiosevents.ButtonInput
	 * @generated
	 */
	EClass getButtonInput();

	/**
	 * Returns the meta object for the attribute '{@link es.udima.cesarlaso.tfm.gpiosevents.ButtonInput#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see es.udima.cesarlaso.tfm.gpiosevents.ButtonInput#getMode()
	 * @see #getButtonInput()
	 * @generated
	 */
	EAttribute getButtonInput_Mode();

	/**
	 * Returns the meta object for the attribute '{@link es.udima.cesarlaso.tfm.gpiosevents.ButtonInput#getMinDuration <em>Min Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Duration</em>'.
	 * @see es.udima.cesarlaso.tfm.gpiosevents.ButtonInput#getMinDuration()
	 * @see #getButtonInput()
	 * @generated
	 */
	EAttribute getButtonInput_MinDuration();

	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.gpiosevents.ButtonInputAccumulator <em>Button Input Accumulator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button Input Accumulator</em>'.
	 * @see es.udima.cesarlaso.tfm.gpiosevents.ButtonInputAccumulator
	 * @generated
	 */
	EClass getButtonInputAccumulator();

	/**
	 * Returns the meta object for the attribute '{@link es.udima.cesarlaso.tfm.gpiosevents.ButtonInputAccumulator#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see es.udima.cesarlaso.tfm.gpiosevents.ButtonInputAccumulator#getCount()
	 * @see #getButtonInputAccumulator()
	 * @generated
	 */
	EAttribute getButtonInputAccumulator_Count();

	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.gpiosevents.ButtonInputReleased <em>Button Input Released</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button Input Released</em>'.
	 * @see es.udima.cesarlaso.tfm.gpiosevents.ButtonInputReleased
	 * @generated
	 */
	EClass getButtonInputReleased();

	/**
	 * Returns the meta object for the attribute '{@link es.udima.cesarlaso.tfm.gpiosevents.ButtonInputReleased#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see es.udima.cesarlaso.tfm.gpiosevents.ButtonInputReleased#getMode()
	 * @see #getButtonInputReleased()
	 * @generated
	 */
	EAttribute getButtonInputReleased_Mode();

	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.gpiosevents.PulseInput <em>Pulse Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pulse Input</em>'.
	 * @see es.udima.cesarlaso.tfm.gpiosevents.PulseInput
	 * @generated
	 */
	EClass getPulseInput();

	/**
	 * Returns the meta object for the attribute '{@link es.udima.cesarlaso.tfm.gpiosevents.PulseInput#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see es.udima.cesarlaso.tfm.gpiosevents.PulseInput#getMode()
	 * @see #getPulseInput()
	 * @generated
	 */
	EAttribute getPulseInput_Mode();

	/**
	 * Returns the meta object for the attribute '{@link es.udima.cesarlaso.tfm.gpiosevents.PulseInput#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see es.udima.cesarlaso.tfm.gpiosevents.PulseInput#getCount()
	 * @see #getPulseInput()
	 * @generated
	 */
	EAttribute getPulseInput_Count();

	/**
	 * Returns the meta object for the attribute '{@link es.udima.cesarlaso.tfm.gpiosevents.PulseInput#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see es.udima.cesarlaso.tfm.gpiosevents.PulseInput#getWidth()
	 * @see #getPulseInput()
	 * @generated
	 */
	EAttribute getPulseInput_Width();

	/**
	 * Returns the meta object for the attribute '{@link es.udima.cesarlaso.tfm.gpiosevents.PulseInput#getSpaceWidth <em>Space Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Space Width</em>'.
	 * @see es.udima.cesarlaso.tfm.gpiosevents.PulseInput#getSpaceWidth()
	 * @see #getPulseInput()
	 * @generated
	 */
	EAttribute getPulseInput_SpaceWidth();

	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.gpiosevents.AnalogRead <em>Analog Read</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analog Read</em>'.
	 * @see es.udima.cesarlaso.tfm.gpiosevents.AnalogRead
	 * @generated
	 */
	EClass getAnalogRead();

	/**
	 * Returns the meta object for the attribute '{@link es.udima.cesarlaso.tfm.gpiosevents.AnalogRead#getPollIntervalLoops <em>Poll Interval Loops</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Poll Interval Loops</em>'.
	 * @see es.udima.cesarlaso.tfm.gpiosevents.AnalogRead#getPollIntervalLoops()
	 * @see #getAnalogRead()
	 * @generated
	 */
	EAttribute getAnalogRead_PollIntervalLoops();

	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.gpiosevents.AnalogReadPerformOnChange <em>Analog Read Perform On Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analog Read Perform On Change</em>'.
	 * @see es.udima.cesarlaso.tfm.gpiosevents.AnalogReadPerformOnChange
	 * @generated
	 */
	EClass getAnalogReadPerformOnChange();

	/**
	 * Returns the meta object for the attribute '{@link es.udima.cesarlaso.tfm.gpiosevents.AnalogReadPerformOnChange#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see es.udima.cesarlaso.tfm.gpiosevents.AnalogReadPerformOnChange#getValue()
	 * @see #getAnalogReadPerformOnChange()
	 * @generated
	 */
	EAttribute getAnalogReadPerformOnChange_Value();

	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.gpiosevents.AnalogReadPerformOnHigh <em>Analog Read Perform On High</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analog Read Perform On High</em>'.
	 * @see es.udima.cesarlaso.tfm.gpiosevents.AnalogReadPerformOnHigh
	 * @generated
	 */
	EClass getAnalogReadPerformOnHigh();

	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.gpiosevents.AnalogReadPerformOnLow <em>Analog Read Perform On Low</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analog Read Perform On Low</em>'.
	 * @see es.udima.cesarlaso.tfm.gpiosevents.AnalogReadPerformOnLow
	 * @generated
	 */
	EClass getAnalogReadPerformOnLow();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GpioseventsFactory getGpioseventsFactory();

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
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.gpiosevents.impl.GpioEventImpl <em>Gpio Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.gpiosevents.impl.GpioEventImpl
		 * @see es.udima.cesarlaso.tfm.gpiosevents.impl.GpioseventsPackageImpl#getGpioEvent()
		 * @generated
		 */
		EClass GPIO_EVENT = eINSTANCE.getGpioEvent();

		/**
		 * The meta object literal for the '<em><b>Performed</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GPIO_EVENT___PERFORMED = eINSTANCE.getGpioEvent__Performed();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.gpiosevents.impl.DigitalEventImpl <em>Digital Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.gpiosevents.impl.DigitalEventImpl
		 * @see es.udima.cesarlaso.tfm.gpiosevents.impl.GpioseventsPackageImpl#getDigitalEvent()
		 * @generated
		 */
		EClass DIGITAL_EVENT = eINSTANCE.getDigitalEvent();

		/**
		 * The meta object literal for the '<em><b>Pin</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIGITAL_EVENT__PIN = eINSTANCE.getDigitalEvent_Pin();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.gpiosevents.impl.AnalogEventImpl <em>Analog Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.gpiosevents.impl.AnalogEventImpl
		 * @see es.udima.cesarlaso.tfm.gpiosevents.impl.GpioseventsPackageImpl#getAnalogEvent()
		 * @generated
		 */
		EClass ANALOG_EVENT = eINSTANCE.getAnalogEvent();

		/**
		 * The meta object literal for the '<em><b>Pin</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALOG_EVENT__PIN = eINSTANCE.getAnalogEvent_Pin();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.gpiosevents.impl.InterruptedImpl <em>Interrupted</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.gpiosevents.impl.InterruptedImpl
		 * @see es.udima.cesarlaso.tfm.gpiosevents.impl.GpioseventsPackageImpl#getInterrupted()
		 * @generated
		 */
		EClass INTERRUPTED = eINSTANCE.getInterrupted();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERRUPTED__MODE = eINSTANCE.getInterrupted_Mode();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.gpiosevents.impl.ButtonInputImpl <em>Button Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.gpiosevents.impl.ButtonInputImpl
		 * @see es.udima.cesarlaso.tfm.gpiosevents.impl.GpioseventsPackageImpl#getButtonInput()
		 * @generated
		 */
		EClass BUTTON_INPUT = eINSTANCE.getButtonInput();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUTTON_INPUT__MODE = eINSTANCE.getButtonInput_Mode();

		/**
		 * The meta object literal for the '<em><b>Min Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUTTON_INPUT__MIN_DURATION = eINSTANCE.getButtonInput_MinDuration();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.gpiosevents.impl.ButtonInputAccumulatorImpl <em>Button Input Accumulator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.gpiosevents.impl.ButtonInputAccumulatorImpl
		 * @see es.udima.cesarlaso.tfm.gpiosevents.impl.GpioseventsPackageImpl#getButtonInputAccumulator()
		 * @generated
		 */
		EClass BUTTON_INPUT_ACCUMULATOR = eINSTANCE.getButtonInputAccumulator();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUTTON_INPUT_ACCUMULATOR__COUNT = eINSTANCE.getButtonInputAccumulator_Count();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.gpiosevents.impl.ButtonInputReleasedImpl <em>Button Input Released</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.gpiosevents.impl.ButtonInputReleasedImpl
		 * @see es.udima.cesarlaso.tfm.gpiosevents.impl.GpioseventsPackageImpl#getButtonInputReleased()
		 * @generated
		 */
		EClass BUTTON_INPUT_RELEASED = eINSTANCE.getButtonInputReleased();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUTTON_INPUT_RELEASED__MODE = eINSTANCE.getButtonInputReleased_Mode();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.gpiosevents.impl.PulseInputImpl <em>Pulse Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.gpiosevents.impl.PulseInputImpl
		 * @see es.udima.cesarlaso.tfm.gpiosevents.impl.GpioseventsPackageImpl#getPulseInput()
		 * @generated
		 */
		EClass PULSE_INPUT = eINSTANCE.getPulseInput();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PULSE_INPUT__MODE = eINSTANCE.getPulseInput_Mode();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PULSE_INPUT__COUNT = eINSTANCE.getPulseInput_Count();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PULSE_INPUT__WIDTH = eINSTANCE.getPulseInput_Width();

		/**
		 * The meta object literal for the '<em><b>Space Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PULSE_INPUT__SPACE_WIDTH = eINSTANCE.getPulseInput_SpaceWidth();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.gpiosevents.impl.AnalogReadImpl <em>Analog Read</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.gpiosevents.impl.AnalogReadImpl
		 * @see es.udima.cesarlaso.tfm.gpiosevents.impl.GpioseventsPackageImpl#getAnalogRead()
		 * @generated
		 */
		EClass ANALOG_READ = eINSTANCE.getAnalogRead();

		/**
		 * The meta object literal for the '<em><b>Poll Interval Loops</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALOG_READ__POLL_INTERVAL_LOOPS = eINSTANCE.getAnalogRead_PollIntervalLoops();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.gpiosevents.impl.AnalogReadPerformOnChangeImpl <em>Analog Read Perform On Change</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.gpiosevents.impl.AnalogReadPerformOnChangeImpl
		 * @see es.udima.cesarlaso.tfm.gpiosevents.impl.GpioseventsPackageImpl#getAnalogReadPerformOnChange()
		 * @generated
		 */
		EClass ANALOG_READ_PERFORM_ON_CHANGE = eINSTANCE.getAnalogReadPerformOnChange();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALOG_READ_PERFORM_ON_CHANGE__VALUE = eINSTANCE.getAnalogReadPerformOnChange_Value();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.gpiosevents.impl.AnalogReadPerformOnHighImpl <em>Analog Read Perform On High</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.gpiosevents.impl.AnalogReadPerformOnHighImpl
		 * @see es.udima.cesarlaso.tfm.gpiosevents.impl.GpioseventsPackageImpl#getAnalogReadPerformOnHigh()
		 * @generated
		 */
		EClass ANALOG_READ_PERFORM_ON_HIGH = eINSTANCE.getAnalogReadPerformOnHigh();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.gpiosevents.impl.AnalogReadPerformOnLowImpl <em>Analog Read Perform On Low</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.gpiosevents.impl.AnalogReadPerformOnLowImpl
		 * @see es.udima.cesarlaso.tfm.gpiosevents.impl.GpioseventsPackageImpl#getAnalogReadPerformOnLow()
		 * @generated
		 */
		EClass ANALOG_READ_PERFORM_ON_LOW = eINSTANCE.getAnalogReadPerformOnLow();

	}

} //GpioseventsPackage
