/**
 */
package es.udima.cesarlaso.tfm.gpiosactuators.impl;

import es.udima.cesarlaso.tfm.events.EventsPackage;

import es.udima.cesarlaso.tfm.gpios.GpiosPackage;

import es.udima.cesarlaso.tfm.gpiosactuators.AnalogActuator;
import es.udima.cesarlaso.tfm.gpiosactuators.BlinkOutput;
import es.udima.cesarlaso.tfm.gpiosactuators.BlinkTimerOutput;
import es.udima.cesarlaso.tfm.gpiosactuators.ButtonOutput;
import es.udima.cesarlaso.tfm.gpiosactuators.ChangeOutput;
import es.udima.cesarlaso.tfm.gpiosactuators.DigitalActuator;
import es.udima.cesarlaso.tfm.gpiosactuators.DigitalPinStatus;
import es.udima.cesarlaso.tfm.gpiosactuators.GpioActuator;
import es.udima.cesarlaso.tfm.gpiosactuators.GpioTimerActuator;
import es.udima.cesarlaso.tfm.gpiosactuators.GpiosactuatorsFactory;
import es.udima.cesarlaso.tfm.gpiosactuators.GpiosactuatorsPackage;
import es.udima.cesarlaso.tfm.gpiosactuators.PulseOutput;
import es.udima.cesarlaso.tfm.gpiosactuators.Pwm;
import es.udima.cesarlaso.tfm.gpiosactuators.TransformTo;

