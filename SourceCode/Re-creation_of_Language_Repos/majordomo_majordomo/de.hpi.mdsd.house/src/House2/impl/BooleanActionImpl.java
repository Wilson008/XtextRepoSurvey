/**
 */
package House2.impl;

import House2.BooleanAction;
import House2.House2Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boolean Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link House2.impl.BooleanActionImpl#isSwitchTo <em>Switch To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BooleanActionImpl extends ActionImpl implements BooleanAction {
	/**
	 * The default value of the '{@link #isSwitchTo() <em>Switch To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSwitchTo()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SWITCH_TO_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSwitchTo() <em>Switch To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSwitchTo()
	 * @generated
	 * @ordered
	 */
	protected boolean switchTo = SWITCH_TO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return House2Package.Literals.BOOLEAN_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSwitchTo() {
		return switchTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSwitchTo(boolean newSwitchTo) {
		boolean oldSwitchTo = switchTo;
		switchTo = newSwitchTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, House2Package.BOOLEAN_ACTION__SWITCH_TO, oldSwitchTo, switchTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case House2Package.BOOLEAN_ACTION__SWITCH_TO:
				return isSwitchTo();
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
			case House2Package.BOOLEAN_ACTION__SWITCH_TO:
				setSwitchTo((Boolean)newValue);
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
			case House2Package.BOOLEAN_ACTION__SWITCH_TO:
				setSwitchTo(SWITCH_TO_EDEFAULT);
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
			case House2Package.BOOLEAN_ACTION__SWITCH_TO:
				return switchTo != SWITCH_TO_EDEFAULT;
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
		result.append(" (switchTo: ");
		result.append(switchTo);
		result.append(')');
		return result.toString();
	}

} //BooleanActionImpl
