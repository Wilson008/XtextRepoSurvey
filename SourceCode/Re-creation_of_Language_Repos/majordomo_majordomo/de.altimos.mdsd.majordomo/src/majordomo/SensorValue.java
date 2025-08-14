/**
 */
package majordomo;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link majordomo.SensorValue#getSensor <em>Sensor</em>}</li>
 * </ul>
 *
 * @see majordomo.MajordomoPackage#getSensorValue()
 * @model
 * @generated
 */
public interface SensorValue extends ValueExpression {
	/**
	 * Returns the value of the '<em><b>Sensor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor</em>' reference.
	 * @see #setSensor(FloatSensor)
	 * @see majordomo.MajordomoPackage#getSensorValue_Sensor()
	 * @model required="true"
	 * @generated
	 */
	FloatSensor getSensor();

	/**
	 * Sets the value of the '{@link majordomo.SensorValue#getSensor <em>Sensor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensor</em>' reference.
	 * @see #getSensor()
	 * @generated
	 */
	void setSensor(FloatSensor value);

} // SensorValue
