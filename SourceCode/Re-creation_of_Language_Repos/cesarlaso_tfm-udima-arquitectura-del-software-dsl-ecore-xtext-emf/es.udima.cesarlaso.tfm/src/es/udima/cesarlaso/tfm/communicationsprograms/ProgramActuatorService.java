/**
 */
package es.udima.cesarlaso.tfm.communicationsprograms;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program Actuator Service</b></em>'.
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
 *   <li>{@link es.udima.cesarlaso.tfm.communicationsprograms.ProgramActuatorService#getActuator <em>Actuator</em>}</li>
 * </ul>
 *
 * @see es.udima.cesarlaso.tfm.communicationsprograms.CommunicationsprogramsPackage#getProgramActuatorService()
 * @model
 * @generated
 */
public interface ProgramActuatorService extends ProgramService {
	/**
	 * Returns the value of the '<em><b>Actuator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actuator</em>' containment reference.
	 * @see #setActuator(RemoteActuator)
	 * @see es.udima.cesarlaso.tfm.communicationsprograms.CommunicationsprogramsPackage#getProgramActuatorService_Actuator()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RemoteActuator getActuator();

	/**
	 * Sets the value of the '{@link es.udima.cesarlaso.tfm.communicationsprograms.ProgramActuatorService#getActuator <em>Actuator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actuator</em>' containment reference.
	 * @see #getActuator()
	 * @generated
	 */
	void setActuator(RemoteActuator value);

} // ProgramActuatorService
