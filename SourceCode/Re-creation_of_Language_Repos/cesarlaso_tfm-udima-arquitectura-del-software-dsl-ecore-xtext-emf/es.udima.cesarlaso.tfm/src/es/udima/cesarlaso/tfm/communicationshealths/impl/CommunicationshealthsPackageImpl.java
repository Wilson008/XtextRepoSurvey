/**
 */
package es.udima.cesarlaso.tfm.communicationshealths.impl;

import es.udima.cesarlaso.tfm.communications.CommunicationsPackage;

import es.udima.cesarlaso.tfm.communicationshealths.CommunicationshealthsFactory;
import es.udima.cesarlaso.tfm.communicationshealths.CommunicationshealthsPackage;
import es.udima.cesarlaso.tfm.communicationshealths.HealthMonitorNotification;
import es.udima.cesarlaso.tfm.communicationshealths.HealthMonitorRequest;
import es.udima.cesarlaso.tfm.communicationshealths.HealthMonitorUpdate;
import es.udima.cesarlaso.tfm.communicationshealths.HealthService;

import es.udima.cesarlaso.tfm.events.EventsPackage;

import es.udima.cesarlaso.tfm.healthmonitors.HealthmonitorsPackage;

import es.udima.cesarlaso.tfm.timers.TimersPackage;

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
public class CommunicationshealthsPackageImpl extends EPackageImpl implements CommunicationshealthsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass healthServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass healthMonitorRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass healthMonitorUpdateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass healthMonitorNotificationEClass = null;

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
	 * @see es.udima.cesarlaso.tfm.communicationshealths.CommunicationshealthsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CommunicationshealthsPackageImpl() {
		super(eNS_URI, CommunicationshealthsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CommunicationshealthsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CommunicationshealthsPackage init() {
		if (isInited) return (CommunicationshealthsPackage)EPackage.Registry.INSTANCE.getEPackage(CommunicationshealthsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCommunicationshealthsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CommunicationshealthsPackageImpl theCommunicationshealthsPackage = registeredCommunicationshealthsPackage instanceof CommunicationshealthsPackageImpl ? (CommunicationshealthsPackageImpl)registeredCommunicationshealthsPackage : new CommunicationshealthsPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		CommunicationsPackage.eINSTANCE.eClass();
		EventsPackage.eINSTANCE.eClass();
		HealthmonitorsPackage.eINSTANCE.eClass();
		TimersPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCommunicationshealthsPackage.createPackageContents();

		// Initialize created meta-data
		theCommunicationshealthsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCommunicationshealthsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CommunicationshealthsPackage.eNS_URI, theCommunicationshealthsPackage);
		return theCommunicationshealthsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHealthService() {
		return healthServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHealthMonitorRequest() {
		return healthMonitorRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHealthMonitorRequest_Monitor() {
		return (EReference)healthMonitorRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHealthMonitorUpdate() {
		return healthMonitorUpdateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHealthMonitorUpdate_Monitor() {
		return (EReference)healthMonitorUpdateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHealthMonitorNotification() {
		return healthMonitorNotificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHealthMonitorNotification_Monitor() {
		return (EReference)healthMonitorNotificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommunicationshealthsFactory getCommunicationshealthsFactory() {
		return (CommunicationshealthsFactory)getEFactoryInstance();
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
		healthServiceEClass = createEClass(HEALTH_SERVICE);

		healthMonitorRequestEClass = createEClass(HEALTH_MONITOR_REQUEST);
		createEReference(healthMonitorRequestEClass, HEALTH_MONITOR_REQUEST__MONITOR);

		healthMonitorUpdateEClass = createEClass(HEALTH_MONITOR_UPDATE);
		createEReference(healthMonitorUpdateEClass, HEALTH_MONITOR_UPDATE__MONITOR);

		healthMonitorNotificationEClass = createEClass(HEALTH_MONITOR_NOTIFICATION);
		createEReference(healthMonitorNotificationEClass, HEALTH_MONITOR_NOTIFICATION__MONITOR);
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
		HealthmonitorsPackage theHealthmonitorsPackage = (HealthmonitorsPackage)EPackage.Registry.INSTANCE.getEPackage(HealthmonitorsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		healthServiceEClass.getESuperTypes().add(theCommunicationsPackage.getService());
		healthMonitorRequestEClass.getESuperTypes().add(this.getHealthService());
		healthMonitorRequestEClass.getESuperTypes().add(theCommunicationsPackage.getServiceRequest());
		healthMonitorUpdateEClass.getESuperTypes().add(this.getHealthService());
		healthMonitorUpdateEClass.getESuperTypes().add(theCommunicationsPackage.getServiceResponse());
		healthMonitorNotificationEClass.getESuperTypes().add(this.getHealthService());
		healthMonitorNotificationEClass.getESuperTypes().add(theCommunicationsPackage.getServiceNotification());

		// Initialize classes, features, and operations; add parameters
		initEClass(healthServiceEClass, HealthService.class, "HealthService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(healthMonitorRequestEClass, HealthMonitorRequest.class, "HealthMonitorRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHealthMonitorRequest_Monitor(), theHealthmonitorsPackage.getHealthMonitor(), null, "monitor", null, 1, 1, HealthMonitorRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(healthMonitorUpdateEClass, HealthMonitorUpdate.class, "HealthMonitorUpdate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHealthMonitorUpdate_Monitor(), theHealthmonitorsPackage.getHealthMonitorData(), null, "monitor", null, 1, 1, HealthMonitorUpdate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(healthMonitorNotificationEClass, HealthMonitorNotification.class, "HealthMonitorNotification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHealthMonitorNotification_Monitor(), theHealthmonitorsPackage.getHealthMonitorData(), null, "monitor", null, 1, -1, HealthMonitorNotification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //CommunicationshealthsPackageImpl
