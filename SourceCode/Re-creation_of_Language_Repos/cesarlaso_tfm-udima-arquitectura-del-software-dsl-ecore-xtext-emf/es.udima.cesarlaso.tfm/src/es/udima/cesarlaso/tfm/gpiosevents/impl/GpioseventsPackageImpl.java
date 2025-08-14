/**
 */
package es.udima.cesarlaso.tfm.gpiosevents.impl;

import es.udima.cesarlaso.tfm.events.EventsPackage;

import es.udima.cesarlaso.tfm.gpios.GpiosPackage;

import es.udima.cesarlaso.tfm.gpiosevents.AnalogEvent;
import es.udima.cesarlaso.tfm.gpiosevents.AnalogRead;
import es.udima.cesarlaso.tfm.gpiosevents.AnalogReadPerformOnChange;
import es.udima.cesarlaso.tfm.gpiosevents.AnalogReadPerformOnHigh;
import es.udima.cesarlaso.tfm.gpiosevents.AnalogReadPerformOnLow;
import es.udima.cesarlaso.tfm.gpiosevents.ButtonInput;
import es.udima.cesarlaso.tfm.gpiosevents.ButtonInputAccumulator;
import es.udima.cesarlaso.tfm.gpiosevents.ButtonInputReleased;
import es.udima.cesarlaso.tfm.gpiosevents.DigitalEvent;
import es.udima.cesarlaso.tfm.gpiosevents.GpioEvent;
import es.udima.cesarlaso.tfm.gpiosevents.GpioseventsFactory;
import es.udima.cesarlaso.tfm.gpiosevents.GpioseventsPackage;
import es.udima.cesarlaso.tfm.gpiosevents.Interrupted;
import es.udima.cesarlaso.tfm.gpiosevents.PulseInput;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GpioseventsPackageImpl extends EPackageImpl implements GpioseventsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gpioEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass digitalEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass analogEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interruptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buttonInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buttonInputAccumulatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buttonInputReleasedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pulseInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass analogReadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass analogReadPerformOnChangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass analogReadPerformOnHighEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass analogReadPerformOnLowEClass = null;

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
	 * @see es.udima.cesarlaso.tfm.gpiosevents.GpioseventsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GpioseventsPackageImpl() {
		super(eNS_URI, GpioseventsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link GpioseventsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GpioseventsPackage init() {
		if (isInited) return (GpioseventsPackage)EPackage.Registry.INSTANCE.getEPackage(GpioseventsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredGpioseventsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		GpioseventsPackageImpl theGpioseventsPackage = registeredGpioseventsPackage instanceof GpioseventsPackageImpl ? (GpioseventsPackageImpl)registeredGpioseventsPackage : new GpioseventsPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EventsPackage.eINSTANCE.eClass();
		GpiosPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theGpioseventsPackage.createPackageContents();

		// Initialize created meta-data
		theGpioseventsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGpioseventsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GpioseventsPackage.eNS_URI, theGpioseventsPackage);
		return theGpioseventsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGpioEvent() {
		return gpioEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGpioEvent__Performed() {
		return gpioEventEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDigitalEvent() {
		return digitalEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDigitalEvent_Pin() {
		return (EReference)digitalEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnalogEvent() {
		return analogEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnalogEvent_Pin() {
		return (EReference)analogEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInterrupted() {
		return interruptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInterrupted_Mode() {
		return (EAttribute)interruptedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getButtonInput() {
		return buttonInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getButtonInput_Mode() {
		return (EAttribute)buttonInputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getButtonInput_MinDuration() {
		return (EAttribute)buttonInputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getButtonInputAccumulator() {
		return buttonInputAccumulatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getButtonInputAccumulator_Count() {
		return (EAttribute)buttonInputAccumulatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getButtonInputReleased() {
		return buttonInputReleasedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getButtonInputReleased_Mode() {
		return (EAttribute)buttonInputReleasedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPulseInput() {
		return pulseInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPulseInput_Mode() {
		return (EAttribute)pulseInputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPulseInput_Count() {
		return (EAttribute)pulseInputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPulseInput_Width() {
		return (EAttribute)pulseInputEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPulseInput_SpaceWidth() {
		return (EAttribute)pulseInputEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnalogRead() {
		return analogReadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnalogRead_PollIntervalLoops() {
		return (EAttribute)analogReadEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnalogReadPerformOnChange() {
		return analogReadPerformOnChangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnalogReadPerformOnChange_Value() {
		return (EAttribute)analogReadPerformOnChangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnalogReadPerformOnHigh() {
		return analogReadPerformOnHighEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnalogReadPerformOnLow() {
		return analogReadPerformOnLowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GpioseventsFactory getGpioseventsFactory() {
		return (GpioseventsFactory)getEFactoryInstance();
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
		gpioEventEClass = createEClass(GPIO_EVENT);
		createEOperation(gpioEventEClass, GPIO_EVENT___PERFORMED);

		digitalEventEClass = createEClass(DIGITAL_EVENT);
		createEReference(digitalEventEClass, DIGITAL_EVENT__PIN);

		analogEventEClass = createEClass(ANALOG_EVENT);
		createEReference(analogEventEClass, ANALOG_EVENT__PIN);

		interruptedEClass = createEClass(INTERRUPTED);
		createEAttribute(interruptedEClass, INTERRUPTED__MODE);

		buttonInputEClass = createEClass(BUTTON_INPUT);
		createEAttribute(buttonInputEClass, BUTTON_INPUT__MODE);
		createEAttribute(buttonInputEClass, BUTTON_INPUT__MIN_DURATION);

		buttonInputAccumulatorEClass = createEClass(BUTTON_INPUT_ACCUMULATOR);
		createEAttribute(buttonInputAccumulatorEClass, BUTTON_INPUT_ACCUMULATOR__COUNT);

		buttonInputReleasedEClass = createEClass(BUTTON_INPUT_RELEASED);
		createEAttribute(buttonInputReleasedEClass, BUTTON_INPUT_RELEASED__MODE);

		pulseInputEClass = createEClass(PULSE_INPUT);
		createEAttribute(pulseInputEClass, PULSE_INPUT__MODE);
		createEAttribute(pulseInputEClass, PULSE_INPUT__COUNT);
		createEAttribute(pulseInputEClass, PULSE_INPUT__WIDTH);
		createEAttribute(pulseInputEClass, PULSE_INPUT__SPACE_WIDTH);

		analogReadEClass = createEClass(ANALOG_READ);
		createEAttribute(analogReadEClass, ANALOG_READ__POLL_INTERVAL_LOOPS);

		analogReadPerformOnChangeEClass = createEClass(ANALOG_READ_PERFORM_ON_CHANGE);
		createEAttribute(analogReadPerformOnChangeEClass, ANALOG_READ_PERFORM_ON_CHANGE__VALUE);

		analogReadPerformOnHighEClass = createEClass(ANALOG_READ_PERFORM_ON_HIGH);

		analogReadPerformOnLowEClass = createEClass(ANALOG_READ_PERFORM_ON_LOW);
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
		GpiosPackage theGpiosPackage = (GpiosPackage)EPackage.Registry.INSTANCE.getEPackage(GpiosPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		gpioEventEClass.getESuperTypes().add(theEventsPackage.getEvent());
		digitalEventEClass.getESuperTypes().add(this.getGpioEvent());
		analogEventEClass.getESuperTypes().add(this.getGpioEvent());
		interruptedEClass.getESuperTypes().add(this.getDigitalEvent());
		buttonInputEClass.getESuperTypes().add(this.getDigitalEvent());
		buttonInputAccumulatorEClass.getESuperTypes().add(this.getButtonInput());
		buttonInputReleasedEClass.getESuperTypes().add(this.getDigitalEvent());
		pulseInputEClass.getESuperTypes().add(this.getDigitalEvent());
		analogReadEClass.getESuperTypes().add(this.getAnalogEvent());
		analogReadPerformOnChangeEClass.getESuperTypes().add(this.getAnalogRead());
		analogReadPerformOnHighEClass.getESuperTypes().add(this.getAnalogReadPerformOnChange());
		analogReadPerformOnLowEClass.getESuperTypes().add(this.getAnalogReadPerformOnChange());

		// Initialize classes, features, and operations; add parameters
		initEClass(gpioEventEClass, GpioEvent.class, "GpioEvent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getGpioEvent__Performed(), null, "performed", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(digitalEventEClass, DigitalEvent.class, "DigitalEvent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDigitalEvent_Pin(), theGpiosPackage.getDigitalInputPin(), null, "pin", null, 1, 1, DigitalEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(analogEventEClass, AnalogEvent.class, "AnalogEvent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnalogEvent_Pin(), theGpiosPackage.getAnalogInputPin(), null, "pin", null, 1, 1, AnalogEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interruptedEClass, Interrupted.class, "Interrupted", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInterrupted_Mode(), theGpiosPackage.getInterruptMode(), "mode", null, 1, 1, Interrupted.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(buttonInputEClass, ButtonInput.class, "ButtonInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getButtonInput_Mode(), theGpiosPackage.getPinResistor(), "mode", null, 1, 1, ButtonInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getButtonInput_MinDuration(), ecorePackage.getEInt(), "minDuration", null, 1, 1, ButtonInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(buttonInputAccumulatorEClass, ButtonInputAccumulator.class, "ButtonInputAccumulator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getButtonInputAccumulator_Count(), ecorePackage.getEInt(), "count", null, 1, 1, ButtonInputAccumulator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(buttonInputReleasedEClass, ButtonInputReleased.class, "ButtonInputReleased", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getButtonInputReleased_Mode(), theGpiosPackage.getPinResistor(), "mode", null, 1, 1, ButtonInputReleased.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pulseInputEClass, PulseInput.class, "PulseInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPulseInput_Mode(), theGpiosPackage.getPinResistor(), "mode", null, 1, 1, PulseInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPulseInput_Count(), ecorePackage.getEInt(), "count", null, 1, 1, PulseInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPulseInput_Width(), ecorePackage.getEInt(), "width", null, 1, 1, PulseInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPulseInput_SpaceWidth(), ecorePackage.getEInt(), "spaceWidth", null, 1, 1, PulseInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(analogReadEClass, AnalogRead.class, "AnalogRead", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnalogRead_PollIntervalLoops(), ecorePackage.getEInt(), "pollIntervalLoops", null, 1, 1, AnalogRead.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(analogReadPerformOnChangeEClass, AnalogReadPerformOnChange.class, "AnalogReadPerformOnChange", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnalogReadPerformOnChange_Value(), ecorePackage.getEInt(), "value", null, 1, 1, AnalogReadPerformOnChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(analogReadPerformOnHighEClass, AnalogReadPerformOnHigh.class, "AnalogReadPerformOnHigh", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(analogReadPerformOnLowEClass, AnalogReadPerformOnLow.class, "AnalogReadPerformOnLow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //GpioseventsPackageImpl
