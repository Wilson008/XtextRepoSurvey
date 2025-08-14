/**
 */
package es.udima.cesarlaso.tfm.communicationshealths;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see es.udima.cesarlaso.tfm.communicationshealths.CommunicationshealthsPackage
 * @generated
 */
public interface CommunicationshealthsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CommunicationshealthsFactory eINSTANCE = es.udima.cesarlaso.tfm.communicationshealths.impl.CommunicationshealthsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Health Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Health Service</em>'.
	 * @generated
	 */
	HealthService createHealthService();

	/**
	 * Returns a new object of class '<em>Health Monitor Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Health Monitor Request</em>'.
	 * @generated
	 */
	HealthMonitorRequest createHealthMonitorRequest();

	/**
	 * Returns a new object of class '<em>Health Monitor Update</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Health Monitor Update</em>'.
	 * @generated
	 */
	HealthMonitorUpdate createHealthMonitorUpdate();

	/**
	 * Returns a new object of class '<em>Health Monitor Notification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Health Monitor Notification</em>'.
	 * @generated
	 */
	HealthMonitorNotification createHealthMonitorNotification();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CommunicationshealthsPackage getCommunicationshealthsPackage();

} //CommunicationshealthsFactory
