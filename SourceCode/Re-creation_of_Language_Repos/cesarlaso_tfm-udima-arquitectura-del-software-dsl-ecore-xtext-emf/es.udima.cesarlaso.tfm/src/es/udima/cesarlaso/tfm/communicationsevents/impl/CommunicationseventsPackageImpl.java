/**
 */
package es.udima.cesarlaso.tfm.communicationsevents.impl;

import es.udima.cesarlaso.tfm.communicationsevents.CommunicationEvent;
import es.udima.cesarlaso.tfm.communicationsevents.CommunicationseventsFactory;
import es.udima.cesarlaso.tfm.communicationsevents.CommunicationseventsPackage;
import es.udima.cesarlaso.tfm.communicationsevents.NetworkConnected;
import es.udima.cesarlaso.tfm.communicationsevents.NetworkDisconnected;
import es.udima.cesarlaso.tfm.communicationsevents.NetworkEvent;
import es.udima.cesarlaso.tfm.communicationsevents.ServerConnected;
import es.udima.cesarlaso.tfm.communicationsevents.ServerDisconnected;
import es.udima.cesarlaso.tfm.communicationsevents.ServerEvent;

import es.udima.cesarlaso.tfm.events.EventsPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CommunicationseventsPackageImpl extends EPackageImpl implements CommunicationseventsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicationEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkConnectedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkDisconnectedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serverEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serverConnectedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serverDisconnectedEClass = null;

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
	 * @see es.udima.cesarlaso.tfm.communicationsevents.CommunicationseventsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CommunicationseventsPackageImpl() {
		super(eNS_URI, CommunicationseventsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CommunicationseventsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CommunicationseventsPackage init() {
		if (isInited) return (CommunicationseventsPackage)EPackage.Registry.INSTANCE.getEPackage(CommunicationseventsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCommunicationseventsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CommunicationseventsPackageImpl theCommunicationseventsPackage = registeredCommunicationseventsPackage instanceof CommunicationseventsPackageImpl ? (CommunicationseventsPackageImpl)registeredCommunicationseventsPackage : new CommunicationseventsPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EventsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCommunicationseventsPackage.createPackageContents();

		// Initialize created meta-data
		theCommunicationseventsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCommunicationseventsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CommunicationseventsPackage.eNS_URI, theCommunicationseventsPackage);
		return theCommunicationseventsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCommunicationEvent() {
		return communicationEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNetworkEvent() {
		return networkEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNetworkConnected() {
		return networkConnectedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNetworkDisconnected() {
		return networkDisconnectedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServerEvent() {
		return serverEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServerConnected() {
		return serverConnectedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServerDisconnected() {
		return serverDisconnectedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommunicationseventsFactory getCommunicationseventsFactory() {
		return (CommunicationseventsFactory)getEFactoryInstance();
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
		communicationEventEClass = createEClass(COMMUNICATION_EVENT);

		networkEventEClass = createEClass(NETWORK_EVENT);

		networkConnectedEClass = createEClass(NETWORK_CONNECTED);

		networkDisconnectedEClass = createEClass(NETWORK_DISCONNECTED);

		serverEventEClass = createEClass(SERVER_EVENT);

		serverConnectedEClass = createEClass(SERVER_CONNECTED);

		serverDisconnectedEClass = createEClass(SERVER_DISCONNECTED);
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
		communicationEventEClass.getESuperTypes().add(theEventsPackage.getEvent());
		networkEventEClass.getESuperTypes().add(this.getCommunicationEvent());
		networkConnectedEClass.getESuperTypes().add(this.getNetworkEvent());
		networkDisconnectedEClass.getESuperTypes().add(this.getNetworkEvent());
		serverEventEClass.getESuperTypes().add(this.getCommunicationEvent());
		serverConnectedEClass.getESuperTypes().add(this.getServerEvent());
		serverDisconnectedEClass.getESuperTypes().add(this.getServerEvent());

		// Initialize classes, features, and operations; add parameters
		initEClass(communicationEventEClass, CommunicationEvent.class, "CommunicationEvent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(networkEventEClass, NetworkEvent.class, "NetworkEvent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(networkConnectedEClass, NetworkConnected.class, "NetworkConnected", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(networkDisconnectedEClass, NetworkDisconnected.class, "NetworkDisconnected", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(serverEventEClass, ServerEvent.class, "ServerEvent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(serverConnectedEClass, ServerConnected.class, "ServerConnected", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(serverDisconnectedEClass, ServerDisconnected.class, "ServerDisconnected", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //CommunicationseventsPackageImpl
