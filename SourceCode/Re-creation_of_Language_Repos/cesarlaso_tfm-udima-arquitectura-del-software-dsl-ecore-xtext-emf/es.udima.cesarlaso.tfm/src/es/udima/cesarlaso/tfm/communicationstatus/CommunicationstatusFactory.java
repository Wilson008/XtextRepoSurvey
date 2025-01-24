/**
 */
package es.udima.cesarlaso.tfm.communicationstatus;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see es.udima.cesarlaso.tfm.communicationstatus.CommunicationstatusPackage
 * @generated
 */
public interface CommunicationstatusFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CommunicationstatusFactory eINSTANCE = es.udima.cesarlaso.tfm.communicationstatus.impl.CommunicationstatusFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Ping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ping</em>'.
	 * @generated
	 */
	Ping createPing();

	/**
	 * Returns a new object of class '<em>Pong</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pong</em>'.
	 * @generated
	 */
	Pong createPong();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CommunicationstatusPackage getCommunicationstatusPackage();

} //CommunicationstatusFactory
