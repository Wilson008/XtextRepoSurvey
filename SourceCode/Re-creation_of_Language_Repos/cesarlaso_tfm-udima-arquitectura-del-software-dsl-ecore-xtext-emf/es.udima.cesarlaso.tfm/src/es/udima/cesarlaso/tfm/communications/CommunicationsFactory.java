/**
 */
package es.udima.cesarlaso.tfm.communications;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see es.udima.cesarlaso.tfm.communications.CommunicationsPackage
 * @generated
 */
public interface CommunicationsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CommunicationsFactory eINSTANCE = es.udima.cesarlaso.tfm.communications.impl.CommunicationsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Packet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Packet</em>'.
	 * @generated
	 */
	Packet createPacket();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CommunicationsPackage getCommunicationsPackage();

} //CommunicationsFactory
