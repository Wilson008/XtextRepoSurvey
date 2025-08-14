/**
 */
package es.udima.cesarlaso.tfm.communicationsprograms;

import es.udima.cesarlaso.tfm.events.Actuator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remote Actuator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Un evento a sido realizado en el disposiivo
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.udima.cesarlaso.tfm.communicationsprograms.RemoteActuator#getIdentifier <em>Identifier</em>}</li>
 * </ul>
 *
 * @see es.udima.cesarlaso.tfm.communicationsprograms.CommunicationsprogramsPackage#getRemoteActuator()
 * @model
 * @generated
 */
public interface RemoteActuator extends Actuator {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' reference.
	 * @see #setIdentifier(RemoteActuatorIdentifier)
	 * @see es.udima.cesarlaso.tfm.communicationsprograms.CommunicationsprogramsPackage#getRemoteActuator_Identifier()
	 * @model required="true"
	 * @generated
	 */
	RemoteActuatorIdentifier getIdentifier();

	/**
	 * Sets the value of the '{@link es.udima.cesarlaso.tfm.communicationsprograms.RemoteActuator#getIdentifier <em>Identifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(RemoteActuatorIdentifier value);

} // RemoteActuator
