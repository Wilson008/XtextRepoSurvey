/**
 */
package hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl;

import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.DoubleParameter;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.StatepubsubmodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Double Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.DoubleParameterImpl#getMaxval <em>Maxval</em>}</li>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.DoubleParameterImpl#getMinval <em>Minval</em>}</li>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.DoubleParameterImpl#getStep <em>Step</em>}</li>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.DoubleParameterImpl#getDefaultval <em>Defaultval</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DoubleParameterImpl extends NodeParameterImpl implements DoubleParameter {
	/**
	 * The default value of the '{@link #getMaxval() <em>Maxval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxval()
	 * @generated
	 * @ordered
	 */
	protected static final double MAXVAL_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMaxval() <em>Maxval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxval()
	 * @generated
	 * @ordered
	 */
	protected double maxval = MAXVAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinval() <em>Minval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinval()
	 * @generated
	 * @ordered
	 */
	protected static final double MINVAL_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMinval() <em>Minval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinval()
	 * @generated
	 * @ordered
	 */
	protected double minval = MINVAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getStep() <em>Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStep()
	 * @generated
	 * @ordered
	 */
	protected static final double STEP_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getStep() <em>Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStep()
	 * @generated
	 * @ordered
	 */
	protected double step = STEP_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultval() <em>Defaultval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultval()
	 * @generated
	 * @ordered
	 */
	protected static final double DEFAULTVAL_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDefaultval() <em>Defaultval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultval()
	 * @generated
	 * @ordered
	 */
	protected double defaultval = DEFAULTVAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DoubleParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatepubsubmodelPackage.Literals.DOUBLE_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaxval() {
		return maxval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxval(double newMaxval) {
		double oldMaxval = maxval;
		maxval = newMaxval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatepubsubmodelPackage.DOUBLE_PARAMETER__MAXVAL,
					oldMaxval, maxval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMinval() {
		return minval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinval(double newMinval) {
		double oldMinval = minval;
		minval = newMinval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatepubsubmodelPackage.DOUBLE_PARAMETER__MINVAL,
					oldMinval, minval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getStep() {
		return step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStep(double newStep) {
		double oldStep = step;
		step = newStep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatepubsubmodelPackage.DOUBLE_PARAMETER__STEP,
					oldStep, step));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDefaultval() {
		return defaultval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultval(double newDefaultval) {
		double oldDefaultval = defaultval;
		defaultval = newDefaultval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatepubsubmodelPackage.DOUBLE_PARAMETER__DEFAULTVAL,
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
		case StatepubsubmodelPackage.DOUBLE_PARAMETER__MAXVAL:
			return getMaxval();
		case StatepubsubmodelPackage.DOUBLE_PARAMETER__MINVAL:
			return getMinval();
		case StatepubsubmodelPackage.DOUBLE_PARAMETER__STEP:
			return getStep();
		case StatepubsubmodelPackage.DOUBLE_PARAMETER__DEFAULTVAL:
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
		case StatepubsubmodelPackage.DOUBLE_PARAMETER__MAXVAL:
			setMaxval((Double) newValue);
			return;
		case StatepubsubmodelPackage.DOUBLE_PARAMETER__MINVAL:
			setMinval((Double) newValue);
			return;
		case StatepubsubmodelPackage.DOUBLE_PARAMETER__STEP:
			setStep((Double) newValue);
			return;
		case StatepubsubmodelPackage.DOUBLE_PARAMETER__DEFAULTVAL:
			setDefaultval((Double) newValue);
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
		case StatepubsubmodelPackage.DOUBLE_PARAMETER__MAXVAL:
			setMaxval(MAXVAL_EDEFAULT);
			return;
		case StatepubsubmodelPackage.DOUBLE_PARAMETER__MINVAL:
			setMinval(MINVAL_EDEFAULT);
			return;
		case StatepubsubmodelPackage.DOUBLE_PARAMETER__STEP:
			setStep(STEP_EDEFAULT);
			return;
		case StatepubsubmodelPackage.DOUBLE_PARAMETER__DEFAULTVAL:
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
		case StatepubsubmodelPackage.DOUBLE_PARAMETER__MAXVAL:
			return maxval != MAXVAL_EDEFAULT;
		case StatepubsubmodelPackage.DOUBLE_PARAMETER__MINVAL:
			return minval != MINVAL_EDEFAULT;
		case StatepubsubmodelPackage.DOUBLE_PARAMETER__STEP:
			return step != STEP_EDEFAULT;
		case StatepubsubmodelPackage.DOUBLE_PARAMETER__DEFAULTVAL:
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

} //DoubleParameterImpl
