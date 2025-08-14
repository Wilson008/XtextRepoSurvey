/**
 */
package es.udima.cesarlaso.tfm.operatingsystemactuators.impl;

import es.udima.cesarlaso.tfm.operatingsystemactuators.FilePath;
import es.udima.cesarlaso.tfm.operatingsystemactuators.OperatingsystemactuatorsPackage;
import es.udima.cesarlaso.tfm.operatingsystemactuators.SystemCommand;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.udima.cesarlaso.tfm.operatingsystemactuators.impl.SystemCommandImpl#getFilePath <em>File Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemCommandImpl extends OperatingSystemActuatorImpl implements SystemCommand {
	/**
	 * The cached value of the '{@link #getFilePath() <em>File Path</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilePath()
	 * @generated
	 * @ordered
	 */
	protected FilePath filePath;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemCommandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OperatingsystemactuatorsPackage.Literals.SYSTEM_COMMAND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FilePath getFilePath() {
		if (filePath != null && filePath.eIsProxy()) {
			InternalEObject oldFilePath = (InternalEObject)filePath;
			filePath = (FilePath)eResolveProxy(oldFilePath);
			if (filePath != oldFilePath) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OperatingsystemactuatorsPackage.SYSTEM_COMMAND__FILE_PATH, oldFilePath, filePath));
			}
		}
		return filePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilePath basicGetFilePath() {
		return filePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFilePath(FilePath newFilePath) {
		FilePath oldFilePath = filePath;
		filePath = newFilePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperatingsystemactuatorsPackage.SYSTEM_COMMAND__FILE_PATH, oldFilePath, filePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OperatingsystemactuatorsPackage.SYSTEM_COMMAND__FILE_PATH:
				if (resolve) return getFilePath();
				return basicGetFilePath();
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
			case OperatingsystemactuatorsPackage.SYSTEM_COMMAND__FILE_PATH:
				setFilePath((FilePath)newValue);
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
			case OperatingsystemactuatorsPackage.SYSTEM_COMMAND__FILE_PATH:
				setFilePath((FilePath)null);
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
			case OperatingsystemactuatorsPackage.SYSTEM_COMMAND__FILE_PATH:
				return filePath != null;
		}
		return super.eIsSet(featureID);
	}

} //SystemCommandImpl
