/**
 */
package hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl;

import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.SerializedField;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.StatepubsubmodelPackage;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.TopicMessage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Serialized Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.SerializedFieldImpl#getTopicmessage <em>Topicmessage</em>}</li>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.SerializedFieldImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SerializedFieldImpl extends MinimalEObjectImpl.Container implements SerializedField {
	/**
	 * The cached value of the '{@link #getTopicmessage() <em>Topicmessage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopicmessage()
	 * @generated
	 * @ordered
	 */
	protected TopicMessage topicmessage;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SerializedFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatepubsubmodelPackage.Literals.SERIALIZED_FIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopicMessage getTopicmessage() {
		if (topicmessage != null && topicmessage.eIsProxy()) {
			InternalEObject oldTopicmessage = (InternalEObject) topicmessage;
			topicmessage = (TopicMessage) eResolveProxy(oldTopicmessage);
			if (topicmessage != oldTopicmessage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							StatepubsubmodelPackage.SERIALIZED_FIELD__TOPICMESSAGE, oldTopicmessage, topicmessage));
			}
		}
		return topicmessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopicMessage basicGetTopicmessage() {
		return topicmessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopicmessage(TopicMessage newTopicmessage) {
		TopicMessage oldTopicmessage = topicmessage;
		topicmessage = newTopicmessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					StatepubsubmodelPackage.SERIALIZED_FIELD__TOPICMESSAGE, oldTopicmessage, topicmessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatepubsubmodelPackage.SERIALIZED_FIELD__ID, oldId,
					id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case StatepubsubmodelPackage.SERIALIZED_FIELD__TOPICMESSAGE:
			if (resolve)
				return getTopicmessage();
			return basicGetTopicmessage();
		case StatepubsubmodelPackage.SERIALIZED_FIELD__ID:
			return getId();
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
		case StatepubsubmodelPackage.SERIALIZED_FIELD__TOPICMESSAGE:
			setTopicmessage((TopicMessage) newValue);
			return;
		case StatepubsubmodelPackage.SERIALIZED_FIELD__ID:
			setId((String) newValue);
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
		case StatepubsubmodelPackage.SERIALIZED_FIELD__TOPICMESSAGE:
			setTopicmessage((TopicMessage) null);
			return;
		case StatepubsubmodelPackage.SERIALIZED_FIELD__ID:
			setId(ID_EDEFAULT);
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
		case StatepubsubmodelPackage.SERIALIZED_FIELD__TOPICMESSAGE:
			return topicmessage != null;
		case StatepubsubmodelPackage.SERIALIZED_FIELD__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //SerializedFieldImpl
