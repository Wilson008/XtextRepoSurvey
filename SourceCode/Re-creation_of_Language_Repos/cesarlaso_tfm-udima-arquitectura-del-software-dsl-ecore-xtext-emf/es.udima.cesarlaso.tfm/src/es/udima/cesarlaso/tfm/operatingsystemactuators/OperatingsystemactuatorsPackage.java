/**
 */
package es.udima.cesarlaso.tfm.operatingsystemactuators;

import es.udima.cesarlaso.tfm.events.EventsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see es.udima.cesarlaso.tfm.operatingsystemactuators.OperatingsystemactuatorsFactory
 * @model kind="package"
 * @generated
 */
public interface OperatingsystemactuatorsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "operatingsystemactuators";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://tfm.cesarlaso.udima.es/operatingsystemactuators";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "es.udima.cesarlaso.tfm.operatingsystemactuators";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OperatingsystemactuatorsPackage eINSTANCE = es.udima.cesarlaso.tfm.operatingsystemactuators.impl.OperatingsystemactuatorsPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.operatingsystemactuators.impl.OperatingSystemActuatorImpl <em>Operating System Actuator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.operatingsystemactuators.impl.OperatingSystemActuatorImpl
	 * @see es.udima.cesarlaso.tfm.operatingsystemactuators.impl.OperatingsystemactuatorsPackageImpl#getOperatingSystemActuator()
	 * @generated
	 */
	int OPERATING_SYSTEM_ACTUATOR = 0;

	/**
	 * The number of structural features of the '<em>Operating System Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_SYSTEM_ACTUATOR_FEATURE_COUNT = EventsPackage.ACTUATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Operating System Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_SYSTEM_ACTUATOR_OPERATION_COUNT = EventsPackage.ACTUATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.operatingsystemactuators.impl.SystemCommandImpl <em>System Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.operatingsystemactuators.impl.SystemCommandImpl
	 * @see es.udima.cesarlaso.tfm.operatingsystemactuators.impl.OperatingsystemactuatorsPackageImpl#getSystemCommand()
	 * @generated
	 */
	int SYSTEM_COMMAND = 1;

	/**
	 * The feature id for the '<em><b>File Path</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMMAND__FILE_PATH = OPERATING_SYSTEM_ACTUATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>System Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMMAND_FEATURE_COUNT = OPERATING_SYSTEM_ACTUATOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>System Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMMAND_OPERATION_COUNT = OPERATING_SYSTEM_ACTUATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.operatingsystemactuators.impl.PlaySoundImpl <em>Play Sound</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.operatingsystemactuators.impl.PlaySoundImpl
	 * @see es.udima.cesarlaso.tfm.operatingsystemactuators.impl.OperatingsystemactuatorsPackageImpl#getPlaySound()
	 * @generated
	 */
	int PLAY_SOUND = 2;

	/**
	 * The feature id for the '<em><b>Volume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAY_SOUND__VOLUME = OPERATING_SYSTEM_ACTUATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>File Path</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAY_SOUND__FILE_PATH = OPERATING_SYSTEM_ACTUATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Play Sound</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAY_SOUND_FEATURE_COUNT = OPERATING_SYSTEM_ACTUATOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Play Sound</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAY_SOUND_OPERATION_COUNT = OPERATING_SYSTEM_ACTUATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.operatingsystemactuators.impl.DownloadImpl <em>Download</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.operatingsystemactuators.impl.DownloadImpl
	 * @see es.udima.cesarlaso.tfm.operatingsystemactuators.impl.OperatingsystemactuatorsPackageImpl#getDownload()
	 * @generated
	 */
	int DOWNLOAD = 3;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOWNLOAD__URL = OPERATING_SYSTEM_ACTUATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>File Path</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOWNLOAD__FILE_PATH = OPERATING_SYSTEM_ACTUATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Download</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOWNLOAD_FEATURE_COUNT = OPERATING_SYSTEM_ACTUATOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Download</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOWNLOAD_OPERATION_COUNT = OPERATING_SYSTEM_ACTUATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.operatingsystemactuators.impl.BackgroundImageImpl <em>Background Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.operatingsystemactuators.impl.BackgroundImageImpl
	 * @see es.udima.cesarlaso.tfm.operatingsystemactuators.impl.OperatingsystemactuatorsPackageImpl#getBackgroundImage()
	 * @generated
	 */
	int BACKGROUND_IMAGE = 4;

	/**
	 * The feature id for the '<em><b>File Path</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND_IMAGE__FILE_PATH = OPERATING_SYSTEM_ACTUATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resize Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND_IMAGE__RESIZE_TYPE = OPERATING_SYSTEM_ACTUATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Background Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND_IMAGE_FEATURE_COUNT = OPERATING_SYSTEM_ACTUATOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Background Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND_IMAGE_OPERATION_COUNT = OPERATING_SYSTEM_ACTUATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.operatingsystemactuators.impl.ScreenImpl <em>Screen</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.operatingsystemactuators.impl.ScreenImpl
	 * @see es.udima.cesarlaso.tfm.operatingsystemactuators.impl.OperatingsystemactuatorsPackageImpl#getScreen()
	 * @generated
	 */
	int SCREEN = 5;

	/**
	 * The feature id for the '<em><b>File Path</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN__FILE_PATH = OPERATING_SYSTEM_ACTUATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN__POSITION_X = OPERATING_SYSTEM_ACTUATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN__POSITION_Y = OPERATING_SYSTEM_ACTUATOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Position Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN__POSITION_Z = OPERATING_SYSTEM_ACTUATOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN__COLOR = OPERATING_SYSTEM_ACTUATOR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Resize Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN__RESIZE_TYPE = OPERATING_SYSTEM_ACTUATOR_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Screen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_FEATURE_COUNT = OPERATING_SYSTEM_ACTUATOR_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Screen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OPERATION_COUNT = OPERATING_SYSTEM_ACTUATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.operatingsystemactuators.impl.DrawImageImpl <em>Draw Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.operatingsystemactuators.impl.DrawImageImpl
	 * @see es.udima.cesarlaso.tfm.operatingsystemactuators.impl.OperatingsystemactuatorsPackageImpl#getDrawImage()
	 * @generated
	 */
	int DRAW_IMAGE = 6;

	/**
	 * The feature id for the '<em><b>File Path</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAW_IMAGE__FILE_PATH = SCREEN__FILE_PATH;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAW_IMAGE__POSITION_X = SCREEN__POSITION_X;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAW_IMAGE__POSITION_Y = SCREEN__POSITION_Y;

	/**
	 * The feature id for the '<em><b>Position Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAW_IMAGE__POSITION_Z = SCREEN__POSITION_Z;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAW_IMAGE__COLOR = SCREEN__COLOR;

	/**
	 * The feature id for the '<em><b>Resize Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAW_IMAGE__RESIZE_TYPE = SCREEN__RESIZE_TYPE;

	/**
	 * The number of structural features of the '<em>Draw Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAW_IMAGE_FEATURE_COUNT = SCREEN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Draw Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAW_IMAGE_OPERATION_COUNT = SCREEN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.operatingsystemactuators.impl.PlayVideoImpl <em>Play Video</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.operatingsystemactuators.impl.PlayVideoImpl
	 * @see es.udima.cesarlaso.tfm.operatingsystemactuators.impl.OperatingsystemactuatorsPackageImpl#getPlayVideo()
	 * @generated
	 */
	int PLAY_VIDEO = 7;

	/**
	 * The feature id for the '<em><b>File Path</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAY_VIDEO__FILE_PATH = SCREEN__FILE_PATH;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAY_VIDEO__POSITION_X = SCREEN__POSITION_X;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAY_VIDEO__POSITION_Y = SCREEN__POSITION_Y;

	/**
	 * The feature id for the '<em><b>Position Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAY_VIDEO__POSITION_Z = SCREEN__POSITION_Z;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAY_VIDEO__COLOR = SCREEN__COLOR;

	/**
	 * The feature id for the '<em><b>Resize Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAY_VIDEO__RESIZE_TYPE = SCREEN__RESIZE_TYPE;

	/**
	 * The feature id for the '<em><b>Repeat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAY_VIDEO__REPEAT = SCREEN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Play Video</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAY_VIDEO_FEATURE_COUNT = SCREEN_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Play Video</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAY_VIDEO_OPERATION_COUNT = SCREEN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.operatingsystemactuators.impl.FilePathImpl <em>File Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.operatingsystemactuators.impl.FilePathImpl
	 * @see es.udima.cesarlaso.tfm.operatingsystemactuators.impl.OperatingsystemactuatorsPackageImpl#getFilePath()
	 * @generated
	 */
	int FILE_PATH = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_PATH__NAME = 0;

	/**
	 * The feature id for the '<em><b>File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_PATH__FILE_PATH = 1;

	/**
	 * The number of structural features of the '<em>File Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_PATH_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>File Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_PATH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.operatingsystemactuators.ResizeType <em>Resize Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.operatingsystemactuators.ResizeType
	 * @see es.udima.cesarlaso.tfm.operatingsystemactuators.impl.OperatingsystemactuatorsPackageImpl#getResizeType()
	 * @generated
	 */
	int RESIZE_TYPE = 9;


	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.operatingsystemactuators.OperatingSystemActuator <em>Operating System Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operating System Actuator</em>'.
	 * @see es.udima.cesarlaso.tfm.operatingsystemactuators.OperatingSystemActuator
	 * @generated
	 */
	EClass getOperatingSystemActuator();

	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.operatingsystemactuators.SystemCommand <em>System Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Command</em>'.
	 * @see es.udima.cesarlaso.tfm.operatingsystemactuators.SystemCommand
	 * @generated
	 */
	EClass getSystemCommand();

	/**
	 * Returns the meta object for the reference '{@link es.udima.cesarlaso.tfm.operatingsystemactuators.SystemCommand#getFilePath <em>File Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>File Path</em>'.
	 * @see es.udima.cesarlaso.tfm.operatingsystemactuators.SystemCommand#getFilePath()
	 * @see #getSystemCommand()
	 * @generated
	 */
	EReference getSystemCommand_FilePath();

	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.operatingsystemactuators.PlaySound <em>Play Sound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Play Sound</em>'.
	 * @see es.udima.cesarlaso.tfm.operatingsystemactuators.PlaySound
	 * @generated
	 */
	EClass getPlaySound();

	/**
	 * Returns the meta object for the attribute '{@link es.udima.cesarlaso.tfm.operatingsystemactuators.PlaySound#getVolume <em>Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volume</em>'.
	 * @see es.udima.cesarlaso.tfm.operatingsystemactuators.PlaySound#getVolume()
	 * @see #getPlaySound()
	 * @generated
	 */
	EAttribute getPlaySound_Volume();

	/**
	 * Returns the meta object for the reference '{@link es.udima.cesarlaso.tfm.operatingsystemactuators.PlaySound#getFilePath <em>File Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>File Path</em>'.
	 * @see es.udima.cesarlaso.tfm.operatingsystemactuators.PlaySound#getFilePath()
	 * @see #getPlaySound()
	 * @generated
	 */
	EReference getPlaySound_FilePath();

	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.operatingsystemactuators.Download <em>Download</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Download</em>'.
	 * @see es.udima.cesarlaso.tfm.operatingsystemactuators.Download
	 * @generated
	 */
	EClass getDownload();

	/**
	 * Returns the meta object for the attribute '{@link es.udima.cesarlaso.tfm.operatingsystemactuators.Download#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see es.udima.cesarlaso.tfm.operatingsystemactuators.Download#getUrl()
	 * @see #getDownload()
	 * @generated
	 */
	EAttribute getDownload_Url();

	/**
	 * Returns the meta object for the reference '{@link es.udima.cesarlaso.tfm.operatingsystemactuators.Download#getFilePath <em>File Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>File Path</em>'.
	 * @see es.udima.cesarlaso.tfm.operatingsystemactuators.Download#getFilePath()
	 * @see #getDownload()
	 * @generated
	 */
	EReference getDownload_FilePath();

	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.operatingsystemactuators.BackgroundImage <em>Background Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Background Image</em>'.
	 * @see es.udima.cesarlaso.tfm.operatingsystemactuators.BackgroundImage
	 * @generated
	 */
	EClass getBackgroundImage();

	/**
	 * Returns the meta object for the reference '{@link es.udima.cesarlaso.tfm.operatingsystemactuators.BackgroundImage#getFilePath <em>File Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>File Path</em>'.
	 * @see es.udima.cesarlaso.tfm.operatingsystemactuators.BackgroundImage#getFilePath()
	 * @see #getBackgroundImage()
	 * @generated
	 */
	EReference getBackgroundImage_FilePath();

	/**
	 * Returns the meta object for the attribute '{@link es.udima.cesarlaso.tfm.operatingsystemactuators.BackgroundImage#getResizeType <em>Resize Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resize Type</em>'.
	 * @see es.udima.cesarlaso.tfm.operatingsystemactuators.BackgroundImage#getResizeType()
	 * @see #getBackgroundImage()
	 * @generated
	 */
	EAttribute getBackgroundImage_ResizeType();

	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.operatingsystemactuators.Screen <em>Screen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Screen</em>'.
	 * @see es.udima.cesarlaso.tfm.operatingsystemactuators.Screen
	 * @generated
	 */
	EClass getScreen();

	/**
	 * Returns the meta object for the reference '{@link es.udima.cesarlaso.tfm.operatingsystemactuators.Screen#getFilePath <em>File Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>File Path</em>'.
	 * @see es.udima.cesarlaso.tfm.operatingsystemactuators.Screen#getFilePath()
	 * @see #getScreen()
	 * @generated
	 */
	EReference getScreen_FilePath();

	/**
	 * Returns the meta object for the attribute '{@link es.udima.cesarlaso.tfm.operatingsystemactuators.Screen#getPositionX <em>Position X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position X</em>'.
	 * @see es.udima.cesarlaso.tfm.operatingsystemactuators.Screen#getPositionX()
	 * @see #getScreen()
	 * @generated
	 */
	EAttribute getScreen_PositionX();

	/**
	 * Returns the meta object for the attribute '{@link es.udima.cesarlaso.tfm.operatingsystemactuators.Screen#getPositionY <em>Position Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position Y</em>'.
	 * @see es.udima.cesarlaso.tfm.operatingsystemactuators.Screen#getPositionY()
	 * @see #getScreen()
	 * @generated
	 */
	EAttribute getScreen_PositionY();

	/**
	 * Returns the meta object for the attribute '{@link es.udima.cesarlaso.tfm.operatingsystemactuators.Screen#getPositionZ <em>Position Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position Z</em>'.
	 * @see es.udima.cesarlaso.tfm.operatingsystemactuators.Screen#getPositionZ()
	 * @see #getScreen()
	 * @generated
	 */
	EAttribute getScreen_PositionZ();

	/**
	 * Returns the meta object for the attribute '{@link es.udima.cesarlaso.tfm.operatingsystemactuators.Screen#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see es.udima.cesarlaso.tfm.operatingsystemactuators.Screen#getColor()
	 * @see #getScreen()
	 * @generated
	 */
	EAttribute getScreen_Color();

	/**
	 * Returns the meta object for the attribute '{@link es.udima.cesarlaso.tfm.operatingsystemactuators.Screen#getResizeType <em>Resize Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resize Type</em>'.
	 * @see es.udima.cesarlaso.tfm.operatingsystemactuators.Screen#getResizeType()
	 * @see #getScreen()
	 * @generated
	 */
	EAttribute getScreen_ResizeType();

	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.operatingsystemactuators.DrawImage <em>Draw Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Draw Image</em>'.
	 * @see es.udima.cesarlaso.tfm.operatingsystemactuators.DrawImage
	 * @generated
	 */
	EClass getDrawImage();

	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.operatingsystemactuators.PlayVideo <em>Play Video</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Play Video</em>'.
	 * @see es.udima.cesarlaso.tfm.operatingsystemactuators.PlayVideo
	 * @generated
	 */
	EClass getPlayVideo();

	/**
	 * Returns the meta object for the attribute '{@link es.udima.cesarlaso.tfm.operatingsystemactuators.PlayVideo#isRepeat <em>Repeat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repeat</em>'.
	 * @see es.udima.cesarlaso.tfm.operatingsystemactuators.PlayVideo#isRepeat()
	 * @see #getPlayVideo()
	 * @generated
	 */
	EAttribute getPlayVideo_Repeat();

	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.operatingsystemactuators.FilePath <em>File Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Path</em>'.
	 * @see es.udima.cesarlaso.tfm.operatingsystemactuators.FilePath
	 * @generated
	 */
	EClass getFilePath();

	/**
	 * Returns the meta object for the attribute '{@link es.udima.cesarlaso.tfm.operatingsystemactuators.FilePath#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.udima.cesarlaso.tfm.operatingsystemactuators.FilePath#getName()
	 * @see #getFilePath()
	 * @generated
	 */
	EAttribute getFilePath_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.udima.cesarlaso.tfm.operatingsystemactuators.FilePath#getFilePath <em>File Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Path</em>'.
	 * @see es.udima.cesarlaso.tfm.operatingsystemactuators.FilePath#getFilePath()
	 * @see #getFilePath()
	 * @generated
	 */
	EAttribute getFilePath_FilePath();

	/**
	 * Returns the meta object for enum '{@link es.udima.cesarlaso.tfm.operatingsystemactuators.ResizeType <em>Resize Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Resize Type</em>'.
	 * @see es.udima.cesarlaso.tfm.operatingsystemactuators.ResizeType
	 * @generated
	 */
	EEnum getResizeType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OperatingsystemactuatorsFactory getOperatingsystemactuatorsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.operatingsystemactuators.impl.OperatingSystemActuatorImpl <em>Operating System Actuator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.operatingsystemactuators.impl.OperatingSystemActuatorImpl
		 * @see es.udima.cesarlaso.tfm.operatingsystemactuators.impl.OperatingsystemactuatorsPackageImpl#getOperatingSystemActuator()
		 * @generated
		 */
		EClass OPERATING_SYSTEM_ACTUATOR = eINSTANCE.getOperatingSystemActuator();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.operatingsystemactuators.impl.SystemCommandImpl <em>System Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.operatingsystemactuators.impl.SystemCommandImpl
		 * @see es.udima.cesarlaso.tfm.operatingsystemactuators.impl.OperatingsystemactuatorsPackageImpl#getSystemCommand()
		 * @generated
		 */
		EClass SYSTEM_COMMAND = eINSTANCE.getSystemCommand();

		/**
		 * The meta object literal for the '<em><b>File Path</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_COMMAND__FILE_PATH = eINSTANCE.getSystemCommand_FilePath();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.operatingsystemactuators.impl.PlaySoundImpl <em>Play Sound</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.operatingsystemactuators.impl.PlaySoundImpl
		 * @see es.udima.cesarlaso.tfm.operatingsystemactuators.impl.OperatingsystemactuatorsPackageImpl#getPlaySound()
		 * @generated
		 */
		EClass PLAY_SOUND = eINSTANCE.getPlaySound();

		/**
		 * The meta object literal for the '<em><b>Volume</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAY_SOUND__VOLUME = eINSTANCE.getPlaySound_Volume();

		/**
		 * The meta object literal for the '<em><b>File Path</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAY_SOUND__FILE_PATH = eINSTANCE.getPlaySound_FilePath();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.operatingsystemactuators.impl.DownloadImpl <em>Download</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.operatingsystemactuators.impl.DownloadImpl
		 * @see es.udima.cesarlaso.tfm.operatingsystemactuators.impl.OperatingsystemactuatorsPackageImpl#getDownload()
		 * @generated
		 */
		EClass DOWNLOAD = eINSTANCE.getDownload();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOWNLOAD__URL = eINSTANCE.getDownload_Url();

		/**
		 * The meta object literal for the '<em><b>File Path</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOWNLOAD__FILE_PATH = eINSTANCE.getDownload_FilePath();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.operatingsystemactuators.impl.BackgroundImageImpl <em>Background Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.operatingsystemactuators.impl.BackgroundImageImpl
		 * @see es.udima.cesarlaso.tfm.operatingsystemactuators.impl.OperatingsystemactuatorsPackageImpl#getBackgroundImage()
		 * @generated
		 */
		EClass BACKGROUND_IMAGE = eINSTANCE.getBackgroundImage();

		/**
		 * The meta object literal for the '<em><b>File Path</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BACKGROUND_IMAGE__FILE_PATH = eINSTANCE.getBackgroundImage_FilePath();

		/**
		 * The meta object literal for the '<em><b>Resize Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BACKGROUND_IMAGE__RESIZE_TYPE = eINSTANCE.getBackgroundImage_ResizeType();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.operatingsystemactuators.impl.ScreenImpl <em>Screen</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.operatingsystemactuators.impl.ScreenImpl
		 * @see es.udima.cesarlaso.tfm.operatingsystemactuators.impl.OperatingsystemactuatorsPackageImpl#getScreen()
		 * @generated
		 */
		EClass SCREEN = eINSTANCE.getScreen();

		/**
		 * The meta object literal for the '<em><b>File Path</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCREEN__FILE_PATH = eINSTANCE.getScreen_FilePath();

		/**
		 * The meta object literal for the '<em><b>Position X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCREEN__POSITION_X = eINSTANCE.getScreen_PositionX();

		/**
		 * The meta object literal for the '<em><b>Position Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCREEN__POSITION_Y = eINSTANCE.getScreen_PositionY();

		/**
		 * The meta object literal for the '<em><b>Position Z</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCREEN__POSITION_Z = eINSTANCE.getScreen_PositionZ();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCREEN__COLOR = eINSTANCE.getScreen_Color();

		/**
		 * The meta object literal for the '<em><b>Resize Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCREEN__RESIZE_TYPE = eINSTANCE.getScreen_ResizeType();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.operatingsystemactuators.impl.DrawImageImpl <em>Draw Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.operatingsystemactuators.impl.DrawImageImpl
		 * @see es.udima.cesarlaso.tfm.operatingsystemactuators.impl.OperatingsystemactuatorsPackageImpl#getDrawImage()
		 * @generated
		 */
		EClass DRAW_IMAGE = eINSTANCE.getDrawImage();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.operatingsystemactuators.impl.PlayVideoImpl <em>Play Video</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.operatingsystemactuators.impl.PlayVideoImpl
		 * @see es.udima.cesarlaso.tfm.operatingsystemactuators.impl.OperatingsystemactuatorsPackageImpl#getPlayVideo()
		 * @generated
		 */
		EClass PLAY_VIDEO = eINSTANCE.getPlayVideo();

		/**
		 * The meta object literal for the '<em><b>Repeat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAY_VIDEO__REPEAT = eINSTANCE.getPlayVideo_Repeat();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.operatingsystemactuators.impl.FilePathImpl <em>File Path</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.operatingsystemactuators.impl.FilePathImpl
		 * @see es.udima.cesarlaso.tfm.operatingsystemactuators.impl.OperatingsystemactuatorsPackageImpl#getFilePath()
		 * @generated
		 */
		EClass FILE_PATH = eINSTANCE.getFilePath();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_PATH__NAME = eINSTANCE.getFilePath_Name();

		/**
		 * The meta object literal for the '<em><b>File Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_PATH__FILE_PATH = eINSTANCE.getFilePath_FilePath();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.operatingsystemactuators.ResizeType <em>Resize Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.operatingsystemactuators.ResizeType
		 * @see es.udima.cesarlaso.tfm.operatingsystemactuators.impl.OperatingsystemactuatorsPackageImpl#getResizeType()
		 * @generated
		 */
		EEnum RESIZE_TYPE = eINSTANCE.getResizeType();

	}

} //OperatingsystemactuatorsPackage
