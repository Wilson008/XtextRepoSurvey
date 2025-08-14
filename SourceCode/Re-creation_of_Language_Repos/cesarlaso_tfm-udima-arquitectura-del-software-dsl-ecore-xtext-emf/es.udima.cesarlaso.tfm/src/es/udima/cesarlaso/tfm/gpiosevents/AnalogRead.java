/**
 */
package es.udima.cesarlaso.tfm.gpiosevents;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Analog Read</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.udima.cesarlaso.tfm.gpiosevents.AnalogRead#getPollIntervalLoops <em>Poll Interval Loops</em>}</li>
 * </ul>
 *
 * @see es.udima.cesarlaso.tfm.gpiosevents.GpioseventsPackage#getAnalogRead()
 * @model
 * @generated
 */
public interface AnalogRead extends AnalogEvent {
	/**
	 * Returns the value of the '<em><b>Poll Interval Loops</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Poll Interval Loops</em>' attribute.
	 * @see #setPollIntervalLoops(int)
	 * @see es.udima.cesarlaso.tfm.gpiosevents.GpioseventsPackage#getAnalogRead_PollIntervalLoops()
	 * @model required="true"
	 * @generated
	 */
	int getPollIntervalLoops();

	/**
	 * Sets the value of the '{@link es.udima.cesarlaso.tfm.gpiosevents.AnalogRead#getPollIntervalLoops <em>Poll Interval Loops</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Poll Interval Loops</em>' attribute.
	 * @see #getPollIntervalLoops()
	 * @generated
	 */
	void setPollIntervalLoops(int value);

} // AnalogRead
