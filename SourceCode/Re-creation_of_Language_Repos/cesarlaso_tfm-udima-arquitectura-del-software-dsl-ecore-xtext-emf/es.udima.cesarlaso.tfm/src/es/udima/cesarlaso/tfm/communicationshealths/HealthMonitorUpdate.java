/**
 */
package es.udima.cesarlaso.tfm.communicationshealths;

import es.udima.cesarlaso.tfm.communications.ServiceResponse;

import es.udima.cesarlaso.tfm.healthmonitors.HealthMonitorData;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Health Monitor Update</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.udima.cesarlaso.tfm.communicationshealths.HealthMonitorUpdate#getMonitor <em>Monitor</em>}</li>
 * </ul>
 *
 * @see es.udima.cesarlaso.tfm.communicationshealths.CommunicationshealthsPackage#getHealthMonitorUpdate()
 * @model
 * @generated
 */
public interface HealthMonitorUpdate extends HealthService, ServiceResponse {
	/**
	 * Returns the value of the '<em><b>Monitor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monitor</em>' containment reference.
	 * @see #setMonitor(HealthMonitorData)
	 * @see es.udima.cesarlaso.tfm.communicationshealths.CommunicationshealthsPackage#getHealthMonitorUpdate_Monitor()
	 * @model containment="true" required="true"
	 * @generated
	 */
	HealthMonitorData getMonitor();

	/**
	 * Sets the value of the '{@link es.udima.cesarlaso.tfm.communicationshealths.HealthMonitorUpdate#getMonitor <em>Monitor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Monitor</em>' containment reference.
	 * @see #getMonitor()
	 * @generated
	 */
	void setMonitor(HealthMonitorData value);

} // HealthMonitorUpdate
