/**
 */
package megal;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query Pos</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link megal.QueryPos#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see megal.MegalPackage#getQueryPos()
 * @model
 * @generated
 */
public interface QueryPos extends QueryEntry {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see megal.MegalPackage#getQueryPos_Value()
	 * @model id="true" required="true"
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link megal.QueryPos#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

} // QueryPos
