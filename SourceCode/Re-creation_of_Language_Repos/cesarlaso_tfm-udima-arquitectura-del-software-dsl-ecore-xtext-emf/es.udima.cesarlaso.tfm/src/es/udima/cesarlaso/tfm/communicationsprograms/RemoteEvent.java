/**
 */
package es.udima.cesarlaso.tfm.communicationsprograms;

import es.udima.cesarlaso.tfm.events.Event;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remote Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Un evento remoto sirve para de forma remota poder ejecutar eventos en el dispositivo. Como por ejemplo llamar a un actuador.
 * Un ejemplo podria ser, abrir una puerta, el dispositivo al recibir el evento, realizararía la llamada a sus actuadores asociados.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.udima.cesarlaso.tfm.communicationsprograms.RemoteEvent#getIdentifier <em>Identifier</em>}</li>
 * </ul>
 *
 * @see es.udima.cesarlaso.tfm.communicationsprograms.CommunicationsprogramsPackage#getRemoteEvent()
 * @model
 * @generated
 */
public interface RemoteEvent extends Event {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' reference.
	 * @see #setIdentifier(RemoteEventIdentifier)
	 * @see es.udima.cesarlaso.tfm.communicationsprograms.CommunicationsprogramsPackage#getRemoteEvent_Identifier()
	 * @model required="true"
	 * @generated
	 */
	RemoteEventIdentifier getIdentifier();

	/**
	 * Sets the value of the '{@link es.udima.cesarlaso.tfm.communicationsprograms.RemoteEvent#getIdentifier <em>Identifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(RemoteEventIdentifier value);

} // RemoteEvent
