/**
 */
package es.udima.cesarlaso.tfm.gpios;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Digital Pin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Activa o desactiva un PIN
 * <!-- end-model-doc -->
 *
 *
 * @see es.udima.cesarlaso.tfm.gpios.GpiosPackage#getDigitalPin()
 * @model abstract="true"
 * @generated
 */
public interface DigitalPin extends Pin {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	boolean read();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	void write(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model modeRequired="true"
	 * @generated
	 */
	void attachInterrupt(InterruptMode mode);

} // DigitalPin
