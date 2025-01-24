/**
 */
package es.udima.cesarlaso.tfm.communicationsevents.util;

import es.udima.cesarlaso.tfm.communicationsevents.*;

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
 * @see es.udima.cesarlaso.tfm.communicationsevents.CommunicationseventsPackage
 * @generated
 */
public class CommunicationseventsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CommunicationseventsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationseventsSwitch() {
		if (modelPackage == null) {
			modelPackage = CommunicationseventsPackage.eINSTANCE;
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
			case CommunicationseventsPackage.COMMUNICATION_EVENT: {
				CommunicationEvent communicationEvent = (CommunicationEvent)theEObject;
				T result = caseCommunicationEvent(communicationEvent);
				if (result == null) result = caseEvent(communicationEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommunicationseventsPackage.NETWORK_EVENT: {
				NetworkEvent networkEvent = (NetworkEvent)theEObject;
				T result = caseNetworkEvent(networkEvent);
				if (result == null) result = caseCommunicationEvent(networkEvent);
				if (result == null) result = caseEvent(networkEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommunicationseventsPackage.NETWORK_CONNECTED: {
				NetworkConnected networkConnected = (NetworkConnected)theEObject;
				T result = caseNetworkConnected(networkConnected);
				if (result == null) result = caseNetworkEvent(networkConnected);
				if (result == null) result = caseCommunicationEvent(networkConnected);
				if (result == null) result = caseEvent(networkConnected);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommunicationseventsPackage.NETWORK_DISCONNECTED: {
				NetworkDisconnected networkDisconnected = (NetworkDisconnected)theEObject;
				T result = caseNetworkDisconnected(networkDisconnected);
				if (result == null) result = caseNetworkEvent(networkDisconnected);
				if (result == null) result = caseCommunicationEvent(networkDisconnected);
				if (result == null) result = caseEvent(networkDisconnected);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommunicationseventsPackage.SERVER_EVENT: {
				ServerEvent serverEvent = (ServerEvent)theEObject;
				T result = caseServerEvent(serverEvent);
				if (result == null) result = caseCommunicationEvent(serverEvent);
				if (result == null) result = caseEvent(serverEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommunicationseventsPackage.SERVER_CONNECTED: {
				ServerConnected serverConnected = (ServerConnected)theEObject;
				T result = caseServerConnected(serverConnected);
				if (result == null) result = caseServerEvent(serverConnected);
				if (result == null) result = caseCommunicationEvent(serverConnected);
				if (result == null) result = caseEvent(serverConnected);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommunicationseventsPackage.SERVER_DISCONNECTED: {
				ServerDisconnected serverDisconnected = (ServerDisconnected)theEObject;
				T result = caseServerDisconnected(serverDisconnected);
				if (result == null) result = caseServerEvent(serverDisconnected);
				if (result == null) result = caseCommunicationEvent(serverDisconnected);
				if (result == null) result = caseEvent(serverDisconnected);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Communication Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Communication Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommunicationEvent(CommunicationEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworkEvent(NetworkEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network Connected</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network Connected</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworkConnected(NetworkConnected object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network Disconnected</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network Disconnected</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworkDisconnected(NetworkDisconnected object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Server Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Server Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServerEvent(ServerEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Server Connected</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Server Connected</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServerConnected(ServerConnected object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Server Disconnected</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Server Disconnected</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServerDisconnected(ServerDisconnected object) {
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

} //CommunicationseventsSwitch
