/**
 */
package hu.sze.aut.ros.network.model.rosnetworkmodel.impl;

import hu.sze.aut.ros.network.model.rosnetworkmodel.Network;
import hu.sze.aut.ros.network.model.rosnetworkmodel.Node;
import hu.sze.aut.ros.network.model.rosnetworkmodel.RosnetworkmodelPackage;
import hu.sze.aut.ros.network.model.rosnetworkmodel.Topic;

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
 * An implementation of the model object '<em><b>Network</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.sze.aut.ros.network.model.rosnetworkmodel.impl.NetworkImpl#getNode <em>Node</em>}</li>
 *   <li>{@link hu.sze.aut.ros.network.model.rosnetworkmodel.impl.NetworkImpl#getTopic <em>Topic</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NetworkImpl extends MinimalEObjectImpl.Container implements Network {
	/**
	 * The cached value of the '{@link #getNode() <em>Node</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> node;

	/**
	 * The cached value of the '{@link #getTopic() <em>Topic</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopic()
	 * @generated
	 * @ordered
	 */
	protected EList<Topic> topic;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetworkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RosnetworkmodelPackage.Literals.NETWORK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getNode() {
		if (node == null) {
			node = new EObjectContainmentEList<Node>(Node.class, this, RosnetworkmodelPackage.NETWORK__NODE);
		}
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Topic> getTopic() {
		if (topic == null) {
			topic = new EObjectContainmentEList<Topic>(Topic.class, this, RosnetworkmodelPackage.NETWORK__TOPIC);
		}
		return topic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RosnetworkmodelPackage.NETWORK__NODE:
			return ((InternalEList<?>) getNode()).basicRemove(otherEnd, msgs);
		case RosnetworkmodelPackage.NETWORK__TOPIC:
			return ((InternalEList<?>) getTopic()).basicRemove(otherEnd, msgs);
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
		case RosnetworkmodelPackage.NETWORK__NODE:
			return getNode();
		case RosnetworkmodelPackage.NETWORK__TOPIC:
			return getTopic();
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
		case RosnetworkmodelPackage.NETWORK__NODE:
			getNode().clear();
			getNode().addAll((Collection<? extends Node>) newValue);
			return;
		case RosnetworkmodelPackage.NETWORK__TOPIC:
			getTopic().clear();
			getTopic().addAll((Collection<? extends Topic>) newValue);
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
		case RosnetworkmodelPackage.NETWORK__NODE:
			getNode().clear();
			return;
		case RosnetworkmodelPackage.NETWORK__TOPIC:
			getTopic().clear();
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
		case RosnetworkmodelPackage.NETWORK__NODE:
			return node != null && !node.isEmpty();
		case RosnetworkmodelPackage.NETWORK__TOPIC:
			return topic != null && !topic.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NetworkImpl
