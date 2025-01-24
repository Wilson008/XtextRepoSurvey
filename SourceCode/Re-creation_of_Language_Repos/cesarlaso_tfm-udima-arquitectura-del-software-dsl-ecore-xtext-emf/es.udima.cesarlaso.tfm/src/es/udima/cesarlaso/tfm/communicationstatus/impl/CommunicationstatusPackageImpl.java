/**
 */
package es.udima.cesarlaso.tfm.communicationstatus.impl;

import es.udima.cesarlaso.tfm.communications.CommunicationsPackage;

import es.udima.cesarlaso.tfm.communicationstatus.CommunicationstatusFactory;
import es.udima.cesarlaso.tfm.communicationstatus.CommunicationstatusPackage;
import es.udima.cesarlaso.tfm.communicationstatus.Ping;
import es.udima.cesarlaso.tfm.communicationstatus.Pong;
import es.udima.cesarlaso.tfm.communicationstatus.StatusService;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CommunicationstatusPackageImpl extends EPackageImpl implements CommunicationstatusPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statusServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pongEClass = null;

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
	 * @see es.udima.cesarlaso.tfm.communicationstatus.CommunicationstatusPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CommunicationstatusPackageImpl() {
		super(eNS_URI, CommunicationstatusFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CommunicationstatusPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CommunicationstatusPackage init() {
		if (isInited) return (CommunicationstatusPackage)EPackage.Registry.INSTANCE.getEPackage(CommunicationstatusPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCommunicationstatusPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CommunicationstatusPackageImpl theCommunicationstatusPackage = registeredCommunicationstatusPackage instanceof CommunicationstatusPackageImpl ? (CommunicationstatusPackageImpl)registeredCommunicationstatusPackage : new CommunicationstatusPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		CommunicationsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCommunicationstatusPackage.createPackageContents();

		// Initialize created meta-data
		theCommunicationstatusPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCommunicationstatusPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CommunicationstatusPackage.eNS_URI, theCommunicationstatusPackage);
		return theCommunicationstatusPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStatusService() {
		return statusServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPing() {
		return pingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPong() {
		return pongEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommunicationstatusFactory getCommunicationstatusFactory() {
		return (CommunicationstatusFactory)getEFactoryInstance();
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
		statusServiceEClass = createEClass(STATUS_SERVICE);

		pingEClass = createEClass(PING);

		pongEClass = createEClass(PONG);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		statusServiceEClass.getESuperTypes().add(theCommunicationsPackage.getService());
		pingEClass.getESuperTypes().add(this.getStatusService());
		pingEClass.getESuperTypes().add(theCommunicationsPackage.getServiceRequest());
		pongEClass.getESuperTypes().add(this.getStatusService());
		pongEClass.getESuperTypes().add(theCommunicationsPackage.getServiceResponse());

		// Initialize classes, features, and operations; add parameters
		initEClass(statusServiceEClass, StatusService.class, "StatusService", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pingEClass, Ping.class, "Ping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pongEClass, Pong.class, "Pong", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //CommunicationstatusPackageImpl
