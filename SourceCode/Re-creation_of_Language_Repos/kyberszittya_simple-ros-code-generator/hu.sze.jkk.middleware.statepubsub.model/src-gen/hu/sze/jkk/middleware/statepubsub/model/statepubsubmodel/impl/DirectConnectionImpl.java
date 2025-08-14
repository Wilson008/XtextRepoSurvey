/**
 */
package hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl;

import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.ContinousState;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.DirectConnection;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Port;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.StatepubsubmodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Direct Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.DirectConnectionImpl#getPort <em>Port</em>}</li>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.DirectConnectionImpl#getContinousstate <em>Continousstate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DirectConnectionImpl extends InternalEdgeImpl implements DirectConnection {
	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected Port port;

	/**
	 * The cached value of the '{@link #getContinousstate() <em>Continousstate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContinousstate()
	 * @generated
	 * @ordered
	 */
	protected ContinousState continousstate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DirectConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatepubsubmodelPackage.Literals.DIRECT_CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getPort() {
		if (port != null && port.eIsProxy()) {
			InternalEObject oldPort = (InternalEObject) port;
			port = (Port) eResolveProxy(oldPort);
			if (port != oldPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							StatepubsubmodelPackage.DIRECT_CONNECTION__PORT, oldPort, port));
			}
		}
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port basicGetPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort(Port newPort) {
		Port oldPort = port;
		port = newPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatepubsubmodelPackage.DIRECT_CONNECTION__PORT,
					oldPort, port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContinousState getContinousstate() {
		if (continousstate != null && continousstate.eIsProxy()) {
			InternalEObject oldContinousstate = (InternalEObject) continousstate;
			continousstate = (ContinousState) eResolveProxy(oldContinousstate);
			if (continousstate != oldContinousstate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							StatepubsubmodelPackage.DIRECT_CONNECTION__CONTINOUSSTATE, oldContinousstate,
							continousstate));
			}
		}
		return continousstate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContinousState basicGetContinousstate() {
		return continousstate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContinousstate(ContinousState newContinousstate) {
		ContinousState oldContinousstate = continousstate;
		continousstate = newContinousstate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					StatepubsubmodelPackage.DIRECT_CONNECTION__CONTINOUSSTATE, oldContinousstate, continousstate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case StatepubsubmodelPackage.DIRECT_CONNECTION__PORT:
			if (resolve)
				return getPort();
			return basicGetPort();
		case StatepubsubmodelPackage.DIRECT_CONNECTION__CONTINOUSSTATE:
			if (resolve)
				return getContinousstate();
			return basicGetContinousstate();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case StatepubsubmodelPackage.DIRECT_CONNECTION__PORT:
			setPort((Port) newValue);
			return;
		case StatepubsubmodelPackage.DIRECT_CONNECTION__CONTINOUSSTATE:
			setContinousstate((ContinousState) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case StatepubsubmodelPackage.DIRECT_CONNECTION__PORT:
			setPort((Port) null);
			return;
		case StatepubsubmodelPackage.DIRECT_CONNECTION__CONTINOUSSTATE:
			setContinousstate((ContinousState) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case StatepubsubmodelPackage.DIRECT_CONNECTION__PORT:
			return port != null;
		case StatepubsubmodelPackage.DIRECT_CONNECTION__CONTINOUSSTATE:
			return continousstate != null;
		}
		return super.eIsSet(featureID);
	}

} //DirectConnectionImpl
