/**
 */
package es.udima.cesarlaso.tfm.healthmonitors;

import es.udima.cesarlaso.tfm.timers.Timer;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Health Monitor Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.udima.cesarlaso.tfm.healthmonitors.HealthMonitorItem#getTime <em>Time</em>}</li>
 * </ul>
 *
 * @see es.udima.cesarlaso.tfm.healthmonitors.HealthmonitorsPackage#getHealthMonitorItem()
 * @model abstract="true"
 * @generated
 */
public interface HealthMonitorItem extends EObject {
	/**
	 * Returns the value of the '<em><b>Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' containment reference.
	 * @see #setTime(Timer)
	 * @see es.udima.cesarlaso.tfm.healthmonitors.HealthmonitorsPackage#getHealthMonitorItem_Time()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Timer getTime();

	/**
	 * Sets the value of the '{@link es.udima.cesarlaso.tfm.healthmonitors.HealthMonitorItem#getTime <em>Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' containment reference.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(Timer value);

} // HealthMonitorItem
