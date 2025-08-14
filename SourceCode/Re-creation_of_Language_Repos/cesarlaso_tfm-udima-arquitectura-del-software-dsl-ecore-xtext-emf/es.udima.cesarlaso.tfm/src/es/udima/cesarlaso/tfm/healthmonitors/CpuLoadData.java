/**
 */
package es.udima.cesarlaso.tfm.healthmonitors;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cpu Load Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.udima.cesarlaso.tfm.healthmonitors.CpuLoadData#getLoad <em>Load</em>}</li>
 * </ul>
 *
 * @see es.udima.cesarlaso.tfm.healthmonitors.HealthmonitorsPackage#getCpuLoadData()
 * @model
 * @generated
 */
public interface CpuLoadData extends HealthMonitorData, CpuLoad {
	/**
	 * Returns the value of the '<em><b>Load</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load</em>' attribute.
	 * @see #setLoad(int)
	 * @see es.udima.cesarlaso.tfm.healthmonitors.HealthmonitorsPackage#getCpuLoadData_Load()
	 * @model required="true"
	 * @generated
	 */
	int getLoad();

	/**
	 * Sets the value of the '{@link es.udima.cesarlaso.tfm.healthmonitors.CpuLoadData#getLoad <em>Load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load</em>' attribute.
	 * @see #getLoad()
	 * @generated
	 */
	void setLoad(int value);

} // CpuLoadData
