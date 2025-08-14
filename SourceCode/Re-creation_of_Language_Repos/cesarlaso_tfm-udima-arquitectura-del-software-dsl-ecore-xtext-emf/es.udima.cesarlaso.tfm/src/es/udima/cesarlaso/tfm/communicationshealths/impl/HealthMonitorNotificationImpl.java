/**
 */
package es.udima.cesarlaso.tfm.communicationshealths.impl;

import es.udima.cesarlaso.tfm.communicationshealths.CommunicationshealthsPackage;
import es.udima.cesarlaso.tfm.communicationshealths.HealthMonitorNotification;

import es.udima.cesarlaso.tfm.healthmonitors.HealthMonitorData;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Health Monitor Notification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.udima.cesarlaso.tfm.communicationshealths.impl.HealthMonitorNotificationImpl#getMonitor <em>Monitor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HealthMonitorNotificationImpl extends HealthServiceImpl implements HealthMonitorNotification {
	/**
	 * The cached value of the '{@link #getMonitor() <em>Monitor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitor()
	 * @generated
	 * @ordered
	 */
	protected EList<HealthMonitorData> monitor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HealthMonitorNotificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommunicationshealthsPackage.Literals.HEALTH_MONITOR_NOTIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<HealthMonitorData> getMonitor() {
		if (monitor == null) {
			monitor = new EObjectContainmentEList<HealthMonitorData>(HealthMonitorData.class, this, CommunicationshealthsPackage.HEALTH_MONITOR_NOTIFICATION__MONITOR);
		}
		return monitor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CommunicationshealthsPackage.HEALTH_MONITOR_NOTIFICATION__MONITOR:
				return ((InternalEList<?>)getMonitor()).basicRemove(otherEnd, msgs);
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
			case CommunicationshealthsPackage.HEALTH_MONITOR_NOTIFICATION__MONITOR:
				return getMonitor();
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
			case CommunicationshealthsPackage.HEALTH_MONITOR_NOTIFICATION__MONITOR:
				getMonitor().clear();
				getMonitor().addAll((Collection<? extends HealthMonitorData>)newValue);
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
			case CommunicationshealthsPackage.HEALTH_MONITOR_NOTIFICATION__MONITOR:
				getMonitor().clear();
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
			case CommunicationshealthsPackage.HEALTH_MONITOR_NOTIFICATION__MONITOR:
				return monitor != null && !monitor.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //HealthMonitorNotificationImpl
