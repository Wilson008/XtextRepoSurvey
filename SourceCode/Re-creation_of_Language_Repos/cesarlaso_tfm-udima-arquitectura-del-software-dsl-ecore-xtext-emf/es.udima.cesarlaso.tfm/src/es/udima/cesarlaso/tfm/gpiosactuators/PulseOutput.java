/**
 */
package es.udima.cesarlaso.tfm.gpiosactuators;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pulse Output</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.udima.cesarlaso.tfm.gpiosactuators.PulseOutput#getCount <em>Count</em>}</li>
 *   <li>{@link es.udima.cesarlaso.tfm.gpiosactuators.PulseOutput#getWidth <em>Width</em>}</li>
 *   <li>{@link es.udima.cesarlaso.tfm.gpiosactuators.PulseOutput#getSpaceWidth <em>Space Width</em>}</li>
 * </ul>
 *
 * @see es.udima.cesarlaso.tfm.gpiosactuators.GpiosactuatorsPackage#getPulseOutput()
 * @model
 * @generated
 */
public interface PulseOutput extends DigitalActuator {
	/**
	 * Returns the value of the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count</em>' attribute.
	 * @see #setCount(int)
	 * @see es.udima.cesarlaso.tfm.gpiosactuators.GpiosactuatorsPackage#getPulseOutput_Count()
	 * @model required="true"
	 * @generated
	 */
	int getCount();

	/**
	 * Sets the value of the '{@link es.udima.cesarlaso.tfm.gpiosactuators.PulseOutput#getCount <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count</em>' attribute.
	 * @see #getCount()
	 * @generated
	 */
	void setCount(int value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(int)
	 * @see es.udima.cesarlaso.tfm.gpiosactuators.GpiosactuatorsPackage#getPulseOutput_Width()
	 * @model required="true"
	 * @generated
	 */
	int getWidth();

	/**
	 * Sets the value of the '{@link es.udima.cesarlaso.tfm.gpiosactuators.PulseOutput#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(int value);

	/**
	 * Returns the value of the '<em><b>Space Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Space Width</em>' attribute.
	 * @see #setSpaceWidth(int)
	 * @see es.udima.cesarlaso.tfm.gpiosactuators.GpiosactuatorsPackage#getPulseOutput_SpaceWidth()
	 * @model required="true"
	 * @generated
	 */
	int getSpaceWidth();

	/**
	 * Sets the value of the '{@link es.udima.cesarlaso.tfm.gpiosactuators.PulseOutput#getSpaceWidth <em>Space Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Space Width</em>' attribute.
	 * @see #getSpaceWidth()
	 * @generated
	 */
	void setSpaceWidth(int value);

} // PulseOutput
