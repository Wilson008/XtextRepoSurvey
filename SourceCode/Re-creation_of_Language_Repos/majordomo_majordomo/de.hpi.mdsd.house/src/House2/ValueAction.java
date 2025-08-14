/**
 */
package House2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link House2.ValueAction#getSwitchToValue <em>Switch To Value</em>}</li>
 * </ul>
 *
 * @see House2.House2Package#getValueAction()
 * @model
 * @generated
 */
public interface ValueAction extends Action {
	/**
	 * Returns the value of the '<em><b>Switch To Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Switch To Value</em>' attribute.
	 * @see #setSwitchToValue(double)
	 * @see House2.House2Package#getValueAction_SwitchToValue()
	 * @model
	 * @generated
	 */
	double getSwitchToValue();

	/**
	 * Sets the value of the '{@link House2.ValueAction#getSwitchToValue <em>Switch To Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Switch To Value</em>' attribute.
	 * @see #getSwitchToValue()
	 * @generated
	 */
	void setSwitchToValue(double value);

} // ValueAction
