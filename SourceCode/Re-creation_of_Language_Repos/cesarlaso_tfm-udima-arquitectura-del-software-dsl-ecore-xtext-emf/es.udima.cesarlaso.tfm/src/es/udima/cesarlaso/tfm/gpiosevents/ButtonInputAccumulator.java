/**
 */
package es.udima.cesarlaso.tfm.gpiosevents;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Button Input Accumulator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.udima.cesarlaso.tfm.gpiosevents.ButtonInputAccumulator#getCount <em>Count</em>}</li>
 * </ul>
 *
 * @see es.udima.cesarlaso.tfm.gpiosevents.GpioseventsPackage#getButtonInputAccumulator()
 * @model
 * @generated
 */
public interface ButtonInputAccumulator extends ButtonInput {
	/**
	 * Returns the value of the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count</em>' attribute.
	 * @see #setCount(int)
	 * @see es.udima.cesarlaso.tfm.gpiosevents.GpioseventsPackage#getButtonInputAccumulator_Count()
	 * @model required="true"
	 * @generated
	 */
	int getCount();

	/**
	 * Sets the value of the '{@link es.udima.cesarlaso.tfm.gpiosevents.ButtonInputAccumulator#getCount <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count</em>' attribute.
	 * @see #getCount()
	 * @generated
	 */
	void setCount(int value);

} // ButtonInputAccumulator
