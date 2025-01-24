/**
 */
package hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl;

import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.StatepubsubmodelPackage;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.StringParameter;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>String Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StringParameterImpl#getDefaultval <em>Defaultval</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StringParameterImpl extends NodeParameterImpl implements StringParameter {
	/**
	 * The default value of the '{@link #getDefaultval() <em>Defaultval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultval()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULTVAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultval() <em>Defaultval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultval()
	 * @generated
	 * @ordered
	 */
	protected String defaultval = DEFAULTVAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatepubsubmodelPackage.Literals.STRING_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultval() {
		return defaultval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultval(String newDefaultval) {
		String oldDefaultval = defaultval;
		defaultval = newDefaultval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatepubsubmodelPackage.STRING_PARAMETER__DEFAULTVAL,
					oldDefaultval, defaultval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case StatepubsubmodelPackage.STRING_PARAMETER__DEFAULTVAL:
			return getDefaultval();
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
		case StatepubsubmodelPackage.STRING_PARAMETER__DEFAULTVAL:
			setDefaultval((String) newValue);
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
		case StatepubsubmodelPackage.STRING_PARAMETER__DEFAULTVAL:
			setDefaultval(DEFAULTVAL_EDEFAULT);
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
		case StatepubsubmodelPackage.STRING_PARAMETER__DEFAULTVAL:
			return DEFAULTVAL_EDEFAULT == null ? defaultval != null : !DEFAULTVAL_EDEFAULT.equals(defaultval);
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (defaultval: ");
		result.append(defaultval);
		result.append(')');
		return result.toString();
	}

} //StringParameterImpl
