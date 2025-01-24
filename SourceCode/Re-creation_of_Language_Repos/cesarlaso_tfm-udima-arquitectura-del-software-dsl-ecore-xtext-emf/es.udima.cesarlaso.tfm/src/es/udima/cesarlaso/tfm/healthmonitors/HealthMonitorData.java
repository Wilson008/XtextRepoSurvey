/**
 */
package es.udima.cesarlaso.tfm.healthmonitors;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Health Monitor Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.udima.cesarlaso.tfm.healthmonitors.HealthMonitorData#getAdquisitionTimestamp <em>Adquisition Timestamp</em>}</li>
 * </ul>
 *
 * @see es.udima.cesarlaso.tfm.healthmonitors.HealthmonitorsPackage#getHealthMonitorData()
 * @model abstract="true"
 * @generated
 */
public interface HealthMonitorData extends EObject {
	/**
	 * Returns the value of the '<em><b>Adquisition Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adquisition Timestamp</em>' attribute.
	 * @see #setAdquisitionTimestamp(long)
	 * @see es.udima.cesarlaso.tfm.healthmonitors.HealthmonitorsPackage#getHealthMonitorData_AdquisitionTimestamp()
	 * @model required="true"
	 * @generated
	 */
	long getAdquisitionTimestamp();

	/**
	 * Sets the value of the '{@link es.udima.cesarlaso.tfm.healthmonitors.HealthMonitorData#getAdquisitionTimestamp <em>Adquisition Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adquisition Timestamp</em>' attribute.
	 * @see #getAdquisitionTimestamp()
	 * @generated
	 */
	void setAdquisitionTimestamp(long value);

} // HealthMonitorData
