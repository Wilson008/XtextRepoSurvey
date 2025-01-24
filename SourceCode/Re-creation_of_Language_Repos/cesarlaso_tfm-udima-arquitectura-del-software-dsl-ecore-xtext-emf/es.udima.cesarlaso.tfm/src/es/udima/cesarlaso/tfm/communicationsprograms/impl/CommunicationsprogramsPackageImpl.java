/**
 */
package es.udima.cesarlaso.tfm.communicationsprograms.impl;

import es.udima.cesarlaso.tfm.communications.CommunicationsPackage;

import es.udima.cesarlaso.tfm.communicationsprograms.CommunicationsprogramsFactory;
import es.udima.cesarlaso.tfm.communicationsprograms.CommunicationsprogramsPackage;
import es.udima.cesarlaso.tfm.communicationsprograms.ProgramActuatorService;
import es.udima.cesarlaso.tfm.communicationsprograms.ProgramEventEvent;
import es.udima.cesarlaso.tfm.communicationsprograms.ProgramService;
import es.udima.cesarlaso.tfm.communicationsprograms.RemoteActuator;
import es.udima.cesarlaso.tfm.communicationsprograms.RemoteActuatorIdentifier;
import es.udima.cesarlaso.tfm.communicationsprograms.RemoteEvent;
import es.udima.cesarlaso.tfm.communicationsprograms.RemoteEventIdentifier;
import es.udima.cesarlaso.tfm.communicationsprograms.RemoteIdentifier;

import es.udima.cesarlaso.tfm.events.EventsPackage;

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
public class CommunicationsprogramsPackageImpl extends EPackageImpl implements CommunicationsprogramsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programEventEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programActuatorServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass remoteEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass remoteActuatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass remoteIdentifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass remoteEventIdentifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass remoteActuatorIdentifierEClass = null;

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
	 * @see es.udima.cesarlaso.tfm.communicationsprograms.CommunicationsprogramsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CommunicationsprogramsPackageImpl() {
		super(eNS_URI, CommunicationsprogramsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CommunicationsprogramsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CommunicationsprogramsPackage init() {
		if (isInited) return (CommunicationsprogramsPackage)EPackage.Registry.INSTANCE.getEPackage(CommunicationsprogramsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCommunicationsprogramsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CommunicationsprogramsPackageImpl theCommunicationsprogramsPackage = registeredCommunicationsprogramsPackage instanceof CommunicationsprogramsPackageImpl ? (CommunicationsprogramsPackageImpl)registeredCommunicationsprogramsPackage : new CommunicationsprogramsPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		CommunicationsPackage.eINSTANCE.eClass();
		EventsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCommunicationsprogramsPackage.createPackageContents();

		// Initialize created meta-data
		theCommunicationsprogramsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCommunicationsprogramsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CommunicationsprogramsPackage.eNS_URI, theCommunicationsprogramsPackage);
		return theCommunicationsprogramsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProgramService() {
		return programServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProgramService_GeneratedTimestamp() {
		return (EAttribute)programServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProgramEventEvent() {
		return programEventEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProgramEventEvent_Event() {
		return (EReference)programEventEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProgramActuatorService() {
		return programActuatorServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProgramActuatorService_Actuator() {
		return (EReference)programActuatorServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRemoteEvent() {
		return remoteEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRemoteEvent_Identifier() {
		return (EReference)remoteEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRemoteActuator() {
		return remoteActuatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRemoteActuator_Identifier() {
		return (EReference)remoteActuatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRemoteIdentifier() {
		return remoteIdentifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRemoteIdentifier_Name() {
		return (EAttribute)remoteIdentifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRemoteEventIdentifier() {
		return remoteEventIdentifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRemoteActuatorIdentifier() {
		return remoteActuatorIdentifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommunicationsprogramsFactory getCommunicationsprogramsFactory() {
		return (CommunicationsprogramsFactory)getEFactoryInstance();
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
		programServiceEClass = createEClass(PROGRAM_SERVICE);
		createEAttribute(programServiceEClass, PROGRAM_SERVICE__GENERATED_TIMESTAMP);

		programEventEventEClass = createEClass(PROGRAM_EVENT_EVENT);
		createEReference(programEventEventEClass, PROGRAM_EVENT_EVENT__EVENT);

		programActuatorServiceEClass = createEClass(PROGRAM_ACTUATOR_SERVICE);
		createEReference(programActuatorServiceEClass, PROGRAM_ACTUATOR_SERVICE__ACTUATOR);

		remoteEventEClass = createEClass(REMOTE_EVENT);
		createEReference(remoteEventEClass, REMOTE_EVENT__IDENTIFIER);

		remoteActuatorEClass = createEClass(REMOTE_ACTUATOR);
		createEReference(remoteActuatorEClass, REMOTE_ACTUATOR__IDENTIFIER);

		remoteIdentifierEClass = createEClass(REMOTE_IDENTIFIER);
		createEAttribute(remoteIdentifierEClass, REMOTE_IDENTIFIER__NAME);

		remoteEventIdentifierEClass = createEClass(REMOTE_EVENT_IDENTIFIER);

		remoteActuatorIdentifierEClass = createEClass(REMOTE_ACTUATOR_IDENTIFIER);
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
		CommunicationsPackage theCommunicationsPackage = (CommunicationsPackage)EPackage.Registry.INSTANCE.getEPackage(CommunicationsPackage.eNS_URI);
		EventsPackage theEventsPackage = (EventsPackage)EPackage.Registry.INSTANCE.getEPackage(EventsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		programServiceEClass.getESuperTypes().add(theCommunicationsPackage.getService());
		programEventEventEClass.getESuperTypes().add(this.getProgramService());
		programActuatorServiceEClass.getESuperTypes().add(this.getProgramService());
		remoteEventEClass.getESuperTypes().add(theEventsPackage.getEvent());
		remoteActuatorEClass.getESuperTypes().add(theEventsPackage.getActuator());
		remoteEventIdentifierEClass.getESuperTypes().add(this.getRemoteIdentifier());
		remoteActuatorIdentifierEClass.getESuperTypes().add(this.getRemoteIdentifier());

		// Initialize classes, features, and operations; add parameters
		initEClass(programServiceEClass, ProgramService.class, "ProgramService", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProgramService_GeneratedTimestamp(), ecorePackage.getELong(), "generatedTimestamp", null, 1, 1, ProgramService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(programEventEventEClass, ProgramEventEvent.class, "ProgramEventEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProgramEventEvent_Event(), this.getRemoteEvent(), null, "event", null, 1, 1, ProgramEventEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(programActuatorServiceEClass, ProgramActuatorService.class, "ProgramActuatorService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProgramActuatorService_Actuator(), this.getRemoteActuator(), null, "actuator", null, 1, 1, ProgramActuatorService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(remoteEventEClass, RemoteEvent.class, "RemoteEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRemoteEvent_Identifier(), this.getRemoteEventIdentifier(), null, "identifier", null, 1, 1, RemoteEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(remoteActuatorEClass, RemoteActuator.class, "RemoteActuator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRemoteActuator_Identifier(), this.getRemoteActuatorIdentifier(), null, "identifier", null, 1, 1, RemoteActuator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(remoteIdentifierEClass, RemoteIdentifier.class, "RemoteIdentifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRemoteIdentifier_Name(), ecorePackage.getEString(), "name", null, 1, 1, RemoteIdentifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(remoteEventIdentifierEClass, RemoteEventIdentifier.class, "RemoteEventIdentifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(remoteActuatorIdentifierEClass, RemoteActuatorIdentifier.class, "RemoteActuatorIdentifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //CommunicationsprogramsPackageImpl
