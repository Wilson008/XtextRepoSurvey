/**
 */
package House2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Temperature Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link House2.TemperatureSensor#getTemp <em>Temp</em>}</li>
 * </ul>
 *
 * @see House2.House2Package#getTemperatureSensor()
 * @model
 * @generated
 */
public interface TemperatureSensor extends Sensor {
	/**
	 * Returns the value of the '<em><b>Temp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temp</em>' attribute.
	 * @see #setTemp(double)
	 * @see House2.House2Package#getTemperatureSensor_Temp()
	 * @model
	 * @generated
	 */
	double getTemp();

	/**
	 * Sets the value of the '{@link House2.TemperatureSensor#getTemp <em>Temp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temp</em>' attribute.
	 * @see #getTemp()
	 * @generated
	 */
	void setTemp(double value);

} // TemperatureSensor
