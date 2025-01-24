/**
 */
package majordomo;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link majordomo.BinaryOperation#getLeft <em>Left</em>}</li>
 *   <li>{@link majordomo.BinaryOperation#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see majordomo.MajordomoPackage#getBinaryOperation()
 * @model abstract="true"
 * @generated
 */
public interface BinaryOperation extends Statement {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(Statement)
	 * @see majordomo.MajordomoPackage#getBinaryOperation_Left()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Statement getLeft();

	/**
	 * Sets the value of the '{@link majordomo.BinaryOperation#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(Statement value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(Statement)
	 * @see majordomo.MajordomoPackage#getBinaryOperation_Right()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Statement getRight();

	/**
	 * Sets the value of the '{@link majordomo.BinaryOperation#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(Statement value);

} // BinaryOperation
