/**
 */
package hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl;

import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.IntegerParameter;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.StatepubsubmodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Integer Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.IntegerParameterImpl#getMaxval <em>Maxval</em>}</li>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.IntegerParameterImpl#getMinval <em>Minval</em>}</li>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.IntegerParameterImpl#getStep <em>Step</em>}</li>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.IntegerParameterImpl#getDefaultval <em>Defaultval</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntegerParameterImpl extends NodeParameterImpl implements IntegerParameter {
	/**
	 * The default value of the '{@link #getMaxval() <em>Maxval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxval()
	 * @generated
	 * @ordered
	 */
	protected static final int MAXVAL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxval() <em>Maxval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxval()
	 * @generated
	 * @ordered
	 */
	protected int maxval = MAXVAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinval() <em>Minval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinval()
	 * @generated
	 * @ordered
	 */
	protected static final int MINVAL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinval() <em>Minval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinval()
	 * @generated
	 * @ordered
	 */
	protected int minval = MINVAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getStep() <em>Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStep()
	 * @generated
	 * @ordered
	 */
	protected static final int STEP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStep() <em>Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStep()
	 * @generated
	 * @ordered
	 */
	protected int step = STEP_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultval() <em>Defaultval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultval()
	 * @generated
	 * @ordered
	 */
	protected static final int DEFAULTVAL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDefaultval() <em>Defaultval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultval()
	 * @generated
	 * @ordered
	 */
	protected int defaultval = DEFAULTVAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegerParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatepubsubmodelPackage.Literals.INTEGER_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxval() {
		return maxval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxval(int newMaxval) {
		int oldMaxval = maxval;
		maxval = newMaxval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatepubsubmodelPackage.INTEGER_PARAMETER__MAXVAL,
					oldMaxval, maxval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinval() {
		return minval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinval(int newMinval) {
		int oldMinval = minval;
		minval = newMinval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatepubsubmodelPackage.INTEGER_PARAMETER__MINVAL,
					oldMinval, minval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStep() {
		return step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStep(int newStep) {
		int oldStep = step;
		step = newStep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatepubsubmodelPackage.INTEGER_PARAMETER__STEP,
					oldStep, step));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDefaultval() {
		return defaultval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultval(int newDefaultval) {
		int oldDefaultval = defaultval;
		defaultval = newDefaultval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatepubsubmodelPackage.INTEGER_PARAMETER__DEFAULTVAL,
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
		case StatepubsubmodelPackage.INTEGER_PARAMETER__MAXVAL:
			return getMaxval();
		case StatepubsubmodelPackage.INTEGER_PARAMETER__MINVAL:
			return getMinval();
		case StatepubsubmodelPackage.INTEGER_PARAMETER__STEP:
			return getStep();
		case StatepubsubmodelPackage.INTEGER_PARAMETER__DEFAULTVAL:
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
		case StatepubsubmodelPackage.INTEGER_PARAMETER__MAXVAL:
			setMaxval((Integer) newValue);
			return;
		case StatepubsubmodelPackage.INTEGER_PARAMETER__MINVAL:
			setMinval((Integer) newValue);
			return;
		case StatepubsubmodelPackage.INTEGER_PARAMETER__STEP:
			setStep((Integer) newValue);
			return;
		case StatepubsubmodelPackage.INTEGER_PARAMETER__DEFAULTVAL:
			setDefaultval((Integer) newValue);
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
		case StatepubsubmodelPackage.INTEGER_PARAMETER__MAXVAL:
			setMaxval(MAXVAL_EDEFAULT);
			return;
		case StatepubsubmodelPackage.INTEGER_PARAMETER__MINVAL:
			setMinval(MINVAL_EDEFAULT);
			return;
		case StatepubsubmodelPackage.INTEGER_PARAMETER__STEP:
			setStep(STEP_EDEFAULT);
			return;
		case StatepubsubmodelPackage.INTEGER_PARAMETER__DEFAULTVAL:
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
		case StatepubsubmodelPackage.INTEGER_PARAMETER__MAXVAL:
			return maxval != MAXVAL_EDEFAULT;
		case StatepubsubmodelPackage.INTEGER_PARAMETER__MINVAL:
			return minval != MINVAL_EDEFAULT;
		case StatepubsubmodelPackage.INTEGER_PARAMETER__STEP:
			return step != STEP_EDEFAULT;
		case StatepubsubmodelPackage.INTEGER_PARAMETER__DEFAULTVAL:
			return defaultval != DEFAULTVAL_EDEFAULT;
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
		result.append(" (maxval: ");
		result.append(maxval);
		result.append(", minval: ");
		result.append(minval);
		result.append(", step: ");
		result.append(step);
		result.append(", defaultval: ");
		result.append(defaultval);
		result.append(')');
		return result.toString();
	}

} //IntegerParameterImpl
