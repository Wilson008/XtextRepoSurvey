/**
 */
package es.udima.cesarlaso.tfm.healthmonitors.impl;

import es.udima.cesarlaso.tfm.healthmonitors.HealthmonitorsPackage;
import es.udima.cesarlaso.tfm.healthmonitors.StorageData;
import es.udima.cesarlaso.tfm.healthmonitors.StoragePartition;
import es.udima.cesarlaso.tfm.healthmonitors.StorageStats;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Storage Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.udima.cesarlaso.tfm.healthmonitors.impl.StorageDataImpl#getPartitions <em>Partitions</em>}</li>
 *   <li>{@link es.udima.cesarlaso.tfm.healthmonitors.impl.StorageDataImpl#getStats <em>Stats</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StorageDataImpl extends HealthMonitorDataImpl implements StorageData {
	/**
	 * The cached value of the '{@link #getPartitions() <em>Partitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartitions()
	 * @generated
	 * @ordered
	 */
	protected EList<StoragePartition> partitions;

	/**
	 * The cached value of the '{@link #getStats() <em>Stats</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStats()
	 * @generated
	 * @ordered
	 */
	protected EList<StorageStats> stats;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StorageDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HealthmonitorsPackage.Literals.STORAGE_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StoragePartition> getPartitions() {
		if (partitions == null) {
			partitions = new EObjectContainmentEList<StoragePartition>(StoragePartition.class, this, HealthmonitorsPackage.STORAGE_DATA__PARTITIONS);
		}
		return partitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StorageStats> getStats() {
		if (stats == null) {
			stats = new EObjectContainmentEList<StorageStats>(StorageStats.class, this, HealthmonitorsPackage.STORAGE_DATA__STATS);
		}
		return stats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HealthmonitorsPackage.STORAGE_DATA__PARTITIONS:
				return ((InternalEList<?>)getPartitions()).basicRemove(otherEnd, msgs);
			case HealthmonitorsPackage.STORAGE_DATA__STATS:
				return ((InternalEList<?>)getStats()).basicRemove(otherEnd, msgs);
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
			case HealthmonitorsPackage.STORAGE_DATA__PARTITIONS:
				return getPartitions();
			case HealthmonitorsPackage.STORAGE_DATA__STATS:
				return getStats();
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
			case HealthmonitorsPackage.STORAGE_DATA__PARTITIONS:
				getPartitions().clear();
				getPartitions().addAll((Collection<? extends StoragePartition>)newValue);
				return;
			case HealthmonitorsPackage.STORAGE_DATA__STATS:
				getStats().clear();
				getStats().addAll((Collection<? extends StorageStats>)newValue);
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
			case HealthmonitorsPackage.STORAGE_DATA__PARTITIONS:
				getPartitions().clear();
				return;
			case HealthmonitorsPackage.STORAGE_DATA__STATS:
				getStats().clear();
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
			case HealthmonitorsPackage.STORAGE_DATA__PARTITIONS:
				return partitions != null && !partitions.isEmpty();
			case HealthmonitorsPackage.STORAGE_DATA__STATS:
				return stats != null && !stats.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StorageDataImpl
