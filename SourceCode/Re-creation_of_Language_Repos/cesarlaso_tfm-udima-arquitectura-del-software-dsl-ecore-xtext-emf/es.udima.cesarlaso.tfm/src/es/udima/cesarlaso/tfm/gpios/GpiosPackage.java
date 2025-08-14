/**
 */
package es.udima.cesarlaso.tfm.gpios;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
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
 * @see es.udima.cesarlaso.tfm.gpios.GpiosFactory
 * @model kind="package"
 * @generated
 */
public interface GpiosPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "gpios";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://tfm.cesarlaso.udima.es/gpios";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "es.udima.cesarlaso.tfm.gpios";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GpiosPackage eINSTANCE = es.udima.cesarlaso.tfm.gpios.impl.GpiosPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.gpios.Pin <em>Pin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.gpios.Pin
	 * @see es.udima.cesarlaso.tfm.gpios.impl.GpiosPackageImpl#getPin()
	 * @generated
	 */
	int PIN = 0;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__NAME = 1;

	/**
	 * The number of structural features of the '<em>Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.gpios.impl.DigitalPinImpl <em>Digital Pin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.gpios.impl.DigitalPinImpl
	 * @see es.udima.cesarlaso.tfm.gpios.impl.GpiosPackageImpl#getDigitalPin()
	 * @generated
	 */
	int DIGITAL_PIN = 1;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_PIN__NUMBER = PIN__NUMBER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_PIN__NAME = PIN__NAME;

	/**
	 * The number of structural features of the '<em>Digital Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_PIN_FEATURE_COUNT = PIN_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Read</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_PIN___READ = PIN_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Write</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_PIN___WRITE__BOOLEAN = PIN_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Attach Interrupt</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_PIN___ATTACH_INTERRUPT__INTERRUPTMODE = PIN_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Digital Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_PIN_OPERATION_COUNT = PIN_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.gpios.impl.AnalogPinImpl <em>Analog Pin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.gpios.impl.AnalogPinImpl
	 * @see es.udima.cesarlaso.tfm.gpios.impl.GpiosPackageImpl#getAnalogPin()
	 * @generated
	 */
	int ANALOG_PIN = 2;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_PIN__NUMBER = PIN__NUMBER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_PIN__NAME = PIN__NAME;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_PIN__RESOLUTION = PIN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Analog Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_PIN_FEATURE_COUNT = PIN_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Read</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_PIN___READ = PIN_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Write</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_PIN___WRITE__INT = PIN_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Analog Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_PIN_OPERATION_COUNT = PIN_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.gpios.impl.DigitalInputPinImpl <em>Digital Input Pin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.gpios.impl.DigitalInputPinImpl
	 * @see es.udima.cesarlaso.tfm.gpios.impl.GpiosPackageImpl#getDigitalInputPin()
	 * @generated
	 */
	int DIGITAL_INPUT_PIN = 3;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_INPUT_PIN__NUMBER = DIGITAL_PIN__NUMBER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_INPUT_PIN__NAME = DIGITAL_PIN__NAME;

	/**
	 * The number of structural features of the '<em>Digital Input Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_INPUT_PIN_FEATURE_COUNT = DIGITAL_PIN_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Read</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_INPUT_PIN___READ = DIGITAL_PIN___READ;

	/**
	 * The operation id for the '<em>Write</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_INPUT_PIN___WRITE__BOOLEAN = DIGITAL_PIN___WRITE__BOOLEAN;

	/**
	 * The operation id for the '<em>Attach Interrupt</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_INPUT_PIN___ATTACH_INTERRUPT__INTERRUPTMODE = DIGITAL_PIN___ATTACH_INTERRUPT__INTERRUPTMODE;

	/**
	 * The number of operations of the '<em>Digital Input Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_INPUT_PIN_OPERATION_COUNT = DIGITAL_PIN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.gpios.impl.DigitalOutputPinImpl <em>Digital Output Pin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.gpios.impl.DigitalOutputPinImpl
	 * @see es.udima.cesarlaso.tfm.gpios.impl.GpiosPackageImpl#getDigitalOutputPin()
	 * @generated
	 */
	int DIGITAL_OUTPUT_PIN = 4;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_OUTPUT_PIN__NUMBER = DIGITAL_PIN__NUMBER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_OUTPUT_PIN__NAME = DIGITAL_PIN__NAME;

	/**
	 * The number of structural features of the '<em>Digital Output Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_OUTPUT_PIN_FEATURE_COUNT = DIGITAL_PIN_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Read</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_OUTPUT_PIN___READ = DIGITAL_PIN___READ;

	/**
	 * The operation id for the '<em>Write</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_OUTPUT_PIN___WRITE__BOOLEAN = DIGITAL_PIN___WRITE__BOOLEAN;

	/**
	 * The operation id for the '<em>Attach Interrupt</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_OUTPUT_PIN___ATTACH_INTERRUPT__INTERRUPTMODE = DIGITAL_PIN___ATTACH_INTERRUPT__INTERRUPTMODE;

	/**
	 * The number of operations of the '<em>Digital Output Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_OUTPUT_PIN_OPERATION_COUNT = DIGITAL_PIN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.gpios.impl.AnalogInputPinImpl <em>Analog Input Pin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.gpios.impl.AnalogInputPinImpl
	 * @see es.udima.cesarlaso.tfm.gpios.impl.GpiosPackageImpl#getAnalogInputPin()
	 * @generated
	 */
	int ANALOG_INPUT_PIN = 5;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_INPUT_PIN__NUMBER = ANALOG_PIN__NUMBER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_INPUT_PIN__NAME = ANALOG_PIN__NAME;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_INPUT_PIN__RESOLUTION = ANALOG_PIN__RESOLUTION;

	/**
	 * The number of structural features of the '<em>Analog Input Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_INPUT_PIN_FEATURE_COUNT = ANALOG_PIN_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Read</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_INPUT_PIN___READ = ANALOG_PIN___READ;

	/**
	 * The operation id for the '<em>Write</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_INPUT_PIN___WRITE__INT = ANALOG_PIN___WRITE__INT;

	/**
	 * The number of operations of the '<em>Analog Input Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_INPUT_PIN_OPERATION_COUNT = ANALOG_PIN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.gpios.impl.AnalogOutputPinImpl <em>Analog Output Pin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.gpios.impl.AnalogOutputPinImpl
	 * @see es.udima.cesarlaso.tfm.gpios.impl.GpiosPackageImpl#getAnalogOutputPin()
	 * @generated
	 */
	int ANALOG_OUTPUT_PIN = 6;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_OUTPUT_PIN__NUMBER = ANALOG_PIN__NUMBER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_OUTPUT_PIN__NAME = ANALOG_PIN__NAME;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_OUTPUT_PIN__RESOLUTION = ANALOG_PIN__RESOLUTION;

	/**
	 * The number of structural features of the '<em>Analog Output Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_OUTPUT_PIN_FEATURE_COUNT = ANALOG_PIN_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Read</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_OUTPUT_PIN___READ = ANALOG_PIN___READ;

	/**
	 * The operation id for the '<em>Write</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_OUTPUT_PIN___WRITE__INT = ANALOG_PIN___WRITE__INT;

	/**
	 * The number of operations of the '<em>Analog Output Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_OUTPUT_PIN_OPERATION_COUNT = ANALOG_PIN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.gpios.DacResolution <em>Dac Resolution</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.gpios.DacResolution
	 * @see es.udima.cesarlaso.tfm.gpios.impl.GpiosPackageImpl#getDacResolution()
	 * @generated
	 */
	int DAC_RESOLUTION = 7;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.gpios.InterruptMode <em>Interrupt Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.gpios.InterruptMode
	 * @see es.udima.cesarlaso.tfm.gpios.impl.GpiosPackageImpl#getInterruptMode()
	 * @generated
	 */
	int INTERRUPT_MODE = 8;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.gpios.PinResistor <em>Pin Resistor</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.gpios.PinResistor
	 * @see es.udima.cesarlaso.tfm.gpios.impl.GpiosPackageImpl#getPinResistor()
	 * @generated
	 */
	int PIN_RESISTOR = 9;


	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.gpios.Pin <em>Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pin</em>'.
	 * @see es.udima.cesarlaso.tfm.gpios.Pin
	 * @generated
	 */
	EClass getPin();

	/**
	 * Returns the meta object for the attribute '{@link es.udima.cesarlaso.tfm.gpios.Pin#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see es.udima.cesarlaso.tfm.gpios.Pin#getNumber()
	 * @see #getPin()
	 * @generated
	 */
	EAttribute getPin_Number();

	/**
	 * Returns the meta object for the attribute '{@link es.udima.cesarlaso.tfm.gpios.Pin#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.udima.cesarlaso.tfm.gpios.Pin#getName()
	 * @see #getPin()
	 * @generated
	 */
	EAttribute getPin_Name();

	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.gpios.DigitalPin <em>Digital Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Digital Pin</em>'.
	 * @see es.udima.cesarlaso.tfm.gpios.DigitalPin
	 * @generated
	 */
	EClass getDigitalPin();

	/**
	 * Returns the meta object for the '{@link es.udima.cesarlaso.tfm.gpios.DigitalPin#read() <em>Read</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Read</em>' operation.
	 * @see es.udima.cesarlaso.tfm.gpios.DigitalPin#read()
	 * @generated
	 */
	EOperation getDigitalPin__Read();

	/**
	 * Returns the meta object for the '{@link es.udima.cesarlaso.tfm.gpios.DigitalPin#write(boolean) <em>Write</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Write</em>' operation.
	 * @see es.udima.cesarlaso.tfm.gpios.DigitalPin#write(boolean)
	 * @generated
	 */
	EOperation getDigitalPin__Write__boolean();

	/**
	 * Returns the meta object for the '{@link es.udima.cesarlaso.tfm.gpios.DigitalPin#attachInterrupt(es.udima.cesarlaso.tfm.gpios.InterruptMode) <em>Attach Interrupt</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Attach Interrupt</em>' operation.
	 * @see es.udima.cesarlaso.tfm.gpios.DigitalPin#attachInterrupt(es.udima.cesarlaso.tfm.gpios.InterruptMode)
	 * @generated
	 */
	EOperation getDigitalPin__AttachInterrupt__InterruptMode();

	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.gpios.AnalogPin <em>Analog Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analog Pin</em>'.
	 * @see es.udima.cesarlaso.tfm.gpios.AnalogPin
	 * @generated
	 */
	EClass getAnalogPin();

	/**
	 * Returns the meta object for the attribute '{@link es.udima.cesarlaso.tfm.gpios.AnalogPin#getResolution <em>Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolution</em>'.
	 * @see es.udima.cesarlaso.tfm.gpios.AnalogPin#getResolution()
	 * @see #getAnalogPin()
	 * @generated
	 */
	EAttribute getAnalogPin_Resolution();

	/**
	 * Returns the meta object for the '{@link es.udima.cesarlaso.tfm.gpios.AnalogPin#read() <em>Read</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Read</em>' operation.
	 * @see es.udima.cesarlaso.tfm.gpios.AnalogPin#read()
	 * @generated
	 */
	EOperation getAnalogPin__Read();

	/**
	 * Returns the meta object for the '{@link es.udima.cesarlaso.tfm.gpios.AnalogPin#write(int) <em>Write</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Write</em>' operation.
	 * @see es.udima.cesarlaso.tfm.gpios.AnalogPin#write(int)
	 * @generated
	 */
	EOperation getAnalogPin__Write__int();

	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.gpios.DigitalInputPin <em>Digital Input Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Digital Input Pin</em>'.
	 * @see es.udima.cesarlaso.tfm.gpios.DigitalInputPin
	 * @generated
	 */
	EClass getDigitalInputPin();

	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.gpios.DigitalOutputPin <em>Digital Output Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Digital Output Pin</em>'.
	 * @see es.udima.cesarlaso.tfm.gpios.DigitalOutputPin
	 * @generated
	 */
	EClass getDigitalOutputPin();

	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.gpios.AnalogInputPin <em>Analog Input Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analog Input Pin</em>'.
	 * @see es.udima.cesarlaso.tfm.gpios.AnalogInputPin
	 * @generated
	 */
	EClass getAnalogInputPin();

	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.gpios.AnalogOutputPin <em>Analog Output Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analog Output Pin</em>'.
	 * @see es.udima.cesarlaso.tfm.gpios.AnalogOutputPin
	 * @generated
	 */
	EClass getAnalogOutputPin();

	/**
	 * Returns the meta object for enum '{@link es.udima.cesarlaso.tfm.gpios.DacResolution <em>Dac Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Dac Resolution</em>'.
	 * @see es.udima.cesarlaso.tfm.gpios.DacResolution
	 * @generated
	 */
	EEnum getDacResolution();

	/**
	 * Returns the meta object for enum '{@link es.udima.cesarlaso.tfm.gpios.InterruptMode <em>Interrupt Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Interrupt Mode</em>'.
	 * @see es.udima.cesarlaso.tfm.gpios.InterruptMode
	 * @generated
	 */
	EEnum getInterruptMode();

	/**
	 * Returns the meta object for enum '{@link es.udima.cesarlaso.tfm.gpios.PinResistor <em>Pin Resistor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Pin Resistor</em>'.
	 * @see es.udima.cesarlaso.tfm.gpios.PinResistor
	 * @generated
	 */
	EEnum getPinResistor();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GpiosFactory getGpiosFactory();

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
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.gpios.Pin <em>Pin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.gpios.Pin
		 * @see es.udima.cesarlaso.tfm.gpios.impl.GpiosPackageImpl#getPin()
		 * @generated
		 */
		EClass PIN = eINSTANCE.getPin();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIN__NUMBER = eINSTANCE.getPin_Number();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIN__NAME = eINSTANCE.getPin_Name();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.gpios.impl.DigitalPinImpl <em>Digital Pin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.gpios.impl.DigitalPinImpl
		 * @see es.udima.cesarlaso.tfm.gpios.impl.GpiosPackageImpl#getDigitalPin()
		 * @generated
		 */
		EClass DIGITAL_PIN = eINSTANCE.getDigitalPin();

		/**
		 * The meta object literal for the '<em><b>Read</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DIGITAL_PIN___READ = eINSTANCE.getDigitalPin__Read();

		/**
		 * The meta object literal for the '<em><b>Write</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DIGITAL_PIN___WRITE__BOOLEAN = eINSTANCE.getDigitalPin__Write__boolean();

		/**
		 * The meta object literal for the '<em><b>Attach Interrupt</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DIGITAL_PIN___ATTACH_INTERRUPT__INTERRUPTMODE = eINSTANCE.getDigitalPin__AttachInterrupt__InterruptMode();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.gpios.impl.AnalogPinImpl <em>Analog Pin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.gpios.impl.AnalogPinImpl
		 * @see es.udima.cesarlaso.tfm.gpios.impl.GpiosPackageImpl#getAnalogPin()
		 * @generated
		 */
		EClass ANALOG_PIN = eINSTANCE.getAnalogPin();

		/**
		 * The meta object literal for the '<em><b>Resolution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALOG_PIN__RESOLUTION = eINSTANCE.getAnalogPin_Resolution();

		/**
		 * The meta object literal for the '<em><b>Read</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ANALOG_PIN___READ = eINSTANCE.getAnalogPin__Read();

		/**
		 * The meta object literal for the '<em><b>Write</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ANALOG_PIN___WRITE__INT = eINSTANCE.getAnalogPin__Write__int();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.gpios.impl.DigitalInputPinImpl <em>Digital Input Pin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.gpios.impl.DigitalInputPinImpl
		 * @see es.udima.cesarlaso.tfm.gpios.impl.GpiosPackageImpl#getDigitalInputPin()
		 * @generated
		 */
		EClass DIGITAL_INPUT_PIN = eINSTANCE.getDigitalInputPin();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.gpios.impl.DigitalOutputPinImpl <em>Digital Output Pin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.gpios.impl.DigitalOutputPinImpl
		 * @see es.udima.cesarlaso.tfm.gpios.impl.GpiosPackageImpl#getDigitalOutputPin()
		 * @generated
		 */
		EClass DIGITAL_OUTPUT_PIN = eINSTANCE.getDigitalOutputPin();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.gpios.impl.AnalogInputPinImpl <em>Analog Input Pin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.gpios.impl.AnalogInputPinImpl
		 * @see es.udima.cesarlaso.tfm.gpios.impl.GpiosPackageImpl#getAnalogInputPin()
		 * @generated
		 */
		EClass ANALOG_INPUT_PIN = eINSTANCE.getAnalogInputPin();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.gpios.impl.AnalogOutputPinImpl <em>Analog Output Pin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.gpios.impl.AnalogOutputPinImpl
		 * @see es.udima.cesarlaso.tfm.gpios.impl.GpiosPackageImpl#getAnalogOutputPin()
		 * @generated
		 */
		EClass ANALOG_OUTPUT_PIN = eINSTANCE.getAnalogOutputPin();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.gpios.DacResolution <em>Dac Resolution</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.gpios.DacResolution
		 * @see es.udima.cesarlaso.tfm.gpios.impl.GpiosPackageImpl#getDacResolution()
		 * @generated
		 */
		EEnum DAC_RESOLUTION = eINSTANCE.getDacResolution();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.gpios.InterruptMode <em>Interrupt Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.gpios.InterruptMode
		 * @see es.udima.cesarlaso.tfm.gpios.impl.GpiosPackageImpl#getInterruptMode()
		 * @generated
		 */
		EEnum INTERRUPT_MODE = eINSTANCE.getInterruptMode();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.gpios.PinResistor <em>Pin Resistor</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.gpios.PinResistor
		 * @see es.udima.cesarlaso.tfm.gpios.impl.GpiosPackageImpl#getPinResistor()
		 * @generated
		 */
		EEnum PIN_RESISTOR = eINSTANCE.getPinResistor();

	}

} //GpiosPackage
