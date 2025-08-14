/**
 */
package es.udima.cesarlaso.tfm.gpiosactuators;

import es.udima.cesarlaso.tfm.gpios.DigitalOutputPin;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Digital Actuator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.udima.cesarlaso.tfm.gpiosactuators.DigitalActuator#getPin <em>Pin</em>}</li>
 * </ul>
 *
 * @see es.udima.cesarlaso.tfm.gpiosactuators.GpiosactuatorsPackage#getDigitalActuator()
 * @model abstract="true"
 * @generated
 */
public interface DigitalActuator extends GpioActuator {
	/**
	 * Returns the value of the '<em><b>Pin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pin</em>' reference.
	 * @see #setPin(DigitalOutputPin)
	 * @see es.udima.cesarlaso.tfm.gpiosactuators.GpiosactuatorsPackage#getDigitalActuator_Pin()
	 * @model required="true"
	 * @generated
	 */
	DigitalOutputPin getPin();

	/**
	 * Sets the value of the '{@link es.udima.cesarlaso.tfm.gpiosactuators.DigitalActuator#getPin <em>Pin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pin</em>' reference.
	 * @see #getPin()
	 * @generated
	 */
	void setPin(DigitalOutputPin value);

} // DigitalActuator
