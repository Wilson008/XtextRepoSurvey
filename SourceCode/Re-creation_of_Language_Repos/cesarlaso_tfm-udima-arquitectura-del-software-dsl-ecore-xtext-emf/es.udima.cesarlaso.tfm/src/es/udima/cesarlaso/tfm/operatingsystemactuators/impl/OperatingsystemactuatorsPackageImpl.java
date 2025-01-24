/**
 */
package es.udima.cesarlaso.tfm.operatingsystemactuators.impl;

import es.udima.cesarlaso.tfm.events.EventsPackage;

import es.udima.cesarlaso.tfm.operatingsystemactuators.BackgroundImage;
import es.udima.cesarlaso.tfm.operatingsystemactuators.Download;
import es.udima.cesarlaso.tfm.operatingsystemactuators.DrawImage;
import es.udima.cesarlaso.tfm.operatingsystemactuators.FilePath;
import es.udima.cesarlaso.tfm.operatingsystemactuators.OperatingSystemActuator;
import es.udima.cesarlaso.tfm.operatingsystemactuators.OperatingsystemactuatorsFactory;
import es.udima.cesarlaso.tfm.operatingsystemactuators.OperatingsystemactuatorsPackage;
import es.udima.cesarlaso.tfm.operatingsystemactuators.PlaySound;
import es.udima.cesarlaso.tfm.operatingsystemactuators.PlayVideo;
import es.udima.cesarlaso.tfm.operatingsystemactuators.ResizeType;
import es.udima.cesarlaso.tfm.operatingsystemactuators.Screen;
import es.udima.cesarlaso.tfm.operatingsystemactuators.SystemCommand;

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
public class OperatingsystemactuatorsPackageImpl extends EPackageImpl implements OperatingsystemactuatorsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operatingSystemActuatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemCommandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass playSoundEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass downloadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass backgroundImageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass screenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass drawImageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass playVideoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filePathEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum resizeTypeEEnum = null;

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
	 * @see es.udima.cesarlaso.tfm.operatingsystemactuators.OperatingsystemactuatorsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OperatingsystemactuatorsPackageImpl() {
		super(eNS_URI, OperatingsystemactuatorsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link OperatingsystemactuatorsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OperatingsystemactuatorsPackage init() {
		if (isInited) return (OperatingsystemactuatorsPackage)EPackage.Registry.INSTANCE.getEPackage(OperatingsystemactuatorsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredOperatingsystemactuatorsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		OperatingsystemactuatorsPackageImpl theOperatingsystemactuatorsPackage = registeredOperatingsystemactuatorsPackage instanceof OperatingsystemactuatorsPackageImpl ? (OperatingsystemactuatorsPackageImpl)registeredOperatingsystemactuatorsPackage : new OperatingsystemactuatorsPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EventsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theOperatingsystemactuatorsPackage.createPackageContents();

		// Initialize created meta-data
		theOperatingsystemactuatorsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOperatingsystemactuatorsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OperatingsystemactuatorsPackage.eNS_URI, theOperatingsystemactuatorsPackage);
		return theOperatingsystemactuatorsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOperatingSystemActuator() {
		return operatingSystemActuatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSystemCommand() {
		return systemCommandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemCommand_FilePath() {
		return (EReference)systemCommandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlaySound() {
		return playSoundEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlaySound_Volume() {
		return (EAttribute)playSoundEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlaySound_FilePath() {
		return (EReference)playSoundEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDownload() {
		return downloadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDownload_Url() {
		return (EAttribute)downloadEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDownload_FilePath() {
		return (EReference)downloadEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBackgroundImage() {
		return backgroundImageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBackgroundImage_FilePath() {
		return (EReference)backgroundImageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBackgroundImage_ResizeType() {
		return (EAttribute)backgroundImageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getScreen() {
		return screenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getScreen_FilePath() {
		return (EReference)screenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScreen_PositionX() {
		return (EAttribute)screenEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScreen_PositionY() {
		return (EAttribute)screenEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScreen_PositionZ() {
		return (EAttribute)screenEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScreen_Color() {
		return (EAttribute)screenEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScreen_ResizeType() {
		return (EAttribute)screenEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDrawImage() {
		return drawImageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlayVideo() {
		return playVideoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlayVideo_Repeat() {
		return (EAttribute)playVideoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFilePath() {
		return filePathEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFilePath_Name() {
		return (EAttribute)filePathEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFilePath_FilePath() {
		return (EAttribute)filePathEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getResizeType() {
		return resizeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperatingsystemactuatorsFactory getOperatingsystemactuatorsFactory() {
		return (OperatingsystemactuatorsFactory)getEFactoryInstance();
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
		operatingSystemActuatorEClass = createEClass(OPERATING_SYSTEM_ACTUATOR);

		systemCommandEClass = createEClass(SYSTEM_COMMAND);
		createEReference(systemCommandEClass, SYSTEM_COMMAND__FILE_PATH);

		playSoundEClass = createEClass(PLAY_SOUND);
		createEAttribute(playSoundEClass, PLAY_SOUND__VOLUME);
		createEReference(playSoundEClass, PLAY_SOUND__FILE_PATH);

		downloadEClass = createEClass(DOWNLOAD);
		createEAttribute(downloadEClass, DOWNLOAD__URL);
		createEReference(downloadEClass, DOWNLOAD__FILE_PATH);

		backgroundImageEClass = createEClass(BACKGROUND_IMAGE);
		createEReference(backgroundImageEClass, BACKGROUND_IMAGE__FILE_PATH);
		createEAttribute(backgroundImageEClass, BACKGROUND_IMAGE__RESIZE_TYPE);

		screenEClass = createEClass(SCREEN);
		createEReference(screenEClass, SCREEN__FILE_PATH);
		createEAttribute(screenEClass, SCREEN__POSITION_X);
		createEAttribute(screenEClass, SCREEN__POSITION_Y);
		createEAttribute(screenEClass, SCREEN__POSITION_Z);
		createEAttribute(screenEClass, SCREEN__COLOR);
		createEAttribute(screenEClass, SCREEN__RESIZE_TYPE);

		drawImageEClass = createEClass(DRAW_IMAGE);

		playVideoEClass = createEClass(PLAY_VIDEO);
		createEAttribute(playVideoEClass, PLAY_VIDEO__REPEAT);

		filePathEClass = createEClass(FILE_PATH);
		createEAttribute(filePathEClass, FILE_PATH__NAME);
		createEAttribute(filePathEClass, FILE_PATH__FILE_PATH);

		// Create enums
		resizeTypeEEnum = createEEnum(RESIZE_TYPE);
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
		operatingSystemActuatorEClass.getESuperTypes().add(theEventsPackage.getActuator());
		systemCommandEClass.getESuperTypes().add(this.getOperatingSystemActuator());
		playSoundEClass.getESuperTypes().add(this.getOperatingSystemActuator());
		downloadEClass.getESuperTypes().add(this.getOperatingSystemActuator());
		backgroundImageEClass.getESuperTypes().add(this.getOperatingSystemActuator());
		screenEClass.getESuperTypes().add(this.getOperatingSystemActuator());
		drawImageEClass.getESuperTypes().add(this.getScreen());
		playVideoEClass.getESuperTypes().add(this.getScreen());

		// Initialize classes, features, and operations; add parameters
		initEClass(operatingSystemActuatorEClass, OperatingSystemActuator.class, "OperatingSystemActuator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(systemCommandEClass, SystemCommand.class, "SystemCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemCommand_FilePath(), this.getFilePath(), null, "filePath", null, 1, 1, SystemCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(playSoundEClass, PlaySound.class, "PlaySound", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlaySound_Volume(), ecorePackage.getEInt(), "volume", null, 0, 1, PlaySound.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlaySound_FilePath(), this.getFilePath(), null, "filePath", null, 1, 1, PlaySound.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(downloadEClass, Download.class, "Download", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDownload_Url(), ecorePackage.getEString(), "url", null, 1, 1, Download.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDownload_FilePath(), this.getFilePath(), null, "filePath", null, 1, 1, Download.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(backgroundImageEClass, BackgroundImage.class, "BackgroundImage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBackgroundImage_FilePath(), this.getFilePath(), null, "filePath", null, 1, 1, BackgroundImage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBackgroundImage_ResizeType(), this.getResizeType(), "resizeType", null, 1, 1, BackgroundImage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(screenEClass, Screen.class, "Screen", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScreen_FilePath(), this.getFilePath(), null, "filePath", null, 1, 1, Screen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScreen_PositionX(), ecorePackage.getEInt(), "positionX", null, 1, 1, Screen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScreen_PositionY(), ecorePackage.getEInt(), "positionY", null, 1, 1, Screen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScreen_PositionZ(), ecorePackage.getEInt(), "positionZ", null, 1, 1, Screen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScreen_Color(), ecorePackage.getELong(), "color", null, 1, 1, Screen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScreen_ResizeType(), this.getResizeType(), "resizeType", null, 1, 1, Screen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(drawImageEClass, DrawImage.class, "DrawImage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(playVideoEClass, PlayVideo.class, "PlayVideo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlayVideo_Repeat(), ecorePackage.getEBoolean(), "repeat", null, 1, 1, PlayVideo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(filePathEClass, FilePath.class, "FilePath", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFilePath_Name(), ecorePackage.getEString(), "name", null, 1, 1, FilePath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFilePath_FilePath(), ecorePackage.getEString(), "filePath", null, 1, 1, FilePath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(resizeTypeEEnum, ResizeType.class, "ResizeType");
		addEEnumLiteral(resizeTypeEEnum, ResizeType.NONE);
		addEEnumLiteral(resizeTypeEEnum, ResizeType.AUTO);
		addEEnumLiteral(resizeTypeEEnum, ResizeType.FILL);

		// Create resource
		createResource(eNS_URI);
	}

} //OperatingsystemactuatorsPackageImpl
