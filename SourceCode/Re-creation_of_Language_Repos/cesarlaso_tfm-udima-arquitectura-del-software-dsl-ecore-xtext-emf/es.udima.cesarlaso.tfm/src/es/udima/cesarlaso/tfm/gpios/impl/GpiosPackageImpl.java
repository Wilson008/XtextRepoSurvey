/**
 */
package es.udima.cesarlaso.tfm.gpios.impl;

import es.udima.cesarlaso.tfm.gpios.AnalogInputPin;
import es.udima.cesarlaso.tfm.gpios.AnalogOutputPin;
import es.udima.cesarlaso.tfm.gpios.AnalogPin;
import es.udima.cesarlaso.tfm.gpios.DacResolution;
import es.udima.cesarlaso.tfm.gpios.DigitalInputPin;
import es.udima.cesarlaso.tfm.gpios.DigitalOutputPin;
import es.udima.cesarlaso.tfm.gpios.DigitalPin;
import es.udima.cesarlaso.tfm.gpios.GpiosFactory;
import es.udima.cesarlaso.tfm.gpios.GpiosPackage;
import es.udima.cesarlaso.tfm.gpios.InterruptMode;
import es.udima.cesarlaso.tfm.gpios.Pin;
import es.udima.cesarlaso.tfm.gpios.PinResistor;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GpiosPackageImpl extends EPackageImpl implements GpiosPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass digitalPinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass analogPinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass digitalInputPinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass digitalOutputPinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass analogInputPinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass analogOutputPinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dacResolutionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum interruptModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum pinResistorEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see es.udima.cesarlaso.tfm.gpios.GpiosPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GpiosPackageImpl() {
		super(eNS_URI, GpiosFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link GpiosPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GpiosPackage init() {
		if (isInited) return (GpiosPackage)EPackage.Registry.INSTANCE.getEPackage(GpiosPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredGpiosPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		GpiosPackageImpl theGpiosPackage = registeredGpiosPackage instanceof GpiosPackageImpl ? (GpiosPackageImpl)registeredGpiosPackage : new GpiosPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theGpiosPackage.createPackageContents();

		// Initialize created meta-data
		theGpiosPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGpiosPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GpiosPackage.eNS_URI, theGpiosPackage);
		return theGpiosPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPin() {
		return pinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPin_Number() {
		return (EAttribute)pinEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPin_Name() {
		return (EAttribute)pinEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDigitalPin() {
		return digitalPinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDigitalPin__Read() {
		return digitalPinEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDigitalPin__Write__boolean() {
		return digitalPinEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDigitalPin__AttachInterrupt__InterruptMode() {
		return digitalPinEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnalogPin() {
		return analogPinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnalogPin_Resolution() {
		return (EAttribute)analogPinEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnalogPin__Read() {
		return analogPinEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnalogPin__Write__int() {
		return analogPinEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDigitalInputPin() {
		return digitalInputPinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDigitalOutputPin() {
		return digitalOutputPinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnalogInputPin() {
		return analogInputPinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnalogOutputPin() {
		return analogOutputPinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDacResolution() {
		return dacResolutionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getInterruptMode() {
		return interruptModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPinResistor() {
		return pinResistorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GpiosFactory getGpiosFactory() {
		return (GpiosFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		pinEClass = createEClass(PIN);
		createEAttribute(pinEClass, PIN__NUMBER);
		createEAttribute(pinEClass, PIN__NAME);

		digitalPinEClass = createEClass(DIGITAL_PIN);
		createEOperation(digitalPinEClass, DIGITAL_PIN___READ);
		createEOperation(digitalPinEClass, DIGITAL_PIN___WRITE__BOOLEAN);
		createEOperation(digitalPinEClass, DIGITAL_PIN___ATTACH_INTERRUPT__INTERRUPTMODE);

		analogPinEClass = createEClass(ANALOG_PIN);
		createEAttribute(analogPinEClass, ANALOG_PIN__RESOLUTION);
		createEOperation(analogPinEClass, ANALOG_PIN___READ);
		createEOperation(analogPinEClass, ANALOG_PIN___WRITE__INT);

		digitalInputPinEClass = createEClass(DIGITAL_INPUT_PIN);

		digitalOutputPinEClass = createEClass(DIGITAL_OUTPUT_PIN);

		analogInputPinEClass = createEClass(ANALOG_INPUT_PIN);

		analogOutputPinEClass = createEClass(ANALOG_OUTPUT_PIN);

		// Create enums
		dacResolutionEEnum = createEEnum(DAC_RESOLUTION);
		interruptModeEEnum = createEEnum(INTERRUPT_MODE);
		pinResistorEEnum = createEEnum(PIN_RESISTOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		digitalPinEClass.getESuperTypes().add(this.getPin());
		analogPinEClass.getESuperTypes().add(this.getPin());
		digitalInputPinEClass.getESuperTypes().add(this.getDigitalPin());
		digitalOutputPinEClass.getESuperTypes().add(this.getDigitalPin());
		analogInputPinEClass.getESuperTypes().add(this.getAnalogPin());
		analogOutputPinEClass.getESuperTypes().add(this.getAnalogPin());

		// Initialize classes, features, and operations; add parameters
		initEClass(pinEClass, Pin.class, "Pin", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPin_Number(), ecorePackage.getEInt(), "number", null, 1, 1, Pin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPin_Name(), ecorePackage.getEString(), "name", null, 1, 1, Pin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(digitalPinEClass, DigitalPin.class, "DigitalPin", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getDigitalPin__Read(), ecorePackage.getEBoolean(), "read", 1, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getDigitalPin__Write__boolean(), null, "write", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDigitalPin__AttachInterrupt__InterruptMode(), null, "attachInterrupt", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getInterruptMode(), "mode", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(analogPinEClass, AnalogPin.class, "AnalogPin", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnalogPin_Resolution(), this.getDacResolution(), "resolution", "Bits8", 1, 1, AnalogPin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getAnalogPin__Read(), ecorePackage.getEInt(), "read", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAnalogPin__Write__int(), null, "write", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(digitalInputPinEClass, DigitalInputPin.class, "DigitalInputPin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(digitalOutputPinEClass, DigitalOutputPin.class, "DigitalOutputPin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(analogInputPinEClass, AnalogInputPin.class, "AnalogInputPin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(analogOutputPinEClass, AnalogOutputPin.class, "AnalogOutputPin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(dacResolutionEEnum, DacResolution.class, "DacResolution");
		addEEnumLiteral(dacResolutionEEnum, DacResolution.BITS8);
		addEEnumLiteral(dacResolutionEEnum, DacResolution.BITS12);
		addEEnumLiteral(dacResolutionEEnum, DacResolution.BITS16);
		addEEnumLiteral(dacResolutionEEnum, DacResolution.BITS24);

		initEEnum(interruptModeEEnum, InterruptMode.class, "InterruptMode");
		addEEnumLiteral(interruptModeEEnum, InterruptMode.RISING);
		addEEnumLiteral(interruptModeEEnum, InterruptMode.FALLING);
		addEEnumLiteral(interruptModeEEnum, InterruptMode.CHANGES);
		addEEnumLiteral(interruptModeEEnum, InterruptMode.LOW);
		addEEnumLiteral(interruptModeEEnum, InterruptMode.HIGH);

		initEEnum(pinResistorEEnum, PinResistor.class, "PinResistor");
		addEEnumLiteral(pinResistorEEnum, PinResistor.PULL_UP);
		addEEnumLiteral(pinResistorEEnum, PinResistor.PULL_DOWN);

		// Create resource
		createResource(eNS_URI);
	}

} //GpiosPackageImpl
