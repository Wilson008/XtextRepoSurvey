/**
 */
package es.udima.cesarlaso.tfm.gpiosevents;

import es.udima.cesarlaso.tfm.gpios.DigitalInputPin;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Digital Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.udima.cesarlaso.tfm.gpiosevents.DigitalEvent#getPin <em>Pin</em>}</li>
 * </ul>
 *
 * @see es.udima.cesarlaso.tfm.gpiosevents.GpioseventsPackage#getDigitalEvent()
 * @model abstract="true"
 * @generated
 */
public interface DigitalEvent extends GpioEvent {
	/**
	 * Returns the value of the '<em><b>Pin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pin</em>' reference.
	 * @see #setPin(DigitalInputPin)
	 * @see es.udima.cesarlaso.tfm.gpiosevents.GpioseventsPackage#getDigitalEvent_Pin()
	 * @model required="true"
	 * @generated
	 */
	DigitalInputPin getPin();

	/**
	 * Sets the value of the '{@link es.udima.cesarlaso.tfm.gpiosevents.DigitalEvent#getPin <em>Pin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pin</em>' reference.
	 * @see #getPin()
	 * @generated
	 */
	void setPin(DigitalInputPin value);

} // DigitalEvent
