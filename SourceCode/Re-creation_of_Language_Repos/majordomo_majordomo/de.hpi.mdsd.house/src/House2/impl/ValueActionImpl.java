/**
 */
package House2.impl;

import House2.House2Package;
import House2.ValueAction;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link House2.impl.ValueActionImpl#getSwitchToValue <em>Switch To Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValueActionImpl extends ActionImpl implements ValueAction {
	/**
	 * The default value of the '{@link #getSwitchToValue() <em>Switch To Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitchToValue()
	 * @generated
	 * @ordered
	 */
	protected static final double SWITCH_TO_VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSwitchToValue() <em>Switch To Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitchToValue()
	 * @generated
	 * @ordered
	 */
	protected double switchToValue = SWITCH_TO_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return House2Package.Literals.VALUE_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getSwitchToValue() {
		return switchToValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSwitchToValue(double newSwitchToValue) {
		double oldSwitchToValue = switchToValue;
		switchToValue = newSwitchToValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, House2Package.VALUE_ACTION__SWITCH_TO_VALUE, oldSwitchToValue, switchToValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case House2Package.VALUE_ACTION__SWITCH_TO_VALUE:
				return getSwitchToValue();
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
			case House2Package.VALUE_ACTION__SWITCH_TO_VALUE:
				setSwitchToValue((Double)newValue);
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
			case House2Package.VALUE_ACTION__SWITCH_TO_VALUE:
				setSwitchToValue(SWITCH_TO_VALUE_EDEFAULT);
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
			case House2Package.VALUE_ACTION__SWITCH_TO_VALUE:
				return switchToValue != SWITCH_TO_VALUE_EDEFAULT;
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
		result.append(" (switchToValue: ");
		result.append(switchToValue);
		result.append(')');
		return result.toString();
	}

} //ValueActionImpl
