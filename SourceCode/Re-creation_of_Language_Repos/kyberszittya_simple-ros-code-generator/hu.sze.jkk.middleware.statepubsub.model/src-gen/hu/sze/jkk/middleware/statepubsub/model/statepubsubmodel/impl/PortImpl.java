/**
 */
package hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl;

import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Port;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.StatepubsubmodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.PortImpl#getEstimated_freq <em>Estimated freq</em>}</li>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.PortImpl#isSync_time_stamp <em>Sync time stamp</em>}</li>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.PortImpl#getSample_tolerance <em>Sample tolerance</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PortImpl extends InternalNodeImpl implements Port {
	/**
	 * The default value of the '{@link #getEstimated_freq() <em>Estimated freq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimated_freq()
	 * @generated
	 * @ordered
	 */
	protected static final int ESTIMATED_FREQ_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEstimated_freq() <em>Estimated freq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimated_freq()
	 * @generated
	 * @ordered
	 */
	protected int estimated_freq = ESTIMATED_FREQ_EDEFAULT;

	/**
	 * The default value of the '{@link #isSync_time_stamp() <em>Sync time stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSync_time_stamp()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SYNC_TIME_STAMP_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isSync_time_stamp() <em>Sync time stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSync_time_stamp()
	 * @generated
	 * @ordered
	 */
	protected boolean sync_time_stamp = SYNC_TIME_STAMP_EDEFAULT;

	/**
	 * The default value of the '{@link #getSample_tolerance() <em>Sample tolerance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSample_tolerance()
	 * @generated
	 * @ordered
	 */
	protected static final double SAMPLE_TOLERANCE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSample_tolerance() <em>Sample tolerance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSample_tolerance()
	 * @generated
	 * @ordered
	 */
	protected double sample_tolerance = SAMPLE_TOLERANCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatepubsubmodelPackage.Literals.PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getEstimated_freq() {
		return estimated_freq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstimated_freq(int newEstimated_freq) {
		int oldEstimated_freq = estimated_freq;
		estimated_freq = newEstimated_freq;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatepubsubmodelPackage.PORT__ESTIMATED_FREQ,
					oldEstimated_freq, estimated_freq));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSync_time_stamp() {
		return sync_time_stamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSync_time_stamp(boolean newSync_time_stamp) {
		boolean oldSync_time_stamp = sync_time_stamp;
		sync_time_stamp = newSync_time_stamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatepubsubmodelPackage.PORT__SYNC_TIME_STAMP,
					oldSync_time_stamp, sync_time_stamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSample_tolerance() {
		return sample_tolerance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSample_tolerance(double newSample_tolerance) {
		double oldSample_tolerance = sample_tolerance;
		sample_tolerance = newSample_tolerance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatepubsubmodelPackage.PORT__SAMPLE_TOLERANCE,
					oldSample_tolerance, sample_tolerance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case StatepubsubmodelPackage.PORT__ESTIMATED_FREQ:
			return getEstimated_freq();
		case StatepubsubmodelPackage.PORT__SYNC_TIME_STAMP:
			return isSync_time_stamp();
		case StatepubsubmodelPackage.PORT__SAMPLE_TOLERANCE:
			return getSample_tolerance();
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
		case StatepubsubmodelPackage.PORT__ESTIMATED_FREQ:
			setEstimated_freq((Integer) newValue);
			return;
		case StatepubsubmodelPackage.PORT__SYNC_TIME_STAMP:
			setSync_time_stamp((Boolean) newValue);
			return;
		case StatepubsubmodelPackage.PORT__SAMPLE_TOLERANCE:
			setSample_tolerance((Double) newValue);
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
		case StatepubsubmodelPackage.PORT__ESTIMATED_FREQ:
			setEstimated_freq(ESTIMATED_FREQ_EDEFAULT);
			return;
		case StatepubsubmodelPackage.PORT__SYNC_TIME_STAMP:
			setSync_time_stamp(SYNC_TIME_STAMP_EDEFAULT);
			return;
		case StatepubsubmodelPackage.PORT__SAMPLE_TOLERANCE:
			setSample_tolerance(SAMPLE_TOLERANCE_EDEFAULT);
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
		case StatepubsubmodelPackage.PORT__ESTIMATED_FREQ:
			return estimated_freq != ESTIMATED_FREQ_EDEFAULT;
		case StatepubsubmodelPackage.PORT__SYNC_TIME_STAMP:
			return sync_time_stamp != SYNC_TIME_STAMP_EDEFAULT;
		case StatepubsubmodelPackage.PORT__SAMPLE_TOLERANCE:
			return sample_tolerance != SAMPLE_TOLERANCE_EDEFAULT;
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
		result.append(" (estimated_freq: ");
		result.append(estimated_freq);
		result.append(", sync_time_stamp: ");
		result.append(sync_time_stamp);
		result.append(", sample_tolerance: ");
		result.append(sample_tolerance);
		result.append(')');
		return result.toString();
	}

} //PortImpl
