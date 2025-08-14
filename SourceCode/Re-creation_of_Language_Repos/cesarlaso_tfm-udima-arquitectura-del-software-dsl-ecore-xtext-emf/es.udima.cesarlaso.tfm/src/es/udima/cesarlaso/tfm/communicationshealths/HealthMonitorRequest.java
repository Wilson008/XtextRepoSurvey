/**
 */
package es.udima.cesarlaso.tfm.communicationshealths;

import es.udima.cesarlaso.tfm.communications.ServiceRequest;

import es.udima.cesarlaso.tfm.healthmonitors.HealthMonitor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Health Monitor Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Proporiciona un paquete de servicios de salud del dispositivo
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.udima.cesarlaso.tfm.communicationshealths.HealthMonitorRequest#getMonitor <em>Monitor</em>}</li>
 * </ul>
 *
 * @see es.udima.cesarlaso.tfm.communicationshealths.CommunicationshealthsPackage#getHealthMonitorRequest()
 * @model
 * @generated
 */
public interface HealthMonitorRequest extends HealthService, ServiceRequest {
	/**
	 * Returns the value of the '<em><b>Monitor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monitor</em>' containment reference.
	 * @see #setMonitor(HealthMonitor)
	 * @see es.udima.cesarlaso.tfm.communicationshealths.CommunicationshealthsPackage#getHealthMonitorRequest_Monitor()
	 * @model containment="true" required="true"
	 * @generated
	 */
	HealthMonitor getMonitor();

	/**
	 * Sets the value of the '{@link es.udima.cesarlaso.tfm.communicationshealths.HealthMonitorRequest#getMonitor <em>Monitor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Monitor</em>' containment reference.
	 * @see #getMonitor()
	 * @generated
	 */
	void setMonitor(HealthMonitor value);

} // HealthMonitorRequest
