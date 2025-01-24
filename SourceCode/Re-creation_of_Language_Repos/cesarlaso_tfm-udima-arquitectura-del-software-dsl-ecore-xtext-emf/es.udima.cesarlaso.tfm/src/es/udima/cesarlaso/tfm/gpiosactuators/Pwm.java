/**
 */
package es.udima.cesarlaso.tfm.gpiosactuators;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pwm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * PWM - Modulación por anchura de pulso. Dependiendo de la placa, la funcionalidad sera vía hardware o software.
 * En el caso de muchas placas arduino, la frecuencia esta definicia a 490hz y solo es posible variar el ancho de pulso.
 * 
 * Frecuencia = 1/periodo
 * 
 * Por ejemplo, si una señal tiene un periodo de 10 ms y sus pulsos son de ancho (PW) 2ms, dicha señal tiene un ciclo de trabajo (duty cycle) de 20% (20% on y 80% off). El siguiente gráfico muestra tres señales PWM con diferentes "duty cycles". 
 * 
 * https://playground.arduino.cc/ArduinoNotebookTraduccion/Appendix3
 * 
 * En los casos anteriores, la placa Arduino basica, implementará dicha funcion meidnate una llamada a analogWrite
 * 
 * 
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.udima.cesarlaso.tfm.gpiosactuators.Pwm#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see es.udima.cesarlaso.tfm.gpiosactuators.GpiosactuatorsPackage#getPwm()
 * @model
 * @generated
 */
public interface Pwm extends AnalogActuator {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see es.udima.cesarlaso.tfm.gpiosactuators.GpiosactuatorsPackage#getPwm_Value()
	 * @model required="true"
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link es.udima.cesarlaso.tfm.gpiosactuators.Pwm#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

} // Pwm
