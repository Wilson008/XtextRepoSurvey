/**
 */
package es.udima.cesarlaso.tfm.gpiosevents;

import es.udima.cesarlaso.tfm.gpios.PinResistor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Button Input Released</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.udima.cesarlaso.tfm.gpiosevents.ButtonInputReleased#getMode <em>Mode</em>}</li>
 * </ul>
 *
 * @see es.udima.cesarlaso.tfm.gpiosevents.GpioseventsPackage#getButtonInputReleased()
 * @model
 * @generated
 */
public interface ButtonInputReleased extends DigitalEvent {
	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link es.udima.cesarlaso.tfm.gpios.PinResistor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see es.udima.cesarlaso.tfm.gpios.PinResistor
	 * @see #setMode(PinResistor)
	 * @see es.udima.cesarlaso.tfm.gpiosevents.GpioseventsPackage#getButtonInputReleased_Mode()
	 * @model required="true"
	 * @generated
	 */
	PinResistor getMode();

	/**
	 * Sets the value of the '{@link es.udima.cesarlaso.tfm.gpiosevents.ButtonInputReleased#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see es.udima.cesarlaso.tfm.gpios.PinResistor
	 * @see #getMode()
	 * @generated
	 */
	void setMode(PinResistor value);

} // ButtonInputReleased
