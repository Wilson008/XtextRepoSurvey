/**
 */
package es.udima.cesarlaso.tfm.gpiosactuators;

import es.udima.cesarlaso.tfm.gpios.AnalogOutputPin;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Analog Actuator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.udima.cesarlaso.tfm.gpiosactuators.AnalogActuator#getPin <em>Pin</em>}</li>
 * </ul>
 *
 * @see es.udima.cesarlaso.tfm.gpiosactuators.GpiosactuatorsPackage#getAnalogActuator()
 * @model abstract="true"
 * @generated
 */
public interface AnalogActuator extends GpioActuator {
	/**
	 * Returns the value of the '<em><b>Pin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pin</em>' reference.
	 * @see #setPin(AnalogOutputPin)
	 * @see es.udima.cesarlaso.tfm.gpiosactuators.GpiosactuatorsPackage#getAnalogActuator_Pin()
	 * @model required="true"
	 * @generated
	 */
	AnalogOutputPin getPin();

	/**
	 * Sets the value of the '{@link es.udima.cesarlaso.tfm.gpiosactuators.AnalogActuator#getPin <em>Pin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pin</em>' reference.
	 * @see #getPin()
	 * @generated
	 */
	void setPin(AnalogOutputPin value);

} // AnalogActuator
