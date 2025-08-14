/**
 */
package es.udima.cesarlaso.tfm.timers.impl;

import es.udima.cesarlaso.tfm.events.impl.EventImpl;

import es.udima.cesarlaso.tfm.timers.Timer;
import es.udima.cesarlaso.tfm.timers.TimerEvent;
import es.udima.cesarlaso.tfm.timers.TimersPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timer Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.udima.cesarlaso.tfm.timers.impl.TimerEventImpl#getTimer <em>Timer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimerEventImpl extends EventImpl implements TimerEvent {
	/**
	 * The cached value of the '{@link #getTimer() <em>Timer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimer()
	 * @generated
	 * @ordered
	 */
	protected Timer timer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimerEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimersPackage.Literals.TIMER_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Timer getTimer() {
		return timer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimer(Timer newTimer, NotificationChain msgs) {
		Timer oldTimer = timer;
		timer = newTimer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TimersPackage.TIMER_EVENT__TIMER, oldTimer, newTimer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimer(Timer newTimer) {
		if (newTimer != timer) {
			NotificationChain msgs = null;
			if (timer != null)
				msgs = ((InternalEObject)timer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TimersPackage.TIMER_EVENT__TIMER, null, msgs);
			if (newTimer != null)
				msgs = ((InternalEObject)newTimer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TimersPackage.TIMER_EVENT__TIMER, null, msgs);
			msgs = basicSetTimer(newTimer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimersPackage.TIMER_EVENT__TIMER, newTimer, newTimer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TimersPackage.TIMER_EVENT__TIMER:
				return basicSetTimer(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TimersPackage.TIMER_EVENT__TIMER:
				return getTimer();
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
			case TimersPackage.TIMER_EVENT__TIMER:
				setTimer((Timer)newValue);
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
			case TimersPackage.TIMER_EVENT__TIMER:
				setTimer((Timer)null);
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
			case TimersPackage.TIMER_EVENT__TIMER:
				return timer != null;
		}
		return super.eIsSet(featureID);
	}

} //TimerEventImpl
