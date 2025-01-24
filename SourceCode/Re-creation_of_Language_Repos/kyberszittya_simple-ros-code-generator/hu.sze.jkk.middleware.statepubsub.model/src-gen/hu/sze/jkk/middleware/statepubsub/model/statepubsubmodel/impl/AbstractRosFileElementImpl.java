/**
 */
package hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl;

import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.AbstractRosFileElement;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.FilePackage;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.StatepubsubmodelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Ros File Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.AbstractRosFileElementImpl#getFilepackage <em>Filepackage</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractRosFileElementImpl extends RosElementImpl implements AbstractRosFileElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractRosFileElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatepubsubmodelPackage.Literals.ABSTRACT_ROS_FILE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilePackage getFilepackage() {
		if (eContainerFeatureID() != StatepubsubmodelPackage.ABSTRACT_ROS_FILE_ELEMENT__FILEPACKAGE)
			return null;
		return (FilePackage) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFilepackage(FilePackage newFilepackage, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newFilepackage,
				StatepubsubmodelPackage.ABSTRACT_ROS_FILE_ELEMENT__FILEPACKAGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilepackage(FilePackage newFilepackage) {
		if (newFilepackage != eInternalContainer()
				|| (eContainerFeatureID() != StatepubsubmodelPackage.ABSTRACT_ROS_FILE_ELEMENT__FILEPACKAGE
						&& newFilepackage != null)) {
			if (EcoreUtil.isAncestor(this, newFilepackage))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newFilepackage != null)
				msgs = ((InternalEObject) newFilepackage).eInverseAdd(this,
						StatepubsubmodelPackage.FILE_PACKAGE__ABSTRACTROSELEMENT, FilePackage.class, msgs);
			msgs = basicSetFilepackage(newFilepackage, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					StatepubsubmodelPackage.ABSTRACT_ROS_FILE_ELEMENT__FILEPACKAGE, newFilepackage, newFilepackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case StatepubsubmodelPackage.ABSTRACT_ROS_FILE_ELEMENT__FILEPACKAGE:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetFilepackage((FilePackage) otherEnd, msgs);
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
		case StatepubsubmodelPackage.ABSTRACT_ROS_FILE_ELEMENT__FILEPACKAGE:
			return basicSetFilepackage(null, msgs);
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
		case StatepubsubmodelPackage.ABSTRACT_ROS_FILE_ELEMENT__FILEPACKAGE:
			return eInternalContainer().eInverseRemove(this, StatepubsubmodelPackage.FILE_PACKAGE__ABSTRACTROSELEMENT,
					FilePackage.class, msgs);
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
		case StatepubsubmodelPackage.ABSTRACT_ROS_FILE_ELEMENT__FILEPACKAGE:
			return getFilepackage();
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
		case StatepubsubmodelPackage.ABSTRACT_ROS_FILE_ELEMENT__FILEPACKAGE:
			setFilepackage((FilePackage) newValue);
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
		case StatepubsubmodelPackage.ABSTRACT_ROS_FILE_ELEMENT__FILEPACKAGE:
			setFilepackage((FilePackage) null);
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
		case StatepubsubmodelPackage.ABSTRACT_ROS_FILE_ELEMENT__FILEPACKAGE:
			return getFilepackage() != null;
		}
		return super.eIsSet(featureID);
	}

} //AbstractRosFileElementImpl
