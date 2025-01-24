/**
 */
package es.udima.cesarlaso.tfm.servers;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see es.udima.cesarlaso.tfm.servers.ServersPackage
 * @generated
 */
public interface ServersFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ServersFactory eINSTANCE = es.udima.cesarlaso.tfm.servers.impl.ServersFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Java Server</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Java Server</em>'.
	 * @generated
	 */
	JavaServer createJavaServer();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ServersPackage getServersPackage();

} //ServersFactory
