/**
 */
package es.udima.cesarlaso.tfm.gpiosactuators;

import es.udima.cesarlaso.tfm.timers.TimeUnitValue;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gpio Timer Actuator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.udima.cesarlaso.tfm.gpiosactuators.GpioTimerActuator#getDuration <em>Duration</em>}</li>
 * </ul>
 *
 * @see es.udima.cesarlaso.tfm.gpiosactuators.GpiosactuatorsPackage#getGpioTimerActuator()
 * @model abstract="true"
 * @generated
 */
public interface GpioTimerActuator extends EObject {
	/**
	 * Returns the value of the '<em><b>Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' containment reference.
	 * @see #setDuration(TimeUnitValue)
	 * @see es.udima.cesarlaso.tfm.gpiosactuators.GpiosactuatorsPackage#getGpioTimerActuator_Duration()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TimeUnitValue getDuration();

	/**
	 * Sets the value of the '{@link es.udima.cesarlaso.tfm.gpiosactuators.GpioTimerActuator#getDuration <em>Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' containment reference.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(TimeUnitValue value);

} // GpioTimerActuator
