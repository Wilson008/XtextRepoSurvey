/**
 */
package majordomo;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link majordomo.BooleanAction#getActor <em>Actor</em>}</li>
 *   <li>{@link majordomo.BooleanAction#isValue <em>Value</em>}</li>
 * </ul>
 *
 * @see majordomo.MajordomoPackage#getBooleanAction()
 * @model
 * @generated
 */
public interface BooleanAction extends Action {
	/**
	 * Returns the value of the '<em><b>Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actor</em>' reference.
	 * @see #setActor(BooleanActor)
	 * @see majordomo.MajordomoPackage#getBooleanAction_Actor()
	 * @model required="true"
	 * @generated
	 */
	BooleanActor getActor();

	/**
	 * Sets the value of the '{@link majordomo.BooleanAction#getActor <em>Actor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actor</em>' reference.
	 * @see #getActor()
	 * @generated
	 */
	void setActor(BooleanActor value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(boolean)
	 * @see majordomo.MajordomoPackage#getBooleanAction_Value()
	 * @model required="true"
	 * @generated
	 */
	boolean isValue();

	/**
	 * Sets the value of the '{@link majordomo.BooleanAction#isValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #isValue()
	 * @generated
	 */
	void setValue(boolean value);

} // BooleanAction
