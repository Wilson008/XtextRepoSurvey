/**
 */
package es.udima.cesarlaso.tfm.operatingsystemactuators.impl;

import es.udima.cesarlaso.tfm.operatingsystemactuators.Download;
import es.udima.cesarlaso.tfm.operatingsystemactuators.FilePath;
import es.udima.cesarlaso.tfm.operatingsystemactuators.OperatingsystemactuatorsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Download</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.udima.cesarlaso.tfm.operatingsystemactuators.impl.DownloadImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link es.udima.cesarlaso.tfm.operatingsystemactuators.impl.DownloadImpl#getFilePath <em>File Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DownloadImpl extends OperatingSystemActuatorImpl implements Download {
	/**
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected String url = URL_EDEFAULT;

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
	protected DownloadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OperatingsystemactuatorsPackage.Literals.DOWNLOAD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUrl(String newUrl) {
		String oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperatingsystemactuatorsPackage.DOWNLOAD__URL, oldUrl, url));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OperatingsystemactuatorsPackage.DOWNLOAD__FILE_PATH, oldFilePath, filePath));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OperatingsystemactuatorsPackage.DOWNLOAD__FILE_PATH, oldFilePath, filePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OperatingsystemactuatorsPackage.DOWNLOAD__URL:
				return getUrl();
			case OperatingsystemactuatorsPackage.DOWNLOAD__FILE_PATH:
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
			case OperatingsystemactuatorsPackage.DOWNLOAD__URL:
				setUrl((String)newValue);
				return;
			case OperatingsystemactuatorsPackage.DOWNLOAD__FILE_PATH:
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
			case OperatingsystemactuatorsPackage.DOWNLOAD__URL:
				setUrl(URL_EDEFAULT);
				return;
			case OperatingsystemactuatorsPackage.DOWNLOAD__FILE_PATH:
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
			case OperatingsystemactuatorsPackage.DOWNLOAD__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
			case OperatingsystemactuatorsPackage.DOWNLOAD__FILE_PATH:
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
		result.append(" (url: ");
		result.append(url);
		result.append(')');
		return result.toString();
	}

} //DownloadImpl
