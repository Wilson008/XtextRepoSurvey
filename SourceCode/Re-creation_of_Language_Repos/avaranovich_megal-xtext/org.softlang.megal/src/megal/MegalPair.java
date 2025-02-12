/**
 */
package megal;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pair</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link megal.MegalPair#getSet <em>Set</em>}</li>
 *   <li>{@link megal.MegalPair#getFirst <em>First</em>}</li>
 *   <li>{@link megal.MegalPair#getSecond <em>Second</em>}</li>
 * </ul>
 *
 * @see megal.MegalPackage#getMegalPair()
 * @model
 * @generated
 */
public interface MegalPair extends MegalDeclaration {
	/**
	 * Returns the value of the '<em><b>Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set</em>' reference.
	 * @see #setSet(MegalEntity)
	 * @see megal.MegalPackage#getMegalPair_Set()
	 * @model required="true"
	 * @generated
	 */
	MegalEntity getSet();

	/**
	 * Sets the value of the '{@link megal.MegalPair#getSet <em>Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set</em>' reference.
	 * @see #getSet()
	 * @generated
	 */
	void setSet(MegalEntity value);

	/**
	 * Returns the value of the '<em><b>First</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First</em>' reference.
	 * @see #setFirst(MegalEntity)
	 * @see megal.MegalPackage#getMegalPair_First()
	 * @model required="true"
	 * @generated
	 */
	MegalEntity getFirst();

	/**
	 * Sets the value of the '{@link megal.MegalPair#getFirst <em>First</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First</em>' reference.
	 * @see #getFirst()
	 * @generated
	 */
	void setFirst(MegalEntity value);

	/**
	 * Returns the value of the '<em><b>Second</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second</em>' reference.
	 * @see #setSecond(MegalEntity)
	 * @see megal.MegalPackage#getMegalPair_Second()
	 * @model required="true"
	 * @generated
	 */
	MegalEntity getSecond();

	/**
	 * Sets the value of the '{@link megal.MegalPair#getSecond <em>Second</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second</em>' reference.
	 * @see #getSecond()
	 * @generated
	 */
	void setSecond(MegalEntity value);

} // MegalPair
