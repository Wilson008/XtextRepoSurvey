/**
 */
package hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl;

import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Channel;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.ContinousState;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.InputPort;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.StatepubsubmodelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.InputPortImpl#getSync_function_name <em>Sync function name</em>}</li>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.InputPortImpl#getSynchronizesState <em>Synchronizes State</em>}</li>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.InputPortImpl#getChannel <em>Channel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InputPortImpl extends PortImpl implements InputPort {
	/**
	 * The default value of the '{@link #getSync_function_name() <em>Sync function name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSync_function_name()
	 * @generated
	 * @ordered
	 */
	protected static final String SYNC_FUNCTION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSync_function_name() <em>Sync function name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSync_function_name()
	 * @generated
	 * @ordered
	 */
	protected String sync_function_name = SYNC_FUNCTION_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSynchronizesState() <em>Synchronizes State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSynchronizesState()
	 * @generated
	 * @ordered
	 */
	protected ContinousState synchronizesState;

	/**
	 * The cached value of the '{@link #getChannel() <em>Channel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannel()
	 * @generated
	 * @ordered
	 */
	protected Channel channel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatepubsubmodelPackage.Literals.INPUT_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSync_function_name() {
		return sync_function_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSync_function_name(String newSync_function_name) {
		String oldSync_function_name = sync_function_name;
		sync_function_name = newSync_function_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					StatepubsubmodelPackage.INPUT_PORT__SYNC_FUNCTION_NAME, oldSync_function_name, sync_function_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContinousState getSynchronizesState() {
		if (synchronizesState != null && synchronizesState.eIsProxy()) {
			InternalEObject oldSynchronizesState = (InternalEObject) synchronizesState;
			synchronizesState = (ContinousState) eResolveProxy(oldSynchronizesState);
			if (synchronizesState != oldSynchronizesState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							StatepubsubmodelPackage.INPUT_PORT__SYNCHRONIZES_STATE, oldSynchronizesState,
							synchronizesState));
			}
		}
		return synchronizesState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContinousState basicGetSynchronizesState() {
		return synchronizesState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSynchronizesState(ContinousState newSynchronizesState, NotificationChain msgs) {
		ContinousState oldSynchronizesState = synchronizesState;
		synchronizesState = newSynchronizesState;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					StatepubsubmodelPackage.INPUT_PORT__SYNCHRONIZES_STATE, oldSynchronizesState, newSynchronizesState);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSynchronizesState(ContinousState newSynchronizesState) {
		if (newSynchronizesState != synchronizesState) {
			NotificationChain msgs = null;
			if (synchronizesState != null)
				msgs = ((InternalEObject) synchronizesState).eInverseRemove(this,
						StatepubsubmodelPackage.CONTINOUS_STATE__SYNCHRONIZE_WITH, ContinousState.class, msgs);
			if (newSynchronizesState != null)
				msgs = ((InternalEObject) newSynchronizesState).eInverseAdd(this,
						StatepubsubmodelPackage.CONTINOUS_STATE__SYNCHRONIZE_WITH, ContinousState.class, msgs);
			msgs = basicSetSynchronizesState(newSynchronizesState, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					StatepubsubmodelPackage.INPUT_PORT__SYNCHRONIZES_STATE, newSynchronizesState,
					newSynchronizesState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Channel getChannel() {
		if (channel != null && channel.eIsProxy()) {
			InternalEObject oldChannel = (InternalEObject) channel;
			channel = (Channel) eResolveProxy(oldChannel);
			if (channel != oldChannel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							StatepubsubmodelPackage.INPUT_PORT__CHANNEL, oldChannel, channel));
			}
		}
		return channel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Channel basicGetChannel() {
		return channel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChannel(Channel newChannel) {
		Channel oldChannel = channel;
		channel = newChannel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatepubsubmodelPackage.INPUT_PORT__CHANNEL,
					oldChannel, channel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case StatepubsubmodelPackage.INPUT_PORT__SYNCHRONIZES_STATE:
			if (synchronizesState != null)
				msgs = ((InternalEObject) synchronizesState).eInverseRemove(this,
						StatepubsubmodelPackage.CONTINOUS_STATE__SYNCHRONIZE_WITH, ContinousState.class, msgs);
			return basicSetSynchronizesState((ContinousState) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case StatepubsubmodelPackage.INPUT_PORT__SYNCHRONIZES_STATE:
			return basicSetSynchronizesState(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case StatepubsubmodelPackage.INPUT_PORT__SYNC_FUNCTION_NAME:
			return getSync_function_name();
		case StatepubsubmodelPackage.INPUT_PORT__SYNCHRONIZES_STATE:
			if (resolve)
				return getSynchronizesState();
			return basicGetSynchronizesState();
		case StatepubsubmodelPackage.INPUT_PORT__CHANNEL:
			if (resolve)
				return getChannel();
			return basicGetChannel();
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
		case StatepubsubmodelPackage.INPUT_PORT__SYNC_FUNCTION_NAME:
			setSync_function_name((String) newValue);
			return;
		case StatepubsubmodelPackage.INPUT_PORT__SYNCHRONIZES_STATE:
			setSynchronizesState((ContinousState) newValue);
			return;
		case StatepubsubmodelPackage.INPUT_PORT__CHANNEL:
			setChannel((Channel) newValue);
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
		case StatepubsubmodelPackage.INPUT_PORT__SYNC_FUNCTION_NAME:
			setSync_function_name(SYNC_FUNCTION_NAME_EDEFAULT);
			return;
		case StatepubsubmodelPackage.INPUT_PORT__SYNCHRONIZES_STATE:
			setSynchronizesState((ContinousState) null);
			return;
		case StatepubsubmodelPackage.INPUT_PORT__CHANNEL:
			setChannel((Channel) null);
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
		case StatepubsubmodelPackage.INPUT_PORT__SYNC_FUNCTION_NAME:
			return SYNC_FUNCTION_NAME_EDEFAULT == null ? sync_function_name != null
					: !SYNC_FUNCTION_NAME_EDEFAULT.equals(sync_function_name);
		case StatepubsubmodelPackage.INPUT_PORT__SYNCHRONIZES_STATE:
			return synchronizesState != null;
		case StatepubsubmodelPackage.INPUT_PORT__CHANNEL:
			return channel != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (sync_function_name: ");
		result.append(sync_function_name);
		result.append(')');
		return result.toString();
	}

} //InputPortImpl
