/**
 */
package es.udima.cesarlaso.tfm.timers;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clock</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.udima.cesarlaso.tfm.timers.Clock#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see es.udima.cesarlaso.tfm.timers.TimersPackage#getClock()
 * @model
 * @generated
 */
public interface Clock extends Timer {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Time)
	 * @see es.udima.cesarlaso.tfm.timers.TimersPackage#getClock_Value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Time getValue();

	/**
	 * Sets the value of the '{@link es.udima.cesarlaso.tfm.timers.Clock#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Time value);

} // Clock
