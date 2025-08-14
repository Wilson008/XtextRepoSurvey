/**
 */
package de.altimos.mdsd.majordomo;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.altimos.mdsd.majordomo.StatementReference#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @see de.altimos.mdsd.majordomo.MajordomoPackage#getStatementReference()
 * @model
 * @generated
 */
public interface StatementReference extends Statement {
	/**
	 * Returns the value of the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' reference.
	 * @see #setRef(PreparedStatement)
	 * @see de.altimos.mdsd.majordomo.MajordomoPackage#getStatementReference_Ref()
	 * @model required="true"
	 * @generated
	 */
	PreparedStatement getRef();

	/**
	 * Sets the value of the '{@link de.altimos.mdsd.majordomo.StatementReference#getRef <em>Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' reference.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(PreparedStatement value);

} // StatementReference
