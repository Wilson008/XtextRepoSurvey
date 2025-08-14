/**
 */
package es.udima.cesarlaso.tfm.programs;

import es.udima.cesarlaso.tfm.events.Actuator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Change State Actuator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.udima.cesarlaso.tfm.programs.ChangeStateActuator#getState <em>State</em>}</li>
 * </ul>
 *
 * @see es.udima.cesarlaso.tfm.programs.ProgramsPackage#getChangeStateActuator()
 * @model
 * @generated
 */
public interface ChangeStateActuator extends Actuator {
	/**
	 * Returns the value of the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' reference.
	 * @see #setState(ProgramState)
	 * @see es.udima.cesarlaso.tfm.programs.ProgramsPackage#getChangeStateActuator_State()
	 * @model required="true"
	 * @generated
	 */
	ProgramState getState();

	/**
	 * Sets the value of the '{@link es.udima.cesarlaso.tfm.programs.ChangeStateActuator#getState <em>State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(ProgramState value);

} // ChangeStateActuator
