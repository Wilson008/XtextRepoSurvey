/**
 */
package es.udima.cesarlaso.tfm.communicationsprograms;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see es.udima.cesarlaso.tfm.communicationsprograms.CommunicationsprogramsPackage
 * @generated
 */
public interface CommunicationsprogramsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CommunicationsprogramsFactory eINSTANCE = es.udima.cesarlaso.tfm.communicationsprograms.impl.CommunicationsprogramsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Program Event Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Program Event Event</em>'.
	 * @generated
	 */
	ProgramEventEvent createProgramEventEvent();

	/**
	 * Returns a new object of class '<em>Program Actuator Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Program Actuator Service</em>'.
	 * @generated
	 */
	ProgramActuatorService createProgramActuatorService();

	/**
	 * Returns a new object of class '<em>Remote Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remote Event</em>'.
	 * @generated
	 */
	RemoteEvent createRemoteEvent();

	/**
	 * Returns a new object of class '<em>Remote Actuator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remote Actuator</em>'.
	 * @generated
	 */
	RemoteActuator createRemoteActuator();

	/**
	 * Returns a new object of class '<em>Remote Event Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remote Event Identifier</em>'.
	 * @generated
	 */
	RemoteEventIdentifier createRemoteEventIdentifier();

	/**
	 * Returns a new object of class '<em>Remote Actuator Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remote Actuator Identifier</em>'.
	 * @generated
	 */
	RemoteActuatorIdentifier createRemoteActuatorIdentifier();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CommunicationsprogramsPackage getCommunicationsprogramsPackage();

} //CommunicationsprogramsFactory
