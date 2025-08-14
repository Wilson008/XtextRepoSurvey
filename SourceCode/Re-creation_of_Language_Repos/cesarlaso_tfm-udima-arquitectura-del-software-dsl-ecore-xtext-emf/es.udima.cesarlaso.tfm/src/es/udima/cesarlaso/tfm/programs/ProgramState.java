/**
 */
package es.udima.cesarlaso.tfm.programs;

import es.udima.cesarlaso.tfm.events.Event;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.udima.cesarlaso.tfm.programs.ProgramState#getName <em>Name</em>}</li>
 *   <li>{@link es.udima.cesarlaso.tfm.programs.ProgramState#getEvents <em>Events</em>}</li>
 * </ul>
 *
 * @see es.udima.cesarlaso.tfm.programs.ProgramsPackage#getProgramState()
 * @model
 * @generated
 */
public interface ProgramState extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see es.udima.cesarlaso.tfm.programs.ProgramsPackage#getProgramState_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.udima.cesarlaso.tfm.programs.ProgramState#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Events</b></em>' containment reference list.
	 * The list contents are of type {@link es.udima.cesarlaso.tfm.events.Event}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' containment reference list.
	 * @see es.udima.cesarlaso.tfm.programs.ProgramsPackage#getProgramState_Events()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Event> getEvents();

} // ProgramState
