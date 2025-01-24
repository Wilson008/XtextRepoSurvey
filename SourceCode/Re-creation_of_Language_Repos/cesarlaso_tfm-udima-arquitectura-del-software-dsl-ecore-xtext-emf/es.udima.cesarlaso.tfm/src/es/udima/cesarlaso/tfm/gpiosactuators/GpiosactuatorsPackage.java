/**
 */
package es.udima.cesarlaso.tfm.gpiosactuators;

import es.udima.cesarlaso.tfm.events.EventsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see es.udima.cesarlaso.tfm.gpiosactuators.GpiosactuatorsFactory
 * @model kind="package"
 * @generated
 */
public interface GpiosactuatorsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "gpiosactuators";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://tfm.cesarlaso.udima.es/gpios/actuators";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "es.udima.cesarlaso.tfm.gpios.actuators";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GpiosactuatorsPackage eINSTANCE = es.udima.cesarlaso.tfm.gpiosactuators.impl.GpiosactuatorsPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.gpiosactuators.impl.GpioActuatorImpl <em>Gpio Actuator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.gpiosactuators.impl.GpioActuatorImpl
	 * @see es.udima.cesarlaso.tfm.gpiosactuators.impl.GpiosactuatorsPackageImpl#getGpioActuator()
	 * @generated
	 */
	int GPIO_ACTUATOR = 0;

	/**
	 * The number of structural features of the '<em>Gpio Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPIO_ACTUATOR_FEATURE_COUNT = EventsPackage.ACTUATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Gpio Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPIO_ACTUATOR_OPERATION_COUNT = EventsPackage.ACTUATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.gpiosactuators.impl.GpioTimerActuatorImpl <em>Gpio Timer Actuator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.gpiosactuators.impl.GpioTimerActuatorImpl
	 * @see es.udima.cesarlaso.tfm.gpiosactuators.impl.GpiosactuatorsPackageImpl#getGpioTimerActuator()
	 * @generated
	 */
	int GPIO_TIMER_ACTUATOR = 1;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPIO_TIMER_ACTUATOR__DURATION = 0;

	/**
	 * The number of structural features of the '<em>Gpio Timer Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPIO_TIMER_ACTUATOR_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Gpio Timer Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPIO_TIMER_ACTUATOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.gpiosactuators.impl.DigitalActuatorImpl <em>Digital Actuator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.gpiosactuators.impl.DigitalActuatorImpl
	 * @see es.udima.cesarlaso.tfm.gpiosactuators.impl.GpiosactuatorsPackageImpl#getDigitalActuator()
	 * @generated
	 */
	int DIGITAL_ACTUATOR = 2;

	/**
	 * The feature id for the '<em><b>Pin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_ACTUATOR__PIN = GPIO_ACTUATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Digital Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_ACTUATOR_FEATURE_COUNT = GPIO_ACTUATOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Digital Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_ACTUATOR_OPERATION_COUNT = GPIO_ACTUATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.gpiosactuators.impl.AnalogActuatorImpl <em>Analog Actuator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.gpiosactuators.impl.AnalogActuatorImpl
	 * @see es.udima.cesarlaso.tfm.gpiosactuators.impl.GpiosactuatorsPackageImpl#getAnalogActuator()
	 * @generated
	 */
	int ANALOG_ACTUATOR = 3;

	/**
	 * The feature id for the '<em><b>Pin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_ACTUATOR__PIN = GPIO_ACTUATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Analog Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_ACTUATOR_FEATURE_COUNT = GPIO_ACTUATOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Analog Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_ACTUATOR_OPERATION_COUNT = GPIO_ACTUATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.gpiosactuators.impl.ChangeOutputImpl <em>Change Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.gpiosactuators.impl.ChangeOutputImpl
	 * @see es.udima.cesarlaso.tfm.gpiosactuators.impl.GpiosactuatorsPackageImpl#getChangeOutput()
	 * @generated
	 */
	int CHANGE_OUTPUT = 4;

	/**
	 * The feature id for the '<em><b>Pin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_OUTPUT__PIN = DIGITAL_ACTUATOR__PIN;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_OUTPUT__STATUS = DIGITAL_ACTUATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Change Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_OUTPUT_FEATURE_COUNT = DIGITAL_ACTUATOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Change Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_OUTPUT_OPERATION_COUNT = DIGITAL_ACTUATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.gpiosactuators.impl.ButtonOutputImpl <em>Button Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.gpiosactuators.impl.ButtonOutputImpl
	 * @see es.udima.cesarlaso.tfm.gpiosactuators.impl.GpiosactuatorsPackageImpl#getButtonOutput()
	 * @generated
	 */
	int BUTTON_OUTPUT = 5;

	/**
	 * The feature id for the '<em><b>Pin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_OUTPUT__PIN = CHANGE_OUTPUT__PIN;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_OUTPUT__STATUS = CHANGE_OUTPUT__STATUS;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_OUTPUT__DURATION = CHANGE_OUTPUT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Button Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_OUTPUT_FEATURE_COUNT = CHANGE_OUTPUT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Button Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_OUTPUT_OPERATION_COUNT = CHANGE_OUTPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.gpiosactuators.impl.PulseOutputImpl <em>Pulse Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.gpiosactuators.impl.PulseOutputImpl
	 * @see es.udima.cesarlaso.tfm.gpiosactuators.impl.GpiosactuatorsPackageImpl#getPulseOutput()
	 * @generated
	 */
	int PULSE_OUTPUT = 6;

	/**
	 * The feature id for the '<em><b>Pin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULSE_OUTPUT__PIN = DIGITAL_ACTUATOR__PIN;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULSE_OUTPUT__COUNT = DIGITAL_ACTUATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULSE_OUTPUT__WIDTH = DIGITAL_ACTUATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Space Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULSE_OUTPUT__SPACE_WIDTH = DIGITAL_ACTUATOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pulse Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULSE_OUTPUT_FEATURE_COUNT = DIGITAL_ACTUATOR_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Pulse Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULSE_OUTPUT_OPERATION_COUNT = DIGITAL_ACTUATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.gpiosactuators.impl.BlinkOutputImpl <em>Blink Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.gpiosactuators.impl.BlinkOutputImpl
	 * @see es.udima.cesarlaso.tfm.gpiosactuators.impl.GpiosactuatorsPackageImpl#getBlinkOutput()
	 * @generated
	 */
	int BLINK_OUTPUT = 7;

	/**
	 * The feature id for the '<em><b>Pin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLINK_OUTPUT__PIN = DIGITAL_ACTUATOR__PIN;

	/**
	 * The feature id for the '<em><b>Interval</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLINK_OUTPUT__INTERVAL = DIGITAL_ACTUATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Blink Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLINK_OUTPUT_FEATURE_COUNT = DIGITAL_ACTUATOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Blink Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLINK_OUTPUT_OPERATION_COUNT = DIGITAL_ACTUATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.gpiosactuators.impl.BlinkTimerOutputImpl <em>Blink Timer Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.gpiosactuators.impl.BlinkTimerOutputImpl
	 * @see es.udima.cesarlaso.tfm.gpiosactuators.impl.GpiosactuatorsPackageImpl#getBlinkTimerOutput()
	 * @generated
	 */
	int BLINK_TIMER_OUTPUT = 8;

	/**
	 * The feature id for the '<em><b>Pin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLINK_TIMER_OUTPUT__PIN = BLINK_OUTPUT__PIN;

	/**
	 * The feature id for the '<em><b>Interval</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLINK_TIMER_OUTPUT__INTERVAL = BLINK_OUTPUT__INTERVAL;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLINK_TIMER_OUTPUT__DURATION = BLINK_OUTPUT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Blink Timer Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLINK_TIMER_OUTPUT_FEATURE_COUNT = BLINK_OUTPUT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Blink Timer Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLINK_TIMER_OUTPUT_OPERATION_COUNT = BLINK_OUTPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.gpiosactuators.impl.PwmImpl <em>Pwm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.gpiosactuators.impl.PwmImpl
	 * @see es.udima.cesarlaso.tfm.gpiosactuators.impl.GpiosactuatorsPackageImpl#getPwm()
	 * @generated
	 */
	int PWM = 9;

	/**
	 * The feature id for the '<em><b>Pin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PWM__PIN = ANALOG_ACTUATOR__PIN;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PWM__VALUE = ANALOG_ACTUATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pwm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PWM_FEATURE_COUNT = ANALOG_ACTUATOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pwm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PWM_OPERATION_COUNT = ANALOG_ACTUATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.gpiosactuators.impl.TransformToImpl <em>Transform To</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.gpiosactuators.impl.TransformToImpl
	 * @see es.udima.cesarlaso.tfm.gpiosactuators.impl.GpiosactuatorsPackageImpl#getTransformTo()
	 * @generated
	 */
	int TRANSFORM_TO = 10;

	/**
	 * The feature id for the '<em><b>Pin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_TO__PIN = ANALOG_ACTUATOR__PIN;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_TO__DURATION = ANALOG_ACTUATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_TO__VALUE = ANALOG_ACTUATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Transform To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_TO_FEATURE_COUNT = ANALOG_ACTUATOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Transform To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_TO_OPERATION_COUNT = ANALOG_ACTUATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.gpiosactuators.DigitalPinStatus <em>Digital Pin Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.gpiosactuators.DigitalPinStatus
	 * @see es.udima.cesarlaso.tfm.gpiosactuators.impl.GpiosactuatorsPackageImpl#getDigitalPinStatus()
	 * @generated
	 */
	int DIGITAL_PIN_STATUS = 11;


	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.gpiosactuators.GpioActuator <em>Gpio Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gpio Actuator</em>'.
	 * @see es.udima.cesarlaso.tfm.gpiosactuators.GpioActuator
	 * @generated
	 */
	EClass getGpioActuator();

	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.gpiosactuators.GpioTimerActuator <em>Gpio Timer Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gpio Timer Actuator</em>'.
	 * @see es.udima.cesarlaso.tfm.gpiosactuators.GpioTimerActuator
	 * @generated
	 */
	EClass getGpioTimerActuator();

	/**
	 * Returns the meta object for the containment reference '{@link es.udima.cesarlaso.tfm.gpiosactuators.GpioTimerActuator#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Duration</em>'.
	 * @see es.udima.cesarlaso.tfm.gpiosactuators.GpioTimerActuator#getDuration()
	 * @see #getGpioTimerActuator()
	 * @generated
	 */
	EReference getGpioTimerActuator_Duration();

	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.gpiosactuators.DigitalActuator <em>Digital Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Digital Actuator</em>'.
	 * @see es.udima.cesarlaso.tfm.gpiosactuators.DigitalActuator
	 * @generated
	 */
	EClass getDigitalActuator();

	/**
	 * Returns the meta object for the reference '{@link es.udima.cesarlaso.tfm.gpiosactuators.DigitalActuator#getPin <em>Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pin</em>'.
	 * @see es.udima.cesarlaso.tfm.gpiosactuators.DigitalActuator#getPin()
	 * @see #getDigitalActuator()
	 * @generated
	 */
	EReference getDigitalActuator_Pin();

	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.gpiosactuators.AnalogActuator <em>Analog Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analog Actuator</em>'.
	 * @see es.udima.cesarlaso.tfm.gpiosactuators.AnalogActuator
	 * @generated
	 */
	EClass getAnalogActuator();

	/**
	 * Returns the meta object for the reference '{@link es.udima.cesarlaso.tfm.gpiosactuators.AnalogActuator#getPin <em>Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pin</em>'.
	 * @see es.udima.cesarlaso.tfm.gpiosactuators.AnalogActuator#getPin()
	 * @see #getAnalogActuator()
	 * @generated
	 */
	EReference getAnalogActuator_Pin();

	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.gpiosactuators.ChangeOutput <em>Change Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Output</em>'.
	 * @see es.udima.cesarlaso.tfm.gpiosactuators.ChangeOutput
	 * @generated
	 */
	EClass getChangeOutput();

	/**
	 * Returns the meta object for the attribute '{@link es.udima.cesarlaso.tfm.gpiosactuators.ChangeOutput#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see es.udima.cesarlaso.tfm.gpiosactuators.ChangeOutput#getStatus()
	 * @see #getChangeOutput()
	 * @generated
	 */
	EAttribute getChangeOutput_Status();

	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.gpiosactuators.ButtonOutput <em>Button Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button Output</em>'.
	 * @see es.udima.cesarlaso.tfm.gpiosactuators.ButtonOutput
	 * @generated
	 */
	EClass getButtonOutput();

	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.gpiosactuators.PulseOutput <em>Pulse Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pulse Output</em>'.
	 * @see es.udima.cesarlaso.tfm.gpiosactuators.PulseOutput
	 * @generated
	 */
	EClass getPulseOutput();

	/**
	 * Returns the meta object for the attribute '{@link es.udima.cesarlaso.tfm.gpiosactuators.PulseOutput#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see es.udima.cesarlaso.tfm.gpiosactuators.PulseOutput#getCount()
	 * @see #getPulseOutput()
	 * @generated
	 */
	EAttribute getPulseOutput_Count();

	/**
	 * Returns the meta object for the attribute '{@link es.udima.cesarlaso.tfm.gpiosactuators.PulseOutput#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see es.udima.cesarlaso.tfm.gpiosactuators.PulseOutput#getWidth()
	 * @see #getPulseOutput()
	 * @generated
	 */
	EAttribute getPulseOutput_Width();

	/**
	 * Returns the meta object for the attribute '{@link es.udima.cesarlaso.tfm.gpiosactuators.PulseOutput#getSpaceWidth <em>Space Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Space Width</em>'.
	 * @see es.udima.cesarlaso.tfm.gpiosactuators.PulseOutput#getSpaceWidth()
	 * @see #getPulseOutput()
	 * @generated
	 */
	EAttribute getPulseOutput_SpaceWidth();

	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.gpiosactuators.BlinkOutput <em>Blink Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Blink Output</em>'.
	 * @see es.udima.cesarlaso.tfm.gpiosactuators.BlinkOutput
	 * @generated
	 */
	EClass getBlinkOutput();

	/**
	 * Returns the meta object for the containment reference '{@link es.udima.cesarlaso.tfm.gpiosactuators.BlinkOutput#getInterval <em>Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interval</em>'.
	 * @see es.udima.cesarlaso.tfm.gpiosactuators.BlinkOutput#getInterval()
	 * @see #getBlinkOutput()
	 * @generated
	 */
	EReference getBlinkOutput_Interval();

	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.gpiosactuators.BlinkTimerOutput <em>Blink Timer Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Blink Timer Output</em>'.
	 * @see es.udima.cesarlaso.tfm.gpiosactuators.BlinkTimerOutput
	 * @generated
	 */
	EClass getBlinkTimerOutput();

	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.gpiosactuators.Pwm <em>Pwm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pwm</em>'.
	 * @see es.udima.cesarlaso.tfm.gpiosactuators.Pwm
	 * @generated
	 */
	EClass getPwm();

	/**
	 * Returns the meta object for the attribute '{@link es.udima.cesarlaso.tfm.gpiosactuators.Pwm#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see es.udima.cesarlaso.tfm.gpiosactuators.Pwm#getValue()
	 * @see #getPwm()
	 * @generated
	 */
	EAttribute getPwm_Value();

	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.gpiosactuators.TransformTo <em>Transform To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transform To</em>'.
	 * @see es.udima.cesarlaso.tfm.gpiosactuators.TransformTo
	 * @generated
	 */
	EClass getTransformTo();

	/**
	 * Returns the meta object for the attribute '{@link es.udima.cesarlaso.tfm.gpiosactuators.TransformTo#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see es.udima.cesarlaso.tfm.gpiosactuators.TransformTo#getValue()
	 * @see #getTransformTo()
	 * @generated
	 */
	EAttribute getTransformTo_Value();

	/**
	 * Returns the meta object for enum '{@link es.udima.cesarlaso.tfm.gpiosactuators.DigitalPinStatus <em>Digital Pin Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Digital Pin Status</em>'.
	 * @see es.udima.cesarlaso.tfm.gpiosactuators.DigitalPinStatus
	 * @generated
	 */
	EEnum getDigitalPinStatus();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GpiosactuatorsFactory getGpiosactuatorsFactory();

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
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.gpiosactuators.impl.GpioActuatorImpl <em>Gpio Actuator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.gpiosactuators.impl.GpioActuatorImpl
		 * @see es.udima.cesarlaso.tfm.gpiosactuators.impl.GpiosactuatorsPackageImpl#getGpioActuator()
		 * @generated
		 */
		EClass GPIO_ACTUATOR = eINSTANCE.getGpioActuator();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.gpiosactuators.impl.GpioTimerActuatorImpl <em>Gpio Timer Actuator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.gpiosactuators.impl.GpioTimerActuatorImpl
		 * @see es.udima.cesarlaso.tfm.gpiosactuators.impl.GpiosactuatorsPackageImpl#getGpioTimerActuator()
		 * @generated
		 */
		EClass GPIO_TIMER_ACTUATOR = eINSTANCE.getGpioTimerActuator();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GPIO_TIMER_ACTUATOR__DURATION = eINSTANCE.getGpioTimerActuator_Duration();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.gpiosactuators.impl.DigitalActuatorImpl <em>Digital Actuator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.gpiosactuators.impl.DigitalActuatorImpl
		 * @see es.udima.cesarlaso.tfm.gpiosactuators.impl.GpiosactuatorsPackageImpl#getDigitalActuator()
		 * @generated
		 */
		EClass DIGITAL_ACTUATOR = eINSTANCE.getDigitalActuator();

		/**
		 * The meta object literal for the '<em><b>Pin</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIGITAL_ACTUATOR__PIN = eINSTANCE.getDigitalActuator_Pin();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.gpiosactuators.impl.AnalogActuatorImpl <em>Analog Actuator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.gpiosactuators.impl.AnalogActuatorImpl
		 * @see es.udima.cesarlaso.tfm.gpiosactuators.impl.GpiosactuatorsPackageImpl#getAnalogActuator()
		 * @generated
		 */
		EClass ANALOG_ACTUATOR = eINSTANCE.getAnalogActuator();

		/**
		 * The meta object literal for the '<em><b>Pin</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALOG_ACTUATOR__PIN = eINSTANCE.getAnalogActuator_Pin();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.gpiosactuators.impl.ChangeOutputImpl <em>Change Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.gpiosactuators.impl.ChangeOutputImpl
		 * @see es.udima.cesarlaso.tfm.gpiosactuators.impl.GpiosactuatorsPackageImpl#getChangeOutput()
		 * @generated
		 */
		EClass CHANGE_OUTPUT = eINSTANCE.getChangeOutput();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_OUTPUT__STATUS = eINSTANCE.getChangeOutput_Status();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.gpiosactuators.impl.ButtonOutputImpl <em>Button Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.gpiosactuators.impl.ButtonOutputImpl
		 * @see es.udima.cesarlaso.tfm.gpiosactuators.impl.GpiosactuatorsPackageImpl#getButtonOutput()
		 * @generated
		 */
		EClass BUTTON_OUTPUT = eINSTANCE.getButtonOutput();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.gpiosactuators.impl.PulseOutputImpl <em>Pulse Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.gpiosactuators.impl.PulseOutputImpl
		 * @see es.udima.cesarlaso.tfm.gpiosactuators.impl.GpiosactuatorsPackageImpl#getPulseOutput()
		 * @generated
		 */
		EClass PULSE_OUTPUT = eINSTANCE.getPulseOutput();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PULSE_OUTPUT__COUNT = eINSTANCE.getPulseOutput_Count();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PULSE_OUTPUT__WIDTH = eINSTANCE.getPulseOutput_Width();

		/**
		 * The meta object literal for the '<em><b>Space Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PULSE_OUTPUT__SPACE_WIDTH = eINSTANCE.getPulseOutput_SpaceWidth();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.gpiosactuators.impl.BlinkOutputImpl <em>Blink Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.gpiosactuators.impl.BlinkOutputImpl
		 * @see es.udima.cesarlaso.tfm.gpiosactuators.impl.GpiosactuatorsPackageImpl#getBlinkOutput()
		 * @generated
		 */
		EClass BLINK_OUTPUT = eINSTANCE.getBlinkOutput();

		/**
		 * The meta object literal for the '<em><b>Interval</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLINK_OUTPUT__INTERVAL = eINSTANCE.getBlinkOutput_Interval();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.gpiosactuators.impl.BlinkTimerOutputImpl <em>Blink Timer Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.gpiosactuators.impl.BlinkTimerOutputImpl
		 * @see es.udima.cesarlaso.tfm.gpiosactuators.impl.GpiosactuatorsPackageImpl#getBlinkTimerOutput()
		 * @generated
		 */
		EClass BLINK_TIMER_OUTPUT = eINSTANCE.getBlinkTimerOutput();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.gpiosactuators.impl.PwmImpl <em>Pwm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.gpiosactuators.impl.PwmImpl
		 * @see es.udima.cesarlaso.tfm.gpiosactuators.impl.GpiosactuatorsPackageImpl#getPwm()
		 * @generated
		 */
		EClass PWM = eINSTANCE.getPwm();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PWM__VALUE = eINSTANCE.getPwm_Value();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.gpiosactuators.impl.TransformToImpl <em>Transform To</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.gpiosactuators.impl.TransformToImpl
		 * @see es.udima.cesarlaso.tfm.gpiosactuators.impl.GpiosactuatorsPackageImpl#getTransformTo()
		 * @generated
		 */
		EClass TRANSFORM_TO = eINSTANCE.getTransformTo();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORM_TO__VALUE = eINSTANCE.getTransformTo_Value();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.gpiosactuators.DigitalPinStatus <em>Digital Pin Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.gpiosactuators.DigitalPinStatus
		 * @see es.udima.cesarlaso.tfm.gpiosactuators.impl.GpiosactuatorsPackageImpl#getDigitalPinStatus()
		 * @generated
		 */
		EEnum DIGITAL_PIN_STATUS = eINSTANCE.getDigitalPinStatus();

	}

} //GpiosactuatorsPackage
