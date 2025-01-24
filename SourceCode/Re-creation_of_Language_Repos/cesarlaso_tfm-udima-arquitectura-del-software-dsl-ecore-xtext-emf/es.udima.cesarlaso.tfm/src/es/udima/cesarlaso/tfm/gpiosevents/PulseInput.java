/**
 */
package es.udima.cesarlaso.tfm.gpiosevents;

import es.udima.cesarlaso.tfm.gpios.PinResistor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pulse Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.udima.cesarlaso.tfm.gpiosevents.PulseInput#getMode <em>Mode</em>}</li>
 *   <li>{@link es.udima.cesarlaso.tfm.gpiosevents.PulseInput#getCount <em>Count</em>}</li>
 *   <li>{@link es.udima.cesarlaso.tfm.gpiosevents.PulseInput#getWidth <em>Width</em>}</li>
 *   <li>{@link es.udima.cesarlaso.tfm.gpiosevents.PulseInput#getSpaceWidth <em>Space Width</em>}</li>
 * </ul>
 *
 * @see es.udima.cesarlaso.tfm.gpiosevents.GpioseventsPackage#getPulseInput()
 * @model
 * @generated
 */
public interface PulseInput extends DigitalEvent {
	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link es.udima.cesarlaso.tfm.gpios.PinResistor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see es.udima.cesarlaso.tfm.gpios.PinResistor
	 * @see #setMode(PinResistor)
	 * @see es.udima.cesarlaso.tfm.gpiosevents.GpioseventsPackage#getPulseInput_Mode()
	 * @model required="true"
	 * @generated
	 */
	PinResistor getMode();

	/**
	 * Sets the value of the '{@link es.udima.cesarlaso.tfm.gpiosevents.PulseInput#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see es.udima.cesarlaso.tfm.gpios.PinResistor
	 * @see #getMode()
	 * @generated
	 */
	void setMode(PinResistor value);

	/**
	 * Returns the value of the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count</em>' attribute.
	 * @see #setCount(int)
	 * @see es.udima.cesarlaso.tfm.gpiosevents.GpioseventsPackage#getPulseInput_Count()
	 * @model required="true"
	 * @generated
	 */
	int getCount();

	/**
	 * Sets the value of the '{@link es.udima.cesarlaso.tfm.gpiosevents.PulseInput#getCount <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count</em>' attribute.
	 * @see #getCount()
	 * @generated
	 */
	void setCount(int value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(int)
	 * @see es.udima.cesarlaso.tfm.gpiosevents.GpioseventsPackage#getPulseInput_Width()
	 * @model required="true"
	 * @generated
	 */
	int getWidth();

	/**
	 * Sets the value of the '{@link es.udima.cesarlaso.tfm.gpiosevents.PulseInput#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(int value);

	/**
	 * Returns the value of the '<em><b>Space Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Space Width</em>' attribute.
	 * @see #setSpaceWidth(int)
	 * @see es.udima.cesarlaso.tfm.gpiosevents.GpioseventsPackage#getPulseInput_SpaceWidth()
	 * @model required="true"
	 * @generated
	 */
	int getSpaceWidth();

	/**
	 * Sets the value of the '{@link es.udima.cesarlaso.tfm.gpiosevents.PulseInput#getSpaceWidth <em>Space Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Space Width</em>' attribute.
	 * @see #getSpaceWidth()
	 * @generated
	 */
	void setSpaceWidth(int value);

} // PulseInput
