/**
 */
package hu.sze.aut.ros.network.model.rosnetworkmodel.impl;

import hu.sze.aut.ros.network.model.rosnetworkmodel.MsgDefinitions;
import hu.sze.aut.ros.network.model.rosnetworkmodel.RosnetworkmodelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Msg Definitions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.sze.aut.ros.network.model.rosnetworkmodel.impl.MsgDefinitionsImpl#getPackage <em>Package</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MsgDefinitionsImpl extends MinimalEObjectImpl.Container implements MsgDefinitions {
	/**
	 * The cached value of the '{@link #getPackage() <em>Package</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackage()
	 * @generated
	 * @ordered
	 */
	protected EList<hu.sze.aut.ros.network.model.rosnetworkmodel.Package> package_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MsgDefinitionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RosnetworkmodelPackage.Literals.MSG_DEFINITIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<hu.sze.aut.ros.network.model.rosnetworkmodel.Package> getPackage() {
		if (package_ == null) {
			package_ = new EObjectContainmentEList<hu.sze.aut.ros.network.model.rosnetworkmodel.Package>(
					hu.sze.aut.ros.network.model.rosnetworkmodel.Package.class, this,
					RosnetworkmodelPackage.MSG_DEFINITIONS__PACKAGE);
		}
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RosnetworkmodelPackage.MSG_DEFINITIONS__PACKAGE:
			return ((InternalEList<?>) getPackage()).basicRemove(otherEnd, msgs);
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
		case RosnetworkmodelPackage.MSG_DEFINITIONS__PACKAGE:
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
		case RosnetworkmodelPackage.MSG_DEFINITIONS__PACKAGE:
			getPackage().clear();
			getPackage().addAll((Collection<? extends hu.sze.aut.ros.network.model.rosnetworkmodel.Package>) newValue);
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
		case RosnetworkmodelPackage.MSG_DEFINITIONS__PACKAGE:
			getPackage().clear();
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
		case RosnetworkmodelPackage.MSG_DEFINITIONS__PACKAGE:
			return package_ != null && !package_.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MsgDefinitionsImpl
