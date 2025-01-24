/**
 */
package es.udima.cesarlaso.tfm.operatingsystemactuators.impl;

import es.udima.cesarlaso.tfm.operatingsystemactuators.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OperatingsystemactuatorsFactoryImpl extends EFactoryImpl implements OperatingsystemactuatorsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OperatingsystemactuatorsFactory init() {
		try {
			OperatingsystemactuatorsFactory theOperatingsystemactuatorsFactory = (OperatingsystemactuatorsFactory)EPackage.Registry.INSTANCE.getEFactory(OperatingsystemactuatorsPackage.eNS_URI);
			if (theOperatingsystemactuatorsFactory != null) {
				return theOperatingsystemactuatorsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OperatingsystemactuatorsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatingsystemactuatorsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case OperatingsystemactuatorsPackage.SYSTEM_COMMAND: return createSystemCommand();
			case OperatingsystemactuatorsPackage.PLAY_SOUND: return createPlaySound();
			case OperatingsystemactuatorsPackage.DOWNLOAD: return createDownload();
			case OperatingsystemactuatorsPackage.BACKGROUND_IMAGE: return createBackgroundImage();
			case OperatingsystemactuatorsPackage.DRAW_IMAGE: return createDrawImage();
			case OperatingsystemactuatorsPackage.PLAY_VIDEO: return createPlayVideo();
			case OperatingsystemactuatorsPackage.FILE_PATH: return createFilePath();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case OperatingsystemactuatorsPackage.RESIZE_TYPE:
				return createResizeTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case OperatingsystemactuatorsPackage.RESIZE_TYPE:
				return convertResizeTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SystemCommand createSystemCommand() {
		SystemCommandImpl systemCommand = new SystemCommandImpl();
		return systemCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlaySound createPlaySound() {
		PlaySoundImpl playSound = new PlaySoundImpl();
		return playSound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Download createDownload() {
		DownloadImpl download = new DownloadImpl();
		return download;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BackgroundImage createBackgroundImage() {
		BackgroundImageImpl backgroundImage = new BackgroundImageImpl();
		return backgroundImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DrawImage createDrawImage() {
		DrawImageImpl drawImage = new DrawImageImpl();
		return drawImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlayVideo createPlayVideo() {
		PlayVideoImpl playVideo = new PlayVideoImpl();
		return playVideo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FilePath createFilePath() {
		FilePathImpl filePath = new FilePathImpl();
		return filePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResizeType createResizeTypeFromString(EDataType eDataType, String initialValue) {
		ResizeType result = ResizeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResizeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperatingsystemactuatorsPackage getOperatingsystemactuatorsPackage() {
		return (OperatingsystemactuatorsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OperatingsystemactuatorsPackage getPackage() {
		return OperatingsystemactuatorsPackage.eINSTANCE;
	}

} //OperatingsystemactuatorsFactoryImpl
