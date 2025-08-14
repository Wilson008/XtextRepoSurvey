/**
 */
package House2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boiler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link House2.Boiler#isIsOn <em>Is On</em>}</li>
 * </ul>
 *
 * @see House2.House2Package#getBoiler()
 * @model
 * @generated
 */
public interface Boiler extends Actor {
	/**
	 * Returns the value of the '<em><b>Is On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is On</em>' attribute.
	 * @see #setIsOn(boolean)
	 * @see House2.House2Package#getBoiler_IsOn()
	 * @model
	 * @generated
	 */
	boolean isIsOn();

	/**
	 * Sets the value of the '{@link House2.Boiler#isIsOn <em>Is On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is On</em>' attribute.
	 * @see #isIsOn()
	 * @generated
	 */
	void setIsOn(boolean value);

} // Boiler
