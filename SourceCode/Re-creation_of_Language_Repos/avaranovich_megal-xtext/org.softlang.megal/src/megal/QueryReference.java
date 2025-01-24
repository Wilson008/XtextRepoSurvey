/**
 */
package megal;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link megal.QueryReference#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @see megal.MegalPackage#getQueryReference()
 * @model
 * @generated
 */
public interface QueryReference extends QueryEntry {
	/**
	 * Returns the value of the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' reference.
	 * @see #setRef(QueryParam)
	 * @see megal.MegalPackage#getQueryReference_Ref()
	 * @model
	 * @generated
	 */
	QueryParam getRef();

	/**
	 * Sets the value of the '{@link megal.QueryReference#getRef <em>Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' reference.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(QueryParam value);

} // QueryReference
