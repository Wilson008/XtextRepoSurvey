/**
 */
package House2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rain Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link House2.RainSensor#isActive <em>Active</em>}</li>
 * </ul>
 *
 * @see House2.House2Package#getRainSensor()
 * @model
 * @generated
 */
public interface RainSensor extends Sensor {
	/**
	 * Returns the value of the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active</em>' attribute.
	 * @see #setActive(boolean)
	 * @see House2.House2Package#getRainSensor_Active()
	 * @model
	 * @generated
	 */
	boolean isActive();

	/**
	 * Sets the value of the '{@link House2.RainSensor#isActive <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active</em>' attribute.
	 * @see #isActive()
	 * @generated
	 */
	void setActive(boolean value);

} // RainSensor
