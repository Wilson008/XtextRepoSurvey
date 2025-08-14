/**
 */
package es.udima.cesarlaso.tfm.gpiosevents;

import es.udima.cesarlaso.tfm.gpios.PinResistor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Button Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.udima.cesarlaso.tfm.gpiosevents.ButtonInput#getMode <em>Mode</em>}</li>
 *   <li>{@link es.udima.cesarlaso.tfm.gpiosevents.ButtonInput#getMinDuration <em>Min Duration</em>}</li>
 * </ul>
 *
 * @see es.udima.cesarlaso.tfm.gpiosevents.GpioseventsPackage#getButtonInput()
 * @model
 * @generated
 */
public interface ButtonInput extends DigitalEvent {
	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link es.udima.cesarlaso.tfm.gpios.PinResistor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see es.udima.cesarlaso.tfm.gpios.PinResistor
	 * @see #setMode(PinResistor)
	 * @see es.udima.cesarlaso.tfm.gpiosevents.GpioseventsPackage#getButtonInput_Mode()
	 * @model required="true"
	 * @generated
	 */
	PinResistor getMode();

	/**
	 * Sets the value of the '{@link es.udima.cesarlaso.tfm.gpiosevents.ButtonInput#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see es.udima.cesarlaso.tfm.gpios.PinResistor
	 * @see #getMode()
	 * @generated
	 */
	void setMode(PinResistor value);

	/**
	 * Returns the value of the '<em><b>Min Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Duration</em>' attribute.
	 * @see #setMinDuration(int)
	 * @see es.udima.cesarlaso.tfm.gpiosevents.GpioseventsPackage#getButtonInput_MinDuration()
	 * @model required="true"
	 * @generated
	 */
	int getMinDuration();

	/**
	 * Sets the value of the '{@link es.udima.cesarlaso.tfm.gpiosevents.ButtonInput#getMinDuration <em>Min Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Duration</em>' attribute.
	 * @see #getMinDuration()
	 * @generated
	 */
	void setMinDuration(int value);

} // ButtonInput
