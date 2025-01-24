/**
 */
package es.udima.cesarlaso.tfm.gpiosactuators;

import es.udima.cesarlaso.tfm.timers.TimeUnitValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Blink Output</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.udima.cesarlaso.tfm.gpiosactuators.BlinkOutput#getInterval <em>Interval</em>}</li>
 * </ul>
 *
 * @see es.udima.cesarlaso.tfm.gpiosactuators.GpiosactuatorsPackage#getBlinkOutput()
 * @model
 * @generated
 */
public interface BlinkOutput extends DigitalActuator {
	/**
	 * Returns the value of the '<em><b>Interval</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interval</em>' containment reference.
	 * @see #setInterval(TimeUnitValue)
	 * @see es.udima.cesarlaso.tfm.gpiosactuators.GpiosactuatorsPackage#getBlinkOutput_Interval()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TimeUnitValue getInterval();

	/**
	 * Sets the value of the '{@link es.udima.cesarlaso.tfm.gpiosactuators.BlinkOutput#getInterval <em>Interval</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interval</em>' containment reference.
	 * @see #getInterval()
	 * @generated
	 */
	void setInterval(TimeUnitValue value);

} // BlinkOutput
