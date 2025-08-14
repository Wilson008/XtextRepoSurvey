/**
 */
package es.udima.cesarlaso.tfm.communicationsprograms.impl;

import es.udima.cesarlaso.tfm.communicationsprograms.CommunicationsprogramsPackage;
import es.udima.cesarlaso.tfm.communicationsprograms.ProgramActuatorService;
import es.udima.cesarlaso.tfm.communicationsprograms.RemoteActuator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Program Actuator Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.udima.cesarlaso.tfm.communicationsprograms.impl.ProgramActuatorServiceImpl#getActuator <em>Actuator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgramActuatorServiceImpl extends ProgramServiceImpl implements ProgramActuatorService {
	/**
	 * The cached value of the '{@link #getActuator() <em>Actuator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActuator()
	 * @generated
	 * @ordered
	 */
	protected RemoteActuator actuator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgramActuatorServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommunicationsprogramsPackage.Literals.PROGRAM_ACTUATOR_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RemoteActuator getActuator() {
		return actuator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActuator(RemoteActuator newActuator, NotificationChain msgs) {
		RemoteActuator oldActuator = actuator;
		actuator = newActuator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CommunicationsprogramsPackage.PROGRAM_ACTUATOR_SERVICE__ACTUATOR, oldActuator, newActuator);
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
	public void setActuator(RemoteActuator newActuator) {
		if (newActuator != actuator) {
			NotificationChain msgs = null;
			if (actuator != null)
				msgs = ((InternalEObject)actuator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CommunicationsprogramsPackage.PROGRAM_ACTUATOR_SERVICE__ACTUATOR, null, msgs);
			if (newActuator != null)
				msgs = ((InternalEObject)newActuator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CommunicationsprogramsPackage.PROGRAM_ACTUATOR_SERVICE__ACTUATOR, null, msgs);
			msgs = basicSetActuator(newActuator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationsprogramsPackage.PROGRAM_ACTUATOR_SERVICE__ACTUATOR, newActuator, newActuator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CommunicationsprogramsPackage.PROGRAM_ACTUATOR_SERVICE__ACTUATOR:
				return basicSetActuator(null, msgs);
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
			case CommunicationsprogramsPackage.PROGRAM_ACTUATOR_SERVICE__ACTUATOR:
				return getActuator();
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
			case CommunicationsprogramsPackage.PROGRAM_ACTUATOR_SERVICE__ACTUATOR:
				setActuator((RemoteActuator)newValue);
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
			case CommunicationsprogramsPackage.PROGRAM_ACTUATOR_SERVICE__ACTUATOR:
				setActuator((RemoteActuator)null);
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
			case CommunicationsprogramsPackage.PROGRAM_ACTUATOR_SERVICE__ACTUATOR:
				return actuator != null;
		}
		return super.eIsSet(featureID);
	}

} //ProgramActuatorServiceImpl
