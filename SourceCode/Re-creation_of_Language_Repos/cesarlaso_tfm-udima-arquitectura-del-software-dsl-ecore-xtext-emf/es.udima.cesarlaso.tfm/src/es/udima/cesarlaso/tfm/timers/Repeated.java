/**
 */
package es.udima.cesarlaso.tfm.timers;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repeated</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.udima.cesarlaso.tfm.timers.Repeated#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see es.udima.cesarlaso.tfm.timers.TimersPackage#getRepeated()
 * @model
 * @generated
 */
public interface Repeated extends Timer {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(TimeUnitValue)
	 * @see es.udima.cesarlaso.tfm.timers.TimersPackage#getRepeated_Value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TimeUnitValue getValue();

	/**
	 * Sets the value of the '{@link es.udima.cesarlaso.tfm.timers.Repeated#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(TimeUnitValue value);

} // Repeated
