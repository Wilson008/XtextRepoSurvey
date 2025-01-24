/**
 */
package es.udima.cesarlaso.tfm.gpiosevents.impl;

import es.udima.cesarlaso.tfm.gpios.AnalogInputPin;

import es.udima.cesarlaso.tfm.gpiosevents.AnalogEvent;
import es.udima.cesarlaso.tfm.gpiosevents.GpioseventsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Analog Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.udima.cesarlaso.tfm.gpiosevents.impl.AnalogEventImpl#getPin <em>Pin</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AnalogEventImpl extends GpioEventImpl implements AnalogEvent {
	/**
	 * The cached value of the '{@link #getPin() <em>Pin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPin()
	 * @generated
	 * @ordered
	 */
	protected AnalogInputPin pin;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnalogEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GpioseventsPackage.Literals.ANALOG_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnalogInputPin getPin() {
		if (pin != null && pin.eIsProxy()) {
			InternalEObject oldPin = (InternalEObject)pin;
			pin = (AnalogInputPin)eResolveProxy(oldPin);
			if (pin != oldPin) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GpioseventsPackage.ANALOG_EVENT__PIN, oldPin, pin));
			}
		}
		return pin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalogInputPin basicGetPin() {
		return pin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPin(AnalogInputPin newPin) {
		AnalogInputPin oldPin = pin;
		pin = newPin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GpioseventsPackage.ANALOG_EVENT__PIN, oldPin, pin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GpioseventsPackage.ANALOG_EVENT__PIN:
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
			case GpioseventsPackage.ANALOG_EVENT__PIN:
				setPin((AnalogInputPin)newValue);
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
			case GpioseventsPackage.ANALOG_EVENT__PIN:
				setPin((AnalogInputPin)null);
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
			case GpioseventsPackage.ANALOG_EVENT__PIN:
				return pin != null;
		}
		return super.eIsSet(featureID);
	}

} //AnalogEventImpl
