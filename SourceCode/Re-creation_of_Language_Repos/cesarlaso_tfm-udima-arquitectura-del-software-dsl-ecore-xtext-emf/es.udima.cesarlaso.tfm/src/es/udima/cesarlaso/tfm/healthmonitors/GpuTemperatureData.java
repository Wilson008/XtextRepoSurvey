/**
 */
package es.udima.cesarlaso.tfm.healthmonitors;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gpu Temperature Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.udima.cesarlaso.tfm.healthmonitors.GpuTemperatureData#getTemperature <em>Temperature</em>}</li>
 * </ul>
 *
 * @see es.udima.cesarlaso.tfm.healthmonitors.HealthmonitorsPackage#getGpuTemperatureData()
 * @model
 * @generated
 */
public interface GpuTemperatureData extends HealthMonitorData, GpuTemperature {
	/**
	 * Returns the value of the '<em><b>Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temperature</em>' attribute.
	 * @see #setTemperature(float)
	 * @see es.udima.cesarlaso.tfm.healthmonitors.HealthmonitorsPackage#getGpuTemperatureData_Temperature()
	 * @model required="true"
	 * @generated
	 */
	float getTemperature();

	/**
	 * Sets the value of the '{@link es.udima.cesarlaso.tfm.healthmonitors.GpuTemperatureData#getTemperature <em>Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temperature</em>' attribute.
	 * @see #getTemperature()
	 * @generated
	 */
	void setTemperature(float value);

} // GpuTemperatureData
