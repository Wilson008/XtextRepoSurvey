/**
 */
package es.udima.cesarlaso.tfm.gpiosevents;

import es.udima.cesarlaso.tfm.gpios.AnalogInputPin;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Analog Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.udima.cesarlaso.tfm.gpiosevents.AnalogEvent#getPin <em>Pin</em>}</li>
 * </ul>
 *
 * @see es.udima.cesarlaso.tfm.gpiosevents.GpioseventsPackage#getAnalogEvent()
 * @model abstract="true"
 * @generated
 */
public interface AnalogEvent extends GpioEvent {
	/**
	 * Returns the value of the '<em><b>Pin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pin</em>' reference.
	 * @see #setPin(AnalogInputPin)
	 * @see es.udima.cesarlaso.tfm.gpiosevents.GpioseventsPackage#getAnalogEvent_Pin()
	 * @model required="true"
	 * @generated
	 */
	AnalogInputPin getPin();

	/**
	 * Sets the value of the '{@link es.udima.cesarlaso.tfm.gpiosevents.AnalogEvent#getPin <em>Pin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pin</em>' reference.
	 * @see #getPin()
	 * @generated
	 */
	void setPin(AnalogInputPin value);

} // AnalogEvent
