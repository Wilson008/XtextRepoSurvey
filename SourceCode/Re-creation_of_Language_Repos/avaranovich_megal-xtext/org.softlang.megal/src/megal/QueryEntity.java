/**
 */
package megal;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link megal.QueryEntity#getEntity <em>Entity</em>}</li>
 * </ul>
 *
 * @see megal.MegalPackage#getQueryEntity()
 * @model
 * @generated
 */
public interface QueryEntity extends QueryEntry {
	/**
	 * Returns the value of the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' reference.
	 * @see #setEntity(MegalEntity)
	 * @see megal.MegalPackage#getQueryEntity_Entity()
	 * @model required="true"
	 * @generated
	 */
	MegalEntity getEntity();

	/**
	 * Sets the value of the '{@link megal.QueryEntity#getEntity <em>Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(MegalEntity value);

} // QueryEntity
