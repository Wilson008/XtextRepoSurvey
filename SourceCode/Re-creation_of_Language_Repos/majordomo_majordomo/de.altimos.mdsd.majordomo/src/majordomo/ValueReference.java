/**
 */
package majordomo;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link majordomo.ValueReference#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @see majordomo.MajordomoPackage#getValueReference()
 * @model
 * @generated
 */
public interface ValueReference extends ValueExpression {
	/**
	 * Returns the value of the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' reference.
	 * @see #setRef(PreparedValue)
	 * @see majordomo.MajordomoPackage#getValueReference_Ref()
	 * @model required="true"
	 * @generated
	 */
	PreparedValue getRef();

	/**
	 * Sets the value of the '{@link majordomo.ValueReference#getRef <em>Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' reference.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(PreparedValue value);

} // ValueReference
