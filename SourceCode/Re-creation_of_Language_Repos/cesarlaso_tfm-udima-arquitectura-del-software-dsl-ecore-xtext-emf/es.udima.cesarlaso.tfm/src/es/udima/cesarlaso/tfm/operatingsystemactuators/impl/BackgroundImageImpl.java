/**
 */
package es.udima.cesarlaso.tfm.operatingsystemactuators.impl;

import es.udima.cesarlaso.tfm.operatingsystemactuators.BackgroundImage;
import es.udima.cesarlaso.tfm.operatingsystemactuators.FilePath;
import es.udima.cesarlaso.tfm.operatingsystemactuators.OperatingsystemactuatorsPackage;
import es.udima.cesarlaso.tfm.operatingsystemactuators.ResizeType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Background Image</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.udima.cesarlaso.tfm.operatingsystemactuators.impl.BackgroundImageImpl#getFilePath <em>File Path</em>}</li>
 *   <li>{@link es.udima.cesarlaso.tfm.operatingsystemactuators.impl.BackgroundImageImpl#getResizeType <em>Resize Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BackgroundImageImpl extends OperatingSystemActuatorImpl implements BackgroundImage {
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
	 * The default value of the '{@link #getResizeType() <em>Resize Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResizeType()
	 * @generated
	 * @ordered
	 */
	protected static final ResizeType RESIZE_TYPE_EDEFAULT = ResizeType.NONE;

	/**
	 * The cached value of the '{@link #getResizeType() <em>Resize Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResizeType()
	 * @generated
	 * @ordered
	 */
	protected ResizeType resizeType = RESIZE_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BackgroundImageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OperatingsystemactuatorsPackage.Literals.BACKGROUND_IMAGE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OperatingsystemactuatorsPackage.BACKGROUND_IMAGE__FILE_PATH, oldFilePath, filePath));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OperatingsystemactuatorsPackage.BACKGROUND_IMAGE__FILE_PATH, oldFilePath, filePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResizeType getResizeType() {
		return resizeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResizeType(ResizeType newResizeType) {
		ResizeType oldResizeType = resizeType;
		resizeType = newResizeType == null ? RESIZE_TYPE_EDEFAULT : newResizeType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperatingsystemactuatorsPackage.BACKGROUND_IMAGE__RESIZE_TYPE, oldResizeType, resizeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OperatingsystemactuatorsPackage.BACKGROUND_IMAGE__FILE_PATH:
				if (resolve) return getFilePath();
				return basicGetFilePath();
			case OperatingsystemactuatorsPackage.BACKGROUND_IMAGE__RESIZE_TYPE:
				return getResizeType();
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
			case OperatingsystemactuatorsPackage.BACKGROUND_IMAGE__FILE_PATH:
				setFilePath((FilePath)newValue);
				return;
			case OperatingsystemactuatorsPackage.BACKGROUND_IMAGE__RESIZE_TYPE:
				setResizeType((ResizeType)newValue);
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
			case OperatingsystemactuatorsPackage.BACKGROUND_IMAGE__FILE_PATH:
				setFilePath((FilePath)null);
				return;
			case OperatingsystemactuatorsPackage.BACKGROUND_IMAGE__RESIZE_TYPE:
				setResizeType(RESIZE_TYPE_EDEFAULT);
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
			case OperatingsystemactuatorsPackage.BACKGROUND_IMAGE__FILE_PATH:
				return filePath != null;
			case OperatingsystemactuatorsPackage.BACKGROUND_IMAGE__RESIZE_TYPE:
				return resizeType != RESIZE_TYPE_EDEFAULT;
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
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (resizeType: ");
		result.append(resizeType);
		result.append(')');
		return result.toString();
	}

} //BackgroundImageImpl
