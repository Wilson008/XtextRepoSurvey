/**
 */
package es.udima.cesarlaso.tfm.operatingsystemactuators.util;

import es.udima.cesarlaso.tfm.events.Actuator;

import es.udima.cesarlaso.tfm.operatingsystemactuators.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see es.udima.cesarlaso.tfm.operatingsystemactuators.OperatingsystemactuatorsPackage
 * @generated
 */
public class OperatingsystemactuatorsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OperatingsystemactuatorsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatingsystemactuatorsSwitch() {
		if (modelPackage == null) {
			modelPackage = OperatingsystemactuatorsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case OperatingsystemactuatorsPackage.OPERATING_SYSTEM_ACTUATOR: {
				OperatingSystemActuator operatingSystemActuator = (OperatingSystemActuator)theEObject;
				T result = caseOperatingSystemActuator(operatingSystemActuator);
				if (result == null) result = caseActuator(operatingSystemActuator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperatingsystemactuatorsPackage.SYSTEM_COMMAND: {
				SystemCommand systemCommand = (SystemCommand)theEObject;
				T result = caseSystemCommand(systemCommand);
				if (result == null) result = caseOperatingSystemActuator(systemCommand);
				if (result == null) result = caseActuator(systemCommand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperatingsystemactuatorsPackage.PLAY_SOUND: {
				PlaySound playSound = (PlaySound)theEObject;
				T result = casePlaySound(playSound);
				if (result == null) result = caseOperatingSystemActuator(playSound);
				if (result == null) result = caseActuator(playSound);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperatingsystemactuatorsPackage.DOWNLOAD: {
				Download download = (Download)theEObject;
				T result = caseDownload(download);
				if (result == null) result = caseOperatingSystemActuator(download);
				if (result == null) result = caseActuator(download);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperatingsystemactuatorsPackage.BACKGROUND_IMAGE: {
				BackgroundImage backgroundImage = (BackgroundImage)theEObject;
				T result = caseBackgroundImage(backgroundImage);
				if (result == null) result = caseOperatingSystemActuator(backgroundImage);
				if (result == null) result = caseActuator(backgroundImage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperatingsystemactuatorsPackage.SCREEN: {
				Screen screen = (Screen)theEObject;
				T result = caseScreen(screen);
				if (result == null) result = caseOperatingSystemActuator(screen);
				if (result == null) result = caseActuator(screen);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperatingsystemactuatorsPackage.DRAW_IMAGE: {
				DrawImage drawImage = (DrawImage)theEObject;
				T result = caseDrawImage(drawImage);
				if (result == null) result = caseScreen(drawImage);
				if (result == null) result = caseOperatingSystemActuator(drawImage);
				if (result == null) result = caseActuator(drawImage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperatingsystemactuatorsPackage.PLAY_VIDEO: {
				PlayVideo playVideo = (PlayVideo)theEObject;
				T result = casePlayVideo(playVideo);
				if (result == null) result = caseScreen(playVideo);
				if (result == null) result = caseOperatingSystemActuator(playVideo);
				if (result == null) result = caseActuator(playVideo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperatingsystemactuatorsPackage.FILE_PATH: {
				FilePath filePath = (FilePath)theEObject;
				T result = caseFilePath(filePath);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operating System Actuator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operating System Actuator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperatingSystemActuator(OperatingSystemActuator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Command</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Command</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemCommand(SystemCommand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Play Sound</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Play Sound</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlaySound(PlaySound object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Download</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Download</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDownload(Download object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Background Image</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Background Image</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBackgroundImage(BackgroundImage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Screen</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Screen</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScreen(Screen object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Draw Image</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Draw Image</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDrawImage(DrawImage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Play Video</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Play Video</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlayVideo(PlayVideo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Path</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Path</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilePath(FilePath object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actuator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actuator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActuator(Actuator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //OperatingsystemactuatorsSwitch
