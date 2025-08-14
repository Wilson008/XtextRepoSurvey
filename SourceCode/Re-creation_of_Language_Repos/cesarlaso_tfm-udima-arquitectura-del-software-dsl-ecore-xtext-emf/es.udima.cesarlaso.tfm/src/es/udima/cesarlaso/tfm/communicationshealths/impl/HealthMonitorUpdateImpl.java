/**
 */
package es.udima.cesarlaso.tfm.communicationshealths.impl;

import es.udima.cesarlaso.tfm.communications.CommunicationsPackage;
import es.udima.cesarlaso.tfm.communications.ServiceResponse;

import es.udima.cesarlaso.tfm.communicationshealths.CommunicationshealthsPackage;
import es.udima.cesarlaso.tfm.communicationshealths.HealthMonitorUpdate;

import es.udima.cesarlaso.tfm.healthmonitors.HealthMonitorData;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Health Monitor Update</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.udima.cesarlaso.tfm.communicationshealths.impl.HealthMonitorUpdateImpl#getRequestId <em>Request Id</em>}</li>
 *   <li>{@link es.udima.cesarlaso.tfm.communicationshealths.impl.HealthMonitorUpdateImpl#getMonitor <em>Monitor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HealthMonitorUpdateImpl extends HealthServiceImpl implements HealthMonitorUpdate {
	/**
	 * The default value of the '{@link #getRequestId() <em>Request Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestId()
	 * @generated
	 * @ordered
	 */
	protected static final int REQUEST_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRequestId() <em>Request Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestId()
	 * @generated
	 * @ordered
	 */
	protected int requestId = REQUEST_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMonitor() <em>Monitor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitor()
	 * @generated
	 * @ordered
	 */
	protected HealthMonitorData monitor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HealthMonitorUpdateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommunicationshealthsPackage.Literals.HEALTH_MONITOR_UPDATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getRequestId() {
		return requestId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequestId(int newRequestId) {
		int oldRequestId = requestId;
		requestId = newRequestId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationshealthsPackage.HEALTH_MONITOR_UPDATE__REQUEST_ID, oldRequestId, requestId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HealthMonitorData getMonitor() {
		return monitor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMonitor(HealthMonitorData newMonitor, NotificationChain msgs) {
		HealthMonitorData oldMonitor = monitor;
		monitor = newMonitor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CommunicationshealthsPackage.HEALTH_MONITOR_UPDATE__MONITOR, oldMonitor, newMonitor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMonitor(HealthMonitorData newMonitor) {
		if (newMonitor != monitor) {
			NotificationChain msgs = null;
			if (monitor != null)
				msgs = ((InternalEObject)monitor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CommunicationshealthsPackage.HEALTH_MONITOR_UPDATE__MONITOR, null, msgs);
			if (newMonitor != null)
				msgs = ((InternalEObject)newMonitor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CommunicationshealthsPackage.HEALTH_MONITOR_UPDATE__MONITOR, null, msgs);
			msgs = basicSetMonitor(newMonitor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationshealthsPackage.HEALTH_MONITOR_UPDATE__MONITOR, newMonitor, newMonitor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CommunicationshealthsPackage.HEALTH_MONITOR_UPDATE__MONITOR:
				return basicSetMonitor(null, msgs);
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
			case CommunicationshealthsPackage.HEALTH_MONITOR_UPDATE__REQUEST_ID:
				return getRequestId();
			case CommunicationshealthsPackage.HEALTH_MONITOR_UPDATE__MONITOR:
				return getMonitor();
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
			case CommunicationshealthsPackage.HEALTH_MONITOR_UPDATE__REQUEST_ID:
				setRequestId((Integer)newValue);
				return;
			case CommunicationshealthsPackage.HEALTH_MONITOR_UPDATE__MONITOR:
				setMonitor((HealthMonitorData)newValue);
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
			case CommunicationshealthsPackage.HEALTH_MONITOR_UPDATE__REQUEST_ID:
				setRequestId(REQUEST_ID_EDEFAULT);
				return;
			case CommunicationshealthsPackage.HEALTH_MONITOR_UPDATE__MONITOR:
				setMonitor((HealthMonitorData)null);
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
			case CommunicationshealthsPackage.HEALTH_MONITOR_UPDATE__REQUEST_ID:
				return requestId != REQUEST_ID_EDEFAULT;
			case CommunicationshealthsPackage.HEALTH_MONITOR_UPDATE__MONITOR:
				return monitor != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ServiceResponse.class) {
			switch (derivedFeatureID) {
				case CommunicationshealthsPackage.HEALTH_MONITOR_UPDATE__REQUEST_ID: return CommunicationsPackage.SERVICE_RESPONSE__REQUEST_ID;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ServiceResponse.class) {
			switch (baseFeatureID) {
				case CommunicationsPackage.SERVICE_RESPONSE__REQUEST_ID: return CommunicationshealthsPackage.HEALTH_MONITOR_UPDATE__REQUEST_ID;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (requestId: ");
		result.append(requestId);
		result.append(')');
		return result.toString();
	}

} //HealthMonitorUpdateImpl
