/**
 */
package hu.sze.aut.ros.network.model.rosnetworkmodel.impl;

import hu.sze.aut.ros.network.model.rosnetworkmodel.RosMsg;
import hu.sze.aut.ros.network.model.rosnetworkmodel.RosnetworkmodelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ros Msg</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.sze.aut.ros.network.model.rosnetworkmodel.impl.RosMsgImpl#getName <em>Name</em>}</li>
 *   <li>{@link hu.sze.aut.ros.network.model.rosnetworkmodel.impl.RosMsgImpl#isStamped <em>Stamped</em>}</li>
 *   <li>{@link hu.sze.aut.ros.network.model.rosnetworkmodel.impl.RosMsgImpl#getPackage <em>Package</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RosMsgImpl extends MinimalEObjectImpl.Container implements RosMsg {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isStamped() <em>Stamped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStamped()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STAMPED_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isStamped() <em>Stamped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStamped()
	 * @generated
	 * @ordered
	 */
	protected boolean stamped = STAMPED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RosMsgImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RosnetworkmodelPackage.Literals.ROS_MSG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RosnetworkmodelPackage.ROS_MSG__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStamped() {
		return stamped;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStamped(boolean newStamped) {
		boolean oldStamped = stamped;
		stamped = newStamped;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RosnetworkmodelPackage.ROS_MSG__STAMPED, oldStamped,
					stamped));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public hu.sze.aut.ros.network.model.rosnetworkmodel.Package getPackage() {
		if (eContainerFeatureID() != RosnetworkmodelPackage.ROS_MSG__PACKAGE)
			return null;
		return (hu.sze.aut.ros.network.model.rosnetworkmodel.Package) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPackage(hu.sze.aut.ros.network.model.rosnetworkmodel.Package newPackage,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newPackage, RosnetworkmodelPackage.ROS_MSG__PACKAGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackage(hu.sze.aut.ros.network.model.rosnetworkmodel.Package newPackage) {
		if (newPackage != eInternalContainer()
				|| (eContainerFeatureID() != RosnetworkmodelPackage.ROS_MSG__PACKAGE && newPackage != null)) {
			if (EcoreUtil.isAncestor(this, newPackage))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPackage != null)
				msgs = ((InternalEObject) newPackage).eInverseAdd(this, RosnetworkmodelPackage.PACKAGE__ROSMSG,
						hu.sze.aut.ros.network.model.rosnetworkmodel.Package.class, msgs);
			msgs = basicSetPackage(newPackage, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RosnetworkmodelPackage.ROS_MSG__PACKAGE, newPackage,
					newPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RosnetworkmodelPackage.ROS_MSG__PACKAGE:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetPackage((hu.sze.aut.ros.network.model.rosnetworkmodel.Package) otherEnd, msgs);
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
		case RosnetworkmodelPackage.ROS_MSG__PACKAGE:
			return basicSetPackage(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case RosnetworkmodelPackage.ROS_MSG__PACKAGE:
			return eInternalContainer().eInverseRemove(this, RosnetworkmodelPackage.PACKAGE__ROSMSG,
					hu.sze.aut.ros.network.model.rosnetworkmodel.Package.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RosnetworkmodelPackage.ROS_MSG__NAME:
			return getName();
		case RosnetworkmodelPackage.ROS_MSG__STAMPED:
			return isStamped();
		case RosnetworkmodelPackage.ROS_MSG__PACKAGE:
			return getPackage();
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
		case RosnetworkmodelPackage.ROS_MSG__NAME:
			setName((String) newValue);
			return;
		case RosnetworkmodelPackage.ROS_MSG__STAMPED:
			setStamped((Boolean) newValue);
			return;
		case RosnetworkmodelPackage.ROS_MSG__PACKAGE:
			setPackage((hu.sze.aut.ros.network.model.rosnetworkmodel.Package) newValue);
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
		case RosnetworkmodelPackage.ROS_MSG__NAME:
			setName(NAME_EDEFAULT);
			return;
		case RosnetworkmodelPackage.ROS_MSG__STAMPED:
			setStamped(STAMPED_EDEFAULT);
			return;
		case RosnetworkmodelPackage.ROS_MSG__PACKAGE:
			setPackage((hu.sze.aut.ros.network.model.rosnetworkmodel.Package) null);
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
		case RosnetworkmodelPackage.ROS_MSG__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case RosnetworkmodelPackage.ROS_MSG__STAMPED:
			return stamped != STAMPED_EDEFAULT;
		case RosnetworkmodelPackage.ROS_MSG__PACKAGE:
			return getPackage() != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", stamped: ");
		result.append(stamped);
		result.append(')');
		return result.toString();
	}

} //RosMsgImpl
