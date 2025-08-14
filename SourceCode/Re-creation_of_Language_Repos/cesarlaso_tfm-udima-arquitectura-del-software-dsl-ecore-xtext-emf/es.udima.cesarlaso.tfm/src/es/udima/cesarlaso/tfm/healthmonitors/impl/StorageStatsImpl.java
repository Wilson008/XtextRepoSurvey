/**
 */
package es.udima.cesarlaso.tfm.healthmonitors.impl;

import es.udima.cesarlaso.tfm.healthmonitors.HealthmonitorsPackage;
import es.udima.cesarlaso.tfm.healthmonitors.StorageStats;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Storage Stats</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.udima.cesarlaso.tfm.healthmonitors.impl.StorageStatsImpl#getDevice <em>Device</em>}</li>
 *   <li>{@link es.udima.cesarlaso.tfm.healthmonitors.impl.StorageStatsImpl#getReads <em>Reads</em>}</li>
 *   <li>{@link es.udima.cesarlaso.tfm.healthmonitors.impl.StorageStatsImpl#getWrites <em>Writes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StorageStatsImpl extends MinimalEObjectImpl.Container implements StorageStats {
	/**
	 * The default value of the '{@link #getDevice() <em>Device</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevice()
	 * @generated
	 * @ordered
	 */
	protected static final String DEVICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDevice() <em>Device</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevice()
	 * @generated
	 * @ordered
	 */
	protected String device = DEVICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getReads() <em>Reads</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReads()
	 * @generated
	 * @ordered
	 */
	protected static final long READS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getReads() <em>Reads</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReads()
	 * @generated
	 * @ordered
	 */
	protected long reads = READS_EDEFAULT;

	/**
	 * The default value of the '{@link #getWrites() <em>Writes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrites()
	 * @generated
	 * @ordered
	 */
	protected static final long WRITES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getWrites() <em>Writes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrites()
	 * @generated
	 * @ordered
	 */
	protected long writes = WRITES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StorageStatsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HealthmonitorsPackage.Literals.STORAGE_STATS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDevice() {
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDevice(String newDevice) {
		String oldDevice = device;
		device = newDevice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HealthmonitorsPackage.STORAGE_STATS__DEVICE, oldDevice, device));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getReads() {
		return reads;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReads(long newReads) {
		long oldReads = reads;
		reads = newReads;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HealthmonitorsPackage.STORAGE_STATS__READS, oldReads, reads));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getWrites() {
		return writes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWrites(long newWrites) {
		long oldWrites = writes;
		writes = newWrites;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HealthmonitorsPackage.STORAGE_STATS__WRITES, oldWrites, writes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HealthmonitorsPackage.STORAGE_STATS__DEVICE:
				return getDevice();
			case HealthmonitorsPackage.STORAGE_STATS__READS:
				return getReads();
			case HealthmonitorsPackage.STORAGE_STATS__WRITES:
				return getWrites();
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
			case HealthmonitorsPackage.STORAGE_STATS__DEVICE:
				setDevice((String)newValue);
				return;
			case HealthmonitorsPackage.STORAGE_STATS__READS:
				setReads((Long)newValue);
				return;
			case HealthmonitorsPackage.STORAGE_STATS__WRITES:
				setWrites((Long)newValue);
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
			case HealthmonitorsPackage.STORAGE_STATS__DEVICE:
				setDevice(DEVICE_EDEFAULT);
				return;
			case HealthmonitorsPackage.STORAGE_STATS__READS:
				setReads(READS_EDEFAULT);
				return;
			case HealthmonitorsPackage.STORAGE_STATS__WRITES:
				setWrites(WRITES_EDEFAULT);
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
			case HealthmonitorsPackage.STORAGE_STATS__DEVICE:
				return DEVICE_EDEFAULT == null ? device != null : !DEVICE_EDEFAULT.equals(device);
			case HealthmonitorsPackage.STORAGE_STATS__READS:
				return reads != READS_EDEFAULT;
			case HealthmonitorsPackage.STORAGE_STATS__WRITES:
				return writes != WRITES_EDEFAULT;
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
		result.append(" (device: ");
		result.append(device);
		result.append(", reads: ");
		result.append(reads);
		result.append(", writes: ");
		result.append(writes);
		result.append(')');
		return result.toString();
	}

} //StorageStatsImpl
