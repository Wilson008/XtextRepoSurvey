/**
 */
package es.udima.cesarlaso.tfm.programs.impl;

import es.udima.cesarlaso.tfm.communications.CommunicationsPackage;

import es.udima.cesarlaso.tfm.communicationsprograms.CommunicationsprogramsPackage;

import es.udima.cesarlaso.tfm.events.EventsPackage;

import es.udima.cesarlaso.tfm.gpios.GpiosPackage;

import es.udima.cesarlaso.tfm.operatingsystemactuators.OperatingsystemactuatorsPackage;

import es.udima.cesarlaso.tfm.programs.ChangeStateActuator;
import es.udima.cesarlaso.tfm.programs.Program;
import es.udima.cesarlaso.tfm.programs.ProgramState;
import es.udima.cesarlaso.tfm.programs.ProgramsFactory;
import es.udima.cesarlaso.tfm.programs.ProgramsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProgramsPackageImpl extends EPackageImpl implements ProgramsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeStateActuatorEClass = null;

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
	 * @see es.udima.cesarlaso.tfm.programs.ProgramsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ProgramsPackageImpl() {
		super(eNS_URI, ProgramsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ProgramsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ProgramsPackage init() {
		if (isInited) return (ProgramsPackage)EPackage.Registry.INSTANCE.getEPackage(ProgramsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredProgramsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ProgramsPackageImpl theProgramsPackage = registeredProgramsPackage instanceof ProgramsPackageImpl ? (ProgramsPackageImpl)registeredProgramsPackage : new ProgramsPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		CommunicationsPackage.eINSTANCE.eClass();
		CommunicationsprogramsPackage.eINSTANCE.eClass();
		EventsPackage.eINSTANCE.eClass();
		GpiosPackage.eINSTANCE.eClass();
		OperatingsystemactuatorsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theProgramsPackage.createPackageContents();

		// Initialize created meta-data
		theProgramsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theProgramsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ProgramsPackage.eNS_URI, theProgramsPackage);
		return theProgramsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProgram() {
		return programEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProgram_State() {
		return (EReference)programEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProgram_States() {
		return (EReference)programEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProgram_GpioAliases() {
		return (EReference)programEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProgram_RemoteIdentifiers() {
		return (EReference)programEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProgram_Files() {
		return (EReference)programEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProgramState() {
		return programStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProgramState_Name() {
		return (EAttribute)programStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProgramState_Events() {
		return (EReference)programStateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getChangeStateActuator() {
		return changeStateActuatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getChangeStateActuator_State() {
		return (EReference)changeStateActuatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProgramsFactory getProgramsFactory() {
		return (ProgramsFactory)getEFactoryInstance();
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
		programEClass = createEClass(PROGRAM);
		createEReference(programEClass, PROGRAM__STATE);
		createEReference(programEClass, PROGRAM__STATES);
		createEReference(programEClass, PROGRAM__GPIO_ALIASES);
		createEReference(programEClass, PROGRAM__REMOTE_IDENTIFIERS);
		createEReference(programEClass, PROGRAM__FILES);

		programStateEClass = createEClass(PROGRAM_STATE);
		createEAttribute(programStateEClass, PROGRAM_STATE__NAME);
		createEReference(programStateEClass, PROGRAM_STATE__EVENTS);

		changeStateActuatorEClass = createEClass(CHANGE_STATE_ACTUATOR);
		createEReference(changeStateActuatorEClass, CHANGE_STATE_ACTUATOR__STATE);
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
		GpiosPackage theGpiosPackage = (GpiosPackage)EPackage.Registry.INSTANCE.getEPackage(GpiosPackage.eNS_URI);
		CommunicationsprogramsPackage theCommunicationsprogramsPackage = (CommunicationsprogramsPackage)EPackage.Registry.INSTANCE.getEPackage(CommunicationsprogramsPackage.eNS_URI);
		OperatingsystemactuatorsPackage theOperatingsystemactuatorsPackage = (OperatingsystemactuatorsPackage)EPackage.Registry.INSTANCE.getEPackage(OperatingsystemactuatorsPackage.eNS_URI);
		EventsPackage theEventsPackage = (EventsPackage)EPackage.Registry.INSTANCE.getEPackage(EventsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		changeStateActuatorEClass.getESuperTypes().add(theEventsPackage.getActuator());

		// Initialize classes, features, and operations; add parameters
		initEClass(programEClass, Program.class, "Program", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProgram_State(), this.getProgramState(), null, "state", null, 1, 1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProgram_States(), this.getProgramState(), null, "states", null, 1, -1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProgram_GpioAliases(), theGpiosPackage.getPin(), null, "gpioAliases", null, 0, -1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProgram_RemoteIdentifiers(), theCommunicationsprogramsPackage.getRemoteIdentifier(), null, "remoteIdentifiers", null, 0, -1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProgram_Files(), theOperatingsystemactuatorsPackage.getFilePath(), null, "files", null, 0, -1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(programStateEClass, ProgramState.class, "ProgramState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProgramState_Name(), ecorePackage.getEString(), "name", null, 1, 1, ProgramState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProgramState_Events(), theEventsPackage.getEvent(), null, "events", null, 1, -1, ProgramState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(changeStateActuatorEClass, ChangeStateActuator.class, "ChangeStateActuator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChangeStateActuator_State(), this.getProgramState(), null, "state", null, 1, 1, ChangeStateActuator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ProgramsPackageImpl
