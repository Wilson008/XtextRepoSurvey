/**
 */
package hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl;

import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Channel;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.FilePackage;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.NetworkType;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Stack;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.StatepubsubmodelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stack</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StackImpl#getName <em>Name</em>}</li>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StackImpl#getChannels <em>Channels</em>}</li>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StackImpl#getNetworktype <em>Networktype</em>}</li>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StackImpl#getFilepackage <em>Filepackage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StackImpl extends MinimalEObjectImpl.Container implements Stack {
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
	 * The cached value of the '{@link #getChannels() <em>Channels</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannels()
	 * @generated
	 * @ordered
	 */
	protected EList<Channel> channels;

	/**
	 * The cached value of the '{@link #getNetworktype() <em>Networktype</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworktype()
	 * @generated
	 * @ordered
	 */
	protected EList<NetworkType> networktype;

	/**
	 * The cached value of the '{@link #getFilepackage() <em>Filepackage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilepackage()
	 * @generated
	 * @ordered
	 */
	protected EList<FilePackage> filepackage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StackImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatepubsubmodelPackage.Literals.STACK;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StatepubsubmodelPackage.STACK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Channel> getChannels() {
		if (channels == null) {
			channels = new EObjectContainmentEList<Channel>(Channel.class, this,
					StatepubsubmodelPackage.STACK__CHANNELS);
		}
		return channels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NetworkType> getNetworktype() {
		if (networktype == null) {
			networktype = new EDataTypeUniqueEList<NetworkType>(NetworkType.class, this,
					StatepubsubmodelPackage.STACK__NETWORKTYPE);
		}
		return networktype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FilePackage> getFilepackage() {
		if (filepackage == null) {
			filepackage = new EObjectContainmentEList<FilePackage>(FilePackage.class, this,
					StatepubsubmodelPackage.STACK__FILEPACKAGE);
		}
		return filepackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case StatepubsubmodelPackage.STACK__CHANNELS:
			return ((InternalEList<?>) getChannels()).basicRemove(otherEnd, msgs);
		case StatepubsubmodelPackage.STACK__FILEPACKAGE:
			return ((InternalEList<?>) getFilepackage()).basicRemove(otherEnd, msgs);
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
		case StatepubsubmodelPackage.STACK__NAME:
			return getName();
		case StatepubsubmodelPackage.STACK__CHANNELS:
			return getChannels();
		case StatepubsubmodelPackage.STACK__NETWORKTYPE:
			return getNetworktype();
		case StatepubsubmodelPackage.STACK__FILEPACKAGE:
			return getFilepackage();
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
		case StatepubsubmodelPackage.STACK__NAME:
			setName((String) newValue);
			return;
		case StatepubsubmodelPackage.STACK__CHANNELS:
			getChannels().clear();
			getChannels().addAll((Collection<? extends Channel>) newValue);
			return;
		case StatepubsubmodelPackage.STACK__NETWORKTYPE:
			getNetworktype().clear();
			getNetworktype().addAll((Collection<? extends NetworkType>) newValue);
			return;
		case StatepubsubmodelPackage.STACK__FILEPACKAGE:
			getFilepackage().clear();
			getFilepackage().addAll((Collection<? extends FilePackage>) newValue);
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
		case StatepubsubmodelPackage.STACK__NAME:
			setName(NAME_EDEFAULT);
			return;
		case StatepubsubmodelPackage.STACK__CHANNELS:
			getChannels().clear();
			return;
		case StatepubsubmodelPackage.STACK__NETWORKTYPE:
			getNetworktype().clear();
			return;
		case StatepubsubmodelPackage.STACK__FILEPACKAGE:
			getFilepackage().clear();
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
		case StatepubsubmodelPackage.STACK__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case StatepubsubmodelPackage.STACK__CHANNELS:
			return channels != null && !channels.isEmpty();
		case StatepubsubmodelPackage.STACK__NETWORKTYPE:
			return networktype != null && !networktype.isEmpty();
		case StatepubsubmodelPackage.STACK__FILEPACKAGE:
			return filepackage != null && !filepackage.isEmpty();
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
		result.append(", networktype: ");
		result.append(networktype);
		result.append(')');
		return result.toString();
	}

} //StackImpl
