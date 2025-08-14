/**
 */
package es.udima.cesarlaso.tfm.gpios;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Analog Pin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Escribe valores analogicos mediante la generación de un PWM 
 * 
 * https://playground.arduino.cc/ArduinoNotebookTraduccion/Appendix3
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.udima.cesarlaso.tfm.gpios.AnalogPin#getResolution <em>Resolution</em>}</li>
 * </ul>
 *
 * @see es.udima.cesarlaso.tfm.gpios.GpiosPackage#getAnalogPin()
 * @model abstract="true"
 * @generated
 */
public interface AnalogPin extends Pin {
	/**
	 * Returns the value of the '<em><b>Resolution</b></em>' attribute.
	 * The default value is <code>"Bits8"</code>.
	 * The literals are from the enumeration {@link es.udima.cesarlaso.tfm.gpios.DacResolution}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolution</em>' attribute.
	 * @see es.udima.cesarlaso.tfm.gpios.DacResolution
	 * @see #setResolution(DacResolution)
	 * @see es.udima.cesarlaso.tfm.gpios.GpiosPackage#getAnalogPin_Resolution()
	 * @model default="Bits8" required="true"
	 * @generated
	 */
	DacResolution getResolution();

	/**
	 * Sets the value of the '{@link es.udima.cesarlaso.tfm.gpios.AnalogPin#getResolution <em>Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolution</em>' attribute.
	 * @see es.udima.cesarlaso.tfm.gpios.DacResolution
	 * @see #getResolution()
	 * @generated
	 */
	void setResolution(DacResolution value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	int read();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	void write(int value);

} // AnalogPin
