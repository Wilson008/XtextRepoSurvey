/**
 */
package es.udima.cesarlaso.tfm.gpiosactuators;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transform To</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.udima.cesarlaso.tfm.gpiosactuators.TransformTo#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see es.udima.cesarlaso.tfm.gpiosactuators.GpiosactuatorsPackage#getTransformTo()
 * @model
 * @generated
 */
public interface TransformTo extends AnalogActuator, GpioTimerActuator {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see es.udima.cesarlaso.tfm.gpiosactuators.GpiosactuatorsPackage#getTransformTo_Value()
	 * @model required="true"
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link es.udima.cesarlaso.tfm.gpiosactuators.TransformTo#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

} // TransformTo
