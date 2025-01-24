/**
 */
package megal;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link megal.MegalEntityType#getSupertype <em>Supertype</em>}</li>
 * </ul>
 *
 * @see megal.MegalPackage#getMegalEntityType()
 * @model
 * @generated
 */
public interface MegalEntityType extends MegalNamed {
	/**
	 * Returns the value of the '<em><b>Supertype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supertype</em>' reference.
	 * @see #setSupertype(MegalEntityType)
	 * @see megal.MegalPackage#getMegalEntityType_Supertype()
	 * @model
	 * @generated
	 */
	MegalEntityType getSupertype();

	/**
	 * Sets the value of the '{@link megal.MegalEntityType#getSupertype <em>Supertype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supertype</em>' reference.
	 * @see #getSupertype()
	 * @generated
	 */
	void setSupertype(MegalEntityType value);

} // MegalEntityType
