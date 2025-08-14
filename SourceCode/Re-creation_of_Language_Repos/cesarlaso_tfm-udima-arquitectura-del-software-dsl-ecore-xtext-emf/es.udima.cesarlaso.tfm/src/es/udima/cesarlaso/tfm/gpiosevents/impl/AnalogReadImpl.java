/**
 */
package es.udima.cesarlaso.tfm.gpiosevents.impl;

import es.udima.cesarlaso.tfm.gpiosevents.AnalogRead;
import es.udima.cesarlaso.tfm.gpiosevents.GpioseventsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Analog Read</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.udima.cesarlaso.tfm.gpiosevents.impl.AnalogReadImpl#getPollIntervalLoops <em>Poll Interval Loops</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnalogReadImpl extends AnalogEventImpl implements AnalogRead {
	/**
	 * The default value of the '{@link #getPollIntervalLoops() <em>Poll Interval Loops</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPollIntervalLoops()
	 * @generated
	 * @ordered
	 */
	protected static final int POLL_INTERVAL_LOOPS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPollIntervalLoops() <em>Poll Interval Loops</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPollIntervalLoops()
	 * @generated
	 * @ordered
	 */
	protected int pollIntervalLoops = POLL_INTERVAL_LOOPS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnalogReadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GpioseventsPackage.Literals.ANALOG_READ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPollIntervalLoops() {
		return pollIntervalLoops;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPollIntervalLoops(int newPollIntervalLoops) {
		int oldPollIntervalLoops = pollIntervalLoops;
		pollIntervalLoops = newPollIntervalLoops;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GpioseventsPackage.ANALOG_READ__POLL_INTERVAL_LOOPS, oldPollIntervalLoops, pollIntervalLoops));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GpioseventsPackage.ANALOG_READ__POLL_INTERVAL_LOOPS:
				return getPollIntervalLoops();
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
			case GpioseventsPackage.ANALOG_READ__POLL_INTERVAL_LOOPS:
				setPollIntervalLoops((Integer)newValue);
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
			case GpioseventsPackage.ANALOG_READ__POLL_INTERVAL_LOOPS:
				setPollIntervalLoops(POLL_INTERVAL_LOOPS_EDEFAULT);
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
			case GpioseventsPackage.ANALOG_READ__POLL_INTERVAL_LOOPS:
				return pollIntervalLoops != POLL_INTERVAL_LOOPS_EDEFAULT;
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
		result.append(" (pollIntervalLoops: ");
		result.append(pollIntervalLoops);
		result.append(')');
		return result.toString();
	}

} //AnalogReadImpl
