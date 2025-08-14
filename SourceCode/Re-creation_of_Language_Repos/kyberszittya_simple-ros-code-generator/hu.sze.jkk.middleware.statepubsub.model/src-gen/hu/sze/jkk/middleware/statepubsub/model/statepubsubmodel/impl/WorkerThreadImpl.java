/**
 */
package hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl;

import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.StatepubsubmodelPackage;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.WorkerThread;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Worker Thread</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.WorkerThreadImpl#getFreq <em>Freq</em>}</li>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.WorkerThreadImpl#getDoFunc <em>Do Func</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkerThreadImpl extends MinimalEObjectImpl.Container implements WorkerThread {
	/**
	 * The default value of the '{@link #getFreq() <em>Freq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFreq()
	 * @generated
	 * @ordered
	 */
	protected static final int FREQ_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFreq() <em>Freq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFreq()
	 * @generated
	 * @ordered
	 */
	protected int freq = FREQ_EDEFAULT;

	/**
	 * The default value of the '{@link #getDoFunc() <em>Do Func</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoFunc()
	 * @generated
	 * @ordered
	 */
	protected static final String DO_FUNC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDoFunc() <em>Do Func</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoFunc()
	 * @generated
	 * @ordered
	 */
	protected String doFunc = DO_FUNC_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkerThreadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatepubsubmodelPackage.Literals.WORKER_THREAD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFreq() {
		return freq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFreq(int newFreq) {
		int oldFreq = freq;
		freq = newFreq;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatepubsubmodelPackage.WORKER_THREAD__FREQ, oldFreq,
					freq));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDoFunc() {
		return doFunc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoFunc(String newDoFunc) {
		String oldDoFunc = doFunc;
		doFunc = newDoFunc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatepubsubmodelPackage.WORKER_THREAD__DO_FUNC,
					oldDoFunc, doFunc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case StatepubsubmodelPackage.WORKER_THREAD__FREQ:
			return getFreq();
		case StatepubsubmodelPackage.WORKER_THREAD__DO_FUNC:
			return getDoFunc();
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
		case StatepubsubmodelPackage.WORKER_THREAD__FREQ:
			setFreq((Integer) newValue);
			return;
		case StatepubsubmodelPackage.WORKER_THREAD__DO_FUNC:
			setDoFunc((String) newValue);
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
		case StatepubsubmodelPackage.WORKER_THREAD__FREQ:
			setFreq(FREQ_EDEFAULT);
			return;
		case StatepubsubmodelPackage.WORKER_THREAD__DO_FUNC:
			setDoFunc(DO_FUNC_EDEFAULT);
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
		case StatepubsubmodelPackage.WORKER_THREAD__FREQ:
			return freq != FREQ_EDEFAULT;
		case StatepubsubmodelPackage.WORKER_THREAD__DO_FUNC:
			return DO_FUNC_EDEFAULT == null ? doFunc != null : !DO_FUNC_EDEFAULT.equals(doFunc);
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
		result.append(" (freq: ");
		result.append(freq);
		result.append(", doFunc: ");
		result.append(doFunc);
		result.append(')');
		return result.toString();
	}

} //WorkerThreadImpl
