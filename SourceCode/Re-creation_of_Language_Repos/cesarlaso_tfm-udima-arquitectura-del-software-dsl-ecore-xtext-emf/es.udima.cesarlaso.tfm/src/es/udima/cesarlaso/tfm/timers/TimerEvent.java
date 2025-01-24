/**
 */
package es.udima.cesarlaso.tfm.timers;

import es.udima.cesarlaso.tfm.events.Event;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timer Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.udima.cesarlaso.tfm.timers.TimerEvent#getTimer <em>Timer</em>}</li>
 * </ul>
 *
 * @see es.udima.cesarlaso.tfm.timers.TimersPackage#getTimerEvent()
 * @model
 * @generated
 */
public interface TimerEvent extends Event {
	/**
	 * Returns the value of the '<em><b>Timer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timer</em>' containment reference.
	 * @see #setTimer(Timer)
	 * @see es.udima.cesarlaso.tfm.timers.TimersPackage#getTimerEvent_Timer()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Timer getTimer();

	/**
	 * Sets the value of the '{@link es.udima.cesarlaso.tfm.timers.TimerEvent#getTimer <em>Timer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timer</em>' containment reference.
	 * @see #getTimer()
	 * @generated
	 */
	void setTimer(Timer value);

} // TimerEvent
