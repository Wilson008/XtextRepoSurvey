/**
 */
package House2.impl;

import House2.EqualCondition;
import House2.House2Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Equal Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link House2.impl.EqualConditionImpl#isBoolcond <em>Boolcond</em>}</li>
 *   <li>{@link House2.impl.EqualConditionImpl#getValuecond <em>Valuecond</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EqualConditionImpl extends ConditionImpl implements EqualCondition {
	/**
	 * The default value of the '{@link #isBoolcond() <em>Boolcond</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBoolcond()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BOOLCOND_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBoolcond() <em>Boolcond</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBoolcond()
	 * @generated
	 * @ordered
	 */
	protected boolean boolcond = BOOLCOND_EDEFAULT;

	/**
	 * The default value of the '{@link #getValuecond() <em>Valuecond</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValuecond()
	 * @generated
	 * @ordered
	 */
	protected static final double VALUECOND_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getValuecond() <em>Valuecond</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValuecond()
	 * @generated
	 * @ordered
	 */
	protected double valuecond = VALUECOND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EqualConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return House2Package.Literals.EQUAL_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isBoolcond() {
		return boolcond;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBoolcond(boolean newBoolcond) {
		boolean oldBoolcond = boolcond;
		boolcond = newBoolcond;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, House2Package.EQUAL_CONDITION__BOOLCOND, oldBoolcond, boolcond));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getValuecond() {
		return valuecond;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValuecond(double newValuecond) {
		double oldValuecond = valuecond;
		valuecond = newValuecond;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, House2Package.EQUAL_CONDITION__VALUECOND, oldValuecond, valuecond));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case House2Package.EQUAL_CONDITION__BOOLCOND:
				return isBoolcond();
			case House2Package.EQUAL_CONDITION__VALUECOND:
				return getValuecond();
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
			case House2Package.EQUAL_CONDITION__BOOLCOND:
				setBoolcond((Boolean)newValue);
				return;
			case House2Package.EQUAL_CONDITION__VALUECOND:
				setValuecond((Double)newValue);
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
			case House2Package.EQUAL_CONDITION__BOOLCOND:
				setBoolcond(BOOLCOND_EDEFAULT);
				return;
			case House2Package.EQUAL_CONDITION__VALUECOND:
				setValuecond(VALUECOND_EDEFAULT);
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
			case House2Package.EQUAL_CONDITION__BOOLCOND:
				return boolcond != BOOLCOND_EDEFAULT;
			case House2Package.EQUAL_CONDITION__VALUECOND:
				return valuecond != VALUECOND_EDEFAULT;
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
		result.append(" (boolcond: ");
		result.append(boolcond);
		result.append(", valuecond: ");
		result.append(valuecond);
		result.append(')');
		return result.toString();
	}

} //EqualConditionImpl
