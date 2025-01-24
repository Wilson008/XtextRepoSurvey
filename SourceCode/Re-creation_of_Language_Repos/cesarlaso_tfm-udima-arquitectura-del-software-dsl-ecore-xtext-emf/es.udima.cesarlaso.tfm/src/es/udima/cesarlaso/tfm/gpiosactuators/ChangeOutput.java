/**
 */
package es.udima.cesarlaso.tfm.gpiosactuators;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Change Output</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.udima.cesarlaso.tfm.gpiosactuators.ChangeOutput#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see es.udima.cesarlaso.tfm.gpiosactuators.GpiosactuatorsPackage#getChangeOutput()
 * @model
 * @generated
 */
public interface ChangeOutput extends DigitalActuator {
	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link es.udima.cesarlaso.tfm.gpiosactuators.DigitalPinStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see es.udima.cesarlaso.tfm.gpiosactuators.DigitalPinStatus
	 * @see #setStatus(DigitalPinStatus)
	 * @see es.udima.cesarlaso.tfm.gpiosactuators.GpiosactuatorsPackage#getChangeOutput_Status()
	 * @model required="true"
	 * @generated
	 */
	DigitalPinStatus getStatus();

	/**
	 * Sets the value of the '{@link es.udima.cesarlaso.tfm.gpiosactuators.ChangeOutput#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see es.udima.cesarlaso.tfm.gpiosactuators.DigitalPinStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(DigitalPinStatus value);

} // ChangeOutput
