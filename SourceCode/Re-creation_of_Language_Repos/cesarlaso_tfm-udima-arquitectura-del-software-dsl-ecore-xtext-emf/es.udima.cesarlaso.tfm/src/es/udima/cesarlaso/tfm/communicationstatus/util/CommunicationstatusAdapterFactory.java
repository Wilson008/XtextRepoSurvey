/**
 */
package es.udima.cesarlaso.tfm.communicationstatus.util;

import es.udima.cesarlaso.tfm.communications.Service;
import es.udima.cesarlaso.tfm.communications.ServiceRequest;
import es.udima.cesarlaso.tfm.communications.ServiceResponse;

import es.udima.cesarlaso.tfm.communicationstatus.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see es.udima.cesarlaso.tfm.communicationstatus.CommunicationstatusPackage
 * @generated
 */
public class CommunicationstatusAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CommunicationstatusPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationstatusAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CommunicationstatusPackage.eINSTANCE;
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
	protected CommunicationstatusSwitch<Adapter> modelSwitch =
		new CommunicationstatusSwitch<Adapter>() {
			@Override
			public Adapter caseStatusService(StatusService object) {
				return createStatusServiceAdapter();
			}
			@Override
			public Adapter casePing(Ping object) {
				return createPingAdapter();
			}
			@Override
			public Adapter casePong(Pong object) {
				return createPongAdapter();
			}
			@Override
			public Adapter caseService(Service object) {
				return createServiceAdapter();
			}
			@Override
			public Adapter caseServiceRequest(ServiceRequest object) {
				return createServiceRequestAdapter();
			}
			@Override
			public Adapter caseServiceResponse(ServiceResponse object) {
				return createServiceResponseAdapter();
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
	 * Creates a new adapter for an object of class '{@link es.udima.cesarlaso.tfm.communicationstatus.StatusService <em>Status Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.udima.cesarlaso.tfm.communicationstatus.StatusService
	 * @generated
	 */
	public Adapter createStatusServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.udima.cesarlaso.tfm.communicationstatus.Ping <em>Ping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.udima.cesarlaso.tfm.communicationstatus.Ping
	 * @generated
	 */
	public Adapter createPingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.udima.cesarlaso.tfm.communicationstatus.Pong <em>Pong</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.udima.cesarlaso.tfm.communicationstatus.Pong
	 * @generated
	 */
	public Adapter createPongAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.udima.cesarlaso.tfm.communications.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.udima.cesarlaso.tfm.communications.Service
	 * @generated
	 */
	public Adapter createServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.udima.cesarlaso.tfm.communications.ServiceRequest <em>Service Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.udima.cesarlaso.tfm.communications.ServiceRequest
	 * @generated
	 */
	public Adapter createServiceRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.udima.cesarlaso.tfm.communications.ServiceResponse <em>Service Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.udima.cesarlaso.tfm.communications.ServiceResponse
	 * @generated
	 */
	public Adapter createServiceResponseAdapter() {
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

} //CommunicationstatusAdapterFactory
