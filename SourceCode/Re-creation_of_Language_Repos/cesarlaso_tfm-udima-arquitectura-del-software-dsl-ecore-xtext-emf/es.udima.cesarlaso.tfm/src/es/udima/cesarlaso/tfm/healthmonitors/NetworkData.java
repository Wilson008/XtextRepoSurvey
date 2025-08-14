/**
 */
package es.udima.cesarlaso.tfm.healthmonitors;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.udima.cesarlaso.tfm.healthmonitors.NetworkData#getInterfaces <em>Interfaces</em>}</li>
 * </ul>
 *
 * @see es.udima.cesarlaso.tfm.healthmonitors.HealthmonitorsPackage#getNetworkData()
 * @model
 * @generated
 */
public interface NetworkData extends HealthMonitorData, Network {
	/**
	 * Returns the value of the '<em><b>Interfaces</b></em>' containment reference list.
	 * The list contents are of type {@link es.udima.cesarlaso.tfm.healthmonitors.NetworkInterface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfaces</em>' containment reference list.
	 * @see es.udima.cesarlaso.tfm.healthmonitors.HealthmonitorsPackage#getNetworkData_Interfaces()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<NetworkInterface> getInterfaces();

} // NetworkData
