/**
 */
package es.udima.cesarlaso.tfm.timers.impl;

import es.udima.cesarlaso.tfm.events.EventsPackage;

import es.udima.cesarlaso.tfm.timers.Clock;
import es.udima.cesarlaso.tfm.timers.Cron;
import es.udima.cesarlaso.tfm.timers.Now;
import es.udima.cesarlaso.tfm.timers.Repeated;
import es.udima.cesarlaso.tfm.timers.Time;
import es.udima.cesarlaso.tfm.timers.TimeUnitType;
import es.udima.cesarlaso.tfm.timers.TimeUnitValue;
import es.udima.cesarlaso.tfm.timers.Timer;
import es.udima.cesarlaso.tfm.timers.TimerEvent;
import es.udima.cesarlaso.tfm.timers.TimersFactory;
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
public class TimersPackageImpl extends EPackageImpl implements TimersPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timerEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repeatedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cronEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeUnitValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum timeUnitTypeEEnum = null;

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
	 * @see es.udima.cesarlaso.tfm.timers.TimersPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TimersPackageImpl() {
		super(eNS_URI, TimersFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TimersPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TimersPackage init() {
		if (isInited) return (TimersPackage)EPackage.Registry.INSTANCE.getEPackage(TimersPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTimersPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TimersPackageImpl theTimersPackage = registeredTimersPackage instanceof TimersPackageImpl ? (TimersPackageImpl)registeredTimersPackage : new TimersPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EventsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theTimersPackage.createPackageContents();

		// Initialize created meta-data
		theTimersPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTimersPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TimersPackage.eNS_URI, theTimersPackage);
		return theTimersPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTimer() {
		return timerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTimerEvent() {
		return timerEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTimerEvent_Timer() {
		return (EReference)timerEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNow() {
		return nowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRepeated() {
		return repeatedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRepeated_Value() {
		return (EReference)repeatedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClock() {
		return clockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClock_Value() {
		return (EReference)clockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCron() {
		return cronEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCron_Value() {
		return (EAttribute)cronEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTime() {
		return timeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTime_Hour() {
		return (EAttribute)timeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTime_Minute() {
		return (EAttribute)timeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTime_Second() {
		return (EAttribute)timeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTimeUnitValue() {
		return timeUnitValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimeUnitValue_Value() {
		return (EAttribute)timeUnitValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimeUnitValue_Unit() {
		return (EAttribute)timeUnitValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTimeUnitType() {
		return timeUnitTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimersFactory getTimersFactory() {
		return (TimersFactory)getEFactoryInstance();
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
		timerEClass = createEClass(TIMER);

		timerEventEClass = createEClass(TIMER_EVENT);
		createEReference(timerEventEClass, TIMER_EVENT__TIMER);

		nowEClass = createEClass(NOW);

		repeatedEClass = createEClass(REPEATED);
		createEReference(repeatedEClass, REPEATED__VALUE);

		clockEClass = createEClass(CLOCK);
		createEReference(clockEClass, CLOCK__VALUE);

		cronEClass = createEClass(CRON);
		createEAttribute(cronEClass, CRON__VALUE);

		timeEClass = createEClass(TIME);
		createEAttribute(timeEClass, TIME__HOUR);
		createEAttribute(timeEClass, TIME__MINUTE);
		createEAttribute(timeEClass, TIME__SECOND);

		timeUnitValueEClass = createEClass(TIME_UNIT_VALUE);
		createEAttribute(timeUnitValueEClass, TIME_UNIT_VALUE__VALUE);
		createEAttribute(timeUnitValueEClass, TIME_UNIT_VALUE__UNIT);

		// Create enums
		timeUnitTypeEEnum = createEEnum(TIME_UNIT_TYPE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		timerEventEClass.getESuperTypes().add(theEventsPackage.getEvent());
		nowEClass.getESuperTypes().add(this.getTimer());
		repeatedEClass.getESuperTypes().add(this.getTimer());
		clockEClass.getESuperTypes().add(this.getTimer());
		cronEClass.getESuperTypes().add(this.getTimer());

		// Initialize classes, features, and operations; add parameters
		initEClass(timerEClass, Timer.class, "Timer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(timerEventEClass, TimerEvent.class, "TimerEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimerEvent_Timer(), this.getTimer(), null, "timer", null, 1, 1, TimerEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nowEClass, Now.class, "Now", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(repeatedEClass, Repeated.class, "Repeated", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRepeated_Value(), this.getTimeUnitValue(), null, "value", null, 1, 1, Repeated.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(clockEClass, Clock.class, "Clock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClock_Value(), this.getTime(), null, "value", null, 1, 1, Clock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cronEClass, Cron.class, "Cron", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCron_Value(), ecorePackage.getEString(), "value", null, 1, 1, Cron.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeEClass, Time.class, "Time", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTime_Hour(), ecorePackage.getEInt(), "hour", null, 1, 1, Time.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTime_Minute(), ecorePackage.getEInt(), "minute", null, 1, 1, Time.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTime_Second(), ecorePackage.getEInt(), "second", null, 1, 1, Time.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeUnitValueEClass, TimeUnitValue.class, "TimeUnitValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeUnitValue_Value(), ecorePackage.getEInt(), "value", null, 1, 1, TimeUnitValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeUnitValue_Unit(), this.getTimeUnitType(), "unit", null, 1, 1, TimeUnitValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(timeUnitTypeEEnum, TimeUnitType.class, "TimeUnitType");
		addEEnumLiteral(timeUnitTypeEEnum, TimeUnitType.MILLISECOND);
		addEEnumLiteral(timeUnitTypeEEnum, TimeUnitType.SECOND);
		addEEnumLiteral(timeUnitTypeEEnum, TimeUnitType.MINUTE);
		addEEnumLiteral(timeUnitTypeEEnum, TimeUnitType.HOUR);

		// Create resource
		createResource(eNS_URI);
	}

} //TimersPackageImpl