import es.udima.cesarlaso.tfm.timers.TimersPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GpiosactuatorsPackageImpl extends EPackageImpl implements GpiosactuatorsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gpioActuatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gpioTimerActuatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass digitalActuatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass analogActuatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeOutputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buttonOutputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pulseOutputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blinkOutputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blinkTimerOutputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pwmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformToEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum digitalPinStatusEEnum = null;

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
	 * @see es.udima.cesarlaso.tfm.gpiosactuators.GpiosactuatorsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GpiosactuatorsPackageImpl() {
		super(eNS_URI, GpiosactuatorsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link GpiosactuatorsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GpiosactuatorsPackage init() {
		if (isInited) return (GpiosactuatorsPackage)EPackage.Registry.INSTANCE.getEPackage(GpiosactuatorsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredGpiosactuatorsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		GpiosactuatorsPackageImpl theGpiosactuatorsPackage = registeredGpiosactuatorsPackage instanceof GpiosactuatorsPackageImpl ? (GpiosactuatorsPackageImpl)registeredGpiosactuatorsPackage : new GpiosactuatorsPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EventsPackage.eINSTANCE.eClass();
		GpiosPackage.eINSTANCE.eClass();
		TimersPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theGpiosactuatorsPackage.createPackageContents();

		// Initialize created meta-data
		theGpiosactuatorsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGpiosactuatorsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GpiosactuatorsPackage.eNS_URI, theGpiosactuatorsPackage);
		return theGpiosactuatorsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGpioActuator() {
		return gpioActuatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGpioTimerActuator() {
		return gpioTimerActuatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGpioTimerActuator_Duration() {
		return (EReference)gpioTimerActuatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDigitalActuator() {
		return digitalActuatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDigitalActuator_Pin() {
		return (EReference)digitalActuatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnalogActuator() {
		return analogActuatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnalogActuator_Pin() {
		return (EReference)analogActuatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getChangeOutput() {
		return changeOutputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChangeOutput_Status() {
		return (EAttribute)changeOutputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getButtonOutput() {
		return buttonOutputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPulseOutput() {
		return pulseOutputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPulseOutput_Count() {
		return (EAttribute)pulseOutputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPulseOutput_Width() {
		return (EAttribute)pulseOutputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPulseOutput_SpaceWidth() {
		return (EAttribute)pulseOutputEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBlinkOutput() {
		return blinkOutputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBlinkOutput_Interval() {
		return (EReference)blinkOutputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBlinkTimerOutput() {
		return blinkTimerOutputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPwm() {
		return pwmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPwm_Value() {
		return (EAttribute)pwmEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTransformTo() {
		return transformToEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransformTo_Value() {
		return (EAttribute)transformToEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDigitalPinStatus() {
		return digitalPinStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GpiosactuatorsFactory getGpiosactuatorsFactory() {
		return (GpiosactuatorsFactory)getEFactoryInstance();
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
		gpioActuatorEClass = createEClass(GPIO_ACTUATOR);

		gpioTimerActuatorEClass = createEClass(GPIO_TIMER_ACTUATOR);
		createEReference(gpioTimerActuatorEClass, GPIO_TIMER_ACTUATOR__DURATION);

		digitalActuatorEClass = createEClass(DIGITAL_ACTUATOR);
		createEReference(digitalActuatorEClass, DIGITAL_ACTUATOR__PIN);

		analogActuatorEClass = createEClass(ANALOG_ACTUATOR);
		createEReference(analogActuatorEClass, ANALOG_ACTUATOR__PIN);

		changeOutputEClass = createEClass(CHANGE_OUTPUT);
		createEAttribute(changeOutputEClass, CHANGE_OUTPUT__STATUS);

		buttonOutputEClass = createEClass(BUTTON_OUTPUT);

		pulseOutputEClass = createEClass(PULSE_OUTPUT);
		createEAttribute(pulseOutputEClass, PULSE_OUTPUT__COUNT);
		createEAttribute(pulseOutputEClass, PULSE_OUTPUT__WIDTH);
		createEAttribute(pulseOutputEClass, PULSE_OUTPUT__SPACE_WIDTH);

		blinkOutputEClass = createEClass(BLINK_OUTPUT);
		createEReference(blinkOutputEClass, BLINK_OUTPUT__INTERVAL);

		blinkTimerOutputEClass = createEClass(BLINK_TIMER_OUTPUT);

		pwmEClass = createEClass(PWM);
		createEAttribute(pwmEClass, PWM__VALUE);

		transformToEClass = createEClass(TRANSFORM_TO);
		createEAttribute(transformToEClass, TRANSFORM_TO__VALUE);

		// Create enums
		digitalPinStatusEEnum = createEEnum(DIGITAL_PIN_STATUS);
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

		// Obtain other dependent packages
		EventsPackage theEventsPackage = (EventsPackage)EPackage.Registry.INSTANCE.getEPackage(EventsPackage.eNS_URI);
		TimersPackage theTimersPackage = (TimersPackage)EPackage.Registry.INSTANCE.getEPackage(TimersPackage.eNS_URI);
		GpiosPackage theGpiosPackage = (GpiosPackage)EPackage.Registry.INSTANCE.getEPackage(GpiosPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		gpioActuatorEClass.getESuperTypes().add(theEventsPackage.getActuator());
		digitalActuatorEClass.getESuperTypes().add(this.getGpioActuator());
		analogActuatorEClass.getESuperTypes().add(this.getGpioActuator());
		changeOutputEClass.getESuperTypes().add(this.getDigitalActuator());
		buttonOutputEClass.getESuperTypes().add(this.getChangeOutput());
		buttonOutputEClass.getESuperTypes().add(this.getGpioTimerActuator());
		pulseOutputEClass.getESuperTypes().add(this.getDigitalActuator());
		blinkOutputEClass.getESuperTypes().add(this.getDigitalActuator());
		blinkTimerOutputEClass.getESuperTypes().add(this.getBlinkOutput());
		blinkTimerOutputEClass.getESuperTypes().add(this.getGpioTimerActuator());
		pwmEClass.getESuperTypes().add(this.getAnalogActuator());
		transformToEClass.getESuperTypes().add(this.getAnalogActuator());
		transformToEClass.getESuperTypes().add(this.getGpioTimerActuator());

		// Initialize classes, features, and operations; add parameters
		initEClass(gpioActuatorEClass, GpioActuator.class, "GpioActuator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(gpioTimerActuatorEClass, GpioTimerActuator.class, "GpioTimerActuator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGpioTimerActuator_Duration(), theTimersPackage.getTimeUnitValue(), null, "duration", null, 1, 1, GpioTimerActuator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(digitalActuatorEClass, DigitalActuator.class, "DigitalActuator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDigitalActuator_Pin(), theGpiosPackage.getDigitalOutputPin(), null, "pin", null, 1, 1, DigitalActuator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(analogActuatorEClass, AnalogActuator.class, "AnalogActuator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnalogActuator_Pin(), theGpiosPackage.getAnalogOutputPin(), null, "pin", null, 1, 1, AnalogActuator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(changeOutputEClass, ChangeOutput.class, "ChangeOutput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChangeOutput_Status(), this.getDigitalPinStatus(), "status", null, 1, 1, ChangeOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(buttonOutputEClass, ButtonOutput.class, "ButtonOutput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pulseOutputEClass, PulseOutput.class, "PulseOutput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPulseOutput_Count(), ecorePackage.getEInt(), "count", null, 1, 1, PulseOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPulseOutput_Width(), ecorePackage.getEInt(), "width", null, 1, 1, PulseOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPulseOutput_SpaceWidth(), ecorePackage.getEInt(), "spaceWidth", null, 1, 1, PulseOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(blinkOutputEClass, BlinkOutput.class, "BlinkOutput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBlinkOutput_Interval(), theTimersPackage.getTimeUnitValue(), null, "interval", null, 1, 1, BlinkOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(blinkTimerOutputEClass, BlinkTimerOutput.class, "BlinkTimerOutput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pwmEClass, Pwm.class, "Pwm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPwm_Value(), ecorePackage.getEInt(), "value", null, 1, 1, Pwm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transformToEClass, TransformTo.class, "TransformTo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransformTo_Value(), ecorePackage.getEInt(), "value", null, 1, 1, TransformTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(digitalPinStatusEEnum, DigitalPinStatus.class, "DigitalPinStatus");
		addEEnumLiteral(digitalPinStatusEEnum, DigitalPinStatus.LOW);
		addEEnumLiteral(digitalPinStatusEEnum, DigitalPinStatus.HIGH);

		// Create resource
		createResource(eNS_URI);
	}

} //GpiosactuatorsPackageImpl
