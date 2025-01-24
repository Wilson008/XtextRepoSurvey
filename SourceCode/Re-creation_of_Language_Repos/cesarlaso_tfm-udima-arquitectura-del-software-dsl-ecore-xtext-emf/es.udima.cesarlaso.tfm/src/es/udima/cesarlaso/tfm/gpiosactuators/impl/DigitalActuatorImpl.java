/**
 */
package es.udima.cesarlaso.tfm.gpiosactuators.impl;

import es.udima.cesarlaso.tfm.gpios.DigitalOutputPin;

import es.udima.cesarlaso.tfm.gpiosactuators.DigitalActuator;
import es.udima.cesarlaso.tfm.gpiosactuators.GpiosactuatorsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Digital Actuator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.udima.cesarlaso.tfm.gpiosactuators.impl.DigitalActuatorImpl#getPin <em>Pin</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DigitalActuatorImpl extends GpioActuatorImpl implements DigitalActuator {
	/**
	 * The cached value of the '{@link #getPin() <em>Pin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPin()
	 * @generated
	 * @ordered
	 */
	protected DigitalOutputPin pin;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DigitalActuatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GpiosactuatorsPackage.Literals.DIGITAL_ACTUATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DigitalOutputPin getPin() {
		if (pin != null && pin.eIsProxy()) {
			InternalEObject oldPin = (InternalEObject)pin;
			pin = (DigitalOutputPin)eResolveProxy(oldPin);
			if (pin != oldPin) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GpiosactuatorsPackage.DIGITAL_ACTUATOR__PIN, oldPin, pin));
			}
		}
		return pin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DigitalOutputPin basicGetPin() {
		return pin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPin(DigitalOutputPin newPin) {
		DigitalOutputPin oldPin = pin;
		pin = newPin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GpiosactuatorsPackage.DIGITAL_ACTUATOR__PIN, oldPin, pin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GpiosactuatorsPackage.DIGITAL_ACTUATOR__PIN:
				if (resolve) return getPin();
				return basicGetPin();
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
			case GpiosactuatorsPackage.DIGITAL_ACTUATOR__PIN:
				setPin((DigitalOutputPin)newValue);
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
			case GpiosactuatorsPackage.DIGITAL_ACTUATOR__PIN:
				setPin((DigitalOutputPin)null);
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
			case GpiosactuatorsPackage.DIGITAL_ACTUATOR__PIN:
				return pin != null;
		}
		return super.eIsSet(featureID);
	}

} //DigitalActuatorImpl
