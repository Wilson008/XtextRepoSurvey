/**
 */
package es.udima.cesarlaso.tfm.healthmonitors;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ram Load Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.udima.cesarlaso.tfm.healthmonitors.RamLoadData#getSize <em>Size</em>}</li>
 *   <li>{@link es.udima.cesarlaso.tfm.healthmonitors.RamLoadData#getFree <em>Free</em>}</li>
 * </ul>
 *
 * @see es.udima.cesarlaso.tfm.healthmonitors.HealthmonitorsPackage#getRamLoadData()
 * @model
 * @generated
 */
public interface RamLoadData extends HealthMonitorData, RamLoad {
	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(int)
	 * @see es.udima.cesarlaso.tfm.healthmonitors.HealthmonitorsPackage#getRamLoadData_Size()
	 * @model required="true"
	 * @generated
	 */
	int getSize();

	/**
	 * Sets the value of the '{@link es.udima.cesarlaso.tfm.healthmonitors.RamLoadData#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(int value);

	/**
	 * Returns the value of the '<em><b>Free</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Free</em>' attribute.
	 * @see #setFree(int)
	 * @see es.udima.cesarlaso.tfm.healthmonitors.HealthmonitorsPackage#getRamLoadData_Free()
	 * @model required="true"
	 * @generated
	 */
	int getFree();

	/**
	 * Sets the value of the '{@link es.udima.cesarlaso.tfm.healthmonitors.RamLoadData#getFree <em>Free</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Free</em>' attribute.
	 * @see #getFree()
	 * @generated
	 */
	void setFree(int value);

} // RamLoadData
