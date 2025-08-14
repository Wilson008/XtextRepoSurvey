/**
 */
package es.udima.cesarlaso.tfm.operatingsystemactuators.impl;

import es.udima.cesarlaso.tfm.operatingsystemactuators.FilePath;
import es.udima.cesarlaso.tfm.operatingsystemactuators.OperatingsystemactuatorsPackage;
import es.udima.cesarlaso.tfm.operatingsystemactuators.PlaySound;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Play Sound</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.udima.cesarlaso.tfm.operatingsystemactuators.impl.PlaySoundImpl#getVolume <em>Volume</em>}</li>
 *   <li>{@link es.udima.cesarlaso.tfm.operatingsystemactuators.impl.PlaySoundImpl#getFilePath <em>File Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlaySoundImpl extends OperatingSystemActuatorImpl implements PlaySound {
	/**
	 * The default value of the '{@link #getVolume() <em>Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolume()
	 * @generated
	 * @ordered
	 */
	protected static final int VOLUME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getVolume() <em>Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolume()
	 * @generated
	 * @ordered
	 */
	protected int volume = VOLUME_EDEFAULT;

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
	protected PlaySoundImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OperatingsystemactuatorsPackage.Literals.PLAY_SOUND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getVolume() {
		return volume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVolume(int newVolume) {
		int oldVolume = volume;
		volume = newVolume;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperatingsystemactuatorsPackage.PLAY_SOUND__VOLUME, oldVolume, volume));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OperatingsystemactuatorsPackage.PLAY_SOUND__FILE_PATH, oldFilePath, filePath));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OperatingsystemactuatorsPackage.PLAY_SOUND__FILE_PATH, oldFilePath, filePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OperatingsystemactuatorsPackage.PLAY_SOUND__VOLUME:
				return getVolume();
			case OperatingsystemactuatorsPackage.PLAY_SOUND__FILE_PATH:
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
			case OperatingsystemactuatorsPackage.PLAY_SOUND__VOLUME:
				setVolume((Integer)newValue);
				return;
			case OperatingsystemactuatorsPackage.PLAY_SOUND__FILE_PATH:
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
			case OperatingsystemactuatorsPackage.PLAY_SOUND__VOLUME:
				setVolume(VOLUME_EDEFAULT);
				return;
			case OperatingsystemactuatorsPackage.PLAY_SOUND__FILE_PATH:
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
			case OperatingsystemactuatorsPackage.PLAY_SOUND__VOLUME:
				return volume != VOLUME_EDEFAULT;
			case OperatingsystemactuatorsPackage.PLAY_SOUND__FILE_PATH:
				return filePath != null;
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
		result.append(" (volume: ");
		result.append(volume);
		result.append(')');
		return result.toString();
	}

} //PlaySoundImpl
