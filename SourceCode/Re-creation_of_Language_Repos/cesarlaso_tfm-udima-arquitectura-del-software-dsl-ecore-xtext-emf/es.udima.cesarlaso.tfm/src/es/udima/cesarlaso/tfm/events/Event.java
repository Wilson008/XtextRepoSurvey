/**
 */
package es.udima.cesarlaso.tfm.events;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.udima.cesarlaso.tfm.events.Event#getActuators <em>Actuators</em>}</li>
 * </ul>
 *
 * @see es.udima.cesarlaso.tfm.events.EventsPackage#getEvent()
 * @model abstract="true"
 * @generated
 */
public interface Event extends EObject {
	/**
	 * Returns the value of the '<em><b>Actuators</b></em>' containment reference list.
	 * The list contents are of type {@link es.udima.cesarlaso.tfm.events.Actuator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actuators</em>' containment reference list.
	 * @see es.udima.cesarlaso.tfm.events.EventsPackage#getEvent_Actuators()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Actuator> getActuators();

} // Event
