/**
 */
package es.udima.cesarlaso.tfm.healthmonitors;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cpu Temperature Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.udima.cesarlaso.tfm.healthmonitors.CpuTemperatureData#getTemperature <em>Temperature</em>}</li>
 * </ul>
 *
 * @see es.udima.cesarlaso.tfm.healthmonitors.HealthmonitorsPackage#getCpuTemperatureData()
 * @model
 * @generated
 */
public interface CpuTemperatureData extends HealthMonitorData, CpuTemperature {
	/**
	 * Returns the value of the '<em><b>Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temperature</em>' attribute.
	 * @see #setTemperature(float)
	 * @see es.udima.cesarlaso.tfm.healthmonitors.HealthmonitorsPackage#getCpuTemperatureData_Temperature()
	 * @model required="true"
	 * @generated
	 */
	float getTemperature();

	/**
	 * Sets the value of the '{@link es.udima.cesarlaso.tfm.healthmonitors.CpuTemperatureData#getTemperature <em>Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temperature</em>' attribute.
	 * @see #getTemperature()
	 * @generated
	 */
	void setTemperature(float value);

} // CpuTemperatureData
