/**
 */
package es.udima.cesarlaso.tfm.timers;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.udima.cesarlaso.tfm.timers.Time#getHour <em>Hour</em>}</li>
 *   <li>{@link es.udima.cesarlaso.tfm.timers.Time#getMinute <em>Minute</em>}</li>
 *   <li>{@link es.udima.cesarlaso.tfm.timers.Time#getSecond <em>Second</em>}</li>
 * </ul>
 *
 * @see es.udima.cesarlaso.tfm.timers.TimersPackage#getTime()
 * @model
 * @generated
 */
public interface Time extends EObject {
	/**
	 * Returns the value of the '<em><b>Hour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hour</em>' attribute.
	 * @see #setHour(int)
	 * @see es.udima.cesarlaso.tfm.timers.TimersPackage#getTime_Hour()
	 * @model required="true"
	 * @generated
	 */
	int getHour();

	/**
	 * Sets the value of the '{@link es.udima.cesarlaso.tfm.timers.Time#getHour <em>Hour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hour</em>' attribute.
	 * @see #getHour()
	 * @generated
	 */
	void setHour(int value);

	/**
	 * Returns the value of the '<em><b>Minute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minute</em>' attribute.
	 * @see #setMinute(int)
	 * @see es.udima.cesarlaso.tfm.timers.TimersPackage#getTime_Minute()
	 * @model required="true"
	 * @generated
	 */
	int getMinute();

	/**
	 * Sets the value of the '{@link es.udima.cesarlaso.tfm.timers.Time#getMinute <em>Minute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minute</em>' attribute.
	 * @see #getMinute()
	 * @generated
	 */
	void setMinute(int value);

	/**
	 * Returns the value of the '<em><b>Second</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second</em>' attribute.
	 * @see #setSecond(int)
	 * @see es.udima.cesarlaso.tfm.timers.TimersPackage#getTime_Second()
	 * @model required="true"
	 * @generated
	 */
	int getSecond();

	/**
	 * Sets the value of the '{@link es.udima.cesarlaso.tfm.timers.Time#getSecond <em>Second</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second</em>' attribute.
	 * @see #getSecond()
	 * @generated
	 */
	void setSecond(int value);

} // Time
