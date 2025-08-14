/**
 */
package majordomo;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compare Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link majordomo.CompareOperation#getComparator <em>Comparator</em>}</li>
 *   <li>{@link majordomo.CompareOperation#getLeft <em>Left</em>}</li>
 *   <li>{@link majordomo.CompareOperation#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see majordomo.MajordomoPackage#getCompareOperation()
 * @model
 * @generated
 */
public interface CompareOperation extends Statement {
	/**
	 * Returns the value of the '<em><b>Comparator</b></em>' attribute.
	 * The literals are from the enumeration {@link majordomo.Comparator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comparator</em>' attribute.
	 * @see majordomo.Comparator
	 * @see #setComparator(Comparator)
	 * @see majordomo.MajordomoPackage#getCompareOperation_Comparator()
	 * @model required="true"
	 * @generated
	 */
	Comparator getComparator();

	/**
	 * Sets the value of the '{@link majordomo.CompareOperation#getComparator <em>Comparator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comparator</em>' attribute.
	 * @see majordomo.Comparator
	 * @see #getComparator()
	 * @generated
	 */
	void setComparator(Comparator value);

	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(ValueExpression)
	 * @see majordomo.MajordomoPackage#getCompareOperation_Left()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ValueExpression getLeft();

	/**
	 * Sets the value of the '{@link majordomo.CompareOperation#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(ValueExpression value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(ValueExpression)
	 * @see majordomo.MajordomoPackage#getCompareOperation_Right()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ValueExpression getRight();

	/**
	 * Sets the value of the '{@link majordomo.CompareOperation#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(ValueExpression value);

} // CompareOperation
