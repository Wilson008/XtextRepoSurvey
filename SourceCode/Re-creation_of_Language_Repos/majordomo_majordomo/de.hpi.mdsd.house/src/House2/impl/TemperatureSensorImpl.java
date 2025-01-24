/**
 */
package House2.impl;

import House2.House2Package;
import House2.TemperatureSensor;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Temperature Sensor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link House2.impl.TemperatureSensorImpl#getTemp <em>Temp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TemperatureSensorImpl extends SensorImpl implements TemperatureSensor {
	/**
	 * The default value of the '{@link #getTemp() <em>Temp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemp()
	 * @generated
	 * @ordered
	 */
	protected static final double TEMP_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTemp() <em>Temp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemp()
	 * @generated
	 * @ordered
	 */
	protected double temp = TEMP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemperatureSensorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return House2Package.Literals.TEMPERATURE_SENSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getTemp() {
		return temp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTemp(double newTemp) {
		double oldTemp = temp;
		temp = newTemp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, House2Package.TEMPERATURE_SENSOR__TEMP, oldTemp, temp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case House2Package.TEMPERATURE_SENSOR__TEMP:
				return getTemp();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case House2Package.TEMPERATURE_SENSOR__TEMP:
				setTemp((Double)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case House2Package.TEMPERATURE_SENSOR__TEMP:
				setTemp(TEMP_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case House2Package.TEMPERATURE_SENSOR__TEMP:
				return temp != TEMP_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (temp: ");
		result.append(temp);
		result.append(')');
		return result.toString();
	}

} //TemperatureSensorImpl
