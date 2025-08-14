/**
 */
package es.udima.cesarlaso.tfm.servers.impl;

import es.udima.cesarlaso.tfm.servers.JavaServer;
import es.udima.cesarlaso.tfm.servers.Server;
import es.udima.cesarlaso.tfm.servers.ServersFactory;
import es.udima.cesarlaso.tfm.servers.ServersPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ServersPackageImpl extends EPackageImpl implements ServersPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serverEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaServerEClass = null;

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
	 * @see es.udima.cesarlaso.tfm.servers.ServersPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ServersPackageImpl() {
		super(eNS_URI, ServersFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ServersPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ServersPackage init() {
		if (isInited) return (ServersPackage)EPackage.Registry.INSTANCE.getEPackage(ServersPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredServersPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ServersPackageImpl theServersPackage = registeredServersPackage instanceof ServersPackageImpl ? (ServersPackageImpl)registeredServersPackage : new ServersPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theServersPackage.createPackageContents();

		// Initialize created meta-data
		theServersPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theServersPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ServersPackage.eNS_URI, theServersPackage);
		return theServersPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServer() {
		return serverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJavaServer() {
		return javaServerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJavaServer_NetworkInterfaceAddress() {
		return (EAttribute)javaServerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJavaServer_NetworkInterfacePort() {
		return (EAttribute)javaServerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServersFactory getServersFactory() {
		return (ServersFactory)getEFactoryInstance();
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
		serverEClass = createEClass(SERVER);

		javaServerEClass = createEClass(JAVA_SERVER);
		createEAttribute(javaServerEClass, JAVA_SERVER__NETWORK_INTERFACE_ADDRESS);
		createEAttribute(javaServerEClass, JAVA_SERVER__NETWORK_INTERFACE_PORT);
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
		javaServerEClass.getESuperTypes().add(this.getServer());

		// Initialize classes, features, and operations; add parameters
		initEClass(serverEClass, Server.class, "Server", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(javaServerEClass, JavaServer.class, "JavaServer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJavaServer_NetworkInterfaceAddress(), ecorePackage.getEString(), "networkInterfaceAddress", null, 1, 1, JavaServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaServer_NetworkInterfacePort(), ecorePackage.getEInt(), "networkInterfacePort", null, 1, 1, JavaServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ServersPackageImpl
