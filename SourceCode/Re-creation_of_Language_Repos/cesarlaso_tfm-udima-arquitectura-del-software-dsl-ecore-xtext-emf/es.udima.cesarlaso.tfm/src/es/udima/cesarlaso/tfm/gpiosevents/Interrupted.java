/**
 */
package es.udima.cesarlaso.tfm.gpiosevents;

import es.udima.cesarlaso.tfm.gpios.InterruptMode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interrupted</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.udima.cesarlaso.tfm.gpiosevents.Interrupted#getMode <em>Mode</em>}</li>
 * </ul>
 *
 * @see es.udima.cesarlaso.tfm.gpiosevents.GpioseventsPackage#getInterrupted()
 * @model
 * @generated
 */
public interface Interrupted extends DigitalEvent {
	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link es.udima.cesarlaso.tfm.gpios.InterruptMode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see es.udima.cesarlaso.tfm.gpios.InterruptMode
	 * @see #setMode(InterruptMode)
	 * @see es.udima.cesarlaso.tfm.gpiosevents.GpioseventsPackage#getInterrupted_Mode()
	 * @model required="true"
	 * @generated
	 */
	InterruptMode getMode();

	/**
	 * Sets the value of the '{@link es.udima.cesarlaso.tfm.gpiosevents.Interrupted#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see es.udima.cesarlaso.tfm.gpios.InterruptMode
	 * @see #getMode()
	 * @generated
	 */
	void setMode(InterruptMode value);

} // Interrupted
