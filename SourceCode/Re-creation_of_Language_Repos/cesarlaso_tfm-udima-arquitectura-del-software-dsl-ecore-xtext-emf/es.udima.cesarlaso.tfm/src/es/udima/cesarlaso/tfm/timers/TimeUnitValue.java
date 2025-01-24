/**
 */
package es.udima.cesarlaso.tfm.timers;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Unit Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.udima.cesarlaso.tfm.timers.TimeUnitValue#getValue <em>Value</em>}</li>
 *   <li>{@link es.udima.cesarlaso.tfm.timers.TimeUnitValue#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @see es.udima.cesarlaso.tfm.timers.TimersPackage#getTimeUnitValue()
 * @model
 * @generated
 */
public interface TimeUnitValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see es.udima.cesarlaso.tfm.timers.TimersPackage#getTimeUnitValue_Value()
	 * @model required="true"
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link es.udima.cesarlaso.tfm.timers.TimeUnitValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link es.udima.cesarlaso.tfm.timers.TimeUnitType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see es.udima.cesarlaso.tfm.timers.TimeUnitType
	 * @see #setUnit(TimeUnitType)
	 * @see es.udima.cesarlaso.tfm.timers.TimersPackage#getTimeUnitValue_Unit()
	 * @model required="true"
	 * @generated
	 */
	TimeUnitType getUnit();

	/**
	 * Sets the value of the '{@link es.udima.cesarlaso.tfm.timers.TimeUnitValue#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see es.udima.cesarlaso.tfm.timers.TimeUnitType
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(TimeUnitType value);

} // TimeUnitValue
