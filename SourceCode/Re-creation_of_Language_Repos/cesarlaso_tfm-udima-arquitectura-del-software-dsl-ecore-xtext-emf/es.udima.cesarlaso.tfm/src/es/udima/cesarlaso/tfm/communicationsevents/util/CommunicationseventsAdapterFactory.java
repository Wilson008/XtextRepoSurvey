/**
 */
package es.udima.cesarlaso.tfm.communicationsevents.util;

import es.udima.cesarlaso.tfm.communicationsevents.*;

import es.udima.cesarlaso.tfm.events.Event;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see es.udima.cesarlaso.tfm.communicationsevents.CommunicationseventsPackage
 * @generated
 */
public class CommunicationseventsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CommunicationseventsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationseventsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CommunicationseventsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommunicationseventsSwitch<Adapter> modelSwitch =
		new CommunicationseventsSwitch<Adapter>() {
			@Override
			public Adapter caseCommunicationEvent(CommunicationEvent object) {
				return createCommunicationEventAdapter();
			}
			@Override
			public Adapter caseNetworkEvent(NetworkEvent object) {
				return createNetworkEventAdapter();
			}
			@Override
			public Adapter caseNetworkConnected(NetworkConnected object) {
				return createNetworkConnectedAdapter();
			}
			@Override
			public Adapter caseNetworkDisconnected(NetworkDisconnected object) {
				return createNetworkDisconnectedAdapter();
			}
			@Override
			public Adapter caseServerEvent(ServerEvent object) {
				return createServerEventAdapter();
			}
			@Override
			public Adapter caseServerConnected(ServerConnected object) {
				return createServerConnectedAdapter();
			}
			@Override
			public Adapter caseServerDisconnected(ServerDisconnected object) {
				return createServerDisconnectedAdapter();
			}
			@Override
			public Adapter caseEvent(Event object) {
				return createEventAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link es.udima.cesarlaso.tfm.communicationsevents.CommunicationEvent <em>Communication Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.udima.cesarlaso.tfm.communicationsevents.CommunicationEvent
	 * @generated
	 */
	public Adapter createCommunicationEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.udima.cesarlaso.tfm.communicationsevents.NetworkEvent <em>Network Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.udima.cesarlaso.tfm.communicationsevents.NetworkEvent
	 * @generated
	 */
	public Adapter createNetworkEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.udima.cesarlaso.tfm.communicationsevents.NetworkConnected <em>Network Connected</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.udima.cesarlaso.tfm.communicationsevents.NetworkConnected
	 * @generated
	 */
	public Adapter createNetworkConnectedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.udima.cesarlaso.tfm.communicationsevents.NetworkDisconnected <em>Network Disconnected</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.udima.cesarlaso.tfm.communicationsevents.NetworkDisconnected
	 * @generated
	 */
	public Adapter createNetworkDisconnectedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.udima.cesarlaso.tfm.communicationsevents.ServerEvent <em>Server Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.udima.cesarlaso.tfm.communicationsevents.ServerEvent
	 * @generated
	 */
	public Adapter createServerEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.udima.cesarlaso.tfm.communicationsevents.ServerConnected <em>Server Connected</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.udima.cesarlaso.tfm.communicationsevents.ServerConnected
	 * @generated
	 */
	public Adapter createServerConnectedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.udima.cesarlaso.tfm.communicationsevents.ServerDisconnected <em>Server Disconnected</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.udima.cesarlaso.tfm.communicationsevents.ServerDisconnected
	 * @generated
	 */
	public Adapter createServerDisconnectedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.udima.cesarlaso.tfm.events.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.udima.cesarlaso.tfm.events.Event
	 * @generated
	 */
	public Adapter createEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CommunicationseventsAdapterFactory
