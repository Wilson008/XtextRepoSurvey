/**
 */
package hu.sze.aut.ros.network.model.rosnetworkmodel.impl;

import hu.sze.aut.ros.network.model.rosnetworkmodel.RosMsg;
import hu.sze.aut.ros.network.model.rosnetworkmodel.RosnetworkmodelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.sze.aut.ros.network.model.rosnetworkmodel.impl.PackageImpl#getSubpackage <em>Subpackage</em>}</li>
 *   <li>{@link hu.sze.aut.ros.network.model.rosnetworkmodel.impl.PackageImpl#getRosmsg <em>Rosmsg</em>}</li>
 *   <li>{@link hu.sze.aut.ros.network.model.rosnetworkmodel.impl.PackageImpl#getName <em>Name</em>}</li>
 *   <li>{@link hu.sze.aut.ros.network.model.rosnetworkmodel.impl.PackageImpl#getPackage <em>Package</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PackageImpl extends MinimalEObjectImpl.Container
		implements hu.sze.aut.ros.network.model.rosnetworkmodel.Package {
	/**
	 * The cached value of the '{@link #getSubpackage() <em>Subpackage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubpackage()
	 * @generated
	 * @ordered
	 */
	protected EList<hu.sze.aut.ros.network.model.rosnetworkmodel.Package> subpackage;

	/**
	 * The cached value of the '{@link #getRosmsg() <em>Rosmsg</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRosmsg()
	 * @generated
	 * @ordered
	 */
	protected EList<RosMsg> rosmsg;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RosnetworkmodelPackage.Literals.PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<hu.sze.aut.ros.network.model.rosnetworkmodel.Package> getSubpackage() {
		if (subpackage == null) {
			subpackage = new EObjectContainmentWithInverseEList<hu.sze.aut.ros.network.model.rosnetworkmodel.Package>(
					hu.sze.aut.ros.network.model.rosnetworkmodel.Package.class, this,
					RosnetworkmodelPackage.PACKAGE__SUBPACKAGE, RosnetworkmodelPackage.PACKAGE__PACKAGE);
		}
		return subpackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RosMsg> getRosmsg() {
		if (rosmsg == null) {
			rosmsg = new EObjectContainmentWithInverseEList<RosMsg>(RosMsg.class, this,
					RosnetworkmodelPackage.PACKAGE__ROSMSG, RosnetworkmodelPackage.ROS_MSG__PACKAGE);
		}
		return rosmsg;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RosnetworkmodelPackage.PACKAGE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public hu.sze.aut.ros.network.model.rosnetworkmodel.Package getPackage() {
		if (eContainerFeatureID() != RosnetworkmodelPackage.PACKAGE__PACKAGE)
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
		msgs = eBasicSetContainer((InternalEObject) newPackage, RosnetworkmodelPackage.PACKAGE__PACKAGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackage(hu.sze.aut.ros.network.model.rosnetworkmodel.Package newPackage) {
		if (newPackage != eInternalContainer()
				|| (eContainerFeatureID() != RosnetworkmodelPackage.PACKAGE__PACKAGE && newPackage != null)) {
			if (EcoreUtil.isAncestor(this, newPackage))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPackage != null)
				msgs = ((InternalEObject) newPackage).eInverseAdd(this, RosnetworkmodelPackage.PACKAGE__SUBPACKAGE,
						hu.sze.aut.ros.network.model.rosnetworkmodel.Package.class, msgs);
			msgs = basicSetPackage(newPackage, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RosnetworkmodelPackage.PACKAGE__PACKAGE, newPackage,
					newPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RosnetworkmodelPackage.PACKAGE__SUBPACKAGE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSubpackage()).basicAdd(otherEnd, msgs);
		case RosnetworkmodelPackage.PACKAGE__ROSMSG:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getRosmsg()).basicAdd(otherEnd, msgs);
		case RosnetworkmodelPackage.PACKAGE__PACKAGE:
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
		case RosnetworkmodelPackage.PACKAGE__SUBPACKAGE:
			return ((InternalEList<?>) getSubpackage()).basicRemove(otherEnd, msgs);
		case RosnetworkmodelPackage.PACKAGE__ROSMSG:
			return ((InternalEList<?>) getRosmsg()).basicRemove(otherEnd, msgs);
		case RosnetworkmodelPackage.PACKAGE__PACKAGE:
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
		case RosnetworkmodelPackage.PACKAGE__PACKAGE:
			return eInternalContainer().eInverseRemove(this, RosnetworkmodelPackage.PACKAGE__SUBPACKAGE,
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
		case RosnetworkmodelPackage.PACKAGE__SUBPACKAGE:
			return getSubpackage();
		case RosnetworkmodelPackage.PACKAGE__ROSMSG:
			return getRosmsg();
		case RosnetworkmodelPackage.PACKAGE__NAME:
			return getName();
		case RosnetworkmodelPackage.PACKAGE__PACKAGE:
			return getPackage();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case RosnetworkmodelPackage.PACKAGE__SUBPACKAGE:
			getSubpackage().clear();
			getSubpackage()
					.addAll((Collection<? extends hu.sze.aut.ros.network.model.rosnetworkmodel.Package>) newValue);
			return;
		case RosnetworkmodelPackage.PACKAGE__ROSMSG:
			getRosmsg().clear();
			getRosmsg().addAll((Collection<? extends RosMsg>) newValue);
			return;
		case RosnetworkmodelPackage.PACKAGE__NAME:
			setName((String) newValue);
			return;
		case RosnetworkmodelPackage.PACKAGE__PACKAGE:
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
		case RosnetworkmodelPackage.PACKAGE__SUBPACKAGE:
			getSubpackage().clear();
			return;
		case RosnetworkmodelPackage.PACKAGE__ROSMSG:
			getRosmsg().clear();
			return;
		case RosnetworkmodelPackage.PACKAGE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case RosnetworkmodelPackage.PACKAGE__PACKAGE:
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
		case RosnetworkmodelPackage.PACKAGE__SUBPACKAGE:
			return subpackage != null && !subpackage.isEmpty();
		case RosnetworkmodelPackage.PACKAGE__ROSMSG:
			return rosmsg != null && !rosmsg.isEmpty();
		case RosnetworkmodelPackage.PACKAGE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case RosnetworkmodelPackage.PACKAGE__PACKAGE:
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
		result.append(')');
		return result.toString();
	}

} //PackageImpl
