/**
 */
package es.udima.cesarlaso.tfm.gpiosactuators.impl;

import es.udima.cesarlaso.tfm.gpios.AnalogOutputPin;

import es.udima.cesarlaso.tfm.gpiosactuators.AnalogActuator;
import es.udima.cesarlaso.tfm.gpiosactuators.GpiosactuatorsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Analog Actuator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.udima.cesarlaso.tfm.gpiosactuators.impl.AnalogActuatorImpl#getPin <em>Pin</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AnalogActuatorImpl extends GpioActuatorImpl implements AnalogActuator {
	/**
	 * The cached value of the '{@link #getPin() <em>Pin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPin()
	 * @generated
	 * @ordered
	 */
	protected AnalogOutputPin pin;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnalogActuatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GpiosactuatorsPackage.Literals.ANALOG_ACTUATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnalogOutputPin getPin() {
		if (pin != null && pin.eIsProxy()) {
			InternalEObject oldPin = (InternalEObject)pin;
			pin = (AnalogOutputPin)eResolveProxy(oldPin);
			if (pin != oldPin) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GpiosactuatorsPackage.ANALOG_ACTUATOR__PIN, oldPin, pin));
			}
		}
		return pin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalogOutputPin basicGetPin() {
		return pin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPin(AnalogOutputPin newPin) {
		AnalogOutputPin oldPin = pin;
		pin = newPin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GpiosactuatorsPackage.ANALOG_ACTUATOR__PIN, oldPin, pin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GpiosactuatorsPackage.ANALOG_ACTUATOR__PIN:
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
			case GpiosactuatorsPackage.ANALOG_ACTUATOR__PIN:
				setPin((AnalogOutputPin)newValue);
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
			case GpiosactuatorsPackage.ANALOG_ACTUATOR__PIN:
				setPin((AnalogOutputPin)null);
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
			case GpiosactuatorsPackage.ANALOG_ACTUATOR__PIN:
				return pin != null;
		}
		return super.eIsSet(featureID);
	}

} //AnalogActuatorImpl
