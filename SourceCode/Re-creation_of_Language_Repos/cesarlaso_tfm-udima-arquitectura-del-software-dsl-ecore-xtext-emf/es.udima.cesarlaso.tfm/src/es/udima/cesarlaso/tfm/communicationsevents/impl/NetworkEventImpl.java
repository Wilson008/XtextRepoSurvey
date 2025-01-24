/**
 */
package es.udima.cesarlaso.tfm.communicationsevents.impl;

import es.udima.cesarlaso.tfm.communicationsevents.CommunicationseventsPackage;
import es.udima.cesarlaso.tfm.communicationsevents.NetworkEvent;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Network Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class NetworkEventImpl extends CommunicationEventImpl implements NetworkEvent {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetworkEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommunicationseventsPackage.Literals.NETWORK_EVENT;
	}

} //NetworkEventImpl
