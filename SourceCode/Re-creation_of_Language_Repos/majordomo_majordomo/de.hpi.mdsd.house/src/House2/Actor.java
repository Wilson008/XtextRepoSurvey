/**
 */
package House2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link House2.Actor#getIsLocatedIn <em>Is Located In</em>}</li>
 * </ul>
 *
 * @see House2.House2Package#getActor()
 * @model abstract="true"
 * @generated
 */
public interface Actor extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Is Located In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Located In</em>' reference.
	 * @see #setIsLocatedIn(Container)
	 * @see House2.House2Package#getActor_IsLocatedIn()
	 * @model
	 * @generated
	 */
	Container getIsLocatedIn();

	/**
	 * Sets the value of the '{@link House2.Actor#getIsLocatedIn <em>Is Located In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Located In</em>' reference.
	 * @see #getIsLocatedIn()
	 * @generated
	 */
	void setIsLocatedIn(Container value);

} // Actor
