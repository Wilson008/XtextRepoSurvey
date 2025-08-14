/**
 */
package hu.sze.aut.ros.network.model.rosnetworkmodel.impl;

import hu.sze.aut.ros.network.model.rosnetworkmodel.RosMsg;
import hu.sze.aut.ros.network.model.rosnetworkmodel.RosnetworkmodelPackage;
import hu.sze.aut.ros.network.model.rosnetworkmodel.Topic;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Topic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.sze.aut.ros.network.model.rosnetworkmodel.impl.TopicImpl#getRosmsg <em>Rosmsg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TopicImpl extends NetworkElementImpl implements Topic {
	/**
	 * The cached value of the '{@link #getRosmsg() <em>Rosmsg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRosmsg()
	 * @generated
	 * @ordered
	 */
	protected RosMsg rosmsg;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TopicImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RosnetworkmodelPackage.Literals.TOPIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RosMsg getRosmsg() {
		if (rosmsg != null && rosmsg.eIsProxy()) {
			InternalEObject oldRosmsg = (InternalEObject) rosmsg;
			rosmsg = (RosMsg) eResolveProxy(oldRosmsg);
			if (rosmsg != oldRosmsg) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RosnetworkmodelPackage.TOPIC__ROSMSG,
							oldRosmsg, rosmsg));
			}
		}
		return rosmsg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RosMsg basicGetRosmsg() {
		return rosmsg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRosmsg(RosMsg newRosmsg) {
		RosMsg oldRosmsg = rosmsg;
		rosmsg = newRosmsg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RosnetworkmodelPackage.TOPIC__ROSMSG, oldRosmsg,
					rosmsg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RosnetworkmodelPackage.TOPIC__ROSMSG:
			if (resolve)
				return getRosmsg();
			return basicGetRosmsg();
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
		case RosnetworkmodelPackage.TOPIC__ROSMSG:
			setRosmsg((RosMsg) newValue);
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
		case RosnetworkmodelPackage.TOPIC__ROSMSG:
			setRosmsg((RosMsg) null);
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
		case RosnetworkmodelPackage.TOPIC__ROSMSG:
			return rosmsg != null;
		}
		return super.eIsSet(featureID);
	}

} //TopicImpl
