/**
 */
package es.udima.cesarlaso.tfm.communicationsprograms.util;

import es.udima.cesarlaso.tfm.communications.Service;

import es.udima.cesarlaso.tfm.communicationsprograms.*;

import es.udima.cesarlaso.tfm.events.Actuator;
import es.udima.cesarlaso.tfm.events.Event;

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
 * @see es.udima.cesarlaso.tfm.communicationsprograms.CommunicationsprogramsPackage
 * @generated
 */
public class CommunicationsprogramsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CommunicationsprogramsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationsprogramsSwitch() {
		if (modelPackage == null) {
			modelPackage = CommunicationsprogramsPackage.eINSTANCE;
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
			case CommunicationsprogramsPackage.PROGRAM_SERVICE: {
				ProgramService programService = (ProgramService)theEObject;
				T result = caseProgramService(programService);
				if (result == null) result = caseService(programService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommunicationsprogramsPackage.PROGRAM_EVENT_EVENT: {
				ProgramEventEvent programEventEvent = (ProgramEventEvent)theEObject;
				T result = caseProgramEventEvent(programEventEvent);
				if (result == null) result = caseProgramService(programEventEvent);
				if (result == null) result = caseService(programEventEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommunicationsprogramsPackage.PROGRAM_ACTUATOR_SERVICE: {
				ProgramActuatorService programActuatorService = (ProgramActuatorService)theEObject;
				T result = caseProgramActuatorService(programActuatorService);
				if (result == null) result = caseProgramService(programActuatorService);
				if (result == null) result = caseService(programActuatorService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommunicationsprogramsPackage.REMOTE_EVENT: {
				RemoteEvent remoteEvent = (RemoteEvent)theEObject;
				T result = caseRemoteEvent(remoteEvent);
				if (result == null) result = caseEvent(remoteEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommunicationsprogramsPackage.REMOTE_ACTUATOR: {
				RemoteActuator remoteActuator = (RemoteActuator)theEObject;
				T result = caseRemoteActuator(remoteActuator);
				if (result == null) result = caseActuator(remoteActuator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommunicationsprogramsPackage.REMOTE_IDENTIFIER: {
				RemoteIdentifier remoteIdentifier = (RemoteIdentifier)theEObject;
				T result = caseRemoteIdentifier(remoteIdentifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommunicationsprogramsPackage.REMOTE_EVENT_IDENTIFIER: {
				RemoteEventIdentifier remoteEventIdentifier = (RemoteEventIdentifier)theEObject;
				T result = caseRemoteEventIdentifier(remoteEventIdentifier);
				if (result == null) result = caseRemoteIdentifier(remoteEventIdentifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommunicationsprogramsPackage.REMOTE_ACTUATOR_IDENTIFIER: {
				RemoteActuatorIdentifier remoteActuatorIdentifier = (RemoteActuatorIdentifier)theEObject;
				T result = caseRemoteActuatorIdentifier(remoteActuatorIdentifier);
				if (result == null) result = caseRemoteIdentifier(remoteActuatorIdentifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Program Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Program Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProgramService(ProgramService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Program Event Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Program Event Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProgramEventEvent(ProgramEventEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Program Actuator Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Program Actuator Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProgramActuatorService(ProgramActuatorService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remote Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remote Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoteEvent(RemoteEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remote Actuator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remote Actuator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoteActuator(RemoteActuator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remote Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remote Identifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoteIdentifier(RemoteIdentifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remote Event Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remote Event Identifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoteEventIdentifier(RemoteEventIdentifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remote Actuator Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remote Actuator Identifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoteActuatorIdentifier(RemoteActuatorIdentifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseService(Service object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvent(Event object) {
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

} //CommunicationsprogramsSwitch
