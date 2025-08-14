/**
 */
package House2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Equal Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link House2.EqualCondition#isBoolcond <em>Boolcond</em>}</li>
 *   <li>{@link House2.EqualCondition#getValuecond <em>Valuecond</em>}</li>
 * </ul>
 *
 * @see House2.House2Package#getEqualCondition()
 * @model
 * @generated
 */
public interface EqualCondition extends Condition {
	/**
	 * Returns the value of the '<em><b>Boolcond</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boolcond</em>' attribute.
	 * @see #setBoolcond(boolean)
	 * @see House2.House2Package#getEqualCondition_Boolcond()
	 * @model
	 * @generated
	 */
	boolean isBoolcond();

	/**
	 * Sets the value of the '{@link House2.EqualCondition#isBoolcond <em>Boolcond</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boolcond</em>' attribute.
	 * @see #isBoolcond()
	 * @generated
	 */
	void setBoolcond(boolean value);

	/**
	 * Returns the value of the '<em><b>Valuecond</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valuecond</em>' attribute.
	 * @see #setValuecond(double)
	 * @see House2.House2Package#getEqualCondition_Valuecond()
	 * @model
	 * @generated
	 */
	double getValuecond();

	/**
	 * Sets the value of the '{@link House2.EqualCondition#getValuecond <em>Valuecond</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valuecond</em>' attribute.
	 * @see #getValuecond()
	 * @generated
	 */
	void setValuecond(double value);

} // EqualCondition
