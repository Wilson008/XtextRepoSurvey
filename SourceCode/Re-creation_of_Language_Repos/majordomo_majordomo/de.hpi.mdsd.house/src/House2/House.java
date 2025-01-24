/**
 */
package House2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>House</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link House2.House#getRooms <em>Rooms</em>}</li>
 *   <li>{@link House2.House#getControlRules <em>Control Rules</em>}</li>
 * </ul>
 *
 * @see House2.House2Package#getHouse()
 * @model
 * @generated
 */
public interface House extends Container, Element {
	/**
	 * Returns the value of the '<em><b>Rooms</b></em>' containment reference list.
	 * The list contents are of type {@link House2.Room}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rooms</em>' containment reference list.
	 * @see House2.House2Package#getHouse_Rooms()
	 * @model containment="true"
	 * @generated
	 */
	EList<Room> getRooms();

	/**
	 * Returns the value of the '<em><b>Control Rules</b></em>' containment reference list.
	 * The list contents are of type {@link House2.ControlRule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Rules</em>' containment reference list.
	 * @see House2.House2Package#getHouse_ControlRules()
	 * @model containment="true"
	 * @generated
	 */
	EList<ControlRule> getControlRules();

} // House
