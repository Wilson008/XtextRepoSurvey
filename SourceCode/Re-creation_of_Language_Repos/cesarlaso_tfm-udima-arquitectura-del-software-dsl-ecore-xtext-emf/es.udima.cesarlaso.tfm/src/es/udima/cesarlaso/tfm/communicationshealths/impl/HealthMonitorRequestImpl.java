/**
 */
package es.udima.cesarlaso.tfm.communicationshealths.impl;

import es.udima.cesarlaso.tfm.communications.CommunicationsPackage;
import es.udima.cesarlaso.tfm.communications.ServiceRequest;

import es.udima.cesarlaso.tfm.communicationshealths.CommunicationshealthsPackage;
import es.udima.cesarlaso.tfm.communicationshealths.HealthMonitorRequest;

import es.udima.cesarlaso.tfm.healthmonitors.HealthMonitor;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Health Monitor Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.udima.cesarlaso.tfm.communicationshealths.impl.HealthMonitorRequestImpl#getId <em>Id</em>}</li>
 *   <li>{@link es.udima.cesarlaso.tfm.communicationshealths.impl.HealthMonitorRequestImpl#getMonitor <em>Monitor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HealthMonitorRequestImpl extends HealthServiceImpl implements HealthMonitorRequest {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMonitor() <em>Monitor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitor()
	 * @generated
	 * @ordered
	 */
	protected HealthMonitor monitor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HealthMonitorRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommunicationshealthsPackage.Literals.HEALTH_MONITOR_REQUEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationshealthsPackage.HEALTH_MONITOR_REQUEST__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HealthMonitor getMonitor() {
		return monitor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMonitor(HealthMonitor newMonitor, NotificationChain msgs) {
		HealthMonitor oldMonitor = monitor;
		monitor = newMonitor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CommunicationshealthsPackage.HEALTH_MONITOR_REQUEST__MONITOR, oldMonitor, newMonitor);
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
	public void setMonitor(HealthMonitor newMonitor) {
		if (newMonitor != monitor) {
			NotificationChain msgs = null;
			if (monitor != null)
				msgs = ((InternalEObject)monitor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CommunicationshealthsPackage.HEALTH_MONITOR_REQUEST__MONITOR, null, msgs);
			if (newMonitor != null)
				msgs = ((InternalEObject)newMonitor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CommunicationshealthsPackage.HEALTH_MONITOR_REQUEST__MONITOR, null, msgs);
			msgs = basicSetMonitor(newMonitor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationshealthsPackage.HEALTH_MONITOR_REQUEST__MONITOR, newMonitor, newMonitor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CommunicationshealthsPackage.HEALTH_MONITOR_REQUEST__MONITOR:
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
			case CommunicationshealthsPackage.HEALTH_MONITOR_REQUEST__ID:
				return getId();
			case CommunicationshealthsPackage.HEALTH_MONITOR_REQUEST__MONITOR:
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
			case CommunicationshealthsPackage.HEALTH_MONITOR_REQUEST__ID:
				setId((Integer)newValue);
				return;
			case CommunicationshealthsPackage.HEALTH_MONITOR_REQUEST__MONITOR:
				setMonitor((HealthMonitor)newValue);
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
			case CommunicationshealthsPackage.HEALTH_MONITOR_REQUEST__ID:
				setId(ID_EDEFAULT);
				return;
			case CommunicationshealthsPackage.HEALTH_MONITOR_REQUEST__MONITOR:
				setMonitor((HealthMonitor)null);
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
			case CommunicationshealthsPackage.HEALTH_MONITOR_REQUEST__ID:
				return id != ID_EDEFAULT;
			case CommunicationshealthsPackage.HEALTH_MONITOR_REQUEST__MONITOR:
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
		if (baseClass == ServiceRequest.class) {
			switch (derivedFeatureID) {
				case CommunicationshealthsPackage.HEALTH_MONITOR_REQUEST__ID: return CommunicationsPackage.SERVICE_REQUEST__ID;
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
		if (baseClass == ServiceRequest.class) {
			switch (baseFeatureID) {
				case CommunicationsPackage.SERVICE_REQUEST__ID: return CommunicationshealthsPackage.HEALTH_MONITOR_REQUEST__ID;
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
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //HealthMonitorRequestImpl
