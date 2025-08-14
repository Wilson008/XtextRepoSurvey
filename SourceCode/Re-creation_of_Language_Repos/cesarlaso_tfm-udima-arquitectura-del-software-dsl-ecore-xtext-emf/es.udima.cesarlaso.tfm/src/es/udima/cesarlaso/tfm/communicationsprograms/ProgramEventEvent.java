/**
 */
package es.udima.cesarlaso.tfm.communicationsprograms;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program Event Event</b></em>'.
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
 *   <li>{@link es.udima.cesarlaso.tfm.communicationsprograms.ProgramEventEvent#getEvent <em>Event</em>}</li>
 * </ul>
 *
 * @see es.udima.cesarlaso.tfm.communicationsprograms.CommunicationsprogramsPackage#getProgramEventEvent()
 * @model
 * @generated
 */
public interface ProgramEventEvent extends ProgramService {
	/**
	 * Returns the value of the '<em><b>Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' containment reference.
	 * @see #setEvent(RemoteEvent)
	 * @see es.udima.cesarlaso.tfm.communicationsprograms.CommunicationsprogramsPackage#getProgramEventEvent_Event()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RemoteEvent getEvent();

	/**
	 * Sets the value of the '{@link es.udima.cesarlaso.tfm.communicationsprograms.ProgramEventEvent#getEvent <em>Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' containment reference.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(RemoteEvent value);

} // ProgramEventEvent
