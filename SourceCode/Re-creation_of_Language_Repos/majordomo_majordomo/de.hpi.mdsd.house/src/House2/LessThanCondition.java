/**
 */
package House2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Less Than Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link House2.LessThanCondition#getThreshold <em>Threshold</em>}</li>
 * </ul>
 *
 * @see House2.House2Package#getLessThanCondition()
 * @model
 * @generated
 */
public interface LessThanCondition extends Condition {
	/**
	 * Returns the value of the '<em><b>Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threshold</em>' attribute.
	 * @see #setThreshold(double)
	 * @see House2.House2Package#getLessThanCondition_Threshold()
	 * @model
	 * @generated
	 */
	double getThreshold();

	/**
	 * Sets the value of the '{@link House2.LessThanCondition#getThreshold <em>Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Threshold</em>' attribute.
	 * @see #getThreshold()
	 * @generated
	 */
	void setThreshold(double value);

} // LessThanCondition
