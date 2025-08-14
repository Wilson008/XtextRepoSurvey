/**
 */
package House2.impl;

import House2.House2Package;
import House2.RollerBlind;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Roller Blind</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link House2.impl.RollerBlindImpl#isIsUp <em>Is Up</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RollerBlindImpl extends ActorImpl implements RollerBlind {
	/**
	 * The default value of the '{@link #isIsUp() <em>Is Up</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsUp()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_UP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsUp() <em>Is Up</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsUp()
	 * @generated
	 * @ordered
	 */
	protected boolean isUp = IS_UP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RollerBlindImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return House2Package.Literals.ROLLER_BLIND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsUp() {
		return isUp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsUp(boolean newIsUp) {
		boolean oldIsUp = isUp;
		isUp = newIsUp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, House2Package.ROLLER_BLIND__IS_UP, oldIsUp, isUp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case House2Package.ROLLER_BLIND__IS_UP:
				return isIsUp();
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
			case House2Package.ROLLER_BLIND__IS_UP:
				setIsUp((Boolean)newValue);
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
			case House2Package.ROLLER_BLIND__IS_UP:
				setIsUp(IS_UP_EDEFAULT);
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
			case House2Package.ROLLER_BLIND__IS_UP:
				return isUp != IS_UP_EDEFAULT;
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
		result.append(" (isUp: ");
		result.append(isUp);
		result.append(')');
		return result.toString();
	}

} //RollerBlindImpl
