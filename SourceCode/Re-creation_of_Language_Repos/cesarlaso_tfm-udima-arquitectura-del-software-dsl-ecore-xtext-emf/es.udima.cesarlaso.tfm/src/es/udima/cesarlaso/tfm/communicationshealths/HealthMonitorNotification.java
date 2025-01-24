/**
 */
package es.udima.cesarlaso.tfm.communicationshealths;

import es.udima.cesarlaso.tfm.communications.ServiceNotification;

import es.udima.cesarlaso.tfm.healthmonitors.HealthMonitorData;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Health Monitor Notification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.udima.cesarlaso.tfm.communicationshealths.HealthMonitorNotification#getMonitor <em>Monitor</em>}</li>
 * </ul>
 *
 * @see es.udima.cesarlaso.tfm.communicationshealths.CommunicationshealthsPackage#getHealthMonitorNotification()
 * @model
 * @generated
 */
public interface HealthMonitorNotification extends HealthService, ServiceNotification {
	/**
	 * Returns the value of the '<em><b>Monitor</b></em>' containment reference list.
	 * The list contents are of type {@link es.udima.cesarlaso.tfm.healthmonitors.HealthMonitorData}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monitor</em>' containment reference list.
	 * @see es.udima.cesarlaso.tfm.communicationshealths.CommunicationshealthsPackage#getHealthMonitorNotification_Monitor()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<HealthMonitorData> getMonitor();

} // HealthMonitorNotification
