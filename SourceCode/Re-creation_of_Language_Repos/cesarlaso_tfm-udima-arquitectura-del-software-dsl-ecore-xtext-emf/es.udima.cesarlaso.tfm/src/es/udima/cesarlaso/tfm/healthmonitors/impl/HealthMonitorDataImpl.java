/**
 */
package es.udima.cesarlaso.tfm.healthmonitors.impl;

import es.udima.cesarlaso.tfm.healthmonitors.HealthMonitorData;
import es.udima.cesarlaso.tfm.healthmonitors.HealthmonitorsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Health Monitor Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.udima.cesarlaso.tfm.healthmonitors.impl.HealthMonitorDataImpl#getAdquisitionTimestamp <em>Adquisition Timestamp</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class HealthMonitorDataImpl extends MinimalEObjectImpl.Container implements HealthMonitorData {
	/**
	 * The default value of the '{@link #getAdquisitionTimestamp() <em>Adquisition Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdquisitionTimestamp()
	 * @generated
	 * @ordered
	 */
	protected static final long ADQUISITION_TIMESTAMP_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getAdquisitionTimestamp() <em>Adquisition Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdquisitionTimestamp()
	 * @generated
	 * @ordered
	 */
	protected long adquisitionTimestamp = ADQUISITION_TIMESTAMP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HealthMonitorDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HealthmonitorsPackage.Literals.HEALTH_MONITOR_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getAdquisitionTimestamp() {
		return adquisitionTimestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdquisitionTimestamp(long newAdquisitionTimestamp) {
		long oldAdquisitionTimestamp = adquisitionTimestamp;
		adquisitionTimestamp = newAdquisitionTimestamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HealthmonitorsPackage.HEALTH_MONITOR_DATA__ADQUISITION_TIMESTAMP, oldAdquisitionTimestamp, adquisitionTimestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HealthmonitorsPackage.HEALTH_MONITOR_DATA__ADQUISITION_TIMESTAMP:
				return getAdquisitionTimestamp();
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
			case HealthmonitorsPackage.HEALTH_MONITOR_DATA__ADQUISITION_TIMESTAMP:
				setAdquisitionTimestamp((Long)newValue);
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
			case HealthmonitorsPackage.HEALTH_MONITOR_DATA__ADQUISITION_TIMESTAMP:
				setAdquisitionTimestamp(ADQUISITION_TIMESTAMP_EDEFAULT);
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
			case HealthmonitorsPackage.HEALTH_MONITOR_DATA__ADQUISITION_TIMESTAMP:
				return adquisitionTimestamp != ADQUISITION_TIMESTAMP_EDEFAULT;
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
		result.append(" (adquisitionTimestamp: ");
		result.append(adquisitionTimestamp);
		result.append(')');
		return result.toString();
	}

} //HealthMonitorDataImpl
