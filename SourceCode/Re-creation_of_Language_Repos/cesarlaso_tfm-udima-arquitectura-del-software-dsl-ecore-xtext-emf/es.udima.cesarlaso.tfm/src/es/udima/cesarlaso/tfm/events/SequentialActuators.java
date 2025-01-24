/**
 */
package es.udima.cesarlaso.tfm.events;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequential Actuators</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.udima.cesarlaso.tfm.events.SequentialActuators#getActuators <em>Actuators</em>}</li>
 * </ul>
 *
 * @see es.udima.cesarlaso.tfm.events.EventsPackage#getSequentialActuators()
 * @model
 * @generated
 */
public interface SequentialActuators extends Actuator {
	/**
	 * Returns the value of the '<em><b>Actuators</b></em>' containment reference list.
	 * The list contents are of type {@link es.udima.cesarlaso.tfm.events.Actuator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actuators</em>' containment reference list.
	 * @see es.udima.cesarlaso.tfm.events.EventsPackage#getSequentialActuators_Actuators()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Actuator> getActuators();

} // SequentialActuators
