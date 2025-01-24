/**
 */
package de.altimos.mdsd.majordomo;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Sensor Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.altimos.mdsd.majordomo.BooleanSensorStatement#getSensor <em>Sensor</em>}</li>
 * </ul>
 *
 * @see de.altimos.mdsd.majordomo.MajordomoPackage#getBooleanSensorStatement()
 * @model
 * @generated
 */
public interface BooleanSensorStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Sensor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor</em>' reference.
	 * @see #setSensor(BooleanSensor)
	 * @see de.altimos.mdsd.majordomo.MajordomoPackage#getBooleanSensorStatement_Sensor()
	 * @model required="true"
	 * @generated
	 */
	BooleanSensor getSensor();

	/**
	 * Sets the value of the '{@link de.altimos.mdsd.majordomo.BooleanSensorStatement#getSensor <em>Sensor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensor</em>' reference.
	 * @see #getSensor()
	 * @generated
	 */
	void setSensor(BooleanSensor value);

} // BooleanSensorStatement
