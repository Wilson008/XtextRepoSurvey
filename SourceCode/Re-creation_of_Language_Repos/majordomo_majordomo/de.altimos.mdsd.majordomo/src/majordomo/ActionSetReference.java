/**
 */
package majordomo;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Set Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link majordomo.ActionSetReference#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @see majordomo.MajordomoPackage#getActionSetReference()
 * @model
 * @generated
 */
public interface ActionSetReference extends Action {
	/**
	 * Returns the value of the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' reference.
	 * @see #setRef(PreparedActionSet)
	 * @see majordomo.MajordomoPackage#getActionSetReference_Ref()
	 * @model required="true"
	 * @generated
	 */
	PreparedActionSet getRef();

	/**
	 * Sets the value of the '{@link majordomo.ActionSetReference#getRef <em>Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' reference.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(PreparedActionSet value);

} // ActionSetReference
