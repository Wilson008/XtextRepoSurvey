/**
 */
package es.udima.cesarlaso.tfm.iotproyects.impl;

import es.udima.cesarlaso.tfm.communications.CommunicationsPackage;

import es.udima.cesarlaso.tfm.communicationsprograms.CommunicationsprogramsPackage;

import es.udima.cesarlaso.tfm.deploymentdevices.DeploymentdevicesPackage;

import es.udima.cesarlaso.tfm.events.EventsPackage;

import es.udima.cesarlaso.tfm.gpios.GpiosPackage;

import es.udima.cesarlaso.tfm.healthmonitors.HealthmonitorsPackage;

import es.udima.cesarlaso.tfm.iotproyects.IotProyect;
import es.udima.cesarlaso.tfm.iotproyects.IotproyectsFactory;
import es.udima.cesarlaso.tfm.iotproyects.IotproyectsPackage;

import es.udima.cesarlaso.tfm.operatingsystemactuators.OperatingsystemactuatorsPackage;

import es.udima.cesarlaso.tfm.programs.ProgramsPackage;

import es.udima.cesarlaso.tfm.servers.ServersPackage;

import es.udima.cesarlaso.tfm.timers.TimersPackage;

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
public class IotproyectsPackageImpl extends EPackageImpl implements IotproyectsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iotProyectEClass = null;

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
	 * @see es.udima.cesarlaso.tfm.iotproyects.IotproyectsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IotproyectsPackageImpl() {
		super(eNS_URI, IotproyectsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link IotproyectsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static IotproyectsPackage init() {
		if (isInited) return (IotproyectsPackage)EPackage.Registry.INSTANCE.getEPackage(IotproyectsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredIotproyectsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		IotproyectsPackageImpl theIotproyectsPackage = registeredIotproyectsPackage instanceof IotproyectsPackageImpl ? (IotproyectsPackageImpl)registeredIotproyectsPackage : new IotproyectsPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		CommunicationsPackage.eINSTANCE.eClass();
		CommunicationsprogramsPackage.eINSTANCE.eClass();
		DeploymentdevicesPackage.eINSTANCE.eClass();
		EventsPackage.eINSTANCE.eClass();
		GpiosPackage.eINSTANCE.eClass();
		HealthmonitorsPackage.eINSTANCE.eClass();
		OperatingsystemactuatorsPackage.eINSTANCE.eClass();
		ProgramsPackage.eINSTANCE.eClass();
		ServersPackage.eINSTANCE.eClass();
		TimersPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theIotproyectsPackage.createPackageContents();

		// Initialize created meta-data
		theIotproyectsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theIotproyectsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(IotproyectsPackage.eNS_URI, theIotproyectsPackage);
		return theIotproyectsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIotProyect() {
		return iotProyectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIotProyect_Name() {
		return (EAttribute)iotProyectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIotProyect_ProductCode() {
		return (EAttribute)iotProyectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIotProyect_Version() {
		return (EAttribute)iotProyectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIotProyect_Program() {
		return (EReference)iotProyectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIotProyect_DeploymentDevice() {
		return (EReference)iotProyectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIotProyect_Server() {
		return (EReference)iotProyectEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIotProyect_HealthMonitors() {
		return (EReference)iotProyectEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IotproyectsFactory getIotproyectsFactory() {
		return (IotproyectsFactory)getEFactoryInstance();
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
		iotProyectEClass = createEClass(IOT_PROYECT);
		createEAttribute(iotProyectEClass, IOT_PROYECT__NAME);
		createEAttribute(iotProyectEClass, IOT_PROYECT__PRODUCT_CODE);
		createEAttribute(iotProyectEClass, IOT_PROYECT__VERSION);
		createEReference(iotProyectEClass, IOT_PROYECT__PROGRAM);
		createEReference(iotProyectEClass, IOT_PROYECT__DEPLOYMENT_DEVICE);
		createEReference(iotProyectEClass, IOT_PROYECT__SERVER);
		createEReference(iotProyectEClass, IOT_PROYECT__HEALTH_MONITORS);
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
		ProgramsPackage theProgramsPackage = (ProgramsPackage)EPackage.Registry.INSTANCE.getEPackage(ProgramsPackage.eNS_URI);
		DeploymentdevicesPackage theDeploymentdevicesPackage = (DeploymentdevicesPackage)EPackage.Registry.INSTANCE.getEPackage(DeploymentdevicesPackage.eNS_URI);
		ServersPackage theServersPackage = (ServersPackage)EPackage.Registry.INSTANCE.getEPackage(ServersPackage.eNS_URI);
		HealthmonitorsPackage theHealthmonitorsPackage = (HealthmonitorsPackage)EPackage.Registry.INSTANCE.getEPackage(HealthmonitorsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(iotProyectEClass, IotProyect.class, "IotProyect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIotProyect_Name(), ecorePackage.getEString(), "name", null, 1, 1, IotProyect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIotProyect_ProductCode(), ecorePackage.getEInt(), "productCode", null, 1, 1, IotProyect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIotProyect_Version(), ecorePackage.getEInt(), "version", null, 1, 1, IotProyect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIotProyect_Program(), theProgramsPackage.getProgram(), null, "program", null, 1, 1, IotProyect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIotProyect_DeploymentDevice(), theDeploymentdevicesPackage.getDevice(), null, "deploymentDevice", null, 1, -1, IotProyect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIotProyect_Server(), theServersPackage.getServer(), null, "server", null, 0, -1, IotProyect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIotProyect_HealthMonitors(), theHealthmonitorsPackage.getHealthMonitorItem(), null, "healthMonitors", null, 0, -1, IotProyect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //IotproyectsPackageImpl
